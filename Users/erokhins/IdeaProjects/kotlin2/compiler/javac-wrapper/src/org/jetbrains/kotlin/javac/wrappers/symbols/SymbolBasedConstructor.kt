'SymbolBasedMember<ExecutableElement>' @ [28:5] ==> public constructor SymbolBasedMember<out T : Element>(element: ExecutableElement, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedMember[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : Element> -> ExecutableElement

'element' @ [28:42] ==> value-parameter element: ExecutableElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedConstructor.<init>[ValueParameterDescriptorImpl]

'javac' @ [28:51] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedConstructor.<init>[ValueParameterDescriptorImpl]

'element' @ [31:17] ==> public final val element: ExecutableElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedConstructor[PropertyDescriptorImpl]

'typeParameters' @ [31:25] ==> public final val ExecutableElement.typeParameters: (MutableList<out (TypeParameterElement..TypeParameterElement?)>..List<(TypeParameterElement..TypeParameterElement?)>?)[MyPropertyDescriptor]

'map' @ [31:40] ==> public inline fun <T, R> Iterable<(TypeParameterElement..TypeParameterElement?)>.map(transform: ((TypeParameterElement..TypeParameterElement?)) -> SymbolBasedTypeParameter): List<SymbolBasedTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.TypeParameterElement..javax.lang.model.element.TypeParameterElement?)
    <R> -> SymbolBasedTypeParameter

'SymbolBasedTypeParameter' @ [31:46] ==> public constructor SymbolBasedTypeParameter(element: TypeParameterElement, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedTypeParameter[ClassConstructorDescriptorImpl]

'it' @ [31:71] ==> value-parameter it: (TypeParameterElement..TypeParameterElement?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedConstructor.<get-typeParameters>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [31:75] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedConstructor[PropertyDescriptorImpl]

'element' @ [34:17] ==> public final val element: ExecutableElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedConstructor[PropertyDescriptorImpl]

'valueParameters' @ [34:25] ==> internal fun ExecutableElement.valueParameters(javac: JavacWrapper): List<JavaValueParameter> defined in org.jetbrains.kotlin.javac.wrappers.symbols[SimpleFunctionDescriptorImpl]

'javac' @ [34:41] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedConstructor[PropertyDescriptorImpl]

