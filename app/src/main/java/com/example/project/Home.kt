package com.example.project

import android.content.Intent
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

class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HomeScreen()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun HomeScreen() {
    val context= LocalContext.current
    Scaffold(
        topBar={
            TopAppBar(
                title={Text("MY APP")},
                actions={
                    IconButton(onClick = { val intent= Intent(context, Dashboard::class.java)
                        context.startActivity(intent)
                    Toast.makeText(context,"Dashboard clicked", Toast.LENGTH_SHORT).show()})
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