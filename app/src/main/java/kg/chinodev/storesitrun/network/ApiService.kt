package kg.chinodev.storesitrun.network

import kg.chinodev.storesitrun.network.models.HomeResponse
import retrofit2.http.GET

interface ApiService {
    @GET("/getNewInComeHitDisc")
    suspend fun getHomePage(): HomeResponse
}