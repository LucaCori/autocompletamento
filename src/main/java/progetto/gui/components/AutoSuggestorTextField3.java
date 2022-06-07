package progetto.gui.components;

import java.util.List;

import javax.swing.JTextField;
import javax.swing.KeyStroke;

import progetto.Words;

/**
*
* Author https://stackabuse.com/example-adding-autocomplete-to-jtextfield/
*
*/

@SuppressWarnings("serial")
public class AutoSuggestorTextField3 extends JTextField{
	
	private static final String COMMIT_ACTION = "commit";
	
	public AutoSuggestorTextField3() {
        super();
        List<String> words = Words.getWords();
        this.setFocusTraversalKeysEnabled(false);
        AutoComplete autoComplete = new AutoComplete(this, words);
        this.getDocument().addDocumentListener(autoComplete);
        this.getInputMap().put(KeyStroke.getKeyStroke("TAB"), COMMIT_ACTION);
        this.getActionMap().put(COMMIT_ACTION, autoComplete.new CommitAction());
	}
}
