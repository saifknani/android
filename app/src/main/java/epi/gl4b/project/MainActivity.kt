package epi.gl4b.project

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView

import androidx.core.app.ActivityCompat
import epi.gl4b.project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            if (ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            )
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
            else
                intent = Intent(
                    Intent.ACTION_CALL,
                    Uri.parse(("tel:" + resources.getString(R.string.phone_number)))
                )
            startActivity(intent)
            true
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {

            R.id.apu -> {
                if (ActivityCompat.checkSelfPermission(
                        this,
                        Manifest.permission.CALL_PHONE
                    ) != PackageManager.PERMISSION_GRANTED
                )
                    ActivityCompat.requestPermissions(
                        this,
                        arrayOf(Manifest.permission.CALL_PHONE),
                        1
                    )
                else
                    intent = Intent(
                        Intent.ACTION_CALL,
                        Uri.parse(("tel:" + resources.getString(R.string.phone_number)))
                    )
                startActivity(intent)
                true
            }

            R.id.apn -> {
                intent = Intent(this, CallActivity::class.java)

                startActivity(intent)
                true
            }
            R.id.exit -> {
                finish()
                true
            }


            R.id.map -> {
                intent = Intent(this, MapsActivity::class.java)

                startActivity(intent)
                true
            }
            R.id.conv -> {
                intent = Intent(this, ConvActivity::class.java)

                startActivity(intent)
                true

            }


            R.id.ticket -> {
                intent = Intent(this, ticketActivity::class.java)

                startActivity(intent)
                true
            }


            R.id.hebergement -> {
                intent = Intent(this, herbergementActivity::class.java)

                startActivity(intent)
                true
            }
            R.id.fab -> {
                if (ActivityCompat.checkSelfPermission(
                        this,
                        Manifest.permission.CALL_PHONE
                    ) != PackageManager.PERMISSION_GRANTED
                )
                    ActivityCompat.requestPermissions(
                        this,
                        arrayOf(Manifest.permission.CALL_PHONE),
                        1
                    )
                else
                    intent = Intent(
                        Intent.ACTION_CALL,
                        Uri.parse(("tel:" + resources.getString(R.string.phone_number)))
                    )
                startActivity(intent)
                true
            }





            else -> super.onOptionsItemSelected(item)
        }




    }


    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()



    }

}