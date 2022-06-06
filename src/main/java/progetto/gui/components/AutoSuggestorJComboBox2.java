package progetto.gui.components;

import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;

import progetto.Words;

/**
 * 
 * <!-- https://mvnrepository.com/artifact/com.glazedlists/glazedlists -->
 *
 */

@SuppressWarnings("serial")
public class AutoSuggestorJComboBox2 extends JComboBox<String> {

	public AutoSuggestorJComboBox2() {
        super();
        DefaultComboBoxModel model = new DefaultComboBoxModel(Words.getWordsObjects());
        this.setModel(model);
		AutoCompleteDecorator.decorate(this);
   
	}
}
