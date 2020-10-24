
import java.util.Scanner;


/**
 *
 * @author Alumno
 */
public class Registro_Dato {
    private Scanner teclado;
    private int[]sueldo; //DECLARACION DE VECTOR
    
    public void cargar(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de sueldos ");
        int cantidad = teclado.nextInt();
        sueldo = new int[cantidad];
        
    for (int i = 0; i < sueldo.length; i++){
        System.out.println("Ingrese Sueldo");
        sueldo[i] = teclado.nextInt();
          }
        }
    
    public void imprimir(){
        for(int i=0; i < sueldo.length; i++){
            System.out.println("Sueldo "+(i+1)+":$"+sueldo[i]);
        }
    }
    
    public static void main(String[] args){
        Registro_Dato registro_dato = new Registro_Dato();
        registro_dato.cargar();
        registro_dato.imprimir();
    }
}

     