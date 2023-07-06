package com.example.KaskoWebClient.model.api.requests.CalcRequest;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.util.ArrayList;

public class ItemDeserializerModels extends JsonDeserializer<ArrayList<ModelJa>> {

    @Override
    public ArrayList<ModelJa> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException, JacksonException {
        JsonNode jsonNode = jsonParser.getCodec().readTree(jsonParser);
        ArrayList<ModelJa> array = new ArrayList<>();
        ModelJa modelJa = new ModelJa();
        String name, manufacturer;
        Long id, modelGroupId;
        Boolean hasRightSideWheel, wear;
        ArrayList<Integer> productionYears = new ArrayList<>();
        ArrayList<Integer> primary_years = new ArrayList<>();
        ArrayList<Integer> renewYears = new ArrayList<>();
        Integer enginePower;
        modelJa.setId((jsonNode.get("model_id")).longValue());
        modelJa.setModelGroupId((jsonNode.get("modelGroupId")).longValue());
        modelJa.setManufacturer((jsonNode.get("manufacturer")).textValue());
        modelJa.setEnginePower((jsonNode.get("enginePower")).intValue());
        modelJa.setName((jsonNode.get("model_name")).textValue());
        modelJa.setHasRightSideWheel((jsonNode.get("right_side_wheel")).booleanValue());
//        modelJa.setPrimaryYears(primary_years);
//        modelJa.setProductionYears(productionYears);
//        modelJa.setRenewYears(renewYears);
//        enginePower = (jsonNode.get("enginePower")).intValue();
//        hasRightSideWheel = (jsonNode.get("right_side_wheel")).booleanValue();
//        id = (jsonNode.get("model_id")).longValue();
//        manufacturer = (jsonNode.get("manufacturer")).textValue();
//        modelGroupId = (jsonNode.get("modelGroupId")).longValue();
//        name = (jsonNode.get("model_name")).textValue();



        if (jsonNode.size() == 1) {
            modelJa.setId((jsonNode.get("model_id")).longValue());
            modelJa.setModelGroupId((jsonNode.get("modelGroupId")).longValue());
            modelJa.setManufacturer((jsonNode.get("manufacturer")).textValue());
            modelJa.setEnginePower((jsonNode.get("enginePower")).intValue());
            modelJa.setName((jsonNode.get("model_name")).textValue());
            modelJa.setHasRightSideWheel((jsonNode.get("right_side_wheel")).booleanValue());
            array.add(modelJa);
            return array;
        } else if (jsonNode.size() == 0) {
            array.add(modelJa);
            return array;
        } else {
            for (JsonNode items : jsonNode) {
                modelJa.setId((items.get("model_id")).longValue());
                modelJa.setModelGroupId((items.get("modelGroupId")).longValue());
                modelJa.setManufacturer((items.get("manufacturer")).textValue());
                modelJa.setEnginePower((items.get("enginePower")).intValue());
                modelJa.setName((items.get("model_name")).textValue());
                modelJa.setHasRightSideWheel((items.get("right_side_wheel")).booleanValue());
                array.add(modelJa);
            }
            return array;
        }
    }
}
