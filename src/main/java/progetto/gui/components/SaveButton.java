package progetto.gui.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SaveButton extends JButton {
	
	protected static final String fileName = "C:\\Users\\iubar\\Desktop\\Dati_Salvati.txt";
	private JTextField textField = null;
	private int counter = 0;

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
	
	private void read(String[] frasi) {
		try {
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
	private void write(String[] frasi){
		read(frasi);
		System.out.println(this.counter);
		try {
			FileWriter fw = new FileWriter(fileName);
			for(int i = 0; i < this.counter; i++) {
				fw.write(frasi[i] + "\r\n");
			}
			fw.write(SaveButton.this.textField.getText());
			fw.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public SaveButton(String string) {
		super(string);
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] frasi = new String[10];
				write(frasi);
			}
		});
	}

 
	
}