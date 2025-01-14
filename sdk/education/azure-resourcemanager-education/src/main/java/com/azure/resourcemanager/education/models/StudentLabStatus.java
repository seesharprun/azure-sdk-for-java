// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Student Lab Status.
 */
public final class StudentLabStatus extends ExpandableStringEnum<StudentLabStatus> {
    /**
     * Static value Active for StudentLabStatus.
     */
    public static final StudentLabStatus ACTIVE = fromString("Active");

    /**
     * Static value Disabled for StudentLabStatus.
     */
    public static final StudentLabStatus DISABLED = fromString("Disabled");

    /**
     * Static value Expired for StudentLabStatus.
     */
    public static final StudentLabStatus EXPIRED = fromString("Expired");

    /**
     * Static value Pending for StudentLabStatus.
     */
    public static final StudentLabStatus PENDING = fromString("Pending");

    /**
     * Static value Deleted for StudentLabStatus.
     */
    public static final StudentLabStatus DELETED = fromString("Deleted");

    /**
     * Creates a new instance of StudentLabStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public StudentLabStatus() {
    }

    /**
     * Creates or finds a StudentLabStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding StudentLabStatus.
     */
    public static StudentLabStatus fromString(String name) {
        return fromString(name, StudentLabStatus.class);
    }

    /**
     * Gets known StudentLabStatus values.
     * 
     * @return known StudentLabStatus values.
     */
    public static Collection<StudentLabStatus> values() {
        return values(StudentLabStatus.class);
    }
}
