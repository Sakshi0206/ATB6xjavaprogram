public class April18_class_practice {
    public static void main(String[] args) {
        int a= 65;
        int b = 10;
        String name = "sakshi";

        System.out.println(a+b); //75
        System.out.println(a+name); //65sakshi
        System.out.println(name+b+a); //sakshi1065
        System.out.println(name+a+b); //sakshi6510
        System.out.println(a+b+name); //75sakshi

        //Compound Assignment operators
        // +=, -=, /=, *=, %=

        int b1 = 10;
        b1 +=10;
        System.out.println(b1); // 20

        int a1= 10;
        a1 -= 2;
        System.out.println(a1); //8

        int c1= 10;
        c1 *= 10;
        System.out.println(c1); //100

        int d1 = 10;
        d1/= 10;
        System.out.println(d1); // 1

        int e3 = 20;
        e3 %= 12;
        System.out.println(e3); //8

        //Relational operators  >,<, <=, +>, ==, !=


        int p = 10;
        int v= 10;
        boolean n = p <= v;
        System.out.println(n);
        System.out.println('A'== 65);

        //Logical Operator  Not Gate, Or Gate, And Gate


        // Not Gate
        boolean o = true;
        System.out.println(!(10>10));
        System.out.println(!!!(10>10));

        //Or Gate
        // T||T = T
        //T||F= T
        //F||T = T
        //F||F= F

        System.out.println(false || false);

        // And Gate
        // T||T = T
        //T||F= F
        //F||T = F
        //F||F= F

        //Bring It on

        int m =10;
        boolean x =  !(10>60 || (10==10));
        //           !(false|| true)
        //           ! true
        //           false
        System.out.println(x);

        //increment
        // Pre- do increment first and then print
        //result-----Print
        int g = 10;
        System.out.println(++g);
        System.out.println(g);

        int i = 10;
        System.out.println(++i + ++i);
        //Part a   ++i  ep_1  (Result +print) 11 , 11
        // Part b   +   ep_2  +
        // Part c  ++i  ep_3  (Result + print) 12,12

        //post- print first and then incrrement
        //Print-----result
        int u= 11;
        System.out.println(u++);
        System.out.println(u);


        int s = 10;
        System.out.println(++s + s++ + s++);
        // Part1 ++a  Icrement then print  11,11
        //Part2  a++  print increment      11, 12
        //Part3  a++  print increment      12,13






    }
}

