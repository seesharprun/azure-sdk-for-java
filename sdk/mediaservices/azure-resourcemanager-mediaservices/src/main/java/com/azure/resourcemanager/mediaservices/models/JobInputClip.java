// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Represents input files for a Job.
 */
@Fluent
public class JobInputClip extends JobInput {
    /*
     * The discriminator for derived types.
     */
    private String odataType = "#Microsoft.Media.JobInputClip";

    /*
     * List of files. Required for JobInputHttp. Maximum of 4000 characters each. Query strings will not be returned in
     * service responses to prevent sensitive data exposure.
     */
    private List<String> files;

    /*
     * Defines a point on the timeline of the input media at which processing will start. Defaults to the beginning of
     * the input media.
     */
    private ClipTime start;

    /*
     * Defines a point on the timeline of the input media at which processing will end. Defaults to the end of the input
     * media.
     */
    private ClipTime end;

    /*
     * A label that is assigned to a JobInputClip, that is used to satisfy a reference used in the Transform. For
     * example, a Transform can be authored so as to take an image file with the label 'xyz' and apply it as an overlay
     * onto the input video before it is encoded. When submitting a Job, exactly one of the JobInputs should be the
     * image file, and it should have the label 'xyz'.
     */
    private String label;

    /*
     * Defines a list of InputDefinitions. For each InputDefinition, it defines a list of track selections and related
     * metadata.
     */
    private List<InputDefinition> inputDefinitions;

    /**
     * Creates an instance of JobInputClip class.
     */
    public JobInputClip() {
    }

    /**
     * Get the odataType property: The discriminator for derived types.
     * 
     * @return the odataType value.
     */
    @Override
    public String odataType() {
        return this.odataType;
    }

    /**
     * Get the files property: List of files. Required for JobInputHttp. Maximum of 4000 characters each. Query strings
     * will not be returned in service responses to prevent sensitive data exposure.
     * 
     * @return the files value.
     */
    public List<String> files() {
        return this.files;
    }

    /**
     * Set the files property: List of files. Required for JobInputHttp. Maximum of 4000 characters each. Query strings
     * will not be returned in service responses to prevent sensitive data exposure.
     * 
     * @param files the files value to set.
     * @return the JobInputClip object itself.
     */
    public JobInputClip withFiles(List<String> files) {
        this.files = files;
        return this;
    }

    /**
     * Get the start property: Defines a point on the timeline of the input media at which processing will start.
     * Defaults to the beginning of the input media.
     * 
     * @return the start value.
     */
    public ClipTime start() {
        return this.start;
    }

    /**
     * Set the start property: Defines a point on the timeline of the input media at which processing will start.
     * Defaults to the beginning of the input media.
     * 
     * @param start the start value to set.
     * @return the JobInputClip object itself.
     */
    public JobInputClip withStart(ClipTime start) {
        this.start = start;
        return this;
    }

    /**
     * Get the end property: Defines a point on the timeline of the input media at which processing will end. Defaults
     * to the end of the input media.
     * 
     * @return the end value.
     */
    public ClipTime end() {
        return this.end;
    }

    /**
     * Set the end property: Defines a point on the timeline of the input media at which processing will end. Defaults
     * to the end of the input media.
     * 
     * @param end the end value to set.
     * @return the JobInputClip object itself.
     */
    public JobInputClip withEnd(ClipTime end) {
        this.end = end;
        return this;
    }

    /**
     * Get the label property: A label that is assigned to a JobInputClip, that is used to satisfy a reference used in
     * the Transform. For example, a Transform can be authored so as to take an image file with the label 'xyz' and
     * apply it as an overlay onto the input video before it is encoded. When submitting a Job, exactly one of the
     * JobInputs should be the image file, and it should have the label 'xyz'.
     * 
     * @return the label value.
     */
    public String label() {
        return this.label;
    }

    /**
     * Set the label property: A label that is assigned to a JobInputClip, that is used to satisfy a reference used in
     * the Transform. For example, a Transform can be authored so as to take an image file with the label 'xyz' and
     * apply it as an overlay onto the input video before it is encoded. When submitting a Job, exactly one of the
     * JobInputs should be the image file, and it should have the label 'xyz'.
     * 
     * @param label the label value to set.
     * @return the JobInputClip object itself.
     */
    public JobInputClip withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the inputDefinitions property: Defines a list of InputDefinitions. For each InputDefinition, it defines a
     * list of track selections and related metadata.
     * 
     * @return the inputDefinitions value.
     */
    public List<InputDefinition> inputDefinitions() {
        return this.inputDefinitions;
    }

    /**
     * Set the inputDefinitions property: Defines a list of InputDefinitions. For each InputDefinition, it defines a
     * list of track selections and related metadata.
     * 
     * @param inputDefinitions the inputDefinitions value to set.
     * @return the JobInputClip object itself.
     */
    public JobInputClip withInputDefinitions(List<InputDefinition> inputDefinitions) {
        this.inputDefinitions = inputDefinitions;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (start() != null) {
            start().validate();
        }
        if (end() != null) {
            end().validate();
        }
        if (inputDefinitions() != null) {
            inputDefinitions().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", this.odataType);
        jsonWriter.writeArrayField("files", this.files, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("start", this.start);
        jsonWriter.writeJsonField("end", this.end);
        jsonWriter.writeStringField("label", this.label);
        jsonWriter.writeArrayField("inputDefinitions", this.inputDefinitions,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JobInputClip from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JobInputClip if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the JobInputClip.
     */
    public static JobInputClip fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("@odata.type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("#Microsoft.Media.JobInputAsset".equals(discriminatorValue)) {
                    return JobInputAsset.fromJson(readerToUse.reset());
                } else if ("#Microsoft.Media.JobInputHttp".equals(discriminatorValue)) {
                    return JobInputHttp.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static JobInputClip fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JobInputClip deserializedJobInputClip = new JobInputClip();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("@odata.type".equals(fieldName)) {
                    deserializedJobInputClip.odataType = reader.getString();
                } else if ("files".equals(fieldName)) {
                    List<String> files = reader.readArray(reader1 -> reader1.getString());
                    deserializedJobInputClip.files = files;
                } else if ("start".equals(fieldName)) {
                    deserializedJobInputClip.start = ClipTime.fromJson(reader);
                } else if ("end".equals(fieldName)) {
                    deserializedJobInputClip.end = ClipTime.fromJson(reader);
                } else if ("label".equals(fieldName)) {
                    deserializedJobInputClip.label = reader.getString();
                } else if ("inputDefinitions".equals(fieldName)) {
                    List<InputDefinition> inputDefinitions
                        = reader.readArray(reader1 -> InputDefinition.fromJson(reader1));
                    deserializedJobInputClip.inputDefinitions = inputDefinitions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJobInputClip;
        });
    }
}
