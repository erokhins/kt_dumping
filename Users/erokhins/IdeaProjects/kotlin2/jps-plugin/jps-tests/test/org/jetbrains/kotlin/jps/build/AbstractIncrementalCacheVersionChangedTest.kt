'AbstractIncrementalJpsTest' @ [24:61] ==> public constructor AbstractIncrementalJpsTest(allowNoFilesWithSuffixInTestData: Boolean = ..., checkDumpsCaseInsensitively: Boolean = ..., allowNoBuildLogFileInTestData: Boolean = ...) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[ClassConstructorDescriptorImpl]

'modifications' @ [26:29] ==> value-parameter modifications: List<Modification> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest.performAdditionalModifications[ValueParameterDescriptorImpl]

'filterIsInstance' @ [26:43] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<ModifyContent> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ModifyContent

'map' @ [26:77] ==> public inline fun <T, R> Iterable<ModifyContent>.map(transform: (ModifyContent) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModifyContent
    <R> -> String

'it' @ [26:83] ==> value-parameter it: ModifyContent defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest.performAdditionalModifications.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [26:86] ==> public final val path: String defined in org.jetbrains.kotlin.incremental.testingUtils.ModifyContent[DeserializedPropertyDescriptor]

'projectDescriptor' @ [27:21] ==> protected final lateinit var projectDescriptor: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest[PropertyDescriptorImpl]

'dataManager' @ [27:39] ==> public final val dataManager: (BuildDataManager..BuildDataManager?) defined in org.jetbrains.jps.cmdline.ProjectDescriptor[JavaPropertyDescriptor]

'dataPaths' @ [27:51] ==> public final val BuildDataManager.dataPaths: (BuildDataPaths..BuildDataPaths?)[MyPropertyDescriptor]

'projectDescriptor' @ [28:23] ==> protected final lateinit var projectDescriptor: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest[PropertyDescriptorImpl]

'allModuleTargets' @ [28:41] ==> internal val ProjectDescriptor.allModuleTargets: Collection<ModuleBuildTarget> defined in org.jetbrains.kotlin.jps.build in file AbstractIncrementalJpsTest.kt[PropertyDescriptorImpl]

'HasKotlinMarker' @ [29:25] ==> public constructor HasKotlinMarker(dataManager: BuildDataManager) defined in org.jetbrains.kotlin.jps.build.HasKotlinMarker[DeserializedClassConstructorDescriptor]

'projectDescriptor' @ [29:41] ==> protected final lateinit var projectDescriptor: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest[PropertyDescriptorImpl]

'dataManager' @ [29:59] ==> public final val dataManager: (BuildDataManager..BuildDataManager?) defined in org.jetbrains.jps.cmdline.ProjectDescriptor[JavaPropertyDescriptor]

'modifiedFiles' @ [31:13] ==> val modifiedFiles: List<String> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest.performAdditionalModifications[LocalVariableDescriptor]

'any' @ [31:27] ==> public inline fun <T> Iterable<String>.any(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [31:33] ==> value-parameter it: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest.performAdditionalModifications.<anonymous>[ValueParameterDescriptorImpl]

'endsWith' @ [31:36] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'targets' @ [32:13] ==> val targets: Collection<ModuleBuildTarget> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest.performAdditionalModifications[LocalVariableDescriptor]

'forEach' @ [32:21] ==> @HidesMembers public inline fun <T> Iterable<ModuleBuildTarget>.forEach(action: (ModuleBuildTarget) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleBuildTarget

'hasKotlin' @ [32:31] ==> val hasKotlin: HasKotlinMarker defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest.performAdditionalModifications[LocalVariableDescriptor]

'clean' @ [32:41] ==> public final fun clean(target: ModuleBuildTarget): Unit defined in org.jetbrains.kotlin.jps.build.HasKotlinMarker[DeserializedSimpleFunctionDescriptor]

'it' @ [32:47] ==> value-parameter it: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest.performAdditionalModifications.<anonymous>[ValueParameterDescriptorImpl]

'modifiedFiles' @ [35:13] ==> val modifiedFiles: List<String> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest.performAdditionalModifications[LocalVariableDescriptor]

'none' @ [35:27] ==> public inline fun <T> Iterable<String>.none(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [35:34] ==> value-parameter it: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest.performAdditionalModifications.<anonymous>[ValueParameterDescriptorImpl]

'endsWith' @ [35:37] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'CacheVersionProvider' @ [36:40] ==> public constructor CacheVersionProvider(paths: BuildDataPaths) defined in org.jetbrains.kotlin.jps.incremental.CacheVersionProvider[DeserializedClassConstructorDescriptor]

'paths' @ [36:61] ==> val paths: (BuildDataPaths..BuildDataPaths?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest.performAdditionalModifications[LocalVariableDescriptor]

'getVersions' @ [37:28] ==> protected open fun getVersions(cacheVersionProvider: CacheVersionProvider, targets: Iterable<ModuleBuildTarget>): List<CacheVersion> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest[SimpleFunctionDescriptorImpl]

'cacheVersionProvider' @ [37:40] ==> val cacheVersionProvider: CacheVersionProvider defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest.performAdditionalModifications[LocalVariableDescriptor]

'targets' @ [37:62] ==> val targets: Collection<ModuleBuildTarget> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest.performAdditionalModifications[LocalVariableDescriptor]

'versions' @ [38:32] ==> val versions: List<CacheVersion> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest.performAdditionalModifications[LocalVariableDescriptor]

'map' @ [38:41] ==> public inline fun <T, R> Iterable<CacheVersion>.map(transform: (CacheVersion) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CacheVersion
    <R> -> File

'it' @ [38:47] ==> value-parameter it: CacheVersion defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest.performAdditionalModifications.<anonymous>[ValueParameterDescriptorImpl]

'formatVersionFile' @ [38:50] ==> public final val formatVersionFile: File defined in org.jetbrains.kotlin.incremental.CacheVersion[DeserializedPropertyDescriptor]

'filter' @ [38:70] ==> public inline fun <T> Iterable<File>.filter(predicate: (File) -> Boolean): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [38:79] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest.performAdditionalModifications.<anonymous>[ValueParameterDescriptorImpl]

'exists' @ [38:82] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'versionFiles' @ [39:13] ==> val versionFiles: List<File> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest.performAdditionalModifications[LocalVariableDescriptor]

'forEach' @ [39:26] ==> @HidesMembers public inline fun <T> Iterable<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [39:36] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest.performAdditionalModifications.<anonymous>[ValueParameterDescriptorImpl]

'writeText' @ [39:39] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'targets' @ [44:13] ==> value-parameter targets: Iterable<ModuleBuildTarget> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest.getVersions[ValueParameterDescriptorImpl]

'map' @ [44:21] ==> public inline fun <T, R> Iterable<ModuleBuildTarget>.map(transform: (ModuleBuildTarget) -> CacheVersion): List<CacheVersion> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleBuildTarget
    <R> -> CacheVersion

'cacheVersionProvider' @ [44:27] ==> value-parameter cacheVersionProvider: CacheVersionProvider defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest.getVersions[ValueParameterDescriptorImpl]

'normalVersion' @ [44:48] ==> public final fun normalVersion(target: ModuleBuildTarget): CacheVersion defined in org.jetbrains.kotlin.jps.incremental.CacheVersionProvider[DeserializedSimpleFunctionDescriptor]

'it' @ [44:62] ==> value-parameter it: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalCacheVersionChangedTest.getVersions.<anonymous>[ValueParameterDescriptorImpl]

