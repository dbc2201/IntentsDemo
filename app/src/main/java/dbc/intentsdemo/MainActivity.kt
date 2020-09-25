package dbc.intentsdemo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

const val INTENT_MESSAGE_TAG: String = "message"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            sendMessage(it)
        }
    }

    fun sendMessage(view: View) {
        val message: String = "Hello, from the MainActivity"
        val intent: Intent = Intent(
                this,
                SecondActivity::class.java
        ).apply {
            putExtra(INTENT_MESSAGE_TAG, message)
        }
    }
}