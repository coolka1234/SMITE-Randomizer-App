import os
import sys
def change_names(directory):
    for filename in os.listdir(directory):
        if True:
            new_filename = filename.lower()
            full_old_path = os.path.join(directory, filename)
            full_new_path = os.path.join(directory, new_filename)
            os.rename(full_old_path, full_new_path)
if __name__ == "__main__":
    change_names(sys.argv[1])