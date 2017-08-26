'File' @ [54:37] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'PrintingMessageCollector' @ [55:32] ==> public constructor PrintingMessageCollector(@NotNull p0: PrintStream, @NotNull p1: MessageRenderer, p2: Boolean) defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaClassConstructorDescriptor]

'err' @ [55:64] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'PLAIN_FULL_PATHS' @ [55:85] ==> public final val PLAIN_FULL_PATHS: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaPropertyDescriptor]

'AbstractProcessor' @ [57:42] ==> protected/*protected and package*/ constructor AbstractProcessor() defined in javax.annotation.processing.AbstractProcessor[JavaClassConstructorDescriptor]

'annotations' @ [59:36] ==> value-parameter annotations: Set<TypeElement> defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.Companion.simpleProcessor.<no name provided>.process[ValueParameterDescriptorImpl]

'annotation' @ [60:42] ==> val annotation: TypeElement defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.Companion.simpleProcessor.<no name provided>.process[LocalVariableDescriptor]

'simpleName' @ [60:53] ==> public final val TypeElement.simpleName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [60:64] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'roundEnv' @ [61:45] ==> value-parameter roundEnv: RoundEnvironment defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.Companion.simpleProcessor.<no name provided>.process[ValueParameterDescriptorImpl]

'getElementsAnnotatedWith' @ [61:54] ==> public abstract fun getElementsAnnotatedWith(p0: (TypeElement..TypeElement?)): (MutableSet<out (Element..Element?)>..Set<(Element..Element?)>?) defined in javax.annotation.processing.RoundEnvironment[JavaMethodDescriptor]

'annotation' @ [61:79] ==> val annotation: TypeElement defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.Companion.simpleProcessor.<no name provided>.process[LocalVariableDescriptor]

'annotatedElements' @ [63:46] ==> val annotatedElements: (MutableSet<out (Element..Element?)>..Set<(Element..Element?)>?) defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.Companion.simpleProcessor.<no name provided>.process[LocalVariableDescriptor]

'annotatedElement' @ [64:50] ==> val annotatedElement: (Element..Element?) defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.Companion.simpleProcessor.<no name provided>.process[LocalVariableDescriptor]

'simpleName' @ [64:67] ==> public final val Element.simpleName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [64:78] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'capitalize' @ [64:89] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'annotationName' @ [64:104] ==> val annotationName: String defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.Companion.simpleProcessor.<no name provided>.process[LocalVariableDescriptor]

'capitalize' @ [64:119] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'processingEnv' @ [65:36] ==> protected/*protected and package*/ final var processingEnv: (ProcessingEnvironment..ProcessingEnvironment?) defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.Companion.simpleProcessor.<no name provided>[JavaPropertyDescriptor]

'filer' @ [65:50] ==> public final val ProcessingEnvironment.filer: (Filer..Filer?)[MyPropertyDescriptor]

'createSourceFile' @ [65:56] ==> public abstract fun createSourceFile(p0: (CharSequence..CharSequence?), vararg p1: (Element..Element?)): (JavaFileObject..JavaFileObject?) defined in javax.annotation.processing.Filer[JavaMethodDescriptor]

'+' @ [65:73] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'generatedClassName' @ [65:88] ==> val generatedClassName: String defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.Companion.simpleProcessor.<no name provided>.process[LocalVariableDescriptor]

'file' @ [66:25] ==> val file: (JavaFileObject..JavaFileObject?) defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.Companion.simpleProcessor.<no name provided>.process[LocalVariableDescriptor]

'openWriter' @ [66:30] ==> public abstract fun openWriter(): (Writer..Writer?) defined in javax.tools.JavaFileObject[JavaMethodDescriptor]

