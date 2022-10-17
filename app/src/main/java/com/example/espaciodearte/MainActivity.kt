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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    Column(
        modifier = Modifier.padding(32.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ArtworkWall(drawableResourceId = R.drawable._25px_las_meninas_01)
        Spacer(modifier = Modifier.height(4.dp))
        ArtworkDescriptor()
    }
}

@Composable
fun ArtworkWall(drawableResourceId: Int) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .shadow(
                elevation = 16.dp,
                shape = RectangleShape,
                clip = true
            )
    ) {
        Image(
            painter = painterResource(id = drawableResourceId),
            contentDescription = null,
            modifier = Modifier
                .border(width = 2.dp, Color.DarkGray)
                .background(Color.White)
                .padding(32.dp)
        )
    }
}

@Composable
fun ArtworkDescriptor() {
    Column(
        modifier = Modifier.background(Color.White).padding(32.dp)
    ) {
        Text(
            text = "Las Meninas",
            fontSize = 28.sp,
            fontStyle = FontStyle.Normal,
            fontFamily = FontFamily.SansSerif
        )
        Text(
            text = "Diego Velázquez (1656)",
            fontSize = 12.sp
        )
    }
}
@Composable
fun DisplayController(){

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EspacioDeArteTheme {
        ArtworkFrameApp()
    }
}