package Struktury;


import Alghoritms.WlasnaLista;

public class WlasnaListaFunkcje{

    int counter;
    Element head;

    public void przejdzPrzezListe(WlasnaLista list){
        Element p = new Element();
        p = head;
        while(p.next!=null){
            p = p.next;
        }
    }

    public void dodajNaPoczatku(int newElement, WlasnaLista list){
        Element p = new Element();
        p.data = newElement;

        p.next = head;
        head = p;
        counter++;
    }

    public void dodajNaKoncu(int newElement, WlasnaLista list){
        Element p = new Element();
        p.data = newElement;

        p.next = null;

        counter++;
    }

}

