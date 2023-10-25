package com.example.tugaspertemuan9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.tugaspertemuan9.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var viewPager2: ViewPager2
    lateinit var binding : ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        title = "dahsboard"
        setContentView(binding.root)


    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_option, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.action_logout->{
                finish()
                Toast.makeText(this,"Halaman Logout", Toast.LENGTH_LONG).show()
                true
            }

            else ->
                true
        }
    }
}