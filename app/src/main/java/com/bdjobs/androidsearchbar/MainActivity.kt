package com.bdjobs.androidsearchbar

import android.app.ActivityOptions
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        jobtitleET.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            // create the transition animation - the images in the layouts
            // of both activities are defined with android:transitionName="robot"
            val options = ActivityOptions
                    .makeSceneTransitionAnimation(this, jobtitleET, "robot")
            // start the new activity
            startActivity(intent, options.toBundle())
        }
        loacationET.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            // create the transition animation - the images in the layouts
            // of both activities are defined with android:transitionName="robot"
            val options = ActivityOptions
                    .makeSceneTransitionAnimation(this, loacationET, "robot")
            // start the new activity
            startActivity(intent, options.toBundle())
        }
        categoryET.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            // create the transition animation - the images in the layouts
            // of both activities are defined with android:transitionName="robot"
            val options = ActivityOptions
                    .makeSceneTransitionAnimation(this, categoryET, "robot")
            // start the new activity
            startActivity(intent, options.toBundle())
        }
    }
}
