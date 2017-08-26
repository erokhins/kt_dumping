'customCacheVersion' @ [26:9] ==> public fun customCacheVersion(version: Int, fileName: String, dataRoot: File, forceEnable: Boolean = ...): CacheVersion defined in org.jetbrains.kotlin.incremental in file cacheVersions.kt[SimpleFunctionDescriptorImpl]

'STANDALONE_CACHE_VERSION' @ [26:28] ==> internal const val STANDALONE_CACHE_VERSION: Int defined in org.jetbrains.kotlin.incremental in file cacheVersions.kt[PropertyDescriptorImpl]

'STANDALONE_VERSION_FILE_NAME' @ [26:54] ==> internal const val STANDALONE_VERSION_FILE_NAME: String defined in org.jetbrains.kotlin.incremental in file cacheVersions.kt[PropertyDescriptorImpl]

'dataRoot' @ [26:84] ==> value-parameter dataRoot: File defined in org.jetbrains.kotlin.incremental.standaloneCacheVersion[ValueParameterDescriptorImpl]

'CacheVersion' @ [29:9] ==> public constructor CacheVersion(ownVersion: Int, versionFile: File, whenVersionChanged: CacheVersion.Action, whenTurnedOn: CacheVersion.Action, whenTurnedOff: CacheVersion.Action, isEnabled: () -> Boolean) defined in org.jetbrains.kotlin.incremental.CacheVersion[DeserializedClassConstructorDescriptor]

'version' @ [29:35] ==> value-parameter version: Int defined in org.jetbrains.kotlin.incremental.customCacheVersion[ValueParameterDescriptorImpl]

'File' @ [30:31] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'dataRoot' @ [30:36] ==> value-parameter dataRoot: File defined in org.jetbrains.kotlin.incremental.customCacheVersion[ValueParameterDescriptorImpl]

'fileName' @ [30:46] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.incremental.customCacheVersion[ValueParameterDescriptorImpl]

'REBUILD_ALL_KOTLIN' @ [31:58] ==> enum entry REBUILD_ALL_KOTLIN defined in org.jetbrains.kotlin.incremental.CacheVersion.Action[FakeCallableDescriptorForObject]

'REBUILD_ALL_KOTLIN' @ [32:52] ==> enum entry REBUILD_ALL_KOTLIN defined in org.jetbrains.kotlin.incremental.CacheVersion.Action[FakeCallableDescriptorForObject]

'REBUILD_ALL_KOTLIN' @ [33:53] ==> enum entry REBUILD_ALL_KOTLIN defined in org.jetbrains.kotlin.incremental.CacheVersion.Action[FakeCallableDescriptorForObject]

'isEnabled' @ [34:54] ==> public open fun isEnabled(): Boolean defined in org.jetbrains.kotlin.config.IncrementalCompilation[JavaMethodDescriptor]

'forceEnable' @ [34:69] ==> value-parameter forceEnable: Boolean = ... defined in org.jetbrains.kotlin.incremental.customCacheVersion[ValueParameterDescriptorImpl]

'listOf' @ [37:9] ==> public fun <T> listOf(vararg elements: CacheVersion): List<CacheVersion> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CacheVersion

'normalCacheVersion' @ [37:16] ==> public fun normalCacheVersion(dataRoot: File): CacheVersion defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'cachesDir' @ [37:35] ==> value-parameter cachesDir: File defined in org.jetbrains.kotlin.incremental.commonCacheVersions[ValueParameterDescriptorImpl]

'dataContainerCacheVersion' @ [38:16] ==> public fun dataContainerCacheVersion(dataRoot: File): CacheVersion defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'cachesDir' @ [38:42] ==> value-parameter cachesDir: File defined in org.jetbrains.kotlin.incremental.commonCacheVersions[ValueParameterDescriptorImpl]

