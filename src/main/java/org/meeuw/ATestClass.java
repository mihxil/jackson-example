package org.meeuw;


import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ATestClass {


	@XmlJavaTypeAdapter(Adapter.class)
	@JsonProperty("objects")
	List<MyEnum> collection;
}

