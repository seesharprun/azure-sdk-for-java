// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The result returned from a database check name availability request.
 */
@Fluent
public final class DatabaseCheckNameRequest implements JsonSerializable<DatabaseCheckNameRequest> {
    /*
     * Resource name.
     */
    private String name;

    /*
     * The type of resource, for instance Microsoft.Synapse/workspaces/kustoPools/databases.
     */
    private Type type;

    /**
     * Creates an instance of DatabaseCheckNameRequest class.
     */
    public DatabaseCheckNameRequest() {
    }

    /**
     * Get the name property: Resource name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource name.
     * 
     * @param name the name value to set.
     * @return the DatabaseCheckNameRequest object itself.
     */
    public DatabaseCheckNameRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of resource, for instance Microsoft.Synapse/workspaces/kustoPools/databases.
     * 
     * @return the type value.
     */
    public Type type() {
        return this.type;
    }

    /**
     * Set the type property: The type of resource, for instance Microsoft.Synapse/workspaces/kustoPools/databases.
     * 
     * @param type the type value to set.
     * @return the DatabaseCheckNameRequest object itself.
     */
    public DatabaseCheckNameRequest withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model DatabaseCheckNameRequest"));
        }
        if (type() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property type in model DatabaseCheckNameRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DatabaseCheckNameRequest.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DatabaseCheckNameRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DatabaseCheckNameRequest if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DatabaseCheckNameRequest.
     */
    public static DatabaseCheckNameRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DatabaseCheckNameRequest deserializedDatabaseCheckNameRequest = new DatabaseCheckNameRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedDatabaseCheckNameRequest.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDatabaseCheckNameRequest.type = Type.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDatabaseCheckNameRequest;
        });
    }
}
