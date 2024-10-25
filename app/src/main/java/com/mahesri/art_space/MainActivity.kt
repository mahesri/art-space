package com.mahesri.art_space

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mahesri.art_space.ui.theme.ArtspaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtspaceTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                }
            }
        }
    }
}


// Composable utama untuk UI
@Composble 
fun ArtSpaceScreen(modifier : Modifier = Modifier){

    // Objek untuk menangkap setiap class dari id gambar

    val firstArtwork = R.drawable.gambar1
	val secondArtwork = R.drawable.gambar2
	val thirdArtwork = R.drawable.gambar3
	val fourthArtwork = R.drawable.gambar4
    val fivethArtwork = R.drawable.gambar5

	// mutable state setiap evvent yang tampil di current screen 

	// menyimpan current state untuk judul
	var title by remeber {
		 mutableStateOf(R.string.striong1)	
	}

	// menyimpan current state untuk judul

	var year by remember {
		mutableStateOf(R.string.striong2)
	}
	
}
