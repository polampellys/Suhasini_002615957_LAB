/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class Lab2 {
    
public static void array(int ar[])
{
    for (int i = 0; i < ar.length; i++) {
    if (i % 2 == 0) {
      ar[i]= ar[i] * 2;
     } else {
       ar[i]= ar[i] * 3;
     }
   }  
  }
 
public static void main(String[] args){
   int a[]= {3,7,9,15,24};
   array(a);
   System.out.println("The elements in array: ");
        for(int i=0; i<a.length;i++)
        {
            System.out.print(a[i]+" "+"\n");  
        }
}
}
