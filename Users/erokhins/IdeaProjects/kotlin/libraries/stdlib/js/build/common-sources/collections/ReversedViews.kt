'kotlin.jvm.JvmMultifileClass' @ [16:1] ==> public constructor JvmMultifileClass() defined in kotlin.jvm.JvmMultifileClass[ClassConstructorDescriptorImpl]

'kotlin.jvm.JvmName' @ [17:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[ClassConstructorDescriptorImpl]

'AbstractList<T>' @ [22:81] ==> protected constructor AbstractList<out E>() defined in kotlin.collections.AbstractList[ClassConstructorDescriptorImpl]
Inferred types:
    <out E> -> T

'delegate' @ [23:36] ==> private final val delegate: List<T> defined in kotlin.collections.ReversedListReadOnly[PropertyDescriptorImpl]

'size' @ [23:45] ==> public abstract val size: Int defined in kotlin.collections.List[PropertyDescriptorImpl]

'delegate' @ [24:39] ==> private final val delegate: List<T> defined in kotlin.collections.ReversedListReadOnly[PropertyDescriptorImpl]

'reverseElementIndex' @ [24:48] ==> private fun List<*>.reverseElementIndex(index: Int): Int defined in kotlin.collections in file ReversedViews.kt[SimpleFunctionDescriptorImpl]

'index' @ [24:68] ==> value-parameter index: Int defined in kotlin.collections.ReversedListReadOnly.get[ValueParameterDescriptorImpl]

'AbstractMutableList<T>' @ [27:71] ==> protected constructor AbstractMutableList<E>() defined in kotlin.collections.AbstractMutableList[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> T

'delegate' @ [28:36] ==> private final val delegate: MutableList<T> defined in kotlin.collections.ReversedList[PropertyDescriptorImpl]

'size' @ [28:45] ==> public abstract val size: Int defined in kotlin.collections.MutableList[PropertyDescriptorImpl]

'delegate' @ [29:39] ==> private final val delegate: MutableList<T> defined in kotlin.collections.ReversedList[PropertyDescriptorImpl]

'reverseElementIndex' @ [29:48] ==> private fun List<*>.reverseElementIndex(index: Int): Int defined in kotlin.collections in file ReversedViews.kt[SimpleFunctionDescriptorImpl]

'index' @ [29:68] ==> value-parameter index: Int defined in kotlin.collections.ReversedList.get[ValueParameterDescriptorImpl]

'delegate' @ [31:28] ==> private final val delegate: MutableList<T> defined in kotlin.collections.ReversedList[PropertyDescriptorImpl]

'clear' @ [31:37] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[SimpleFunctionDescriptorImpl]

'delegate' @ [32:44] ==> private final val delegate: MutableList<T> defined in kotlin.collections.ReversedList[PropertyDescriptorImpl]

'removeAt' @ [32:53] ==> public abstract fun removeAt(index: Int): T defined in kotlin.collections.MutableList[SimpleFunctionDescriptorImpl]

'reverseElementIndex' @ [32:62] ==> private fun List<*>.reverseElementIndex(index: Int): Int defined in kotlin.collections in file ReversedViews.kt[SimpleFunctionDescriptorImpl]

'index' @ [32:82] ==> value-parameter index: Int defined in kotlin.collections.ReversedList.removeAt[ValueParameterDescriptorImpl]

'delegate' @ [34:51] ==> private final val delegate: MutableList<T> defined in kotlin.collections.ReversedList[PropertyDescriptorImpl]

'set' @ [34:60] ==> public abstract operator fun set(index: Int, element: T): T defined in kotlin.collections.MutableList[SimpleFunctionDescriptorImpl]

'reverseElementIndex' @ [34:64] ==> private fun List<*>.reverseElementIndex(index: Int): Int defined in kotlin.collections in file ReversedViews.kt[SimpleFunctionDescriptorImpl]

'index' @ [34:84] ==> value-parameter index: Int defined in kotlin.collections.ReversedList.set[ValueParameterDescriptorImpl]

'element' @ [34:92] ==> value-parameter element: T defined in kotlin.collections.ReversedList.set[ValueParameterDescriptorImpl]

'delegate' @ [36:9] ==> private final val delegate: MutableList<T> defined in kotlin.collections.ReversedList[PropertyDescriptorImpl]

'add' @ [36:18] ==> public abstract fun add(index: Int, element: T): Unit defined in kotlin.collections.MutableList[SimpleFunctionDescriptorImpl]

'reversePositionIndex' @ [36:22] ==> private fun List<*>.reversePositionIndex(index: Int): Int defined in kotlin.collections in file ReversedViews.kt[SimpleFunctionDescriptorImpl]

'index' @ [36:43] ==> value-parameter index: Int defined in kotlin.collections.ReversedList.add[ValueParameterDescriptorImpl]

'element' @ [36:51] ==> value-parameter element: T defined in kotlin.collections.ReversedList.add[ValueParameterDescriptorImpl]

'if (index in 0..lastIndex) lastIndex - index else throw IndexOutOfBoundsException("Element index $index must be in range [${0..lastIndex}].")' @ [40:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'index' @ [40:13] ==> value-parameter index: Int defined in kotlin.collections.reverseElementIndex[ValueParameterDescriptorImpl]

'..' @ [40:22] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'lastIndex' @ [40:25] ==> public val <T> List<Any?>.lastIndex: Int defined in kotlin.collections[PropertyDescriptorImpl]
Inferred types:
    <T> -> Any?

'lastIndex' @ [40:36] ==> public val <T> List<Any?>.lastIndex: Int defined in kotlin.collections[PropertyDescriptorImpl]
Inferred types:
    <T> -> Any?

'index' @ [40:48] ==> value-parameter index: Int defined in kotlin.collections.reverseElementIndex[ValueParameterDescriptorImpl]

'IndexOutOfBoundsException' @ [40:65] ==> public constructor IndexOutOfBoundsException(message: String? = ...) defined in kotlin.IndexOutOfBoundsException[ClassConstructorDescriptorImpl]

'index' @ [40:107] ==> value-parameter index: Int defined in kotlin.collections.reverseElementIndex[ValueParameterDescriptorImpl]

'..' @ [40:133] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'lastIndex' @ [40:136] ==> public val <T> List<Any?>.lastIndex: Int defined in kotlin.collections[PropertyDescriptorImpl]
Inferred types:
    <T> -> Any?

'if (index in 0..size) size - index else throw IndexOutOfBoundsException("Position index $index must be in range [${0..size}].")' @ [43:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'index' @ [43:13] ==> value-parameter index: Int defined in kotlin.collections.reversePositionIndex[ValueParameterDescriptorImpl]

'..' @ [43:22] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'size' @ [43:25] ==> public abstract val size: Int defined in kotlin.collections.List[PropertyDescriptorImpl]

'size' @ [43:31] ==> public abstract val size: Int defined in kotlin.collections.List[PropertyDescriptorImpl]

'index' @ [43:38] ==> value-parameter index: Int defined in kotlin.collections.reversePositionIndex[ValueParameterDescriptorImpl]

'IndexOutOfBoundsException' @ [43:55] ==> public constructor IndexOutOfBoundsException(message: String? = ...) defined in kotlin.IndexOutOfBoundsException[ClassConstructorDescriptorImpl]

'index' @ [43:98] ==> value-parameter index: Int defined in kotlin.collections.reversePositionIndex[ValueParameterDescriptorImpl]

'..' @ [43:124] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'size' @ [43:127] ==> public abstract val size: Int defined in kotlin.collections.List[PropertyDescriptorImpl]

'ReversedListReadOnly' @ [50:48] ==> public constructor ReversedListReadOnly<out T>(delegate: List<T>) defined in kotlin.collections.ReversedListReadOnly[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'this' @ [50:69] ==> <this> defined in kotlin.collections.asReversed[ReceiverParameterDescriptorImpl]

'kotlin.jvm.JvmName' @ [56:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[ClassConstructorDescriptorImpl]

'ReversedList' @ [57:62] ==> public constructor ReversedList<T>(delegate: MutableList<T>) defined in kotlin.collections.ReversedList[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'this' @ [57:75] ==> <this> defined in kotlin.collections.asReversed[ReceiverParameterDescriptorImpl]

