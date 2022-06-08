package progetto.gui.components;

import javax.swing.JComboBox;

import ca.odell.glazedlists.GlazedLists;
import ca.odell.glazedlists.swing.AutoCompleteSupport;
import progetto.Words;

/**
 * 
 * <!-- https://mvnrepository.com/artifact/com.glazedlists/glazedlists -->
 *
 */

@SuppressWarnings("serial")
public class AutoSuggestorComboBox extends JComboBox<String>{

	public AutoSuggestorComboBox() {
        super();
        String[] elements = Words.getWordsObjects();
        AutoCompleteSupport.install((JComboBox<String>)this, GlazedLists.eventListOf(elements));
	}
}
