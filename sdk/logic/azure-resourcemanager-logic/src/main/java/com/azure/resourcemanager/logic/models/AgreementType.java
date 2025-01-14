// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

/**
 * The agreement type.
 */
public enum AgreementType {
    /**
     * Enum value NotSpecified.
     */
    NOT_SPECIFIED("NotSpecified"),

    /**
     * Enum value AS2.
     */
    AS2("AS2"),

    /**
     * Enum value X12.
     */
    X12("X12"),

    /**
     * Enum value Edifact.
     */
    EDIFACT("Edifact");

    /**
     * The actual serialized value for a AgreementType instance.
     */
    private final String value;

    AgreementType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AgreementType instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed AgreementType object, or null if unable to parse.
     */
    public static AgreementType fromString(String value) {
        if (value == null) {
            return null;
        }
        AgreementType[] items = AgreementType.values();
        for (AgreementType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
