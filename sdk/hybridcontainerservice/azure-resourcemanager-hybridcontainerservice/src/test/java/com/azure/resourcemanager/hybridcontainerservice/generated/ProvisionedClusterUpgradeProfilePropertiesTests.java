// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.ProvisionedClusterUpgradeProfileProperties;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusterPoolUpgradeProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusterPoolUpgradeProfileProperties;
import java.util.Arrays;

public final class ProvisionedClusterUpgradeProfilePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProvisionedClusterUpgradeProfileProperties model = BinaryData.fromString(
            "{\"provisioningState\":\"Created\",\"controlPlaneProfile\":{\"kubernetesVersion\":\"bvmgxsabkyqduuji\",\"name\":\"jczdzevndh\",\"osType\":\"Linux\",\"upgrades\":[{\"kubernetesVersion\":\"ppdsbdkvwrwj\",\"isPreview\":false}]},\"agentPoolProfiles\":[{\"kubernetesVersion\":\"hutje\",\"name\":\"mrldhu\",\"osType\":\"Windows\",\"upgrades\":[{\"kubernetesVersion\":\"tqxhocdgeab\",\"isPreview\":false},{\"kubernetesVersion\":\"uticndvkaozwyif\",\"isPreview\":false},{\"kubernetesVersion\":\"hurokftyxoln\",\"isPreview\":true},{\"kubernetesVersion\":\"cukjf\",\"isPreview\":false}]}]}")
            .toObject(ProvisionedClusterUpgradeProfileProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProvisionedClusterUpgradeProfileProperties model = new ProvisionedClusterUpgradeProfileProperties()
            .withControlPlaneProfile(new ProvisionedClusterPoolUpgradeProfile()
                .withUpgrades(Arrays.asList(new ProvisionedClusterPoolUpgradeProfileProperties())))
            .withAgentPoolProfiles(Arrays.asList(new ProvisionedClusterPoolUpgradeProfile()
                .withUpgrades(Arrays.asList(new ProvisionedClusterPoolUpgradeProfileProperties(),
                    new ProvisionedClusterPoolUpgradeProfileProperties(),
                    new ProvisionedClusterPoolUpgradeProfileProperties(),
                    new ProvisionedClusterPoolUpgradeProfileProperties()))));
        model = BinaryData.fromObject(model).toObject(ProvisionedClusterUpgradeProfileProperties.class);
    }
}
