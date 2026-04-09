package com.samafther.devices

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
import androidx.compose.ui.unit.dp
import com.samafther.devices.ui.theme.DevicesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DevicesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
                    MainView(Modifier.padding(innerPadding),listOf(
                        Device(0, "iPhone 17", Spects(color = "Lavender", capacity = "256 GB")),
                        Device(1, "Google Pixel 6 Pro", Spects(color = "Cloudy White", capacity = "128 GB")),
                        Device(2, "Apple iPhone 12 Mini", Spects("Blue","256GB")),
                        Device(3, "Apple iPhone 12 Pro Max", Spects(color = "Cloudy White", capacity = "512 GB")),
                        Device(4, "Apple iPhone 11, 64GB", Spects(color = "Purple",null)),
                        Device(5, "Samsung Galaxy Z Fold2", Spects(color = "Brown",null)),
                        Device(6, "Apple AirPods", Spects(null,null)),
                        Device(7, "Apple MacBook Pro 16", Spects(null,capacity = "1 TB")),
                        Device(8, "Apple Watch Series 8", Spects(color = "Elderberry", capacity = "41mm")),
                        Device(9, "Beats Studio3 Wireless", Spects(color = "Red",null)),
                        Device(10, "Apple iPad Mini 5th Gen", Spects(null,capacity = "64 GB")),
                        Device(11, "Apple iPad Mini 5th Gen", Spects(null,capacity = "254 GB")),
                        Device(12, "Apple iPad Air", Spects(null,capacity = "64 GB")),
                        Device(13, "Apple iPad Air", Spects(null,capacity = "256 GB"))
                    ))
                }
            }
        }
    }
}
/*
* Api rest
* https://api.restful-api.dev/collections
* */
