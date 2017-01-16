/*
 * Created on Aug 5, 2007 by wyatt
 */
package org.homeunix.thecave.buddi.view.swing;

import org.homeunix.thecave.buddi.model.BudgetCategory;
import org.homeunix.thecave.buddi.plugin.api.util.TextFormatter;

import javax.swing.*;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;

public class MyBudgetTreeNameCellRenderer extends DefaultTreeCellRenderer {
	public static final long serialVersionUID = 0;


	@Override
	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
		this.setIcon(null);
		
		if (value instanceof BudgetCategory)
			this.setText(TextFormatter.getHtmlWrapper(
					TextFormatter.getDeletedWrapper(
							TextFormatter.getFormattedNameForCategory((BudgetCategory) value), (BudgetCategory) value)));
		else
			this.setText("");

		return super.getTreeCellRendererComponent(tree, this.getText(), sel, expanded, leaf, row, hasFocus);
	}
}
