package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = -1;
        int choice2 = -1;
        String hinhVe = "";

        Scanner scanner = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Print the rectangle");
                    for (int i = 0; i <= 6; i++) {
                        for (int j = 0; j <= 6; j++) {
                            hinhVe += "* ";
                        }
                        hinhVe += "\n";
                    }
                    System.out.println(hinhVe);
                    hinhVe = "";
                    break;
                }
                case 2: {
                    System.out.println("Print the square triangle");
                    System.out.println("1. Top-left");
                    System.out.println("2. Top-right");
                    System.out.println("3. Botton-left");
                    System.out.println("4. Botton-right");
                    System.out.println("0. Exit");
                    System.out.println("Enter your choice: ");
                    choice2 = scanner.nextInt();
                    while (choice2 != 0) {
                        switch (choice2) {
                            case 1: {
                                System.out.println("Hình 1: Top-left");
                                for (int i = 1; i <= 6; i++) {
                                    for (int j = 6; j >= i; j--) {
                                        hinhVe += "* ";
                                    }
                                    hinhVe += "\n";
                                }
                                System.out.println(hinhVe);
                                hinhVe = "";
                                break;
                            }
                            case 2: {
                                System.out.println("Hình 2: Top-right");
                                System.out.println("* * * * * *");
                                System.out.println("  * * * * *");
                                System.out.println("    * * * *");
                                System.out.println("      * * *");
                                System.out.println("        * *");
                                System.out.println("          *");
                                break;
                            }
                            case 3: {
                                System.out.println("Hình 3: Botton-left");
                                for (int i = 1; i <= 6; i++) {
                                    for (int j = 1; j <= i; j++) {
                                        hinhVe += "* ";
                                    }
                                    hinhVe += "\n";
                                }
                                System.out.println(hinhVe);
                                hinhVe = "";
                                break;
                            }
                            case 4: {
                                System.out.println("Hình 4: Botton-right");
                                System.out.println("          *");
                                System.out.println("        * *");
                                System.out.println("      * * *");
                                System.out.println("    * * * *");
                                System.out.println("  * * * * *");
                                System.out.println("* * * * * *");

                                break;
                            }
                            case 0: {
                                System.exit(0);
                            }
                            default: {
                                System.out.println("Nhập lại");
                            }
                        }
                        break;
                    }
                    break;
                }
                case 3: {
                    System.out.println("Print isosceles triangle");
                    System.out.println("        *        ");
                    System.out.println("      * * *      ");
                    System.out.println("    * * * * *    ");
                    System.out.println("  * * * * * * *  ");
                    System.out.println("* * * * * * * * *");
                    break;
                }
                case 0: {
                    System.out.println("Kết thúc");
                    break;
                }
                default: {
                    System.out.println("No choice!");
                }
            }
        }
    }
}