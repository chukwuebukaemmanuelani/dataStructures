package dataStructures;

public class Main {
    public static void main(String[] args) {
        Stack stack1 = new Stack(10);
        
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(7);
        stack1.pop();
        stack1.pop();
        stack1.pop();

        stack1.printStack();
    }
    
    
}
