'this' @ [21:42] ==> <this> defined in org.jetbrains.idl2k.getterOrSetter[ReceiverParameterDescriptorImpl]

'attributes' @ [21:47] ==> public final val attributes: List<ExtendedAttribute> defined in org.jetbrains.idl2k.Operation[PropertyDescriptorImpl]

'map' @ [21:58] ==> public inline fun <T, R> Iterable<ExtendedAttribute>.map(transform: (ExtendedAttribute) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtendedAttribute
    <R> -> String

'it' @ [21:64] ==> value-parameter it: ExtendedAttribute defined in org.jetbrains.idl2k.getterOrSetter.<anonymous>[ValueParameterDescriptorImpl]

'call' @ [21:67] ==> public final val call: String defined in org.jetbrains.idl2k.ExtendedAttribute[PropertyDescriptorImpl]

'toSet' @ [21:74] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'let' @ [21:82] ==> @InlineOnly public inline fun <T, R> Set<String>.let(block: (Set<String>) -> NativeGetterOrSetter): NativeGetterOrSetter defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Set<String>
    <R> -> NativeGetterOrSetter

'when {
        "getter" in attributes -> NativeGetterOrSetter.GETTER
        "setter" in attributes -> NativeGetterOrSetter.SETTER
        else -> NativeGetterOrSetter.NONE
    }' @ [22:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: NativeGetterOrSetter, entry1: NativeGetterOrSetter, entry2: NativeGetterOrSetter): NativeGetterOrSetter[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> NativeGetterOrSetter

'in' @ [23:9] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'attributes' @ [23:21] ==> value-parameter attributes: Set<String> defined in org.jetbrains.idl2k.getterOrSetter.<anonymous>[ValueParameterDescriptorImpl]

'GETTER' @ [23:56] ==> enum entry GETTER defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'in' @ [24:9] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'attributes' @ [24:21] ==> value-parameter attributes: Set<String> defined in org.jetbrains.idl2k.getterOrSetter.<anonymous>[ValueParameterDescriptorImpl]

'SETTER' @ [24:56] ==> enum entry SETTER defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'NONE' @ [25:38] ==> enum entry NONE defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'function' @ [29:134] ==> value-parameter function: Operation defined in org.jetbrains.idl2k.generateFunction[ValueParameterDescriptorImpl]

'getterOrSetter' @ [29:143] ==> private fun Operation.getterOrSetter(): NativeGetterOrSetter defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'function' @ [30:9] ==> value-parameter function: Operation defined in org.jetbrains.idl2k.generateFunction[ValueParameterDescriptorImpl]

'attributes' @ [30:18] ==> public final val attributes: List<ExtendedAttribute> defined in org.jetbrains.idl2k.Operation[PropertyDescriptorImpl]

'map' @ [30:29] ==> public inline fun <T, R> Iterable<ExtendedAttribute>.map(transform: (ExtendedAttribute) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtendedAttribute
    <R> -> String

'it' @ [30:35] ==> value-parameter it: ExtendedAttribute defined in org.jetbrains.idl2k.generateFunction.<anonymous>[ValueParameterDescriptorImpl]

'call' @ [30:38] ==> public final val call: String defined in org.jetbrains.idl2k.ExtendedAttribute[PropertyDescriptorImpl]

'toSet' @ [30:45] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'let' @ [30:53] ==> @InlineOnly public inline fun <T, R> Set<String>.let(block: (Set<String>) -> GenerateFunction): GenerateFunction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Set<String>
    <R> -> GenerateFunction

'GenerateFunction' @ [31:13] ==> public constructor GenerateFunction(name: String, returnType: Type, arguments: List<GenerateAttribute>, nativeGetterOrSetter: NativeGetterOrSetter, static: Boolean, override: Boolean) defined in org.jetbrains.idl2k.GenerateFunction[ClassConstructorDescriptorImpl]

'functionName' @ [32:28] ==> value-parameter functionName: String defined in org.jetbrains.idl2k.generateFunction[ValueParameterDescriptorImpl]

'mapType' @ [33:34] ==> internal fun mapType(repository: Repository, type: Type): Type defined in org.jetbrains.idl2k in file typeMappings.kt[SimpleFunctionDescriptorImpl]

'repository' @ [33:42] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateFunction[ValueParameterDescriptorImpl]

'function' @ [33:54] ==> value-parameter function: Operation defined in org.jetbrains.idl2k.generateFunction[ValueParameterDescriptorImpl]

'returnType' @ [33:63] ==> public final val returnType: Type defined in org.jetbrains.idl2k.Operation[PropertyDescriptorImpl]

'let' @ [33:75] ==> @InlineOnly public inline fun <T, R> Type.let(block: (Type) -> Type): Type defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> Type

'if (nativeGetterOrSetter == NativeGetterOrSetter.GETTER) mapped.toNullableIfNonPrimitive() else mapped' @ [33:91] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'nativeGetterOrSetter' @ [33:95] ==> value-parameter nativeGetterOrSetter: NativeGetterOrSetter = ... defined in org.jetbrains.idl2k.generateFunction[ValueParameterDescriptorImpl]

'GETTER' @ [33:140] ==> enum entry GETTER defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'mapped' @ [33:148] ==> value-parameter mapped: Type defined in org.jetbrains.idl2k.generateFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toNullableIfNonPrimitive' @ [33:155] ==> @Suppress public fun <T : Type> Type.toNullableIfNonPrimitive(): Type defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Type> -> Type

'mapped' @ [33:187] ==> value-parameter mapped: Type defined in org.jetbrains.idl2k.generateFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'function' @ [34:33] ==> value-parameter function: Operation defined in org.jetbrains.idl2k.generateFunction[ValueParameterDescriptorImpl]

'parameters' @ [34:42] ==> public final val parameters: List<Attribute> defined in org.jetbrains.idl2k.Operation[PropertyDescriptorImpl]

'map' @ [34:53] ==> public inline fun <T, R> Iterable<Attribute>.map(transform: (Attribute) -> GenerateAttribute): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Attribute
    <R> -> GenerateAttribute

'mapType' @ [35:42] ==> internal fun mapType(repository: Repository, type: Type): Type defined in org.jetbrains.idl2k in file typeMappings.kt[SimpleFunctionDescriptorImpl]

'repository' @ [35:50] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateFunction[ValueParameterDescriptorImpl]

'it' @ [35:62] ==> value-parameter it: Attribute defined in org.jetbrains.idl2k.generateFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [35:65] ==> public final val type: Type defined in org.jetbrains.idl2k.Attribute[PropertyDescriptorImpl]

'GenerateAttribute' @ [37:25] ==> public constructor GenerateAttribute(name: String, type: Type, initializer: String?, getterSetterNoImpl: Boolean, kind: AttributeKind, override: Boolean, vararg: Boolean, static: Boolean, required: Boolean) defined in org.jetbrains.idl2k.GenerateAttribute[ClassConstructorDescriptorImpl]

'it' @ [38:40] ==> value-parameter it: Attribute defined in org.jetbrains.idl2k.generateFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [38:43] ==> public final val name: String defined in org.jetbrains.idl2k.Attribute[PropertyDescriptorImpl]

'mappedType' @ [39:40] ==> val mappedType: Type defined in org.jetbrains.idl2k.generateFunction.<anonymous>.<anonymous>[LocalVariableDescriptor]

'if (it.defaultValue != null) "definedExternally" else null' @ [40:47] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'it' @ [40:51] ==> value-parameter it: Attribute defined in org.jetbrains.idl2k.generateFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'defaultValue' @ [40:54] ==> public final val defaultValue: String? defined in org.jetbrains.idl2k.Attribute[PropertyDescriptorImpl]

'ARGUMENT' @ [43:54] ==> enum entry ARGUMENT defined in org.jetbrains.idl2k.AttributeKind[FakeCallableDescriptorForObject]

'it' @ [44:42] ==> value-parameter it: Attribute defined in org.jetbrains.idl2k.generateFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'vararg' @ [44:45] ==> public final val vararg: Boolean defined in org.jetbrains.idl2k.Attribute[PropertyDescriptorImpl]

'it' @ [45:42] ==> value-parameter it: Attribute defined in org.jetbrains.idl2k.generateFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'static' @ [45:45] ==> public final val static: Boolean defined in org.jetbrains.idl2k.Attribute[PropertyDescriptorImpl]

'it' @ [46:44] ==> value-parameter it: Attribute defined in org.jetbrains.idl2k.generateFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'required' @ [46:47] ==> public final val required: Boolean defined in org.jetbrains.idl2k.Attribute[PropertyDescriptorImpl]

'nativeGetterOrSetter' @ [49:44] ==> value-parameter nativeGetterOrSetter: NativeGetterOrSetter = ... defined in org.jetbrains.idl2k.generateFunction[ValueParameterDescriptorImpl]

'function' @ [50:30] ==> value-parameter function: Operation defined in org.jetbrains.idl2k.generateFunction[ValueParameterDescriptorImpl]

'static' @ [50:39] ==> public final val static: Boolean defined in org.jetbrains.idl2k.Operation[PropertyDescriptorImpl]

'when {
        function.name == "" -> null
        function.getterOrSetter() == NativeGetterOrSetter.NONE -> generateFunction(repository, function, function.name, NativeGetterOrSetter.NONE)
        function.name == "get" || function.name == "set" -> null
        else -> generateFunction(repository, function, function.name, NativeGetterOrSetter.NONE)
    }' @ [56:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: GenerateFunction?, entry1: GenerateFunction?, entry2: GenerateFunction?, entry3: GenerateFunction?): GenerateFunction?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> GenerateFunction?

'function' @ [57:9] ==> value-parameter function: Operation defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'name' @ [57:18] ==> public final val name: String defined in org.jetbrains.idl2k.Operation[PropertyDescriptorImpl]

'function' @ [58:9] ==> value-parameter function: Operation defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'getterOrSetter' @ [58:18] ==> private fun Operation.getterOrSetter(): NativeGetterOrSetter defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'NONE' @ [58:59] ==> enum entry NONE defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'generateFunction' @ [58:67] ==> public fun generateFunction(repository: Repository, function: Operation, functionName: String, nativeGetterOrSetter: NativeGetterOrSetter = ...): GenerateFunction defined in org.jetbrains.idl2k in file gen.kt[SimpleFunctionDescriptorImpl]

'repository' @ [58:84] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'function' @ [58:96] ==> value-parameter function: Operation defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'function' @ [58:106] ==> value-parameter function: Operation defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'name' @ [58:115] ==> public final val name: String defined in org.jetbrains.idl2k.Operation[PropertyDescriptorImpl]

'NONE' @ [58:142] ==> enum entry NONE defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'function' @ [59:9] ==> value-parameter function: Operation defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'name' @ [59:18] ==> public final val name: String defined in org.jetbrains.idl2k.Operation[PropertyDescriptorImpl]

'function' @ [59:35] ==> value-parameter function: Operation defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'name' @ [59:44] ==> public final val name: String defined in org.jetbrains.idl2k.Operation[PropertyDescriptorImpl]

'generateFunction' @ [60:17] ==> public fun generateFunction(repository: Repository, function: Operation, functionName: String, nativeGetterOrSetter: NativeGetterOrSetter = ...): GenerateFunction defined in org.jetbrains.idl2k in file gen.kt[SimpleFunctionDescriptorImpl]

'repository' @ [60:34] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'function' @ [60:46] ==> value-parameter function: Operation defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'function' @ [60:56] ==> value-parameter function: Operation defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'name' @ [60:65] ==> public final val name: String defined in org.jetbrains.idl2k.Operation[PropertyDescriptorImpl]

'NONE' @ [60:92] ==> enum entry NONE defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'when (function.getterOrSetter()) {
        NativeGetterOrSetter.NONE -> null
        NativeGetterOrSetter.GETTER -> generateFunction(repository, function, "get")
        NativeGetterOrSetter.SETTER -> generateFunction(repository, function, "set")
    }' @ [62:34] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: GenerateFunction?, entry1: GenerateFunction?, entry2: GenerateFunction?): GenerateFunction?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> GenerateFunction?

