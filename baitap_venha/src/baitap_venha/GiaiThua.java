package baitap_venha;

import java.util.Scanner;

public class GiaiThua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner =new Scanner(System.in);
      System.out.print("n=");
      int n=scanner.nextInt();
      int i=0;
      int giaiThua=1;
      if(n>=0) {
      while(i<n) {
    	  ++i;
    	  giaiThua*=i;
    	  
      }
      System.out.println(n+"!= "+giaiThua);
	}else
		System.out.println("n must be a positive integer!!");
	}
	 
		
}
