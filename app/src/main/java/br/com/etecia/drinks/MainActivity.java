package br.com.etecia.drinks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView idLista;

    String nome[] = {"Coca-Cola", "Fanta Laranja", "Fanta Uva", "Pepsi", "Guaraná Antartica", "Dolly"};
    String descricao[] = {"Uma saborosa bebida sabor original",
            "Uma saborosa bebida sabor laranja",
            "Uma saborosa bebida sabor uva",
            "Uma saborosa bebida sabor original",
            "Uma saborosa bebida sabor guaraná",
            "Uma saborosa bebida sabor guaraná"};
    String rating[] = {"4.8", "4.5", "4.6", "4.4", "5", "4"};
    int bebidas[] = {R.drawable.coca6, R.drawable.fantal, R.drawable.fantau, R.drawable.pepsi, R.drawable.guarana, R.drawable.dolly};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idLista = findViewById(R.id.idLista);

        MyAdapter adapter = new MyAdapter();
        idLista.setAdapter(adapter);
    }

    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            ImageView imgBeb;
            TextView nomebeb, descrbeb, ratingbeb;

            View v = getLayoutInflater().inflate(R.layout.modelo_bebida, null);

            imgBeb = v.findViewById(R.id.idimagembeb);
            nomebeb = v.findViewById(R.id.idnomebeb);
            descrbeb = v.findViewById(R.id.iddescrbeb);
            ratingbeb = v.findViewById(R.id.idratingbeb);

            nomebeb.setText(nome[i]);
            descrbeb.setText(descricao[i]);
            ratingbeb.setText(rating[i]);
            imgBeb.setImageResource(bebidas[i]);

            return v;
        }




    }

}