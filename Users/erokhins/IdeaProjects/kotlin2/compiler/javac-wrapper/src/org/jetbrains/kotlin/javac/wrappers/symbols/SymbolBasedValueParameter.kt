'SymbolBasedElement<VariableElement>' @ [32:5] ==> public constructor SymbolBasedElement<out T : Element>(element: VariableElement, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedElement[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : Element> -> VariableElement

'element' @ [32:41] ==> value-parameter element: VariableElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedValueParameter.<init>[ValueParameterDescriptorImpl]

'javac' @ [32:50] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedValueParameter.<init>[ValueParameterDescriptorImpl]

'element' @ [35:17] ==> public final val element: VariableElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedValueParameter[PropertyDescriptorImpl]

'annotationMirrors' @ [35:25] ==> public final val VariableElement.annotationMirrors: (MutableList<out (AnnotationMirror..AnnotationMirror?)>..List<(AnnotationMirror..AnnotationMirror?)>?)[MyPropertyDescriptor]

'map' @ [35:43] ==> public inline fun <T, R> Iterable<(AnnotationMirror..AnnotationMirror?)>.map(transform: ((AnnotationMirror..AnnotationMirror?)) -> SymbolBasedAnnotation): List<SymbolBasedAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.AnnotationMirror..javax.lang.model.element.AnnotationMirror?)
    <R> -> SymbolBasedAnnotation

'SymbolBasedAnnotation' @ [35:49] ==> public constructor SymbolBasedAnnotation(annotationMirror: AnnotationMirror, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotation[ClassConstructorDescriptorImpl]

'it' @ [35:71] ==> value-parameter it: (AnnotationMirror..AnnotationMirror?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedValueParameter.<get-annotations>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [35:75] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedValueParameter[PropertyDescriptorImpl]

'element' @ [38:13] ==> public final val element: VariableElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedValueParameter[PropertyDescriptorImpl]

'findAnnotation' @ [38:21] ==> internal fun AnnotatedConstruct.findAnnotation(fqName: FqName, javac: JavacWrapper): SymbolBasedAnnotation? defined in org.jetbrains.kotlin.javac.wrappers.symbols in file utils.kt[SimpleFunctionDescriptorImpl]

'fqName' @ [38:36] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedValueParameter.findAnnotation[ValueParameterDescriptorImpl]

'javac' @ [38:44] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedValueParameter[PropertyDescriptorImpl]

'javac' @ [41:18] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedValueParameter[PropertyDescriptorImpl]

'isDeprecated' @ [41:24] ==> public final fun isDeprecated(element: Element): Boolean defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'element' @ [41:37] ==> public final val element: VariableElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedValueParameter[PropertyDescriptorImpl]

'identifier' @ [44:22] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'elementName' @ [44:33] ==> private final val elementName: String defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedValueParameter[PropertyDescriptorImpl]

'SymbolBasedType' @ [47:17] ==> public companion object defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType[FakeCallableDescriptorForObject]

'create' @ [47:33] ==> public final fun <T : TypeMirror> create(t: (TypeMirror..TypeMirror?), javac: JavacWrapper): SymbolBasedType<TypeMirror> defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : TypeMirror> -> (javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)

'element' @ [47:40] ==> public final val element: VariableElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedValueParameter[PropertyDescriptorImpl]

'asType' @ [47:48] ==> public abstract fun asType(): (TypeMirror..TypeMirror?) defined in javax.lang.model.element.VariableElement[JavaMethodDescriptor]

'javac' @ [47:58] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedValueParameter[PropertyDescriptorImpl]

