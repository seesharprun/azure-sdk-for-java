// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The EntityQueryItemPropertiesDataTypesItem model.
 */
@Fluent
public final class EntityQueryItemPropertiesDataTypesItem
    implements JsonSerializable<EntityQueryItemPropertiesDataTypesItem> {
    /*
     * Data type name
     */
    private String dataType;

    /**
     * Creates an instance of EntityQueryItemPropertiesDataTypesItem class.
     */
    public EntityQueryItemPropertiesDataTypesItem() {
    }

    /**
     * Get the dataType property: Data type name.
     * 
     * @return the dataType value.
     */
    public String dataType() {
        return this.dataType;
    }

    /**
     * Set the dataType property: Data type name.
     * 
     * @param dataType the dataType value to set.
     * @return the EntityQueryItemPropertiesDataTypesItem object itself.
     */
    public EntityQueryItemPropertiesDataTypesItem withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("dataType", this.dataType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EntityQueryItemPropertiesDataTypesItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EntityQueryItemPropertiesDataTypesItem if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EntityQueryItemPropertiesDataTypesItem.
     */
    public static EntityQueryItemPropertiesDataTypesItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EntityQueryItemPropertiesDataTypesItem deserializedEntityQueryItemPropertiesDataTypesItem
                = new EntityQueryItemPropertiesDataTypesItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dataType".equals(fieldName)) {
                    deserializedEntityQueryItemPropertiesDataTypesItem.dataType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEntityQueryItemPropertiesDataTypesItem;
        });
    }
}
