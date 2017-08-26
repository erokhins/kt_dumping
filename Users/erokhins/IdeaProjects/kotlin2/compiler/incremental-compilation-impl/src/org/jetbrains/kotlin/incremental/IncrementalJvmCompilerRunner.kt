'MessageCollector' @ [50:46] ==> public companion object defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[FakeCallableDescriptorForObject]

'NONE' @ [50:63] ==> public final val NONE: MessageCollector defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector.Companion[DeserializedPropertyDescriptor]

'EmptyICReporter' @ [51:32] ==> private object EmptyICReporter : ICReporter defined in org.jetbrains.kotlin.incremental in file IncrementalJvmCompilerRunner.kt[FakeCallableDescriptorForObject]

'commonCacheVersions' @ [53:20] ==> public fun commonCacheVersions(cachesDir: File): List<CacheVersion> defined in org.jetbrains.kotlin.incremental[SimpleFunctionDescriptorImpl]

'cachesDir' @ [53:40] ==> value-parameter cachesDir: File defined in org.jetbrains.kotlin.incremental.makeIncrementally[ValueParameterDescriptorImpl]

'standaloneCacheVersion' @ [53:53] ==> public fun standaloneCacheVersion(dataRoot: File): CacheVersion defined in org.jetbrains.kotlin.incremental in file cacheVersions.kt[SimpleFunctionDescriptorImpl]

'cachesDir' @ [53:76] ==> value-parameter cachesDir: File defined in org.jetbrains.kotlin.incremental.makeIncrementally[ValueParameterDescriptorImpl]

'listOf' @ [55:28] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'kotlinExtensions' @ [56:25] ==> val kotlinExtensions: List<String> defined in org.jetbrains.kotlin.incremental.makeIncrementally[LocalVariableDescriptor]

'listOf' @ [56:44] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sourceRoots' @ [57:21] ==> value-parameter sourceRoots: Iterable<File> defined in org.jetbrains.kotlin.incremental.makeIncrementally[ValueParameterDescriptorImpl]

'asSequence' @ [57:33] ==> public fun <T> Iterable<File>.asSequence(): Sequence<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'flatMap' @ [57:46] ==> public fun <T, R> Sequence<File>.flatMap(transform: (File) -> Sequence<File>): Sequence<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> File

'it' @ [57:56] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.makeIncrementally.<anonymous>[ValueParameterDescriptorImpl]

'walk' @ [57:59] ==> public fun File.walk(direction: FileWalkDirection = ...): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'rootsWalk' @ [58:17] ==> val rootsWalk: Sequence<File> defined in org.jetbrains.kotlin.incremental.makeIncrementally[LocalVariableDescriptor]

'filter' @ [58:27] ==> public fun <T> Sequence<File>.filter(predicate: (File) -> Boolean): Sequence<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'files' @ [59:23] ==> val files: Sequence<File> defined in org.jetbrains.kotlin.incremental.makeIncrementally[LocalVariableDescriptor]

'filter' @ [59:29] ==> public fun <T> Sequence<File>.filter(predicate: (File) -> Boolean): Sequence<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [59:38] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.makeIncrementally.<anonymous>[ValueParameterDescriptorImpl]

'extension' @ [59:41] ==> public val File.extension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'toLowerCase' @ [59:51] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'allExtensions' @ [59:68] ==> val allExtensions: List<String> defined in org.jetbrains.kotlin.incremental.makeIncrementally[LocalVariableDescriptor]

'toList' @ [59:84] ==> public fun <T> Sequence<File>.toList(): List<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'sourceFiles' @ [60:23] ==> val sourceFiles: List<File> defined in org.jetbrains.kotlin.incremental.makeIncrementally[LocalVariableDescriptor]

'filter' @ [60:35] ==> public inline fun <T> Iterable<File>.filter(predicate: (File) -> Boolean): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [60:44] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.makeIncrementally.<anonymous>[ValueParameterDescriptorImpl]

'extension' @ [60:47] ==> public val File.extension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'toLowerCase' @ [60:57] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'kotlinExtensions' @ [60:74] ==> val kotlinExtensions: List<String> defined in org.jetbrains.kotlin.incremental.makeIncrementally[LocalVariableDescriptor]

'withIC' @ [62:5] ==> public inline fun <R> withIC(enabled: Boolean = ..., fn: () -> ExitCode): ExitCode defined in org.jetbrains.kotlin.incremental[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> ExitCode

'IncrementalJvmCompilerRunner' @ [63:24] ==> public constructor IncrementalJvmCompilerRunner(workingDir: File, javaSourceRoots: Set<JvmSourceRoot>, cacheVersions: List<CacheVersion>, reporter: ICReporter, kaptAnnotationsFileUpdater: AnnotationFileUpdater? = ..., artifactChangesProvider: ArtifactChangesProvider? = ..., changesRegistry: ChangesRegistry? = ...) defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[ClassConstructorDescriptorImpl]

'cachesDir' @ [63:53] ==> value-parameter cachesDir: File defined in org.jetbrains.kotlin.incremental.makeIncrementally[ValueParameterDescriptorImpl]

'sourceRoots' @ [64:53] ==> value-parameter sourceRoots: Iterable<File> defined in org.jetbrains.kotlin.incremental.makeIncrementally[ValueParameterDescriptorImpl]

'map' @ [64:65] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> JvmSourceRoot): List<JvmSourceRoot> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> JvmSourceRoot

'JvmSourceRoot' @ [64:71] ==> public constructor JvmSourceRoot(file: File, packagePrefix: String? = ...) defined in org.jetbrains.kotlin.build.JvmSourceRoot[DeserializedClassConstructorDescriptor]

'it' @ [64:85] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.makeIncrementally.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toSet' @ [64:97] ==> public fun <T> Iterable<JvmSourceRoot>.toSet(): Set<JvmSourceRoot> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmSourceRoot

'versions' @ [65:53] ==> val versions: List<CacheVersion> defined in org.jetbrains.kotlin.incremental.makeIncrementally[LocalVariableDescriptor]

'reporter' @ [65:63] ==> value-parameter reporter: ICReporter = ... defined in org.jetbrains.kotlin.incremental.makeIncrementally[ValueParameterDescriptorImpl]

'compiler' @ [66:9] ==> val compiler: IncrementalJvmCompilerRunner defined in org.jetbrains.kotlin.incremental.makeIncrementally.<anonymous>[LocalVariableDescriptor]

'compile' @ [66:18] ==> public final fun compile(allKotlinSources: List<File>, args: K2JVMCompilerArguments, messageCollector: MessageCollector, getChangedFiles: (IncrementalCachesManager) -> ChangedFiles): ExitCode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[SimpleFunctionDescriptorImpl]

'kotlinFiles' @ [66:26] ==> val kotlinFiles: List<File> defined in org.jetbrains.kotlin.incremental.makeIncrementally[LocalVariableDescriptor]

'args' @ [66:39] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.makeIncrementally[ValueParameterDescriptorImpl]

'messageCollector' @ [66:45] ==> value-parameter messageCollector: MessageCollector = ... defined in org.jetbrains.kotlin.incremental.makeIncrementally[ValueParameterDescriptorImpl]

'it' @ [67:13] ==> value-parameter it: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.makeIncrementally.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'incrementalCache' @ [67:16] ==> public final val incrementalCache: GradleIncrementalCacheImpl defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[PropertyDescriptorImpl]

'sourceSnapshotMap' @ [67:33] ==> internal final val sourceSnapshotMap: FileSnapshotMap defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl[PropertyDescriptorImpl]

'compareAndUpdate' @ [67:51] ==> public final fun compareAndUpdate(newFiles: Iterable<File>): ChangedFiles.Known defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap[SimpleFunctionDescriptorImpl]

'sourceFiles' @ [67:68] ==> val sourceFiles: List<File> defined in org.jetbrains.kotlin.incremental.makeIncrementally[LocalVariableDescriptor]

'isEnabled' @ [78:50] ==> public open fun isEnabled(): Boolean defined in org.jetbrains.kotlin.config.IncrementalCompilation[JavaMethodDescriptor]

'setIsEnabled' @ [79:28] ==> public open fun setIsEnabled(p0: Boolean): Unit defined in org.jetbrains.kotlin.config.IncrementalCompilation[JavaMethodDescriptor]

'enabled' @ [79:41] ==> value-parameter enabled: Boolean = ... defined in org.jetbrains.kotlin.incremental.withIC[ValueParameterDescriptorImpl]

'invoke' @ [82:16] ==> public abstract operator fun invoke(): R defined in kotlin.Function0[FunctionInvokeDescriptor]

'setIsEnabled' @ [85:32] ==> public open fun setIsEnabled(p0: Boolean): Unit defined in org.jetbrains.kotlin.config.IncrementalCompilation[JavaMethodDescriptor]

'isEnabledBackup' @ [85:45] ==> val isEnabledBackup: Boolean defined in org.jetbrains.kotlin.incremental.withIC[LocalVariableDescriptor]

'File' @ [99:34] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'workingDir' @ [99:39] ==> value-parameter workingDir: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.<init>[ValueParameterDescriptorImpl]

'CACHES_DIR_NAME' @ [99:51] ==> public const final val CACHES_DIR_NAME: String defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.Companion[PropertyDescriptorImpl]

'File' @ [100:49] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'workingDir' @ [100:54] ==> value-parameter workingDir: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.<init>[ValueParameterDescriptorImpl]

'DIRTY_SOURCES_FILE_NAME' @ [100:66] ==> public const final val DIRTY_SOURCES_FILE_NAME: String defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.Companion[PropertyDescriptorImpl]

'File' @ [101:37] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'workingDir' @ [101:42] ==> value-parameter workingDir: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.<init>[ValueParameterDescriptorImpl]

'LAST_BUILD_INFO_FILE_NAME' @ [101:54] ==> public const final val LAST_BUILD_INFO_FILE_NAME: String defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.Companion[PropertyDescriptorImpl]

'TargetId' @ [109:24] ==> public constructor TargetId(name: String, type: String) defined in org.jetbrains.kotlin.modules.TargetId[DeserializedClassConstructorDescriptor]

