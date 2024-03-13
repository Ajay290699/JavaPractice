package interviewPractice;

public class Finonacci {

    public static void main(String[] args) {
        Finonacci fibo = new Finonacci();
        fibo.printFibonacci(10);
    }

    public void printFibonacci(int count){
        int a=0, b=1,c=1;
        System.out.print(a+","+b);
        for (int i = 2; i <= count ; i++) {
            c = a+b;
            System.out.print(","+c);
            a=b;
            b=c;
        }
    }
    
//    public void printFiboWithRecursion(int count){
//        int a=0, b=1,c;
//        System.out.print(a+","+b);
//        for (int i = 0; i < ; i++) {
//
//        }
//    }
}
