/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbl;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author nishom
 */
public class ExampleTable {

public JPanel createTable() {               
    JPanel totalGUI = new JPanel();

    //define titles for table
    String[] title = {"TITLE1", "TITLE2", "TITLE3"};

    //table data
    Object[][] playerdata = {       
    {new Integer(34), "Steve", "test test test"},
    {new Integer(32), "Patrick", "dumdi dumdi dummdi dumm di di didumm"},
    {new Integer(10), "Sarah", "blabla bla bla blabla bla bla blabla"},};

    //create object 'textTable'
    JTable textTable = new JTable(playerdata,title);

    //set column width
    textTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 
    textTable.getColumnModel().getColumn(0).setPreferredWidth(60);
    textTable.getColumnModel().getColumn(1).setPreferredWidth(60);
    textTable.setDefaultRenderer(String.class, new RowHeightCellRenderer());

    //scrollbar
    JScrollPane scrollPane = new JScrollPane(textTable);

    totalGUI.add(scrollPane);               
    return totalGUI;
}

private static void createAndShowGUI() {

    //create main frame
    JFrame mainFrame = new JFrame("");
    ExampleTable test = new ExampleTable();

    JPanel totalGUI = new JPanel();
    totalGUI = test.createTable();

    //visible mode
    mainFrame.add(totalGUI); //integrate main panel to main frame
    mainFrame.pack();
    mainFrame.setVisible(true);     
}


public static void main (String[] args) {               

    createAndShowGUI();     

}//main
}