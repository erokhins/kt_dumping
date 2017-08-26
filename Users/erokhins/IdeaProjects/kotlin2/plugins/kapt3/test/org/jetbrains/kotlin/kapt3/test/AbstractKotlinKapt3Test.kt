'CodegenTestCase' @ [43:42] ==> public constructor CodegenTestCase() defined in org.jetbrains.kotlin.codegen.CodegenTestCase[JavaClassConstructorDescriptor]

'PrintingMessageCollector' @ [46:32] ==> public constructor PrintingMessageCollector(@NotNull p0: PrintStream, @NotNull p1: MessageRenderer, p2: Boolean) defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaClassConstructorDescriptor]

'err' @ [46:64] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'PLAIN_FULL_PATHS' @ [46:85] ==> public final val PLAIN_FULL_PATHS: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaPropertyDescriptor]

'javaFilesDir' @ [50:27] ==> value-parameter javaFilesDir: File? defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.doMultiFileTest[ValueParameterDescriptorImpl]

'let' @ [50:41] ==> @InlineOnly public inline fun <T, R> File.let(block: (File) -> Array<File>): Array<File> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> Array<File>

'arrayOf' @ [50:47] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: File): Array<File> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> File

'it' @ [50:55] ==> value-parameter it: File defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.doMultiFileTest.<anonymous>[ValueParameterDescriptorImpl]

'emptyArray' @ [50:64] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<File> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> File

'createEnvironmentWithMockJdkAndIdeaAnnotations' @ [52:9] ==> protected/*protected and package*/ final fun createEnvironmentWithMockJdkAndIdeaAnnotations(@NotNull p0: ConfigurationKind, @Nullable vararg p1: (File..File?)): Unit defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test[JavaMethodDescriptor]

'ALL' @ [52:74] ==> enum entry ALL defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'javaSources' @ [52:80] ==> val javaSources: Array<File> defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.doMultiFileTest[LocalVariableDescriptor]

'AnalysisHandlerExtension' @ [55:9] ==> public companion object : ProjectExtensionDescriptor<AnalysisHandlerExtension> defined in org.jetbrains.kotlin.resolve.jvm.extensions.AnalysisHandlerExtension[FakeCallableDescriptorForObject]

'registerExtension' @ [55:34] ==> public final fun registerExtension(project: Project, extension: AnalysisHandlerExtension): Unit defined in org.jetbrains.kotlin.resolve.jvm.extensions.AnalysisHandlerExtension.Companion[DeserializedSimpleFunctionDescriptor]

'myEnvironment' @ [55:52] ==> protected/*protected and package*/ final var myEnvironment: (KotlinCoreEnvironment..KotlinCoreEnvironment?) defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test[JavaPropertyDescriptor]

'project' @ [55:66] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'PartialAnalysisHandlerExtension' @ [55:75] ==> public constructor PartialAnalysisHandlerExtension() defined in org.jetbrains.kotlin.resolve.jvm.extensions.PartialAnalysisHandlerExtension[DeserializedClassConstructorDescriptor]

'loadMultiFiles' @ [57:9] ==> protected/*protected and package*/ open fun loadMultiFiles(@NotNull p0: (MutableList<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>..List<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>)): Unit defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test[JavaMethodDescriptor]

'files' @ [57:24] ==> value-parameter files: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.doMultiFileTest[ValueParameterDescriptorImpl]

'File' @ [59:23] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'wholeFile' @ [59:28] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.doMultiFileTest[ValueParameterDescriptorImpl]

'parentFile' @ [59:38] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'wholeFile' @ [59:50] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.doMultiFileTest[ValueParameterDescriptorImpl]

'nameWithoutExtension' @ [59:60] ==> public val File.nameWithoutExtension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'Kapt3BuilderFactory' @ [60:35] ==> public constructor Kapt3BuilderFactory() defined in org.jetbrains.kotlin.kapt3.Kapt3BuilderFactory[DeserializedClassConstructorDescriptor]

'GenerationUtils' @ [61:31] ==> public object GenerationUtils defined in org.jetbrains.kotlin.codegen[FakeCallableDescriptorForObject]

