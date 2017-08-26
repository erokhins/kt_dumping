'TestCaseWithTmpdir' @ [48:28] ==> public constructor TestCaseWithTmpdir() defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaClassConstructorDescriptor]

'listOf' @ [51:37] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'File' @ [52:29] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getHomeDirectory' @ [52:50] ==> @NotNull public open fun getHomeDirectory(): String defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'lazy' @ [55:45] ==> public fun <T> lazy(initializer: () -> KotlinPaths): Lazy<KotlinPaths> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinPaths

'PathUtil' @ [56:21] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'kotlinPathsForDistDirectory' @ [56:30] ==> @JvmStatic public final val kotlinPathsForDistDirectory: KotlinPaths defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'assertTrue' @ [57:18] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'paths' @ [57:76] ==> val paths: KotlinPaths defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.kotlinPaths.<anonymous>[LocalVariableDescriptor]

'libPath' @ [57:82] ==> public final val KotlinPaths.libPath: File[MyPropertyDescriptor]

'absoluteFile' @ [57:90] ==> public final val File.absoluteFile: (File..File?)[MyPropertyDescriptor]

'isDirectory' @ [57:103] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'paths' @ [58:9] ==> val paths: KotlinPaths defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.kotlinPaths.<anonymous>[LocalVariableDescriptor]

'listOf' @ [61:29] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'kotlinPaths' @ [61:36] ==> private final val kotlinPaths: KotlinPaths defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[PropertyDescriptorImpl]

'compilerPath' @ [61:48] ==> public final val KotlinPaths.compilerPath: File[MyPropertyDescriptor]

'listOf' @ [62:34] ==> public fun <T> listOf(vararg elements: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'kotlinPaths' @ [62:42] ==> private final val kotlinPaths: KotlinPaths defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[PropertyDescriptorImpl]

'stdlibPath' @ [62:54] ==> public final val KotlinPaths.stdlibPath: File[MyPropertyDescriptor]

'kotlinPaths' @ [62:66] ==> private final val kotlinPaths: KotlinPaths defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[PropertyDescriptorImpl]

'scriptRuntimePath' @ [62:78] ==> public final val KotlinPaths.scriptRuntimePath: File[MyPropertyDescriptor]

'File' @ [63:35] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'kotlinPaths' @ [63:40] ==> private final val kotlinPaths: KotlinPaths defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[PropertyDescriptorImpl]

'libPath' @ [63:52] ==> public final val KotlinPaths.libPath: File[MyPropertyDescriptor]

'lazy' @ [64:23] ==> public fun <T> lazy(mode: LazyThreadSafetyMode, initializer: () -> CompilerId): Lazy<CompilerId> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompilerId

'NONE' @ [64:49] ==> enum entry NONE defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'CompilerId' @ [64:57] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompilerId[FakeCallableDescriptorForObject]

'makeCompilerId' @ [64:68] ==> @JvmStatic public final fun makeCompilerId(paths: Iterable<File>): CompilerId defined in org.jetbrains.kotlin.daemon.common.CompilerId.Companion[DeserializedSimpleFunctionDescriptor]

'compilerClassPath' @ [64:83] ==> public final val compilerClassPath: List<File> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[PropertyDescriptorImpl]

'newConfiguration' @ [67:45] ==> @NotNull public open fun newConfiguration(@NotNull p0: ConfigurationKind, @NotNull p1: TestJdkKind, @NotNull vararg p2: (File..File?)): CompilerConfiguration defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'NO_KOTLIN_REFLECT' @ [67:80] ==> enum entry NO_KOTLIN_REFLECT defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'FULL_JDK' @ [67:111] ==> enum entry FULL_JDK defined in org.jetbrains.kotlin.test.TestJdkKind[FakeCallableDescriptorForObject]

'configuration' @ [69:9] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.createEnvironment[LocalVariableDescriptor]

'addKotlinSourceRoots' @ [69:23] ==> public fun CompilerConfiguration.addKotlinSourceRoots(sources: List<String>): Unit defined in org.jetbrains.kotlin.config[DeserializedSimpleFunctionDescriptor]

'sources' @ [69:44] ==> value-parameter vararg sources: String defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.createEnvironment[ValueParameterDescriptorImpl]

'asList' @ [69:52] ==> public fun <T> Array<out String>.asList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'configuration' @ [70:9] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.createEnvironment[LocalVariableDescriptor]

'put' @ [70:23] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(MessageCollector..MessageCollector?)>, @NotNull p1: MessageCollector): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MessageCollector

'MESSAGE_COLLECTOR_KEY' @ [71:38] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'PrintingMessageCollector' @ [72:17] ==> public constructor PrintingMessageCollector(@NotNull p0: PrintStream, @NotNull p1: MessageRenderer, p2: Boolean) defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaClassConstructorDescriptor]

'err' @ [72:49] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'PLAIN_FULL_PATHS' @ [72:70] ==> public final val PLAIN_FULL_PATHS: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaPropertyDescriptor]

'configuration' @ [74:9] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.createEnvironment[LocalVariableDescriptor]

'add' @ [74:23] ==> public open fun <T : (Any..Any?)> add(@NotNull p0: CompilerConfigurationKey<(MutableList<(KotlinScriptDefinition..KotlinScriptDefinition?)>..List<(KotlinScriptDefinition..KotlinScriptDefinition?)>?)>, @NotNull p1: KotlinScriptDefinition): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinScriptDefinition

