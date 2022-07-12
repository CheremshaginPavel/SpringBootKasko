package com.example.KaskoWebClient.model.api.requests.CalcRequest;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.IntNode;

import java.io.IOException;

public class ItemDeserializer extends JsonDeserializer {

    public ItemDeserializer() {
        this(null);
    }

    public ItemDeserializer(Class vc) {
        super();
    }

    @Override
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);

        return null;
    }
}
