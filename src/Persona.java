
import java.util.Scanner;


/**
 *
 * @author Alumno
 */
public class Persona {
    
    private Scanner teclado;
    private String[]nombre;
    private int[]edad;
    
    public void cargar(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de personas ");
        int cant = teclado.nextInt();
        nombre = new String[cant];
        edad = new int[cant];
        
        for(int i=0; i< nombre.length; i++){
            System.out.println("Ingrese el nombre ");
            nombre[i] = teclado.next();
            System.out.println("Ingrese la edad ");
            edad[i] = teclado.nextInt();
        }
    }    
    
    public void imprimir(){
        for(int i=0; i< edad.length; i++){
            System.out.println("Persona "+ (i+1)+" :"+ nombre[i]);
            System.out.println("La edad es : "+ edad[i]);
        }
    }

    public static void main(String[] args){
        Persona persona = new Persona();
        persona.cargar();
        persona.imprimir();
    }
}
