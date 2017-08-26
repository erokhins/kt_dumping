'KotlinTestWithEnvironment' @ [55:43] ==> public constructor KotlinTestWithEnvironment() defined in org.jetbrains.kotlin.test.KotlinTestWithEnvironment[JavaClassConstructorDescriptor]

'File' @ [57:20] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'filePath' @ [57:25] ==> value-parameter filePath: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest[ValueParameterDescriptorImpl]

'file' @ [58:26] ==> val file: File defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest[LocalVariableDescriptor]

'readText' @ [58:31] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'TestFileFactoryImpl' @ [60:9] ==> public constructor TestFileFactoryImpl() defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFileFactoryImpl[ClassConstructorDescriptorImpl]

'use' @ [60:31] ==> @InlineOnly public inline fun <T : Closeable?, R> AbstractJsLineNumberTest.TestFileFactoryImpl.use(block: (AbstractJsLineNumberTest.TestFileFactoryImpl) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> TestFileFactoryImpl
    <R> -> Unit

'createTestFiles' @ [61:46] ==> @NotNull public open fun <M : (Any..Any?), F : (Any..Any?)> createTestFiles(p0: (String..String?), p1: (String..String?), p2: (KotlinTestUtils.TestFileFactory<(AbstractJsLineNumberTest.TestModule..AbstractJsLineNumberTest.TestModule?), (AbstractJsLineNumberTest.TestFile..AbstractJsLineNumberTest.TestFile?)>..KotlinTestUtils.TestFileFactory<(AbstractJsLineNumberTest.TestModule..AbstractJsLineNumberTest.TestModule?), (AbstractJsLineNumberTest.TestFile..AbstractJsLineNumberTest.TestFile?)>?), p3: Boolean): (MutableList<(AbstractJsLineNumberTest.TestFile..AbstractJsLineNumberTest.TestFile?)>..List<(AbstractJsLineNumberTest.TestFile..AbstractJsLineNumberTest.TestFile?)>) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]
Inferred types:
    <M : (Any..Any?)> -> TestModule
    <F : (Any..Any?)> -> TestFile

'file' @ [61:62] ==> val file: File defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest[LocalVariableDescriptor]

'name' @ [61:67] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'sourceCode' @ [61:73] ==> val sourceCode: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest[LocalVariableDescriptor]

'testFactory' @ [61:85] ==> value-parameter testFactory: AbstractJsLineNumberTest.TestFileFactoryImpl defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'inputFiles' @ [62:27] ==> val inputFiles: (MutableList<(AbstractJsLineNumberTest.TestFile..AbstractJsLineNumberTest.TestFile?)>..List<(AbstractJsLineNumberTest.TestFile..AbstractJsLineNumberTest.TestFile?)>) defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>[LocalVariableDescriptor]

'map' @ [63:22] ==> public inline fun <T, R> Iterable<(AbstractJsLineNumberTest.TestFile..AbstractJsLineNumberTest.TestFile?)>.map(transform: ((AbstractJsLineNumberTest.TestFile..AbstractJsLineNumberTest.TestFile?)) -> AbstractJsLineNumberTest.TestModule): List<AbstractJsLineNumberTest.TestModule> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFile..org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFile?)
    <R> -> TestModule

'it' @ [63:28] ==> value-parameter it: (AbstractJsLineNumberTest.TestFile..AbstractJsLineNumberTest.TestFile?) defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'module' @ [63:31] ==> public final val module: AbstractJsLineNumberTest.TestModule defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFile[PropertyDescriptorImpl]

'distinct' @ [63:40] ==> public fun <T> Iterable<AbstractJsLineNumberTest.TestModule>.distinct(): List<AbstractJsLineNumberTest.TestModule> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestModule

'associateBy' @ [64:22] ==> public inline fun <T, K> Iterable<AbstractJsLineNumberTest.TestModule>.associateBy(keySelector: (AbstractJsLineNumberTest.TestModule) -> String): Map<String, AbstractJsLineNumberTest.TestModule> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestModule
    <K> -> String

'it' @ [64:36] ==> value-parameter it: AbstractJsLineNumberTest.TestModule defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [64:39] ==> public final val name: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestModule[PropertyDescriptorImpl]