'compileFiles' @ [61:47] ==> @JvmStatic @JvmOverloads public final fun compileFiles(files: List<KtFile>, environment: KotlinCoreEnvironment, classBuilderFactory: ClassBuilderFactory = ...): GenerationState defined in org.jetbrains.kotlin.codegen.GenerationUtils[DeserializedSimpleFunctionDescriptor]

'myFiles' @ [61:60] ==> protected/*protected and package*/ final var myFiles: (CodegenTestFiles..CodegenTestFiles?) defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test[JavaPropertyDescriptor]

'psiFiles' @ [61:68] ==> public final val CodegenTestFiles.psiFiles: (MutableList<(KtFile..KtFile?)>..List<(KtFile..KtFile?)>)[MyPropertyDescriptor]

'myEnvironment' @ [61:78] ==> protected/*protected and package*/ final var myEnvironment: (KotlinCoreEnvironment..KotlinCoreEnvironment?) defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test[JavaPropertyDescriptor]

'classBuilderFactory' @ [61:93] ==> val classBuilderFactory: Kapt3BuilderFactory defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.doMultiFileTest[LocalVariableDescriptor]

'KaptLogger' @ [63:22] ==> public constructor KaptLogger(isVerbose: Boolean, messageCollector: MessageCollector = ...) defined in org.jetbrains.kotlin.kapt3.util.KaptLogger[DeserializedClassConstructorDescriptor]

'messageCollector' @ [63:70] ==> public final val messageCollector: PrintingMessageCollector defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.Companion[PropertyDescriptorImpl]

'KaptContext' @ [64:27] ==> public constructor KaptContext<out GState : GenerationState?>(logger: KaptLogger, project: Project, bindingContext: BindingContext, compiledClasses: List<ClassNode>, origins: Map<Any, JvmDeclarationOrigin>, generationState: GenerationState, processorOptions: Map<String, String>, javacOptions: Map<String, String> = ...) defined in org.jetbrains.kotlin.kapt3.KaptContext[DeserializedClassConstructorDescriptor]
Inferred types:
    <out GState : GenerationState?> -> GenerationState

'logger' @ [64:39] ==> val logger: KaptLogger defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.doMultiFileTest[LocalVariableDescriptor]

'generationState' @ [64:47] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.doMultiFileTest[LocalVariableDescriptor]

'project' @ [64:63] ==> public final val project: Project defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'generationState' @ [64:72] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.doMultiFileTest[LocalVariableDescriptor]

'bindingContext' @ [64:88] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'classBuilderFactory' @ [64:104] ==> val classBuilderFactory: Kapt3BuilderFactory defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.doMultiFileTest[LocalVariableDescriptor]

'compiledClasses' @ [64:124] ==> internal final val compiledClasses: MutableList<ClassNode> defined in org.jetbrains.kotlin.kapt3.Kapt3BuilderFactory[DeserializedPropertyDescriptor]

'classBuilderFactory' @ [65:39] ==> val classBuilderFactory: Kapt3BuilderFactory defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.doMultiFileTest[LocalVariableDescriptor]

'origins' @ [65:59] ==> internal final val origins: MutableMap<Any, JvmDeclarationOrigin> defined in org.jetbrains.kotlin.kapt3.Kapt3BuilderFactory[DeserializedPropertyDescriptor]

'generationState' @ [65:68] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.doMultiFileTest[LocalVariableDescriptor]

'emptyMap' @ [65:104] ==> public fun <K, V> emptyMap(): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'check' @ [67:13] ==> protected abstract fun check(kaptContext: KaptContext<GenerationState>, txtFile: File, wholeFile: File): Unit defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test[SimpleFunctionDescriptorImpl]

'kaptContext' @ [67:19] ==> val kaptContext: KaptContext<GenerationState> defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.doMultiFileTest[LocalVariableDescriptor]

'txtFile' @ [67:32] ==> val txtFile: File defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.doMultiFileTest[LocalVariableDescriptor]

'wholeFile' @ [67:41] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.doMultiFileTest[ValueParameterDescriptorImpl]

'kaptContext' @ [69:13] ==> val kaptContext: KaptContext<GenerationState> defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.doMultiFileTest[LocalVariableDescriptor]

'close' @ [69:25] ==> public open fun close(): Unit defined in org.jetbrains.kotlin.kapt3.KaptContext[DeserializedSimpleFunctionDescriptor]

