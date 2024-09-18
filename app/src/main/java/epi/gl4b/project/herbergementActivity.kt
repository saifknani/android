package epi.gl4b.project

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import epi.gl4b.project.databinding.ActivityHerbergementBinding
import epi.gl4b.project.databinding.ActivityTicketBinding

class herbergementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityHerbergementBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.next.setOnClickListener {

            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.booking.com/")
            startActivity(openURL)
        }
    }
}