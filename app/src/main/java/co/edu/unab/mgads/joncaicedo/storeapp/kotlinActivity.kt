package co.edu.unab.mgads.joncaicedo.storeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class kotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // variables - constantes - tipos de datos

        var name:String="jhon"
        var height:Double = 1.75
        var age:Int = 36
        var admin:Boolean = true

        println("$name altura $height, edad $age es administrador? $admin")

        // Estructuras de Control - if/else

        val email:String = getString(R.string.email)
        val emailInput = "jon@correo.com"

        val password:String = getString(R.string.password)
        val passwordInput = "12345"

        if(email == emailInput && password == passwordInput){
            println("Iniciando sesión..")
        }else if(email!=emailInput){
            println("Correo invalido")
        }else{
            print("password inválido")

        }
    }
}