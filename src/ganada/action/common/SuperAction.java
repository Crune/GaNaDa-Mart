package ganada.action.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface SuperAction {
    public String executeAction(
	    HttpServletRequest request, HttpServletResponse response
	    ) throws Exception;
}
