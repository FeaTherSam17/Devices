package com.samafther.devices

import retrofit2.http.GET

interface DeviceService {
    //Subprocesos
    @GET(Constants.OBJECTS_PATH)
    suspend fun getAllDevices(): List<Device>

}