'use' @ [66:43] ==> @InlineOnly public inline fun <T : Closeable?, R> (Writer..Writer?).use(block: ((Writer..Writer?)) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> (java.io.Writer..java.io.Writer?)
    <R> -> Unit

'it' @ [67:29] ==> value-parameter it: (Writer..Writer?) defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.Companion.simpleProcessor.<no name provided>.process.<anonymous>[ValueParameterDescriptorImpl]

'write' @ [67:32] ==> public open fun write(p0: (String..String?)): Unit defined in java.io.Writer[JavaMethodDescriptor]

'generatedClassName' @ [69:36] ==> val generatedClassName: String defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.Companion.simpleProcessor.<no name provided>.process[LocalVariableDescriptor]

'trimIndent' @ [70:33] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'setOf' @ [78:58] ==> public fun <T> setOf(element: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'KaptContext' @ [83:9] ==> public constructor KaptContext<out GState : GenerationState?>(logger: KaptLogger, project: Project, bindingContext: BindingContext, compiledClasses: List<ClassNode>, origins: Map<Any, JvmDeclarationOrigin>, generationState: Nothing?, processorOptions: Map<String, String>, javacOptions: Map<String, String> = ...) defined in org.jetbrains.kotlin.kapt3.KaptContext[DeserializedClassConstructorDescriptor]
Inferred types:
    <out GState : GenerationState?> -> Nothing?

'KaptLogger' @ [83:21] ==> public constructor KaptLogger(isVerbose: Boolean, messageCollector: MessageCollector = ...) defined in org.jetbrains.kotlin.kapt3.util.KaptLogger[DeserializedClassConstructorDescriptor]

'messageCollector' @ [83:69] ==> public final val messageCollector: PrintingMessageCollector defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.Companion[PropertyDescriptorImpl]

'getInstance' @ [84:34] ==> @NotNull public open fun getInstance(): Project defined in com.intellij.openapi.command.impl.DummyProject[JavaMethodDescriptor]

'EMPTY' @ [85:53] ==> public final val EMPTY: (BindingContext..BindingContext?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'emptyList' @ [86:39] ==> public fun <T> emptyList(): List<ClassNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassNode

'emptyMap' @ [87:31] ==> public fun <K, V> emptyMap(): Map<Any, JvmDeclarationOrigin> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any
    <V> -> JvmDeclarationOrigin

'emptyMap' @ [89:40] ==> public fun <K, V> emptyMap(): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'doAnnotationProcessing' @ [90:11] ==> public fun KaptContext<*>.doAnnotationProcessing(javaSourceFiles: List<File>, processors: List<Processor>, compileClasspath: List<File>, annotationProcessingClasspath: List<File>, annotationProcessors: String, sourcesOutputDir: File, classesOutputDir: File, additionalSources: List<JCTree.JCCompilationUnit> = ..., withJdk: Boolean = ...): Unit defined in org.jetbrains.kotlin.kapt3[DeserializedSimpleFunctionDescriptor]

'listOf' @ [91:17] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'javaSourceFile' @ [91:24] ==> value-parameter javaSourceFile: File defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.doAnnotationProcessing[ValueParameterDescriptorImpl]

'listOf' @ [92:17] ==> public fun <T> listOf(element: Processor): List<Processor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Processor

'processor' @ [92:24] ==> value-parameter processor: Processor defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.doAnnotationProcessing[ValueParameterDescriptorImpl]

'emptyList' @ [93:17] ==> public fun <T> emptyList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'emptyList' @ [94:17] ==> public fun <T> emptyList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'outputDir' @ [96:17] ==> value-parameter outputDir: File defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.doAnnotationProcessing[ValueParameterDescriptorImpl]

'outputDir' @ [97:17] ==> value-parameter outputDir: File defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.doAnnotationProcessing[ValueParameterDescriptorImpl]

'Test' @ [101:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'createTempDirectory' @ [103:37] ==> public open fun createTempDirectory(p0: (String..String?), vararg p1: (FileAttribute<*>..FileAttribute<*>?)): (Path..Path?) defined in java.nio.file.Files[JavaMethodDescriptor]

'toFile' @ [103:71] ==> public abstract fun toFile(): (File..File?) defined in java.nio.file.Path[JavaMethodDescriptor]

'doAnnotationProcessing' @ [105:13] ==> private final fun doAnnotationProcessing(javaSourceFile: File, processor: Processor, outputDir: File): Unit defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest[SimpleFunctionDescriptorImpl]

'File' @ [105:36] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'TEST_DATA_DIR' @ [105:41] ==> private final val TEST_DATA_DIR: File defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.Companion[PropertyDescriptorImpl]

'simpleProcessor' @ [105:72] ==> public final fun simpleProcessor(): AbstractProcessor defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.Companion[SimpleFunctionDescriptorImpl]

'sourceOutputDir' @ [105:91] ==> val sourceOutputDir: (File..File?) defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.testSimple[LocalVariableDescriptor]

'File' @ [106:32] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'sourceOutputDir' @ [106:37] ==> val sourceOutputDir: (File..File?) defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.testSimple[LocalVariableDescriptor]

'assertTrue' @ [107:13] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'myMethodFile' @ [107:24] ==> val myMethodFile: File defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.testSimple[LocalVariableDescriptor]

'exists' @ [107:37] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'sourceOutputDir' @ [109:13] ==> val sourceOutputDir: (File..File?) defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.testSimple[LocalVariableDescriptor]

'deleteRecursively' @ [109:29] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Test' @ [113:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'AbstractProcessor' @ [117:34] ==> protected/*protected and package*/ constructor AbstractProcessor() defined in javax.annotation.processing.AbstractProcessor[JavaClassConstructorDescriptor]

'RuntimeException' @ [119:23] ==> public final fun <init>(p0: (String..String?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'exceptionMessage' @ [119:40] ==> val exceptionMessage: String defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.testException[LocalVariableDescriptor]

'setOf' @ [122:58] ==> public fun <T> setOf(element: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'doAnnotationProcessing' @ [126:13] ==> private final fun doAnnotationProcessing(javaSourceFile: File, processor: Processor, outputDir: File): Unit defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest[SimpleFunctionDescriptorImpl]

'File' @ [126:36] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'TEST_DATA_DIR' @ [126:41] ==> private final val TEST_DATA_DIR: File defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.Companion[PropertyDescriptorImpl]

'processor' @ [126:72] ==> val processor: <no name provided> defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.testException[LocalVariableDescriptor]

'TEST_DATA_DIR' @ [126:83] ==> private final val TEST_DATA_DIR: File defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.Companion[PropertyDescriptorImpl]

'assertEquals' @ [128:13] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'EXCEPTION' @ [128:41] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.kapt3.diagnostic.KaptError.Kind[FakeCallableDescriptorForObject]

'e' @ [128:52] ==> val e: KaptError defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.testException[LocalVariableDescriptor]

'kind' @ [128:54] ==> public final val kind: KaptError.Kind defined in org.jetbrains.kotlin.kapt3.diagnostic.KaptError[DeserializedPropertyDescriptor]

'assertEquals' @ [129:13] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'e' @ [129:42] ==> val e: KaptError defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.testException[LocalVariableDescriptor]

'cause' @ [129:44] ==> public open val cause: Throwable? defined in org.jetbrains.kotlin.kapt3.diagnostic.KaptError[DeserializedPropertyDescriptor]

'message' @ [129:52] ==> public open val message: String? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

'e' @ [130:19] ==> val e: KaptError defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.testException[LocalVariableDescriptor]

'Test' @ [134:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doAnnotationProcessing' @ [137:13] ==> private final fun doAnnotationProcessing(javaSourceFile: File, processor: Processor, outputDir: File): Unit defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest[SimpleFunctionDescriptorImpl]

'File' @ [137:36] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'TEST_DATA_DIR' @ [137:41] ==> private final val TEST_DATA_DIR: File defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.Companion[PropertyDescriptorImpl]

'simpleProcessor' @ [137:76] ==> public final fun simpleProcessor(): AbstractProcessor defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.Companion[SimpleFunctionDescriptorImpl]

'TEST_DATA_DIR' @ [137:95] ==> private final val TEST_DATA_DIR: File defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.Companion[PropertyDescriptorImpl]

'assertEquals' @ [139:13] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'ERROR_RAISED' @ [139:41] ==> enum entry ERROR_RAISED defined in org.jetbrains.kotlin.kapt3.diagnostic.KaptError.Kind[FakeCallableDescriptorForObject]

'e' @ [139:55] ==> val e: KaptError defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.testParsingError[LocalVariableDescriptor]

'kind' @ [139:57] ==> public final val kind: KaptError.Kind defined in org.jetbrains.kotlin.kapt3.diagnostic.KaptError[DeserializedPropertyDescriptor]

'e' @ [140:19] ==> val e: KaptError defined in org.jetbrains.kotlin.kapt3.test.JavaKaptContextTest.testParsingError[LocalVariableDescriptor]