'ClassFileToSourceStubConverter' @ [78:25] ==> public constructor ClassFileToSourceStubConverter(kaptContext: KaptContext<GenerationState>, generateNonExistentClass: Boolean, correctErrorTypes: Boolean) defined in org.jetbrains.kotlin.kapt3.stubs.ClassFileToSourceStubConverter[DeserializedClassConstructorDescriptor]

'kaptContext' @ [78:56] ==> value-parameter kaptContext: KaptContext<GenerationState> defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.convert[ValueParameterDescriptorImpl]

'generateNonExistentClass' @ [78:69] ==> value-parameter generateNonExistentClass: Boolean defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.convert[ValueParameterDescriptorImpl]

'correctErrorTypes' @ [78:95] ==> value-parameter correctErrorTypes: Boolean defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.convert[ValueParameterDescriptorImpl]

'converter' @ [79:16] ==> val converter: ClassFileToSourceStubConverter defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.convert[LocalVariableDescriptor]

'convert' @ [79:26] ==> public final fun convert(): List<JCTree.JCCompilationUnit> defined in org.jetbrains.kotlin.kapt3.stubs.ClassFileToSourceStubConverter[DeserializedSimpleFunctionDescriptor]

'AbstractKotlinKapt3Test' @ [88:61] ==> public constructor AbstractKotlinKapt3Test() defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test[ClassConstructorDescriptorImpl]

'KOTLIN_METADATA_GROUP' @ [91:69] ==> private final val KOTLIN_METADATA_GROUP: String defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.Companion[PropertyDescriptorImpl]

'KOTLIN_METADATA_GROUP' @ [91:95] ==> private final val KOTLIN_METADATA_GROUP: String defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.Companion[PropertyDescriptorImpl]

'toRegex' @ [91:123] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

's' @ [93:67] ==> value-parameter s: String defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.Companion.removeMetadataAnnotationContents[ValueParameterDescriptorImpl]

'replace' @ [93:69] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'KOTLIN_METADATA_REGEX' @ [93:77] ==> private final val KOTLIN_METADATA_REGEX: Regex defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.Companion[PropertyDescriptorImpl]

'wholeFile' @ [97:41] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check[ValueParameterDescriptorImpl]

'useLines' @ [97:51] ==> public inline fun <T> File.useLines(charset: Charset = ..., block: (Sequence<String>) -> Boolean): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'lines' @ [97:71] ==> value-parameter lines: Sequence<String> defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check.isOptionSet.<anonymous>[ValueParameterDescriptorImpl]

