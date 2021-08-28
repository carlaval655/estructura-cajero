/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class Cuenta {
    Scanner sn = new Scanner(System.in);
    private String codigoCliente;
    private int nroCuenta;
    private String moneda;
    private String tipo;
    private double saldo;
    
    public Cuenta (String codigoCliente, int nroCuenta, String moneda, String tipo, double saldo){
        this.codigoCliente = codigoCliente;
        this.nroCuenta = nroCuenta;
        this.moneda = moneda;
        this.tipo = tipo;
        this.saldo = saldo;
    }
    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
	this.codigoCliente = codigoCliente;
    }

    public int getNroCuenta() {
	return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
	this.nroCuenta = nroCuenta;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
	this.moneda = moneda;
    }

    public String getTipo() {
	return tipo;
    }

    public void setTipo(String tipo) {
	this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void verSaldo(){
        System.out.println("Nro de Cuenta: "+getNroCuenta()+"\nMoneda: "+getMoneda()+"\nTipo: "+getTipo()+"\nSaldo: "+getSaldo());
    }
    public void retirarDinero(){
    	
       try{
    	   boolean flag = false;
            do {
            	
            	System.out.println("El saldo en esta cuenta es de: "+getSaldo()+" "+getMoneda());
                System.out.print("Introduzca el monto de dinero que desea retirar en "+getMoneda()+": ");
                double monto = sn.nextDouble();
                if (monto<=0) {
                	System.out.println("Introduzca un monto mayor a 0.");
                }
                else {
                	if(getSaldo()-monto<0) {
                	System.out.println("Introduzca un monto menor al saldo de la cuenta.");
                	}
                	else {
                		setSaldo(getSaldo()-monto);
                		System.out.println("Se realizó el retiro de la cuenta con éxito.");
                		flag=true;
                	}
                }
            }
            while (flag==false);
        }
        catch (NumberFormatException e){
            System.out.println("Introduzca un monto valido.");
        }
        
    }
    public void depositarDinero(){
    	try{
    		System.out.println("El saldo en esta cuenta es de: "+getSaldo()+" "+getMoneda());
            System.out.print("Introduzca el monto de dinero que desea depositar en "+getMoneda()+": ");
            double monto = sn.nextDouble();
            setSaldo(getSaldo()+monto);
     		System.out.println("Se realizó el depósito a la cuenta con éxito.");
         }
         catch (NumberFormatException e){
             System.out.println("Introduzca un monto válido.");
         }
    }
}
