package com.example.KaskoWebClient.model.api.requests.CalcRequest;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.IntNode;

import java.io.IOException;
import java.util.ArrayList;

public class ItemDeserializerModels extends JsonDeserializer<ArrayList<ModelJa>> {

    @Override
    public ArrayList<ModelJa> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException, JacksonException {
        JsonNode jsonNode = jsonParser.getCodec().readTree(jsonParser);
        ArrayList<ModelJa> array = new ArrayList<>();

        if (jsonNode.size() == 1) {

            return array;
        } else if (jsonNode.size() == 0) {
            return new ArrayList<>();
        } else {
            for (JsonNode items : jsonNode) {

            }
            return array;
        }
    }
}
