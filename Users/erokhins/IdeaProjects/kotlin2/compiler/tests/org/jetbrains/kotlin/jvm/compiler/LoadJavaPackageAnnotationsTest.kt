'KtUsefulTestCase' @ [37:40] ==> public constructor KtUsefulTestCase() defined in org.jetbrains.kotlin.test.testFramework.KtUsefulTestCase[JavaClassConstructorDescriptor]

'newConfiguration' @ [43:45] ==> @NotNull public open fun newConfiguration(@NotNull p0: ConfigurationKind, @NotNull p1: TestJdkKind, @NotNull vararg p2: (File..File?)): CompilerConfiguration defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'ALL' @ [44:35] ==> enum entry ALL defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'FULL_JDK' @ [44:52] ==> enum entry FULL_JDK defined in org.jetbrains.kotlin.test.TestJdkKind[FakeCallableDescriptorForObject]

'getAnnotationsJar' @ [44:78] ==> public open fun getAnnotationsJar(): (File..File?) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'apply' @ [45:11] ==> @InlineOnly public inline fun <T> CompilerConfiguration.apply(block: (CompilerConfiguration).() -> Unit): CompilerConfiguration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompilerConfiguration

'useJavac' @ [46:17] ==> value-parameter useJavac: Boolean defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.doTest[ValueParameterDescriptorImpl]

'put' @ [47:17] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'USE_JAVAC' @ [47:42] ==> public final val USE_JAVAC: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'languageVersionSettings' @ [49:13] ==> public var CompilerConfiguration.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.config[DeserializedPropertyDescriptor]

'LanguageVersionSettingsImpl' @ [49:39] ==> @JvmOverloads public constructor LanguageVersionSettingsImpl(languageVersion: LanguageVersion, apiVersion: ApiVersion, analysisFlags: Map<AnalysisFlag<*>, Any?> = ..., specificFeatures: Map<LanguageFeature, LanguageFeature.State> = ...) defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl[DeserializedClassConstructorDescriptor]

'LanguageVersion' @ [50:21] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'LATEST_STABLE' @ [50:37] ==> @field:JvmField public final val LATEST_STABLE: LanguageVersion defined in org.jetbrains.kotlin.config.LanguageVersion.Companion[DeserializedPropertyDescriptor]

'ApiVersion' @ [50:52] ==> public companion object defined in org.jetbrains.kotlin.config.ApiVersion[FakeCallableDescriptorForObject]

'LATEST_STABLE' @ [50:63] ==> @field:JvmField public final val LATEST_STABLE: ApiVersion defined in org.jetbrains.kotlin.config.ApiVersion.Companion[DeserializedPropertyDescriptor]

'mapOf' @ [50:78] ==> public fun <K, V> mapOf(pair: Pair<AnalysisFlag<*>, Jsr305State>): Map<AnalysisFlag<*>, Jsr305State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AnalysisFlag<*>
    <V> -> Jsr305State

'AnalysisFlag' @ [50:84] ==> public companion object Flags defined in org.jetbrains.kotlin.config.AnalysisFlag[FakeCallableDescriptorForObject]

'jsr305GlobalState' @ [50:97] ==> @JvmStatic public final val jsr305GlobalState: AnalysisFlag<Jsr305State> defined in org.jetbrains.kotlin.config.AnalysisFlag.Flags[DeserializedPropertyDescriptor]

'Jsr305State' @ [50:118] ==> public companion object defined in org.jetbrains.kotlin.utils.Jsr305State[FakeCallableDescriptorForObject]

'ENABLE' @ [50:130] ==> enum entry ENABLE defined in org.jetbrains.kotlin.utils.Jsr305State[FakeCallableDescriptorForObject]

'invoke' @ [52:13] ==> public abstract operator fun invoke(p1: CompilerConfiguration): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [52:26] ==> <this> defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.doTest.<anonymous>[ReceiverParameterDescriptorImpl]

'KotlinCoreEnvironment' @ [55:17] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'createForTests' @ [55:39] ==> @JvmStatic public final fun createForTests(parentDisposable: Disposable, configuration: CompilerConfiguration, extensionConfigs: EnvironmentConfigFiles): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[DeserializedSimpleFunctionDescriptor]

'myTestRootDisposable' @ [56:25] ==> @NotNull protected/*protected and package*/ final val myTestRootDisposable: Disposable defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest[JavaPropertyDescriptor]

'configuration' @ [57:25] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.doTest[LocalVariableDescriptor]

'JVM_CONFIG_FILES' @ [58:48] ==> enum entry JVM_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'apply' @ [59:19] ==> @InlineOnly public inline fun <T> KotlinCoreEnvironment.apply(block: KotlinCoreEnvironment.() -> Unit): KotlinCoreEnvironment defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCoreEnvironment

