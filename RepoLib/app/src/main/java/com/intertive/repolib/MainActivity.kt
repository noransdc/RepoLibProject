package com.intertive.repolib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.`in`.speed.domain.speed.SpeedCheckManager
import com.intertive.net.TestNet

class MainActivity:AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestNet.test()

        SpeedCheckManager().setPath("")

    }


}