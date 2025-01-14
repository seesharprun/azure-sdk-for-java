// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.models.ClusterPrincipalAssignmentCheckNameRequest;
import org.junit.jupiter.api.Assertions;

public final class ClusterPrincipalAssignmentCheckNameRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterPrincipalAssignmentCheckNameRequest model
            = BinaryData.fromString("{\"name\":\"zfboj\"}").toObject(ClusterPrincipalAssignmentCheckNameRequest.class);
        Assertions.assertEquals("zfboj", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterPrincipalAssignmentCheckNameRequest model
            = new ClusterPrincipalAssignmentCheckNameRequest().withName("zfboj");
        model = BinaryData.fromObject(model).toObject(ClusterPrincipalAssignmentCheckNameRequest.class);
        Assertions.assertEquals("zfboj", model.name());
    }
}
