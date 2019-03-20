// Fig. 12.9: TextFieldFrame.java
// JTextFields and JPasswordFields.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame 
{
   private final JTextField textField1; // text field with set size
   private final JTextField textField2; // text field with text
   private final JTextField textField3; // text field with text and size
   private final JPasswordField passwordField; // password field with text

   // TextFieldFrame constructor adds JTextFields to JFrame
   public TextFieldFrame()
   {
      super("Testing JTextField and JPasswordField");
      setLayout(new FlowLayout());

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

         // display JTextField content
         JOptionPane.showMessageDialog(null, string); 
      } 
   } // end private inner class TextFieldHandler
} // end class TextFieldFrame
