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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.smite_random_picker.ui.theme.SmiteGods

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
    var result by remember { mutableIntStateOf(1) }
    val imageResource = when (result) {
        1 -> R.drawable.achilles
        2 -> R.drawable.agni
        3 -> R.drawable.ah_puch
        4 -> R.drawable.amaterasu
        5 -> R.drawable.anhur
        6 -> R.drawable.anubis
        7 -> R.drawable.aokuang
        8 -> R.drawable.apollo
        9 -> R.drawable.arachne
        10 -> R.drawable.ares
        11 -> R.drawable.artemis
        12 -> R.drawable.athena
        13 -> R.drawable.awilix
        14 -> R.drawable.babayaga
        15 -> R.drawable.bacchus
        16 -> R.drawable.bakasura
        17 -> R.drawable.bakekujira
        18 -> R.drawable.baronsamedi
        19 -> R.drawable.bastet
        20 -> R.drawable.bellona
        21 -> R.drawable.cabrakan
        22 -> R.drawable.camazotz
        23 -> R.drawable.cerberus
        24 -> R.drawable.cernunnos
        25 -> R.drawable.chaac
        26 -> R.drawable.change
        27 -> R.drawable.charon
        28 -> R.drawable.charybdis
        29 -> R.drawable.chernobog
        30 -> R.drawable.chiron
        31 -> R.drawable.chronos
        32 -> R.drawable.cliodhna
        33 -> R.drawable.cthulhu
        34 -> R.drawable.cuchulainn
        35 -> R.drawable.cupid
        36 -> R.drawable.daji
        37 -> R.drawable.danzaburou
        38 -> R.drawable.discordia
        39 -> R.drawable.erlangshen
        40 -> R.drawable.fafnir
        41 -> R.drawable.fenrir
        42 -> R.drawable.freya
        43 -> R.drawable.ganesha
        44 -> R.drawable.geb
        45 -> R.drawable.gilgamesh
        46 -> R.drawable.guanyu
        47 -> R.drawable.hachiman
        48 -> R.drawable.hades
        49 -> R.drawable.hebo
        50 -> R.drawable.heimdallr
        51 -> R.drawable.hel
        52 -> R.drawable.hera
        53 -> R.drawable.hercules
        54 -> R.drawable.horus
        55 -> R.drawable.houyi
        56 -> R.drawable.hunbatz
        57 -> R.drawable.izanami
        58 -> R.drawable.janus
        59 -> R.drawable.jingwei
        60 -> R.drawable.kali
        61 -> R.drawable.khepri
        62 -> R.drawable.kingarthur
        63 -> R.drawable.kukulkan
        64 -> R.drawable.kumbhakarna
        65 -> R.drawable.kuzenbo
        66 -> R.drawable.lancelot
        67 -> R.drawable.loki
        68 -> R.drawable.medusa
        69 -> R.drawable.mercury
        70 -> R.drawable.merlin
        71 -> R.drawable.mulan
        72 -> R.drawable.nezha
        73 -> R.drawable.neith
        74 -> R.drawable.nemesis
        75 -> R.drawable.nike
        76 -> R.drawable.nox
        77 -> R.drawable.nuwa
        78 -> R.drawable.odin
        79 -> R.drawable.olorun
        80 -> R.drawable.osiris
        81 -> R.drawable.pele
        82 -> R.drawable.persephone
        84 -> R.drawable.poseidon
        85 -> R.drawable.ra
        86 -> R.drawable.ram
        87 -> R.drawable.ratatoskr
        89 -> R.drawable.ravana
        90 -> R.drawable.skadi
        91 -> R.drawable.sobek
        92 -> R.drawable.sol
        93 -> R.drawable.susano
        94 -> R.drawable.sylvanus
        95 -> R.drawable.tiamat
        96 -> R.drawable.thanatos
        97 -> R.drawable.thor
        98 -> R.drawable.thoth
        99 -> R.drawable.tyr
        100 -> R.drawable.ullr
        101 -> R.drawable.vamana
        102 -> R.drawable.vulcan
        103 -> R.drawable.xbalanque
        104 -> R.drawable.xingtian
        105 -> R.drawable.yemoja
        106 -> R.drawable.ymir
        107 -> R.drawable.zhongkui
        108 -> R.drawable.zeus
        109 -> R.drawable.nut
        110 -> R.drawable.set
        111 -> R.drawable.themorrigan
        112 -> R.drawable.surtr
        113 -> R.drawable.sunwukong
        116 -> R.drawable.terra
        117 -> R.drawable.tsukuyomi
        118 -> R.drawable.bakekujira
        119 -> R.drawable.mamanbrigitte
        120 -> R.drawable.charon
        121 -> R.drawable.cliodhna
        122 -> R.drawable.cthulhu
        124 -> R.drawable.ixchel
        125 -> R.drawable.jormungandr
        126 -> R.drawable.martichoras
        127 -> R.drawable.maui
        128 -> R.drawable.shiva
        129 -> R.drawable.ishtar
        130 -> R.drawable.yuhuang
        else -> R.drawable.achilles
    }
    val character = SmiteGods.gods.getCharacter(result)

    Surface {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id =character.id),
                contentDescription = "Random Picture",
                modifier = Modifier
                    .size(200.dp)
                    .padding(8.dp),
                contentScale = ContentScale.Fit
            )

            Text(
                text = character.toString(),
                fontSize = 20.sp,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Button(
                onClick = {result=(1..130).random() },
                modifier = Modifier.padding(vertical = 8.dp)
            ) {
                Text(text = "Randomize!")
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
