package taller_2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Tania Forero
 */
public class ship extends Dship implements create_ship{
      /**
     * Representa los atributos publicos.
     */
    public String typeship, country, name;
    Scanner sca = new Scanner(System.in);
    
     /**
     * CONSTRUCTOR 
     */
    public ship(String typeship, String country, String name) {
        this.typeship = typeship;
        this.country = country;
        this.name = name;
    }

      /**
     * Representa la creacion de la nave
     */

    @Override
    public void tocreate() {
       System.out.println("Escribe el tipo de nave ");
       typeship = sca.nextLine();
       System.out.println("Escribe el pais");
       country = sca.nextLine();
       System.out.println("Escribe el nombre");
       name = sca.nextLine();
     
    }
    /**
     * Representa la lista de los datos guardados.
     */
    @Override
    public void save() {
      ship sh = new ship(typeship, country, name);
      ArrayList<ship> listaModul = new ArrayList<>();
      System.out.println(listaModul.add(sh));
    }

    @Override
    public String typeship() {
        return null;
    }

    @Override
    public String country() {
       return null;
    }

    @Override
    public String name() {
        return null;
    }

    
    
}
