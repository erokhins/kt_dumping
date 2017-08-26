'AbstractKotlinCompilerIntegrationTest' @ [59:48] ==> public constructor AbstractKotlinCompilerIntegrationTest() defined in org.jetbrains.kotlin.jvm.compiler.AbstractKotlinCompilerIntegrationTest[ClassConstructorDescriptorImpl]

'validateAndCompareDescriptorWithFile' @ [64:9] ==> public open fun validateAndCompareDescriptorWithFile(@NotNull p0: DeclarationDescriptor, @NotNull p1: RecursiveDescriptorComparator.Configuration, @NotNull p2: File): Unit defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator[JavaMethodDescriptor]

'analyzeFileToPackageView' @ [65:17] ==> private final fun analyzeFileToPackageView(vararg extraClassPath: File): PackageViewDescriptor defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'extraClassPath' @ [65:43] ==> value-parameter vararg extraClassPath: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestWithTxt[ValueParameterDescriptorImpl]

'COMPARATOR_CONFIGURATION' @ [66:38] ==> public final val COMPARATOR_CONFIGURATION: (RecursiveDescriptorComparator.Configuration..RecursiveDescriptorComparator.Configuration?) defined in org.jetbrains.kotlin.jvm.compiler.AbstractLoadJavaTest[JavaPropertyDescriptor]

'getTestDataFileWithExtension' @ [67:17] ==> protected final fun getTestDataFileWithExtension(extension: String): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'createEnvironment' @ [72:27] ==> private final fun createEnvironment(extraClassPath: List<File>): KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'extraClassPath' @ [72:45] ==> value-parameter vararg extraClassPath: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.analyzeFileToPackageView[ValueParameterDescriptorImpl]

'toList' @ [72:60] ==> public fun <T> Array<out File>.toList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'loadJetFile' @ [74:38] ==> @NotNull public open fun loadJetFile(@NotNull p0: Project, @NotNull p1: File): KtFile defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'environment' @ [74:50] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.analyzeFileToPackageView[LocalVariableDescriptor]

'project' @ [74:62] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'getTestDataFileWithExtension' @ [74:71] ==> protected final fun getTestDataFileWithExtension(extension: String): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'JvmResolveUtil' @ [75:22] ==> public object JvmResolveUtil defined in org.jetbrains.kotlin.resolve.lazy[FakeCallableDescriptorForObject]

'analyzeAndCheckForErrors' @ [75:37] ==> @JvmStatic public final fun analyzeAndCheckForErrors(file: KtFile, environment: KotlinCoreEnvironment): AnalysisResult defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil[DeserializedSimpleFunctionDescriptor]

'ktFile' @ [75:62] ==> val ktFile: KtFile defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.analyzeFileToPackageView[LocalVariableDescriptor]

'environment' @ [75:70] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.analyzeFileToPackageView[LocalVariableDescriptor]

'result' @ [77:16] ==> val result: AnalysisResult defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.analyzeFileToPackageView[LocalVariableDescriptor]

'moduleDescriptor' @ [77:23] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'getPackage' @ [77:40] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'TEST_PACKAGE_FQNAME' @ [77:70] ==> @NotNull public final val TEST_PACKAGE_FQNAME: FqName defined in org.jetbrains.kotlin.jvm.compiler.LoadDescriptorUtil[JavaPropertyDescriptor]

'also' @ [77:91] ==> @InlineOnly @SinceKotlin public inline fun <T> PackageViewDescriptor.also(block: (PackageViewDescriptor) -> Unit): PackageViewDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageViewDescriptor

'assertFalse' @ [78:13] ==> public open fun assertFalse(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaMethodDescriptor]

'+' @ [78:25] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'TEST_PACKAGE_FQNAME' @ [78:73] ==> @NotNull public final val TEST_PACKAGE_FQNAME: FqName defined in org.jetbrains.kotlin.jvm.compiler.LoadDescriptorUtil[JavaPropertyDescriptor]

'it' @ [78:94] ==> value-parameter it: PackageViewDescriptor defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.analyzeFileToPackageView.<anonymous>[ValueParameterDescriptorImpl]

'isEmpty' @ [78:97] ==> public open fun isEmpty(): Boolean defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedSimpleFunctionDescriptor]

'newConfiguration' @ [83:45] ==> @NotNull public open fun newConfiguration(@NotNull p0: ConfigurationKind, @NotNull p1: TestJdkKind, @NotNull vararg p2: (File..File?)): CompilerConfiguration defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'ALL' @ [83:80] ==> enum entry ALL defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'MOCK_JDK' @ [83:97] ==> enum entry MOCK_JDK defined in org.jetbrains.kotlin.test.TestJdkKind[FakeCallableDescriptorForObject]

'extraClassPath' @ [83:108] ==> value-parameter extraClassPath: List<File> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.createEnvironment[ValueParameterDescriptorImpl]

'toTypedArray' @ [83:123] ==> public inline fun <reified T> Collection<File>.toTypedArray(): Array<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> File

'KotlinCoreEnvironment' @ [84:16] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'createForTests' @ [84:38] ==> @JvmStatic public final fun createForTests(parentDisposable: Disposable, configuration: CompilerConfiguration, extensionConfigs: EnvironmentConfigFiles): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[DeserializedSimpleFunctionDescriptor]

'testRootDisposable' @ [84:53] ==> public final val CompileKotlinAgainstCustomBinariesTest.testRootDisposable: Disposable[MyPropertyDescriptor]

'configuration' @ [84:73] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.createEnvironment[LocalVariableDescriptor]

