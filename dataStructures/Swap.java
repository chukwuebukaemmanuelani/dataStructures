package dataStructures;
public class Swap {
    public static void main(String[] args) {
        int number = 78;
        int anotherNumber = 32;
        int swappedNumber; //temp

        swappedNumber = number;
        number = anotherNumber;
        anotherNumber = swappedNumber;

        System.out.println("number = " + number);
        System.out.println("anotherNumber = " + anotherNumber);
    }
}
