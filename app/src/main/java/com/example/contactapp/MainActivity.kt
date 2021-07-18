package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvcontact:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContact()

    }
    fun displayContact(){
        var contactsList= listOf(
            Contact("Mukamunana","+250785952373","mukamunanaven@gmail.com","https://cdn.pixabay.com/photo/2015/06/22/08/38/siblings-817369__340.jpg"),
            Contact("Mutoni","+2507864464732","mutonimuris@gmail.com","https://cdn.pixabay.com/photo/2015/06/22/08/37/children-817365__340.jpg"),
            Contact("Ines","+2507867932934","uwimbaines@gmail.com","https://cdn.pixabay.com/photo/2017/08/01/20/52/people-2567915__340.jpg"),
            Contact("Murisa","+250785774646","uwifille@gmail.com","https://cdn.pixabay.com/photo/2014/05/03/00/56/summerfield-336672__340.jpg"),
            Contact("Jackson","+25078689983","jacksonnseng@gmail.com","https://cdn.pixabay.com/photo/2017/07/31/21/04/people-2561053__340.jpg"),
            Contact("Nsenga","+250786446474","nsengamut@gmail.com","https://cdn.pixabay.com/photo/2016/01/19/17/48/woman-1149911__340.jpg")
        )
        rvcontact=findViewById(R.id.rvContact)
        var contantadapter=Contactadapter(contactsList)
        rvcontact.layoutManager=LinearLayoutManager(baseContext)
        rvcontact.adapter=contantadapter

        rvcontact.apply {
            layoutManager=LinearLayoutManager(baseContext)
            adapter=contantadapter
        }
    }
}
