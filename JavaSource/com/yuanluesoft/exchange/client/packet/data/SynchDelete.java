package com.yuanluesoft.exchange.client.packet.data;

import java.io.Serializable;

import com.yuanluesoft.exchange.client.packet.ExchangePacket;

/**
 * 同步删除
 * @author linchuan
 *
 */
public class SynchDelete extends ExchangePacket {
	private Serializable object;

	public SynchDelete(Serializable object) {
		super();
		this.object = object;
	}

	/**
	 * @return the object
	 */
	public Serializable getObject() {
		return object;
	}

	/**
	 * @param object the object to set
	 */
	public void setObject(Serializable object) {
		this.object = object;
	}
}