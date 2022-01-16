package com.challenges.solutions.validemails;

import java.util.List;

public class ValidEmails {
    public static String validate(List<String> emails) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < emails.size(); i++) {
                int digits = 0;
            String email = emails.get(i);
//            System.out.println(email);
            for (int j = 0; j < email.length(); j++) {
                int endOfAZ = 0;
                char letter = email.charAt(j);
                if (endOfAZ == 0) {
                    if (Character.isAlphabetic(letter)) {
                        if (j > 5) {
                            output.append("False\n");
                            break;
                        }
                        continue;
                    }
                    endOfAZ = j;
                }
                if (letter == '_') {
                    if (j > 6 || digits != 0) {
                        output.append("False\n");
                        break;
                    }
                    continue;
                }
                if (Character.isDigit(letter)) {
                    digits++;
                    if (digits > 4 || j > 10) {
                        output.append("False\n");
                        break;
                    }
                    continue;
                }
                if (email.endsWith("@hackerrank.com")) {
                    output.append("True\n");
                } else {
                    output.append("False\n");
                }
                break;

            }

        }
        System.out.println(output);
        return output.toString();
    }
}
