/*
 * Created on Aug 6, 2007 by wyatt
 */
package org.homeunix.thecave.buddi.view.menu.items;

import ca.digitalcave.moss.swing.MossFrame;
import ca.digitalcave.moss.swing.MossMenuItem;
import org.homeunix.thecave.buddi.Buddi;
import org.homeunix.thecave.buddi.i18n.keys.MenuKeys;
import org.homeunix.thecave.buddi.plugin.api.util.TextFormatter;

import java.awt.event.ActionEvent;

public class HelpCheckForUpdates extends MossMenuItem {
	public static final long serialVersionUID = 0;

	public HelpCheckForUpdates(MossFrame frame) {
		super(frame, TextFormatter.getTranslation(MenuKeys.MENU_HELP_CHECK_FOR_UPDATES));
	}

	public void actionPerformed(ActionEvent e) {
		Buddi.doUpdateCheck(getFrame());
	}
}
