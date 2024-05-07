import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {

        System.out.println("Ingrese la primera fecha como DD/MM/AAAA");
        Scanner sc= new Scanner(System.in);
                String fecha1=sc.nextLine();
                int dia1=Integer.parseInt(fecha1.substring(0,2));
                int mes1=Integer.parseInt(fecha1.substring(3,5));
                int anho1=Integer.parseInt(fecha1.substring(6));


        System.out.println("Ingrese la segunda fecha como DD/MM/AAAA");
                String fecha2=sc.nextLine();
                int dia2=Integer.parseInt(fecha2.substring(0,2));
                int mes2=Integer.parseInt(fecha2.substring(3,5));
                int anho2=Integer.parseInt(fecha2.substring(6));

        if(anho1<anho2){
            System.out.println("persona 1 es mayor");
        }
        else if(anho1>anho2){
            System.out.println("persona 2 es mayor");
        }
        else if(anho1==anho2  && mes1==mes2 && dia1==dia2)
            System.out.println("tienen la misma edad");

        else if(anho1==anho2  && mes1<mes2 )
            System.out.println("persona 1 es mayor");
        else if(anho1==anho2  && mes1>mes2 )
            System.out.println("persona 2 es mayor");
        else if(anho1==anho2  && mes1==mes2  && dia1<dia2)
            System.out.println("persona 1 es mayor");
        else if(anho1==anho2  && mes1==mes2  && dia1>dia2)
            System.out.println("persona 2 es mayor");


    }
}