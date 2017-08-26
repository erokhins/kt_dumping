'getterSetterNoImpl' @ [34:13] ==> public final val getterSetterNoImpl: Boolean defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'getterSetterNoImpl' @ [36:13] ==> public final val getterSetterNoImpl: Boolean defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'kind' @ [36:35] ==> public final val kind: AttributeKind defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'VAR' @ [36:57] ==> enum entry VAR defined in org.jetbrains.idl2k.AttributeKind[FakeCallableDescriptorForObject]

'kind' @ [38:13] ==> public final val kind: AttributeKind defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'VAL' @ [38:35] ==> enum entry VAL defined in org.jetbrains.idl2k.AttributeKind[FakeCallableDescriptorForObject]

'kind' @ [40:13] ==> public final val kind: AttributeKind defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'VAR' @ [40:35] ==> enum entry VAR defined in org.jetbrains.idl2k.AttributeKind[FakeCallableDescriptorForObject]

'when {
        this is FunctionType -> "Function$arity"
        else -> this.toString()
    }' @ [43:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'this' @ [44:9] ==> <this> defined in org.jetbrains.idl2k.typeSignature[ReceiverParameterDescriptorImpl]

'arity' @ [44:43] ==> public val FunctionType.arity: Int defined in org.jetbrains.idl2k in file types.kt[PropertyDescriptorImpl]

'this' @ [45:17] ==> <this> defined in org.jetbrains.idl2k.typeSignature[ReceiverParameterDescriptorImpl]

'toString' @ [45:22] ==> public open fun toString(): String defined in org.jetbrains.idl2k.Type[DeserializedSimpleFunctionDescriptor]

'name' @ [49:15] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'type' @ [49:22] ==> public final val type: Type defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'typeSignature' @ [49:27] ==> public val Type.typeSignature: String defined in org.jetbrains.idl2k in file model.kt[PropertyDescriptorImpl]

'standardTypes' @ [51:96] ==> public fun standardTypes(): Set<Type> defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'copy' @ [51:115] ==> public final fun copy(name: String = ..., type: Type = ..., initializer: String? = ..., getterSetterNoImpl: Boolean = ..., kind: AttributeKind = ..., override: Boolean = ..., vararg: Boolean = ..., static: Boolean = ..., required: Boolean = ...): GenerateAttribute defined in org.jetbrains.idl2k.GenerateAttribute[SimpleFunctionDescriptorImpl]

'type' @ [51:127] ==> public final val type: Type defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'dynamicIfUnknownType' @ [51:132] ==> public fun Type.dynamicIfUnknownType(allTypes: Set<String>, standardTypes: Set<Type> = ...): Type defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'allTypes' @ [51:153] ==> value-parameter allTypes: Set<String> defined in org.jetbrains.idl2k.dynamicIfUnknownType[ValueParameterDescriptorImpl]

'standardTypes' @ [51:163] ==> value-parameter standardTypes: Set<Type> = ... defined in org.jetbrains.idl2k.dynamicIfUnknownType[ValueParameterDescriptorImpl]

'standardTypes' @ [52:102] ==> public fun standardTypes(): Set<Type> defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'map' @ [52:121] ==> public inline fun <T, R> Iterable<GenerateAttribute>.map(transform: (GenerateAttribute) -> GenerateAttribute): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute
    <R> -> GenerateAttribute

'it' @ [52:127] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.dynamicIfUnknownType.<anonymous>[ValueParameterDescriptorImpl]

'dynamicIfUnknownType' @ [52:130] ==> public fun GenerateAttribute.dynamicIfUnknownType(allTypes: Set<String>, standardTypes: Set<Type> = ...): GenerateAttribute defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'allTypes' @ [52:151] ==> value-parameter allTypes: Set<String> defined in org.jetbrains.idl2k.dynamicIfUnknownType[ValueParameterDescriptorImpl]

'standardTypes' @ [52:161] ==> value-parameter standardTypes: Set<Type> = ... defined in org.jetbrains.idl2k.dynamicIfUnknownType[ValueParameterDescriptorImpl]

