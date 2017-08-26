'SymbolBasedElement<T>' @ [32:5] ==> public constructor SymbolBasedElement<out T : Element>(element: T, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedElement[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : Element> -> T

'element' @ [32:27] ==> value-parameter element: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMember.<init>[ValueParameterDescriptorImpl]

'javac' @ [32:36] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMember.<init>[ValueParameterDescriptorImpl]

'with' @ [35:17] ==> @InlineOnly public inline fun <T, R> with(receiver: Symbol.ClassSymbol, block: Symbol.ClassSymbol.() -> SymbolBasedClass): SymbolBasedClass defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassSymbol
    <R> -> SymbolBasedClass

'element' @ [35:22] ==> public final val element: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMember[PropertyDescriptorImpl]

'enclosingElement' @ [35:30] ==> public final val Element.enclosingElement: (Element..Element?)[MyPropertyDescriptor]

'SymbolBasedClass' @ [36:13] ==> public constructor SymbolBasedClass(element: TypeElement, javac: JavacWrapper, file: JavaFileObject?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[ClassConstructorDescriptorImpl]

'this' @ [36:30] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMember.<get-containingClass>.<anonymous>[ReceiverParameterDescriptorImpl]

'javac' @ [36:36] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMember[PropertyDescriptorImpl]

'classfile' @ [36:43] ==> public final var classfile: (JavaFileObject..JavaFileObject?) defined in com.sun.tools.javac.code.Symbol.ClassSymbol[JavaPropertyDescriptor]

'element' @ [40:17] ==> public final val element: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMember[PropertyDescriptorImpl]

'annotationMirrors' @ [40:25] ==> public final val Element.annotationMirrors: (MutableList<out (AnnotationMirror..AnnotationMirror?)>..List<(AnnotationMirror..AnnotationMirror?)>?)[MyPropertyDescriptor]

'map' @ [40:43] ==> public inline fun <T, R> Iterable<(AnnotationMirror..AnnotationMirror?)>.map(transform: ((AnnotationMirror..AnnotationMirror?)) -> SymbolBasedAnnotation): List<SymbolBasedAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.AnnotationMirror..javax.lang.model.element.AnnotationMirror?)
    <R> -> SymbolBasedAnnotation

'SymbolBasedAnnotation' @ [40:49] ==> public constructor SymbolBasedAnnotation(annotationMirror: AnnotationMirror, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotation[ClassConstructorDescriptorImpl]

'it' @ [40:71] ==> value-parameter it: (AnnotationMirror..AnnotationMirror?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMember.<get-annotations>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [40:75] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMember[PropertyDescriptorImpl]

'element' @ [42:51] ==> public final val element: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMember[PropertyDescriptorImpl]

'findAnnotation' @ [42:59] ==> internal fun AnnotatedConstruct.findAnnotation(fqName: FqName, javac: JavacWrapper): SymbolBasedAnnotation? defined in org.jetbrains.kotlin.javac.wrappers.symbols in file utils.kt[SimpleFunctionDescriptorImpl]

'fqName' @ [42:74] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMember.findAnnotation[ValueParameterDescriptorImpl]

'javac' @ [42:82] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMember[PropertyDescriptorImpl]

'element' @ [45:17] ==> public final val element: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMember[PropertyDescriptorImpl]

'getVisibility' @ [45:25] ==> internal fun Element.getVisibility(): Visibility defined in org.jetbrains.kotlin.javac.wrappers.symbols in file utils.kt[SimpleFunctionDescriptorImpl]

'identifier' @ [48:22] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'element' @ [48:33] ==> public final val element: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMember[PropertyDescriptorImpl]

'simpleName' @ [48:41] ==> public final val Element.simpleName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [48:52] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'javac' @ [51:17] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMember[PropertyDescriptorImpl]

'isDeprecated' @ [51:23] ==> public final fun isDeprecated(element: Element): Boolean defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'element' @ [51:36] ==> public final val element: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMember[PropertyDescriptorImpl]

'element' @ [54:17] ==> public final val element: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMember[PropertyDescriptorImpl]

'isAbstract' @ [54:25] ==> internal val Element.isAbstract: Boolean defined in org.jetbrains.kotlin.javac.wrappers.symbols in file utils.kt[PropertyDescriptorImpl]

'element' @ [57:17] ==> public final val element: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMember[PropertyDescriptorImpl]

'isStatic' @ [57:25] ==> internal val Element.isStatic: Boolean defined in org.jetbrains.kotlin.javac.wrappers.symbols in file utils.kt[PropertyDescriptorImpl]

'element' @ [60:17] ==> public final val element: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMember[PropertyDescriptorImpl]

'isFinal' @ [60:25] ==> internal val Element.isFinal: Boolean defined in org.jetbrains.kotlin.javac.wrappers.symbols in file utils.kt[PropertyDescriptorImpl]

