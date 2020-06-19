package id.itborneo.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewUser()
    }

    private  fun recyclerViewUser(){

        val user = mutableListOf<User>()

        user.add(User("Natalie ","Einsiedeln"))
        user.add(User("Halima ","Cegled"))
        user.add(User("Harley ","Alaminos"))
        user.add(User("Daisy ","La Vergne"))
        user.add(User("Natalie ","Einsiedeln"))
        user.add(User("Halima ","Cegled"))
        user.add(User("Harley ","Alaminos"))
        user.add(User("Daisy ","La Vergne"))
        user.add(User("Natalie ","Einsiedeln"))
        user.add(User("Halima ","Cegled"))
        user.add(User("Harley ","Alaminos"))
        user.add(User("Daisy ","La Vergne"))
        user.add(User("Natalie ","Einsiedeln"))
        user.add(User("Halima ","Cegled"))
        user.add(User("Harley ","Alaminos"))
        user.add(User("Daisy ","La Vergne"))
        user.add(User("Natalie ","Einsiedeln"))
        user.add(User("Halima ","Cegled"))
        user.add(User("Harley ","Alaminos"))
        user.add(User("Daisy ","La Vergne"))



        val adapter = RecylerViewAdapter(user)
        rv_user.adapter = adapter
        rv_user.layoutManager = LinearLayoutManager(this)

    }

}