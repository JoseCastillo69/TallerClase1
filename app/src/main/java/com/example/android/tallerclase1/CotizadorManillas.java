package com.example.android.tallerclase1;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.*;
import android.widget.Toast;

public class CotizadorManillas extends AppCompatActivity {

    private EditText n1;
    private TextView resumen;
    private Resources recursos;
    private Spinner materiales, dijes, tipos, t_moneda;
    private String op1[], op2[], op3[], op4[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cotizador_manillas);
        n1 = findViewById(R.id.txtCantidad);
        resumen = findViewById(R.id.txtResumen);
        materiales = findViewById(R.id.cmbMaterial);
        dijes = findViewById(R.id.cmbDije);
        tipos = findViewById(R.id.cmbTipo);
        recursos = this.getResources();

        op1 = recursos.getStringArray(R.array.material);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,op1);
        materiales.setAdapter(adapter);

        op2 = recursos.getStringArray(R.array.dije);
        ArrayAdapter<String>adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,op2);
        dijes.setAdapter(adapter2);

        op3 = recursos.getStringArray(R.array.tipo);
        ArrayAdapter<String>adapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,op3);
        tipos.setAdapter(adapter3);

        op4 = recursos.getStringArray(R.array.t_moneda);
        ArrayAdapter<String>adapter4 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,op4);
        t_moneda.setAdapter(adapter);

    }

    public void cotizar(View v){
        int opcion, num1, num2, resultado = 0;



    }
}