'topologicalOrder' @ [66:38] ==> public final fun <N : (Any..Any?)> topologicalOrder(@NotNull p0: (MutableIterable<(AbstractJsLineNumberTest.TestModule..AbstractJsLineNumberTest.TestModule?)>..Iterable<(AbstractJsLineNumberTest.TestModule..AbstractJsLineNumberTest.TestModule?)>), @NotNull p1: ((AbstractJsLineNumberTest.TestModule..AbstractJsLineNumberTest.TestModule?)) -> (MutableIterable<(AbstractJsLineNumberTest.TestModule..AbstractJsLineNumberTest.TestModule?)>..Iterable<(AbstractJsLineNumberTest.TestModule..AbstractJsLineNumberTest.TestModule?)>)): (MutableList<(AbstractJsLineNumberTest.TestModule..AbstractJsLineNumberTest.TestModule?)>..List<(AbstractJsLineNumberTest.TestModule..AbstractJsLineNumberTest.TestModule?)>?) defined in org.jetbrains.kotlin.utils.DFS[SamAdapterFunctionDescriptor]
Inferred types:
    <N : (Any..Any?)> -> TestModule

'modules' @ [66:55] ==> val modules: Map<String, AbstractJsLineNumberTest.TestModule> defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>[LocalVariableDescriptor]

'values' @ [66:63] ==> public abstract val values: Collection<AbstractJsLineNumberTest.TestModule> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'module' @ [66:83] ==> value-parameter module: (AbstractJsLineNumberTest.TestModule..AbstractJsLineNumberTest.TestModule?) defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'dependencies' @ [66:90] ==> public final val dependencies: MutableList<String> defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestModule[PropertyDescriptorImpl]

'mapNotNull' @ [66:103] ==> public inline fun <T, R : Any> Iterable<String>.mapNotNull(transform: (String) -> AbstractJsLineNumberTest.TestModule?): List<AbstractJsLineNumberTest.TestModule> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Any> -> TestModule

'modules' @ [66:116] ==> val modules: Map<String, AbstractJsLineNumberTest.TestModule> defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>[LocalVariableDescriptor]

'it' @ [66:124] ==> value-parameter it: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'orderedModules' @ [68:13] ==> val orderedModules: (MutableList<(AbstractJsLineNumberTest.TestModule..AbstractJsLineNumberTest.TestModule?)>..List<(AbstractJsLineNumberTest.TestModule..AbstractJsLineNumberTest.TestModule?)>?) defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>[LocalVariableDescriptor]

'asReversed' @ [68:28] ==> @JvmName public fun <T> MutableList<(AbstractJsLineNumberTest.TestModule..AbstractJsLineNumberTest.TestModule?)>.asReversed(): MutableList<(AbstractJsLineNumberTest.TestModule..AbstractJsLineNumberTest.TestModule?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestModule..org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestModule?)