'arguments' @ [91:13] ==> public final val arguments: List<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'map' @ [91:23] ==> public inline fun <T, R> Iterable<GenerateAttribute>.map(transform: (GenerateAttribute) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute
    <R> -> String

'it' @ [91:29] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.<get-signature>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [91:32] ==> public final val type: Type defined in org.jetbrains.idl2k.GenerateAttribute[PropertyDescriptorImpl]

'typeSignature' @ [91:37] ==> public val Type.typeSignature: String defined in org.jetbrains.idl2k in file model.kt[PropertyDescriptorImpl]

'joinToString' @ [91:53] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'name' @ [91:74] ==> public final val name: String defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'standardTypes' @ [93:69] ==> public fun standardTypes(): Set<Type> defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'let' @ [93:85] ==> @InlineOnly public inline fun <T, R> Set<Type>.let(block: (Set<Type>) -> GenerateFunction): GenerateFunction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Set<Type>
    <R> -> GenerateFunction

'copy' @ [94:5] ==> public final fun copy(name: String = ..., returnType: Type = ..., arguments: List<GenerateAttribute> = ..., nativeGetterOrSetter: NativeGetterOrSetter = ..., static: Boolean = ..., override: Boolean = ...): GenerateFunction defined in org.jetbrains.idl2k.GenerateFunction[SimpleFunctionDescriptorImpl]

'returnType' @ [94:23] ==> public final val returnType: Type defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'dynamicIfUnknownType' @ [94:34] ==> public fun Type.dynamicIfUnknownType(allTypes: Set<String>, standardTypes: Set<Type> = ...): Type defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'allTypes' @ [94:55] ==> value-parameter allTypes: Set<String> defined in org.jetbrains.idl2k.dynamicIfUnknownType[ValueParameterDescriptorImpl]

'standardTypes' @ [94:65] ==> value-parameter standardTypes: Set<Type> defined in org.jetbrains.idl2k.dynamicIfUnknownType.<anonymous>[ValueParameterDescriptorImpl]

'arguments' @ [94:93] ==> public final val arguments: List<GenerateAttribute> defined in org.jetbrains.idl2k.GenerateFunction[PropertyDescriptorImpl]

'map' @ [94:103] ==> public inline fun <T, R> Iterable<GenerateAttribute>.map(transform: (GenerateAttribute) -> GenerateAttribute): List<GenerateAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerateAttribute
    <R> -> GenerateAttribute

'it' @ [94:109] ==> value-parameter it: GenerateAttribute defined in org.jetbrains.idl2k.dynamicIfUnknownType.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'dynamicIfUnknownType' @ [94:112] ==> public fun GenerateAttribute.dynamicIfUnknownType(allTypes: Set<String>, standardTypes: Set<Type> = ...): GenerateAttribute defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'allTypes' @ [94:133] ==> value-parameter allTypes: Set<String> defined in org.jetbrains.idl2k.dynamicIfUnknownType[ValueParameterDescriptorImpl]

'standardTypes' @ [94:143] ==> value-parameter standardTypes: Set<Type> defined in org.jetbrains.idl2k.dynamicIfUnknownType.<anonymous>[ValueParameterDescriptorImpl]

'extendedAttributes' @ [97:64] ==> public final val extendedAttributes: List<ExtendedAttribute> defined in org.jetbrains.idl2k.InterfaceDefinition[PropertyDescriptorImpl]

'filter' @ [97:83] ==> public inline fun <T> Iterable<ExtendedAttribute>.filter(predicate: (ExtendedAttribute) -> Boolean): List<ExtendedAttribute> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtendedAttribute

'it' @ [97:92] ==> value-parameter it: ExtendedAttribute defined in org.jetbrains.idl2k.findExtendedAttributes.<anonymous>[ValueParameterDescriptorImpl]

'call' @ [97:95] ==> public final val call: String defined in org.jetbrains.idl2k.ExtendedAttribute[PropertyDescriptorImpl]

'name' @ [97:103] ==> value-parameter name: String defined in org.jetbrains.idl2k.findExtendedAttributes[ValueParameterDescriptorImpl]

'this' @ [98:63] ==> <this> defined in org.jetbrains.idl2k.hasExtendedAttribute[ReceiverParameterDescriptorImpl]

'findExtendedAttributes' @ [98:69] ==> public fun InterfaceDefinition.findExtendedAttributes(name: String): List<ExtendedAttribute> defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

'name' @ [98:92] ==> value-parameter name: String defined in org.jetbrains.idl2k.hasExtendedAttribute[ValueParameterDescriptorImpl]

'isNotEmpty' @ [98:99] ==> @InlineOnly public inline fun <T> Collection<ExtendedAttribute>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtendedAttribute

'findExtendedAttributes' @ [99:46] ==> public fun InterfaceDefinition.findExtendedAttributes(name: String): List<ExtendedAttribute> defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]

