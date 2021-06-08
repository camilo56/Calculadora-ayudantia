import java.util.Scanner;





public class Main {
    private static double a;
    private static double b;
    static Scanner in= new Scanner(System.in);
    static  Calculadora calc1 =new Calculadora();
    public static void main(String[] args) {
        System.out.println("Bienvenido al a super mega calculadora");
        cambiarValoresAyB();
        Outer1:
        while(true){
        System.out.println("A: "+a+"B:"+b+"Que operacion desea realiczar:\n");

        System.out.println("Las opciones son:");
        System.out.println("1. Sumar A y B");
        System.out.println("2. Restar A y B");
        System.out.println("3. Multiplicar A y B");
        System.out.println("4. Dividir A y B");
        System.out.println("5. Cambiar los valores de A y B");
        System.out.println("0. Salir");
        String opcion = in.nextLine();
        switch(opcion){
            case "1"://Sumar
            hacerSuma();
            break;
            case "2":
                hacerResta();
                break;
            case "3":
                hacerMultiplicacion();
                break;
            case "4":
                hacerDivicion();
                break;

            case "5":
                cambiarValoresAyB();
                break;
            case "0":
                break Outer1;
            default:
                System.out.println("Ingresaste mal la opcion intentalo dce nuevo");
                break;



        }


    }}
    public static void hacerSuma(){
        //1. Validar si a y b son aptas para hacer la suma si es fuera necesario
        //2. Usar el metodo Sumar de cal1 pasando los valores a y b, y almacenando el resultado
        //3. Mostar en pantalla el resultado
        double resultado =calc1.sumar(a,b);
        System.out.println(a+"+"+b+"="+resultado);


    }
        public static void hacerMultiplicacion(){
            double resultado =calc1.multiplicar(a,b);
            System.out.println(a+"+"+b+"="+resultado);

        }

    public static void hacerDivicion(){
        if(b==0){
            System.out.println("Error:b no puede ser cero, cambie el cero");
        return;
        }
        double resultado =calc1.dividir(a,b);
        System.out.println(a+"+"+b+"="+resultado);

    }
    public static void hacerResta() {
        double resultado = calc1.restar(a, b);
        System.out.println(a + "/" + b + "=" + resultado);
    }

    public static void cambiarValoresAyB(){
        try {
            System.out.println("Ingrese el valor de A:");
            a = in.nextDouble();
            System.out.println("Ingrese el valor de B:");
            b = in.nextDouble();
        }catch(Exception e){
            System.out.println("Error: entrada no valida");

            cambiarValoresAyB();

        }

        if(in.hasNextLine()) in.nextLine();

    }

}