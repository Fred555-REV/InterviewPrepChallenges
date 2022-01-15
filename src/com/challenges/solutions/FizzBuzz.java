package com.challenges.solutions;

public class FizzBuzz {
    //mult of 3 ret Fizz
    //mult of 5 ret Buzz
    //mult of both 3 and 5 ret FizzBuzz
    //mult of none ret value
    //FOR each value from 1-n ascending order seperated by newline
    public static String solution(int n) {
            StringBuilder output= new StringBuilder();
        for (int i = 1;i<n;i++) {
            StringBuilder stringBuilder = new StringBuilder();
            if(i%3==0){
                stringBuilder.append("Fizz");
            }
            if(i%5==0) {
                stringBuilder.append("Buzz");
            }
            if(stringBuilder.length()<3) {
                stringBuilder.append(i);
            }
            output.append(stringBuilder).append("\n");
        }
        System.out.println(output.toString());
        return output.toString();
    }
}
