'SymbolBasedMember<ExecutableElement>' @ [26:5] ==> public constructor SymbolBasedMember<out T : Element>(element: ExecutableElement, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMember[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : Element> -> ExecutableElement

'element' @ [26:42] ==> value-parameter element: ExecutableElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMethod.<init>[ValueParameterDescriptorImpl]

'javac' @ [26:51] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMethod.<init>[ValueParameterDescriptorImpl]

'element' @ [29:17] ==> public final val element: ExecutableElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMethod[PropertyDescriptorImpl]

'typeParameters' @ [29:25] ==> public final val ExecutableElement.typeParameters: (MutableList<out (TypeParameterElement..TypeParameterElement?)>..List<(TypeParameterElement..TypeParameterElement?)>?)[MyPropertyDescriptor]

'map' @ [29:40] ==> public inline fun <T, R> Iterable<(TypeParameterElement..TypeParameterElement?)>.map(transform: ((TypeParameterElement..TypeParameterElement?)) -> SymbolBasedTypeParameter): List<SymbolBasedTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.TypeParameterElement..javax.lang.model.element.TypeParameterElement?)
    <R> -> SymbolBasedTypeParameter

'SymbolBasedTypeParameter' @ [29:46] ==> public constructor SymbolBasedTypeParameter(element: TypeParameterElement, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedTypeParameter[ClassConstructorDescriptorImpl]

'it' @ [29:71] ==> value-parameter it: (TypeParameterElement..TypeParameterElement?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMethod.<get-typeParameters>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [29:75] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMethod[PropertyDescriptorImpl]

'element' @ [32:17] ==> public final val element: ExecutableElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMethod[PropertyDescriptorImpl]

'valueParameters' @ [32:25] ==> internal fun ExecutableElement.valueParameters(javac: JavacWrapper): List<JavaValueParameter> defined in org.jetbrains.kotlin.javac.wrappers.symbols in file utils.kt[SimpleFunctionDescriptorImpl]

'javac' @ [32:41] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMethod[PropertyDescriptorImpl]

'SymbolBasedType' @ [35:17] ==> public companion object defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType[FakeCallableDescriptorForObject]

'create' @ [35:33] ==> public final fun <T : TypeMirror> create(t: (TypeMirror..TypeMirror?), javac: JavacWrapper): SymbolBasedType<TypeMirror> defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : TypeMirror> -> (javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)

'element' @ [35:40] ==> public final val element: ExecutableElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMethod[PropertyDescriptorImpl]

'returnType' @ [35:48] ==> public final val ExecutableElement.returnType: (TypeMirror..TypeMirror?)[MyPropertyDescriptor]

'javac' @ [35:60] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMethod[PropertyDescriptorImpl]

'element' @ [38:17] ==> public final val element: ExecutableElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMethod[PropertyDescriptorImpl]

'defaultValue' @ [38:25] ==> public final val ExecutableElement.defaultValue: (AnnotationValue..AnnotationValue?)[MyPropertyDescriptor]

