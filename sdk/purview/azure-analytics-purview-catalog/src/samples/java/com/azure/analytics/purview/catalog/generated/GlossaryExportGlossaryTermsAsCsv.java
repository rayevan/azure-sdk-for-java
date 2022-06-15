// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.GlossaryClient;
import com.azure.analytics.purview.catalog.GlossaryClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;

public class GlossaryExportGlossaryTermsAsCsv {
    public static void main(String[] args) {
        GlossaryClient glossaryClient =
                new GlossaryClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildClient();
        // BEGIN:com.azure.analytics.purview.catalog.generated.glossaryexportglossarytermsascsv.glossaryexportglossarytermsascsv
        BinaryData termGuids =
                BinaryData.fromString(
                        "[\"1ec7ed72-f188-4bfe-bab9-bb9b5475381e\",\"7869f462-33d4-4ec9-9901-b9f25a25e6df\"]");
        RequestOptions requestOptions = new RequestOptions().addQueryParam("includeTermHierarchy", "true");
        Response<Flux<ByteBuffer>> response =
                glossaryClient.exportGlossaryTermsAsCsvWithResponse(
                        "ed27f06c-dcfc-4e60-be27-7be65060108f", termGuids, requestOptions);
        // END:com.azure.analytics.purview.catalog.generated.glossaryexportglossarytermsascsv.glossaryexportglossarytermsascsv
    }
}