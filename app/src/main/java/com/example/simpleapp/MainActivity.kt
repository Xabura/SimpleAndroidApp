package com.example.simpleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager2 = findViewById(R.id.viewPager)
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)

        val data = listOf(
            VehicleCategory(
                title = "Cars",
                Vehicles = listOf(
                    Vehicle(
                        "Mercedes C Class",
                        listOf(
                            R.drawable.mercedes_c,
                            R.drawable.mercedes_c,
                            R.drawable.mercedes_c,
                            R.drawable.mercedes_c,
                            R.drawable.mercedes_c
                        )
                    ),
                    Vehicle(
                        "Mercedes GLE Coupe",
                        listOf(
                            R.drawable.mercedes_gle,
                            R.drawable.mercedes_gle,
                            R.drawable.mercedes_gle,
                            R.drawable.mercedes_gle,
                            R.drawable.mercedes_gle
                        )
                    ),
                    Vehicle(
                        "BMW 5 Series",
                        listOf(
                            R.drawable.bmw_5series,
                            R.drawable.bmw_5series,
                            R.drawable.bmw_5series,
                            R.drawable.bmw_5series,
                            R.drawable.bmw_5series
                        )
                    ),
                    Vehicle(
                        "BMW X5",
                        listOf(
                            R.drawable.bmw_x5,
                            R.drawable.bmw_x5,
                            R.drawable.bmw_x5,
                            R.drawable.bmw_x5,
                            R.drawable.bmw_x5
                        )
                    ),
                    Vehicle(
                        "Audi A7",
                        listOf(
                            R.drawable.audi_a7,
                            R.drawable.audi_a7,
                            R.drawable.audi_a7,
                            R.drawable.audi_a7,
                            R.drawable.audi_a7
                        )
                    ),
                    Vehicle(
                        "Audi Q8",
                        listOf(
                            R.drawable.audi_q8,
                            R.drawable.audi_q8,
                            R.drawable.audi_q8,
                            R.drawable.audi_q8,
                            R.drawable.audi_q8
                        )
                    ),
                )
            ),
            VehicleCategory(
                title = "Motorcycles",
                Vehicles = listOf(
                    Vehicle(
                        "Kawasaki Vulcan S650",
                        listOf(
                            R.drawable.kawasaki_vulcan_650s,
                            R.drawable.kawasaki_vulcan_650s,
                            R.drawable.kawasaki_vulcan_650s,
                            R.drawable.kawasaki_vulcan_650s,
                            R.drawable.kawasaki_vulcan_650s
                        )
                    ),
                    Vehicle(
                        "Honda Rebel 500",
                        listOf(
                            R.drawable.honda_rebel_500,
                            R.drawable.honda_rebel_500,
                            R.drawable.honda_rebel_500,
                            R.drawable.honda_rebel_500,
                            R.drawable.honda_rebel_500
                        )
                    ),
                    Vehicle(
                        "Honda Shadow Phantom vt750",
                        listOf(
                            R.drawable.honda_shadow_vt750,
                            R.drawable.honda_shadow_vt750,
                            R.drawable.honda_shadow_vt750,
                            R.drawable.honda_shadow_vt750,
                            R.drawable.honda_shadow_vt750
                        )
                    ),
                    Vehicle(
                        "Indian Scout Bobber",
                        listOf(
                            R.drawable.indian_scout_bobber,
                            R.drawable.indian_scout_bobber,
                            R.drawable.indian_scout_bobber,
                            R.drawable.indian_scout_bobber,
                            R.drawable.indian_scout_bobber
                        )
                    ),
                    Vehicle(
                        "Harley Davidson V Rod",
                        listOf(
                            R.drawable.harley_davidson_vrod,
                            R.drawable.harley_davidson_vrod,
                            R.drawable.harley_davidson_vrod,
                            R.drawable.harley_davidson_vrod,
                            R.drawable.harley_davidson_vrod
                        )
                    ),
                )
            )
        )

        viewPager.adapter = MyViewPagerAdapter(data)
        viewPager.isUserInputEnabled = false

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_cars -> {
                    viewPager.currentItem = 0 // Show "Cars" page
                    true
                }

                R.id.nav_motorcycles -> {
                    viewPager.currentItem = 1 // Show "Motorcycles" page
                    true
                }

                else -> false
            }
        }
    }
}
