'AbstractDiagnosticsTest' @ [40:54] ==> public constructor AbstractDiagnosticsTest() defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[DeserializedClassConstructorDescriptor]

'lazy' @ [41:47] ==> public fun <T> lazy(mode: LazyThreadSafetyMode, initializer: () -> JsConfig): Lazy<JsConfig> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsConfig

'NONE' @ [41:73] ==> enum entry NONE defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'JsConfig' @ [42:9] ==> public constructor JsConfig(@NotNull p0: Project, @NotNull p1: CompilerConfiguration) defined in org.jetbrains.kotlin.js.config.JsConfig[JavaClassConstructorDescriptor]

'project' @ [42:18] ==> protected final val project: Project defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib[DeserializedPropertyDescriptor]

'environment' @ [42:27] ==> protected final lateinit var environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib[DeserializedPropertyDescriptor]

'configuration' @ [42:39] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'copy' @ [42:53] ==> public open fun copy(): (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'apply' @ [42:60] ==> @InlineOnly public inline fun <T> (CompilerConfiguration..CompilerConfiguration?).apply(block: (CompilerConfiguration..CompilerConfiguration?).() -> Unit): (CompilerConfiguration..CompilerConfiguration?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.config.CompilerConfiguration..org.jetbrains.kotlin.config.CompilerConfiguration?)

'put' @ [43:13] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(String..String?)>, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'MODULE_NAME' @ [43:41] ==> @field:JvmField public final val MODULE_NAME: CompilerConfigurationKey<String> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'TEST_MODULE_NAME' @ [43:70] ==> public final var TEST_MODULE_NAME: (String..String?) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaPropertyDescriptor]

'put' @ [44:13] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>, @NotNull p1: (MutableList<(String..String?)>..List<(String..String?)>)): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.MutableList<(kotlin.String..kotlin.String?)>..kotlin.collections.List<(kotlin.String..kotlin.String?)>?)

