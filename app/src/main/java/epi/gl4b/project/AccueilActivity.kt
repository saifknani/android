package epi.gl4b.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import epi.gl4b.project.databinding.ActivityAccueilBinding
import android.view.MenuItem



class AccueilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityAccueilBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }
}