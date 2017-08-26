'substitute' @ [29:62] ==> private final fun substitute(type: UnwrappedType, keepAnnotation: Boolean, runCapturedChecks: Boolean): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[SimpleFunctionDescriptorImpl]

'type' @ [29:73] ==> value-parameter type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.safeSubstitute[ValueParameterDescriptorImpl]

'type' @ [29:132] ==> value-parameter type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.safeSubstitute[ValueParameterDescriptorImpl]

'substitute' @ [32:13] ==> private final fun substitute(type: UnwrappedType, keepAnnotation: Boolean, runCapturedChecks: Boolean): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[SimpleFunctionDescriptorImpl]

'type' @ [32:24] ==> value-parameter type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteKeepAnnotations[ValueParameterDescriptorImpl]

'type' @ [32:82] ==> value-parameter type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteKeepAnnotations[ValueParameterDescriptorImpl]

'when (type) {
                is SimpleType -> substitute(type, keepAnnotation, runCapturedChecks)
                is FlexibleType -> if (type is DynamicType || type is RawType) {
                    null
                }
                else {
                    val lowerBound = substitute(type.lowerBound, keepAnnotation, runCapturedChecks)
                    val upperBound = substitute(type.upperBound, keepAnnotation, runCapturedChecks)
                    if (lowerBound == null && upperBound == null) {
                        null
                    }
                    else {
                        // todo discuss lowerIfFlexible and upperIfFlexible
                        KotlinTypeFactory.flexibleType(lowerBound?.lowerIfFlexible() ?: type.lowerBound, upperBound?.upperIfFlexible() ?: type.upperBound)
                    }
                }
            }' @ [35:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UnwrappedType?, entry1: UnwrappedType?): UnwrappedType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UnwrappedType?

'type' @ [35:19] ==> value-parameter type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'substitute' @ [36:34] ==> private final fun substitute(type: SimpleType, keepAnnotation: Boolean, runCapturedChecks: Boolean): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[SimpleFunctionDescriptorImpl]

'type' @ [36:45] ==> value-parameter type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'keepAnnotation' @ [36:51] ==> value-parameter keepAnnotation: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'runCapturedChecks' @ [36:67] ==> value-parameter runCapturedChecks: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'if (type is DynamicType || type is RawType) {
                    null
                }
                else {
                    val lowerBound = substitute(type.lowerBound, keepAnnotation, runCapturedChecks)
                    val upperBound = substitute(type.upperBound, keepAnnotation, runCapturedChecks)
                    if (lowerBound == null && upperBound == null) {
                        null
                    }
                    else {
                        // todo discuss lowerIfFlexible and upperIfFlexible
                        KotlinTypeFactory.flexibleType(lowerBound?.lowerIfFlexible() ?: type.lowerBound, upperBound?.upperIfFlexible() ?: type.upperBound)
                    }
                }' @ [37:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UnwrappedType?, elseBranch: UnwrappedType?): UnwrappedType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UnwrappedType?

'type' @ [37:40] ==> value-parameter type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'type' @ [37:63] ==> value-parameter type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'substitute' @ [41:38] ==> private final fun substitute(type: SimpleType, keepAnnotation: Boolean, runCapturedChecks: Boolean): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[SimpleFunctionDescriptorImpl]

'type' @ [41:49] ==> value-parameter type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'lowerBound' @ [41:54] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'keepAnnotation' @ [41:66] ==> value-parameter keepAnnotation: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'runCapturedChecks' @ [41:82] ==> value-parameter runCapturedChecks: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'substitute' @ [42:38] ==> private final fun substitute(type: SimpleType, keepAnnotation: Boolean, runCapturedChecks: Boolean): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[SimpleFunctionDescriptorImpl]

'type' @ [42:49] ==> value-parameter type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'upperBound' @ [42:54] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'keepAnnotation' @ [42:66] ==> value-parameter keepAnnotation: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'runCapturedChecks' @ [42:82] ==> value-parameter runCapturedChecks: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'if (lowerBound == null && upperBound == null) {
                        null
                    }
                    else {
                        // todo discuss lowerIfFlexible and upperIfFlexible
                        KotlinTypeFactory.flexibleType(lowerBound?.lowerIfFlexible() ?: type.lowerBound, upperBound?.upperIfFlexible() ?: type.upperBound)
                    }' @ [43:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UnwrappedType?, elseBranch: UnwrappedType?): UnwrappedType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UnwrappedType?

