/*
 * Created on Aug 6, 2007 by wyatt
 */
package org.homeunix.thecave.buddi.view.menu.items;

import ca.digitalcave.moss.osx.HiddenMossFrame;
import ca.digitalcave.moss.swing.MossFrame;
import ca.digitalcave.moss.swing.MossMenuItem;
import org.homeunix.thecave.buddi.i18n.keys.MenuKeys;
import org.homeunix.thecave.buddi.model.prefs.PrefsModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class FileCloseWindow extends MossMenuItem {
	public static final long serialVersionUID = 0;
	
	public FileCloseWindow(MossFrame frame) {
		super(frame, 
				PrefsModel.getInstance().getTranslator().get(MenuKeys.MENU_FILE_CLOSE_WINDOW),
				KeyStroke.getKeyStroke(KeyEvent.VK_W, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
	}
	
	public void actionPerformed(ActionEvent e) {
		getFrame().closeWindow();
	}
	
	@Override
	public void updateMenus() {
		super.updateMenus();

		this.setEnabled(!(getFrame() instanceof HiddenMossFrame));
	}
}
