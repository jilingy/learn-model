package com.jilingy.external.offer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: YangJiling
 * @Description: 22-括号生成
 * @date: 2022-07-20
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder();
        int length = n * 2;
        for (int i = 0; i < length; i++) {
            stringBuilder.append("0");
        }
        String left = "(";
        String right = ")";
        String subResult = left + right;
        result.add(subResult);
        if (n == 1) return result;

        HashMap<Integer, List<String>> resultMap = new HashMap<>();
        resultMap.put(0, result);
        for (int subN = 1; subN < n; subN++) {
            List<String> currentList = new ArrayList<>();
            List<String> previousStrings = resultMap.get(subN-1);
            // 前一个答案的每一个字符串加上括号
            previousStrings.forEach(x -> {
                StringBuilder xBuilder = new StringBuilder(x);
                int subLength = xBuilder.length();
                for (int i = 0; i < subLength; i++) {
                    StringBuilder xString = new StringBuilder(x);
                    String substring = xString.substring(0, i);
                    substring += left;
                    substring += xString.substring(i, xString.length());
                    for (int i1 = i+1; i1 <= substring.length(); i1++) {
                        String rightSubstring = substring.substring(0, i1);
                        rightSubstring += right;
                        rightSubstring += substring.substring(i1);
                        if (!currentList.contains(rightSubstring)) {
                            currentList.add(rightSubstring);
                        }
                    }
                }
            });
            resultMap.put(subN, currentList);
        }
        return resultMap.get(n-1);
    }

    public static void main(String[] args) {
        List<String> result = new GenerateParenthesis().generateParenthesis(3);
        System.out.println("结果：" + result);
    }
}
