package ort.edu.listalumnosort;

import android.content.Context;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XmlParser {

    public static ArrayList<ItemLista> parsearAlumnos(Context context){
        try {
           // File archivo = R.raw.alumnos;
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document document = builder.parse(context.getResources().openRawResource(R.raw.alumnos));
            document.getDocumentElement().normalize();

            NodeList alumnos = document.getElementsByTagName("alumno");
            ArrayList<ItemLista> lista = new ArrayList<>();
            String nombre="";
            String grupo="";
            String foto ="";
            for (int i = 0; i < alumnos.getLength(); i++) {
                Node nodo = alumnos.item(i);


                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nodo;
                    nombre=element.getElementsByTagName("nombre").item(0).getTextContent();
                    grupo = element.getElementsByTagName("grupo").item(0).getTextContent();
                    foto = element.getElementsByTagName("foto").item(0).getTextContent();


                    lista.add(new ItemLista(getImagePath(foto,context),nombre, grupo));
                }
            }
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    private static int getImagePath(String foto, Context context){
        return context.getResources().getIdentifier(foto,"drawable",context.getPackageName());
    }
    }

