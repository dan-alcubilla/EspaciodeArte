package com.example.espaciodearte

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.espaciodearte.ui.theme.EspacioDeArteTheme
import com.example.espaciodearte.ui.theme.Shapes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EspacioDeArteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArtworkFrameApp()
                }
            }
        }
    }
}

@Composable
fun ArtworkFrameApp() {
    Column() {
        ArtworkWall(drawableResourceId = R.drawable._25px_las_meninas_01)
    }
}

@Composable
fun ArtworkWall(drawableResourceId: Int) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.height(64.dp))
        Image(
            painter = painterResource(id = drawableResourceId),
            contentDescription = null,
            //contentScale = ContentScale.Inside,
            modifier = Modifier
                .padding(16.dp)
                .border(width = 4.dp, Color.DarkGray)
                .background(Color.White)
                .padding(32.dp)
        )
    }
}

@Composable
fun ArtworkDescriptor() {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EspacioDeArteTheme {
        ArtworkFrameApp()
    }
}