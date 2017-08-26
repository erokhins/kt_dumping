'CodegenTestCase' @ [40:46] ==> public constructor CodegenTestCase() defined in org.jetbrains.kotlin.codegen.CodegenTestCase[JavaClassConstructorDescriptor]

'setupEnvironment' @ [42:9] ==> private final fun setupEnvironment(files: List<CodegenTestCase.TestFile>, javaFilesDir: File?): Unit defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase[SimpleFunctionDescriptorImpl]

'files' @ [42:26] ==> value-parameter files: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.doMultiFileTest[ValueParameterDescriptorImpl]

'javaFilesDir' @ [42:33] ==> value-parameter javaFilesDir: File? defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.doMultiFileTest[ValueParameterDescriptorImpl]

'loadMultiFiles' @ [44:9] ==> protected/*protected and package*/ open fun loadMultiFiles(@NotNull p0: (MutableList<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>..List<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>)): Unit defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase[JavaMethodDescriptor]

'files' @ [44:24] ==> value-parameter files: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.doMultiFileTest[ValueParameterDescriptorImpl]

'doTest' @ [45:9] ==> protected abstract fun doTest(wholeFile: File, testFiles: List<CodegenTestCase.TestFile>): Unit defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase[SimpleFunctionDescriptorImpl]

'wholeFile' @ [45:16] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.doMultiFileTest[ValueParameterDescriptorImpl]

'files' @ [45:27] ==> value-parameter files: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.doMultiFileTest[ValueParameterDescriptorImpl]

'getJdkKind' @ [49:23] ==> @NotNull protected/*protected static*/ open fun getJdkKind(@NotNull p0: (MutableList<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>..List<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>)): TestJdkKind defined in org.jetbrains.kotlin.codegen.CodegenTestCase[JavaMethodDescriptor]

'files' @ [49:34] ==> value-parameter files: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.setupEnvironment[ValueParameterDescriptorImpl]

'ArrayList' @ [51:28] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'files' @ [54:22] ==> value-parameter files: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.setupEnvironment[ValueParameterDescriptorImpl]

