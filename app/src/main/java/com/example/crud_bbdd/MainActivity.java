package com.example.crud_bbdd;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements DataAccessObjects{

    //cal posar els 4 botons a l'escolta:
    Button botonInsertar, botonActualizar, botonBorrar, botonBuscar;
    EditText textoId, textoNombre, textoApellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonInsertar = (Button)findViewById(R.id.insertar);
        botonActualizar= (Button)findViewById(R.id.actualizar);
        botonBorrar = (Button)findViewById(R.id.borrar);
        botonBuscar = (Button)findViewById(R.id.buscar);

        textoId = (EditText)findViewById(R.id.id);
        textoNombre = (EditText)findViewById(R.id.nombre);
        textoApellido = (EditText)findViewById(R.id.apellido);


        //creem la instància de la BBDD:
        final Estructura_BBDD.DatosTrabajadores db = Room.databaseBuilder(getApplicationContext(),
                Estructura_BBDD.DatosTrabajadores.class, "database-name").build();

        //posar a l'escolta els botons. A dins del mètode onClick de cada botó és on hem de posar
        //el codi de la BBDD
        botonInsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                db.userDao().insert(new Estructura_BBDD.User (textoId.getText().toString(),
                        textoNombre.getText().toString(),
                        textoApellido.getText().toString());
            }
        });

        botonActualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        botonBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        botonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
