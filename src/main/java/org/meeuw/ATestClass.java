package org.meeuw;


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlType(
    propOrder = {
        "strings",
        "collection"
    })
@XmlAccessorType(XmlAccessType.PROPERTY)
public class ATestClass {

    List<String> collection = new ArrayList<String>();

    List<String> strings= new ArrayList<String>();


    @XmlJavaTypeAdapter(Adapter.class)
    @JsonProperty("objects")
    public List<String> getCollection() {
        return collection;
    }

    public void setCollection(List<String> collection) {
        this.collection = collection;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }
}

