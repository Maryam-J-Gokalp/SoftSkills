package day05;

/**
 * Created by Yasin DEĞER on 2/14/2022 1:10 AM
 */
public class EscapeSequences {
    public static void main(String[] args) {

        System.out.println("Hello \nRocket\n Team"); //newline


        System.out.println("-----------------------------------");

        System.out.println("Rocket \tTeam"); // 1 tab kadar

        System.out.println("-----------------------------------");

        System.out.println("Rocket \\Rocket Team\\ Team"); // backslash 2 tane kullanmak zorundasın.

        System.out.println("-----------------------------------");

        System.out.println("Rocket \"Rocket Team\" Team");
        System.out.println("Rocket 'Rocket Team' Team");

        System.out.println("-----------------------------------");

        System.out.println("Rocket \rTeam");  //indexi sıfırlamaz...

        System.out.println("-----------------------------------");

        String result = "Rocket \rTeam";

        System.out.println(result.charAt(0));

        System.out.println("-----------------------------------");

        System.out.println("Rocket \bTeam"); // 1 backspace geri gelir.
    }
}
