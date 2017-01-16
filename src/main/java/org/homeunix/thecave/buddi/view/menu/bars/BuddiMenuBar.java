/*
 * Created on Aug 7, 2007 by wyatt
 */
package org.homeunix.thecave.buddi.view.menu.bars;

import ca.digitalcave.moss.swing.MossFrame;
import ca.digitalcave.moss.swing.MossMenuBar;
import org.homeunix.thecave.buddi.view.menu.menus.*;

public class BuddiMenuBar extends MossMenuBar {
	public static final long serialVersionUID = 0;

	public BuddiMenuBar(MossFrame frame) {
		super(frame);

		this.add(new FileMenu(frame));
		this.add(new EditMenu(frame));
		this.add(new ViewMenu(frame));
		this.add(new WindowMenu(frame));
		this.add(new HelpMenu(frame));
	}
}
