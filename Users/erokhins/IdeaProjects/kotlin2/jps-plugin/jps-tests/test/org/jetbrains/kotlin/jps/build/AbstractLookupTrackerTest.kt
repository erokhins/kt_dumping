'AbstractLookupTrackerTest' @ [50:47] ==> public constructor AbstractLookupTrackerTest() defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[ClassConstructorDescriptorImpl]

'makeModuleFile' @ [52:26] ==> public fun makeModuleFile(name: String, isTest: Boolean, outputDir: File, sourcesToCompile: Iterable<File>, javaSourceRoots: Iterable<JvmSourceRoot>, classpath: Iterable<File>, friendDirs: Iterable<File>): File defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'outDir' @ [55:29] ==> protected final lateinit var outDir: File defined in org.jetbrains.kotlin.jps.build.AbstractJvmLookupTrackerTest[PropertyDescriptorImpl]

'filesToCompile' @ [56:36] ==> value-parameter filesToCompile: Iterable<File> defined in org.jetbrains.kotlin.jps.build.AbstractJvmLookupTrackerTest.runCompiler[ValueParameterDescriptorImpl]

'toList' @ [56:51] ==> public fun <T> Iterable<File>.toList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'listOf' @ [57:35] ==> public fun <T> listOf(element: JvmSourceRoot): List<JvmSourceRoot> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmSourceRoot

'JvmSourceRoot' @ [57:42] ==> public constructor JvmSourceRoot(file: File, packagePrefix: String? = ...) defined in org.jetbrains.kotlin.build.JvmSourceRoot[DeserializedClassConstructorDescriptor]

'srcDir' @ [57:56] ==> protected final lateinit var srcDir: File defined in org.jetbrains.kotlin.jps.build.AbstractJvmLookupTrackerTest[PropertyDescriptorImpl]

'listOf' @ [58:29] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'outDir' @ [58:36] ==> protected final lateinit var outDir: File defined in org.jetbrains.kotlin.jps.build.AbstractJvmLookupTrackerTest[PropertyDescriptorImpl]

'filter' @ [58:44] ==> public inline fun <T> Iterable<File>.filter(predicate: (File) -> Boolean): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [58:53] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.AbstractJvmLookupTrackerTest.runCompiler.<anonymous>[ValueParameterDescriptorImpl]

'exists' @ [58:56] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'emptyList' @ [59:30] ==> public fun <T> emptyList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'K2JVMCompilerArguments' @ [62:20] ==> public constructor K2JVMCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedClassConstructorDescriptor]

'apply' @ [62:45] ==> @InlineOnly public inline fun <T> K2JVMCompilerArguments.apply(block: K2JVMCompilerArguments.() -> Unit): K2JVMCompilerArguments defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> K2JVMCompilerArguments

'buildFile' @ [63:13] ==> @Argument public final var buildFile: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'moduleFile' @ [63:25] ==> val moduleFile: File defined in org.jetbrains.kotlin.jps.build.AbstractJvmLookupTrackerTest.runCompiler[LocalVariableDescriptor]

'canonicalPath' @ [63:36] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'reportOutputFiles' @ [64:13] ==> @Argument public final var reportOutputFiles: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'convertArgumentsToStringList' @ [66:39] ==> @NotNull public open fun convertArgumentsToStringList(@NotNull p0: CommonToolArguments): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.compilerRunner.ArgumentUtils[JavaMethodDescriptor]

'args' @ [66:68] ==> val args: K2JVMCompilerArguments defined in org.jetbrains.kotlin.jps.build.AbstractJvmLookupTrackerTest.runCompiler[LocalVariableDescriptor]

'toTypedArray' @ [66:74] ==> public inline fun <reified T> Collection<(String..String?)>.toTypedArray(): Array<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (kotlin.String..kotlin.String?)

'ByteArrayOutputStream' @ [69:26] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'PrintStream' @ [70:23] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'stream' @ [70:35] ==> val stream: ByteArrayOutputStream defined in org.jetbrains.kotlin.jps.build.AbstractJvmLookupTrackerTest.runCompiler[LocalVariableDescriptor]

'invokeExecMethod' @ [71:47] ==> @Nullable public open fun invokeExecMethod(@NotNull p0: String, @NotNull p1: (Array<(String..String?)>..Array<out (String..String?)>), @NotNull p2: JpsCompilerEnvironment, @NotNull p3: PrintStream): Any? defined in org.jetbrains.kotlin.compilerRunner.CompilerRunnerUtil[JavaMethodDescriptor]

'K2JVMCompiler' @ [71:64] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[FakeCallableDescriptorForObject]

'java' @ [71:85] ==> public val <T> KClass<K2JVMCompiler>.java: Class<K2JVMCompiler> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> K2JVMCompiler

'name' @ [71:90] ==> public final val <T : (Any..Any?)> Class<K2JVMCompiler>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> K2JVMCompiler

'argsArray' @ [71:96] ==> val argsArray: Array<(String..String?)> defined in org.jetbrains.kotlin.jps.build.AbstractJvmLookupTrackerTest.runCompiler[LocalVariableDescriptor]

'env' @ [71:107] ==> value-parameter env: JpsCompilerEnvironment defined in org.jetbrains.kotlin.jps.build.AbstractJvmLookupTrackerTest.runCompiler[ValueParameterDescriptorImpl]

'out' @ [71:112] ==> val out: PrintStream defined in org.jetbrains.kotlin.jps.build.AbstractJvmLookupTrackerTest.runCompiler[LocalVariableDescriptor]

'BufferedReader' @ [72:26] ==> public constructor BufferedReader(p0: (Reader..Reader?)) defined in java.io.BufferedReader[JavaClassConstructorDescriptor]

'StringReader' @ [72:41] ==> public constructor StringReader(p0: (String..String?)) defined in java.io.StringReader[JavaClassConstructorDescriptor]

'stream' @ [72:54] ==> val stream: ByteArrayOutputStream defined in org.jetbrains.kotlin.jps.build.AbstractJvmLookupTrackerTest.runCompiler[LocalVariableDescriptor]

'toString' @ [72:61] ==> public open fun toString(): String defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'CompilerOutputParser' @ [73:13] ==> public object CompilerOutputParser defined in org.jetbrains.kotlin.compilerRunner[FakeCallableDescriptorForObject]

'parseCompilerMessagesFromReader' @ [73:34] ==> public final fun parseCompilerMessagesFromReader(messageCollector: MessageCollector, reader: Reader, collector: OutputItemsCollector): Unit defined in org.jetbrains.kotlin.compilerRunner.CompilerOutputParser[DeserializedSimpleFunctionDescriptor]

'env' @ [73:66] ==> value-parameter env: JpsCompilerEnvironment defined in org.jetbrains.kotlin.jps.build.AbstractJvmLookupTrackerTest.runCompiler[ValueParameterDescriptorImpl]

'messageCollector' @ [73:70] ==> public final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerEnvironment[DeserializedPropertyDescriptor]

'reader' @ [73:88] ==> val reader: BufferedReader defined in org.jetbrains.kotlin.jps.build.AbstractJvmLookupTrackerTest.runCompiler[LocalVariableDescriptor]

'env' @ [73:96] ==> value-parameter env: JpsCompilerEnvironment defined in org.jetbrains.kotlin.jps.build.AbstractJvmLookupTrackerTest.runCompiler[ValueParameterDescriptorImpl]

'outputItemsCollector' @ [73:100] ==> public open val outputItemsCollector: OutputItemsCollectorImpl defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerEnvironment[DeserializedPropertyDescriptor]

'exitCode' @ [75:20] ==> val exitCode: Any? defined in org.jetbrains.kotlin.jps.build.AbstractJvmLookupTrackerTest.runCompiler[LocalVariableDescriptor]