'any' @ [97:77] ==> public inline fun <T> Sequence<String>.any(predicate: (String) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [97:83] ==> value-parameter it: String defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check.isOptionSet.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'trim' @ [97:86] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'name' @ [97:101] ==> value-parameter name: String defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check.isOptionSet[ValueParameterDescriptorImpl]

'isOptionSet' @ [99:40] ==> local final fun isOptionSet(name: String): Boolean defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check[SimpleFunctionDescriptorImpl]

'isOptionSet' @ [100:33] ==> local final fun isOptionSet(name: String): Boolean defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check[SimpleFunctionDescriptorImpl]

'!' @ [101:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isOptionSet' @ [101:25] ==> local final fun isOptionSet(name: String): Boolean defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check[SimpleFunctionDescriptorImpl]

'convert' @ [103:25] ==> protected final fun convert(kaptContext: KaptContext<GenerationState>, generateNonExistentClass: Boolean, correctErrorTypes: Boolean): List<JCTree.JCCompilationUnit> defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest[SimpleFunctionDescriptorImpl]

'kaptContext' @ [103:33] ==> value-parameter kaptContext: KaptContext<GenerationState> defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check[ValueParameterDescriptorImpl]

'generateNonExistentClass' @ [103:46] ==> val generateNonExistentClass: Boolean defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check[LocalVariableDescriptor]

'correctErrorTypes' @ [103:72] ==> val correctErrorTypes: Boolean defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check[LocalVariableDescriptor]

'kaptContext' @ [105:9] ==> value-parameter kaptContext: KaptContext<GenerationState> defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check[ValueParameterDescriptorImpl]

'javaLog' @ [105:21] ==> public final val javaLog: KaptJavaLog defined in org.jetbrains.kotlin.kapt3.KaptContext[DeserializedPropertyDescriptor]

'interceptorData' @ [105:29] ==> public final val interceptorData: KaptJavaLog.DiagnosticInterceptorData defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog[DeserializedPropertyDescriptor]

'files' @ [105:45] ==> public final var files: Map<JavaFileObject, JCTree.JCCompilationUnit> defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.DiagnosticInterceptorData[DeserializedPropertyDescriptor]

'javaFiles' @ [105:53] ==> val javaFiles: List<JCTree.JCCompilationUnit> defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check[LocalVariableDescriptor]

'map' @ [105:63] ==> public inline fun <T, R> Iterable<(JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)>.map(transform: ((JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)) -> Pair<(JavaFileObject..JavaFileObject?), (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)>): List<Pair<(JavaFileObject..JavaFileObject?), (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCCompilationUnit..com.sun.tools.javac.tree.JCTree.JCCompilationUnit?)
    <R> -> Pair<(javax.tools.JavaFileObject..javax.tools.JavaFileObject?), (com.sun.tools.javac.tree.JCTree.JCCompilationUnit..com.sun.tools.javac.tree.JCTree.JCCompilationUnit?)>

'it' @ [105:69] ==> value-parameter it: (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?) defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check.<anonymous>[ValueParameterDescriptorImpl]

'sourceFile' @ [105:72] ==> public final val JCTree.JCCompilationUnit.sourceFile: (JavaFileObject..JavaFileObject?)[MyPropertyDescriptor]

'it' @ [105:86] ==> value-parameter it: (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?) defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check.<anonymous>[ValueParameterDescriptorImpl]

'toMap' @ [105:91] ==> public fun <K, V> Iterable<Pair<JavaFileObject, (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)>>.toMap(): Map<JavaFileObject, (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JavaFileObject
    <V> -> (com.sun.tools.javac.tree.JCTree.JCCompilationUnit..com.sun.tools.javac.tree.JCTree.JCCompilationUnit?)

'validate' @ [106:13] ==> val validate: Boolean defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check[LocalVariableDescriptor]

'kaptContext' @ [106:23] ==> value-parameter kaptContext: KaptContext<GenerationState> defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check[ValueParameterDescriptorImpl]

'compiler' @ [106:35] ==> public final val compiler: KaptJavaCompiler defined in org.jetbrains.kotlin.kapt3.KaptContext[DeserializedPropertyDescriptor]

'enterTrees' @ [106:44] ==> public open fun enterTrees(p0: (List<(JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)>..List<(JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)>?)): (List<(JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)>..List<(JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)>?) defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaCompiler[JavaMethodDescriptor]

'javaFiles' @ [106:55] ==> val javaFiles: List<JCTree.JCCompilationUnit> defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check[LocalVariableDescriptor]

'javaFiles' @ [108:25] ==> val javaFiles: List<JCTree.JCCompilationUnit> defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check[LocalVariableDescriptor]

'sortedBy' @ [108:35] ==> public inline fun <T, R : Comparable<String>> Iterable<(JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)>.sortedBy(crossinline selector: ((JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)) -> String?): List<(JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCCompilationUnit..com.sun.tools.javac.tree.JCTree.JCCompilationUnit?)
    <R : Comparable<R>> -> String

'it' @ [108:46] ==> value-parameter it: (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?) defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check.<anonymous>[ValueParameterDescriptorImpl]

'sourceFile' @ [108:49] ==> public final val JCTree.JCCompilationUnit.sourceFile: (JavaFileObject..JavaFileObject?)[MyPropertyDescriptor]

'name' @ [108:60] ==> public final val JavaFileObject.name: (String..String?)[MyPropertyDescriptor]

'joinToString' @ [108:67] ==> public fun <T> Iterable<(JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCCompilationUnit..com.sun.tools.javac.tree.JCTree.JCCompilationUnit?)

'FILE_SEPARATOR' @ [108:81] ==> public final val FILE_SEPARATOR: String defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.Companion[PropertyDescriptorImpl]

'convertLineSeparators' @ [109:33] ==> @NotNull @Contract public open fun convertLineSeparators(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'actualRaw' @ [109:55] ==> val actualRaw: String defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check[LocalVariableDescriptor]

'trim' @ [109:65] ==> public inline fun String.trim(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [109:72] ==> value-parameter it: Char defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check.<anonymous>[ValueParameterDescriptorImpl]

'trimTrailingWhitespacesAndAddNewlineAtEOF' @ [110:18] ==> public fun String.trimTrailingWhitespacesAndAddNewlineAtEOF(): String defined in org.jetbrains.kotlin.test.util[DeserializedSimpleFunctionDescriptor]

'let' @ [111:18] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'removeMetadataAnnotationContents' @ [111:24] ==> public final fun removeMetadataAnnotationContents(s: String): String defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.Companion[SimpleFunctionDescriptorImpl]

'it' @ [111:57] ==> value-parameter it: String defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check.<anonymous>[ValueParameterDescriptorImpl]

'kaptContext' @ [113:13] ==> value-parameter kaptContext: KaptContext<GenerationState> defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check[ValueParameterDescriptorImpl]

'compiler' @ [113:25] ==> public final val compiler: KaptJavaCompiler defined in org.jetbrains.kotlin.kapt3.KaptContext[DeserializedPropertyDescriptor]

'shouldStop' @ [113:34] ==> public open fun shouldStop(cs: CompileStates.CompileState): Boolean defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaCompiler[DeserializedSimpleFunctionDescriptor]

'ENTER' @ [113:72] ==> enum entry ENTER defined in com.sun.tools.javac.comp.CompileStates.CompileState[FakeCallableDescriptorForObject]

'instance' @ [114:17] ==> public open fun instance(p0: (Context..Context?)): (Log..Log?) defined in com.sun.tools.javac.util.Log[JavaMethodDescriptor]

'kaptContext' @ [114:26] ==> value-parameter kaptContext: KaptContext<GenerationState> defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check[ValueParameterDescriptorImpl]

'context' @ [114:38] ==> public final val context: Context defined in org.jetbrains.kotlin.kapt3.KaptContext[DeserializedPropertyDescriptor]

'flush' @ [114:47] ==> public open fun flush(): Unit defined in com.sun.tools.javac.util.Log[JavaMethodDescriptor]

'error' @ [115:13] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'actual' @ [115:84] ==> val actual: String defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check[LocalVariableDescriptor]

'assertEqualsToFile' @ [117:25] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'txtFile' @ [117:44] ==> value-parameter txtFile: File defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check[ValueParameterDescriptorImpl]

'actual' @ [117:53] ==> val actual: String defined in org.jetbrains.kotlin.kapt3.test.AbstractClassFileToSourceStubConverterTest.check[LocalVariableDescriptor]

'AbstractKotlinKapt3Test' @ [121:48] ==> public constructor AbstractKotlinKapt3Test() defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test[ClassConstructorDescriptorImpl]

'convert' @ [123:32] ==> protected final fun convert(kaptContext: KaptContext<GenerationState>, generateNonExistentClass: Boolean, correctErrorTypes: Boolean): List<JCTree.JCCompilationUnit> defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKaptContextTest[SimpleFunctionDescriptorImpl]

'kaptContext' @ [123:40] ==> value-parameter kaptContext: KaptContext<GenerationState> defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKaptContextTest.check[ValueParameterDescriptorImpl]

'createTempDirectory' @ [124:37] ==> public open fun createTempDirectory(p0: (String..String?), vararg p1: (FileAttribute<*>..FileAttribute<*>?)): (Path..Path?) defined in java.nio.file.Files[JavaMethodDescriptor]

'toFile' @ [124:71] ==> public abstract fun toFile(): (File..File?) defined in java.nio.file.Path[JavaMethodDescriptor]

'kaptContext' @ [126:13] ==> value-parameter kaptContext: KaptContext<GenerationState> defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKaptContextTest.check[ValueParameterDescriptorImpl]

'doAnnotationProcessing' @ [126:25] ==> public fun KaptContext<*>.doAnnotationProcessing(javaSourceFiles: List<File>, processors: List<Processor>, compileClasspath: List<File>, annotationProcessingClasspath: List<File>, annotationProcessors: String, sourcesOutputDir: File, classesOutputDir: File, additionalSources: List<JCTree.JCCompilationUnit> = ..., withJdk: Boolean = ...): Unit defined in org.jetbrains.kotlin.kapt3[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [126:48] ==> public fun <T> emptyList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'listOf' @ [126:61] ==> public fun <T> listOf(element: AbstractProcessor): List<AbstractProcessor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractProcessor

'simpleProcessor' @ [126:88] ==> public final fun simpleProcessor(): AbstractProcessor defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.Companion[SimpleFunctionDescriptorImpl]

'PathUtil' @ [127:67] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'getJdkClassesRootsFromCurrentJre' @ [127:76] ==> @JvmStatic public final fun getJdkClassesRootsFromCurrentJre(): List<File> defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedSimpleFunctionDescriptor]

'kotlinPathsForIdeaPlugin' @ [127:122] ==> @JvmStatic public final val kotlinPathsForIdeaPlugin: KotlinPaths defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'stdlibPath' @ [127:147] ==> public final val KotlinPaths.stdlibPath: File[MyPropertyDescriptor]

'emptyList' @ [128:80] ==> public fun <T> emptyList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'sourceOutputDir' @ [129:67] ==> val sourceOutputDir: (File..File?) defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKaptContextTest.check[LocalVariableDescriptor]

'sourceOutputDir' @ [129:103] ==> val sourceOutputDir: (File..File?) defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKaptContextTest.check[LocalVariableDescriptor]

'compilationUnits' @ [130:68] ==> val compilationUnits: List<JCTree.JCCompilationUnit> defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKaptContextTest.check[LocalVariableDescriptor]

'sourceOutputDir' @ [132:29] ==> val sourceOutputDir: (File..File?) defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKaptContextTest.check[LocalVariableDescriptor]

'walkTopDown' @ [132:45] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'filter' @ [132:59] ==> public fun <T> Sequence<File>.filter(predicate: (File) -> Boolean): Sequence<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [132:68] ==> value-parameter it: File defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKaptContextTest.check.<anonymous>[ValueParameterDescriptorImpl]

'isFile' @ [132:71] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'it' @ [132:81] ==> value-parameter it: File defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKaptContextTest.check.<anonymous>[ValueParameterDescriptorImpl]

'extension' @ [132:84] ==> public val File.extension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'javaFiles' @ [133:29] ==> val javaFiles: Sequence<File> defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKaptContextTest.check[LocalVariableDescriptor]

'sortedBy' @ [133:39] ==> public inline fun <T, R : Comparable<String>> Sequence<File>.sortedBy(crossinline selector: (File) -> String?): Sequence<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R : Comparable<R>> -> String

'it' @ [133:50] ==> value-parameter it: File defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKaptContextTest.check.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [133:53] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'joinToString' @ [133:60] ==> public fun <T> Sequence<File>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((File) -> CharSequence)? = ...): String defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'FILE_SEPARATOR' @ [133:73] ==> public final val FILE_SEPARATOR: String defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKapt3Test.Companion[PropertyDescriptorImpl]

'it' @ [133:91] ==> value-parameter it: File defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKaptContextTest.check.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [133:94] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'it' @ [133:111] ==> value-parameter it: File defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKaptContextTest.check.<anonymous>[ValueParameterDescriptorImpl]

'readText' @ [133:114] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'convertLineSeparators' @ [134:37] ==> @NotNull @Contract public open fun convertLineSeparators(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'actualRaw' @ [134:59] ==> val actualRaw: String defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKaptContextTest.check[LocalVariableDescriptor]

'trim' @ [134:69] ==> public inline fun String.trim(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [134:76] ==> value-parameter it: Char defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKaptContextTest.check.<anonymous>[ValueParameterDescriptorImpl]

'trimTrailingWhitespacesAndAddNewlineAtEOF' @ [134:90] ==> public fun String.trimTrailingWhitespacesAndAddNewlineAtEOF(): String defined in org.jetbrains.kotlin.test.util[DeserializedSimpleFunctionDescriptor]

'assertEqualsToFile' @ [135:29] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'txtFile' @ [135:48] ==> value-parameter txtFile: File defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKaptContextTest.check[ValueParameterDescriptorImpl]

'actual' @ [135:57] ==> val actual: String defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKaptContextTest.check[LocalVariableDescriptor]

'sourceOutputDir' @ [137:13] ==> val sourceOutputDir: (File..File?) defined in org.jetbrains.kotlin.kapt3.test.AbstractKotlinKaptContextTest.check[LocalVariableDescriptor]

'deleteRecursively' @ [137:29] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

