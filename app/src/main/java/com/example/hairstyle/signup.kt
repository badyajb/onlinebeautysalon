package com.example.hairstyle


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hairstyle.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth


class signup : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
       firebaseAuth = FirebaseAuth.getInstance()
        binding.sgin1.setOnClickListener{
            val intent = Intent(this , login::class.java)
            startActivity(intent)
        }
        binding.loginbtn2.setOnClickListener {
            val email = binding.eemail.text.toString()
            val pass = binding.passwordd.text.toString()
            val user = binding.username.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty() && user.isNotEmpty() ){
                firebaseAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener{
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