'JVM_CONFIG_FILES' @ [84:111] ==> enum entry JVM_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'getAllDescriptors' @ [88:29] ==> @NotNull public open fun getAllDescriptors(@NotNull p0: MemberScope): (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'analyzeFileToPackageView' @ [88:47] ==> private final fun analyzeFileToPackageView(vararg extraClassPath: File): PackageViewDescriptor defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'extraClassPath' @ [88:73] ==> value-parameter vararg extraClassPath: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.analyzeAndGetAllDescriptors[ValueParameterDescriptorImpl]

'memberScope' @ [88:89] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'copyJarFileWithoutEntry' @ [93:23] ==> private final fun copyJarFileWithoutEntry(jarPath: File, vararg entriesToDelete: String): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion[SimpleFunctionDescriptorImpl]

'compileLibrary' @ [93:47] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'libraryName' @ [93:62] ==> value-parameter libraryName: String defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestBrokenLibrary[ValueParameterDescriptorImpl]

'pathsToDelete' @ [93:77] ==> value-parameter vararg pathsToDelete: String defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestBrokenLibrary[ValueParameterDescriptorImpl]

'compileKotlin' @ [94:9] ==> protected final fun compileKotlin(fileName: String, output: File, classpath: List<File>, compiler: CLICompiler<*>, additionalOptions: List<String>, expectedFileName: String?): Pair<String, ExitCode> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'tmpdir' @ [94:36] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'listOf' @ [94:44] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'library' @ [94:51] ==> val library: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestBrokenLibrary[LocalVariableDescriptor]

'JvmMetadataVersion' @ [102:23] ==> public constructor JvmMetadataVersion(vararg numbers: Int) defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[DeserializedClassConstructorDescriptor]

'toArray' @ [102:52] ==> public final fun toArray(): IntArray defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[DeserializedSimpleFunctionDescriptor]

'transformJar' @ [103:23] ==> private final fun transformJar(jarPath: File, transformEntry: (String, ByteArray) -> ByteArray, entriesToDelete: Set<String> = ...): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion[SimpleFunctionDescriptorImpl]

'compileLibrary' @ [104:17] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'libraryName' @ [104:32] ==> value-parameter libraryName: String defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestKotlinLibraryWithWrongMetadataVersion[ValueParameterDescriptorImpl]

'WrongBytecodeVersionTest' @ [106:21] ==> public companion object defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest[FakeCallableDescriptorForObject]

'transformMetadataInClassFile' @ [106:46] ==> public final fun transformMetadataInClassFile(bytes: ByteArray, transform: (fieldName: String, value: Any?) -> Any?): ByteArray defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion[SimpleFunctionDescriptorImpl]

'bytes' @ [106:75] ==> value-parameter bytes: ByteArray defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestKotlinLibraryWithWrongMetadataVersion.<anonymous>[ValueParameterDescriptorImpl]

'additionalTransformation' @ [107:25] ==> value-parameter additionalTransformation: ((fieldName: String, value: Any?) -> Any?)? defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestKotlinLibraryWithWrongMetadataVersion[ValueParameterDescriptorImpl]

'invoke' @ [107:51] ==> public abstract operator fun invoke(fieldName: @ParameterName String, value: @ParameterName Any?): Any? defined in kotlin.Function2[FunctionInvokeDescriptor]

'fieldName' @ [107:58] ==> value-parameter fieldName: String defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestKotlinLibraryWithWrongMetadataVersion.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [107:69] ==> value-parameter value: Any? defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestKotlinLibraryWithWrongMetadataVersion.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [108:25] ==> val version: IntArray defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestKotlinLibraryWithWrongMetadataVersion[LocalVariableDescriptor]

'takeIf' @ [108:33] ==> @InlineOnly @SinceKotlin public inline fun <T> IntArray.takeIf(predicate: (IntArray) -> Boolean): IntArray? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntArray

'==' @ [108:42] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'METADATA_VERSION_FIELD_NAME' @ [108:61] ==> public const final val METADATA_VERSION_FIELD_NAME: String defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'fieldName' @ [108:92] ==> value-parameter fieldName: String defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestKotlinLibraryWithWrongMetadataVersion.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'compileKotlin' @ [112:9] ==> protected final fun compileKotlin(fileName: String, output: File, classpath: List<File>, compiler: CLICompiler<*>, additionalOptions: List<String>, expectedFileName: String?): Pair<String, ExitCode> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'tmpdir' @ [112:36] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'listOf' @ [112:44] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'library' @ [112:51] ==> val library: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestKotlinLibraryWithWrongMetadataVersion[LocalVariableDescriptor]

'K2JVMCompiler' @ [112:61] ==> public constructor K2JVMCompiler() defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[DeserializedClassConstructorDescriptor]

'additionalOptions' @ [112:78] ==> value-parameter vararg additionalOptions: String defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestKotlinLibraryWithWrongMetadataVersion[ValueParameterDescriptorImpl]

'toList' @ [112:96] ==> public fun <T> Array<out String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'compileJsLibrary' @ [116:23] ==> protected final fun compileJsLibrary(libraryName: String): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'libraryName' @ [116:40] ==> value-parameter libraryName: String defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestKotlinLibraryWithWrongMetadataVersionJs[ValueParameterDescriptorImpl]

'library' @ [118:9] ==> val library: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestKotlinLibraryWithWrongMetadataVersionJs[LocalVariableDescriptor]

'writeText' @ [118:17] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'library' @ [118:27] ==> val library: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestKotlinLibraryWithWrongMetadataVersionJs[LocalVariableDescriptor]

'readText' @ [118:35] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'UTF_8' @ [118:53] ==> @field:JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[DeserializedPropertyDescriptor]

'replace' @ [118:60] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'+' @ [119:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'INSTANCE' @ [119:41] ==> @field:JvmField public final val INSTANCE: JsMetadataVersion defined in org.jetbrains.kotlin.utils.JsMetadataVersion.Companion[DeserializedPropertyDescriptor]

'toInteger' @ [119:50] ==> public final fun toInteger(): Int defined in org.jetbrains.kotlin.utils.JsMetadataVersion[DeserializedSimpleFunctionDescriptor]

'+' @ [120:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'JsMetadataVersion' @ [120:23] ==> public constructor JsMetadataVersion(vararg numbers: Int) defined in org.jetbrains.kotlin.utils.JsMetadataVersion[DeserializedClassConstructorDescriptor]

'toInteger' @ [120:51] ==> public final fun toInteger(): Int defined in org.jetbrains.kotlin.utils.JsMetadataVersion[DeserializedSimpleFunctionDescriptor]

'UTF_8' @ [121:21] ==> @field:JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[DeserializedPropertyDescriptor]

'compileKotlin' @ [123:9] ==> protected final fun compileKotlin(fileName: String, output: File, classpath: List<File>, compiler: CLICompiler<*>, additionalOptions: List<String>, expectedFileName: String?): Pair<String, ExitCode> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'File' @ [123:36] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [123:41] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'listOf' @ [123:62] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'library' @ [123:69] ==> val library: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestKotlinLibraryWithWrongMetadataVersionJs[LocalVariableDescriptor]

'K2JSCompiler' @ [123:79] ==> public constructor K2JSCompiler() defined in org.jetbrains.kotlin.cli.js.K2JSCompiler[JavaClassConstructorDescriptor]

'additionalOptions' @ [123:95] ==> value-parameter vararg additionalOptions: String defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestKotlinLibraryWithWrongMetadataVersionJs[ValueParameterDescriptorImpl]

'toList' @ [123:113] ==> public fun <T> Array<out String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'setProperty' @ [135:20] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'TEST_IS_PRE_RELEASE_SYSTEM_PROPERTY' @ [135:32] ==> public const final val TEST_IS_PRE_RELEASE_SYSTEM_PROPERTY: String defined in org.jetbrains.kotlin.config.KotlinCompilerVersion[JavaPropertyDescriptor]

'when (compiler) {
                is K2JSCompiler -> compileJsLibrary(libraryName)
                is K2JVMCompiler -> compileLibrary(libraryName)
                else -> throw UnsupportedOperationException(compiler.toString())
            }' @ [136:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: File, entry1: File, entry2: File): File[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> File

'compiler' @ [136:19] ==> value-parameter compiler: CLICompiler<*> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestPreReleaseKotlinLibrary[ValueParameterDescriptorImpl]

'compileJsLibrary' @ [137:36] ==> protected final fun compileJsLibrary(libraryName: String): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'libraryName' @ [137:53] ==> value-parameter libraryName: String defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestPreReleaseKotlinLibrary[ValueParameterDescriptorImpl]

'compileLibrary' @ [138:37] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'libraryName' @ [138:52] ==> value-parameter libraryName: String defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestPreReleaseKotlinLibrary[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [139:31] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'compiler' @ [139:61] ==> value-parameter compiler: CLICompiler<*> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestPreReleaseKotlinLibrary[ValueParameterDescriptorImpl]

'toString' @ [139:70] ==> public open fun toString(): String defined in org.jetbrains.kotlin.cli.common.CLICompiler[DeserializedSimpleFunctionDescriptor]

'clearProperty' @ [143:20] ==> public open fun clearProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'TEST_IS_PRE_RELEASE_SYSTEM_PROPERTY' @ [143:34] ==> public const final val TEST_IS_PRE_RELEASE_SYSTEM_PROPERTY: String defined in org.jetbrains.kotlin.config.KotlinCompilerVersion[JavaPropertyDescriptor]

'setProperty' @ [147:20] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'TEST_IS_PRE_RELEASE_SYSTEM_PROPERTY' @ [147:32] ==> public const final val TEST_IS_PRE_RELEASE_SYSTEM_PROPERTY: String defined in org.jetbrains.kotlin.config.KotlinCompilerVersion[JavaPropertyDescriptor]

'compileKotlin' @ [148:13] ==> protected final fun compileKotlin(fileName: String, output: File, classpath: List<File>, compiler: CLICompiler<*>, additionalOptions: List<String>, expectedFileName: String?): Pair<String, ExitCode> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'usageDestination' @ [148:40] ==> value-parameter usageDestination: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestPreReleaseKotlinLibrary[ValueParameterDescriptorImpl]

'listOf' @ [148:58] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'result' @ [148:65] ==> val result: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestPreReleaseKotlinLibrary[LocalVariableDescriptor]

'compiler' @ [148:74] ==> value-parameter compiler: CLICompiler<*> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestPreReleaseKotlinLibrary[ValueParameterDescriptorImpl]

'additionalOptions' @ [148:84] ==> value-parameter vararg additionalOptions: String defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.doTestPreReleaseKotlinLibrary[ValueParameterDescriptorImpl]

'toList' @ [148:102] ==> public fun <T> Array<out String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'clearProperty' @ [151:20] ==> public open fun clearProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'TEST_IS_PRE_RELEASE_SYSTEM_PROPERTY' @ [151:34] ==> public const final val TEST_IS_PRE_RELEASE_SYSTEM_PROPERTY: String defined in org.jetbrains.kotlin.config.KotlinCompilerVersion[JavaPropertyDescriptor]

'compileKotlin' @ [158:9] ==> protected final fun compileKotlin(fileName: String, output: File, classpath: List<File>, compiler: CLICompiler<*>, additionalOptions: List<String>, expectedFileName: String?): Pair<String, ExitCode> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'tmpdir' @ [158:34] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'listOf' @ [158:42] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'compileLibrary' @ [158:49] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'analyzeAndGetAllDescriptors' @ [162:30] ==> private final fun analyzeAndGetAllDescriptors(vararg extraClassPath: File): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'compileLibrary' @ [162:58] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'assertEquals' @ [163:9] ==> public open fun assertEquals(p0: (String..String?), p1: Int, p2: Int): Unit defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaMethodDescriptor]

'allDescriptors' @ [163:22] ==> val allDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testDuplicateObjectInBinaryAndSources[LocalVariableDescriptor]

'toString' @ [163:37] ==> public open fun toString(): String defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'allDescriptors' @ [163:52] ==> val allDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testDuplicateObjectInBinaryAndSources[LocalVariableDescriptor]

'size' @ [163:67] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'allDescriptors' @ [164:28] ==> val allDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testDuplicateObjectInBinaryAndSources[LocalVariableDescriptor]

'assertTrue' @ [165:13] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaMethodDescriptor]

'+' @ [165:24] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [165:41] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testDuplicateObjectInBinaryAndSources[LocalVariableDescriptor]

'descriptor' @ [165:53] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testDuplicateObjectInBinaryAndSources[LocalVariableDescriptor]

'name' @ [165:64] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [165:69] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'assertTrue' @ [166:13] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaMethodDescriptor]

