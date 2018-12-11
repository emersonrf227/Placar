package com.placar.emerson.placar.ui.time

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.placar.emerson.placar.ui.placar.Placar
import com.placar.emerson.placar.R
import com.placar.emerson.placar.ui.placaraac.placarAACActivity
import com.placar.emerson.placar.ultils.KEE_EXTRA_TIMES_A
import com.placar.emerson.placar.ultils.KEE_EXTRA_TIMES_B
import kotlinx.android.synthetic.main.activity_times.*

class TimesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_times)


        btIniciarJogo.setOnClickListener {
            val intent = Intent(this, placarAACActivity::class.java)
            intent.putExtra(KEE_EXTRA_TIMES_A, inputTimeA.text.toString())
            intent.putExtra(KEE_EXTRA_TIMES_B, inputTimeB.text.toString())
            startActivity(intent)
        }

        btNovoJogo.setOnClickListener {

        }
    }
}
