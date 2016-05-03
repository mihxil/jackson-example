package org.meeuw;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author Michiel Meeuwissen
  */
public class Adapter extends XmlAdapter<Wrapper, MyEnum> {

	@Override
	public MyEnum unmarshal(Wrapper v) throws Exception {
		if (v == null) {
			return null;
		}
		return MyEnum.valueOf(v.value);

	}

	@Override
	public Wrapper marshal(MyEnum v) throws Exception {
		if (v == null) {
			return null;
		}
		Wrapper wrapper = new Wrapper();
		wrapper.value = v.name();
		wrapper.attribute = "test";
		return wrapper;

	}
}
