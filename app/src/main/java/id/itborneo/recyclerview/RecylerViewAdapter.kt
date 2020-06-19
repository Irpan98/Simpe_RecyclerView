package id.itborneo.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_user.view.*
import java.util.zip.Inflater

class RecylerViewAdapter(private val users: List<User>) :
    RecyclerView.Adapter<RecylerViewAdapter.ViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecylerViewAdapter.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val userView = inflater.inflate(R.layout.item_user, parent, false)

        return ViewHolder(userView)
    }

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: RecylerViewAdapter.ViewHolder, position: Int) {
        holder.tvName.text = users[position].name
        holder.tvLocation.text = users[position].location

    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName = itemView.tv_name
        val tvLocation = itemView.tv_location

    }
}