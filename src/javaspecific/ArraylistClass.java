package javaspecific;

import java.util.Arrays;
import java.util.Scanner;

public class ArraylistClass {
    private Object[] myStore;
    private int size = 0;

    public ArraylistClass(){
        myStore = new Object[10];
    }
    public Object get(int index){
        if (index<size){
            return myStore[index];
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void add(Object obj){
        if (myStore.length-size <= 5){
            increaseListSize();
        }
        myStore[size++] = obj;
    }

    public Object remove(int index){
        if (index<size){
            Object obj = myStore[index];
            myStore[index] = null;
            int temp = index;
            while (temp<size){
                myStore[temp] = myStore[temp+1];
                myStore[temp+1] = null;
                temp++;
            }
            size--;
            return obj;
        }else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int sizeoflist(){
        return size;
    }

    private void increaseListSize(){
        myStore = Arrays.copyOf(myStore,myStore.length*2);
        System.out.println("\nNew Length: "+myStore.length);
    }

    public static void main(String[] args){
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        ArraylistClass list = new ArraylistClass();
        int len  = sc.nextInt();
        for(;;) {
            System.out.println("\nBelow are the lists of operations: ");
            System.out.println("1. Add\n2.Display\n3.Remove\n4.Displaying element at specific location\n5.Exit\nSelect number to perform operation on arraylist: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Enter the elements: ");
                    for (int i = 0; i < len; i++) {
                        list.add(sc.nextInt());
                    }
                    break;
                case 2:
                    try{
                    System.out.println("Displaying arraylist: ");
                    for (int i = 0; i < len; i++) {
                        System.out.print(list.get(i) + " ");
                    }}catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Enter index number to remove element: ");
                    int removeIndex = sc.nextInt();
                    System.out.println("Removed element at " + removeIndex + " :" + list.remove(removeIndex));
                    break;
                case 4:
                    System.out.println("Enter index number to see element: ");
                    int displayIndex = sc.nextInt();
                    System.out.println("Displaying element at " + displayIndex + " :" + list.get(displayIndex));
                    break;
                case 5:
                    System.out.println("Exit");
                   return;
                default:
                    break;

            }
        }
    }
}
