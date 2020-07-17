package com.srikandi.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appName = "${getString(R.string.app_name)} ${getString(R.string.mainactivity_textview_title)}"

        mainactivity_textview_title.text = appName
        mainactivity_textview_message.text = BuildConfig.HOST_URL
    }
}