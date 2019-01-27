package ArraySort;

import java.util.Arrays;

public class MyStack {


    //  Class: MyStack + Tests
    //  int top;  //index of the last element;
    //  int[] elements;
    // int size - > size of the elements array;
    //  Constructor() - // will initialize needed fields
    // metode toString() -> prints the stack return Arrays.toString(elements)
    // > push() = adds element to stack
    //   pop() remeoves element from stack
    //   peek - displays the element from the top

   private int top;
   private int size;
   private final int[] elements;

    public MyStack(int size) {
        this.top = -1;
        this.size = size;
        this.elements = new int[size];
    }


    @Override
    public String toString() {

        return Arrays.toString(elements);
    }

      public int push(int elementToAdd){
        elements[top + 1] = elementToAdd;
        top ++;
     // for (int i = 0;i < size;i++){
       //   elements [top + 1]= elementToAdd;

        return elementToAdd;


       }

       public int pop(){
        int elementRemoved = elements[top];
        elements[top] = 0;
        top--;
           System.out.println("Element removed = " + elementRemoved);
        return elementRemoved;

       }

       public int peek(){

        int topOfStack = elements[top];
           System.out.println("Top of stack = " + topOfStack);
        return topOfStack;
       }



    }