'function' @ [62:40] ==> value-parameter function: Operation defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'getterOrSetter' @ [62:49] ==> private fun Operation.getterOrSetter(): NativeGetterOrSetter defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'NONE' @ [63:30] ==> enum entry NONE defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'GETTER' @ [64:30] ==> enum entry GETTER defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'generateFunction' @ [64:40] ==> public fun generateFunction(repository: Repository, function: Operation, functionName: String, nativeGetterOrSetter: NativeGetterOrSetter = ...): GenerateFunction defined in org.jetbrains.idl2k in file gen.kt[SimpleFunctionDescriptorImpl]

'repository' @ [64:57] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'function' @ [64:69] ==> value-parameter function: Operation defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'SETTER' @ [65:30] ==> enum entry SETTER defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'generateFunction' @ [65:40] ==> public fun generateFunction(repository: Repository, function: Operation, functionName: String, nativeGetterOrSetter: NativeGetterOrSetter = ...): GenerateFunction defined in org.jetbrains.idl2k in file gen.kt[SimpleFunctionDescriptorImpl]

'repository' @ [65:57] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'function' @ [65:69] ==> value-parameter function: Operation defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'function' @ [67:38] ==> value-parameter function: Operation defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'parameters' @ [67:47] ==> public final val parameters: List<Attribute> defined in org.jetbrains.idl2k.Operation[PropertyDescriptorImpl]

'map' @ [67:58] ==> public inline fun <T, R> Iterable<Attribute>.map(transform: (Attribute) -> Attribute): List<Attribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Attribute
    <R> -> Attribute

'mapType' @ [68:29] ==> internal fun mapType(repository: Repository, type: Type): Type defined in org.jetbrains.idl2k in file typeMappings.kt[SimpleFunctionDescriptorImpl]

'repository' @ [68:37] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'it' @ [68:49] ==> value-parameter it: Attribute defined in org.jetbrains.idl2k.generateFunctions.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [68:52] ==> public final val type: Type defined in org.jetbrains.idl2k.Attribute[PropertyDescriptorImpl]

'repository' @ [69:29] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'interfaces' @ [69:40] ==> public final val interfaces: Map<String, InterfaceDefinition> defined in org.jetbrains.idl2k.Repository[PropertyDescriptorImpl]

'parameterType' @ [69:51] ==> val parameterType: SimpleType? defined in org.jetbrains.idl2k.generateFunctions.<anonymous>[LocalVariableDescriptor]

'type' @ [69:66] ==> public final val type: String defined in org.jetbrains.idl2k.SimpleType[PropertyDescriptorImpl]

'when {
            interfaceType == null -> it
            interfaceType.operations.size != 1 -> it
            interfaceType.callback -> interfaceType.operations.single().let { callbackFunction ->
                it.copy(type = FunctionType(callbackFunction.parameters.map { it.copy(type = mapType(repository, it.type)) }, mapType(repository, callbackFunction.returnType), parameterType?.nullable ?: false))
            }
            else -> it
        }' @ [70:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Attribute, entry1: Attribute, entry2: Attribute, entry3: Attribute): Attribute[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Attribute

'interfaceType' @ [71:13] ==> val interfaceType: InterfaceDefinition? defined in org.jetbrains.idl2k.generateFunctions.<anonymous>[LocalVariableDescriptor]

'it' @ [71:38] ==> value-parameter it: Attribute defined in org.jetbrains.idl2k.generateFunctions.<anonymous>[ValueParameterDescriptorImpl]

'interfaceType' @ [72:13] ==> val interfaceType: InterfaceDefinition? defined in org.jetbrains.idl2k.generateFunctions.<anonymous>[LocalVariableDescriptor]

'operations' @ [72:27] ==> public final val operations: List<Operation> defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'size' @ [72:38] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'it' @ [72:51] ==> value-parameter it: Attribute defined in org.jetbrains.idl2k.generateFunctions.<anonymous>[ValueParameterDescriptorImpl]

'interfaceType' @ [73:13] ==> val interfaceType: InterfaceDefinition? defined in org.jetbrains.idl2k.generateFunctions.<anonymous>[LocalVariableDescriptor]

'callback' @ [73:27] ==> public final val callback: Boolean defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'interfaceType' @ [73:39] ==> val interfaceType: InterfaceDefinition? defined in org.jetbrains.idl2k.generateFunctions.<anonymous>[LocalVariableDescriptor]

'operations' @ [73:53] ==> public final val operations: List<Operation> defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'single' @ [73:64] ==> public fun <T> List<Operation>.single(): Operation defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Operation

'let' @ [73:73] ==> @InlineOnly public inline fun <T, R> Operation.let(block: (Operation) -> Attribute): Attribute defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Operation
    <R> -> Attribute

'it' @ [74:17] ==> value-parameter it: Attribute defined in org.jetbrains.idl2k.generateFunctions.<anonymous>[ValueParameterDescriptorImpl]

'copy' @ [74:20] ==> public final fun copy(name: String = ..., type: Type = ..., readOnly: Boolean = ..., defaultValue: String? = ..., vararg: Boolean = ..., static: Boolean = ..., required: Boolean = ...): Attribute defined in org.jetbrains.idl2k.Attribute[SimpleFunctionDescriptorImpl]

'FunctionType' @ [74:32] ==> public constructor FunctionType(parameterTypes: List<Attribute>, returnType: Type, nullable: Boolean) defined in org.jetbrains.idl2k.FunctionType[ClassConstructorDescriptorImpl]

'callbackFunction' @ [74:45] ==> value-parameter callbackFunction: Operation defined in org.jetbrains.idl2k.generateFunctions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parameters' @ [74:62] ==> public final val parameters: List<Attribute> defined in org.jetbrains.idl2k.Operation[PropertyDescriptorImpl]

'map' @ [74:73] ==> public inline fun <T, R> Iterable<Attribute>.map(transform: (Attribute) -> Attribute): List<Attribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Attribute
    <R> -> Attribute

'it' @ [74:79] ==> value-parameter it: Attribute defined in org.jetbrains.idl2k.generateFunctions.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'copy' @ [74:82] ==> public final fun copy(name: String = ..., type: Type = ..., readOnly: Boolean = ..., defaultValue: String? = ..., vararg: Boolean = ..., static: Boolean = ..., required: Boolean = ...): Attribute defined in org.jetbrains.idl2k.Attribute[SimpleFunctionDescriptorImpl]

'mapType' @ [74:94] ==> internal fun mapType(repository: Repository, type: Type): Type defined in org.jetbrains.idl2k in file typeMappings.kt[SimpleFunctionDescriptorImpl]

'repository' @ [74:102] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'it' @ [74:114] ==> value-parameter it: Attribute defined in org.jetbrains.idl2k.generateFunctions.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [74:117] ==> public final val type: Type defined in org.jetbrains.idl2k.Attribute[PropertyDescriptorImpl]

'mapType' @ [74:127] ==> internal fun mapType(repository: Repository, type: Type): Type defined in org.jetbrains.idl2k in file typeMappings.kt[SimpleFunctionDescriptorImpl]

'repository' @ [74:135] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'callbackFunction' @ [74:147] ==> value-parameter callbackFunction: Operation defined in org.jetbrains.idl2k.generateFunctions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'returnType' @ [74:164] ==> public final val returnType: Type defined in org.jetbrains.idl2k.Operation[PropertyDescriptorImpl]

'parameterType' @ [74:177] ==> val parameterType: SimpleType? defined in org.jetbrains.idl2k.generateFunctions.<anonymous>[LocalVariableDescriptor]

'nullable' @ [74:192] ==> public open val nullable: Boolean defined in org.jetbrains.idl2k.SimpleType[PropertyDescriptorImpl]

'it' @ [76:21] ==> value-parameter it: Attribute defined in org.jetbrains.idl2k.generateFunctions.<anonymous>[ValueParameterDescriptorImpl]

'when {
        callbackArgumentsAsLambdas == function.parameters -> null
        realFunction != null -> generateFunction(repository, function.copy(parameters = callbackArgumentsAsLambdas), function.name, NativeGetterOrSetter.NONE)
        else -> null
    }' @ [80:38] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: GenerateFunction?, entry1: GenerateFunction?, entry2: GenerateFunction?): GenerateFunction?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> GenerateFunction?

'callbackArgumentsAsLambdas' @ [81:9] ==> val callbackArgumentsAsLambdas: List<Attribute> defined in org.jetbrains.idl2k.generateFunctions[LocalVariableDescriptor]

'function' @ [81:39] ==> value-parameter function: Operation defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'parameters' @ [81:48] ==> public final val parameters: List<Attribute> defined in org.jetbrains.idl2k.Operation[PropertyDescriptorImpl]

'realFunction' @ [82:9] ==> val realFunction: GenerateFunction? defined in org.jetbrains.idl2k.generateFunctions[LocalVariableDescriptor]

'generateFunction' @ [82:33] ==> public fun generateFunction(repository: Repository, function: Operation, functionName: String, nativeGetterOrSetter: NativeGetterOrSetter = ...): GenerateFunction defined in org.jetbrains.idl2k in file gen.kt[SimpleFunctionDescriptorImpl]

'repository' @ [82:50] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'function' @ [82:62] ==> value-parameter function: Operation defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'copy' @ [82:71] ==> public final fun copy(name: String = ..., returnType: Type = ..., parameters: List<Attribute> = ..., attributes: List<ExtendedAttribute> = ..., static: Boolean = ...): Operation defined in org.jetbrains.idl2k.Operation[SimpleFunctionDescriptorImpl]

'callbackArgumentsAsLambdas' @ [82:89] ==> val callbackArgumentsAsLambdas: List<Attribute> defined in org.jetbrains.idl2k.generateFunctions[LocalVariableDescriptor]

'function' @ [82:118] ==> value-parameter function: Operation defined in org.jetbrains.idl2k.generateFunctions[ValueParameterDescriptorImpl]

'name' @ [82:127] ==> public final val name: String defined in org.jetbrains.idl2k.Operation[PropertyDescriptorImpl]

'NONE' @ [82:154] ==> enum entry NONE defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'listOf' @ [86:12] ==> public fun <T> listOf(vararg elements: GenerateFunction?): List<GenerateFunction?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction?

'realFunction' @ [86:19] ==> val realFunction: GenerateFunction? defined in org.jetbrains.idl2k.generateFunctions[LocalVariableDescriptor]

'getterOrSetterFunction' @ [86:33] ==> val getterOrSetterFunction: GenerateFunction? defined in org.jetbrains.idl2k.generateFunctions[LocalVariableDescriptor]

'functionWithCallbackOrNull' @ [86:57] ==> val functionWithCallbackOrNull: GenerateFunction? defined in org.jetbrains.idl2k.generateFunctions[LocalVariableDescriptor]

'filterNotNull' @ [86:85] ==> public fun <T : Any> Iterable<GenerateFunction?>.filterNotNull(): List<GenerateFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> GenerateFunction

'GenerateAttribute' @ [90:9] ==> public constructor GenerateAttribute(name: String, type: Type, initializer: String?, getterSetterNoImpl: Boolean, kind: AttributeKind, override: Boolean, vararg: Boolean, static: Boolean, required: Boolean) defined in org.jetbrains.idl2k.GenerateAttribute[ClassConstructorDescriptorImpl]

'attribute' @ [90:27] ==> value-parameter attribute: Attribute defined in org.jetbrains.idl2k.generateAttribute[ValueParameterDescriptorImpl]

'name' @ [90:37] ==> public final val name: String defined in org.jetbrains.idl2k.Attribute[PropertyDescriptorImpl]

'mapType' @ [91:24] ==> internal fun mapType(repository: Repository, type: Type): Type defined in org.jetbrains.idl2k in file typeMappings.kt[SimpleFunctionDescriptorImpl]

'repository' @ [91:32] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateAttribute[ValueParameterDescriptorImpl]

'attribute' @ [91:44] ==> value-parameter attribute: Attribute defined in org.jetbrains.idl2k.generateAttribute[ValueParameterDescriptorImpl]

'type' @ [91:54] ==> public final val type: Type defined in org.jetbrains.idl2k.Attribute[PropertyDescriptorImpl]

'let' @ [91:60] ==> @InlineOnly public inline fun <T, R> Type.let(block: (Type) -> Type): Type defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> Type

