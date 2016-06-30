package com.yuanluesoft.jeaf.dataimport.services.npqi;

import java.util.ArrayList;
import java.util.List;

import com.yuanluesoft.cms.sitemanage.dataimporter.SiteDataImporter;
import com.yuanluesoft.jeaf.dataimport.services.DataImportService;

/**
 * 
 * @author linchuan
 *
 */
public class DataImportServiceImpl extends DataImportService {
	
	/* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.dataimport.services.DataImportService#getName(java.lang.String)
	 */
	public String getName() {
		return "南平质监";
	}

	/* (non-Javadoc)
	 * @see com.yuanluesoft.jeaf.dataimport.services.DataImportService#getDataImporters()
	 */
	protected List getDataImporters() {
		List dataImporters = new ArrayList();
		//站点数据导入
		/*dataImporters.add(new SiteDataImporter() {
			public String generateListChildDirectoriesSQL(String parentDirectoryId) {
				if(parentDirectoryId==null) { //第一级目录
					return "select distinct ('first_' & ChannelId) as directoryId," +
						   " ChannelName as directoryName" +
						   " from PE_Channel" +
						   " where ChannelId in (select ChannelId from PE_Article)" +
						   " order by ChannelName";
				}
				else if(parentDirectoryId.startsWith("first_")) { //第一级目录
					return "select distinct ('second_' & ClassId) as directoryId," +
						   " ClassName as directoryName" +
						   " from PE_Class" +
						   " where ChannelId=" + parentDirectoryId.substring("first_".length()) +
						   " and ClassId in (select ClassId from PE_Article)" +
						   " order by ClassName";
				}
				return null;
			}

			public String[] generateRetrieveDataSQL() {
				return new String[] {"select " +
					   "iif(ClassId=-1, 'first_' & ChannelId, 'second_' & ClassId) as directoryId," + //原来的栏目ID
					   "title as subject," + //标题
					   "Content as body," + //正文
					   "subheading as subhead," + //副标题
					   "CopyFrom as source," + //来源
					   "Author," + //作者
					   "keyword," + //关键字
					   "CreateTime as created," + //创建时间
					   "UpdateTime as issueTime," + //发布时间
					   "inputer as editor," + //创建者
					   "'' as orgName," + //创建者所在部门名称
					   "'' as unitName" + //创建者所在单位名称
					   " from PE_Article"};
			}

			public String updateAttachmentPath(String htmlBody) {
				if(htmlBody==null) {
					return htmlBody;
				}
				htmlBody = super.updateAttachmentPath(htmlBody);
				return htmlBody = htmlBody.replaceAll("src=\"\\[InstallDir_ChannelDir\\]\\{\\$UploadDir\\}", "src=\"" + sourceSiteURL + "Article/UploadFiles").replaceAll("href=\"\\[InstallDir_ChannelDir\\]\\{\\$UploadDir\\}", "href=\"" + sourceSiteURL + "Article/UploadFiles");
			}
		});
		
		//留言板导入
		dataImporters.add(new MessageBoardImporter() {
			public String[] generateRetrieveDataSQL() {
				return new String[] {"select " +
					   "(year(GuestDatetime) & '' & month(GuestDatetime) & day(GuestDatetime) & GuestId) as sn," + //编号
					   "'' as queryPassword," + //查询密码
					   "GuestTitle as subject," + //主题
					   "GuestContent as content," + //正文
					   "GuestName as creator," + //创建人姓名
					   "GuestDatetime as created," + //创建时间
					   "'' as creatorTel," + //联系电话
					   "GuestEMail as creatorMail," + //邮箱
					   "iif(GuestSex='1', 'M', 'F') as creatorSex," + //性别 M/F
					   "'' as creatorCertificateName," + //创建人证件名称
					   "'' as creatorIdentityCard," + //创建人身份证/证件号码
					   "GuestIP as creatorIP," + //创建人IP
					   "'' as creatorMobile," + //创建人手机
					   "'' as creatorFax," + //创建人传真
					   "'' as creatorUnit," + //创建人所在单位
					   "'' as creatorJob," + //创建人职业
					   "'' as creatorAddress," + //创建人地址
					   "'' as creatorPostalcode," + //创建人邮编
					   "'1' as isPublic," + //是否允许公开
					   "'' as remark," + //附注
					   "GuestReplyDatetime as opinionTime," + //办理意见填写时间
					   "GuestReply as opinionBody," + //办理意见填写内容
					   "'' as opinionCreator" + //办理意见填写人
					   " from PE_GuestBook"};
			}
		});*/
		
		/*dataImporters.add(
				new PublicInfoImporter() {
				public String generateListChildDirectoriesSQL(String parentDirectoryId) {
					if(parentDirectoryId==null) { //第一级目录
						return "select id as directoryId," +
							   " name as directoryName" +
							   " from dir";
					}
					return null;
				}
				
				public String[] generateRetrieveDataSQL() {
					return new String[] {"select " +
							   "filesort as directoryId," + //原来的目录ID
							   "fileindex as infoIndex," + //索引号
							   "pubunit as infoFrom," + //发布机构
							   "filetype as mark," + //文号
							   "pubdate as generateDate," + //生成日期
							   "title as subject," + //标题
							   "content as body," + //正文
							   "'' as creator," + //创建人
							   "createdate as created," + //创建时间
							   "createdate as issueTime," + //发布时间
							   "filesummary as summarize," + //内容概述
							   "'' as category," + //主题分类
							   "'' as keywords," + //主题词
							   "pubunit as orgName," + //创建者所在部门名称
							   "pubunit as unitName" + //创建者所在单位名称
							   " from T_CMS_APP_DOCUMENT"};
				}
			});*/
		
		
		dataImporters.add(new SiteDataImporter() {
			public String generateListChildDirectoriesSQL(String parentDirectoryId) {
				if(parentDirectoryId==null) { //第一级目录
					return "select '法律法规' as directoryId," +
						   " '法律法规' as directoryName" +
						   " from law" +
						   " where id=1";
				}
				return null;
			}

			public String[] generateRetrieveDataSQL(List selectedSourceDirectoryIds) {
				return new String[] {"select " +
					   "id as importDataId," + //被导入的记录ID
					   "'法律法规' as directoryId," + //原来的栏目ID
					   "subject," + //标题
					   "body," + //正文
					   "subhead," + //副标题
					   "'' as source," + //来源
					   "'' as author," + //作者
					   "'' as keyword," + //关键字
					   "#2009-1-1# as created," + //创建时间
					   "#2009-1-1# as issueTime," + //发布时间
					   "'' as editor," + //创建者
					   "'' as orgName," + //创建者所在部门名称
					   "'' as unitName" + //创建者所在单位名称
					   " from law"};
			}
		});
		return dataImporters;
	}
}
