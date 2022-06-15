package ArrayList;


import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E>{

    public int size = 0;
    public static final int DEFAULT_CAPACITY =10;
    public Object elements[];
    public MyList(int size){};
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void add(int index, int element ){
        for (int i = 0; i < size; i++) {
            if(i==index){
                elements[i]=element;
            }
        }
    }

//    public void add(E e) {
//        if (size == elements.length) {
//            ensureCapa();
//        }
//        elements[size++] = e;
//    }
//
//    private void ensureCapa() {
//        int newSize = elements.length * 2;
//        elements = Arrays.copyOf(elements, newSize);
//    }
}
