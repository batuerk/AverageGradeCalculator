import java.util.List;

public class Calculate {
    int a,b,c,d,e;
    List<Integer> grades;

    public Calculate(int a, int b, int c, int d, int e, List<Integer> grades) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.grades = grades;
    }
    public void calculate(){
        System.out.println("Average is: " + (a+b+c+d+e)/grades.size());
    }

    public static void calculate(int a, int b, int c, int d, int e, List<Integer> grades){
        System.out.println("Average is: " + (a+b+c+d+e)/grades.size());
    }
}
