package com.util;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int a=0,b=0,c=0;
        Scanner sc = new Scanner(System.in);
        //利用hasNextXXX()判断是否还有下一输入项
        while (sc.hasNext()) {

        	a=sc.nextInt();
        	b=sc.nextInt();
        	c=sc.nextInt();
           
        }
        //a>b时
        if (a > b) {
            if (c > a) {
                System.out.println(b + "," + a + "," + c);
            } else if (c < b) {
                System.out.println(c + "," + b + "," + a);
            } else {
                System.out.println(b+","+c+","+a);
            }

            
        // a<<b时    
        }else {
            if(c<a){
                System.out.println(c+","+a+","+b);
            }else if(c>b){
                System.out.println(a+","+b+","+c);
            }else{
                System.out.println(a+","+c+","+b);
            }
        }

        
	}

}