'lowerBound' @ [43:25] ==> val lowerBound: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'upperBound' @ [43:47] ==> val upperBound: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'flexibleType' @ [48:43] ==> @JvmStatic public final fun flexibleType(lowerBound: SimpleType, upperBound: SimpleType): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'lowerBound' @ [48:56] ==> val lowerBound: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'lowerIfFlexible' @ [48:68] ==> public fun KotlinType.lowerIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'type' @ [48:89] ==> value-parameter type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'lowerBound' @ [48:94] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'upperBound' @ [48:106] ==> val upperBound: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'upperIfFlexible' @ [48:118] ==> public fun KotlinType.upperIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'type' @ [48:139] ==> value-parameter type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'upperBound' @ [48:144] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'type' @ [54:13] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'isError' @ [54:18] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'type' @ [56:13] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'substitute' @ [57:43] ==> private final fun substitute(type: SimpleType, keepAnnotation: Boolean, runCapturedChecks: Boolean): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[SimpleFunctionDescriptorImpl]

'type' @ [57:54] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'expandedType' @ [57:59] ==> public final val expandedType: SimpleType defined in org.jetbrains.kotlin.types.AbbreviatedType[DeserializedPropertyDescriptor]

'keepAnnotation' @ [57:73] ==> value-parameter keepAnnotation: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'runCapturedChecks' @ [57:89] ==> value-parameter runCapturedChecks: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'substitute' @ [58:43] ==> private final fun substitute(type: SimpleType, keepAnnotation: Boolean, runCapturedChecks: Boolean): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[SimpleFunctionDescriptorImpl]

'type' @ [58:54] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'abbreviation' @ [58:59] ==> public final val abbreviation: SimpleType defined in org.jetbrains.kotlin.types.AbbreviatedType[DeserializedPropertyDescriptor]

'keepAnnotation' @ [58:73] ==> value-parameter keepAnnotation: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'runCapturedChecks' @ [58:89] ==> value-parameter runCapturedChecks: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'if (substitutedExpandedType is SimpleType? && substitutedAbbreviation is SimpleType?) {
                return AbbreviatedType(substitutedExpandedType ?: type.expandedType,
                                       substitutedAbbreviation ?: type.abbreviation)
            }
            else {
                return substitutedExpandedType
            }' @ [59:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'substitutedExpandedType' @ [59:17] ==> val substitutedExpandedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'substitutedAbbreviation' @ [59:59] ==> val substitutedAbbreviation: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'AbbreviatedType' @ [60:24] ==> public constructor AbbreviatedType(delegate: SimpleType, abbreviation: SimpleType) defined in org.jetbrains.kotlin.types.AbbreviatedType[DeserializedClassConstructorDescriptor]

'substitutedExpandedType' @ [60:40] ==> val substitutedExpandedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'type' @ [60:67] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'expandedType' @ [60:72] ==> public final val expandedType: SimpleType defined in org.jetbrains.kotlin.types.AbbreviatedType[DeserializedPropertyDescriptor]

'substitutedAbbreviation' @ [61:40] ==> val substitutedAbbreviation: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'type' @ [61:67] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'abbreviation' @ [61:72] ==> public final val abbreviation: SimpleType defined in org.jetbrains.kotlin.types.AbbreviatedType[DeserializedPropertyDescriptor]

'substitutedExpandedType' @ [64:24] ==> val substitutedExpandedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'type' @ [68:13] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'arguments' @ [68:18] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'isNotEmpty' @ [68:28] ==> @InlineOnly public inline fun <T> Collection<TypeProjection>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'substituteParametrizedType' @ [69:20] ==> private final fun substituteParametrizedType(type: SimpleType, keepAnnotation: Boolean, runCapturedChecks: Boolean): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[SimpleFunctionDescriptorImpl]

