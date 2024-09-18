package epi.gl4b.project

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import epi.gl4b.project.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

            val markerOptions = MarkerOptions()
            markerOptions.position(LatLng(35.83, 10.64))
            markerOptions.icon(BitmapDescriptorFactory.fromResource(R.drawable.iheb
            ));
            googleMap.addMarker(markerOptions);

        mMap.uiSettings.setZoomControlsEnabled(true);


            mMap.setOnInfoWindowClickListener { marker  ->

            val uri = Uri.parse("https://fr.wikipedia.org/wiki/"+ marker.title )
            val i = Intent(Intent.ACTION_VIEW, uri)
            startActivity((i))
            false
        }
        val sousse = LatLng(35.83, 10.64)
        mMap.addMarker(MarkerOptions().position(sousse).title("sousse").snippet("codePostale:4000"))

        val cameraPostion = CameraPosition.Builder()
            .target(sousse)
            .zoom(9f)
            .bearing(45f)
            .tilt(90f)
            .build()
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPostion))


        val monastir = LatLng(35.76, 10.81)
        mMap.addMarker(MarkerOptions().position(monastir).title("monastir").snippet("codePostale:5000"))


        val tunis = LatLng(36.81245577117178, 10.170741065296985)
        mMap.addMarker(MarkerOptions().position(tunis).title("tunis").snippet("codePostale:1002"))


        val sfax = LatLng(34.74699671500567, 10.759203800306901)
        mMap.addMarker(MarkerOptions().position(sfax).title("sfax").snippet("codePostale:3027"))


            val StadeSousse = LatLng(35.8236590663307, 10.613012212980136)
            mMap.addMarker(
                MarkerOptions().position(StadeSousse).title("Stade_Olympique_de_Sousse").snippet("Capacité:40k" +
                        "Date d'ouverture:1973" +
                        "Équipe : ÉtoileSportiveDuSahel" ).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
            )


        val StadeSfax= LatLng(34.73376652156286, 10.746075097605)
        mMap.addMarker(
            MarkerOptions().position(StadeSfax).title("Stade_Taïeb-Mehiri").snippet("Capacité:22k" +
                    "Équipe : Club sportif sfaxien"+
                    "Date d'ouverture:1938"
            ).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
        )


        val Staderades= LatLng(36.74795691514257, 10.272832711156378)
        mMap.addMarker(
            MarkerOptions().position(Staderades).title("Stade_olympique_de_Radès").snippet("capacité:60k"+
                    "Date d'ouverture:6juillet2001").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
        )


        val Stademonastir= LatLng(35.776344739004564, 10.818337892938247)
        mMap.addMarker(
            MarkerOptions().position(Stademonastir).title("Stade_Mustapha-Ben-Jannet").snippet("capacité:20k"+
                    "Date d'ouverture:1958").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
        )




        val aireportmonastir= LatLng(35.76082428993094, 10.753308756192029)
        mMap.addMarker(
            MarkerOptions().position(aireportmonastir).title("Aéroport_international_de_Monastir_Habib-Bourguiba")
                .snippet("Tél : +216 73 467 800").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))        )






        val aireportcarthage= LatLng(36.85336926456346, 10.215235790892523)
        mMap.addMarker(
            MarkerOptions().position(aireportcarthage).title("Aéroport_international_de_Tunis-Carthage")
                .snippet("Tél : +216 71 754 000").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                )




        val Hotelmovenpick= LatLng(35.842691333750274, 10.627331741816592)
        mMap.addMarker(
            MarkerOptions().position(Hotelmovenpick).title("Mövenpick_Hotels_%26_Resorts")
                .snippet("Tél : +216 73 202 000"+
                        "Hôtel 5 étoiles").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )

        val HotelLacigale= LatLng(36.99980296236651, 8.784030014623548)
        mMap.addMarker(
            MarkerOptions().position(HotelLacigale).title("LA CIGALE TABARKA HÔTEL - THALASSO & SPA - GOLF")
                .snippet("Tél : +216 70 019 000"+
                        "Hôtel 5 étoiles").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )








        val HotelAficaJade= LatLng(36.56017293092737, 10.858633064742603)
        mMap.addMarker(
            MarkerOptions().position(HotelAficaJade).title("Africa Jade Thalasso Hôtel Korba")
                .snippet("Tél : +216 72 384 633"+
                    "Hôtel 5 étoiles").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )



        val HotelMagicLife= LatLng(36.35886868306784, 10.53066729765238)
        mMap.addMarker(
            MarkerOptions().position(HotelMagicLife).title("TUI MAGIC LIFE Africana")
                .snippet("Tél : +216 72 244 200"+
                        "Hôtel 5 étoiles").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        )



        val HopitalSahloul= LatLng(35.837283377474975, 10.590437764558247)
        mMap.addMarker(
            MarkerOptions().position(HopitalSahloul).title("Hôpital_Sahloul_de_Sousse")
                .snippet("Ouvert 24h/24"+
                         "Adresse : RHPR+V55, Sousse"+
                         "tél : 73369411"  ).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        )




        val HôpitalCharlesNicolle= LatLng(36.802488736816954, 10.161152024650308)
        mMap.addMarker(
            MarkerOptions().position( HôpitalCharlesNicolle).title("Hôpital_Charles-Nicolle")
                .snippet("Ouvert 24h/24"+
                         "Adresse : Bd du 9 Avril 1938"+
                         "tél : 71 764 033").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        )






    }
    }








