// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/** Defines the names of all token filters supported by the search engine. */
public final class TokenFilterName extends ExpandableStringEnum<TokenFilterName> {
    /**
     * A token filter that applies the Arabic normalizer to normalize the orthography. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/ar/ArabicNormalizationFilter.html.
     */
    public static final TokenFilterName ARABIC_NORMALIZATION = fromString("arabic_normalization");

    /**
     * Strips all characters after an apostrophe (including the apostrophe itself). See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/tr/ApostropheFilter.html.
     */
    public static final TokenFilterName APOSTROPHE = fromString("apostrophe");

    /**
     * Converts alphabetic, numeric, and symbolic Unicode characters which are not in the first 127 ASCII characters
     * (the "Basic Latin" Unicode block) into their ASCII equivalents, if such equivalents exist. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/miscellaneous/ASCIIFoldingFilter.html.
     */
    public static final TokenFilterName ASCII_FOLDING = fromString("asciifolding");

    /**
     * Forms bigrams of CJK terms that are generated from the standard tokenizer. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/cjk/CJKBigramFilter.html.
     */
    public static final TokenFilterName CJK_BIGRAM = fromString("cjk_bigram");

    /**
     * Normalizes CJK width differences. Folds fullwidth ASCII variants into the equivalent basic Latin, and half-width
     * Katakana variants into the equivalent Kana. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/cjk/CJKWidthFilter.html.
     */
    public static final TokenFilterName CJK_WIDTH = fromString("cjk_width");

    /**
     * Removes English possessives, and dots from acronyms. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/standard/ClassicFilter.html.
     */
    public static final TokenFilterName CLASSIC = fromString("classic");

    /**
     * Construct bigrams for frequently occurring terms while indexing. Single terms are still indexed too, with bigrams
     * overlaid. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/commongrams/CommonGramsFilter.html.
     */
    public static final TokenFilterName COMMON_GRAM = fromString("common_grams");

    /**
     * Generates n-grams of the given size(s) starting from the front or the back of an input token. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/ngram/EdgeNGramTokenFilter.html.
     */
    public static final TokenFilterName EDGE_NGRAM = fromString("edgeNGram_v2");

    /**
     * Removes elisions. For example, "l'avion" (the plane) will be converted to "avion" (plane). See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/util/ElisionFilter.html.
     */
    public static final TokenFilterName ELISION = fromString("elision");

    /**
     * Normalizes German characters according to the heuristics of the German2 snowball algorithm. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/de/GermanNormalizationFilter.html.
     */
    public static final TokenFilterName GERMAN_NORMALIZATION = fromString("german_normalization");

    /**
     * Normalizes text in Hindi to remove some differences in spelling variations. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/hi/HindiNormalizationFilter.html.
     */
    public static final TokenFilterName HINDI_NORMALIZATION = fromString("hindi_normalization");

    /**
     * Normalizes the Unicode representation of text in Indian languages. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/in/IndicNormalizationFilter.html.
     */
    public static final TokenFilterName INDIC_NORMALIZATION = fromString("indic_normalization");

    /**
     * Emits each incoming token twice, once as keyword and once as non-keyword. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/miscellaneous/KeywordRepeatFilter.html.
     */
    public static final TokenFilterName KEYWORD_REPEAT = fromString("keyword_repeat");

    /**
     * A high-performance kstem filter for English. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/en/KStemFilter.html.
     */
    public static final TokenFilterName KSTEM = fromString("kstem");

    /**
     * Removes words that are too long or too short. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/miscellaneous/LengthFilter.html.
     */
    public static final TokenFilterName LENGTH = fromString("length");

    /**
     * Limits the number of tokens while indexing. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/miscellaneous/LimitTokenCountFilter.html.
     */
    public static final TokenFilterName LIMIT = fromString("limit");

    /**
     * Normalizes token text to lower case. See
     * https://lucene.apache.org/core/6_6_1/analyzers-common/org/apache/lucene/analysis/core/LowerCaseFilter.html.
     */
    public static final TokenFilterName LOWERCASE = fromString("lowercase");

