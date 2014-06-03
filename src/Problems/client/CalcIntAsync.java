package Problems.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface CalcIntAsync {
	void greetServer(String i1,String i2,String i3, AsyncCallback<String> callback)
			throws IllegalArgumentException;
}
