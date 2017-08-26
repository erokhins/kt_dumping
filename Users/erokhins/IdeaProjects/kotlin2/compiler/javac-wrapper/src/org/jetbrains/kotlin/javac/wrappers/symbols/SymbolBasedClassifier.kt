'SymbolBasedElement<T>' @ [29:5] ==> public constructor SymbolBasedElement<out T : Element>(element: T, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedElement[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : Element> -> T

'element' @ [29:27] ==> value-parameter element: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifier.<init>[ValueParameterDescriptorImpl]

'javac' @ [29:36] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifier.<init>[ValueParameterDescriptorImpl]

'element' @ [32:17] ==> public final val element: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifier[PropertyDescriptorImpl]

'annotationMirrors' @ [32:25] ==> public final val Element.annotationMirrors: (MutableList<out (AnnotationMirror..AnnotationMirror?)>..List<(AnnotationMirror..AnnotationMirror?)>?)[MyPropertyDescriptor]

'map' @ [32:43] ==> public inline fun <T, R> Iterable<(AnnotationMirror..AnnotationMirror?)>.map(transform: ((AnnotationMirror..AnnotationMirror?)) -> SymbolBasedAnnotation): List<SymbolBasedAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.AnnotationMirror..javax.lang.model.element.AnnotationMirror?)
    <R> -> SymbolBasedAnnotation

'SymbolBasedAnnotation' @ [32:49] ==> public constructor SymbolBasedAnnotation(annotationMirror: AnnotationMirror, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotation[ClassConstructorDescriptorImpl]

'it' @ [32:71] ==> value-parameter it: (AnnotationMirror..AnnotationMirror?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifier.<get-annotations>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [32:75] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifier[PropertyDescriptorImpl]

'element' @ [34:51] ==> public final val element: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifier[PropertyDescriptorImpl]

'findAnnotation' @ [34:59] ==> internal fun AnnotatedConstruct.findAnnotation(fqName: FqName, javac: JavacWrapper): SymbolBasedAnnotation? defined in org.jetbrains.kotlin.javac.wrappers.symbols[SimpleFunctionDescriptorImpl]

'fqName' @ [34:74] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifier.findAnnotation[ValueParameterDescriptorImpl]

'javac' @ [34:82] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifier[PropertyDescriptorImpl]

'javac' @ [37:17] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifier[PropertyDescriptorImpl]

'isDeprecated' @ [37:23] ==> public final fun isDeprecated(element: Element): Boolean defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'element' @ [37:36] ==> public final val element: T defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifier[PropertyDescriptorImpl]

