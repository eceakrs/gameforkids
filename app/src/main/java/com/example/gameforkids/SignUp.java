package com.example.gameforkids;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    EditText userId, password, name;
    Button register;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        userId = findViewById(R.id.userId);
        password = findViewById(R.id.password);
        name = findViewById(R.id.name);
        register = findViewById(R.id.register);
        login = findViewById(R.id.login);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //initialize user entity
                final UserEntity userEntity = new UserEntity();
                userEntity.setUserId(userId.getText().toString());
                userEntity.setPassword(password.getText().toString());
                userEntity.setName(name.getText().toString());
             if(validateInput(userEntity))   {
                 //insert ediyorum
                 UserDatabase userDatabase = UserDatabase.getUserDatabase(getApplicationContext());
                 UserDao userDao = userDatabase.userDao();
                 new Thread(new Runnable() {
                     @Override
                     public void run() {
                         userDao.registerUser(userEntity);
                         runOnUiThread(new Runnable() {
                             @Override
                             public void run() {
                                 Toast.makeText(
                                         getApplicationContext(), "User Registered", Toast.LENGTH_SHORT
                                 ).show();
                             }
                         });

                     }
                 }).start();
             }else{
                 Toast.makeText(getApplicationContext(), "Fill all fields!", Toast.LENGTH_SHORT).show();
             }
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUp.this, Login.class));
            }
        });

    }

    private Boolean validateInput(UserEntity userEntity){
        if(userEntity.getName().isEmpty() || userEntity.getUserId().isEmpty() || userEntity.getPassword().isEmpty()){
            return false;
        }
        return true;
    }
}
