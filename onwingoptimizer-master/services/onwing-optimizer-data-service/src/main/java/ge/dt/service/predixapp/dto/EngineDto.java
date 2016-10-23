package ge.dt.service.predixapp.dto;

import ge.dt.service.predixapp.json.JsonDateDeSerializer;
import ge.dt.service.predixapp.json.JsonDateSerializer;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class EngineDto {

	private long id;

	private long serial;

	private String part;

	private String invStatus;

	private String topSerial;

	private int installedOn;

	private long cycle;

	@JsonSerialize(using = JsonDateSerializer.class)
	@JsonDeserialize(using = JsonDateDeSerializer.class)
	private Date createdDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getSerial() {
		return serial;
	}

	public void setSerial(long serial) {
		this.serial = serial;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getInvStatus() {
		return invStatus;
	}

	public void setInvStatus(String invStatus) {
		this.invStatus = invStatus;
	}

	public String getTopSerial() {
		return topSerial;
	}

	public void setTopSerial(String topSerial) {
		this.topSerial = topSerial;
	}

	public int getInstalledOn() {
		return installedOn;
	}

	public void setInstalledOn(int installedOn) {
		this.installedOn = installedOn;
	}

	public long getCycle() {
		return cycle;
	}

	public void setCycle(long cycle) {
		this.cycle = cycle;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
