import java.util.Scanner;

public class Entrada {

    public static void main(String[] args){
        System.out.println("Proyecto operadores");
        Scanner lector = new Scanner(System.in);
        //al escribir Scanner y darle enter escribe la frase import java.util.Scanner; al comienzo del programa para importar su funcionalidad
        System.out.println("introduce tu nombre"); //Cuando aparezca esta frase por pantalla debemos de responder en la consola y dar enter
        String nombre = lector.nextLine(); //esto leera la linea completa, next a secas leeria una palabra
        System.out.println("Introduce el ciclo donde estas matriculado");
        String ciclo = lector.nextLine();
        System.out.println("que nota crees que sacaras al final del curso");
        int nota = lector.nextInt(); //leera el numero guardado en la variable nota
        System.out.println("Nombre: "+nombre);
        System.out.println("Ciclo: "+ciclo);
        System.out.println("Nota: "+nota);
    }
}