'+' @ [166:24] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [166:50] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testDuplicateObjectInBinaryAndSources[LocalVariableDescriptor]

'isObject' @ [166:62] ==> public open fun isObject(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [166:71] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testDuplicateObjectInBinaryAndSources[LocalVariableDescriptor]

'copyJarFileWithoutEntry' @ [171:25] ==> private final fun copyJarFileWithoutEntry(jarPath: File, vararg entriesToDelete: String): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion[SimpleFunctionDescriptorImpl]

'compileLibrary' @ [171:49] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'analyzeAndGetAllDescriptors' @ [172:30] ==> private final fun analyzeAndGetAllDescriptors(vararg extraClassPath: File): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'brokenJar' @ [172:58] ==> val brokenJar: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testBrokenJarWithNoClassForObject[LocalVariableDescriptor]

'assertEmpty' @ [173:9] ==> protected/*protected static*/ open fun <T : (Any..Any?)> assertEmpty(p0: (String..String?), p1: (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)): Unit defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'+' @ [173:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'allDescriptors' @ [173:58] ==> val allDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testBrokenJarWithNoClassForObject[LocalVariableDescriptor]

'allDescriptors' @ [173:74] ==> val allDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testBrokenJarWithNoClassForObject[LocalVariableDescriptor]

'doTestWithTxt' @ [177:9] ==> private final fun doTestWithTxt(vararg extraClassPath: File): Unit defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'compileLibrary' @ [177:23] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'compileLibrary' @ [177:52] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'doTestWithTxt' @ [181:9] ==> private final fun doTestWithTxt(vararg extraClassPath: File): Unit defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'copyJarFileWithoutEntry' @ [181:23] ==> private final fun copyJarFileWithoutEntry(jarPath: File, vararg entriesToDelete: String): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion[SimpleFunctionDescriptorImpl]

'compileLibrary' @ [181:47] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'compileLibrary' @ [188:23] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'createEnvironment' @ [189:27] ==> private final fun createEnvironment(extraClassPath: List<File>): KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'listOf' @ [189:45] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'library' @ [189:52] ==> val library: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testNoWarningsOnJavaKotlinInheritance[LocalVariableDescriptor]

'loadJetFile' @ [191:38] ==> @NotNull public open fun loadJetFile(@NotNull p0: Project, @NotNull p1: File): KtFile defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'environment' @ [191:50] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testNoWarningsOnJavaKotlinInheritance[LocalVariableDescriptor]

'project' @ [191:62] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'getTestDataFileWithExtension' @ [191:71] ==> protected final fun getTestDataFileWithExtension(extension: String): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'JvmResolveUtil' @ [192:22] ==> public object JvmResolveUtil defined in org.jetbrains.kotlin.resolve.lazy[FakeCallableDescriptorForObject]

'analyze' @ [192:37] ==> @JvmStatic public final fun analyze(file: KtFile, environment: KotlinCoreEnvironment): AnalysisResult defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil[DeserializedSimpleFunctionDescriptor]

'ktFile' @ [192:45] ==> val ktFile: KtFile defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testNoWarningsOnJavaKotlinInheritance[LocalVariableDescriptor]

'environment' @ [192:53] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testNoWarningsOnJavaKotlinInheritance[LocalVariableDescriptor]

'result' @ [193:9] ==> val result: AnalysisResult defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testNoWarningsOnJavaKotlinInheritance[LocalVariableDescriptor]

'throwIfError' @ [193:16] ==> public final fun throwIfError(): Unit defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedSimpleFunctionDescriptor]

'AnalyzerWithCompilerReport' @ [195:9] ==> public companion object defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport[FakeCallableDescriptorForObject]

'reportDiagnostics' @ [195:36] ==> public final fun reportDiagnostics(diagnostics: Diagnostics, messageCollector: MessageCollector): Boolean defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport.Companion[DeserializedSimpleFunctionDescriptor]

'result' @ [196:17] ==> val result: AnalysisResult defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testNoWarningsOnJavaKotlinInheritance[LocalVariableDescriptor]

'bindingContext' @ [196:24] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'diagnostics' @ [196:39] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'PrintingMessageCollector' @ [197:17] ==> public constructor PrintingMessageCollector(@NotNull p0: PrintStream, @NotNull p1: MessageRenderer, p2: Boolean) defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaClassConstructorDescriptor]

'err' @ [197:49] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'PLAIN_FULL_PATHS' @ [197:70] ==> public final val PLAIN_FULL_PATHS: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaPropertyDescriptor]

'assertEquals' @ [200:9] ==> public open fun assertEquals(p0: (String..String?), p1: Int, p2: Int): Unit defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaMethodDescriptor]