'args' @ [109:40] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[ValueParameterDescriptorImpl]

'moduleName' @ [109:45] ==> @Argument public final var moduleName: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'IncrementalCachesManager' @ [110:22] ==> public constructor IncrementalCachesManager(targetId: TargetId, cacheDirectory: File, outputDir: File, reporter: ICReporter) defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[ClassConstructorDescriptorImpl]

'targetId' @ [110:47] ==> val targetId: TargetId defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[LocalVariableDescriptor]

'cacheDirectory' @ [110:57] ==> private final val cacheDirectory: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'File' @ [110:73] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'args' @ [110:78] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[ValueParameterDescriptorImpl]

'destination' @ [110:83] ==> @Argument public final var destination: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'reporter' @ [110:97] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'caches' @ [113:13] ==> var caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[LocalVariableDescriptor]

'clean' @ [113:20] ==> public final fun clean(): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[SimpleFunctionDescriptorImpl]

'reporter' @ [116:13] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'report' @ [116:22] ==> public abstract fun report(message: () -> String): Unit defined in org.jetbrains.kotlin.incremental.ICReporter[DeserializedSimpleFunctionDescriptor]

'e' @ [116:72] ==> value-parameter e: Exception /* = Exception */ defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile.onError[ValueParameterDescriptorImpl]

'ChangedJavaFilesProcessor' @ [118:38] ==> public constructor ChangedJavaFilesProcessor(reporter: ICReporter) defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor[ClassConstructorDescriptorImpl]

'reporter' @ [118:64] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'caches' @ [119:13] ==> var caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[LocalVariableDescriptor]

'IncrementalCachesManager' @ [119:22] ==> public constructor IncrementalCachesManager(targetId: TargetId, cacheDirectory: File, outputDir: File, reporter: ICReporter) defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[ClassConstructorDescriptorImpl]

'targetId' @ [119:47] ==> val targetId: TargetId defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[LocalVariableDescriptor]

'cacheDirectory' @ [119:57] ==> private final val cacheDirectory: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'args' @ [119:73] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[ValueParameterDescriptorImpl]

'destinationAsFile' @ [119:78] ==> public var K2JVMCompilerArguments.destinationAsFile: File defined in org.jetbrains.kotlin.incremental in file IncrementalJvmCompilerRunner.kt[PropertyDescriptorImpl]

'reporter' @ [119:97] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'compileIncrementally' @ [120:20] ==> private final fun compileIncrementally(args: K2JVMCompilerArguments, caches: IncrementalCachesManager, javaFilesProcessor: ChangedJavaFilesProcessor, allKotlinSources: List<File>, targetId: TargetId, compilationMode: IncrementalJvmCompilerRunner.CompilationMode, messageCollector: MessageCollector): ExitCode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[SimpleFunctionDescriptorImpl]

'args' @ [120:41] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[ValueParameterDescriptorImpl]

'caches' @ [120:47] ==> var caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[LocalVariableDescriptor]

'javaFilesProcessor' @ [120:55] ==> val javaFilesProcessor: ChangedJavaFilesProcessor defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile.onError[LocalVariableDescriptor]

'allKotlinSources' @ [120:75] ==> value-parameter allKotlinSources: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[ValueParameterDescriptorImpl]

'targetId' @ [120:93] ==> val targetId: TargetId defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[LocalVariableDescriptor]

'Rebuild' @ [120:119] ==> public object Rebuild : IncrementalJvmCompilerRunner.CompilationMode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.CompilationMode[FakeCallableDescriptorForObject]

'messageCollector' @ [120:128] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[ValueParameterDescriptorImpl]

'ChangedJavaFilesProcessor' @ [124:38] ==> public constructor ChangedJavaFilesProcessor(reporter: ICReporter) defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor[ClassConstructorDescriptorImpl]

'reporter' @ [124:64] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'invoke' @ [125:32] ==> public abstract operator fun invoke(p1: IncrementalCachesManager): ChangedFiles defined in kotlin.Function1[FunctionInvokeDescriptor]

'caches' @ [125:48] ==> var caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[LocalVariableDescriptor]

'calculateSourcesToCompile' @ [126:35] ==> private final fun calculateSourcesToCompile(javaFilesProcessor: ChangedJavaFilesProcessor, caches: IncrementalCachesManager, changedFiles: ChangedFiles, args: K2JVMCompilerArguments): IncrementalJvmCompilerRunner.CompilationMode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[SimpleFunctionDescriptorImpl]

'javaFilesProcessor' @ [126:61] ==> val javaFilesProcessor: ChangedJavaFilesProcessor defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[LocalVariableDescriptor]

'caches' @ [126:81] ==> var caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[LocalVariableDescriptor]

'changedFiles' @ [126:89] ==> val changedFiles: ChangedFiles defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[LocalVariableDescriptor]

'args' @ [126:103] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[ValueParameterDescriptorImpl]

'compileIncrementally' @ [127:13] ==> private final fun compileIncrementally(args: K2JVMCompilerArguments, caches: IncrementalCachesManager, javaFilesProcessor: ChangedJavaFilesProcessor, allKotlinSources: List<File>, targetId: TargetId, compilationMode: IncrementalJvmCompilerRunner.CompilationMode, messageCollector: MessageCollector): ExitCode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[SimpleFunctionDescriptorImpl]

'args' @ [127:34] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[ValueParameterDescriptorImpl]

'caches' @ [127:40] ==> var caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[LocalVariableDescriptor]

'javaFilesProcessor' @ [127:48] ==> val javaFilesProcessor: ChangedJavaFilesProcessor defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[LocalVariableDescriptor]

'allKotlinSources' @ [127:68] ==> value-parameter allKotlinSources: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[ValueParameterDescriptorImpl]

'targetId' @ [127:86] ==> val targetId: TargetId defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[LocalVariableDescriptor]

'compilationMode' @ [127:96] ==> val compilationMode: IncrementalJvmCompilerRunner.CompilationMode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[LocalVariableDescriptor]

'messageCollector' @ [127:113] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[ValueParameterDescriptorImpl]

'onError' @ [130:13] ==> local final fun onError(e: Exception /* = Exception */): ExitCode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[SimpleFunctionDescriptorImpl]

'e' @ [130:21] ==> val e: PersistentEnumeratorBase.CorruptedException defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[LocalVariableDescriptor]

'onError' @ [133:13] ==> local final fun onError(e: Exception /* = Exception */): ExitCode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[SimpleFunctionDescriptorImpl]

'e' @ [133:21] ==> val e: IOException defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[LocalVariableDescriptor]

'caches' @ [136:13] ==> var caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compile[LocalVariableDescriptor]

'close' @ [136:20] ==> public final fun close(flush: Boolean = ...): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[SimpleFunctionDescriptorImpl]

'reporter' @ [137:13] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'report' @ [137:22] ==> public abstract fun report(message: () -> String): Unit defined in org.jetbrains.kotlin.incremental.ICReporter[DeserializedSimpleFunctionDescriptor]

'CompilationMode' @ [144:56] ==> private constructor CompilationMode() defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.CompilationMode[ClassConstructorDescriptorImpl]

'CompilationMode' @ [145:26] ==> private constructor CompilationMode() defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.CompilationMode[ClassConstructorDescriptorImpl]

'reporter' @ [155:13] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'report' @ [155:22] ==> public abstract fun report(message: () -> String): Unit defined in org.jetbrains.kotlin.incremental.ICReporter[DeserializedSimpleFunctionDescriptor]

'invoke' @ [155:80] ==> public abstract operator fun invoke(): String defined in kotlin.Function0[FunctionInvokeDescriptor]

'caches' @ [156:13] ==> value-parameter caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[ValueParameterDescriptorImpl]

'clean' @ [156:20] ==> public final fun clean(): Unit defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[SimpleFunctionDescriptorImpl]

'dirtySourcesSinceLastTimeFile' @ [157:13] ==> private final val dirtySourcesSinceLastTimeFile: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'delete' @ [157:43] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'args' @ [158:13] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[ValueParameterDescriptorImpl]

'destinationAsFile' @ [158:18] ==> public var K2JVMCompilerArguments.destinationAsFile: File defined in org.jetbrains.kotlin.incremental in file IncrementalJvmCompilerRunner.kt[PropertyDescriptorImpl]

'deleteRecursively' @ [158:36] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Rebuild' @ [159:36] ==> public object Rebuild : IncrementalJvmCompilerRunner.CompilationMode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.CompilationMode[FakeCallableDescriptorForObject]

'changedFiles' @ [162:13] ==> value-parameter changedFiles: ChangedFiles defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[ValueParameterDescriptorImpl]

'rebuild' @ [162:57] ==> local final fun rebuild(reason: () -> String): IncrementalJvmCompilerRunner.CompilationMode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[SimpleFunctionDescriptorImpl]

'changedFiles' @ [164:33] ==> value-parameter changedFiles: ChangedFiles defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[ValueParameterDescriptorImpl]

'removed' @ [164:46] ==> public final val removed: List<File> defined in org.jetbrains.kotlin.incremental.ChangedFiles.Known[PropertyDescriptorImpl]

'filter' @ [164:54] ==> public inline fun <T> Iterable<File>.filter(predicate: (File) -> Boolean): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'removedClassFiles' @ [165:13] ==> val removedClassFiles: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'any' @ [165:31] ==> public fun <T> Iterable<File>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'rebuild' @ [165:45] ==> local final fun rebuild(reason: () -> String): IncrementalJvmCompilerRunner.CompilationMode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[SimpleFunctionDescriptorImpl]

'reporter' @ [165:78] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'pathsAsString' @ [165:87] ==> public open fun pathsAsString(files: Iterable<File>): String defined in org.jetbrains.kotlin.incremental.ICReporter[DeserializedSimpleFunctionDescriptor]

'removedClassFiles' @ [165:101] ==> val removedClassFiles: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'changedFiles' @ [167:34] ==> value-parameter changedFiles: ChangedFiles defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[ValueParameterDescriptorImpl]

'modified' @ [167:47] ==> public final val modified: List<File> defined in org.jetbrains.kotlin.incremental.ChangedFiles.Known[PropertyDescriptorImpl]

