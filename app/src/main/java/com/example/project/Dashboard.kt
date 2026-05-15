package com.example.project

import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

class Dashboard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
            setContent {
                dashboardScreen()
            }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, widthDp = 500, heightDp = 500)
@Composable
fun dashboardScreen(){
    val context= LocalContext.current
    Scaffold(
        topBar={
            TopAppBar(
                navigationIcon={
                    IconButton(onClick = {Toast.makeText(context,"Back clicked",Toast.LENGTH_SHORT).show()
                    }) {Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        "back",
                        tint=Color.Black
                    ) }
                },
                title={Text("MY APP")},
                actions={
                    IconButton(onClick = { Toast.makeText(context,"Home Clicked", Toast.LENGTH_SHORT).show()})
                    {Icon(
                        imageVector = Icons.Filled.Home,
                        "Home",
                        tint=Color.Black
                    ) }
                }
            )
        }
    )
    {
            paddingValues ->
        Column(modifier = Modifier.padding(paddingValues))
        {  }
    }
}

