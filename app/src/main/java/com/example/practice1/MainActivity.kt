package com.example.practice1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
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
import com.example.practice1.R.*
import com.example.practice1.ui.theme.Practice1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                setContentView(layout.layout)
            var titl=findViewById<TextView>(R.id.title)
            var inp1= findViewById<TextView>(R.id.input)
            var inp2=findViewById<TextView>(R.id.input2)
            var but=findViewById<Button>(R.id.button)
            but.setOnClickListener(){
if (inp1.text.toString()== "" && inp2.text.toString()== ""){
    Toast.makeText(applicationContext,"Enter 1st & 2nd Name",Toast.LENGTH_SHORT).show()
}
               else if(inp1.text.toString()== "" ){
                    Toast.makeText(applicationContext,"Enter 1st Name",Toast.LENGTH_SHORT).show()
                }
                else if(inp2.text.toString()=="")
                {
                    Toast.makeText(applicationContext,"Enter 2nd Name ",Toast.LENGTH_SHORT).show()
                }
                else {
                    var sum=inp1.text.toString() + inp2.text.toString()
                    titl.text = "welcome $sum"
                }
            }

            }


    }
}

