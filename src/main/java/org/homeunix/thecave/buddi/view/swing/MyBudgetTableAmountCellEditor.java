/*
 * Created on Aug 5, 2007 by wyatt
 */
package org.homeunix.thecave.buddi.view.swing;

import ca.digitalcave.moss.swing.MossDecimalField;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.util.EventObject;

public class MyBudgetTableAmountCellEditor extends AbstractCellEditor implements TableCellEditor {
	public static final long serialVersionUID = 0;

	private final MossDecimalField editor;

	public MyBudgetTableAmountCellEditor(MossDecimalField editor) {
		this.editor = editor;
		this.editor.setBorder(new LineBorder(Color.black));
	}

	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		if (value instanceof Object[]){
			Object[] values = (Object[]) value;
			editor.setValue((Long) values[1]);
		}
		else
			editor.setValue(0);
		return editor;
	}

	public Object getCellEditorValue() {
		return editor.getValue();
	}

	@Override
	public boolean isCellEditable(EventObject arg0) {
		return true;
	}
}
