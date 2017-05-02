package com.ricdesc26.inventarios_movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void agregar(View view){
        Intent i = new Intent (this, AgregarProducto.class);
        startActivity(i);
    }

    public void quitar(View view){
        Intent i = new Intent (this, QuitarProducto.class);
        startActivity(i);
    }

    public void vender(View view){
        Intent i = new Intent (this, VenderProducto.class);
        startActivity(i);
    }

    public void mostrar(View view){
        Intent i = new Intent ();
    }
}
