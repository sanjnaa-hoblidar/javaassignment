/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaassignment.module1;


import java.util.Scanner;

public class pyramidpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j > 0; j--)
                System.out.print(" ");

            for (int k = 1; k <= (2 * i - 1); k++)
                System.out.print("*");

            System.out.println();
        }
    }
}
    