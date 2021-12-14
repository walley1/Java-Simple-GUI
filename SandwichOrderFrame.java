import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * Part 4: This class will build our frame containing our three Panel classes and add Listeners.
 * @author Austin Walley
 * @version 11/18/21
*/

public class SandwichOrderFrame extends JFrame 
{
    private static final long serialVersionUID = 1L;
    
    private static final double TAX_RATE = 0.06;

    private BreadPanel breadPanel;
    private MeatPanel meatPanel;
    private ToppingsPanel toppingsPanel;
    private JPanel buttonPanel;
    private JButton calcBtn;
    private JButton exitBtn;
    
    /**
     * Private inner class that handles the event when
     * the user clicks the Calculate button.
    */
    private class CalcButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            // Variables to hold the subtotal, tax, and total
            
            double subtotal;
            double tax;
            double total;
            
            // Calculates the subtotal
            subtotal = breadPanel.getBreadCost() + 
                    meatPanel.getMeatCost() +
                    toppingsPanel.getToppingCost();
                    
            // Calculates the tax.
            tax = subtotal * TAX_RATE;
            
            // Calculates the total
            total = subtotal + tax;
            
            // Displays the charges
            JOptionPane.showMessageDialog(null,
                String.format("Subtotal: $%,.2f\n" +
                              "Tax: $%,.2f\n" +
                              "Total: $%,.2f",
                              subtotal, tax, total));
        }
    }
    
    /**
     * Private inner class that handles the event when
     * the user clicks the Exit button.
    */
    private class ExitButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
       
    /**
     * The buildButtonPanel() method that takes no param and has no return.
    */
    private void buildButtonPanel() 
    {
        buttonPanel = new JPanel();
        
        // Creates button
        calcBtn = new JButton("Calculate");
        exitBtn = new JButton("Exit");
        
        // Adds action listener to buttons
        calcBtn.addActionListener(new CalcButtonListener());
        exitBtn.addActionListener(new ExitButtonListener());
        
        // Adds buttons to panel
        buttonPanel.add(calcBtn);
        buttonPanel.add(exitBtn);
    }
        
    /**
     * Constructor
    */
    public SandwichOrderFrame() 
    {
        super();
        
        // Sets layout
        setLayout(new BorderLayout());

        // Sets close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creates instance variables
        breadPanel = new BreadPanel();
        meatPanel = new MeatPanel();
        toppingsPanel = new ToppingsPanel();

        // Adds buttons
        buildButtonPanel();

        // Adds components to the frame
        add(breadPanel, BorderLayout.WEST);
        add(meatPanel, BorderLayout.CENTER);
        add(toppingsPanel, BorderLayout.EAST);
        add(buttonPanel, BorderLayout.SOUTH);         

    }

}