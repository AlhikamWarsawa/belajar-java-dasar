public class operatorMatematika {
    public static void main(String[] args) {
//        Operator Matematika
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

//        Augmented Assisgments
        // a = a + b
        System.out.println(a += b);
        int c = 100;
        c += 10; // c = c + 10
        System.out.println(c);

//        Unary Operator
        int d = +100;
        d++;
        System.out.println(d);
    }
}