'useJavac' @ [60:25] ==> value-parameter useJavac: Boolean defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.doTest[ValueParameterDescriptorImpl]

'registerJavac' @ [61:25] ==> public final fun registerJavac(javaFiles: List<File> = ..., kotlinFiles: List<KtFile> = ..., arguments: Array<String>? = ...): Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedSimpleFunctionDescriptor]

'JvmResolveUtil' @ [64:32] ==> public object JvmResolveUtil defined in org.jetbrains.kotlin.resolve.lazy[FakeCallableDescriptorForObject]

'analyze' @ [64:47] ==> @JvmStatic public final fun analyze(environment: KotlinCoreEnvironment): AnalysisResult defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil[DeserializedSimpleFunctionDescriptor]

'environment' @ [64:55] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.doTest[LocalVariableDescriptor]

'moduleDescriptor' @ [64:68] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'moduleDescriptor' @ [67:17] ==> val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.doTest[LocalVariableDescriptor]

'getPackage' @ [67:34] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'FqName' @ [67:45] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'fragments' @ [67:61] ==> public abstract val fragments: List<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'singleOrNull' @ [68:26] ==> public inline fun <T> Iterable<PackageFragmentDescriptor>.singleOrNull(predicate: (PackageFragmentDescriptor) -> Boolean): PackageFragmentDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor

'it' @ [69:29] ==> value-parameter it: PackageFragmentDescriptor defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'getMemberScope' @ [69:32] ==> public abstract fun getMemberScope(): MemberScope defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedSimpleFunctionDescriptor]

'getContributedClassifier' @ [69:49] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'identifier' @ [69:79] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'FROM_TEST' @ [69:113] ==> enum entry FROM_TEST defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'let' @ [70:27] ==> @InlineOnly public inline fun <T, R> PackageFragmentDescriptor?.let(block: (PackageFragmentDescriptor?) -> LazyJavaPackageFragment): LazyJavaPackageFragment defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor?
    <R> -> LazyJavaPackageFragment

