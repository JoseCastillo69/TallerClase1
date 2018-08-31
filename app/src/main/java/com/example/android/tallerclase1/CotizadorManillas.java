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
        t_moneda = findViewById(R.id.cmbTipoMoneda);
        recursos = this.getResources();

        op1 = recursos.getStringArray(R.array.material);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op1);
        materiales.setAdapter(adapter);

        op2 = recursos.getStringArray(R.array.dije);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op2);
        dijes.setAdapter(adapter2);

        op3 = recursos.getStringArray(R.array.tipo);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op3);
        tipos.setAdapter(adapter3);

        op4 = recursos.getStringArray(R.array.t_moneda);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op4);
        t_moneda.setAdapter(adapter4);

    }

    public void cotizar(View v) {
        int opcion1, opcion2, opcion3, opcion4, num1, resultado = 0;
        if (validar()) {
            opcion1 = materiales.getSelectedItemPosition();
            opcion2 = dijes.getSelectedItemPosition();
            opcion3 = tipos.getSelectedItemPosition();
            opcion4 = t_moneda.getSelectedItemPosition();
            num1 = Integer.parseInt(n1.getText().toString());
            switch (opcion1) {
                case 1:
                    switch (opcion2) {
                        case 1:
                            switch (opcion3) {
                                case 1:
                                    switch (opcion4) {
                                        case 1:
                                            resultado = Metodos.cotizar(num1, opcion1, opcion2, opcion3, opcion4);
                                            break;
                                        case 2:
                                            resultado = Metodos.cotizar(num1, opcion1, opcion2, opcion3, opcion4);
                                            break;
                                    }
                                    break;
                                case 2:
                                    resultado = Metodos.cotizar(num1, opcion1, opcion2, opcion3, opcion4);
                                    break;
                                case 3:
                                    resultado = Metodos.cotizar(num1, opcion1, opcion2, opcion3, opcion4);
                                    break;
                                case 4:
                                    resultado = Metodos.cotizar(num1, opcion1, opcion2, opcion3, opcion4);
                                    break;
                            }
                            break;
                        case 2:
                            switch (opcion3) {
                                case 1:
                                    switch (opcion4) {
                                        case 1:
                                            resultado = Metodos.cotizar(num1, opcion1, opcion2, opcion3, opcion4);
                                            break;
                                        case 2:
                                            resultado = Metodos.cotizar(num1, opcion1, opcion2, opcion3, opcion4);
                                            break;
                                    }
                                    break;
                                case 2:
                                    resultado = Metodos.cotizar(num1, opcion1, opcion2, opcion3, opcion4);
                                    break;
                                case 3:
                                    resultado = Metodos.cotizar(num1, opcion1, opcion2, opcion3, opcion4);
                                    break;
                                case 4:
                                    resultado = Metodos.cotizar(num1, opcion1, opcion2, opcion3, opcion4);
                                    break;
                            }

                    }
                case 2:
                    switch (opcion2) {
                        case 1:
                            switch (opcion3) {
                                case 1:
                                    switch (opcion4) {
                                        case 1:
                                            resultado = Metodos.cotizar(num1, opcion1, opcion2, opcion3, opcion4);
                                            break;
                                        case 2:
                                            resultado = Metodos.cotizar(num1, opcion1, opcion2, opcion3, opcion4);
                                            break;
                                    }
                                    break;
                                case 2:
                                    resultado = Metodos.cotizar(num1, opcion1, opcion2, opcion3, opcion4);
                                    break;
                                case 3:
                                    resultado = Metodos.cotizar(num1, opcion1, opcion2, opcion3, opcion4);
                                    break;
                                case 4:
                                    resultado = Metodos.cotizar(num1, opcion1, opcion2, opcion3, opcion4);
                                    break;
                            }
                            break;
                        case 2:
                            switch (opcion3) {
                                case 1:
                                    switch (opcion4) {
                                        case 1:
                                            resultado = Metodos.cotizar(num1, opcion1, opcion2, opcion3, opcion4);
                                            break;
                                        case 2:
                                            resultado = Metodos.cotizar(num1, opcion1, opcion2, opcion3, opcion4);
                                            break;
                                    }
                                    break;
                                case 2:
                                    resultado = Metodos.cotizar(num1, opcion1, opcion2, opcion3, opcion4);
                                    break;
                                case 3:
                                    resultado = Metodos.cotizar(num1, opcion1, opcion2, opcion3, opcion4);
                                    break;
                                case 4:
                                    resultado = Metodos.cotizar(num1, opcion1, opcion2, opcion3, opcion4);
                                    break;
                            }

                    }
            }
            resumen.setText(Integer.toString(resultado));
        }
    }

    public void limpiar(View v) {
        n1.setText("");
        materiales.setSelection(0);
        dijes.setSelection(0);
        tipos.setSelection(0);
        t_moneda.setSelection(0);
        n1.requestFocus();
        resumen.setText("");

    }

    public boolean validar() {
        int o1 = materiales.getSelectedItemPosition();
        int o2 = dijes.getSelectedItemPosition();
        int o3 = tipos.getSelectedItemPosition();
        int o4 = t_moneda.getSelectedItemPosition();

        if (n1.getText().toString().isEmpty()) {
            n1.setError(recursos.getString(R.string.error_1));
            n1.requestFocus();
            return false;
        }

        if (o1 == 0) {
            Toast.makeText(this, recursos.getString(R.string.error_2), Toast.LENGTH_SHORT).show();
            n1.requestFocus();
            return false;
        }
        if (o2 == 0) {
            Toast.makeText(this, recursos.getString(R.string.error_3), Toast.LENGTH_SHORT).show();
            n1.requestFocus();
            return false;
        }
        if (o3 == 0) {
            Toast.makeText(this, recursos.getString(R.string.error_4), Toast.LENGTH_SHORT).show();
            n1.requestFocus();
            return false;
        }
        if (o4 == 0) {
            Toast.makeText(this, recursos.getString(R.string.error_5), Toast.LENGTH_SHORT).show();
            n1.requestFocus();
            return false;
        }


        return true;

    }
}


