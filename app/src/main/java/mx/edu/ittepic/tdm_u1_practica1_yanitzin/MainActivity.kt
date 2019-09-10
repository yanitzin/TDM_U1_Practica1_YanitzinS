package mx.edu.ittepic.tdm_u1_practica1_yanitzin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var imagen1 : ImageView ?=null
    var imagen2 : ImageView ?=null
    var imagen3 : ImageView ?=null
    var imagen4 : ImageView ?=null
    var imagen5 : ImageView ?=null
    var imagen6 : ImageView ?=null
    var imagen7 : ImageView ?=null
    var imagen8 : ImageView ?=null
    var imagen9 : ImageView ?=null
    var imagen10 : ImageView ?=null
    var imagen11 : ImageView ?=null
    var imagen12 : ImageView ?=null
    var imagen13 : ImageView ?=null
    var imagen14 : ImageView ?=null
    var imagen15 : ImageView ?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imagen1 = findViewById(R.id.imagen1)
        imagen2 = findViewById(R.id.imagen2)
        imagen3 = findViewById(R.id.imagen3)
        imagen4 = findViewById(R.id.imagen4)
        imagen5 = findViewById(R.id.imagen5)
        imagen6 = findViewById(R.id.imagen6)
        imagen7 = findViewById(R.id.imagen7)
        imagen8 = findViewById(R.id.imagen8)
        imagen9 = findViewById(R.id.imagen9)
        imagen10 = findViewById(R.id.imagen10)
        imagen11 = findViewById(R.id.imagen11)
        imagen12 = findViewById(R.id.imagen12)
        imagen13 = findViewById(R.id.imagen13)
        imagen14 = findViewById(R.id.imagen14)
        imagen15 = findViewById(R.id.imagen15)

        imagen1?.setOnClickListener {
            var otraActivity = Intent(this,Main2Activity::class.java)
            otraActivity.putExtra("id", 1)
            otraActivity.putExtra("desc", "Gema, es mi tia pero la quiero como mi hermana")
            startActivity(otraActivity)
        }
        imagen2?.setOnClickListener {
            var otraActivity = Intent(this,Main2Activity::class.java)
            otraActivity.putExtra("id", 1)
            otraActivity.putExtra("desc", "Alberto, es mi persona favorita en este mundo por que lo amo")
            startActivity(otraActivity)
        }
        imagen3?.setOnClickListener {
            var otraActivity = Intent(this,Main2Activity::class.java)
            otraActivity.putExtra("id", 1)
            otraActivity.putExtra("desc", "Valentona, es la mas pequeña de la familia y la mas esperada")
            startActivity(otraActivity)
        }
        imagen4?.setOnClickListener {
            var otraActivity = Intent(this,Main2Activity::class.java)
            otraActivity.putExtra("id", 1)
            otraActivity.putExtra("desc", "Papá, No pude pedir un mejor padre")
            startActivity(otraActivity)
        }
        imagen5?.setOnClickListener {
            var otraActivity = Intent(this,Main2Activity::class.java)
            otraActivity.putExtra("id", 1)
            otraActivity.putExtra("desc", "Mamá, Siempre es fuerte por eso y más la amo")
            startActivity(otraActivity)
        }
        imagen6?.setOnClickListener {
            var otraActivity = Intent(this,Main2Activity::class.java)
            otraActivity.putExtra("id", 1)
            otraActivity.putExtra("desc", "Alexander, es mi hermano a pesar de sus defectos lo quiero")
            startActivity(otraActivity)
        }
        imagen7?.setOnClickListener {
            var otraActivity = Intent(this,Main2Activity::class.java)
            otraActivity.putExtra("id", 1)
            otraActivity.putExtra("desc", "Naomi, es mi mejor amiga, aun que estemos lejos siempre estaremos juntas")
            startActivity(otraActivity)
        }
        imagen8?.setOnClickListener {
            var otraActivity = Intent(this,Main2Activity::class.java)
            otraActivity.putExtra("id", 1)
            otraActivity.putExtra("desc", "Erick, es mi el novio de gema y es bueno tenerlo en la familia")
            startActivity(otraActivity)
        }
        imagen9?.setOnClickListener {
            var otraActivity = Intent(this,Main2Activity::class.java)
            otraActivity.putExtra("id", 1)
            otraActivity.putExtra("desc", "Enrique, es el novio de mi abuela no puedo ser alguein mejor")
            startActivity(otraActivity)
        }
        imagen10?.setOnClickListener {
            var otraActivity = Intent(this,Main2Activity::class.java)
            otraActivity.putExtra("id", 1)
            otraActivity.putExtra("desc", "Osiris, esposa de mi tio heriberto madre de valentina")
            startActivity(otraActivity)
        }
        imagen11?.setOnClickListener {
            var otraActivity = Intent(this,Main2Activity::class.java)
            otraActivity.putExtra("id", 1)
            otraActivity.putExtra("desc", "Livier, Sobrina de Alberto y la mejor ahijada")
            startActivity(otraActivity)
        }
        imagen12?.setOnClickListener {
            var otraActivity = Intent(this,Main2Activity::class.java)
            otraActivity.putExtra("id", 1)
            otraActivity.putExtra("desc", "Carmen, es mi vecinita y la mas bonita")
            startActivity(otraActivity)
        }
        imagen13?.setOnClickListener {
            var otraActivity = Intent(this,Main2Activity::class.java)
            otraActivity.putExtra("id", 1)
            otraActivity.putExtra("desc", "Abuela, la mejor abuela de todo el mundo")
            startActivity(otraActivity)
        }
        imagen14?.setOnClickListener {
            var otraActivity = Intent(this,Main2Activity::class.java)
            otraActivity.putExtra("id", 1)
            otraActivity.putExtra("desc", "Ailan, sobrino de carmen pero lo queremos tanto como aun primo")
            startActivity(otraActivity)
        }
        imagen15?.setOnClickListener {
            var otraActivity = Intent(this,Main2Activity::class.java)
            otraActivity.putExtra("id", 1)
            otraActivity.putExtra("desc", "Erick, es el mejor hermano que tiene mi mamá")
            startActivity(otraActivity)
        }
    }
}
