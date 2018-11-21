package nuc.sw.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		ActionContext ac = arg0.getInvocationContext();
		String user = (String)ac.getSession().get("user");
		if(user != null && user.equals("wangchu")){
			return arg0.invoke();
		} else {
			
			((ActionSupport)arg0.getAction()).addActionError("ÇëÏÈµÇÂ¼£¡");
			return Action.LOGIN;
		}
	}

}
