import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        JOptionPane.showInputDialog("Type something");
        //Store the input as a String and print it.
        String input = JOptionPane.showInputDialog("Type something");

        
        //Parse the input as an int.

        int stringVar = Integer.parseInt(input);
        //Print its value +1
        System.out.println(stringVar + 1);        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

        
    }
}
