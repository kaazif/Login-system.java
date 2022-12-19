import java.util.HashMap;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("kaazif","kaazif");
		logininfo.put("kaaazzzif","kaaazzzif123");
		logininfo.put("kaaazzziffffffffffffff","kaaazzziffffffffffffff");
		
	
	}
	
	protected HashMap getLoginInfo () {
		return logininfo;
		
	}
	
}
