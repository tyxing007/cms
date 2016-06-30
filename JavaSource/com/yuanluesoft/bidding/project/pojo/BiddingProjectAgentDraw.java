package com.yuanluesoft.bidding.project.pojo;

import java.sql.Timestamp;

/**
 * 代理抽签公示(bidding_project_agent_draw)
 * @author linchuan
 *
 */
public class BiddingProjectAgentDraw extends BiddingProjectComponent {
	private String drawMode; //代理申请方式,法定代表人或授权委托人携带书面申请书及身份证（到场核验）/无需申请
	private String agentLevel; //代理资格条件,福州市省、市重点项目招标代理机构名录库/福州市招标代理机构名录库/福州市招标代理机构名册
	private String content; //委托代理内容,勘察/设计/监理/施工/工程货物/附属/其它
	private Timestamp agentSignup; //代理机构报名时间
	private Timestamp agentSignupEnd; //代理机构报名截止时间
	private Timestamp drawTime; //抽选时间
	private String drawAddress; //抽选地点
	private String money; //代理取费标准
	
	private BiddingProjectAgent agent; //中选代理
	
	/**
	 * @return the agentLevel
	 */
	public String getAgentLevel() {
		return agentLevel;
	}
	/**
	 * @param agentLevel the agentLevel to set
	 */
	public void setAgentLevel(String agentLevel) {
		this.agentLevel = agentLevel;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the drawAddress
	 */
	public String getDrawAddress() {
		return drawAddress;
	}
	/**
	 * @param drawAddress the drawAddress to set
	 */
	public void setDrawAddress(String drawAddress) {
		this.drawAddress = drawAddress;
	}
	/**
	 * @return the drawMode
	 */
	public String getDrawMode() {
		return drawMode;
	}
	/**
	 * @param drawMode the drawMode to set
	 */
	public void setDrawMode(String drawMode) {
		this.drawMode = drawMode;
	}
	/**
	 * @return the drawTime
	 */
	public Timestamp getDrawTime() {
		return drawTime;
	}
	/**
	 * @param drawTime the drawTime to set
	 */
	public void setDrawTime(Timestamp drawTime) {
		this.drawTime = drawTime;
	}
	/**
	 * @return the money
	 */
	public String getMoney() {
		return money;
	}
	/**
	 * @param money the money to set
	 */
	public void setMoney(String money) {
		this.money = money;
	}
	/**
	 * @return the agent
	 */
	public BiddingProjectAgent getAgent() {
		return agent;
	}
	/**
	 * @param agent the agent to set
	 */
	public void setAgent(BiddingProjectAgent agent) {
		this.agent = agent;
	}
	/**
	 * @return the agentSignup
	 */
	public Timestamp getAgentSignup() {
		return agentSignup;
	}
	/**
	 * @param agentSignup the agentSignup to set
	 */
	public void setAgentSignup(Timestamp agentSignup) {
		this.agentSignup = agentSignup;
	}
	/**
	 * @return the agentSignupEnd
	 */
	public Timestamp getAgentSignupEnd() {
		return agentSignupEnd;
	}
	/**
	 * @param agentSignupEnd the agentSignupEnd to set
	 */
	public void setAgentSignupEnd(Timestamp agentSignupEnd) {
		this.agentSignupEnd = agentSignupEnd;
	}
}
