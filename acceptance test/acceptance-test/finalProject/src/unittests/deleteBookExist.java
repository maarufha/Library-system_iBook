package unittests;

import static org.junit.Assert.*;


import org.junit.Test;

import Librarian.showBookInfo;
import common.dbInfo;
import reader.findBookGUI;
/**
 * 
 *  @author Team 11 - Dima Spektor,Hadi Maaruf,Nadav Rosenfeld,Tomer Barak 
 *  The testing checks if the title of the deleted book is exist on database
 *
 */
public class deleteBookExist {
	public dbInfo info;
	private String titleBook = "THE HUNGER GAMES";
	public showBookInfo test;

	@Test
	public void test() {
		
		info=new dbInfo("iBook", "root","root","localhost");
		test = new showBookInfo(info);
		test.frameShowBookInfo.setVisible(false);
		test.frameShowBookInfo.dispose();
		test.textFieldTitle_1.setText(titleBook);
    	String expected = "Book exist";
		test.deleteBtnButton.doClick();
		assertTrue(expected.equals(test.testStr));
		
	}

}
