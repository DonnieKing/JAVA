package nuc.sw.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class clearSessionAction extends ActionSupport {
	
	
	public String clearSessionMethod() throws Exception {
	ActionContext ac = ActionContext.getContext();
	Map session = ac.getSession();
	session.remove("tel");
 
	return "clearSessionOK";
	
	}
}
