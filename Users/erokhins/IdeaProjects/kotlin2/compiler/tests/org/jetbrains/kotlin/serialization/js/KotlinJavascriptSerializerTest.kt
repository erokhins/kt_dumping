'TestCaseWithTmpdir' @ [43:40] ==> public constructor TestCaseWithTmpdir() defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaClassConstructorDescriptor]

'tmpdir' @ [46:62] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest[JavaPropertyDescriptor]

'BASE_DIR' @ [47:24] ==> private final val BASE_DIR: String defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest[PropertyDescriptorImpl]

'fileName' @ [47:34] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.doTest[ValueParameterDescriptorImpl]

'File' @ [48:24] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'metaFileDir' @ [48:29] ==> value-parameter metaFileDir: File = ... defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.doTest[ValueParameterDescriptorImpl]

'getNameWithoutExtension' @ [48:54] ==> @NotNull public open fun getNameWithoutExtension(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'fileName' @ [48:78] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.doTest[ValueParameterDescriptorImpl]

'listOf' @ [50:23] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'File' @ [50:30] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'source' @ [50:35] ==> val source: String defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.doTest[LocalVariableDescriptor]

'newConfiguration' @ [52:45] ==> @NotNull public open fun newConfiguration(): CompilerConfiguration defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'configuration' @ [53:9] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.doTest[LocalVariableDescriptor]

'put' @ [53:23] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(MessageCollector..MessageCollector?)>, @NotNull p1: MessageCollector): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.cli.common.messages.MessageCollector..org.jetbrains.kotlin.cli.common.messages.MessageCollector?)

'MESSAGE_COLLECTOR_KEY' @ [53:48] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'NONE' @ [53:88] ==> public final val NONE: MessageCollector defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector.Companion[DeserializedPropertyDescriptor]

'configuration' @ [54:9] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.doTest[LocalVariableDescriptor]

'put' @ [54:23] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>, @NotNull p1: (MutableList<(String..String?)>..List<(String..String?)>)): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.MutableList<(kotlin.String..kotlin.String?)>..kotlin.collections.List<(kotlin.String..kotlin.String?)>?)

'LIBRARIES' @ [54:47] ==> public final val LIBRARIES: (CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>..CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'JS_STDLIB' @ [54:67] ==> public final val JS_STDLIB: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.kotlin.js.config.JsConfig[JavaPropertyDescriptor]

'configuration' @ [56:9] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.doTest[LocalVariableDescriptor]

'addKotlinSourceRoots' @ [56:23] ==> public fun CompilerConfiguration.addKotlinSourceRoots(sources: List<String>): Unit defined in org.jetbrains.kotlin.config[DeserializedSimpleFunctionDescriptor]

'srcDirs' @ [56:44] ==> val srcDirs: List<File> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.doTest[LocalVariableDescriptor]

'map' @ [56:52] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [56:58] ==> value-parameter it: File defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [56:61] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'serialize' @ [58:9] ==> private final fun serialize(configuration: CompilerConfiguration, metaFile: File): Unit defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest[SimpleFunctionDescriptorImpl]

'configuration' @ [58:19] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.doTest[LocalVariableDescriptor]

'metaFile' @ [58:34] ==> val metaFile: File defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.doTest[LocalVariableDescriptor]

'deserialize' @ [59:22] ==> private final fun deserialize(metaFile: File): ModuleDescriptorImpl defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest[SimpleFunctionDescriptorImpl]

'metaFile' @ [59:34] ==> val metaFile: File defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.doTest[LocalVariableDescriptor]

'validateAndCompareDescriptorWithFile' @ [61:39] ==> public open fun validateAndCompareDescriptorWithFile(@NotNull p0: DeclarationDescriptor, @NotNull p1: RecursiveDescriptorComparator.Configuration, @NotNull p2: File): Unit defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator[JavaMethodDescriptor]

'module' @ [62:17] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.doTest[LocalVariableDescriptor]

'getPackage' @ [62:24] ==> public open fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'TEST_PACKAGE_FQNAME' @ [62:35] ==> @NotNull public final val TEST_PACKAGE_FQNAME: FqName defined in org.jetbrains.kotlin.jvm.compiler.LoadDescriptorUtil[JavaPropertyDescriptor]

'DONT_INCLUDE_METHODS_OF_OBJECT' @ [63:47] ==> public final val DONT_INCLUDE_METHODS_OF_OBJECT: (RecursiveDescriptorComparator.Configuration..RecursiveDescriptorComparator.Configuration?) defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator[JavaPropertyDescriptor]

'File' @ [64:17] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'source' @ [64:22] ==> val source: String defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.doTest[LocalVariableDescriptor]

'replace' @ [64:29] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'newDisposable' @ [69:39] ==> @NotNull public open fun newDisposable(): Disposable defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'KotlinCoreEnvironment' @ [71:31] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'createForTests' @ [71:53] ==> @JvmStatic public final fun createForTests(parentDisposable: Disposable, configuration: CompilerConfiguration, extensionConfigs: EnvironmentConfigFiles): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[DeserializedSimpleFunctionDescriptor]

'rootDisposable' @ [71:68] ==> val rootDisposable: Disposable defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.serialize[LocalVariableDescriptor]

'configuration' @ [71:84] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.serialize[ValueParameterDescriptorImpl]

'JS_CONFIG_FILES' @ [71:122] ==> enum entry JS_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'environment' @ [72:25] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.serialize[LocalVariableDescriptor]

'getSourceFiles' @ [72:37] ==> public final fun getSourceFiles(): List<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedSimpleFunctionDescriptor]

