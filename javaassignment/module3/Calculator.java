/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaassignment.module3;
class Calculator {
    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) { // Overloading
        return a * b * c;
    }
}

class AdvancedCalculator extends Calculator {
    int multiply(int a, int b) { // Overriding
        return super.multiply(a, b);
    }

    public static void main(String[] args) {
        AdvancedCalculator obj = new AdvancedCalculator();
        System.out.println(obj.multiply(2, 3));
        System.out.println(obj.multiply(2, 3, 4));
    }
}
