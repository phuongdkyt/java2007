package baitap_venha;

import java.util.Scanner;

public class HamMu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scanner =new Scanner(System.in);
	    System.out.print("n=");
	      int n=scanner.nextInt();
	      double sum=1;
	      int i=0,giaiThua=1;
	      while(i<n) {
	    	  ++i;
	    	  double x=Math.pow(n,i);
	    	  System.out.println("x= "+x);
	    	  giaiThua*=i;
	    	  double temp=x/giaiThua;
	    	  sum+=temp;
	      }
	      System.out.println("e= "+sum);
	}

}
