package com.mahesri.art_space

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahesri.art_space.ui.theme.ArtspaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtspaceTheme {

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {

                    ArtSpaceScreen()
                }

            }
        }
    }
}


@Composable
fun ArtSpaceScreen(modifier: Modifier = Modifier) {

    val firstArtwork = R.drawable.image1
    val secondArtwork = R.drawable.image2
    val thirdArtwork = R.drawable.image3
    val fourthArtwork = R.drawable.image4


    var title by remember {
        mutableStateOf(R.string.string1)
    }

    var year by remember {
        mutableStateOf(R.string.string1_tahun)
    }

    var currentArtwork by remember {

        mutableStateOf(firstArtwork)
    }

    Column(

        modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally

    ) {

        // Hajar halaman

        ArtworkDispaly(currentArtwork = currentArtwork)
        Spacer(modifier = modifier.size(16.dp))
        ArtworkTitle(title = title, year = year)
        Spacer(modifier = modifier.size(25.dp))


        Row(
            modifier = modifier.padding(horizontal = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
        ) {

            // Button previous

            Button(
                onClick = {


                    when (currentArtwork) {

                        fourthArtwork -> {
                            currentArtwork = thirdArtwork
                            title = R.string.string3
                            year = R.string.string3_tahun
                        }

                        thirdArtwork -> {
                            currentArtwork = secondArtwork
                            title = R.string.string2
                            year = R.string.string2_tahun
                        }

                        secondArtwork -> {
                            currentArtwork = firstArtwork
                            title = R.string.string1
                            year = R.string.string1_tahun
                        }

                        else -> {
                            currentArtwork = fourthArtwork
                            title = R.string.string4
                            year = R.string.string4_tahun
                        }
                    }

                },

                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.gray_9800)
                ),


                elevation = ButtonDefaults.buttonElevation(

                    defaultElevation = 1.dp,
                    pressedElevation = 0.dp,
                    focusedElevation = 0.dp

                )
            ) {
                Text(
                    text = "Previous",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(R.color.gray_300)
                )
            }

            // Button next

            Button(
                onClick = {


                    when (currentArtwork) {

                        firstArtwork -> {
                            currentArtwork = secondArtwork
                            title = R.string.string2
                            year = R.string.string2_tahun
                        }

                        secondArtwork -> {

                            currentArtwork = thirdArtwork
                            title = R.string.string3
                            year = R.string.string3_tahun
                        }

                        thirdArtwork -> {
                            currentArtwork = fourthArtwork
                            title = R.string.string4
                            year = R.string.string4_tahun
                        }

                        else -> {
                            currentArtwork = firstArtwork
                            title = R.string.string1
                            year = R.string.string1_tahun
                        }


                    }

                },

                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.blue_300)
                ),

                elevation = ButtonDefaults.buttonElevation(

                    defaultElevation = 1.dp,
                    pressedElevation = 0.dp,
                    focusedElevation = 0.dp

                )
            )

            {
                Text(
                    text = "Next",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = colorResource(R.color.gray_9800)
                )
            }
        }

    }

}


@Composable
fun ArtworkDispaly(

    modifier: Modifier = Modifier,
    @DrawableRes currentArtwork: Int,
) {

    Image(
        painter = painterResource(currentArtwork),
        contentDescription = null,
        modifier = modifier.fillMaxWidth(),
        contentScale = ContentScale.FillWidth
    )

}

@Composable
fun ArtworkTitle(
    @StringRes title: Int,
    @StringRes year: Int,

) {


    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        // Judul Artwork

        Text(
            text = stringResource(id = title),
            fontWeight = FontWeight.ExtraBold,
            color = colorResource(R.color.blue_300),
            fontSize = 32.sp

        )

        Text(
            text = "— ${stringResource(id = year)} —",
            fontWeight = FontWeight.Medium,
            color = colorResource(R.color.gray_300),
            fontSize = 16.sp
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArtspaceTheme {
        ArtSpaceScreen()
    }
}