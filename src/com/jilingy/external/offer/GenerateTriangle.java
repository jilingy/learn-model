package com.jilingy.external.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: YangJiling
 * @Description: 118. 杨辉三角
 * @date: 2022-07-18
 */
public class GenerateTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> subList = new ArrayList<>();
            if (i==0){
                subList.add(1);
                result.add(subList);
                continue;
            }
            if (i==1){
                subList.add(1);
                subList.add(1);
                result.add(subList);
                continue;
            }
            subList.add(1);
            for (int i1 = 1; i1 <= i-1; i1++) {
                int number = result.get(i - 1).get(i1-1)+result.get(i - 1).get(i1);
                subList.add(number);
            }
            subList.add(1);
            result.add(subList);
        }
        return result;
    }

    public List<List<Integer>> generate2(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i <= numRows; i++) {
            List<Integer> subList = new ArrayList<>();
            if (i==0){
                subList.add(1);
                result.add(subList);
                continue;
            }
            subList.add(1);
            for (int i1 = 1; i1 <= i-1; i1++) {
                int number = result.get(i-1).get(i1)+i1;
                subList.add(number);
            }
            subList.add(1);
            result.add(subList);
        }
        return result;
    }

    public static void main(String[] args) {
        GenerateTriangle generateTriangle = new GenerateTriangle();
        //List<List<Integer>> generate = generateTriangle.generate(5);

        List<List<Integer>> generate2 = generateTriangle.generate2(5);
        System.out.println("list:" + generate2);
    }
}
