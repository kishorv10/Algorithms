package com.kishor.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static int lonelyinteger(int[] a) {
        int max = a[0];
        int n = a.length;
        for(int i=1;i<n;i++) {
            if(max < a[i]) {
                max = a[i];
            }
        }
        
        int[] b = new int[max+1];
    
        for(int i=0;i<n;i++) {
            b[a[i]]++;
        }
        
        for(int i=0;i<max+1;i++) {
            if(b[i] == 1) {
                return i;
            }
        }
        return -1;    
    }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        Integer a = Integer.parseInt(in.nextLine());
        String s = Integer.toBinaryString(a);
        int padLenght = 32 - s.length();
        for(int i=0;i<padLenght;i++) {
        	s = "0" + s;
        }
        System.out.println(s);
        s = s.replace('1', '2');
        s = s.replace('0', '1');
        s = s.replace('2', '0');
        System.out.println(s);
        System.out.println(Integer.parseInt(s, 2));
               
    }
}
