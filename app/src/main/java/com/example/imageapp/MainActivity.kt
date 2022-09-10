// package com.example.imageapp

// import android.content.Intent
// import androidx.appcompat.app.AppCompatActivity
// import android.os.Bundle
// import android.view.View
// import androidx.lifecycle.ViewModelProvider

// import androidx.recyclerview.widget.RecyclerView
// import androidx.recyclerview.widget.GridLayoutManager

// import java.util.*


// class MainActivity : AppCompatActivity(), adapter.item_clicked {

//     override fun onCreate(savedInstanceState: Bundle?) {
//         super.onCreate(savedInstanceState)
//         setContentView(R.layout.activity_main)
//         var recyleview:RecyclerView=findViewById(R.id.recycler)
//         var list:MutableList<String> =ArrayList()
//         val viewmodal=ViewModelProvider(this,ViewModelProvider.AndroidViewModelFactory.getInstance(application)).get(viewmodel::class.java)
//         list= viewmodal.list
//         recyleview.setLayoutManager(GridLayoutManager(this, 2))
//         val adapter=adapter(list, applicationContext,this)
//         recyleview.adapter=adapter

//     }

//     override fun onitemclicked(item: String) {
//         val intent=Intent(this,image::class.java)
//         intent.putExtra("url",item)
//         startActivity(intent)
//     }
// }