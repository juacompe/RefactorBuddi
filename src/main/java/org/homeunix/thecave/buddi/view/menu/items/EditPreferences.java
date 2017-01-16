/*
 * Created on Aug 6, 2007 by wyatt
 */
package org.homeunix.thecave.buddi.view.menu.items;

import ca.digitalcave.moss.swing.MossFrame;
import ca.digitalcave.moss.swing.MossMenuItem;
import ca.digitalcave.moss.swing.exception.WindowOpenException;
import org.homeunix.thecave.buddi.i18n.BuddiKeys;
import org.homeunix.thecave.buddi.i18n.keys.MenuKeys;
import org.homeunix.thecave.buddi.model.prefs.PrefsModel;
import org.homeunix.thecave.buddi.view.PreferencesFrame;

import java.awt.event.ActionEvent;

public class EditPreferences extends MossMenuItem {
	public static final long serialVersionUID = 0;
	
	public EditPreferences(MossFrame frame) {
		super(frame, PrefsModel.getInstance().getTranslator().get(MenuKeys.MENU_EDIT_PREFERENCES));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		PreferencesFrame prefs = new PreferencesFrame();
		try {
			prefs.openWindow(
					null, 
					PrefsModel.getInstance().getWindowLocation(BuddiKeys.PREFERENCES.toString()));
		}
		catch (WindowOpenException woe){}
	}
}
