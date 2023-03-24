package PrimerApellido;

import java.util.Scanner;

public class EjercicioJava {
    private Scanner teclado;
    private int lado;
    
    public EjercicioJava(){
        teclado = new Scanner(System.in);
        System.out.print("Introduzca el valor del lado: ");
        lado=teclado.nextInt();
    }
    
    public void imprimirPerimetro(){
        int perimetro=lado*4;
        System.out.println("Perimetro es de: "+perimetro+" cm");
    }
    
    public void imprimirSuperficie(){
        int area=lado*lado;
        System.out.println("La superficie es de: "+area+" cm2");
    }
    
    public static void main(String[] args){
    	EjercicioJava c = new EjercicioJava();
        c.imprimirPerimetro();
        c.imprimirSuperficie();
    }
}