public class Asc{
    public static void main(String[] args) {
        int a = 89;
        int b = 96;
        int c = 88;
        if (a < b && b < c)
            System.out.println(a + " " + b + " " + c);
        else if (a < c && c < b)
            System.out.println(a + " " + c + " " + b);
        else if (b < a && a < c)
            System.out.println(b + " " + a + " " + c);
        else if (b < c && c < a)
            System.out.println(b + " " + c + " " + a);
        else if (c < a && a < b)
            System.out.println(c + " " + a + " " + b);
        else if (c < b && b < a)
            System.out.println(c + " " + b + " " + a);

    }
}