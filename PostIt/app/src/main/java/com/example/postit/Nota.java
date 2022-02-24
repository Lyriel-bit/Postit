package com.example.postit;

public class Nota {

    String title;
    String nota;

    public Nota(String title, String nota) {
        this.title = title;
        this.nota = nota;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
