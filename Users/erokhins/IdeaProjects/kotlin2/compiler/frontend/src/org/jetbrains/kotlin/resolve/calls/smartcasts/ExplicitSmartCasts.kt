'if (call == this.call) type else null' @ [31:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType?, elseBranch: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType?

'call' @ [31:42] ==> value-parameter call: Call? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SingleSmartCast.type[ValueParameterDescriptorImpl]

'this' @ [31:50] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SingleSmartCast[LazyClassReceiverParameterDescriptor]

'call' @ [31:55] ==> public final val call: Call? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SingleSmartCast[PropertyDescriptorImpl]

'type' @ [31:61] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SingleSmartCast[PropertyDescriptorImpl]

'type' @ [33:50] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SingleSmartCast[PropertyDescriptorImpl]

'if (this == smartCast) this
            else MultipleSmartCasts(mapOf(call to type, smartCast.call to smartCast.type))' @ [36:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ExplicitSmartCasts, elseBranch: ExplicitSmartCasts): ExplicitSmartCasts[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ExplicitSmartCasts

'this' @ [36:17] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SingleSmartCast[LazyClassReceiverParameterDescriptor]

'smartCast' @ [36:25] ==> value-parameter smartCast: SingleSmartCast defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SingleSmartCast.plus[ValueParameterDescriptorImpl]

'this' @ [36:36] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SingleSmartCast[LazyClassReceiverParameterDescriptor]

'MultipleSmartCasts' @ [37:18] ==> internal constructor MultipleSmartCasts(map: Map<Call?, KotlinType>) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.MultipleSmartCasts[ClassConstructorDescriptorImpl]

'mapOf' @ [37:37] ==> public fun <K, V> mapOf(vararg pairs: Pair<Call?, KotlinType>): Map<Call?, KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Call?
    <V> -> KotlinType

'call' @ [37:43] ==> public final val call: Call? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SingleSmartCast[PropertyDescriptorImpl]

'type' @ [37:51] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SingleSmartCast[PropertyDescriptorImpl]

'smartCast' @ [37:57] ==> value-parameter smartCast: SingleSmartCast defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SingleSmartCast.plus[ValueParameterDescriptorImpl]

'call' @ [37:67] ==> public final val call: Call? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SingleSmartCast[PropertyDescriptorImpl]

'smartCast' @ [37:75] ==> value-parameter smartCast: SingleSmartCast defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SingleSmartCast.plus[ValueParameterDescriptorImpl]

'type' @ [37:85] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SingleSmartCast[PropertyDescriptorImpl]

'map' @ [41:38] ==> public final val map: Map<Call?, KotlinType> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.MultipleSmartCasts[PropertyDescriptorImpl]

'call' @ [41:42] ==> value-parameter call: Call? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.MultipleSmartCasts.type[ValueParameterDescriptorImpl]

'MultipleSmartCasts' @ [45:53] ==> internal constructor MultipleSmartCasts(map: Map<Call?, KotlinType>) defined in org.jetbrains.kotlin.resolve.calls.smartcasts.MultipleSmartCasts[ClassConstructorDescriptorImpl]

'map' @ [45:72] ==> public final val map: Map<Call?, KotlinType> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.MultipleSmartCasts[PropertyDescriptorImpl]

'mapOf' @ [45:78] ==> public fun <K, V> mapOf(pair: Pair<Call?, KotlinType>): Map<Call?, KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Call?
    <V> -> KotlinType

'smartCast' @ [45:84] ==> value-parameter smartCast: SingleSmartCast defined in org.jetbrains.kotlin.resolve.calls.smartcasts.MultipleSmartCasts.plus[ValueParameterDescriptorImpl]

'call' @ [45:94] ==> public final val call: Call? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SingleSmartCast[PropertyDescriptorImpl]

'smartCast' @ [45:102] ==> value-parameter smartCast: SingleSmartCast defined in org.jetbrains.kotlin.resolve.calls.smartcasts.MultipleSmartCasts.plus[ValueParameterDescriptorImpl]

'type' @ [45:112] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SingleSmartCast[PropertyDescriptorImpl]

