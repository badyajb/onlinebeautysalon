package com.example.hairstyle


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hairstyle.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth


class login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseAuth = FirebaseAuth.getInstance()
        binding.up.setOnClickListener{
            val intent = Intent(this , signup::class.java)
            startActivity(intent)
        }
        binding.loginbtn23.setOnClickListener {
            val email = binding.eemail.text.toString()
            val pass = binding.passwordd.text.toString()


            if (email.isNotEmpty() && pass.isNotEmpty()  ){
                firebaseAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener{
                    if(it.isSuccessful){
                        val intent = Intent(this , home::class.java)
                        startActivity(intent)

                    }else{
                        Toast.makeText(this,it.exception.toString() , Toast.LENGTH_SHORT).show()
                    }
                }

            }else{
                Toast.makeText(this,"is empty",Toast.LENGTH_SHORT).show()
            }
        }



    }
}