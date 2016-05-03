package org.meeuw;

import javax.xml.bind.annotation.*;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Michiel Meeuwissen
 */
@JsonPropertyOrder({"attribute", "value"})
public class Wrapper {

	@XmlValue
	String value;

	@XmlAttribute
	String attribute;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
}
