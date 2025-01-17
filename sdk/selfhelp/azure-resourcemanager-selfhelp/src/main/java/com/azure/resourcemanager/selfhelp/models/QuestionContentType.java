// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Default is Text. */
public final class QuestionContentType extends ExpandableStringEnum<QuestionContentType> {
    /** Static value Text for QuestionContentType. */
    public static final QuestionContentType TEXT = fromString("Text");

    /** Static value Html for QuestionContentType. */
    public static final QuestionContentType HTML = fromString("Html");

    /** Static value Markdown for QuestionContentType. */
    public static final QuestionContentType MARKDOWN = fromString("Markdown");

    /**
     * Creates a new instance of QuestionContentType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public QuestionContentType() {
    }

    /**
     * Creates or finds a QuestionContentType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding QuestionContentType.
     */
    @JsonCreator
    public static QuestionContentType fromString(String name) {
        return fromString(name, QuestionContentType.class);
    }

    /**
     * Gets known QuestionContentType values.
     *
     * @return known QuestionContentType values.
     */
    public static Collection<QuestionContentType> values() {
        return values(QuestionContentType.class);
    }
}
