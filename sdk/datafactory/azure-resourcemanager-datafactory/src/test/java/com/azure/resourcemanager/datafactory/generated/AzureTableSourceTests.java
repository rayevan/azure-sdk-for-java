// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureTableSource;

public final class AzureTableSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureTableSource model = BinaryData.fromString(
            "{\"type\":\"AzureTableSource\",\"azureTableSourceQuery\":\"datawlntenhnqtvx\",\"azureTableSourceIgnoreTableNotFound\":\"databehhe\",\"queryTimeout\":\"datatqorrvwl\",\"additionalColumns\":\"dataojlyu\",\"sourceRetryCount\":\"datalvgjirjkkr\",\"sourceRetryWait\":\"datafdsgrtkevim\",\"maxConcurrentConnections\":\"datapgevjmandr\",\"disableMetricsCollection\":\"datajoklb\",\"\":{\"kocrexfm\":\"datazdtwxfjl\"}}")
            .toObject(AzureTableSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureTableSource model
            = new AzureTableSource().withSourceRetryCount("datalvgjirjkkr").withSourceRetryWait("datafdsgrtkevim")
                .withMaxConcurrentConnections("datapgevjmandr").withDisableMetricsCollection("datajoklb")
                .withQueryTimeout("datatqorrvwl").withAdditionalColumns("dataojlyu")
                .withAzureTableSourceQuery("datawlntenhnqtvx").withAzureTableSourceIgnoreTableNotFound("databehhe");
        model = BinaryData.fromObject(model).toObject(AzureTableSource.class);
    }
}
