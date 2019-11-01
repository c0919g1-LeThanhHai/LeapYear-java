package com.company;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    int year;

    void input() {
        System.out.print("Nhập năm muốn kiểm tra: ");
        this.year = this.scanner.nextInt();
    }

    boolean check(int year) {
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    void display() {
        if(this.check(this.year)) {
            System.out.printf("Năm %d là năm nhuận", this.year);
        } else {
            System.out.printf("Năm %d không phải là năm nhuận", this.year);
        }
    }

    public static void main(String[] args) {
        // write your code here
        Main main = new Main();
        main.input();
        main.display();
    }
}
