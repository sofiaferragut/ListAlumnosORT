package ort.edu.listalumnosort;

public class ItemLista {
    private int imageFoto;
    private String titulo;
    private  String grupo;

    public ItemLista(int imageFoto, String titulo, String grupo){
        this.imageFoto=imageFoto;
        this.titulo=titulo;
        this.grupo=grupo;
    }
    public int getImageFoto(){
        return imageFoto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGrupo() {
        return grupo;
    }
}
