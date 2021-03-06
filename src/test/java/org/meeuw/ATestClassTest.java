package org.meeuw;

import java.util.ArrayList;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;

import static org.junit.Assert.assertEquals;

/**
 * @author Michiel Meeuwissen
 */
public class ATestClassTest {

    @Test
    public void test() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        AnnotationIntrospector introspector = new AnnotationIntrospectorPair(
            new JacksonAnnotationIntrospector(),
            new JaxbAnnotationIntrospector(mapper.getTypeFactory())
        );
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

        mapper.setAnnotationIntrospector(introspector);


        ATestClass instance = new ATestClass();
        instance.collection = new ArrayList<String>();
        instance.collection.add("A");

        assertEquals("{\"objects\":[{\"attribute\":\"test\",\"value\":\"A\"}]}", mapper.writeValueAsString(instance));



    }

}
