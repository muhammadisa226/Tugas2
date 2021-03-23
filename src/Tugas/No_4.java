/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Muhammad Isa
 */
public class No_4 {
    public static void main(String[] args) {
        int[][]B = {
            {2,1,-5},
            {3,4,2}   
        };
        System.out.println("Matriks Sebelum Tranpose :  ");
        int[][]Btranpose = new int[3][2];
        for(int i=0;i<B.length; i++){
                for(int j=0; j<B[0].length;j++){
                    System.out.print(B[i][j]+" ");
                }
                System.out.println();
        }
           for(int i=0;i<B.length; i++){
                for(int j=0; j<B[0].length;j++){
                    Btranpose[j][i]= B[i][j];
                    }
        }
        System.out.println("Matriks Sesudah Tranpose :  ");
             for(int i=0;i<B[0].length; i++){
                for(int j=0; j<B.length;j++){
                  System.out.print(Btranpose[i][j]+" ");
                }
                System.out.println();
        }
             System.out.println();
        System.out.println("Muhammad Isa Nuruddin ");
        
    }
}
