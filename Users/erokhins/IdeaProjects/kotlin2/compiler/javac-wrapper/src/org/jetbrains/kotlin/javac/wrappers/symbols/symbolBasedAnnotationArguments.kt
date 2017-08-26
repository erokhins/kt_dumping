'when (value) {
            is AnnotationMirror -> SymbolBasedAnnotationAsAnnotationArgument(value, name, javac)
            is VariableElement -> SymbolBasedReferenceAnnotationArgument(value, javac)
            is TypeMirror -> SymbolBasedClassObjectAnnotationArgument(value, name, javac)
            is Collection<*> -> arrayAnnotationArguments(value, name, javac)
            is AnnotationValue -> create(value.value, name, javac)
            else -> SymbolBasedLiteralAnnotationArgument(value, name, javac)
        }' @ [33:91] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JavaAnnotationArgument, entry1: JavaAnnotationArgument, entry2: JavaAnnotationArgument, entry3: JavaAnnotationArgument, entry4: JavaAnnotationArgument, entry5: JavaAnnotationArgument): JavaAnnotationArgument[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JavaAnnotationArgument

'value' @ [33:97] ==> value-parameter value: Any defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.create[ValueParameterDescriptorImpl]

'SymbolBasedAnnotationAsAnnotationArgument' @ [34:36] ==> public constructor SymbolBasedAnnotationAsAnnotationArgument(mirror: AnnotationMirror, name: Name, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationAsAnnotationArgument[ClassConstructorDescriptorImpl]

'value' @ [34:78] ==> value-parameter value: Any defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.create[ValueParameterDescriptorImpl]

'name' @ [34:85] ==> value-parameter name: Name defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.create[ValueParameterDescriptorImpl]

'javac' @ [34:91] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.create[ValueParameterDescriptorImpl]

'SymbolBasedReferenceAnnotationArgument' @ [35:35] ==> public constructor SymbolBasedReferenceAnnotationArgument(element: VariableElement, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedReferenceAnnotationArgument[ClassConstructorDescriptorImpl]

'value' @ [35:74] ==> value-parameter value: Any defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.create[ValueParameterDescriptorImpl]

'javac' @ [35:81] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.create[ValueParameterDescriptorImpl]

'SymbolBasedClassObjectAnnotationArgument' @ [36:30] ==> public constructor SymbolBasedClassObjectAnnotationArgument(type: TypeMirror, name: Name, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassObjectAnnotationArgument[ClassConstructorDescriptorImpl]

'value' @ [36:71] ==> value-parameter value: Any defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.create[ValueParameterDescriptorImpl]

'name' @ [36:78] ==> value-parameter name: Name defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.create[ValueParameterDescriptorImpl]

'javac' @ [36:84] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.create[ValueParameterDescriptorImpl]

'arrayAnnotationArguments' @ [37:33] ==> private final fun arrayAnnotationArguments(values: Collection<*>, name: Name, javac: JavacWrapper): JavaArrayAnnotationArgument defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion[SimpleFunctionDescriptorImpl]

'value' @ [37:58] ==> value-parameter value: Any defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.create[ValueParameterDescriptorImpl]

'name' @ [37:65] ==> value-parameter name: Name defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.create[ValueParameterDescriptorImpl]

'javac' @ [37:71] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.create[ValueParameterDescriptorImpl]

'create' @ [38:35] ==> public final fun create(value: Any, name: Name, javac: JavacWrapper): JavaAnnotationArgument defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion[SimpleFunctionDescriptorImpl]

'value' @ [38:42] ==> value-parameter value: Any defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.create[ValueParameterDescriptorImpl]

'value' @ [38:48] ==> public final val AnnotationValue.value: (Any..Any?)[MyPropertyDescriptor]

'name' @ [38:55] ==> value-parameter name: Name defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.create[ValueParameterDescriptorImpl]

'javac' @ [38:61] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.create[ValueParameterDescriptorImpl]

'SymbolBasedLiteralAnnotationArgument' @ [39:21] ==> public constructor SymbolBasedLiteralAnnotationArgument(value: Any, name: Name, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedLiteralAnnotationArgument[ClassConstructorDescriptorImpl]

'value' @ [39:58] ==> value-parameter value: Any defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.create[ValueParameterDescriptorImpl]

'name' @ [39:65] ==> value-parameter name: Name defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.create[ValueParameterDescriptorImpl]

'javac' @ [39:71] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.create[ValueParameterDescriptorImpl]

'values' @ [43:17] ==> value-parameter values: Collection<*> defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.arrayAnnotationArguments[ValueParameterDescriptorImpl]

'map' @ [43:24] ==> public inline fun <T, R> Iterable<Any?>.map(transform: (Any?) -> JavaAnnotationArgument): List<JavaAnnotationArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?
    <R> -> JavaAnnotationArgument

'if (it is Collection<*>) arrayAnnotationArguments(it, name, javac) else create(it!!, name, javac)' @ [43:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JavaAnnotationArgument, elseBranch: JavaAnnotationArgument): JavaAnnotationArgument[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JavaAnnotationArgument

'it' @ [43:34] ==> value-parameter it: Any? defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.arrayAnnotationArguments.<anonymous>[ValueParameterDescriptorImpl]

'arrayAnnotationArguments' @ [43:55] ==> private final fun arrayAnnotationArguments(values: Collection<*>, name: Name, javac: JavacWrapper): JavaArrayAnnotationArgument defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion[SimpleFunctionDescriptorImpl]

'it' @ [43:80] ==> value-parameter it: Any? defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.arrayAnnotationArguments.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [43:84] ==> value-parameter name: Name defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.arrayAnnotationArguments[ValueParameterDescriptorImpl]

'javac' @ [43:90] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.arrayAnnotationArguments[ValueParameterDescriptorImpl]

'create' @ [43:102] ==> public final fun create(value: Any, name: Name, javac: JavacWrapper): JavaAnnotationArgument defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion[SimpleFunctionDescriptorImpl]

'it' @ [43:109] ==> value-parameter it: Any? defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.arrayAnnotationArguments.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [43:115] ==> value-parameter name: Name defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.arrayAnnotationArguments[ValueParameterDescriptorImpl]

'javac' @ [43:121] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.arrayAnnotationArguments[ValueParameterDescriptorImpl]

'let' @ [44:18] ==> @InlineOnly public inline fun <T, R> List<JavaAnnotationArgument>.let(block: (List<JavaAnnotationArgument>) -> SymbolBasedArrayAnnotationArgument): SymbolBasedArrayAnnotationArgument defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<JavaAnnotationArgument>
    <R> -> SymbolBasedArrayAnnotationArgument

'SymbolBasedArrayAnnotationArgument' @ [44:40] ==> public constructor SymbolBasedArrayAnnotationArgument(args: List<JavaAnnotationArgument>, name: Name, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedArrayAnnotationArgument[ClassConstructorDescriptorImpl]

'argumentList' @ [44:75] ==> value-parameter argumentList: List<JavaAnnotationArgument> defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.arrayAnnotationArguments.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [44:89] ==> value-parameter name: Name defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.arrayAnnotationArguments[ValueParameterDescriptorImpl]

'javac' @ [44:95] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument.Companion.arrayAnnotationArguments[ValueParameterDescriptorImpl]

'SymbolBasedAnnotationArgument' @ [54:5] ==> private constructor SymbolBasedAnnotationArgument(name: Name, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument[ClassConstructorDescriptorImpl]

'name' @ [54:35] ==> value-parameter name: Name defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationAsAnnotationArgument.<init>[ValueParameterDescriptorImpl]

'javac' @ [54:41] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationAsAnnotationArgument.<init>[ValueParameterDescriptorImpl]

'SymbolBasedAnnotation' @ [56:36] ==> public constructor SymbolBasedAnnotation(annotationMirror: AnnotationMirror, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotation[ClassConstructorDescriptorImpl]

'mirror' @ [56:58] ==> public final val mirror: AnnotationMirror defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationAsAnnotationArgument[PropertyDescriptorImpl]

'javac' @ [56:66] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationAsAnnotationArgument[PropertyDescriptorImpl]

'SymbolBasedAnnotationArgument' @ [63:5] ==> private constructor SymbolBasedAnnotationArgument(name: Name, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument[ClassConstructorDescriptorImpl]

'identifier' @ [63:40] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'element' @ [63:51] ==> value-parameter element: VariableElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedReferenceAnnotationArgument.<init>[ValueParameterDescriptorImpl]

'simpleName' @ [63:59] ==> public final val VariableElement.simpleName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [63:70] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'javac' @ [63:83] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedReferenceAnnotationArgument.<init>[ValueParameterDescriptorImpl]

'identifier' @ [65:22] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'element' @ [65:33] ==> public final val element: VariableElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedReferenceAnnotationArgument[PropertyDescriptorImpl]

'simpleName' @ [65:41] ==> public final val VariableElement.simpleName: (Name..Name?)[MyPropertyDescriptor]

'toString' @ [65:52] ==> public open fun toString(): String defined in javax.lang.model.element.Name[DeserializedSimpleFunctionDescriptor]

'SymbolBasedField' @ [67:30] ==> public constructor SymbolBasedField(element: VariableElement, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedField[ClassConstructorDescriptorImpl]

'element' @ [67:47] ==> public final val element: VariableElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedReferenceAnnotationArgument[PropertyDescriptorImpl]

'javac' @ [67:56] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedReferenceAnnotationArgument[PropertyDescriptorImpl]

'SymbolBasedAnnotationArgument' @ [75:5] ==> private constructor SymbolBasedAnnotationArgument(name: Name, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument[ClassConstructorDescriptorImpl]

'name' @ [75:35] ==> value-parameter name: Name defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassObjectAnnotationArgument.<init>[ValueParameterDescriptorImpl]

'javac' @ [75:41] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassObjectAnnotationArgument.<init>[ValueParameterDescriptorImpl]

'SymbolBasedType' @ [77:40] ==> public companion object defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType[FakeCallableDescriptorForObject]

'create' @ [77:56] ==> public final fun <T : TypeMirror> create(t: TypeMirror, javac: JavacWrapper): SymbolBasedType<TypeMirror> defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedType.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : TypeMirror> -> TypeMirror

'type' @ [77:63] ==> public final val type: TypeMirror defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassObjectAnnotationArgument[PropertyDescriptorImpl]

'javac' @ [77:69] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassObjectAnnotationArgument[PropertyDescriptorImpl]

'SymbolBasedAnnotationArgument' @ [85:5] ==> private constructor SymbolBasedAnnotationArgument(name: Name, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument[ClassConstructorDescriptorImpl]

'name' @ [85:35] ==> value-parameter name: Name defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedArrayAnnotationArgument.<init>[ValueParameterDescriptorImpl]

'javac' @ [85:41] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedArrayAnnotationArgument.<init>[ValueParameterDescriptorImpl]

'args' @ [87:34] ==> public final val args: List<JavaAnnotationArgument> defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedArrayAnnotationArgument[PropertyDescriptorImpl]

'SymbolBasedAnnotationArgument' @ [95:5] ==> private constructor SymbolBasedAnnotationArgument(name: Name, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedAnnotationArgument[ClassConstructorDescriptorImpl]

'name' @ [95:35] ==> value-parameter name: Name defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedLiteralAnnotationArgument.<init>[ValueParameterDescriptorImpl]

'javac' @ [95:41] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedLiteralAnnotationArgument.<init>[ValueParameterDescriptorImpl]

