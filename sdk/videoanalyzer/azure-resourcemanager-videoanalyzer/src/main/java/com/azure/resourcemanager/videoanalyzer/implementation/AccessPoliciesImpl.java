// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.videoanalyzer.fluent.AccessPoliciesClient;
import com.azure.resourcemanager.videoanalyzer.fluent.models.AccessPolicyEntityInner;
import com.azure.resourcemanager.videoanalyzer.models.AccessPolicies;
import com.azure.resourcemanager.videoanalyzer.models.AccessPolicyEntity;

public final class AccessPoliciesImpl implements AccessPolicies {
    private static final ClientLogger LOGGER = new ClientLogger(AccessPoliciesImpl.class);

    private final AccessPoliciesClient innerClient;

    private final com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager;

    public AccessPoliciesImpl(AccessPoliciesClient innerClient,
        com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AccessPolicyEntity> list(String resourceGroupName, String accountName) {
        PagedIterable<AccessPolicyEntityInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new AccessPolicyEntityImpl(inner1, this.manager()));
    }

    public PagedIterable<AccessPolicyEntity> list(String resourceGroupName, String accountName, Integer top,
        Context context) {
        PagedIterable<AccessPolicyEntityInner> inner
            = this.serviceClient().list(resourceGroupName, accountName, top, context);
        return Utils.mapPage(inner, inner1 -> new AccessPolicyEntityImpl(inner1, this.manager()));
    }

    public AccessPolicyEntity get(String resourceGroupName, String accountName, String accessPolicyName) {
        AccessPolicyEntityInner inner = this.serviceClient().get(resourceGroupName, accountName, accessPolicyName);
        if (inner != null) {
            return new AccessPolicyEntityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessPolicyEntity> getWithResponse(String resourceGroupName, String accountName,
        String accessPolicyName, Context context) {
        Response<AccessPolicyEntityInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, accountName, accessPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AccessPolicyEntityImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String accessPolicyName) {
        this.serviceClient().delete(resourceGroupName, accountName, accessPolicyName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String accountName, String accessPolicyName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, accessPolicyName, context);
    }

    public AccessPolicyEntity getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "videoAnalyzers");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'videoAnalyzers'.", id)));
        }
        String accessPolicyName = Utils.getValueFromIdByName(id, "accessPolicies");
        if (accessPolicyName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'accessPolicies'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, accessPolicyName, Context.NONE).getValue();
    }

    public Response<AccessPolicyEntity> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "videoAnalyzers");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'videoAnalyzers'.", id)));
        }
        String accessPolicyName = Utils.getValueFromIdByName(id, "accessPolicies");
        if (accessPolicyName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'accessPolicies'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, accessPolicyName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "videoAnalyzers");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'videoAnalyzers'.", id)));
        }
        String accessPolicyName = Utils.getValueFromIdByName(id, "accessPolicies");
        if (accessPolicyName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'accessPolicies'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, accessPolicyName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "videoAnalyzers");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'videoAnalyzers'.", id)));
        }
        String accessPolicyName = Utils.getValueFromIdByName(id, "accessPolicies");
        if (accessPolicyName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'accessPolicies'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, accessPolicyName, context);
    }

    private AccessPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager() {
        return this.serviceManager;
    }

    public AccessPolicyEntityImpl define(String name) {
        return new AccessPolicyEntityImpl(name, this.manager());
    }
}