'moduleFile' @ [78:13] ==> val moduleFile: File defined in org.jetbrains.kotlin.jps.build.AbstractJvmLookupTrackerTest.runCompiler[LocalVariableDescriptor]

'delete' @ [78:24] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'AbstractLookupTrackerTest' @ [83:46] ==> public constructor AbstractLookupTrackerTest() defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[ClassConstructorDescriptorImpl]

'super' @ [90:9] ==> <this> defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest[LazyClassReceiverParameterDescriptor]

'setUp' @ [90:15] ==> public open fun setUp(): Unit defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[SimpleFunctionDescriptorImpl]

'incrementalDataDir' @ [91:9] ==> private final lateinit var incrementalDataDir: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest[PropertyDescriptorImpl]

'File' @ [91:30] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'workingDir' @ [91:35] ==> protected final var workingDir: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest[DeserializedPropertyDescriptor]

'binaryTreesDir' @ [92:9] ==> private final lateinit var binaryTreesDir: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest[PropertyDescriptorImpl]

'File' @ [92:26] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'incrementalDataDir' @ [92:31] ==> private final lateinit var incrementalDataDir: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest[PropertyDescriptorImpl]

'packagesMetadataDir' @ [93:9] ==> private final lateinit var packagesMetadataDir: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest[PropertyDescriptorImpl]

'File' @ [93:31] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'incrementalDataDir' @ [93:36] ==> private final lateinit var incrementalDataDir: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest[PropertyDescriptorImpl]

'headerMetadataFile' @ [94:9] ==> private final lateinit var headerMetadataFile: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest[PropertyDescriptorImpl]

'File' @ [94:30] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'incrementalDataDir' @ [94:35] ==> private final lateinit var incrementalDataDir: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest[PropertyDescriptorImpl]

'incrementalDataDir' @ [98:13] ==> private final lateinit var incrementalDataDir: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest[PropertyDescriptorImpl]

'exists' @ [98:32] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'register' @ [99:13] ==> public final fun <T : Any> register(interfaceClass: Class<IncrementalDataProvider>, implementation: IncrementalDataProvider): Services.Builder defined in org.jetbrains.kotlin.config.Services.Builder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> IncrementalDataProvider

'java' @ [99:53] ==> public val <T> KClass<IncrementalDataProvider>.java: Class<IncrementalDataProvider> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IncrementalDataProvider

'headerMetadataFile' @ [101:29] ==> private final lateinit var headerMetadataFile: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest[PropertyDescriptorImpl]

'readBytes' @ [101:48] ==> public fun File.readBytes(): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'packagesMetadataDir' @ [103:29] ==> private final lateinit var packagesMetadataDir: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest[PropertyDescriptorImpl]

'walk' @ [103:49] ==> public fun File.walk(direction: FileWalkDirection = ...): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'filter' @ [103:56] ==> public fun <T> Sequence<File>.filter(predicate: (File) -> Boolean): Sequence<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [103:65] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.registerAdditionalServices.<no name provided>.<get-packagePartsMetadata>.<anonymous>[ValueParameterDescriptorImpl]

'isFile' @ [103:68] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'map' @ [103:77] ==> public fun <T, R> Sequence<File>.map(transform: (File) -> ByteArray): Sequence<ByteArray> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> ByteArray

'it' @ [103:83] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.registerAdditionalServices.<no name provided>.<get-packagePartsMetadata>.<anonymous>[ValueParameterDescriptorImpl]

'readBytes' @ [103:86] ==> public fun File.readBytes(): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'toList' @ [103:100] ==> public fun <T> Sequence<ByteArray>.toList(): List<ByteArray> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArray

'binaryTreesDir' @ [105:29] ==> private final lateinit var binaryTreesDir: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest[PropertyDescriptorImpl]

'walk' @ [105:44] ==> public fun File.walk(direction: FileWalkDirection = ...): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'filter' @ [105:51] ==> public fun <T> Sequence<File>.filter(predicate: (File) -> Boolean): Sequence<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [105:60] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.registerAdditionalServices.<no name provided>.<get-binaryTrees>.<anonymous>[ValueParameterDescriptorImpl]

'isFile' @ [105:63] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'map' @ [105:72] ==> public fun <T, R> Sequence<File>.map(transform: (File) -> ByteArray): Sequence<ByteArray> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> ByteArray

'it' @ [105:78] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.registerAdditionalServices.<no name provided>.<get-binaryTrees>.<anonymous>[ValueParameterDescriptorImpl]

'readBytes' @ [105:81] ==> public fun File.readBytes(): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'toList' @ [105:95] ==> public fun <T> Sequence<ByteArray>.toList(): List<ByteArray> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArray

'register' @ [109:9] ==> public final fun <T : Any> register(interfaceClass: Class<IncrementalResultsConsumer>, implementation: IncrementalResultsConsumer): Services.Builder defined in org.jetbrains.kotlin.config.Services.Builder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> IncrementalResultsConsumer

'java' @ [109:52] ==> public val <T> KClass<IncrementalResultsConsumer>.java: Class<IncrementalResultsConsumer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IncrementalResultsConsumer

'IncrementalResultsConsumerImpl' @ [109:58] ==> public constructor IncrementalResultsConsumerImpl() defined in org.jetbrains.kotlin.incremental.js.IncrementalResultsConsumerImpl[DeserializedClassConstructorDescriptor]

'K2JSCompilerArguments' @ [113:20] ==> public constructor K2JSCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedClassConstructorDescriptor]

'apply' @ [113:44] ==> @InlineOnly public inline fun <T> K2JSCompilerArguments.apply(block: K2JSCompilerArguments.() -> Unit): K2JSCompilerArguments defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> K2JSCompilerArguments

'outputFile' @ [114:13] ==> @GradleOption @Argument public final var outputFile: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'File' @ [114:26] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'outDir' @ [114:31] ==> protected final lateinit var outDir: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest[PropertyDescriptorImpl]

