package projekt;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class BinEjb {
	
	public String text() {

		return "hello";
	}

}
