package org.homeunix.thecave.buddi.view.menu.menus;

import ca.digitalcave.moss.swing.MossFrame;
import ca.digitalcave.moss.swing.MossMenu;
import org.homeunix.thecave.buddi.i18n.keys.MenuKeys;
import org.homeunix.thecave.buddi.model.prefs.PrefsModel;
import org.homeunix.thecave.buddi.plugin.BuddiPluginFactory;
import org.homeunix.thecave.buddi.plugin.api.BuddiPanelPlugin;
import org.homeunix.thecave.buddi.view.MainFrame;
import org.homeunix.thecave.buddi.view.menu.items.PanelMenuEntry;
import org.homeunix.thecave.buddi.view.menu.items.SingletonPanelMenuEntry;

import java.util.List;

/**
 *
 * @author mpeccorini
 */
public class ViewPanelsMenu extends MossMenu {

	public static final long serialVersionUID = 0;

	public ViewPanelsMenu(MossFrame frame) {
		super(frame, PrefsModel.getInstance().getTranslator().get(MenuKeys.MENU_VIEW_PANELS));
	}

	@SuppressWarnings("unchecked")
	@Override
	public void updateMenus() {
		SingletonPanelMenuEntry menuEntry;
		MainFrame mainFrame = (MainFrame) getFrame();
		this.removeAll();

		for (BuddiPanelPlugin plugin : (List<BuddiPanelPlugin>) BuddiPluginFactory.getPlugins(BuddiPanelPlugin.class)) {
			if (plugin.isSingleton()) {
				menuEntry = new SingletonPanelMenuEntry(mainFrame, plugin);
				menuEntry.setSelected(mainFrame.isPanelOpen(plugin));
				this.add(menuEntry);
			} else {
				this.add(new PanelMenuEntry((MainFrame) getFrame(), plugin));
			}
		}
		super.updateMenus();
	}
}
