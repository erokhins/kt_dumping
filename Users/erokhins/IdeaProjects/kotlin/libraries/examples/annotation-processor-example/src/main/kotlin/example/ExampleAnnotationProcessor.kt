'AbstractProcessor' @ [12:36] ==> protected/*protected and package*/ constructor AbstractProcessor() defined in javax.annotation.processing.AbstractProcessor[JavaClassConstructorDescriptor]

'mapOf' @ [15:36] ==> public fun <K, V> mapOf(vararg pairs: Pair<KClass<out Annotation>, String>): Map<KClass<out Annotation>, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KClass<out Annotation>
    <V> -> String

'ExampleAnnotation' @ [15:42] ==> public constructor ExampleAnnotation() defined in example.ExampleAnnotation[ClassConstructorDescriptorImpl]

'ExampleSourceAnnotation' @ [16:42] ==> public constructor ExampleSourceAnnotation() defined in example.ExampleSourceAnnotation[ClassConstructorDescriptorImpl]

'ExampleRuntimeAnnotation' @ [17:42] ==> public constructor ExampleRuntimeAnnotation() defined in example.ExampleRuntimeAnnotation[ClassConstructorDescriptorImpl]

'ExampleBinaryAnnotation' @ [18:42] ==> public constructor ExampleBinaryAnnotation() defined in example.ExampleBinaryAnnotation[ClassConstructorDescriptorImpl]

