package TestJOptionPane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //variables
        String username;
        int age;

        //Obtain username
        username = JOptionPane.showInputDialog("Enter your username");

        //show the user their input
        JOptionPane.showMessageDialog( null, "You entered " + username);

        //obtain age
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));

        //show the user their age
        JOptionPane.showMessageDialog(null, "You entered " + age);
    }
}