'JsConfig' @ [73:26] ==> public constructor JsConfig(@NotNull p0: Project, @NotNull p1: CompilerConfiguration) defined in org.jetbrains.kotlin.js.config.JsConfig[JavaClassConstructorDescriptor]

'environment' @ [73:35] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.serialize[LocalVariableDescriptor]

'project' @ [73:47] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'environment' @ [73:56] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.serialize[LocalVariableDescriptor]

'configuration' @ [73:68] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'TopDownAnalyzerFacadeForJS' @ [74:34] ==> public object TopDownAnalyzerFacadeForJS defined in org.jetbrains.kotlin.js.analyze[FakeCallableDescriptorForObject]

'analyzeFiles' @ [74:61] ==> @JvmStatic public final fun analyzeFiles(files: Collection<KtFile>, config: JsConfig): JsAnalysisResult defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS[DeserializedSimpleFunctionDescriptor]

'files' @ [74:74] ==> val files: List<KtFile> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.serialize[LocalVariableDescriptor]

'config' @ [74:81] ==> val config: JsConfig defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.serialize[LocalVariableDescriptor]

'JsModuleDescriptor' @ [75:31] ==> public constructor JsModuleDescriptor<out T>(name: String, kind: ModuleKind, imported: List<String>, data: ModuleDescriptor) defined in org.jetbrains.kotlin.serialization.js.JsModuleDescriptor[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> ModuleDescriptor

'TEST_MODULE_NAME' @ [76:44] ==> public final var TEST_MODULE_NAME: (String..String?) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaPropertyDescriptor]

'PLAIN' @ [77:39] ==> enum entry PLAIN defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'listOf' @ [78:32] ==> @InlineOnly public inline fun <T> listOf(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'analysisResult' @ [79:28] ==> val analysisResult: JsAnalysisResult defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.serialize[LocalVariableDescriptor]

'moduleDescriptor' @ [79:43] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.js.analyzer.JsAnalysisResult[DeserializedPropertyDescriptor]

'writeToFile' @ [81:22] ==> public open fun writeToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'metaFile' @ [81:34] ==> value-parameter metaFile: File defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.serialize[ValueParameterDescriptorImpl]

'metadataAsString' @ [81:78] ==> public final fun metadataAsString(bindingContext: BindingContext, jsDescriptor: JsModuleDescriptor<ModuleDescriptor>): String defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[DeserializedSimpleFunctionDescriptor]

'analysisResult' @ [81:95] ==> val analysisResult: JsAnalysisResult defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.serialize[LocalVariableDescriptor]

'bindingContext' @ [81:110] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.js.analyzer.JsAnalysisResult[DeserializedPropertyDescriptor]

'description' @ [81:126] ==> val description: JsModuleDescriptor<ModuleDescriptor> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.serialize[LocalVariableDescriptor]

'dispose' @ [84:22] ==> public open fun dispose(@NotNull p0: Disposable): Unit defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'rootDisposable' @ [84:30] ==> val rootDisposable: Disposable defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.serialize[LocalVariableDescriptor]

'createEmptyModule' @ [89:38] ==> @NotNull public open fun createEmptyModule(@NotNull p0: String, @NotNull p1: KotlinBuiltIns): ModuleDescriptorImpl defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'TEST_MODULE_NAME' @ [89:76] ==> public final var TEST_MODULE_NAME: (String..String?) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaPropertyDescriptor]

'builtIns' @ [89:108] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.js.resolve.JsPlatform[DeserializedPropertyDescriptor]

'KotlinJavascriptMetadataUtils' @ [90:24] ==> public object KotlinJavascriptMetadataUtils defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'loadMetadata' @ [90:54] ==> @JvmStatic public final fun loadMetadata(file: File): List<KotlinJavascriptMetadata> defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadataUtils[DeserializedSimpleFunctionDescriptor]

'metaFile' @ [90:67] ==> value-parameter metaFile: File defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.deserialize[ValueParameterDescriptorImpl]

