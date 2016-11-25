package info.androidhive.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import org.askerov.dynamicgrid.DynamicGridView;

public class Geralpedidos extends AppCompatActivity {
    private DynamicGridView gv;
    private Comanda cd = new Comanda();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geralpedidos);
        gv.setAdapter(new DynamicAdapter(this, cd.referencia().getArray(), getResources().getInteger(R.integer)));

        gv.setOnDropListener(new DynamicGridView.OnDropListener()
        {
            @Override
            public void onActionDrop()
            {
                gv.stopEditMode();
            }
        });

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getAdapter().getItem(position).toString() == " ") {
                  // cd.adicionar("Cliente 2");
                    getIntent();
                    finish();
                    startActivity(getIntent());
                } else{
                    startSecondActivity();
                }

                if (parent.getAdapter().getItem(position).toString() == " ") {

                    startSecondActivity();
                    //  startActivity(getIntent());

                }
                else{
                    // startSecondActivity();
                }
            }
        });
    }
    public void startSecondActivity(){
        Intent intent = new Intent(this, Comanda.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void setGv(DynamicGridView gv) {
        this.gv = gv;
    }
}

