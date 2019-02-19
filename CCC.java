//Car care choice 
//application for a car care shop that shows different auto care options and then user will type string to select what he wants

import javax.swing.JOptionPane;

public class CCC {
    public static void main(String[] args) {
        //variables and constants
        String[] services = {"oil change", "tire rotation", "battery check", "brake inspection"};
        double[] prices = {25.00, 22.00, 15.00, 5.00};
        boolean isMatch = false;
        int matchIndex = 0;

        String selection = JOptionPane.showInputDialog(null, "please make your selection: \noil change \ntire rotation \nbattery check \n brake inspection");

        //checks the users selection based on the first three characters
        for(int x = 0; x < services.length; x++) {
            if(selection.substring(0, 3).equalsIgnoreCase(services[x].substring(0, 3))) {
                isMatch = true;
                matchIndex = x;

            }
        }

        //array has been checked, either a match has been found or an invalid selection was entered. Display the appropriate output
        if(isMatch) {
            JOptionPane.showMessageDialog(null, "You entered " + services[matchIndex] + " the price is $" + prices[matchIndex]);
        }else{
            JOptionPane.showMessageDialog(null, "You entered an invalid selection");
        } 
    }
}