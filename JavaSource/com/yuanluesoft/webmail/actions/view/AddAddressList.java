package com.yuanluesoft.webmail.actions.view;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yuanluesoft.j2oa.addresslist.service.AddressListService;
import com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo;
import com.yuanluesoft.jeaf.view.forms.ViewForm;
import com.yuanluesoft.webmail.pojo.Mail;
import com.yuanluesoft.webmail.service.WebMailService;

/**
 * 
 * @author linchuan
 *
 */
public class AddAddressList extends WebmailViewAction {

    /* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.view.actions.ViewFormAction#executeCutsomAction(org.apache.struts.action.ActionMapping, com.yuanluesoft.jeaf.view.forms.ViewForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, com.yuanluesoft.jeaf.sessionmanage.model.SessionInfo)
	 */
	public ActionForward executeCutsomAction(ActionMapping mapping, ViewForm viewForm, HttpServletRequest request, HttpServletResponse response, SessionInfo sessionInfo) throws Exception {
		String selectedIds = viewForm.getViewPackage().getSelectedIds();
        AddressListService addressListService = (AddressListService)getService("addressListService");
        WebMailService webMailService = (WebMailService)getService("webMailService");
        if(selectedIds!=null && !selectedIds.equals("")) { //删除选中的邮件
            String[] ids = selectedIds.split(",");
            for(int i=0; i<ids.length; i++) {
                //获取邮件
                Mail mail = webMailService.receiveMail(Long.parseLong(ids[i]), false, sessionInfo);
                //加入到通讯录
                addressListService.addAddressList(mail.getMailFrom(), sessionInfo);
            }
        }
        viewForm.getViewPackage().setSelectedIds(null);
        return mapping.getInputForward();
	}
}