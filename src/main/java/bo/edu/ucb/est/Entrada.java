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
public class Entrada {
    Scanner sn = new Scanner(System.in);
    Cliente c1 = new Cliente ("Juan Perez","jperez",3333);
    Cliente c2 = new Cliente ("Maria Gomez","mgomez",4444);
    Cliente c3 = new Cliente ("Carlos Gomez", "cgomez", 5555);
    public Entrada(){
    }

    /**
     *
     * @return
     */
    public int validarIngreso(){
        
        String codCli;
        int pin=0;
        int flag=0;
        System.out.print("Introduzca el código de cliente: ");
        codCli = sn.next();
        try{
            System.out.print("Introduzca el pin: ");
            pin = sn.nextInt();
        }
        catch (InputMismatchException ex) {
                System.out.println("Introduzca un pin de 4 dígitos");
                sn.next();
        }
        if (c1.getCodigoCliente().equals(codCli) && c1.getPin()==pin){
            flag = 2;
        }
        else{
            if(c2.getCodigoCliente().equals(codCli) && c2.getPin()==pin){
            flag = 1;
            }
            else{
                if (c3.getCodigoCliente().equals(codCli) && c3.getPin()==pin){
                    flag = 3;
                }
            }
        }
        return flag;
    }
}
