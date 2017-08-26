'annotationMirror' @ [35:17] ==> public final val annotationMirror: AnnotationMirror defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotation[PropertyDescriptorImpl]

'elementValues' @ [35:34] ==> public final val AnnotationMirror.elementValues: (MutableMap<out (ExecutableElement..ExecutableElement?), out (AnnotationValue..AnnotationValue?)>..Map<out (ExecutableElement..ExecutableElement?), (AnnotationValue..AnnotationValue?)>?)[MyPropertyDescriptor]

'map' @ [35:48] ==> public inline fun <K, V, R> Map<out (ExecutableElement..ExecutableElement?), (AnnotationValue..AnnotationValue?)>.map(transform: (Map.Entry<(ExecutableElement..ExecutableElement?), (AnnotationValue..AnnotationValue?)>) -> JavaAnnotationArgument): List<JavaAnnotationArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (javax.lang.model.element.ExecutableElement..javax.lang.model.element.ExecutableElement?)
    <V> -> (javax.lang.model.element.AnnotationValue..javax.lang.model.element.AnnotationValue?)
    <R> -> JavaAnnotationArgument

'component1' @ [35:55] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(ExecutableElement..ExecutableElement?), (AnnotationValue..AnnotationValue?)>.component1(): (ExecutableElement..ExecutableElement?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (javax.lang.model.element.ExecutableElement..javax.lang.model.element.ExecutableElement?)
    <V> -> (javax.lang.model.element.AnnotationValue..javax.lang.model.element.AnnotationValue?)

'component2' @ [35:60] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(ExecutableElement..ExecutableElement?), (AnnotationValue..AnnotationValue?)>.component2(): (AnnotationValue..AnnotationValue?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (javax.lang.model.element.ExecutableElement..javax.lang.model.element.ExecutableElement?)
    <V> -> (javax.lang.model.element.AnnotationValue..javax.lang.model.element.AnnotationValue?)

'SymbolBasedAnnotationArgument' @ [36:13] ==> public companion object defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument[FakeCallableDescriptorForObject]

'create' @ [36:43] ==> public final fun create(value: Any, name: Name, javac: JavacWrapper): JavaAnnotationArgument defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion[SimpleFunctionDescriptorImpl]

'value' @ [36:50] ==> val value: (AnnotationValue..AnnotationValue?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotation.<get-arguments>.<anonymous>[LocalVariableDescriptor]

'value' @ [36:56] ==> public final val AnnotationValue.value: (Any..Any?)[MyPropertyDescriptor]

'identifier' @ [36:68] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'key' @ [36:79] ==> val key: (ExecutableElement..ExecutableElement?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotation.<get-arguments>.<anonymous>[LocalVariableDescriptor]

'simpleName' @ [36:83] ==> public final val ExecutableElement.simpleName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [36:94] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'javac' @ [36:107] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotation[PropertyDescriptorImpl]

'annotationMirror' @ [40:18] ==> public final val annotationMirror: AnnotationMirror defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotation[PropertyDescriptorImpl]

'annotationType' @ [40:35] ==> public final val AnnotationMirror.annotationType: (DeclaredType..DeclaredType?)[MyPropertyDescriptor]

'asElement' @ [40:50] ==> public abstract fun asElement(): (Element..Element?) defined in javax.lang.model.type.DeclaredType[JavaMethodDescriptor]

'computeClassId' @ [40:80] ==> internal fun TypeElement.computeClassId(): ClassId? defined in org.jetbrains.kotlin.javac.wrappers.symbols in file utils.kt[SimpleFunctionDescriptorImpl]

'with' @ [42:30] ==> @InlineOnly public inline fun <T, R> with(receiver: Symbol.ClassSymbol, block: Symbol.ClassSymbol.() -> SymbolBasedClass): SymbolBasedClass defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassSymbol
    <R> -> SymbolBasedClass

'annotationMirror' @ [42:35] ==> public final val annotationMirror: AnnotationMirror defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotation[PropertyDescriptorImpl]

'annotationType' @ [42:52] ==> public final val AnnotationMirror.annotationType: (DeclaredType..DeclaredType?)[MyPropertyDescriptor]

'asElement' @ [42:67] ==> public abstract fun asElement(): (Element..Element?) defined in javax.lang.model.type.DeclaredType[JavaMethodDescriptor]

'SymbolBasedClass' @ [43:9] ==> public constructor SymbolBasedClass(element: TypeElement, javac: JavacWrapper, file: JavaFileObject?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[ClassConstructorDescriptorImpl]

'this' @ [43:26] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotation.resolve.<anonymous>[ReceiverParameterDescriptorImpl]

'javac' @ [43:32] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotation[PropertyDescriptorImpl]

'classfile' @ [43:39] ==> public final var classfile: (JavaFileObject..JavaFileObject?) defined in com.sun.tools.javac.code.Symbol.ClassSymbol[JavaPropertyDescriptor]

