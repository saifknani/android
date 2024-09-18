package epi.gl4b.project

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import epi.gl4b.project.databinding.ActivityCallBinding
import epi.gl4b.project.databinding.ActivityConvBinding

class ConvActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityConvBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.convertir.setOnClickListener {

            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.xe.com/fr/currencyconverter/")
            startActivity(openURL)

        }
    }
}