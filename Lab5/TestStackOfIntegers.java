<<<<<<< HEAD
//package Lab5;
=======

>>>>>>> 15027dae4fe64d3d3b727c7a0a28969d98390638

public class TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        
        for (int i = 0; i < 10; i++)
          stack.push(i); // Push i to the stack
        
        while (!stack.empty()) // Test if stack is empty
          System.out.print(stack.pop() + " "); // Remove and return from stack
      }
}
