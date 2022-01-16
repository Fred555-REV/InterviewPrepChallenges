package com.challenges.solutions.connectedgroups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConnectedGroups {
    //relationships are in matrixes                                                  01001
    //direct relationships are shown in indexes example      person 1 and matrix     11000
    //                                                      person 1 has direct relationship with persons 0 and 1
    //inderect is when person has a direct relationship with a person that has a direct relationship with someone else

    public static int countGroups(List<String> related) {
        //can't come in as an int because java ignores leading 0s
        // returns the number of groups of people
        //groups are composed of people that know each other directly or inderectly
        int groupCount = 0;
        List<String> groupOfGroups = new ArrayList<>();
        groupOfGroups.add("0");
        System.out.println("Starting");
        for (int i = 0; i < related.size(); i++) {
//            System.out.println("1");
            String line = related.get(i);
            boolean isGroupFound = false;
            for (int j = 0; j < line.length(); j++) {
                String rel = String.valueOf(line.charAt(j));
//                System.out.println("2");
                if (rel.equals("0") || j == i) {
                    continue;
                }
                if (rel.equals("1")) {
                    for (int k = 0; k < groupOfGroups.size(); k++) {
                        String group = groupOfGroups.get(k);
//                        System.out.println(group);

                        for (int l = 0; l < group.length(); l++) {
                            String person = String.valueOf(group.charAt(l));
                            if (person.equals(String.valueOf(j)) || person.equals(String.valueOf(i))) {
                                isGroupFound = true;

                                groupOfGroups.set(k,group.concat(String.valueOf(j)));
                                break;
                            }
                        }
                    }
//        System.out.println("5");
                }
            }
            if (isGroupFound == false) {
                groupOfGroups.add(String.valueOf(i));
            }
        }
        System.out.println(groupOfGroups.size());
//        System.out.println(groupOfGroups);
        return groupOfGroups.size();

    }

}
