package tarea_2_ipc1;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Tarea_2_IPC1 {

    public static Scanner entrada2 = new Scanner(System.in);
    public static float numero1 = 0;
    public static float numero2 = 0; 
    public static float resultado = 0;
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        int opcion = 0, x; 

        do {
            System.out.println("\n-----------Calculadora-----------");
            System.out.println("\n1. Suma"+"\n2. Resta"+"\n3. Multiplicación"+"\n4. División"+"\n5. Salir");
            System.out.print("Ingrese la operación deseada: ");
            opcion = entrada.nextInt();
            if(opcion == 1){
                x=1;
            }
            else if(opcion==2){
                x=2;
            }
            else if (opcion==3){
                x=3;
            }
            else if(opcion==4){
                x=4;
            }
            else if(opcion==5){
                x=5;
            }
            else{
                System.out.println("Opcion No encontrada, intente de nuevo");
            }
            
            switch (opcion){
            case 1:
                suma();
                break;
            case 2: 
                resta();
                break;
            case 3: 
                multiplicacion(); 
                break;
            case 4: 
                division();
                break;
            case 5:
                System.out.println("\nCALCULADORA FINALIZA");
                break;
            }   
        } while (opcion != 5);    
    }
    public static void suma(){
        Scanner entrada3 = new Scanner(System.in);
        float numero1=0;
        for (int i = 0; i < 2; i++) {
            System.out.print((i+1)+". Igrese un numero:");
            numero1 = entrada3.nextFloat();
            resultado += numero1;
        }
        System.out.println("\nResultado de la suma es: "+resultado);
    }
    public static void resta(){
        System.out.println("\n*************Opción Resta***************");
        System.out.print("Ingrese un numero: ");
        numero1 = entrada2.nextFloat();
        System.out.print("Ingrese el segundo numero: ");
        numero2 = entrada2.nextFloat();
        resultado = numero1 - numero2; 
        System.out.println("\nEl resultado de la resta es: "+resultado);
    }
    public static void multiplicacion(){
        System.out.println("\n**********Opción Multiplicación***********");
        System.out.print("Ingrese el primer: ");
        numero1 = entrada2.nextFloat();
        System.out.print("Ingrese el segundo número: ");
        numero2 = entrada2.nextFloat();
        resultado = numero1 * numero2;
        System.out.println("\nEl resultado de la multiplicación es: "+resultado);
    }
    public static void division(){
        System.out.print("\n*********Opción División************");
        System.out.print("\nIngrese el primer número: ");
        numero1 = entrada2.nextFloat();
        System.out.print("\nIngrese el segundo número: ");
        numero2 = entrada2.nextFloat();
        if(numero2 != 0){
            resultado = numero1/numero2;
            System.out.println("Resultado de la división es: "+resultado);
        }
        else{
            System.out.println("¡La división entre cero (0) NO ES POSIBLE!\t");
        }
    }
}