'filter' @ [167:56] ==> public inline fun <T> Iterable<File>.filter(predicate: (File) -> Boolean): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'modifiedClassFiles' @ [168:13] ==> val modifiedClassFiles: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'any' @ [168:32] ==> public fun <T> Iterable<File>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'rebuild' @ [168:46] ==> local final fun rebuild(reason: () -> String): IncrementalJvmCompilerRunner.CompilationMode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[SimpleFunctionDescriptorImpl]

'reporter' @ [168:80] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'pathsAsString' @ [168:89] ==> public open fun pathsAsString(files: Iterable<File>): String defined in org.jetbrains.kotlin.incremental.ICReporter[DeserializedSimpleFunctionDescriptor]

'modifiedClassFiles' @ [168:103] ==> val modifiedClassFiles: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'args' @ [170:28] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[ValueParameterDescriptorImpl]

'classpathAsList' @ [170:33] ==> public var K2JVMCompilerArguments.classpathAsList: List<File> defined in org.jetbrains.kotlin.incremental in file IncrementalJvmCompilerRunner.kt[PropertyDescriptorImpl]

'toHashSet' @ [170:49] ==> public fun <T> Iterable<File>.toHashSet(): HashSet<File> /* = HashSet<File> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'changedFiles' @ [171:40] ==> value-parameter changedFiles: ChangedFiles defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[ValueParameterDescriptorImpl]

'modified' @ [171:53] ==> public final val modified: List<File> defined in org.jetbrains.kotlin.incremental.ChangedFiles.Known[PropertyDescriptorImpl]

'filter' @ [171:62] ==> public inline fun <T> Iterable<File>.filter(predicate: (File) -> Boolean): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [171:70] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile.<anonymous>[ValueParameterDescriptorImpl]

'classpathSet' @ [171:76] ==> val classpathSet: HashSet<File> /* = HashSet<File> */ defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'BuildInfo' @ [172:29] ==> public companion object defined in org.jetbrains.kotlin.incremental.BuildInfo[FakeCallableDescriptorForObject]

'read' @ [172:39] ==> public final fun read(file: File): BuildInfo? defined in org.jetbrains.kotlin.incremental.BuildInfo.Companion[SimpleFunctionDescriptorImpl]

'lastBuildInfoFile' @ [172:44] ==> private final val lastBuildInfoFile: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'reporter' @ [173:9] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'report' @ [173:18] ==> public abstract fun report(message: () -> String): Unit defined in org.jetbrains.kotlin.incremental.ICReporter[DeserializedSimpleFunctionDescriptor]

'lastBuildInfo' @ [173:55] ==> val lastBuildInfo: BuildInfo? defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'getClasspathChanges' @ [174:32] ==> private final fun getClasspathChanges(modifiedClasspath: List<File>, lastBuildInfo: BuildInfo?): ChangesEither defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[SimpleFunctionDescriptorImpl]

'modifiedClasspathEntries' @ [174:52] ==> val modifiedClasspathEntries: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'lastBuildInfo' @ [174:78] ==> val lastBuildInfo: BuildInfo? defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'classpathChanges' @ [175:13] ==> val classpathChanges: ChangesEither defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'rebuild' @ [176:20] ==> local final fun rebuild(reason: () -> String): IncrementalJvmCompilerRunner.CompilationMode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[SimpleFunctionDescriptorImpl]

'reporter' @ [176:87] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'pathsAsString' @ [176:96] ==> public open fun pathsAsString(files: Iterable<File>): String defined in org.jetbrains.kotlin.incremental.ICReporter[DeserializedSimpleFunctionDescriptor]

'modifiedClasspathEntries' @ [176:110] ==> val modifiedClasspathEntries: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'javaFilesProcessor' @ [179:32] ==> value-parameter javaFilesProcessor: ChangedJavaFilesProcessor defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[ValueParameterDescriptorImpl]

'process' @ [179:51] ==> public final fun process(filesDiff: ChangedFiles.Known): ChangesEither defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor[SimpleFunctionDescriptorImpl]

'changedFiles' @ [179:59] ==> value-parameter changedFiles: ChangedFiles defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[ValueParameterDescriptorImpl]

'when (javaFilesChanges) {
            is ChangesEither.Known -> javaFilesChanges.lookupSymbols
            is ChangesEither.Unknown -> return rebuild {"Could not get changes for java files"}
        }' @ [180:35] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<LookupSymbol>, entry1: Collection<LookupSymbol>): Collection<LookupSymbol>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<LookupSymbol>

'javaFilesChanges' @ [180:41] ==> val javaFilesChanges: ChangesEither defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'javaFilesChanges' @ [181:39] ==> val javaFilesChanges: ChangesEither defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'lookupSymbols' @ [181:56] ==> public final val lookupSymbols: Collection<LookupSymbol> defined in org.jetbrains.kotlin.incremental.ChangesEither.Known[PropertyDescriptorImpl]

'rebuild' @ [182:48] ==> local final fun rebuild(reason: () -> String): IncrementalJvmCompilerRunner.CompilationMode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[SimpleFunctionDescriptorImpl]

'HashSet' @ [185:26] ==> public constructor HashSet<E : (Any..Any?)>(p0: Int) defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> File

'with' @ [185:40] ==> @InlineOnly public inline fun <T, R> with(receiver: ChangedFiles.Known, block: ChangedFiles.Known.() -> Int): Int defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Known
    <R> -> Int

'changedFiles' @ [185:45] ==> value-parameter changedFiles: ChangedFiles defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[ValueParameterDescriptorImpl]

'modified' @ [185:60] ==> public final val modified: List<File> defined in org.jetbrains.kotlin.incremental.ChangedFiles.Known[PropertyDescriptorImpl]

'size' @ [185:69] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'removed' @ [185:76] ==> public final val removed: List<File> defined in org.jetbrains.kotlin.incremental.ChangedFiles.Known[PropertyDescriptorImpl]

'size' @ [185:84] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'with' @ [186:9] ==> @InlineOnly public inline fun <T, R> with(receiver: ChangedFiles.Known, block: ChangedFiles.Known.() -> Sequence<File>): Sequence<File> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Known
    <R> -> Sequence<File>

'changedFiles' @ [186:14] ==> value-parameter changedFiles: ChangedFiles defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[ValueParameterDescriptorImpl]

'modified' @ [187:13] ==> public final val modified: List<File> defined in org.jetbrains.kotlin.incremental.ChangedFiles.Known[PropertyDescriptorImpl]

'asSequence' @ [187:22] ==> public fun <T> Iterable<File>.asSequence(): Sequence<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'removed' @ [187:37] ==> public final val removed: List<File> defined in org.jetbrains.kotlin.incremental.ChangedFiles.Known[PropertyDescriptorImpl]

'asSequence' @ [187:45] ==> public fun <T> Iterable<File>.asSequence(): Sequence<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'forEach' @ [188:11] ==> public inline fun <T> Sequence<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [188:24] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile.<anonymous>[ValueParameterDescriptorImpl]

'isKotlinFile' @ [188:27] ==> public fun File.isKotlinFile(): Boolean defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'dirtyFiles' @ [188:43] ==> val dirtyFiles: HashSet<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'add' @ [188:54] ==> public open fun add(element: File): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'it' @ [188:58] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile.<anonymous>[ValueParameterDescriptorImpl]

'HashSet' @ [190:29] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LookupSymbol

