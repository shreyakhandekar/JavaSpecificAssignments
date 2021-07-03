package javaspecific;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstring {
    public String getSubstring(String str1){
        Map<Character, Integer> map = new HashMap<>();
        String str2 = "";
        for (int start =0, end =0;end<str1.length();end++){
            char char1 = str1.charAt(end);
            if (map.containsKey(char1)){
                start = Math.max(map.get(char1)+1,start);
            }
            if (str2.length()<end-start+1){
                str2 = str1.substring(start,end+1);
            }
            map.put(char1,end);
        }
        return str2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str1 = sc.nextLine();
        LongestSubstring longStr = new LongestSubstring();
        System.out.println("Longest substring from given string: "+longStr.getSubstring(str1));
        System.out.println("Length of substring: "+longStr.getSubstring(str1).length());
    }
}
