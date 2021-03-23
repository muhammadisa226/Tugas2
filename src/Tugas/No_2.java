package Tugas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Isa
 */
public class No_2 {
    public static void main(String[] args) {
        int [][] A ={ 
            {2, 4},
            {6, 10},
            {20,13}
        };
        int [][] B= {
          {1,2},
          {3,6},
          {15,7}
        };
        if((A.length == B.length) && (A[0].length == B[0].length)) {
            int [][] C = new int[A.length][A[0].length];
             for(int i=0; i<A.length; i++){
                 for(int j=0; j<A[0].length; j++){
                    C[i][j] += A[i][j]-B[i][j];
             } 
             }
        for (int []c :C){
            for(int q : c){
                System.out.print(q+" ");
            }
            System.out.println();
        }
        } else {
            System.out.println("Ukuran Matrix Tidak Sama");
    }
       System.out.println("Muhammad Isa Nuruddin ");
}
}
