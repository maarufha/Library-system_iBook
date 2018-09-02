package unittests;

import static org.junit.Assert.*;
import org.junit.Test;
import common.dbInfo;
import reader.findBookGUI;
/**
 * 
 *  @author Team 11 - Dima Spektor,Hadi Maaruf,Nadav Rosenfeld,Tomer Barak 
 *  The testing checks if the input of book is empty or not
 *
 */
public class searchBookEmptyInput {
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
		test.keywordsField.setText("");
		test.btnsearch.doClick();
		assertTrue("You must fill at least 1 field".equals(test.testStr));	
		}

}
