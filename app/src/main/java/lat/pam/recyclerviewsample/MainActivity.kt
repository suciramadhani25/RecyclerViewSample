package lat.pam.recyclerviewsample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Menghubungkan RecyclerView dari layout
        val recyclerview =
            findViewById<RecyclerView>(R.id.recyclerview)

        // Mengatur daftar menjadi vertikal
        recyclerview.layoutManager =
            LinearLayoutManager(this)

        // Membuat data untuk 20 item
        val data = ArrayList<ItemsViewModel>()

        for (i in 1..20) {
            data.add(ItemsViewModel("Item $i"))
        }

        // Menghubungkan data dengan adapter
        val adapter = CustomAdapter(data)

        Log.d("test string", "Jumlah data: ${data.size}")

        recyclerview.adapter = adapter
    }
}
