'SymbolBasedClassifier<TypeParameterElement>' @ [28:5] ==> public constructor SymbolBasedClassifier<out T : Element>(element: TypeParameterElement, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifier[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : Element> -> TypeParameterElement

'element' @ [28:49] ==> value-parameter element: TypeParameterElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedTypeParameter.<init>[ValueParameterDescriptorImpl]

'javac' @ [28:58] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedTypeParameter.<init>[ValueParameterDescriptorImpl]

'identifier' @ [31:22] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'element' @ [31:33] ==> public final val element: TypeParameterElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedTypeParameter[PropertyDescriptorImpl]

'simpleName' @ [31:41] ==> public final val TypeParameterElement.simpleName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [31:52] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'element' @ [34:17] ==> public final val element: TypeParameterElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedTypeParameter[PropertyDescriptorImpl]

'bounds' @ [34:25] ==> public final val TypeParameterElement.bounds: (MutableList<out (TypeMirror..TypeMirror?)>..List<(TypeMirror..TypeMirror?)>?)[MyPropertyDescriptor]

'map' @ [34:32] ==> public inline fun <T, R> Iterable<(TypeMirror..TypeMirror?)>.map(transform: ((TypeMirror..TypeMirror?)) -> SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>): List<SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)
    <R> -> SymbolBasedClassifierType<(javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)>

'SymbolBasedClassifierType' @ [34:38] ==> public constructor SymbolBasedClassifierType<out T : TypeMirror>(typeMirror: (TypeMirror..TypeMirror?), javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : TypeMirror> -> (javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)

'it' @ [34:64] ==> value-parameter it: (TypeMirror..TypeMirror?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedTypeParameter.<get-upperBounds>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [34:68] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedTypeParameter[PropertyDescriptorImpl]

