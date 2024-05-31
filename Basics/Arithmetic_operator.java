public class Arithmetic_operator {
    public static void main(String arg[]){
        int a = 20;
        int b = 10;
        int c = 25;
        int d = 12;
        System.out.println("a + b ="+(a + b));
        System.out.println("a - b ="+(a - b));
        System.out.println("a * b ="+(a * b));
        System.out.println("b / a ="+(b / a));
        System.out.println("c % a ="+(c + a));
        //Unary Operator ++ and --
        System.out.println("a++ ="+(a++));
        System.out.println("a-- ="+(a--));
        //difference d++ and ++d
       System.out.println("d++ ="+(d++)); //post increment
       System.out.println("++d ="+(++d)); // pre increment
       System.out.println("d-- ="+(d--));
       System.out.println("--d ="+(--d));
    }
}
