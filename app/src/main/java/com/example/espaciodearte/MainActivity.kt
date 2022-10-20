package com.example.espaciodearte

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.espaciodearte.ui.theme.EspacioDeArteTheme

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
    var artNumber by remember { mutableStateOf(1) }

    when (artNumber) {
        1 -> {
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(8.dp))
                ArtworkWall(drawableResourceId = R.drawable._25px_las_meninas_01)
                ArtworkDescriptor(
                    paintName = R.string.paint_name_1,
                    artistName = R.string.artist_name_1,
                    yearPaint = R.string.year_paint_1
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Button(
                        modifier = Modifier
                            .size(width = 120.dp, height = 40.dp),
                        onClick = {
                            if (artNumber == 3) {
                                artNumber = 2
                            } else if (artNumber == 2) {
                                artNumber = 1
                            }
                        }
                    ) {
                        Text(text = stringResource(id = R.string.previous_button))
                    }
                    Spacer(modifier = Modifier.width(width = 16.dp))
                    Button(
                        modifier = Modifier
                            .size(width = 120.dp, height = 40.dp),
                        onClick = {
                            if (artNumber == 1) {
                                artNumber = 2
                            } else if (artNumber == 2) {
                                artNumber = 3
                            }
                        }
                    ) {
                        Text(text = stringResource(id = R.string.next_button))
                    }
                }
            }
        }
        2 -> {
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(8.dp))
                ArtworkWall(drawableResourceId = R.drawable._10px_sant_jeroni_penitent__montserrat)
                ArtworkDescriptor(
                    paintName = R.string.paint_name_2,
                    artistName = R.string.artist_name_2,
                    yearPaint = R.string.year_paint_2
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Button(
                        modifier = Modifier
                            .size(width = 120.dp, height = 40.dp),
                        onClick = {
                            if (artNumber == 3) {
                                artNumber = 2
                            } else if (artNumber == 2) {
                                artNumber = 1
                            }
                        }
                    ) {
                        Text(text = stringResource(id = R.string.previous_button))
                    }
                    Spacer(modifier = Modifier.width(width = 16.dp))
                    Button(
                        modifier = Modifier
                            .size(width = 120.dp, height = 40.dp),
                        onClick = {
                            if (artNumber == 1) {
                                artNumber = 2
                            } else if (artNumber == 2) {
                                artNumber = 3
                            }
                        }
                    ) {
                        Text(text = stringResource(id = R.string.next_button))
                    }
                }
            }
        }
        3 -> {
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(8.dp))
                ArtworkWall(drawableResourceId = R.drawable._79px_rembrandt_christ_in_the_storm_on_the_lake_of_galilee)
                ArtworkDescriptor(
                    paintName = R.string.paint_name_3,
                    artistName = R.string.artist_name_3,
                    yearPaint = R.string.year_paint_3
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Button(
                        modifier = Modifier
                            .size(width = 120.dp, height = 40.dp),
                        onClick = {
                            if (artNumber == 3) {
                                artNumber = 2
                            } else if (artNumber == 2) {
                                artNumber = 1
                            }
                        }
                    ) {
                        Text(text = stringResource(id = R.string.previous_button))
                    }
                    Spacer(modifier = Modifier.width(width = 16.dp))
                    Button(
                        modifier = Modifier
                            .size(width = 120.dp, height = 40.dp),
                        onClick = {
                            if (artNumber == 1) {
                                artNumber = 2
                            } else if (artNumber == 2) {
                                artNumber = 3
                            }
                        }
                    ) {
                        Text(text = stringResource(id = R.string.next_button))
                    }
                }
            }
        }
    }
}

@Composable
fun ArtworkWall(drawableResourceId: Int) {
    Column(
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
fun ArtworkDescriptor(
    paintName: Int,
    artistName: Int,
    yearPaint: Int
) {
    Column(
        modifier = Modifier
            .background(color = Color.White)
            .padding(all = 32.dp)
    ) {
        Text(
            text = stringResource(id = paintName),
            fontSize = 24.sp,
            fontStyle = FontStyle.Normal,
            fontFamily = FontFamily.SansSerif,
        )
        Row {
            Text(
                text = stringResource(id = artistName),
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.width(width = 4.dp))
            Text(
                text = stringResource(id = yearPaint),
                fontSize = 12.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EspacioDeArteTheme {
        ArtworkFrameApp()
    }
}