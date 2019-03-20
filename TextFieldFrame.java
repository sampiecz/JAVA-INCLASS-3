// Fig. 12.9: TextFieldFrame.java
// JTextFields and JPasswordFields.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.util.Random;



public class TextFieldFrame extends JFrame 
{
   private final JTextField textField1; // text field with set size
   private final JLabel label1; // JLabel with just text

   // generate random number
   Random rand = new Random();
   // Obtain a number between [0 - 49].
   int randomNumber = rand.nextInt(1001) + 1;
   int newDistance = 999;
   int previousNumber = 999;

   // TextFieldFrame constructor adds JTextFields to JFrame
   public TextFieldFrame()
   {
      super("Testing JTextField and JPasswordField");
      setLayout(new FlowLayout());


      // get that label in here
      label1 = new JLabel("I have a number between 1 and 1000.  Can you guess my number?\nPlease enter your first guess:");
      add(label1);

      // construct textfield with 10 columns
      textField1 = new JTextField(10); 
      add(textField1); // add textField1 to JFrame


      // register event handlers
      TextFieldHandler handler = new TextFieldHandler();
      textField1.addActionListener(handler);
   } // end TextFieldFrame constructor

   // private inner class for event handling
   private class TextFieldHandler implements ActionListener 
   {
      // process textfield events
      @Override
      public void actionPerformed(ActionEvent event)
      {
         String string = ""; 
         // user pressed Enter in JTextField textField1
         if (event.getSource() == textField1)
            string = String.format("textField1: %s",
               event.getActionCommand());

         
         // answer matches random number 
         if (event.getActionCommand() == randomNumber)
         {
           // display yay
           JOptionPane.showMessageDialog(null, "Correct!"); 
         } else {
           // put warmer or colder logic here 
         }
        
         // set previous answer
         int previousNumber = event.getActionCommand();

      } 
   } // end private inner class TextFieldHandler
} // end class TextFieldFrame
