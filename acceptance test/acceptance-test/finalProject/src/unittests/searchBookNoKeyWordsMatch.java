package unittests;

import static org.junit.Assert.*;
import org.junit.Test;
import common.dbInfo;
import reader.findBookGUI;
/**
 * 
 * @author Team 11 - Dima Spektor,Hadi Maaruf,Nadav Rosenfeld,Tomer Barak 
 * The testing checks if the input of search book not found key words
 *
 */
public class searchBookNoKeyWordsMatch {
	public dbInfo info;
	private findBookGUI test;
	@Test
	public void test() {
		info=new dbInfo("iBook", "root","root","localhost");
		test = new findBookGUI(info);
		test.frmfindBook.setVisible(false);
		test.frmfindBook.dispose();
		test.titleField.setText("");
		test.authorField.setText("");
		test.authorField2.setText("");
		test.languageField.setText("");
		test.contentsField.setText("");
		test.summaryField.setText("");
		test.keywordsField.setText("mother");
		test.btnsearch.doClick();
		assertTrue("zeroResults".equals(test.testStr));	}

}
