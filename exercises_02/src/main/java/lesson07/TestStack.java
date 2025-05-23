package lesson07;

//DEQUE INTERFACE
//It is a child interface of Collection interface like Set & List

//A collection that can be used as a stack or a queue i.e. double-ended queue

//queue provides FIFO operations e.g. add(e) & remove() methods 
//stack provides LIFO operations e.g. push(e) & pop() methods

import java.util.ArrayDeque;
import java.util.Deque;

public class TestStack {
    public static void main(String[] args){
        
         Deque<String> stack = new ArrayDeque<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
       
        int size = stack.size() - 1;
        
        while (size >= 0 ) {
            System.out.println(stack.pop()); //print the element removed from the back (LIFO)
            size--;
        }        
    }
}
