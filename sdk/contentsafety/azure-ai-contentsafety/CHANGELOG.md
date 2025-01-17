# Release History

## 1.0.0 (Unreleased)

### Features Added
- Support AAD Authentication
- Support 8 severity level for AnalyzeText
### Breaking Changes
Contract change for AnalyzeText, AnalyzeImage, Blocklist management related methods
#### AnalyzeText
- AnalyzeTextOptions
  - Renamed breakByBlocklists to haltOnBlocklistHit
  - Add AnalyzeTextOutputType
- AnalyzeTextResult
  - Renamed blocklistsMatchResults to blocklistsMatch
  - Replaced TextAnalyzeSeverityResult by TextCategoriesAnalysis
#### AnalyzeImage
- AnalyzeImageOptions
    - Replaced ImageData by ContentSafetyImageData
    - Add AnalyzeImageOutputType
- AnalyzeImageResult
    - Replaced ImageAnalyzeSeverityResult by ImageCategoriesAnalysis
#### Blocklist management
- Added BlocklistAsyncClient
- Renamed AddBlockItemsOptions to AddOrUpdateTextBlocklistItemsOptions
- Renamed AddBlockItemsResult to AddOrUpdateTextBlocklistItemsResult
- Renamed RemoveBlockItemsOptions to RemoveTextBlocklistItemsOptions
- Renamed TextBlockItemInfo to TextBlocklistItem

### Bugs Fixed

### Other Changes
#### Dependency Updates
- Upgraded `azure-core` from `1.43.0` to version `1.45.0`.
- Upgraded `azure-core-http-netty` from `1.13.7` to version `1.13.10`.
- Upgraded `azure-identity` from `1.10.1` to version `1.11.0`
## 1.0.0-beta.1 (2023-09-28)

- Azure AI ContentSafety client library for Java. This package contains Microsoft Azure ContentSafety client library.

### Features Added
* Text Analysis API: Scans text for sexual content, violence, hate, and self harm with multi-severity levels.
* Image Analysis API: Scans images for sexual content, violence, hate, and self harm with multi-severity levels.
* Text Blocklist Management APIs: The default AI classifiers are sufficient for most content safety needs; however, you might need to screen for terms that are specific to your use case. You can create blocklists of terms to use with the Text API.
