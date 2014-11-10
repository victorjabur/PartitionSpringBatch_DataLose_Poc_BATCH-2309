package com.victorjabur.springbatch.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "record")
public class Record {

	private int id;
	private String description;
	private Integer numBlock;

	@XmlTransient
	public Integer getNumBlock() {
		return numBlock;
	}

	public void setNumBlock(Integer numBlock) {
		this.numBlock = numBlock;
	}

	@XmlAttribute(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@XmlElement(name = "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Record [id=" + id + ", description=" + description + "]";
	}

}