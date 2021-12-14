import java.awt.GridLayout;
import javax.swing.*;
/**
 * Part 3: This class will model the choices of toppings available for a sandwich. Users are not limited to just one option.
 * @author Austin Walley
 * @version 11/18/21
*/

public class ToppingsPanel extends JPanel 
{
    private static final long serialVersionUID = 1L;
     
    private static final double LETTUCE = 0.50;
    private static final double TOMATO = 1.00;
    private static final double MAYONNAISE = 0.50;
    private static final double MUSTARD = 0.25;
       
    private JCheckBox lettuceChk;
    private JCheckBox tomatoChk;
    private JCheckBox mayoChk;
    private JCheckBox mustardChk;

    /**
     * Constructor
    */
    public ToppingsPanel() 
    {
        super();

        // Sets layout
        setLayout(new GridLayout(4, 1));

        // Creates Check boxes
        lettuceChk = new JCheckBox("Lettuce");
        tomatoChk = new JCheckBox("Tomato");
        mayoChk = new JCheckBox("Mayonnaise");
        mustardChk = new JCheckBox("Mustard");
        
        // Sets border
        setBorder(BorderFactory.createTitledBorder("Toppings!"));
        
        // Adds buttons to the panel
        add(lettuceChk);
        add(tomatoChk);
        add(mayoChk);
        add(mustardChk);
    }

    /**
     * Instance method that takes no param and returns the cost of the toppings.
     * @return total cost of toppings.
    */
    public double getToppingCost() 
    {
        double total = 0.00;
        
        if (lettuceChk.isSelected())
            total += LETTUCE;
        if (tomatoChk.isSelected())
            total += TOMATO;
        if (mayoChk.isSelected())
            total += MAYONNAISE;
        if (mustardChk.isSelected())
            total += MUSTARD;
        return total;
    }

}