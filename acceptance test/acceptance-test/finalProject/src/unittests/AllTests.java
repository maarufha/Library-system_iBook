package unittests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ deleteBookEmptyInput.class, deleteBookExist.class, deleteBookNotExist.class, searchBookEmptyInput.class,
		searchBookFound.class, searchBookKeyAndLanguage.class, searchBookNoAuthorMatch.class,
		searchBookNoKeyWordsMatch.class, searchBookNotFound.class })
public class AllTests {

}
