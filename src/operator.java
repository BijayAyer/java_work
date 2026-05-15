public class operator {

    public static void main(String[] args){

        int a = 10;
        int b = 5;
        int c = 4;
        int add , sub , div , mul;
    //arithmatic operators
        add = a + b;
        sub = a - b;
        div = a / b;
        mul = a * b;


        System.out.println("Arithmetic operator");
        System.out.println("Sum = "  +add);
        System.out.println("Subtraction = "  +sub);
        System.out.println("Division = "  +div);
        System.out.println("Multiplication = "  +mul);

    // Relational Operators
        System.out.println("----------------------------");
        System.out.println("Relational Operator");
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);

    //Logical Operator
        System.out.println("----------------------------");
        System.out.println("Logical operator");
        System.out.println(a > b &&  a > c);
        System.out.println(a > b || a < c);
        System.out.println(!(a > b));


        


    }
}
