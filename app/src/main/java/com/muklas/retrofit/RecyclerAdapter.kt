package com.muklas.retrofit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class RecyclerAdapter(val context: Context) :
    RecyclerView.Adapter<RecyclerAdapter.RecyclerViewVH>() {

    var movieList: List<Movie> = listOf()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerViewVH {
        val view = LayoutInflater.from(context).inflate(R.layout.row_item, parent, false)
        return RecyclerViewVH(view)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.RecyclerViewVH, position: Int) {
        val movie: Movie
        movie = movieList.get(position)
        holder.tvTitle.setText(movie.title)
        Glide.with(context)
            .load(movie.image)
            .apply(RequestOptions().centerCrop())
            .into(holder.imageView)
    }

    fun setMovieListItems(movieList: List<Movie>) {
        this.movieList = movieList
        notifyDataSetChanged()
    }

    class RecyclerViewVH(view: View) : RecyclerView.ViewHolder(view) {
        val tvTitle: TextView = view.findViewById(R.id.tvTitle)
        val imageView: ImageView = view.findViewById(R.id.imageView)
    }
}