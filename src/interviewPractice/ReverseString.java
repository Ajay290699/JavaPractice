package interviewPractice;

public class ReverseString {

    public static void main(String[] args) {
        String input = "ajay";
        String reverse = "";
        for (int i = input.length() -1; i >=0 ; i--) {
            reverse += input.charAt(i);
        }

        System.out.println(reverse);

    }

}