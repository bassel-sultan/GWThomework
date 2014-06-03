package Problems.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface CalcInt extends RemoteService {
	String greetServer(String op1,String op2,String op3) throws IllegalArgumentException;
}