'type' @ [69:47] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'keepAnnotation' @ [69:53] ==> value-parameter keepAnnotation: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'runCapturedChecks' @ [69:69] ==> value-parameter runCapturedChecks: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'type' @ [72:31] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'constructor' @ [72:36] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'typeConstructor' @ [74:13] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'!' @ [75:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'runCapturedChecks' @ [75:18] ==> value-parameter runCapturedChecks: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'assert' @ [77:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'type' @ [77:20] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'+' @ [78:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'typeConstructor' @ [78:91] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'type' @ [79:31] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'java' @ [79:43] ==> public val <T> KClass<out SimpleType>.java: Class<out SimpleType> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out SimpleType)

'canonicalName' @ [79:48] ==> public final val <T : (Any..Any?)> Class<out SimpleType>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out SimpleType)

'type' @ [79:83] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'type' @ [81:26] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'lowerType' @ [81:51] ==> public final val lowerType: UnwrappedType? defined in org.jetbrains.kotlin.types.checker.NewCapturedType[DeserializedPropertyDescriptor]

'let' @ [81:62] ==> @InlineOnly public inline fun <T, R> UnwrappedType.let(block: (UnwrappedType) -> UnwrappedType?): UnwrappedType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType
    <R> -> UnwrappedType?

'substitute' @ [81:68] ==> private final fun substitute(type: UnwrappedType, keepAnnotation: Boolean, runCapturedChecks: Boolean): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[SimpleFunctionDescriptorImpl]

'it' @ [81:79] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute.<anonymous>[ValueParameterDescriptorImpl]

'keepAnnotation' @ [81:83] ==> value-parameter keepAnnotation: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'lower' @ [82:17] ==> val lower: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'IllegalStateException' @ [82:38] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [82:60] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'this' @ [82:88] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[LazyClassReceiverParameterDescriptor]

'type' @ [83:89] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'lower' @ [83:149] ==> val lower: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'type' @ [84:85] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'lowerType' @ [84:90] ==> public final val lowerType: UnwrappedType? defined in org.jetbrains.kotlin.types.checker.NewCapturedType[DeserializedPropertyDescriptor]

'type' @ [86:13] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'constructor' @ [86:18] ==> public open val constructor: NewCapturedTypeConstructor defined in org.jetbrains.kotlin.types.checker.NewCapturedType[DeserializedPropertyDescriptor]

'supertypes' @ [86:30] ==> public final val NewCapturedTypeConstructor.supertypes: List<UnwrappedType>[MyPropertyDescriptor]

'forEach' @ [86:41] ==> @HidesMembers public inline fun <T> Iterable<UnwrappedType>.forEach(action: (UnwrappedType) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType

'substitute' @ [87:17] ==> private final fun substitute(type: UnwrappedType, keepAnnotation: Boolean, runCapturedChecks: Boolean): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[SimpleFunctionDescriptorImpl]

'supertype' @ [87:28] ==> value-parameter supertype: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute.<anonymous>[ValueParameterDescriptorImpl]

'keepAnnotation' @ [87:39] ==> value-parameter keepAnnotation: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'let' @ [87:83] ==> @InlineOnly public inline fun <T, R> UnwrappedType.let(block: (UnwrappedType) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType
    <R> -> Nothing

'IllegalStateException' @ [88:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [88:49] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'this' @ [88:77] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[LazyClassReceiverParameterDescriptor]

'type' @ [89:78] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'supertype' @ [89:137] ==> value-parameter supertype: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute.<anonymous>[ValueParameterDescriptorImpl]

'supertype' @ [90:72] ==> value-parameter supertype: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute.<anonymous>[ValueParameterDescriptorImpl]

'typeConstructor' @ [97:13] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'typeConstructor' @ [99:28] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'supertypes' @ [99:44] ==> public final val IntersectionTypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'map' @ [99:55] ==> public inline fun <T, R> Iterable<(KotlinType..KotlinType?)>.map(transform: ((KotlinType..KotlinType?)) -> UnwrappedType): List<UnwrappedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> UnwrappedType

'substitute' @ [100:17] ==> private final fun substitute(type: UnwrappedType, keepAnnotation: Boolean, runCapturedChecks: Boolean): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[SimpleFunctionDescriptorImpl]

'it' @ [100:28] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute.<anonymous>[ValueParameterDescriptorImpl]

'unwrap' @ [100:31] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'keepAnnotation' @ [100:41] ==> value-parameter keepAnnotation: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'runCapturedChecks' @ [100:57] ==> value-parameter runCapturedChecks: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'apply' @ [100:77] ==> @InlineOnly public inline fun <T> UnwrappedType.apply(block: UnwrappedType.() -> Unit): UnwrappedType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType

'thereIsChanges' @ [100:85] ==> var thereIsChanges: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'it' @ [100:112] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute.<anonymous>[ValueParameterDescriptorImpl]

'unwrap' @ [100:115] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'!' @ [102:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'thereIsChanges' @ [102:18] ==> var thereIsChanges: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'intersectTypes' @ [103:20] ==> public fun intersectTypes(types: List<UnwrappedType>): UnwrappedType defined in org.jetbrains.kotlin.types.checker[DeserializedSimpleFunctionDescriptor]

'newTypes' @ [103:35] ==> val newTypes: List<UnwrappedType> defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'let' @ [103:45] ==> @InlineOnly public inline fun <T, R> UnwrappedType.let(block: (UnwrappedType) -> UnwrappedType?): UnwrappedType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType
    <R> -> UnwrappedType?

'if (type.isMarkedNullable) it.makeNullableAsSpecified(true) else it' @ [103:51] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UnwrappedType?, elseBranch: UnwrappedType?): UnwrappedType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UnwrappedType?

'type' @ [103:55] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'isMarkedNullable' @ [103:60] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'it' @ [103:78] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute.<anonymous>[ValueParameterDescriptorImpl]

'makeNullableAsSpecified' @ [103:81] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): UnwrappedType defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedSimpleFunctionDescriptor]

'it' @ [103:116] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute.<anonymous>[ValueParameterDescriptorImpl]

'substituteNotNullTypeWithConstructor' @ [107:27] ==> public abstract fun substituteNotNullTypeWithConstructor(constructor: TypeConstructor): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[SimpleFunctionDescriptorImpl]

'typeConstructor' @ [107:64] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'keepAnnotation' @ [108:13] ==> value-parameter keepAnnotation: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'replacement' @ [109:13] ==> var replacement: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'replacement' @ [109:27] ==> var replacement: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'replaceAnnotations' @ [109:39] ==> public abstract fun replaceAnnotations(newAnnotations: Annotations): UnwrappedType defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedSimpleFunctionDescriptor]

'type' @ [109:58] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'annotations' @ [109:63] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'type' @ [111:13] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[ValueParameterDescriptorImpl]

'isMarkedNullable' @ [111:18] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'replacement' @ [112:13] ==> var replacement: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'replacement' @ [112:27] ==> var replacement: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'makeNullableAsSpecified' @ [112:39] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): UnwrappedType defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedSimpleFunctionDescriptor]

