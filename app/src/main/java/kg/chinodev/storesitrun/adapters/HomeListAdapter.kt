package kg.chinodev.storesitrun.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kg.chinodev.storesitrun.R
import kg.chinodev.storesitrun.network.models.HomeListItem

class HomeListAdapter(val data: List<HomeListItem>) : RecyclerView.Adapter<HomeListAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val layout: ConstraintLayout = itemView.findViewById(R.id.product_layout)
        val name: TextView = itemView.findViewById(R.id.product_name)
        val price: TextView = itemView.findViewById(R.id.product_price)
        val image: ImageView = itemView.findViewById(R.id.product_image)
        val favorite: ImageView = itemView.findViewById(R.id.product_favorite)
        val addToCard: Button = itemView.findViewById(R.id.product_cart)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(
            R.layout.item_product_home, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.name.text = item.nameShort
        holder.price.text = item.price.toString()
        Glide.with(holder.image).load(item.imageUrl).into(holder.image)
        holder.layout.setOnClickListener {
            
        }
        holder.favorite.setOnClickListener {

        }
        holder.addToCard.setOnClickListener {

        }
    }

    override fun getItemCount() = data.size
}