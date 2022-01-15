package com.challenges.solutions;

public class LastandSecondLast {
    //apple expected = "E L"
    public static String solution(String str){
        int strLength = str.length();
        String output = str.charAt(str.length()-1)+" "+str.charAt(str.length()-2);
        System.out.println(output);
        return output;
    }
}
