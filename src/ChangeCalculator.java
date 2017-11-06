//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
          String Nic = JOptionPane.showInputDialog("How many Nickel's do you have?");
          int Bic = Integer.parseInt(Nic);
          System.out.println(Bic*5);
		// Convert their answer to an int using Integer.parseInt()
          String dime = JOptionPane.showInputDialog("How many Dime's do you have?");
          int Di = Integer.parseInt(dime);
          System.out.println(Di*10);
		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer
          String Quart = JOptionPane.showInputDialog("How many Quarter's do you have?");
          int Q = Integer.parseInt(Quart);
          System.out.println(Q*25);
		// Calculate how much money the user has and save it in a double variable 
double Money = (Bic*5)+ (Di*10) + (Q*25);
JOptionPane.showMessageDialog(null, "$" + Money/100);
		// Tell the user how much money they have

	}
}

