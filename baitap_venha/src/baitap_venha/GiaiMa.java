package baitap_venha;

import java.util.Scanner;

public class GiaiMa {
public static int giaiMa(int n) {
    int sum=0,i=0;
 	while(n!=0) {
 		int x=n%10;
 		if(i==0) {
 			x*=100;
 			sum+=x;
 		}else if(i==1) {
 			x*=1000;
 			sum+=x;
 		}else if(i==2) {
 			sum+=x;
 		}else {
 			x*=10;
 			sum+=x;
 		}
 		
 		i++;
 		n/=10;
 	}
 	
 
//   System.out.println("\nsum="+sum);  
	int sum2=0;
	 i=0;//1234
	int z=0;
	if(sum==0)
		sum2=3333;
	while(sum!=0) {
		int x=sum%10;
		 if(x==0)
			 z=3;
		 else
			 z=((x*10+x)-7)%10;//giai ma
  	if(i==0) {
			sum2+=z;
		}else if(i==1) {
			z*=10;
			sum2+=z;
		}else if(i==2) {
			z*=100;
			sum2+=z;
		}else {
			z*=1000;
			sum2+=z;      
  }
  	i++;
  	sum/=10;
  }
  	return sum2;
}
	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    System.out.print("Nhap so can giai ma:");  
	    int n=scanner.nextInt(); 
	    System.out.println("Ma goc:"+giaiMa(n));  

	}

}
