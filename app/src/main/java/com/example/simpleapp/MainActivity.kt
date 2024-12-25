package com.example.simpleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the ViewPager2 from the layout
        val viewPager: ViewPager2 = findViewById(R.id.viewPager)

        // Prepare data for the ViewPager
        val data = listOf(
            ListItem(
                title = "German Cars",
                items = listOf(
                    Item("Mercedes C Class", R.drawable.mercedes_c),
                    Item("Mercedes GLE Coupe", R.drawable.mercedes_gle),
                    Item("BMW 5 Series", R.drawable.bmw_5series),
                    Item("BMW X5", R.drawable.bmw_x5),
                    Item("Audi A7", R.drawable.audi_a7),
                    Item("Audi Q8", R.drawable.audi_q8),
                )
            ),
            ListItem(
                title = "Cruisers",
                items = listOf(
                    Item("Honda Rebel 500", R.drawable.honda_rebel_500),
                    Item("Honda Shadow Phantom vt750", R.drawable.honda_shadow_vt750),
                    Item("Kawasaki Vulcan S650", R.drawable.kawasaki_vulcan_650s),
                    Item("Indian Scout Bobber", R.drawable.indian_scout_bobber),
                    Item("Harley Davidson V Rod", R.drawable.harley_davidson_vrod),
                )
            )
        )

        // Set up the ViewPager adapter
        viewPager.adapter = MyViewPagerAdapter(data)
    }
}
