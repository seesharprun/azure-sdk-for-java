// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.communication.CommunicationManager;
import com.azure.resourcemanager.communication.models.CommunicationServiceResource;
import com.azure.resourcemanager.communication.models.ManagedServiceIdentityType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class CommunicationServicesListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Running\",\"hostName\":\"arbu\",\"dataLocation\":\"rcvpnazzmhjrunmp\",\"notificationHubId\":\"tdbhrbnla\",\"version\":\"xmyskp\",\"immutableResourceId\":\"enbtkcxywny\",\"linkedDomains\":[\"synlqidybyxczfc\"]},\"identity\":{\"principalId\":\"bf2be09a-79d1-4bfd-8556-fdcfa2f1c7d1\",\"tenantId\":\"7272b381-7584-43b2-9f5d-9987dbf5ed10\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"p\":{\"principalId\":\"41190edf-d46b-47c5-b956-6de1e0f169b6\",\"clientId\":\"f540ba33-a605-41e3-bb82-9635801f5ec5\"},\"rqlfktsthsucocmn\":{\"principalId\":\"2960e378-b58a-46d4-9647-3731440d096a\",\"clientId\":\"34d003dd-841b-4af2-ae4b-23dd8601e310\"},\"zt\":{\"principalId\":\"73f7f370-6377-4fa5-b684-b37feee8e273\",\"clientId\":\"4c7ff0ab-7003-4ee7-97b3-faef757a6879\"}}},\"location\":\"twwrqp\",\"tags\":{\"xibxujwbhqwalm\":\"ckzywbiexzfeyue\",\"ux\":\"zyoxaepdkzjan\",\"zt\":\"hdwbavxbniwdjs\"},\"id\":\"dbpgnxytxhp\",\"name\":\"xbzpfzab\",\"type\":\"lcuhxwtctyqiklb\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        CommunicationManager manager = CommunicationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<CommunicationServiceResource> response
            = manager.communicationServices().listByResourceGroup("buynhijggm", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("twwrqp", response.iterator().next().location());
        Assertions.assertEquals("ckzywbiexzfeyue", response.iterator().next().tags().get("xibxujwbhqwalm"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals("rcvpnazzmhjrunmp", response.iterator().next().dataLocation());
        Assertions.assertEquals("synlqidybyxczfc", response.iterator().next().linkedDomains().get(0));
    }
}