'forEach' @ [68:41] ==> @HidesMembers public inline fun <T> Iterable<(AbstractJsLineNumberTest.TestModule..AbstractJsLineNumberTest.TestModule?)>.forEach(action: ((AbstractJsLineNumberTest.TestModule..AbstractJsLineNumberTest.TestModule?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestModule..org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestModule?)

'module' @ [69:38] ==> value-parameter module: (AbstractJsLineNumberTest.TestModule..AbstractJsLineNumberTest.TestModule?) defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'outputFileName' @ [69:45] ==> private final fun AbstractJsLineNumberTest.TestModule.outputFileName(file: File): String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest[SimpleFunctionDescriptorImpl]

'file' @ [69:60] ==> val file: File defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest[LocalVariableDescriptor]

'K2JSTranslator' @ [71:34] ==> public constructor K2JSTranslator(@NotNull p0: JsConfig) defined in org.jetbrains.kotlin.js.facade.K2JSTranslator[JavaClassConstructorDescriptor]

'createConfig' @ [71:49] ==> private final fun createConfig(module: AbstractJsLineNumberTest.TestModule, inputFile: File, modules: Map<String, AbstractJsLineNumberTest.TestModule>): JsConfig defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest[SimpleFunctionDescriptorImpl]

'module' @ [71:62] ==> value-parameter module: (AbstractJsLineNumberTest.TestModule..AbstractJsLineNumberTest.TestModule?) defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [71:70] ==> val file: File defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest[LocalVariableDescriptor]

'modules' @ [71:76] ==> val modules: Map<String, AbstractJsLineNumberTest.TestModule> defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>[LocalVariableDescriptor]

'module' @ [72:29] ==> value-parameter module: (AbstractJsLineNumberTest.TestModule..AbstractJsLineNumberTest.TestModule?) defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'files' @ [72:36] ==> public final val files: MutableList<AbstractJsLineNumberTest.TestFile> defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestModule[PropertyDescriptorImpl]

'map' @ [72:42] ==> public inline fun <T, R> Iterable<AbstractJsLineNumberTest.TestFile>.map(transform: (AbstractJsLineNumberTest.TestFile) -> TranslationUnit.SourceFile): List<TranslationUnit.SourceFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile
    <R> -> SourceFile

'SourceFile' @ [72:64] ==> public constructor SourceFile(file: KtFile) defined in org.jetbrains.kotlin.js.facade.TranslationUnit.SourceFile[DeserializedClassConstructorDescriptor]

'createPsiFile' @ [72:75] ==> private final fun createPsiFile(fileName: String): KtFile defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest[SimpleFunctionDescriptorImpl]

'it' @ [72:89] ==> value-parameter it: AbstractJsLineNumberTest.TestFile defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fileName' @ [72:92] ==> public final val fileName: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFile[PropertyDescriptorImpl]

'translator' @ [73:41] ==> val translator: K2JSTranslator defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'translateUnits' @ [73:52] ==> @NotNull public open fun translateUnits(@NotNull p0: JsConfig.Reporter, @NotNull p1: (MutableList<(TranslationUnit..TranslationUnit?)>..List<(TranslationUnit..TranslationUnit?)>), @NotNull p2: MainCallParameters): TranslationResult defined in org.jetbrains.kotlin.js.facade.K2JSTranslator[JavaMethodDescriptor]

'ExceptionThrowingReporter' @ [73:67] ==> public object ExceptionThrowingReporter : JsConfig.Reporter defined in org.jetbrains.kotlin.js.test.utils in file ExceptionThrowingReporter.kt[FakeCallableDescriptorForObject]

'units' @ [73:94] ==> val units: List<TranslationUnit.SourceFile> defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'noCall' @ [73:120] ==> @NotNull public open fun noCall(): MainCallParameters defined in org.jetbrains.kotlin.js.facade.MainCallParameters[JavaMethodDescriptor]

'translationResult' @ [75:21] ==> val translationResult: TranslationResult defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'ByteArrayOutputStream' @ [76:40] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'PrintingMessageCollector' @ [77:37] ==> public constructor PrintingMessageCollector(@NotNull p0: PrintStream, @NotNull p1: MessageRenderer, p2: Boolean) defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaClassConstructorDescriptor]

'PrintStream' @ [77:62] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'outputStream' @ [77:74] ==> val outputStream: ByteArrayOutputStream defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'PLAIN_FULL_PATHS' @ [77:105] ==> public final val PLAIN_FULL_PATHS: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaPropertyDescriptor]

'AnalyzerWithCompilerReport' @ [78:21] ==> public companion object defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport[FakeCallableDescriptorForObject]

'reportDiagnostics' @ [78:48] ==> public final fun reportDiagnostics(diagnostics: Diagnostics, messageCollector: MessageCollector): Boolean defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport.Companion[DeserializedSimpleFunctionDescriptor]

'translationResult' @ [78:66] ==> val translationResult: TranslationResult defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'diagnostics' @ [78:84] ==> public final val diagnostics: Diagnostics defined in org.jetbrains.kotlin.js.facade.TranslationResult[DeserializedPropertyDescriptor]

'collector' @ [78:97] ==> val collector: PrintingMessageCollector defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'outputStream' @ [79:36] ==> val outputStream: ByteArrayOutputStream defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'toByteArray' @ [79:49] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'toString' @ [79:63] ==> @InlineOnly public inline fun ByteArray.toString(charset: Charset): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'forName' @ [79:80] ==> public open fun forName(p0: (String..String?)): (Charset..Charset?) defined in java.nio.charset.Charset[JavaMethodDescriptor]