'isDirectiveDefined' @ [55:39] ==> public open fun isDirectiveDefined(p0: (String..String?), p1: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'file' @ [55:58] ==> val file: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.setupEnvironment[LocalVariableDescriptor]

'content' @ [55:63] ==> public final val content: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'addRuntime' @ [56:17] ==> var addRuntime: Boolean defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.setupEnvironment[LocalVariableDescriptor]

'isDirectiveDefined' @ [58:39] ==> public open fun isDirectiveDefined(p0: (String..String?), p1: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'file' @ [58:58] ==> val file: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.setupEnvironment[LocalVariableDescriptor]

'content' @ [58:63] ==> public final val content: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'addReflect' @ [59:17] ==> var addReflect: Boolean defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.setupEnvironment[LocalVariableDescriptor]

'javacOptions' @ [62:13] ==> val javacOptions: ArrayList<String> defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.setupEnvironment[LocalVariableDescriptor]

'addAll' @ [62:26] ==> public open fun addAll(elements: Collection<String>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'findListWithPrefixes' @ [62:55] ==> @NotNull public open fun findListWithPrefixes(@NotNull p0: String, @NotNull vararg p1: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'file' @ [62:76] ==> val file: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.setupEnvironment[LocalVariableDescriptor]

'content' @ [62:81] ==> public final val content: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'when {
            addReflect -> ConfigurationKind.ALL
            addRuntime -> ConfigurationKind.NO_KOTLIN_REFLECT
            else -> ConfigurationKind.JDK_ONLY
        }' @ [65:33] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ConfigurationKind, entry1: ConfigurationKind, entry2: ConfigurationKind): ConfigurationKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ConfigurationKind

'addReflect' @ [66:13] ==> var addReflect: Boolean defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.setupEnvironment[LocalVariableDescriptor]

'ALL' @ [66:45] ==> enum entry ALL defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'addRuntime' @ [67:13] ==> var addRuntime: Boolean defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.setupEnvironment[LocalVariableDescriptor]

'NO_KOTLIN_REFLECT' @ [67:45] ==> enum entry NO_KOTLIN_REFLECT defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'JDK_ONLY' @ [68:39] ==> enum entry JDK_ONLY defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'createConfiguration' @ [71:29] ==> @NotNull protected/*protected and package*/ open fun createConfiguration(@NotNull p0: ConfigurationKind, @NotNull p1: TestJdkKind, @NotNull p2: (MutableList<(File..File?)>..List<(File..File?)>), @NotNull p3: (MutableList<(File..File?)>..List<(File..File?)>), @NotNull p4: (MutableList<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>..List<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>)): CompilerConfiguration defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase[JavaMethodDescriptor]

'configurationKind' @ [72:17] ==> val configurationKind: ConfigurationKind defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.setupEnvironment[LocalVariableDescriptor]

'jdkKind' @ [72:36] ==> val jdkKind: TestJdkKind defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.setupEnvironment[LocalVariableDescriptor]

'listOf' @ [73:17] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'getAnnotationsJar' @ [73:30] ==> public open fun getAnnotationsJar(): (File..File?) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'arrayOf' @ [74:17] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: File?): Array<File?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> File?

'javaFilesDir' @ [74:25] ==> value-parameter javaFilesDir: File? defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.setupEnvironment[ValueParameterDescriptorImpl]

'filterNotNull' @ [74:39] ==> public fun <T : Any> Array<out File?>.filterNotNull(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> File

'files' @ [75:17] ==> value-parameter files: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.setupEnvironment[ValueParameterDescriptorImpl]

'myEnvironment' @ [78:9] ==> protected/*protected and package*/ final var myEnvironment: (KotlinCoreEnvironment..KotlinCoreEnvironment?) defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase[JavaPropertyDescriptor]

'KotlinCoreEnvironment' @ [78:25] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'createForTests' @ [78:47] ==> @JvmStatic public final fun createForTests(parentDisposable: Disposable, configuration: CompilerConfiguration, extensionConfigs: EnvironmentConfigFiles): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[DeserializedSimpleFunctionDescriptor]

'testRootDisposable' @ [78:62] ==> public final val AbstractIrGeneratorTestCase.testRootDisposable: Disposable[MyPropertyDescriptor]

'configuration' @ [78:82] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.setupEnvironment[LocalVariableDescriptor]

'JVM_CONFIG_FILES' @ [78:120] ==> enum entry JVM_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'assert' @ [84:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'myFiles' @ [84:16] ==> protected/*protected and package*/ final var myFiles: (CodegenTestFiles..CodegenTestFiles?) defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase[JavaPropertyDescriptor]

'assert' @ [85:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'myEnvironment' @ [85:16] ==> protected/*protected and package*/ final var myEnvironment: (KotlinCoreEnvironment..KotlinCoreEnvironment?) defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase[JavaPropertyDescriptor]

'generateIrModule' @ [86:16] ==> public final fun generateIrModule(ktFilesToAnalyze: List<KtFile>, environment: KotlinCoreEnvironment, psi2ir: Psi2IrTranslator, shouldGenerate: (KtFile) -> Boolean): IrModuleFragment defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion[SimpleFunctionDescriptorImpl]

'myFiles' @ [86:33] ==> protected/*protected and package*/ final var myFiles: (CodegenTestFiles..CodegenTestFiles?) defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase[JavaPropertyDescriptor]

'psiFiles' @ [86:41] ==> public final val CodegenTestFiles.psiFiles: (MutableList<(KtFile..KtFile?)>..List<(KtFile..KtFile?)>)[MyPropertyDescriptor]

'myEnvironment' @ [86:51] ==> protected/*protected and package*/ final var myEnvironment: (KotlinCoreEnvironment..KotlinCoreEnvironment?) defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase[JavaPropertyDescriptor]

'Psi2IrTranslator' @ [86:66] ==> public constructor Psi2IrTranslator(configuration: Psi2IrConfiguration = ...) defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator[DeserializedClassConstructorDescriptor]

'Psi2IrConfiguration' @ [86:83] ==> public constructor Psi2IrConfiguration(ignoreErrors: Boolean = ...) defined in org.jetbrains.kotlin.psi2ir.Psi2IrConfiguration[DeserializedClassConstructorDescriptor]

'ignoreErrors' @ [86:103] ==> value-parameter ignoreErrors: Boolean = ... defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.generateIrModule[ValueParameterDescriptorImpl]

'shouldGenerate' @ [86:119] ==> value-parameter shouldGenerate: (KtFile) -> Boolean = ... defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.generateIrModule[ValueParameterDescriptorImpl]

'generateIrModule' @ [90:24] ==> protected final fun generateIrModule(ignoreErrors: Boolean = ..., shouldGenerate: (KtFile) -> Boolean = ...): IrModuleFragment defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase[SimpleFunctionDescriptorImpl]

'ignoreErrors' @ [90:41] ==> value-parameter ignoreErrors: Boolean = ... defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.generateIrFilesAsSingleModule[ValueParameterDescriptorImpl]

'testFiles' @ [91:23] ==> value-parameter testFiles: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.generateIrFilesAsSingleModule[ValueParameterDescriptorImpl]

'filter' @ [91:33] ==> public inline fun <T> Iterable<CodegenTestCase.TestFile>.filter(predicate: (CodegenTestCase.TestFile) -> Boolean): List<CodegenTestCase.TestFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile

'it' @ [91:42] ==> value-parameter it: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.generateIrFilesAsSingleModule.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [91:45] ==> public final val name: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'endsWith' @ [91:50] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ktFiles' @ [92:16] ==> val ktFiles: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.generateIrFilesAsSingleModule[LocalVariableDescriptor]

'zip' @ [92:24] ==> public infix fun <T, R> Iterable<CodegenTestCase.TestFile>.zip(other: Iterable<IrFile>): List<Pair<CodegenTestCase.TestFile, IrFile>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile
    <R> -> IrFile

'irModule' @ [92:28] ==> val irModule: IrModuleFragment defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.generateIrFilesAsSingleModule[LocalVariableDescriptor]

'files' @ [92:37] ==> public abstract val files: MutableList<IrFile> defined in org.jetbrains.kotlin.ir.declarations.IrModuleFragment[DeserializedPropertyDescriptor]

'toMap' @ [92:44] ==> public fun <K, V> Iterable<Pair<CodegenTestCase.TestFile, IrFile>>.toMap(): Map<CodegenTestCase.TestFile, IrFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TestFile
    <V> -> IrFile

'Regex' @ [96:45] ==> public constructor Regex(pattern: String) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'IGNORE_ERRORS_PATTERN' @ [99:17] ==> private final val IGNORE_ERRORS_PATTERN: Regex defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion[PropertyDescriptorImpl]

'containsMatchIn' @ [99:39] ==> public final fun containsMatchIn(input: CharSequence): Boolean defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'wholeFile' @ [99:55] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.shouldIgnoreErrors[ValueParameterDescriptorImpl]

'readText' @ [99:65] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'File' @ [102:28] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'dir' @ [102:33] ==> value-parameter dir: File defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.createExpectedTextFile[ValueParameterDescriptorImpl]

'fileName' @ [102:38] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.createExpectedTextFile[ValueParameterDescriptorImpl]

'!' @ [103:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'textFile' @ [103:18] ==> val textFile: File defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.createExpectedTextFile[LocalVariableDescriptor]

'exists' @ [103:27] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'assertTrue' @ [104:26] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'textFile' @ [104:86] ==> val textFile: File defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.createExpectedTextFile[LocalVariableDescriptor]

'absolutePath' @ [104:95] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'textFile' @ [104:111] ==> val textFile: File defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.createExpectedTextFile[LocalVariableDescriptor]

'createNewFile' @ [104:120] ==> public open fun createNewFile(): Boolean defined in java.io.File[JavaMethodDescriptor]

'PrintWriter' @ [105:17] ==> public constructor PrintWriter(p0: (Writer..Writer?)) defined in java.io.PrintWriter[JavaClassConstructorDescriptor]

'FileWriter' @ [105:29] ==> public constructor FileWriter(p0: (File..File?)) defined in java.io.FileWriter[JavaClassConstructorDescriptor]

'textFile' @ [105:40] ==> val textFile: File defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.createExpectedTextFile[LocalVariableDescriptor]

'use' @ [105:51] ==> @InlineOnly public inline fun <T : Closeable?, R> PrintWriter.use(block: (PrintWriter) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> PrintWriter
    <R> -> Unit

'it' @ [106:21] ==> value-parameter it: PrintWriter defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.createExpectedTextFile.<anonymous>[ValueParameterDescriptorImpl]

'println' @ [106:24] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'fileName' @ [106:34] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.createExpectedTextFile[ValueParameterDescriptorImpl]

'testFile' @ [106:83] ==> value-parameter testFile: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.createExpectedTextFile[ValueParameterDescriptorImpl]

'name' @ [106:92] ==> public final val name: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'textFile' @ [109:20] ==> val textFile: File defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.createExpectedTextFile[LocalVariableDescriptor]

'JvmResolveUtil' @ [118:34] ==> public object JvmResolveUtil defined in org.jetbrains.kotlin.resolve.lazy[FakeCallableDescriptorForObject]

'analyze' @ [118:49] ==> @JvmStatic public final fun analyze(files: Collection<KtFile>, environment: KotlinCoreEnvironment): AnalysisResult defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil[DeserializedSimpleFunctionDescriptor]

'ktFilesToAnalyze' @ [118:57] ==> value-parameter ktFilesToAnalyze: List<KtFile> defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.generateIrModule[ValueParameterDescriptorImpl]

'environment' @ [118:75] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.generateIrModule[ValueParameterDescriptorImpl]

'!' @ [119:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'psi2ir' @ [119:18] ==> value-parameter psi2ir: Psi2IrTranslator defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.generateIrModule[ValueParameterDescriptorImpl]

'configuration' @ [119:25] ==> public final val configuration: Psi2IrConfiguration defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator[DeserializedPropertyDescriptor]

'ignoreErrors' @ [119:39] ==> public final val ignoreErrors: Boolean defined in org.jetbrains.kotlin.psi2ir.Psi2IrConfiguration[DeserializedPropertyDescriptor]

'analysisResult' @ [120:17] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.generateIrModule[LocalVariableDescriptor]

'throwIfError' @ [120:32] ==> public final fun throwIfError(): Unit defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedSimpleFunctionDescriptor]

'throwExceptionOnErrors' @ [121:32] ==> public open fun throwExceptionOnErrors(p0: (BindingContext..BindingContext?)): Unit defined in org.jetbrains.kotlin.resolve.AnalyzingUtils[JavaMethodDescriptor]

'analysisResult' @ [121:55] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.generateIrModule[LocalVariableDescriptor]

'bindingContext' @ [121:70] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'ktFilesToAnalyze' @ [123:34] ==> value-parameter ktFilesToAnalyze: List<KtFile> defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.generateIrModule[ValueParameterDescriptorImpl]

'filter' @ [123:51] ==> public inline fun <T> Iterable<KtFile>.filter(predicate: (KtFile) -> Boolean): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'invoke' @ [123:60] ==> public abstract operator fun invoke(p1: KtFile): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [123:75] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.generateIrModule.<anonymous>[ValueParameterDescriptorImpl]

'generateIrModule' @ [124:20] ==> public final fun generateIrModule(ktFiles: List<KtFile>, moduleDescriptor: ModuleDescriptor, bindingContext: BindingContext, psi2ir: Psi2IrTranslator): IrModuleFragment defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion[SimpleFunctionDescriptorImpl]

'fileToGenerate' @ [124:37] ==> val fileToGenerate: List<KtFile> defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.generateIrModule[LocalVariableDescriptor]

'analysisResult' @ [124:53] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.generateIrModule[LocalVariableDescriptor]

'moduleDescriptor' @ [124:68] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'analysisResult' @ [124:86] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.generateIrModule[LocalVariableDescriptor]

'bindingContext' @ [124:101] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'psi2ir' @ [124:117] ==> value-parameter psi2ir: Psi2IrTranslator defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.generateIrModule[ValueParameterDescriptorImpl]

'generateIrModule' @ [128:17] ==> public final fun generateIrModule(ktFiles: List<KtFile>, moduleDescriptor: ModuleDescriptor, bindingContext: BindingContext, psi2ir: Psi2IrTranslator): IrModuleFragment defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion[SimpleFunctionDescriptorImpl]

'ktFiles' @ [128:34] ==> value-parameter ktFiles: List<KtFile> defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.generateIrModule[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [128:43] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.generateIrModule[ValueParameterDescriptorImpl]

'bindingContext' @ [128:61] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.generateIrModule[ValueParameterDescriptorImpl]

'Psi2IrTranslator' @ [128:77] ==> public constructor Psi2IrTranslator(configuration: Psi2IrConfiguration = ...) defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator[DeserializedClassConstructorDescriptor]

'Psi2IrConfiguration' @ [128:94] ==> public constructor Psi2IrConfiguration(ignoreErrors: Boolean = ...) defined in org.jetbrains.kotlin.psi2ir.Psi2IrConfiguration[DeserializedClassConstructorDescriptor]

'ignoreErrors' @ [128:114] ==> value-parameter ignoreErrors: Boolean = ... defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.generateIrModule[ValueParameterDescriptorImpl]

'psi2ir' @ [131:17] ==> value-parameter psi2ir: Psi2IrTranslator defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.generateIrModule[ValueParameterDescriptorImpl]

'generateModule' @ [131:24] ==> public final fun generateModule(moduleDescriptor: ModuleDescriptor, ktFiles: Collection<KtFile>, bindingContext: BindingContext): IrModuleFragment defined in org.jetbrains.kotlin.psi2ir.Psi2IrTranslator[DeserializedSimpleFunctionDescriptor]

'moduleDescriptor' @ [131:39] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.generateIrModule[ValueParameterDescriptorImpl]

'ktFiles' @ [131:57] ==> value-parameter ktFiles: List<KtFile> defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.generateIrModule[ValueParameterDescriptorImpl]

'bindingContext' @ [131:66] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.ir.AbstractIrGeneratorTestCase.Companion.generateIrModule[ValueParameterDescriptorImpl]

