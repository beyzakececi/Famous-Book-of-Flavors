package com.beyzakececi.thefamousbookofflavors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.beyzakececi.thefamousbookofflavors.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var famousFlavorsList: ArrayList<FamousFlavors>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        famousFlavorsList = ArrayList<FamousFlavors>()

        //Data

        val iskender = FamousFlavors(
            "Bursa",
            "İskender",
            "Bursa yöresinin meşhur kebap yemeklerinden biridir. 1867 yılında Kayhan Çarşısı'nda başlamıştır. Aslında temel malzemesi döner olsa da iskenderi iskender yapan, üstündeki tereyağ, domates sosu, yanındaki yoğurt ve altındaki yağlı pide parçalarıdır.",
            R.drawable.iskender
        )
        val kebap = FamousFlavors(
            "Adana",
            "Adana Kebap",
            "Adana kebap, Türk mutfağının kebap çeşitlerinden biridir. Adana kebabı, Adana iline özgü bir kebap çeşididir. Adana kebabı, kıyma, kuyruk yağı, tuz ve baharatların yoğrulmasıyla hazırlanır. Adana kebabı, Türkiye'de en çok tüketilen kebap çeşitlerinden biridir.",
            R.drawable.adanakebap
        )
        val ciborek = FamousFlavors(
            "Eskisehir",
            "Çibörek",
            "Cibörek, kıyma, soğan, maydanoz ve baharatların hamur içine konulup kızartılmasıyla yapılan bir yemektir. Cibörek, Türk mutfağının en eski yemeklerinden biridir.",
            R.drawable.ciborek
        )
        val etliekmek = FamousFlavors(
            "Konya",
            "Etliekmek",
            "Konya yöresine ait olan ve özellikle bu yörelerde yapılan bir çeşit ince ve kenarsız içli pide türüdür. .",
            R.drawable.etliekmek
        )
        val kunefe = FamousFlavors(
            "Hatay",
            "Künefe",
            "Künefe, Türk mutfağında yer alan bir tatlıdır. Kadayıf, peynir ve şerbetten oluşur. Kadayıfın içine peynir konularak yapılan künefe, kızgın yağda pişirilir ve üzerine şerbet dökülür.",
            R.drawable.kunefe
        )
        val tantuni = FamousFlavors(
            "Mersin",
            "Tantuni",
            "Tantuni, Türk mutfağında yer alan bir dürüm çeşididir. Adana ve Mersin yöresine ait olan tantuni, ince kıyılmış dana etinin sacda pişirilmesiyle hazırlanır. Tantuni, dürüm ekmeği içine konularak servis edilir.",
            R.drawable.tantuni
        )

        famousFlavorsList.add(iskender)
        famousFlavorsList.add(kebap)
        famousFlavorsList.add(ciborek)
        famousFlavorsList.add(etliekmek)
        famousFlavorsList.add(kunefe)
        famousFlavorsList.add(tantuni)
        famousFlavorsList.add(iskender)
        famousFlavorsList.add(kebap)
        famousFlavorsList.add(ciborek)
        famousFlavorsList.add(etliekmek)
        famousFlavorsList.add(kunefe)
        famousFlavorsList.add(tantuni)
        famousFlavorsList.add(iskender)
        famousFlavorsList.add(kebap)
        famousFlavorsList.add(ciborek)
        famousFlavorsList.add(etliekmek)
        famousFlavorsList.add(kunefe)
        famousFlavorsList.add(tantuni)
        famousFlavorsList.add(iskender)
        famousFlavorsList.add(kebap)
        famousFlavorsList.add(ciborek)
        famousFlavorsList.add(etliekmek)
        famousFlavorsList.add(kunefe)
        famousFlavorsList.add(tantuni)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val famousFlavorsAdapter = FamousFlavorsAdapter(famousFlavorsList)
        binding.recyclerView.adapter = famousFlavorsAdapter


        /*
        //Adapter : Layout ile data bağlamak için kullanılır.

        val adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,famousFlavorsList.map {it -> it.cityname })

        binding.listView.adapter=adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("famousFlavor", famousFlavorsList[position])
            startActivity(intent)
        }

         */


    }
}