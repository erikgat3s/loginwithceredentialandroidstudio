package com.example.simpleconstraintlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.mnDaftar)
        {
            Intent i = new Intent(getApplicationContext(), DaftarActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }



    //deklarasi variabel untuk button
    Button btnLogin;

    //deklarasi variabel untuk EditText
    private EditText edemail, edpassword;

    //deklarasi variabel untuk menyimpan email dan password
    String nama, password;


        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //menghubungkan variabel btnLogin dengan componen button pada Layout
            btnLogin = findViewById(R.id.btSignIn);

            //Menghubungakan variabel edemail dengan componen button pada Layout
            edemail = findViewById(R.id.edEmail);

            //Menghubungakan variabel edpassword dengan componen button pada Layout
            edpassword = findViewById(R.id.edPassword);

            //membuat fungsi onclick pada button btnLogin
            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                protected void finalize() throws Throwable {
                    super.finalize();
                }

                @NonNull
                @Override
                public String toString() {
                    return super.toString();
                }

                @Override
                public void onClick(View view) {
                    //menyimpan input user edittext email kedalam variabel nama
                    nama = edemail.getText().toString();

                    //menyimpan input user di edittext password kedalam variabel password
                    password = edpassword.getText().toString();

                    String email = "admin@mail.com";
                    String pass = "123";

                    if (nama.isEmpty() || password.isEmpty()) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Email dan password wajib diisi!!!",
                                Toast.LENGTH_LONG);
                        t.show();

                    } else if (nama.equals(email) && password.equals(pass)) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Berhasil",
                                Toast.LENGTH_LONG);

                        t.show();

                        Bundle b = new Bundle();
                        b.putString("a",nama.trim());
                        b.putString("b", password.trim());

                        Intent i = new Intent(getApplicationContext(), activityhasil.class);
                        i.putExtras(b);
                        startActivity(i);


                    } else if (nama.equals(email)) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Password Salah", Toast.LENGTH_LONG);
                        t.show();
                    } else if (password.equals(pass)) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Email Salah", Toast.LENGTH_LONG);
                        t.show();
                    } else {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Email dan Password Salah", Toast.LENGTH_LONG);
                        t.show();
                    }
                }
            });
        }
        }

