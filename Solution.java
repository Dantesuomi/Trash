import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    //Given an integer n, return a string array answer (1-indexed) where:
    //answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    //answer[i] == "Fizz" if i is divisible by 3.
    //answer[i] == "Buzz" if i is divisible by 5.
    //answer[i] == i (as a string) if none of the above conditions are true.

    public List<String> fizzBuzz(int n) {

        List<String> answer = new ArrayList<String>();

        answer.add("FizzBuzz");
        answer.add("Fizz");
        answer.add("Buzz");

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(answer[i])
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        List<String> fizzBuzz = solution.fizzBuzz(10);

    }
}
