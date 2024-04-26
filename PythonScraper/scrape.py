import sys
import requests
from bs4 import BeautifulSoup
from urllib.parse import urljoin
import urllib.request
import os

def download_image(url, folder):
    if not os.path.exists(folder):
        os.makedirs(folder)
    
    response = requests.get(url)
    if response.status_code == 200:
        filename = url.split("/")[-3]
        urllib.request.urlretrieve(url, os.path.join(folder, filename))
        print(f"Image downloaded: {filename}")
    else:
        print(f"Failed to download image (wrong response): {url}")
        
def scrape_images(url):
    response = requests.get(url)
    
    if response.status_code == 200:
        soup = BeautifulSoup(response.text, 'html.parser')
        
        a_tags = soup.find_all('a', class_='image')  
        
        image_urls = []
        for a_tag in a_tags:
            href = a_tag.get('href')
            if href is not None and 'Default' in href:
                if href.startswith('http'):
                    image_urls.append(href)
                else:
                    image_urls.append(urljoin(url, href))
        
        return image_urls
    else:
        print(f"Failed to fetch page: {url}")
        return []



def main():
    url = sys.argv[1]
    
    folder = "downloaded_images"
    
    image_urls = scrape_images(url)
    print(f"Found {len(image_urls)} images.")
    print(image_urls)
    for image_url in image_urls:
        try:
            download_image(image_url, folder)
        except KeyboardInterrupt:
            print("Download interrupted.")
            break
        except Exception as e:
            print(e)
            print(f"Failed to download image (exception thrown): {image_url}")
            continue

if __name__ == "__main__":
    main()
