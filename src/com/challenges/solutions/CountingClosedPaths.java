package com.challenges.solutions;

import java.util.List;

public class CountingClosedPaths {
    //  1 2 3 4 5 6 7 8 9 0
    //  0 4 6 9
    //  8
    public static int solution(int number) {
        int totalClosedPaths = 0;
        String numStr = Integer.toString(number);
//        String[] list = numStr.split("");
        for (int i = 0; i < numStr.length(); i++) {
            int currentNum = Integer.parseInt(Character.toString(numStr.charAt(i)));
            switch (currentNum) {
                case 0:
                case 4:
                case 6:
                case 9:
                    totalClosedPaths += 1;
                    break;
                case 8:
                    totalClosedPaths += 2;
                    break;
            }
        }
        System.out.println(totalClosedPaths);
        return totalClosedPaths;
    }
}
