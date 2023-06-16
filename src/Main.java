import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {
    static List<Integer> grades = new ArrayList();
    static int a,b,c,d,e;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Physic Grade: ");
        a = input.nextInt();
        grades.add(a);

        System.out.println("Enter Math Grade: ");
        b = input.nextInt();
        grades.add(b);


        System.out.println("Enter Chemical Grade: ");
        c = input.nextInt();
        grades.add(c);


        System.out.println("Enter Music Grade: ");
        d = input.nextInt();
        grades.add(d);


        System.out.println("Enter History Grade: ");
        e = input.nextInt();
        grades.add(e);

        calculate();

        System.out.println("Physic Grade: " + a);
        System.out.println("Math Grade: " + b);
        System.out.println("Chemical Grade: " + c);
        System.out.println("Music Grade: " + d);
        System.out.println("History Grade: " + e);


    }
    public static void calculate(){
        System.out.println("Average is: " + (a+b+c+d+e)/grades.stream().count());
    }
}

