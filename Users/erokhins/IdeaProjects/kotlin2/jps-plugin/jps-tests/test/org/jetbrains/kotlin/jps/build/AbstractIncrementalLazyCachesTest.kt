'AbstractIncrementalJpsTest' @ [33:52] ==> public constructor AbstractIncrementalJpsTest(allowNoFilesWithSuffixInTestData: Boolean = ..., checkDumpsCaseInsensitively: Boolean = ..., allowNoBuildLogFileInTestData: Boolean = ...) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[ClassConstructorDescriptorImpl]

'super' @ [40:9] ==> <this> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest[LazyClassReceiverParameterDescriptor]

'setUp' @ [40:15] ==> protected open fun setUp(): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'isICEnabledBackup' @ [41:9] ==> private final var isICEnabledBackup: Boolean defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest[PropertyDescriptorImpl]

'isEnabled' @ [41:52] ==> public open fun isEnabled(): Boolean defined in org.jetbrains.kotlin.config.IncrementalCompilation[JavaMethodDescriptor]

'setIsEnabled' @ [42:32] ==> public open fun setIsEnabled(p0: Boolean): Unit defined in org.jetbrains.kotlin.config.IncrementalCompilation[JavaMethodDescriptor]

'setIsEnabled' @ [46:32] ==> public open fun setIsEnabled(p0: Boolean): Unit defined in org.jetbrains.kotlin.config.IncrementalCompilation[JavaMethodDescriptor]

'isICEnabledBackup' @ [46:45] ==> private final var isICEnabledBackup: Boolean defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest[PropertyDescriptorImpl]

'super' @ [47:9] ==> <this> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest[LazyClassReceiverParameterDescriptor]

'tearDown' @ [47:15] ==> protected open fun tearDown(): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'super' @ [51:9] ==> <this> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest[LazyClassReceiverParameterDescriptor]

'doTest' @ [51:15] ==> protected open fun doTest(testDataPath: String): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'testDataPath' @ [51:22] ==> value-parameter testDataPath: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.doTest[ValueParameterDescriptorImpl]

'dumpKotlinCachesFileNames' @ [53:22] ==> private final fun dumpKotlinCachesFileNames(): String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest[SimpleFunctionDescriptorImpl]

'File' @ [54:28] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDataPath' @ [54:33] ==> value-parameter testDataPath: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.doTest[ValueParameterDescriptorImpl]

'expectedCachesFileName' @ [54:47] ==> private final val expectedCachesFileName: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest[PropertyDescriptorImpl]

'assertSameLinesWithFile' @ [55:24] ==> public open fun assertSameLinesWithFile(p0: (String..String?), p1: (String..String?)): Unit defined in com.intellij.testFramework.UsefulTestCase[JavaMethodDescriptor]

'expectedFile' @ [55:48] ==> val expectedFile: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.doTest[LocalVariableDescriptor]

'canonicalPath' @ [55:61] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'actual' @ [55:76] ==> val actual: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.doTest[LocalVariableDescriptor]

'super' @ [59:9] ==> <this> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest[LazyClassReceiverParameterDescriptor]

'performAdditionalModifications' @ [59:15] ==> protected open fun performAdditionalModifications(modifications: List<Modification>): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'modifications' @ [59:46] ==> value-parameter modifications: List<Modification> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.performAdditionalModifications[ValueParameterDescriptorImpl]

'modifications' @ [61:30] ==> value-parameter modifications: List<Modification> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.performAdditionalModifications[ValueParameterDescriptorImpl]

'modification' @ [62:17] ==> val modification: Modification defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.performAdditionalModifications[LocalVariableDescriptor]

'File' @ [64:24] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'modification' @ [64:29] ==> val modification: Modification defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.performAdditionalModifications[LocalVariableDescriptor]

'path' @ [64:42] ==> public final val path: String defined in org.jetbrains.kotlin.incremental.testingUtils.Modification[DeserializedPropertyDescriptor]

'name' @ [64:48] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'when {
                name.endsWith("incremental-compilation") -> {
                    IncrementalCompilation.setIsEnabled(modification.dataFile.readAsBool())
                }
            }' @ [66:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'name' @ [67:17] ==> val name: (String..String?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.performAdditionalModifications[LocalVariableDescriptor]

