package dataStructures;

public class Stack {
    int size;
    int top;
    int[] array;

    Stack(int capacity) { // constructor
        top = -1;
        size = capacity;
        array = new int[size];
    }

    boolean isFull() {
        return (top == size - 1); // if true stack is full
    }

    boolean isEmpty() {
        return (top == -1); // if true stack is empty
    }

    void push(int item) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            array[top + 1] = item;
            top++;
        }
    }

    int pop() {
        int previousTop = top;
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            top--;
        }
        return array[previousTop];
    }

    // write a method to print the elements in the array
    void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack Elements: ");
            for (int i = 0; i < top; i++) {
                System.out.println(array[i] + " ");
            }
        }
    }

}
