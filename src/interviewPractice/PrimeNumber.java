package interviewPractice;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter a number to check whether it is prime or not :");
        int num = sc.nextInt();
        PrimeNumber pn = new PrimeNumber();
        pn.isPrime(num);
    }

    public void isPrime(int num){
        boolean prime = true;
        if (num > 1){
            for (int i = 2; i < num ; i++) {
                if (num%i ==0){
                    prime = false;
                    break;
                }
            }
        }

        if (prime){
            System.out.println(num+" is a prime number");
        }
        else {
            System.out.println(num+" is not a prime number");
        }
    }
}
