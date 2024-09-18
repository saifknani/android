package epi.gl4b.project

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import epi.gl4b.project.databinding.ActivityCallBinding

class CallActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityCallBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.confirmer.setOnClickListener{
            intent = Intent(
                Intent.ACTION_DIAL,
                Uri.parse("tel:" +binding.number.text.toString()))
            startActivity(intent)
        }
    }
}