'result' @ [200:59] ==> val result: AnalysisResult defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testNoWarningsOnJavaKotlinInheritance[LocalVariableDescriptor]

'bindingContext' @ [200:66] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'diagnostics' @ [200:81] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'count' @ [200:93] ==> public fun <T> Iterable<Diagnostic>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'doTestBrokenLibrary' @ [204:9] ==> private final fun doTestBrokenLibrary(libraryName: String, vararg pathsToDelete: String): Unit defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'doTestBrokenLibrary' @ [208:9] ==> private final fun doTestBrokenLibrary(libraryName: String, vararg pathsToDelete: String): Unit defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'doTestBrokenLibrary' @ [212:9] ==> private final fun doTestBrokenLibrary(libraryName: String, vararg pathsToDelete: String): Unit defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'doTestBrokenLibrary' @ [216:9] ==> private final fun doTestBrokenLibrary(libraryName: String, vararg pathsToDelete: String): Unit defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'doTestBrokenLibrary' @ [220:9] ==> private final fun doTestBrokenLibrary(libraryName: String, vararg pathsToDelete: String): Unit defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'copyJarFileWithoutEntry' @ [224:24] ==> private final fun copyJarFileWithoutEntry(jarPath: File, vararg entriesToDelete: String): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion[SimpleFunctionDescriptorImpl]

'compileLibrary' @ [224:48] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'copyJarFileWithoutEntry' @ [226:24] ==> private final fun copyJarFileWithoutEntry(jarPath: File, vararg entriesToDelete: String): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion[SimpleFunctionDescriptorImpl]

