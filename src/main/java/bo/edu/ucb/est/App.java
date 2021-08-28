package bo.edu.ucb.est;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Hello world");
        Cliente c1 = new Cliente ("Juan Perez","jperez",3333);
        
        Cliente c2 = new Cliente ("Maria Gomez","mgomez",4444);
        
        Cliente c3 = new Cliente ("Carlos Gomez", "cgomez", 5555);
        
        Cuenta ct1 = new Cuenta (c1.getCodigoCliente(), 111122, "Bolivianos", "Caja de Ahorros", 12000);
        Cuenta ct2 = new Cuenta (c1.getCodigoCliente(), 112211, "USD", "Cuenta Corriente", 100);
        
        Cuenta ct3 = new Cuenta (c2.getCodigoCliente(), 221122, "Bolivianos", "Caja de Ahorros", 0);
        
        Cuenta ct4 = new Cuenta (c3.getCodigoCliente(), 331122, "Bolivianos", "Caja de Ahorros", 100);
        Cuenta ct5 = new Cuenta (c3.getCodigoCliente(), 332211, "USD", "Cuenta Corriente", 1000);
        Cuenta ct6 = new Cuenta (c3.getCodigoCliente(), 332233, "Bolivianos", "Caja de Ahorros", 100000);
        
        Entrada e = new Entrada();
        int validacion=0;
        do{
           validacion=e.validarIngreso();
        }
        while (validacion==0);
        
        if (validacion!=0){
            if (validacion == 1){
                Menu m = new Menu(ct3);
                m.mostrar();
            }
            if (validacion == 2){
                Menu m = new Menu(ct1,ct2);
                m.mostrar();
            }
            if (validacion == 3){
                Menu m = new Menu(ct4,ct5,ct6);
                m.mostrar();
            }
        }
    }
}
