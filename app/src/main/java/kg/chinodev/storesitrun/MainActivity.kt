package kg.chinodev.storesitrun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kg.chinodev.storesitrun.ui.home.HomeFragment

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav = findViewById(R.id.main_bottom_nav)
        setupBottomNav()
    }

    private fun setupBottomNav() {
        val homeFragment = HomeFragment()
        //todo create others later
        supportFragmentManager.beginTransaction()
            .add(R.id.main_container, homeFragment)
            .commit()
        bottomNav.setOnNavigationItemSelectedListener {
            val newFragment = when(it.itemId) {
                R.id.home -> homeFragment
                R.id.search -> homeFragment //todo change later
                else -> homeFragment //todo change later
            }
            supportFragmentManager.beginTransaction()
                .replace(R.id.main_container, newFragment)
                .commit()
            true
        }
    }
}