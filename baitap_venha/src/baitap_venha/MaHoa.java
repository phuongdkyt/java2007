package baitap_venha;

import java.util.Scanner;

public class MaHoa {
    public static int maHoa(int n){
    	int a=0,b=0,c=0,d=0,i=0;
    	while(n!=0) {
    		int x=n%10;
    		if(i==0)
    			d=x;
    		else if(i==1)
    			c=x;
    		else if(i==2)
    			b=x;
    		else if(i==3)
    			a=x;
    		n/=10;
    		i++;
    	}
    	
        a+=7;
        a%=10;
        b+=7;
        b%=10;
        c+=7;
        c%=10;
        d+=7;
        d%=10;
//        System.out.printf("x= %d,%d,%d,%d",a,b,c,d);//8911-1819
     
     	int sum= c*1000+d*100+a*10+b;
     	return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner=new Scanner(System.in);
      
       System.out.print("Nhap so can ma hoa:");
       int n=scanner.nextInt();
       System.out.println("\nSo Ma Hoa="+maHoa(n));

 
	}

}
