package unittests;

import static org.junit.Assert.*;


import org.junit.Test;

import Librarian.showBookInfo;
import common.dbInfo;
import reader.findBookGUI;
/**
 * 
 * @author Team 11 - Dima Spektor,Hadi Maaruf,Nadav Rosenfeld,Tomer Barak 
 * The testing checks if the title of the deleted book is empty or not
 *
 */
public class deleteBookEmptyInput {
	public dbInfo info;
	private String emptyString = "";
	private showBookInfo test;

	@Test
	public void test() {
		
		info=new dbInfo("iBook", "root","root","localhost");
		test = new showBookInfo(info);
		test.frameShowBookInfo.setVisible(false);
		test.frameShowBookInfo.dispose();
		test.textFieldTitle_1.setText(emptyString);
		String expected = "Empty input";
		test.deleteBtnButton.doClick();
		assertTrue(expected.equals(test.testStr));
		
	}

}
