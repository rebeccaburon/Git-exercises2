package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Mateen er noob");

        buzzFizz();
      
        System.out.println();
      
        printNumbers(5, 20);
    }
    public static void buzzFizz(){
        for (int i = 1 ; i <= 200 ; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("BuzzFizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void printNumbers(int start, int end){
        for (int i = start ; i <= end; i++){
            System.out.println(i);
        }
    }
}