'AbstractList<T>' @ [27:62] ==> protected constructor AbstractList<out E>() defined in kotlin.collections.AbstractList[ClassConstructorDescriptorImpl]
Inferred types:
    <out E> -> T

'this@asList' @ [28:36] ==> <this> defined in org.w3c.dom.asList[ReceiverParameterDescriptorImpl]

'length' @ [28:48] ==> public abstract val length: Int defined in org.w3c.dom.ItemArrayLike[PropertyDescriptorImpl]

'when (index) {
        in 0..lastIndex -> this@asList.item(index).unsafeCast<T>()
        else -> throw IndexOutOfBoundsException("index $index is not in range [0..$lastIndex]")
    }' @ [30:39] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: T, entry1: T): T[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> T

'index' @ [30:45] ==> value-parameter index: Int defined in org.w3c.dom.asList.<no name provided>.get[ValueParameterDescriptorImpl]

'in' @ [31:9] ==> public open fun contains(value: Int): Boolean defined in kotlin.ranges.IntRange[DeserializedSimpleFunctionDescriptor]

'..' @ [31:12] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'lastIndex' @ [31:15] ==> public val <T> List<T>.lastIndex: Int defined in kotlin.collections[PropertyDescriptorImpl]
Inferred types:
    <T> -> T

'this@asList' @ [31:28] ==> <this> defined in org.w3c.dom.asList[ReceiverParameterDescriptorImpl]

'item' @ [31:40] ==> public abstract fun item(index: Int): T? defined in org.w3c.dom.ItemArrayLike[SimpleFunctionDescriptorImpl]

'index' @ [31:45] ==> value-parameter index: Int defined in org.w3c.dom.asList.<no name provided>.get[ValueParameterDescriptorImpl]

'unsafeCast' @ [31:52] ==> @InlineOnly public inline fun <T> Any?.unsafeCast(): T defined in kotlin.js[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'IndexOutOfBoundsException' @ [32:23] ==> public constructor IndexOutOfBoundsException(message: String? = ...) defined in kotlin.IndexOutOfBoundsException[ClassConstructorDescriptorImpl]

'index' @ [32:57] ==> value-parameter index: Int defined in org.w3c.dom.asList.<no name provided>.get[ValueParameterDescriptorImpl]

'lastIndex' @ [32:84] ==> public val <T> List<T>.lastIndex: Int defined in kotlin.collections[PropertyDescriptorImpl]
Inferred types:
    <T> -> T

