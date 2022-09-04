package com.example.imageapp

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.*
import java.util.ArrayList

class viewmodel(application: Application): AndroidViewModel(application) {
    var list: MutableList<String> = ArrayList()
    init{

        var queue = Volley.newRequestQueue(application)
        val url =
            "https://pixabay.com/api/?key=29662133-1bff60aea837527e239114032&image_type=photo&pretty=true"
        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.GET, url, null,
            Response.Listener { response ->
                val jsonarray = response.getJSONArray("hits")
                for (i in 0..19) {
                    val obj = jsonarray.getJSONObject(i)
                    val src = obj.getString("webformatURL")
                    list.add(src)
                }
            },

            Response.ErrorListener { error ->

            }

        )
        queue.add(jsonObjectRequest)
    }

}