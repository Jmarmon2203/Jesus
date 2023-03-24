package paqueteRama1;

import java.util.Scanner;

public class Rama1 {
    private Scanner teclado;
    private String nombre;
    private float sueldo;
    
    public Rama1(){
        teclado = new Scanner(System.in);
        System.out.print("Introduzca el nombre del empleado: ");
        nombre=teclado.next();
        System.out.print("Introduzca el sueldo del empleado: ");
        sueldo=teclado.nextInt();
    }
    
    public void pagarImpuesto(){
        if(sueldo>3000)
            System.out.println("Debe pagar impuestos");
        else
            System.out.println("No debe pagar impuestos");
    }
    
    public static void main(String[] args){
    	Rama1 e = new Rama1();
        e.pagarImpuesto();
    }
}