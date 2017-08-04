package Struktury;


import Alghoritms.WlasnaLista;

public class WlasnaListaFunkcje {

    WlasnaListaElement glowa;
    int counter = 0;


    public void DodajElementNaPoczatku(int newElement, WlasnaListaFunkcje list) {
        WlasnaListaElement obiekt = new WlasnaListaElement();
        obiekt.data = newElement;
        obiekt.nastepny = list.glowa;
        list.glowa = obiekt;
        list.counter++;
    }

    public WlasnaListaElement znajdzOstatniElement()
    {
        WlasnaListaElement iterator;
        iterator = glowa;
        while(iterator.nastepny != null){
            iterator=iterator.nastepny;
        }
        return iterator;
    }
    public void DodajElementNaKoncu(int newElement) {
        WlasnaListaElement obiekt = new WlasnaListaElement();
        obiekt.data = newElement;
        WlasnaListaElement ostatni = znajdzOstatniElement();
        ostatni.nastepny = obiekt;
    }

//    public void dodajElementZa(int elementPrzed, int elementPo, WlasnaListaFunkcje list) {
//        WlasnaListaElement Po;
//
//
//    }
}