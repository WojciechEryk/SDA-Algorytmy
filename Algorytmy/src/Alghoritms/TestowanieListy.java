package Alghoritms;


import Struktury.mList;

public class TestowanieListy extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {
        mList lista = new mList();
        lista.addElementAtBeginning(14, lista);
        lista.addElementAtBeginning(25, lista);
        lista.addElementBefore(45, 14, lista);
        lista.printAllElements(lista);

    }
}
