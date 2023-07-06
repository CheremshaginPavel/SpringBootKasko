package com.example.KaskoWebClient.model.api.requests.CalcRequest;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;

public class ItemDeserializer extends JsonDeserializer<ArrayList<Integer>> {

    @Override
    public ArrayList<Integer> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException, JacksonException {
        JsonNode jsonNode = jsonParser.getCodec().readTree(jsonParser);
        ArrayList<Integer> array = new ArrayList<>();
        if (jsonNode.size() == 1) {
            array.add((Integer) jsonNode.intValue());
            return array;
        } else if (jsonNode.size() == 0) {
            return new ArrayList<>();
        } else {
            for (JsonNode items : jsonNode) {
                array.add((Integer) items.intValue());
            }
            return array;
        }
    }
}
