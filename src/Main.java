import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      //  double ax, bx, cx, ay, by, cy;

        Triangulo trianglex, triangley;
        trianglex = new Triangulo();
        triangley = new Triangulo();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os lados do triangulo x");
        trianglex.sideA = sc.nextDouble();
        trianglex.sideB = sc.nextDouble();
        trianglex.sideC = sc.nextDouble();

        System.out.println("Digite os lados do triangulo  y");
        triangley.sideA = sc.nextDouble();
        triangley.sideB = sc.nextDouble();
        triangley.sideC = sc.nextDouble();

//        double p = (trianglex.sideA + trianglex.sideB + trianglex.sideC)/2;
//        double areax = Math.sqrt(p * (p - trianglex.sideA) * (p - trianglex.sideB) * (p - trianglex.sideC));
//
//
//        p = (triangley.sideA + triangley.sideB + triangley.sideC)/2;
//        double areay = Math.sqrt(p * (p - triangley.sideA) * (p - triangley.sideB) * (p - triangley.sideC));

        double areax = trianglex.area();
        double areay = trianglex.area();

        System.out.printf("Triangle X area %.4f%n", areax);
        System.out.printf("Triangle Y area %.4f%n", areay);


        if (areax > areay){
            System.out.println("Triangulo X tem a maior area:");
        }else {
            System.out.println("Triamgulo Y tem a maior areea");
        }


        sc.close();
    }
}