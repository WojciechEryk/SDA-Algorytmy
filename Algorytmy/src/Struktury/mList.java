package Struktury;


public class mList {
    Element _head;
    Element _tail;
    int counter;

    public void goThroughListForward(mList list){
        Element p = list._head;

        while (p.next !=null){
            //wykonujemy jakas logike;
            p=p.next;
        }
    }

    public void goThroughListPrev(mList list){
        Element p = list._tail;

        while (p.prev !=null){
            p=p.prev;
        }
    }

}
