package com.example.viewpager2_example_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViewPager2()

    }


    private fun initViewPager2()
    {
        // ViewPager2 initialisieren
        var viewPager:ViewPager2 = findViewById(R.id.viewpager)
        var adapter = ViewPagerViewAdapter()
        viewPager.adapter = adapter
        adapter.setNewUsers(createExampleUserList())

        var tabLayout: TabLayout = findViewById(R.id.tablayout)
        TabLayoutMediator(tabLayout,viewPager){tab, position ->
            tab.text = createExampleUserList()[position].name
        }.attach()


    }

    private fun createExampleUserList():ArrayList<User>
    {
        var export:ArrayList<User> = ArrayList()
        export.add(User("Cheryl","Freemann"))
        export.add(User("Tiffany","Bowman"))
        export.add(User("Rita","Freemann"))
        export.add(User("Otis","Cruz"))
        export.add(User("Margaret","Hampton"))
        export.add(User("Matthew","Goodwin"))
        export.add(User("Tommie","Stephens"))
        export.add(User("Brenda","Richards"))
        export.add(User("Maryann","Simpson"))
        export.add(User("Denise","Pittman"))
        return export
    }
}
