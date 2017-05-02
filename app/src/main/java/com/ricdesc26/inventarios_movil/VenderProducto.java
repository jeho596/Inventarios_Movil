package com.ricdesc26.inventarios_movil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VenderProducto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vender_producto);
    }

    public void menuPrincipal(View view){
        finish();
    }
}
