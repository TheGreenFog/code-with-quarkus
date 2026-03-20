package org.acme;

public class Task {
    private long id;
    private String titolo;
    private boolean completata;

    public Task() {
    }

    public Task(long id, String titolo, boolean completata) {
        this.id = id;
        this.titolo = titolo;   
        this.completata = completata;
    }

    public long getId() {
        return id;
    }  

    public void setId(long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }               

    public boolean isCompletata() {
        return completata;
    }   

    public void setCompletata(boolean completata) {
        this.completata = completata;
    }   

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", completata=" + completata +
                '}';
    }
}
                    

            