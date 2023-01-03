package com.example.consultacnpj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.jsonurl.Utils
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enderecoCnpj = Utils.getInstance().create(ApiInterface::class.java)
        val cnpj_input : EditText  = findViewById(R.id.cnpj)
        val razaoSocial_output : EditText = findViewById(R.id.razaoSocialEdit)
        val enderecoEdit_output : EditText = findViewById(R.id.enderecoEdit)
        val btn : Button = findViewById(R.id.btnSearch)

        btn.setOnClickListener()
        {
            razaoSocial_output.setText("\n")
            enderecoEdit_output.setText("\n")

            GlobalScope.launch(Dispatchers.Main, CoroutineStart.DEFAULT) {
                val results = enderecoCnpj.getAddress(
                    cnpj_input.text.toString(),
                    "72c352cd-1771-4ad2-bf75-0bb109db57f7-683a76c0-5585-453a-98af-a74483413216"
                )

                if (results.isSuccessful && results.body() != null) {
                    if (!results.body()!!.alias.isNullOrEmpty())
                        razaoSocial_output.setText(results.body()!!.alias.toString() + "\n" + "Fundada em: " +
                            results.body()!!.founded)

                    if (!results.body()!!.address.street.isNullOrEmpty())
                        enderecoEdit_output.setText(results.body()!!.address.street + ", " +
                                results.body()!!.address.number + ", " +
                                results.body()!!.address.district + ", " + "\n" +
                                results.body()!!.address.city + ", " + "CEP: "+
                                results.body()!!.address.zip)

                    Log.d("Tag", "${results.body()}")
                }
            }
        }
    }
}