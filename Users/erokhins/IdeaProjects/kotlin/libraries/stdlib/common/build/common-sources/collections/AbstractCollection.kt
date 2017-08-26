'SinceKotlin' @ [23:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'UnsafeVariance' @ [28:36] ==> public constructor UnsafeVariance() defined in kotlin.UnsafeVariance[DeserializedClassConstructorDescriptor]

'any' @ [28:66] ==> public header inline fun <T> Iterable<E>.any(predicate: (E) -> Boolean): Boolean defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> E

'it' @ [28:72] ==> value-parameter it: E defined in kotlin.collections.AbstractCollection.contains.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [28:78] ==> value-parameter element: @UnsafeVariance E defined in kotlin.collections.AbstractCollection.contains[ValueParameterDescriptorImpl]

'UnsafeVariance' @ [30:51] ==> public constructor UnsafeVariance() defined in kotlin.UnsafeVariance[DeserializedClassConstructorDescriptor]

'elements' @ [31:13] ==> value-parameter elements: Collection<@UnsafeVariance E> defined in kotlin.collections.AbstractCollection.containsAll[ValueParameterDescriptorImpl]

'all' @ [31:22] ==> public header inline fun <T> Iterable<@UnsafeVariance E>.all(predicate: (@UnsafeVariance E) -> Boolean): Boolean defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> [@kotlin.UnsafeVariance] E

'contains' @ [31:28] ==> public open fun contains(element: @UnsafeVariance E): Boolean defined in kotlin.collections.AbstractCollection[SimpleFunctionDescriptorImpl]

'it' @ [31:37] ==> value-parameter it: @UnsafeVariance E defined in kotlin.collections.AbstractCollection.containsAll.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [33:39] ==> public abstract val size: Int defined in kotlin.collections.AbstractCollection[PropertyDescriptorImpl]

'joinToString' @ [35:39] ==> public fun <T> Iterable<E>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((E) -> CharSequence)? = ...): String defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> E

'if (it === this) "(this Collection)" else it.toString()' @ [36:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CharSequence, elseBranch: CharSequence): CharSequence[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CharSequence

'it' @ [36:13] ==> value-parameter it: E defined in kotlin.collections.AbstractCollection.toString.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [36:20] ==> <this> defined in kotlin.collections.AbstractCollection[LazyClassReceiverParameterDescriptor]

'it' @ [36:51] ==> value-parameter it: E defined in kotlin.collections.AbstractCollection.toString.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [36:54] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'copyToArrayImpl' @ [42:49] ==> internal header fun copyToArrayImpl(collection: Collection<*>): Array<Any?> defined in kotlin.collections in file CollectionsH.kt[SimpleFunctionDescriptorImpl]

'this' @ [42:65] ==> <this> defined in kotlin.collections.AbstractCollection[LazyClassReceiverParameterDescriptor]

'copyToArrayImpl' @ [48:65] ==> internal header fun <T> copyToArrayImpl(collection: Collection<*>, array: Array<T>): Array<T> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'this' @ [48:81] ==> <this> defined in kotlin.collections.AbstractCollection[LazyClassReceiverParameterDescriptor]

'array' @ [48:87] ==> value-parameter array: Array<T> defined in kotlin.collections.AbstractCollection.toArray[ValueParameterDescriptorImpl]

