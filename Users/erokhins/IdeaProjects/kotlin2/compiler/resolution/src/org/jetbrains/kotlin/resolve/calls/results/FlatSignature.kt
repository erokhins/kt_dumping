'typeParameters' @ [51:21] ==> public final val typeParameters: Collection<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[PropertyDescriptorImpl]

'isNotEmpty' @ [51:36] ==> @InlineOnly public inline fun <T> Collection<TypeParameterDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'FlatSignature' @ [60:20] ==> private constructor FlatSignature<out T>(origin: T, typeParameters: Collection<TypeParameterDescriptor>, valueParameterTypes: List<KotlinType?>, hasExtensionReceiver: Boolean, hasVarargs: Boolean, numDefaults: Int, isHeader: Boolean, isSyntheticMember: Boolean) defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'origin' @ [60:34] ==> value-parameter origin: T defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createFromReflectionType[ValueParameterDescriptorImpl]

'descriptor' @ [61:34] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createFromReflectionType[ValueParameterDescriptorImpl]

'typeParameters' @ [61:45] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'reflectionType' @ [62:34] ==> value-parameter reflectionType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createFromReflectionType[ValueParameterDescriptorImpl]

'arguments' @ [62:49] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedPropertyDescriptor]

'map' @ [62:59] ==> public inline fun <T, R> Iterable<TypeProjection>.map(transform: (TypeProjection) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> KotlinType

'it' @ [62:65] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createFromReflectionType.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [62:68] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'descriptor' @ [64:47] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createFromReflectionType[ValueParameterDescriptorImpl]

'valueParameters' @ [64:58] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'any' @ [64:74] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.any(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [64:80] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createFromReflectionType.<anonymous>[ValueParameterDescriptorImpl]

'varargElementType' @ [64:83] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'numDefaults' @ [65:48] ==> value-parameter numDefaults: Int defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createFromReflectionType[ValueParameterDescriptorImpl]

'descriptor' @ [66:45] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createFromReflectionType[ValueParameterDescriptorImpl]

'descriptor' @ [66:79] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createFromReflectionType[ValueParameterDescriptorImpl]

'isHeader' @ [66:90] ==> public final val MemberDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'descriptor' @ [67:54] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createFromReflectionType[ValueParameterDescriptorImpl]

'descriptor' @ [77:41] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.create[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [77:52] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [77:80] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'FlatSignature' @ [79:20] ==> private constructor FlatSignature<out T>(origin: T, typeParameters: Collection<TypeParameterDescriptor>, valueParameterTypes: List<KotlinType?>, hasExtensionReceiver: Boolean, hasVarargs: Boolean, numDefaults: Int, isHeader: Boolean, isSyntheticMember: Boolean) defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'origin' @ [79:34] ==> value-parameter origin: T defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.create[ValueParameterDescriptorImpl]

'descriptor' @ [80:34] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.create[ValueParameterDescriptorImpl]

'typeParameters' @ [80:45] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'listOfNotNull' @ [82:34] ==> public fun <T : Any> listOfNotNull(element: KotlinType?): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KotlinType

'extensionReceiverType' @ [82:48] ==> val extensionReceiverType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.create[LocalVariableDescriptor]

'parameterTypes' @ [82:73] ==> value-parameter parameterTypes: List<KotlinType?> defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.create[ValueParameterDescriptorImpl]

'extensionReceiverType' @ [83:57] ==> val extensionReceiverType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.create[LocalVariableDescriptor]

'descriptor' @ [84:47] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.create[ValueParameterDescriptorImpl]

'valueParameters' @ [84:58] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'any' @ [84:74] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.any(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [84:80] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'varargElementType' @ [84:83] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'numDefaults' @ [85:48] ==> value-parameter numDefaults: Int defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.create[ValueParameterDescriptorImpl]

'descriptor' @ [86:45] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.create[ValueParameterDescriptorImpl]

'descriptor' @ [86:79] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.create[ValueParameterDescriptorImpl]

'isHeader' @ [86:90] ==> public final val MemberDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'descriptor' @ [87:54] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.create[ValueParameterDescriptorImpl]

'create' @ [94:17] ==> public final fun <T> create(origin: D, descriptor: CallableDescriptor, numDefaults: Int, parameterTypes: List<KotlinType?>): FlatSignature<D> defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> D

'descriptor' @ [94:24] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createFromCallableDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [94:36] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createFromCallableDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [94:82] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createFromCallableDescriptor[ValueParameterDescriptorImpl]

'valueParameters' @ [94:93] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [94:109] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> KotlinType

'it' @ [94:115] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createFromCallableDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'argumentValueType' @ [94:118] ==> public final val ValueParameterDescriptor.argumentValueType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion[PropertyDescriptorImpl]

'FlatSignature' @ [97:17] ==> private constructor FlatSignature<out T>(origin: D, typeParameters: Collection<TypeParameterDescriptor>, valueParameterTypes: List<KotlinType?>, hasExtensionReceiver: Boolean, hasVarargs: Boolean, numDefaults: Int, isHeader: Boolean, isSyntheticMember: Boolean) defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> D

'descriptor' @ [97:31] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createForPossiblyShadowedExtension[ValueParameterDescriptorImpl]

'descriptor' @ [98:31] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createForPossiblyShadowedExtension[ValueParameterDescriptorImpl]

'typeParameters' @ [98:42] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'descriptor' @ [99:53] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createForPossiblyShadowedExtension[ValueParameterDescriptorImpl]

'valueParameters' @ [99:64] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'map' @ [99:80] ==> public inline fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.map(transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> KotlinType

'it' @ [99:86] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createForPossiblyShadowedExtension.<anonymous>[ValueParameterDescriptorImpl]

'argumentValueType' @ [99:89] ==> public final val ValueParameterDescriptor.argumentValueType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion[PropertyDescriptorImpl]

'descriptor' @ [101:44] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createForPossiblyShadowedExtension[ValueParameterDescriptorImpl]

'valueParameters' @ [101:55] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'any' @ [101:71] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.any(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [101:77] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createForPossiblyShadowedExtension.<anonymous>[ValueParameterDescriptorImpl]

'varargElementType' @ [101:80] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'descriptor' @ [102:45] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createForPossiblyShadowedExtension[ValueParameterDescriptorImpl]

'valueParameters' @ [102:56] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'count' @ [102:72] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.count(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [102:80] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createForPossiblyShadowedExtension.<anonymous>[ValueParameterDescriptorImpl]

'hasDefaultValue' @ [102:83] ==> public fun ValueParameterDescriptor.hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [103:42] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createForPossiblyShadowedExtension[ValueParameterDescriptorImpl]

'descriptor' @ [103:76] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createForPossiblyShadowedExtension[ValueParameterDescriptorImpl]

'isHeader' @ [103:87] ==> public final val MemberDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'descriptor' @ [104:51] ==> value-parameter descriptor: D defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion.createForPossiblyShadowedExtension[ValueParameterDescriptorImpl]

'varargElementType' @ [107:64] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'type' @ [107:85] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'specific' @ [127:9] ==> value-parameter specific: FlatSignature<T> defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[ValueParameterDescriptorImpl]

'hasExtensionReceiver' @ [127:18] ==> public final val hasExtensionReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[PropertyDescriptorImpl]

'general' @ [127:42] ==> value-parameter general: FlatSignature<T> defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[ValueParameterDescriptorImpl]

'hasExtensionReceiver' @ [127:50] ==> public final val hasExtensionReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[PropertyDescriptorImpl]

'specific' @ [128:9] ==> value-parameter specific: FlatSignature<T> defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[ValueParameterDescriptorImpl]

'valueParameterTypes' @ [128:18] ==> public final val valueParameterTypes: List<KotlinType?> defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[PropertyDescriptorImpl]

'size' @ [128:38] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'general' @ [128:46] ==> value-parameter general: FlatSignature<T> defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[ValueParameterDescriptorImpl]

'valueParameterTypes' @ [128:54] ==> public final val valueParameterTypes: List<KotlinType?> defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[PropertyDescriptorImpl]

'size' @ [128:74] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'general' @ [130:26] ==> value-parameter general: FlatSignature<T> defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[ValueParameterDescriptorImpl]

'typeParameters' @ [130:34] ==> public final val typeParameters: Collection<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[PropertyDescriptorImpl]

'registerTypeVariables' @ [131:27] ==> public abstract fun registerTypeVariables(typeParameters: Collection<TypeParameterDescriptor>): TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.results.SimpleConstraintSystem[SimpleFunctionDescriptorImpl]

'typeParameters' @ [131:49] ==> val typeParameters: Collection<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[LocalVariableDescriptor]

'component1' @ [133:11] ==> public final operator fun component1(): KotlinType? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [133:25] ==> public final operator fun component2(): KotlinType? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'specific' @ [133:41] ==> value-parameter specific: FlatSignature<T> defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[ValueParameterDescriptorImpl]

'valueParameterTypes' @ [133:50] ==> public final val valueParameterTypes: List<KotlinType?> defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[PropertyDescriptorImpl]

'zip' @ [133:70] ==> public infix fun <T, R> Iterable<KotlinType?>.zip(other: Iterable<KotlinType?>): List<Pair<KotlinType?, KotlinType?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType?
    <R> -> KotlinType?

'general' @ [133:74] ==> value-parameter general: FlatSignature<T> defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[ValueParameterDescriptorImpl]

'valueParameterTypes' @ [133:82] ==> public final val valueParameterTypes: List<KotlinType?> defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[PropertyDescriptorImpl]

'specificType' @ [134:13] ==> val specificType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[LocalVariableDescriptor]

'generalType' @ [134:37] ==> val generalType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[LocalVariableDescriptor]

'specificityComparator' @ [136:13] ==> value-parameter specificityComparator: TypeSpecificityComparator defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[ValueParameterDescriptorImpl]

'isDefinitelyLessSpecific' @ [136:35] ==> public abstract fun isDefinitelyLessSpecific(specific: KotlinType, general: KotlinType): Boolean defined in org.jetbrains.kotlin.resolve.calls.results.TypeSpecificityComparator[SimpleFunctionDescriptorImpl]

'specificType' @ [136:60] ==> val specificType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[LocalVariableDescriptor]

'generalType' @ [136:74] ==> val generalType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[LocalVariableDescriptor]

'if (typeParameters.isEmpty() || !TypeUtils.dependsOnTypeParameters(generalType, typeParameters)) {
            if (!KotlinTypeChecker.DEFAULT.isSubtypeOf(specificType, generalType)) {
                if (!callbacks.isNonSubtypeNotLessSpecific(specificType, generalType)) {
                    return false
                }
            }
        }
        else {
            val substitutedGeneralType = typeSubstitutor.safeSubstitute(generalType, Variance.INVARIANT)

            /**
             * Example:
             * fun <X> Array<out X>.sort(): Unit {}
             * fun <Y: Comparable<Y>> Array<out Y>.sort(): Unit {}
             * Here, when we try solve this CS(Y is variables) then Array<out X> <: Array<out Y> and this system impossible to solve,
             * so we capture types from receiver and value parameters.
             */
            val specificCapturedType = specificType.unwrap().let { if (captureFromArgument) captureFromExpression(it) ?: it else it }
            addSubtypeConstraint(specificCapturedType, substitutedGeneralType.unwrap())
        }' @ [140:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'typeParameters' @ [140:13] ==> val typeParameters: Collection<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[LocalVariableDescriptor]

'isEmpty' @ [140:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'!' @ [140:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dependsOnTypeParameters' @ [140:52] ==> public open fun dependsOnTypeParameters(@NotNull p0: KotlinType, @NotNull p1: (MutableCollection<(TypeParameterDescriptor..TypeParameterDescriptor?)>..Collection<(TypeParameterDescriptor..TypeParameterDescriptor?)>)): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'generalType' @ [140:76] ==> val generalType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[LocalVariableDescriptor]

'typeParameters' @ [140:89] ==> val typeParameters: Collection<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[LocalVariableDescriptor]

'!' @ [141:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [141:36] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [141:44] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'specificType' @ [141:56] ==> val specificType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[LocalVariableDescriptor]

'generalType' @ [141:70] ==> val generalType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[LocalVariableDescriptor]

'!' @ [142:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'callbacks' @ [142:22] ==> value-parameter callbacks: SpecificityComparisonCallbacks defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[ValueParameterDescriptorImpl]

'isNonSubtypeNotLessSpecific' @ [142:32] ==> public abstract fun isNonSubtypeNotLessSpecific(specific: KotlinType, general: KotlinType): Boolean defined in org.jetbrains.kotlin.resolve.calls.results.SpecificityComparisonCallbacks[SimpleFunctionDescriptorImpl]

'specificType' @ [142:60] ==> val specificType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[LocalVariableDescriptor]

'generalType' @ [142:74] ==> val generalType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[LocalVariableDescriptor]

'typeSubstitutor' @ [148:42] ==> val typeSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[LocalVariableDescriptor]

'safeSubstitute' @ [148:58] ==> @NotNull public open fun safeSubstitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'generalType' @ [148:73] ==> val generalType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[LocalVariableDescriptor]

'INVARIANT' @ [148:95] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'specificType' @ [157:40] ==> val specificType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[LocalVariableDescriptor]

'unwrap' @ [157:53] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'let' @ [157:62] ==> @InlineOnly public inline fun <T, R> UnwrappedType.let(block: (UnwrappedType) -> UnwrappedType): UnwrappedType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType
    <R> -> UnwrappedType

'if (captureFromArgument) captureFromExpression(it) ?: it else it' @ [157:68] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UnwrappedType, elseBranch: UnwrappedType): UnwrappedType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UnwrappedType

'captureFromArgument' @ [157:72] ==> public open val captureFromArgument: Boolean defined in org.jetbrains.kotlin.resolve.calls.results.SimpleConstraintSystem[PropertyDescriptorImpl]

'captureFromExpression' @ [157:93] ==> public fun captureFromExpression(type: UnwrappedType): UnwrappedType? defined in org.jetbrains.kotlin.types.checker[DeserializedSimpleFunctionDescriptor]

'it' @ [157:115] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [157:122] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [157:130] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific.<anonymous>[ValueParameterDescriptorImpl]

'addSubtypeConstraint' @ [158:13] ==> public abstract fun addSubtypeConstraint(subType: UnwrappedType, superType: UnwrappedType): Unit defined in org.jetbrains.kotlin.resolve.calls.results.SimpleConstraintSystem[SimpleFunctionDescriptorImpl]

'specificCapturedType' @ [158:34] ==> val specificCapturedType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[LocalVariableDescriptor]

'substitutedGeneralType' @ [158:56] ==> val substitutedGeneralType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.results.isSignatureNotLessSpecific[LocalVariableDescriptor]

'unwrap' @ [158:79] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'!' @ [162:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasContradiction' @ [162:13] ==> public abstract fun hasContradiction(): Boolean defined in org.jetbrains.kotlin.resolve.calls.results.SimpleConstraintSystem[SimpleFunctionDescriptorImpl]

