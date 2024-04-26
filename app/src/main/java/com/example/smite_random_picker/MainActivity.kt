package com.example.smite_random_picker

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.smite_random_picker.ui.theme.SMITERandomPickerTheme
import kotlin.random.Random
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    private lateinit var imageView: ImageView
    private lateinit var textView: TextView
    private lateinit var showButton: Button

    private val pictures = arrayOf(R.drawable.achilles, R.drawable.agni, R.drawable.ah_puch)
    private val strings = arrayOf(R.string.achilles, R.string.agni, R.string.ah_puch)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SMITERandomPickerTheme {
                RandomPictureScreen()
            }
        }
        //showButton.setOnClickListener { showRandomPictureAndString() }
    }
    private fun showRandomPictureAndString() {
        val randomIndex = Random.nextInt(pictures.size)
        val randomPicture = pictures[randomIndex]
        val randomStringRes = strings[randomIndex]

        imageView.setImageResource(randomPicture)
        textView.setText(randomStringRes)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
@Composable
fun RandomPictureScreen() {
    // Placeholder state for the random picture and string
    val randomPicture = painterResource(id = R.drawable.achilles)
    val randomString = remember { mutableStateOf("Random String") }

    Surface {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Display the random picture
            Image(
                painter = randomPicture,
                contentDescription = "Random Picture",
                modifier = Modifier
                    .size(200.dp)
                    .padding(8.dp),
                contentScale = ContentScale.Fit
            )

            // Display the random string
            Text(
                text = randomString.value,
                fontSize = 20.sp,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            // Button to fetch and display a new random picture and string
            Button(
                onClick = {  },
                modifier = Modifier.padding(vertical = 8.dp)
            ) {
                Text(text = "Show Random")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SMITERandomPickerTheme {
        Greeting("Android")
    }
}
