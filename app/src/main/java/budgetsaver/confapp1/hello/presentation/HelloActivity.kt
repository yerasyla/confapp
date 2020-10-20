package budgetsaver.confapp1.hello.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import budgetsaver.confapp1.R

private const val TAG = "HelloActivity"


class HelloActivity : AppCompatActivity() {

    private val closeHelloButton: Button by lazy {
        findViewById(R.id.activity_hello_close_hello_button) as Button
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_hello)

        closeHelloButton.setOnClickListener {
            finish()
        }

        Log.d(TAG, "onCreateHello")
    }

    override fun onBackPressed() {
     super.onBackPressed()
    }

    //closeHelloButton.clo

    override fun onStart() {
        super.onStart()
        //

        Log.d(TAG, "onStartHello")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "onResumeHello")
        //
    }

    override fun onPause() {

        // код тут
        Log.d(TAG, "onPauseHello")
        super.onPause()
    }

    override fun onStop() {
        //
        Log.d(TAG, "onStopHello")
        super.onStop()
    }

    override fun onRestart() {

        Log.d(TAG, "onRestartHello")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroyHello")
        super.onDestroy()
    }


}