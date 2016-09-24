package com.rots87.tarea1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by rots on 09-22-16.
 */

public class contacto extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacto_confirmacion);
        Button b = (Button) findViewById(R.id.btnEditar);
        b.setOnClickListener(this);

        Bundle datos = getIntent().getExtras();
        String n = datos.getString("Nombre");
        String t = datos.getString("Telefono");
        String e = datos.getString("Email");
        String c = datos.getString("Contacto");
        String d = datos.getString("Dia");
        String M = "/" + datos.getString("Mes");
        String y = "/" + datos.getString("Anio");

        TextView tvNombre = (TextView) findViewById(R.id.tvNombre);
        TextView tvFecha = (TextView) findViewById(R.id.tvFecha);
        TextView tvDireccion = (TextView) findViewById(R.id.tvDireccion);
        TextView tvEmail = (TextView) findViewById(R.id.tvEmail);
        TextView tvTelefono = (TextView) findViewById(R.id.tvTelefono);

        tvNombre.setText(n);
        tvFecha.setText("Fecha: "+d+M+y);
        tvDireccion.setText("Direccion: "+c);
        tvTelefono.setText("Telefono: "+t);
        tvEmail.setText("Email: "+e);

    }

    @Override
    public void onClick(View view) {
        TextView nombre = (TextView) findViewById(R.id.tvNombre);
        TextView telefono = (TextView) findViewById(R.id.tvTelefono);
        TextView mail = (TextView) findViewById(R.id.tvEmail);
        TextView contacto = (TextView) findViewById(R.id.tvDireccion);
        String n = nombre.getText().toString();
        String t = telefono.getText().toString();
        t = t.substring(9,t.length());
        String m = mail.getText().toString();
        m = m.substring(6,m.length());
        String c = contacto.getText().toString();
        c = c.substring(10,c.length());
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("Nombre",n);
        i.putExtra("Telefono",t);
        i.putExtra("Email",m);
        i.putExtra("Contacto",c);
        startActivity(i);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