'endsWith' @ [67:22] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'setIsEnabled' @ [68:44] ==> public open fun setIsEnabled(p0: Boolean): Unit defined in org.jetbrains.kotlin.config.IncrementalCompilation[JavaMethodDescriptor]

'modification' @ [68:57] ==> val modification: Modification defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.performAdditionalModifications[LocalVariableDescriptor]

'dataFile' @ [68:70] ==> public final val dataFile: File defined in org.jetbrains.kotlin.incremental.testingUtils.ModifyContent[DeserializedPropertyDescriptor]

'readAsBool' @ [68:79] ==> public final fun File.readAsBool(): Boolean defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest[SimpleFunctionDescriptorImpl]

'this' @ [75:23] ==> <this> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.readAsBool[ReceiverParameterDescriptorImpl]

'readText' @ [75:28] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'when (content.trim()) {
            "on" -> true
            "off" -> false
            else -> throw IllegalStateException("$this content is expected to be 'on' or 'off'")
        }' @ [77:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'content' @ [77:22] ==> val content: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.readAsBool[LocalVariableDescriptor]

'trim' @ [77:30] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'IllegalStateException' @ [80:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'this' @ [80:51] ==> <this> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.readAsBool[ReceiverParameterDescriptorImpl]

'StringBuilder' @ [85:18] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'Printer' @ [86:17] ==> public constructor Printer(@NotNull p0: Appendable) defined in org.jetbrains.kotlin.utils.Printer[JavaClassConstructorDescriptor]

'sb' @ [86:25] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpKotlinCachesFileNames[LocalVariableDescriptor]

'projectDescriptor' @ [87:23] ==> protected final lateinit var projectDescriptor: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest[PropertyDescriptorImpl]

'allModuleTargets' @ [87:41] ==> internal val ProjectDescriptor.allModuleTargets: Collection<ModuleBuildTarget> defined in org.jetbrains.kotlin.jps.build in file AbstractIncrementalJpsTest.kt[PropertyDescriptorImpl]

'projectDescriptor' @ [88:27] ==> protected final lateinit var projectDescriptor: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest[PropertyDescriptorImpl]

'dataManager' @ [88:45] ==> public final val dataManager: (BuildDataManager..BuildDataManager?) defined in org.jetbrains.jps.cmdline.ProjectDescriptor[JavaPropertyDescriptor]

'dataManager' @ [89:21] ==> val dataManager: (BuildDataManager..BuildDataManager?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpKotlinCachesFileNames[LocalVariableDescriptor]

'dataPaths' @ [89:33] ==> public final val BuildDataManager.dataPaths: (BuildDataPaths..BuildDataPaths?)[MyPropertyDescriptor]

'CacheVersionProvider' @ [90:24] ==> public constructor CacheVersionProvider(paths: BuildDataPaths) defined in org.jetbrains.kotlin.jps.incremental.CacheVersionProvider[DeserializedClassConstructorDescriptor]

'paths' @ [90:45] ==> val paths: (BuildDataPaths..BuildDataPaths?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpKotlinCachesFileNames[LocalVariableDescriptor]

'dumpCachesForTarget' @ [92:9] ==> private final fun dumpCachesForTarget(p: Printer, paths: BuildDataPaths, target: BuildTarget<*>, vararg cacheVersionsFiles: File, subdirectory: String? = ...): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest[SimpleFunctionDescriptorImpl]

'p' @ [92:29] ==> val p: Printer defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpKotlinCachesFileNames[LocalVariableDescriptor]

'paths' @ [92:32] ==> val paths: (BuildDataPaths..BuildDataPaths?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpKotlinCachesFileNames[LocalVariableDescriptor]

'KotlinDataContainerTarget' @ [92:39] ==> public object KotlinDataContainerTarget : BuildTarget<BuildRootDescriptor> defined in org.jetbrains.kotlin.jps.incremental[FakeCallableDescriptorForObject]

'versions' @ [92:66] ==> val versions: CacheVersionProvider defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpKotlinCachesFileNames[LocalVariableDescriptor]

'dataContainerVersion' @ [92:75] ==> public final fun dataContainerVersion(): CacheVersion defined in org.jetbrains.kotlin.jps.incremental.CacheVersionProvider[DeserializedSimpleFunctionDescriptor]

'formatVersionFile' @ [92:98] ==> public final val formatVersionFile: File defined in org.jetbrains.kotlin.incremental.CacheVersion[DeserializedPropertyDescriptor]

'targets' @ [94:24] ==> val targets: Collection<ModuleBuildTarget> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpKotlinCachesFileNames[LocalVariableDescriptor]

'sortedBy' @ [94:32] ==> public inline fun <T, R : Comparable<String>> Iterable<ModuleBuildTarget>.sortedBy(crossinline selector: (ModuleBuildTarget) -> String?): List<ModuleBuildTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleBuildTarget
    <R : Comparable<R>> -> String

'it' @ [94:43] ==> value-parameter it: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpKotlinCachesFileNames.<anonymous>[ValueParameterDescriptorImpl]

'presentableName' @ [94:46] ==> public final val ModuleBuildTarget.presentableName: String[MyPropertyDescriptor]

'jvmBuildMetaInfoFile' @ [95:36] ==> public fun jvmBuildMetaInfoFile(target: ModuleBuildTarget, dataManager: BuildDataManager): File defined in org.jetbrains.kotlin.jps.build[DeserializedSimpleFunctionDescriptor]

'target' @ [95:57] ==> val target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpKotlinCachesFileNames[LocalVariableDescriptor]

'dataManager' @ [95:65] ==> val dataManager: (BuildDataManager..BuildDataManager?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpKotlinCachesFileNames[LocalVariableDescriptor]

'dumpCachesForTarget' @ [96:13] ==> private final fun dumpCachesForTarget(p: Printer, paths: BuildDataPaths, target: BuildTarget<*>, vararg cacheVersionsFiles: File, subdirectory: String? = ...): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest[SimpleFunctionDescriptorImpl]

'p' @ [96:33] ==> val p: Printer defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpKotlinCachesFileNames[LocalVariableDescriptor]

'paths' @ [96:36] ==> val paths: (BuildDataPaths..BuildDataPaths?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpKotlinCachesFileNames[LocalVariableDescriptor]

'target' @ [96:43] ==> val target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpKotlinCachesFileNames[LocalVariableDescriptor]

'versions' @ [97:33] ==> val versions: CacheVersionProvider defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpKotlinCachesFileNames[LocalVariableDescriptor]

'normalVersion' @ [97:42] ==> public final fun normalVersion(target: ModuleBuildTarget): CacheVersion defined in org.jetbrains.kotlin.jps.incremental.CacheVersionProvider[DeserializedSimpleFunctionDescriptor]

'target' @ [97:56] ==> val target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpKotlinCachesFileNames[LocalVariableDescriptor]

'formatVersionFile' @ [97:64] ==> public final val formatVersionFile: File defined in org.jetbrains.kotlin.incremental.CacheVersion[DeserializedPropertyDescriptor]

'jvmMetaBuildInfo' @ [98:33] ==> val jvmMetaBuildInfo: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpKotlinCachesFileNames[LocalVariableDescriptor]

'KOTLIN_CACHE_DIRECTORY_NAME' @ [99:48] ==> public val KOTLIN_CACHE_DIRECTORY_NAME: String defined in org.jetbrains.kotlin.incremental[DeserializedPropertyDescriptor]

'sb' @ [102:16] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpKotlinCachesFileNames[LocalVariableDescriptor]

'toString' @ [102:19] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'p' @ [112:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpCachesForTarget[ValueParameterDescriptorImpl]

'println' @ [112:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'target' @ [112:19] ==> value-parameter target: BuildTarget<*> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpCachesForTarget[ValueParameterDescriptorImpl]

'p' @ [113:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpCachesForTarget[ValueParameterDescriptorImpl]

'pushIndent' @ [113:11] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'paths' @ [115:24] ==> value-parameter paths: BuildDataPaths defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpCachesForTarget[ValueParameterDescriptorImpl]

'getTargetDataRoot' @ [115:30] ==> public abstract fun getTargetDataRoot(p0: (BuildTarget<*>..BuildTarget<*>?)): (File..File?) defined in org.jetbrains.jps.builders.storage.BuildDataPaths[JavaMethodDescriptor]

'target' @ [115:48] ==> value-parameter target: BuildTarget<*> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpCachesForTarget[ValueParameterDescriptorImpl]

'let' @ [115:56] ==> @InlineOnly public inline fun <T, R> (File..File?).let(block: ((File..File?)) -> (File..File?)): (File..File?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)
    <R> -> (java.io.File..java.io.File?)

'if (subdirectory != null) File(it, subdirectory) else it' @ [115:62] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (File..File?), elseBranch: (File..File?)): (File..File?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.io.File..java.io.File?)

'subdirectory' @ [115:66] ==> value-parameter subdirectory: String? = ... defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpCachesForTarget[ValueParameterDescriptorImpl]

'File' @ [115:88] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [115:93] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpCachesForTarget.<anonymous>[ValueParameterDescriptorImpl]

'subdirectory' @ [115:97] ==> value-parameter subdirectory: String? = ... defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpCachesForTarget[ValueParameterDescriptorImpl]

'it' @ [115:116] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpCachesForTarget.<anonymous>[ValueParameterDescriptorImpl]

'cacheVersionsFiles' @ [116:9] ==> value-parameter vararg cacheVersionsFiles: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpCachesForTarget[ValueParameterDescriptorImpl]

'filter' @ [117:18] ==> public inline fun <T> Array<out File>.filter(predicate: (File) -> Boolean): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'sortedBy' @ [118:18] ==> public inline fun <T, R : Comparable<String>> Iterable<File>.sortedBy(crossinline selector: (File) -> String?): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R : Comparable<R>> -> String

'it' @ [118:29] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpCachesForTarget.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [118:32] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'forEach' @ [119:18] ==> @HidesMembers public inline fun <T> Iterable<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'p' @ [119:28] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpCachesForTarget[ValueParameterDescriptorImpl]

'println' @ [119:30] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'it' @ [119:38] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpCachesForTarget.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [119:41] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'kotlinCacheNames' @ [121:9] ==> private final fun kotlinCacheNames(dir: File): List<String> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest[SimpleFunctionDescriptorImpl]

'dataRoot' @ [121:26] ==> val dataRoot: (File..File?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpCachesForTarget[LocalVariableDescriptor]

'sorted' @ [121:36] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'forEach' @ [121:45] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'p' @ [121:55] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpCachesForTarget[ValueParameterDescriptorImpl]

'println' @ [121:57] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'it' @ [121:65] ==> value-parameter it: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpCachesForTarget.<anonymous>[ValueParameterDescriptorImpl]

'p' @ [123:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.dumpCachesForTarget[ValueParameterDescriptorImpl]

'popIndent' @ [123:11] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'arrayListOf' @ [127:22] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'dir' @ [129:22] ==> value-parameter dir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.kotlinCacheNames[ValueParameterDescriptorImpl]

'walk' @ [129:26] ==> public fun File.walk(direction: FileWalkDirection = ...): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'file' @ [130:17] ==> val file: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.kotlinCacheNames[LocalVariableDescriptor]

'isFile' @ [130:22] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'file' @ [130:32] ==> val file: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.kotlinCacheNames[LocalVariableDescriptor]

'extension' @ [130:37] ==> public val File.extension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'BasicMapsOwner' @ [130:50] ==> public companion object defined in org.jetbrains.kotlin.incremental.storage.BasicMapsOwner[FakeCallableDescriptorForObject]

'CACHE_EXTENSION' @ [130:65] ==> public final val CACHE_EXTENSION: String defined in org.jetbrains.kotlin.incremental.storage.BasicMapsOwner.Companion[DeserializedPropertyDescriptor]

'result' @ [131:17] ==> val result: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.kotlinCacheNames[LocalVariableDescriptor]

'add' @ [131:24] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'file' @ [131:28] ==> val file: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.kotlinCacheNames[LocalVariableDescriptor]

'name' @ [131:33] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'result' @ [135:16] ==> val result: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalLazyCachesTest.kotlinCacheNames[LocalVariableDescriptor]

