// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.contentsafety;

import com.azure.core.credential.KeyCredential;
import com.azure.core.util.Configuration;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CreateContentSafetyClient {
    public static void main(String[] args) {
        // BEGIN:com.azure.ai.contentsafety.createcontentsafetyclient
        String endpoint = Configuration.getGlobalConfiguration().get("CONTENT_SAFETY_ENDPOINT");
        String key = Configuration.getGlobalConfiguration().get("CONTENT_SAFETY_KEY");
        ContentSafetyClient contentSafetyClient = new ContentSafetyClientBuilder()
            .credential(new KeyCredential(key))
            .endpoint(endpoint).buildClient();
        // END:com.azure.ai.contentsafety.createcontentsafetyclient

        // BEGIN:com.azure.ai.contentsafety.createcontentsafetyclienttoken
        ContentSafetyClient contentSafetyClientOauth = new ContentSafetyClientBuilder()
            .credential(new DefaultAzureCredentialBuilder().build())
            .endpoint(endpoint).buildClient();
        // END:com.azure.ai.contentsafety.createcontentsafetyclienttoken
    }
}
