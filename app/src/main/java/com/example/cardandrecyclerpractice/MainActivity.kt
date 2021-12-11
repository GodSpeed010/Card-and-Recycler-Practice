package com.example.cardandrecyclerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val rclNames = findViewById<RecyclerView>(R.id.rclNames)

        //if RecyclerView has fixed size, optimizes
        rclNames.setHasFixedSize(true)

        val nameList = getListofNames()


        val onClickListener = object: NameAdapter.OnClickListener {
            override fun onItemClicked(position: Int) {

                Toast.makeText(applicationContext, "Clicked ${nameList[position]}", Toast.LENGTH_SHORT).show()
            }
        }

        val namesAdapter = NameAdapter(nameList, onClickListener)

        rclNames.adapter = namesAdapter

        rclNames.layoutManager = LinearLayoutManager(this)

    }

    fun getListofNames(): MutableList<String> {
        val nameList = mutableListOf<String>()
        nameList.add("Ali")
        nameList.add("Sophia")
        nameList.add("Isabella")
        nameList.add("Mason")
        nameList.add("Jacob")
        nameList.add("William")
        nameList.add("Olivia")
        nameList.add("Jayden")
        nameList.add("Chloe")
        nameList.add("Ella")
        nameList.add("Anthony")
        nameList.add("Joshua")
        nameList.add("James")
        nameList.add("Grace")
        nameList.add("Samantha")
        nameList.add("Nicholas")
        nameList.add("Brianna")
        nameList.add("Justin")
        nameList.add("Lauren")

        return nameList
    }
}