package jp.techacademy.michi.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val human = Human("加藤", 22, "プログラミング")
        human.say()
        human.think()

        val anotherhuman = Human("田中", 20, "水泳")
        anotherhuman.say()
        anotherhuman.think()

    }
}




