'Iterable' @ [23:52] ==> @InlineOnly public inline fun <T> Iterable(crossinline iterator: () -> Iterator<T>): Iterable<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'items' @ [23:63] ==> value-parameter vararg items: T defined in test.collections.iterableOf[ValueParameterDescriptorImpl]

'iterator' @ [23:69] ==> public final operator fun iterator(): Iterator<T> defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'Iterable' @ [24:49] ==> @InlineOnly public inline fun <T> Iterable(crossinline iterator: () -> Iterator<T>): Iterable<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'this' @ [24:60] ==> <this> defined in test.collections.toIterable[ReceiverParameterDescriptorImpl]

'iterator' @ [24:65] ==> public abstract operator fun iterator(): Iterator<T> defined in kotlin.collections.Iterable[DeserializedSimpleFunctionDescriptor]

'OrderedIterableTests<Iterable<String>>' @ [26:22] ==> public constructor OrderedIterableTests<T : Iterable<String>>(createFrom: (Array<out String>) -> Iterable<String>, empty: Iterable<String>) defined in test.collections.OrderedIterableTests[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Iterable<String>> -> Iterable<String>

'iterableOf' @ [26:63] ==> public fun <T> iterableOf(vararg items: String): Iterable<String> defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'it' @ [26:75] ==> value-parameter it: Array<out String> defined in test.collections.IterableTest.<init>.<anonymous>[ValueParameterDescriptorImpl]

'iterableOf' @ [26:82] ==> public fun <T> iterableOf(vararg items: String): Iterable<String> defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'IterableTests<Set<String>>' @ [27:17] ==> public constructor IterableTests<T : Iterable<String>>(createFrom: (Array<out String>) -> Set<String>, empty: Set<String>) defined in test.collections.IterableTests[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Iterable<String>> -> Set<String>

'setOf' @ [27:46] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [27:53] ==> value-parameter it: Array<out String> defined in test.collections.SetTest.<init>.<anonymous>[ValueParameterDescriptorImpl]

'setOf' @ [27:60] ==> @InlineOnly public inline fun <T> setOf(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'OrderedIterableTests<LinkedHashSet<String>>' @ [28:23] ==> public constructor OrderedIterableTests<T : Iterable<String>>(createFrom: (Array<out String>) -> LinkedHashSet<String> /* = LinkedHashSet<String> */, empty: LinkedHashSet<String> /* = LinkedHashSet<String> */) defined in test.collections.OrderedIterableTests[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Iterable<String>> -> LinkedHashSet<String>

'linkedSetOf' @ [28:69] ==> public fun <T> linkedSetOf(vararg elements: String): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [28:82] ==> value-parameter it: Array<out String> defined in test.collections.LinkedSetTest.<init>.<anonymous>[ValueParameterDescriptorImpl]

'linkedSetOf' @ [28:89] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'OrderedIterableTests<List<String>>' @ [29:18] ==> public constructor OrderedIterableTests<T : Iterable<String>>(createFrom: (Array<out String>) -> List<String>, empty: List<String>) defined in test.collections.OrderedIterableTests[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Iterable<String>> -> List<String>

'listOf' @ [29:56] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [29:64] ==> value-parameter it: Array<out String> defined in test.collections.ListTest.<init>.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [29:71] ==> @InlineOnly public inline fun <T> listOf(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'OrderedIterableTests<ArrayList<String>>' @ [30:23] ==> public constructor OrderedIterableTests<T : Iterable<String>>(createFrom: (Array<out String>) -> ArrayList<String> /* = ArrayList<String> */, empty: ArrayList<String> /* = ArrayList<String> */) defined in test.collections.OrderedIterableTests[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Iterable<String>> -> ArrayList<String>

'arrayListOf' @ [30:65] ==> public fun <T> arrayListOf(vararg elements: String): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [30:78] ==> value-parameter it: Array<out String> defined in test.collections.ArrayListTest.<init>.<anonymous>[ValueParameterDescriptorImpl]

'arrayListOf' @ [30:85] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'IterableTests<T>' @ [32:109] ==> public constructor IterableTests<T : Iterable<String>>(createFrom: (Array<out String>) -> T, empty: T) defined in test.collections.IterableTests[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Iterable<String>> -> T

'createFrom' @ [32:126] ==> value-parameter createFrom: (Array<out String>) -> T defined in test.collections.OrderedIterableTests.<init>[ValueParameterDescriptorImpl]

'empty' @ [32:138] ==> value-parameter empty: T defined in test.collections.OrderedIterableTests.<init>[ValueParameterDescriptorImpl]

'Test' @ [33:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [35:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'data' @ [35:21] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'indexOf' @ [35:26] ==> public fun <@OnlyInputTypes T> Iterable<String>.indexOf(element: String): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'expect' @ [36:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [36:16] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'empty' @ [36:22] ==> public final val empty: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'indexOf' @ [36:28] ==> public fun <@OnlyInputTypes T> Iterable<String>.indexOf(element: String): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'expect' @ [37:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'data' @ [37:21] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'indexOf' @ [37:26] ==> public fun <@OnlyInputTypes T> Iterable<String>.indexOf(element: String): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'expect' @ [38:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [38:16] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'data' @ [38:22] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'indexOf' @ [38:27] ==> public fun <@OnlyInputTypes T> Iterable<String>.indexOf(element: String): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'Test' @ [41:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [43:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'data' @ [43:21] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'lastIndexOf' @ [43:26] ==> public fun <@OnlyInputTypes T> Iterable<String>.lastIndexOf(element: String): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'expect' @ [44:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [44:16] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'empty' @ [44:22] ==> public final val empty: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'lastIndexOf' @ [44:28] ==> public fun <@OnlyInputTypes T> Iterable<String>.lastIndexOf(element: String): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'expect' @ [45:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'data' @ [45:21] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'lastIndexOf' @ [45:26] ==> public fun <@OnlyInputTypes T> Iterable<String>.lastIndexOf(element: String): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'expect' @ [46:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [46:16] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'data' @ [46:22] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'lastIndexOf' @ [46:27] ==> public fun <@OnlyInputTypes T> Iterable<String>.lastIndexOf(element: String): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'Test' @ [49:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [51:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [51:16] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'data' @ [51:22] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'indexOfFirst' @ [51:27] ==> public inline fun <T> Iterable<String>.indexOfFirst(predicate: (String) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [51:42] ==> value-parameter it: String defined in test.collections.OrderedIterableTests.indexOfFirst.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [51:45] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [52:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'data' @ [52:21] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'indexOfFirst' @ [52:26] ==> public inline fun <T> Iterable<String>.indexOfFirst(predicate: (String) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [52:41] ==> value-parameter it: String defined in test.collections.OrderedIterableTests.indexOfFirst.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [52:44] ==> public fun CharSequence.startsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [53:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [53:16] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'empty' @ [53:22] ==> public final val empty: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'indexOfFirst' @ [53:28] ==> public inline fun <T> Iterable<String>.indexOfFirst(predicate: (String) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [53:43] ==> value-parameter it: String defined in test.collections.OrderedIterableTests.indexOfFirst.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [53:46] ==> public fun CharSequence.startsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [56:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [58:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [58:16] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'data' @ [58:22] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'indexOfLast' @ [58:27] ==> public inline fun <T> Iterable<String>.indexOfLast(predicate: (String) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [58:41] ==> value-parameter it: String defined in test.collections.OrderedIterableTests.indexOfLast.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [58:44] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [59:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'data' @ [59:21] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'indexOfLast' @ [59:26] ==> public inline fun <T> Iterable<String>.indexOfLast(predicate: (String) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [59:40] ==> value-parameter it: String defined in test.collections.OrderedIterableTests.indexOfLast.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [59:43] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'expect' @ [60:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [60:16] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'empty' @ [60:22] ==> public final val empty: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'indexOfLast' @ [60:28] ==> public inline fun <T> Iterable<String>.indexOfLast(predicate: (String) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [60:42] ==> value-parameter it: String defined in test.collections.OrderedIterableTests.indexOfLast.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [60:45] ==> public fun CharSequence.startsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [63:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [65:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [65:25] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'elementAt' @ [65:30] ==> public fun <T> Iterable<String>.elementAt(index: Int): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expect' @ [66:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [66:25] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'elementAt' @ [66:30] ==> public fun <T> Iterable<String>.elementAt(index: Int): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertFails' @ [67:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [67:23] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'elementAt' @ [67:28] ==> public fun <T> Iterable<String>.elementAt(index: Int): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertFails' @ [68:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [68:23] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'elementAt' @ [68:28] ==> public fun <T> Iterable<String>.elementAt(index: Int): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'-' @ [68:38] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'assertFails' @ [69:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'empty' @ [69:23] ==> public final val empty: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'elementAt' @ [69:29] ==> public fun <T> Iterable<String>.elementAt(index: Int): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expect' @ [71:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [71:25] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'elementAtOrElse' @ [71:30] ==> public fun <T> Iterable<String>.elementAtOrElse(index: Int, defaultValue: (Int) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expect' @ [72:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [72:25] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'elementAtOrElse' @ [72:30] ==> public fun <T> Iterable<String>.elementAtOrElse(index: Int, defaultValue: (Int) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'-' @ [72:46] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'expect' @ [73:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [73:25] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'elementAtOrElse' @ [73:30] ==> public fun <T> Iterable<String>.elementAtOrElse(index: Int, defaultValue: (Int) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expect' @ [74:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'empty' @ [74:25] ==> public final val empty: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'elementAtOrElse' @ [74:31] ==> public fun <T> Iterable<String>.elementAtOrElse(index: Int, defaultValue: (Int) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expect' @ [76:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'empty' @ [76:24] ==> public final val empty: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'elementAtOrNull' @ [76:30] ==> public fun <T> Iterable<String>.elementAtOrNull(index: Int): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [80:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [82:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [82:25] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'first' @ [82:30] ==> public fun <T> Iterable<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertFails' @ [83:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [84:13] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'first' @ [84:18] ==> public inline fun <T> Iterable<String>.first(predicate: (String) -> Boolean): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [84:26] ==> value-parameter it: String defined in test.collections.OrderedIterableTests.first.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [84:29] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertFails' @ [86:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'empty' @ [87:13] ==> public final val empty: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'first' @ [87:19] ==> public fun <T> Iterable<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expect' @ [89:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [89:25] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'first' @ [89:30] ==> public inline fun <T> Iterable<String>.first(predicate: (String) -> Boolean): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [89:38] ==> value-parameter it: String defined in test.collections.OrderedIterableTests.first.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [89:41] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [92:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [94:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'data' @ [94:24] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'firstOrNull' @ [94:29] ==> public inline fun <T> Iterable<String>.firstOrNull(predicate: (String) -> Boolean): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [94:43] ==> value-parameter it: String defined in test.collections.OrderedIterableTests.firstOrNull.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [94:46] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [95:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'empty' @ [95:24] ==> public final val empty: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'firstOrNull' @ [95:30] ==> public fun <T> Iterable<String>.firstOrNull(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [97:17] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'firstOrNull' @ [97:22] ==> public inline fun <T> Iterable<String>.firstOrNull(predicate: (String) -> Boolean): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [97:36] ==> value-parameter it: String defined in test.collections.OrderedIterableTests.firstOrNull.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [97:39] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [98:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'f' @ [98:29] ==> val f: String? defined in test.collections.OrderedIterableTests.firstOrNull[LocalVariableDescriptor]

'Test' @ [101:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [103:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [103:29] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'last' @ [103:34] ==> public fun <T> Iterable<String>.last(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertFails' @ [104:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [105:13] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'last' @ [105:18] ==> public inline fun <T> Iterable<String>.last(predicate: (String) -> Boolean): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [105:25] ==> value-parameter it: String defined in test.collections.OrderedIterableTests.last.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [105:28] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertFails' @ [107:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'empty' @ [108:13] ==> public final val empty: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'last' @ [108:19] ==> public fun <T> Iterable<String>.last(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expect' @ [110:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [110:25] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'last' @ [110:30] ==> public inline fun <T> Iterable<String>.last(predicate: (String) -> Boolean): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [110:37] ==> value-parameter it: String defined in test.collections.OrderedIterableTests.last.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [110:40] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [113:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [115:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'data' @ [115:24] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'lastOrNull' @ [115:29] ==> public inline fun <T> Iterable<String>.lastOrNull(predicate: (String) -> Boolean): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [115:42] ==> value-parameter it: String defined in test.collections.OrderedIterableTests.lastOrNull.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [115:45] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [116:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'empty' @ [116:24] ==> public final val empty: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'lastOrNull' @ [116:30] ==> public fun <T> Iterable<String>.lastOrNull(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expect' @ [117:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'data' @ [117:25] ==> public final val data: T defined in test.collections.OrderedIterableTests[PropertyDescriptorImpl]

'lastOrNull' @ [117:30] ==> public inline fun <T> Iterable<String>.lastOrNull(predicate: (String) -> Boolean): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [117:43] ==> value-parameter it: String defined in test.collections.OrderedIterableTests.lastOrNull.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [117:46] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'invoke' @ [122:47] ==> public abstract operator fun invoke(p1: Array<out String>): T defined in kotlin.Function1[FunctionInvokeDescriptor]

'items' @ [122:58] ==> value-parameter vararg items: String defined in test.collections.IterableTests.createFrom[ValueParameterDescriptorImpl]

'createFrom' @ [124:16] ==> public final fun createFrom(vararg items: String): T defined in test.collections.IterableTests[SimpleFunctionDescriptorImpl]

'Test' @ [126:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [128:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'data' @ [128:24] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'any' @ [128:29] ==> public fun <T> Iterable<String>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expect' @ [129:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'empty' @ [129:25] ==> public final val empty: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'any' @ [129:31] ==> public fun <T> Iterable<String>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expect' @ [130:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'data' @ [130:24] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'any' @ [130:29] ==> public inline fun <T> Iterable<String>.any(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [130:35] ==> value-parameter it: String defined in test.collections.IterableTests.any.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [130:38] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [131:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'data' @ [131:25] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'any' @ [131:30] ==> public inline fun <T> Iterable<String>.any(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [131:36] ==> value-parameter it: String defined in test.collections.IterableTests.any.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [131:39] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [132:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'empty' @ [132:25] ==> public final val empty: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'any' @ [132:31] ==> public inline fun <T> Iterable<String>.any(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [132:37] ==> value-parameter it: String defined in test.collections.IterableTests.any.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [132:40] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [135:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [137:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'data' @ [137:24] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'all' @ [137:29] ==> public inline fun <T> Iterable<String>.all(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [137:35] ==> value-parameter it: String defined in test.collections.IterableTests.all.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [137:38] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'expect' @ [138:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'data' @ [138:25] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'all' @ [138:30] ==> public inline fun <T> Iterable<String>.all(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [138:36] ==> value-parameter it: String defined in test.collections.IterableTests.all.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [138:39] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [139:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'empty' @ [139:24] ==> public final val empty: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'all' @ [139:30] ==> public inline fun <T> Iterable<String>.all(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [139:36] ==> value-parameter it: String defined in test.collections.IterableTests.all.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [139:39] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [142:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [144:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'data' @ [144:25] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'none' @ [144:30] ==> public fun <T> Iterable<String>.none(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expect' @ [145:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'empty' @ [145:24] ==> public final val empty: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'none' @ [145:30] ==> public fun <T> Iterable<String>.none(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expect' @ [146:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'data' @ [146:25] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'none' @ [146:30] ==> public inline fun <T> Iterable<String>.none(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [146:37] ==> value-parameter it: String defined in test.collections.IterableTests.none.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [146:40] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'expect' @ [147:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'data' @ [147:25] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'none' @ [147:30] ==> public inline fun <T> Iterable<String>.none(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [147:37] ==> value-parameter it: String defined in test.collections.IterableTests.none.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [147:40] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [148:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'data' @ [148:24] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'none' @ [148:29] ==> public inline fun <T> Iterable<String>.none(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [148:36] ==> value-parameter it: String defined in test.collections.IterableTests.none.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [148:39] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [149:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'empty' @ [149:24] ==> public final val empty: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'none' @ [149:30] ==> public inline fun <T> Iterable<String>.none(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [149:37] ==> value-parameter it: String defined in test.collections.IterableTests.none.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [149:40] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [152:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'data' @ [154:19] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'filter' @ [154:24] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [154:33] ==> value-parameter it: String defined in test.collections.IterableTests.filter.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [154:36] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [155:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'foo' @ [155:24] ==> val foo: List<String> defined in test.collections.IterableTests.filter[LocalVariableDescriptor]

'expect' @ [156:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'foo' @ [156:24] ==> val foo: List<String> defined in test.collections.IterableTests.filter[LocalVariableDescriptor]

'all' @ [156:28] ==> public inline fun <T> Iterable<String>.all(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [156:34] ==> value-parameter it: String defined in test.collections.IterableTests.filter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [156:37] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [157:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'foo' @ [157:21] ==> val foo: List<String> defined in test.collections.IterableTests.filter[LocalVariableDescriptor]

'size' @ [157:25] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [158:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [158:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'foo' @ [158:37] ==> val foo: List<String> defined in test.collections.IterableTests.filter[LocalVariableDescriptor]

'Test' @ [161:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'data' @ [162:22] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'filterIndexed' @ [162:27] ==> public inline fun <T> Iterable<String>.filterIndexed(predicate: (index: Int, String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'value' @ [162:59] ==> value-parameter value: String defined in test.collections.IterableTests.filterIndexed.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [162:65] ==> public fun CharSequence.first(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'+' @ [162:77] ==> public final operator fun plus(other: Int): Char defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'index' @ [162:83] ==> value-parameter index: Int defined in test.collections.IterableTests.filterIndexed.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [163:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [163:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'result' @ [163:37] ==> val result: List<String> defined in test.collections.IterableTests.filterIndexed[LocalVariableDescriptor]

'Test' @ [166:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'data' @ [168:19] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'drop' @ [168:24] ==> public fun <T> Iterable<String>.drop(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expect' @ [169:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'foo' @ [169:24] ==> val foo: List<String> defined in test.collections.IterableTests.drop[LocalVariableDescriptor]

'expect' @ [170:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'foo' @ [170:24] ==> val foo: List<String> defined in test.collections.IterableTests.drop[LocalVariableDescriptor]

'all' @ [170:28] ==> public inline fun <T> Iterable<String>.all(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [170:34] ==> value-parameter it: String defined in test.collections.IterableTests.drop.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [170:37] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [171:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'foo' @ [171:21] ==> val foo: List<String> defined in test.collections.IterableTests.drop[LocalVariableDescriptor]

'size' @ [171:25] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [172:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [172:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'foo' @ [172:37] ==> val foo: List<String> defined in test.collections.IterableTests.drop[LocalVariableDescriptor]

'Test' @ [175:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'data' @ [177:19] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'dropWhile' @ [177:24] ==> public inline fun <T> Iterable<String>.dropWhile(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [177:36] ==> value-parameter it: String defined in test.collections.IterableTests.dropWhile.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [178:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'foo' @ [178:24] ==> val foo: List<String> defined in test.collections.IterableTests.dropWhile[LocalVariableDescriptor]

'expect' @ [179:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'foo' @ [179:24] ==> val foo: List<String> defined in test.collections.IterableTests.dropWhile[LocalVariableDescriptor]

'all' @ [179:28] ==> public inline fun <T> Iterable<String>.all(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [179:34] ==> value-parameter it: String defined in test.collections.IterableTests.dropWhile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [179:37] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [180:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'foo' @ [180:21] ==> val foo: List<String> defined in test.collections.IterableTests.dropWhile[LocalVariableDescriptor]

'size' @ [180:25] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [181:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [181:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'foo' @ [181:37] ==> val foo: List<String> defined in test.collections.IterableTests.dropWhile[LocalVariableDescriptor]

'Test' @ [184:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'data' @ [186:22] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'filterNot' @ [186:27] ==> public inline fun <T> Iterable<String>.filterNot(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [186:39] ==> value-parameter it: String defined in test.collections.IterableTests.filterNot.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [186:42] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [187:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'notFoo' @ [187:24] ==> val notFoo: List<String> defined in test.collections.IterableTests.filterNot[LocalVariableDescriptor]

'expect' @ [188:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'notFoo' @ [188:24] ==> val notFoo: List<String> defined in test.collections.IterableTests.filterNot[LocalVariableDescriptor]

'none' @ [188:31] ==> public inline fun <T> Iterable<String>.none(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [188:38] ==> value-parameter it: String defined in test.collections.IterableTests.filterNot.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [188:41] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [189:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'notFoo' @ [189:21] ==> val notFoo: List<String> defined in test.collections.IterableTests.filterNot[LocalVariableDescriptor]

'size' @ [189:28] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [190:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [190:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'notFoo' @ [190:37] ==> val notFoo: List<String> defined in test.collections.IterableTests.filterNot[LocalVariableDescriptor]

'Test' @ [193:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'data' @ [196:9] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'forEach' @ [196:14] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'count' @ [196:24] ==> var count: Int defined in test.collections.IterableTests.forEach[LocalVariableDescriptor]

'it' @ [196:33] ==> value-parameter it: String defined in test.collections.IterableTests.forEach.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [196:36] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'assertEquals' @ [197:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'count' @ [197:25] ==> var count: Int defined in test.collections.IterableTests.forEach[LocalVariableDescriptor]

'Test' @ [200:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'data' @ [203:23] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'onEach' @ [203:28] ==> @SinceKotlin public inline fun <T, C : Iterable<String>> T.onEach(action: (String) -> Unit): T defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <C : Iterable<T>> -> T

'count' @ [203:37] ==> var count: Int defined in test.collections.IterableTests.onEach[LocalVariableDescriptor]

'it' @ [203:46] ==> value-parameter it: String defined in test.collections.IterableTests.onEach.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [203:49] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'assertEquals' @ [204:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'count' @ [204:25] ==> var count: Int defined in test.collections.IterableTests.onEach[LocalVariableDescriptor]

'assertTrue' @ [205:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [205:20] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'newData' @ [205:29] ==> val newData: T defined in test.collections.IterableTests.onEach[LocalVariableDescriptor]

'assertStaticTypeIs' @ [208:9] ==> public fun <T> assertStaticTypeIs(@Suppress value: ArrayList<Int> /* = ArrayList<Int> */): Unit defined in test[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ArrayList<Int>

'arrayListOf' @ [208:44] ==> public fun <T> arrayListOf(vararg elements: Int): ArrayList<Int> /* = ArrayList<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'onEach' @ [208:65] ==> @SinceKotlin public inline fun <T, C : Iterable<Int>> ArrayList<Int> /* = ArrayList<Int> */.onEach(action: (Int) -> Unit): ArrayList<Int> /* = ArrayList<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <C : Iterable<T>> -> ArrayList<Int>

'Test' @ [211:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertTrue' @ [213:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [213:20] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'contains' @ [213:25] ==> public operator fun <@OnlyInputTypes T> Iterable<String>.contains(element: String): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'assertTrue' @ [214:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'in' @ [214:20] ==> public operator fun <@OnlyInputTypes T> Iterable<String>.contains(element: String): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [214:29] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'assertTrue' @ [215:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'!in' @ [215:20] ==> public operator fun <@OnlyInputTypes T> Iterable<String>.contains(element: String): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [215:30] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'assertFalse' @ [216:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'in' @ [216:21] ==> public operator fun <@OnlyInputTypes T> Iterable<String>.contains(element: String): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'empty' @ [216:30] ==> public final val empty: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'Test' @ [219:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertFails' @ [221:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [221:23] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'single' @ [221:28] ==> public fun <T> Iterable<String>.single(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertFails' @ [222:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'empty' @ [222:23] ==> public final val empty: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'single' @ [222:29] ==> public fun <T> Iterable<String>.single(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expect' @ [223:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [223:25] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'single' @ [223:30] ==> public inline fun <T> Iterable<String>.single(predicate: (String) -> Boolean): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [223:39] ==> value-parameter it: String defined in test.collections.IterableTests.single.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [223:42] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [224:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [224:25] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'single' @ [224:30] ==> public inline fun <T> Iterable<String>.single(predicate: (String) -> Boolean): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [224:39] ==> value-parameter it: String defined in test.collections.IterableTests.single.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [224:42] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertFails' @ [225:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [226:13] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'single' @ [226:18] ==> public inline fun <T> Iterable<String>.single(predicate: (String) -> Boolean): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [226:27] ==> value-parameter it: String defined in test.collections.IterableTests.single.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [226:30] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'Test' @ [230:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [232:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'data' @ [232:24] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'singleOrNull' @ [232:29] ==> public fun <T> Iterable<String>.singleOrNull(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expect' @ [233:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'empty' @ [233:24] ==> public final val empty: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'singleOrNull' @ [233:30] ==> public fun <T> Iterable<String>.singleOrNull(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expect' @ [234:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'data' @ [234:25] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'singleOrNull' @ [234:30] ==> public inline fun <T> Iterable<String>.singleOrNull(predicate: (String) -> Boolean): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [234:45] ==> value-parameter it: String defined in test.collections.IterableTests.singleOrNull.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [234:48] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [235:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'data' @ [235:25] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'singleOrNull' @ [235:30] ==> public inline fun <T> Iterable<String>.singleOrNull(predicate: (String) -> Boolean): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [235:45] ==> value-parameter it: String defined in test.collections.IterableTests.singleOrNull.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [235:48] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [236:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'data' @ [237:13] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'singleOrNull' @ [237:18] ==> public inline fun <T> Iterable<String>.singleOrNull(predicate: (String) -> Boolean): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [237:33] ==> value-parameter it: String defined in test.collections.IterableTests.singleOrNull.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [237:36] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'Test' @ [241:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'data' @ [243:23] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'map' @ [243:28] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Int

'it' @ [243:34] ==> value-parameter it: String defined in test.collections.IterableTests.map.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [243:37] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'assertTrue' @ [244:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'lengths' @ [245:13] ==> val lengths: List<Int> defined in test.collections.IterableTests.map[LocalVariableDescriptor]

'all' @ [245:21] ==> public inline fun <T> Iterable<Int>.all(predicate: (Int) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [245:27] ==> value-parameter it: Int defined in test.collections.IterableTests.map.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [247:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'lengths' @ [247:25] ==> val lengths: List<Int> defined in test.collections.IterableTests.map[LocalVariableDescriptor]

'size' @ [247:33] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [248:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [248:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'lengths' @ [248:36] ==> val lengths: List<Int> defined in test.collections.IterableTests.map[LocalVariableDescriptor]

'Test' @ [251:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [253:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [253:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'data' @ [253:54] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'map' @ [253:59] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> IntRange): List<IntRange> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> IntRange

'..' @ [253:65] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [253:68] ==> value-parameter it: String defined in test.collections.IterableTests.flatten.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [253:71] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'flatten' @ [253:80] ==> public fun <T> Iterable<Iterable<Int>>.flatten(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [256:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'data' @ [258:25] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'mapIndexed' @ [258:30] ==> public inline fun <T, R> Iterable<String>.mapIndexed(transform: (index: Int, String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'value' @ [258:59] ==> value-parameter value: String defined in test.collections.IterableTests.mapIndexed.<anonymous>[ValueParameterDescriptorImpl]

'substring' @ [258:65] ==> public fun String.substring(range: IntRange): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'..' @ [258:75] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'index' @ [258:78] ==> value-parameter index: Int defined in test.collections.IterableTests.mapIndexed.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [259:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'shortened' @ [259:25] ==> val shortened: List<String> defined in test.collections.IterableTests.mapIndexed[LocalVariableDescriptor]

'size' @ [259:35] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [260:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [260:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'shortened' @ [260:41] ==> val shortened: List<String> defined in test.collections.IterableTests.mapIndexed[LocalVariableDescriptor]

'Test' @ [263:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'data' @ [265:23] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'withIndex' @ [265:28] ==> public fun <T> Iterable<String>.withIndex(): Iterable<IndexedValue<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [265:40] ==> public inline fun <T, R> Iterable<IndexedValue<String>>.map(transform: (IndexedValue<String>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<String>
    <R> -> String

'it' @ [265:46] ==> value-parameter it: IndexedValue<String> defined in test.collections.IterableTests.withIndex.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [265:49] ==> public final val value: String defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'substring' @ [265:55] ==> public fun String.substring(range: IntRange): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'..' @ [265:65] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [265:68] ==> value-parameter it: IndexedValue<String> defined in test.collections.IterableTests.withIndex.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [265:71] ==> public final val index: Int defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'assertEquals' @ [266:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'indexed' @ [266:25] ==> val indexed: List<String> defined in test.collections.IterableTests.withIndex[LocalVariableDescriptor]

'size' @ [266:33] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [267:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [267:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'indexed' @ [267:41] ==> val indexed: List<String> defined in test.collections.IterableTests.withIndex[LocalVariableDescriptor]

'Test' @ [270:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [272:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Char>, actual: List<Char>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Char>

'listOf' @ [272:22] ==> public fun <T> listOf(element: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'data' @ [272:35] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'mapNotNull' @ [272:40] ==> public inline fun <T, R : Any> Iterable<String>.mapNotNull(transform: (String) -> Char?): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Any> -> Char

'it' @ [272:53] ==> value-parameter it: String defined in test.collections.IterableTests.mapNotNull.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [272:56] ==> public inline fun CharSequence.firstOrNull(predicate: (Char) -> Boolean): Char? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'c' @ [272:75] ==> value-parameter c: Char defined in test.collections.IterableTests.mapNotNull.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [275:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [277:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Char>, actual: List<Char>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Char>

'listOf' @ [277:22] ==> public fun <T> listOf(element: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'data' @ [277:35] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'mapIndexedNotNull' @ [277:40] ==> public inline fun <T, R : Any> Iterable<String>.mapIndexedNotNull(transform: (index: Int, String) -> Char?): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Any> -> Char

's' @ [277:72] ==> value-parameter s: String defined in test.collections.IterableTests.mapIndexedNotNull.<anonymous>[ValueParameterDescriptorImpl]

'getOrNull' @ [277:74] ==> public fun CharSequence.getOrNull(index: Int): Char? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'index' @ [277:84] ==> value-parameter index: Int defined in test.collections.IterableTests.mapIndexedNotNull.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [280:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [282:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'data' @ [282:25] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'max' @ [282:30] ==> public fun <T : Comparable<String>> Iterable<String>.max(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'expect' @ [283:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'data' @ [283:25] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'maxBy' @ [283:30] ==> public inline fun <T, R : Comparable<Char>> Iterable<String>.maxBy(selector: (String) -> Char): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Comparable<R>> -> Char

'it' @ [283:38] ==> value-parameter it: String defined in test.collections.IterableTests.max.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'last' @ [283:41] ==> public fun CharSequence.last(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [286:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [288:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'data' @ [288:25] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'min' @ [288:30] ==> public fun <T : Comparable<String>> Iterable<String>.min(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'expect' @ [289:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'data' @ [289:25] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'minBy' @ [289:30] ==> public inline fun <T, R : Comparable<Char>> Iterable<String>.minBy(selector: (String) -> Char): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Comparable<R>> -> Char

'it' @ [289:38] ==> value-parameter it: String defined in test.collections.IterableTests.min.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'last' @ [289:41] ==> public fun CharSequence.last(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [292:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [294:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'data' @ [294:21] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'count' @ [294:26] ==> public fun <T> Iterable<String>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expect' @ [295:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'empty' @ [295:21] ==> public final val empty: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'count' @ [295:27] ==> public fun <T> Iterable<String>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expect' @ [297:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'data' @ [297:21] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'count' @ [297:26] ==> public inline fun <T> Iterable<String>.count(predicate: (String) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [297:34] ==> value-parameter it: String defined in test.collections.IterableTests.count.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [297:37] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [298:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'empty' @ [298:21] ==> public final val empty: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'count' @ [298:27] ==> public inline fun <T> Iterable<String>.count(predicate: (String) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [298:35] ==> value-parameter it: String defined in test.collections.IterableTests.count.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [298:38] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [300:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'data' @ [300:21] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'count' @ [300:26] ==> public inline fun <T> Iterable<String>.count(predicate: (String) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [300:34] ==> value-parameter it: String defined in test.collections.IterableTests.count.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [300:37] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expect' @ [301:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'empty' @ [301:21] ==> public final val empty: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'count' @ [301:27] ==> public inline fun <T> Iterable<String>.count(predicate: (String) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [301:35] ==> value-parameter it: String defined in test.collections.IterableTests.count.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [301:38] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [304:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [306:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'data' @ [306:21] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'sumBy' @ [306:26] ==> public inline fun <T> Iterable<String>.sumBy(selector: (String) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [306:34] ==> value-parameter it: String defined in test.collections.IterableTests.sumBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [306:37] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'expect' @ [307:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'empty' @ [307:21] ==> public final val empty: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'sumBy' @ [307:27] ==> public inline fun <T> Iterable<String>.sumBy(selector: (String) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [307:35] ==> value-parameter it: String defined in test.collections.IterableTests.sumBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [307:38] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'expect' @ [309:9] ==> public fun <@OnlyInputTypes T> expect(expected: Double, block: () -> Double): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Double

'data' @ [309:23] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'sumByDouble' @ [309:28] ==> public inline fun <T> Iterable<String>.sumByDouble(selector: (String) -> Double): Double defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [309:42] ==> value-parameter it: String defined in test.collections.IterableTests.sumBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [309:45] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'toDouble' @ [309:52] ==> public open fun toDouble(): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'expect' @ [310:9] ==> public fun <@OnlyInputTypes T> expect(expected: Double, block: () -> Double): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Double

'empty' @ [310:23] ==> public final val empty: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'sumByDouble' @ [310:29] ==> public inline fun <T> Iterable<String>.sumByDouble(selector: (String) -> Double): Double defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [310:43] ==> value-parameter it: String defined in test.collections.IterableTests.sumBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [310:46] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'toDouble' @ [310:53] ==> public open fun toDouble(): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Test' @ [313:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'component1' @ [316:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [316:18] ==> public final operator fun component2(): String defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'data' @ [316:24] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'withIndex' @ [316:29] ==> public fun <T> Iterable<String>.withIndex(): Iterable<IndexedValue<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [317:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'i' @ [317:26] ==> val i: Int defined in test.collections.IterableTests.withIndices[LocalVariableDescriptor]

'index' @ [317:29] ==> var index: Int defined in test.collections.IterableTests.withIndices[LocalVariableDescriptor]

'assertEquals' @ [318:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'd' @ [318:26] ==> val d: String defined in test.collections.IterableTests.withIndices[LocalVariableDescriptor]

'data' @ [318:29] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'elementAt' @ [318:34] ==> public fun <T> Iterable<String>.elementAt(index: Int): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'index' @ [318:44] ==> var index: Int defined in test.collections.IterableTests.withIndices[LocalVariableDescriptor]

'index' @ [319:13] ==> var index: Int defined in test.collections.IterableTests.withIndices[LocalVariableDescriptor]

'assertEquals' @ [321:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'data' @ [321:22] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'count' @ [321:27] ==> public fun <T> Iterable<String>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'index' @ [321:36] ==> var index: Int defined in test.collections.IterableTests.withIndices[LocalVariableDescriptor]

'Test' @ [324:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [326:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'data' @ [326:23] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'fold' @ [326:28] ==> public inline fun <T, R> Iterable<String>.fold(initial: Int, operation: (Int, String) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Int

'a' @ [326:46] ==> value-parameter a: Int defined in test.collections.IterableTests.fold.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (b == "foo") 200 else 30' @ [326:50] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'b' @ [326:54] ==> value-parameter b: String defined in test.collections.IterableTests.fold.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [329:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'data' @ [331:23] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'reduce' @ [331:28] ==> public inline fun <S, T : String> Iterable<String>.reduce(operation: (String, String) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> String
    <T : S> -> String

'a' @ [331:45] ==> value-parameter a: String defined in test.collections.IterableTests.reduce.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [331:49] ==> value-parameter b: String defined in test.collections.IterableTests.reduce.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [332:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'reduced' @ [332:25] ==> val reduced: String defined in test.collections.IterableTests.reduce[LocalVariableDescriptor]

'length' @ [332:33] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'assertTrue' @ [333:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'reduced' @ [333:20] ==> val reduced: String defined in test.collections.IterableTests.reduce[LocalVariableDescriptor]

'reduced' @ [333:43] ==> val reduced: String defined in test.collections.IterableTests.reduce[LocalVariableDescriptor]

'Test' @ [336:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'data' @ [338:22] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'joinToString' @ [338:27] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [338:59] ==> value-parameter it: String defined in test.collections.IterableTests.mapAndJoinToString.<anonymous>[ValueParameterDescriptorImpl]

'toUpperCase' @ [338:62] ==> @InlineOnly public inline fun String.toUpperCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [339:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'result' @ [339:33] ==> val result: String defined in test.collections.IterableTests.mapAndJoinToString[LocalVariableDescriptor]

'invoke' @ [343:36] ==> public abstract operator fun invoke(p1: Iterable<String>): List<String> defined in kotlin.Function1[FunctionInvokeDescriptor]

'data' @ [343:43] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'assertEquals' @ [344:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [344:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'result' @ [344:56] ==> val result: List<String> defined in test.collections.IterableTests.testPlus[LocalVariableDescriptor]

'assertFalse' @ [345:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'result' @ [345:21] ==> val result: List<String> defined in test.collections.IterableTests.testPlus[LocalVariableDescriptor]

'data' @ [345:32] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'Test' @ [348:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlus' @ [349:25] ==> public final fun testPlus(doPlus: (Iterable<String>) -> List<String>): Unit defined in test.collections.IterableTests[SimpleFunctionDescriptorImpl]

'it' @ [349:36] ==> value-parameter it: Iterable<String> defined in test.collections.IterableTests.plusElement.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [350:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlus' @ [351:28] ==> public final fun testPlus(doPlus: (Iterable<String>) -> List<String>): Unit defined in test.collections.IterableTests[SimpleFunctionDescriptorImpl]

'it' @ [351:39] ==> value-parameter it: Iterable<String> defined in test.collections.IterableTests.plusCollection.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [351:44] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [352:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlus' @ [353:23] ==> public final fun testPlus(doPlus: (Iterable<String>) -> List<String>): Unit defined in test.collections.IterableTests[SimpleFunctionDescriptorImpl]

'it' @ [353:34] ==> value-parameter it: Iterable<String> defined in test.collections.IterableTests.plusArray.<anonymous>[ValueParameterDescriptorImpl]

'arrayOf' @ [353:39] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'Test' @ [354:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlus' @ [355:26] ==> public final fun testPlus(doPlus: (Iterable<String>) -> List<String>): Unit defined in test.collections.IterableTests[SimpleFunctionDescriptorImpl]

'it' @ [355:37] ==> value-parameter it: Iterable<String> defined in test.collections.IterableTests.plusSequence.<anonymous>[ValueParameterDescriptorImpl]

'sequenceOf' @ [355:42] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [357:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'data' @ [360:40] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'result' @ [361:9] ==> var result: Iterable<String> defined in test.collections.IterableTests.plusAssign[LocalVariableDescriptor]

'result' @ [362:9] ==> var result: Iterable<String> defined in test.collections.IterableTests.plusAssign[LocalVariableDescriptor]

'listOf' @ [362:19] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'result' @ [363:9] ==> var result: Iterable<String> defined in test.collections.IterableTests.plusAssign[LocalVariableDescriptor]

'arrayOf' @ [363:19] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'result' @ [364:9] ==> var result: Iterable<String> defined in test.collections.IterableTests.plusAssign[LocalVariableDescriptor]

'sequenceOf' @ [364:19] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [365:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Iterable<String>, actual: Iterable<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Iterable<String>

'listOf' @ [365:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'result' @ [365:89] ==> var result: Iterable<String> defined in test.collections.IterableTests.plusAssign[LocalVariableDescriptor]

'Test' @ [368:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'data' @ [370:22] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'assertEquals' @ [371:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [371:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'result' @ [371:37] ==> val result: List<String> defined in test.collections.IterableTests.minusElement[LocalVariableDescriptor]

'Test' @ [374:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'data' @ [376:22] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'listOf' @ [376:29] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [377:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [377:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'result' @ [377:37] ==> val result: List<String> defined in test.collections.IterableTests.minusCollection[LocalVariableDescriptor]

'Test' @ [380:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'data' @ [382:22] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'arrayOf' @ [382:29] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'assertEquals' @ [383:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [383:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'result' @ [383:37] ==> val result: List<String> defined in test.collections.IterableTests.minusArray[LocalVariableDescriptor]

'Test' @ [386:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'data' @ [388:22] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'sequenceOf' @ [388:29] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [389:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [389:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'result' @ [389:37] ==> val result: List<String> defined in test.collections.IterableTests.minusSequence[LocalVariableDescriptor]

'Test' @ [392:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'data' @ [395:40] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'result' @ [396:9] ==> var result: Iterable<String> defined in test.collections.IterableTests.minusAssign[LocalVariableDescriptor]

'assertEquals' @ [397:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>?, actual: List<String>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>?

'listOf' @ [397:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'result' @ [397:37] ==> var result: Iterable<String> defined in test.collections.IterableTests.minusAssign[LocalVariableDescriptor]

'result' @ [398:9] ==> var result: Iterable<String> defined in test.collections.IterableTests.minusAssign[LocalVariableDescriptor]

'data' @ [398:18] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'result' @ [399:9] ==> var result: Iterable<String> defined in test.collections.IterableTests.minusAssign[LocalVariableDescriptor]

'listOf' @ [399:19] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [400:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>?, actual: List<String>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>?

'listOf' @ [400:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'result' @ [400:37] ==> var result: Iterable<String> defined in test.collections.IterableTests.minusAssign[LocalVariableDescriptor]

'result' @ [401:9] ==> var result: Iterable<String> defined in test.collections.IterableTests.minusAssign[LocalVariableDescriptor]

'data' @ [401:18] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'result' @ [402:9] ==> var result: Iterable<String> defined in test.collections.IterableTests.minusAssign[LocalVariableDescriptor]

'arrayOf' @ [402:19] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'assertEquals' @ [403:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>?, actual: List<String>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>?

'emptyList' @ [403:22] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'result' @ [403:43] ==> var result: Iterable<String> defined in test.collections.IterableTests.minusAssign[LocalVariableDescriptor]

'result' @ [404:9] ==> var result: Iterable<String> defined in test.collections.IterableTests.minusAssign[LocalVariableDescriptor]

'data' @ [404:18] ==> public final val data: T defined in test.collections.IterableTests[PropertyDescriptorImpl]

'result' @ [405:9] ==> var result: Iterable<String> defined in test.collections.IterableTests.minusAssign[LocalVariableDescriptor]

'sequenceOf' @ [405:19] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [406:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>?, actual: List<String>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>?

'listOf' @ [406:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'result' @ [406:37] ==> var result: Iterable<String> defined in test.collections.IterableTests.minusAssign[LocalVariableDescriptor]

'this' @ [412:72] ==> <this> defined in test.collections.assertSorted[ReceiverParameterDescriptorImpl]

'iterator' @ [412:77] ==> public abstract operator fun iterator(): Iterator<T> defined in kotlin.collections.Iterable[DeserializedSimpleFunctionDescriptor]

'assertSorted' @ [412:88] ==> public fun <T> Iterator<T>.assertSorted(isInOrder: (T, T) -> Boolean): Unit defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'isInOrder' @ [412:101] ==> value-parameter isInOrder: (T, T) -> Boolean defined in test.collections.assertSorted[ValueParameterDescriptorImpl]

'!' @ [414:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasNext' @ [414:10] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'next' @ [416:16] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'hasNext' @ [417:12] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'index' @ [418:9] ==> var index: Int defined in test.collections.assertSorted[LocalVariableDescriptor]

'next' @ [419:20] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [420:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'invoke' @ [420:20] ==> public abstract operator fun invoke(p1: T, p2: T): Boolean defined in kotlin.Function2[FunctionInvokeDescriptor]

'prev' @ [420:30] ==> var prev: T defined in test.collections.assertSorted[LocalVariableDescriptor]

'next' @ [420:36] ==> val next: T defined in test.collections.assertSorted[LocalVariableDescriptor]

'index' @ [420:70] ==> var index: Int defined in test.collections.assertSorted[LocalVariableDescriptor]

'index' @ [420:87] ==> var index: Int defined in test.collections.assertSorted[LocalVariableDescriptor]

'prev' @ [420:99] ==> var prev: T defined in test.collections.assertSorted[LocalVariableDescriptor]

'index' @ [420:114] ==> var index: Int defined in test.collections.assertSorted[LocalVariableDescriptor]

'next' @ [420:123] ==> val next: T defined in test.collections.assertSorted[LocalVariableDescriptor]

'prev' @ [421:9] ==> var prev: T defined in test.collections.assertSorted[LocalVariableDescriptor]

'next' @ [421:16] ==> val next: T defined in test.collections.assertSorted[LocalVariableDescriptor]