'replacement' @ [115:16] ==> var replacement: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substitute[LocalVariableDescriptor]

'type' @ [123:26] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[ValueParameterDescriptorImpl]

'constructor' @ [123:31] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'parameters' @ [123:43] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'type' @ [124:25] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[ValueParameterDescriptorImpl]

'arguments' @ [124:30] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'parameters' @ [125:13] ==> val parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[LocalVariableDescriptor]

'size' @ [125:24] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'arguments' @ [125:32] ==> val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[LocalVariableDescriptor]

'size' @ [125:42] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'createErrorType' @ [127:31] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'type' @ [127:68] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[ValueParameterDescriptorImpl]

'parameters' @ [127:94] ==> val parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[LocalVariableDescriptor]

'size' @ [127:105] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'arguments' @ [127:131] ==> val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[LocalVariableDescriptor]

'size' @ [127:141] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'arrayOfNulls' @ [129:28] ==> public fun <reified @PureReifiable T> arrayOfNulls(size: Int): Array<TypeProjection?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> TypeProjection?

'arguments' @ [129:58] ==> val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[LocalVariableDescriptor]

'size' @ [129:68] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'arguments' @ [131:23] ==> val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[LocalVariableDescriptor]

'indices' @ [131:33] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'arguments' @ [132:28] ==> val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[LocalVariableDescriptor]

'index' @ [132:38] ==> val index: Int defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[LocalVariableDescriptor]

'argument' @ [134:17] ==> val argument: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[LocalVariableDescriptor]

'isStarProjection' @ [134:26] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'substitute' @ [135:43] ==> private final fun substitute(type: UnwrappedType, keepAnnotation: Boolean, runCapturedChecks: Boolean): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[SimpleFunctionDescriptorImpl]

'argument' @ [135:54] ==> val argument: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[LocalVariableDescriptor]

'type' @ [135:63] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'unwrap' @ [135:68] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'keepAnnotation' @ [135:78] ==> value-parameter keepAnnotation: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[ValueParameterDescriptorImpl]

'runCapturedChecks' @ [135:94] ==> value-parameter runCapturedChecks: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[ValueParameterDescriptorImpl]

'newArguments' @ [137:13] ==> val newArguments: Array<TypeProjection?> defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[LocalVariableDescriptor]

'index' @ [137:26] ==> val index: Int defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[LocalVariableDescriptor]

