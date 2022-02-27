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
    
    @NonNull
    @Override
    public String toString() {
        try{
            JSONObject json = new JSONObject();
            json.put("title",title);
            json.put("text",text);
            return json.toString();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }
}
