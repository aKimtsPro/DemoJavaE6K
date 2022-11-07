package be.bstorm.e6k.demo;

import java.util.Scanner;

public class DemoAutre {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Integer:");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Chaine:");
        String chaine = sc.nextLine();

        System.out.println("Integer:");
        int a2 = sc.nextInt();
        System.out.println("Chaine:");
        String chaine2 = sc.next();
    }

}
