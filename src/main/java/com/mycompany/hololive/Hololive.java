/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hololive;
import java.util.Scanner;

public class Hololive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       HOLOLIVE FAN MENU");
        System.out.println("================================");
        System.out.println("1. Hoshimachi Suisei");
        System.out.println("2. Gawr Gura");
        System.out.println("3. Kobo Kanaeru");
        System.out.println("================================");

        System.out.print("Pilih talent: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("\nNama    : Hoshimachi Suisei");
                System.out.println("Gen     : 0th Gen");
                System.out.println("Julukan : Comet");
                break;

            case 2:
                System.out.println("\nNama    : Gawr Gura");
                System.out.println("Gen     : Hololive EN");
                System.out.println("Julukan : Shark");
                break;

            case 3:
                System.out.println("\nNama    : Kobo Kanaeru");
                System.out.println("Gen     : Hololive Indonesia 3rd Gen");
                System.out.println("Julukan : Rain Shaman");
                break;

            default:
                System.out.println("\nPilihan tidak tersedia!");
        }

        input.close();
    }
}