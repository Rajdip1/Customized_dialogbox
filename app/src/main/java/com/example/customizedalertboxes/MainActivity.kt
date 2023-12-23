package com.example.customizedalertboxes

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.customizedalertboxes.databinding.ActivityMainBinding
import com.example.customizedalertboxes.ui.theme.CustomizedAlertBoxesTheme

class MainActivity : ComponentActivity() {

    //create a variable of type dialog
    lateinit var dialog : Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickme = findViewById<Button>(R.id.btnClick)

        dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialogbox)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alertbox_background))

        //creating variables for the custom_dialogbox.xml design
        var good = dialog.findViewById<Button>(R.id.btnGood)
        var feedback = dialog.findViewById<Button>(R.id.btnFeedback)

        good.setOnClickListener {
            dialog.dismiss()
        }
        feedback.setOnClickListener {
            //intents or toast
            Toast.makeText(this,"Feedback given",Toast.LENGTH_SHORT).show()
        }

        clickme.setOnClickListener {
            dialog.show()
        }

    }
}

