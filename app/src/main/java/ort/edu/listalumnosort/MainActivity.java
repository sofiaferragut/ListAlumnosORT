package ort.edu.listalumnosort;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createListView();
    }

    private void createListView() {
        listView= (ListView) findViewById(R.id.idListView);
        Adaptador adaptador = new Adaptador(this, getArrayItems());
        listView.setAdapter(adaptador);
    }

    private ArrayList<ItemLista> getArrayItems() {
            return XmlParser.parsearAlumnos(this);

    }

}
