package com.example.retos_mintic_ciclo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //poner icono en el menu
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher_logo);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_app, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.productos){
            Toast.makeText(this, "Proximamente podras acceder a esta actividad", Toast.LENGTH_LONG).show();
        }else if(id == R.id.servicios){
            Toast.makeText(this, "Proximamente podras acceder a esta actividad", Toast.LENGTH_LONG).show();
        }else if(id == R.id.sucursales){
            Toast.makeText(this, "Proximamente podras acceder a esta actividad", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Proximamente podras acceder a esta actividad", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }

    public void commingSoon(View view){
        Snackbar.make(view,"Pronto podras realizar esta accion",Snackbar.LENGTH_SHORT).show();
    }
}