'TestCaseWithTmpdir' @ [40:55] ==> public constructor TestCaseWithTmpdir() defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaClassConstructorDescriptor]

'Throws' @ [42:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [42:13] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'assertTrue' @ [44:16] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'ktFilePath' @ [44:27] ==> value-parameter ktFilePath: String defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.doTest[ValueParameterDescriptorImpl]

'endsWith' @ [44:38] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'File' @ [45:22] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'ktFilePath' @ [45:27] ==> value-parameter ktFilePath: String defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.doTest[ValueParameterDescriptorImpl]

'File' @ [46:24] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'ktFilePath' @ [46:29] ==> value-parameter ktFilePath: String defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.doTest[ValueParameterDescriptorImpl]

'replaceFirst' @ [46:40] ==> @InlineOnly public inline fun CharSequence.replaceFirst(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [46:62] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'File' @ [47:19] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [47:24] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest[JavaPropertyDescriptor]

'compileKotlinWithJava' @ [49:36] ==> @Throws public final fun compileKotlinWithJava(javaFiles: List<File>, ktFiles: List<File>, outDir: File, disposable: Disposable): Boolean defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest[SimpleFunctionDescriptorImpl]

'listOf' @ [49:58] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'javaFile' @ [49:65] ==> val javaFile: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.doTest[LocalVariableDescriptor]

'listOf' @ [50:58] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'ktFile' @ [50:65] ==> val ktFile: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.doTest[LocalVariableDescriptor]

'out' @ [51:58] ==> val out: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.doTest[LocalVariableDescriptor]

'testRootDisposable' @ [51:63] ==> public final val AbstractCompileKotlinAgainstJavaTest.testRootDisposable: Disposable[MyPropertyDescriptor]

'!' @ [52:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'compiledSuccessfully' @ [52:14] ==> val compiledSuccessfully: Boolean defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.doTest[LocalVariableDescriptor]

'KotlinCoreEnvironment' @ [54:27] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'createForTests' @ [54:49] ==> @JvmStatic public final fun createForTests(parentDisposable: Disposable, configuration: CompilerConfiguration, extensionConfigs: EnvironmentConfigFiles): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[DeserializedSimpleFunctionDescriptor]

'testRootDisposable' @ [55:17] ==> public final val AbstractCompileKotlinAgainstJavaTest.testRootDisposable: Disposable[MyPropertyDescriptor]

'newConfiguration' @ [56:17] ==> @NotNull public open fun newConfiguration(@NotNull p0: ConfigurationKind, @NotNull p1: TestJdkKind, @NotNull vararg p2: (File..File?)): CompilerConfiguration defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'ALL' @ [56:52] ==> enum entry ALL defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'MOCK_JDK' @ [56:69] ==> enum entry MOCK_JDK defined in org.jetbrains.kotlin.test.TestJdkKind[FakeCallableDescriptorForObject]

'getAnnotationsJar' @ [56:79] ==> public open fun getAnnotationsJar(): (File..File?) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'out' @ [56:100] ==> val out: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.doTest[LocalVariableDescriptor]

'JVM_CONFIG_FILES' @ [57:40] ==> enum entry JVM_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'environment' @ [60:9] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.doTest[LocalVariableDescriptor]

'configuration' @ [60:21] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'put' @ [60:35] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'USE_JAVAC' @ [60:60] ==> public final val USE_JAVAC: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'environment' @ [61:9] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.doTest[LocalVariableDescriptor]

'configuration' @ [61:21] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'put' @ [61:35] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(File..File?)>, @NotNull p1: File): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> File

'OUTPUT_DIRECTORY' @ [61:60] ==> public final val OUTPUT_DIRECTORY: (CompilerConfigurationKey<(File..File?)>..CompilerConfigurationKey<(File..File?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'out' @ [61:78] ==> val out: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.doTest[LocalVariableDescriptor]

'environment' @ [62:9] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.doTest[LocalVariableDescriptor]

'registerJavac' @ [62:21] ==> public final fun registerJavac(javaFiles: List<File> = ..., kotlinFiles: List<KtFile> = ..., arguments: Array<String>? = ...): Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [62:35] ==> public fun <T> emptyList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'JvmResolveUtil' @ [64:30] ==> public object JvmResolveUtil defined in org.jetbrains.kotlin.resolve.lazy[FakeCallableDescriptorForObject]

'analyze' @ [64:45] ==> @JvmStatic public final fun analyze(environment: KotlinCoreEnvironment): AnalysisResult defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil[DeserializedSimpleFunctionDescriptor]

'environment' @ [64:53] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.doTest[LocalVariableDescriptor]

'analysisResult' @ [65:27] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.doTest[LocalVariableDescriptor]

'moduleDescriptor' @ [65:42] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'getPackage' @ [65:59] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'TEST_PACKAGE_FQNAME' @ [65:89] ==> @NotNull public final val TEST_PACKAGE_FQNAME: FqName defined in org.jetbrains.kotlin.jvm.compiler.LoadDescriptorUtil[JavaPropertyDescriptor]

'assertFalse' @ [66:9] ==> public open fun assertFalse(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaMethodDescriptor]

'TEST_PACKAGE_FQNAME' @ [66:68] ==> @NotNull public final val TEST_PACKAGE_FQNAME: FqName defined in org.jetbrains.kotlin.jvm.compiler.LoadDescriptorUtil[JavaPropertyDescriptor]

'packageView' @ [66:91] ==> val packageView: PackageViewDescriptor defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.doTest[LocalVariableDescriptor]

'isEmpty' @ [66:103] ==> public open fun isEmpty(): Boolean defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedSimpleFunctionDescriptor]

'File' @ [68:28] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'ktFilePath' @ [68:33] ==> value-parameter ktFilePath: String defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.doTest[ValueParameterDescriptorImpl]

'replaceFirst' @ [68:44] ==> @InlineOnly public inline fun CharSequence.replaceFirst(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [68:66] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'validateAndCompareDescriptorWithFile' @ [69:9] ==> public open fun validateAndCompareDescriptorWithFile(@NotNull p0: DeclarationDescriptor, @NotNull p1: RecursiveDescriptorComparator.Configuration, @NotNull p2: File): Unit defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator[JavaMethodDescriptor]

'packageView' @ [69:46] ==> val packageView: PackageViewDescriptor defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.doTest[LocalVariableDescriptor]

'CONFIGURATION' @ [69:59] ==> private final val CONFIGURATION: (RecursiveDescriptorComparator.Configuration..RecursiveDescriptorComparator.Configuration?) defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.Companion[PropertyDescriptorImpl]

'expectedFile' @ [69:74] ==> val expectedFile: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.doTest[LocalVariableDescriptor]

'Throws' @ [72:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [72:13] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'createEnvironmentWithMockJdkAndIdeaAnnotations' @ [79:27] ==> @NotNull public open fun createEnvironmentWithMockJdkAndIdeaAnnotations(p0: (Disposable..Disposable?)): KotlinCoreEnvironment defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'disposable' @ [79:74] ==> value-parameter disposable: Disposable defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.compileKotlinWithJava[ValueParameterDescriptorImpl]

'environment' @ [80:9] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.compileKotlinWithJava[LocalVariableDescriptor]

'configuration' @ [80:21] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'put' @ [80:35] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'USE_JAVAC' @ [80:60] ==> public final val USE_JAVAC: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'environment' @ [81:9] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.compileKotlinWithJava[LocalVariableDescriptor]

'configuration' @ [81:21] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'put' @ [81:35] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(File..File?)>, @NotNull p1: File): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> File

'OUTPUT_DIRECTORY' @ [81:60] ==> public final val OUTPUT_DIRECTORY: (CompilerConfigurationKey<(File..File?)>..CompilerConfigurationKey<(File..File?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'outDir' @ [81:78] ==> value-parameter outDir: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.compileKotlinWithJava[ValueParameterDescriptorImpl]

'environment' @ [82:9] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.compileKotlinWithJava[LocalVariableDescriptor]

'registerJavac' @ [82:21] ==> public final fun registerJavac(javaFiles: List<File> = ..., kotlinFiles: List<KtFile> = ..., arguments: Array<String>? = ...): Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedSimpleFunctionDescriptor]

'javaFiles' @ [82:35] ==> value-parameter javaFiles: List<File> defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.compileKotlinWithJava[ValueParameterDescriptorImpl]

'listOf' @ [82:60] ==> public fun <T> listOf(element: KtFile): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'loadJetFile' @ [82:83] ==> @NotNull public open fun loadJetFile(@NotNull p0: Project, @NotNull p1: File): KtFile defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'environment' @ [82:95] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.compileKotlinWithJava[LocalVariableDescriptor]

'project' @ [82:107] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'ktFiles' @ [82:116] ==> value-parameter ktFiles: List<File> defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.compileKotlinWithJava[ValueParameterDescriptorImpl]

'first' @ [82:124] ==> public fun <T> List<File>.first(): File defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'if (!ktFiles.isEmpty()) {
            LoadDescriptorUtil.compileKotlinToDirAndGetModule(ktFiles, outDir, environment)
        }
        else {
            val mkdirs = outDir.mkdirs()
            assert(mkdirs) { "Not created: $outDir" }
        }' @ [83:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'!' @ [83:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ktFiles' @ [83:14] ==> value-parameter ktFiles: List<File> defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.compileKotlinWithJava[ValueParameterDescriptorImpl]

'isEmpty' @ [83:22] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'compileKotlinToDirAndGetModule' @ [84:32] ==> @NotNull public open fun compileKotlinToDirAndGetModule(@NotNull p0: (MutableList<(File..File?)>..List<(File..File?)>), @NotNull p1: File, @NotNull p2: KotlinCoreEnvironment): ModuleDescriptor defined in org.jetbrains.kotlin.jvm.compiler.LoadDescriptorUtil[JavaMethodDescriptor]

'ktFiles' @ [84:63] ==> value-parameter ktFiles: List<File> defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.compileKotlinWithJava[ValueParameterDescriptorImpl]

'outDir' @ [84:72] ==> value-parameter outDir: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.compileKotlinWithJava[ValueParameterDescriptorImpl]

'environment' @ [84:80] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.compileKotlinWithJava[LocalVariableDescriptor]

'outDir' @ [87:26] ==> value-parameter outDir: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.compileKotlinWithJava[ValueParameterDescriptorImpl]

'mkdirs' @ [87:33] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'assert' @ [88:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'mkdirs' @ [88:20] ==> val mkdirs: Boolean defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.compileKotlinWithJava[LocalVariableDescriptor]

'outDir' @ [88:45] ==> value-parameter outDir: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.compileKotlinWithJava[ValueParameterDescriptorImpl]

'JavacWrapper' @ [91:16] ==> public companion object defined in org.jetbrains.kotlin.javac.JavacWrapper[FakeCallableDescriptorForObject]

'getInstance' @ [91:29] ==> public final fun getInstance(project: Project): JavacWrapper defined in org.jetbrains.kotlin.javac.JavacWrapper.Companion[DeserializedSimpleFunctionDescriptor]

'environment' @ [91:41] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.compileKotlinWithJava[LocalVariableDescriptor]

'project' @ [91:53] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'use' @ [91:62] ==> @InlineOnly public inline fun <T : Closeable?, R> JavacWrapper.use(block: (JavacWrapper) -> Boolean): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> JavacWrapper
    <R> -> Boolean

'it' @ [91:68] ==> value-parameter it: JavacWrapper defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileKotlinAgainstJavaTest.compileKotlinWithJava.<anonymous>[ValueParameterDescriptorImpl]

'compile' @ [91:71] ==> public final fun compile(outDir: File? = ...): Boolean defined in org.jetbrains.kotlin.javac.JavacWrapper[DeserializedSimpleFunctionDescriptor]

'COMPARATOR_CONFIGURATION' @ [97:58] ==> public final val COMPARATOR_CONFIGURATION: (RecursiveDescriptorComparator.Configuration..RecursiveDescriptorComparator.Configuration?) defined in org.jetbrains.kotlin.jvm.compiler.AbstractLoadJavaTest[JavaPropertyDescriptor]

'withRenderer' @ [97:83] ==> public open fun withRenderer(@NotNull p0: DescriptorRenderer): (RecursiveDescriptorComparator.Configuration..RecursiveDescriptorComparator.Configuration?) defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator.Configuration[JavaMethodDescriptor]

'DescriptorRenderer' @ [98:17] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'withOptions' @ [98:36] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedSimpleFunctionDescriptor]

'withDefinedIn' @ [99:21] ==> public abstract var withDefinedIn: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'parameterNameRenderingPolicy' @ [100:21] ==> public abstract var parameterNameRenderingPolicy: ParameterNameRenderingPolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'NONE' @ [100:81] ==> enum entry NONE defined in org.jetbrains.kotlin.renderer.ParameterNameRenderingPolicy[FakeCallableDescriptorForObject]

'verbose' @ [101:21] ==> public abstract var verbose: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'annotationArgumentsRenderingPolicy' @ [102:21] ==> public abstract var annotationArgumentsRenderingPolicy: AnnotationArgumentsRenderingPolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'UNLESS_EMPTY' @ [102:93] ==> enum entry UNLESS_EMPTY defined in org.jetbrains.kotlin.renderer.AnnotationArgumentsRenderingPolicy[FakeCallableDescriptorForObject]

'excludedAnnotationClasses' @ [103:21] ==> public abstract var excludedAnnotationClasses: Set<FqName> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'setOf' @ [103:49] ==> public fun <T> setOf(element: FqName): Set<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'FqName' @ [103:55] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'Retention' @ [103:62] ==> public constructor Retention(value: AnnotationRetention = ...) defined in kotlin.annotation.Retention[DeserializedClassConstructorDescriptor]

'java' @ [103:79] ==> public val <T> KClass<Retention>.java: Class<Retention> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Retention

'name' @ [103:84] ==> public final val <T : (Any..Any?)> Class<Retention>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Retention

'modifiers' @ [104:21] ==> public abstract var modifiers: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'DescriptorRendererModifier' @ [104:33] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRendererModifier[FakeCallableDescriptorForObject]

'ALL' @ [104:60] ==> @field:JvmField public final val ALL: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererModifier.Companion[DeserializedPropertyDescriptor]

