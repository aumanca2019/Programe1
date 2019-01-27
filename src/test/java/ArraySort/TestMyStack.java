package ArraySort;

import org.junit.Test;

public class TestMyStack {

    int[]elements = {2,5,7};

   @Test
    public void TestMyStack(){
        MyStack stack = new MyStack(5);
     //  System.out.println(stack);
     //  stack.push(7);
     //  System.out.println(stack);
      // stack.push(9);
     //  System.out.println(stack);
       System.out.println(stack.toString());

       stack.push(5);
       stack.push(9);
       stack.push(17);
       stack.push(20);
//       int actual = stack.push(5);
//       int expected = 5;
//
//       Assert.assertEquals(actual,expected);

       System.out.println(stack.toString());
      int elementToRemove =  stack.pop();
       System.out.println(stack.toString());
       int topOfStack1 = stack.peek();
       stack.push(35);
       topOfStack1 = stack.peek();




    }
    // public void TestPush(){
      //      MyStack newAdd = new MyStack(3);



     }

     // creat a class that contains a method to sort an arry using bubblesort
        // bubblesort(int[]) - int[] - cu regula celor trei pahare.






