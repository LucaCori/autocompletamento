package progetto.gui;

import java.awt.Color;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import progetto.Words;
import progetto.gui.components.AutoSuggestorComboBox;
import progetto.gui.components.AutoSuggestorTextField1;
import progetto.gui.components.AutoSuggestorTextField2;
import progetto.gui.components.AutoSuggestorTextField3;
import progetto.gui.components.SaveButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.BorderLayout;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Frame extends JFrame {

	private AutoSuggestorComboBox comboBox = new AutoSuggestorComboBox();
	
    private JPanel panel = new JPanel();       
    
    private AutoSuggestorTextField2 textField = new AutoSuggestorTextField2(this, null, Color.WHITE.brighter(), Color.BLUE, Color.RED, 0.75f);
    
    private AutoSuggestorTextField1 jtextfield = new AutoSuggestorTextField1();
    
    private AutoSuggestorTextField3 textField_3 = new AutoSuggestorTextField3();
    
    private SaveButton button = new SaveButton("Save Text");
    
    public Frame() {
    	init();
    }

	private void init() {
    	this.setTitle("typeAhead");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(280, 150, 500, 300);
        this.panel.setBorder(new EmptyBorder(100, 100, 100, 100));        
        this.button.setTextField(textField);
    	List<String> words = Words.getWords();
        this.textField.setDictionary(words);        
        this.textField.setColumns(10);
        this.getContentPane().add(panel, BorderLayout.WEST);      
        this.comboBox.setBounds(113, 28, 200, 22);
        this.button.setComboBox(comboBox);
        this.setVisible(true);
        this.jtextfield.setColumns(10);
        this.button.setJTextField(jtextfield);
        this.textField_3.setColumns(10);
        this.button.setTextField_3(textField_3);
        
        JLabel lblNewLabel = new JLabel("Inserisci la frase");
        
        JLabel lblNewLabel_1 = new JLabel("Inserisci la frase");
        
        JLabel lblNewLabel_2 = new JLabel("Inserisci la frase");
        
        JLabel lblNewLabel_3 = new JLabel("Inserisci la frase");
        
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_panel.createSequentialGroup()
        					.addComponent(lblNewLabel_1)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jtextfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
        					.addComponent(button, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(69))
        				.addGroup(gl_panel.createSequentialGroup()
        					.addComponent(lblNewLabel_2)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())
        				.addGroup(gl_panel.createSequentialGroup()
        					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_panel.createSequentialGroup()
        							.addComponent(lblNewLabel_3)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
        						.addGroup(gl_panel.createSequentialGroup()
        							.addComponent(lblNewLabel)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addGap(317))))
        );
        gl_panel.setVerticalGroup(
        	gl_panel.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addGap(0, 0, Short.MAX_VALUE)
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel_3)
        				.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(17)
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel)
        				.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(26)
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jtextfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(button, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblNewLabel_1))
        			.addGap(18)
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel_2)
        				.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(29))
        );
        panel.setLayout(gl_panel);
        this.pack();
	}
}