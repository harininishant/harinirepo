import java.util.Scanner;

public class methodPractice {
    public static void main(String[] args) {


        System.out.println(si(10000, 20, 4));
         greeting("harini",3);

        System.out.println("feature");
        System.out.println("second change");



    }


    public static double si(double p, double roi, int t) {
        return p * roi * t / 100;



    }
    public static void greeting(String name,int langcode) {

        if (langcode==1) {
            System.out.println("hello"+name);
        }else if (langcode==2) {
            System.out.println("namaste"+name);
        }else if (langcode==3) {
            System.out.println("Hola"+name);
        }else if (langcode==4) {
            System.out.println("Bonjour"+name);
        }else {

            System.out.println("hello"+name);
        }

}}

