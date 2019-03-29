package tech.visuallatam.evaluacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import org.w3c.dom.Text;

import tech.visuallatam.evaluacion.Model.Factura;

public class second extends AppCompatActivity {

    String json;
    Factura factura;
    TextView user,email,total,p1,p2,p3,p4,p5,p6,p7,p8,p9;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();
        if(extras !=null){
            json = extras.getString("factura");
        }
        factura = new Gson().fromJson(json,Factura.class);


        load();
        binder();

    }

    private void load() {
        user = findViewById(R.id.userf);
        email = findViewById(R.id.emailf);
        total = findViewById(R.id.total);
        p1 = findViewById(R.id.p1f);
        p2 = findViewById(R.id.p2f);
        p3 = findViewById(R.id.p3f);
        p4 = findViewById(R.id.p4f);
        p5 = findViewById(R.id.p5f);
        p6 = findViewById(R.id.p6f);
        p7 = findViewById(R.id.p7f);
        p8 = findViewById(R.id.p8f);
        p9 = findViewById(R.id.p9f);
        btn = findViewById(R.id.share);
    }

    private void binder() {
        user.setText(factura.getUsername());
        email.setText(factura.getEmail());
        total.setText(Integer.toString(factura.getCounter()));
        p1.setText(factura.getCp1());
        p2.setText(factura.getCp2());
        p3.setText(factura.getCp3());
        p4.setText(factura.getCp4());
        p5.setText(factura.getCp5());
        p6.setText(factura.getCp6());
        p7.setText(factura.getCp7());
        p8.setText(factura.getCp8());
        p9.setText(factura.getCp9());
        btn.setOnClickListener(v ->{
            Intent snd = new Intent();
            snd.setAction(Intent.ACTION_SEND);
            snd.putExtra(Intent.EXTRA_TEXT,new Gson().toJson(factura));
            snd.setType("text/plain");
            startActivity(Intent.createChooser(snd, getResources().getText(R.string.app_name)));
        });

    }


}