'assertInstanceOf' @ [70:33] ==> @Contract public open fun <T : (Any..Any?)> assertInstanceOf(p0: (Any..Any?), p1: (Class<(LazyJavaPackageFragment..LazyJavaPackageFragment?)>..Class<(LazyJavaPackageFragment..LazyJavaPackageFragment?)>?)): (LazyJavaPackageFragment..LazyJavaPackageFragment?) defined in org.jetbrains.kotlin.test.testFramework.KtUsefulTestCase[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> LazyJavaPackageFragment

'it' @ [70:50] ==> value-parameter it: PackageFragmentDescriptor? defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'LazyJavaPackageFragment' @ [70:54] ==> public constructor LazyJavaPackageFragment(outerContext: LazyJavaResolverContext, jPackage: JavaPackage) defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[DeserializedClassConstructorDescriptor]

'java' @ [70:85] ==> public val <T> KClass<LazyJavaPackageFragment>.java: Class<LazyJavaPackageFragment> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LazyJavaPackageFragment

'packageFragmentDescriptor' @ [72:26] ==> val packageFragmentDescriptor: LazyJavaPackageFragment defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.doTest[LocalVariableDescriptor]

'annotations' @ [72:52] ==> public open val annotations: Annotations defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[DeserializedPropertyDescriptor]

'findAnnotation' @ [72:64] ==> public open fun findAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'FqName' @ [72:79] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'assertNotNull' @ [73:9] ==> public open fun assertNotNull(p0: (Any..Any?)): Unit defined in org.jetbrains.kotlin.test.testFramework.KtUsefulTestCase[JavaMethodDescriptor]

'annotation' @ [73:23] ==> val annotation: AnnotationDescriptor? defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.doTest[LocalVariableDescriptor]

'packageFragmentDescriptor' @ [75:32] ==> val packageFragmentDescriptor: LazyJavaPackageFragment defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.doTest[LocalVariableDescriptor]

'annotations' @ [75:58] ==> public open val annotations: Annotations defined in org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaPackageFragment[DeserializedPropertyDescriptor]

'singleOrNull' @ [75:70] ==> public fun <T> Iterable<AnnotationDescriptor>.singleOrNull(): AnnotationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'assertNotNull' @ [76:9] ==> public open fun assertNotNull(p0: (Any..Any?)): Unit defined in org.jetbrains.kotlin.test.testFramework.KtUsefulTestCase[JavaMethodDescriptor]

'singleAnnotation' @ [76:23] ==> val singleAnnotation: AnnotationDescriptor? defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.doTest[LocalVariableDescriptor]

'assertEquals' @ [78:9] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.test.testFramework.KtUsefulTestCase[JavaMethodDescriptor]

'FqName' @ [78:22] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'singleAnnotation' @ [78:42] ==> val singleAnnotation: AnnotationDescriptor? defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.doTest[LocalVariableDescriptor]

'fqName' @ [78:61] ==> public open val fqName: FqName? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'doTest' @ [82:9] ==> private final fun doTest(useJavac: Boolean, configurator: (CompilerConfiguration) -> Unit): Unit defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest[SimpleFunctionDescriptorImpl]

'it' @ [83:13] ==> value-parameter it: CompilerConfiguration defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.testAnnotationFromSource.<anonymous>[ValueParameterDescriptorImpl]

'addJavaSourceRoots' @ [83:16] ==> @JvmOverloads public fun CompilerConfiguration.addJavaSourceRoots(files: List<File>, packagePrefix: String? = ...): Unit defined in org.jetbrains.kotlin.cli.jvm.config[DeserializedSimpleFunctionDescriptor]

'listOf' @ [83:35] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'File' @ [83:42] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'TEST_DATA_PATH' @ [83:47] ==> private final val TEST_DATA_PATH: String defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.Companion[PropertyDescriptorImpl]

'doTest' @ [88:9] ==> private final fun doTest(useJavac: Boolean, configurator: (CompilerConfiguration) -> Unit): Unit defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest[SimpleFunctionDescriptorImpl]

'it' @ [89:13] ==> value-parameter it: CompilerConfiguration defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.testAnnotationFromSourceWithJavac.<anonymous>[ValueParameterDescriptorImpl]

'addJavaSourceRoots' @ [89:16] ==> @JvmOverloads public fun CompilerConfiguration.addJavaSourceRoots(files: List<File>, packagePrefix: String? = ...): Unit defined in org.jetbrains.kotlin.cli.jvm.config[DeserializedSimpleFunctionDescriptor]

'listOf' @ [89:35] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'File' @ [89:42] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'TEST_DATA_PATH' @ [89:47] ==> private final val TEST_DATA_PATH: String defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.Companion[PropertyDescriptorImpl]

'prepareJar' @ [94:19] ==> private final fun prepareJar(): File defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest[SimpleFunctionDescriptorImpl]

'doTest' @ [96:9] ==> private final fun doTest(useJavac: Boolean, configurator: (CompilerConfiguration) -> Unit): Unit defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest[SimpleFunctionDescriptorImpl]

'it' @ [97:13] ==> value-parameter it: CompilerConfiguration defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.testAnnotationFromCompiledCode.<anonymous>[ValueParameterDescriptorImpl]

'addJvmClasspathRoot' @ [97:16] ==> public fun CompilerConfiguration.addJvmClasspathRoot(file: File): Unit defined in org.jetbrains.kotlin.cli.jvm.config[DeserializedSimpleFunctionDescriptor]

'jar' @ [97:36] ==> val jar: File defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.testAnnotationFromCompiledCode[LocalVariableDescriptor]

'prepareJar' @ [102:19] ==> private final fun prepareJar(): File defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest[SimpleFunctionDescriptorImpl]

'doTest' @ [104:9] ==> private final fun doTest(useJavac: Boolean, configurator: (CompilerConfiguration) -> Unit): Unit defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest[SimpleFunctionDescriptorImpl]

'it' @ [105:13] ==> value-parameter it: CompilerConfiguration defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.testAnnotationFromCompiledCodeWithJavac.<anonymous>[ValueParameterDescriptorImpl]

'addJvmClasspathRoot' @ [105:16] ==> public fun CompilerConfiguration.addJvmClasspathRoot(file: File): Unit defined in org.jetbrains.kotlin.cli.jvm.config[DeserializedSimpleFunctionDescriptor]

'jar' @ [105:36] ==> val jar: File defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.testAnnotationFromCompiledCodeWithJavac[LocalVariableDescriptor]

'MockLibraryUtil' @ [110:13] ==> public object MockLibraryUtil defined in org.jetbrains.kotlin.test[FakeCallableDescriptorForObject]

'compileJavaFilesLibraryToJar' @ [110:29] ==> @JvmStatic @JvmOverloads public final fun compileJavaFilesLibraryToJar(sourcesPath: String, jarName: String, addSources: Boolean = ..., extraOptions: List<String> = ..., extraClasspath: List<String> = ...): File defined in org.jetbrains.kotlin.test.MockLibraryUtil[DeserializedSimpleFunctionDescriptor]

'TEST_DATA_PATH' @ [110:58] ==> private final val TEST_DATA_PATH: String defined in org.jetbrains.kotlin.jvm.compiler.LoadJavaPackageAnnotationsTest.Companion[PropertyDescriptorImpl]

