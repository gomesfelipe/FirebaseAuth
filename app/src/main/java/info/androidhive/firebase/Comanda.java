package info.androidhive.firebase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Comanda extends Activity implements View.OnClickListener {
    private final static Clientes cliente = new Clientes();
    Button btnCTime;
    TextView text;

    TableLayout t1;

    TableLayout tl = (TableLayout) findViewById(R.id.tlPedido);
    private String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_cadastro_clientes);
        btnCTime=(Button)findViewById(R.id.button);
        btnCTime.setOnClickListener((View.OnClickListener) this);
        text = (EditText) findViewById(R.id.etCliente);
        // text = (TextView) findViewById(R.id.textView2);
        this.value = intent.getStringExtra("Click");


    }
    public Clientes referencia(){
        return cliente;
    }
    @Override
    public void onClick(View view) {
        text = (EditText) findViewById(R.id.editText);
        if(text!=null) {
            Toast.makeText(Comanda.this,"Campo Nome Inválido!",
                    Toast.LENGTH_SHORT).show();
        }
        else {

        }

    }

}

