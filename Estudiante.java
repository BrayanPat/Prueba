public class Estudiante {
    
    private String nombre;
    private int edad;
    private String matricula;
    private char sexo;
    private double peso;
    private double altura;
    
    public Estudiante(){
        this(" ",0,"",'H',0.0,0.0);
    }

    public Estudiante(String nombre,int edad,String matricula,char sexo,double peso,double altura){
        
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Estudiante(String nombre,int edad,String matricula,char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
        this.sexo = sexo;
        this.peso= 61.20;
        this.altura=1.90;
    }
    
    public int calcularIMC(){
        
        double IMC;
        IMC = peso / Math.pow(altura, 2);

        if(IMC>=16 && IMC<18){
            return -1;
        }else{
            if(IMC>=18 && IMC<25){
                return 0;
            }else{
                return 1;
            }
        }
    }

    public boolean  esMayorDeEdad(){
        boolean v;
        if( edad < 18){
            v = false;
        }
        else{
            v = true;
        }
        return v;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + "\n" + "Edad: " + edad+ "\n" +"Matricula: " + matricula+ 
                "\n" + "Sexo: " + sexo + "\n" + "Peso: " + peso + "\n" + "Altura: " + altura;
    }
}