'component1' @ [27:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KClass<out Annotation>, String>.component1(): KClass<out Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KClass<out Annotation>
    <V> -> String

'component2' @ [27:27] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KClass<out Annotation>, String>.component2(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KClass<out Annotation>
    <V> -> String

'ANNOTATION_TO_PREFIX' @ [27:38] ==> public final val ANNOTATION_TO_PREFIX: Map<KClass<out Annotation>, String> defined in example.ExampleAnnotationProcessor.Companion[PropertyDescriptorImpl]

'processAnnotation' @ [28:13] ==> private final fun <T : Annotation> processAnnotation(roundEnv: RoundEnvironment, annotationClass: KClass<out Annotation>, generatedFilePrefix: String): Unit defined in example.ExampleAnnotationProcessor[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Annotation> -> Captured(out Annotation)

'roundEnv' @ [28:31] ==> value-parameter roundEnv: RoundEnvironment defined in example.ExampleAnnotationProcessor.process[ValueParameterDescriptorImpl]

'annotation' @ [28:41] ==> val annotation: KClass<out Annotation> defined in example.ExampleAnnotationProcessor.process[LocalVariableDescriptor]

'prefix' @ [28:53] ==> val prefix: String defined in example.ExampleAnnotationProcessor.process[LocalVariableDescriptor]

'roundEnv' @ [35:24] ==> value-parameter roundEnv: RoundEnvironment defined in example.ExampleAnnotationProcessor.processAnnotation[ValueParameterDescriptorImpl]

'getElementsAnnotatedWith' @ [35:33] ==> public abstract fun getElementsAnnotatedWith(p0: (Class<out (Annotation..Annotation?)>..Class<out (Annotation..Annotation?)>?)): (MutableSet<out (Element..Element?)>..Set<(Element..Element?)>?) defined in javax.annotation.processing.RoundEnvironment[JavaMethodDescriptor]

'annotationClass' @ [35:58] ==> value-parameter annotationClass: KClass<T> defined in example.ExampleAnnotationProcessor.processAnnotation[ValueParameterDescriptorImpl]

'java' @ [35:74] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'processingEnv' @ [37:28] ==> protected/*protected and package*/ final var processingEnv: (ProcessingEnvironment..ProcessingEnvironment?) defined in example.ExampleAnnotationProcessor[JavaPropertyDescriptor]

'elementUtils' @ [37:42] ==> public final val ProcessingEnvironment.elementUtils: (Elements..Elements?)[MyPropertyDescriptor]

'processingEnv' @ [38:21] ==> protected/*protected and package*/ final var processingEnv: (ProcessingEnvironment..ProcessingEnvironment?) defined in example.ExampleAnnotationProcessor[JavaPropertyDescriptor]

'filer' @ [38:35] ==> public final val ProcessingEnvironment.filer: (Filer..Filer?)[MyPropertyDescriptor]

'processingEnv' @ [40:23] ==> protected/*protected and package*/ final var processingEnv: (ProcessingEnvironment..ProcessingEnvironment?) defined in example.ExampleAnnotationProcessor[JavaPropertyDescriptor]

'options' @ [40:37] ==> public final val ProcessingEnvironment.options: (MutableMap<(String..String?), (String..String?)>..Map<(String..String?), (String..String?)>?)[MyPropertyDescriptor]

'options' @ [41:35] ==> val options: (MutableMap<(String..String?), (String..String?)>..Map<(String..String?), (String..String?)>?) defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'SUFFIX_OPTION' @ [41:43] ==> public final val SUFFIX_OPTION: String defined in example.ExampleAnnotationProcessor.Companion[PropertyDescriptorImpl]

'==' @ [42:34] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'options' @ [42:44] ==> val options: (MutableMap<(String..String?), (String..String?)>..Map<(String..String?), (String..String?)>?) defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'GENERATE_KOTLIN_CODE_OPTION' @ [42:52] ==> public final val GENERATE_KOTLIN_CODE_OPTION: String defined in example.ExampleAnnotationProcessor.Companion[PropertyDescriptorImpl]

'options' @ [43:31] ==> val options: (MutableMap<(String..String?), (String..String?)>..Map<(String..String?), (String..String?)>?) defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'KAPT_KOTLIN_GENERATED_OPTION' @ [43:39] ==> public final val KAPT_KOTLIN_GENERATED_OPTION: String defined in example.ExampleAnnotationProcessor.Companion[PropertyDescriptorImpl]

'elements' @ [45:25] ==> val elements: (MutableSet<out (Element..Element?)>..Set<(Element..Element?)>?) defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'elementUtils' @ [46:31] ==> val elementUtils: (Elements..Elements?) defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'getPackageOf' @ [46:44] ==> public abstract fun getPackageOf(p0: (Element..Element?)): (PackageElement..PackageElement?) defined in javax.lang.model.util.Elements[JavaMethodDescriptor]

'element' @ [46:57] ==> val element: (Element..Element?) defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'qualifiedName' @ [46:66] ==> public final val PackageElement.qualifiedName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [46:80] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'element' @ [47:30] ==> val element: (Element..Element?) defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'simpleName' @ [47:38] ==> public final val Element.simpleName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [47:49] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'generatedFilePrefix' @ [48:42] ==> value-parameter generatedFilePrefix: String defined in example.ExampleAnnotationProcessor.processAnnotation[ValueParameterDescriptorImpl]

'capitalize' @ [48:62] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'simpleName' @ [48:77] ==> val simpleName: String defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'capitalize' @ [48:88] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'generatedFileSuffix' @ [48:103] ==> val generatedFileSuffix: String defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'filer' @ [50:13] ==> val filer: (Filer..Filer?) defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'createSourceFile' @ [50:19] ==> public abstract fun createSourceFile(p0: (CharSequence..CharSequence?), vararg p1: (Element..Element?)): (JavaFileObject..JavaFileObject?) defined in javax.annotation.processing.Filer[JavaMethodDescriptor]

'packageName' @ [50:36] ==> val packageName: String defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'generatedJavaClassName' @ [50:56] ==> val generatedJavaClassName: String defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'openWriter' @ [50:80] ==> public abstract fun openWriter(): (Writer..Writer?) defined in javax.tools.JavaFileObject[JavaMethodDescriptor]

'use' @ [50:93] ==> @InlineOnly public inline fun <T : Closeable?, R> (Writer..Writer?).use(block: ((Writer..Writer?)) -> Appendable /* = Appendable */): Appendable /* = Appendable */ defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> (java.io.Writer..java.io.Writer?)
    <R> -> Appendable

'with' @ [50:99] ==> @InlineOnly public inline fun <T, R> with(receiver: (Writer..Writer?), block: (Writer..Writer?).() -> Appendable /* = Appendable */): Appendable /* = Appendable */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.Writer..java.io.Writer?)
    <R> -> Appendable

'it' @ [50:104] ==> value-parameter it: (Writer..Writer?) defined in example.ExampleAnnotationProcessor.processAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'appendln' @ [51:17] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'packageName' @ [51:36] ==> val packageName: String defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'appendln' @ [52:17] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'generatedJavaClassName' @ [52:47] ==> val generatedJavaClassName: String defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'generateKotlinCode' @ [55:17] ==> val generateKotlinCode: Boolean defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'kotlinGenerated' @ [55:39] ==> val kotlinGenerated: String? defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'element' @ [55:66] ==> val element: (Element..Element?) defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'kind' @ [55:74] ==> public final val Element.kind: (ElementKind..ElementKind?)[MyPropertyDescriptor]

'CLASS' @ [55:94] ==> enum entry CLASS defined in javax.lang.model.element.ElementKind[FakeCallableDescriptorForObject]

'File' @ [56:17] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'kotlinGenerated' @ [56:22] ==> val kotlinGenerated: String? defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'simpleName' @ [56:41] ==> val simpleName: String defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'writer' @ [56:57] ==> @InlineOnly public inline fun File.writer(charset: Charset = ...): OutputStreamWriter defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'buffered' @ [56:66] ==> @InlineOnly public inline fun Writer.buffered(bufferSize: Int = ...): BufferedWriter defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'use' @ [56:77] ==> @InlineOnly public inline fun <T : Closeable?, R> BufferedWriter.use(block: (BufferedWriter) -> Appendable /* = Appendable */): Appendable /* = Appendable */ defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> BufferedWriter
    <R> -> Appendable

'it' @ [57:21] ==> value-parameter it: BufferedWriter defined in example.ExampleAnnotationProcessor.processAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'appendln' @ [57:24] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'packageName' @ [57:43] ==> val packageName: String defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'it' @ [58:21] ==> value-parameter it: BufferedWriter defined in example.ExampleAnnotationProcessor.processAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'appendln' @ [58:24] ==> @InlineOnly public inline fun Appendable /* = Appendable */.appendln(value: CharSequence?): Appendable /* = Appendable */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'simpleName' @ [58:39] ==> val simpleName: String defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'generatedJavaClassName' @ [58:72] ==> val generatedJavaClassName: String defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'options' @ [63:13] ==> val options: (MutableMap<(String..String?), (String..String?)>..Map<(String..String?), (String..String?)>?) defined in example.ExampleAnnotationProcessor.processAnnotation[LocalVariableDescriptor]

'GENERATE_ERROR' @ [63:21] ==> public final val GENERATE_ERROR: String defined in example.ExampleAnnotationProcessor.Companion[PropertyDescriptorImpl]

'processingEnv' @ [64:13] ==> protected/*protected and package*/ final var processingEnv: (ProcessingEnvironment..ProcessingEnvironment?) defined in example.ExampleAnnotationProcessor[JavaPropertyDescriptor]

'messager' @ [64:27] ==> public final val ProcessingEnvironment.messager: (Messager..Messager?)[MyPropertyDescriptor]

'printMessage' @ [64:36] ==> public abstract fun printMessage(p0: (Diagnostic.Kind..Diagnostic.Kind?), p1: (CharSequence..CharSequence?)): Unit defined in javax.annotation.processing.Messager[JavaMethodDescriptor]

'ERROR' @ [64:65] ==> enum entry ERROR defined in javax.tools.Diagnostic.Kind[FakeCallableDescriptorForObject]

'RELEASE_6' @ [68:62] ==> enum entry RELEASE_6 defined in javax.lang.model.SourceVersion[FakeCallableDescriptorForObject]

'ANNOTATION_TO_PREFIX' @ [70:50] ==> public final val ANNOTATION_TO_PREFIX: Map<KClass<out Annotation>, String> defined in example.ExampleAnnotationProcessor.Companion[PropertyDescriptorImpl]

'keys' @ [70:71] ==> public abstract val keys: Set<KClass<out Annotation>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'map' @ [70:76] ==> public inline fun <T, R> Iterable<KClass<out Annotation>>.map(transform: (KClass<out Annotation>) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KClass<out Annotation>
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [70:82] ==> value-parameter it: KClass<out Annotation> defined in example.ExampleAnnotationProcessor.getSupportedAnnotationTypes.<anonymous>[ValueParameterDescriptorImpl]

'java' @ [70:85] ==> public val <T> KClass<out Annotation>.java: Class<out Annotation> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Annotation)

'canonicalName' @ [70:90] ==> public final val <T : (Any..Any?)> Class<out Annotation>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out Annotation)

'toSet' @ [70:106] ==> public fun <T> Iterable<(String..String?)>.toSet(): Set<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'setOf' @ [72:42] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'SUFFIX_OPTION' @ [72:48] ==> public final val SUFFIX_OPTION: String defined in example.ExampleAnnotationProcessor.Companion[PropertyDescriptorImpl]

'GENERATE_KOTLIN_CODE_OPTION' @ [72:63] ==> public final val GENERATE_KOTLIN_CODE_OPTION: String defined in example.ExampleAnnotationProcessor.Companion[PropertyDescriptorImpl]

'GENERATE_ERROR' @ [72:92] ==> public final val GENERATE_ERROR: String defined in example.ExampleAnnotationProcessor.Companion[PropertyDescriptorImpl]

