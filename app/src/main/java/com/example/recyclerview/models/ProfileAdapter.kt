package com.example.recyclerview.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.recyclerview.R
import kotlinx.android.synthetic.main.res_item_profile.view.*

class ProfileAdapter (private val onClicked: (Profile) -> Unit): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var items: List<Profile>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ProfileViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.res_item_profile, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ProfileViewHolder -> {
                holder.bind(items[position], onClicked)
            }
        }
    }

    override fun getItemCount(): Int {

        return items.size
    }

    fun setDataSet(list: List<Profile> ){
        this.items = list
    }

    class ProfileViewHolder constructor(
        ItemView: View
    ): RecyclerView.ViewHolder(ItemView) {

        private val profileName = itemView.name
        private val profileMusica = itemView.musica
        private val profileImage = itemView.image

        fun bind(profile: Profile, onClicked: (Profile) -> Unit){
            profileName.text = profile.nome
            profileMusica.text = profile.musica
            profileImage.setImageResource(profile.image)

            itemView.setOnClickListener{
                onClicked(profile)
            }
        }
    }
}