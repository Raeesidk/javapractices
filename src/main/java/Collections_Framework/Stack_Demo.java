package Collections_Framework;

import java.util.Stack;

/**A stack is a linear data structure that follows the last-in-first-out (LIFO) principle. Imagine a stack of plates: You can only add or remove plates from the top.
 In programming, a stack is used for managing data in a similar way.*/
public class Stack_Demo
{
    /*Java provides a built-in Stack class in the java.util package. It models and implements a stack data structure.
Key operations:  last-in-first-out
Push: Adds an item to the top of the stack.
Pop: Removes the top item from the stack.
Peek: Views the top item without removing it.*/
    public static void main(String[] args)
    {
        Stack st = new Stack();
        st.push(10);
        st.push(25.5);
        st.push(124567587889L);
        st.push("☠️ One Piece ☠️");
        st.push("D🐉");
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
    }
}
