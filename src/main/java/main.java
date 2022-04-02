import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        float Radio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Radio");
        Radio=sc.nextFloat();
        Circulo circulo = new Circulo();
        Circulo circulo1 = new Circulo(Radio,22f,3,2);
        System.out.println(circulo1.getArea());
        System.out.println(circulo1.getCircunferencia());
        System.out.println(circulo1.getDiametro());


    }
}
