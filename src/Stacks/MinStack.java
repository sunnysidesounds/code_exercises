package Stacks;

import java.util.Stack;

public class MinStack {

    Stack<Integer> elements = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();


    public void push(int x) {
        elements.push(x);
        if(min.empty() || x <= min.peek()){
            min.push(x);
        }
    }

    public void pop() {
        if(elements == null){
            return;
        }
        if(elements.peek().equals(min.peek())){
            min.pop();
        }
        elements.pop();
    }

    public int top() {
        return elements.peek();

    }

    public int getMin() {
        return min.peek();
    }


}
