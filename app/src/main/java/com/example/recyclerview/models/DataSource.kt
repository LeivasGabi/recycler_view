package com.example.recyclerview.models

import com.example.recyclerview.R

class DataSource {
    companion object{
        fun createDataSet() : ArrayList<Profile> {
            val list = ArrayList<Profile>()

            list.add(
                Profile(
                    "Foo Fighters",
                    "These Days",
                    R.drawable.img_ff,
                    "https://www.youtube.com/watch?v=YDVAQI-4lto"
                )
            )
            list.add(
                Profile(
                    "Nirvana",
                    "Heart Shaped Box",
                    R.drawable.img_n,
                    "https://www.youtube.com/watch?v=n6P0SitRwy8"
                )
            )
            list.add(
                Profile(
                    "Avril Lavigne",
                    "Complicated",
                    R.drawable.img_a,
                    "https://www.youtube.com/watch?v=5NPBIwQyPWE"
                )
            )
            list.add(
                Profile(
                    "Evanescense",
                    "Bring Me To Life",
                    R.drawable.img_e,
                    "https://www.youtube.com/watch?v=3YxaaGgTQYM"
                )
            )
            return list
        }
    }
}