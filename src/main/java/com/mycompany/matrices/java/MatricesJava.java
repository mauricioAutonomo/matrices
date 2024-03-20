/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrices.java;

/**
 *
 * @author truco
 */
import java.util.Scanner;

public class MatricesJava {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Menú");
            System.out.println("1. Generar una matriz de 4x4 con la diagonal principal");
            System.out.println("2. Generar una matriz de 4x4 con la triangular inferior izquierda");
            System.out.println("3. Generar una matriz de 4x4 con la triangular superior derecha");
            System.out.println("4. Fin");
            System.out.print("Elija opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    generarMatrizDiagonalPrincipal();
                    break;
                case 2:
                    generarMatrizTriangularInferiorIzquierda();
                    break;
                case 3:
                    generarMatrizTriangularSuperiorDerecha();
                    break;
                case 4:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
                    break;
            }
            
        } while (opcion != 4);
        
        scanner.close();
    }
    
    public static void generarMatrizDiagonalPrincipal() {
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            matriz[i][i] = 1;
        }
        
        imprimirMatriz(matriz);
    }
    
    public static void generarMatrizTriangularInferiorIzquierda() {
        int[][] matriz = new int[4][4];
        
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                matriz[i][j] = 1;
            }
        }
        
        imprimirMatriz(matriz);
    }
    
    public static void generarMatrizTriangularSuperiorDerecha() {
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                matriz[i][j] = 1;
            }
        }
        
        imprimirMatriz(matriz);
    }
    
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
