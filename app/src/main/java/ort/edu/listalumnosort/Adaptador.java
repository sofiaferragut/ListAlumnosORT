package ort.edu.listalumnosort;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

class Adaptador extends BaseAdapter {
    private ArrayList<ItemLista> list;
    private Context context;

    public Adaptador(Context context, ArrayList<ItemLista> arrayItems) {
        this.context=context;
        this.list=arrayItems;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(context).inflate(R.layout.item_list,null);
        ImageView foto= (ImageView) view.findViewById(R.id.imageFoto);
        TextView nombre= (TextView) view.findViewById(R.id.nombre);
        TextView grupo = (TextView) view.findViewById(R.id.grupo);
        ItemLista item= (ItemLista) getItem(i);
        foto.setImageResource(item.getImageFoto());
        nombre.setText(item.getTitulo());
        grupo.setText(item.getGrupo());
        return view;
    }
}
