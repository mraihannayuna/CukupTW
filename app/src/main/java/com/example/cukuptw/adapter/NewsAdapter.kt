package com.example.cukuptw.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cukuptw.R
import com.example.cukuptw.data.model.ArticlesItem
import com.example.cukuptw.databinding.ItemRowNewsBinding
import com.example.cukuptw.ui.detail.DetailBeritaActivity
import com.squareup.picasso.Picasso
import java.text.SimpleDateFormat
import java.util.Locale

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {

    private val listNews = ArrayList<ArticlesItem>()

    fun setData(list: List<ArticlesItem>?) {
        listNews.clear()
        if (list != null) {
            listNews.addAll(list)
        }
        notifyItemRangeChanged(0, listNews.size)
    }

    class MyViewHolder(val binding: ItemRowNewsBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(ItemRowNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun getItemCount(): Int = listNews.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val dataNews = listNews[position]

        val dateTimeString = dataNews.pubDate
        val dateTimeFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
        val date = dateTimeFormat.parse(dateTimeString)
        val myDateFormat = SimpleDateFormat("EEE, dd MMMM | HH:mm", Locale.getDefault())

        val myDate = myDateFormat.format(date)

        holder.binding.apply {
            tvTitle.text = dataNews.title
            tvDate.text = dataNews.pubDate

            Picasso.get()
                .load(dataNews.thumbnail)
                .fit()
                .centerInside()
                .placeholder(R.drawable.ic_logo)
                .into(imgNews)

        }

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, DetailBeritaActivity::class.java)
            intent.putExtra(DetailBeritaActivity.DATA_NEWS, dataNews)
            intent.putExtra(DetailBeritaActivity.DATE_NEWS, myDate)
            holder.itemView.context.startActivity(intent)
        }

    }

}