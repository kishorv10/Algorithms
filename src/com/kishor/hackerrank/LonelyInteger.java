package com.kishor.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LonelyInteger {
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
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = lonelyinteger(_a);
        System.out.println(res);
        
    }
}
