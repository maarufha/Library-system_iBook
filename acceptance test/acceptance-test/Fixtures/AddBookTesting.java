
import fit.ActionFixture;

import fit.ColumnFixture;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Librarian.*;
import common.dbInfo;
import DBcontroller.*;
public class AddBookTesting extends ActionFixture{
	String scope,subject,title,author,language,plot,tableOfContents,urlDoc,urlPdf;
	String price;
	public dbInfo infoConnectDatabase= new dbInfo("ibook","root","root","localhost");
	addBook addBook= new addBook(infoConnectDatabase);
	public void setScope(String scope){this.scope=scope;}
	public void setSubject(String subject){this.subject=subject;}
	public void setTitle(String title){this.title=title;}
	public void setAuthor(String author){this.author=author;}
	public void setLanguage(String language){this.language=language;}
	public void setPlot(String plot){this.plot=plot;}
	public void setPrice(String price){this.price=price;}
	public void setTableOfContents(String tableOfContents){this.tableOfContents=tableOfContents;}
	public void setUrlDoc(String urlDoc){this.urlDoc=urlDoc;}
	public void setUrlPdf(String urlPdf){this.urlPdf=urlPdf;}
	
	public boolean addBookCreate(){
		try {
			ArrayList<String> scopeDatabase = new ArrayList<String>();
			scopeDatabase = (ArrayList<String>) getScopeFromDB.getScopeFromDB(infoConnectDatabase);
			boolean valid=scopeDatabase.contains(scope)? true: false;
			if(valid== false)
				return false;
			addBook.scopeComboBox.setSelectedItem(scope);
			ArrayList<String> SubjectDatabase = new ArrayList<String>();
			SubjectDatabase = (ArrayList<String>) getSubjectFromDB.getSubjectFromDB(infoConnectDatabase,
					scope);
			boolean valid2=SubjectDatabase.contains(subject)? true: false;
			if(valid2== false)
				return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//addBook.scopeComboBox.getse
		addBook.textFieldNameBook.setText(title);
		addBook.textFieldAuthor.setText(author);
		addBook.textFieldLanguage.setText(language);
		addBook.textFieldPrice.setText(price);
		addBook.textFieldTBN.setText(tableOfContents);
		addBook.textFieldPlot.setText(plot);
		addBook.textFieldDOC.setText(urlDoc);
		addBook.textFieldPDF.setText(urlPdf);
		if (addBook.textFieldNameBook.getText().equals("")) {
			return false;
		} else if (addBook.textFieldAuthor.getText().equals("")) {
			return false;
		}  else if (addBook.textFieldLanguage.getText().equals("")) {
			return false;
		} else if (addBook.textFieldPlot.getText().equals("")) {
			return false;
		} else if (addBook.textFieldPrice.getText().equals("")) {
			return false;
		} else if (addBook.textFieldTBN.getText().equals("")) {
			return false;
		} else if (addBook.textFieldDOC.getText().equals("")) {
			return false;
		} else if (addBook.textFieldPDF.getText().equals("")) {
			return false;
		} 
		else
			return true;
	}
	

	
}
