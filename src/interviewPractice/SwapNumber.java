package interviewPractice;

public class SwapNumber {

    public static void main(String[] args) {
        SwapNumber swapNumber  = new SwapNumber();
        swapNumber.withoutTemp(1,2);
        swapNumber.withTemp(4,5);
  }

    public void withoutTemp(int a, int b){
        System.out.println(a+","+b);
        a = a +b;
        b = a - b;
        a = a-b;
        System.out.println(a+","+b);
    }

    public void withTemp(int a, int b){
        System.out.println(a+","+b);
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a+","+b);
    }
}
