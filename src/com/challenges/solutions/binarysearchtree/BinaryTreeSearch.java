package com.challenges.solutions.binarysearchtree;

import java.util.List;

public class BinaryTreeSearch {
    BinaryTree tree;

    public List<Integer> makeTree(List<Integer> vals) {
        tree = new BinaryTree();
        for (int i = 0; i < vals.size(); i++) {
            tree.addNode(vals.get(i));
            System.out.printf("Value %s is being added\n",vals.get(i));
        }
        return vals;
    }

    public List<Integer> isPresent(List<Integer> vals) {
        for (int i = 0; i < vals.size(); i++) {
            int currentVal = vals.get(i);
            if(tree.searchNode(tree.getRoot(),currentVal)!=null){
                System.out.printf("Value %s is present\n",currentVal);
            } else {
                System.out.printf("Value %s is not present\n",currentVal);
            }
        }
        return vals;
    }
    public String showTree() {
        System.out.println(tree);
        return tree.toString();
    }

}
