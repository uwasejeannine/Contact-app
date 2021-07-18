package com.example.contactapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class Contactadapter(var Contact:List<Contact>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact,parent,false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var CurrentContact=Contact.get(position)
        holder.etEmail.text=CurrentContact.Email
        holder.etName.text=CurrentContact.name
        holder.etPhone.text=CurrentContact.phone
        Picasso.get()
            .load(CurrentContact.imageUrl)
            .resize(80,80)
            .centerCrop()
            .into(holder.rvContact)
    }

    override fun getItemCount(): Int {
      return Contact.size
    }
}
class ContactViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var etName=itemView.findViewById<TextView>(R.id.etName)
    var etPhone=itemView.findViewById<TextView>(R.id.etPhone)
    var etEmail=itemView.findViewById<TextView>(R.id.etEmail)
    var rvContact=itemView.findViewById<ImageView>(R.id.rvContact)
    var cvcontact=itemView.findViewById<CardView>(R.id.cvContact)

}
