package com.rots87.tarea1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.btnSiguiente);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        TextView nombre = (TextView) findViewById(R.id.tiNombre);
        TextView telefono = (TextView) findViewById(R.id.tiTelefono);
        TextView mail = (TextView) findViewById(R.id.tiEmail);
        TextView contacto = (TextView) findViewById(R.id.tiContacto);
        DatePicker fecha = (DatePicker) findViewById(R.id.dp_fecha);

        //Toast toast = Toast.makeText(getApplicationContext(), i,Toast.LENGTH_SHORT);
        //toast.show();
        String d = Integer.toString(fecha.getDayOfMonth());
        String M = Integer.toString(fecha.getMonth()+1);
        String y = Integer.toString(fecha.getYear());
        String n = nombre.getText().toString();
        String t = telefono.getText().toString();
        String m = mail.getText().toString();
        String c = contacto.getText().toString();
        Intent i = new Intent(this, contacto.class);
        i.putExtra("Nombre",n);
        i.putExtra("Telefono",t);
        i.putExtra("Email",m);
        i.putExtra("Contacto",c);
        i.putExtra("Dia",d);
        i.putExtra("Mes",M);
        i.putExtra("Anio",y);
        startActivity(i);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Bundle datos = getIntent().getExtras();
        String n;
        String t;
        String E;
        String c;
        try{
            n = datos.getString("Nombre");
            t = datos.getString("Telefono");
            E = datos.getString("Email");
            c = datos.getString("Contacto");
        }catch(NullPointerException e){
            n = "";
            t = "";
            E = "";
            c = "";
        }
        TextView Nombre = (TextView) findViewById(R.id.tiNombre);
        TextView Telefono = (TextView) findViewById(R.id.tiTelefono);
        TextView Email = (TextView) findViewById(R.id.tiEmail);
        TextView Contacto = (TextView) findViewById(R.id.tiContacto);
        Nombre.setText(n);
        Telefono.setText(t);
        Email.setText(E);
        Contacto.setText(c);
    }
}
