/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagonal;

import java.util.Scanner;

/**
 *
 * @author Nicole
 */
public class Diagonal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A[][] = new int [3][3];
        int i,j,num;
        int suma, resta,s1=0,s2=0;
        System.out.println("ingrese los valores con los cuales llenará la matriz");
        Scanner Lectura =new Scanner(System.in);
      for(i=0;i<3;i++)
      {
        for(j=0;j<3;j++)
        {
            num=Integer.parseInt(Lectura.nextLine());
            A[i][j]= num;
        }
      }
      for(i=0;i<3;i++)
      {
        for(j=0;j<3;j++)
        {
           if(i==j)
           {
               s1=s1+A[i][j];
           }
        }
      }
      for(i=0;i<3;i++)
      {
        for(j=0;j<3;j++)
        {
            if(i+j == 2)
            s2 =s2 + A[i][j];
        }
      }
      suma = s1+s2;
      resta = s1-s2;
      System.out.println("La suma de las diagonales es: "+suma);
      System.out.println("La resta de las diagonales es: "+resta);
    }
    
}
