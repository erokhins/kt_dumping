'kotlin.jvm.JvmVersion' @ [1:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[DeserializedClassConstructorDescriptor]

'IdentityHashMap' @ [19:19] ==> public constructor IdentityHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.IdentityHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> T
    <V : (Any..Any?)> -> String

'values' @ [20:9] ==> value-parameter vararg values: T defined in test.collections.CollectionJVMTest.identitySetOf[ValueParameterDescriptorImpl]

'forEach' @ [20:16] ==> public inline fun <T> Array<out T>.forEach(action: (T) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'map' @ [20:26] ==> val map: IdentityHashMap<T, String> defined in test.collections.CollectionJVMTest.identitySetOf[LocalVariableDescriptor]

'put' @ [20:30] ==> public open fun put(key: (T..T?), value: (String..String?)): String? defined in java.util.IdentityHashMap[JavaMethodDescriptor]

'it' @ [20:34] ==> value-parameter it: T defined in test.collections.CollectionJVMTest.identitySetOf.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [21:16] ==> val map: IdentityHashMap<T, String> defined in test.collections.CollectionJVMTest.identitySetOf[LocalVariableDescriptor]

'keys' @ [21:20] ==> public open val keys: MutableSet<(T..T?)> defined in java.util.IdentityHashMap[JavaPropertyDescriptor]

'Test' @ [26:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [27:20] ==> public fun <T> listOf(vararg elements: CollectionJVMTest.IdentityData): List<CollectionJVMTest.IdentityData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IdentityData

'IdentityData' @ [27:27] ==> public constructor IdentityData(value: Int) defined in test.collections.CollectionJVMTest.IdentityData[ClassConstructorDescriptorImpl]

'IdentityData' @ [27:44] ==> public constructor IdentityData(value: Int) defined in test.collections.CollectionJVMTest.IdentityData[ClassConstructorDescriptorImpl]

'data' @ [28:20] ==> val data: List<CollectionJVMTest.IdentityData> defined in test.collections.CollectionJVMTest.removeAllWithDifferentEquality[LocalVariableDescriptor]

'toMutableList' @ [28:25] ==> public fun <T> Collection<CollectionJVMTest.IdentityData>.toMutableList(): MutableList<CollectionJVMTest.IdentityData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IdentityData

'list' @ [29:9] ==> val list: MutableList<CollectionJVMTest.IdentityData> defined in test.collections.CollectionJVMTest.removeAllWithDifferentEquality[LocalVariableDescriptor]

'identitySetOf' @ [29:17] ==> private final fun <T> identitySetOf(vararg values: CollectionJVMTest.IdentityData): MutableSet<CollectionJVMTest.IdentityData> defined in test.collections.CollectionJVMTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> IdentityData

'data' @ [29:31] ==> val data: List<CollectionJVMTest.IdentityData> defined in test.collections.CollectionJVMTest.removeAllWithDifferentEquality[LocalVariableDescriptor]

'assertTrue' @ [30:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'list' @ [30:20] ==> val list: MutableList<CollectionJVMTest.IdentityData> defined in test.collections.CollectionJVMTest.removeAllWithDifferentEquality[LocalVariableDescriptor]

'single' @ [30:25] ==> public fun <T> List<CollectionJVMTest.IdentityData>.single(): CollectionJVMTest.IdentityData defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IdentityData

'data' @ [30:38] ==> val data: List<CollectionJVMTest.IdentityData> defined in test.collections.CollectionJVMTest.removeAllWithDifferentEquality[LocalVariableDescriptor]

'data' @ [32:21] ==> val data: List<CollectionJVMTest.IdentityData> defined in test.collections.CollectionJVMTest.removeAllWithDifferentEquality[LocalVariableDescriptor]

'toMutableList' @ [32:26] ==> public fun <T> Collection<CollectionJVMTest.IdentityData>.toMutableList(): MutableList<CollectionJVMTest.IdentityData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IdentityData

'list2' @ [33:9] ==> val list2: MutableList<CollectionJVMTest.IdentityData> defined in test.collections.CollectionJVMTest.removeAllWithDifferentEquality[LocalVariableDescriptor]

'hashSetOf' @ [33:18] ==> public fun <T> hashSetOf(vararg elements: CollectionJVMTest.IdentityData): HashSet<CollectionJVMTest.IdentityData> /* = HashSet<CollectionJVMTest.IdentityData> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IdentityData

'data' @ [33:28] ==> val data: List<CollectionJVMTest.IdentityData> defined in test.collections.CollectionJVMTest.removeAllWithDifferentEquality[LocalVariableDescriptor]

'assertTrue' @ [34:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'list2' @ [34:20] ==> val list2: MutableList<CollectionJVMTest.IdentityData> defined in test.collections.CollectionJVMTest.removeAllWithDifferentEquality[LocalVariableDescriptor]

'isEmpty' @ [34:26] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'identitySetOf' @ [36:46] ==> private final fun <T> identitySetOf(vararg values: CollectionJVMTest.IdentityData): MutableSet<CollectionJVMTest.IdentityData> defined in test.collections.CollectionJVMTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> IdentityData

'data' @ [36:61] ==> val data: List<CollectionJVMTest.IdentityData> defined in test.collections.CollectionJVMTest.removeAllWithDifferentEquality[LocalVariableDescriptor]

'toTypedArray' @ [36:66] ==> public inline fun <reified T> Collection<CollectionJVMTest.IdentityData>.toTypedArray(): Array<CollectionJVMTest.IdentityData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> IdentityData

'set3' @ [37:9] ==> val set3: MutableSet<CollectionJVMTest.IdentityData> defined in test.collections.CollectionJVMTest.removeAllWithDifferentEquality[LocalVariableDescriptor]

'arrayOf' @ [37:17] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: CollectionJVMTest.IdentityData): Array<CollectionJVMTest.IdentityData> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> IdentityData

'data' @ [37:25] ==> val data: List<CollectionJVMTest.IdentityData> defined in test.collections.CollectionJVMTest.removeAllWithDifferentEquality[LocalVariableDescriptor]

'assertTrue' @ [38:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'set3' @ [38:20] ==> val set3: MutableSet<CollectionJVMTest.IdentityData> defined in test.collections.CollectionJVMTest.removeAllWithDifferentEquality[LocalVariableDescriptor]

'isEmpty' @ [38:25] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'Test' @ [41:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [42:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [43:26] ==> val data: List<String> defined in test.collections.CollectionJVMTest.flatMap[LocalVariableDescriptor]

'flatMap' @ [43:31] ==> public inline fun <T, R> Iterable<String>.flatMap(transform: (String) -> Iterable<Char>): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Char

'it' @ [43:41] ==> value-parameter it: String defined in test.collections.CollectionJVMTest.flatMap.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [43:44] ==> public fun CharSequence.toList(): List<Char> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'println' @ [44:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'characters' @ [44:43] ==> val characters: List<Char> defined in test.collections.CollectionJVMTest.flatMap[LocalVariableDescriptor]

'assertEquals' @ [45:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'characters' @ [45:25] ==> val characters: List<Char> defined in test.collections.CollectionJVMTest.flatMap[LocalVariableDescriptor]

'size' @ [45:36] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'characters' @ [46:20] ==> val characters: List<Char> defined in test.collections.CollectionJVMTest.flatMap[LocalVariableDescriptor]

'joinToString' @ [46:31] ==> public fun <T> Iterable<Char>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Char) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'assertEquals' @ [47:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'text' @ [47:33] ==> val text: String defined in test.collections.CollectionJVMTest.flatMap[LocalVariableDescriptor]

'Test' @ [51:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [52:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [53:19] ==> val data: List<String> defined in test.collections.CollectionJVMTest.filterIntoLinkedList[LocalVariableDescriptor]

'filterTo' @ [53:24] ==> public inline fun <T, C : MutableCollection<in String>> Iterable<String>.filterTo(destination: LinkedList<String>, predicate: (String) -> Boolean): LinkedList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <C : MutableCollection<in T>> -> LinkedList<String>

'LinkedList' @ [53:33] ==> public constructor LinkedList<E : (Any..Any?)>() defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'it' @ [53:57] ==> value-parameter it: String defined in test.collections.CollectionJVMTest.filterIntoLinkedList.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [53:60] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [55:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'foo' @ [56:13] ==> val foo: LinkedList<String> defined in test.collections.CollectionJVMTest.filterIntoLinkedList[LocalVariableDescriptor]

'all' @ [56:17] ==> public inline fun <T> Iterable<String>.all(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [56:23] ==> value-parameter it: String defined in test.collections.CollectionJVMTest.filterIntoLinkedList.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [56:26] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [58:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'foo' @ [58:25] ==> val foo: LinkedList<String> defined in test.collections.CollectionJVMTest.filterIntoLinkedList[LocalVariableDescriptor]

'size' @ [58:29] ==> public open val size: Int defined in java.util.LinkedList[JavaPropertyDescriptor]

'assertEquals' @ [59:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [59:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'foo' @ [59:37] ==> val foo: LinkedList<String> defined in test.collections.CollectionJVMTest.filterIntoLinkedList[LocalVariableDescriptor]

'assertTrue' @ [61:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'foo' @ [62:13] ==> val foo: LinkedList<String> defined in test.collections.CollectionJVMTest.filterIntoLinkedList[LocalVariableDescriptor]

'Test' @ [66:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [67:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [68:19] ==> val data: List<String> defined in test.collections.CollectionJVMTest.filterNotIntoLinkedListOf[LocalVariableDescriptor]

'filterNotTo' @ [68:24] ==> public inline fun <T, C : MutableCollection<in String>> Iterable<String>.filterNotTo(destination: LinkedList<String>, predicate: (String) -> Boolean): LinkedList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <C : MutableCollection<in T>> -> LinkedList<String>

'LinkedList' @ [68:36] ==> public constructor LinkedList<E : (Any..Any?)>() defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'it' @ [68:60] ==> value-parameter it: String defined in test.collections.CollectionJVMTest.filterNotIntoLinkedListOf.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [68:63] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [70:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'foo' @ [71:13] ==> val foo: LinkedList<String> defined in test.collections.CollectionJVMTest.filterNotIntoLinkedListOf[LocalVariableDescriptor]

'all' @ [71:17] ==> public inline fun <T> Iterable<String>.all(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'!' @ [71:23] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [71:24] ==> value-parameter it: String defined in test.collections.CollectionJVMTest.filterNotIntoLinkedListOf.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [71:27] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [73:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'foo' @ [73:25] ==> val foo: LinkedList<String> defined in test.collections.CollectionJVMTest.filterNotIntoLinkedListOf[LocalVariableDescriptor]

'size' @ [73:29] ==> public open val size: Int defined in java.util.LinkedList[JavaPropertyDescriptor]

'assertEquals' @ [74:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [74:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'foo' @ [74:37] ==> val foo: LinkedList<String> defined in test.collections.CollectionJVMTest.filterNotIntoLinkedListOf[LocalVariableDescriptor]

'assertTrue' @ [76:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'foo' @ [77:13] ==> val foo: LinkedList<String> defined in test.collections.CollectionJVMTest.filterNotIntoLinkedListOf[LocalVariableDescriptor]

'Test' @ [81:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [82:20] ==> public fun <T> listOf(vararg elements: String?): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'data' @ [83:19] ==> val data: List<String?> defined in test.collections.CollectionJVMTest.filterNotNullIntoLinkedListOf[LocalVariableDescriptor]

'filterNotNullTo' @ [83:24] ==> public fun <C : MutableCollection<in String>, T : Any> Iterable<String?>.filterNotNullTo(destination: LinkedList<String>): LinkedList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <C : MutableCollection<in T>> -> LinkedList<String>
    <T : Any> -> String

'LinkedList' @ [83:40] ==> public constructor LinkedList<E : (Any..Any?)>() defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'assertEquals' @ [85:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'foo' @ [85:25] ==> val foo: LinkedList<String> defined in test.collections.CollectionJVMTest.filterNotNullIntoLinkedListOf[LocalVariableDescriptor]

'size' @ [85:29] ==> public open val size: Int defined in java.util.LinkedList[JavaPropertyDescriptor]

'assertEquals' @ [86:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: LinkedList<String>, actual: LinkedList<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> LinkedList<String>

'LinkedList' @ [86:22] ==> public constructor LinkedList<E : (Any..Any?)>(p0: (MutableCollection<out (String..String?)>..Collection<(String..String?)>?)) defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'listOf' @ [86:33] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'foo' @ [86:56] ==> val foo: LinkedList<String> defined in test.collections.CollectionJVMTest.filterNotNullIntoLinkedListOf[LocalVariableDescriptor]

'assertTrue' @ [88:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'foo' @ [89:13] ==> val foo: LinkedList<String> defined in test.collections.CollectionJVMTest.filterNotNullIntoLinkedListOf[LocalVariableDescriptor]

'Test' @ [93:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [94:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [95:22] ==> val data: List<String> defined in test.collections.CollectionJVMTest.filterIntoSortedSet[LocalVariableDescriptor]

'filterTo' @ [95:27] ==> public inline fun <T, C : MutableCollection<in String>> Iterable<String>.filterTo(destination: TreeSet<String> /* = TreeSet<String> */, predicate: (String) -> Boolean): TreeSet<String> /* = TreeSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <C : MutableCollection<in T>> -> TreeSet<String>

'sortedSetOf' @ [95:36] ==> public fun <T> sortedSetOf(vararg elements: String): TreeSet<String> /* = TreeSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [95:61] ==> value-parameter it: String defined in test.collections.CollectionJVMTest.filterIntoSortedSet.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [95:64] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'assertEquals' @ [96:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'sorted' @ [96:25] ==> val sorted: TreeSet<String> /* = TreeSet<String> */ defined in test.collections.CollectionJVMTest.filterIntoSortedSet[LocalVariableDescriptor]

'size' @ [96:32] ==> public open val size: Int defined in java.util.TreeSet[JavaPropertyDescriptor]

'assertEquals' @ [97:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: TreeSet<String> /* = TreeSet<String> */, actual: TreeSet<String> /* = TreeSet<String> */, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> TreeSet<String>

'sortedSetOf' @ [97:22] ==> public fun <T> sortedSetOf(vararg elements: String): TreeSet<String> /* = TreeSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sorted' @ [97:49] ==> val sorted: TreeSet<String> /* = TreeSet<String> */ defined in test.collections.CollectionJVMTest.filterIntoSortedSet[LocalVariableDescriptor]

'assertTrue' @ [98:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'sorted' @ [99:13] ==> val sorted: TreeSet<String> /* = TreeSet<String> */ defined in test.collections.CollectionJVMTest.filterIntoSortedSet[LocalVariableDescriptor]

'Test' @ [103:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [104:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (Int..Int?), actual: (Int..Int?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (kotlin.Int..kotlin.Int?)

'TreeSet' @ [104:26] ==> public constructor TreeSet<E : (Any..Any?)>(p0: (MutableCollection<out (Int..Int?)>..Collection<(Int..Int?)>?)) defined in java.util.TreeSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Int

'listOf' @ [104:34] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'first' @ [104:54] ==> public open fun first(): (Int..Int?) defined in java.util.TreeSet[JavaMethodDescriptor]

'Test' @ [107:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [108:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [109:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [109:29] ==> val data: List<String> defined in test.collections.CollectionJVMTest.last[LocalVariableDescriptor]

'last' @ [109:34] ==> public fun <T> List<String>.last(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [110:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'listOf' @ [110:26] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'last' @ [110:49] ==> public fun <T> List<Int>.last(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [111:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Char, actual: Char, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Char

'LinkedList' @ [111:27] ==> public constructor LinkedList<E : (Any..Any?)>(p0: (MutableCollection<out (Char..Char?)>..Collection<(Char..Char?)>?)) defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Char

'listOf' @ [111:38] ==> public fun <T> listOf(element: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'last' @ [111:51] ==> public fun <T> List<Char>.last(): Char defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'Test' @ [114:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertFails' @ [115:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'LinkedList' @ [115:23] ==> public constructor LinkedList<E : (Any..Any?)>() defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'last' @ [115:44] ==> public fun <T> List<String>.last(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [118:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertTrue' @ [119:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'LinkedList' @ [119:20] ==> public constructor LinkedList<E : (Any..Any?)>(p0: (MutableCollection<out (Int..Int?)>..Collection<(Int..Int?)>?)) defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Int

'listOf' @ [119:31] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'contains' @ [119:51] ==> public open fun contains(element: Int): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'Test' @ [122:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [123:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [124:19] ==> val data: List<String> defined in test.collections.CollectionJVMTest.toArray[LocalVariableDescriptor]

'toTypedArray' @ [124:24] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'println' @ [125:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'arr' @ [125:30] ==> val arr: Array<String> defined in test.collections.CollectionJVMTest.toArray[LocalVariableDescriptor]

'assertEquals' @ [126:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'arr' @ [126:25] ==> val arr: Array<String> defined in test.collections.CollectionJVMTest.toArray[LocalVariableDescriptor]

'size' @ [126:29] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'todo' @ [127:9] ==> @InlineOnly public inline fun todo(block: () -> Unit): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [128:13] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'arr' @ [129:17] ==> val arr: Array<String> defined in test.collections.CollectionJVMTest.toArray[LocalVariableDescriptor]

'isArrayOf' @ [129:21] ==> public fun <reified T : Any> Array<*>.isArrayOf(): Boolean defined in kotlin.jvm[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> String

'Test' @ [134:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [135:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [136:20] ==> val data: List<String> defined in test.collections.CollectionJVMTest.toSortedSet[LocalVariableDescriptor]

'toSortedSet' @ [136:25] ==> public fun <T : Comparable<String>> Iterable<String>.toSortedSet(): SortedSet<String> /* = SortedSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'assertEquals' @ [137:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [137:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'set1' @ [137:51] ==> val set1: SortedSet<String> /* = SortedSet<String> */ defined in test.collections.CollectionJVMTest.toSortedSet[LocalVariableDescriptor]

'toList' @ [137:56] ==> public fun <T> Iterable<(String..String?)>.toList(): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'data' @ [139:20] ==> val data: List<String> defined in test.collections.CollectionJVMTest.toSortedSet[LocalVariableDescriptor]

'toSortedSet' @ [139:25] ==> public fun <T> Iterable<String>.toSortedSet(comparator: Comparator<in String> /* = Comparator<in String> */): SortedSet<String> /* = SortedSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'reverseOrder' @ [139:37] ==> public fun <T : Comparable<String>> reverseOrder(): Comparator<String> /* = Comparator<String> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'assertEquals' @ [140:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [140:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'set2' @ [140:51] ==> val set2: SortedSet<String> /* = SortedSet<String> */ defined in test.collections.CollectionJVMTest.toSortedSet[LocalVariableDescriptor]

'toList' @ [140:56] ==> public fun <T> Iterable<(String..String?)>.toList(): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'data' @ [142:20] ==> val data: List<String> defined in test.collections.CollectionJVMTest.toSortedSet[LocalVariableDescriptor]

'toSortedSet' @ [142:25] ==> public fun <T> Iterable<String>.toSortedSet(comparator: Comparator<in String> /* = Comparator<in String> */): SortedSet<String> /* = SortedSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'String' @ [142:37] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'CASE_INSENSITIVE_ORDER' @ [142:44] ==> public val String.Companion.CASE_INSENSITIVE_ORDER: Comparator<String> defined in kotlin.text[DeserializedPropertyDescriptor]

'assertEquals' @ [143:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [143:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'set3' @ [143:44] ==> val set3: SortedSet<String> /* = SortedSet<String> */ defined in test.collections.CollectionJVMTest.toSortedSet[LocalVariableDescriptor]

'toList' @ [143:49] ==> public fun <T> Iterable<(String..String?)>.toList(): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'Test' @ [146:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [147:9] ==> public fun <@OnlyInputTypes T> expect(expected: Set<Int>, block: () -> Set<Int>): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<Int>

'setOf' @ [147:16] ==> public fun <T> setOf(vararg elements: Int): Set<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'sortedSetOf' @ [147:31] ==> public fun <T> sortedSetOf(vararg elements: Int): TreeSet<Int> /* = TreeSet<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'take' @ [147:58] ==> public fun <T> Iterable<Int>.take(n: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'toSet' @ [147:66] ==> public fun <T> Iterable<Int>.toSet(): Set<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [150:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [151:33] ==> public fun <T> listOf(vararg elements: {Comparable<{Long & Byte & Short & Double & String & Int}> & java.io.Serializable}): List<{Comparable<{Long & Byte & Short & Double & String & Int}> & java.io.Serializable}> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> {Comparable<{Long & Byte & Short & Double & String & Int}> & java.io.Serializable}

'toDouble' @ [151:48] ==> public open fun toDouble(): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'values' @ [153:36] ==> val values: List<Any> defined in test.collections.CollectionJVMTest.filterIsInstanceList[LocalVariableDescriptor]

'filterIsInstance' @ [153:43] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> Int

'assertEquals' @ [154:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [154:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'intValues' @ [154:36] ==> val intValues: List<Int> defined in test.collections.CollectionJVMTest.filterIsInstanceList[LocalVariableDescriptor]

'values' @ [156:42] ==> val values: List<Any> defined in test.collections.CollectionJVMTest.filterIsInstanceList[LocalVariableDescriptor]

'filterIsInstance' @ [156:49] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<Double> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> Double

'assertEquals' @ [157:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Double>, actual: List<Double>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Double>

'listOf' @ [157:22] ==> public fun <T> listOf(element: Double): List<Double> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Double

'doubleValues' @ [157:35] ==> val doubleValues: List<Double> defined in test.collections.CollectionJVMTest.filterIsInstanceList[LocalVariableDescriptor]

'values' @ [159:42] ==> val values: List<Any> defined in test.collections.CollectionJVMTest.filterIsInstanceList[LocalVariableDescriptor]

'filterIsInstance' @ [159:49] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> String

'assertEquals' @ [160:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [160:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'stringValues' @ [160:44] ==> val stringValues: List<String> defined in test.collections.CollectionJVMTest.filterIsInstanceList[LocalVariableDescriptor]

'values' @ [162:36] ==> val values: List<Any> defined in test.collections.CollectionJVMTest.filterIsInstanceList[LocalVariableDescriptor]

'filterIsInstance' @ [162:43] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> Any

'assertEquals' @ [163:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Any>, actual: List<Any>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Any>

'values' @ [163:22] ==> val values: List<Any> defined in test.collections.CollectionJVMTest.filterIsInstanceList[LocalVariableDescriptor]

'toList' @ [163:29] ==> public fun <T> Iterable<Any>.toList(): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'anyValues' @ [163:39] ==> val anyValues: List<Any> defined in test.collections.CollectionJVMTest.filterIsInstanceList[LocalVariableDescriptor]

'values' @ [165:38] ==> val values: List<Any> defined in test.collections.CollectionJVMTest.filterIsInstanceList[LocalVariableDescriptor]

'filterIsInstance' @ [165:45] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> Char

'assertEquals' @ [166:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'charValues' @ [166:25] ==> val charValues: List<Char> defined in test.collections.CollectionJVMTest.filterIsInstanceList[LocalVariableDescriptor]

'size' @ [166:36] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'Test' @ [169:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'arrayOf' @ [170:31] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Any): Array<Any> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Any

'toDouble' @ [170:47] ==> public open fun toDouble(): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'src' @ [172:36] ==> val src: Array<Any> defined in test.collections.CollectionJVMTest.filterIsInstanceArray[LocalVariableDescriptor]

'filterIsInstance' @ [172:40] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> Int

'assertEquals' @ [173:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [173:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'intValues' @ [173:36] ==> val intValues: List<Int> defined in test.collections.CollectionJVMTest.filterIsInstanceArray[LocalVariableDescriptor]

'src' @ [175:42] ==> val src: Array<Any> defined in test.collections.CollectionJVMTest.filterIsInstanceArray[LocalVariableDescriptor]

'filterIsInstance' @ [175:46] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<Double> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> Double

'assertEquals' @ [176:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Double>, actual: List<Double>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Double>

'listOf' @ [176:22] ==> public fun <T> listOf(element: Double): List<Double> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Double

'doubleValues' @ [176:35] ==> val doubleValues: List<Double> defined in test.collections.CollectionJVMTest.filterIsInstanceArray[LocalVariableDescriptor]

'src' @ [178:42] ==> val src: Array<Any> defined in test.collections.CollectionJVMTest.filterIsInstanceArray[LocalVariableDescriptor]

'filterIsInstance' @ [178:46] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> String

'assertEquals' @ [179:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [179:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'stringValues' @ [179:44] ==> val stringValues: List<String> defined in test.collections.CollectionJVMTest.filterIsInstanceArray[LocalVariableDescriptor]

'src' @ [181:36] ==> val src: Array<Any> defined in test.collections.CollectionJVMTest.filterIsInstanceArray[LocalVariableDescriptor]

'filterIsInstance' @ [181:40] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> Any

'assertEquals' @ [182:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Any>, actual: List<Any>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Any>

'src' @ [182:22] ==> val src: Array<Any> defined in test.collections.CollectionJVMTest.filterIsInstanceArray[LocalVariableDescriptor]

'toList' @ [182:26] ==> public fun <T> Array<out Any>.toList(): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'anyValues' @ [182:36] ==> val anyValues: List<Any> defined in test.collections.CollectionJVMTest.filterIsInstanceArray[LocalVariableDescriptor]

'src' @ [184:38] ==> val src: Array<Any> defined in test.collections.CollectionJVMTest.filterIsInstanceArray[LocalVariableDescriptor]

'filterIsInstance' @ [184:42] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> Char

'assertEquals' @ [185:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'charValues' @ [185:25] ==> val charValues: List<Char> defined in test.collections.CollectionJVMTest.filterIsInstanceArray[LocalVariableDescriptor]

'size' @ [185:36] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'Test' @ [188:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testSingletonSerialization' @ [188:43] ==> private final fun testSingletonSerialization(value: Any): Unit defined in test.collections.CollectionJVMTest[SimpleFunctionDescriptorImpl]

'emptyList' @ [188:70] ==> public fun <T> emptyList(): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'Test' @ [190:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testSingletonSerialization' @ [190:42] ==> private final fun testSingletonSerialization(value: Any): Unit defined in test.collections.CollectionJVMTest[SimpleFunctionDescriptorImpl]

'emptySet' @ [190:69] ==> public fun <T> emptySet(): Set<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'Test' @ [192:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testSingletonSerialization' @ [192:42] ==> private final fun testSingletonSerialization(value: Any): Unit defined in test.collections.CollectionJVMTest[SimpleFunctionDescriptorImpl]

'emptyMap' @ [192:69] ==> public fun <K, V> emptyMap(): Map<Any, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any
    <V> -> Any

'serializeAndDeserialize' @ [195:22] ==> public fun <T> serializeAndDeserialize(value: Any): Any defined in test.io[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any

'value' @ [195:46] ==> value-parameter value: Any defined in test.collections.CollectionJVMTest.testSingletonSerialization[ValueParameterDescriptorImpl]

'assertEquals' @ [197:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Any, actual: Any, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Any

'value' @ [197:22] ==> value-parameter value: Any defined in test.collections.CollectionJVMTest.testSingletonSerialization[ValueParameterDescriptorImpl]

'result' @ [197:29] ==> val result: Any defined in test.collections.CollectionJVMTest.testSingletonSerialization[LocalVariableDescriptor]

'assertTrue' @ [198:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'value' @ [198:20] ==> value-parameter value: Any defined in test.collections.CollectionJVMTest.testSingletonSerialization[ValueParameterDescriptorImpl]

'result' @ [198:30] ==> val result: Any defined in test.collections.CollectionJVMTest.testSingletonSerialization[LocalVariableDescriptor]

'Test' @ [201:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPersistedDeserialization' @ [201:40] ==> private final fun testPersistedDeserialization(hexValue: String, expected: Any): Unit defined in test.collections.CollectionJVMTest[SimpleFunctionDescriptorImpl]

'emptyList' @ [203:13] ==> public fun <T> emptyList(): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'Test' @ [205:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPersistedDeserialization' @ [205:39] ==> private final fun testPersistedDeserialization(hexValue: String, expected: Any): Unit defined in test.collections.CollectionJVMTest[SimpleFunctionDescriptorImpl]

'emptySet' @ [207:13] ==> public fun <T> emptySet(): Set<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'Test' @ [209:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPersistedDeserialization' @ [209:39] ==> private final fun testPersistedDeserialization(hexValue: String, expected: Any): Unit defined in test.collections.CollectionJVMTest[SimpleFunctionDescriptorImpl]

'emptyMap' @ [211:13] ==> public fun <K, V> emptyMap(): Map<Any, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any
    <V> -> Any

'deserializeFromHex' @ [214:22] ==> public fun <T> deserializeFromHex(value: String): Any defined in test.io[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any

'hexValue' @ [214:46] ==> value-parameter hexValue: String defined in test.collections.CollectionJVMTest.testPersistedDeserialization[ValueParameterDescriptorImpl]

'assertEquals' @ [215:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Any, actual: Any, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Any

'expected' @ [215:22] ==> value-parameter expected: Any defined in test.collections.CollectionJVMTest.testPersistedDeserialization[ValueParameterDescriptorImpl]

'actual' @ [215:32] ==> val actual: Any defined in test.collections.CollectionJVMTest.testPersistedDeserialization[LocalVariableDescriptor]

