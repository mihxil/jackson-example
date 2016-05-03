package org.meeuw;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author Michiel Meeuwissen
  */
public class Adapter extends XmlAdapter<Wrapper, String> {

	@Override
	public String unmarshal(Wrapper v) throws Exception {
		if (v == null) {
			return null;
		}
		return v.value;

	}

	@Override
	public Wrapper marshal(String v) throws Exception {
		if (v == null) {
			return null;
		}
		Wrapper wrapper = new Wrapper();
		wrapper.value = v;
		wrapper.attribute = "test";
		return wrapper;

	}
}
