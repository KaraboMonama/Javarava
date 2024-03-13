/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import javax.swing.JOptionPane;
public class JavaApplication2 {

    public static void main(String[] args) {
      String name = JOptionPane.showInputDialog(" Please enter your name ");
      JOptionPane.showMessageDialog(null, " hi " + name);
      
      int age = Integer.parseInt(JOptionPane.showInputDialog(" How old are you "));
      JOptionPane.showConfirmDialog(null, " you are " + age + " years old ");
    }
    
    
}
