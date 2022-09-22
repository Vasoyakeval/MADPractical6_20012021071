package com.example.madpractical6_20012021071

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val myvideoview=findViewById<WebView>(R.id.webvideo)
        val flotingbtn=findViewById<FloatingActionButton>(R.id.wbutton)

    }
}