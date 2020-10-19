package budgetsaver.confapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import budgetsaver.confapp1.hello.presentation.HelloActivity

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private val openHelloButton: Button by lazy {
        //findViewById(R.id.activity_main_open_hello_button)
        //findViewById(R.id.activity_main_open_hello_button)
        findViewById(R.id.activity_main_open_hello_button) as Button
    }

    override fun onCreate(savedInstanceState: Bundle?) { //onCreate - инициализировать вьюшки
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        setContentView(R.layout.activity_main)

        //val openHelloButton: Button = findViewById(R.id.activity_main_open_hello_button) //findView тяжелая операция

        openHelloButton.setOnClickListener {
            val helloScreenIntent = Intent(this, HelloActivity::class.java)
            startActivity(helloScreenIntent)

        }

    }

    override fun onStart() {
        super.onStart()
        //

        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "onResume")
        //
    }

    override fun onPause() {

        // код тут
        Log.d(TAG, "onPause")
        super.onPause()
    }

    override fun onStop() {
        //
        Log.d(TAG, "onStop")
        super.onStop()
    }

    override fun onRestart() {

        Log.d(TAG, "onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy")
        super.onDestroy()
    }

    //FrameLayout - производительный

}