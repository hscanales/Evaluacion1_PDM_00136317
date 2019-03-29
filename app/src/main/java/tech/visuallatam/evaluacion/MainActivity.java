package tech.visuallatam.evaluacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;

import tech.visuallatam.evaluacion.Model.Factura;

public class MainActivity extends AppCompatActivity {

    LinearLayout p1,p2,p3,p4,p5,p6,p7,p8,p9;
    TextView cp1,cp2,cp3,cp4,cp5,cp6,cp7,cp8,cp9;
    EditText username,email;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loader();
        binder();

    }


    private void loader() {
        p1= findViewById(R.id.p1);
        p2= findViewById(R.id.p2);
        p3= findViewById(R.id.p3);
        p4= findViewById(R.id.p4);
        p5= findViewById(R.id.p5);
        p6= findViewById(R.id.p6);
        p7= findViewById(R.id.p7);
        p8= findViewById(R.id.p8);
        p9= findViewById(R.id.p9);


        cp1= findViewById(R.id.cp1);
        cp2= findViewById(R.id.cp2);
        cp3= findViewById(R.id.cp3);
        cp4= findViewById(R.id.cp4);
        cp5= findViewById(R.id.cp5);
        cp6= findViewById(R.id.cp6);
        cp7= findViewById(R.id.cp7);
        cp8= findViewById(R.id.cp8);
        cp9= findViewById(R.id.cp9);

        username = findViewById(R.id.username);
        email = findViewById(R.id.correo);


        send = findViewById(R.id.sndnds);
    }



    private void binder() {
        p1.setOnClickListener(v ->{
            int value  =  Integer.parseInt(cp1.getText().toString());
            value++;
            cp1.setText(Integer.toString(value));
        });


        p2.setOnClickListener(v ->{
            int value  =  Integer.parseInt(cp2.getText().toString());
            value++;
            cp2.setText(Integer.toString(value));
        });


        p3.setOnClickListener(v ->{
            int value  =  Integer.parseInt(cp3.getText().toString());
            value++;
            cp3.setText(Integer.toString(value));
        });


        p4.setOnClickListener(v ->{
            int value  =  Integer.parseInt(cp4.getText().toString());
            value++;
            cp4.setText(Integer.toString(value));
        });

        p5.setOnClickListener(v ->{
            int value  =  Integer.parseInt(cp5.getText().toString());
            value++;
            cp5.setText(Integer.toString(value));
        });


        p6.setOnClickListener(v ->{
            int value  =  Integer.parseInt(cp6.getText().toString());
            value++;
            cp6.setText(Integer.toString(value));
        });


        p7.setOnClickListener(v ->{
            int value  =  Integer.parseInt(cp7.getText().toString());
            value++;
            cp7.setText(Integer.toString(value));
        });


        p8.setOnClickListener(v ->{
            int value  =  Integer.parseInt(cp8.getText().toString());
            value++;
            cp8.setText(Integer.toString(value));
        });

        p9.setOnClickListener(v ->{
            int value  =  Integer.parseInt(cp9.getText().toString());
            value++;
            cp9.setText(Integer.toString(value));
        });


        send.setOnClickListener( v ->{
            Intent prro  = new Intent(this,second.class);
            Factura factura = new Factura(cp1.getText().toString(),cp2.getText().toString(),cp3.getText().toString(),cp4.getText().toString(),cp5.getText().toString(),cp6.getText().toString(),cp7.getText().toString(),cp8.getText().toString(),cp9.getText().toString(),username.getText().toString(),email.getText().toString());

            prro.putExtra("factura", new Gson().toJson(factura));
            startActivity(prro);
        });
    }
}
