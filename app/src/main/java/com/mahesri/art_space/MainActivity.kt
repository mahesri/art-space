package com.mahesri.art_space

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mahesri.art_space.ui.theme.ArtspaceTheme


// import envirentement

// import android.os.Bundle
// import androidx.activity.ComponentActivity
// import androidx.activity.compose.setContent
// import androidx.annotation.DrawableRes
// import androidx.annotation.StringRes
// import androidx.compose.foundation.Image
// import androidx.compose.foundation.layout.*
// import androidx.compose.material.*
// import androidx.compose.runtime.*
// import androidx.compose.ui.Alignment
// import androidx.compose.ui.Modifier
// import androidx.compose.ui.layout.ContentScale
// import androidx.compose.ui.res.colorResource
// import androidx.compose.ui.res.painterResource
// import androidx.compose.ui.res.stringResource
// import androidx.compose.ui.text.font.FontWeight
// import androidx.compose.ui.tooling.preview.Preview
// import androidx.compose.ui.unit.dp
// import androidx.compose.ui.unit.sp
// import dev.codeninja.artspace.ui.theme.ArtSpaceTheme 

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtspaceTheme {
                modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
					ArtSpaceScreen()
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
	
	// state untuk menyimpan current screen secara default
	var currentArtwork by remember {
		mutableStateOf(firstArtwork)
	}

	// state yang menyimpan tampilan current artwork
	var imageResource by remember {
		mutableStateOf(currentArtwork)
	}
	
	
}
