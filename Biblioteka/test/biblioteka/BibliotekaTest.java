package biblioteka;

import org.junit.jupiter.api.Test;

import biblioteka.interfejs.BibliotekaInterfejs;
import biblioteka.interfejs.BibliotekaInterfejsTest;

class BibliotekaTest extends BibliotekaInterfejsTest {
	
	@Override
	public BibliotekaInterfejs getInstance() {
		// TODO Auto-generated method stub
		return new Biblioteka();
	}

}
