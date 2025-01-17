// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** A participant of the chat thread. */
@Fluent
public final class ChatParticipant {
    /*
     * Identifies a participant in Azure Communication services. A participant
     * is, for example, a phone number or an Azure communication user. This
     * model is polymorphic: Apart from kind and rawId, at most one further
     * property may be set which must match the kind enum value.
     */
    @JsonProperty(value = "communicationIdentifier", required = true)
    private CommunicationIdentifierModel communicationIdentifier;

    /*
     * Display name for the chat participant.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Time from which the chat history is shared with the participant. The
     * timestamp is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "shareHistoryTime")
    private OffsetDateTime shareHistoryTime;

    /**
     * Get the communicationIdentifier property: Identifies a participant in Azure Communication services. A participant
     * is, for example, a phone number or an Azure communication user. This model is polymorphic: Apart from kind and
     * rawId, at most one further property may be set which must match the kind enum value.
     *
     * @return the communicationIdentifier value.
     */
    public CommunicationIdentifierModel getCommunicationIdentifier() {
        return this.communicationIdentifier;
    }

    /**
     * Set the communicationIdentifier property: Identifies a participant in Azure Communication services. A participant
     * is, for example, a phone number or an Azure communication user. This model is polymorphic: Apart from kind and
     * rawId, at most one further property may be set which must match the kind enum value.
     *
     * @param communicationIdentifier the communicationIdentifier value to set.
     * @return the ChatParticipant object itself.
     */
    public ChatParticipant setCommunicationIdentifier(CommunicationIdentifierModel communicationIdentifier) {
        this.communicationIdentifier = communicationIdentifier;
        return this;
    }

    /**
     * Get the displayName property: Display name for the chat participant.
     *
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name for the chat participant.
     *
     * @param displayName the displayName value to set.
     * @return the ChatParticipant object itself.
     */
    public ChatParticipant setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the shareHistoryTime property: Time from which the chat history is shared with the participant. The timestamp
     * is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the shareHistoryTime value.
     */
    public OffsetDateTime getShareHistoryTime() {
        return this.shareHistoryTime;
    }

    /**
     * Set the shareHistoryTime property: Time from which the chat history is shared with the participant. The timestamp
     * is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param shareHistoryTime the shareHistoryTime value to set.
     * @return the ChatParticipant object itself.
     */
    public ChatParticipant setShareHistoryTime(OffsetDateTime shareHistoryTime) {
        this.shareHistoryTime = shareHistoryTime;
        return this;
    }
}
