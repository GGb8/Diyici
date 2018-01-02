package dess;

import java.util.Scanner;

public class Yue {
    public static void main(String[] A){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("请输入一个数");
        int a=sc.nextInt();
	     de(a);  
    }
    public static int de(int a){
      	
        for(int i=0;i<=a;i++){
		System.out.println(i+"    ");
    	
    }
		return a;
	
    }
}
