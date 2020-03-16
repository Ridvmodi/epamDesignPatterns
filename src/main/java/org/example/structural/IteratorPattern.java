package org.example.structural;

import javafx.scene.input.InputMethodTextRun;

import java.util.Iterator;
abstract class OuterCompanyContainer {
    public abstract Iterator<String> getIterator();
}

class NamesDeck extends OuterCompanyContainer {

    public String namesArr[]={"A1", "A2","A3"};
    public Iterator<String> getIterator() {
        return new NamesIterator() ;
    }
    private class NamesIterator implements Iterator<String> {
        int i;
        public boolean hasNext() {
            if (i<namesArr.length){
                return true;
            }
            return false;
        }

        public String next() {
            if(this.hasNext()){
                return namesArr[i++];
            }
            return null;
        }

        @Override
        public void remove() {

        }
    }
}

public class IteratorPattern  {
    public IteratorPattern()
    {
        NamesDeck myCollection = new NamesDeck();
        Iterator<String> itr = myCollection.getIterator();
        while(itr.hasNext()) {
            String name = (String) itr.next();
            System.out.println("Name : " + name);
        }
    }
}