'AssertionError' @ [80:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'+' @ [80:42] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'messages' @ [80:94] ==> val messages: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'LineCollector' @ [83:37] ==> public constructor LineCollector() defined in org.jetbrains.kotlin.js.test.utils.LineCollector[ClassConstructorDescriptorImpl]

'lineCollector' @ [84:17] ==> val lineCollector: LineCollector defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'accept' @ [84:31] ==> public open fun <T : JsNode?> accept(node: JsProgram): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsProgram

'translationResult' @ [84:38] ==> val translationResult: TranslationResult defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'program' @ [84:56] ==> public final val program: JsProgram defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[DeserializedPropertyDescriptor]

'TextOutputImpl' @ [86:37] ==> public constructor TextOutputImpl() defined in org.jetbrains.kotlin.js.util.TextOutputImpl[JavaClassConstructorDescriptor]

'translationResult' @ [87:17] ==> val translationResult: TranslationResult defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'program' @ [87:35] ==> public final val program: JsProgram defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[DeserializedPropertyDescriptor]

'globalBlock' @ [87:43] ==> public final val JsProgram.globalBlock: (JsGlobalBlock..JsGlobalBlock?)[MyPropertyDescriptor]

'accept' @ [87:55] ==> public open fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsGlobalBlock[JavaMethodDescriptor]

'LineOutputToStringVisitor' @ [87:62] ==> public constructor LineOutputToStringVisitor(output: TextOutput, lineCollector: LineCollector) defined in org.jetbrains.kotlin.js.test.utils.LineOutputToStringVisitor[ClassConstructorDescriptorImpl]

'programOutput' @ [87:88] ==> val programOutput: TextOutputImpl defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'lineCollector' @ [87:103] ==> val lineCollector: LineCollector defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'programOutput' @ [88:37] ==> val programOutput: TextOutputImpl defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'toString' @ [88:51] ==> public open fun toString(): String defined in org.jetbrains.kotlin.js.util.TextOutputImpl[JavaMethodDescriptor]

'with' @ [89:17] ==> @InlineOnly public inline fun <T, R> with(receiver: File, block: File.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> Unit

'File' @ [89:22] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'baseOutputPath' @ [89:27] ==> val baseOutputPath: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'parentFile' @ [90:21] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'mkdirs' @ [90:32] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'writeText' @ [91:21] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'generatedCode' @ [91:31] ==> val generatedCode: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'File' @ [94:17] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'baseOutputPath' @ [94:22] ==> val baseOutputPath: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'writeText' @ [94:46] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'translationResult' @ [94:56] ==> val translationResult: TranslationResult defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'program' @ [94:74] ==> public final val program: JsProgram defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[DeserializedPropertyDescriptor]

'globalBlock' @ [94:82] ==> public final val JsProgram.globalBlock: (JsGlobalBlock..JsGlobalBlock?)[MyPropertyDescriptor]

'toString' @ [94:94] ==> public open fun toString(): String defined in org.jetbrains.kotlin.js.backend.ast.JsGlobalBlock[JavaMethodDescriptor]

'JsModuleDescriptor' @ [96:41] ==> public constructor JsModuleDescriptor<out T>(name: String, kind: ModuleKind, imported: List<String>, data: ModuleDescriptor) defined in org.jetbrains.kotlin.serialization.js.JsModuleDescriptor[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> ModuleDescriptor

'module' @ [97:32] ==> value-parameter module: (AbstractJsLineNumberTest.TestModule..AbstractJsLineNumberTest.TestModule?) defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [97:39] ==> public final val name: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestModule[PropertyDescriptorImpl]

'translationResult' @ [98:32] ==> val translationResult: TranslationResult defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'moduleDescriptor' @ [98:50] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[DeserializedPropertyDescriptor]

'PLAIN' @ [99:43] ==> enum entry PLAIN defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'emptyList' @ [100:36] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'KotlinJavascriptSerializationUtil' @ [102:39] ==> public object KotlinJavascriptSerializationUtil defined in org.jetbrains.kotlin.serialization.js[FakeCallableDescriptorForObject]

'metadataAsString' @ [102:73] ==> public final fun metadataAsString(bindingContext: BindingContext, jsDescriptor: JsModuleDescriptor<ModuleDescriptor>): String defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[DeserializedSimpleFunctionDescriptor]

'translationResult' @ [103:25] ==> val translationResult: TranslationResult defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'bindingContext' @ [103:43] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.js.facade.TranslationResult.Success[DeserializedPropertyDescriptor]

'moduleDescription' @ [103:59] ==> val moduleDescription: JsModuleDescriptor<ModuleDescriptor> defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'File' @ [104:17] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'baseOutputPath' @ [104:22] ==> val baseOutputPath: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'writeText' @ [104:51] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'metaFileContent' @ [104:61] ==> val metaFileContent: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'module' @ [106:36] ==> value-parameter module: (AbstractJsLineNumberTest.TestModule..AbstractJsLineNumberTest.TestModule?) defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'files' @ [106:43] ==> public final val files: MutableList<AbstractJsLineNumberTest.TestFile> defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestModule[PropertyDescriptorImpl]

'mapNotNull' @ [107:26] ==> public inline fun <T, R : Any> Iterable<AbstractJsLineNumberTest.TestFile>.mapNotNull(transform: (AbstractJsLineNumberTest.TestFile) -> MatchResult?): List<MatchResult> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile
    <R : Any> -> MatchResult

'LINES_PATTERN' @ [107:39] ==> private final val LINES_PATTERN: Regex defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.Companion[PropertyDescriptorImpl]

'find' @ [107:53] ==> public final fun find(input: CharSequence, startIndex: Int = ...): MatchResult? defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'File' @ [107:58] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [107:63] ==> value-parameter it: AbstractJsLineNumberTest.TestFile defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fileName' @ [107:66] ==> public final val fileName: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFile[PropertyDescriptorImpl]

'readText' @ [107:76] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [108:26] ==> public fun <T> List<MatchResult>.firstOrNull(): MatchResult? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MatchResult

'error' @ [109:39] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'generatedCode' @ [109:118] ==> val generatedCode: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'linesMatcher' @ [111:37] ==> val linesMatcher: MatchResult defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'groups' @ [111:50] ==> public abstract val groups: MatchGroupCollection defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'value' @ [111:62] ==> public final val value: String defined in kotlin.text.MatchGroup[DeserializedPropertyDescriptor]

'lineCollector' @ [112:35] ==> val lineCollector: LineCollector defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'lines' @ [112:49] ==> public final val lines: MutableList<Int?> defined in org.jetbrains.kotlin.js.test.utils.LineCollector[PropertyDescriptorImpl]

'dropLastWhile' @ [113:26] ==> public inline fun <T> List<Int?>.dropLastWhile(predicate: (Int?) -> Boolean): List<Int?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int?

'it' @ [113:42] ==> value-parameter it: Int? defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [114:26] ==> public fun <T> Iterable<Int?>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Int?) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int?

'if (it == null) "*" else (it + 1).toString()' @ [114:46] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CharSequence, elseBranch: CharSequence): CharSequence[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CharSequence

'it' @ [114:50] ==> value-parameter it: Int? defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [114:72] ==> value-parameter it: Int? defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [114:80] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [116:26] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'generatedCode' @ [116:39] ==> val generatedCode: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'expectedLines' @ [116:54] ==> val expectedLines: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'actualLines' @ [116:69] ==> val actualLines: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.doTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'outputPath' @ [122:16] ==> private final fun outputPath(file: File): (String..String?) defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest[SimpleFunctionDescriptorImpl]

'file' @ [122:27] ==> value-parameter file: File defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.outputFileName[ValueParameterDescriptorImpl]

'name' @ [122:41] ==> public final val name: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestModule[PropertyDescriptorImpl]

'File' @ [125:42] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'OUT_PATH' @ [125:47] ==> private final val OUT_PATH: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.Companion[PropertyDescriptorImpl]

'file' @ [125:57] ==> value-parameter file: File defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.outputPath[ValueParameterDescriptorImpl]

'relativeTo' @ [125:62] ==> public fun File.relativeTo(base: File): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'File' @ [125:73] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'BASE_PATH' @ [125:78] ==> private final val BASE_PATH: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.Companion[PropertyDescriptorImpl]

'path' @ [125:90] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'removeSuffix' @ [125:95] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'path' @ [125:116] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'KotlinCoreEnvironment' @ [128:16] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'createForTests' @ [128:38] ==> @JvmStatic public final fun createForTests(parentDisposable: Disposable, configuration: CompilerConfiguration, extensionConfigs: EnvironmentConfigFiles): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[DeserializedSimpleFunctionDescriptor]

'testRootDisposable' @ [128:53] ==> public final val AbstractJsLineNumberTest.testRootDisposable: Disposable[MyPropertyDescriptor]

'CompilerConfiguration' @ [128:73] ==> public constructor CompilerConfiguration() defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaClassConstructorDescriptor]

'JS_CONFIG_FILES' @ [128:121] ==> enum entry JS_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'module' @ [132:28] ==> value-parameter module: AbstractJsLineNumberTest.TestModule defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.createConfig[ValueParameterDescriptorImpl]

'dependencies' @ [132:35] ==> public final val dependencies: MutableList<String> defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestModule[PropertyDescriptorImpl]

'mapNotNull' @ [133:18] ==> public inline fun <T, R : Any> Iterable<String>.mapNotNull(transform: (String) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Any> -> String

'modules' @ [133:31] ==> value-parameter modules: Map<String, AbstractJsLineNumberTest.TestModule> defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.createConfig[ValueParameterDescriptorImpl]

'it' @ [133:39] ==> value-parameter it: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.createConfig.<anonymous>[ValueParameterDescriptorImpl]

'outputFileName' @ [133:44] ==> private final fun AbstractJsLineNumberTest.TestModule.outputFileName(file: File): String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest[SimpleFunctionDescriptorImpl]

'inputFile' @ [133:59] ==> value-parameter inputFile: File defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.createConfig[ValueParameterDescriptorImpl]

'map' @ [134:18] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [134:26] ==> value-parameter it: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.createConfig.<anonymous>[ValueParameterDescriptorImpl]

'environment' @ [136:29] ==> public final val AbstractJsLineNumberTest.environment: KotlinCoreEnvironment[MyPropertyDescriptor]

'configuration' @ [136:41] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'copy' @ [136:55] ==> public open fun copy(): (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'configuration' @ [138:9] ==> val configuration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.createConfig[LocalVariableDescriptor]

'put' @ [138:23] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(List<String>..List<(String..String?)>?)>, @NotNull p1: (List<String>..List<(String..String?)>)): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.List<kotlin.String>..kotlin.collections.List<(kotlin.String..kotlin.String?)>)

'LIBRARIES' @ [138:47] ==> public final val LIBRARIES: (CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>..CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'+' @ [138:58] ==> public operator fun <T> Collection<(String..String?)>.plus(elements: Iterable<(String..String?)>): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'JS_STDLIB' @ [138:67] ==> public final val JS_STDLIB: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.kotlin.js.config.JsConfig[JavaPropertyDescriptor]

'JS_KOTLIN_TEST' @ [138:88] ==> public final val JS_KOTLIN_TEST: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.kotlin.js.config.JsConfig[JavaPropertyDescriptor]

'dependencies' @ [138:105] ==> val dependencies: List<String> defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.createConfig[LocalVariableDescriptor]

'configuration' @ [140:9] ==> val configuration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.createConfig[LocalVariableDescriptor]

'put' @ [140:23] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(String..String?)>, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'CommonConfigurationKeys' @ [140:27] ==> public object CommonConfigurationKeys defined in org.jetbrains.kotlin.config[FakeCallableDescriptorForObject]

'MODULE_NAME' @ [140:51] ==> @field:JvmField public final val MODULE_NAME: CompilerConfigurationKey<String> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'module' @ [140:64] ==> value-parameter module: AbstractJsLineNumberTest.TestModule defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.createConfig[ValueParameterDescriptorImpl]

'name' @ [140:71] ==> public final val name: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestModule[PropertyDescriptorImpl]

'configuration' @ [141:9] ==> val configuration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.createConfig[LocalVariableDescriptor]

'put' @ [141:23] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(ModuleKind..ModuleKind?)>, @NotNull p1: ModuleKind): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ModuleKind

'MODULE_KIND' @ [141:47] ==> public final val MODULE_KIND: (CompilerConfigurationKey<(ModuleKind..ModuleKind?)>..CompilerConfigurationKey<(ModuleKind..ModuleKind?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'PLAIN' @ [141:71] ==> enum entry PLAIN defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'configuration' @ [142:9] ==> val configuration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.createConfig[LocalVariableDescriptor]

'put' @ [142:23] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(EcmaVersion..EcmaVersion?)>, @NotNull p1: EcmaVersion): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> EcmaVersion

'TARGET' @ [142:47] ==> public final val TARGET: (CompilerConfigurationKey<(EcmaVersion..EcmaVersion?)>..CompilerConfigurationKey<(EcmaVersion..EcmaVersion?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'v5' @ [142:67] ==> enum entry v5 defined in org.jetbrains.kotlin.js.config.EcmaVersion[FakeCallableDescriptorForObject]

'configuration' @ [144:9] ==> val configuration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.createConfig[LocalVariableDescriptor]

'put' @ [144:23] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'SOURCE_MAP' @ [144:47] ==> public final val SOURCE_MAP: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'JsConfig' @ [146:16] ==> public constructor JsConfig(@NotNull p0: Project, @NotNull p1: CompilerConfiguration) defined in org.jetbrains.kotlin.js.config.JsConfig[JavaClassConstructorDescriptor]

'project' @ [146:25] ==> public final val AbstractJsLineNumberTest.project: Project[MyPropertyDescriptor]

'configuration' @ [146:34] ==> val configuration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.createConfig[LocalVariableDescriptor]

'getInstance' @ [150:37] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [150:49] ==> public final val AbstractJsLineNumberTest.project: Project[MyPropertyDescriptor]

'getInstance' @ [151:45] ==> @NotNull public open fun getInstance(): VirtualFileManager defined in com.intellij.openapi.vfs.VirtualFileManager[JavaMethodDescriptor]

'getFileSystem' @ [151:59] ==> public abstract fun getFileSystem(p0: (String..String?)): (VirtualFileSystem..VirtualFileSystem?) defined in com.intellij.openapi.vfs.VirtualFileManager[JavaMethodDescriptor]

'FILE_PROTOCOL' @ [151:93] ==> public const final val FILE_PROTOCOL: String defined in com.intellij.openapi.vfs.StandardFileSystems[JavaPropertyDescriptor]

'psiManager' @ [153:16] ==> val psiManager: PsiManager defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.createPsiFile[LocalVariableDescriptor]

'findFile' @ [153:27] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'fileSystem' @ [153:36] ==> val fileSystem: (VirtualFileSystem..VirtualFileSystem?) defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.createPsiFile[LocalVariableDescriptor]

'findFileByPath' @ [153:47] ==> @Nullable public abstract fun findFileByPath(@NotNull @NonNls p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFileSystem[JavaMethodDescriptor]

'fileName' @ [153:62] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.createPsiFile[ValueParameterDescriptorImpl]

'tmpDir' @ [157:38] ==> @NotNull public open fun tmpDir(p0: (String..String?)): File defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'TestModule' @ [158:29] ==> public constructor TestModule(name: String, dependencies: List<String>) defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestModule[ClassConstructorDescriptorImpl]

'BasicBoxTest' @ [158:40] ==> public companion object defined in org.jetbrains.kotlin.js.test.BasicBoxTest[FakeCallableDescriptorForObject]

'TEST_MODULE' @ [158:53] ==> public final val TEST_MODULE: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'emptyList' @ [158:66] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'module' @ [161:33] ==> value-parameter module: AbstractJsLineNumberTest.TestModule? defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFileFactoryImpl.createFile[ValueParameterDescriptorImpl]

'defaultModule' @ [161:43] ==> public final val defaultModule: AbstractJsLineNumberTest.TestModule defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFileFactoryImpl[PropertyDescriptorImpl]

'File' @ [163:33] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpDir' @ [163:38] ==> public final val tmpDir: File defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFileFactoryImpl[PropertyDescriptorImpl]

'currentModule' @ [163:49] ==> val currentModule: AbstractJsLineNumberTest.TestModule defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'name' @ [163:63] ==> public final val name: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestModule[PropertyDescriptorImpl]

'fileName' @ [163:70] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFileFactoryImpl.createFile[ValueParameterDescriptorImpl]

'mkdirs' @ [164:29] ==> public open fun mkdirs(@NotNull p0: File): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'temporaryFile' @ [164:36] ==> val temporaryFile: File defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'parentFile' @ [164:50] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'temporaryFile' @ [165:13] ==> val temporaryFile: File defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'writeText' @ [165:27] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'text' @ [165:37] ==> value-parameter text: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFileFactoryImpl.createFile[ValueParameterDescriptorImpl]

'Charsets' @ [165:43] ==> public object Charsets defined in kotlin.text[FakeCallableDescriptorForObject]

'UTF_8' @ [165:52] ==> @field:JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[DeserializedPropertyDescriptor]

'TestFile' @ [168:20] ==> public constructor TestFile(fileName: String, module: AbstractJsLineNumberTest.TestModule) defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFile[ClassConstructorDescriptorImpl]

'temporaryFile' @ [168:29] ==> val temporaryFile: File defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'absolutePath' @ [168:43] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'currentModule' @ [168:57] ==> val currentModule: AbstractJsLineNumberTest.TestModule defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFileFactoryImpl.createFile[LocalVariableDescriptor]

'TestModule' @ [172:20] ==> public constructor TestModule(name: String, dependencies: List<String>) defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestModule[ClassConstructorDescriptorImpl]

'name' @ [172:31] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFileFactoryImpl.createModule[ValueParameterDescriptorImpl]

'dependencies' @ [172:37] ==> value-parameter dependencies: List<String> defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFileFactoryImpl.createModule[ValueParameterDescriptorImpl]

'delete' @ [176:22] ==> public open fun delete(@NotNull p0: File): Boolean defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'tmpDir' @ [176:29] ==> public final val tmpDir: File defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFileFactoryImpl[PropertyDescriptorImpl]

'dependencies' @ [184:28] ==> value-parameter dependencies: List<String> defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestModule.<init>[ValueParameterDescriptorImpl]

'toMutableList' @ [184:41] ==> public fun <T> Collection<String>.toMutableList(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'mutableListOf' @ [185:21] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<AbstractJsLineNumberTest.TestFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile

'module' @ [190:13] ==> public final val module: AbstractJsLineNumberTest.TestModule defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFile[PropertyDescriptorImpl]

'files' @ [190:20] ==> public final val files: MutableList<AbstractJsLineNumberTest.TestFile> defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestModule[PropertyDescriptorImpl]

'this' @ [190:29] ==> <this> defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.TestFile[LazyClassReceiverParameterDescriptor]

'Regex' @ [196:37] ==> public constructor Regex(pattern: String, option: RegexOption) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'MULTILINE' @ [196:79] ==> enum entry MULTILINE defined in kotlin.text.RegexOption[FakeCallableDescriptorForObject]

'BasicBoxTest' @ [197:36] ==> public companion object defined in org.jetbrains.kotlin.js.test.BasicBoxTest[FakeCallableDescriptorForObject]

'TEST_DATA_DIR_PATH' @ [197:49] ==> public const final val TEST_DATA_DIR_PATH: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'DIR_NAME' @ [197:70] ==> private final val DIR_NAME: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.Companion[PropertyDescriptorImpl]

'BasicBoxTest' @ [198:35] ==> public companion object defined in org.jetbrains.kotlin.js.test.BasicBoxTest[FakeCallableDescriptorForObject]

'TEST_DATA_DIR_PATH' @ [198:48] ==> public const final val TEST_DATA_DIR_PATH: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'DIR_NAME' @ [198:73] ==> private final val DIR_NAME: String defined in org.jetbrains.kotlin.js.test.AbstractJsLineNumberTest.Companion[PropertyDescriptorImpl]

