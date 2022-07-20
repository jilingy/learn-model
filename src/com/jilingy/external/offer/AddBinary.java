package com.jilingy.external.offer;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @author: YangJiling
 * @Description: 67.二进制求和
 * @date: 2022-07-19
 */
public class AddBinary {
    public String x(String a, String b) {
        String aReversed = new StringBuilder(a).reverse().toString();
        String bReversed = new StringBuilder(b).reverse().toString();
        String longStr = aReversed.length() >= bReversed.length() ? aReversed : bReversed;
        String shortStr = aReversed.length() >= bReversed.length() ? bReversed : aReversed;
        String str = "";
        for (int i = 0; i < shortStr.length(); i++) {
            if (aReversed.charAt(i) == '1' && bReversed.charAt(i) == '1') {
                str += "2";
            } else if (aReversed.charAt(i) == '0' && bReversed.charAt(i) == '1' || aReversed.charAt(i) == '1' && bReversed.charAt(i) == '0') {
                str += "1";
            } else {
                str += "0";
            }
        }
        str += longStr.substring(shortStr.length());


        while (str.contains("2") || str.contains("3")) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '2') {
                    StringBuilder subStr = new StringBuilder(str);
                    subStr.setCharAt(i, '0');
                    str = subStr.toString();
                    // 如果下一位存在
                    if ((i + 1) < str.length()) {
                        StringBuilder nextStr = new StringBuilder(str);
                        nextStr.setCharAt(i + 1, (char) ((int) nextStr.charAt(i + 1) + 1));
                        str = nextStr.toString();
                    } else {
                        // 如果下一位不存在
                        StringBuilder lastStr = new StringBuilder(str);
                        lastStr.append('1');
                        str = lastStr.toString();
                    }
                }
                if (str.charAt(i) == '3') {
                    StringBuilder subStr = new StringBuilder(str);
                    subStr.setCharAt(i, '1');
                    str = subStr.toString();
                    // 如果下一位存在
                    if ((i + 1) < str.length()) {
                        StringBuilder nextStr = new StringBuilder(str);
                        nextStr.setCharAt(i + 1, (char) ((int) nextStr.charAt(i + 1) + 1));
                        str = nextStr.toString();
                    } else {
                        // 如果下一位不存在
                        StringBuilder lastStr = new StringBuilder(str);
                        lastStr.append('1');
                        str = lastStr.toString();
                    }
                }
            }
        }
        StringBuilder reversedString = new StringBuilder(str);
        return reversedString.reverse().toString();
    }


    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int m = a.length() - 1, n = b.length() - 1;
        int carry = 0;
        while(m >= 0 || n >= 0){ // 从最低位开始，只要位数较多的那个数还未运算完毕就继续
            int ai = m >= 0 ? a.charAt(m) - '0' : 0;
            int bi = n >= 0 ? b.charAt(n) - '0' : 0;
            m--; n--;
            int cur = (ai + bi + carry) % 2; // 当前位
            carry = (ai + bi + carry) / 2; // 进位
            sb.append(cur);
        }
        if(carry == 1) sb.append(carry); // 最高位仍有进位时
        return sb.reverse().toString(); // 翻转
    }

    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        String x = addBinary.addBinary("101", "1");
        System.out.println("结果，" + x);
    }
}
