'KotlinAnnotationProvider' @ [23:41] ==> public constructor KotlinAnnotationProvider(annotationsReader: Reader) defined in org.jetbrains.kotlin.annotation.KotlinAnnotationProvider[ClassConstructorDescriptorImpl]

'StringReader' @ [23:66] ==> public constructor StringReader(p0: (String..String?)) defined in java.io.StringReader[JavaClassConstructorDescriptor]

'file' @ [25:9] ==> value-parameter file: File defined in org.jetbrains.kotlin.annotation.MutableKotlinAnnotationProvider.addAnnotationsFrom[ValueParameterDescriptorImpl]

'bufferedReader' @ [25:14] ==> @InlineOnly public inline fun File.bufferedReader(charset: Charset = ..., bufferSize: Int = ...): BufferedReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'use' @ [25:31] ==> @InlineOnly public inline fun <T : Closeable?, R> BufferedReader.use(block: (BufferedReader) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> BufferedReader
    <R> -> Unit

'readAnnotations' @ [25:37] ==> protected final fun readAnnotations(annotationsReader: Reader): Unit defined in org.jetbrains.kotlin.annotation.MutableKotlinAnnotationProvider[SimpleFunctionDescriptorImpl]

'it' @ [25:53] ==> value-parameter it: BufferedReader defined in org.jetbrains.kotlin.annotation.MutableKotlinAnnotationProvider.addAnnotationsFrom.<anonymous>[ValueParameterDescriptorImpl]

'kotlinClassesInternal' @ [29:9] ==> protected final val kotlinClassesInternal: LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in org.jetbrains.kotlin.annotation.MutableKotlinAnnotationProvider[PropertyDescriptorImpl]

'removeAll' @ [29:31] ==> public open fun removeAll(elements: Collection<String>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'classesFqNames' @ [29:41] ==> value-parameter classesFqNames: Set<String> defined in org.jetbrains.kotlin.annotation.MutableKotlinAnnotationProvider.removeClasses[ValueParameterDescriptorImpl]

'component1' @ [31:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, MutableSet<AnnotatedElement>>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> MutableSet<AnnotatedElement>

'component2' @ [31:27] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, MutableSet<AnnotatedElement>>.component2(): MutableSet<AnnotatedElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> MutableSet<AnnotatedElement>

'annotatedKotlinElementsInternal' @ [31:40] ==> protected final val annotatedKotlinElementsInternal: LinkedHashMap<String, MutableSet<AnnotatedElement>> /* = LinkedHashMap<String, MutableSet<AnnotatedElement>> */ defined in org.jetbrains.kotlin.annotation.MutableKotlinAnnotationProvider[PropertyDescriptorImpl]

'elements' @ [32:13] ==> val elements: MutableSet<AnnotatedElement> defined in org.jetbrains.kotlin.annotation.MutableKotlinAnnotationProvider.removeClasses[LocalVariableDescriptor]

'removeAll' @ [32:22] ==> public fun <T> MutableIterable<AnnotatedElement>.removeAll(predicate: (AnnotatedElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotatedElement

'it' @ [32:34] ==> value-parameter it: AnnotatedElement defined in org.jetbrains.kotlin.annotation.MutableKotlinAnnotationProvider.removeClasses.<anonymous>[ValueParameterDescriptorImpl]

'classFqName' @ [32:37] ==> public final val classFqName: String defined in org.jetbrains.kotlin.annotation.AnnotatedElement[PropertyDescriptorImpl]

'classesFqNames' @ [32:52] ==> value-parameter classesFqNames: Set<String> defined in org.jetbrains.kotlin.annotation.MutableKotlinAnnotationProvider.removeClasses[ValueParameterDescriptorImpl]

