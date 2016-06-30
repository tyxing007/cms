package com.yuanluesoft.logistics.vehicle.pojo;

import com.yuanluesoft.jeaf.database.Record;

/**
 * 车源:目的地点(logistics_vehicle_destination)
 * @author linchuan
 *
 */
public class LogisticsVehicleDestination extends Record {
	private long supplyId; //车源ID
	private long destinationId; //目的地ID
	private String destination; //目的地
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	/**
	 * @return the destinationId
	 */
	public long getDestinationId() {
		return destinationId;
	}
	/**
	 * @param destinationId the destinationId to set
	 */
	public void setDestinationId(long destinationId) {
		this.destinationId = destinationId;
	}
	/**
	 * @return the supplyId
	 */
	public long getSupplyId() {
		return supplyId;
	}
	/**
	 * @param supplyId the supplyId to set
	 */
	public void setSupplyId(long supplyId) {
		this.supplyId = supplyId;
	}
}