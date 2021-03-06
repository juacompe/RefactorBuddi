/*
 * Created on Aug 7, 2007 by wyatt
 */
package org.homeunix.thecave.buddi.view.menu.menus;

import ca.digitalcave.moss.swing.MossDocumentFrame;
import ca.digitalcave.moss.swing.MossFrame;
import ca.digitalcave.moss.swing.MossMenu;
import org.homeunix.thecave.buddi.i18n.keys.MenuKeys;
import org.homeunix.thecave.buddi.model.prefs.PrefsModel;
import org.homeunix.thecave.buddi.plugin.BuddiPluginFactory;
import org.homeunix.thecave.buddi.plugin.api.BuddiSynchronizePlugin;
import org.homeunix.thecave.buddi.view.menu.items.PluginMenuEntry;

import java.util.List;

public class FileSynchronizeMenu extends MossMenu {
	public static final long serialVersionUID = 0;
	
	public FileSynchronizeMenu(MossFrame frame) {
		super(frame, PrefsModel.getInstance().getTranslator().get(MenuKeys.MENU_FILE_SYNCHRONIZE));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void updateMenus() {
		this.removeAll();
		
		for (BuddiSynchronizePlugin plugin : (List<BuddiSynchronizePlugin>) BuddiPluginFactory.getPlugins(BuddiSynchronizePlugin.class)) {
			if (getFrame() instanceof MossDocumentFrame)
				this.add(new PluginMenuEntry((MossDocumentFrame) getFrame(), plugin));
		}
		
		this.setEnabled(getFrame() instanceof MossDocumentFrame && this.getComponentCount() > 0);
		
		super.updateMenus();
	}
}
