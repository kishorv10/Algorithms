package com.kishor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		PrintWriter out = new PrintWriter (System.out);
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++)
		{
			StringTokenizer st = new StringTokenizer (br.readLine());
			String x = st.nextToken();
			int l = x.length(), count = 0;
			
			for(int j = 0; j < l; j++)
			{
				char e = x.charAt(j);
				if (e == '#')
					count++;
			}
			
			if (count - 2 < 1)
			{
				out.println("0");
				continue;
			}
			
			int [] eachsection = new int [count + 1];
			int [] forward = new int [count + 1];
			int [] backward = new int [count + 1];
			
			int [] letter = new int [26];
			int max = 0, k1 = 0;
			for(int j = 0; j < l; j++)
			{
				char e = x.charAt(j);
				if (e == '#')
				{
					Arrays.fill(letter, 0);
					eachsection[k1++] = max;
					max = 0;
				}
				else
				{
					letter[(int) e - 97]++;
					max = Math.max(max, letter[(int) e - 97]);
				}
			}
			if(x.charAt(l - 1) != '#')
				eachsection[k1++] = max;
			
			Arrays.fill(letter, 0);
			int k2 = 0;
			max = 0;
			for(int j = 0; j < l; j++)
			{
				char e = x.charAt(j);
				if (e == '#')
				{
					forward[k2++] = max;
				}
				else
				{
					letter[(int) e - 97]++;
					max = Math.max(max, letter[(int) e - 97]);
				}
			}
			if(x.charAt(l - 1) != '#')
				forward[k2++] = max;
			
			Arrays.fill(letter, 0);
			int k3 = count;
			max = 0;
			for(int j = l - 1; j >= 0; j--)
			{
				char e = x.charAt(j);
				if (e == '#')
				{
					backward[k3--] = max;
				}
				else
				{
					letter[(int) e - 97]++;
					max = Math.max(max, letter[(int) e - 97]);
				}
			}
			if(x.charAt(0) != '#')
				backward[k3--] = max;
			
			int maxlength = 0;
			for(int j = 0; j < count - 2; j++)
			{
				int add = 0;
				if (forward[j] == 0 || eachsection[j + 1] == 0 || eachsection[j + 2] == 0 || backward[j + 3] == 0)
					add = 0;
				else
					add = forward[j] + eachsection[j + 1] + eachsection[j + 2] + backward[j + 3];
				maxlength = Math.max(maxlength, add);
			}
			
			out.println(maxlength < 4 ? "0" : maxlength + 3);
 		}
		out.close();
	}
} 