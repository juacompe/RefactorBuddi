/*
 * Created on Oct 24, 2007 by wyatt
 */
package org.homeunix.thecave.buddi.plugin.builtin.report;

import org.homeunix.thecave.buddi.plugin.api.util.TextFormatter;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.data.general.PieDataset;

import java.text.AttributedString;

public class BuddiPieSectionLabelGenerator extends StandardPieSectionLabelGenerator {
	public static final long serialVersionUID = 0;
	
	@SuppressWarnings("rawtypes")
	public AttributedString generateAttributedSectionLabel(PieDataset arg0, Comparable arg1) {
		return new AttributedString(generateSectionLabel(arg0, arg1));
	}
	
	@SuppressWarnings("rawtypes")
	public String generateSectionLabel(PieDataset arg0, Comparable arg1) {
		return super.generateSectionLabel(arg0, arg1) + ": " + TextFormatter.getFormattedCurrency(arg0.getValue(arg1).longValue(), false, false);
	}
}
