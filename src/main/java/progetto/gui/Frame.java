package progetto.gui;

import java.awt.Color;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Document;

import org.jdesktop.swingx.autocomplete.AutoCompleteDocument;

import progetto.Words;
import progetto.gui.components.AutoSuggestorJComboBox;
import progetto.gui.components.AutoSuggestorJComboBox2;
import progetto.gui.components.AutoSuggestorTextField1;
import progetto.gui.components.AutoSuggestorTextField2;
import progetto.gui.components.SaveButton;

import javax.swing.ActionMap;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

@SuppressWarnings("serial")
public class Frame extends JFrame {

	private AutoSuggestorJComboBox comboBox = new AutoSuggestorJComboBox();
	
    private JPanel panel = new JPanel();       
    
    private AutoSuggestorTextField2 textField = new AutoSuggestorTextField2(this, null, Color.WHITE.brighter(), Color.BLUE, Color.RED, 0.75f);
    
    private AutoSuggestorTextField1 jtextfield = new AutoSuggestorTextField1();
    
    private SaveButton button = new SaveButton("Save Text");
    
    private final JLabel lblNewLabel_3 = new JLabel("New label");

	private AutoSuggestorJComboBox2 comboBox_1;
    
    public Frame() {
    	init();
    }

	private void init() {
        GridBagLayout gbl_panel = new GridBagLayout();
        this.panel.setLayout(gbl_panel);
    	this.setTitle("typeAhead");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
    	List<String> words = Words.getWords();      
        
        JLabel lblNewLabel = new JLabel("New label");
        GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
        gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
        gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel.gridx = 1;
        gbc_lblNewLabel.gridy = 0;
        panel.add(lblNewLabel, gbc_lblNewLabel);
        this.textField.setDictionary(words);        
        this.textField.setColumns(10);
        GridBagConstraints gbc_textField = new GridBagConstraints();
        gbc_textField.anchor = GridBagConstraints.NORTHWEST;
        gbc_textField.insets = new Insets(0, 0, 5, 5);
        gbc_textField.gridx = 2;
        gbc_textField.gridy = 0;
        panel.add(textField, gbc_textField);
        
        JLabel lblNewLabel_1 = new JLabel("New label");
        GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
        gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
        gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_1.gridx = 1;
        gbc_lblNewLabel_1.gridy = 1;
        panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
        this.jtextfield.setColumns(10);
        GridBagConstraints gbc_jtextfield = new GridBagConstraints();
        gbc_jtextfield.anchor = GridBagConstraints.WEST;
        gbc_jtextfield.insets = new Insets(0, 0, 5, 5);
        gbc_jtextfield.gridx = 2;
        gbc_jtextfield.gridy = 1;
        panel.add(jtextfield, gbc_jtextfield);
        
        JLabel lblNewLabel_2 = new JLabel("New label");
        GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
        gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
        gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_2.gridx = 1;
        gbc_lblNewLabel_2.gridy = 2;
        panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
        this.comboBox.setBounds(113, 28, 200, 22);
        GridBagConstraints gbc_comboBox = new GridBagConstraints();
        gbc_comboBox.anchor = GridBagConstraints.NORTHWEST;
        gbc_comboBox.insets = new Insets(0, 0, 5, 5);
        gbc_comboBox.gridx = 2;
        gbc_comboBox.gridy = 2;
        panel.add(comboBox, gbc_comboBox);
        GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
        gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
        gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_3.gridx = 1;
        gbc_lblNewLabel_3.gridy = 3;
        panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
        
        comboBox_1 = new AutoSuggestorJComboBox2();
        GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
        gbc_comboBox_1.anchor = GridBagConstraints.NORTHWEST;
        gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
        gbc_comboBox_1.gridx = 2;
        gbc_comboBox_1.gridy = 3;
        panel.add(comboBox_1, gbc_comboBox_1);
        this.button.setTextField(textField);
        GridBagConstraints gbc_button = new GridBagConstraints();
        gbc_button.anchor = GridBagConstraints.NORTHEAST;
        gbc_button.insets = new Insets(0, 0, 0, 5);
        gbc_button.gridx = 3;
        gbc_button.gridy = 4;
        panel.add(button, gbc_button);
        this.getContentPane().add(panel, BorderLayout.CENTER);
        this.setSize(600, 400);
        this.setVisible(true);
        //this.pack();
	}
}