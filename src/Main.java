import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {
    static List<Integer> grades = new ArrayList<>();
    static int a,b,c,d,e,avg;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Physic Grade: ");
        a = input.nextInt();
        grades.add(a);

        System.out.print("Enter Math Grade: ");
        b = input.nextInt();
        grades.add(b);

        System.out.print("Enter Chemical Grade: ");
        c = input.nextInt();
        grades.add(c);

        System.out.print("Enter Music Grade: ");
        d = input.nextInt();
        grades.add(d);

        System.out.print("Enter History Grade: ");
        e = input.nextInt();
        grades.add(e);

        calculate();

        System.out.println("Physic Grade: " + a);
        System.out.println("Math Grade: " + b);
        System.out.println("Chemical Grade: " + c);
        System.out.println("Music Grade: " + d);
        System.out.println("History Grade: " + e);

        avg = (a+b+c+d+e)/grades.size();
        boolean gectiMi = (avg > 50);
        System.out.println("Geçti mi?: " + gectiMi);

    }
    public static void calculate(){
        System.out.println("Average is: " + (a+b+c+d+e)/grades.size());
    }
}

