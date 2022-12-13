package com.example.recyclerview.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.recyclerview.R
import kotlinx.android.synthetic.main.res_item_profile.view.*

class ProfileAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var items: List<Profile>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ProfileViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.res_item_profile, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ProfileViewHolder -> {
                holder.bind(items[position])
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
        private val profileLanguage = itemView.language
        private val profileImage = itemView.image

        fun bind(profile: Profile){
            profileName.text = profile.nome
            profileLanguage.text = profile.liguagem
//            profileImage.setImageResource(profile.image)
        }
    }
}