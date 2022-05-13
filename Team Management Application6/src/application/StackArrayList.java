package application;

import java.util.ArrayList;
import java.util.List;

public class StackArrayList {
    
	//ArrayList representation of the stack
    List<Integer> stackList;

     //Constructor
   
    StackArrayList() {
        stackList = new ArrayList<>();
    }


     //Adds value to the end of list which is the top for stack
    void push(int value) {
        stackList.add(value);
    }


    //Pops last element of list which is indeed the top for Stack

     int pop() {

         if (!isEmpty()) { // checks for an empty Stack
              int popVal = stackList.get(stackList.size() - 1);
              stackList.remove(stackList.size() - 1); // removes the popped element             
              return popVal;
         } else {
              System.out.print("stack empty");
              return -1;
         }
    }


     //Checks for empty Stack

     boolean isEmpty() {
          if (stackList.isEmpty()){
               return true;
          } else {
                return false;
          }
     }
}
