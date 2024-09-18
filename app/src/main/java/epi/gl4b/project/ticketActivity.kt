package epi.gl4b.project

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import epi.gl4b.project.databinding.ActivityConvBinding
import epi.gl4b.project.databinding.ActivityTicketBinding

class ticketActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityTicketBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buy.setOnClickListener {

            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.fifa.com/fifaplus/fr/tickets")
            startActivity(openURL)
        }
    }
}