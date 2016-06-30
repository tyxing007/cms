package com.yuanluesoft.bbs.base.actions;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;

import com.yuanluesoft.bbs.usermanage.model.BbsSessionInfo;
import com.yuanluesoft.jeaf.action.BaseAction;
import com.yuanluesoft.jeaf.base.model.Link;
import com.yuanluesoft.jeaf.system.exception.SystemUnregistException;
import com.yuanluesoft.jeaf.util.Environment;

/**
 * 
 * @author yuanluesoft
 *
 */
public class BbsBaseAction extends BaseAction {

	
	public BbsBaseAction() {
		super();
		sessionInfoClass = BbsSessionInfo.class;
	}

	/* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.base.actions.BaseAction#getLoginPageURL()
	 */
	protected Link getLoginPageLink(ActionForm form, HttpServletRequest request) throws SystemUnregistException {
		return new Link(Environment.getWebApplicationSafeUrl() + "/bbs/usermanage/login.shtml?siteId=" + request.getParameter("siteId"), "utf-8"); 
	}
}