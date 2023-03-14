package com.galvanize;

public class ArrayIntList {
    // What fields do we need
    private int[] elementData;
    private int size;

    //Constructor
    public ArrayIntList(){
        this.elementData = new int[100];
        this.size = 0;
    }

    //add a value to the end of the list
    public void add(int value){
        this.elementData[size] = value;
        size++;
    }

    // implement toString
    public String toString(){
        if (size == 0) return "[]";
        else{
            String result = "[";
            for(int i = 0; i< size; i++){
                if (i<size -1)result += elementData[i] + ", ";
                else result += elementData[i];
            }
            return result + "]";
        }
    }

    /*
    * ArrayIntList list = new ArrayIntList();
    * list.add(2);
    * list.add(4);
    * list.add(6);
    *
    * //client mental model of list is [2,4,6]
    *                                      0 1 2 3, 3 represents start of invalid data
    * //internal model of elementData is: [2,4,6,0,0,0,0,0,0,x,x,x]
    * */
}