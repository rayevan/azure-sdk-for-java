// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Kubernetes version profile for given major.minor release.
 */
@Immutable
public final class KubernetesVersionProperties {
    /*
     * major.minor version of Kubernetes release
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * Capabilities on this kubernetes version
     */
    @JsonProperty(value = "capabilities", access = JsonProperty.Access.WRITE_ONLY)
    private KubernetesVersionCapabilities capabilities;

    /*
     * Whether this version is in preview mode.
     */
    @JsonProperty(value = "isPreview", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isPreview;

    /*
     * Patch versions of a Kubernetes release
     */
    @JsonProperty(value = "patchVersions", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, KubernetesPatchVersions> patchVersions;

    /**
     * Creates an instance of KubernetesVersionProperties class.
     */
    public KubernetesVersionProperties() {
    }

    /**
     * Get the version property: major.minor version of Kubernetes release.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the capabilities property: Capabilities on this kubernetes version.
     * 
     * @return the capabilities value.
     */
    public KubernetesVersionCapabilities capabilities() {
        return this.capabilities;
    }

    /**
     * Get the isPreview property: Whether this version is in preview mode.
     * 
     * @return the isPreview value.
     */
    public Boolean isPreview() {
        return this.isPreview;
    }

    /**
     * Get the patchVersions property: Patch versions of a Kubernetes release.
     * 
     * @return the patchVersions value.
     */
    public Map<String, KubernetesPatchVersions> patchVersions() {
        return this.patchVersions;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capabilities() != null) {
            capabilities().validate();
        }
        if (patchVersions() != null) {
            patchVersions().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
    }
}