    /**
     * Generates n-grams of the given size(s). See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/ngram/NGramTokenFilter.html.
     */
    public static final TokenFilterName NGRAM = fromString("nGram_v2");

    /**
     * Applies normalization for Persian. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/fa/PersianNormalizationFilter.html.
     */
    public static final TokenFilterName PERSIAN_NORMALIZATION = fromString("persian_normalization");

    /**
     * Create tokens for phonetic matches. See
     * https://lucene.apache.org/core/4_10_3/analyzers-phonetic/org/apache/lucene/analysis/phonetic/package-tree.html.
     */
    public static final TokenFilterName PHONETIC = fromString("phonetic");

    /**
     * Uses the Porter stemming algorithm to transform the token stream. See http://tartarus.org/~martin/PorterStemmer.
     */
    public static final TokenFilterName PORTER_STEM = fromString("porter_stem");

    /**
     * Reverses the token string. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/reverse/ReverseStringFilter.html.
     */
    public static final TokenFilterName REVERSE = fromString("reverse");

    /**
     * Normalizes use of the interchangeable Scandinavian characters. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/miscellaneous/ScandinavianNormalizationFilter.html.
     */
    public static final TokenFilterName SCANDINAVIAN_NORMALIZATION = fromString("scandinavian_normalization");

    /**
     * Folds Scandinavian characters åÅäæÄÆ-&amp;gt;a and öÖøØ-&amp;gt;o. It also discriminates against use of double
     * vowels aa, ae, ao, oe and oo, leaving just the first one. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/miscellaneous/ScandinavianFoldingFilter.html.
     */
    public static final TokenFilterName SCANDINAVIAN_FOLDING_NORMALIZATION = fromString("scandinavian_folding");

    /**
     * Creates combinations of tokens as a single token. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/shingle/ShingleFilter.html.
     */
    public static final TokenFilterName SHINGLE = fromString("shingle");

    /**
     * A filter that stems words using a Snowball-generated stemmer. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/snowball/SnowballFilter.html.
     */
    public static final TokenFilterName SNOWBALL = fromString("snowball");

    /**
     * Normalizes the Unicode representation of Sorani text. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/ckb/SoraniNormalizationFilter.html.
     */
    public static final TokenFilterName SORANI_NORMALIZATION = fromString("sorani_normalization");

    /**
     * Language specific stemming filter. See
     * https://docs.microsoft.com/rest/api/searchservice/Custom-analyzers-in-Azure-Search#TokenFilters.
     */
    public static final TokenFilterName STEMMER = fromString("stemmer");

    /**
     * Removes stop words from a token stream. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/core/StopFilter.html.
     */
    public static final TokenFilterName STOPWORDS = fromString("stopwords");

    /**
     * Trims leading and trailing whitespace from tokens. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/miscellaneous/TrimFilter.html.
     */
    public static final TokenFilterName TRIM = fromString("trim");

    /**
     * Truncates the terms to a specific length. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/miscellaneous/TruncateTokenFilter.html.
     */
    public static final TokenFilterName TRUNCATE = fromString("truncate");

    /**
     * Filters out tokens with same text as the previous token. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/miscellaneous/RemoveDuplicatesTokenFilter.html.
     */
    public static final TokenFilterName UNIQUE = fromString("unique");

    /**
     * Normalizes token text to upper case. See
     * https://lucene.apache.org/core/6_6_1/analyzers-common/org/apache/lucene/analysis/core/UpperCaseFilter.html.
     */
    public static final TokenFilterName UPPERCASE = fromString("uppercase");

    /** Splits words into subwords and performs optional transformations on subword groups. */
    public static final TokenFilterName WORD_DELIMITER = fromString("word_delimiter");

    /**
     * Creates a new instance of TokenFilterName value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TokenFilterName() {}

    /**
     * Creates or finds a TokenFilterName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TokenFilterName.
     */
    public static TokenFilterName fromString(String name) {
        return fromString(name, TokenFilterName.class);
    }

    /**
     * Gets known TokenFilterName values.
     *
     * @return known TokenFilterName values.
     */
    public static Collection<TokenFilterName> values() {
        return values(TokenFilterName.class);
    }
}
