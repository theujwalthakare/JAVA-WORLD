/*
    TYPE CONVERSION
    conversion happen when:
    - type is compatible
    - desitination type > source type

       byte->short->int->long->float->double
 */
public class Type_conversion {
    public static void main(String[] args) {

        int a = 24;
        long b = a; //int is converted into long
     /*
        long a =34;
        int b = a; // it gives  error: incompatible types: possible lossy conversion from long to int
       */
        System.out.println(b);
    }
    
}
