package com.example.smite_random_picker

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.smite_random_picker.ui.theme.SMITERandomPickerTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    private lateinit var imageView: ImageView
    private lateinit var textView: TextView
    private lateinit var showButton: Button

    private val pictures = arrayOf(R.drawable.picture1, R.drawable.picture2, R.drawable.picture3)
    private val strings = arrayOf(R.string.string1, R.string.string2, R.string.string3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        textView = findViewById(R.id.textView)
        showButton = findViewById(R.id.showButton)

        showButton.setOnClickListener { showRandomPictureAndString() }
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SMITERandomPickerTheme {
        Greeting("Android")
    }
}
