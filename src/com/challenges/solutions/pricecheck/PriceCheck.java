package com.challenges.solutions.pricecheck;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PriceCheck {
    public static int priceCheck(List<String> products, List<Double> productPrices, List<String> productsSold, List<Double> soldPrice) {
        int errorAmount = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < products.size(); i++) {
            boolean isProductSold = false;
            String product = products.get(i);
            Double productprice = productPrices.get(i);
            Double priceSold = 0d;
            for (int j = 0; j < productsSold.size(); j++) {
                String productSold = productsSold.get(j);

                if (product.equals(productSold)) {
                    isProductSold = true;
                    priceSold = soldPrice.get(j);
                }
            }
            if (!isProductSold) {
                continue;
            }
            if (!productprice.equals(priceSold)) {
//                if (!map.containsKey(i)) {
//                    map.put(i, 1);
//                } else {
//                    int count = map.get(i);
//                    count++;
//                    map.put(i, count);
//                }
                errorAmount++;
            }
        }
        System.out.println(errorAmount);
        return errorAmount;
//        StringBuilder output = new StringBuilder();
//        output.append("Product\tPriceActual\tPriceSold\tErrors\n");
//        for (int i : map.keySet()) {
//            String product = products.get(i);
//            Float productprice = productPrices.get(i);
//            Float priceSold = soldPrice.get(i);
//            output.append(String.format("%s, %s, %s, %s\n", product, productprice, priceSold, map.get(i)));
//        }
        //I thought the explanation was the output oops
//        System.out.println(output);
//        return output.toString();

    }
}
