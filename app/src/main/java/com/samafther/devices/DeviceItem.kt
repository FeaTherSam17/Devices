package com.samafther.devices

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.samafther.devices.ui.theme.DevicesTheme


@Composable
fun DeviceView(device: Device){
    Column() {
        Text(text = device.name)
        Text(text = device.data?.color ?: "-")
        Text(text = device.data?.capacity ?: "-")
    }
}

@Preview(showBackground = true)
@Composable
fun DeviceItemPreview(){
    DevicesTheme() {
        DeviceView(device = Device(1,"Iphone 17", Spects("Lavander","256 GB")))
    }
}