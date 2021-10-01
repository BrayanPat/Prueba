import java.util.Scanner;

public class Datos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String Matricula1, pes1, pes2;
        System.out.println("--Registro de Estudiante1--:");
        System.out.println("ingresa el nombre del estudiante:");
        String Nombre1 = entrada.next();
        System.out.println("ingresa la edad del estudiante:");
        int Edad1 = entrada.nextInt();
        System.out.println("ingresa la matricula del estudiante:");
        Matricula1 = entrada.next();
        System.out.println("ingresa el sexo del estudiante:");
        char Sexo1 = entrada.next().charAt(0);
        System.out.println("ingresa el peso del estudiante:");
        double Peso1 = entrada.nextDouble();
        System.out.println("ingresa la altura del estudiante:");
        double Altura1 = entrada.nextDouble();
        
        Estudiante Es1 = new Estudiante(Nombre1 , Edad1, Matricula1, Sexo1, Peso1, Altura1);
        
        System.out.println("\n" +"--Registro de Estudiante2--:");
        System.out.println("ingresa el nombre del estudiante:");
        String Nombre2 = entrada.next();
        System.out.println("ingresa la edad del estudiante:");
        int Edad2 = entrada.nextInt();
        System.out.println("ingresa la matricula del estudiante:");
        String Matricula2 = entrada.next();
        System.out.println("ingresa el sexo del estudiante:");
        char Sexo2= entrada.next().charAt(0);
        
        Estudiante Es2 = new Estudiante(Nombre2 , Edad2, Matricula2, Sexo2);
        
        System.out.println("\n" +"--Información de Estudiante1--:");
        System.out.println(Es1.toString());
        switch(Es1.calcularIMC()){
            case -1: 
                System.out.println("Información de peso: Infrapeso");
            break;
            case 0: 
                System.out.println("Información de peso: Peso ideal");
            break;
            case 1: 
                System.out.println("Información de peso: sobrepeso");;
            break;
        }
        System.out.println("¿Es mayor de edad?: " + Es1.esMayorDeEdad() );
        
        System.out.println("\n" +"--Información de Estudiante2--:");
        System.out.println(Es2.toString());
        switch(Es2.calcularIMC()){
            case -1: 
                System.out.println("Información de peso: Infrapeso");
            break;
            case 0: 
                System.out.println("Información de peso: Peso ideal");
            break;
            case 1: 
                System.out.println("Información de peso: sobrepeso");;
            break;
        }
        System.out.println("¿Es mayor de edad?: " + Es2.esMayorDeEdad() );     
    }
}
