/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmatriz;

/**
 *
 * @author Santiago
 */
public class TestMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos nuestra matriz
        int edades [][] = new int [3][2];
        System.out.println("Edades ="+edades);
        
        edades [0][0] = 1;
        edades [0][1] = 5;
        edades [1][0] = 7;
        edades [1][1] = 10;
        edades [2][0] = 3;
        edades [2][1] = 15;
        
        System.out.println("edades [0][0] = "+edades[0][0]);
        System.out.println("edades [0][1] = "+edades[0][1]);
        
        for (var i = 0; i < edades.length; i++){
            for(int j = 0; j < edades[i].length; j++){
                System.out.println("elemento ["+i+"]["+j+"]= "+edades[i][j]);
            }
        }
        
    }
    
}
