package io.github.galaxyvn.quadratic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticSolver {
    private double a;
    private double b;
    private double c;

    private double delta;

    private double root1;
    private double root2;

    private boolean hasRealRoots;
    private boolean hasOneRealRoot;

    private double read(Scanner scanner, String variable) {
        double value;
        while (true) {
            System.out.printf("Vui lòng nhập hệ số %s: ", variable);
            try {
                value = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Định dạng không hợp lệ. Vui lòng nhập một giá trị số.");
                scanner.next();
            }
        }
        return value;
    }

    public void input() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Giải phương trình bậc hai: ax^2 + bx + c = 0");
            this.a = read(scanner, "a");
            this.b = read(scanner, "b");
            this.c = read(scanner, "c");
        }
    }

    private double calculateDelta() {
        return (b * b) - (4 * a * c);
    }

    public void solve() {
        if (a == 0) {
            hasRealRoots = false;
            hasOneRealRoot = false;
            System.out.println("Đây là phương trình tuyến tính (a = 0), không phải phương trình bậc hai.");
            if (b != 0) {
                root1 = -c / b;
                System.out.printf("Nghiệm là x = %.2f%n", root1);
            } else if (c == 0) {
                System.out.println("Vô số nghiệm (0x = 0).");
            } else {
                System.out.println("Vô nghiệm (0x = -c, với c != 0).");
            }
            return;
        }

        delta = calculateDelta();

        if (delta < 0) {
            hasRealRoots = false;
            hasOneRealRoot = false;
        } else if (delta == 0) {
            hasRealRoots = true;
            hasOneRealRoot = true;
            root1 = -b / (2 * a);
        } else {
            hasRealRoots = true;
            hasOneRealRoot = false;
            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            root2 = (-b - Math.sqrt(delta)) / (2 * a);
        }
    }

    public void displayResults() {
        System.out.println("\n--- Kết quả ---");
        System.out.printf("Phương trình: %.2fx^2 + %.2fx + %.2fc = 0%n", a, b, c);

        if (a == 0) {
            return;
        }

        System.out.printf("Delta = %.2f%n", delta);

        if (!hasRealRoots) {
            System.out.println("Phương trình vô nghiệm thực (delta < 0).");
        } else if (hasOneRealRoot) {
            System.out.printf("Phương trình có một nghiệm thực kép (delta = 0): x = %.2f%n", root1);
        } else {
            System.out.printf("Phương trình có hai nghiệm thực phân biệt (delta > 0):%n");
            System.out.printf("x1 = %.2f%n", root1);
            System.out.printf("x2 = %.2f%n", root2);
        }
    }

    /**
     * io.github.galaxyvn.quadratic.Main method to run the solver.
     */
    public static void main(String[] args) {
        QuadraticSolver solver = new QuadraticSolver();
        solver.input();
        solver.solve();
        solver.displayResults();
    }
}