'SCRIPT_DEFINITIONS' @ [74:48] ==> public final val SCRIPT_DEFINITIONS: (CompilerConfigurationKey<(MutableList<(KotlinScriptDefinition..KotlinScriptDefinition?)>..List<(KotlinScriptDefinition..KotlinScriptDefinition?)>?)>..CompilerConfigurationKey<(MutableList<(KotlinScriptDefinition..KotlinScriptDefinition?)>..List<(KotlinScriptDefinition..KotlinScriptDefinition?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'StandardScriptDefinition' @ [74:68] ==> public object StandardScriptDefinition : KotlinScriptDefinition defined in org.jetbrains.kotlin.script[FakeCallableDescriptorForObject]

'withSourceSectionsPlugin' @ [75:13] ==> value-parameter withSourceSectionsPlugin: Boolean = ... defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.createEnvironment[ValueParameterDescriptorImpl]

'configuration' @ [76:13] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.createEnvironment[LocalVariableDescriptor]

'addAll' @ [76:27] ==> public open fun <T : (Any..Any?)> addAll(@NotNull p0: CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>, @NotNull p1: (MutableCollection<(String..String?)>..Collection<(String..String?)>)): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'SourceSectionsConfigurationKeys' @ [76:34] ==> public object SourceSectionsConfigurationKeys defined in org.jetbrains.kotlin.sourceSections[FakeCallableDescriptorForObject]

'SECTIONS_OPTION' @ [76:66] ==> public final val SECTIONS_OPTION: CompilerConfigurationKey<List<String>> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsConfigurationKeys[DeserializedPropertyDescriptor]

'TEST_ALLOWED_SECTIONS' @ [76:83] ==> public final val TEST_ALLOWED_SECTIONS: List<String> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.Companion[PropertyDescriptorImpl]

'configuration' @ [77:13] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.createEnvironment[LocalVariableDescriptor]

'add' @ [77:27] ==> public open fun <T : (Any..Any?)> add(@NotNull p0: CompilerConfigurationKey<(MutableList<(ComponentRegistrar..ComponentRegistrar?)>..List<(ComponentRegistrar..ComponentRegistrar?)>?)>, @NotNull p1: ComponentRegistrar): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ComponentRegistrar

'ComponentRegistrar' @ [77:31] ==> public companion object defined in org.jetbrains.kotlin.compiler.plugin.ComponentRegistrar[FakeCallableDescriptorForObject]

'PLUGIN_COMPONENT_REGISTRARS' @ [77:50] ==> public final val PLUGIN_COMPONENT_REGISTRARS: CompilerConfigurationKey<MutableList<ComponentRegistrar>> defined in org.jetbrains.kotlin.compiler.plugin.ComponentRegistrar.Companion[DeserializedPropertyDescriptor]

'SourceSectionsComponentRegistrar' @ [77:79] ==> public constructor SourceSectionsComponentRegistrar() defined in org.jetbrains.kotlin.sourceSections.SourceSectionsComponentRegistrar[DeserializedClassConstructorDescriptor]

'KotlinCoreEnvironment' @ [80:27] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'createForTests' @ [80:49] ==> @JvmStatic public final fun createForTests(parentDisposable: Disposable, configuration: CompilerConfiguration, extensionConfigs: EnvironmentConfigFiles): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[DeserializedSimpleFunctionDescriptor]

'testRootDisposable' @ [80:64] ==> public final val SourceSectionsTest.testRootDisposable: Disposable[MyPropertyDescriptor]

'configuration' @ [80:84] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.createEnvironment[LocalVariableDescriptor]

'JVM_CONFIG_FILES' @ [80:122] ==> enum entry JVM_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'environment' @ [81:16] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.createEnvironment[LocalVariableDescriptor]

'TEST_DATA_DIR' @ [87:29] ==> public final val TEST_DATA_DIR: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.Companion[PropertyDescriptorImpl]

'listFiles' @ [87:43] ==> public open fun listFiles(): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[JavaMethodDescriptor]

'testDataFiles' @ [88:32] ==> val testDataFiles: (Array<(File..File?)>..Array<out (File..File?)>?) defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.getTestFiles[LocalVariableDescriptor]

'filter' @ [88:46] ==> public inline fun <T> Array<out (File..File?)>.filter(predicate: ((File..File?)) -> Boolean): List<(File..File?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'it' @ [88:55] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.getTestFiles.<anonymous>[ValueParameterDescriptorImpl]

'isFile' @ [88:58] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'it' @ [88:68] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.getTestFiles.<anonymous>[ValueParameterDescriptorImpl]

'extension' @ [88:71] ==> public val File.extension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'mapNotNull' @ [89:18] ==> public inline fun <T, R : Any> Iterable<(File..File?)>.mapNotNull(transform: ((File..File?)) -> SourceSectionsTest.SourceToExpectedResults?): List<SourceSectionsTest.SourceToExpectedResults> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)
    <R : Any> -> SourceToExpectedResults

'testDataFiles' @ [90:21] ==> val testDataFiles: (Array<(File..File?)>..Array<out (File..File?)>?) defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.getTestFiles[LocalVariableDescriptor]

'find' @ [90:35] ==> @InlineOnly public inline fun <T> Array<out (File..File?)>.find(predicate: ((File..File?)) -> Boolean): File? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'it' @ [90:42] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.getTestFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isFile' @ [90:45] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'it' @ [90:55] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.getTestFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [90:58] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'testFile' @ [90:66] ==> value-parameter testFile: (File..File?) defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.getTestFiles.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [90:75] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'expectedExt' @ [90:82] ==> value-parameter expectedExt: String defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.getTestFiles[ValueParameterDescriptorImpl]

'let' @ [90:97] ==> @InlineOnly public inline fun <T, R> File.let(block: (File) -> SourceSectionsTest.SourceToExpectedResults): SourceSectionsTest.SourceToExpectedResults defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> SourceToExpectedResults

'SourceToExpectedResults' @ [90:103] ==> public constructor SourceToExpectedResults(source: File, expectedResults: File) defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.SourceToExpectedResults[ClassConstructorDescriptorImpl]

'testFile' @ [90:127] ==> value-parameter testFile: (File..File?) defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.getTestFiles.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [90:137] ==> value-parameter it: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.getTestFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertTrue' @ [92:18] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'sourceToExpected' @ [92:52] ==> val sourceToExpected: List<SourceSectionsTest.SourceToExpectedResults> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.getTestFiles[LocalVariableDescriptor]

'isNotEmpty' @ [92:69] ==> @InlineOnly public inline fun <T> Collection<SourceSectionsTest.SourceToExpectedResults>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceToExpectedResults

'sourceToExpected' @ [93:16] ==> val sourceToExpected: List<SourceSectionsTest.SourceToExpectedResults> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.getTestFiles[LocalVariableDescriptor]

'use' @ [96:76] ==> @InlineOnly public inline fun <T : Closeable?, R> InputStream.use(block: (InputStream) -> List<String>): List<String> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> InputStream
    <R> -> List<String>

'bufferedReader' @ [97:9] ==> @InlineOnly public inline fun InputStream.bufferedReader(charset: Charset = ...): BufferedReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'charset' @ [97:24] ==> value-parameter charset: Charset defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.trimmedLines[ValueParameterDescriptorImpl]

'lineSequence' @ [98:18] ==> public fun BufferedReader.lineSequence(): Sequence<String> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'map' @ [99:18] ==> public fun <T, R> Sequence<String>.map(transform: (String) -> String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'String' @ [99:22] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'toList' @ [100:18] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'dropLastWhile' @ [101:18] ==> public inline fun <T> List<String>.dropLastWhile(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [101:34] ==> value-parameter it: String defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.trimmedLines.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isBlank' @ [101:37] ==> public fun CharSequence.isBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getTestFiles' @ [105:32] ==> private final fun getTestFiles(expectedExt: String): List<SourceSectionsTest.SourceToExpectedResults> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'createEnvironment' @ [107:9] ==> private final fun createEnvironment(vararg sources: String, withSourceSectionsPlugin: Boolean = ...): KotlinCoreEnvironment defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'FilteredSectionsVirtualFileExtension' @ [108:27] ==> public constructor FilteredSectionsVirtualFileExtension(allowedSections: Set<String>?) defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension[DeserializedClassConstructorDescriptor]

'TEST_ALLOWED_SECTIONS' @ [108:64] ==> public final val TEST_ALLOWED_SECTIONS: List<String> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.Companion[PropertyDescriptorImpl]

'toSet' @ [108:86] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sourceToFiltered' @ [110:9] ==> val sourceToFiltered: List<SourceSectionsTest.SourceToExpectedResults> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilter[LocalVariableDescriptor]

'forEach' @ [110:26] ==> @HidesMembers public inline fun <T> Iterable<SourceSectionsTest.SourceToExpectedResults>.forEach(action: (SourceSectionsTest.SourceToExpectedResults) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceToExpectedResults

'component1' @ [110:37] ==> public final operator fun component1(): File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.SourceToExpectedResults[SimpleFunctionDescriptorImpl]

'component2' @ [110:45] ==> public final operator fun component2(): File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.SourceToExpectedResults[SimpleFunctionDescriptorImpl]

'fileCreator' @ [111:30] ==> val fileCreator: FilteredSectionsVirtualFileExtension defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilter[LocalVariableDescriptor]

'createPreprocessedFile' @ [111:42] ==> public open fun createPreprocessedFile(file: VirtualFile?): VirtualFile? defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension[DeserializedSimpleFunctionDescriptor]

'local' @ [111:85] ==> public open fun local(): (VirtualFileSystem..VirtualFileSystem?) defined in com.intellij.openapi.vfs.StandardFileSystems[JavaMethodDescriptor]

'findFileByPath' @ [111:93] ==> @Nullable public abstract fun findFileByPath(@NotNull @NonNls p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFileSystem[JavaMethodDescriptor]

'source' @ [111:108] ==> val source: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilter.<anonymous>[LocalVariableDescriptor]

'canonicalPath' @ [111:115] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'assertNotNull' @ [112:22] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'filteredVF' @ [112:73] ==> val filteredVF: VirtualFile? defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilter.<anonymous>[LocalVariableDescriptor]

'expectedResult' @ [113:28] ==> val expectedResult: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilter.<anonymous>[LocalVariableDescriptor]

'inputStream' @ [113:43] ==> @InlineOnly public inline fun File.inputStream(): FileInputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'trimmedLines' @ [113:57] ==> private final fun InputStream.trimmedLines(charset: Charset): List<String> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'defaultCharset' @ [113:78] ==> public open fun defaultCharset(): (Charset..Charset?) defined in java.nio.charset.Charset[JavaMethodDescriptor]

'filteredVF' @ [114:33] ==> val filteredVF: VirtualFile? defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilter.<anonymous>[LocalVariableDescriptor]

'contentsToByteArray' @ [114:46] ==> @NotNull public abstract fun contentsToByteArray(): ByteArray defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'ByteArrayInputStream' @ [115:26] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'filteredBytes' @ [115:47] ==> val filteredBytes: ByteArray defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilter.<anonymous>[LocalVariableDescriptor]

'trimmedLines' @ [115:62] ==> private final fun InputStream.trimmedLines(charset: Charset): List<String> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'filteredVF' @ [115:75] ==> val filteredVF: VirtualFile? defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilter.<anonymous>[LocalVariableDescriptor]

'charset' @ [115:86] ==> public final var VirtualFile.charset: Charset[MyPropertyDescriptor]

'assertEquals' @ [116:22] ==> public open fun assertEquals(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'source' @ [116:79] ==> val source: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilter.<anonymous>[LocalVariableDescriptor]

'name' @ [116:86] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'expected' @ [116:95] ==> val expected: List<String> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilter.<anonymous>[LocalVariableDescriptor]

'actual' @ [116:105] ==> val actual: List<String> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilter.<anonymous>[LocalVariableDescriptor]

'getTestFiles' @ [121:32] ==> private final fun getTestFiles(expectedExt: String): List<SourceSectionsTest.SourceToExpectedResults> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'createEnvironment' @ [123:9] ==> private final fun createEnvironment(vararg sources: String, withSourceSectionsPlugin: Boolean = ...): KotlinCoreEnvironment defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'FilteredSectionsVirtualFileExtension' @ [124:27] ==> public constructor FilteredSectionsVirtualFileExtension(allowedSections: Set<String>?) defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension[DeserializedClassConstructorDescriptor]

'TEST_ALLOWED_SECTIONS' @ [124:64] ==> public final val TEST_ALLOWED_SECTIONS: List<String> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.Companion[PropertyDescriptorImpl]

'toSet' @ [124:86] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sourceToFiltered' @ [126:9] ==> val sourceToFiltered: List<SourceSectionsTest.SourceToExpectedResults> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilterWithCRLF[LocalVariableDescriptor]

'forEach' @ [126:26] ==> @HidesMembers public inline fun <T> Iterable<SourceSectionsTest.SourceToExpectedResults>.forEach(action: (SourceSectionsTest.SourceToExpectedResults) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceToExpectedResults

'component1' @ [126:37] ==> public final operator fun component1(): File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.SourceToExpectedResults[SimpleFunctionDescriptorImpl]

'component2' @ [126:45] ==> public final operator fun component2(): File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.SourceToExpectedResults[SimpleFunctionDescriptorImpl]

'createTempFile' @ [127:34] ==> public fun createTempFile(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'source' @ [127:49] ==> val source: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilterWithCRLF.<anonymous>[LocalVariableDescriptor]

'name' @ [127:56] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'sourceWithCRLF' @ [128:13] ==> val sourceWithCRLF: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilterWithCRLF.<anonymous>[LocalVariableDescriptor]

'writeText' @ [128:28] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'source' @ [128:38] ==> val source: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilterWithCRLF.<anonymous>[LocalVariableDescriptor]

'readText' @ [128:45] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'replace' @ [128:56] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [128:78] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fileCreator' @ [129:30] ==> val fileCreator: FilteredSectionsVirtualFileExtension defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilterWithCRLF[LocalVariableDescriptor]

'createPreprocessedFile' @ [129:42] ==> public open fun createPreprocessedFile(file: VirtualFile?): VirtualFile? defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension[DeserializedSimpleFunctionDescriptor]

'local' @ [129:85] ==> public open fun local(): (VirtualFileSystem..VirtualFileSystem?) defined in com.intellij.openapi.vfs.StandardFileSystems[JavaMethodDescriptor]

'findFileByPath' @ [129:93] ==> @Nullable public abstract fun findFileByPath(@NotNull @NonNls p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFileSystem[JavaMethodDescriptor]

'sourceWithCRLF' @ [129:108] ==> val sourceWithCRLF: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilterWithCRLF.<anonymous>[LocalVariableDescriptor]

'canonicalPath' @ [129:123] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'assertNotNull' @ [130:22] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'filteredVF' @ [130:73] ==> val filteredVF: VirtualFile? defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilterWithCRLF.<anonymous>[LocalVariableDescriptor]

'expectedResult' @ [131:28] ==> val expectedResult: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilterWithCRLF.<anonymous>[LocalVariableDescriptor]

'inputStream' @ [131:43] ==> @InlineOnly public inline fun File.inputStream(): FileInputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'trimmedLines' @ [131:57] ==> private final fun InputStream.trimmedLines(charset: Charset): List<String> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'defaultCharset' @ [131:78] ==> public open fun defaultCharset(): (Charset..Charset?) defined in java.nio.charset.Charset[JavaMethodDescriptor]

'ByteArrayInputStream' @ [132:26] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'filteredVF' @ [132:47] ==> val filteredVF: VirtualFile? defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilterWithCRLF.<anonymous>[LocalVariableDescriptor]

'contentsToByteArray' @ [132:60] ==> @NotNull public abstract fun contentsToByteArray(): ByteArray defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'trimmedLines' @ [132:83] ==> private final fun InputStream.trimmedLines(charset: Charset): List<String> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'filteredVF' @ [132:96] ==> val filteredVF: VirtualFile? defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilterWithCRLF.<anonymous>[LocalVariableDescriptor]

'charset' @ [132:107] ==> public final var VirtualFile.charset: Charset[MyPropertyDescriptor]

'assertEquals' @ [133:22] ==> public open fun assertEquals(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'source' @ [133:79] ==> val source: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilterWithCRLF.<anonymous>[LocalVariableDescriptor]

'name' @ [133:86] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'expected' @ [133:95] ==> val expected: List<String> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilterWithCRLF.<anonymous>[LocalVariableDescriptor]

'actual' @ [133:105] ==> val actual: List<String> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsFilterWithCRLF.<anonymous>[LocalVariableDescriptor]

'getTestFiles' @ [138:30] ==> private final fun getTestFiles(expectedExt: String): List<SourceSectionsTest.SourceToExpectedResults> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'sourceToOutput' @ [140:9] ==> val sourceToOutput: List<SourceSectionsTest.SourceToExpectedResults> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsRun[LocalVariableDescriptor]

'forEach' @ [140:24] ==> @HidesMembers public inline fun <T> Iterable<SourceSectionsTest.SourceToExpectedResults>.forEach(action: (SourceSectionsTest.SourceToExpectedResults) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceToExpectedResults

'component1' @ [140:35] ==> public final operator fun component1(): File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.SourceToExpectedResults[SimpleFunctionDescriptorImpl]

'component2' @ [140:43] ==> public final operator fun component2(): File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.SourceToExpectedResults[SimpleFunctionDescriptorImpl]

'createEnvironment' @ [141:31] ==> private final fun createEnvironment(vararg sources: String, withSourceSectionsPlugin: Boolean = ...): KotlinCoreEnvironment defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'source' @ [141:49] ==> val source: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsRun.<anonymous>[LocalVariableDescriptor]

'canonicalPath' @ [141:56] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'KotlinToJVMBytecodeCompiler' @ [142:31] ==> public object KotlinToJVMBytecodeCompiler defined in org.jetbrains.kotlin.cli.jvm.compiler[FakeCallableDescriptorForObject]

'compileScript' @ [142:59] ==> public final fun compileScript(environment: KotlinCoreEnvironment, parentClassLoader: ClassLoader? = ...): Class<*>? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[DeserializedSimpleFunctionDescriptor]

'environment' @ [142:73] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsRun.<anonymous>[LocalVariableDescriptor]

'currentThread' @ [142:93] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [142:109] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'assertNotNull' @ [143:22] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'scriptClass' @ [143:58] ==> val scriptClass: Class<*>? defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsRun.<anonymous>[LocalVariableDescriptor]

'verifyScriptOutput' @ [144:13] ==> private final fun verifyScriptOutput(scriptClass: Class<*>?, expectedOutput: File): Unit defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'scriptClass' @ [144:32] ==> val scriptClass: Class<*>? defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsRun.<anonymous>[LocalVariableDescriptor]

'expectedOutput' @ [144:45] ==> val expectedOutput: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionsRun.<anonymous>[LocalVariableDescriptor]

'Suppress' @ [150:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'getThreadMXBean' @ [152:41] ==> public open fun getThreadMXBean(): (ThreadMXBean..ThreadMXBean?) defined in java.lang.management.ManagementFactory[JavaMethodDescriptor]

'component1' @ [153:14] ==> public final operator fun component1(): File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.SourceToExpectedResults[SimpleFunctionDescriptorImpl]

'component2' @ [153:22] ==> public final operator fun component2(): File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.SourceToExpectedResults[SimpleFunctionDescriptorImpl]

'getTestFiles' @ [153:27] ==> private final fun getTestFiles(expectedExt: String): List<SourceSectionsTest.SourceToExpectedResults> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'first' @ [153:48] ==> public fun <T> List<SourceSectionsTest.SourceToExpectedResults>.first(): SourceSectionsTest.SourceToExpectedResults defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceToExpectedResults

'KotlinToJVMBytecodeCompiler' @ [156:9] ==> public object KotlinToJVMBytecodeCompiler defined in org.jetbrains.kotlin.cli.jvm.compiler[FakeCallableDescriptorForObject]

'compileScript' @ [156:37] ==> public final fun compileScript(environment: KotlinCoreEnvironment, parentClassLoader: ClassLoader? = ...): Class<*>? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[DeserializedSimpleFunctionDescriptor]

'createEnvironment' @ [156:51] ==> private final fun createEnvironment(vararg sources: String, withSourceSectionsPlugin: Boolean = ...): KotlinCoreEnvironment defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'source' @ [156:69] ==> val source: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench[LocalVariableDescriptor]

'canonicalPath' @ [156:76] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'currentThread' @ [156:133] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [156:149] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'generateSequence' @ [158:21] ==> public fun <T : Any> generateSequence(nextFunction: () -> Triple<Long, Long, Long>?): Sequence<Triple<Long, Long, Long>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Triple<Long, Long, Long>

'mxBeans' @ [159:22] ==> val mxBeans: (ThreadMXBean..ThreadMXBean?) defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench[LocalVariableDescriptor]

'threadCpuTime' @ [159:30] ==> public inline fun ThreadMXBean.threadCpuTime(): Long defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'KotlinToJVMBytecodeCompiler' @ [160:13] ==> public object KotlinToJVMBytecodeCompiler defined in org.jetbrains.kotlin.cli.jvm.compiler[FakeCallableDescriptorForObject]

'compileScript' @ [160:41] ==> public final fun compileScript(environment: KotlinCoreEnvironment, parentClassLoader: ClassLoader? = ...): Class<*>? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[DeserializedSimpleFunctionDescriptor]

'createEnvironment' @ [160:55] ==> private final fun createEnvironment(vararg sources: String, withSourceSectionsPlugin: Boolean = ...): KotlinCoreEnvironment defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'source' @ [160:73] ==> val source: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench[LocalVariableDescriptor]

'canonicalPath' @ [160:80] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'currentThread' @ [160:137] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [160:153] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'mxBeans' @ [161:22] ==> val mxBeans: (ThreadMXBean..ThreadMXBean?) defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench[LocalVariableDescriptor]

'threadCpuTime' @ [161:30] ==> public inline fun ThreadMXBean.threadCpuTime(): Long defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'KotlinToJVMBytecodeCompiler' @ [162:13] ==> public object KotlinToJVMBytecodeCompiler defined in org.jetbrains.kotlin.cli.jvm.compiler[FakeCallableDescriptorForObject]

'compileScript' @ [162:41] ==> public final fun compileScript(environment: KotlinCoreEnvironment, parentClassLoader: ClassLoader? = ...): Class<*>? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[DeserializedSimpleFunctionDescriptor]

'createEnvironment' @ [162:55] ==> private final fun createEnvironment(vararg sources: String, withSourceSectionsPlugin: Boolean = ...): KotlinCoreEnvironment defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'source' @ [162:73] ==> val source: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench[LocalVariableDescriptor]

'canonicalPath' @ [162:80] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'currentThread' @ [162:136] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [162:152] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'mxBeans' @ [163:22] ==> val mxBeans: (ThreadMXBean..ThreadMXBean?) defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench[LocalVariableDescriptor]

'threadCpuTime' @ [163:30] ==> public inline fun ThreadMXBean.threadCpuTime(): Long defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'Triple' @ [164:13] ==> public constructor Triple<out A, out B, out C>(first: Long, second: Long, third: Long) defined in kotlin.Triple[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Long
    <out B> -> Long
    <out C> -> Long

't1' @ [164:20] ==> val t1: Long defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench.<anonymous>[LocalVariableDescriptor]

't0' @ [164:25] ==> val t0: Long defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench.<anonymous>[LocalVariableDescriptor]

't2' @ [164:29] ==> val t2: Long defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench.<anonymous>[LocalVariableDescriptor]

't1' @ [164:34] ==> val t1: Long defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench.<anonymous>[LocalVariableDescriptor]

't2' @ [164:38] ==> val t2: Long defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench.<anonymous>[LocalVariableDescriptor]

't1' @ [164:43] ==> val t1: Long defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench.<anonymous>[LocalVariableDescriptor]

'take' @ [165:11] ==> public fun <T> Sequence<Triple<Long, Long, Long>>.take(n: Int): Sequence<Triple<Long, Long, Long>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Triple<Long, Long, Long>

'toList' @ [165:20] ==> public fun <T> Sequence<Triple<Long, Long, Long>>.toList(): List<Triple<Long, Long, Long>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Triple<Long, Long, Long>

'times' @ [167:31] ==> val times: List<Triple<Long, Long, Long>> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench[LocalVariableDescriptor]

'sortedByDescending' @ [167:37] ==> public inline fun <T, R : Comparable<Long>> Iterable<Triple<Long, Long, Long>>.sortedByDescending(crossinline selector: (Triple<Long, Long, Long>) -> Long?): List<Triple<Long, Long, Long>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Triple<Long, Long, Long>
    <R : Comparable<R>> -> Long

'component1' @ [167:59] ==> public final operator fun component1(): Long defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'component2' @ [167:62] ==> public final operator fun component2(): Long defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'component3' @ [167:65] ==> public final operator fun component3(): Long defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'diff' @ [167:74] ==> val diff: Long defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench.<anonymous>[LocalVariableDescriptor]

'drop' @ [167:81] ==> public fun <T> Iterable<Triple<Long, Long, Long>>.drop(n: Int): List<Triple<Long, Long, Long>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Triple<Long, Long, Long>

'first' @ [167:89] ==> public fun <T> List<Triple<Long, Long, Long>>.first(): Triple<Long, Long, Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Triple<Long, Long, Long>

'toMillis' @ [169:46] ==> public open fun toMillis(p0: Long): Long defined in java.util.concurrent.TimeUnit[JavaMethodDescriptor]

'this' @ [169:55] ==> <this> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench.ms[ReceiverParameterDescriptorImpl]

'assertTrue' @ [170:18] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'times' @ [170:81] ==> val times: List<Triple<Long, Long, Long>> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench[LocalVariableDescriptor]

'joinToString' @ [170:87] ==> public fun <T> Iterable<Triple<Long, Long, Long>>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Triple<Long, Long, Long>) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Triple<Long, Long, Long>

'it' @ [170:106] ==> value-parameter it: Triple<Long, Long, Long> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [170:109] ==> public final val first: Long defined in kotlin.Triple[DeserializedPropertyDescriptor]

'ms' @ [170:115] ==> local final fun Long.ms(): Long defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench[SimpleFunctionDescriptorImpl]

'it' @ [170:124] ==> value-parameter it: Triple<Long, Long, Long> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [170:127] ==> public final val second: Long defined in kotlin.Triple[DeserializedPropertyDescriptor]

'ms' @ [170:134] ==> local final fun Long.ms(): Long defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench[SimpleFunctionDescriptorImpl]

'adjustedMaxDiff' @ [171:29] ==> val adjustedMaxDiff: Triple<Long, Long, Long> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench[LocalVariableDescriptor]

'third' @ [171:45] ==> public final val third: Long defined in kotlin.Triple[DeserializedPropertyDescriptor]

'adjustedMaxDiff' @ [171:95] ==> val adjustedMaxDiff: Triple<Long, Long, Long> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench[LocalVariableDescriptor]

'first' @ [171:111] ==> public final val first: Long defined in kotlin.Triple[DeserializedPropertyDescriptor]

'adjustedMaxDiff' @ [171:120] ==> val adjustedMaxDiff: Triple<Long, Long, Long> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.ignored_testSourceSectionsRunBench[LocalVariableDescriptor]

'second' @ [171:136] ==> public final val second: Long defined in kotlin.Triple[DeserializedPropertyDescriptor]

'getTestFiles' @ [175:30] ==> private final fun getTestFiles(expectedExt: String): List<SourceSectionsTest.SourceToExpectedResults> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'sourceToOutput' @ [177:9] ==> val sourceToOutput: List<SourceSectionsTest.SourceToExpectedResults> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileLocal[LocalVariableDescriptor]

'forEach' @ [177:24] ==> @HidesMembers public inline fun <T> Iterable<SourceSectionsTest.SourceToExpectedResults>.forEach(action: (SourceSectionsTest.SourceToExpectedResults) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceToExpectedResults

'component1' @ [177:35] ==> public final operator fun component1(): File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.SourceToExpectedResults[SimpleFunctionDescriptorImpl]

'component2' @ [177:43] ==> public final operator fun component2(): File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.SourceToExpectedResults[SimpleFunctionDescriptorImpl]

'arrayOf' @ [178:24] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (String..String?)): Array<(String..String?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (kotlin.String..kotlin.String?)

'source' @ [178:32] ==> val source: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileLocal.<anonymous>[LocalVariableDescriptor]

'canonicalPath' @ [178:39] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'tmpdir' @ [178:60] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[JavaPropertyDescriptor]

'canonicalPath' @ [178:67] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'sourceSectionsPluginJar' @ [179:44] ==> public final val sourceSectionsPluginJar: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[PropertyDescriptorImpl]

'canonicalPath' @ [179:68] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'TEST_ALLOWED_SECTIONS' @ [180:38] ==> public final val TEST_ALLOWED_SECTIONS: List<String> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.Companion[PropertyDescriptorImpl]

'joinToString' @ [180:60] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'SourceSectionsCommandLineProcessor' @ [180:90] ==> public companion object defined in org.jetbrains.kotlin.sourceSections.SourceSectionsCommandLineProcessor[FakeCallableDescriptorForObject]

'PLUGIN_ID' @ [180:125] ==> public final val PLUGIN_ID: String defined in org.jetbrains.kotlin.sourceSections.SourceSectionsCommandLineProcessor.Companion[DeserializedPropertyDescriptor]

'SourceSectionsCommandLineProcessor' @ [180:138] ==> public companion object defined in org.jetbrains.kotlin.sourceSections.SourceSectionsCommandLineProcessor[FakeCallableDescriptorForObject]

'SECTIONS_OPTION' @ [180:173] ==> public final val SECTIONS_OPTION: CliOption defined in org.jetbrains.kotlin.sourceSections.SourceSectionsCommandLineProcessor.Companion[DeserializedPropertyDescriptor]

'name' @ [180:189] ==> public final val name: String defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedPropertyDescriptor]

'it' @ [180:196] ==> value-parameter it: String defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileLocal.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [181:18] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [181:26] ==> public final operator fun component2(): ExitCode defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'captureOut' @ [181:34] ==> internal fun <T> captureOut(body: () -> ExitCode): Pair<String, ExitCode> defined in org.jetbrains.kotlin.sourceSections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ExitCode

'CLITool' @ [182:17] ==> public companion object defined in org.jetbrains.kotlin.cli.common.CLITool[FakeCallableDescriptorForObject]

'doMainNoExit' @ [182:25] ==> @JvmStatic public final fun doMainNoExit(compiler: CLITool<*>, args: Array<String>): ExitCode defined in org.jetbrains.kotlin.cli.common.CLITool.Companion[DeserializedSimpleFunctionDescriptor]

'K2JVMCompiler' @ [182:38] ==> public constructor K2JVMCompiler() defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[DeserializedClassConstructorDescriptor]

'args' @ [182:55] ==> val args: Array<(String..String?)> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileLocal.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [185:22] ==> public open fun assertEquals(p0: (String..String?), p1: Int, p2: Int): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'output' @ [185:58] ==> val output: String defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileLocal.<anonymous>[LocalVariableDescriptor]

'code' @ [185:70] ==> val code: ExitCode defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileLocal.<anonymous>[LocalVariableDescriptor]

'code' @ [185:75] ==> public final val ExitCode.code: Int[MyPropertyDescriptor]

'loadScriptClass' @ [187:31] ==> private final fun loadScriptClass(scriptClassFile: File?): Class<*>? defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'File' @ [187:47] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [187:52] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[JavaPropertyDescriptor]

'source' @ [187:60] ==> val source: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileLocal.<anonymous>[LocalVariableDescriptor]

'nameWithoutExtension' @ [187:67] ==> public val File.nameWithoutExtension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'capitalize' @ [187:88] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'verifyScriptOutput' @ [189:13] ==> private final fun verifyScriptOutput(scriptClass: Class<*>?, expectedOutput: File): Unit defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'scriptClass' @ [189:32] ==> val scriptClass: Class<*>? defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileLocal.<anonymous>[LocalVariableDescriptor]

'expectedOutput' @ [189:45] ==> val expectedOutput: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileLocal.<anonymous>[LocalVariableDescriptor]

'getTestFiles' @ [194:30] ==> private final fun getTestFiles(expectedExt: String): List<SourceSectionsTest.SourceToExpectedResults> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'withFlagFile' @ [196:9] ==> internal inline fun withFlagFile(prefix: String, suffix: String? = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.sourceSections[SimpleFunctionDescriptorImpl]

'DaemonOptions' @ [198:33] ==> public constructor DaemonOptions(runFilesPath: String = ..., autoshutdownMemoryThreshold: Long = ..., autoshutdownIdleSeconds: Int = ..., autoshutdownUnusedSeconds: Int = ..., shutdownDelayMilliseconds: Long = ..., forceShutdownTimeoutMilliseconds: Long = ..., verbose: Boolean = ..., reportPerf: Boolean = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedClassConstructorDescriptor]

'File' @ [198:62] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [198:67] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[JavaPropertyDescriptor]

'getTestName' @ [198:75] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[JavaMethodDescriptor]

'absolutePath' @ [198:94] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'configureDaemonJVMOptions' @ [199:36] ==> public fun configureDaemonJVMOptions(vararg additionalParams: String, inheritMemoryLimits: Boolean, inheritOtherJvmOptions: Boolean, inheritAdditionalProperties: Boolean): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'TestMessageCollector' @ [200:36] ==> public constructor TestMessageCollector() defined in org.jetbrains.kotlin.sourceSections.TestMessageCollector[ClassConstructorDescriptorImpl]

'KotlinCompilerClient' @ [202:37] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'connectAndLease' @ [202:58] ==> public final fun connectAndLease(compilerId: CompilerId, clientAliveFlagFile: File, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean, leaseSession: Boolean, sessionAliveFlagFile: File? = ...): CompileServiceSession? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [202:74] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[PropertyDescriptorImpl]

'aliveFile' @ [202:86] ==> value-parameter aliveFile: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>[ValueParameterDescriptorImpl]

'daemonJVMOptions' @ [202:97] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [202:115] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>[LocalVariableDescriptor]

'DaemonReportingTargets' @ [203:74] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[DeserializedClassConstructorDescriptor]

'messageCollector' @ [203:116] ==> val messageCollector: TestMessageCollector defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>[LocalVariableDescriptor]

'assertNotNull' @ [204:13] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaMethodDescriptor]

'compilerId' @ [204:69] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[PropertyDescriptorImpl]

'daemonOptions' @ [204:95] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>[LocalVariableDescriptor]

'daemonJVMOptions' @ [204:121] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>[LocalVariableDescriptor]

'aliveFile' @ [204:152] ==> value-parameter aliveFile: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>[ValueParameterDescriptorImpl]

'daemonWithSession' @ [204:166] ==> val daemonWithSession: CompileServiceSession? defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>[LocalVariableDescriptor]

'sourceToOutput' @ [208:17] ==> val sourceToOutput: List<SourceSectionsTest.SourceToExpectedResults> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon[LocalVariableDescriptor]

'forEach' @ [208:32] ==> @HidesMembers public inline fun <T> Iterable<SourceSectionsTest.SourceToExpectedResults>.forEach(action: (SourceSectionsTest.SourceToExpectedResults) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceToExpectedResults

'component1' @ [208:43] ==> public final operator fun component1(): File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.SourceToExpectedResults[SimpleFunctionDescriptorImpl]

'component2' @ [208:51] ==> public final operator fun component2(): File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.SourceToExpectedResults[SimpleFunctionDescriptorImpl]

'arrayOf' @ [209:32] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (String..String?)): Array<(String..String?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (kotlin.String..kotlin.String?)

'source' @ [209:40] ==> val source: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'canonicalPath' @ [209:47] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'tmpdir' @ [209:68] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[JavaPropertyDescriptor]

'canonicalPath' @ [209:75] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'sourceSectionsPluginJar' @ [210:52] ==> public final val sourceSectionsPluginJar: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[PropertyDescriptorImpl]

'canonicalPath' @ [210:76] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'TEST_ALLOWED_SECTIONS' @ [211:46] ==> public final val TEST_ALLOWED_SECTIONS: List<String> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.Companion[PropertyDescriptorImpl]

'joinToString' @ [211:68] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'SourceSectionsCommandLineProcessor' @ [211:98] ==> public companion object defined in org.jetbrains.kotlin.sourceSections.SourceSectionsCommandLineProcessor[FakeCallableDescriptorForObject]

'PLUGIN_ID' @ [211:133] ==> public final val PLUGIN_ID: String defined in org.jetbrains.kotlin.sourceSections.SourceSectionsCommandLineProcessor.Companion[DeserializedPropertyDescriptor]

'SourceSectionsCommandLineProcessor' @ [211:146] ==> public companion object defined in org.jetbrains.kotlin.sourceSections.SourceSectionsCommandLineProcessor[FakeCallableDescriptorForObject]

'SECTIONS_OPTION' @ [211:181] ==> public final val SECTIONS_OPTION: CliOption defined in org.jetbrains.kotlin.sourceSections.SourceSectionsCommandLineProcessor.Companion[DeserializedPropertyDescriptor]

'name' @ [211:197] ==> public final val name: String defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedPropertyDescriptor]

'it' @ [211:204] ==> value-parameter it: String defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'messageCollector' @ [214:21] ==> val messageCollector: TestMessageCollector defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>[LocalVariableDescriptor]

'clear' @ [214:38] ==> public open fun clear(): Unit defined in org.jetbrains.kotlin.sourceSections.TestMessageCollector[SimpleFunctionDescriptorImpl]

'arrayListOf' @ [215:35] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<OutputMessageUtil.Output> /* = ArrayList<OutputMessageUtil.Output> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Output

'KotlinCompilerClient' @ [217:32] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'compile' @ [217:53] ==> public final fun compile(compilerService: CompileService, sessionId: Int, targetPlatform: CompileService.TargetPlatform, args: Array<out String>, messageCollector: MessageCollector, outputsCollector: ((File, List<File>) -> Unit)? = ..., compilerMode: CompilerMode = ..., reportSeverity: ReportSeverity = ..., port: Int = ..., profiler: Profiler = ...): Int defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'daemonWithSession' @ [217:61] ==> val daemonWithSession: CompileServiceSession? defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>[LocalVariableDescriptor]

'compileService' @ [217:81] ==> public final val compileService: CompileService defined in org.jetbrains.kotlin.daemon.client.CompileServiceSession[DeserializedPropertyDescriptor]

'daemonWithSession' @ [217:97] ==> val daemonWithSession: CompileServiceSession? defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>[LocalVariableDescriptor]

'sessionId' @ [217:115] ==> public final val sessionId: Int defined in org.jetbrains.kotlin.daemon.client.CompileServiceSession[DeserializedPropertyDescriptor]

'CompileService' @ [217:126] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'JVM' @ [217:156] ==> enum entry JVM defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'args' @ [218:61] ==> val args: Array<(String..String?)> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'messageCollector' @ [218:67] ==> val messageCollector: TestMessageCollector defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>[LocalVariableDescriptor]

'outputs' @ [219:84] ==> val outputs: ArrayList<OutputMessageUtil.Output> /* = ArrayList<OutputMessageUtil.Output> */ defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'add' @ [219:92] ==> public open fun add(element: OutputMessageUtil.Output): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Output' @ [219:114] ==> public constructor Output(@NotNull p0: (MutableCollection<(File..File?)>..Collection<(File..File?)>), @Nullable p1: File?) defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil.Output[JavaClassConstructorDescriptor]

'srcFiles' @ [219:121] ==> value-parameter srcFiles: List<File> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'outFile' @ [219:131] ==> value-parameter outFile: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ReportSeverity' @ [220:78] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'DEBUG' @ [220:93] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'assertEquals' @ [222:30] ==> public open fun assertEquals(p0: (String..String?), p1: Int, p2: Int): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'messageCollector' @ [222:67] ==> val messageCollector: TestMessageCollector defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>[LocalVariableDescriptor]

'messages' @ [222:84] ==> public final val messages: ArrayList<TestMessageCollector.Message> /* = ArrayList<TestMessageCollector.Message> */ defined in org.jetbrains.kotlin.sourceSections.TestMessageCollector[PropertyDescriptorImpl]

'joinToString' @ [222:93] ==> public fun <T> Iterable<TestMessageCollector.Message>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((TestMessageCollector.Message) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Message

'code' @ [222:118] ==> val code: Int defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'assertFalse' @ [223:30] ==> public open fun assertFalse(p0: (String..String?), p1: Boolean): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'messageCollector' @ [223:66] ==> val messageCollector: TestMessageCollector defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>[LocalVariableDescriptor]

'messages' @ [223:83] ==> public final val messages: ArrayList<TestMessageCollector.Message> /* = ArrayList<TestMessageCollector.Message> */ defined in org.jetbrains.kotlin.sourceSections.TestMessageCollector[PropertyDescriptorImpl]

'joinToString' @ [223:92] ==> public fun <T> Iterable<TestMessageCollector.Message>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((TestMessageCollector.Message) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Message

'messageCollector' @ [223:114] ==> val messageCollector: TestMessageCollector defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>[LocalVariableDescriptor]

'hasErrors' @ [223:131] ==> public open fun hasErrors(): Boolean defined in org.jetbrains.kotlin.sourceSections.TestMessageCollector[SimpleFunctionDescriptorImpl]

'outputs' @ [224:43] ==> val outputs: ArrayList<OutputMessageUtil.Output> /* = ArrayList<OutputMessageUtil.Output> */ defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'first' @ [224:51] ==> public fun <T> List<OutputMessageUtil.Output>.first(): OutputMessageUtil.Output defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Output

'outputFile' @ [224:59] ==> @Nullable public final val outputFile: File? defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil.Output[JavaPropertyDescriptor]

'assertEquals' @ [225:30] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'source' @ [225:78] ==> val source: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'nameWithoutExtension' @ [225:85] ==> public val File.nameWithoutExtension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'capitalize' @ [225:106] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'scriptClassFile' @ [225:120] ==> val scriptClassFile: File? defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'nameWithoutExtension' @ [225:137] ==> public val File.nameWithoutExtension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'verifyScriptOutput' @ [227:21] ==> private final fun verifyScriptOutput(scriptClass: Class<*>?, expectedOutput: File): Unit defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'loadScriptClass' @ [227:40] ==> private final fun loadScriptClass(scriptClassFile: File?): Class<*>? defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'scriptClassFile' @ [227:56] ==> val scriptClassFile: File? defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'expectedOutput' @ [227:74] ==> val expectedOutput: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'daemonWithSession' @ [231:17] ==> val daemonWithSession: CompileServiceSession? defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.testSourceSectionCompileOnDaemon.<anonymous>[LocalVariableDescriptor]

'compileService' @ [231:37] ==> public final val compileService: CompileService defined in org.jetbrains.kotlin.daemon.client.CompileServiceSession[DeserializedPropertyDescriptor]

'shutdown' @ [231:52] ==> public abstract fun shutdown(): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'URLClassLoader' @ [237:18] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'scriptRuntimeClassPath' @ [237:34] ==> public final val scriptRuntimeClassPath: List<File> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[PropertyDescriptorImpl]

'tmpdir' @ [237:59] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[JavaPropertyDescriptor]

'map' @ [237:67] ==> public inline fun <T, R> Iterable<(File..File?)>.map(transform: ((File..File?)) -> (URL..URL?)): List<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)
    <R> -> (java.net.URL..java.net.URL?)

'it' @ [237:73] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.loadScriptClass.<anonymous>[ValueParameterDescriptorImpl]

'toURI' @ [237:76] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'toURL' @ [237:84] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'toTypedArray' @ [237:94] ==> public inline fun <reified T> Collection<(URL..URL?)>.toTypedArray(): Array<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (java.net.URL..java.net.URL?)

'cl' @ [238:27] ==> val cl: URLClassLoader defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.loadScriptClass[LocalVariableDescriptor]

'loadClass' @ [238:30] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.net.URLClassLoader[JavaMethodDescriptor]

'scriptClassFile' @ [238:40] ==> value-parameter scriptClassFile: File? defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.loadScriptClass[ValueParameterDescriptorImpl]

'nameWithoutExtension' @ [238:58] ==> public val File.nameWithoutExtension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'assertNotNull' @ [240:18] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'scriptClassFile' @ [240:55] ==> value-parameter scriptClassFile: File? defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.loadScriptClass[ValueParameterDescriptorImpl]

'scriptClass' @ [240:73] ==> val scriptClass: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.loadScriptClass[LocalVariableDescriptor]

'scriptClass' @ [241:16] ==> val scriptClass: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.loadScriptClass[LocalVariableDescriptor]

'captureOut' @ [245:25] ==> internal fun <T> captureOut(body: () -> Any?): Pair<String, Any?> defined in org.jetbrains.kotlin.sourceSections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any?

'tryConstructClassFromStringArgs' @ [246:13] ==> public fun tryConstructClassFromStringArgs(clazz: Class<*>, args: List<String>): Any? defined in org.jetbrains.kotlin.script[DeserializedSimpleFunctionDescriptor]

'scriptClass' @ [246:45] ==> value-parameter scriptClass: Class<*>? defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.verifyScriptOutput[ValueParameterDescriptorImpl]

'emptyList' @ [246:60] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'first' @ [247:11] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'lines' @ [247:17] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [248:18] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'String' @ [248:22] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'dropLastWhile' @ [249:18] ==> public inline fun <T> List<String>.dropLastWhile(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [249:34] ==> value-parameter it: String defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.verifyScriptOutput.<anonymous>[ValueParameterDescriptorImpl]

'isBlank' @ [249:37] ==> public fun CharSequence.isBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expectedOutput' @ [251:24] ==> value-parameter expectedOutput: File defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.verifyScriptOutput[ValueParameterDescriptorImpl]

'inputStream' @ [251:39] ==> @InlineOnly public inline fun File.inputStream(): FileInputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'trimmedLines' @ [251:53] ==> private final fun InputStream.trimmedLines(charset: Charset): List<String> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest[SimpleFunctionDescriptorImpl]

'defaultCharset' @ [251:74] ==> public open fun defaultCharset(): (Charset..Charset?) defined in java.nio.charset.Charset[JavaMethodDescriptor]

'assertEquals' @ [253:18] ==> public open fun assertEquals(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'scriptClass' @ [253:66] ==> value-parameter scriptClass: Class<*>? defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.verifyScriptOutput[ValueParameterDescriptorImpl]

'name' @ [253:79] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'expected' @ [253:87] ==> val expected: List<String> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.verifyScriptOutput[LocalVariableDescriptor]

'scriptOut' @ [253:97] ==> val scriptOut: List<String> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsTest.verifyScriptOutput[LocalVariableDescriptor]

'createTempFile' @ [258:16] ==> public fun createTempFile(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'prefix' @ [258:31] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.sourceSections.withFlagFile[ValueParameterDescriptorImpl]

'suffix' @ [258:39] ==> value-parameter suffix: String? = ... defined in org.jetbrains.kotlin.sourceSections.withFlagFile[ValueParameterDescriptorImpl]

'invoke' @ [260:9] ==> public abstract operator fun invoke(p1: File): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'file' @ [260:14] ==> val file: File defined in org.jetbrains.kotlin.sourceSections.withFlagFile[LocalVariableDescriptor]

'file' @ [263:9] ==> val file: File defined in org.jetbrains.kotlin.sourceSections.withFlagFile[LocalVariableDescriptor]

'delete' @ [263:14] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'ByteArrayOutputStream' @ [268:21] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'out' @ [269:26] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'err' @ [270:26] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'setOut' @ [271:12] ==> public open fun setOut(p0: (PrintStream..PrintStream?)): Unit defined in java.lang.System[JavaMethodDescriptor]

'PrintStream' @ [271:19] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'outStream' @ [271:31] ==> val outStream: ByteArrayOutputStream defined in org.jetbrains.kotlin.sourceSections.captureOut[LocalVariableDescriptor]

'setErr' @ [272:12] ==> public open fun setErr(p0: (PrintStream..PrintStream?)): Unit defined in java.lang.System[JavaMethodDescriptor]

'PrintStream' @ [272:19] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'outStream' @ [272:31] ==> val outStream: ByteArrayOutputStream defined in org.jetbrains.kotlin.sourceSections.captureOut[LocalVariableDescriptor]

'invoke' @ [274:9] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'out' @ [277:16] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'flush' @ [277:20] ==> public open fun flush(): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'setOut' @ [278:16] ==> public open fun setOut(p0: (PrintStream..PrintStream?)): Unit defined in java.lang.System[JavaMethodDescriptor]

'prevOut' @ [278:23] ==> val prevOut: (PrintStream..PrintStream?) defined in org.jetbrains.kotlin.sourceSections.captureOut[LocalVariableDescriptor]

'err' @ [279:16] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'flush' @ [279:20] ==> public open fun flush(): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'setErr' @ [280:16] ==> public open fun setErr(p0: (PrintStream..PrintStream?)): Unit defined in java.lang.System[JavaMethodDescriptor]

'prevErr' @ [280:23] ==> val prevErr: (PrintStream..PrintStream?) defined in org.jetbrains.kotlin.sourceSections.captureOut[LocalVariableDescriptor]

'outStream' @ [282:12] ==> val outStream: ByteArrayOutputStream defined in org.jetbrains.kotlin.sourceSections.captureOut[LocalVariableDescriptor]

'toString' @ [282:22] ==> public open fun toString(): String defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'res' @ [282:36] ==> val res: T defined in org.jetbrains.kotlin.sourceSections.captureOut[LocalVariableDescriptor]

'arrayListOf' @ [288:20] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<TestMessageCollector.Message> /* = ArrayList<TestMessageCollector.Message> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Message

'messages' @ [291:9] ==> public final val messages: ArrayList<TestMessageCollector.Message> /* = ArrayList<TestMessageCollector.Message> */ defined in org.jetbrains.kotlin.sourceSections.TestMessageCollector[PropertyDescriptorImpl]

'clear' @ [291:18] ==> public open fun clear(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'messages' @ [295:9] ==> public final val messages: ArrayList<TestMessageCollector.Message> /* = ArrayList<TestMessageCollector.Message> */ defined in org.jetbrains.kotlin.sourceSections.TestMessageCollector[PropertyDescriptorImpl]

'add' @ [295:18] ==> public open fun add(element: TestMessageCollector.Message): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Message' @ [295:22] ==> public constructor Message(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation?) defined in org.jetbrains.kotlin.sourceSections.TestMessageCollector.Message[ClassConstructorDescriptorImpl]

'severity' @ [295:30] ==> value-parameter severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.sourceSections.TestMessageCollector.report[ValueParameterDescriptorImpl]

'message' @ [295:40] ==> value-parameter message: String defined in org.jetbrains.kotlin.sourceSections.TestMessageCollector.report[ValueParameterDescriptorImpl]

'location' @ [295:49] ==> value-parameter location: CompilerMessageLocation? defined in org.jetbrains.kotlin.sourceSections.TestMessageCollector.report[ValueParameterDescriptorImpl]

'messages' @ [298:41] ==> public final val messages: ArrayList<TestMessageCollector.Message> /* = ArrayList<TestMessageCollector.Message> */ defined in org.jetbrains.kotlin.sourceSections.TestMessageCollector[PropertyDescriptorImpl]

'any' @ [298:50] ==> public inline fun <T> Iterable<TestMessageCollector.Message>.any(predicate: (TestMessageCollector.Message) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Message

'it' @ [298:56] ==> value-parameter it: TestMessageCollector.Message defined in org.jetbrains.kotlin.sourceSections.TestMessageCollector.hasErrors.<anonymous>[ValueParameterDescriptorImpl]

'severity' @ [298:59] ==> public final val severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.sourceSections.TestMessageCollector.Message[PropertyDescriptorImpl]

'EXCEPTION' @ [298:95] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'it' @ [298:108] ==> value-parameter it: TestMessageCollector.Message defined in org.jetbrains.kotlin.sourceSections.TestMessageCollector.hasErrors.<anonymous>[ValueParameterDescriptorImpl]

'severity' @ [298:111] ==> public final val severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.sourceSections.TestMessageCollector.Message[PropertyDescriptorImpl]

'ERROR' @ [298:147] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

