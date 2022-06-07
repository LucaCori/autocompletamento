package progetto.gui.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SaveButton extends JButton {
	
	protected static final String fileName = "C:\\Users\\iubar\\Desktop\\Dati_Salvati.txt";
	private JTextField textField = null;
	private JTextField jtextfield = null;
	private JTextField textField_3 = null;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox = null;
	private int counter = 0;
	private final int dimension = 10;

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
	public void setJTextField(JTextField jtextfield) {
		this.jtextfield = jtextfield;
	}
	public void setComboBox(@SuppressWarnings("rawtypes") JComboBox comboBox) {
		this.comboBox = comboBox;
	}
	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}
	
	private void read(String[] frasi) {
		try {
			this.counter = 0;
			FileReader Dati_Salvati_r = new FileReader(fileName);
			BufferedReader br = new BufferedReader(Dati_Salvati_r);
			String tmp = "";
			do{
				tmp = br.readLine();
				if(tmp==null) {
					break;
				} else {
					frasi[this.counter] = tmp;
					this.counter++;
				}
			}while(Dati_Salvati_r!=null);
			br.close();
			Dati_Salvati_r.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	private void write(String[] frasi, String frase){
		read(frasi);
		try {
			FileWriter fw = new FileWriter(fileName);
			for(int i = 0; i < this.counter; i++) {
				fw.write(frasi[i] + "\r\n");
			}
			if(frase != null) {
				fw.write(frase);
			}
			fw.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public SaveButton(String string) {
		super(string);
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] frasi = new String[dimension];
				String frase = textField_3.getText();
				write(frasi, frase);
				frasi = new String[dimension];
				frase = textField.getText();
				write(frasi, frase);
				frasi = new String[dimension];
				frase = jtextfield.getText();
				write(frasi, frase);
				frasi = new String[dimension];
				if(comboBox.getEditor().getItem() != null) {
					frase = comboBox.getEditor().getItem().toString();
					write(frasi, frase);
				}
			}
		});
	}

 
	
}