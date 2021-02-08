package com.knoldus;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class User_D_Deserializer implements Deserializer<user_data> {
    @Override public void close() {
    }
    @Override public void configure(Map<String, ?> arg0, boolean arg1) {
    }
    @Override
    public user_data deserialize(String arg0, byte[] arg1) {
        ObjectMapper mapper = new ObjectMapper();
        user_data user = null;
        try {
            user = mapper.readValue(arg1, user_data.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }}