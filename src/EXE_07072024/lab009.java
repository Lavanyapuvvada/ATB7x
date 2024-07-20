package EXE_07072024;

public class lab009 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        boolean c = a<b;
        boolean d = a>b;
        boolean e = a<=b;
        boolean f = a>=b;
        boolean gates = !(a<=b);
        boolean compare = (a==b);
        System.out.println("The output of A and B is"+compare);
        System.out.println("output for gates is "+gates);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
