package unittests;

import static org.junit.Assert.*;

import javax.swing.JTextField;

import org.junit.Test;

import Librarian.showBookInfo;
import common.dbInfo;
import reader.findBookGUI;
/**
 * 
 *  @author Team 11 - Dima Spektor,Hadi Maaruf,Nadav Rosenfeld,Tomer Barak 
 *  The testing checks if the title of the deleted book is not exist
 *
 */
public class deleteBookNotExist {
	public dbInfo info;
	public String titleBook = "50 shades of gray";
	public showBookInfo test;

	@Test
	public void test() {
		
		info=new dbInfo("iBook", "root","root","localhost");
		test = new showBookInfo(info);
		test.frameShowBookInfo.setVisible(false);
		test.frameShowBookInfo.dispose();
		test.textFieldTitle_1.setText(titleBook);
		String expected = "Book not have on database";
		test.deleteBtnButton.doClick();
		assertTrue(expected.equals(test.testStr));
		
	}

}
