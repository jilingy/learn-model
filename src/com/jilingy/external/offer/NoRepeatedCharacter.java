package com.jilingy.external.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: YangJiling
 * @Description: 70：无重复字符的最长子串
 * @date: 2022-07-14
 */
public class NoRepeatedCharacter {
    public int lengthOfLongestSubstring(String s) {

        int length = s.length();
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();

        // 左指针
        int left = 0 ;
        for (int right = 0; right < length; right++) {
            if (map.containsKey(s.charAt(right))) {
                // 如果map中包含当前字符，left指针滑动到含有当前字符的下一个位置
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            map.put(s.charAt(right), right);
            // 最大长度为右指针减去左指针加1（加这个1，因为上面加了1，此时这个长度肯定也要加1）
            maxLength = Math.max(right-left+1, maxLength);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        NoRepeatedCharacter noRepeatedCharacter = new NoRepeatedCharacter();
        System.out.println("无重复字符的最长子串" + noRepeatedCharacter.lengthOfLongestSubstring("abcabcbb"));
    }
}
