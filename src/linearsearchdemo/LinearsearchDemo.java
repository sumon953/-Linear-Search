/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearchdemo;

import java.util.Scanner;


public class LinearsearchDemo {

    public static void main(String[] args) {
        
        int x[] = {12,4,6,5,7,4,7};
        int search;
       int count=0;
       Scanner sc = new Scanner(System.in);
       search=sc.nextInt();
         
        for(int i=0;i<7;i++){
             
            if(x[i]==search){
                count++;
            }
        }
        
        if(count==1){
        System.out.println("found");
        }
        else{
        System.out.println("not found");
        }
        
    }
    
}
