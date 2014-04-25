/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 *
 * @author 世宁
 */
public class MyObjectMapper extends ObjectMapper{

    public MyObjectMapper() {
        super();
        this.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        this.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
//        CustomSerializerFactory factory = new CustomSerializerFactory();
//        factory.addSpecificMapping(Date.class, new JsonSerializer<Date>(){
//            @Override
//            public void serialize(Date date, JsonGenerator generator, SerializerProvider provider) 
//                    throws IOException, JsonProcessingException {
//                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                generator.writeString(sdf.format(date));
//            }
//        
//        });
//        this.setSerializerFactory(factory);
//        this.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    }
    
}
