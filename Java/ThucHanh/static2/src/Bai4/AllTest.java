/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author Nguyễn Văn Phát
 */
public class AllTest {

    int x = 10;
    static int y = 20;

    void m1(int a) {
        System.out.println("Instance method");
    }

    static void m2(String str) {
        System.out.println("Static method");
    }

    AllTest() {
        System.out.println("0-arg constructor"); 
    }

    AllTest(int a) {
        System.out.println("1-arg constructor");
    }

    {
        System.out.println("Instance block");
    }

    static {
        System.out.println("Static block: Nguyễn Văn Phát");
    }

    public static void main(String[] args) {
        AllTest at = new AllTest();
        AllTest at2 = new AllTest(10);
       
        AllTest.m2("Shubh"); 
        at.m1(50);
    }
}
