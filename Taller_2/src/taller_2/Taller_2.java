package taller_2;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Tania Forero
 */
public class Taller_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String typeship = null, country = null, name = null;
        Scanner sca = new Scanner(System.in);
        boolean exit = false;
        int option; //Guardaremos la opcion del usuario
        ship sh = new ship(typeship, country, name);
        /**
        * usuaremos un do while para el menu.
        */
         do{
 
            System.out.println("1. Crear una nave");
            System.out.println("2. listar naves");
            System.out.println("3. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                option = sca.nextInt();
 
                switch (option) {
                    case 1:
                       sh.tocreate();
                        break;
                    case 2:
                        sh.save();
                        break;
                    case 3:
                        exit = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sca.next();
            }
        }while (!exit);
    
    } 
}