'TypeProjectionImpl' @ [137:35] ==> public constructor TypeProjectionImpl(@NotNull p0: Variance, @NotNull p1: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'argument' @ [137:54] ==> val argument: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[LocalVariableDescriptor]

'projectionKind' @ [137:63] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'substitutedArgumentType' @ [137:79] ==> val substitutedArgumentType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[LocalVariableDescriptor]

'newArguments' @ [140:13] ==> val newArguments: Array<TypeProjection?> defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[LocalVariableDescriptor]

'all' @ [140:26] ==> public inline fun <T> Array<out TypeProjection?>.all(predicate: (TypeProjection?) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection?

'it' @ [140:32] ==> value-parameter it: TypeProjection? defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType.<anonymous>[ValueParameterDescriptorImpl]

'arguments' @ [142:32] ==> val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[LocalVariableDescriptor]

'mapIndexed' @ [142:42] ==> public inline fun <T, R> Iterable<TypeProjection>.mapIndexed(transform: (index: Int, TypeProjection) -> TypeProjection): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> TypeProjection

'newArguments' @ [142:77] ==> val newArguments: Array<TypeProjection?> defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[LocalVariableDescriptor]

'index' @ [142:90] ==> value-parameter index: Int defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType.<anonymous>[ValueParameterDescriptorImpl]

'oldArgument' @ [142:100] ==> value-parameter oldArgument: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [143:16] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[ValueParameterDescriptorImpl]

'replace' @ [143:21] ==> @JvmOverloads public fun SimpleType.replace(newArguments: List<TypeProjection> = ..., newAnnotations: Annotations = ...): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'newArgumentsList' @ [143:29] ==> val newArgumentsList: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor.substituteParametrizedType[LocalVariableDescriptor]

'map' @ [148:103] ==> public final val map: Map<TypeConstructor, UnwrappedType> defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutorByConstructorMap[PropertyDescriptorImpl]

'constructor' @ [148:107] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutorByConstructorMap.substituteNotNullTypeWithConstructor[ValueParameterDescriptorImpl]

'?:' @ [153:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Int?, right: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Int

'constructor' @ [153:30] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.FreshVariableNewTypeSubstitutor.substituteNotNullTypeWithConstructor[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [153:42] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'index' @ [153:94] ==> public final val TypeParameterDescriptor.index: Int[MyPropertyDescriptor]

'freshVariables' @ [154:28] ==> public final val freshVariables: List<TypeVariableFromCallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.components.FreshVariableNewTypeSubstitutor[PropertyDescriptorImpl]

'getOrNull' @ [154:43] ==> public fun <T> List<TypeVariableFromCallableDescriptor>.getOrNull(index: Int): TypeVariableFromCallableDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeVariableFromCallableDescriptor

'indexProposal' @ [154:53] ==> val indexProposal: Int defined in org.jetbrains.kotlin.resolve.calls.inference.components.FreshVariableNewTypeSubstitutor.substituteNotNullTypeWithConstructor[LocalVariableDescriptor]

'typeVariable' @ [155:13] ==> val typeVariable: TypeVariableFromCallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.components.FreshVariableNewTypeSubstitutor.substituteNotNullTypeWithConstructor[LocalVariableDescriptor]

'originalTypeParameter' @ [155:26] ==> public final val originalTypeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.model.TypeVariableFromCallableDescriptor[PropertyDescriptorImpl]

'typeConstructor' @ [155:48] ==> public final val TypeParameterDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'constructor' @ [155:67] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.components.FreshVariableNewTypeSubstitutor.substituteNotNullTypeWithConstructor[ValueParameterDescriptorImpl]

'typeVariable' @ [157:16] ==> val typeVariable: TypeVariableFromCallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.components.FreshVariableNewTypeSubstitutor.substituteNotNullTypeWithConstructor[LocalVariableDescriptor]

'defaultType' @ [157:29] ==> public final val defaultType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.model.TypeVariableFromCallableDescriptor[PropertyDescriptorImpl]

'FreshVariableNewTypeSubstitutor' @ [161:21] ==> public constructor FreshVariableNewTypeSubstitutor(freshVariables: List<TypeVariableFromCallableDescriptor>) defined in org.jetbrains.kotlin.resolve.calls.inference.components.FreshVariableNewTypeSubstitutor[ClassConstructorDescriptorImpl]

'emptyList' @ [161:53] ==> public fun <T> emptyList(): List<TypeVariableFromCallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeVariableFromCallableDescriptor

