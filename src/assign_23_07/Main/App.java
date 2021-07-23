package assign_23_07.Main;

import assign_23_07.Main.Model.Calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("hello");

        Scanner scanner = new Scanner(System.in);
        Calculator add_1 = new Calculator(5,);
        add_1.sum();
        add_1.subtract();
        add_1.multiply();
        add_1.divide();
    }
}