'LIBRARIES' @ [44:37] ==> public final val LIBRARIES: (CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>..CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'JS_STDLIB' @ [44:57] ==> public final val JS_STDLIB: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.kotlin.js.config.JsConfig[JavaPropertyDescriptor]

'lazyConfig' @ [48:44] ==> private final var lazyConfig: Lazy<JsConfig>? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib[PropertyDescriptorImpl]

'value' @ [48:57] ==> public abstract val value: JsConfig defined in kotlin.Lazy[DeserializedPropertyDescriptor]

'lazyConfig' @ [51:9] ==> private final var lazyConfig: Lazy<JsConfig>? defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib[PropertyDescriptorImpl]

'super' @ [52:9] ==> <this> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib[LazyClassReceiverParameterDescriptor]

'tearDown' @ [52:15] ==> protected open fun tearDown(): Unit defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTest[DeserializedSimpleFunctionDescriptor]

'JS_CONFIG_FILES' @ [55:95] ==> enum entry JS_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'moduleTrace' @ [65:9] ==> value-parameter moduleTrace: BindingTrace defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.analyzeModuleContents[ValueParameterDescriptorImpl]

'record' @ [65:21] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(p0: (WritableSlice<(ModuleDescriptor..ModuleDescriptor?), (ModuleKind..ModuleKind?)>..WritableSlice<(ModuleDescriptor..ModuleDescriptor?), (ModuleKind..ModuleKind?)>?), p1: (ModuleDescriptor..ModuleDescriptor?), p2: (ModuleKind..ModuleKind?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ModuleDescriptor
    <V : (Any..Any?)> -> ModuleKind

'MODULE_KIND' @ [65:58] ==> @field:JvmField public val MODULE_KIND: BasicWritableSlice<ModuleDescriptor, ModuleKind> defined in org.jetbrains.kotlin.js.resolve[DeserializedPropertyDescriptor]

'moduleContext' @ [65:71] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.analyzeModuleContents[ValueParameterDescriptorImpl]

'module' @ [65:85] ==> public abstract val module: ModuleDescriptor defined in org.jetbrains.kotlin.context.ModuleContext[DeserializedPropertyDescriptor]

'getModuleKind' @ [65:93] ==> private final fun getModuleKind(ktFiles: List<KtFile>): ModuleKind defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib[SimpleFunctionDescriptorImpl]

'files' @ [65:107] ==> value-parameter files: List<KtFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.analyzeModuleContents[ValueParameterDescriptorImpl]

'TopDownAnalyzerFacadeForJS' @ [66:16] ==> public object TopDownAnalyzerFacadeForJS defined in org.jetbrains.kotlin.js.analyze[FakeCallableDescriptorForObject]

'analyzeFilesWithGivenTrace' @ [66:43] ==> @JvmStatic public final fun analyzeFilesWithGivenTrace(files: Collection<KtFile>, trace: BindingTrace, moduleContext: ModuleContext, config: JsConfig): JsAnalysisResult defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS[DeserializedSimpleFunctionDescriptor]

'files' @ [66:70] ==> value-parameter files: List<KtFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.analyzeModuleContents[ValueParameterDescriptorImpl]

'moduleTrace' @ [66:77] ==> value-parameter moduleTrace: BindingTrace defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.analyzeModuleContents[ValueParameterDescriptorImpl]

'moduleContext' @ [66:90] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.analyzeModuleContents[ValueParameterDescriptorImpl]

'config' @ [66:105] ==> protected final val config: JsConfig defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib[PropertyDescriptorImpl]

'PLAIN' @ [70:31] ==> enum entry PLAIN defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'ktFiles' @ [71:22] ==> value-parameter ktFiles: List<KtFile> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.getModuleKind[ValueParameterDescriptorImpl]

'file' @ [72:24] ==> val file: KtFile defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.getModuleKind[LocalVariableDescriptor]

'text' @ [72:29] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'iterator' @ [73:30] ==> public final operator fun iterator(): Iterator<(String..String?)> defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'splitByLines' @ [73:41] ==> @NotNull @Contract public open fun splitByLines(@NotNull p0: String): (Array<(String..String?)>..Array<out (String..String?)>) defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'text' @ [73:54] ==> val text: (String..String?) defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.getModuleKind[LocalVariableDescriptor]

'textLine' @ [74:28] ==> val textLine: (String..String?) defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.getModuleKind[LocalVariableDescriptor]

'trim' @ [74:37] ==> public inline fun String.trim(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [74:44] ==> value-parameter it: Char defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.getModuleKind.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [75:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'line' @ [75:22] ==> var line: String defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.getModuleKind[LocalVariableDescriptor]

'startsWith' @ [75:27] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'line' @ [76:17] ==> var line: String defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.getModuleKind[LocalVariableDescriptor]

'line' @ [76:24] ==> var line: String defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.getModuleKind[LocalVariableDescriptor]

'substring' @ [76:29] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trim' @ [76:42] ==> public inline fun String.trim(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [76:49] ==> value-parameter it: Char defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.getModuleKind.<anonymous>[ValueParameterDescriptorImpl]

'split' @ [77:40] ==> @NotNull @Contract public open fun split(@NotNull p0: String, @NotNull p1: String): (MutableList<(String..String?)>..List<(String..String?)>) defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'line' @ [77:46] ==> var line: String defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.getModuleKind[LocalVariableDescriptor]

'parts' @ [78:21] ==> val parts: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.getModuleKind[LocalVariableDescriptor]

'size' @ [78:27] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'parts' @ [80:21] ==> val parts: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.getModuleKind[LocalVariableDescriptor]

'trim' @ [80:30] ==> public inline fun String.trim(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [80:37] ==> value-parameter it: Char defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.getModuleKind.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [81:17] ==> var kind: ModuleKind defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.getModuleKind[LocalVariableDescriptor]

'valueOf' @ [81:35] ==> public final fun valueOf(value: String): ModuleKind defined in org.jetbrains.kotlin.serialization.js.ModuleKind[SimpleFunctionDescriptorImpl]

'parts' @ [81:43] ==> val parts: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.getModuleKind[LocalVariableDescriptor]

'trim' @ [81:52] ==> public inline fun String.trim(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [81:59] ==> value-parameter it: Char defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.getModuleKind.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [85:16] ==> var kind: ModuleKind defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.getModuleKind[LocalVariableDescriptor]

'config' @ [89:13] ==> protected final val config: JsConfig defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib[PropertyDescriptorImpl]

'moduleDescriptors' @ [89:20] ==> public final val JsConfig.moduleDescriptors: (MutableList<(JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>..JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>?)>..List<(JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>..JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>?)>)[MyPropertyDescriptor]

'map' @ [89:38] ==> public inline fun <T, R> Iterable<(JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>..JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>?)>.map(transform: ((JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>..JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>?)) -> (ModuleDescriptorImpl..ModuleDescriptorImpl?)): List<(ModuleDescriptorImpl..ModuleDescriptorImpl?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.js.JsModuleDescriptor<(org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl..org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl?)>..org.jetbrains.kotlin.serialization.js.JsModuleDescriptor<(org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl..org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl?)>?)
    <R> -> (org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl..org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl?)

'it' @ [89:44] ==> value-parameter it: (JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>..JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>?) defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.getAdditionalDependencies.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [89:47] ==> public final val data: (ModuleDescriptorImpl..ModuleDescriptorImpl?) defined in org.jetbrains.kotlin.serialization.js.JsModuleDescriptor[DeserializedPropertyDescriptor]

'ModuleDescriptorImpl' @ [94:13] ==> @JvmOverloads public constructor ModuleDescriptorImpl(moduleName: Name, storageManager: StorageManager, builtIns: KotlinBuiltIns, multiTargetPlatform: MultiTargetPlatform? = ..., capabilities: Map<ModuleDescriptor.Capability<*>, Any?> = ...) defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedClassConstructorDescriptor]

'special' @ [94:39] ==> @NotNull public open fun special(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'moduleName' @ [94:50] ==> value-parameter moduleName: String defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.createModule[ValueParameterDescriptorImpl]

'storageManager' @ [94:65] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.createModule[ValueParameterDescriptorImpl]

'builtIns' @ [94:92] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.js.resolve.JsPlatform[DeserializedPropertyDescriptor]

'createModule' @ [97:22] ==> protected open fun createModule(moduleName: String, storageManager: StorageManager): ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib[SimpleFunctionDescriptorImpl]

'storageManager' @ [97:60] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.createSealedModule[ValueParameterDescriptorImpl]

'ArrayList' @ [99:28] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ModuleDescriptorImpl

'dependencies' @ [100:9] ==> val dependencies: ArrayList<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.createSealedModule[LocalVariableDescriptor]

'add' @ [100:22] ==> public open fun add(element: ModuleDescriptorImpl): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'module' @ [100:26] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.createSealedModule[LocalVariableDescriptor]

'dependencies' @ [102:9] ==> val dependencies: ArrayList<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.createSealedModule[LocalVariableDescriptor]

'addAll' @ [102:22] ==> public open fun addAll(elements: Collection<ModuleDescriptorImpl>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'getAdditionalDependencies' @ [102:29] ==> protected open fun getAdditionalDependencies(module: ModuleDescriptorImpl): List<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib[SimpleFunctionDescriptorImpl]

'module' @ [102:55] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.createSealedModule[LocalVariableDescriptor]

'dependencies' @ [104:9] ==> val dependencies: ArrayList<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.createSealedModule[LocalVariableDescriptor]

'add' @ [104:22] ==> public open fun add(element: ModuleDescriptorImpl): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'module' @ [104:26] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.createSealedModule[LocalVariableDescriptor]

'builtIns' @ [104:33] ==> public open val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedPropertyDescriptor]

'builtInsModule' @ [104:42] ==> public final var KotlinBuiltIns.builtInsModule: ModuleDescriptorImpl[MyPropertyDescriptor]

'module' @ [105:9] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.createSealedModule[LocalVariableDescriptor]

'setDependencies' @ [105:16] ==> public final fun setDependencies(descriptors: List<ModuleDescriptorImpl>): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'dependencies' @ [105:32] ==> val dependencies: ArrayList<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.createSealedModule[LocalVariableDescriptor]

'module' @ [107:16] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.checkers.AbstractDiagnosticsTestWithJsStdLib.createSealedModule[LocalVariableDescriptor]

