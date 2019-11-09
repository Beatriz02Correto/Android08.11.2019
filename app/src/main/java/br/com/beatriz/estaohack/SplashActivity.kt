package br.com.beatriz.estaohack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        //Tempo da SplashActivity
        Handler().postDelayed({
            //Criando uma intent (trocad e tela)
            val intent = Intent(this@SplashActivity,LoginActivity::class.java)
            //executando a intennt
            startActivity(intent)
        },3000)
    }
}
