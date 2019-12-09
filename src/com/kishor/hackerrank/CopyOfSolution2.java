package com.kishor.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// The part of the program involving reading from STDIN and writing to STDOUT has been provided by us.

public class CopyOfSolution2 {
   static BufferedReader in = new BufferedReader(new InputStreamReader(
         System.in));
   static StringBuilder out = new StringBuilder();

   public static void main(String[] args) throws NumberFormatException, IOException {
      int numPackets = Integer.parseInt(in.readLine());
      int numKids = Integer.parseInt(in.readLine());
      int[] packets = new int[numPackets];
      
      for(int i = 0; i < numPackets; i ++)
      {
         packets[i] = Integer.parseInt(in.readLine());
      }
      
      int unfairness = Integer.MAX_VALUE;
      boolean swapped = false;
      do {
          swapped = false;
          for(int i=0;i<numPackets-1;i++) {
              if(packets[i] > packets[i+1]) {
                  int temp = packets[i];
                  packets[i] = packets[i+1];
                  packets[i+1] = temp;
                  swapped = true;
              }
          }
      } while (swapped);
          
      for(int i=numKids-1;i<numPackets;i++) {
          int diff = packets[i] - packets[i-numKids-1];
          if(diff < unfairness) {
              diff = unfairness;
          }
      }
      
      System.out.println(unfairness);
   }
}
