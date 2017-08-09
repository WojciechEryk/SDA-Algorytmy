package Struktury;


import Alghoritms.WlasnaLista;

public class WlasnaListaFunkcje{

    int counter;
    Element head;

    public Element dajOstatni(WlasnaLista list){
        Element p = new Element();
        p = head;
        while(p.next!=null){
            p = p.next;
        }
        return p;
    }

    public void dodajNaPoczatku(int newElement, WlasnaLista list){
        Element p = new Element();
        p.data = newElement;

        p.next = head;
        head = p;
        counter++;
    }

    public void dodajNaKoncu(int newElement, WlasnaLista list){
        Element h = dajOstatni(list);
        Element p = new Element();

        h.next = p;
        p.data = newElement;
        p.next = null;

        counter++;
    }

}

