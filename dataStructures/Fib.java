package dataStructures;

public class Fib {
    public static void main(String[] args) {
        int first = 0, second = 1, next;
        System.out.println(first);
        System.out.println(second);

        for (int i = 2; i < 10; i++) {
           next = first + second;
           System.out.println(next);
           first = second;
           second = next; 
        }
    }
}
/* 
 * Algorithm
 * Create two variables n1 = 0 and n2 = 1
 * Create variable next = n1 + n2
 * Update n1 and n2 using a loop
 * 
 */