import java.awt.GridLayout;
import javax.swing.*;
/**
 * Part 1: This class represents the 3 types of bread available to order.
 * @author Austin Walley
 * @version 11/18/21
*/

public class BreadPanel extends JPanel 
{
    private static final long serialVersionUID = 1L;
    
    private static final double WHITE_BREAD = 2.25;
    private static final double WHEAT_BREAD = 3.25;
    private static final double GF_BREAD = 4.00;

    private JRadioButton whiteBtn;
    private JRadioButton wheatBtn;
    private JRadioButton glutenFreeBtn;
    private ButtonGroup grp;
       
    /**
     * Constructor
    */
    public BreadPanel() 
    {
        super();
        // Sets layout
        setLayout(new GridLayout(3, 1));
        
        // Creates buttons
        whiteBtn = new JRadioButton("White", true);
        wheatBtn = new JRadioButton("Wheat");
        glutenFreeBtn = new JRadioButton("Gluten Free");

        // Creates button group
        ButtonGroup grp = new ButtonGroup();
        
        // Adds buttons to group
        grp.add(whiteBtn);
        grp.add(wheatBtn);
        grp.add(glutenFreeBtn);

        // Sets border
        setBorder(BorderFactory.createTitledBorder("Bread!"));
        
        // Adds buttons to the panel
        add(whiteBtn);
        add(wheatBtn);
        add(glutenFreeBtn);
    }

    /**
     * Instance method that takes no param and returns the cost of the bread.
     * @return cost of breads.
    */
    public double getBreadCost() 
    {
        if (whiteBtn.isSelected())
            return WHITE_BREAD;
        else if (wheatBtn.isSelected())
            return WHEAT_BREAD;
        else if (glutenFreeBtn.isSelected())
            return GF_BREAD;
        else
            return 0.00;
    }

}