'lookupSymbols' @ [191:9] ==> val lookupSymbols: HashSet<LookupSymbol> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'addAll' @ [191:23] ==> public open fun addAll(elements: Collection<LookupSymbol>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'affectedJavaSymbols' @ [191:30] ==> val affectedJavaSymbols: Collection<LookupSymbol> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'lookupSymbols' @ [192:9] ==> val lookupSymbols: HashSet<LookupSymbol> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'addAll' @ [192:23] ==> public open fun addAll(elements: Collection<LookupSymbol>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'classpathChanges' @ [192:30] ==> val classpathChanges: ChangesEither defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'lookupSymbols' @ [192:47] ==> public final val lookupSymbols: Collection<LookupSymbol> defined in org.jetbrains.kotlin.incremental.ChangesEither.Known[PropertyDescriptorImpl]

'lookupSymbols' @ [194:13] ==> val lookupSymbols: HashSet<LookupSymbol> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'any' @ [194:27] ==> public fun <T> Iterable<LookupSymbol>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupSymbol

'mapLookupSymbolsToFiles' @ [195:41] ==> public fun mapLookupSymbolsToFiles(lookupStorage: LookupStorage, lookupSymbols: Iterable<LookupSymbol>, reporter: ICReporter, excludes: Set<File> = ...): Set<File> defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'caches' @ [195:65] ==> value-parameter caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[ValueParameterDescriptorImpl]

'lookupCache' @ [195:72] ==> public final val lookupCache: LookupStorage defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[PropertyDescriptorImpl]

'lookupSymbols' @ [195:85] ==> val lookupSymbols: HashSet<LookupSymbol> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'reporter' @ [195:100] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'dirtyFiles' @ [196:13] ==> val dirtyFiles: HashSet<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'addAll' @ [196:24] ==> public open fun addAll(elements: Collection<File>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'dirtyFilesFromLookups' @ [196:31] ==> val dirtyFilesFromLookups: Set<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'classpathChanges' @ [199:35] ==> val classpathChanges: ChangesEither defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'fqNames' @ [199:52] ==> public final val fqNames: Collection<FqName> defined in org.jetbrains.kotlin.incremental.ChangesEither.Known[PropertyDescriptorImpl]

'flatMap' @ [199:60] ==> public inline fun <T, R> Iterable<FqName>.flatMap(transform: (FqName) -> Iterable<FqName>): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> FqName

'withSubtypes' @ [199:69] ==> public fun <Target> withSubtypes(typeFqName: FqName, caches: Iterable<IncrementalCacheImpl<TargetId>>): Set<FqName> defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <Target> -> TargetId

'it' @ [199:82] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [199:86] ==> public fun <T> listOf(element: GradleIncrementalCacheImpl): List<GradleIncrementalCacheImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GradleIncrementalCacheImpl

'caches' @ [199:93] ==> value-parameter caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[ValueParameterDescriptorImpl]

'incrementalCache' @ [199:100] ==> public final val incrementalCache: GradleIncrementalCacheImpl defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[PropertyDescriptorImpl]

'dirtyClassesFqNames' @ [200:13] ==> val dirtyClassesFqNames: List<FqName> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'any' @ [200:33] ==> public fun <T> Iterable<FqName>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'mapClassesFqNamesToFiles' @ [201:41] ==> public fun <Target> mapClassesFqNamesToFiles(caches: Iterable<IncrementalCacheImpl<TargetId>>, classesFqNames: Iterable<FqName>, reporter: ICReporter, excludes: Set<File> = ...): Set<File> defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <Target> -> TargetId

'listOf' @ [201:66] ==> public fun <T> listOf(element: GradleIncrementalCacheImpl): List<GradleIncrementalCacheImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GradleIncrementalCacheImpl

'caches' @ [201:73] ==> value-parameter caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[ValueParameterDescriptorImpl]

'incrementalCache' @ [201:80] ==> public final val incrementalCache: GradleIncrementalCacheImpl defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[PropertyDescriptorImpl]

'dirtyClassesFqNames' @ [201:99] ==> val dirtyClassesFqNames: List<FqName> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'reporter' @ [201:120] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'dirtyFiles' @ [202:13] ==> val dirtyFiles: HashSet<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'addAll' @ [202:24] ==> public open fun addAll(elements: Collection<File>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'dirtyFilesFromFqNames' @ [202:31] ==> val dirtyFilesFromFqNames: Set<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'dirtySourcesSinceLastTimeFile' @ [205:13] ==> private final val dirtySourcesSinceLastTimeFile: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'exists' @ [205:43] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'dirtySourcesSinceLastTimeFile' @ [206:25] ==> private final val dirtySourcesSinceLastTimeFile: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'readLines' @ [206:55] ==> public fun File.readLines(charset: Charset = ...): List<String> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'map' @ [206:67] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'filter' @ [206:79] ==> public inline fun <T> Iterable<File>.filter(predicate: (File) -> Boolean): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'files' @ [207:17] ==> val files: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'isNotEmpty' @ [207:23] ==> @InlineOnly public inline fun <T> Collection<File>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'reporter' @ [208:17] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'report' @ [208:26] ==> public abstract fun report(message: () -> String): Unit defined in org.jetbrains.kotlin.incremental.ICReporter[DeserializedSimpleFunctionDescriptor]

'reporter' @ [208:80] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'pathsAsString' @ [208:89] ==> public open fun pathsAsString(files: Iterable<File>): String defined in org.jetbrains.kotlin.incremental.ICReporter[DeserializedSimpleFunctionDescriptor]

'files' @ [208:103] ==> val files: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'dirtyFiles' @ [211:13] ==> val dirtyFiles: HashSet<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'addAll' @ [211:24] ==> public open fun addAll(elements: Collection<File>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'files' @ [211:31] ==> val files: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'Incremental' @ [214:32] ==> public constructor Incremental(dirtyFiles: Set<File>) defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.CompilationMode.Incremental[ClassConstructorDescriptorImpl]

'dirtyFiles' @ [214:44] ==> val dirtyFiles: HashSet<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.calculateSourcesToCompile[LocalVariableDescriptor]

'modifiedClasspath' @ [221:13] ==> value-parameter modifiedClasspath: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.getClasspathChanges[ValueParameterDescriptorImpl]

'isEmpty' @ [221:31] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'reporter' @ [222:13] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'report' @ [222:22] ==> public abstract fun report(message: () -> String): Unit defined in org.jetbrains.kotlin.incremental.ICReporter[DeserializedSimpleFunctionDescriptor]

'Known' @ [223:34] ==> public constructor Known(lookupSymbols: Collection<LookupSymbol> = ..., fqNames: Collection<FqName> = ...) defined in org.jetbrains.kotlin.incremental.ChangesEither.Known[ClassConstructorDescriptorImpl]

'lastBuildInfo' @ [226:27] ==> value-parameter lastBuildInfo: BuildInfo? defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.getClasspathChanges[ValueParameterDescriptorImpl]

'startTS' @ [226:42] ==> public final val startTS: Long defined in org.jetbrains.kotlin.incremental.BuildInfo[PropertyDescriptorImpl]

'lastBuildTS' @ [227:13] ==> val lastBuildTS: Long? defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.getClasspathChanges[LocalVariableDescriptor]

'reporter' @ [228:13] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'report' @ [228:22] ==> public abstract fun report(message: () -> String): Unit defined in org.jetbrains.kotlin.incremental.ICReporter[DeserializedSimpleFunctionDescriptor]

'Unknown' @ [229:34] ==> public constructor Unknown() defined in org.jetbrains.kotlin.incremental.ChangesEither.Unknown[ClassConstructorDescriptorImpl]

'HashSet' @ [232:23] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LookupSymbol

'HashSet' @ [233:23] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FqName

'modifiedClasspath' @ [234:22] ==> value-parameter modifiedClasspath: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.getClasspathChanges[ValueParameterDescriptorImpl]

'artifactChangesProvider' @ [235:25] ==> private final val artifactChangesProvider: ArtifactChangesProvider? defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'getChanges' @ [235:50] ==> public abstract fun getChanges(artifact: File, sinceTS: Long): Iterable<DirtyData>? defined in org.jetbrains.kotlin.incremental.multiproject.ArtifactChangesProvider[SimpleFunctionDescriptorImpl]

'file' @ [235:61] ==> val file: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.getClasspathChanges[LocalVariableDescriptor]

'lastBuildTS' @ [235:67] ==> val lastBuildTS: Long? defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.getClasspathChanges[LocalVariableDescriptor]

'diffs' @ [237:17] ==> val diffs: Iterable<DirtyData>? defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.getClasspathChanges[LocalVariableDescriptor]

'reporter' @ [238:17] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'report' @ [238:26] ==> public abstract fun report(message: () -> String): Unit defined in org.jetbrains.kotlin.incremental.ICReporter[DeserializedSimpleFunctionDescriptor]

'file' @ [238:68] ==> val file: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.getClasspathChanges[LocalVariableDescriptor]

'Unknown' @ [239:38] ==> public constructor Unknown() defined in org.jetbrains.kotlin.incremental.ChangesEither.Unknown[ClassConstructorDescriptorImpl]

'diffs' @ [242:13] ==> val diffs: Iterable<DirtyData>? defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.getClasspathChanges[LocalVariableDescriptor]

'forEach' @ [242:19] ==> @HidesMembers public inline fun <T> Iterable<DirtyData>.forEach(action: (DirtyData) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DirtyData

'symbols' @ [243:17] ==> val symbols: HashSet<LookupSymbol> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.getClasspathChanges[LocalVariableDescriptor]

'addAll' @ [243:25] ==> public open fun addAll(elements: Collection<LookupSymbol>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'it' @ [243:32] ==> value-parameter it: DirtyData defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.getClasspathChanges.<anonymous>[ValueParameterDescriptorImpl]

'dirtyLookupSymbols' @ [243:35] ==> public final val dirtyLookupSymbols: Collection<LookupSymbol> defined in org.jetbrains.kotlin.incremental.DirtyData[DeserializedPropertyDescriptor]

'fqNames' @ [244:17] ==> val fqNames: HashSet<FqName> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.getClasspathChanges[LocalVariableDescriptor]

'addAll' @ [244:25] ==> public open fun addAll(elements: Collection<FqName>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'it' @ [244:32] ==> value-parameter it: DirtyData defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.getClasspathChanges.<anonymous>[ValueParameterDescriptorImpl]

'dirtyClassesFqNames' @ [244:35] ==> public final val dirtyClassesFqNames: Collection<FqName> defined in org.jetbrains.kotlin.incremental.DirtyData[DeserializedPropertyDescriptor]

'Known' @ [248:30] ==> public constructor Known(lookupSymbols: Collection<LookupSymbol> = ..., fqNames: Collection<FqName> = ...) defined in org.jetbrains.kotlin.incremental.ChangesEither.Known[ClassConstructorDescriptorImpl]

'symbols' @ [248:36] ==> val symbols: HashSet<LookupSymbol> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.getClasspathChanges[LocalVariableDescriptor]

'fqNames' @ [248:45] ==> val fqNames: HashSet<FqName> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.getClasspathChanges[LocalVariableDescriptor]

'assert' @ [260:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'isEnabled' @ [260:39] ==> public open fun isEnabled(): Boolean defined in org.jetbrains.kotlin.config.IncrementalCompilation[JavaMethodDescriptor]

'hashSetOf' @ [262:33] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<GeneratedFile<TargetId>> /* = HashSet<GeneratedFile<TargetId>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GeneratedFile<TargetId>

'when (compilationMode) {
            is CompilationMode.Incremental -> {
                dirtySources = ArrayList(compilationMode.dirtyFiles)
                args.classpathAsList += args.destinationAsFile.apply { mkdirs() }
            }
            is CompilationMode.Rebuild -> {
                dirtySources = allKotlinSources.toMutableList()
                // there is no point in updating annotation file since all files will be compiled anyway
                kaptAnnotationsFileUpdater = null
            }
        }' @ [265:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'compilationMode' @ [265:15] ==> value-parameter compilationMode: IncrementalJvmCompilerRunner.CompilationMode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'dirtySources' @ [267:17] ==> val dirtySources: MutableList<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'ArrayList' @ [267:32] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (File..File?)>..Collection<(File..File?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> File

'compilationMode' @ [267:42] ==> value-parameter compilationMode: IncrementalJvmCompilerRunner.CompilationMode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'dirtyFiles' @ [267:58] ==> public final val dirtyFiles: Set<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.CompilationMode.Incremental[PropertyDescriptorImpl]

'args' @ [268:17] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'classpathAsList' @ [268:22] ==> public var K2JVMCompilerArguments.classpathAsList: List<File> defined in org.jetbrains.kotlin.incremental in file IncrementalJvmCompilerRunner.kt[PropertyDescriptorImpl]

'args' @ [268:41] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'destinationAsFile' @ [268:46] ==> public var K2JVMCompilerArguments.destinationAsFile: File defined in org.jetbrains.kotlin.incremental in file IncrementalJvmCompilerRunner.kt[PropertyDescriptorImpl]

'apply' @ [268:64] ==> @InlineOnly public inline fun <T> File.apply(block: File.() -> Unit): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'mkdirs' @ [268:72] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'dirtySources' @ [271:17] ==> val dirtySources: MutableList<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'allKotlinSources' @ [271:32] ==> value-parameter allKotlinSources: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'toMutableList' @ [271:49] ==> public fun <T> Collection<File>.toMutableList(): MutableList<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'kaptAnnotationsFileUpdater' @ [273:17] ==> private final var kaptAnnotationsFileUpdater: AnnotationFileUpdater? defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'BuildInfo' @ [277:32] ==> public constructor BuildInfo(startTS: Long) defined in org.jetbrains.kotlin.incremental.BuildInfo[ClassConstructorDescriptorImpl]

'currentTimeMillis' @ [277:59] ==> public open fun currentTimeMillis(): Long defined in java.lang.System[JavaMethodDescriptor]

'BuildInfo' @ [278:9] ==> public companion object defined in org.jetbrains.kotlin.incremental.BuildInfo[FakeCallableDescriptorForObject]

'write' @ [278:19] ==> public final fun write(buildInfo: BuildInfo, file: File): Unit defined in org.jetbrains.kotlin.incremental.BuildInfo.Companion[SimpleFunctionDescriptorImpl]

'currentBuildInfo' @ [278:25] ==> val currentBuildInfo: BuildInfo defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'lastBuildInfoFile' @ [278:43] ==> private final val lastBuildInfoFile: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'HashSet' @ [279:39] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LookupSymbol

'HashSet' @ [280:33] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FqName

'HashSet' @ [281:35] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> File

'OK' @ [283:33] ==> enum entry OK defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'dirtySources' @ [284:16] ==> val dirtySources: MutableList<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'any' @ [284:29] ==> public fun <T> Iterable<File>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'LookupTrackerImpl' @ [285:33] ==> public constructor LookupTrackerImpl(delegate: LookupTracker) defined in org.jetbrains.kotlin.incremental.LookupTrackerImpl[DeserializedClassConstructorDescriptor]

'DO_NOTHING' @ [285:65] ==> public object DO_NOTHING : LookupTracker defined in org.jetbrains.kotlin.incremental.components.LookupTracker[FakeCallableDescriptorForObject]

'caches' @ [286:35] ==> value-parameter caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'incrementalCache' @ [286:42] ==> public final val incrementalCache: GradleIncrementalCacheImpl defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[PropertyDescriptorImpl]

'classesBySources' @ [286:59] ==> public final fun classesBySources(sources: Iterable<File>): Iterable<JvmClassName> defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl[DeserializedSimpleFunctionDescriptor]

'dirtySources' @ [286:76] ==> val dirtySources: MutableList<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'caches' @ [287:13] ==> value-parameter caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'incrementalCache' @ [287:20] ==> public final val incrementalCache: GradleIncrementalCacheImpl defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[PropertyDescriptorImpl]

'markOutputClassesDirty' @ [287:37] ==> public final fun markOutputClassesDirty(removedAndCompiledSources: List<File>): Unit defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl[DeserializedSimpleFunctionDescriptor]

'dirtySources' @ [287:60] ==> val dirtySources: MutableList<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'caches' @ [288:13] ==> value-parameter caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'incrementalCache' @ [288:20] ==> public final val incrementalCache: GradleIncrementalCacheImpl defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[PropertyDescriptorImpl]

'removeOutputForSourceFiles' @ [288:37] ==> public final fun removeOutputForSourceFiles(sources: Iterable<File>): Unit defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl[SimpleFunctionDescriptorImpl]

'dirtySources' @ [288:64] ==> val dirtySources: MutableList<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'component1' @ [290:18] ==> public final operator fun component1(): List<File> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [290:36] ==> public final operator fun component2(): List<File> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'dirtySources' @ [290:60] ==> val dirtySources: MutableList<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'partition' @ [290:73] ==> public inline fun <T> Iterable<File>.partition(predicate: (File) -> Boolean): Pair<List<File>, List<File>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'allSourcesToCompile' @ [294:13] ==> val allSourcesToCompile: HashSet<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'addAll' @ [294:33] ==> public open fun addAll(elements: Collection<File>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'sourcesToCompile' @ [294:40] ==> val sourcesToCompile: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'allSourcesToCompile' @ [295:24] ==> val allSourcesToCompile: HashSet<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'joinToString' @ [295:44] ==> public fun <T> Iterable<File>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((File) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'getProperty' @ [295:76] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'it' @ [295:109] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally.<anonymous>[ValueParameterDescriptorImpl]

'canonicalPath' @ [295:112] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'dirtySourcesSinceLastTimeFile' @ [296:13] ==> private final val dirtySourcesSinceLastTimeFile: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'writeText' @ [296:43] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'text' @ [296:53] ==> val text: String defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'compileChanged' @ [298:34] ==> private final fun compileChanged(targets: List<TargetId>, sourcesToCompile: Set<File>, args: K2JVMCompilerArguments, getIncrementalCache: (TargetId) -> GradleIncrementalCacheImpl, lookupTracker: LookupTracker, messageCollector: MessageCollector): IncrementalJvmCompilerRunner.CompileChangedResults defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[SimpleFunctionDescriptorImpl]

'listOf' @ [298:49] ==> public fun <T> listOf(element: TargetId): List<TargetId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TargetId

'targetId' @ [298:56] ==> value-parameter targetId: TargetId defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'sourcesToCompile' @ [298:67] ==> val sourcesToCompile: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'toSet' @ [298:84] ==> public fun <T> Iterable<File>.toSet(): Set<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'args' @ [298:93] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'caches' @ [298:101] ==> value-parameter caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'incrementalCache' @ [298:108] ==> public final val incrementalCache: GradleIncrementalCacheImpl defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[PropertyDescriptorImpl]

'lookupTracker' @ [298:128] ==> val lookupTracker: LookupTrackerImpl defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'messageCollector' @ [298:143] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'exitCode' @ [299:13] ==> var exitCode: ExitCode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'compilerOutput' @ [299:24] ==> val compilerOutput: IncrementalJvmCompilerRunner.CompileChangedResults defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'exitCode' @ [299:39] ==> public final val exitCode: ExitCode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.CompileChangedResults[PropertyDescriptorImpl]

'compilerOutput' @ [300:34] ==> val compilerOutput: IncrementalJvmCompilerRunner.CompileChangedResults defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'generatedFiles' @ [300:49] ==> public final val generatedFiles: List<GeneratedFile<TargetId>> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.CompileChangedResults[PropertyDescriptorImpl]

'anyClassesCompiled' @ [301:13] ==> private final var anyClassesCompiled: Boolean defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'anyClassesCompiled' @ [301:34] ==> private final var anyClassesCompiled: Boolean defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'generatedFiles' @ [301:56] ==> val generatedFiles: List<GeneratedFile<TargetId>> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'isNotEmpty' @ [301:71] ==> @InlineOnly public inline fun <T> Collection<GeneratedFile<TargetId>>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GeneratedFile<TargetId>

'removedKotlinSources' @ [301:87] ==> val removedKotlinSources: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'isNotEmpty' @ [301:108] ==> @InlineOnly public inline fun <T> Collection<File>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'if (exitCode == ExitCode.OK) {
                dirtySourcesSinceLastTimeFile.delete()
                kaptAnnotationsFileUpdater?.updateAnnotations(outdatedClasses)
            } else {
                kaptAnnotationsFileUpdater?.revert()
                break
            }' @ [303:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'exitCode' @ [303:17] ==> var exitCode: ExitCode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'OK' @ [303:38] ==> enum entry OK defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'dirtySourcesSinceLastTimeFile' @ [304:17] ==> private final val dirtySourcesSinceLastTimeFile: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'delete' @ [304:47] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'kaptAnnotationsFileUpdater' @ [305:17] ==> private final var kaptAnnotationsFileUpdater: AnnotationFileUpdater? defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'updateAnnotations' @ [305:45] ==> public abstract fun updateAnnotations(outdatedClasses: Iterable<JvmClassName>): Unit defined in org.jetbrains.kotlin.annotation.AnnotationFileUpdater[SimpleFunctionDescriptorImpl]

'outdatedClasses' @ [305:63] ==> val outdatedClasses: Iterable<JvmClassName> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'kaptAnnotationsFileUpdater' @ [307:17] ==> private final var kaptAnnotationsFileUpdater: AnnotationFileUpdater? defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'revert' @ [307:45] ==> public abstract fun revert(): Unit defined in org.jetbrains.kotlin.annotation.AnnotationFileUpdater[SimpleFunctionDescriptorImpl]

'compilationMode' @ [311:17] ==> value-parameter compilationMode: IncrementalJvmCompilerRunner.CompilationMode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'dirtySources' @ [312:39] ==> val dirtySources: MutableList<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'toHashSet' @ [312:52] ==> public fun <T> Iterable<File>.toHashSet(): HashSet<File> /* = HashSet<File> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'additionalDirtyFiles' @ [313:44] ==> private final fun additionalDirtyFiles(caches: IncrementalCachesManager, generatedFiles: List<GeneratedFile<TargetId>>): Collection<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[SimpleFunctionDescriptorImpl]

'caches' @ [313:65] ==> value-parameter caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'generatedFiles' @ [313:73] ==> val generatedFiles: List<GeneratedFile<TargetId>> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'filter' @ [313:89] ==> public inline fun <T> Iterable<File>.filter(predicate: (File) -> Boolean): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [313:98] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally.<anonymous>[ValueParameterDescriptorImpl]

'dirtySourcesSet' @ [313:105] ==> val dirtySourcesSet: HashSet<File> /* = HashSet<File> */ defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'additionalDirtyFiles' @ [314:21] ==> val additionalDirtyFiles: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'isNotEmpty' @ [314:42] ==> @InlineOnly public inline fun <T> Collection<File>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'dirtySources' @ [315:21] ==> val dirtySources: MutableList<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'addAll' @ [315:34] ==> public abstract fun addAll(elements: Collection<File>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'additionalDirtyFiles' @ [315:41] ==> val additionalDirtyFiles: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'allGeneratedFiles' @ [320:13] ==> val allGeneratedFiles: HashSet<GeneratedFile<TargetId>> /* = HashSet<GeneratedFile<TargetId>> */ defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'addAll' @ [320:31] ==> public open fun addAll(elements: Collection<GeneratedFile<TargetId>>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'generatedFiles' @ [320:38] ==> val generatedFiles: List<GeneratedFile<TargetId>> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'caches' @ [321:13] ==> value-parameter caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'incrementalCache' @ [321:20] ==> public final val incrementalCache: GradleIncrementalCacheImpl defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[PropertyDescriptorImpl]

'registerOutputForSourceFiles' @ [321:37] ==> public final fun registerOutputForSourceFiles(generatedFiles: List<GeneratedFile<*>>): Unit defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl[SimpleFunctionDescriptorImpl]

'generatedFiles' @ [321:66] ==> val generatedFiles: List<GeneratedFile<TargetId>> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'updateIncrementalCaches' @ [322:37] ==> public fun <Target> updateIncrementalCaches(targets: Iterable<TargetId>, generatedFiles: List<GeneratedFile<TargetId>>, compiledWithErrors: Boolean, getIncrementalCache: (TargetId) -> IncrementalCacheImpl<TargetId>): CompilationResult defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <Target> -> TargetId

'listOf' @ [322:61] ==> public fun <T> listOf(element: TargetId): List<TargetId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TargetId

'targetId' @ [322:68] ==> value-parameter targetId: TargetId defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'generatedFiles' @ [322:79] ==> val generatedFiles: List<GeneratedFile<TargetId>> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'exitCode' @ [323:42] ==> var exitCode: ExitCode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'OK' @ [323:63] ==> enum entry OK defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'caches' @ [324:45] ==> value-parameter caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'incrementalCache' @ [324:52] ==> public final val incrementalCache: GradleIncrementalCacheImpl defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[PropertyDescriptorImpl]

'caches' @ [326:13] ==> value-parameter caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'lookupCache' @ [326:20] ==> public final val lookupCache: LookupStorage defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[PropertyDescriptorImpl]

'update' @ [326:32] ==> public fun LookupStorage.update(lookupTracker: LookupTracker, filesToCompile: Iterable<File>, removedFiles: Iterable<File>): Unit defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'lookupTracker' @ [326:39] ==> val lookupTracker: LookupTrackerImpl defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'sourcesToCompile' @ [326:54] ==> val sourcesToCompile: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'removedKotlinSources' @ [326:72] ==> val removedKotlinSources: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'compilationMode' @ [328:17] ==> value-parameter compilationMode: IncrementalJvmCompilerRunner.CompilationMode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'component1' @ [332:18] ==> public final operator fun component1(): Collection<LookupSymbol> defined in org.jetbrains.kotlin.incremental.DirtyData[DeserializedSimpleFunctionDescriptor]

'component2' @ [332:38] ==> public final operator fun component2(): Collection<FqName> defined in org.jetbrains.kotlin.incremental.DirtyData[DeserializedSimpleFunctionDescriptor]

'compilationResult' @ [332:59] ==> val compilationResult: CompilationResult defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'getDirtyData' @ [332:77] ==> public fun <Target> CompilationResult.getDirtyData(caches: Iterable<IncrementalCacheImpl<TargetId>>, reporter: ICReporter): DirtyData defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <Target> -> TargetId

'listOf' @ [332:90] ==> public fun <T> listOf(element: GradleIncrementalCacheImpl): List<GradleIncrementalCacheImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GradleIncrementalCacheImpl

'caches' @ [332:97] ==> value-parameter caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'incrementalCache' @ [332:104] ==> public final val incrementalCache: GradleIncrementalCacheImpl defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[PropertyDescriptorImpl]

'reporter' @ [332:123] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'sourcesToCompile' @ [333:46] ==> val sourcesToCompile: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'toHashSet' @ [333:63] ==> public fun <T> Iterable<File>.toHashSet(): HashSet<File> /* = HashSet<File> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'with' @ [335:13] ==> @InlineOnly public inline fun <T, R> with(receiver: MutableList<File>, block: MutableList<File>.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableList<File>
    <R> -> Boolean

'dirtySources' @ [335:19] ==> val dirtySources: MutableList<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'clear' @ [336:17] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'addAll' @ [337:17] ==> public abstract fun addAll(elements: Collection<File>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'mapLookupSymbolsToFiles' @ [337:24] ==> public fun mapLookupSymbolsToFiles(lookupStorage: LookupStorage, lookupSymbols: Iterable<LookupSymbol>, reporter: ICReporter, excludes: Set<File> = ...): Set<File> defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'caches' @ [337:48] ==> value-parameter caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'lookupCache' @ [337:55] ==> public final val lookupCache: LookupStorage defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[PropertyDescriptorImpl]

'dirtyLookupSymbols' @ [337:68] ==> val dirtyLookupSymbols: Collection<LookupSymbol> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'reporter' @ [337:88] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'compiledInThisIterationSet' @ [337:109] ==> val compiledInThisIterationSet: HashSet<File> /* = HashSet<File> */ defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'addAll' @ [338:17] ==> public abstract fun addAll(elements: Collection<File>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'mapClassesFqNamesToFiles' @ [338:24] ==> public fun <Target> mapClassesFqNamesToFiles(caches: Iterable<IncrementalCacheImpl<TargetId>>, classesFqNames: Iterable<FqName>, reporter: ICReporter, excludes: Set<File> = ...): Set<File> defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <Target> -> TargetId

'listOf' @ [338:49] ==> public fun <T> listOf(element: GradleIncrementalCacheImpl): List<GradleIncrementalCacheImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GradleIncrementalCacheImpl

'caches' @ [338:56] ==> value-parameter caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'incrementalCache' @ [338:63] ==> public final val incrementalCache: GradleIncrementalCacheImpl defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[PropertyDescriptorImpl]

'dirtyClassFqNames' @ [338:82] ==> val dirtyClassFqNames: Collection<FqName> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'reporter' @ [338:101] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'compiledInThisIterationSet' @ [338:122] ==> val compiledInThisIterationSet: HashSet<File> /* = HashSet<File> */ defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'buildDirtyLookupSymbols' @ [341:13] ==> val buildDirtyLookupSymbols: HashSet<LookupSymbol> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'addAll' @ [341:37] ==> public open fun addAll(elements: Collection<LookupSymbol>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'dirtyLookupSymbols' @ [341:44] ==> val dirtyLookupSymbols: Collection<LookupSymbol> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'buildDirtyFqNames' @ [342:13] ==> val buildDirtyFqNames: HashSet<FqName> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'addAll' @ [342:31] ==> public open fun addAll(elements: Collection<FqName>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'dirtyClassFqNames' @ [342:38] ==> val dirtyClassFqNames: Collection<FqName> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'exitCode' @ [345:13] ==> var exitCode: ExitCode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'OK' @ [345:34] ==> enum entry OK defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'compilationMode' @ [345:40] ==> value-parameter compilationMode: IncrementalJvmCompilerRunner.CompilationMode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'buildDirtyLookupSymbols' @ [346:13] ==> val buildDirtyLookupSymbols: HashSet<LookupSymbol> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'addAll' @ [346:37] ==> public open fun addAll(elements: Collection<LookupSymbol>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'javaFilesProcessor' @ [346:44] ==> value-parameter javaFilesProcessor: ChangedJavaFilesProcessor defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'allChangedSymbols' @ [346:63] ==> public final val allChangedSymbols: Collection<LookupSymbol> defined in org.jetbrains.kotlin.incremental.ChangedJavaFilesProcessor[PropertyDescriptorImpl]

'changesRegistry' @ [348:13] ==> private final val changesRegistry: ChangesRegistry? defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'if (compilationMode is CompilationMode.Incremental) {
                val dirtyData = DirtyData(buildDirtyLookupSymbols, buildDirtyFqNames)
                changesRegistry.registerChanges(currentBuildInfo.startTS, dirtyData)
            }
            else {
                assert(compilationMode is CompilationMode.Rebuild) { "Unexpected compilation mode: ${compilationMode::class.java}" }
                changesRegistry.unknownChanges(currentBuildInfo.startTS)
            }' @ [349:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'compilationMode' @ [349:17] ==> value-parameter compilationMode: IncrementalJvmCompilerRunner.CompilationMode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'DirtyData' @ [350:33] ==> public constructor DirtyData(dirtyLookupSymbols: Collection<LookupSymbol> = ..., dirtyClassesFqNames: Collection<FqName> = ...) defined in org.jetbrains.kotlin.incremental.DirtyData[DeserializedClassConstructorDescriptor]

'buildDirtyLookupSymbols' @ [350:43] ==> val buildDirtyLookupSymbols: HashSet<LookupSymbol> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'buildDirtyFqNames' @ [350:68] ==> val buildDirtyFqNames: HashSet<FqName> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'changesRegistry' @ [351:17] ==> private final val changesRegistry: ChangesRegistry? defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'registerChanges' @ [351:33] ==> public abstract fun registerChanges(timestamp: Long, dirtyData: DirtyData): Unit defined in org.jetbrains.kotlin.incremental.multiproject.ChangesRegistry[SimpleFunctionDescriptorImpl]

'currentBuildInfo' @ [351:49] ==> val currentBuildInfo: BuildInfo defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'startTS' @ [351:66] ==> public final val startTS: Long defined in org.jetbrains.kotlin.incremental.BuildInfo[PropertyDescriptorImpl]

'dirtyData' @ [351:75] ==> val dirtyData: DirtyData defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'assert' @ [354:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'compilationMode' @ [354:24] ==> value-parameter compilationMode: IncrementalJvmCompilerRunner.CompilationMode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'compilationMode' @ [354:102] ==> value-parameter compilationMode: IncrementalJvmCompilerRunner.CompilationMode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[ValueParameterDescriptorImpl]

'java' @ [354:125] ==> public val <T> KClass<out IncrementalJvmCompilerRunner.CompilationMode>.java: Class<out IncrementalJvmCompilerRunner.CompilationMode> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CompilationMode

'changesRegistry' @ [355:17] ==> private final val changesRegistry: ChangesRegistry? defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'unknownChanges' @ [355:33] ==> public abstract fun unknownChanges(timestamp: Long): Unit defined in org.jetbrains.kotlin.incremental.multiproject.ChangesRegistry[SimpleFunctionDescriptorImpl]

'currentBuildInfo' @ [355:48] ==> val currentBuildInfo: BuildInfo defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'startTS' @ [355:65] ==> public final val startTS: Long defined in org.jetbrains.kotlin.incremental.BuildInfo[PropertyDescriptorImpl]

'exitCode' @ [359:13] ==> var exitCode: ExitCode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'OK' @ [359:34] ==> enum entry OK defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'cacheVersions' @ [360:13] ==> private final val cacheVersions: List<CacheVersion> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'forEach' @ [360:27] ==> @HidesMembers public inline fun <T> Iterable<CacheVersion>.forEach(action: (CacheVersion) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CacheVersion

'it' @ [360:37] ==> value-parameter it: CacheVersion defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally.<anonymous>[ValueParameterDescriptorImpl]

'saveIfNeeded' @ [360:40] ==> public final fun saveIfNeeded(): Unit defined in org.jetbrains.kotlin.incremental.CacheVersion[DeserializedSimpleFunctionDescriptor]

'exitCode' @ [363:16] ==> var exitCode: ExitCode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileIncrementally[LocalVariableDescriptor]

'HashSet' @ [370:22] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> File

'caches' @ [373:25] ==> value-parameter caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles[ValueParameterDescriptorImpl]

'incrementalCache' @ [373:32] ==> public final val incrementalCache: GradleIncrementalCacheImpl defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[PropertyDescriptorImpl]

'getStableMultifileFacadeParts' @ [373:49] ==> public open fun getStableMultifileFacadeParts(facadeInternalName: String): Collection<String>? defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl[DeserializedSimpleFunctionDescriptor]

'facadeInternalName' @ [373:79] ==> value-parameter facadeInternalName: String defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles.partsByFacadeName[ValueParameterDescriptorImpl]

'emptyList' @ [373:102] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'parts' @ [374:20] ==> val parts: Collection<String> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles.partsByFacadeName[LocalVariableDescriptor]

'flatMap' @ [374:26] ==> public inline fun <T, R> Iterable<String>.flatMap(transform: (String) -> Iterable<File>): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'caches' @ [374:36] ==> value-parameter caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles[ValueParameterDescriptorImpl]

'incrementalCache' @ [374:43] ==> public final val incrementalCache: GradleIncrementalCacheImpl defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[PropertyDescriptorImpl]

'sourcesByInternalName' @ [374:60] ==> public final fun sourcesByInternalName(internalName: String): Collection<File> defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl[DeserializedSimpleFunctionDescriptor]

'it' @ [374:82] ==> value-parameter it: String defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles.partsByFacadeName.<anonymous>[ValueParameterDescriptorImpl]

'generatedFiles' @ [377:31] ==> value-parameter generatedFiles: List<GeneratedFile<TargetId>> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles[ValueParameterDescriptorImpl]

'generatedFile' @ [378:17] ==> val generatedFile: GeneratedFile<TargetId> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles[LocalVariableDescriptor]

'generatedFile' @ [380:31] ==> val generatedFile: GeneratedFile<TargetId> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles[LocalVariableDescriptor]

'outputClass' @ [380:45] ==> public final val outputClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.build.GeneratedJvmClass[DeserializedPropertyDescriptor]

'when (outputClass.classHeader.kind) {
                KotlinClassHeader.Kind.CLASS -> {
                    val fqName = outputClass.className.fqNameForClassNameWithoutDollars
                    val cachedSourceFile = caches.incrementalCache.getSourceFileIfClass(fqName)

                    if (cachedSourceFile != null) {
                        result.add(cachedSourceFile)
                    }
                }
                // todo: more optimal is to check if public API or parts list changed
                KotlinClassHeader.Kind.MULTIFILE_CLASS -> {
                    result.addAll(partsByFacadeName(outputClass.className.internalName))
                }
                KotlinClassHeader.Kind.MULTIFILE_CLASS_PART -> {
                    result.addAll(partsByFacadeName(outputClass.classHeader.multifileClassName!!))
                }
            }' @ [382:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'outputClass' @ [382:19] ==> val outputClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles[LocalVariableDescriptor]

'classHeader' @ [382:31] ==> public open val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[JavaPropertyDescriptor]

'kind' @ [382:43] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'CLASS' @ [383:40] ==> enum entry CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'outputClass' @ [384:34] ==> val outputClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles[LocalVariableDescriptor]

'className' @ [384:46] ==> public final val className: JvmClassName defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[DeserializedPropertyDescriptor]

'fqNameForClassNameWithoutDollars' @ [384:56] ==> public final val JvmClassName.fqNameForClassNameWithoutDollars: FqName[MyPropertyDescriptor]

'caches' @ [385:44] ==> value-parameter caches: IncrementalCachesManager defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles[ValueParameterDescriptorImpl]

'incrementalCache' @ [385:51] ==> public final val incrementalCache: GradleIncrementalCacheImpl defined in org.jetbrains.kotlin.incremental.IncrementalCachesManager[PropertyDescriptorImpl]

'getSourceFileIfClass' @ [385:68] ==> public final fun getSourceFileIfClass(fqName: FqName): File? defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl[DeserializedSimpleFunctionDescriptor]

'fqName' @ [385:89] ==> val fqName: FqName defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles[LocalVariableDescriptor]

'cachedSourceFile' @ [387:25] ==> val cachedSourceFile: File? defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles[LocalVariableDescriptor]

'result' @ [388:25] ==> val result: HashSet<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles[LocalVariableDescriptor]

'add' @ [388:32] ==> public open fun add(element: File): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'cachedSourceFile' @ [388:36] ==> val cachedSourceFile: File? defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles[LocalVariableDescriptor]

'MULTIFILE_CLASS' @ [392:40] ==> enum entry MULTIFILE_CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'result' @ [393:21] ==> val result: HashSet<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles[LocalVariableDescriptor]

'addAll' @ [393:28] ==> public open fun addAll(elements: Collection<File>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'partsByFacadeName' @ [393:35] ==> local final fun partsByFacadeName(facadeInternalName: String): List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles[SimpleFunctionDescriptorImpl]

'outputClass' @ [393:53] ==> val outputClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles[LocalVariableDescriptor]

'className' @ [393:65] ==> public final val className: JvmClassName defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[DeserializedPropertyDescriptor]

'internalName' @ [393:75] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'MULTIFILE_CLASS_PART' @ [395:40] ==> enum entry MULTIFILE_CLASS_PART defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'result' @ [396:21] ==> val result: HashSet<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles[LocalVariableDescriptor]

'addAll' @ [396:28] ==> public open fun addAll(elements: Collection<File>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'partsByFacadeName' @ [396:35] ==> local final fun partsByFacadeName(facadeInternalName: String): List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles[SimpleFunctionDescriptorImpl]

'outputClass' @ [396:53] ==> val outputClass: LocalFileKotlinClass defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles[LocalVariableDescriptor]

'classHeader' @ [396:65] ==> public open val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[JavaPropertyDescriptor]

'multifileClassName' @ [396:77] ==> public final val multifileClassName: String? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'result' @ [401:16] ==> val result: HashSet<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.additionalDirtyFiles[LocalVariableDescriptor]

'K2JVMCompiler' @ [412:24] ==> public constructor K2JVMCompiler() defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[DeserializedClassConstructorDescriptor]

'args' @ [413:25] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[ValueParameterDescriptorImpl]

'destinationAsFile' @ [413:30] ==> public var K2JVMCompilerArguments.destinationAsFile: File defined in org.jetbrains.kotlin.incremental in file IncrementalJvmCompilerRunner.kt[PropertyDescriptorImpl]

'args' @ [414:25] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[ValueParameterDescriptorImpl]

'classpathAsList' @ [414:30] ==> public var K2JVMCompilerArguments.classpathAsList: List<File> defined in org.jetbrains.kotlin.incremental in file IncrementalJvmCompilerRunner.kt[PropertyDescriptorImpl]

'makeModuleFile' @ [415:26] ==> public fun makeModuleFile(name: String, isTest: Boolean, outputDir: File, sourcesToCompile: Iterable<File>, javaSourceRoots: Iterable<JvmSourceRoot>, classpath: Iterable<File>, friendDirs: Iterable<File>): File defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'args' @ [415:41] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[ValueParameterDescriptorImpl]

'moduleName' @ [415:46] ==> @Argument public final var moduleName: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'outputDir' @ [417:29] ==> val outputDir: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[LocalVariableDescriptor]

'sourcesToCompile' @ [418:36] ==> value-parameter sourcesToCompile: Set<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[ValueParameterDescriptorImpl]

'javaSourceRoots' @ [419:35] ==> private final val javaSourceRoots: Set<JvmSourceRoot> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'classpath' @ [420:29] ==> val classpath: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[LocalVariableDescriptor]

'listOf' @ [421:30] ==> @InlineOnly public inline fun <T> listOf(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'args' @ [422:27] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[ValueParameterDescriptorImpl]

'destination' @ [422:32] ==> @Argument public final var destination: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'args' @ [423:9] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[ValueParameterDescriptorImpl]

'destination' @ [423:14] ==> @Argument public final var destination: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'args' @ [424:9] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[ValueParameterDescriptorImpl]

'buildFile' @ [424:14] ==> @Argument public final var buildFile: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'moduleFile' @ [424:26] ==> val moduleFile: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[LocalVariableDescriptor]

'absolutePath' @ [424:37] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'args' @ [425:9] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[ValueParameterDescriptorImpl]

'reportOutputFiles' @ [425:14] ==> @Argument public final var reportOutputFiles: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'OutputItemsCollectorImpl' @ [426:35] ==> public constructor OutputItemsCollectorImpl() defined in org.jetbrains.kotlin.compilerRunner.OutputItemsCollectorImpl[JavaClassConstructorDescriptor]

'Suppress' @ [427:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'MessageCollectorWrapper' @ [428:32] ==> public constructor MessageCollectorWrapper(delegate: MessageCollector, outputCollector: OutputItemsCollector) defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.MessageCollectorWrapper[ClassConstructorDescriptorImpl]

'messageCollector' @ [428:56] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[ValueParameterDescriptorImpl]

'outputItemCollector' @ [428:74] ==> val outputItemCollector: OutputItemsCollectorImpl defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[LocalVariableDescriptor]

'makeIncrementalCachesMap' @ [431:37] ==> public fun <Target> makeIncrementalCachesMap(targets: Iterable<TargetId>, getDependencies: (TargetId) -> Iterable<TargetId>, getCache: (TargetId) -> IncrementalCacheImpl<TargetId>, getTargetId: TargetId.() -> TargetId): Map<TargetId, IncrementalCacheImpl<TargetId>> defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <Target> -> TargetId

'targets' @ [431:62] ==> value-parameter targets: List<TargetId> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[ValueParameterDescriptorImpl]

'listOf' @ [431:73] ==> @InlineOnly public inline fun <T> listOf(): List<TargetId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TargetId

'getIncrementalCache' @ [431:95] ==> value-parameter getIncrementalCache: (TargetId) -> GradleIncrementalCacheImpl defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[ValueParameterDescriptorImpl]

'this' @ [431:118] ==> <this> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged.<anonymous>[ReceiverParameterDescriptorImpl]

'reporter' @ [437:13] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'report' @ [437:22] ==> public abstract fun report(message: () -> String): Unit defined in org.jetbrains.kotlin.incremental.ICReporter[DeserializedSimpleFunctionDescriptor]

'convertArgumentsToStringList' @ [437:69] ==> @NotNull public open fun convertArgumentsToStringList(@NotNull p0: CommonToolArguments): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.compilerRunner.ArgumentUtils[JavaMethodDescriptor]

'args' @ [437:98] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[ValueParameterDescriptorImpl]

'reporter' @ [438:13] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'report' @ [438:22] ==> public abstract fun report(message: () -> String): Unit defined in org.jetbrains.kotlin.incremental.ICReporter[DeserializedSimpleFunctionDescriptor]

'classpath' @ [438:60] ==> val classpath: List<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[LocalVariableDescriptor]

'toList' @ [438:70] ==> public fun <T> Iterable<File>.toList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'sorted' @ [438:79] ==> public fun <T : Comparable<File>> Iterable<File>.sorted(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> File

'joinToString' @ [438:88] ==> public fun <T> Iterable<File>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((File) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'makeCompileServices' @ [439:35] ==> public fun makeCompileServices(incrementalCaches: Map<TargetId, IncrementalCache>, lookupTracker: LookupTracker, compilationCanceledStatus: CompilationCanceledStatus?): Services defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'incrementalCaches' @ [439:55] ==> val incrementalCaches: Map<TargetId, IncrementalCacheImpl<TargetId>> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[LocalVariableDescriptor]

'lookupTracker' @ [439:74] ==> value-parameter lookupTracker: LookupTracker defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[ValueParameterDescriptorImpl]

'compilationCanceledStatus' @ [439:89] ==> val compilationCanceledStatus: <no name provided> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[LocalVariableDescriptor]

'compiler' @ [440:28] ==> val compiler: K2JVMCompiler defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[LocalVariableDescriptor]

'exec' @ [440:37] ==> public final fun exec(messageCollector: MessageCollector, services: Services, arguments: (K2JVMCompilerArguments..K2JVMCompilerArguments?)): ExitCode defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[DeserializedSimpleFunctionDescriptor]

'messageCollector' @ [440:42] ==> val messageCollector: IncrementalJvmCompilerRunner.MessageCollectorWrapper defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[LocalVariableDescriptor]

'compileServices' @ [440:60] ==> val compileServices: Services defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[LocalVariableDescriptor]

'args' @ [440:77] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[ValueParameterDescriptorImpl]

'outputItemCollector' @ [441:34] ==> val outputItemCollector: OutputItemsCollectorImpl defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[LocalVariableDescriptor]

'generatedFiles' @ [441:54] ==> public fun <Target> OutputItemsCollectorImpl.generatedFiles(targets: Collection<TargetId>, representativeTarget: TargetId, getSources: (TargetId) -> Iterable<File>, getOutputDir: (TargetId) -> File?): List<GeneratedFile<TargetId>> defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <Target> -> TargetId

'targets' @ [441:69] ==> value-parameter targets: List<TargetId> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[ValueParameterDescriptorImpl]

'targets' @ [441:78] ==> value-parameter targets: List<TargetId> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[ValueParameterDescriptorImpl]

'first' @ [441:86] ==> public fun <T> List<TargetId>.first(): TargetId defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TargetId

'sourcesToCompile' @ [441:96] ==> value-parameter sourcesToCompile: Set<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[ValueParameterDescriptorImpl]

'outputDir' @ [441:116] ==> val outputDir: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[LocalVariableDescriptor]

'reporter' @ [442:13] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[PropertyDescriptorImpl]

'reportCompileIteration' @ [442:22] ==> public open fun reportCompileIteration(sourceFiles: Collection<File>, exitCode: ExitCode): Unit defined in org.jetbrains.kotlin.incremental.ICReporter[DeserializedSimpleFunctionDescriptor]

'sourcesToCompile' @ [442:45] ==> value-parameter sourcesToCompile: Set<File> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[ValueParameterDescriptorImpl]

'exitCode' @ [442:63] ==> val exitCode: ExitCode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[LocalVariableDescriptor]

'CompileChangedResults' @ [443:20] ==> public constructor CompileChangedResults(exitCode: ExitCode, generatedFiles: List<GeneratedFile<TargetId>>) defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.CompileChangedResults[ClassConstructorDescriptorImpl]

'exitCode' @ [443:42] ==> val exitCode: ExitCode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[LocalVariableDescriptor]

'generatedFiles' @ [443:52] ==> val generatedFiles: List<GeneratedFile<TargetId>> defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[LocalVariableDescriptor]

'args' @ [446:13] ==> value-parameter args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[ValueParameterDescriptorImpl]

'destination' @ [446:18] ==> @Argument public final var destination: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'destination' @ [446:32] ==> val destination: String? defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[LocalVariableDescriptor]

'moduleFile' @ [447:13] ==> val moduleFile: File defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.compileChanged[LocalVariableDescriptor]

'delete' @ [447:24] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'delegate' @ [454:29] ==> value-parameter delegate: MessageCollector defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.MessageCollectorWrapper.<init>[ValueParameterDescriptorImpl]

'parseOutputMessage' @ [457:31] ==> @Nullable public open fun parseOutputMessage(@NotNull p0: String): OutputMessageUtil.Output? defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil[JavaMethodDescriptor]

'message' @ [457:50] ==> value-parameter message: String defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.MessageCollectorWrapper.report[ValueParameterDescriptorImpl]

'let' @ [457:60] ==> @InlineOnly public inline fun <T, R> OutputMessageUtil.Output.let(block: (OutputMessageUtil.Output) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Output
    <R> -> Unit

'outputCollector' @ [458:17] ==> private final val outputCollector: OutputItemsCollector defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.MessageCollectorWrapper[PropertyDescriptorImpl]

'add' @ [458:33] ==> public abstract fun add(p0: (MutableCollection<(File..File?)>..Collection<(File..File?)>?), p1: (File..File?)): Unit defined in org.jetbrains.kotlin.compilerRunner.OutputItemsCollector[JavaMethodDescriptor]

'it' @ [458:37] ==> value-parameter it: OutputMessageUtil.Output defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.MessageCollectorWrapper.report.<anonymous>[ValueParameterDescriptorImpl]

'sourceFiles' @ [458:40] ==> @NotNull public final val sourceFiles: (MutableCollection<(File..File?)>..Collection<(File..File?)>) defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil.Output[JavaPropertyDescriptor]

'it' @ [458:53] ==> value-parameter it: OutputMessageUtil.Output defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.MessageCollectorWrapper.report.<anonymous>[ValueParameterDescriptorImpl]

'outputFile' @ [458:56] ==> @Nullable public final val outputFile: File? defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil.Output[JavaPropertyDescriptor]

'delegate' @ [460:13] ==> private final val delegate: MessageCollector defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.MessageCollectorWrapper[PropertyDescriptorImpl]

'report' @ [460:22] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'severity' @ [460:29] ==> value-parameter severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.MessageCollectorWrapper.report[ValueParameterDescriptorImpl]

'message' @ [460:39] ==> value-parameter message: String defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.MessageCollectorWrapper.report[ValueParameterDescriptorImpl]

'location' @ [460:48] ==> value-parameter location: CompilerMessageLocation? defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner.MessageCollectorWrapper.report[ValueParameterDescriptorImpl]

'File' @ [472:17] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'destination' @ [472:22] ==> @Argument public final var destination: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'destination' @ [473:22] ==> @Argument public final var destination: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'value' @ [473:36] ==> value-parameter value: File defined in org.jetbrains.kotlin.incremental.<set-destinationAsFile>[ValueParameterDescriptorImpl]

'path' @ [473:42] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'classpath' @ [476:13] ==> @Argument public final var classpath: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'split' @ [476:25] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pathSeparator' @ [476:36] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'map' @ [476:51] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'classpath' @ [477:18] ==> @Argument public final var classpath: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'value' @ [477:30] ==> value-parameter value: List<File> defined in org.jetbrains.kotlin.incremental.<set-classpathAsList>[ValueParameterDescriptorImpl]

'joinToString' @ [477:36] ==> public fun <T> Iterable<File>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((File) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'pathSeparator' @ [477:66] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'it' @ [477:95] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.<set-classpathAsList>.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [477:98] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

