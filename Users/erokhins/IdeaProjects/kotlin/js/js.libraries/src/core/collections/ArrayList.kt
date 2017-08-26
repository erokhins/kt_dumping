'AbstractMutableList<E>' @ [26:87] ==> protected constructor AbstractMutableList<E>() defined in kotlin.collections.AbstractMutableList[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> E

'Suppress' @ [32:24] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'this' @ [32:75] ==> internal constructor ArrayList<E>(array: Array<Any?>) defined in kotlin.collections.ArrayList[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> E

'emptyArray' @ [32:80] ==> public inline fun <T> emptyArray(): Array<Any?> defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any?

'this' @ [36:51] ==> internal constructor ArrayList<E>(array: Array<Any?>) defined in kotlin.collections.ArrayList[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> E

'elements' @ [36:56] ==> value-parameter elements: Collection<E> defined in kotlin.collections.ArrayList.<init>[ValueParameterDescriptorImpl]

'toTypedArray' @ [36:65] ==> @InlineOnly public inline fun <T> Collection<Any?>.toTypedArray(): Array<Any?> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any?

'Suppress' @ [41:31] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'array' @ [43:36] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'size' @ [43:42] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'array' @ [44:39] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'rangeCheck' @ [44:45] ==> private final fun rangeCheck(index: Int): Int defined in kotlin.collections.ArrayList[SimpleFunctionDescriptorImpl]

'index' @ [44:56] ==> value-parameter index: Int defined in kotlin.collections.ArrayList.get[ValueParameterDescriptorImpl]

'rangeCheck' @ [46:9] ==> private final fun rangeCheck(index: Int): Int defined in kotlin.collections.ArrayList[SimpleFunctionDescriptorImpl]

'index' @ [46:20] ==> value-parameter index: Int defined in kotlin.collections.ArrayList.set[ValueParameterDescriptorImpl]

'array' @ [47:16] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'index' @ [47:22] ==> value-parameter index: Int defined in kotlin.collections.ArrayList.set[ValueParameterDescriptorImpl]

'apply' @ [47:29] ==> @InlineOnly public inline fun <T> Any?.apply(block: Any?.() -> Unit): Any? defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any?

'array' @ [47:37] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'index' @ [47:43] ==> value-parameter index: Int defined in kotlin.collections.ArrayList.set[ValueParameterDescriptorImpl]

'element' @ [47:52] ==> value-parameter element: E defined in kotlin.collections.ArrayList.set[ValueParameterDescriptorImpl]

'array' @ [51:9] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'asDynamic' @ [51:15] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'push' @ [51:27] ==> public final fun push(p0: dynamic): dynamic defined in kotlin.collections.ArrayList.add[SimpleFunctionDescriptorImpl]

'element' @ [51:32] ==> value-parameter element: E defined in kotlin.collections.ArrayList.add[ValueParameterDescriptorImpl]

'modCount' @ [52:9] ==> protected final var modCount: Int defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'array' @ [57:9] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'asDynamic' @ [57:15] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'splice' @ [57:27] ==> public final fun splice(p0: dynamic, p1: dynamic, p2: dynamic): dynamic defined in kotlin.collections.ArrayList.add[SimpleFunctionDescriptorImpl]

'insertionRangeCheck' @ [57:34] ==> private final fun insertionRangeCheck(index: Int): Int defined in kotlin.collections.ArrayList[SimpleFunctionDescriptorImpl]

'index' @ [57:54] ==> value-parameter index: Int defined in kotlin.collections.ArrayList.add[ValueParameterDescriptorImpl]

'element' @ [57:65] ==> value-parameter element: E defined in kotlin.collections.ArrayList.add[ValueParameterDescriptorImpl]

'modCount' @ [58:9] ==> protected final var modCount: Int defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'elements' @ [62:13] ==> value-parameter elements: Collection<E> defined in kotlin.collections.ArrayList.addAll[ValueParameterDescriptorImpl]

'isEmpty' @ [62:22] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[SimpleFunctionDescriptorImpl]

'array' @ [64:9] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'elements' @ [64:18] ==> value-parameter elements: Collection<E> defined in kotlin.collections.ArrayList.addAll[ValueParameterDescriptorImpl]

'toTypedArray' @ [64:27] ==> @InlineOnly public inline fun <T> Collection<Any?>.toTypedArray(): Array<Any?> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any?

'modCount' @ [65:9] ==> protected final var modCount: Int defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'insertionRangeCheck' @ [70:9] ==> private final fun insertionRangeCheck(index: Int): Int defined in kotlin.collections.ArrayList[SimpleFunctionDescriptorImpl]

'index' @ [70:29] ==> value-parameter index: Int defined in kotlin.collections.ArrayList.addAll[ValueParameterDescriptorImpl]

'index' @ [72:13] ==> value-parameter index: Int defined in kotlin.collections.ArrayList.addAll[ValueParameterDescriptorImpl]

'size' @ [72:22] ==> public open val size: Int defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'addAll' @ [72:35] ==> public open fun addAll(elements: Collection<E>): Boolean defined in kotlin.collections.ArrayList[SimpleFunctionDescriptorImpl]

'elements' @ [72:42] ==> value-parameter elements: Collection<E> defined in kotlin.collections.ArrayList.addAll[ValueParameterDescriptorImpl]

'elements' @ [73:13] ==> value-parameter elements: Collection<E> defined in kotlin.collections.ArrayList.addAll[ValueParameterDescriptorImpl]

'isEmpty' @ [73:22] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[SimpleFunctionDescriptorImpl]

'when (index) {
            size -> return addAll(elements)
            0 -> array = elements.toTypedArray<Any?>() + array
            else -> array = array.copyOfRange(0, index).asDynamic().concat(elements.toTypedArray<Any?>(), array.copyOfRange(index, size))
        }' @ [74:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'index' @ [74:15] ==> value-parameter index: Int defined in kotlin.collections.ArrayList.addAll[ValueParameterDescriptorImpl]

'size' @ [75:13] ==> public open val size: Int defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'addAll' @ [75:28] ==> public open fun addAll(elements: Collection<E>): Boolean defined in kotlin.collections.ArrayList[SimpleFunctionDescriptorImpl]

'elements' @ [75:35] ==> value-parameter elements: Collection<E> defined in kotlin.collections.ArrayList.addAll[ValueParameterDescriptorImpl]

'array' @ [76:18] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'elements' @ [76:26] ==> value-parameter elements: Collection<E> defined in kotlin.collections.ArrayList.addAll[ValueParameterDescriptorImpl]

'toTypedArray' @ [76:35] ==> @InlineOnly public inline fun <T> Collection<Any?>.toTypedArray(): Array<Any?> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any?

'array' @ [76:58] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'array' @ [77:21] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'array' @ [77:29] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'copyOfRange' @ [77:35] ==> @Suppress public inline fun <T> Array<out Any?>.copyOfRange(fromIndex: Int, toIndex: Int): Array<Any?> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any?

'index' @ [77:50] ==> value-parameter index: Int defined in kotlin.collections.ArrayList.addAll[ValueParameterDescriptorImpl]

'asDynamic' @ [77:57] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'concat' @ [77:69] ==> public final fun concat(p0: dynamic, p1: dynamic): dynamic defined in kotlin.collections.ArrayList.addAll[SimpleFunctionDescriptorImpl]

'elements' @ [77:76] ==> value-parameter elements: Collection<E> defined in kotlin.collections.ArrayList.addAll[ValueParameterDescriptorImpl]

'toTypedArray' @ [77:85] ==> @InlineOnly public inline fun <T> Collection<Any?>.toTypedArray(): Array<Any?> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any?

'array' @ [77:107] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'copyOfRange' @ [77:113] ==> @Suppress public inline fun <T> Array<out Any?>.copyOfRange(fromIndex: Int, toIndex: Int): Array<Any?> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any?

'index' @ [77:125] ==> value-parameter index: Int defined in kotlin.collections.ArrayList.addAll[ValueParameterDescriptorImpl]

'size' @ [77:132] ==> public open val size: Int defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'modCount' @ [80:9] ==> protected final var modCount: Int defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'rangeCheck' @ [85:9] ==> private final fun rangeCheck(index: Int): Int defined in kotlin.collections.ArrayList[SimpleFunctionDescriptorImpl]

'index' @ [85:20] ==> value-parameter index: Int defined in kotlin.collections.ArrayList.removeAt[ValueParameterDescriptorImpl]

'modCount' @ [86:9] ==> protected final var modCount: Int defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'if (index == lastIndex)
            array.asDynamic().pop()
        else
            array.asDynamic().splice(index, 1)[0]' @ [87:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: E, elseBranch: E): E[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> E

'index' @ [87:20] ==> value-parameter index: Int defined in kotlin.collections.ArrayList.removeAt[ValueParameterDescriptorImpl]

'lastIndex' @ [87:29] ==> public val <T> List<E>.lastIndex: Int defined in kotlin.collections[PropertyDescriptorImpl]
Inferred types:
    <T> -> E

'array' @ [88:13] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'asDynamic' @ [88:19] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'pop' @ [88:31] ==> public final fun pop(): dynamic defined in kotlin.collections.ArrayList.removeAt[SimpleFunctionDescriptorImpl]

'array' @ [90:13] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'asDynamic' @ [90:19] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'splice' @ [90:31] ==> public final fun splice(p0: dynamic, p1: dynamic): dynamic defined in kotlin.collections.ArrayList.removeAt[SimpleFunctionDescriptorImpl]

'index' @ [90:38] ==> value-parameter index: Int defined in kotlin.collections.ArrayList.removeAt[ValueParameterDescriptorImpl]

'array' @ [94:23] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'indices' @ [94:29] ==> public val <T> Array<out Any?>.indices: IntRange defined in kotlin.collections[PropertyDescriptorImpl]
Inferred types:
    <T> -> Any?

'array' @ [95:17] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'index' @ [95:23] ==> val index: Int defined in kotlin.collections.ArrayList.remove[LocalVariableDescriptor]

'element' @ [95:33] ==> value-parameter element: E defined in kotlin.collections.ArrayList.remove[ValueParameterDescriptorImpl]

'array' @ [96:17] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'asDynamic' @ [96:23] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'splice' @ [96:35] ==> public final fun splice(p0: dynamic, p1: dynamic): dynamic defined in kotlin.collections.ArrayList.remove[SimpleFunctionDescriptorImpl]

'index' @ [96:42] ==> val index: Int defined in kotlin.collections.ArrayList.remove[LocalVariableDescriptor]

'modCount' @ [97:17] ==> protected final var modCount: Int defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'modCount' @ [105:9] ==> protected final var modCount: Int defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'array' @ [106:9] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'asDynamic' @ [106:15] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'splice' @ [106:27] ==> public final fun splice(p0: dynamic, p1: dynamic): dynamic defined in kotlin.collections.ArrayList.removeRange[SimpleFunctionDescriptorImpl]

'fromIndex' @ [106:34] ==> value-parameter fromIndex: Int defined in kotlin.collections.ArrayList.removeRange[ValueParameterDescriptorImpl]

'toIndex' @ [106:45] ==> value-parameter toIndex: Int defined in kotlin.collections.ArrayList.removeRange[ValueParameterDescriptorImpl]

'fromIndex' @ [106:55] ==> value-parameter fromIndex: Int defined in kotlin.collections.ArrayList.removeRange[ValueParameterDescriptorImpl]

'array' @ [110:9] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'emptyArray' @ [110:17] ==> public inline fun <T> emptyArray(): Array<Any?> defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any?

'modCount' @ [111:9] ==> protected final var modCount: Int defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'array' @ [115:45] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'indexOf' @ [115:51] ==> public fun <@OnlyInputTypes T> Array<out Any?>.indexOf(element: Any?): Int defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <@OnlyInputTypes T> -> Any?

'element' @ [115:59] ==> value-parameter element: E defined in kotlin.collections.ArrayList.indexOf[ValueParameterDescriptorImpl]

'array' @ [117:49] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'lastIndexOf' @ [117:55] ==> public fun <@OnlyInputTypes T> Array<out Any?>.lastIndexOf(element: Any?): Int defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <@OnlyInputTypes T> -> Any?

'element' @ [117:67] ==> value-parameter element: E defined in kotlin.collections.ArrayList.lastIndexOf[ValueParameterDescriptorImpl]

'arrayToString' @ [119:31] ==> @library @Suppress internal fun arrayToString(array: Array<*>): String defined in kotlin.collections in file collections.kt[SimpleFunctionDescriptorImpl]

'array' @ [119:45] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'array' @ [120:43] ==> private final var array: Array<Any?> defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'copyOf' @ [120:49] ==> @Suppress public inline fun <T> Array<out Any?>.copyOf(): Array<Any?> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any?

'index' @ [123:42] ==> value-parameter index: Int defined in kotlin.collections.ArrayList.rangeCheck[ValueParameterDescriptorImpl]

'apply' @ [123:48] ==> @InlineOnly public inline fun <T> Int.apply(block: Int.() -> Unit): Int defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Int

'AbstractList' @ [124:9] ==> internal companion object defined in kotlin.collections.AbstractList[FakeCallableDescriptorForObject]

'checkElementIndex' @ [124:22] ==> internal final fun checkElementIndex(index: Int, size: Int): Unit defined in kotlin.collections.AbstractList.Companion[SimpleFunctionDescriptorImpl]

'index' @ [124:40] ==> value-parameter index: Int defined in kotlin.collections.ArrayList.rangeCheck[ValueParameterDescriptorImpl]

'size' @ [124:47] ==> public open val size: Int defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

'index' @ [127:51] ==> value-parameter index: Int defined in kotlin.collections.ArrayList.insertionRangeCheck[ValueParameterDescriptorImpl]

'apply' @ [127:57] ==> @InlineOnly public inline fun <T> Int.apply(block: Int.() -> Unit): Int defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Int

'AbstractList' @ [128:9] ==> internal companion object defined in kotlin.collections.AbstractList[FakeCallableDescriptorForObject]

'checkPositionIndex' @ [128:22] ==> internal final fun checkPositionIndex(index: Int, size: Int): Unit defined in kotlin.collections.AbstractList.Companion[SimpleFunctionDescriptorImpl]

'index' @ [128:41] ==> value-parameter index: Int defined in kotlin.collections.ArrayList.insertionRangeCheck[ValueParameterDescriptorImpl]

'size' @ [128:48] ==> public open val size: Int defined in kotlin.collections.ArrayList[PropertyDescriptorImpl]

