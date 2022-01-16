package com.challenges;

import com.challenges.solutions.FizzBuzz;
import com.challenges.solutions.LastandSecondLast;
import com.challenges.solutions.binarysearchtree.BinaryTreeSearch;
import com.challenges.solutions.carinheritance.CarInheritance;
import com.challenges.solutions.connectedgroups.ConnectedGroups;
import com.challenges.solutions.pricecheck.PriceCheck;
import com.challenges.solutions.validemails.ValidEmails;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //I forgot to make a scanner for dynamic inputs in the previous challenges my bad.
        Scanner scan = new Scanner(System.in);

        scan.nextLine();
        LastandSecondLast.solution("APPLE");

        scan.nextInt();
        FizzBuzz.solution(15);

        BinaryTreeSearch search = new BinaryTreeSearch();
        int treeSize = scan.nextInt();
        List<Integer> treeList = new ArrayList<>();
        for (int i = 0; i < treeSize; i++) {
            int input = scan.nextInt();
            treeList.add(input);
        }
        int searchSize = scan.nextInt();
        for (int i = 0; i < searchSize; i++) {
            int input = scan.nextInt();
            treeList.add(input);
        }
        List<Integer> searchList = new ArrayList<>();
        search.makeTree(treeList);
        search.isPresent(searchList);
        search.showTree();

//        CountingClosedPaths.solution(630); //2
//        CountingClosedPaths.solution(1288); //4

        int carChoice = scan.nextInt();
        int mileage = scan.nextInt();
        CarInheritance.solution(carChoice,mileage);

//        ConnectedGroups This one was a difficult one for sure
        int n = scan.nextInt();
        List<String> groups = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            groups.add(input);
        }
        ConnectedGroups.countGroups(groups);

        //In the slack it has been said that this challenge needs sql so I will probably have to do that next time.
        //TODO Complete this
        //Customers Credit Limit

        //This one also needs external files/classes not given to us to work
        //TODO Complete this
        //Points and Lines

        //Valid emails
//      starts with 1 to 6 lowercase engl;ish letters denoted by the character class [a-z]
//      the lowercase letters are followed by an optional underscore,ie zero
//      or one occurence of the underscore _ character
        //the optional underscore is followed by 0 to 4 optional digits denoted by the character class [0-9]
        int k = scan.nextInt();
        List<String> emails = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            String input = scan.nextLine();
            emails.add(input);
        }
        ValidEmails.validate(emails);

        //In the slack it has been said that this challenge needs sql so I will probably have to do that next time.
        //TODO Complete this
        //SuperHero Names

        //Price Check
        List<String> products = new ArrayList<>();
        int a = scan.nextInt();
        for (int i = 0; i < a; i++) {
            String input = scan.nextLine();
            products.add(input);
        }
        List<Double> productPrices = new ArrayList<>();
        int b = scan.nextInt();
        for (int i = 0; i < b; i++) {
            Double input = scan.nextDouble();
            productPrices.add(input);
        }
        List<String> productsSold = new ArrayList<>();
        int c = scan.nextInt();
        for (int i = 0; i < c; i++) {
            String input = scan.nextLine();
            productsSold.add(input);
        }
        List<Double> priceSold = new ArrayList<>();
        int d = scan.nextInt();
        for (int i = 0; i < d; i++) {
            Double input = scan.nextDouble();
            priceSold.add(input);
        }

        PriceCheck.priceCheck(products,productPrices,productsSold,priceSold);



    }
}
//          5
//        8l
//      10l 7r