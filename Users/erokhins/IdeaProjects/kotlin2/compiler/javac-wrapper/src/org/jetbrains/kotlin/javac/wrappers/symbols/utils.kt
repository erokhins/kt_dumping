'modifiers' @ [31:13] ==> public final val Element.modifiers: (MutableSet<(Modifier..Modifier?)>..Set<(Modifier..Modifier?)>?)[MyPropertyDescriptor]

'contains' @ [31:23] ==> public abstract fun contains(element: (Modifier..Modifier?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'ABSTRACT' @ [31:41] ==> enum entry ABSTRACT defined in javax.lang.model.element.Modifier[FakeCallableDescriptorForObject]

'modifiers' @ [34:13] ==> public final val Element.modifiers: (MutableSet<(Modifier..Modifier?)>..Set<(Modifier..Modifier?)>?)[MyPropertyDescriptor]

'contains' @ [34:23] ==> public abstract fun contains(element: (Modifier..Modifier?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'STATIC' @ [34:41] ==> enum entry STATIC defined in javax.lang.model.element.Modifier[FakeCallableDescriptorForObject]

'modifiers' @ [37:13] ==> public final val Element.modifiers: (MutableSet<(Modifier..Modifier?)>..Set<(Modifier..Modifier?)>?)[MyPropertyDescriptor]

'contains' @ [37:23] ==> public abstract fun contains(element: (Modifier..Modifier?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'FINAL' @ [37:41] ==> enum entry FINAL defined in javax.lang.model.element.Modifier[FakeCallableDescriptorForObject]

'when {
    Modifier.PUBLIC in modifiers -> Visibilities.PUBLIC
    Modifier.PRIVATE in modifiers -> Visibilities.PRIVATE
    Modifier.PROTECTED in modifiers -> {
        if (Modifier.STATIC in modifiers) {
            JavaVisibilities.PROTECTED_STATIC_VISIBILITY
        }
        else {
            JavaVisibilities.PROTECTED_AND_PACKAGE
        }
    }
    else -> JavaVisibilities.PACKAGE_VISIBILITY
}' @ [39:52] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Visibility, entry1: Visibility, entry2: Visibility, entry3: Visibility): Visibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Visibility

'in' @ [40:5] ==> public abstract fun contains(element: (Modifier..Modifier?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'PUBLIC' @ [40:14] ==> enum entry PUBLIC defined in javax.lang.model.element.Modifier[FakeCallableDescriptorForObject]

'modifiers' @ [40:24] ==> public final val Element.modifiers: (MutableSet<(Modifier..Modifier?)>..Set<(Modifier..Modifier?)>?)[MyPropertyDescriptor]

'PUBLIC' @ [40:50] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'in' @ [41:5] ==> public abstract fun contains(element: (Modifier..Modifier?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'PRIVATE' @ [41:14] ==> enum entry PRIVATE defined in javax.lang.model.element.Modifier[FakeCallableDescriptorForObject]

'modifiers' @ [41:25] ==> public final val Element.modifiers: (MutableSet<(Modifier..Modifier?)>..Set<(Modifier..Modifier?)>?)[MyPropertyDescriptor]

'PRIVATE' @ [41:51] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'in' @ [42:5] ==> public abstract fun contains(element: (Modifier..Modifier?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'PROTECTED' @ [42:14] ==> enum entry PROTECTED defined in javax.lang.model.element.Modifier[FakeCallableDescriptorForObject]

'modifiers' @ [42:27] ==> public final val Element.modifiers: (MutableSet<(Modifier..Modifier?)>..Set<(Modifier..Modifier?)>?)[MyPropertyDescriptor]

'if (Modifier.STATIC in modifiers) {
            JavaVisibilities.PROTECTED_STATIC_VISIBILITY
        }
        else {
            JavaVisibilities.PROTECTED_AND_PACKAGE
        }' @ [43:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Visibility, elseBranch: Visibility): Visibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Visibility

'in' @ [43:13] ==> public abstract fun contains(element: (Modifier..Modifier?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'STATIC' @ [43:22] ==> enum entry STATIC defined in javax.lang.model.element.Modifier[FakeCallableDescriptorForObject]

'modifiers' @ [43:32] ==> public final val Element.modifiers: (MutableSet<(Modifier..Modifier?)>..Set<(Modifier..Modifier?)>?)[MyPropertyDescriptor]

'PROTECTED_STATIC_VISIBILITY' @ [44:30] ==> @NotNull public final val PROTECTED_STATIC_VISIBILITY: Visibility defined in org.jetbrains.kotlin.load.java.JavaVisibilities[JavaPropertyDescriptor]

'PROTECTED_AND_PACKAGE' @ [47:30] ==> @NotNull public final val PROTECTED_AND_PACKAGE: Visibility defined in org.jetbrains.kotlin.load.java.JavaVisibilities[JavaPropertyDescriptor]

'PACKAGE_VISIBILITY' @ [50:30] ==> @NotNull public final val PACKAGE_VISIBILITY: Visibility defined in org.jetbrains.kotlin.load.java.JavaVisibilities[JavaPropertyDescriptor]

'enclosingElement' @ [54:9] ==> public final val TypeElement.enclosingElement: (Element..Element?)[MyPropertyDescriptor]

'kind' @ [54:26] ==> public final val Element.kind: (ElementKind..ElementKind?)[MyPropertyDescriptor]

'PACKAGE' @ [54:46] ==> enum entry PACKAGE defined in javax.lang.model.element.ElementKind[FakeCallableDescriptorForObject]

'?:' @ [55:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ClassId?, right: ClassId): ClassId[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ClassId

'enclosingElement' @ [55:30] ==> public final val TypeElement.enclosingElement: (Element..Element?)[MyPropertyDescriptor]

'computeClassId' @ [55:63] ==> internal fun TypeElement.computeClassId(): ClassId? defined in org.jetbrains.kotlin.javac.wrappers.symbols in file utils.kt[SimpleFunctionDescriptorImpl]

'parentClassId' @ [56:16] ==> val parentClassId: ClassId defined in org.jetbrains.kotlin.javac.wrappers.symbols.computeClassId[LocalVariableDescriptor]

'createNestedClassId' @ [56:30] ==> @NotNull public open fun createNestedClassId(@NotNull p0: Name): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'identifier' @ [56:55] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'simpleName' @ [56:66] ==> public final val TypeElement.simpleName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [56:77] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'topLevel' @ [59:20] ==> @NotNull public open fun topLevel(@NotNull p0: FqName): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'FqName' @ [59:29] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'qualifiedName' @ [59:36] ==> public final val TypeElement.qualifiedName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [59:50] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'parameters' @ [63:9] ==> public final val ExecutableElement.parameters: (MutableList<out (VariableElement..VariableElement?)>..List<(VariableElement..VariableElement?)>?)[MyPropertyDescriptor]

'mapIndexed' @ [63:20] ==> public inline fun <T, R> Iterable<(VariableElement..VariableElement?)>.mapIndexed(transform: (index: Int, (VariableElement..VariableElement?)) -> SymbolBasedValueParameter): List<SymbolBasedValueParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.VariableElement..javax.lang.model.element.VariableElement?)
    <R> -> SymbolBasedValueParameter

'SymbolBasedValueParameter' @ [64:13] ==> public constructor SymbolBasedValueParameter(element: VariableElement, elementName: String, isVararg: Boolean, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedValueParameter[ClassConstructorDescriptorImpl]

'parameter' @ [64:39] ==> value-parameter parameter: (VariableElement..VariableElement?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.valueParameters.<anonymous>[ValueParameterDescriptorImpl]

'parameter' @ [65:39] ==> value-parameter parameter: (VariableElement..VariableElement?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.valueParameters.<anonymous>[ValueParameterDescriptorImpl]

'simpleName' @ [65:49] ==> public final val VariableElement.simpleName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [65:60] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'index' @ [66:39] ==> value-parameter index: Int defined in org.jetbrains.kotlin.javac.wrappers.symbols.valueParameters.<anonymous>[ValueParameterDescriptorImpl]

'parameters' @ [66:48] ==> public final val ExecutableElement.parameters: (MutableList<out (VariableElement..VariableElement?)>..List<(VariableElement..VariableElement?)>?)[MyPropertyDescriptor]

'lastIndex' @ [66:59] ==> public val <T> List<(VariableElement..VariableElement?)>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.VariableElement..javax.lang.model.element.VariableElement?)

'isVarArgs' @ [66:72] ==> public final val ExecutableElement.isVarArgs: Boolean[MyPropertyDescriptor]

'javac' @ [67:39] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.valueParameters[ValueParameterDescriptorImpl]

'annotationMirrors' @ [72:9] ==> public final val AnnotatedConstruct.annotationMirrors: (MutableList<out (AnnotationMirror..AnnotationMirror?)>..List<(AnnotationMirror..AnnotationMirror?)>?)[MyPropertyDescriptor]

'find' @ [72:27] ==> @InlineOnly public inline fun <T> Iterable<(AnnotationMirror..AnnotationMirror?)>.find(predicate: ((AnnotationMirror..AnnotationMirror?)) -> Boolean): AnnotationMirror? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.lang.model.element.AnnotationMirror..javax.lang.model.element.AnnotationMirror?)

'==' @ [73:13] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'it' @ [73:14] ==> value-parameter it: (AnnotationMirror..AnnotationMirror?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.findAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'annotationType' @ [73:17] ==> public final val AnnotationMirror.annotationType: (DeclaredType..DeclaredType?)[MyPropertyDescriptor]

'asElement' @ [73:32] ==> public abstract fun asElement(): (Element..Element?) defined in javax.lang.model.type.DeclaredType[JavaMethodDescriptor]

'qualifiedName' @ [73:60] ==> public final val TypeElement.qualifiedName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [73:74] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'fqName' @ [73:88] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.wrappers.symbols.findAnnotation[ValueParameterDescriptorImpl]

'asString' @ [73:95] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'let' @ [74:12] ==> @InlineOnly public inline fun <T, R> AnnotationMirror.let(block: (AnnotationMirror) -> SymbolBasedAnnotation): SymbolBasedAnnotation defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationMirror
    <R> -> SymbolBasedAnnotation

'SymbolBasedAnnotation' @ [74:18] ==> public constructor SymbolBasedAnnotation(annotationMirror: AnnotationMirror, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotation[ClassConstructorDescriptorImpl]

'it' @ [74:40] ==> value-parameter it: AnnotationMirror defined in org.jetbrains.kotlin.javac.wrappers.symbols.findAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [74:44] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.findAnnotation[ValueParameterDescriptorImpl]

