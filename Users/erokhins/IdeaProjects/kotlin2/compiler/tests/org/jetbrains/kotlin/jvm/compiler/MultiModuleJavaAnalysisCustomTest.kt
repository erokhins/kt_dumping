'KtUsefulTestCase' @ [54:43] ==> public constructor KtUsefulTestCase() defined in org.jetbrains.kotlin.test.testFramework.KtUsefulTestCase[JavaClassConstructorDescriptor]

'invoke' @ [60:39] ==> public abstract operator fun MultiModuleJavaAnalysisCustomTest.TestModule.invoke(): List<MultiModuleJavaAnalysisCustomTest.TestModule> defined in kotlin.Function1[FunctionInvokeDescriptor]

'special' @ [61:34] ==> @NotNull public open fun special(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'_name' @ [61:45] ==> public final val _name: String defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.TestModule[PropertyDescriptorImpl]

'File' @ [65:26] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'PATH_TO_TEST_ROOT_DIR' @ [65:31] ==> public final val PATH_TO_TEST_ROOT_DIR: String defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.Companion[PropertyDescriptorImpl]

'listFiles' @ [65:54] ==> public final fun listFiles(p0: (((File..File?)) -> Boolean..(((File..File?)) -> Boolean)?)): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[MyFunctionDescriptor]

'it' @ [65:72] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule.<anonymous>[ValueParameterDescriptorImpl]

'isDirectory' @ [65:75] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'createEnvironment' @ [66:27] ==> private final fun createEnvironment(moduleDirs: Array<File>): KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest[SimpleFunctionDescriptorImpl]

'moduleDirs' @ [66:45] ==> val moduleDirs: (Array<(File..File?)>..Array<out (File..File?)>) defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule[LocalVariableDescriptor]

'setupModules' @ [67:23] ==> private final fun setupModules(environment: KotlinCoreEnvironment, moduleDirs: Array<File>): List<MultiModuleJavaAnalysisCustomTest.TestModule> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest[SimpleFunctionDescriptorImpl]

'environment' @ [67:36] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule[LocalVariableDescriptor]

'moduleDirs' @ [67:49] ==> val moduleDirs: (Array<(File..File?)>..Array<out (File..File?)>) defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule[LocalVariableDescriptor]

'ProjectContext' @ [68:30] ==> public fun ProjectContext(project: Project): ProjectContext defined in org.jetbrains.kotlin.context[DeserializedSimpleFunctionDescriptor]

'environment' @ [68:45] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule[LocalVariableDescriptor]

'project' @ [68:57] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'JvmBuiltIns' @ [69:24] ==> @JvmOverloads public constructor JvmBuiltIns(storageManager: StorageManager, loadBuiltInsFromCurrentClassLoader: Boolean = ...) defined in org.jetbrains.kotlin.platform.JvmBuiltIns[DeserializedClassConstructorDescriptor]

'projectContext' @ [69:36] ==> val projectContext: ProjectContext defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule[LocalVariableDescriptor]

'storageManager' @ [69:51] ==> public abstract val storageManager: StorageManager defined in org.jetbrains.kotlin.context.ProjectContext[DeserializedPropertyDescriptor]

'ResolverForProjectImpl' @ [70:34] ==> public constructor ResolverForProjectImpl<M : ModuleInfo>(debugName: String, projectContext: ProjectContext, modules: Collection<MultiModuleJavaAnalysisCustomTest.TestModule>, analyzerFacade: (MultiModuleJavaAnalysisCustomTest.TestModule) -> AnalyzerFacade, modulesContent: (MultiModuleJavaAnalysisCustomTest.TestModule) -> ModuleContent, platformParameters: PlatformAnalysisParameters, targetEnvironment: TargetEnvironment = ..., builtIns: KotlinBuiltIns = ..., delegateResolver: ResolverForProject<MultiModuleJavaAnalysisCustomTest.TestModule> = ..., packagePartProviderFactory: (MultiModuleJavaAnalysisCustomTest.TestModule, ModuleContent) -> PackagePartProvider = ..., firstDependency: MultiModuleJavaAnalysisCustomTest.TestModule? = ..., modulePlatforms: (MultiModuleJavaAnalysisCustomTest.TestModule) -> MultiTargetPlatform?, packageOracleFactory: PackageOracleFactory = ..., languageSettingsProvider: LanguageSettingsProvider = ..., invalidateOnOOCB: Boolean = ...) defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[DeserializedClassConstructorDescriptor]
Inferred types:
    <M : ModuleInfo> -> TestModule

'projectContext' @ [72:17] ==> val projectContext: ProjectContext defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule[LocalVariableDescriptor]

'modules' @ [72:33] ==> val modules: List<MultiModuleJavaAnalysisCustomTest.TestModule> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule[LocalVariableDescriptor]

'JvmAnalyzerFacade' @ [72:44] ==> public object JvmAnalyzerFacade : AnalyzerFacade defined in org.jetbrains.kotlin.resolve.jvm[FakeCallableDescriptorForObject]

'ModuleContent' @ [73:29] ==> public constructor ModuleContent(syntheticFiles: Collection<KtFile>, moduleContentScope: GlobalSearchScope) defined in org.jetbrains.kotlin.analyzer.ModuleContent[DeserializedClassConstructorDescriptor]

'module' @ [73:43] ==> value-parameter module: MultiModuleJavaAnalysisCustomTest.TestModule defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule.<anonymous>[ValueParameterDescriptorImpl]

'kotlinFiles' @ [73:50] ==> public final val kotlinFiles: List<KtFile> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.TestModule[PropertyDescriptorImpl]

'module' @ [73:63] ==> value-parameter module: MultiModuleJavaAnalysisCustomTest.TestModule defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule.<anonymous>[ValueParameterDescriptorImpl]

'javaFilesScope' @ [73:70] ==> public final val javaFilesScope: GlobalSearchScope defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.TestModule[PropertyDescriptorImpl]

'JvmPlatformParameters' @ [74:17] ==> public constructor JvmPlatformParameters(moduleByJavaClass: (JavaClass) -> ModuleInfo?) defined in org.jetbrains.kotlin.resolve.jvm.JvmPlatformParameters[DeserializedClassConstructorDescriptor]

'javaClass' @ [76:38] ==> value-parameter javaClass: JavaClass defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [76:48] ==> public abstract val name: Name defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'asString' @ [76:53] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'toLowerCase' @ [76:64] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'first' @ [76:78] ==> public fun CharSequence.first(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toString' @ [76:86] ==> public open fun toString(): String defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'modules' @ [77:21] ==> val modules: List<MultiModuleJavaAnalysisCustomTest.TestModule> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule[LocalVariableDescriptor]

'first' @ [77:29] ==> public inline fun <T> Iterable<MultiModuleJavaAnalysisCustomTest.TestModule>.first(predicate: (MultiModuleJavaAnalysisCustomTest.TestModule) -> Boolean): MultiModuleJavaAnalysisCustomTest.TestModule defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestModule

'it' @ [77:37] ==> value-parameter it: MultiModuleJavaAnalysisCustomTest.TestModule defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'_name' @ [77:40] ==> public final val _name: String defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.TestModule[PropertyDescriptorImpl]

'moduleName' @ [77:49] ==> val moduleName: String defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule.<anonymous>[LocalVariableDescriptor]

'builtIns' @ [79:28] ==> val builtIns: JvmBuiltIns defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule[LocalVariableDescriptor]

'MultiTargetPlatform' @ [80:37] ==> public companion object defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'Specific' @ [80:57] ==> public constructor Specific(platform: String) defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform.Specific[DeserializedClassConstructorDescriptor]

'builtIns' @ [83:9] ==> val builtIns: JvmBuiltIns defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule[LocalVariableDescriptor]

'initialize' @ [83:18] ==> public final fun initialize(moduleDescriptor: ModuleDescriptor, isAdditionalBuiltInsFeatureSupported: Boolean): Unit defined in org.jetbrains.kotlin.platform.JvmBuiltIns[DeserializedSimpleFunctionDescriptor]

'resolverForProject' @ [84:17] ==> val resolverForProject: ResolverForProjectImpl<MultiModuleJavaAnalysisCustomTest.TestModule> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule[LocalVariableDescriptor]

'descriptorForModule' @ [84:36] ==> public open fun descriptorForModule(moduleInfo: MultiModuleJavaAnalysisCustomTest.TestModule): ModuleDescriptorImpl defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[DeserializedSimpleFunctionDescriptor]

'resolverForProject' @ [84:56] ==> val resolverForProject: ResolverForProjectImpl<MultiModuleJavaAnalysisCustomTest.TestModule> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule[LocalVariableDescriptor]

'allModules' @ [84:75] ==> public open val allModules: Collection<MultiModuleJavaAnalysisCustomTest.TestModule> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[DeserializedPropertyDescriptor]

'first' @ [84:86] ==> public fun <T> Iterable<MultiModuleJavaAnalysisCustomTest.TestModule>.first(): MultiModuleJavaAnalysisCustomTest.TestModule defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestModule

'resolverForProject' @ [85:17] ==> val resolverForProject: ResolverForProjectImpl<MultiModuleJavaAnalysisCustomTest.TestModule> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule[LocalVariableDescriptor]

'resolverForModule' @ [85:36] ==> public final fun resolverForModule(moduleInfo: MultiModuleJavaAnalysisCustomTest.TestModule): ResolverForModule defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[DeserializedSimpleFunctionDescriptor]

'resolverForProject' @ [85:54] ==> val resolverForProject: ResolverForProjectImpl<MultiModuleJavaAnalysisCustomTest.TestModule> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule[LocalVariableDescriptor]

'allModules' @ [85:73] ==> public open val allModules: Collection<MultiModuleJavaAnalysisCustomTest.TestModule> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[DeserializedPropertyDescriptor]

'first' @ [85:84] ==> public fun <T> Iterable<MultiModuleJavaAnalysisCustomTest.TestModule>.first(): MultiModuleJavaAnalysisCustomTest.TestModule defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestModule

'componentProvider' @ [86:26] ==> public final val componentProvider: ComponentProvider defined in org.jetbrains.kotlin.analyzer.ResolverForModule[DeserializedPropertyDescriptor]

'get' @ [86:44] ==> public inline fun <reified T : Any> ComponentProvider.get(): LanguageVersionSettings defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> LanguageVersionSettings

'supportsFeature' @ [87:26] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'AdditionalBuiltInsMembers' @ [87:58] ==> enum entry AdditionalBuiltInsMembers defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'performChecks' @ [89:9] ==> private final fun performChecks(resolverForProject: ResolverForProject<MultiModuleJavaAnalysisCustomTest.TestModule>, modules: List<MultiModuleJavaAnalysisCustomTest.TestModule>): Unit defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest[SimpleFunctionDescriptorImpl]

'resolverForProject' @ [89:23] ==> val resolverForProject: ResolverForProjectImpl<MultiModuleJavaAnalysisCustomTest.TestModule> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule[LocalVariableDescriptor]

'modules' @ [89:43] ==> val modules: List<MultiModuleJavaAnalysisCustomTest.TestModule> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.testJavaEntitiesBelongToCorrectModule[LocalVariableDescriptor]

'newConfiguration' @ [94:33] ==> @NotNull public open fun newConfiguration(@NotNull p0: ConfigurationKind, @NotNull p1: TestJdkKind, @NotNull p2: (MutableList<(File..File?)>..List<(File..File?)>), @NotNull p3: (MutableList<(File..File?)>..List<(File..File?)>)): CompilerConfiguration defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'JDK_ONLY' @ [94:68] ==> enum entry JDK_ONLY defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'MOCK_JDK' @ [94:90] ==> enum entry MOCK_JDK defined in org.jetbrains.kotlin.test.TestJdkKind[FakeCallableDescriptorForObject]

'emptyList' @ [94:100] ==> public fun <T> emptyList(): List<(File..File?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'moduleDirs' @ [94:113] ==> value-parameter moduleDirs: Array<File> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.createEnvironment[ValueParameterDescriptorImpl]

'toList' @ [94:124] ==> public fun <T> Array<out File>.toList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'KotlinCoreEnvironment' @ [95:16] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'createForTests' @ [95:38] ==> @JvmStatic public final fun createForTests(parentDisposable: Disposable, configuration: CompilerConfiguration, extensionConfigs: EnvironmentConfigFiles): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[DeserializedSimpleFunctionDescriptor]

'testRootDisposable' @ [95:53] ==> public final val MultiModuleJavaAnalysisCustomTest.testRootDisposable: Disposable[MyPropertyDescriptor]

'configuration' @ [95:73] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.createEnvironment[LocalVariableDescriptor]

'JVM_CONFIG_FILES' @ [95:111] ==> enum entry JVM_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'environment' @ [99:23] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules[ValueParameterDescriptorImpl]

'project' @ [99:35] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'HashMap' @ [100:23] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> TestModule

'moduleDirs' @ [101:21] ==> value-parameter moduleDirs: Array<File> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules[ValueParameterDescriptorImpl]

'dir' @ [102:24] ==> val dir: File defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules[LocalVariableDescriptor]

'name' @ [102:28] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'loadToJetFiles' @ [103:47] ==> @NotNull public open fun loadToJetFiles(@NotNull p0: KotlinCoreEnvironment, @NotNull p1: (MutableList<(File..File?)>..List<(File..File?)>)): (MutableList<(KtFile..KtFile?)>..List<(KtFile..KtFile?)>) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'environment' @ [103:62] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules[ValueParameterDescriptorImpl]

'dir' @ [103:75] ==> val dir: File defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules[LocalVariableDescriptor]

'listFiles' @ [103:79] ==> public final fun listFiles(p0: (((File..File?)) -> Boolean..(((File..File?)) -> Boolean)?)): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[MyFunctionDescriptor]

'it' @ [103:97] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules.<anonymous>[ValueParameterDescriptorImpl]

'extension' @ [103:100] ==> public val File.extension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'toList' @ [103:121] ==> public fun <T> Array<out (File..File?)>.toList(): List<(File..File?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'orEmpty' @ [103:130] ==> @InlineOnly public inline fun <T> List<(File..File?)>?.orEmpty(): List<(File..File?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'DelegatingGlobalSearchScope' @ [104:43] ==> public constructor DelegatingGlobalSearchScope(@NotNull p0: GlobalSearchScope) defined in com.intellij.psi.search.DelegatingGlobalSearchScope[JavaClassConstructorDescriptor]

'allScope' @ [104:89] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [104:98] ==> val project: Project defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules[LocalVariableDescriptor]

'file' @ [106:25] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules.<no name provided>.contains[ValueParameterDescriptorImpl]

'myBaseScope' @ [106:34] ==> protected/*protected and package*/ final val myBaseScope: (GlobalSearchScope..GlobalSearchScope?) defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules.<no name provided>[JavaPropertyDescriptor]

'file' @ [107:25] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules.<no name provided>.contains[ValueParameterDescriptorImpl]

'isDirectory' @ [107:30] ==> public final val VirtualFile.isDirectory: Boolean[MyPropertyDescriptor]

'file' @ [108:28] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules.<no name provided>.contains[ValueParameterDescriptorImpl]

'parent' @ [108:33] ==> public final val VirtualFile.parent: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'parent' @ [108:42] ==> public final val VirtualFile.parent: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'name' @ [108:51] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'name' @ [108:59] ==> val name: (String..String?) defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules[LocalVariableDescriptor]

'modules' @ [111:13] ==> val modules: HashMap<String, MultiModuleJavaAnalysisCustomTest.TestModule> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules[LocalVariableDescriptor]

'name' @ [111:21] ==> val name: (String..String?) defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules[LocalVariableDescriptor]

'TestModule' @ [111:29] ==> public constructor TestModule(_name: String, kotlinFiles: List<KtFile>, javaFilesScope: GlobalSearchScope, _dependencies: MultiModuleJavaAnalysisCustomTest.TestModule.() -> List<MultiModuleJavaAnalysisCustomTest.TestModule>) defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.TestModule[ClassConstructorDescriptorImpl]

'name' @ [111:40] ==> val name: (String..String?) defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules[LocalVariableDescriptor]

'kotlinFiles' @ [111:46] ==> val kotlinFiles: (MutableList<(KtFile..KtFile?)>..List<(KtFile..KtFile?)>) defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules[LocalVariableDescriptor]

'javaFilesScope' @ [111:59] ==> val javaFilesScope: <no name provided> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules[LocalVariableDescriptor]

'when (this._name) {
                    "a" -> listOf(this)
                    "b" -> listOf(this, modules["a"]!!)
                    "c" -> listOf(this, modules["b"]!!, modules["a"]!!)
                    else -> throw IllegalStateException(_name)
                }' @ [112:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<MultiModuleJavaAnalysisCustomTest.TestModule>, entry1: List<MultiModuleJavaAnalysisCustomTest.TestModule>, entry2: List<MultiModuleJavaAnalysisCustomTest.TestModule>, entry3: List<MultiModuleJavaAnalysisCustomTest.TestModule>): List<MultiModuleJavaAnalysisCustomTest.TestModule>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<TestModule>

'this' @ [112:23] ==> <this> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules.<anonymous>[ReceiverParameterDescriptorImpl]

'_name' @ [112:28] ==> public final val _name: String defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.TestModule[PropertyDescriptorImpl]

'listOf' @ [113:28] ==> public fun <T> listOf(element: MultiModuleJavaAnalysisCustomTest.TestModule): List<MultiModuleJavaAnalysisCustomTest.TestModule> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestModule

'this' @ [113:35] ==> <this> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules.<anonymous>[ReceiverParameterDescriptorImpl]

'listOf' @ [114:28] ==> public fun <T> listOf(vararg elements: MultiModuleJavaAnalysisCustomTest.TestModule): List<MultiModuleJavaAnalysisCustomTest.TestModule> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestModule

'this' @ [114:35] ==> <this> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules.<anonymous>[ReceiverParameterDescriptorImpl]

'modules' @ [114:41] ==> val modules: HashMap<String, MultiModuleJavaAnalysisCustomTest.TestModule> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules[LocalVariableDescriptor]

'listOf' @ [115:28] ==> public fun <T> listOf(vararg elements: MultiModuleJavaAnalysisCustomTest.TestModule): List<MultiModuleJavaAnalysisCustomTest.TestModule> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestModule

'this' @ [115:35] ==> <this> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules.<anonymous>[ReceiverParameterDescriptorImpl]

'modules' @ [115:41] ==> val modules: HashMap<String, MultiModuleJavaAnalysisCustomTest.TestModule> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules[LocalVariableDescriptor]

'modules' @ [115:57] ==> val modules: HashMap<String, MultiModuleJavaAnalysisCustomTest.TestModule> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules[LocalVariableDescriptor]

'IllegalStateException' @ [116:35] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'_name' @ [116:57] ==> public final val _name: String defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.TestModule[PropertyDescriptorImpl]

'modules' @ [120:16] ==> val modules: HashMap<String, MultiModuleJavaAnalysisCustomTest.TestModule> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.setupModules[LocalVariableDescriptor]

'values' @ [120:24] ==> public open val values: MutableCollection<MultiModuleJavaAnalysisCustomTest.TestModule> defined in java.util.HashMap[JavaPropertyDescriptor]

'toList' @ [120:31] ==> public fun <T> Iterable<MultiModuleJavaAnalysisCustomTest.TestModule>.toList(): List<MultiModuleJavaAnalysisCustomTest.TestModule> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestModule

'modules' @ [124:9] ==> value-parameter modules: List<MultiModuleJavaAnalysisCustomTest.TestModule> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.performChecks[ValueParameterDescriptorImpl]

'forEach' @ [124:17] ==> @HidesMembers public inline fun <T> Iterable<MultiModuleJavaAnalysisCustomTest.TestModule>.forEach(action: (MultiModuleJavaAnalysisCustomTest.TestModule) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestModule

'resolverForProject' @ [126:36] ==> value-parameter resolverForProject: ResolverForProject<MultiModuleJavaAnalysisCustomTest.TestModule> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.performChecks[ValueParameterDescriptorImpl]

'descriptorForModule' @ [126:55] ==> public abstract fun descriptorForModule(moduleInfo: MultiModuleJavaAnalysisCustomTest.TestModule): ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.ResolverForProject[DeserializedSimpleFunctionDescriptor]

'module' @ [126:75] ==> value-parameter module: MultiModuleJavaAnalysisCustomTest.TestModule defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.performChecks.<anonymous>[ValueParameterDescriptorImpl]

'checkClassInPackage' @ [128:13] ==> private final fun checkClassInPackage(moduleDescriptor: ModuleDescriptor, packageName: String, className: String): Unit defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest[SimpleFunctionDescriptorImpl]

'moduleDescriptor' @ [128:33] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.performChecks.<anonymous>[LocalVariableDescriptor]

'module' @ [128:68] ==> value-parameter module: MultiModuleJavaAnalysisCustomTest.TestModule defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.performChecks.<anonymous>[ValueParameterDescriptorImpl]

'_name' @ [128:75] ==> public final val _name: String defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.TestModule[PropertyDescriptorImpl]

'toUpperCase' @ [128:81] ==> @InlineOnly public inline fun String.toUpperCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'checkClassInPackage' @ [129:13] ==> private final fun checkClassInPackage(moduleDescriptor: ModuleDescriptor, packageName: String, className: String): Unit defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest[SimpleFunctionDescriptorImpl]

'moduleDescriptor' @ [129:33] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.performChecks.<anonymous>[LocalVariableDescriptor]

'module' @ [129:64] ==> value-parameter module: MultiModuleJavaAnalysisCustomTest.TestModule defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.performChecks.<anonymous>[ValueParameterDescriptorImpl]

'_name' @ [129:71] ==> public final val _name: String defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.TestModule[PropertyDescriptorImpl]

'toUpperCase' @ [129:77] ==> @InlineOnly public inline fun String.toUpperCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'moduleDescriptor' @ [134:29] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkClassInPackage[ValueParameterDescriptorImpl]

'getPackage' @ [134:46] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'FqName' @ [134:57] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'packageName' @ [134:64] ==> value-parameter packageName: String defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkClassInPackage[ValueParameterDescriptorImpl]

'identifier' @ [135:36] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'className' @ [135:47] ==> value-parameter className: String defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkClassInPackage[ValueParameterDescriptorImpl]

'kotlinPackage' @ [136:27] ==> val kotlinPackage: PackageViewDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkClassInPackage[LocalVariableDescriptor]

'memberScope' @ [136:41] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'getContributedClassifier' @ [136:53] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'kotlinClassName' @ [136:78] ==> val kotlinClassName: Name defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkClassInPackage[LocalVariableDescriptor]

'FROM_TEST' @ [136:112] ==> enum entry FROM_TEST defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'checkClass' @ [137:9] ==> private final fun checkClass(classDescriptor: ClassDescriptor): Unit defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest[SimpleFunctionDescriptorImpl]

'kotlinClass' @ [137:20] ==> val kotlinClass: ClassDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkClassInPackage[LocalVariableDescriptor]

'classDescriptor' @ [141:9] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkClass[ValueParameterDescriptorImpl]

'defaultType' @ [141:25] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'memberScope' @ [141:37] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'getContributedDescriptors' @ [141:49] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'filterIsInstance' @ [141:77] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<CallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> CallableDescriptor

'forEach' @ [141:116] ==> @HidesMembers public inline fun <T> Iterable<CallableDescriptor>.forEach(action: (CallableDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'checkCallable' @ [142:13] ==> private final fun checkCallable(callable: CallableDescriptor): Unit defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest[SimpleFunctionDescriptorImpl]

'it' @ [142:27] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkClass.<anonymous>[ValueParameterDescriptorImpl]

'checkSupertypes' @ [145:9] ==> private final fun checkSupertypes(classDescriptor: ClassDescriptor): Unit defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [145:25] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkClass[ValueParameterDescriptorImpl]

'callable' @ [149:20] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable[ValueParameterDescriptorImpl]

'name' @ [149:29] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [149:34] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [150:13] ==> val name: String defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable[LocalVariableDescriptor]

'setOf' @ [150:21] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'callable' @ [152:26] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable[ValueParameterDescriptorImpl]

'returnType' @ [152:35] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'!' @ [153:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUnit' @ [153:29] ==> public open fun isUnit(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'returnType' @ [153:36] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable[LocalVariableDescriptor]

'checkDescriptor' @ [154:13] ==> private final fun checkDescriptor(referencedDescriptor: ClassifierDescriptor, context: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest[SimpleFunctionDescriptorImpl]

'returnType' @ [154:29] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable[LocalVariableDescriptor]

'constructor' @ [154:40] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [154:52] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'callable' @ [154:77] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable[ValueParameterDescriptorImpl]

'callable' @ [157:9] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable[ValueParameterDescriptorImpl]

'valueParameters' @ [157:18] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [157:34] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> ClassifierDescriptor): List<ClassifierDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> ClassifierDescriptor

'it' @ [158:13] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [158:16] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [158:21] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [158:33] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'forEach' @ [159:11] ==> @HidesMembers public inline fun <T> Iterable<ClassifierDescriptor>.forEach(action: (ClassifierDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor

'checkDescriptor' @ [159:21] ==> private final fun checkDescriptor(referencedDescriptor: ClassifierDescriptor, context: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest[SimpleFunctionDescriptorImpl]

'it' @ [159:37] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable.<anonymous>[ValueParameterDescriptorImpl]

'callable' @ [159:41] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable[ValueParameterDescriptorImpl]

'callable' @ [161:9] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable[ValueParameterDescriptorImpl]

'annotations' @ [161:18] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[DeserializedPropertyDescriptor]

'forEach' @ [161:30] ==> @HidesMembers public inline fun <T> Iterable<AnnotationDescriptor>.forEach(action: (AnnotationDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'it' @ [162:45] ==> value-parameter it: AnnotationDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable.<anonymous>[ValueParameterDescriptorImpl]

'annotationClass' @ [162:48] ==> public val AnnotationDescriptor.annotationClass: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'checkDescriptor' @ [163:13] ==> private final fun checkDescriptor(referencedDescriptor: ClassifierDescriptor, context: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest[SimpleFunctionDescriptorImpl]

'annotationClassDescriptor' @ [163:29] ==> val annotationClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable.<anonymous>[LocalVariableDescriptor]

'callable' @ [163:56] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable[ValueParameterDescriptorImpl]

'assertEquals' @ [165:20] ==> public open fun assertEquals(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'callable' @ [166:97] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable[ValueParameterDescriptorImpl]

'annotationClassDescriptor' @ [167:21] ==> val annotationClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable.<anonymous>[LocalVariableDescriptor]

'constructors' @ [167:47] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'single' @ [167:60] ==> public fun <T> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.single(): (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'valueParameters' @ [167:69] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [167:85] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'it' @ [167:91] ==> value-parameter it: AnnotationDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable.<anonymous>[ValueParameterDescriptorImpl]

'allValueArguments' @ [167:94] ==> public abstract val allValueArguments: Map<Name, ConstantValue<*>> defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'size' @ [167:112] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'it' @ [169:13] ==> value-parameter it: AnnotationDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable.<anonymous>[ValueParameterDescriptorImpl]

'allValueArguments' @ [169:16] ==> public abstract val allValueArguments: Map<Name, ConstantValue<*>> defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'forEach' @ [169:34] ==> @HidesMembers public inline fun <K, V> Map<out Name, ConstantValue<*>>.forEach(action: (Map.Entry<Name, ConstantValue<*>>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> ConstantValue<*>

'it' @ [170:32] ==> value-parameter it: Map.Entry<Name, ConstantValue<*>> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [170:35] ==> public abstract val value: ConstantValue<*> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'argument' @ [171:21] ==> val argument: ConstantValue<*> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable.<anonymous>.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [172:28] ==> public open fun assertEquals(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'argument' @ [172:90] ==> val argument: ConstantValue<*> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable.<anonymous>.<anonymous>[LocalVariableDescriptor]

'value' @ [172:99] ==> public open val value: ClassDescriptor defined in org.jetbrains.kotlin.resolve.constants.EnumValue[DeserializedPropertyDescriptor]

'name' @ [172:105] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'identifier' @ [172:110] ==> public final val Name.identifier: String[MyPropertyDescriptor]

'last' @ [172:121] ==> public fun CharSequence.last(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toString' @ [172:128] ==> public open fun toString(): String defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'checkDescriptor' @ [173:21] ==> private final fun checkDescriptor(referencedDescriptor: ClassifierDescriptor, context: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest[SimpleFunctionDescriptorImpl]

'argument' @ [173:37] ==> val argument: ConstantValue<*> defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable.<anonymous>.<anonymous>[LocalVariableDescriptor]

'value' @ [173:46] ==> public open val value: ClassDescriptor defined in org.jetbrains.kotlin.resolve.constants.EnumValue[DeserializedPropertyDescriptor]

'callable' @ [173:53] ==> value-parameter callable: CallableDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkCallable[ValueParameterDescriptorImpl]

'classDescriptor' @ [180:9] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkSupertypes[ValueParameterDescriptorImpl]

'defaultType' @ [180:25] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'constructor' @ [180:37] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'supertypes' @ [180:49] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'filter' @ [180:60] ==> public inline fun <T> Iterable<(KotlinType..KotlinType?)>.filter(predicate: ((KotlinType..KotlinType?)) -> Boolean): List<(KotlinType..KotlinType?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'!' @ [181:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAnyOrNullableAny' @ [181:29] ==> public open fun isAnyOrNullableAny(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'it' @ [181:48] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkSupertypes.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [182:11] ==> public inline fun <T, R> Iterable<(KotlinType..KotlinType?)>.map(transform: ((KotlinType..KotlinType?)) -> ClassifierDescriptor): List<ClassifierDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> ClassifierDescriptor

'it' @ [183:13] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkSupertypes.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [183:16] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [183:28] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'forEach' @ [184:11] ==> @HidesMembers public inline fun <T> Iterable<ClassifierDescriptor>.forEach(action: (ClassifierDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor

'checkDescriptor' @ [185:13] ==> private final fun checkDescriptor(referencedDescriptor: ClassifierDescriptor, context: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest[SimpleFunctionDescriptorImpl]

'it' @ [185:29] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkSupertypes.<anonymous>[ValueParameterDescriptorImpl]

'classDescriptor' @ [185:33] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkSupertypes[ValueParameterDescriptorImpl]

'assert' @ [190:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [190:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isError' @ [190:28] ==> public open fun isError(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'referencedDescriptor' @ [190:36] ==> value-parameter referencedDescriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkDescriptor[ValueParameterDescriptorImpl]

'referencedDescriptor' @ [190:81] ==> value-parameter referencedDescriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkDescriptor[ValueParameterDescriptorImpl]

'referencedDescriptor' @ [192:30] ==> value-parameter referencedDescriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkDescriptor[ValueParameterDescriptorImpl]

'name' @ [192:51] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [192:56] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'descriptorName' @ [193:38] ==> val descriptorName: String defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkDescriptor[LocalVariableDescriptor]

'toLowerCase' @ [193:53] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'first' @ [193:67] ==> public fun CharSequence.first(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'referencedDescriptor' @ [194:26] ==> value-parameter referencedDescriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkDescriptor[ValueParameterDescriptorImpl]

'module' @ [194:47] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'name' @ [194:54] ==> public final val ModuleDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [194:59] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'assertEquals' @ [195:16] ==> public open fun assertEquals(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'descriptorName' @ [196:30] ==> val descriptorName: String defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkDescriptor[LocalVariableDescriptor]

'context' @ [196:49] ==> value-parameter context: DeclarationDescriptor defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkDescriptor[ValueParameterDescriptorImpl]

'expectedModuleName' @ [196:78] ==> val expectedModuleName: String defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkDescriptor[LocalVariableDescriptor]

'moduleName' @ [196:118] ==> val moduleName: String defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkDescriptor[LocalVariableDescriptor]

'expectedModuleName' @ [197:17] ==> val expectedModuleName: String defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkDescriptor[LocalVariableDescriptor]

'moduleName' @ [197:37] ==> val moduleName: String defined in org.jetbrains.kotlin.jvm.compiler.MultiModuleJavaAnalysisCustomTest.checkDescriptor[LocalVariableDescriptor]

