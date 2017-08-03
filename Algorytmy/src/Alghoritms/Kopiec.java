package Alghoritms;


public class Kopiec {

    int _counter;
    int _data [];

    public Kopiec(int size) {

        _data = new int [size];
        _counter =0;
    }

    public void addNewElement(int newElement){

        int i = _counter;
        i = _counter++;
        int parent = Math.floorDiv(i-1,2);

        while (i>0 && _data[parent] < newElement){

            _data[i]=_data[parent];
            i = parent;
            parent=(i-1)/2;
        }
        _data[i] = newElement;

    }

}
