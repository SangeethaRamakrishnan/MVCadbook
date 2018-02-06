/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*package mvc.views;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import mvc.controller.AddressBookController;
import mvc.models.Person;

/**
 *
 * @author Administrator
 */
/* public class SearchDialog {
    
}*/
package mvc.views;
//import javax.swing.JOptionPane;
// vo object class
import mvc.models.Person;

// for GUI
import java.awt.BorderLayout;
import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.JButton;
//import javax.swing.JComponent;
import javax.swing.JFrame;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
import mvc.controller.AddressBookController;

/**
 *
 * @author Admin
 */
public class SearchDialog {//implements ActionListener{
    private JFrame frame;
    private SearchPanel SearchPanel;
    final private JButton submitButton;
    private JButton cancelButton;
    private JPanel panel_btn;
   private Person  person;
   private AddressBookController controller;

    
    public SearchDialog(String name){
        frame = new JFrame(name);
        frame.getContentPane().setLayout(new BorderLayout());
        //frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
         frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(350, 250);
       frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
       SearchPanel = new SearchPanel();
        frame.getContentPane().add(SearchPanel,BorderLayout.CENTER);
        
        panel_btn= new JPanel();
        panel_btn.setLayout(new GridLayout(1, 2));
        
        submitButton= new JButton("Submit");
        panel_btn.add(submitButton);
        
        cancelButton = new JButton("Cancel");
        panel_btn.add(cancelButton);
        
        frame.getContentPane().add(panel_btn,BorderLayout.SOUTH);
        
        
    }
    
   
    
    public JButton getSubmitButton()
            {
                return submitButton;
            }
    
    
     public JButton getcancelButton()
            {
                return cancelButton;
            }
    public JFrame getFrame()
    {
        return frame;
    }
   
    /**
     *
     * @return
     */
    public SearchPanel getPanel()
    {
    //detailsPanel.getNameField();
        return SearchPanel;
    }
 
    
    public void getValues()
    {
        System.out.println("name from getValues"+SearchPanel.getNameField().getText());
    }
    public Person getPerson()
    {
        return person;
    }

   
   

}