'compileLibrary' @ [226:48] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'compileKotlin' @ [228:9] ==> protected final fun compileKotlin(fileName: String, output: File, classpath: List<File>, compiler: CLICompiler<*>, additionalOptions: List<String>, expectedFileName: String?): Pair<String, ExitCode> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'tmpdir' @ [228:36] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'listOf' @ [228:44] ==> public fun <T> listOf(vararg elements: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'library1' @ [228:51] ==> val library1: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testMissingDependencyConflictingLibraries[LocalVariableDescriptor]

'library2' @ [228:61] ==> val library2: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testMissingDependencyConflictingLibraries[LocalVariableDescriptor]

'doTestBrokenLibrary' @ [232:9] ==> private final fun doTestBrokenLibrary(libraryName: String, vararg pathsToDelete: String): Unit defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'copyJarFileWithoutEntry' @ [236:24] ==> private final fun copyJarFileWithoutEntry(jarPath: File, vararg entriesToDelete: String): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion[SimpleFunctionDescriptorImpl]

'compileLibrary' @ [236:48] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'copyJarFileWithoutEntry' @ [237:24] ==> private final fun copyJarFileWithoutEntry(jarPath: File, vararg entriesToDelete: String): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion[SimpleFunctionDescriptorImpl]

'compileLibrary' @ [237:48] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'compileKotlin' @ [238:9] ==> protected final fun compileKotlin(fileName: String, output: File, classpath: List<File>, compiler: CLICompiler<*>, additionalOptions: List<String>, expectedFileName: String?): Pair<String, ExitCode> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'tmpdir' @ [238:36] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'listOf' @ [238:44] ==> public fun <T> listOf(vararg elements: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'library1' @ [238:51] ==> val library1: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testMissingDependencyJavaConflictingLibraries[LocalVariableDescriptor]

'library2' @ [238:61] ==> val library2: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testMissingDependencyJavaConflictingLibraries[LocalVariableDescriptor]

'doTestBrokenLibrary' @ [242:9] ==> private final fun doTestBrokenLibrary(libraryName: String, vararg pathsToDelete: String): Unit defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'doTestPreReleaseKotlinLibrary' @ [246:9] ==> private final fun doTestPreReleaseKotlinLibrary(compiler: CLICompiler<*>, libraryName: String, usageDestination: File, vararg additionalOptions: String): Unit defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'K2JVMCompiler' @ [246:39] ==> public constructor K2JVMCompiler() defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[DeserializedClassConstructorDescriptor]

'tmpdir' @ [246:67] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'doTestPreReleaseKotlinLibrary' @ [250:9] ==> private final fun doTestPreReleaseKotlinLibrary(compiler: CLICompiler<*>, libraryName: String, usageDestination: File, vararg additionalOptions: String): Unit defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'K2JSCompiler' @ [250:39] ==> public constructor K2JSCompiler() defined in org.jetbrains.kotlin.cli.js.K2JSCompiler[JavaClassConstructorDescriptor]

'File' @ [250:66] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [250:71] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'doTestPreReleaseKotlinLibrary' @ [254:9] ==> private final fun doTestPreReleaseKotlinLibrary(compiler: CLICompiler<*>, libraryName: String, usageDestination: File, vararg additionalOptions: String): Unit defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'K2JVMCompiler' @ [254:39] ==> public constructor K2JVMCompiler() defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[DeserializedClassConstructorDescriptor]

'tmpdir' @ [254:67] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'doTestPreReleaseKotlinLibrary' @ [258:9] ==> private final fun doTestPreReleaseKotlinLibrary(compiler: CLICompiler<*>, libraryName: String, usageDestination: File, vararg additionalOptions: String): Unit defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'K2JSCompiler' @ [258:39] ==> public constructor K2JSCompiler() defined in org.jetbrains.kotlin.cli.js.K2JSCompiler[JavaClassConstructorDescriptor]

'File' @ [258:66] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [258:71] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'doTestKotlinLibraryWithWrongMetadataVersion' @ [262:9] ==> private final fun doTestKotlinLibraryWithWrongMetadataVersion(libraryName: String, additionalTransformation: ((fieldName: String, value: Any?) -> Any?)?, vararg additionalOptions: String): Unit defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'doTestKotlinLibraryWithWrongMetadataVersionJs' @ [266:9] ==> private final fun doTestKotlinLibraryWithWrongMetadataVersionJs(libraryName: String, vararg additionalOptions: String): Unit defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'doTestKotlinLibraryWithWrongMetadataVersion' @ [270:9] ==> private final fun doTestKotlinLibraryWithWrongMetadataVersion(libraryName: String, additionalTransformation: ((fieldName: String, value: Any?) -> Any?)?, vararg additionalOptions: String): Unit defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'if (JvmAnnotationNames.METADATA_DATA_FIELD_NAME == name) {
                @Suppress("UNCHECKED_CAST")
                val strings = value as Array<String>
                strings.map { string ->
                    String(string.toByteArray().map { x -> x xor 42 }.toTypedArray().toByteArray())
                }.toTypedArray()
            }
            else null' @ [271:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Array<String>?, elseBranch: Array<String>?): Array<String>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Array<String>?

'==' @ [271:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'METADATA_DATA_FIELD_NAME' @ [271:36] ==> public const final val METADATA_DATA_FIELD_NAME: String defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'name' @ [271:64] ==> value-parameter name: String defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testWrongMetadataVersionBadMetadata.<anonymous>[ValueParameterDescriptorImpl]

'Suppress' @ [272:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'value' @ [273:31] ==> value-parameter value: Any? defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testWrongMetadataVersionBadMetadata.<anonymous>[ValueParameterDescriptorImpl]

'strings' @ [274:17] ==> val strings: Array<String> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testWrongMetadataVersionBadMetadata.<anonymous>[LocalVariableDescriptor]

'map' @ [274:25] ==> public inline fun <T, R> Array<out String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'String' @ [275:21] ==> @InlineOnly public inline fun String(bytes: ByteArray): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'string' @ [275:28] ==> value-parameter string: String defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testWrongMetadataVersionBadMetadata.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toByteArray' @ [275:35] ==> @InlineOnly public inline fun String.toByteArray(charset: Charset = ...): ByteArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [275:49] ==> public inline fun <R> ByteArray.map(transform: (Byte) -> Byte): List<Byte> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Byte

'x' @ [275:60] ==> value-parameter x: Byte defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testWrongMetadataVersionBadMetadata.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toTypedArray' @ [275:71] ==> public inline fun <reified T> Collection<Byte>.toTypedArray(): Array<Byte> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Byte

'toByteArray' @ [275:86] ==> public fun Array<out Byte>.toByteArray(): ByteArray defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'toTypedArray' @ [276:19] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'doTestKotlinLibraryWithWrongMetadataVersion' @ [283:9] ==> private final fun doTestKotlinLibraryWithWrongMetadataVersion(libraryName: String, additionalTransformation: ((fieldName: String, value: Any?) -> Any?)?, vararg additionalOptions: String): Unit defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'if (JvmAnnotationNames.METADATA_STRINGS_FIELD_NAME == name) arrayOf<String>() else null' @ [284:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Array<String>?, elseBranch: Array<String>?): Array<String>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Array<String>?

'==' @ [284:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'METADATA_STRINGS_FIELD_NAME' @ [284:36] ==> public const final val METADATA_STRINGS_FIELD_NAME: String defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'name' @ [284:67] ==> value-parameter name: String defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testWrongMetadataVersionBadMetadata2.<anonymous>[ValueParameterDescriptorImpl]

'arrayOf' @ [284:73] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'doTestKotlinLibraryWithWrongMetadataVersion' @ [289:9] ==> private final fun doTestKotlinLibraryWithWrongMetadataVersion(libraryName: String, additionalTransformation: ((fieldName: String, value: Any?) -> Any?)?, vararg additionalOptions: String): Unit defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'doTestKotlinLibraryWithWrongMetadataVersionJs' @ [293:9] ==> private final fun doTestKotlinLibraryWithWrongMetadataVersionJs(libraryName: String, vararg additionalOptions: String): Unit defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'compileKotlin' @ [298:9] ==> protected final fun compileKotlin(fileName: String, output: File, classpath: List<File>, compiler: CLICompiler<*>, additionalOptions: List<String>, expectedFileName: String?): Pair<String, ExitCode> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'tmpdir' @ [298:42] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'File' @ [300:30] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [300:35] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'absolutePath' @ [300:42] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'ClassWriter' @ [301:18] ==> public constructor ClassWriter(p0: Int) defined in org.jetbrains.org.objectweb.asm.ClassWriter[JavaClassConstructorDescriptor]

'ASM5' @ [301:38] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ClassReader' @ [302:9] ==> public constructor ClassReader(p0: (ByteArray..ByteArray?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'inlineFunClass' @ [302:21] ==> val inlineFunClass: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInlineFunWithoutDebugInfo[LocalVariableDescriptor]

'readBytes' @ [302:36] ==> public fun File.readBytes(): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'accept' @ [302:49] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'ClassVisitor' @ [302:65] ==> public constructor ClassVisitor(p0: Int, p1: (ClassVisitor..ClassVisitor?)) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [302:86] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'cw' @ [302:92] ==> val cw: ClassWriter defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInlineFunWithoutDebugInfo[LocalVariableDescriptor]

'assert' @ [308:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'inlineFunClass' @ [308:16] ==> val inlineFunClass: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInlineFunWithoutDebugInfo[LocalVariableDescriptor]

'delete' @ [308:31] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'assert' @ [309:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [309:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inlineFunClass' @ [309:17] ==> val inlineFunClass: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInlineFunWithoutDebugInfo[LocalVariableDescriptor]

'exists' @ [309:32] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'inlineFunClass' @ [311:9] ==> val inlineFunClass: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInlineFunWithoutDebugInfo[LocalVariableDescriptor]

'writeBytes' @ [311:24] ==> public fun File.writeBytes(array: ByteArray): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'cw' @ [311:35] ==> val cw: ClassWriter defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInlineFunWithoutDebugInfo[LocalVariableDescriptor]

'toByteArray' @ [311:38] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in org.jetbrains.org.objectweb.asm.ClassWriter[JavaMethodDescriptor]

'compileKotlin' @ [313:9] ==> protected final fun compileKotlin(fileName: String, output: File, classpath: List<File>, compiler: CLICompiler<*>, additionalOptions: List<String>, expectedFileName: String?): Pair<String, ExitCode> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'tmpdir' @ [313:36] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'listOf' @ [313:44] ==> public fun <T> listOf(element: (File..File?)): List<(File..File?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'tmpdir' @ [313:51] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'File' @ [316:26] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [316:31] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'absolutePath' @ [316:38] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'ClassReader' @ [317:9] ==> public constructor ClassReader(p0: (ByteArray..ByteArray?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'resultFile' @ [317:21] ==> val resultFile: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInlineFunWithoutDebugInfo[LocalVariableDescriptor]

'readBytes' @ [317:32] ==> public fun File.readBytes(): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'accept' @ [317:45] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'ClassVisitor' @ [317:61] ==> public constructor ClassVisitor(p0: Int) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [317:82] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'debugInfo' @ [319:17] ==> var debugInfo: String? defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInlineFunWithoutDebugInfo[LocalVariableDescriptor]

'debug' @ [319:29] ==> value-parameter debug: String? defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInlineFunWithoutDebugInfo.<no name provided>.visitSource[ValueParameterDescriptorImpl]

'+' @ [323:24] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'trimIndent' @ [334:13] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (GENERATE_SMAP) {
            assertEquals(expected, debugInfo)
        }
        else {
            assertEquals(null, debugInfo)
        }' @ [336:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'GENERATE_SMAP' @ [336:13] ==> public const val GENERATE_SMAP: Boolean defined in org.jetbrains.kotlin.codegen.inline[DeserializedPropertyDescriptor]

'assertEquals' @ [337:13] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaMethodDescriptor]

'expected' @ [337:26] ==> val expected: String defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInlineFunWithoutDebugInfo[LocalVariableDescriptor]

'debugInfo' @ [337:36] ==> var debugInfo: String? defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInlineFunWithoutDebugInfo[LocalVariableDescriptor]

'assertEquals' @ [340:13] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaMethodDescriptor]

'debugInfo' @ [340:32] ==> var debugInfo: String? defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInlineFunWithoutDebugInfo[LocalVariableDescriptor]

'compileLibrary' @ [345:24] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'compileLibrary' @ [346:21] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'arrayOf' @ [346:63] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: File): Array<File> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> File

'library1' @ [346:71] ==> val library1: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testReplaceAnnotationClassWithInterface[LocalVariableDescriptor]

'compileLibrary' @ [347:24] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'doTestWithTxt' @ [348:9] ==> private final fun doTestWithTxt(vararg extraClassPath: File): Unit defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'usage' @ [348:23] ==> val usage: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testReplaceAnnotationClassWithInterface[LocalVariableDescriptor]

'library2' @ [348:30] ==> val library2: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testReplaceAnnotationClassWithInterface[LocalVariableDescriptor]

'compileLibrary' @ [352:23] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'compileKotlin' @ [353:9] ==> protected final fun compileKotlin(fileName: String, output: File, classpath: List<File>, compiler: CLICompiler<*>, additionalOptions: List<String>, expectedFileName: String?): Pair<String, ExitCode> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'tmpdir' @ [353:34] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'listOf' @ [353:42] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'library' @ [353:49] ==> val library: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testProhibitNestedClassesByDollarName[LocalVariableDescriptor]

'compileLibrary' @ [357:23] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'compileKotlin' @ [358:9] ==> protected final fun compileKotlin(fileName: String, output: File, classpath: List<File>, compiler: CLICompiler<*>, additionalOptions: List<String>, expectedFileName: String?): Pair<String, ExitCode> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'tmpdir' @ [358:34] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'listOf' @ [358:42] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'library' @ [358:49] ==> val library: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testTypeAliasesAreInvisibleInCompatibilityMode[LocalVariableDescriptor]

'K2JVMCompiler' @ [358:59] ==> public constructor K2JVMCompiler() defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[DeserializedClassConstructorDescriptor]

'listOf' @ [358:76] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'compileLibrary' @ [362:22] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'File' @ [362:62] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [362:67] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'File' @ [363:9] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDataDirectory' @ [363:14] ==> protected final val testDataDirectory: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[PropertyDescriptorImpl]

'copyTo' @ [363:59] ==> public fun File.copyTo(target: File, overwrite: Boolean = ..., bufferSize: Int = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'File' @ [363:66] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'output' @ [363:71] ==> val output: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInnerClassPackageConflict[LocalVariableDescriptor]

'MockLibraryUtil' @ [364:9] ==> public object MockLibraryUtil defined in org.jetbrains.kotlin.test[FakeCallableDescriptorForObject]

'createJarFile' @ [364:25] ==> public final fun createJarFile(contentDir: File, dirToAdd: File, jarName: String, sourcesPath: String? = ...): File defined in org.jetbrains.kotlin.test.MockLibraryUtil[DeserializedSimpleFunctionDescriptor]

'tmpdir' @ [364:39] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'output' @ [364:47] ==> val output: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInnerClassPackageConflict[LocalVariableDescriptor]

'compileKotlin' @ [365:9] ==> protected final fun compileKotlin(fileName: String, output: File, classpath: List<File>, compiler: CLICompiler<*>, additionalOptions: List<String>, expectedFileName: String?): Pair<String, ExitCode> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'tmpdir' @ [365:36] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'listOf' @ [365:44] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'File' @ [365:51] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [365:56] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'compileLibrary' @ [369:24] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'File' @ [369:65] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [369:70] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'compileLibrary' @ [370:24] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'File' @ [370:65] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [370:70] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'visitFiles' @ [373:18] ==> public final fun visitFiles(@NotNull p0: File, @NotNull p1: ((File..File?)) -> Boolean): Boolean defined in com.intellij.openapi.util.io.FileUtil[SamAdapterFunctionDescriptor]

'library2' @ [373:29] ==> val library2: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInnerClassPackageConflict2[LocalVariableDescriptor]

'!' @ [374:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [374:18] ==> value-parameter file: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInnerClassPackageConflict2.<anonymous>[ValueParameterDescriptorImpl]

'isDirectory' @ [374:23] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'File' @ [375:31] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'library1' @ [375:36] ==> val library1: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInnerClassPackageConflict2[LocalVariableDescriptor]

'file' @ [375:46] ==> value-parameter file: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInnerClassPackageConflict2.<anonymous>[ValueParameterDescriptorImpl]

'relativeTo' @ [375:51] ==> public fun File.relativeTo(base: File): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'library2' @ [375:62] ==> val library2: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInnerClassPackageConflict2[LocalVariableDescriptor]

'path' @ [375:72] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'!' @ [376:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'newFile' @ [376:22] ==> val newFile: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInnerClassPackageConflict2.<anonymous>[LocalVariableDescriptor]

'parentFile' @ [376:30] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'exists' @ [376:41] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'assert' @ [377:21] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'newFile' @ [377:28] ==> val newFile: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInnerClassPackageConflict2.<anonymous>[LocalVariableDescriptor]

'parentFile' @ [377:36] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'mkdirs' @ [377:47] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'assert' @ [379:17] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'file' @ [379:24] ==> value-parameter file: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInnerClassPackageConflict2.<anonymous>[ValueParameterDescriptorImpl]

'renameTo' @ [379:29] ==> public open fun renameTo(p0: (File..File?)): Boolean defined in java.io.File[JavaMethodDescriptor]

'newFile' @ [379:38] ==> val newFile: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInnerClassPackageConflict2.<anonymous>[LocalVariableDescriptor]

'compileKotlin' @ [384:9] ==> protected final fun compileKotlin(fileName: String, output: File, classpath: List<File>, compiler: CLICompiler<*>, additionalOptions: List<String>, expectedFileName: String?): Pair<String, ExitCode> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'tmpdir' @ [384:36] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'listOf' @ [384:44] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'library1' @ [384:51] ==> val library1: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testInnerClassPackageConflict2[LocalVariableDescriptor]

'compileLibrary' @ [388:23] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'listOf' @ [388:69] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'compileKotlin' @ [389:9] ==> protected final fun compileKotlin(fileName: String, output: File, classpath: List<File>, compiler: CLICompiler<*>, additionalOptions: List<String>, expectedFileName: String?): Pair<String, ExitCode> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'tmpdir' @ [389:36] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'listOf' @ [389:44] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'library' @ [389:51] ==> val library: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testWrongInlineTarget[LocalVariableDescriptor]

'intArrayOf' @ [393:23] ==> public fun intArrayOf(vararg elements: Int): IntArray defined in kotlin[DeserializedSimpleFunctionDescriptor]

'listOf' @ [394:23] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'transformJar' @ [395:23] ==> private final fun transformJar(jarPath: File, transformEntry: (String, ByteArray) -> ByteArray, entriesToDelete: Set<String> = ...): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion[SimpleFunctionDescriptorImpl]

'compileLibrary' @ [396:17] ==> protected final fun compileLibrary(libraryName: String, destination: File, additionalOptions: List<String>, compileJava: (sourceDir: File, javaFiles: List<File>, outputDir: File) -> Boolean, checkKotlinOutput: (String) -> Unit, manifest: Manifest?, vararg extraClassPath: File): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'options' @ [396:63] ==> val options: List<String> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testObsoleteInlineSuspend[LocalVariableDescriptor]

'component1' @ [398:26] ==> public final operator fun component1(): ByteArray defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [398:39] ==> public final operator fun component2(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'stripSuspensionMarksToImitateLegacyCompiler' @ [398:57] ==> private final fun stripSuspensionMarksToImitateLegacyCompiler(bytes: ByteArray): Pair<ByteArray, Int> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion[SimpleFunctionDescriptorImpl]

'transformMetadataInClassFile' @ [399:50] ==> public final fun transformMetadataInClassFile(bytes: ByteArray, transform: (fieldName: String, value: Any?) -> Any?): ByteArray defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion[SimpleFunctionDescriptorImpl]

'bytes' @ [399:79] ==> value-parameter bytes: ByteArray defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testObsoleteInlineSuspend.<anonymous>[ValueParameterDescriptorImpl]

'if (name == JvmAnnotationNames.BYTECODE_VERSION_FIELD_NAME) version else null' @ [400:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IntArray?, elseBranch: IntArray?): IntArray?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IntArray?

'name' @ [400:33] ==> value-parameter name: String defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testObsoleteInlineSuspend.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'BYTECODE_VERSION_FIELD_NAME' @ [400:60] ==> public const final val BYTECODE_VERSION_FIELD_NAME: String defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'version' @ [400:89] ==> val version: IntArray defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testObsoleteInlineSuspend[LocalVariableDescriptor]

'assertEquals' @ [403:21] ==> public open fun assertEquals(p0: Int, p1: Int): Unit defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaMethodDescriptor]

'removedCounter' @ [403:37] ==> val removedCounter: Int defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testObsoleteInlineSuspend.<anonymous>[LocalVariableDescriptor]

'resultBytes' @ [404:21] ==> val resultBytes: ByteArray defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testObsoleteInlineSuspend.<anonymous>[LocalVariableDescriptor]

'compileKotlin' @ [406:9] ==> protected final fun compileKotlin(fileName: String, output: File, classpath: List<File>, compiler: CLICompiler<*>, additionalOptions: List<String>, expectedFileName: String?): Pair<String, ExitCode> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[SimpleFunctionDescriptorImpl]

'tmpdir' @ [406:36] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'listOf' @ [406:44] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'library' @ [406:51] ==> val library: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testObsoleteInlineSuspend[LocalVariableDescriptor]

'K2JVMCompiler' @ [406:61] ==> public constructor K2JVMCompiler() defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[DeserializedClassConstructorDescriptor]

'options' @ [407:43] ==> val options: List<String> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testObsoleteInlineSuspend[LocalVariableDescriptor]

'URLClassLoader' @ [408:27] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?), p1: (ClassLoader..ClassLoader?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'arrayOf' @ [408:42] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (URL..URL?)): Array<(URL..URL?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (java.net.URL..java.net.URL?)

'library' @ [408:50] ==> val library: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testObsoleteInlineSuspend[LocalVariableDescriptor]

'toURI' @ [408:58] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'toURL' @ [408:66] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'tmpdir' @ [408:75] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest[JavaPropertyDescriptor]

'toURI' @ [408:82] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'toURL' @ [408:90] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'runtimeJarClassLoader' @ [409:64] ==> @NotNull public open fun runtimeJarClassLoader(): ClassLoader defined in org.jetbrains.kotlin.codegen.forTestCompile.ForTestCompileRuntime[JavaMethodDescriptor]

'Suppress' @ [410:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'classLoader' @ [411:22] ==> val classLoader: URLClassLoader defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testObsoleteInlineSuspend[LocalVariableDescriptor]

'loadClass' @ [412:18] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.net.URLClassLoader[JavaMethodDescriptor]

'getDeclaredMethod' @ [413:18] ==> @CallerSensitive public open fun getDeclaredMethod(p0: (String..String?), vararg p1: (Class<*>..Class<*>?)): (Method..Method?) defined in java.lang.Class[JavaMethodDescriptor]

'invoke' @ [414:18] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'assertEquals' @ [415:9] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaMethodDescriptor]

'result' @ [415:22] ==> val result: Array<String> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testObsoleteInlineSuspend[LocalVariableDescriptor]

'result' @ [415:33] ==> val result: Array<String> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.testObsoleteInlineSuspend[LocalVariableDescriptor]

'ClassWriter' @ [421:26] ==> public constructor ClassWriter(p0: Int) defined in org.jetbrains.org.objectweb.asm.ClassWriter[JavaClassConstructorDescriptor]

'ClassReader' @ [423:13] ==> public constructor ClassReader(p0: (ByteArray..ByteArray?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'bytes' @ [423:25] ==> value-parameter bytes: ByteArray defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler[ValueParameterDescriptorImpl]

'accept' @ [423:32] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'ClassVisitor' @ [423:48] ==> public constructor ClassVisitor(p0: Int, p1: (ClassVisitor..ClassVisitor?)) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [423:69] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'writer' @ [423:75] ==> val writer: ClassWriter defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler[LocalVariableDescriptor]

'super' @ [425:35] ==> <this> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitMethod' @ [425:41] ==> public open fun visitMethod(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: (Array<(String..String?)>..Array<out (String..String?)>?)): (MethodVisitor..MethodVisitor?) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaMethodDescriptor]

'access' @ [425:53] ==> value-parameter access: Int defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'name' @ [425:61] ==> value-parameter name: String? defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'desc' @ [425:67] ==> value-parameter desc: String? defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'signature' @ [425:73] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'exceptions' @ [425:84] ==> value-parameter exceptions: Array<out String>? defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'MethodNode' @ [426:37] ==> public constructor MethodNode(p0: Int, p1: Int, p2: (String..String?), p3: (String..String?), p4: (String..String?), p5: (Array<(String..String?)>..Array<out (String..String?)>?)) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaClassConstructorDescriptor]

'ASM5' @ [426:56] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'access' @ [426:62] ==> value-parameter access: Int defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'name' @ [426:70] ==> value-parameter name: String? defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'desc' @ [426:76] ==> value-parameter desc: String? defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'signature' @ [426:82] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'exceptions' @ [426:93] ==> value-parameter exceptions: Array<out String>? defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'instructions' @ [428:46] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler.<no name provided>.visitMethod.<no name provided>[JavaPropertyDescriptor]

'asSequence' @ [428:59] ==> public fun InsnList.asSequence(): InsnSequence defined in org.jetbrains.kotlin.codegen.optimization.common[DeserializedSimpleFunctionDescriptor]

'flatMap' @ [429:38] ==> public fun <T, R> Sequence<AbstractInsnNode>.flatMap(transform: (AbstractInsnNode) -> Sequence<AbstractInsnNode>): Sequence<AbstractInsnNode> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode
    <R> -> AbstractInsnNode

'suspendMarkerInsns' @ [429:48] ==> private final fun suspendMarkerInsns(insn: AbstractInsnNode): List<AbstractInsnNode> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion[SimpleFunctionDescriptorImpl]

'it' @ [429:67] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler.<no name provided>.visitMethod.<no name provided>.visitEnd.<anonymous>[ValueParameterDescriptorImpl]

'asSequence' @ [429:71] ==> public fun <T> Iterable<AbstractInsnNode>.asSequence(): Sequence<AbstractInsnNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'toList' @ [429:86] ==> public fun <T> Sequence<AbstractInsnNode>.toList(): List<AbstractInsnNode> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'remove' @ [430:29] ==> public fun MethodNode.remove(instructions: Collection<AbstractInsnNode>): Unit defined in org.jetbrains.kotlin.codegen.inline[DeserializedSimpleFunctionDescriptor]

'removeList' @ [430:36] ==> val removeList: List<AbstractInsnNode> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler.<no name provided>.visitMethod.<no name provided>.visitEnd[LocalVariableDescriptor]

'removedCounter' @ [431:29] ==> var removedCounter: Int defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler[LocalVariableDescriptor]

'removeList' @ [431:47] ==> val removeList: List<AbstractInsnNode> defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler.<no name provided>.visitMethod.<no name provided>.visitEnd[LocalVariableDescriptor]

'size' @ [431:58] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'accept' @ [432:29] ==> public open fun accept(p0: (MethodVisitor..MethodVisitor?)): Unit defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler.<no name provided>.visitMethod.<no name provided>[JavaMethodDescriptor]

'superMV' @ [432:36] ==> val superMV: (MethodVisitor..MethodVisitor?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler.<no name provided>.visitMethod[LocalVariableDescriptor]

'writer' @ [437:20] ==> val writer: ClassWriter defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler[LocalVariableDescriptor]

'toByteArray' @ [437:27] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in org.jetbrains.org.objectweb.asm.ClassWriter[JavaMethodDescriptor]

'removedCounter' @ [437:44] ==> var removedCounter: Int defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.stripSuspensionMarksToImitateLegacyCompiler[LocalVariableDescriptor]

'if (insn is MethodInsnNode
                && insn.opcode == Opcodes.INVOKESTATIC
                && insn.owner == "kotlin/jvm/internal/InlineMarker"
                && insn.name == "mark"
                && insn.previous.intConstant in 0..1) listOf(insn, insn.previous)
            else emptyList()' @ [443:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<AbstractInsnNode>, elseBranch: List<AbstractInsnNode>): List<AbstractInsnNode>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<AbstractInsnNode>

'insn' @ [443:17] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.suspendMarkerInsns[ValueParameterDescriptorImpl]

'insn' @ [444:20] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.suspendMarkerInsns[ValueParameterDescriptorImpl]

'opcode' @ [444:25] ==> public final var MethodInsnNode.opcode: Int[MyPropertyDescriptor]

'INVOKESTATIC' @ [444:43] ==> public const final val INVOKESTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insn' @ [445:20] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.suspendMarkerInsns[ValueParameterDescriptorImpl]

'owner' @ [445:25] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'insn' @ [446:20] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.suspendMarkerInsns[ValueParameterDescriptorImpl]

'name' @ [446:25] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'insn' @ [447:20] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.suspendMarkerInsns[ValueParameterDescriptorImpl]

'previous' @ [447:25] ==> public final val MethodInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'intConstant' @ [447:34] ==> public val AbstractInsnNode.intConstant: Int? defined in org.jetbrains.kotlin.codegen.optimization.common[DeserializedPropertyDescriptor]

'..' @ [447:49] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [447:55] ==> public fun <T> listOf(vararg elements: (AbstractInsnNode..AbstractInsnNode?)): List<(AbstractInsnNode..AbstractInsnNode?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)

'insn' @ [447:62] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.suspendMarkerInsns[ValueParameterDescriptorImpl]

'insn' @ [447:68] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.suspendMarkerInsns[ValueParameterDescriptorImpl]

'previous' @ [447:73] ==> public final val MethodInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'emptyList' @ [448:18] ==> public fun <T> emptyList(): List<AbstractInsnNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'transformJar' @ [453:17] ==> private final fun transformJar(jarPath: File, transformEntry: (String, ByteArray) -> ByteArray, entriesToDelete: Set<String> = ...): File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion[SimpleFunctionDescriptorImpl]

'jarPath' @ [453:30] ==> value-parameter jarPath: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.copyJarFileWithoutEntry[ValueParameterDescriptorImpl]

'bytes' @ [453:53] ==> value-parameter bytes: ByteArray defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.copyJarFileWithoutEntry.<anonymous>[ValueParameterDescriptorImpl]

'entriesToDelete' @ [453:62] ==> value-parameter vararg entriesToDelete: String defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.copyJarFileWithoutEntry[ValueParameterDescriptorImpl]

'toSet' @ [453:78] ==> public fun <T> Array<out String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'emptySet' @ [458:48] ==> public fun <T> emptySet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'File' @ [460:30] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'jarPath' @ [460:35] ==> value-parameter jarPath: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar[ValueParameterDescriptorImpl]

'parentFile' @ [460:43] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'jarPath' @ [460:58] ==> value-parameter jarPath: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar[ValueParameterDescriptorImpl]

'nameWithoutExtension' @ [460:66] ==> public val File.nameWithoutExtension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'JarFile' @ [462:13] ==> public constructor JarFile(p0: (File..File?)) defined in java.util.jar.JarFile[JavaClassConstructorDescriptor]

'jarPath' @ [462:21] ==> value-parameter jarPath: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar[ValueParameterDescriptorImpl]

'use' @ [462:30] ==> @InlineOnly public inline fun <T : Closeable?, R> JarFile.use(block: (JarFile) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> JarFile
    <R> -> Unit

'ZipOutputStream' @ [463:17] ==> public constructor ZipOutputStream(p0: (OutputStream..OutputStream?)) defined in java.util.zip.ZipOutputStream[JavaClassConstructorDescriptor]

'outputFile' @ [463:33] ==> val outputFile: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar[LocalVariableDescriptor]

'outputStream' @ [463:44] ==> @InlineOnly public inline fun File.outputStream(): FileOutputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'buffered' @ [463:59] ==> @InlineOnly public inline fun OutputStream.buffered(bufferSize: Int = ...): BufferedOutputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'use' @ [463:71] ==> @InlineOnly public inline fun <T : Closeable?, R> ZipOutputStream.use(block: (ZipOutputStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> ZipOutputStream
    <R> -> Unit

'jar' @ [464:38] ==> value-parameter jar: JarFile defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar.<anonymous>[ValueParameterDescriptorImpl]

'entries' @ [464:42] ==> public open fun entries(): (Enumeration<(JarEntry..JarEntry?)>..Enumeration<(JarEntry..JarEntry?)>?) defined in java.util.jar.JarFile[JavaMethodDescriptor]

'jarEntry' @ [465:36] ==> val jarEntry: (JarEntry..JarEntry?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'name' @ [465:45] ==> public final val JarEntry.name: (String..String?)[MyPropertyDescriptor]

'name' @ [466:29] ==> val name: (String..String?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'entriesToDelete' @ [466:37] ==> value-parameter entriesToDelete: Set<String> = ... defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar[ValueParameterDescriptorImpl]

'jar' @ [468:37] ==> value-parameter jar: JarFile defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar.<anonymous>[ValueParameterDescriptorImpl]

'getInputStream' @ [468:41] ==> public open fun getInputStream(p0: (ZipEntry..ZipEntry?)): (InputStream..InputStream?) defined in java.util.jar.JarFile[JavaMethodDescriptor]

'jarEntry' @ [468:56] ==> val jarEntry: (JarEntry..JarEntry?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'readBytes' @ [468:66] ==> public fun InputStream.readBytes(estimatedSize: Int = ...): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'if (name.endsWith(".class")) transformEntry(name, bytes) else bytes' @ [469:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ByteArray, elseBranch: ByteArray): ByteArray[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ByteArray

'name' @ [469:44] ==> val name: (String..String?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'endsWith' @ [469:49] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'invoke' @ [469:69] ==> public abstract operator fun invoke(p1: String, p2: ByteArray): ByteArray defined in kotlin.Function2[FunctionInvokeDescriptor]

'name' @ [469:84] ==> val name: (String..String?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'bytes' @ [469:90] ==> val bytes: ByteArray defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'bytes' @ [469:102] ==> val bytes: ByteArray defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'JarEntry' @ [470:40] ==> public constructor JarEntry(p0: (String..String?)) defined in java.util.jar.JarEntry[JavaClassConstructorDescriptor]

'name' @ [470:49] ==> val name: (String..String?) defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'newEntry' @ [471:25] ==> val newEntry: JarEntry defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'size' @ [471:34] ==> public final var JarEntry.size: Long[MyPropertyDescriptor]

'newBytes' @ [471:41] ==> val newBytes: ByteArray defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'size' @ [471:50] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'toLong' @ [471:55] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'output' @ [472:25] ==> value-parameter output: ZipOutputStream defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'putNextEntry' @ [472:32] ==> public open fun putNextEntry(p0: (ZipEntry..ZipEntry?)): Unit defined in java.util.zip.ZipOutputStream[JavaMethodDescriptor]

'newEntry' @ [472:45] ==> val newEntry: JarEntry defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'output' @ [473:25] ==> value-parameter output: ZipOutputStream defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'write' @ [473:32] ==> public open fun write(p0: (ByteArray..ByteArray?)): Unit defined in java.util.zip.ZipOutputStream[JavaMethodDescriptor]

'newBytes' @ [473:38] ==> val newBytes: ByteArray defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar.<anonymous>.<anonymous>[LocalVariableDescriptor]

'output' @ [474:25] ==> value-parameter output: ZipOutputStream defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'closeEntry' @ [474:32] ==> public open fun closeEntry(): Unit defined in java.util.zip.ZipOutputStream[JavaMethodDescriptor]

'outputFile' @ [479:20] ==> val outputFile: File defined in org.jetbrains.kotlin.jvm.compiler.CompileKotlinAgainstCustomBinariesTest.Companion.transformJar[LocalVariableDescriptor]

