package kg.chinodev.storesitrun.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkHelper {
    private val retrofit = Retrofit.Builder()
        .baseUrl("http://web.imd.kg:8080")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    private var service: ApiService? = null

    fun getService() : ApiService {
        if (service == null) {
            service = retrofit.create(ApiService::class.java)
        }
        return service!!



        val arr = arrayListOf<String>()
        //...
        for(item in arr) {
            println(item)
        }
        arr.forEach { item ->
            println(item)
        }
    }
}