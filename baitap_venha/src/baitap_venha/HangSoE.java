package baitap_venha;

import java.util.Scanner;

public class HangSoE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scanner =new Scanner(System.in);
	    System.out.print("n=");
	      int n=scanner.nextInt();
	      double sum=1;
	      int giaiThua=1,i=0;
	     if(n>=0) {
	      while(i<n) {
	    	  ++i;
	    	  giaiThua*=i;
	    	  double temp=(double)1/giaiThua;
	    	  sum+=temp;
	      }
	      System.out.println("e= "+sum);
	     }else {
	    	 System.out.println("n must be a positive integer!!");
	     }
	}

}
