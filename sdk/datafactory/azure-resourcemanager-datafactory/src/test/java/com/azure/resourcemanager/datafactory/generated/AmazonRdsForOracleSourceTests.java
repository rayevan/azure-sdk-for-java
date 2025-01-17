// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AmazonRdsForOraclePartitionSettings;
import com.azure.resourcemanager.datafactory.models.AmazonRdsForOracleSource;

public final class AmazonRdsForOracleSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmazonRdsForOracleSource model = BinaryData.fromString(
            "{\"type\":\"AmazonRdsForOracleSource\",\"oracleReaderQuery\":\"datazdb\",\"queryTimeout\":\"datae\",\"partitionOption\":\"datahfmzeufjzqaqeqc\",\"partitionSettings\":{\"partitionNames\":\"dataqcwzytomnqcthgq\",\"partitionColumnName\":\"dataaoazfkykkcq\",\"partitionUpperBound\":\"datanvjg\",\"partitionLowerBound\":\"datasjhinpyeksll\"},\"additionalColumns\":\"datasqolckwhgnfbnnhw\",\"sourceRetryCount\":\"dataloifxzdohfvxavhf\",\"sourceRetryWait\":\"dataxqwwzpbamcfrfay\",\"maxConcurrentConnections\":\"dataygoombnrmbcklf\",\"disableMetricsCollection\":\"datamgfvvnkpwltozxd\",\"\":{\"fnpn\":\"datadw\",\"juz\":\"dataater\"}}")
            .toObject(AmazonRdsForOracleSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmazonRdsForOracleSource model = new AmazonRdsForOracleSource().withSourceRetryCount("dataloifxzdohfvxavhf")
            .withSourceRetryWait("dataxqwwzpbamcfrfay").withMaxConcurrentConnections("dataygoombnrmbcklf")
            .withDisableMetricsCollection("datamgfvvnkpwltozxd").withOracleReaderQuery("datazdb")
            .withQueryTimeout("datae").withPartitionOption("datahfmzeufjzqaqeqc")
            .withPartitionSettings(new AmazonRdsForOraclePartitionSettings().withPartitionNames("dataqcwzytomnqcthgq")
                .withPartitionColumnName("dataaoazfkykkcq").withPartitionUpperBound("datanvjg")
                .withPartitionLowerBound("datasjhinpyeksll"))
            .withAdditionalColumns("datasqolckwhgnfbnnhw");
        model = BinaryData.fromObject(model).toObject(AmazonRdsForOracleSource.class);
    }
}
