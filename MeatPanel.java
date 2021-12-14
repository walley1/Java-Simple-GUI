import java.awt.GridLayout;
import javax.swing.*;
/**
 * This class will model the choices of meat available for a sandwich.
 * @author Austin Walley
 * @version 11/18/21
*/

public class MeatPanel extends JPanel 
{
    private static final long serialVersionUID = 1L;

    private static final double HAM = 3.00;
    private static final double TURKEY = 3.55;
    private static final double ROAST_BEEF = 4.00;
    private static final double NO_MEAT = 0.00;
    
    private JRadioButton hamBtn;
    private JRadioButton turkeyBtn;
    private JRadioButton roastBeefBtn;
    private JRadioButton noneBtn;
    private ButtonGroup grp;

    public MeatPanel() 
    {
        super();
        
        // Sets layout
        setLayout(new GridLayout(4, 1));

        // Creates buttons
        hamBtn = new JRadioButton("Ham");
        turkeyBtn = new JRadioButton("Turkey");
        roastBeefBtn = new JRadioButton("Roast Beef");
        noneBtn = new JRadioButton("No Meat", true);
        
        // Creates button group
        ButtonGroup grp = new ButtonGroup(); 
        
        // Adds buttons to group
        grp.add(hamBtn);
        grp.add(turkeyBtn);
        grp.add(roastBeefBtn);
        grp.add(noneBtn);
                
        // Sets border
        setBorder(BorderFactory.createTitledBorder("Meat!"));          

        // Adds buttons to the panel
        add(hamBtn);
        add(turkeyBtn);
        add(roastBeefBtn);
        add(noneBtn);
    }

    public double getMeatCost() 
    {
        if (hamBtn.isSelected())
            return HAM;
        else if (turkeyBtn.isSelected())
            return TURKEY;
        else if (roastBeefBtn.isSelected())
            return ROAST_BEEF;
        else if (noneBtn.isSelected())
            return NO_MEAT;
        else
            return 0.00;
    }

}