'canonicalPath' @ [114:49] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'reportOutputFiles' @ [115:13] ==> @Argument public final var reportOutputFiles: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'freeArgs' @ [116:13] ==> public final var freeArgs: MutableList<String> defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'addAll' @ [116:22] ==> public abstract fun addAll(elements: Collection<String>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'filesToCompile' @ [116:29] ==> value-parameter filesToCompile: Iterable<File> defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler[ValueParameterDescriptorImpl]

'map' @ [116:44] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [116:50] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'canonicalPath' @ [116:53] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'runJSCompiler' @ [118:24] ==> public fun runJSCompiler(args: K2JSCompilerArguments, env: JpsCompilerEnvironment): ExitCode? defined in org.jetbrains.kotlin.jps.incremental in file compilerUtils.kt[SimpleFunctionDescriptorImpl]

'args' @ [118:38] ==> val args: K2JSCompilerArguments defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler[LocalVariableDescriptor]

'env' @ [118:44] ==> value-parameter env: JpsCompilerEnvironment defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler[ValueParameterDescriptorImpl]

'exitCode' @ [120:13] ==> val exitCode: ExitCode? defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler[LocalVariableDescriptor]

'OK' @ [120:34] ==> enum entry OK defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'exitCode' @ [120:45] ==> val exitCode: ExitCode? defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler[LocalVariableDescriptor]

'env' @ [122:34] ==> value-parameter env: JpsCompilerEnvironment defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler[ValueParameterDescriptorImpl]

'services' @ [122:38] ==> public final val services: Services defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerEnvironment[DeserializedPropertyDescriptor]

'get' @ [122:47] ==> public final fun <T> get(interfaceClass: Class<IncrementalResultsConsumer>): IncrementalResultsConsumer? defined in org.jetbrains.kotlin.config.Services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IncrementalResultsConsumer

'java' @ [122:85] ==> public val <T> KClass<IncrementalResultsConsumer>.java: Class<IncrementalResultsConsumer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IncrementalResultsConsumer

'incrementalResults' @ [123:9] ==> val incrementalResults: IncrementalResultsConsumerImpl defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler[LocalVariableDescriptor]

'apply' @ [123:28] ==> @InlineOnly public inline fun <T> IncrementalResultsConsumerImpl.apply(block: IncrementalResultsConsumerImpl.() -> Unit): IncrementalResultsConsumerImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IncrementalResultsConsumerImpl

'packageParts' @ [124:13] ==> public final val packageParts: List<IncrementalResultsConsumerImpl.PackagePartData> defined in org.jetbrains.kotlin.incremental.js.IncrementalResultsConsumerImpl[DeserializedPropertyDescriptor]

'forEach' @ [124:26] ==> @HidesMembers public inline fun <T> Iterable<IncrementalResultsConsumerImpl.PackagePartData>.forEach(action: (IncrementalResultsConsumerImpl.PackagePartData) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackagePartData

'it' @ [125:36] ==> value-parameter it: IncrementalResultsConsumerImpl.PackagePartData defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'sourceFile' @ [125:39] ==> public final val sourceFile: File defined in org.jetbrains.kotlin.incremental.js.IncrementalResultsConsumerImpl.PackagePartData[DeserializedPropertyDescriptor]

'toRelativeString' @ [125:50] ==> public fun File.toRelativeString(base: File): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'srcDir' @ [125:67] ==> protected final lateinit var srcDir: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest[PropertyDescriptorImpl]

'File' @ [126:32] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'binaryTreesDir' @ [126:37] ==> private final lateinit var binaryTreesDir: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest[PropertyDescriptorImpl]

'relativePath' @ [126:53] ==> val relativePath: String defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler.<anonymous>.<anonymous>[LocalVariableDescriptor]

'apply' @ [126:76] ==> @InlineOnly public inline fun <T> File.apply(block: File.() -> Unit): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'parentFile' @ [126:84] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'mkdirs' @ [126:95] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'treeFile' @ [127:17] ==> val treeFile: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler.<anonymous>.<anonymous>[LocalVariableDescriptor]

'writeBytes' @ [127:26] ==> public fun File.writeBytes(array: ByteArray): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [127:37] ==> value-parameter it: IncrementalResultsConsumerImpl.PackagePartData defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'binaryAst' @ [127:40] ==> public final val binaryAst: ByteArray defined in org.jetbrains.kotlin.incremental.js.IncrementalResultsConsumerImpl.PackagePartData[DeserializedPropertyDescriptor]

'File' @ [129:37] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'packagesMetadataDir' @ [129:42] ==> private final lateinit var packagesMetadataDir: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest[PropertyDescriptorImpl]

'relativePath' @ [129:63] ==> val relativePath: String defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler.<anonymous>.<anonymous>[LocalVariableDescriptor]

'apply' @ [129:88] ==> @InlineOnly public inline fun <T> File.apply(block: File.() -> Unit): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'parentFile' @ [129:96] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'mkdirs' @ [129:107] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'partProtoFile' @ [130:17] ==> val partProtoFile: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler.<anonymous>.<anonymous>[LocalVariableDescriptor]

'writeBytes' @ [130:31] ==> public fun File.writeBytes(array: ByteArray): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [130:42] ==> value-parameter it: IncrementalResultsConsumerImpl.PackagePartData defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'proto' @ [130:45] ==> public final val proto: ByteArray defined in org.jetbrains.kotlin.incremental.js.IncrementalResultsConsumerImpl.PackagePartData[DeserializedPropertyDescriptor]

'env' @ [132:17] ==> value-parameter env: JpsCompilerEnvironment defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler[ValueParameterDescriptorImpl]

'outputItemsCollector' @ [132:21] ==> public open val outputItemsCollector: OutputItemsCollectorImpl defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerEnvironment[DeserializedPropertyDescriptor]

'outputs' @ [132:42] ==> public final val OutputItemsCollectorImpl.outputs: (MutableList<(SimpleOutputItem..SimpleOutputItem?)>..List<(SimpleOutputItem..SimpleOutputItem?)>)[MyPropertyDescriptor]

'apply' @ [132:50] ==> @InlineOnly public inline fun <T> (MutableList<(SimpleOutputItem..SimpleOutputItem?)>..List<(SimpleOutputItem..SimpleOutputItem?)>).apply(block: ((MutableList<(SimpleOutputItem..SimpleOutputItem?)>..List<(SimpleOutputItem..SimpleOutputItem?)>)).() -> Unit): (MutableList<(SimpleOutputItem..SimpleOutputItem?)>..List<(SimpleOutputItem..SimpleOutputItem?)>) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.compilerRunner.SimpleOutputItem..org.jetbrains.kotlin.compilerRunner.SimpleOutputItem?)>..kotlin.collections.List<(org.jetbrains.kotlin.compilerRunner.SimpleOutputItem..org.jetbrains.kotlin.compilerRunner.SimpleOutputItem?)>)

'listOf' @ [133:35] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [133:42] ==> value-parameter it: IncrementalResultsConsumerImpl.PackagePartData defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'sourceFile' @ [133:45] ==> public final val sourceFile: File defined in org.jetbrains.kotlin.incremental.js.IncrementalResultsConsumerImpl.PackagePartData[DeserializedPropertyDescriptor]

