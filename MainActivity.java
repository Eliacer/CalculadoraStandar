package com.example.eliacerfernandez.calculadorastandar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn0,btn7,btn8,btn9,btnmas,btnmenos,btnigual,btnpor,btndiv,btnBorrar,btnpunto;
    private EditText edtvalor;
    TextView rpta;
    double result=0;
    double temp=0,temp1;
    String result1="0 + ";
    String signo;
    String [] Valores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.Btn0);
        btn1 = (Button) findViewById(R.id.Btn1);
        btn2 = (Button) findViewById(R.id.Btn2);
        btn3 = (Button) findViewById(R.id.Btn3);
        btn4 = (Button) findViewById(R.id.Btn4);
        btn5 = (Button) findViewById(R.id.Btn5);
        btn6 = (Button) findViewById(R.id.Btn6);
        btn7 = (Button) findViewById(R.id.Btn7);
        btn8 = (Button) findViewById(R.id.Btn8);
        btn9 = (Button) findViewById(R.id.Btn9);
        btnmas = (Button) findViewById(R.id.BtnMas);
        btnmenos = (Button) findViewById(R.id.BtnMenos);
        btnpor = (Button) findViewById(R.id.BtnPor);
        btndiv = (Button) findViewById(R.id.BtnDiv);
        btnigual = (Button) findViewById(R.id.BtnIgual);
        btnBorrar = (Button) findViewById(R.id.BtnBorrar);
        btnpunto = (Button) findViewById(R.id.BtnPunto);
        rpta = (TextView) findViewById(R.id.rpta);
        edtvalor = (EditText) findViewById(R.id.EdtValor);

        btnpunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = result1 +""+ btnpunto.getText().toString();
                edtvalor.setText(edtvalor.getText().toString()+btnpunto.getText().toString());
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = result1 +""+ Integer.parseInt(btn0.getText().toString());
                edtvalor.setText(edtvalor.getText().toString()+btn0.getText().toString());
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = result1 +""+ Integer.parseInt(btn1.getText().toString());
                edtvalor.setText(edtvalor.getText().toString()+btn1.getText().toString());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = result1 +""+ Integer.parseInt(btn2.getText().toString());
                edtvalor.setText(edtvalor.getText().toString() + btn2.getText().toString());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = result1 +""+ Integer.parseInt(btn3.getText().toString());
                edtvalor.setText(edtvalor.getText().toString()+btn3.getText().toString());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = result1 +""+ Integer.parseInt(btn4.getText().toString());
                edtvalor.setText(edtvalor.getText().toString()+btn4.getText().toString());
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = result1 +""+ Integer.parseInt(btn5.getText().toString());
                edtvalor.setText(edtvalor.getText().toString() + btn5.getText().toString());
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result1 = result1 +""+ Integer.parseInt(btn6.getText().toString());
                edtvalor.setText(edtvalor.getText().toString()+btn6.getText().toString());
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = result1 +""+ Integer.parseInt(btn7.getText().toString());
                edtvalor.setText(edtvalor.getText().toString()+btn7.getText().toString());
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = result1 +""+ Integer.parseInt(btn8.getText().toString());
                edtvalor.setText(edtvalor.getText().toString()+btn8.getText().toString());
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1 = result1 +""+ Integer.parseInt(btn9.getText().toString());
                edtvalor.setText(edtvalor.getText().toString() + btn9.getText().toString());
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtvalor.setText("");
                result1="0 + ";
                rpta.setText("");


            }
        });

        btnmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtvalor.setText(edtvalor.getText().toString()+btnmas.getText().toString());
                Valores = result1.split(" ");
                temp = Double.parseDouble(Valores[0]);
                signo=Valores[1];
                temp1 = Double.parseDouble(Valores[2]);
                if (signo.equals("+")){
                    result = temp+temp1;
                }
                if (signo.equals("-")){
                    result = temp-temp1;
                }
                if (signo.equals("*")){
                    result = temp*temp1;
                }
                if (signo.equals("/")){
                    result = temp/temp1;
                }
                rpta.setText(result+"");
                result1 = String.valueOf(result + " + ");

            }
        });

        btnmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edtvalor.setText(edtvalor.getText().toString()+btnmenos.getText().toString());
                Valores = result1.split(" ");
                temp = Double.parseDouble(Valores[0]);
                signo=Valores[1];
                temp1 = Double.parseDouble(Valores[2]);
                if (signo.equals("+")){
                    result = temp+temp1;
                }
                if (signo.equals("-")){
                    result = temp-temp1;
                }
                if (signo.equals("*")){
                    result = temp*temp1;
                }
                if (signo.equals("/")){
                    result = temp/temp1;
                }
                rpta.setText(result+"");
                result1 = String.valueOf(result + " - ");

            }
        });

        btnpor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edtvalor.setText(edtvalor.getText().toString()+btnpor.getText().toString());
                Valores = result1.split(" ");
                temp = Double.parseDouble(Valores[0]);
                signo=Valores[1];
                temp1 = Double.parseDouble(Valores[2]);
                if (signo.equals("+")){
                    result = temp+temp1;
                }
                if (signo.equals("-")){
                    result = temp-temp1;
                }
                if (signo.equals("*")){
                    result = temp*temp1;
                }
                if (signo.equals("/")){
                    result = temp/temp1;
                }
                rpta.setText(result+"");
                result1 = String.valueOf(result + " * ");

            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edtvalor.setText(edtvalor.getText().toString()+btndiv.getText().toString());
                Valores = result1.split(" ");
                temp = Double.parseDouble(Valores[0]);
                signo=Valores[1];
                temp1 = Double.parseDouble(Valores[2]);
                if (signo.equals("+")){
                    result = temp+temp1;
                }
                if (signo.equals("-")){
                    result = temp-temp1;
                }
                if (signo.equals("*")){
                    result = temp*temp1;
                }
                if (signo.equals("/")){
                    result = temp/temp1;
                }
                rpta.setText(result+"");
                result1 = String.valueOf(result + " / ");

            }
        });

        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Valores = result1.split(" ");
                temp = Double.parseDouble(Valores[0]);
                signo=Valores[1];
                temp1 = Double.parseDouble(Valores[2]);
                if (signo.equals("+")){
                    result = temp+temp1;
                }
                if (signo.equals("-")){
                    result = temp-temp1;
                }
                if (signo.equals("*")){
                    result = temp*temp1;
                }
                if (signo.equals("/")){
                    result = temp/temp1;
                }
                rpta.setText(result+"");
            }
        });

    }


}