'if (nullableAttributes) it.toNullable() else it' @ [91:66] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'nullableAttributes' @ [91:70] ==> value-parameter nullableAttributes: Boolean defined in org.jetbrains.idl2k.generateAttribute[ValueParameterDescriptorImpl]

'it' @ [91:90] ==> value-parameter it: Type defined in org.jetbrains.idl2k.generateAttribute.<anonymous>[ValueParameterDescriptorImpl]

'toNullable' @ [91:93] ==> public fun <T : Type> Type.toNullable(): Type defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Type> -> Type

'it' @ [91:111] ==> value-parameter it: Type defined in org.jetbrains.idl2k.generateAttribute.<anonymous>[ValueParameterDescriptorImpl]

'if (putNoImpl && !attribute.static) {
                        mapLiteral(attribute.defaultValue, mapType(repository, attribute.type), repository.enums)
                    }
                    else if (attribute.defaultValue != null) {
                        "definedExternally"
                    }
                    else {
                        null
                    }' @ [93:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'putNoImpl' @ [93:25] ==> value-parameter putNoImpl: Boolean defined in org.jetbrains.idl2k.generateAttribute[ValueParameterDescriptorImpl]

'!' @ [93:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'attribute' @ [93:39] ==> value-parameter attribute: Attribute defined in org.jetbrains.idl2k.generateAttribute[ValueParameterDescriptorImpl]

'static' @ [93:49] ==> public final val static: Boolean defined in org.jetbrains.idl2k.Attribute[PropertyDescriptorImpl]

'mapLiteral' @ [94:25] ==> private fun mapLiteral(literal: String?, expectedType: Type = ..., enums: Map<String, EnumDefinition>): String? defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'attribute' @ [94:36] ==> value-parameter attribute: Attribute defined in org.jetbrains.idl2k.generateAttribute[ValueParameterDescriptorImpl]

'defaultValue' @ [94:46] ==> public final val defaultValue: String? defined in org.jetbrains.idl2k.Attribute[PropertyDescriptorImpl]

'mapType' @ [94:60] ==> internal fun mapType(repository: Repository, type: Type): Type defined in org.jetbrains.idl2k in file typeMappings.kt[SimpleFunctionDescriptorImpl]

'repository' @ [94:68] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateAttribute[ValueParameterDescriptorImpl]

'attribute' @ [94:80] ==> value-parameter attribute: Attribute defined in org.jetbrains.idl2k.generateAttribute[ValueParameterDescriptorImpl]

'type' @ [94:90] ==> public final val type: Type defined in org.jetbrains.idl2k.Attribute[PropertyDescriptorImpl]

'repository' @ [94:97] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateAttribute[ValueParameterDescriptorImpl]

'enums' @ [94:108] ==> public final val enums: Map<String, EnumDefinition> defined in org.jetbrains.idl2k.Repository[PropertyDescriptorImpl]

'if (attribute.defaultValue != null) {
                        "definedExternally"
                    }
                    else {
                        null
                    }' @ [96:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'attribute' @ [96:30] ==> value-parameter attribute: Attribute defined in org.jetbrains.idl2k.generateAttribute[ValueParameterDescriptorImpl]

'defaultValue' @ [96:40] ==> public final val defaultValue: String? defined in org.jetbrains.idl2k.Attribute[PropertyDescriptorImpl]

'putNoImpl' @ [102:38] ==> value-parameter putNoImpl: Boolean defined in org.jetbrains.idl2k.generateAttribute[ValueParameterDescriptorImpl]

'if (attribute.readOnly) AttributeKind.VAL else AttributeKind.VAR' @ [103:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AttributeKind, elseBranch: AttributeKind): AttributeKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AttributeKind

'attribute' @ [103:28] ==> value-parameter attribute: Attribute defined in org.jetbrains.idl2k.generateAttribute[ValueParameterDescriptorImpl]

'readOnly' @ [103:38] ==> public final val readOnly: Boolean defined in org.jetbrains.idl2k.Attribute[PropertyDescriptorImpl]

'VAL' @ [103:62] ==> enum entry VAL defined in org.jetbrains.idl2k.AttributeKind[FakeCallableDescriptorForObject]

'VAR' @ [103:85] ==> enum entry VAR defined in org.jetbrains.idl2k.AttributeKind[FakeCallableDescriptorForObject]

'attribute' @ [105:26] ==> value-parameter attribute: Attribute defined in org.jetbrains.idl2k.generateAttribute[ValueParameterDescriptorImpl]

'vararg' @ [105:36] ==> public final val vararg: Boolean defined in org.jetbrains.idl2k.Attribute[PropertyDescriptorImpl]

'attribute' @ [106:26] ==> value-parameter attribute: Attribute defined in org.jetbrains.idl2k.generateAttribute[ValueParameterDescriptorImpl]

'static' @ [106:36] ==> public final val static: Boolean defined in org.jetbrains.idl2k.Attribute[PropertyDescriptorImpl]

'attribute' @ [107:28] ==> value-parameter attribute: Attribute defined in org.jetbrains.idl2k.generateAttribute[ValueParameterDescriptorImpl]

'required' @ [107:38] ==> public final val required: Boolean defined in org.jetbrains.idl2k.Attribute[PropertyDescriptorImpl]

'superTypes' @ [110:70] ==> public final val superTypes: List<String> defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'map' @ [110:81] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> InterfaceDefinition?): List<InterfaceDefinition?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> InterfaceDefinition?

'repository' @ [110:87] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.superTypes[ValueParameterDescriptorImpl]

'interfaces' @ [110:98] ==> public final val interfaces: Map<String, InterfaceDefinition> defined in org.jetbrains.idl2k.Repository[PropertyDescriptorImpl]

'it' @ [110:109] ==> value-parameter it: String defined in org.jetbrains.idl2k.superTypes.<anonymous>[ValueParameterDescriptorImpl]

'filterNotNull' @ [110:115] ==> public fun <T : Any> Iterable<InterfaceDefinition?>.filterNotNull(): List<InterfaceDefinition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> InterfaceDefinition

'iface' @ [111:127] ==> value-parameter iface: InterfaceDefinition defined in org.jetbrains.idl2k.resolveDefinitionKind[ValueParameterDescriptorImpl]

'findConstructors' @ [111:133] ==> public fun InterfaceDefinition.findConstructors(): List<ExtendedAttribute> defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'when {
            iface.dictionary -> GenerateDefinitionKind.INTERFACE
            iface.extendedAttributes.any { it.call == "NoInterfaceObject" } -> GenerateDefinitionKind.INTERFACE
            constructors.isNotEmpty() || iface.superTypes(repository).any { resolveDefinitionKind(repository, it) == GenerateDefinitionKind.CLASS } -> {
                GenerateDefinitionKind.CLASS
            }
            iface.callback -> GenerateDefinitionKind.INTERFACE
            else -> GenerateDefinitionKind.ABSTRACT_CLASS
        }' @ [112:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: GenerateDefinitionKind, entry1: GenerateDefinitionKind, entry2: GenerateDefinitionKind, entry3: GenerateDefinitionKind, entry4: GenerateDefinitionKind): GenerateDefinitionKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> GenerateDefinitionKind

'iface' @ [113:13] ==> value-parameter iface: InterfaceDefinition defined in org.jetbrains.idl2k.resolveDefinitionKind[ValueParameterDescriptorImpl]

'dictionary' @ [113:19] ==> public final val dictionary: Boolean defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'INTERFACE' @ [113:56] ==> enum entry INTERFACE defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'iface' @ [114:13] ==> value-parameter iface: InterfaceDefinition defined in org.jetbrains.idl2k.resolveDefinitionKind[ValueParameterDescriptorImpl]

