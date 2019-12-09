/**
 * 
 */
package com.kishor.codechef.augchal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author KISHOR
 *
 */
public class LeakeRobot {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase_cout = Integer.parseInt(br.readLine());
		
		for(int i=0;i<testcase_cout;i++) {
			String nk = br.readLine();
			String[] coords = nk.split(" ");
			
			int x = Integer.parseInt(coords[0]);
			int y = Integer.parseInt(coords[1]);
			
			if(x == 0 && y==0) {
				System.out.println("YES");
				continue;
			} 
			
			if(x >= 0 && y >= 0) {
				if(((x%2 == 1 && y<= x+1)) || (y%2==0 && x<=y-1)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
				continue;
			}
			
			if((x <= 0 && y >= 0) || (x <= 0 && y <= 0)) {
				if(x<0) {
					x = -1* x;
				}
				if(y<0) {
					y= -1 * y;
				}
				if((x%2 == 0 && y<=x) || (y%2 ==0 && x<=y)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
				continue;
			}
			
			if(x >= 0 && y <= 0) {
				y= -1*y;
				if(((x%2 == 1 && y<= x-1)) || (y%2==0 && x<=y+1)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
				continue;
	
				
			 
			}

			
		}
	}

}
