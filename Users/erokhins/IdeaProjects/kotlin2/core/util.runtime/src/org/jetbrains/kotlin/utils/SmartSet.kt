'Suppress' @ [27:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'AbstractSet<T>' @ [28:43] ==> protected/*protected and package*/ constructor AbstractSet<E : (Any..Any?)>() defined in java.util.AbstractSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> T

'JvmStatic' @ [32:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'SmartSet' @ [33:28] ==> private constructor SmartSet<T>() defined in org.jetbrains.kotlin.utils.SmartSet[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'JvmStatic' @ [35:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'SmartSet' @ [36:46] ==> private constructor SmartSet<T>() defined in org.jetbrains.kotlin.utils.SmartSet[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'apply' @ [36:60] ==> @InlineOnly public inline fun <T> SmartSet<T>.apply(block: SmartSet<T>.() -> Unit): SmartSet<T> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartSet<T>

'this' @ [36:68] ==> <this> defined in org.jetbrains.kotlin.utils.SmartSet.Companion.create.<anonymous>[ReceiverParameterDescriptorImpl]

'addAll' @ [36:73] ==> public open fun addAll(elements: Collection<(T..T?)>): Boolean defined in org.jetbrains.kotlin.utils.SmartSet[JavaMethodDescriptor]

'set' @ [36:80] ==> value-parameter set: Collection<T> defined in org.jetbrains.kotlin.utils.SmartSet.Companion.create[ValueParameterDescriptorImpl]

'when {
            size == 0 -> Collections.emptySet<T>().iterator()
            size == 1 -> SingletonIterator(data as T)
            size < ARRAY_THRESHOLD -> ArrayIterator(data as Array<T>)
            else -> (data as MutableSet<T>).iterator()
        }' @ [44:51] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: MutableIterator<T>, entry1: MutableIterator<T>, entry2: MutableIterator<T>, entry3: MutableIterator<T>): MutableIterator<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> MutableIterator<T>

'size' @ [45:13] ==> public open var size: Int defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'emptySet' @ [45:38] ==> public final fun <T : (Any..Any?)> emptySet(): (MutableSet<(T..T?)>..Set<(T..T?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'iterator' @ [45:52] ==> public abstract fun iterator(): MutableIterator<(T..T?)> defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'size' @ [46:13] ==> public open var size: Int defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'SingletonIterator' @ [46:26] ==> public constructor SingletonIterator<out T>(element: T) defined in org.jetbrains.kotlin.utils.SmartSet.SingletonIterator[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'data' @ [46:44] ==> private final var data: Any? defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'size' @ [47:13] ==> public open var size: Int defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'ARRAY_THRESHOLD' @ [47:20] ==> private final val ARRAY_THRESHOLD: Int defined in org.jetbrains.kotlin.utils.SmartSet.Companion[PropertyDescriptorImpl]

'ArrayIterator' @ [47:39] ==> public constructor ArrayIterator<out T>(array: Array<T>) defined in org.jetbrains.kotlin.utils.SmartSet.ArrayIterator[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'data' @ [47:53] ==> private final var data: Any? defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'data' @ [48:22] ==> private final var data: Any? defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'iterator' @ [48:45] ==> public abstract fun iterator(): MutableIterator<T> defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'when {
            size == 0 -> {
                data = element
            }
            size == 1 -> {
                if (data == element) return false
                data = arrayOf(data, element)
            }
            size < ARRAY_THRESHOLD -> {
                val arr = data as Array<T>
                if (element in arr) return false
                data = if (size == ARRAY_THRESHOLD - 1) linkedSetOf(*arr).apply { add(element) }
                else Arrays.copyOf(arr, size + 1).apply { set(size - 1, element) }
            }
            else -> {
                val set = data as MutableSet<T>
                if (!set.add(element)) return false
            }
        }' @ [52:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'size' @ [53:13] ==> public open var size: Int defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'data' @ [54:17] ==> private final var data: Any? defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'element' @ [54:24] ==> value-parameter element: T defined in org.jetbrains.kotlin.utils.SmartSet.add[ValueParameterDescriptorImpl]

'size' @ [56:13] ==> public open var size: Int defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'data' @ [57:21] ==> private final var data: Any? defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'element' @ [57:29] ==> value-parameter element: T defined in org.jetbrains.kotlin.utils.SmartSet.add[ValueParameterDescriptorImpl]

'data' @ [58:17] ==> private final var data: Any? defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'arrayOf' @ [58:24] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Any?): Array<Any?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Any?

'data' @ [58:32] ==> private final var data: Any? defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'element' @ [58:38] ==> value-parameter element: T defined in org.jetbrains.kotlin.utils.SmartSet.add[ValueParameterDescriptorImpl]

'size' @ [60:13] ==> public open var size: Int defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'ARRAY_THRESHOLD' @ [60:20] ==> private final val ARRAY_THRESHOLD: Int defined in org.jetbrains.kotlin.utils.SmartSet.Companion[PropertyDescriptorImpl]

'data' @ [61:27] ==> private final var data: Any? defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'element' @ [62:21] ==> value-parameter element: T defined in org.jetbrains.kotlin.utils.SmartSet.add[ValueParameterDescriptorImpl]

'arr' @ [62:32] ==> val arr: Array<T> defined in org.jetbrains.kotlin.utils.SmartSet.add[LocalVariableDescriptor]

'data' @ [63:17] ==> private final var data: Any? defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'if (size == ARRAY_THRESHOLD - 1) linkedSetOf(*arr).apply { add(element) }
                else Arrays.copyOf(arr, size + 1).apply { set(size - 1, element) }' @ [63:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'size' @ [63:28] ==> public open var size: Int defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'ARRAY_THRESHOLD' @ [63:36] ==> private final val ARRAY_THRESHOLD: Int defined in org.jetbrains.kotlin.utils.SmartSet.Companion[PropertyDescriptorImpl]

'linkedSetOf' @ [63:57] ==> public fun <T> linkedSetOf(vararg elements: T): LinkedHashSet<T> /* = LinkedHashSet<T> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'arr' @ [63:70] ==> val arr: Array<T> defined in org.jetbrains.kotlin.utils.SmartSet.add[LocalVariableDescriptor]

'apply' @ [63:75] ==> @InlineOnly public inline fun <T> LinkedHashSet<T> /* = LinkedHashSet<T> */.apply(block: LinkedHashSet<T> /* = LinkedHashSet<T> */.() -> Unit): LinkedHashSet<T> /* = LinkedHashSet<T> */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LinkedHashSet<T>

'add' @ [63:83] ==> public open fun add(element: T): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'element' @ [63:87] ==> value-parameter element: T defined in org.jetbrains.kotlin.utils.SmartSet.add[ValueParameterDescriptorImpl]

'copyOf' @ [64:29] ==> public open fun <T : (Any..Any?)> copyOf(p0: (Array<(T..T?)>..Array<out (T..T?)>?), p1: Int): (Array<(T..T?)>..Array<out (T..T?)>?) defined in java.util.Arrays[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (T..T?)

'arr' @ [64:36] ==> val arr: Array<T> defined in org.jetbrains.kotlin.utils.SmartSet.add[LocalVariableDescriptor]

'size' @ [64:41] ==> public open var size: Int defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'apply' @ [64:51] ==> @InlineOnly public inline fun <T> (Array<(T..T?)>..Array<out (T..T?)>?).apply(block: (Array<(T..T?)>..Array<out (T..T?)>?).() -> Unit): (Array<(T..T?)>..Array<out (T..T?)>?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Array<(T..T?)>..kotlin.Array<out (T..T?)>?)

'set' @ [64:59] ==> public final operator fun set(index: Int, value: (T..T?)): Unit defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'size' @ [64:63] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'element' @ [64:73] ==> value-parameter element: T defined in org.jetbrains.kotlin.utils.SmartSet.add[ValueParameterDescriptorImpl]

'data' @ [67:27] ==> private final var data: Any? defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'!' @ [68:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'set' @ [68:22] ==> val set: MutableSet<T> defined in org.jetbrains.kotlin.utils.SmartSet.add[LocalVariableDescriptor]

'add' @ [68:26] ==> public abstract fun add(element: T): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'element' @ [68:30] ==> value-parameter element: T defined in org.jetbrains.kotlin.utils.SmartSet.add[ValueParameterDescriptorImpl]

'size' @ [72:9] ==> public open var size: Int defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'data' @ [77:9] ==> private final var data: Any? defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'size' @ [78:9] ==> public open var size: Int defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'when {
        size == 0 -> false
        size == 1 -> data == element
        size < ARRAY_THRESHOLD -> element in data as Array<T>
        else -> element in data as Set<T>
    }' @ [81:50] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'size' @ [82:9] ==> public open var size: Int defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'size' @ [83:9] ==> public open var size: Int defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'data' @ [83:22] ==> private final var data: Any? defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'element' @ [83:30] ==> value-parameter element: T defined in org.jetbrains.kotlin.utils.SmartSet.contains[ValueParameterDescriptorImpl]

'size' @ [84:9] ==> public open var size: Int defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'ARRAY_THRESHOLD' @ [84:16] ==> private final val ARRAY_THRESHOLD: Int defined in org.jetbrains.kotlin.utils.SmartSet.Companion[PropertyDescriptorImpl]

'element' @ [84:35] ==> value-parameter element: T defined in org.jetbrains.kotlin.utils.SmartSet.contains[ValueParameterDescriptorImpl]

'data' @ [84:46] ==> private final var data: Any? defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'element' @ [85:17] ==> value-parameter element: T defined in org.jetbrains.kotlin.utils.SmartSet.contains[ValueParameterDescriptorImpl]

'data' @ [85:28] ==> private final var data: Any? defined in org.jetbrains.kotlin.utils.SmartSet[PropertyDescriptorImpl]

'if (hasNext) {
                    hasNext = false
                    element
                }
                else throw NoSuchElementException()' @ [92:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T, elseBranch: T): T[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T

'hasNext' @ [92:21] ==> private final var hasNext: Boolean defined in org.jetbrains.kotlin.utils.SmartSet.SingletonIterator[PropertyDescriptorImpl]

'hasNext' @ [93:21] ==> private final var hasNext: Boolean defined in org.jetbrains.kotlin.utils.SmartSet.SingletonIterator[PropertyDescriptorImpl]

'element' @ [94:21] ==> private final val element: T defined in org.jetbrains.kotlin.utils.SmartSet.SingletonIterator[PropertyDescriptorImpl]

'NoSuchElementException' @ [96:28] ==> public constructor NoSuchElementException() defined in java.util.NoSuchElementException[JavaClassConstructorDescriptor]

'hasNext' @ [98:34] ==> private final var hasNext: Boolean defined in org.jetbrains.kotlin.utils.SmartSet.SingletonIterator[PropertyDescriptorImpl]

'UnsupportedOperationException' @ [100:39] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'array' @ [104:37] ==> value-parameter array: Array<T> defined in org.jetbrains.kotlin.utils.SmartSet.ArrayIterator.<init>[ValueParameterDescriptorImpl]

'iterator' @ [104:43] ==> public final operator fun iterator(): Iterator<T> defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'arrayIterator' @ [106:43] ==> private final val arrayIterator: Iterator<T> defined in org.jetbrains.kotlin.utils.SmartSet.ArrayIterator[PropertyDescriptorImpl]

'hasNext' @ [106:57] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'arrayIterator' @ [107:34] ==> private final val arrayIterator: Iterator<T> defined in org.jetbrains.kotlin.utils.SmartSet.ArrayIterator[PropertyDescriptorImpl]

'next' @ [107:48] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'UnsupportedOperationException' @ [108:39] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

