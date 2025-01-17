// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.implementation.models;

import com.azure.communication.chat.models.ChatMessageType;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Chat message. */
@Fluent
public final class ChatMessage {
    /*
     * The id of the chat message. This id is server generated.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The chat message type.
     */
    @JsonProperty(value = "type", required = true)
    private ChatMessageType type;

    /*
     * Sequence of the chat message in the conversation.
     */
    @JsonProperty(value = "sequenceId", required = true)
    private String sequenceId;

    /*
     * Version of the chat message.
     */
    @JsonProperty(value = "version", required = true)
    private String version;

    /*
     * Content of a chat message.
     */
    @JsonProperty(value = "content")
    private ChatMessageContent content;

    /*
     * The display name of the chat message sender. This property is used to
     * populate sender name for push notifications.
     */
    @JsonProperty(value = "senderDisplayName")
    private String senderDisplayName;

    /*
     * The timestamp when the chat message arrived at the server. The timestamp
     * is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "createdOn", required = true)
    private OffsetDateTime createdOn;

    /*
     * Identifies a participant in Azure Communication services. A participant
     * is, for example, a phone number or an Azure communication user. This
     * model is polymorphic: Apart from kind and rawId, at most one further
     * property may be set which must match the kind enum value.
     */
    @JsonProperty(value = "senderCommunicationIdentifier")
    private CommunicationIdentifierModel senderCommunicationIdentifier;

    /*
     * The timestamp (if applicable) when the message was deleted. The
     * timestamp is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "deletedOn")
    private OffsetDateTime deletedOn;

    /*
     * The last timestamp (if applicable) when the message was edited. The
     * timestamp is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "editedOn")
    private OffsetDateTime editedOn;

    /*
     * Message metadata.
     */
    @JsonProperty(value = "metadata")
    private Map<String, String> metadata;

    /**
     * Get the id property: The id of the chat message. This id is server generated.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The id of the chat message. This id is server generated.
     *
     * @param id the id value to set.
     * @return the ChatMessage object itself.
     */
    public ChatMessage setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: The chat message type.
     *
     * @return the type value.
     */
    public ChatMessageType getType() {
        return this.type;
    }

    /**
     * Set the type property: The chat message type.
     *
     * @param type the type value to set.
     * @return the ChatMessage object itself.
     */
    public ChatMessage setType(ChatMessageType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the sequenceId property: Sequence of the chat message in the conversation.
     *
     * @return the sequenceId value.
     */
    public String getSequenceId() {
        return this.sequenceId;
    }

    /**
     * Set the sequenceId property: Sequence of the chat message in the conversation.
     *
     * @param sequenceId the sequenceId value to set.
     * @return the ChatMessage object itself.
     */
    public ChatMessage setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }

    /**
     * Get the version property: Version of the chat message.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: Version of the chat message.
     *
     * @param version the version value to set.
     * @return the ChatMessage object itself.
     */
    public ChatMessage setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the content property: Content of a chat message.
     *
     * @return the content value.
     */
    public ChatMessageContent getContent() {
        return this.content;
    }

    /**
     * Set the content property: Content of a chat message.
     *
     * @param content the content value to set.
     * @return the ChatMessage object itself.
     */
    public ChatMessage setContent(ChatMessageContent content) {
        this.content = content;
        return this;
    }

    /**
     * Get the senderDisplayName property: The display name of the chat message sender. This property is used to
     * populate sender name for push notifications.
     *
     * @return the senderDisplayName value.
     */
    public String getSenderDisplayName() {
        return this.senderDisplayName;
    }

    /**
     * Set the senderDisplayName property: The display name of the chat message sender. This property is used to
     * populate sender name for push notifications.
     *
     * @param senderDisplayName the senderDisplayName value to set.
     * @return the ChatMessage object itself.
     */
    public ChatMessage setSenderDisplayName(String senderDisplayName) {
        this.senderDisplayName = senderDisplayName;
        return this;
    }

    /**
     * Get the createdOn property: The timestamp when the chat message arrived at the server. The timestamp is in
     * RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Set the createdOn property: The timestamp when the chat message arrived at the server. The timestamp is in
     * RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param createdOn the createdOn value to set.
     * @return the ChatMessage object itself.
     */
    public ChatMessage setCreatedOn(OffsetDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Get the senderCommunicationIdentifier property: Identifies a participant in Azure Communication services. A
     * participant is, for example, a phone number or an Azure communication user. This model is polymorphic: Apart from
     * kind and rawId, at most one further property may be set which must match the kind enum value.
     *
     * @return the senderCommunicationIdentifier value.
     */
    public CommunicationIdentifierModel getSenderCommunicationIdentifier() {
        return this.senderCommunicationIdentifier;
    }

    /**
     * Set the senderCommunicationIdentifier property: Identifies a participant in Azure Communication services. A
     * participant is, for example, a phone number or an Azure communication user. This model is polymorphic: Apart from
     * kind and rawId, at most one further property may be set which must match the kind enum value.
     *
     * @param senderCommunicationIdentifier the senderCommunicationIdentifier value to set.
     * @return the ChatMessage object itself.
     */
    public ChatMessage setSenderCommunicationIdentifier(CommunicationIdentifierModel senderCommunicationIdentifier) {
        this.senderCommunicationIdentifier = senderCommunicationIdentifier;
        return this;
    }

    /**
     * Get the deletedOn property: The timestamp (if applicable) when the message was deleted. The timestamp is in
     * RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the deletedOn value.
     */
    public OffsetDateTime getDeletedOn() {
        return this.deletedOn;
    }

    /**
     * Set the deletedOn property: The timestamp (if applicable) when the message was deleted. The timestamp is in
     * RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param deletedOn the deletedOn value to set.
     * @return the ChatMessage object itself.
     */
    public ChatMessage setDeletedOn(OffsetDateTime deletedOn) {
        this.deletedOn = deletedOn;
        return this;
    }

    /**
     * Get the editedOn property: The last timestamp (if applicable) when the message was edited. The timestamp is in
     * RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the editedOn value.
     */
    public OffsetDateTime getEditedOn() {
        return this.editedOn;
    }

    /**
     * Set the editedOn property: The last timestamp (if applicable) when the message was edited. The timestamp is in
     * RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param editedOn the editedOn value to set.
     * @return the ChatMessage object itself.
     */
    public ChatMessage setEditedOn(OffsetDateTime editedOn) {
        this.editedOn = editedOn;
        return this;
    }

    /**
     * Get the metadata property: Message metadata.
     *
     * @return the metadata value.
     */
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Message metadata.
     *
     * @param metadata the metadata value to set.
     * @return the ChatMessage object itself.
     */
    public ChatMessage setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
