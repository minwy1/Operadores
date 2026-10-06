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

        // Operadores -> realizar operaciones
        // aritmeticas: operaciones matematicas (depende del tipo de datos)
            // unarias ++ -- y binarias + - * %
        int operando1 = 10;
        int operando2 = 5;
        operando1++;
        operando1++;
        operando1++;  // 13
        operando2--;
        operando2--;
        operando2--; // 2
        int suma = operando1+operando2; // 15
        int resta = operando1-operando2; // 11
        int multiplicacion = operando1*operando2; // 26
        double division = (double) operando1 / operando2; // 6.5
        // (para que el resultado tenga decimales lo ponemos temporalmente como double ya que cambiando todos los valores a double seria inecesario y nos daria resultados enteros con decimales)
        int resto = operando1 % operando2; // 13%2 -> 1 -> el resto es 0

        System.out.println("La suma "+suma);
        System.out.println("La resta "+resta);
        System.out.println("La multiplicacion "+multiplicacion);
        System.out.println("La division "+division);
        System.out.println("El resto "+resto);

        operando1 = 10;
        operando2 = 7;
        System.out.println("La suma de los operandos es "+ (operando1+operando2)); // ponemos parentesis para que realize la operacion en lugar de concatenar
        String op1 = "5"; // int
        String op2 = "15"; // int
        System.out.println("La suma de los numeros str es "+
                (Integer.parseInt(op1) + Integer.parseInt(op2))); //Canbiamos de dato str a int siempre que se pueda realizar

        // asignacion
        operando1 = 20;
        operando2 = 10;
        // repetir operando1++; 14 veces (inviable).
        // operando1 = operando1+14; 34
        operando1 += 14; // se usa esta forma
        operando1 -= 4; // 30
        operando1 *=2; // 60
        operando1 /=10; // 6
        //operando1 %=2; // modulado a 2 el resto es 0
        operando1 *= operando2; // operando1 = 6 * 10 -> 60

        //relacionales (siempre obtengo un boolean) > >= < >= == !=
        operando1 = 10;
        operando2 = 15;
        boolean comparacion = operando1>10; // false
        System.out.println("El resultado de la comparacion de > es "+comparacion);
        comparacion = operando1>=10; // true
        System.out.println("El resultado de la comparacion de >= es "+comparacion);
        comparacion = operando2<operando1; // false
        System.out.println("El resultado de la comparacion de < es "+comparacion);
        comparacion = operando2<=operando1; // false
        System.out.println("El resultado de la comparacion de <= es "+comparacion);
        comparacion = operando1 == operando2;// pregunta por si son iguales
        System.out.println("El resultado de la comparacion de == es "+comparacion);
        comparacion = operando1 != operando2; // preguunta si son diferentes
        System.out.println("El resultado de la comparacion de != es "+comparacion);

        //logicos -> AND && (shift + 6) OR || (alt + 1) -> (siempre obtengo un boolean)
        // sueldo mas de 40000 y edad menor de 20
        // sueldo mas de 40000 y edad mas de 20 y edad menor de 30 o pide < 20000
        operando1 = 10;
        operando2 = 20;
        boolean resultadoLogico = operando1<10 && operando2*2>30; // false
        resultadoLogico = operando1<10 || operando2*2>30; // true

    }
}
