package Struktury;


public class mList {
    Element _head;
    Element _tail;
    int counter;

    public void goThroughListForward(mList list) {
        Element p = list._head;

        while (p.next != null) {
            //wykonujemy jakas logike;
            p = p.next;
        }
    }

    public void goThroughListPrev(mList list) {
        Element p = list._tail;

        while (p.prev != null) {
            p = p.prev;
        }
    }

    public void addElementAtBeginning(int newElement, mList list) {
        Element p = new Element();
        p.data = newElement;
        p.prev = null;
        p.next = list._head;
        list._head = p;
        list.counter++;

        if (p.next != null) {
            Element nextEl = p.next;
            nextEl.prev = p;
        } else {
            list._tail = p;
        }
    }

    public void addElementAtEnd(int newElement, mList list) {
        Element p = new Element();
        p.data = newElement;
        p.next = null;
        p.prev = list._tail;
        list._tail = p;
        list.counter++;

        if (p.prev != null) {
            p.prev.next = p;
        } else {
            list._head = p;
        }
    }


    public Element getElementForward(int data, mList list) {
        Element p = list._head;

        while (p.next != null) {
            if (p.data == data) {
                break;
            }
            p = p.next;
        }
        return p;

    }    public void printAllElements(mList list) {
        Element p = list._head;

        while (p.next != null) {
            System.out.println(p.data);
            p = p.next;
        }
        System.out.println(_tail.data);
    }

    public void addElementBefore (int elementToAdd, int elementBefore, mList list){
        Element before = list.getElementForward(elementBefore,list);

        if(before == list._head){
            list.addElementAtBeginning(elementToAdd, list);
        }else{
            Element p = new Element();
            p.data = elementToAdd;
            p.prev = before.prev;
            p.next = before;
            Element prevBefore = before.prev;
            prevBefore.next = p;
            before.prev = p;
            list.counter++;
        }

    }public void addElementAfter (int elementToAdd, int elementAfter, mList list){
        Element after = list.getElementForward(elementAfter,list);

        if(after == list._tail){
            list.addElementAtEnd(elementToAdd, list);
        }else{
            Element p = new Element();
            p.data = elementToAdd;
            p.prev = after;
            p.next = after.next;
            Element nextAfter = after.next;
            nextAfter.prev = p;
            after.next= p;
            list.counter++;
        }
    }
    public void RemoveElement (int removeElement, mList list){
        list.counter --;

    }


}