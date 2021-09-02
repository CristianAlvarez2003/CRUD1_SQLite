package com.itca.crud1_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etcodigo, etdescripcion, etPrecio;
    private Button btnAlta, btnConsultaCodigo, btnConsultaDescripcion, btnEliminar, btnModificar, btnSalir, btnNuevo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etcodigo = findViewById(R.id.etcodigo);
        etdescripcion = findViewById(R.id.etdescripcion);
        etPrecio = findViewById(R.id.etPrecio);

        btnAlta = findViewById(R.id.btnAlta);
        btnConsultaCodigo = findViewById(R.id.btnConsultaCodigo);
        btnConsultaDescripcion = findViewById(R.id.btnConsultaDescripcion);
        btnEliminar = findViewById(R.id.btnEliminar);
        btnModificar = findViewById(R.id.btnModificar);
        btnNuevo = findViewById(R.id.btnNuevo);
        btnSalir = findViewById(R.id.btnSalir);

        btnAlta.setOnClickListener(this);
        btnConsultaCodigo.setOnClickListener(this);
        btnConsultaDescripcion.setOnClickListener(this);
        btnEliminar.setOnClickListener(this);
        btnModificar.setOnClickListener(this);
        btnNuevo.setOnClickListener(this);
        btnSalir.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String codigo = etcodigo.getText().toString();
        String  descripcion = etdescripcion.getText().toString();
        String  precio = etPrecio.getText().toString();

        if (codigo.isEmpty()) {
            etcodigo.setError("campo obligatorio");
        }else if (descripcion.isEmpty()){
            etdescripcion.setError("campo obligatorio");
        }else if (precio.isEmpty()) {
            etPrecio.setError("campo obligatorio");
        }else {
            Toast.makeText(this, "Has superado la validaciò", Toast.LENGTH_SHORT);
        }

        switch (view.getId()) {
            case R.id.btnAlta:
                Toast.makeText(this, "has hecho clic en boton Alta", Toast.LENGTH_SHORT).show();
            case R.id.btnConsultaCodigo:
                Toast.makeText(this, "has hecho clic en boton concultar por codigo", Toast.LENGTH_SHORT).show();
            case R.id.btnConsultaDescripcion:
                Toast.makeText(this, "has hecho clic en boton  consultar por descripcion", Toast.LENGTH_SHORT).show();
            case R.id.btnEliminar:
                Toast.makeText(this, "has hecho clic en boton Eliminar", Toast.LENGTH_SHORT).show();
            case R.id.btnModificar:
                Toast.makeText(this, "has hecho clic en boton modificar", Toast.LENGTH_SHORT).show();
            case R.id.btnNuevo:
                Toast.makeText(this, "has hecho clic en boton Nuevo", Toast.LENGTH_SHORT).show();
            case R.id.btnSalir:
                Toast.makeText(this, "has hecho clic en boton Salir", Toast.LENGTH_SHORT).show();
        }

    }
}