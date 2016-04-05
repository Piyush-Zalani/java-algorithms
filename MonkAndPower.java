package com.hackerEarth.StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MonkAndPower {
	    public static void main(String args[] ) throws Exception
	    {
	        
			int temp;
			Queue<Integer> q = new LinkedList<Integer>();
			
			Scanner sc = new Scanner(System.in);
			int noOfProcess = sc.nextInt();
			
			for(int i=0; i< noOfProcess; i++)
			{
			    
			    temp = sc.nextInt();
			    q.add(temp);
			    
			}
			
			int idealOrder[] = new int[noOfProcess];

	        for(int i=0; i< noOfProcess; i++)
			{
			    
			    temp = sc.nextInt();
			    idealOrder[i] = temp;
			    
			}
			int count = 0, j=0;
			
			while(!q.isEmpty())
			{
			    temp = (int) q.remove();
			    if(idealOrder[j] != temp)
			    {
			        q.add(temp);
			    }
			    else
			        j++;
			    count++;
			}
			System.out.println(count);
			sc.close();
	    }
	

}
