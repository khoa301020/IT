/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import javax.swing.JFrame;

/**
 *
 * @author minhq
 */
public class HelloSwing {
    public HelloSwing(){
        JFrame frame = new JFrame("Hello");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    public static void main(String[] args) {
        new HelloSwing();
        
    }
}
