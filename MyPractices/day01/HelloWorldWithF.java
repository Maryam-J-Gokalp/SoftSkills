package day01;

/**
 * Created by Yasin DEĞER on 2/14/2022 12:45 AM
 */
public class HelloWorldWithF {
    public static void main(String[] args) {

        String members = "Yusuf, Onur, Ahmet, Mehmet";

        System.out.printf("Hello Rocket team members: %s", members);

        System.out.println("");

        System.out.println("-----------------");


        double age1 = 5;

        System.out.printf("Age1: %f%n",age1);

        System.out.println("-----------------");

        boolean male = true;

        System.out.printf("Gender Male : %b%n",male);

        System.out.println("-----------------");

        char at = '@';

        System.out.printf("@ sign: %c%n", at);

        System.out.println("-----------------");


    }
}
/*      %c	Format characters
        %d	Format decimal (integer) numbers (base 10)
        %e	Format exponential floating-point numbers
        %f	Format floating-point numbers
        %i	Format integers (base 10)
        %o	Format octal numbers (base 8)
        %s	Format string of characters
        %u	Format unsigned decimal (integer) numbers
        %x	Format numbers in hexadecimal (base 16)
        %n	add a new line character*/