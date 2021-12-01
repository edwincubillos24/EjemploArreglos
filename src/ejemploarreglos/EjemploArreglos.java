/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploarreglos;

import java.util.Scanner;

/**
 *
 * @author escoo
 */
public class EjemploArreglos {

    static Scanner lector = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int cantidad, numero,filas, columnas;
        
        System.out.println("Digite la cantidad de filas que desea");
        filas = lector.nextInt(); //6
        System.out.println("Digite la cantidad de columnas que desea");
        columnas = lector.nextInt(); //4 
        
        int[][] matrizNumeros = new int[filas][columnas];
        
        for (int i = 0; i< filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.println("Digite el dato ("+i+","+j+"): ");
                matrizNumeros[i][j] = lector.nextInt();
            }
        }
        
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(matrizNumeros[i][j]+"\t");
            }
            System.out.println("");
        }

        System.out.println("Digite la cantidad de datos a ingresar");
        cantidad = lector.nextInt();
        int[] numeros = new int[cantidad];
        numeros = llenarDatos(cantidad);

        for (int i = 0; i < cantidad; i++) {
            System.out.println(numeros[i]);            
        } 
        
        calcularSuma(numeros);
    }
    
    static int[] llenarDatos(int cantidad){
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Digite el dato Nº " + (i + 1));
            numeros[i] = lector.nextInt();
        }
        return numeros;
    }

    private static void calcularSuma(int[] numeros) {
        int suma =0,promedio;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        System.out.println("La suma de los números es: "+suma);
        
        promedio = suma / numeros.length;
        
        System.out.println("El promedio es: "+ promedio);
                
    }

}
