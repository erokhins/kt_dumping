'receiverValue' @ [32:31] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'toString' @ [32:45] ==> public open fun toString(): String defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValue[DeserializedSimpleFunctionDescriptor]

'classValueReceiver' @ [44:17] ==> public abstract val classValueReceiver: ReceiverValue? defined in org.jetbrains.kotlin.resolve.scopes.receivers.QualifierReceiver[PropertyDescriptorImpl]

'let' @ [44:37] ==> @InlineOnly public inline fun <T, R> ReceiverValue.let(block: (ReceiverValue) -> ReceiverValueWithSmartCastInfo): ReceiverValueWithSmartCastInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverValue
    <R> -> ReceiverValueWithSmartCastInfo

'ReceiverValueWithSmartCastInfo' @ [44:43] ==> public constructor ReceiverValueWithSmartCastInfo(receiverValue: ReceiverValue, possibleTypes: Set<KotlinType>, isStable: Boolean) defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[ClassConstructorDescriptorImpl]

'it' @ [44:74] ==> value-parameter it: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.QualifierReceiver.<get-classValueReceiverWithSmartCastInfo>.<anonymous>[ValueParameterDescriptorImpl]

'emptySet' @ [44:78] ==> public fun <T> emptySet(): Set<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'prepareArgumentTypeRegardingCaptureTypes' @ [48:28] ==> public fun prepareArgumentTypeRegardingCaptureTypes(argumentType: UnwrappedType): UnwrappedType? defined in org.jetbrains.kotlin.types.checker[DeserializedSimpleFunctionDescriptor]

'receiverValue' @ [48:69] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'type' @ [48:83] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'unwrap' @ [48:88] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'preparedBaseType' @ [49:9] ==> val preparedBaseType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.scopes.receivers.prepareReceiverRegardingCaptureTypes[LocalVariableDescriptor]

'possibleTypes' @ [49:37] ==> public final val possibleTypes: Set<KotlinType> defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'isEmpty' @ [49:51] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'this' @ [49:69] ==> <this> defined in org.jetbrains.kotlin.resolve.scopes.receivers.prepareReceiverRegardingCaptureTypes[ReceiverParameterDescriptorImpl]

'possibleTypes' @ [51:28] ==> public final val possibleTypes: Set<KotlinType> defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'mapTo' @ [51:42] ==> public inline fun <T, R, C : MutableCollection<in KotlinType>> Iterable<KotlinType>.mapTo(destination: HashSet<KotlinType> /* = HashSet<KotlinType> */, transform: (KotlinType) -> KotlinType): HashSet<KotlinType> /* = HashSet<KotlinType> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> KotlinType
    <C : MutableCollection<in R>> -> HashSet<KotlinType>

'HashSet' @ [51:48] ==> public final fun <E> <init>(): HashSet<KotlinType> /* = HashSet<KotlinType> */ defined in kotlin.collections.HashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> KotlinType

'prepareArgumentTypeRegardingCaptureTypes' @ [51:73] ==> public fun prepareArgumentTypeRegardingCaptureTypes(argumentType: UnwrappedType): UnwrappedType? defined in org.jetbrains.kotlin.types.checker[DeserializedSimpleFunctionDescriptor]

'it' @ [51:114] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.resolve.scopes.receivers.prepareReceiverRegardingCaptureTypes.<anonymous>[ValueParameterDescriptorImpl]

'unwrap' @ [51:117] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'it' @ [51:130] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.resolve.scopes.receivers.prepareReceiverRegardingCaptureTypes.<anonymous>[ValueParameterDescriptorImpl]

'if (preparedBaseType != null) receiverValue.replaceType(preparedBaseType) else receiverValue' @ [52:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReceiverValue, elseBranch: ReceiverValue): ReceiverValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ReceiverValue

'preparedBaseType' @ [52:27] ==> val preparedBaseType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.scopes.receivers.prepareReceiverRegardingCaptureTypes[LocalVariableDescriptor]

'receiverValue' @ [52:53] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'replaceType' @ [52:67] ==> @NotNull public abstract fun replaceType(@NotNull p0: KotlinType): ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValue[JavaMethodDescriptor]

'preparedBaseType' @ [52:79] ==> val preparedBaseType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.scopes.receivers.prepareReceiverRegardingCaptureTypes[LocalVariableDescriptor]

'receiverValue' @ [52:102] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'ReceiverValueWithSmartCastInfo' @ [54:12] ==> public constructor ReceiverValueWithSmartCastInfo(receiverValue: ReceiverValue, possibleTypes: Set<KotlinType>, isStable: Boolean) defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[ClassConstructorDescriptorImpl]

'newReceiver' @ [54:43] ==> val newReceiver: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.prepareReceiverRegardingCaptureTypes[LocalVariableDescriptor]

'newPossibleTypes' @ [54:56] ==> val newPossibleTypes: HashSet<KotlinType> /* = HashSet<KotlinType> */ defined in org.jetbrains.kotlin.resolve.scopes.receivers.prepareReceiverRegardingCaptureTypes[LocalVariableDescriptor]

'isStable' @ [54:74] ==> public final val isStable: Boolean defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