'add' @ [134:21] ==> public abstract fun add(element: (SimpleOutputItem..SimpleOutputItem?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'SimpleOutputItem' @ [134:25] ==> public constructor SimpleOutputItem(sourceFiles: Collection<File>, outputFile: File) defined in org.jetbrains.kotlin.compilerRunner.SimpleOutputItem[DeserializedClassConstructorDescriptor]

'sources' @ [134:42] ==> val sources: List<File> defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'treeFile' @ [134:51] ==> val treeFile: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler.<anonymous>.<anonymous>[LocalVariableDescriptor]

'add' @ [135:21] ==> public abstract fun add(element: (SimpleOutputItem..SimpleOutputItem?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'SimpleOutputItem' @ [135:25] ==> public constructor SimpleOutputItem(sourceFiles: Collection<File>, outputFile: File) defined in org.jetbrains.kotlin.compilerRunner.SimpleOutputItem[DeserializedClassConstructorDescriptor]

'sources' @ [135:42] ==> val sources: List<File> defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'partProtoFile' @ [135:51] ==> val partProtoFile: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler.<anonymous>.<anonymous>[LocalVariableDescriptor]

'headerMetadataFile' @ [139:13] ==> private final lateinit var headerMetadataFile: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest[PropertyDescriptorImpl]

'parentFile' @ [139:32] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'mkdirs' @ [139:43] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'headerMetadataFile' @ [140:13] ==> private final lateinit var headerMetadataFile: File defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest[PropertyDescriptorImpl]

'writeBytes' @ [140:32] ==> public fun File.writeBytes(array: ByteArray): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'headerMetadata' @ [140:43] ==> public final lateinit var headerMetadata: ByteArray defined in org.jetbrains.kotlin.incremental.js.IncrementalResultsConsumerImpl[DeserializedPropertyDescriptor]

'exitCode' @ [143:16] ==> val exitCode: ExitCode? defined in org.jetbrains.kotlin.jps.build.AbstractJsLookupTrackerTest.runCompiler[LocalVariableDescriptor]

'TestWithWorkingDir' @ [147:44] ==> public constructor TestWithWorkingDir() defined in org.jetbrains.kotlin.TestWithWorkingDir[DeserializedClassConstructorDescriptor]

'listOf' @ [148:40] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'DECLARATION_KEYWORDS' @ [149:43] ==> private final val DECLARATION_KEYWORDS: List<String> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[PropertyDescriptorImpl]

'map' @ [149:64] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [149:70] ==> value-parameter it: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.DECLARATION_STARTS_WITH.<anonymous>[ValueParameterDescriptorImpl]

'toRegex' @ [151:60] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'super' @ [158:9] ==> <this> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[LazyClassReceiverParameterDescriptor]

'setUp' @ [158:15] ==> @Before public open fun setUp(): Unit defined in org.jetbrains.kotlin.TestWithWorkingDir[DeserializedSimpleFunctionDescriptor]

'srcDir' @ [159:9] ==> protected final lateinit var srcDir: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[PropertyDescriptorImpl]

'File' @ [159:18] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'workingDir' @ [159:23] ==> protected final var workingDir: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[DeserializedPropertyDescriptor]

'apply' @ [159:42] ==> @InlineOnly public inline fun <T> File.apply(block: File.() -> Unit): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'mkdirs' @ [159:50] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'outDir' @ [160:9] ==> protected final lateinit var outDir: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[PropertyDescriptorImpl]

'File' @ [160:18] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'workingDir' @ [160:23] ==> protected final var workingDir: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[DeserializedPropertyDescriptor]

'isICEnabledBackup' @ [161:9] ==> private final var isICEnabledBackup: Boolean defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[PropertyDescriptorImpl]

'isEnabled' @ [161:52] ==> public open fun isEnabled(): Boolean defined in org.jetbrains.kotlin.config.IncrementalCompilation[JavaMethodDescriptor]

'setIsEnabled' @ [162:32] ==> public open fun setIsEnabled(p0: Boolean): Unit defined in org.jetbrains.kotlin.config.IncrementalCompilation[JavaMethodDescriptor]

'setIsEnabled' @ [166:32] ==> public open fun setIsEnabled(p0: Boolean): Unit defined in org.jetbrains.kotlin.config.IncrementalCompilation[JavaMethodDescriptor]

'isICEnabledBackup' @ [166:45] ==> private final var isICEnabledBackup: Boolean defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[PropertyDescriptorImpl]

'super' @ [167:9] ==> <this> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[LazyClassReceiverParameterDescriptor]

'tearDown' @ [167:15] ==> @After public open fun tearDown(): Unit defined in org.jetbrains.kotlin.TestWithWorkingDir[DeserializedSimpleFunctionDescriptor]

'StringBuilder' @ [173:18] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'appendln' @ [175:13] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'string' @ [175:26] ==> value-parameter string: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest.indentln[ValueParameterDescriptorImpl]

'sb' @ [178:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'appendln' @ [178:16] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'stepName' @ [178:32] ==> value-parameter stepName: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest.logOutput[ValueParameterDescriptorImpl]

'sb' @ [180:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'appendln' @ [180:16] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'compiledFiles' @ [181:34] ==> public final val compiledFiles: Iterable<File> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.CompilerOutput[PropertyDescriptorImpl]

'sortedBy' @ [181:48] ==> public inline fun <T, R : Comparable<String>> Iterable<File>.sortedBy(crossinline selector: (File) -> String?): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R : Comparable<R>> -> String

'it' @ [181:59] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest.logOutput.<anonymous>[ValueParameterDescriptorImpl]

'canonicalPath' @ [181:62] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'lookups' @ [182:39] ==> public final val lookups: Map<File, List<LookupInfo>> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.CompilerOutput[PropertyDescriptorImpl]

'compiledFile' @ [182:47] ==> val compiledFile: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest.logOutput[LocalVariableDescriptor]

'when {
                    lookupsFromFile == null -> "(unknown)"
                    lookupsFromFile.isEmpty() -> "(no lookups)"
                    else -> ""
                }' @ [183:36] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'lookupsFromFile' @ [184:21] ==> val lookupsFromFile: List<LookupInfo>? defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest.logOutput[LocalVariableDescriptor]

'lookupsFromFile' @ [185:21] ==> val lookupsFromFile: List<LookupInfo>? defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest.logOutput[LocalVariableDescriptor]

'isEmpty' @ [185:37] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'compiledFile' @ [188:36] ==> val compiledFile: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest.logOutput[LocalVariableDescriptor]

'toRelativeString' @ [188:49] ==> public fun File.toRelativeString(base: File): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'workingDir' @ [188:66] ==> protected final var workingDir: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[DeserializedPropertyDescriptor]

'replace' @ [188:78] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'sb' @ [189:17] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'indentln' @ [189:20] ==> local final fun StringBuilder /* = StringBuilder */.indentln(string: String): Unit defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[SimpleFunctionDescriptorImpl]

'relativePath' @ [189:31] ==> val relativePath: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest.logOutput[LocalVariableDescriptor]

'lookupStatus' @ [189:44] ==> val lookupStatus: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest.logOutput[LocalVariableDescriptor]

'sb' @ [192:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'appendln' @ [192:16] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'exitCode' @ [192:38] ==> public final val exitCode: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.CompilerOutput[PropertyDescriptorImpl]

'errors' @ [193:13] ==> public final val errors: List<String> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.CompilerOutput[PropertyDescriptorImpl]

'forEach' @ [193:20] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sb' @ [193:28] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'indentln' @ [193:32] ==> local final fun StringBuilder /* = StringBuilder */.indentln(string: String): Unit defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[SimpleFunctionDescriptorImpl]

'sb' @ [195:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'appendln' @ [195:16] ==> public fun StringBuilder /* = StringBuilder */.appendln(): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'File' @ [198:23] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [198:28] ==> value-parameter path: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[ValueParameterDescriptorImpl]

'HashMap' @ [199:37] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?), K1 : (File..File?), V1 : (File..File?)>(p0: (MutableMap<out (File..File?), out (File..File?)>..Map<out (File..File?), (File..File?)>?)) defined in com.intellij.util.containers.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (java.io.File..java.io.File?)
    <V : (Any..Any?)> -> (java.io.File..java.io.File?)
    <K1 : (K..K?)> -> (java.io.File..java.io.File?)
    <V1 : (V..V?)> -> (java.io.File..java.io.File?)

'copyTestSources' @ [199:45] ==> public fun copyTestSources(testDataDir: File, sourceDestinationDir: File, filePrefix: String): Map<File, File> defined in org.jetbrains.kotlin.incremental.testingUtils[DeserializedSimpleFunctionDescriptor]

'testDir' @ [199:61] ==> val testDir: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'srcDir' @ [199:70] ==> protected final lateinit var srcDir: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[PropertyDescriptorImpl]

'srcDir' @ [200:26] ==> protected final lateinit var srcDir: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[PropertyDescriptorImpl]

'walk' @ [200:33] ==> public fun File.walk(direction: FileWalkDirection = ...): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'filterTo' @ [200:40] ==> public inline fun <T, C : MutableCollection<in File>> Sequence<File>.filterTo(destination: HashSet<File>, predicate: (File) -> Boolean): HashSet<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <C : MutableCollection<in T>> -> HashSet<File>

'HashSet' @ [200:49] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> File

'it' @ [200:62] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'isKotlinFile' @ [200:65] ==> public fun File.isKotlinFile(): Boolean defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'IncrementalData' @ [201:31] ==> public constructor IncrementalData(sourceToOutput: MutableMap<File, MutableSet<File>> = ...) defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.IncrementalData[ClassConstructorDescriptorImpl]

'getModificationsToPerform' @ [202:21] ==> public fun getModificationsToPerform(testDataDir: File, moduleNames: Collection<String>?, allowNoFilesWithSuffixInTestData: Boolean, touchPolicy: TouchPolicy): List<List<Modification>> defined in org.jetbrains.kotlin.incremental.testingUtils[DeserializedSimpleFunctionDescriptor]

'testDir' @ [202:47] ==> val testDir: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'CHECKSUM' @ [202:143] ==> enum entry CHECKSUM defined in org.jetbrains.kotlin.incremental.testingUtils.TouchPolicy[FakeCallableDescriptorForObject]

'filter' @ [203:18] ==> public inline fun <T> Iterable<List<Modification>>.filter(predicate: (List<Modification>) -> Boolean): List<List<Modification>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Modification>

'it' @ [203:27] ==> value-parameter it: List<Modification> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [203:30] ==> @InlineOnly public inline fun <T> Collection<Modification>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Modification

'arrayListOf' @ [205:30] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Map<File, List<LookupInfo>>> /* = ArrayList<Map<File, List<LookupInfo>>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<File, List<LookupInfo>>

'compiledFiles' @ [207:17] ==> public final val compiledFiles: Iterable<File> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.CompilerOutput[PropertyDescriptorImpl]

'associateBy' @ [207:31] ==> public inline fun <T, K, V> Iterable<File>.associateBy(keySelector: (File) -> File, valueTransform: (File) -> List<LookupInfo>): Map<File, List<LookupInfo>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <K> -> File
    <V> -> List<LookupInfo>

'workToOriginalFileMap' @ [207:45] ==> val workToOriginalFileMap: HashMap<(File..File?), (File..File?)> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'it' @ [207:67] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest.originalFilesToLookups.<anonymous>[ValueParameterDescriptorImpl]

'lookups' @ [207:78] ==> public final val lookups: Map<File, List<LookupInfo>> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.CompilerOutput[PropertyDescriptorImpl]

'it' @ [207:86] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest.originalFilesToLookups.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [207:93] ==> public fun <T> emptyList(): List<LookupInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupInfo

'make' @ [209:9] ==> private final fun make(filesToCompile: Iterable<File>, incrementalData: AbstractLookupTrackerTest.IncrementalData): AbstractLookupTrackerTest.CompilerOutput defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[SimpleFunctionDescriptorImpl]

'dirtyFiles' @ [209:14] ==> var dirtyFiles: HashSet<File> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'incrementalData' @ [209:26] ==> val incrementalData: AbstractLookupTrackerTest.IncrementalData defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'apply' @ [209:43] ==> @InlineOnly public inline fun <T> AbstractLookupTrackerTest.CompilerOutput.apply(block: AbstractLookupTrackerTest.CompilerOutput.() -> Unit): AbstractLookupTrackerTest.CompilerOutput defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompilerOutput

'logOutput' @ [210:13] ==> local final fun AbstractLookupTrackerTest.CompilerOutput.logOutput(stepName: String): Unit defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[SimpleFunctionDescriptorImpl]

'filesToLookups' @ [211:13] ==> val filesToLookups: ArrayList<Map<File, List<LookupInfo>>> /* = ArrayList<Map<File, List<LookupInfo>>> */ defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'add' @ [211:28] ==> public open fun add(element: Map<File, List<LookupInfo>>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'originalFilesToLookups' @ [211:32] ==> local final fun AbstractLookupTrackerTest.CompilerOutput.originalFilesToLookups(): Map<File, List<LookupInfo>> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[SimpleFunctionDescriptorImpl]

'component1' @ [214:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [214:18] ==> public final operator fun component2(): List<Modification> defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'steps' @ [214:36] ==> val steps: List<List<Modification>> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'withIndex' @ [214:42] ==> public fun <T> Iterable<List<Modification>>.withIndex(): Iterable<IndexedValue<List<Modification>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Modification>

'dirtyFiles' @ [215:13] ==> var dirtyFiles: HashSet<File> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'modifications' @ [215:26] ==> val modifications: List<Modification> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'mapNotNullTo' @ [215:40] ==> public inline fun <T, R : Any, C : MutableCollection<in File>> Iterable<Modification>.mapNotNullTo(destination: HashSet<File>, transform: (Modification) -> File?): HashSet<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Modification
    <R : Any> -> File
    <C : MutableCollection<in R>> -> HashSet<File>

'HashSet' @ [215:53] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> File

'it' @ [215:66] ==> value-parameter it: Modification defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'perform' @ [215:69] ==> public abstract fun perform(workDir: File, mapping: MutableMap<File, File>): File? defined in org.jetbrains.kotlin.incremental.testingUtils.Modification[DeserializedSimpleFunctionDescriptor]

'workingDir' @ [215:77] ==> protected final var workingDir: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[DeserializedPropertyDescriptor]

'workToOriginalFileMap' @ [215:89] ==> val workToOriginalFileMap: HashMap<(File..File?), (File..File?)> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'make' @ [216:13] ==> private final fun make(filesToCompile: Iterable<File>, incrementalData: AbstractLookupTrackerTest.IncrementalData): AbstractLookupTrackerTest.CompilerOutput defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[SimpleFunctionDescriptorImpl]

'dirtyFiles' @ [216:18] ==> var dirtyFiles: HashSet<File> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'incrementalData' @ [216:30] ==> val incrementalData: AbstractLookupTrackerTest.IncrementalData defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'apply' @ [216:47] ==> @InlineOnly public inline fun <T> AbstractLookupTrackerTest.CompilerOutput.apply(block: AbstractLookupTrackerTest.CompilerOutput.() -> Unit): AbstractLookupTrackerTest.CompilerOutput defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompilerOutput

'logOutput' @ [217:17] ==> local final fun AbstractLookupTrackerTest.CompilerOutput.logOutput(stepName: String): Unit defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[SimpleFunctionDescriptorImpl]

'i' @ [217:35] ==> val i: Int defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'filesToLookups' @ [218:17] ==> val filesToLookups: ArrayList<Map<File, List<LookupInfo>>> /* = ArrayList<Map<File, List<LookupInfo>>> */ defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'add' @ [218:32] ==> public open fun add(element: Map<File, List<LookupInfo>>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'originalFilesToLookups' @ [218:36] ==> local final fun AbstractLookupTrackerTest.CompilerOutput.originalFilesToLookups(): Map<File, List<LookupInfo>> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[SimpleFunctionDescriptorImpl]

'File' @ [222:32] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDir' @ [222:37] ==> val testDir: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'assertSameLinesWithFile' @ [223:24] ==> public open fun assertSameLinesWithFile(p0: (String..String?), p1: (String..String?)): Unit defined in com.intellij.testFramework.UsefulTestCase[JavaMethodDescriptor]

'expectedBuildLog' @ [223:48] ==> val expectedBuildLog: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'canonicalPath' @ [223:65] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'sb' @ [223:80] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'toString' @ [223:83] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'assertEquals' @ [225:9] ==> public open fun assertEquals(p0: Int, p1: Int): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'steps' @ [225:22] ==> val steps: List<List<Modification>> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'size' @ [225:28] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'filesToLookups' @ [225:38] ==> val filesToLookups: ArrayList<Map<File, List<LookupInfo>>> /* = ArrayList<Map<File, List<LookupInfo>>> */ defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'size' @ [225:53] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'component1' @ [226:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [226:18] ==> public final operator fun component2(): Map<File, List<LookupInfo>> defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'filesToLookups' @ [226:37] ==> val filesToLookups: ArrayList<Map<File, List<LookupInfo>>> /* = ArrayList<Map<File, List<LookupInfo>>> */ defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'withIndex' @ [226:52] ==> public fun <T> Iterable<Map<File, List<LookupInfo>>>.withIndex(): Iterable<IndexedValue<Map<File, List<LookupInfo>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<File, List<LookupInfo>>

'if (i == 0) "INITIAL BUILD" else "STEP $i"' @ [227:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'i' @ [227:28] ==> val i: Int defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'i' @ [227:64] ==> val i: Int defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'component1' @ [228:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<File, List<LookupInfo>>.component1(): File defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> File
    <V> -> List<LookupInfo>

'component2' @ [228:25] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<File, List<LookupInfo>>.component2(): List<LookupInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> File
    <V> -> List<LookupInfo>

'lookupsAtStepI' @ [228:37] ==> val lookupsAtStepI: Map<File, List<LookupInfo>> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'checkLookupsInFile' @ [229:17] ==> private final fun checkLookupsInFile(step: String, expectedFile: File, lookupsFromFile: List<LookupInfo>): Unit defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[SimpleFunctionDescriptorImpl]

'step' @ [229:36] ==> val step: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'file' @ [229:42] ==> val file: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'lookups' @ [229:48] ==> val lookups: List<LookupInfo> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.doTest[LocalVariableDescriptor]

'hashMapOf' @ [240:92] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<File, MutableSet<File>> /* = HashMap<File, MutableSet<File>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> File
    <V> -> MutableSet<File>

'filesToCompile' @ [246:9] ==> value-parameter filesToCompile: Iterable<File> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[ValueParameterDescriptorImpl]

'forEach' @ [246:24] ==> @HidesMembers public inline fun <T> Iterable<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [247:13] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make.<anonymous>[ValueParameterDescriptorImpl]

'writeText' @ [247:16] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [247:26] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make.<anonymous>[ValueParameterDescriptorImpl]

'readText' @ [247:29] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'replace' @ [247:40] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'COMMENT_WITH_LOOKUP_INFO' @ [247:48] ==> private final val COMMENT_WITH_LOOKUP_INFO: Regex defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[PropertyDescriptorImpl]

'filesToCompile' @ [250:27] ==> value-parameter filesToCompile: Iterable<File> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[ValueParameterDescriptorImpl]

'incrementalData' @ [251:13] ==> value-parameter incrementalData: AbstractLookupTrackerTest.IncrementalData defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[ValueParameterDescriptorImpl]

'sourceToOutput' @ [251:29] ==> public final val sourceToOutput: MutableMap<File, MutableSet<File>> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.IncrementalData[PropertyDescriptorImpl]

'remove' @ [251:44] ==> public abstract fun remove(key: File): MutableSet<File>? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'dirtyFile' @ [251:51] ==> val dirtyFile: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[LocalVariableDescriptor]

'forEach' @ [251:63] ==> @HidesMembers public inline fun <T> Iterable<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [252:17] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make.<anonymous>[ValueParameterDescriptorImpl]

'delete' @ [252:20] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'TestLookupTracker' @ [256:29] ==> public constructor TestLookupTracker() defined in org.jetbrains.kotlin.jps.build.TestLookupTracker[ClassConstructorDescriptorImpl]

'TestMessageCollector' @ [257:32] ==> public constructor TestMessageCollector() defined in org.jetbrains.kotlin.incremental.utils.TestMessageCollector[DeserializedClassConstructorDescriptor]

'OutputItemsCollectorImpl' @ [258:36] ==> public constructor OutputItemsCollectorImpl() defined in org.jetbrains.kotlin.compilerRunner.OutputItemsCollectorImpl[JavaClassConstructorDescriptor]

'Services' @ [259:24] ==> public companion object defined in org.jetbrains.kotlin.config.Services[FakeCallableDescriptorForObject]

'Builder' @ [259:33] ==> public constructor Builder() defined in org.jetbrains.kotlin.config.Services.Builder[DeserializedClassConstructorDescriptor]

'run' @ [259:43] ==> @InlineOnly public inline fun <T, R> Services.Builder.run(block: Services.Builder.() -> Services): Services defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Builder
    <R> -> Services

'register' @ [260:13] ==> public final fun <T : Any> register(interfaceClass: Class<LookupTracker>, implementation: LookupTracker): Services.Builder defined in org.jetbrains.kotlin.config.Services.Builder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> LookupTracker

'java' @ [260:43] ==> public val <T> KClass<LookupTracker>.java: Class<LookupTracker> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LookupTracker

'lookupTracker' @ [260:49] ==> val lookupTracker: TestLookupTracker defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[LocalVariableDescriptor]

'registerAdditionalServices' @ [261:13] ==> protected open fun Services.Builder.registerAdditionalServices(): Unit defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[SimpleFunctionDescriptorImpl]

'build' @ [262:13] ==> public final fun build(): Services defined in org.jetbrains.kotlin.config.Services.Builder[DeserializedSimpleFunctionDescriptor]

'createTestingCompilerEnvironment' @ [264:27] ==> public fun createTestingCompilerEnvironment(messageCollector: MessageCollector, outputItemsCollector: OutputItemsCollectorImpl, services: Services): JpsCompilerEnvironment defined in org.jetbrains.kotlin.jps.incremental in file compilerUtils.kt[SimpleFunctionDescriptorImpl]

'messageCollector' @ [264:60] ==> val messageCollector: TestMessageCollector defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[LocalVariableDescriptor]

'outputItemsCollector' @ [264:78] ==> val outputItemsCollector: OutputItemsCollectorImpl defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[LocalVariableDescriptor]

'services' @ [264:100] ==> val services: Services defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[LocalVariableDescriptor]

'runCompiler' @ [265:24] ==> protected abstract fun runCompiler(filesToCompile: Iterable<File>, env: JpsCompilerEnvironment): Any? defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[SimpleFunctionDescriptorImpl]

'filesToCompile' @ [265:36] ==> value-parameter filesToCompile: Iterable<File> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[ValueParameterDescriptorImpl]

'environment' @ [265:52] ==> val environment: JpsCompilerEnvironment defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[LocalVariableDescriptor]

'outputItemsCollector' @ [267:24] ==> val outputItemsCollector: OutputItemsCollectorImpl defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[LocalVariableDescriptor]

'outputs' @ [267:45] ==> public final val OutputItemsCollectorImpl.outputs: (MutableList<(SimpleOutputItem..SimpleOutputItem?)>..List<(SimpleOutputItem..SimpleOutputItem?)>)[MyPropertyDescriptor]

'output' @ [268:30] ==> val output: (SimpleOutputItem..SimpleOutputItem?) defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[LocalVariableDescriptor]

'outputFile' @ [268:37] ==> public final val outputFile: File defined in org.jetbrains.kotlin.compilerRunner.SimpleOutputItem[DeserializedPropertyDescriptor]

'outputFile' @ [269:17] ==> val outputFile: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[LocalVariableDescriptor]

'extension' @ [269:28] ==> public val File.extension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'output' @ [271:32] ==> val output: (SimpleOutputItem..SimpleOutputItem?) defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[LocalVariableDescriptor]

'sourceFiles' @ [271:39] ==> public final val sourceFiles: Collection<File> defined in org.jetbrains.kotlin.compilerRunner.SimpleOutputItem[DeserializedPropertyDescriptor]

'incrementalData' @ [272:40] ==> value-parameter incrementalData: AbstractLookupTrackerTest.IncrementalData defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[ValueParameterDescriptorImpl]

'sourceToOutput' @ [272:56] ==> public final val sourceToOutput: MutableMap<File, MutableSet<File>> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.IncrementalData[PropertyDescriptorImpl]

'getOrPut' @ [272:71] ==> public inline fun <K, V> MutableMap<File, MutableSet<File>>.getOrPut(key: File, defaultValue: () -> MutableSet<File>): MutableSet<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> File
    <V> -> MutableSet<File>

'sourceFile' @ [272:80] ==> val sourceFile: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[LocalVariableDescriptor]

'hashSetOf' @ [272:94] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<File> /* = HashSet<File> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'outputsForSource' @ [273:17] ==> val outputsForSource: MutableSet<File> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[LocalVariableDescriptor]

'add' @ [273:34] ==> public abstract fun add(element: File): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'outputFile' @ [273:38] ==> val outputFile: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[LocalVariableDescriptor]

'lookupTracker' @ [277:23] ==> val lookupTracker: TestLookupTracker defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[LocalVariableDescriptor]

'lookups' @ [277:37] ==> public final val lookups: ArrayList<LookupInfo> /* = ArrayList<LookupInfo> */ defined in org.jetbrains.kotlin.jps.build.TestLookupTracker[PropertyDescriptorImpl]

'groupBy' @ [277:45] ==> public inline fun <T, K> Iterable<LookupInfo>.groupBy(keySelector: (LookupInfo) -> File): Map<File, List<LookupInfo>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupInfo
    <K> -> File

'File' @ [277:55] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [277:60] ==> value-parameter it: LookupInfo defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make.<anonymous>[ValueParameterDescriptorImpl]

'filePath' @ [277:63] ==> public final val filePath: String defined in org.jetbrains.kotlin.incremental.components.LookupInfo[DeserializedPropertyDescriptor]

'filesToCompile' @ [278:40] ==> value-parameter filesToCompile: Iterable<File> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[ValueParameterDescriptorImpl]

'associate' @ [278:55] ==> public inline fun <T, K, V> Iterable<File>.associate(transform: (File) -> Pair<File, List<LookupInfo>>): Map<File, List<LookupInfo>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <K> -> File
    <V> -> List<LookupInfo>

'it' @ [278:67] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make.<anonymous>[ValueParameterDescriptorImpl]

'lookups' @ [278:74] ==> val lookups: Map<File, List<LookupInfo>> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[LocalVariableDescriptor]

'it' @ [278:82] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [278:89] ==> public fun <T> emptyList(): List<LookupInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupInfo

'CompilerOutput' @ [279:16] ==> public constructor CompilerOutput(exitCode: String, errors: List<String>, compiledFiles: Iterable<File>, lookups: Map<File, List<LookupInfo>>) defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.CompilerOutput[ClassConstructorDescriptorImpl]

'exitCode' @ [279:31] ==> val exitCode: Any? defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[LocalVariableDescriptor]

'toString' @ [279:40] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'messageCollector' @ [279:52] ==> val messageCollector: TestMessageCollector defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[LocalVariableDescriptor]

'errors' @ [279:69] ==> public final val errors: ArrayList<String> defined in org.jetbrains.kotlin.incremental.utils.TestMessageCollector[DeserializedPropertyDescriptor]

'filesToCompile' @ [279:77] ==> value-parameter filesToCompile: Iterable<File> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[ValueParameterDescriptorImpl]

'lookupsFromCompiledFiles' @ [279:93] ==> val lookupsFromCompiledFiles: Map<File, List<LookupInfo>> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.make[LocalVariableDescriptor]

'expectedFile' @ [285:20] ==> value-parameter expectedFile: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[ValueParameterDescriptorImpl]

'readText' @ [285:33] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'replace' @ [285:44] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'COMMENT_WITH_LOOKUP_INFO' @ [285:52] ==> private final val COMMENT_WITH_LOOKUP_INFO: Regex defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[PropertyDescriptorImpl]

'text' @ [286:21] ==> val text: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'lines' @ [286:26] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toMutableList' @ [286:34] ==> public fun <T> Collection<String>.toMutableList(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'component1' @ [288:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Int, List<LookupInfo>>.component1(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> List<LookupInfo>

'component2' @ [288:21] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Int, List<LookupInfo>>.component2(): List<LookupInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> List<LookupInfo>

'lookupsFromFile' @ [288:41] ==> value-parameter lookupsFromFile: List<LookupInfo> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[ValueParameterDescriptorImpl]

'groupBy' @ [288:57] ==> public inline fun <T, K> Iterable<LookupInfo>.groupBy(keySelector: (LookupInfo) -> Int): Map<Int, List<LookupInfo>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupInfo
    <K> -> Int

'it' @ [288:67] ==> value-parameter it: LookupInfo defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile.<anonymous>[ValueParameterDescriptorImpl]

'position' @ [288:70] ==> public final val position: Position defined in org.jetbrains.kotlin.incremental.components.LookupInfo[DeserializedPropertyDescriptor]

'line' @ [288:79] ==> public final val line: Int defined in org.jetbrains.kotlin.incremental.components.Position[DeserializedPropertyDescriptor]

'lookupsFromLine' @ [289:35] ==> val lookupsFromLine: List<LookupInfo> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'groupBy' @ [289:51] ==> public inline fun <T, K> Iterable<LookupInfo>.groupBy(keySelector: (LookupInfo) -> Int): Map<Int, List<LookupInfo>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupInfo
    <K> -> Int

'it' @ [289:61] ==> value-parameter it: LookupInfo defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile.<anonymous>[ValueParameterDescriptorImpl]

'position' @ [289:64] ==> public final val position: Position defined in org.jetbrains.kotlin.incremental.components.LookupInfo[DeserializedPropertyDescriptor]

'column' @ [289:73] ==> public final val column: Int defined in org.jetbrains.kotlin.incremental.components.Position[DeserializedPropertyDescriptor]

'toList' @ [289:82] ==> public fun <K, V> Map<out Int, List<LookupInfo>>.toList(): List<Pair<Int, List<LookupInfo>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> List<LookupInfo>

'sortedBy' @ [289:91] ==> public inline fun <T, R : Comparable<Int>> Iterable<Pair<Int, List<LookupInfo>>>.sortedBy(crossinline selector: (Pair<Int, List<LookupInfo>>) -> Int?): List<Pair<Int, List<LookupInfo>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Int, List<LookupInfo>>
    <R : Comparable<R>> -> Int

'it' @ [289:102] ==> value-parameter it: Pair<Int, List<LookupInfo>> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [289:105] ==> public final val first: Int defined in kotlin.Pair[DeserializedPropertyDescriptor]

'lines' @ [291:31] ==> val lines: MutableList<String> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'line' @ [291:37] ==> val line: Int defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'ArrayList' @ [292:25] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> CharSequence

'columnToLookups' @ [292:49] ==> val columnToLookups: List<Pair<Int, List<LookupInfo>>> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'size' @ [292:65] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'component1' @ [296:19] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [296:27] ==> public final operator fun component2(): List<LookupInfo> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'columnToLookups' @ [296:49] ==> val columnToLookups: List<Pair<Int, List<LookupInfo>>> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'column' @ [297:27] ==> val column: Int defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'parts' @ [298:17] ==> val parts: ArrayList<CharSequence> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'add' @ [298:23] ==> public open fun add(element: CharSequence): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'lineContent' @ [298:27] ==> val lineContent: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'subSequence' @ [298:39] ==> public open fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'start' @ [298:51] ==> var start: Int defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'end' @ [298:58] ==> val end: Int defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'lookupsFromColumn' @ [300:31] ==> val lookupsFromColumn: List<LookupInfo> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'distinct' @ [300:49] ==> public fun <T> Iterable<LookupInfo>.distinct(): List<LookupInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupInfo

'joinToString' @ [300:60] ==> public fun <T> Iterable<LookupInfo>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((LookupInfo) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupInfo

'lineContent' @ [301:32] ==> val lineContent: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'substring' @ [301:44] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'end' @ [301:54] ==> val end: Int defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'when {
                                rest.startsWith(it.name) || // same name
                                rest.startsWith("$" + it.name) || // backing field
                                DECLARATION_STARTS_WITH.any { rest.startsWith(it) } // it's declaration
                                -> ""
                                else -> "(" + it.name + ")"
                            }' @ [304:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'rest' @ [305:33] ==> val rest: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile.<anonymous>[LocalVariableDescriptor]

'startsWith' @ [305:38] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [305:49] ==> value-parameter it: LookupInfo defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [305:52] ==> public final val name: String defined in org.jetbrains.kotlin.incremental.components.LookupInfo[DeserializedPropertyDescriptor]

'rest' @ [306:33] ==> val rest: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile.<anonymous>[LocalVariableDescriptor]

'startsWith' @ [306:38] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'+' @ [306:49] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'it' @ [306:55] ==> value-parameter it: LookupInfo defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [306:58] ==> public final val name: String defined in org.jetbrains.kotlin.incremental.components.LookupInfo[DeserializedPropertyDescriptor]

'DECLARATION_STARTS_WITH' @ [307:33] ==> private final val DECLARATION_STARTS_WITH: List<String> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest[PropertyDescriptorImpl]

'any' @ [307:57] ==> public inline fun <T> Iterable<String>.any(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'rest' @ [307:63] ==> val rest: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile.<anonymous>[LocalVariableDescriptor]

'startsWith' @ [307:68] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [307:79] ==> value-parameter it: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'+' @ [309:41] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'it' @ [309:47] ==> value-parameter it: LookupInfo defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [309:50] ==> public final val name: String defined in org.jetbrains.kotlin.incremental.components.LookupInfo[DeserializedPropertyDescriptor]

'it' @ [312:21] ==> value-parameter it: LookupInfo defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile.<anonymous>[ValueParameterDescriptorImpl]

'scopeKind' @ [312:24] ==> public final val scopeKind: ScopeKind defined in org.jetbrains.kotlin.incremental.components.LookupInfo[DeserializedPropertyDescriptor]

'toString' @ [312:34] ==> public open fun toString(): String defined in org.jetbrains.kotlin.incremental.components.ScopeKind[DeserializedSimpleFunctionDescriptor]

'toLowerCase' @ [312:48] ==> @InlineOnly public inline fun Char.toLowerCase(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toString' @ [312:62] ==> public open fun toString(): String defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'it' @ [312:81] ==> value-parameter it: LookupInfo defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile.<anonymous>[ValueParameterDescriptorImpl]

'scopeFqName' @ [312:84] ==> public final val scopeFqName: String defined in org.jetbrains.kotlin.incremental.components.LookupInfo[DeserializedPropertyDescriptor]

'let' @ [312:96] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'if (it.isNotEmpty()) it else "<root>"' @ [312:102] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'it' @ [312:106] ==> value-parameter it: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [312:109] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [312:123] ==> value-parameter it: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [312:144] ==> val name: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile.<anonymous>[LocalVariableDescriptor]

'parts' @ [315:17] ==> val parts: ArrayList<CharSequence> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'add' @ [315:23] ==> public open fun add(element: CharSequence): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'lookups' @ [315:27] ==> val lookups: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'start' @ [317:17] ==> var start: Int defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'end' @ [317:25] ==> val end: Int defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'lines' @ [320:13] ==> val lines: MutableList<String> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'line' @ [320:19] ==> val line: Int defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'parts' @ [320:31] ==> val parts: ArrayList<CharSequence> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'joinToString' @ [320:37] ==> public fun <T> Iterable<CharSequence>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((CharSequence) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CharSequence

'lineContent' @ [320:56] ==> val lineContent: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'subSequence' @ [320:68] ==> public open fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'start' @ [320:80] ==> var start: Int defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'lineContent' @ [320:87] ==> val lineContent: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'length' @ [320:99] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'lines' @ [323:22] ==> val lines: MutableList<String> defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'joinToString' @ [323:28] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEqualsToFile' @ [324:25] ==> public open fun assertEqualsToFile(@NotNull p0: String, @NotNull p1: File, @NotNull p2: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'step' @ [324:73] ==> value-parameter step: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[ValueParameterDescriptorImpl]

'expectedFile' @ [324:80] ==> value-parameter expectedFile: File defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[ValueParameterDescriptorImpl]

'actual' @ [324:94] ==> val actual: String defined in org.jetbrains.kotlin.jps.build.AbstractLookupTrackerTest.checkLookupsInFile[LocalVariableDescriptor]

'arrayListOf' @ [329:19] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<LookupInfo> /* = ArrayList<LookupInfo> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupInfo

'StringInterner' @ [330:28] ==> public constructor StringInterner() defined in com.intellij.util.containers.StringInterner[JavaClassConstructorDescriptor]

'interner' @ [336:32] ==> private final val interner: StringInterner defined in org.jetbrains.kotlin.jps.build.TestLookupTracker[PropertyDescriptorImpl]

'intern' @ [336:41] ==> @NotNull public open fun intern(@NotNull p0: String): String defined in com.intellij.util.containers.StringInterner[JavaMethodDescriptor]

'filePath' @ [336:48] ==> value-parameter filePath: String defined in org.jetbrains.kotlin.jps.build.TestLookupTracker.record[ValueParameterDescriptorImpl]

'interner' @ [337:35] ==> private final val interner: StringInterner defined in org.jetbrains.kotlin.jps.build.TestLookupTracker[PropertyDescriptorImpl]

'intern' @ [337:44] ==> @NotNull public open fun intern(@NotNull p0: String): String defined in com.intellij.util.containers.StringInterner[JavaMethodDescriptor]

'scopeFqName' @ [337:51] ==> value-parameter scopeFqName: String defined in org.jetbrains.kotlin.jps.build.TestLookupTracker.record[ValueParameterDescriptorImpl]

'interner' @ [338:28] ==> private final val interner: StringInterner defined in org.jetbrains.kotlin.jps.build.TestLookupTracker[PropertyDescriptorImpl]

'intern' @ [338:37] ==> @NotNull public open fun intern(@NotNull p0: String): String defined in com.intellij.util.containers.StringInterner[JavaMethodDescriptor]

'name' @ [338:44] ==> value-parameter name: String defined in org.jetbrains.kotlin.jps.build.TestLookupTracker.record[ValueParameterDescriptorImpl]

'lookups' @ [340:9] ==> public final val lookups: ArrayList<LookupInfo> /* = ArrayList<LookupInfo> */ defined in org.jetbrains.kotlin.jps.build.TestLookupTracker[PropertyDescriptorImpl]

'add' @ [340:17] ==> public open fun add(element: LookupInfo): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'LookupInfo' @ [340:21] ==> public constructor LookupInfo(filePath: String, position: Position, scopeFqName: String, scopeKind: ScopeKind, name: String) defined in org.jetbrains.kotlin.incremental.components.LookupInfo[DeserializedClassConstructorDescriptor]

'internedFilePath' @ [340:32] ==> val internedFilePath: String defined in org.jetbrains.kotlin.jps.build.TestLookupTracker.record[LocalVariableDescriptor]

'position' @ [340:50] ==> value-parameter position: Position defined in org.jetbrains.kotlin.jps.build.TestLookupTracker.record[ValueParameterDescriptorImpl]

'internedScopeFqName' @ [340:60] ==> val internedScopeFqName: String defined in org.jetbrains.kotlin.jps.build.TestLookupTracker.record[LocalVariableDescriptor]

'scopeKind' @ [340:81] ==> value-parameter scopeKind: ScopeKind defined in org.jetbrains.kotlin.jps.build.TestLookupTracker.record[ValueParameterDescriptorImpl]

'internedName' @ [340:92] ==> val internedName: String defined in org.jetbrains.kotlin.jps.build.TestLookupTracker.record[LocalVariableDescriptor]

