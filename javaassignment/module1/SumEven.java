/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaassignment.module1;
public class SumEven {
    public static void main(String[] args) {
        int i = 1, sum = 0;

        while (i <= 100) {
            if (i % 2 == 0)
                sum += i;
            i++;
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}
