package mx.edu.ittepic.tdm_u1_practica1_yanitzin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Main2Activity : AppCompatActivity() {
    var imagen : ImageView ?=null
    var descripcion : TextView ?=null
    var regresar : Button ?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        imagen = findViewById(R.id.img)
        descripcion = findViewById(R.id.descripcion)
        regresar = findViewById(R.id.Regresar)

        descripcion?.setText(intent.extras?.getString("desc"))

        when(intent.extras?.getInt("id")){
            1 ->imagen?.setImageResource(R.drawable.iconoa5)
            2 ->imagen?.setImageResource(R.drawable.iconoa3)
            3 ->imagen?.setImageResource(R.drawable.iconoa6)
            4 ->imagen?.setImageResource(R.drawable.iconoa2)
            5 ->imagen?.setImageResource(R.drawable.iconoa1)
            6 ->imagen?.setImageResource(R.drawable.iconoa4)
            7 ->imagen?.setImageResource(R.drawable.iconoa8)
            8 ->imagen?.setImageResource(R.drawable.iconoa12)
            9 ->imagen?.setImageResource(R.drawable.iconoa13)
            10 ->imagen?.setImageResource(R.drawable.iconoa14)
            11 ->imagen?.setImageResource(R.drawable.iconoa10)
            12 ->imagen?.setImageResource(R.drawable.iconoa9)
            13 ->imagen?.setImageResource(R.drawable.iconoa7)
            14 ->imagen?.setImageResource(R.drawable.iconoa11)
            15 ->imagen?.setImageResource(R.drawable.icono14)
        }

        regresar?.setOnClickListener {
            finish()
        }

    }
}
