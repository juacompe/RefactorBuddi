/*
 * Created on Aug 6, 2007 by wyatt
 */
package org.homeunix.thecave.buddi.view.menu.items;

import ca.digitalcave.moss.swing.MossMenuItem;
import org.homeunix.thecave.buddi.i18n.keys.MenuKeys;
import org.homeunix.thecave.buddi.model.AccountType;
import org.homeunix.thecave.buddi.model.Document;
import org.homeunix.thecave.buddi.model.prefs.PrefsModel;
import org.homeunix.thecave.buddi.view.MainFrame;

import java.awt.event.ActionEvent;

public class ViewRollAllAccounts extends MossMenuItem {
	public static final long serialVersionUID = 0;
	
	public ViewRollAllAccounts(MainFrame frame) {
		super(frame, PrefsModel.getInstance().getTranslator().get(MenuKeys.MENU_EDIT_ROLL_ALL_ACCOUNTS));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (!(getFrame() instanceof MainFrame))
			throw new RuntimeException("Calling frame not instance of MainFrame");
			
		for (AccountType at  : ((Document) ((MainFrame) getFrame()).getDocument()).getAccountTypes()) {
			at.setExpanded(false);
		}
		
		((MainFrame) getFrame()).updateContent();
	}
}