'assert' @ [91:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'metadata' @ [91:16] ==> val metadata: List<KotlinJavascriptMetadata> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.deserialize[LocalVariableDescriptor]

'size' @ [91:25] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'KotlinJavascriptSerializationUtil' @ [93:24] ==> public object KotlinJavascriptSerializationUtil defined in org.jetbrains.kotlin.serialization.js[FakeCallableDescriptorForObject]

'readModule' @ [93:58] ==> @JvmStatic public final fun readModule(metadata: ByteArray, storageManager: StorageManager, module: ModuleDescriptor, configuration: DeserializationConfiguration, lookupTracker: LookupTracker): JsModuleDescriptor<PackageFragmentProvider?> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[DeserializedSimpleFunctionDescriptor]

'metadata' @ [94:17] ==> val metadata: List<KotlinJavascriptMetadata> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.deserialize[LocalVariableDescriptor]

'single' @ [94:26] ==> public fun <T> List<KotlinJavascriptMetadata>.single(): KotlinJavascriptMetadata defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinJavascriptMetadata

'body' @ [94:35] ==> public final val body: ByteArray defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadata[DeserializedPropertyDescriptor]

'LockBasedStorageManager' @ [94:41] ==> public constructor LockBasedStorageManager() defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaClassConstructorDescriptor]

'module' @ [94:68] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.deserialize[LocalVariableDescriptor]

'Default' @ [94:105] ==> public object Default : DeserializationConfiguration defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationConfiguration[FakeCallableDescriptorForObject]

'DO_NOTHING' @ [94:128] ==> public object DO_NOTHING : LookupTracker defined in org.jetbrains.kotlin.incremental.components.LookupTracker[FakeCallableDescriptorForObject]

'data' @ [95:11] ==> public final val data: PackageFragmentProvider? defined in org.jetbrains.kotlin.serialization.js.JsModuleDescriptor[DeserializedPropertyDescriptor]

'sure' @ [95:16] ==> public inline fun <T : Any> PackageFragmentProvider?.sure(message: () -> String): PackageFragmentProvider defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PackageFragmentProvider

'module' @ [97:9] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.deserialize[LocalVariableDescriptor]

'initialize' @ [97:16] ==> public final fun initialize(providerForModuleContent: PackageFragmentProvider): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'provider' @ [97:27] ==> val provider: PackageFragmentProvider defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.deserialize[LocalVariableDescriptor]

'module' @ [98:9] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.deserialize[LocalVariableDescriptor]

'setDependencies' @ [98:16] ==> public final fun setDependencies(vararg descriptors: ModuleDescriptorImpl): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'module' @ [98:32] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.deserialize[LocalVariableDescriptor]

'module' @ [98:40] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.deserialize[LocalVariableDescriptor]

'builtIns' @ [98:47] ==> public open val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedPropertyDescriptor]

'builtInsModule' @ [98:56] ==> public final var KotlinBuiltIns.builtInsModule: ModuleDescriptorImpl[MyPropertyDescriptor]

'module' @ [100:16] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest.deserialize[LocalVariableDescriptor]

'doTest' @ [104:9] ==> private final fun doTest(fileName: String, metaFileDir: File = ...): Unit defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest[SimpleFunctionDescriptorImpl]

'doTest' @ [108:9] ==> private final fun doTest(fileName: String, metaFileDir: File = ...): Unit defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest[SimpleFunctionDescriptorImpl]

'doTest' @ [112:9] ==> private final fun doTest(fileName: String, metaFileDir: File = ...): Unit defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest[SimpleFunctionDescriptorImpl]

'doTest' @ [116:9] ==> private final fun doTest(fileName: String, metaFileDir: File = ...): Unit defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest[SimpleFunctionDescriptorImpl]

'doTest' @ [120:9] ==> private final fun doTest(fileName: String, metaFileDir: File = ...): Unit defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest[SimpleFunctionDescriptorImpl]

'doTest' @ [124:9] ==> private final fun doTest(fileName: String, metaFileDir: File = ...): Unit defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest[SimpleFunctionDescriptorImpl]

'doTest' @ [128:9] ==> private final fun doTest(fileName: String, metaFileDir: File = ...): Unit defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest[SimpleFunctionDescriptorImpl]

'doTest' @ [132:9] ==> private final fun doTest(fileName: String, metaFileDir: File = ...): Unit defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest[SimpleFunctionDescriptorImpl]

'doTest' @ [136:9] ==> private final fun doTest(fileName: String, metaFileDir: File = ...): Unit defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest[SimpleFunctionDescriptorImpl]

'doTest' @ [140:9] ==> private final fun doTest(fileName: String, metaFileDir: File = ...): Unit defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest[SimpleFunctionDescriptorImpl]

'doTest' @ [144:9] ==> private final fun doTest(fileName: String, metaFileDir: File = ...): Unit defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerTest[SimpleFunctionDescriptorImpl]

