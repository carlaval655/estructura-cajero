/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est;

/**
 *
 * @author Windows
 */
public class Cliente {
    private String nombre;
    private String codigoCliente;
    private int pin;
    public Cliente (String nombre, String codigoCliente, int pin){
        this.nombre = nombre;
        this.codigoCliente = codigoCliente;
        this.pin = pin;
    }
    public String getNombre() {
	return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigoCliente() {
	return codigoCliente;
    }
    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    public int getPin() {
	return pin;
    }
    public void setPin(int pin) {
	this.pin = pin;
    }
}