'extendedAttributes' @ [114:19] ==> public final val extendedAttributes: List<ExtendedAttribute> defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'any' @ [114:38] ==> public inline fun <T> Iterable<ExtendedAttribute>.any(predicate: (ExtendedAttribute) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtendedAttribute

'it' @ [114:44] ==> value-parameter it: ExtendedAttribute defined in org.jetbrains.idl2k.resolveDefinitionKind.<anonymous>[ValueParameterDescriptorImpl]

'call' @ [114:47] ==> public final val call: String defined in org.jetbrains.idl2k.ExtendedAttribute[PropertyDescriptorImpl]

'INTERFACE' @ [114:103] ==> enum entry INTERFACE defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'constructors' @ [115:13] ==> value-parameter constructors: List<ExtendedAttribute> = ... defined in org.jetbrains.idl2k.resolveDefinitionKind[ValueParameterDescriptorImpl]

'isNotEmpty' @ [115:26] ==> @InlineOnly public inline fun <T> Collection<ExtendedAttribute>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtendedAttribute

'iface' @ [115:42] ==> value-parameter iface: InterfaceDefinition defined in org.jetbrains.idl2k.resolveDefinitionKind[ValueParameterDescriptorImpl]

'superTypes' @ [115:48] ==> private fun InterfaceDefinition.superTypes(repository: Repository): List<InterfaceDefinition> defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'repository' @ [115:59] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.resolveDefinitionKind[ValueParameterDescriptorImpl]

'any' @ [115:71] ==> public inline fun <T> Iterable<InterfaceDefinition>.any(predicate: (InterfaceDefinition) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InterfaceDefinition

'resolveDefinitionKind' @ [115:77] ==> private fun resolveDefinitionKind(repository: Repository, iface: InterfaceDefinition, constructors: List<ExtendedAttribute> = ...): GenerateDefinitionKind defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'repository' @ [115:99] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.resolveDefinitionKind[ValueParameterDescriptorImpl]

'it' @ [115:111] ==> value-parameter it: InterfaceDefinition defined in org.jetbrains.idl2k.resolveDefinitionKind.<anonymous>[ValueParameterDescriptorImpl]

'CLASS' @ [115:141] ==> enum entry CLASS defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'CLASS' @ [116:40] ==> enum entry CLASS defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'iface' @ [118:13] ==> value-parameter iface: InterfaceDefinition defined in org.jetbrains.idl2k.resolveDefinitionKind[ValueParameterDescriptorImpl]

'callback' @ [118:19] ==> public final val callback: Boolean defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'INTERFACE' @ [118:54] ==> enum entry INTERFACE defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'ABSTRACT_CLASS' @ [119:44] ==> enum entry ABSTRACT_CLASS defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'attributes' @ [123:11] ==> public final val attributes: List<Attribute> defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'map' @ [123:22] ==> public inline fun <T, R> Iterable<Attribute>.map(transform: (Attribute) -> GenerateAttribute): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Attribute
    <R> -> GenerateAttribute

'generateAttribute' @ [123:28] ==> public fun generateAttribute(putNoImpl: Boolean, repository: Repository, attribute: Attribute, nullableAttributes: Boolean): GenerateAttribute defined in org.jetbrains.idl2k in file gen.kt[SimpleFunctionDescriptorImpl]

'dictionary' @ [123:58] ==> public final val dictionary: Boolean defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'repository' @ [123:83] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.mapAttributes[ValueParameterDescriptorImpl]

'it' @ [123:107] ==> value-parameter it: Attribute defined in org.jetbrains.idl2k.mapAttributes.<anonymous>[ValueParameterDescriptorImpl]

'dictionary' @ [123:132] ==> public final val dictionary: Boolean defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'operations' @ [124:73] ==> public final val operations: List<Operation> defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'flatMap' @ [124:84] ==> public inline fun <T, R> Iterable<Operation>.flatMap(transform: (Operation) -> Iterable<GenerateFunction>): List<GenerateFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Operation
    <R> -> GenerateFunction

'generateFunctions' @ [124:94] ==> public fun generateFunctions(repository: Repository, function: Operation): List<GenerateFunction> defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'repository' @ [124:112] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.mapOperations[ValueParameterDescriptorImpl]

'it' @ [124:124] ==> value-parameter it: Operation defined in org.jetbrains.idl2k.mapOperations.<anonymous>[ValueParameterDescriptorImpl]

'GenerateAttribute' @ [125:61] ==> public constructor GenerateAttribute(name: String, type: Type, initializer: String?, getterSetterNoImpl: Boolean, kind: AttributeKind, override: Boolean, vararg: Boolean, static: Boolean, required: Boolean) defined in org.jetbrains.idl2k.GenerateAttribute[ClassConstructorDescriptorImpl]

'name' @ [125:79] ==> public final val name: String defined in org.jetbrains.idl2k.Constant[PropertyDescriptorImpl]

'mapType' @ [125:85] ==> internal fun mapType(repository: Repository, type: Type): Type defined in org.jetbrains.idl2k in file typeMappings.kt[SimpleFunctionDescriptorImpl]

'repository' @ [125:93] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.mapConstant[ValueParameterDescriptorImpl]

'type' @ [125:105] ==> public final val type: Type defined in org.jetbrains.idl2k.Constant[PropertyDescriptorImpl]

'VAL' @ [125:139] ==> enum entry VAL defined in org.jetbrains.idl2k.AttributeKind[FakeCallableDescriptorForObject]

'ExtendedAttribute' @ [126:33] ==> public constructor ExtendedAttribute(name: String?, call: String, arguments: List<Attribute>) defined in org.jetbrains.idl2k.ExtendedAttribute[ClassConstructorDescriptorImpl]

'emptyList' @ [126:72] ==> public fun <T> emptyList(): List<Attribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Attribute

'iface' @ [129:24] ==> value-parameter iface: InterfaceDefinition defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'superTypes' @ [129:30] ==> public final val superTypes: List<String> defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'mapNotNull' @ [130:14] ==> public inline fun <T, R : Any> Iterable<String>.mapNotNull(transform: (String) -> InterfaceDefinition?): List<InterfaceDefinition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Any> -> InterfaceDefinition

'repository' @ [130:27] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'interfaces' @ [130:38] ==> public final val interfaces: Map<String, InterfaceDefinition> defined in org.jetbrains.idl2k.Repository[PropertyDescriptorImpl]

'it' @ [130:49] ==> value-parameter it: String defined in org.jetbrains.idl2k.generateTrait.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [131:14] ==> public inline fun <T> Iterable<InterfaceDefinition>.filter(predicate: (InterfaceDefinition) -> Boolean): List<InterfaceDefinition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InterfaceDefinition

'when (resolveDefinitionKind(repository, it)) {
                    GenerateDefinitionKind.CLASS,
                    GenerateDefinitionKind.ABSTRACT_CLASS -> true
                    else -> false
                }' @ [132:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'resolveDefinitionKind' @ [132:23] ==> private fun resolveDefinitionKind(repository: Repository, iface: InterfaceDefinition, constructors: List<ExtendedAttribute> = ...): GenerateDefinitionKind defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'repository' @ [132:45] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'it' @ [132:57] ==> value-parameter it: InterfaceDefinition defined in org.jetbrains.idl2k.generateTrait.<anonymous>[ValueParameterDescriptorImpl]

'CLASS' @ [133:44] ==> enum entry CLASS defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'ABSTRACT_CLASS' @ [134:44] ==> enum entry ABSTRACT_CLASS defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'assert' @ [139:5] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'superClasses' @ [139:12] ==> val superClasses: List<InterfaceDefinition> defined in org.jetbrains.idl2k.generateTrait[LocalVariableDescriptor]

'size' @ [139:25] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'iface' @ [139:46] ==> value-parameter iface: InterfaceDefinition defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'name' @ [139:52] ==> public final val name: String defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'superClasses' @ [139:108] ==> val superClasses: List<InterfaceDefinition> defined in org.jetbrains.idl2k.generateTrait[LocalVariableDescriptor]

'map' @ [139:121] ==> public inline fun <T, R> Iterable<InterfaceDefinition>.map(transform: (InterfaceDefinition) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InterfaceDefinition
    <R> -> String

'it' @ [139:127] ==> value-parameter it: InterfaceDefinition defined in org.jetbrains.idl2k.generateTrait.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [139:130] ==> public final val name: String defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'iface' @ [141:32] ==> value-parameter iface: InterfaceDefinition defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'findConstructors' @ [141:38] ==> public fun InterfaceDefinition.findConstructors(): List<ExtendedAttribute> defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'resolveDefinitionKind' @ [142:22] ==> private fun resolveDefinitionKind(repository: Repository, iface: InterfaceDefinition, constructors: List<ExtendedAttribute> = ...): GenerateDefinitionKind defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'repository' @ [142:44] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'iface' @ [142:56] ==> value-parameter iface: InterfaceDefinition defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'declaredConstructors' @ [142:63] ==> val declaredConstructors: List<ExtendedAttribute> defined in org.jetbrains.idl2k.generateTrait[LocalVariableDescriptor]

'repository' @ [143:22] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'externals' @ [143:33] ==> public final val externals: Map<String, List<String>> defined in org.jetbrains.idl2k.Repository[PropertyDescriptorImpl]

'iface' @ [143:43] ==> value-parameter iface: InterfaceDefinition defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'name' @ [143:49] ==> public final val name: String defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'mapNotNull' @ [143:56] ==> public inline fun <T, R : Any> Iterable<String>.mapNotNull(transform: (String) -> InterfaceDefinition?): List<InterfaceDefinition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Any> -> InterfaceDefinition

'repository' @ [143:69] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'interfaces' @ [143:80] ==> public final val interfaces: Map<String, InterfaceDefinition> defined in org.jetbrains.idl2k.Repository[PropertyDescriptorImpl]

'it' @ [143:91] ==> value-parameter it: String defined in org.jetbrains.idl2k.generateTrait.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [143:100] ==> public fun <T> emptyList(): List<InterfaceDefinition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InterfaceDefinition

'when {
        declaredConstructors.size == 1 -> declaredConstructors.single()
        declaredConstructors.isEmpty() && (entityKind == GenerateDefinitionKind.CLASS || entityKind == GenerateDefinitionKind.ABSTRACT_CLASS)  -> EMPTY_CONSTRUCTOR
        else -> declaredConstructors.firstOrNull { it.arguments.isEmpty() }
    }' @ [145:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ExtendedAttribute?, entry1: ExtendedAttribute?, entry2: ExtendedAttribute?): ExtendedAttribute?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ExtendedAttribute?

'declaredConstructors' @ [146:9] ==> val declaredConstructors: List<ExtendedAttribute> defined in org.jetbrains.idl2k.generateTrait[LocalVariableDescriptor]

'size' @ [146:30] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'declaredConstructors' @ [146:43] ==> val declaredConstructors: List<ExtendedAttribute> defined in org.jetbrains.idl2k.generateTrait[LocalVariableDescriptor]

'single' @ [146:64] ==> public fun <T> List<ExtendedAttribute>.single(): ExtendedAttribute defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtendedAttribute

'declaredConstructors' @ [147:9] ==> val declaredConstructors: List<ExtendedAttribute> defined in org.jetbrains.idl2k.generateTrait[LocalVariableDescriptor]

'isEmpty' @ [147:30] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'entityKind' @ [147:44] ==> val entityKind: GenerateDefinitionKind defined in org.jetbrains.idl2k.generateTrait[LocalVariableDescriptor]

'CLASS' @ [147:81] ==> enum entry CLASS defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'entityKind' @ [147:90] ==> val entityKind: GenerateDefinitionKind defined in org.jetbrains.idl2k.generateTrait[LocalVariableDescriptor]

'ABSTRACT_CLASS' @ [147:127] ==> enum entry ABSTRACT_CLASS defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'EMPTY_CONSTRUCTOR' @ [147:147] ==> private val EMPTY_CONSTRUCTOR: ExtendedAttribute defined in org.jetbrains.idl2k in file gen.kt[PropertyDescriptorImpl]

'declaredConstructors' @ [148:17] ==> val declaredConstructors: List<ExtendedAttribute> defined in org.jetbrains.idl2k.generateTrait[LocalVariableDescriptor]

'firstOrNull' @ [148:38] ==> public inline fun <T> Iterable<ExtendedAttribute>.firstOrNull(predicate: (ExtendedAttribute) -> Boolean): ExtendedAttribute? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtendedAttribute

'it' @ [148:52] ==> value-parameter it: ExtendedAttribute defined in org.jetbrains.idl2k.generateTrait.<anonymous>[ValueParameterDescriptorImpl]

'arguments' @ [148:55] ==> public final val arguments: List<Attribute> defined in org.jetbrains.idl2k.ExtendedAttribute[PropertyDescriptorImpl]

'isEmpty' @ [148:65] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'declaredConstructors' @ [150:33] ==> val declaredConstructors: List<ExtendedAttribute> defined in org.jetbrains.idl2k.generateTrait[LocalVariableDescriptor]

'filter' @ [150:54] ==> public inline fun <T> Iterable<ExtendedAttribute>.filter(predicate: (ExtendedAttribute) -> Boolean): List<ExtendedAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtendedAttribute

'it' @ [150:63] ==> value-parameter it: ExtendedAttribute defined in org.jetbrains.idl2k.generateTrait.<anonymous>[ValueParameterDescriptorImpl]

'primaryConstructor' @ [150:69] ==> val primaryConstructor: ExtendedAttribute? defined in org.jetbrains.idl2k.generateTrait[LocalVariableDescriptor]

'primaryConstructor' @ [152:38] ==> val primaryConstructor: ExtendedAttribute? defined in org.jetbrains.idl2k.generateTrait[LocalVariableDescriptor]

'let' @ [152:58] ==> @InlineOnly public inline fun <T, R> ExtendedAttribute.let(block: (ExtendedAttribute) -> ConstructorWithSuperTypeCall): ConstructorWithSuperTypeCall defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtendedAttribute
    <R> -> ConstructorWithSuperTypeCall

'generateConstructorAsFunction' @ [153:37] ==> public fun generateConstructorAsFunction(repository: Repository, constructor: ExtendedAttribute): GenerateFunction defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'repository' @ [153:67] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'constructor' @ [153:79] ==> value-parameter constructor: ExtendedAttribute defined in org.jetbrains.idl2k.generateTrait.<anonymous>[ValueParameterDescriptorImpl]

'ConstructorWithSuperTypeCall' @ [155:9] ==> public constructor ConstructorWithSuperTypeCall(constructor: GenerateFunction, constructorAttribute: ExtendedAttribute) defined in org.jetbrains.idl2k.ConstructorWithSuperTypeCall[ClassConstructorDescriptorImpl]

'constructorAsFunction' @ [155:38] ==> val constructorAsFunction: GenerateFunction defined in org.jetbrains.idl2k.generateTrait.<anonymous>[LocalVariableDescriptor]

'constructor' @ [155:61] ==> value-parameter constructor: ExtendedAttribute defined in org.jetbrains.idl2k.generateTrait.<anonymous>[ValueParameterDescriptorImpl]

'secondaryConstructors' @ [158:41] ==> val secondaryConstructors: List<ExtendedAttribute> defined in org.jetbrains.idl2k.generateTrait[LocalVariableDescriptor]

'map' @ [158:63] ==> public inline fun <T, R> Iterable<ExtendedAttribute>.map(transform: (ExtendedAttribute) -> ConstructorWithSuperTypeCall): List<ConstructorWithSuperTypeCall> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtendedAttribute
    <R> -> ConstructorWithSuperTypeCall

'generateConstructorAsFunction' @ [159:37] ==> public fun generateConstructorAsFunction(repository: Repository, constructor: ExtendedAttribute): GenerateFunction defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'repository' @ [159:67] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'secondaryConstructor' @ [159:79] ==> value-parameter secondaryConstructor: ExtendedAttribute defined in org.jetbrains.idl2k.generateTrait.<anonymous>[ValueParameterDescriptorImpl]

'ConstructorWithSuperTypeCall' @ [161:9] ==> public constructor ConstructorWithSuperTypeCall(constructor: GenerateFunction, constructorAttribute: ExtendedAttribute) defined in org.jetbrains.idl2k.ConstructorWithSuperTypeCall[ClassConstructorDescriptorImpl]

'constructorAsFunction' @ [161:38] ==> val constructorAsFunction: GenerateFunction defined in org.jetbrains.idl2k.generateTrait.<anonymous>[LocalVariableDescriptor]

'secondaryConstructor' @ [161:61] ==> value-parameter secondaryConstructor: ExtendedAttribute defined in org.jetbrains.idl2k.generateTrait.<anonymous>[ValueParameterDescriptorImpl]

'GenerateTraitOrClass' @ [164:18] ==> public constructor GenerateTraitOrClass(name: String, namespace: String, kind: GenerateDefinitionKind, superTypes: List<String>, memberAttributes: MutableList<GenerateAttribute>, memberFunctions: MutableList<GenerateFunction>, constants: List<GenerateAttribute>, primaryConstructor: ConstructorWithSuperTypeCall?, secondaryConstructors: List<ConstructorWithSuperTypeCall>, generateBuilderFunction: Boolean) defined in org.jetbrains.idl2k.GenerateTraitOrClass[ClassConstructorDescriptorImpl]

'iface' @ [164:39] ==> value-parameter iface: InterfaceDefinition defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'name' @ [164:45] ==> public final val name: String defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'iface' @ [164:51] ==> value-parameter iface: InterfaceDefinition defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'namespace' @ [164:57] ==> public final val namespace: String defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'entityKind' @ [164:68] ==> val entityKind: GenerateDefinitionKind defined in org.jetbrains.idl2k.generateTrait[LocalVariableDescriptor]

'iface' @ [164:81] ==> value-parameter iface: InterfaceDefinition defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'superTypes' @ [164:87] ==> public final val superTypes: List<String> defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'extensions' @ [164:100] ==> val extensions: List<InterfaceDefinition> defined in org.jetbrains.idl2k.generateTrait[LocalVariableDescriptor]

'map' @ [164:111] ==> public inline fun <T, R> Iterable<InterfaceDefinition>.map(transform: (InterfaceDefinition) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InterfaceDefinition
    <R> -> String

'it' @ [164:117] ==> value-parameter it: InterfaceDefinition defined in org.jetbrains.idl2k.generateTrait.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [164:120] ==> public final val name: String defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'distinct' @ [164:128] ==> public fun <T> Iterable<String>.distinct(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'iface' @ [165:32] ==> value-parameter iface: InterfaceDefinition defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'mapAttributes' @ [165:38] ==> private fun InterfaceDefinition.mapAttributes(repository: Repository): List<GenerateAttribute> defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'repository' @ [165:52] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'toMutableList' @ [165:64] ==> public fun <T> Collection<GenerateAttribute>.toMutableList(): MutableList<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'iface' @ [166:31] ==> value-parameter iface: InterfaceDefinition defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'mapOperations' @ [166:37] ==> private fun InterfaceDefinition.mapOperations(repository: Repository): List<GenerateFunction> defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'repository' @ [166:51] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'toMutableList' @ [166:63] ==> public fun <T> Collection<GenerateFunction>.toMutableList(): MutableList<GenerateFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction

'iface' @ [167:26] ==> value-parameter iface: InterfaceDefinition defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'constants' @ [167:32] ==> public final val constants: List<Constant> defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'map' @ [167:42] ==> public inline fun <T, R> Iterable<Constant>.map(transform: (Constant) -> GenerateAttribute): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constant
    <R> -> GenerateAttribute

'it' @ [167:48] ==> value-parameter it: Constant defined in org.jetbrains.idl2k.generateTrait.<anonymous>[ValueParameterDescriptorImpl]

'mapConstant' @ [167:51] ==> private fun Constant.mapConstant(repository: Repository): GenerateAttribute defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'repository' @ [167:63] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'extensions' @ [167:79] ==> val extensions: List<InterfaceDefinition> defined in org.jetbrains.idl2k.generateTrait[LocalVariableDescriptor]

'flatMap' @ [167:90] ==> public inline fun <T, R> Iterable<InterfaceDefinition>.flatMap(transform: (InterfaceDefinition) -> Iterable<GenerateAttribute>): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InterfaceDefinition
    <R> -> GenerateAttribute

'it' @ [167:100] ==> value-parameter it: InterfaceDefinition defined in org.jetbrains.idl2k.generateTrait.<anonymous>[ValueParameterDescriptorImpl]

'constants' @ [167:103] ==> public final val constants: List<Constant> defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'map' @ [167:113] ==> public inline fun <T, R> Iterable<Constant>.map(transform: (Constant) -> GenerateAttribute): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constant
    <R> -> GenerateAttribute

'it' @ [167:119] ==> value-parameter it: Constant defined in org.jetbrains.idl2k.generateTrait.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'mapConstant' @ [167:122] ==> private fun Constant.mapConstant(repository: Repository): GenerateAttribute defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'repository' @ [167:134] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'distinct' @ [167:150] ==> public fun <T> Iterable<GenerateAttribute>.distinct(): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'toList' @ [167:161] ==> public fun <T> Iterable<GenerateAttribute>.toList(): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'primaryConstructorWithCall' @ [168:34] ==> val primaryConstructorWithCall: ConstructorWithSuperTypeCall? defined in org.jetbrains.idl2k.generateTrait[LocalVariableDescriptor]

'secondaryConstructorsWithCall' @ [169:37] ==> val secondaryConstructorsWithCall: List<ConstructorWithSuperTypeCall> defined in org.jetbrains.idl2k.generateTrait[LocalVariableDescriptor]

'iface' @ [170:39] ==> value-parameter iface: InterfaceDefinition defined in org.jetbrains.idl2k.generateTrait[ValueParameterDescriptorImpl]

'dictionary' @ [170:45] ==> public final val dictionary: Boolean defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'markAsArrayLikeIfApplicable' @ [173:12] ==> public fun markAsArrayLikeIfApplicable(iface: GenerateTraitOrClass): GenerateTraitOrClass defined in org.jetbrains.idl2k in file gen.kt[SimpleFunctionDescriptorImpl]

'result' @ [173:40] ==> val result: GenerateTraitOrClass defined in org.jetbrains.idl2k.generateTrait[LocalVariableDescriptor]

'type' @ [177:29] ==> value-parameter type: Type defined in org.jetbrains.idl2k.markAsArrayLikeIfApplicable.isInt[ValueParameterDescriptorImpl]

'type' @ [177:51] ==> value-parameter type: Type defined in org.jetbrains.idl2k.markAsArrayLikeIfApplicable.isInt[ValueParameterDescriptorImpl]

'type' @ [177:56] ==> public final val type: String defined in org.jetbrains.idl2k.SimpleType[PropertyDescriptorImpl]

'iface' @ [179:26] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.markAsArrayLikeIfApplicable[ValueParameterDescriptorImpl]

'memberAttributes' @ [179:32] ==> public final val memberAttributes: MutableList<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'singleOrNull' @ [179:49] ==> public inline fun <T> Iterable<GenerateAttribute>.singleOrNull(predicate: (GenerateAttribute) -> Boolean): GenerateAttribute? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'it' @ [179:64] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.markAsArrayLikeIfApplicable.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [179:67] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'isInt' @ [179:87] ==> local final fun isInt(type: Type): Boolean defined in org.jetbrains.idl2k.markAsArrayLikeIfApplicable[SimpleFunctionDescriptorImpl]

'it' @ [179:93] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.markAsArrayLikeIfApplicable.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [179:96] ==> public final val type: Type defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'iface' @ [180:30] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.markAsArrayLikeIfApplicable[ValueParameterDescriptorImpl]

'memberFunctions' @ [180:36] ==> public final val memberFunctions: MutableList<GenerateFunction> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'singleOrNull' @ [180:52] ==> public inline fun <T> Iterable<GenerateFunction>.singleOrNull(predicate: (GenerateFunction) -> Boolean): GenerateFunction? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction

'it' @ [180:67] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.markAsArrayLikeIfApplicable.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [180:70] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'it' @ [180:88] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.markAsArrayLikeIfApplicable.<anonymous>[ValueParameterDescriptorImpl]

'arguments' @ [180:91] ==> public final val arguments: List<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'map' @ [180:101] ==> public inline fun <T, R> Iterable<GenerateAttribute>.map(transform: (GenerateAttribute) -> Boolean): List<Boolean> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute
    <R> -> Boolean

'isInt' @ [180:107] ==> local final fun isInt(type: Type): Boolean defined in org.jetbrains.idl2k.markAsArrayLikeIfApplicable[SimpleFunctionDescriptorImpl]

'it' @ [180:113] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.markAsArrayLikeIfApplicable.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [180:116] ==> public final val type: Type defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'listOf' @ [180:127] ==> public fun <T> listOf(element: Boolean): List<Boolean> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'it' @ [180:143] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.markAsArrayLikeIfApplicable.<anonymous>[ValueParameterDescriptorImpl]

'returnType' @ [180:146] ==> public final val returnType: Type defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'UnitType' @ [180:160] ==> public object UnitType : Type defined in org.jetbrains.idl2k in file types.kt[FakeCallableDescriptorForObject]

'lengthProperty' @ [182:9] ==> val lengthProperty: GenerateAttribute? defined in org.jetbrains.idl2k.markAsArrayLikeIfApplicable[LocalVariableDescriptor]

'itemAccessFunction' @ [182:35] ==> val itemAccessFunction: GenerateFunction? defined in org.jetbrains.idl2k.markAsArrayLikeIfApplicable[LocalVariableDescriptor]

'iface' @ [182:70] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.markAsArrayLikeIfApplicable[ValueParameterDescriptorImpl]

'iface' @ [184:12] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.markAsArrayLikeIfApplicable[ValueParameterDescriptorImpl]

'copy' @ [184:18] ==> public final fun copy(name: String = ..., namespace: String = ..., kind: GenerateDefinitionKind = ..., superTypes: List<String> = ..., memberAttributes: MutableList<GenerateAttribute> = ..., memberFunctions: MutableList<GenerateFunction> = ..., constants: List<GenerateAttribute> = ..., primaryConstructor: ConstructorWithSuperTypeCall? = ..., secondaryConstructors: List<ConstructorWithSuperTypeCall> = ..., generateBuilderFunction: Boolean = ...): GenerateTraitOrClass defined in org.jetbrains.idl2k.GenerateTraitOrClass[SimpleFunctionDescriptorImpl]

'iface' @ [184:36] ==> value-parameter iface: GenerateTraitOrClass defined in org.jetbrains.idl2k.markAsArrayLikeIfApplicable[ValueParameterDescriptorImpl]

'superTypes' @ [184:42] ==> public final val superTypes: List<String> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'itemAccessFunction' @ [184:72] ==> val itemAccessFunction: GenerateFunction? defined in org.jetbrains.idl2k.markAsArrayLikeIfApplicable[LocalVariableDescriptor]

'returnType' @ [184:91] ==> public final val returnType: Type defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'dropNullable' @ [184:102] ==> public fun <T : Type> Type.dropNullable(): Type defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Type> -> Type

'render' @ [184:117] ==> public abstract fun render(): String defined in org.jetbrains.idl2k.Type[SimpleFunctionDescriptorImpl]

'generateFunction' @ [187:93] ==> public fun generateFunction(repository: Repository, function: Operation, functionName: String, nativeGetterOrSetter: NativeGetterOrSetter = ...): GenerateFunction defined in org.jetbrains.idl2k in file gen.kt[SimpleFunctionDescriptorImpl]

'repository' @ [188:9] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.generateConstructorAsFunction[ValueParameterDescriptorImpl]

'Operation' @ [189:9] ==> public constructor Operation(name: String, returnType: Type, parameters: List<Attribute>, attributes: List<ExtendedAttribute>, static: Boolean) defined in org.jetbrains.idl2k.Operation[ClassConstructorDescriptorImpl]

'UnitType' @ [189:34] ==> public object UnitType : Type defined in org.jetbrains.idl2k in file types.kt[FakeCallableDescriptorForObject]

'constructor' @ [189:44] ==> value-parameter constructor: ExtendedAttribute defined in org.jetbrains.idl2k.generateConstructorAsFunction[ValueParameterDescriptorImpl]

'arguments' @ [189:56] ==> public final val arguments: List<Attribute> defined in org.jetbrains.idl2k.ExtendedAttribute[PropertyDescriptorImpl]

'emptyList' @ [189:67] ==> public fun <T> emptyList(): List<ExtendedAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtendedAttribute

'NONE' @ [191:53] ==> enum entry NONE defined in org.jetbrains.idl2k.NativeGetterOrSetter[FakeCallableDescriptorForObject]

'GenerateTraitOrClass' @ [194:35] ==> public constructor GenerateTraitOrClass(name: String, namespace: String, kind: GenerateDefinitionKind, superTypes: List<String>, memberAttributes: MutableList<GenerateAttribute>, memberFunctions: MutableList<GenerateFunction>, constants: List<GenerateAttribute>, primaryConstructor: ConstructorWithSuperTypeCall?, secondaryConstructors: List<ConstructorWithSuperTypeCall>, generateBuilderFunction: Boolean) defined in org.jetbrains.idl2k.GenerateTraitOrClass[ClassConstructorDescriptorImpl]

'it' @ [195:16] ==> value-parameter it: UnionType defined in org.jetbrains.idl2k.mapUnionType[ValueParameterDescriptorImpl]

'name' @ [195:19] ==> public final val name: String defined in org.jetbrains.idl2k.UnionType[PropertyDescriptorImpl]

'it' @ [196:21] ==> value-parameter it: UnionType defined in org.jetbrains.idl2k.mapUnionType[ValueParameterDescriptorImpl]

'namespace' @ [196:24] ==> public final val namespace: String defined in org.jetbrains.idl2k.UnionType[PropertyDescriptorImpl]

'INTERFACE' @ [197:39] ==> enum entry INTERFACE defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'emptyList' @ [198:22] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'mutableListOf' @ [199:28] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'mutableListOf' @ [200:27] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<GenerateFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction

'emptyList' @ [201:21] ==> public fun <T> emptyList(): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'emptyList' @ [203:33] ==> public fun <T> emptyList(): List<ConstructorWithSuperTypeCall> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstructorWithSuperTypeCall

'allUnionTypes' @ [207:99] ==> value-parameter allUnionTypes: Sequence<UnionType> defined in org.jetbrains.idl2k.generateUnionTypeTraits[ValueParameterDescriptorImpl]

'map' @ [207:113] ==> public fun <T, R> Sequence<UnionType>.map(transform: (UnionType) -> GenerateTraitOrClass): Sequence<GenerateTraitOrClass> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnionType
    <R> -> GenerateTraitOrClass

'definitions' @ [210:9] ==> value-parameter definitions: Iterable<InterfaceDefinition> defined in org.jetbrains.idl2k.mapDefinitions[ValueParameterDescriptorImpl]

'map' @ [210:21] ==> public inline fun <T, R> Iterable<InterfaceDefinition>.map(transform: (InterfaceDefinition) -> GenerateTraitOrClass): List<GenerateTraitOrClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InterfaceDefinition
    <R> -> GenerateTraitOrClass

'generateTrait' @ [210:27] ==> public fun generateTrait(repository: Repository, iface: InterfaceDefinition): GenerateTraitOrClass defined in org.jetbrains.idl2k in file gen.kt[SimpleFunctionDescriptorImpl]

'repository' @ [210:41] ==> value-parameter repository: Repository defined in org.jetbrains.idl2k.mapDefinitions[ValueParameterDescriptorImpl]

'it' @ [210:53] ==> value-parameter it: InterfaceDefinition defined in org.jetbrains.idl2k.mapDefinitions.<anonymous>[ValueParameterDescriptorImpl]

'ifaces' @ [213:25] ==> value-parameter ifaces: List<GenerateTraitOrClass> defined in org.jetbrains.idl2k.generateUnions[ValueParameterDescriptorImpl]

'associateBy' @ [213:32] ==> public inline fun <T, K> Iterable<GenerateTraitOrClass>.associateBy(keySelector: (GenerateTraitOrClass) -> String): Map<String, GenerateTraitOrClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateTraitOrClass
    <K> -> String

'it' @ [213:46] ==> value-parameter it: GenerateTraitOrClass defined in org.jetbrains.idl2k.generateUnions.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [213:49] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'collectUnionTypes' @ [215:31] ==> internal fun collectUnionTypes(allTypes: Map<String, GenerateTraitOrClass>): Sequence<UnionType> defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'declaredTypes' @ [215:49] ==> val declaredTypes: Map<String, GenerateTraitOrClass> defined in org.jetbrains.idl2k.generateUnions[LocalVariableDescriptor]

'generateUnionTypeTraits' @ [216:36] ==> public fun generateUnionTypeTraits(allUnionTypes: Sequence<UnionType>): Sequence<GenerateTraitOrClass> defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'anonymousUnionTypes' @ [216:60] ==> val anonymousUnionTypes: Sequence<UnionType> defined in org.jetbrains.idl2k.generateUnions[LocalVariableDescriptor]

'anonymousUnionTypeTraits' @ [217:30] ==> val anonymousUnionTypeTraits: Sequence<GenerateTraitOrClass> defined in org.jetbrains.idl2k.generateUnions[LocalVariableDescriptor]

'associateBy' @ [217:55] ==> public inline fun <T, K> Sequence<GenerateTraitOrClass>.associateBy(keySelector: (GenerateTraitOrClass) -> String): Map<String, GenerateTraitOrClass> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateTraitOrClass
    <K> -> String

'it' @ [217:69] ==> value-parameter it: GenerateTraitOrClass defined in org.jetbrains.idl2k.generateUnions.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [217:72] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'typedefs' @ [219:33] ==> value-parameter typedefs: Iterable<TypedefDefinition> defined in org.jetbrains.idl2k.generateUnions[ValueParameterDescriptorImpl]

'filter' @ [219:42] ==> public inline fun <T> Iterable<TypedefDefinition>.filter(predicate: (TypedefDefinition) -> Boolean): List<TypedefDefinition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypedefDefinition

'it' @ [219:51] ==> value-parameter it: TypedefDefinition defined in org.jetbrains.idl2k.generateUnions.<anonymous>[ValueParameterDescriptorImpl]

'types' @ [219:54] ==> public final val types: Type defined in org.jetbrains.idl2k.TypedefDefinition[PropertyDescriptorImpl]

'map' @ [220:14] ==> public inline fun <T, R> Iterable<TypedefDefinition>.map(transform: (TypedefDefinition) -> NamedValue<UnionType>): List<NamedValue<UnionType>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypedefDefinition
    <R> -> NamedValue<UnionType>

'NamedValue' @ [220:20] ==> public constructor NamedValue<V>(name: String, value: UnionType) defined in org.jetbrains.idl2k.NamedValue[ClassConstructorDescriptorImpl]
Inferred types:
    <V> -> UnionType

'it' @ [220:31] ==> value-parameter it: TypedefDefinition defined in org.jetbrains.idl2k.generateUnions.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [220:34] ==> public final val name: String defined in org.jetbrains.idl2k.TypedefDefinition[PropertyDescriptorImpl]

'it' @ [220:40] ==> value-parameter it: TypedefDefinition defined in org.jetbrains.idl2k.generateUnions.<anonymous>[ValueParameterDescriptorImpl]

'types' @ [220:43] ==> public final val types: Type defined in org.jetbrains.idl2k.TypedefDefinition[PropertyDescriptorImpl]

'filter' @ [221:14] ==> public inline fun <T> Iterable<NamedValue<UnionType>>.filter(predicate: (NamedValue<UnionType>) -> Boolean): List<NamedValue<UnionType>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NamedValue<UnionType>

'it' @ [221:23] ==> value-parameter it: NamedValue<UnionType> defined in org.jetbrains.idl2k.generateUnions.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [221:26] ==> public final val value: UnionType defined in org.jetbrains.idl2k.NamedValue[PropertyDescriptorImpl]

'memberTypes' @ [221:32] ==> public final val memberTypes: Set<Type> defined in org.jetbrains.idl2k.UnionType[PropertyDescriptorImpl]

'all' @ [221:44] ==> public inline fun <T> Iterable<Type>.all(predicate: (Type) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'type' @ [221:58] ==> value-parameter type: Type defined in org.jetbrains.idl2k.generateUnions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [221:80] ==> value-parameter type: Type defined in org.jetbrains.idl2k.generateUnions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [221:85] ==> public final val type: String defined in org.jetbrains.idl2k.SimpleType[PropertyDescriptorImpl]

'declaredTypes' @ [221:93] ==> val declaredTypes: Map<String, GenerateTraitOrClass> defined in org.jetbrains.idl2k.generateUnions[LocalVariableDescriptor]

'typedefsToBeGenerated' @ [223:30] ==> val typedefsToBeGenerated: List<NamedValue<UnionType>> defined in org.jetbrains.idl2k.generateUnions[LocalVariableDescriptor]

'groupBy' @ [223:52] ==> public inline fun <T, K> Iterable<NamedValue<UnionType>>.groupBy(keySelector: (NamedValue<UnionType>) -> String): Map<String, List<NamedValue<UnionType>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NamedValue<UnionType>
    <K> -> String

'it' @ [223:62] ==> value-parameter it: NamedValue<UnionType> defined in org.jetbrains.idl2k.generateUnions.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [223:65] ==> public final val name: String defined in org.jetbrains.idl2k.NamedValue[PropertyDescriptorImpl]

'mapValues' @ [223:72] ==> public inline fun <K, V, R> Map<out String, List<NamedValue<UnionType>>>.mapValues(transform: (Map.Entry<String, List<NamedValue<UnionType>>>) -> GenerateTraitOrClass): Map<String, GenerateTraitOrClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<NamedValue<UnionType>>
    <R> -> GenerateTraitOrClass

'mapUnionType' @ [223:84] ==> public fun mapUnionType(it: UnionType): GenerateTraitOrClass defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'it' @ [223:97] ==> value-parameter it: Map.Entry<String, List<NamedValue<UnionType>>> defined in org.jetbrains.idl2k.generateUnions.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [223:100] ==> public abstract val value: List<NamedValue<UnionType>> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'first' @ [223:106] ==> public fun <T> List<NamedValue<UnionType>>.first(): NamedValue<UnionType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NamedValue<UnionType>

'value' @ [223:114] ==> public final val value: UnionType defined in org.jetbrains.idl2k.NamedValue[PropertyDescriptorImpl]

'copy' @ [223:121] ==> public final fun copy(name: String = ..., namespace: String = ..., kind: GenerateDefinitionKind = ..., superTypes: List<String> = ..., memberAttributes: MutableList<GenerateAttribute> = ..., memberFunctions: MutableList<GenerateFunction> = ..., constants: List<GenerateAttribute> = ..., primaryConstructor: ConstructorWithSuperTypeCall? = ..., secondaryConstructors: List<ConstructorWithSuperTypeCall> = ..., generateBuilderFunction: Boolean = ...): GenerateTraitOrClass defined in org.jetbrains.idl2k.GenerateTraitOrClass[SimpleFunctionDescriptorImpl]

'it' @ [223:133] ==> value-parameter it: Map.Entry<String, List<NamedValue<UnionType>>> defined in org.jetbrains.idl2k.generateUnions.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [223:136] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'anonymousUnionTypes' @ [225:29] ==> val anonymousUnionTypes: Sequence<UnionType> defined in org.jetbrains.idl2k.generateUnions[LocalVariableDescriptor]

'toList' @ [226:14] ==> public fun <T> Sequence<UnionType>.toList(): List<UnionType> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnionType

'flatMap' @ [227:14] ==> public inline fun <T, R> Iterable<UnionType>.flatMap(transform: (UnionType) -> Iterable<Pair<String, String>>): List<Pair<String, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnionType
    <R> -> Pair<String, String>

'unionType' @ [228:17] ==> value-parameter unionType: UnionType defined in org.jetbrains.idl2k.generateUnions.<anonymous>[ValueParameterDescriptorImpl]

'memberTypes' @ [228:27] ==> public final val memberTypes: Set<Type> defined in org.jetbrains.idl2k.UnionType[PropertyDescriptorImpl]

'filterIsInstance' @ [229:26] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> SimpleType

'map' @ [230:26] ==> public inline fun <T, R> Iterable<SimpleType>.map(transform: (SimpleType) -> Pair<String, String>): List<Pair<String, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType
    <R> -> Pair<String, String>

'unionMember' @ [230:47] ==> value-parameter unionMember: SimpleType defined in org.jetbrains.idl2k.generateUnions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [230:59] ==> public final val type: String defined in org.jetbrains.idl2k.SimpleType[PropertyDescriptorImpl]

'unionType' @ [230:67] ==> value-parameter unionType: UnionType defined in org.jetbrains.idl2k.generateUnions.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [230:77] ==> public final val name: String defined in org.jetbrains.idl2k.UnionType[PropertyDescriptorImpl]

'toMultiMap' @ [231:15] ==> public fun <K, V> List<Pair<String, String>>.toMultiMap(): Map<String, List<String>> defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> String

'merge' @ [232:14] ==> internal fun <K, V> Map<String, List<String>>.merge(other: Map<String, List<String>>): Map<String, List<String>> defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> String

'typedefsToBeGenerated' @ [232:20] ==> val typedefsToBeGenerated: List<NamedValue<UnionType>> defined in org.jetbrains.idl2k.generateUnions[LocalVariableDescriptor]

'flatMap' @ [233:22] ==> public inline fun <T, R> Iterable<NamedValue<UnionType>>.flatMap(transform: (NamedValue<UnionType>) -> Iterable<Pair<String, String>>): List<Pair<String, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NamedValue<UnionType>
    <R> -> Pair<String, String>

'typedef' @ [234:25] ==> value-parameter typedef: NamedValue<UnionType> defined in org.jetbrains.idl2k.generateUnions.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [234:33] ==> public final val value: UnionType defined in org.jetbrains.idl2k.NamedValue[PropertyDescriptorImpl]

'memberTypes' @ [234:39] ==> public final val memberTypes: Set<Type> defined in org.jetbrains.idl2k.UnionType[PropertyDescriptorImpl]

'filterIsInstance' @ [235:34] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> SimpleType

'map' @ [236:34] ==> public inline fun <T, R> Iterable<SimpleType>.map(transform: (SimpleType) -> Pair<String, String>): List<Pair<String, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType
    <R> -> Pair<String, String>

'unionMember' @ [236:55] ==> value-parameter unionMember: SimpleType defined in org.jetbrains.idl2k.generateUnions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [236:67] ==> public final val type: String defined in org.jetbrains.idl2k.SimpleType[PropertyDescriptorImpl]

'typedef' @ [236:75] ==> value-parameter typedef: NamedValue<UnionType> defined in org.jetbrains.idl2k.generateUnions.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [236:83] ==> public final val name: String defined in org.jetbrains.idl2k.NamedValue[PropertyDescriptorImpl]

'toMultiMap' @ [237:23] ==> public fun <K, V> List<Pair<String, String>>.toMultiMap(): Map<String, List<String>> defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> String

'GenerateUnionTypes' @ [239:12] ==> public constructor GenerateUnionTypes(typeNamesToUnionsMap: Map<String, List<String>>, anonymousUnionsMap: Map<String, GenerateTraitOrClass>, typedefsMarkersMap: Map<String, GenerateTraitOrClass>) defined in org.jetbrains.idl2k.GenerateUnionTypes[ClassConstructorDescriptorImpl]

'typeNamesToUnions' @ [240:36] ==> val typeNamesToUnions: Map<String, List<String>> defined in org.jetbrains.idl2k.generateUnions[LocalVariableDescriptor]

'anonymousUnionsMap' @ [241:34] ==> val anonymousUnionsMap: Map<String, GenerateTraitOrClass> defined in org.jetbrains.idl2k.generateUnions[LocalVariableDescriptor]

'typedefsMarkersMap' @ [242:34] ==> val typedefsMarkersMap: Map<String, GenerateTraitOrClass> defined in org.jetbrains.idl2k.generateUnions[LocalVariableDescriptor]

'DynamicType' @ [246:63] ==> public object DynamicType : Type defined in org.jetbrains.idl2k in file types.kt[FakeCallableDescriptorForObject]

'if (literal != null && expectedType is SimpleType && expectedType.type in enums.keys) {
        expectedType.type + "." + mapEnumConstant(literal.removeSurrounding("\"", "\""))
    }
    else {
        when (literal) {
            "[]" -> when {
                expectedType == DynamicType -> "arrayOf<dynamic>()"
                expectedType is AnyType -> "arrayOf<dynamic>()"
                expectedType is UnionType -> "arrayOf<dynamic>()"
                else -> "arrayOf()"
            }
            else -> literal
        }
    }' @ [247:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'literal' @ [247:9] ==> value-parameter literal: String? defined in org.jetbrains.idl2k.mapLiteral[ValueParameterDescriptorImpl]

'expectedType' @ [247:28] ==> value-parameter expectedType: Type = ... defined in org.jetbrains.idl2k.mapLiteral[ValueParameterDescriptorImpl]

'expectedType' @ [247:58] ==> value-parameter expectedType: Type = ... defined in org.jetbrains.idl2k.mapLiteral[ValueParameterDescriptorImpl]

'type' @ [247:71] ==> public final val type: String defined in org.jetbrains.idl2k.SimpleType[PropertyDescriptorImpl]

'enums' @ [247:79] ==> value-parameter enums: Map<String, EnumDefinition> defined in org.jetbrains.idl2k.mapLiteral[ValueParameterDescriptorImpl]

'keys' @ [247:85] ==> public abstract val keys: Set<String> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'expectedType' @ [248:9] ==> value-parameter expectedType: Type = ... defined in org.jetbrains.idl2k.mapLiteral[ValueParameterDescriptorImpl]

'type' @ [248:22] ==> public final val type: String defined in org.jetbrains.idl2k.SimpleType[PropertyDescriptorImpl]

'mapEnumConstant' @ [248:35] ==> public fun mapEnumConstant(entry: String): String defined in org.jetbrains.idl2k.util[SimpleFunctionDescriptorImpl]

'literal' @ [248:51] ==> value-parameter literal: String? defined in org.jetbrains.idl2k.mapLiteral[ValueParameterDescriptorImpl]

'removeSurrounding' @ [248:59] ==> public fun String.removeSurrounding(prefix: CharSequence, suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'when (literal) {
            "[]" -> when {
                expectedType == DynamicType -> "arrayOf<dynamic>()"
                expectedType is AnyType -> "arrayOf<dynamic>()"
                expectedType is UnionType -> "arrayOf<dynamic>()"
                else -> "arrayOf()"
            }
            else -> literal
        }' @ [251:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'literal' @ [251:15] ==> value-parameter literal: String? defined in org.jetbrains.idl2k.mapLiteral[ValueParameterDescriptorImpl]

'when {
                expectedType == DynamicType -> "arrayOf<dynamic>()"
                expectedType is AnyType -> "arrayOf<dynamic>()"
                expectedType is UnionType -> "arrayOf<dynamic>()"
                else -> "arrayOf()"
            }' @ [252:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'expectedType' @ [253:17] ==> value-parameter expectedType: Type = ... defined in org.jetbrains.idl2k.mapLiteral[ValueParameterDescriptorImpl]

'DynamicType' @ [253:33] ==> public object DynamicType : Type defined in org.jetbrains.idl2k in file types.kt[FakeCallableDescriptorForObject]

'expectedType' @ [254:17] ==> value-parameter expectedType: Type = ... defined in org.jetbrains.idl2k.mapLiteral[ValueParameterDescriptorImpl]

'expectedType' @ [255:17] ==> value-parameter expectedType: Type = ... defined in org.jetbrains.idl2k.mapLiteral[ValueParameterDescriptorImpl]

'literal' @ [258:21] ==> value-parameter literal: String? defined in org.jetbrains.idl2k.mapLiteral[ValueParameterDescriptorImpl]

'getUnimplementedMembers' @ [263:34] ==> private fun getUnimplementedMembers(declarations: List<GenerateTraitOrClass>): Map<String, UnimplementedMembers> defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'declarations' @ [263:58] ==> value-parameter declarations: List<GenerateTraitOrClass> defined in org.jetbrains.idl2k.implementInterfaces[ValueParameterDescriptorImpl]

'declarations' @ [264:35] ==> value-parameter declarations: List<GenerateTraitOrClass> defined in org.jetbrains.idl2k.implementInterfaces[ValueParameterDescriptorImpl]

'filter' @ [264:48] ==> public inline fun <T> Iterable<GenerateTraitOrClass>.filter(predicate: (GenerateTraitOrClass) -> Boolean): List<GenerateTraitOrClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateTraitOrClass

'it' @ [264:57] ==> value-parameter it: GenerateTraitOrClass defined in org.jetbrains.idl2k.implementInterfaces.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [264:60] ==> public final val kind: GenerateDefinitionKind defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'CLASS' @ [264:91] ==> enum entry CLASS defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'nonAbstractDeclarations' @ [265:25] ==> val nonAbstractDeclarations: List<GenerateTraitOrClass> defined in org.jetbrains.idl2k.implementInterfaces[LocalVariableDescriptor]

'unimplementedMemberMap' @ [266:36] ==> val unimplementedMemberMap: Map<String, UnimplementedMembers> defined in org.jetbrains.idl2k.implementInterfaces[LocalVariableDescriptor]

'declaration' @ [266:59] ==> val declaration: GenerateTraitOrClass defined in org.jetbrains.idl2k.implementInterfaces[LocalVariableDescriptor]

'name' @ [266:71] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'unimplementedMembers' @ [268:27] ==> val unimplementedMembers: UnimplementedMembers defined in org.jetbrains.idl2k.implementInterfaces[LocalVariableDescriptor]

'attributes' @ [268:48] ==> public final val attributes: List<GenerateAttribute> defined in org.jetbrains.idl2k.UnimplementedMembers[PropertyDescriptorImpl]

'declaration' @ [269:13] ==> val declaration: GenerateTraitOrClass defined in org.jetbrains.idl2k.implementInterfaces[LocalVariableDescriptor]

'memberAttributes' @ [269:25] ==> public final val memberAttributes: MutableList<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'attribute' @ [269:45] ==> val attribute: GenerateAttribute defined in org.jetbrains.idl2k.implementInterfaces[LocalVariableDescriptor]

'copy' @ [269:55] ==> public final fun copy(name: String = ..., type: Type = ..., initializer: String? = ..., getterSetterNoImpl: Boolean = ..., kind: AttributeKind = ..., override: Boolean = ..., vararg: Boolean = ..., static: Boolean = ..., required: Boolean = ...): GenerateAttribute defined in org.jetbrains.idl2k.GenerateAttribute[SimpleFunctionDescriptorImpl]

'unimplementedMembers' @ [271:26] ==> val unimplementedMembers: UnimplementedMembers defined in org.jetbrains.idl2k.implementInterfaces[LocalVariableDescriptor]

'functions' @ [271:47] ==> public final val functions: List<GenerateFunction> defined in org.jetbrains.idl2k.UnimplementedMembers[PropertyDescriptorImpl]

'declaration' @ [272:13] ==> val declaration: GenerateTraitOrClass defined in org.jetbrains.idl2k.implementInterfaces[LocalVariableDescriptor]

'memberFunctions' @ [272:25] ==> public final val memberFunctions: MutableList<GenerateFunction> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'function' @ [272:44] ==> val function: GenerateFunction defined in org.jetbrains.idl2k.implementInterfaces[LocalVariableDescriptor]

'copy' @ [272:53] ==> public final fun copy(name: String = ..., returnType: Type = ..., arguments: List<GenerateAttribute> = ..., nativeGetterOrSetter: NativeGetterOrSetter = ..., static: Boolean = ..., override: Boolean = ...): GenerateFunction defined in org.jetbrains.idl2k.GenerateFunction[SimpleFunctionDescriptorImpl]

'declarations' @ [278:26] ==> value-parameter declarations: List<GenerateTraitOrClass> defined in org.jetbrains.idl2k.getUnimplementedMembers[ValueParameterDescriptorImpl]

'associate' @ [278:39] ==> public inline fun <T, K, V> Iterable<GenerateTraitOrClass>.associate(transform: (GenerateTraitOrClass) -> Pair<String, GenerateTraitOrClass>): Map<String, GenerateTraitOrClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateTraitOrClass
    <K> -> String
    <V> -> GenerateTraitOrClass

'it' @ [278:51] ==> value-parameter it: GenerateTraitOrClass defined in org.jetbrains.idl2k.getUnimplementedMembers.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [278:54] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'it' @ [278:62] ==> value-parameter it: GenerateTraitOrClass defined in org.jetbrains.idl2k.getUnimplementedMembers.<anonymous>[ValueParameterDescriptorImpl]

'mutableMapOf' @ [279:36] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<String, UnimplementedMembers> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> UnimplementedMembers

'unimplementedMemberCache' @ [281:64] ==> val unimplementedMemberCache: MutableMap<String, UnimplementedMembers> defined in org.jetbrains.idl2k.getUnimplementedMembers[LocalVariableDescriptor]

'getOrPut' @ [281:89] ==> public inline fun <K, V> MutableMap<String, UnimplementedMembers>.getOrPut(key: String, defaultValue: () -> UnimplementedMembers): UnimplementedMembers defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> UnimplementedMembers

'className' @ [281:98] ==> value-parameter className: String defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass[ValueParameterDescriptorImpl]

'declarationMap' @ [282:27] ==> val declarationMap: Map<String, GenerateTraitOrClass> defined in org.jetbrains.idl2k.getUnimplementedMembers[LocalVariableDescriptor]

'className' @ [282:42] ==> value-parameter className: String defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass[ValueParameterDescriptorImpl]

'UnimplementedMembers' @ [282:72] ==> public constructor UnimplementedMembers(attributes: List<GenerateAttribute>, functions: List<GenerateFunction>) defined in org.jetbrains.idl2k.UnimplementedMembers[ClassConstructorDescriptorImpl]

'emptyList' @ [282:93] ==> public fun <T> emptyList(): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'emptyList' @ [282:106] ==> public fun <T> emptyList(): List<GenerateFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction

'declaration' @ [283:43] ==> val declaration: GenerateTraitOrClass defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>[LocalVariableDescriptor]

'superTypes' @ [283:55] ==> public final val superTypes: List<String> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'map' @ [283:66] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> UnimplementedMembers): List<UnimplementedMembers> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> UnimplementedMembers

'getForClass' @ [283:72] ==> local final fun getForClass(className: String): UnimplementedMembers defined in org.jetbrains.idl2k.getUnimplementedMembers[SimpleFunctionDescriptorImpl]

'it' @ [283:84] ==> value-parameter it: String defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'unimplementedInSuperClasses' @ [284:28] ==> val unimplementedInSuperClasses: List<UnimplementedMembers> defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>[LocalVariableDescriptor]

'flatMap' @ [285:18] ==> public inline fun <T, R> Iterable<UnimplementedMembers>.flatMap(transform: (UnimplementedMembers) -> Iterable<GenerateAttribute>): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnimplementedMembers
    <R> -> GenerateAttribute

'it' @ [285:28] ==> value-parameter it: UnimplementedMembers defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'attributes' @ [285:31] ==> public final val attributes: List<GenerateAttribute> defined in org.jetbrains.idl2k.UnimplementedMembers[PropertyDescriptorImpl]

'associate' @ [286:18] ==> public inline fun <T, K, V> Iterable<GenerateAttribute>.associate(transform: (GenerateAttribute) -> Pair<String, GenerateAttribute>): Map<String, GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute
    <K> -> String
    <V> -> GenerateAttribute

'it' @ [286:30] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [286:33] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'it' @ [286:41] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toMutableMap' @ [287:18] ==> @SinceKotlin public fun <K, V> Map<out String, GenerateAttribute>.toMutableMap(): MutableMap<String, GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> GenerateAttribute

'unimplementedInSuperClasses' @ [288:27] ==> val unimplementedInSuperClasses: List<UnimplementedMembers> defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>[LocalVariableDescriptor]

'flatMap' @ [289:18] ==> public inline fun <T, R> Iterable<UnimplementedMembers>.flatMap(transform: (UnimplementedMembers) -> Iterable<GenerateFunction>): List<GenerateFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnimplementedMembers
    <R> -> GenerateFunction

'it' @ [289:28] ==> value-parameter it: UnimplementedMembers defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'functions' @ [289:31] ==> public final val functions: List<GenerateFunction> defined in org.jetbrains.idl2k.UnimplementedMembers[PropertyDescriptorImpl]

'associate' @ [290:18] ==> public inline fun <T, K, V> Iterable<GenerateFunction>.associate(transform: (GenerateFunction) -> Pair<String, GenerateFunction>): Map<String, GenerateFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction
    <K> -> String
    <V> -> GenerateFunction

'to' @ [290:30] ==> public infix fun <A, B> String.to(that: GenerateFunction): Pair<String, GenerateFunction> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> GenerateFunction

'it' @ [290:33] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [290:36] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'it' @ [290:44] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'signature' @ [290:47] ==> public val GenerateFunction.signature: String defined in org.jetbrains.idl2k in file model.kt[PropertyDescriptorImpl]

'it' @ [290:63] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toMutableMap' @ [291:18] ==> @SinceKotlin public fun <K, V> Map<out String, GenerateFunction>.toMutableMap(): MutableMap<String, GenerateFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> GenerateFunction

'component1' @ [293:14] ==> public final operator fun component1(): List<GenerateAttribute> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [293:37] ==> public final operator fun component2(): List<GenerateAttribute> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'declaration' @ [293:64] ==> val declaration: GenerateTraitOrClass defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>[LocalVariableDescriptor]

'memberAttributes' @ [293:76] ==> public final val memberAttributes: MutableList<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'filter' @ [294:18] ==> public inline fun <T> Iterable<GenerateAttribute>.filter(predicate: (GenerateAttribute) -> Boolean): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'!' @ [294:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [294:28] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'static' @ [294:31] ==> public final val static: Boolean defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'partition' @ [295:18] ==> public inline fun <T> Iterable<GenerateAttribute>.partition(predicate: (GenerateAttribute) -> Boolean): Pair<List<GenerateAttribute>, List<GenerateAttribute>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'declaration' @ [295:30] ==> val declaration: GenerateTraitOrClass defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>[LocalVariableDescriptor]

'kind' @ [295:42] ==> public final val kind: GenerateDefinitionKind defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'INTERFACE' @ [295:73] ==> enum entry INTERFACE defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'!' @ [295:86] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [295:87] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getterSetterNoImpl' @ [295:90] ==> public final val getterSetterNoImpl: Boolean defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'component1' @ [296:14] ==> public final operator fun component1(): List<GenerateFunction> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [296:36] ==> public final operator fun component2(): List<GenerateFunction> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'declaration' @ [296:62] ==> val declaration: GenerateTraitOrClass defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>[LocalVariableDescriptor]

'memberFunctions' @ [296:74] ==> public final val memberFunctions: MutableList<GenerateFunction> defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'filter' @ [297:18] ==> public inline fun <T> Iterable<GenerateFunction>.filter(predicate: (GenerateFunction) -> Boolean): List<GenerateFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction

'!' @ [297:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [297:28] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'static' @ [297:31] ==> public final val static: Boolean defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'partition' @ [298:18] ==> public inline fun <T> Iterable<GenerateFunction>.partition(predicate: (GenerateFunction) -> Boolean): Pair<List<GenerateFunction>, List<GenerateFunction>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction

'declaration' @ [298:30] ==> val declaration: GenerateTraitOrClass defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>[LocalVariableDescriptor]

'kind' @ [298:42] ==> public final val kind: GenerateDefinitionKind defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'INTERFACE' @ [298:73] ==> enum entry INTERFACE defined in org.jetbrains.idl2k.GenerateDefinitionKind[FakeCallableDescriptorForObject]

'attributeMap' @ [300:9] ==> val attributeMap: MutableMap<String, GenerateAttribute> defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>[LocalVariableDescriptor]

'unimplementedAttributes' @ [300:25] ==> val unimplementedAttributes: List<GenerateAttribute> defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>[LocalVariableDescriptor]

'map' @ [300:49] ==> public inline fun <T, R> Iterable<GenerateAttribute>.map(transform: (GenerateAttribute) -> Pair<String, GenerateAttribute>): List<Pair<String, GenerateAttribute>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute
    <R> -> Pair<String, GenerateAttribute>

'it' @ [300:55] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [300:58] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'it' @ [300:66] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'attributeMap' @ [301:9] ==> val attributeMap: MutableMap<String, GenerateAttribute> defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>[LocalVariableDescriptor]

'keys' @ [301:22] ==> public abstract val keys: MutableSet<String> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'implementedAttributes' @ [301:30] ==> val implementedAttributes: List<GenerateAttribute> defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>[LocalVariableDescriptor]

'map' @ [301:52] ==> public inline fun <T, R> Iterable<GenerateAttribute>.map(transform: (GenerateAttribute) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute
    <R> -> String

'it' @ [301:58] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [301:61] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'functionMap' @ [302:9] ==> val functionMap: MutableMap<String, GenerateFunction> defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>[LocalVariableDescriptor]

'unimplementedFunctions' @ [302:24] ==> val unimplementedFunctions: List<GenerateFunction> defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>[LocalVariableDescriptor]

'map' @ [302:47] ==> public inline fun <T, R> Iterable<GenerateFunction>.map(transform: (GenerateFunction) -> Pair<String, GenerateFunction>): List<Pair<String, GenerateFunction>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction
    <R> -> Pair<String, GenerateFunction>

'to' @ [302:53] ==> public infix fun <A, B> String.to(that: GenerateFunction): Pair<String, GenerateFunction> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> GenerateFunction

'it' @ [302:56] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [302:59] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'it' @ [302:67] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'signature' @ [302:70] ==> public val GenerateFunction.signature: String defined in org.jetbrains.idl2k in file model.kt[PropertyDescriptorImpl]

'it' @ [302:86] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'functionMap' @ [303:9] ==> val functionMap: MutableMap<String, GenerateFunction> defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>[LocalVariableDescriptor]

'keys' @ [303:21] ==> public abstract val keys: MutableSet<String> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'implementedFunctions' @ [303:29] ==> val implementedFunctions: List<GenerateFunction> defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>[LocalVariableDescriptor]

'map' @ [303:50] ==> public inline fun <T, R> Iterable<GenerateFunction>.map(transform: (GenerateFunction) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction
    <R> -> String

'it' @ [303:59] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [303:62] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'it' @ [303:70] ==> value-parameter it: GenerateFunction defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'signature' @ [303:73] ==> public val GenerateFunction.signature: String defined in org.jetbrains.idl2k in file model.kt[PropertyDescriptorImpl]

'UnimplementedMembers' @ [305:9] ==> public constructor UnimplementedMembers(attributes: List<GenerateAttribute>, functions: List<GenerateFunction>) defined in org.jetbrains.idl2k.UnimplementedMembers[ClassConstructorDescriptorImpl]

'attributeMap' @ [305:30] ==> val attributeMap: MutableMap<String, GenerateAttribute> defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>[LocalVariableDescriptor]

'values' @ [305:43] ==> public abstract val values: MutableCollection<GenerateAttribute> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'toList' @ [305:50] ==> public fun <T> Iterable<GenerateAttribute>.toList(): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute

'functionMap' @ [305:60] ==> val functionMap: MutableMap<String, GenerateFunction> defined in org.jetbrains.idl2k.getUnimplementedMembers.getForClass.<anonymous>[LocalVariableDescriptor]

'values' @ [305:72] ==> public abstract val values: MutableCollection<GenerateFunction> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'toList' @ [305:79] ==> public fun <T> Iterable<GenerateFunction>.toList(): List<GenerateFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateFunction

'declarations' @ [308:25] ==> value-parameter declarations: List<GenerateTraitOrClass> defined in org.jetbrains.idl2k.getUnimplementedMembers[ValueParameterDescriptorImpl]

'getForClass' @ [309:9] ==> local final fun getForClass(className: String): UnimplementedMembers defined in org.jetbrains.idl2k.getUnimplementedMembers[SimpleFunctionDescriptorImpl]

'declaration' @ [309:21] ==> val declaration: GenerateTraitOrClass defined in org.jetbrains.idl2k.getUnimplementedMembers[LocalVariableDescriptor]

'name' @ [309:33] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateTraitOrClass[PropertyDescriptorImpl]

'unimplementedMemberCache' @ [312:12] ==> val unimplementedMemberCache: MutableMap<String, UnimplementedMembers> defined in org.jetbrains.idl2k.getUnimplementedMembers[LocalVariableDescriptor]

