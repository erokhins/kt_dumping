'TestCaseWithTmpdir' @ [42:55] ==> public constructor TestCaseWithTmpdir() defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaClassConstructorDescriptor]

'Throws' @ [44:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [44:13] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'doTest' @ [46:9] ==> @Throws protected final fun doTest(ktFilePath: String, useJavac: Boolean): Unit defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest[SimpleFunctionDescriptorImpl]

'ktFilePath' @ [46:16] ==> value-parameter ktFilePath: String defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTestWithJavac[ValueParameterDescriptorImpl]

'Throws' @ [49:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [49:13] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'doTest' @ [51:9] ==> @Throws protected final fun doTest(ktFilePath: String, useJavac: Boolean): Unit defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest[SimpleFunctionDescriptorImpl]

'ktFilePath' @ [51:16] ==> value-parameter ktFilePath: String defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTestWithoutJavac[ValueParameterDescriptorImpl]

'Throws' @ [54:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [54:13] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'assertTrue' @ [56:16] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'ktFilePath' @ [56:27] ==> value-parameter ktFilePath: String defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTest[ValueParameterDescriptorImpl]

'endsWith' @ [56:38] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'File' @ [57:22] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'ktFilePath' @ [57:27] ==> value-parameter ktFilePath: String defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTest[ValueParameterDescriptorImpl]

'File' @ [58:24] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'ktFilePath' @ [58:29] ==> value-parameter ktFilePath: String defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTest[ValueParameterDescriptorImpl]

'replaceFirst' @ [58:40] ==> @InlineOnly public inline fun CharSequence.replaceFirst(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [58:62] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'File' @ [60:29] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'ktFilePath' @ [60:34] ==> value-parameter ktFilePath: String defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTest[ValueParameterDescriptorImpl]

'replaceFirst' @ [60:45] ==> @InlineOnly public inline fun CharSequence.replaceFirst(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [60:67] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'File' @ [62:19] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [62:24] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest[JavaPropertyDescriptor]

'if (useJavac) {
            compileKotlinWithJava(listOf(javaFile),
                                  listOf(ktFile),
                                  out, testRootDisposable)
        } else {
            KotlinTestUtils.compileKotlinWithJava(listOf(javaFile),
                                                  listOf(ktFile),
                                                  out, testRootDisposable, javaErrorFile)
        }' @ [64:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'useJavac' @ [64:40] ==> value-parameter useJavac: Boolean defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTest[ValueParameterDescriptorImpl]

'compileKotlinWithJava' @ [65:13] ==> @Throws public final fun compileKotlinWithJava(javaFiles: List<File>, ktFiles: List<File>, outDir: File, disposable: Disposable): Boolean defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest[SimpleFunctionDescriptorImpl]

'listOf' @ [65:35] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'javaFile' @ [65:42] ==> val javaFile: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTest[LocalVariableDescriptor]

'listOf' @ [66:35] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'ktFile' @ [66:42] ==> val ktFile: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTest[LocalVariableDescriptor]

'out' @ [67:35] ==> val out: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTest[LocalVariableDescriptor]

'testRootDisposable' @ [67:40] ==> public final val AbstractCompileJavaAgainstKotlinTest.testRootDisposable: Disposable[MyPropertyDescriptor]

'compileKotlinWithJava' @ [69:29] ==> public open fun compileKotlinWithJava(@NotNull p0: (MutableList<(File..File?)>..List<(File..File?)>), @NotNull p1: (MutableList<(File..File?)>..List<(File..File?)>), @NotNull p2: File, @NotNull p3: Disposable, @Nullable p4: File?): Boolean defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'listOf' @ [69:51] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'javaFile' @ [69:58] ==> val javaFile: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTest[LocalVariableDescriptor]

'listOf' @ [70:51] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'ktFile' @ [70:58] ==> val ktFile: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTest[LocalVariableDescriptor]

'out' @ [71:51] ==> val out: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTest[LocalVariableDescriptor]

'testRootDisposable' @ [71:56] ==> public final val AbstractCompileJavaAgainstKotlinTest.testRootDisposable: Disposable[MyPropertyDescriptor]

'javaErrorFile' @ [71:76] ==> val javaErrorFile: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTest[LocalVariableDescriptor]

'!' @ [74:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'compiledSuccessfully' @ [74:14] ==> val compiledSuccessfully: Boolean defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTest[LocalVariableDescriptor]

'KotlinCoreEnvironment' @ [76:27] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'createForTests' @ [76:49] ==> @JvmStatic public final fun createForTests(parentDisposable: Disposable, configuration: CompilerConfiguration, extensionConfigs: EnvironmentConfigFiles): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[DeserializedSimpleFunctionDescriptor]

'testRootDisposable' @ [77:17] ==> public final val AbstractCompileJavaAgainstKotlinTest.testRootDisposable: Disposable[MyPropertyDescriptor]

'newConfiguration' @ [78:17] ==> @NotNull public open fun newConfiguration(@NotNull p0: ConfigurationKind, @NotNull p1: TestJdkKind, @NotNull vararg p2: (File..File?)): CompilerConfiguration defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'ALL' @ [78:52] ==> enum entry ALL defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'FULL_JDK' @ [78:69] ==> enum entry FULL_JDK defined in org.jetbrains.kotlin.test.TestJdkKind[FakeCallableDescriptorForObject]

'getAnnotationsJar' @ [78:79] ==> public open fun getAnnotationsJar(): (File..File?) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'out' @ [78:100] ==> val out: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTest[LocalVariableDescriptor]

'JVM_CONFIG_FILES' @ [79:40] ==> enum entry JVM_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'JvmResolveUtil' @ [82:30] ==> public object JvmResolveUtil defined in org.jetbrains.kotlin.resolve.lazy[FakeCallableDescriptorForObject]

'analyze' @ [82:45] ==> @JvmStatic public final fun analyze(environment: KotlinCoreEnvironment): AnalysisResult defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil[DeserializedSimpleFunctionDescriptor]

'environment' @ [82:53] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTest[LocalVariableDescriptor]

'analysisResult' @ [83:27] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTest[LocalVariableDescriptor]

'moduleDescriptor' @ [83:42] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'getPackage' @ [83:59] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'TEST_PACKAGE_FQNAME' @ [83:89] ==> @NotNull public final val TEST_PACKAGE_FQNAME: FqName defined in org.jetbrains.kotlin.jvm.compiler.LoadDescriptorUtil[JavaPropertyDescriptor]

'assertFalse' @ [84:9] ==> public open fun assertFalse(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaMethodDescriptor]

'TEST_PACKAGE_FQNAME' @ [84:68] ==> @NotNull public final val TEST_PACKAGE_FQNAME: FqName defined in org.jetbrains.kotlin.jvm.compiler.LoadDescriptorUtil[JavaPropertyDescriptor]

'packageView' @ [84:91] ==> val packageView: PackageViewDescriptor defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTest[LocalVariableDescriptor]

'isEmpty' @ [84:103] ==> public open fun isEmpty(): Boolean defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedSimpleFunctionDescriptor]

'File' @ [86:28] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'ktFilePath' @ [86:33] ==> value-parameter ktFilePath: String defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTest[ValueParameterDescriptorImpl]

'replaceFirst' @ [86:44] ==> @InlineOnly public inline fun CharSequence.replaceFirst(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [86:66] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'validateAndCompareDescriptorWithFile' @ [87:9] ==> public open fun validateAndCompareDescriptorWithFile(@NotNull p0: DeclarationDescriptor, @NotNull p1: RecursiveDescriptorComparator.Configuration, @NotNull p2: File): Unit defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator[JavaMethodDescriptor]

'packageView' @ [87:46] ==> val packageView: PackageViewDescriptor defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTest[LocalVariableDescriptor]

'CONFIGURATION' @ [87:59] ==> private final val CONFIGURATION: (RecursiveDescriptorComparator.Configuration..RecursiveDescriptorComparator.Configuration?) defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.Companion[PropertyDescriptorImpl]

'expectedFile' @ [87:74] ==> val expectedFile: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.doTest[LocalVariableDescriptor]

'Throws' @ [90:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [90:13] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'createEnvironmentWithMockJdkAndIdeaAnnotations' @ [97:27] ==> @NotNull public open fun createEnvironmentWithMockJdkAndIdeaAnnotations(p0: (Disposable..Disposable?)): KotlinCoreEnvironment defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'disposable' @ [97:74] ==> value-parameter disposable: Disposable defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.compileKotlinWithJava[ValueParameterDescriptorImpl]

'environment' @ [98:9] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.compileKotlinWithJava[LocalVariableDescriptor]

'configuration' @ [98:21] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'put' @ [98:35] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'USE_JAVAC' @ [98:60] ==> public final val USE_JAVAC: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'environment' @ [99:9] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.compileKotlinWithJava[LocalVariableDescriptor]

'configuration' @ [99:21] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'put' @ [99:35] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(File..File?)>, @NotNull p1: File): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> File

'OUTPUT_DIRECTORY' @ [99:60] ==> public final val OUTPUT_DIRECTORY: (CompilerConfigurationKey<(File..File?)>..CompilerConfigurationKey<(File..File?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'outDir' @ [99:78] ==> value-parameter outDir: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.compileKotlinWithJava[ValueParameterDescriptorImpl]

'environment' @ [100:9] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.compileKotlinWithJava[LocalVariableDescriptor]

'configuration' @ [100:21] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'put' @ [100:35] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(MessageCollector..MessageCollector?)>, @NotNull p1: MessageCollector): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MessageCollector

'MESSAGE_COLLECTOR_KEY' @ [100:60] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'MessageCollector' @ [100:83] ==> public companion object defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[FakeCallableDescriptorForObject]

'NONE' @ [100:100] ==> public final val NONE: MessageCollector defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector.Companion[DeserializedPropertyDescriptor]

'environment' @ [101:9] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.compileKotlinWithJava[LocalVariableDescriptor]

'registerJavac' @ [101:21] ==> public final fun registerJavac(javaFiles: List<File> = ..., kotlinFiles: List<KtFile> = ..., arguments: Array<String>? = ...): Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedSimpleFunctionDescriptor]

'javaFiles' @ [101:35] ==> value-parameter javaFiles: List<File> defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.compileKotlinWithJava[ValueParameterDescriptorImpl]

'listOf' @ [101:60] ==> public fun <T> listOf(element: KtFile): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'loadJetFile' @ [101:83] ==> @NotNull public open fun loadJetFile(@NotNull p0: Project, @NotNull p1: File): KtFile defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'environment' @ [101:95] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.compileKotlinWithJava[LocalVariableDescriptor]

'project' @ [101:107] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'ktFiles' @ [101:116] ==> value-parameter ktFiles: List<File> defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.compileKotlinWithJava[ValueParameterDescriptorImpl]

'first' @ [101:124] ==> public fun <T> List<File>.first(): File defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'if (!ktFiles.isEmpty()) {
            LoadDescriptorUtil.compileKotlinToDirAndGetModule(ktFiles, outDir, environment)
        }
        else {
            val mkdirs = outDir.mkdirs()
            assert(mkdirs) { "Not created: $outDir" }
        }' @ [102:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'!' @ [102:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ktFiles' @ [102:14] ==> value-parameter ktFiles: List<File> defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.compileKotlinWithJava[ValueParameterDescriptorImpl]

'isEmpty' @ [102:22] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'compileKotlinToDirAndGetModule' @ [103:32] ==> @NotNull public open fun compileKotlinToDirAndGetModule(@NotNull p0: (MutableList<(File..File?)>..List<(File..File?)>), @NotNull p1: File, @NotNull p2: KotlinCoreEnvironment): ModuleDescriptor defined in org.jetbrains.kotlin.jvm.compiler.LoadDescriptorUtil[JavaMethodDescriptor]

'ktFiles' @ [103:63] ==> value-parameter ktFiles: List<File> defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.compileKotlinWithJava[ValueParameterDescriptorImpl]

'outDir' @ [103:72] ==> value-parameter outDir: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.compileKotlinWithJava[ValueParameterDescriptorImpl]

'environment' @ [103:80] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.compileKotlinWithJava[LocalVariableDescriptor]

'outDir' @ [106:26] ==> value-parameter outDir: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.compileKotlinWithJava[ValueParameterDescriptorImpl]

'mkdirs' @ [106:33] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'assert' @ [107:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'mkdirs' @ [107:20] ==> val mkdirs: Boolean defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.compileKotlinWithJava[LocalVariableDescriptor]

'outDir' @ [107:45] ==> value-parameter outDir: File defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.compileKotlinWithJava[ValueParameterDescriptorImpl]

'JavacWrapper' @ [110:16] ==> public companion object defined in org.jetbrains.kotlin.javac.JavacWrapper[FakeCallableDescriptorForObject]

'getInstance' @ [110:29] ==> public final fun getInstance(project: Project): JavacWrapper defined in org.jetbrains.kotlin.javac.JavacWrapper.Companion[DeserializedSimpleFunctionDescriptor]

'environment' @ [110:41] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.compileKotlinWithJava[LocalVariableDescriptor]

'project' @ [110:53] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'use' @ [110:62] ==> @InlineOnly public inline fun <T : Closeable?, R> JavacWrapper.use(block: (JavacWrapper) -> Boolean): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> JavacWrapper
    <R> -> Boolean

'it' @ [110:68] ==> value-parameter it: JavacWrapper defined in org.jetbrains.kotlin.jvm.compiler.AbstractCompileJavaAgainstKotlinTest.compileKotlinWithJava.<anonymous>[ValueParameterDescriptorImpl]

'compile' @ [110:71] ==> public final fun compile(outDir: File? = ...): Boolean defined in org.jetbrains.kotlin.javac.JavacWrapper[DeserializedSimpleFunctionDescriptor]

'COMPARATOR_CONFIGURATION' @ [116:58] ==> public final val COMPARATOR_CONFIGURATION: (RecursiveDescriptorComparator.Configuration..RecursiveDescriptorComparator.Configuration?) defined in org.jetbrains.kotlin.jvm.compiler.AbstractLoadJavaTest[JavaPropertyDescriptor]

'withRenderer' @ [116:83] ==> public open fun withRenderer(@NotNull p0: DescriptorRenderer): (RecursiveDescriptorComparator.Configuration..RecursiveDescriptorComparator.Configuration?) defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator.Configuration[JavaMethodDescriptor]

'DescriptorRenderer' @ [117:17] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'withOptions' @ [117:36] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedSimpleFunctionDescriptor]

'withDefinedIn' @ [118:21] ==> public abstract var withDefinedIn: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'parameterNameRenderingPolicy' @ [119:21] ==> public abstract var parameterNameRenderingPolicy: ParameterNameRenderingPolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'NONE' @ [119:81] ==> enum entry NONE defined in org.jetbrains.kotlin.renderer.ParameterNameRenderingPolicy[FakeCallableDescriptorForObject]

'verbose' @ [120:21] ==> public abstract var verbose: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'annotationArgumentsRenderingPolicy' @ [121:21] ==> public abstract var annotationArgumentsRenderingPolicy: AnnotationArgumentsRenderingPolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'UNLESS_EMPTY' @ [121:93] ==> enum entry UNLESS_EMPTY defined in org.jetbrains.kotlin.renderer.AnnotationArgumentsRenderingPolicy[FakeCallableDescriptorForObject]

'excludedAnnotationClasses' @ [122:21] ==> public abstract var excludedAnnotationClasses: Set<FqName> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'setOf' @ [122:49] ==> public fun <T> setOf(element: FqName): Set<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'FqName' @ [122:55] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'Retention' @ [122:62] ==> public constructor Retention(value: AnnotationRetention = ...) defined in kotlin.annotation.Retention[DeserializedClassConstructorDescriptor]

'java' @ [122:79] ==> public val <T> KClass<Retention>.java: Class<Retention> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Retention

'name' @ [122:84] ==> public final val <T : (Any..Any?)> Class<Retention>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Retention

'modifiers' @ [123:21] ==> public abstract var modifiers: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'DescriptorRendererModifier' @ [123:33] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRendererModifier[FakeCallableDescriptorForObject]

'ALL' @ [123:60] ==> @field:JvmField public final val ALL: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererModifier.Companion[DeserializedPropertyDescriptor]

