/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class Menu {
    Scanner sn = new Scanner(System.in);
    int c = 0;
    Cuenta c1,c2,c3;
    public Menu (Cuenta c1){
        this.c1=c1;
        c=1;
    }
    public Menu (Cuenta c1, Cuenta c2){
        this.c1=c1;
        this.c2=c2;
        c=2;
    }
    public Menu (Cuenta c1, Cuenta c2, Cuenta c3){
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        c=3;
    }
    public  void mostrar(){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
 
            System.out.println("1. Ver saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
 
            try {
                System.out.print("Elige una de las opciones: ");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        verSaldo();
                        break;
                    case 2:
                        retirarDinero();
                        break;
                    case 3:
                        depositarDinero();
                        break;
                    case 4:
                        Entrada e = new Entrada();
                        e.validarIngreso();
                        break;
                    default:
                        System.out.println("Introduzca un numero del 1 al 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un número del 1 al 4");
                sn.next();
            }
        }
    }
    public void verSaldo(){
    	boolean flag = false;
        System.out.println("    Nro de Cuenta");
        if (c==1){
            try {
            	do {
            		System.out.print("1.- "+c1.getNroCuenta()+"\nEscoge una cuenta: ");
                    int opcion = sn.nextInt();
                    switch (opcion) {
                        case 1:
                            c1.verSaldo();
                            flag = true;
                            break;
                        default:
                            System.out.println("El cliente solo tiene 1 cuenta.");
                    }
            	}
            	while (flag == false);
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un número entero");
                sn.next();
            }
        }
        if (c==2){
            try {
            	do {
            		System.out.print("1.- "+c1.getNroCuenta()+"\n2.- "+c2.getNroCuenta()+"\nEscoge una cuenta: ");
                    int opcion = sn.nextInt();
                    switch (opcion) {
                        case 1:
                            c1.verSaldo();
                            flag=true;
                            break;
                        case 2:
                            c2.verSaldo();
                            flag=true;
                            break;
                        default:
                            System.out.println("Introduzca un número entre 1 y 2");
                    }
            	}
            	while (flag==false);
                
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un número entre 1 y 2");
                sn.next();
            }
        }
        if (c==3){
            try {
            	do {
            		System.out.print("1.- "+c1.getNroCuenta()+"\n2.- "+c2.getNroCuenta()+"\n3.- "+c3.getNroCuenta()+"\nEscoge una cuenta: ");
                    int opcion = sn.nextInt();
                    switch (opcion) {
                        case 1:
                            c1.verSaldo();
                            flag = true;
                            break;
                        case 2:
                            c2.verSaldo();
                            flag = true;
                            break;
                        case 3:
                            c3.verSaldo();
                            flag=true;
                            break;
                        default:
                            System.out.println("Introduzca un número entre 1 y 2");
                    }
            	}
            	while (flag==false);
                
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un número entre 1 y 3");
                sn.next();
            }
        }
    }
    public void retirarDinero(){
    	boolean flag = false;
    System.out.println("    Nro de Cuenta");
        if (c==1){
            try {
            	do {
            		System.out.print("1.- "+c1.getNroCuenta()+"\nEscoge una cuenta: ");
                    int opcion = sn.nextInt();
                    switch (opcion) {
                        case 1:
                            c1.retirarDinero();
                            flag = true;
                            break;
                        default:
                            System.out.println("El cliente solo tiene 1 cuenta.");
                    }
            	}
            	while (flag==false);
                
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un número entero");
                sn.next();
            }
        }
        if (c==2){
        	
            try {
            	do {
            		System.out.print("1.- "+c1.getNroCuenta()+"\n2.- "+c2.getNroCuenta()+"\nEscoge una cuenta: ");
                    int opcion = sn.nextInt();
                    switch (opcion) {
                        case 1:
                            c1.retirarDinero();
                            flag = true;
                            break;
                        case 2:
                            c2.retirarDinero();
                            flag = true;
                            break;
                        default:
                            System.out.println("Introduzca un número entre 1 y 2");
                    }
            	}
            	while (flag==false);
                
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un número entre 1 y 2");
                sn.next();
            }
        }
        if (c==3){
            try {
            	do {
            		
            	}
            	while (flag==false);
            	System.out.print("1.- "+c1.getNroCuenta()+"\n2.- "+c2.getNroCuenta()+"\n3.- "+c3.getNroCuenta()+"\nEscoge una cuenta: ");
                int opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        c1.retirarDinero();
                        flag = true;
                        break;
                    case 2:
                        c2.retirarDinero();
                        flag = true;
                        break;
                    case 3:
                        c3.retirarDinero();
                        flag = true;
                        break;
                    default:
                        System.out.println("Introduzca un número entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un número entre 1 y 3");
                sn.next();
            }
        }
    }
    public void depositarDinero(){
    	boolean flag = false;
    	System.out.println("    Nro de Cuenta");
        if (c==1){
            try {
            	do {
            		System.out.print("1.- "+c1.getNroCuenta()+"\nEscoge una cuenta: ");
                    int opcion = sn.nextInt();
                    switch (opcion) {
                        case 1:
                            c1.depositarDinero();
                            flag = true;
                            break;
                        default:
                            System.out.println("El cliente solo tiene 1 cuenta.");
                    }
            	}
            	while (flag==false);
                
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un número entero");
                sn.next();
            }
        }
        if (c==2){
            try {
            	do {
            		System.out.print("1.- "+c1.getNroCuenta()+"\n2.- "+c2.getNroCuenta()+"\nEscoge una cuenta: ");
                    int opcion = sn.nextInt();
                    switch (opcion) {
                        case 1:
                            c1.depositarDinero();
                            flag = true;
                            break;
                        case 2:
                            c2.depositarDinero();
                            flag = true;
                            break;
                        default:
                            System.out.println("Introduzca un número entre 1 y 2");
                    }
            	}
            	while (flag==false);
                
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un número entre 1 y 2");
                sn.next();
            }
        }
        if (c==3){
            try {
            	do {
            		System.out.print("1.- "+c1.getNroCuenta()+"\n2.- "+c2.getNroCuenta()+"\n3.- "+c3.getNroCuenta()+"\nEscoge una cuenta: ");
                    int opcion = sn.nextInt();
                    switch (opcion) {
                        case 1:
                            c1.depositarDinero();
                            flag = true;
                            break;
                        case 2:
                            c2.depositarDinero();
                            flag = true;
                            break;
                        case 3:
                            c3.depositarDinero();
                            flag = true;
                            break;
                        default:
                            System.out.println("Introduzca un número entre 1 y 3");
                    }
            	}
            	while (flag==false);
                
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un número entre 1 y 3");
                sn.next();
            }
        }
    }
}
    
