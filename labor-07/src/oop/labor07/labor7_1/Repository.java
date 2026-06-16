package oop.labor07.labor7_1;

import java.util.ArrayList;

public class Repository {
    ArrayList<Dokumentum> documents=new ArrayList<>();

    public void newDocument(Dokumentum doc){
        documents.add(doc);
    }
    public void deleteById(int id) {
        for (int i = 0; i < documents.size(); i++) {
            if (documents.get(i).getAzonosito() == id) {
                documents.remove(i);
                return;
            }
        }
    }
    public ArrayList<Dokumentum> searchByName(String name){
        ArrayList<Dokumentum> d = new ArrayList<>();
        for (Dokumentum dokumentum:documents) {
            if(dokumentum.getNev().equals(name))
                d.add(dokumentum);
        }
        return d;
    }
    public Dokumentum searchById(int id){
        for (Dokumentum document : documents) {
            if (document.getAzonosito() == id) return document;
        }
        return null;
    }
    public int isEmptyDb(){
        int db=0;
        for(Dokumentum d:documents){
            if(d.getTartalom().isEmpty()) db++;
        }
        return db;
    }
}
