'Test' @ [27:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'List' @ [28:20] ==> @SinceKotlin @InlineOnly public inline fun <T> List(size: Int, init: (index: Int) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'repeat' @ [28:43] ==> public fun CharSequence.repeat(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'index' @ [28:50] ==> value-parameter index: Int defined in test.collections.CollectionTest.createListWithInit.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [29:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'list' @ [29:25] ==> val list: List<String> defined in test.collections.CollectionTest.createListWithInit[LocalVariableDescriptor]

'size' @ [29:30] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [30:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [30:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'list' @ [30:48] ==> val list: List<String> defined in test.collections.CollectionTest.createListWithInit[LocalVariableDescriptor]

'Test' @ [33:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [34:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'StringBuilder' @ [35:22] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'data' @ [36:9] ==> val data: List<String> defined in test.collections.CollectionTest.joinTo[LocalVariableDescriptor]

'joinTo' @ [36:14] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<String>.joinTo(buffer: StringBuilder /* = StringBuilder */, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): StringBuilder /* = StringBuilder */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <A : Appendable /* = Appendable */> -> StringBuilder

'buffer' @ [36:21] ==> val buffer: StringBuilder /* = StringBuilder */ defined in test.collections.CollectionTest.joinTo[LocalVariableDescriptor]

'assertEquals' @ [37:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'buffer' @ [37:35] ==> val buffer: StringBuilder /* = StringBuilder */ defined in test.collections.CollectionTest.joinTo[LocalVariableDescriptor]

'toString' @ [37:42] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'Test' @ [40:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [41:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [42:20] ==> val data: List<String> defined in test.collections.CollectionTest.joinToString[LocalVariableDescriptor]

'joinToString' @ [42:25] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [43:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'text' @ [43:35] ==> val text: String defined in test.collections.CollectionTest.joinToString[LocalVariableDescriptor]

'listOf' @ [45:21] ==> public fun <T> listOf(vararg elements: Serializable?): List<Serializable?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> java.io.Serializable?

'StringBuilder' @ [45:38] ==> public final fun <init>(p0: (String..String?)): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'mixed' @ [46:21] ==> val mixed: List<Serializable?> defined in test.collections.CollectionTest.joinToString[LocalVariableDescriptor]

'joinToString' @ [46:27] ==> public fun <T> Iterable<Serializable?>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Serializable?) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> java.io.Serializable?

'assertEquals' @ [47:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'text2' @ [47:42] ==> val text2: String defined in test.collections.CollectionTest.joinToString[LocalVariableDescriptor]

'Test' @ [50:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [51:20] ==> public fun <T> listOf(vararg elements: String?): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'data' @ [52:19] ==> val data: List<String?> defined in test.collections.CollectionTest.filterNotNull[LocalVariableDescriptor]

'filterNotNull' @ [52:24] ==> public fun <T : Any> Iterable<String?>.filterNotNull(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'assertEquals' @ [54:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'foo' @ [54:25] ==> val foo: List<String> defined in test.collections.CollectionTest.filterNotNull[LocalVariableDescriptor]

'size' @ [54:29] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [55:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [55:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'foo' @ [55:44] ==> val foo: List<String> defined in test.collections.CollectionTest.filterNotNull[LocalVariableDescriptor]

'assertTrue' @ [57:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'foo' @ [58:13] ==> val foo: List<String> defined in test.collections.CollectionTest.filterNotNull[LocalVariableDescriptor]

'Test' @ [75:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOfNotNull' @ [76:29] ==> public fun <T : Any> listOfNotNull(element: Int?): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Int

'assertTrue' @ [77:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'l1' @ [77:20] ==> val l1: List<Int> defined in test.collections.CollectionTest.listOfNotNull[LocalVariableDescriptor]

'isEmpty' @ [77:23] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'listOfNotNull' @ [80:32] ==> public fun <T : Any> listOfNotNull(element: String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

's' @ [80:46] ==> val s: String? defined in test.collections.CollectionTest.listOfNotNull[LocalVariableDescriptor]

'assertEquals' @ [81:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

's' @ [81:22] ==> val s: String? defined in test.collections.CollectionTest.listOfNotNull[LocalVariableDescriptor]

'l2' @ [81:25] ==> val l2: List<String> defined in test.collections.CollectionTest.listOfNotNull[LocalVariableDescriptor]

'single' @ [81:28] ==> public fun <T> List<String>.single(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOfNotNull' @ [83:32] ==> public fun <T : Any> listOfNotNull(vararg elements: String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'assertEquals' @ [84:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [84:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'l3' @ [84:50] ==> val l3: List<String> defined in test.collections.CollectionTest.listOfNotNull[LocalVariableDescriptor]

'Test' @ [87:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [88:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [89:19] ==> val data: List<String> defined in test.collections.CollectionTest.filterIntoSet[LocalVariableDescriptor]

'filterTo' @ [89:24] ==> public inline fun <T, C : MutableCollection<in String>> Iterable<String>.filterTo(destination: HashSet<String> /* = HashSet<String> */, predicate: (String) -> Boolean): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <C : MutableCollection<in T>> -> HashSet<String>

'hashSetOf' @ [89:33] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [89:56] ==> value-parameter it: String defined in test.collections.CollectionTest.filterIntoSet.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [89:59] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [91:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'foo' @ [92:13] ==> val foo: HashSet<String> /* = HashSet<String> */ defined in test.collections.CollectionTest.filterIntoSet[LocalVariableDescriptor]

'all' @ [92:17] ==> public inline fun <T> Iterable<String>.all(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [92:23] ==> value-parameter it: String defined in test.collections.CollectionTest.filterIntoSet.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [92:26] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [94:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'foo' @ [94:25] ==> val foo: HashSet<String> /* = HashSet<String> */ defined in test.collections.CollectionTest.filterIntoSet[LocalVariableDescriptor]

'size' @ [94:29] ==> public open val size: Int defined in java.util.HashSet[JavaPropertyDescriptor]

'assertEquals' @ [95:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: HashSet<String> /* = HashSet<String> */, actual: HashSet<String> /* = HashSet<String> */, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> HashSet<String>

'hashSetOf' @ [95:22] ==> public fun <T> hashSetOf(vararg elements: String): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'foo' @ [95:40] ==> val foo: HashSet<String> /* = HashSet<String> */ defined in test.collections.CollectionTest.filterIntoSet[LocalVariableDescriptor]

'assertTrue' @ [97:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'foo' @ [98:13] ==> val foo: HashSet<String> /* = HashSet<String> */ defined in test.collections.CollectionTest.filterIntoSet[LocalVariableDescriptor]

'Test' @ [102:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [103:33] ==> public fun <T> listOf(vararg elements: {Comparable<{Long & Byte & Short & Double & String & Int}> & java.io.Serializable}): List<{Comparable<{Long & Byte & Short & Double & String & Int}> & java.io.Serializable}> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> {Comparable<{Long & Byte & Short & Double & String & Int}> & java.io.Serializable}

'values' @ [105:42] ==> val values: List<Any> defined in test.collections.CollectionTest.filterIsInstanceList[LocalVariableDescriptor]

'filterIsInstance' @ [105:49] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<Number> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> Number

'assertEquals' @ [106:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Number>, actual: List<Number>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Number>

'listOf' @ [106:22] ==> public fun <T> listOf(vararg elements: {Number & Comparable<{Long & Byte & Short & Double & Int}>}): List<{Number & Comparable<{Long & Byte & Short & Double & Int}>}> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> {Number & Comparable<{Long & Byte & Short & Double & Int}>}

'numberValues' @ [106:41] ==> val numberValues: List<Number> defined in test.collections.CollectionTest.filterIsInstanceList[LocalVariableDescriptor]

'values' @ [112:42] ==> val values: List<Any> defined in test.collections.CollectionTest.filterIsInstanceList[LocalVariableDescriptor]

'filterIsInstance' @ [112:49] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> String

'assertEquals' @ [113:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [113:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'stringValues' @ [113:44] ==> val stringValues: List<String> defined in test.collections.CollectionTest.filterIsInstanceList[LocalVariableDescriptor]

'values' @ [119:38] ==> val values: List<Any> defined in test.collections.CollectionTest.filterIsInstanceList[LocalVariableDescriptor]

'filterIsInstance' @ [119:45] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> Char

'assertEquals' @ [120:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'charValues' @ [120:25] ==> val charValues: List<Char> defined in test.collections.CollectionTest.filterIsInstanceList[LocalVariableDescriptor]

'size' @ [120:36] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'Test' @ [123:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'arrayOf' @ [124:31] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Any): Array<Any> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Any

'src' @ [126:42] ==> val src: Array<Any> defined in test.collections.CollectionTest.filterIsInstanceArray[LocalVariableDescriptor]

'filterIsInstance' @ [126:46] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<Number> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> Number

'assertEquals' @ [127:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Number>, actual: List<Number>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Number>

'listOf' @ [127:22] ==> public fun <T> listOf(vararg elements: {Number & Comparable<{Long & Byte & Short & Double & Int}>}): List<{Number & Comparable<{Long & Byte & Short & Double & Int}>}> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> {Number & Comparable<{Long & Byte & Short & Double & Int}>}

'numberValues' @ [127:41] ==> val numberValues: List<Number> defined in test.collections.CollectionTest.filterIsInstanceArray[LocalVariableDescriptor]

'src' @ [133:42] ==> val src: Array<Any> defined in test.collections.CollectionTest.filterIsInstanceArray[LocalVariableDescriptor]

'filterIsInstance' @ [133:46] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> String

'assertEquals' @ [134:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [134:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'stringValues' @ [134:44] ==> val stringValues: List<String> defined in test.collections.CollectionTest.filterIsInstanceArray[LocalVariableDescriptor]

'src' @ [140:38] ==> val src: Array<Any> defined in test.collections.CollectionTest.filterIsInstanceArray[LocalVariableDescriptor]

'filterIsInstance' @ [140:42] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> Char

'assertEquals' @ [141:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'charValues' @ [141:25] ==> val charValues: List<Char> defined in test.collections.CollectionTest.filterIsInstanceArray[LocalVariableDescriptor]

'size' @ [141:36] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'Test' @ [144:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [145:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'listOf' @ [146:27] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'numbers' @ [147:13] ==> val numbers: List<Int> defined in test.collections.CollectionTest.foldIndexed.<anonymous>[LocalVariableDescriptor]

'foldIndexed' @ [147:21] ==> public inline fun <T, R> Iterable<Int>.foldIndexed(initial: Int, operation: (index: Int, Int, Int) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'index' @ [147:53] ==> value-parameter index: Int defined in test.collections.CollectionTest.foldIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'a' @ [147:62] ==> value-parameter a: Int defined in test.collections.CollectionTest.foldIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [147:66] ==> value-parameter b: Int defined in test.collections.CollectionTest.foldIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [150:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'arrayListOf' @ [151:27] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Int> /* = ArrayList<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'numbers' @ [152:13] ==> val numbers: ArrayList<Int> /* = ArrayList<Int> */ defined in test.collections.CollectionTest.foldIndexed.<anonymous>[LocalVariableDescriptor]

'foldIndexed' @ [152:21] ==> public inline fun <T, R> Iterable<Int>.foldIndexed(initial: Int, operation: (index: Int, Int, Int) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'index' @ [152:53] ==> value-parameter index: Int defined in test.collections.CollectionTest.foldIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'a' @ [152:62] ==> value-parameter a: Int defined in test.collections.CollectionTest.foldIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [152:66] ==> value-parameter b: Int defined in test.collections.CollectionTest.foldIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [155:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'listOf' @ [156:27] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'numbers' @ [157:13] ==> val numbers: List<Int> defined in test.collections.CollectionTest.foldIndexed.<anonymous>[LocalVariableDescriptor]

'map' @ [157:21] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> String

'it' @ [157:27] ==> value-parameter it: Int defined in test.collections.CollectionTest.foldIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [157:30] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'foldIndexed' @ [157:43] ==> public inline fun <T, R> Iterable<String>.foldIndexed(initial: String, operation: (index: Int, String, String) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'if (index == 0) a + b + b else a + b' @ [157:76] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [157:80] ==> value-parameter index: Int defined in test.collections.CollectionTest.foldIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'a' @ [157:92] ==> value-parameter a: String defined in test.collections.CollectionTest.foldIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [157:96] ==> value-parameter b: String defined in test.collections.CollectionTest.foldIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [157:100] ==> value-parameter b: String defined in test.collections.CollectionTest.foldIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'a' @ [157:107] ==> value-parameter a: String defined in test.collections.CollectionTest.foldIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [157:111] ==> value-parameter b: String defined in test.collections.CollectionTest.foldIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [161:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [162:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'listOf' @ [163:27] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'numbers' @ [164:13] ==> val numbers: List<String> defined in test.collections.CollectionTest.foldIndexedWithDifferentTypes.<anonymous>[LocalVariableDescriptor]

'foldIndexed' @ [164:21] ==> public inline fun <T, R> Iterable<String>.foldIndexed(initial: Int, operation: (index: Int, Int, String) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Int

'a' @ [164:53] ==> value-parameter a: Int defined in test.collections.CollectionTest.foldIndexedWithDifferentTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [164:57] ==> value-parameter b: String defined in test.collections.CollectionTest.foldIndexedWithDifferentTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [164:59] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'index' @ [164:68] ==> value-parameter index: Int defined in test.collections.CollectionTest.foldIndexedWithDifferentTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [167:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'listOf' @ [168:27] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'numbers' @ [169:13] ==> val numbers: List<Int> defined in test.collections.CollectionTest.foldIndexedWithDifferentTypes.<anonymous>[LocalVariableDescriptor]

'foldIndexed' @ [169:21] ==> public inline fun <T, R> Iterable<Int>.foldIndexed(initial: String, operation: (index: Int, String, Int) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> String

'a' @ [169:54] ==> value-parameter a: String defined in test.collections.CollectionTest.foldIndexedWithDifferentTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [169:58] ==> value-parameter b: Int defined in test.collections.CollectionTest.foldIndexedWithDifferentTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [169:63] ==> value-parameter index: Int defined in test.collections.CollectionTest.foldIndexedWithDifferentTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [173:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [174:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'listOf' @ [175:27] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'numbers' @ [176:13] ==> val numbers: List<Int> defined in test.collections.CollectionTest.foldIndexedWithNonCommutativeOperation.<anonymous>[LocalVariableDescriptor]

'foldIndexed' @ [176:21] ==> public inline fun <T, R> Iterable<Int>.foldIndexed(initial: Int, operation: (index: Int, Int, Int) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'index' @ [176:53] ==> value-parameter index: Int defined in test.collections.CollectionTest.foldIndexedWithNonCommutativeOperation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'a' @ [176:61] ==> value-parameter a: Int defined in test.collections.CollectionTest.foldIndexedWithNonCommutativeOperation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [176:65] ==> value-parameter b: Int defined in test.collections.CollectionTest.foldIndexedWithNonCommutativeOperation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [180:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [181:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'listOf' @ [182:27] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'numbers' @ [183:13] ==> val numbers: List<Int> defined in test.collections.CollectionTest.foldRightIndexed.<anonymous>[LocalVariableDescriptor]

'map' @ [183:21] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> String

'it' @ [183:27] ==> value-parameter it: Int defined in test.collections.CollectionTest.foldRightIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [183:30] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'foldRightIndexed' @ [183:43] ==> public inline fun <T, R> List<String>.foldRightIndexed(initial: String, operation: (index: Int, String, String) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'a' @ [183:81] ==> value-parameter a: String defined in test.collections.CollectionTest.foldRightIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [183:85] ==> value-parameter b: String defined in test.collections.CollectionTest.foldRightIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [183:89] ==> value-parameter index: Int defined in test.collections.CollectionTest.foldRightIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [187:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [188:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'listOf' @ [189:27] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'numbers' @ [190:13] ==> val numbers: List<Int> defined in test.collections.CollectionTest.foldRightIndexedWithDifferentTypes.<anonymous>[LocalVariableDescriptor]

'foldRightIndexed' @ [190:21] ==> public inline fun <T, R> List<Int>.foldRightIndexed(initial: String, operation: (index: Int, Int, String) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> String

'+' @ [190:59] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'a' @ [190:64] ==> value-parameter a: Int defined in test.collections.CollectionTest.foldRightIndexedWithDifferentTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [190:68] ==> value-parameter b: String defined in test.collections.CollectionTest.foldRightIndexedWithDifferentTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [190:72] ==> value-parameter index: Int defined in test.collections.CollectionTest.foldRightIndexedWithDifferentTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [194:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [195:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [195:16] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [196:27] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'numbers' @ [197:13] ==> val numbers: List<Int> defined in test.collections.CollectionTest.foldRightIndexedWithNonCommutativeOperation.<anonymous>[LocalVariableDescriptor]

'foldRightIndexed' @ [197:21] ==> public inline fun <T, R> List<Int>.foldRightIndexed(initial: Int, operation: (index: Int, Int, Int) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'index' @ [197:58] ==> value-parameter index: Int defined in test.collections.CollectionTest.foldRightIndexedWithNonCommutativeOperation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'a' @ [197:66] ==> value-parameter a: Int defined in test.collections.CollectionTest.foldRightIndexedWithNonCommutativeOperation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [197:70] ==> value-parameter b: Int defined in test.collections.CollectionTest.foldRightIndexedWithNonCommutativeOperation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [201:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [203:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'listOf' @ [204:27] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'numbers' @ [205:13] ==> val numbers: List<Int> defined in test.collections.CollectionTest.fold.<anonymous>[LocalVariableDescriptor]

'fold' @ [205:21] ==> public inline fun <T, R> Iterable<Int>.fold(initial: Int, operation: (Int, Int) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'a' @ [205:39] ==> value-parameter a: Int defined in test.collections.CollectionTest.fold.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [205:43] ==> value-parameter b: Int defined in test.collections.CollectionTest.fold.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [208:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'arrayListOf' @ [209:27] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Int> /* = ArrayList<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'numbers' @ [210:13] ==> val numbers: ArrayList<Int> /* = ArrayList<Int> */ defined in test.collections.CollectionTest.fold.<anonymous>[LocalVariableDescriptor]

'fold' @ [210:21] ==> public inline fun <T, R> Iterable<Int>.fold(initial: Int, operation: (Int, Int) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'a' @ [210:39] ==> value-parameter a: Int defined in test.collections.CollectionTest.fold.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [210:43] ==> value-parameter b: Int defined in test.collections.CollectionTest.fold.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [214:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'listOf' @ [215:27] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'numbers' @ [216:13] ==> val numbers: List<Int> defined in test.collections.CollectionTest.fold.<anonymous>[LocalVariableDescriptor]

'map' @ [216:21] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> String

'it' @ [216:27] ==> value-parameter it: Int defined in test.collections.CollectionTest.fold.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [216:30] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'fold' @ [216:43] ==> public inline fun <T, R> Iterable<String>.fold(initial: String, operation: (String, String) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'a' @ [216:62] ==> value-parameter a: String defined in test.collections.CollectionTest.fold.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [216:66] ==> value-parameter b: String defined in test.collections.CollectionTest.fold.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [220:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [221:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'listOf' @ [222:27] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'numbers' @ [223:13] ==> val numbers: List<String> defined in test.collections.CollectionTest.foldWithDifferentTypes.<anonymous>[LocalVariableDescriptor]

'fold' @ [223:21] ==> public inline fun <T, R> Iterable<String>.fold(initial: Int, operation: (Int, String) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Int

'a' @ [223:39] ==> value-parameter a: Int defined in test.collections.CollectionTest.foldWithDifferentTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [223:43] ==> value-parameter b: String defined in test.collections.CollectionTest.foldWithDifferentTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [223:45] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'expect' @ [226:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'listOf' @ [227:27] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'numbers' @ [228:13] ==> val numbers: List<Int> defined in test.collections.CollectionTest.foldWithDifferentTypes.<anonymous>[LocalVariableDescriptor]

'fold' @ [228:21] ==> public inline fun <T, R> Iterable<Int>.fold(initial: String, operation: (String, Int) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> String

'a' @ [228:40] ==> value-parameter a: String defined in test.collections.CollectionTest.foldWithDifferentTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [228:44] ==> value-parameter b: Int defined in test.collections.CollectionTest.foldWithDifferentTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [232:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [233:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'listOf' @ [234:27] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'numbers' @ [235:13] ==> val numbers: List<Int> defined in test.collections.CollectionTest.foldWithNonCommutativeOperation.<anonymous>[LocalVariableDescriptor]

'fold' @ [235:21] ==> public inline fun <T, R> Iterable<Int>.fold(initial: Int, operation: (Int, Int) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'a' @ [235:39] ==> value-parameter a: Int defined in test.collections.CollectionTest.foldWithNonCommutativeOperation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [235:43] ==> value-parameter b: Int defined in test.collections.CollectionTest.foldWithNonCommutativeOperation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [239:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [240:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'listOf' @ [241:27] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'numbers' @ [242:13] ==> val numbers: List<Int> defined in test.collections.CollectionTest.foldRight.<anonymous>[LocalVariableDescriptor]

'map' @ [242:21] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> String

'it' @ [242:27] ==> value-parameter it: Int defined in test.collections.CollectionTest.foldRight.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [242:30] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'foldRight' @ [242:43] ==> public inline fun <T, R> List<String>.foldRight(initial: String, operation: (String, String) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'a' @ [242:67] ==> value-parameter a: String defined in test.collections.CollectionTest.foldRight.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [242:71] ==> value-parameter b: String defined in test.collections.CollectionTest.foldRight.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [246:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [247:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'listOf' @ [248:27] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'numbers' @ [249:13] ==> val numbers: List<Int> defined in test.collections.CollectionTest.foldRightWithDifferentTypes.<anonymous>[LocalVariableDescriptor]

'foldRight' @ [249:21] ==> public inline fun <T, R> List<Int>.foldRight(initial: String, operation: (Int, String) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> String

'+' @ [249:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'a' @ [249:50] ==> value-parameter a: Int defined in test.collections.CollectionTest.foldRightWithDifferentTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [249:54] ==> value-parameter b: String defined in test.collections.CollectionTest.foldRightWithDifferentTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [253:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [254:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [254:16] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [255:27] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'numbers' @ [256:13] ==> val numbers: List<Int> defined in test.collections.CollectionTest.foldRightWithNonCommutativeOperation.<anonymous>[LocalVariableDescriptor]

'foldRight' @ [256:21] ==> public inline fun <T, R> List<Int>.foldRight(initial: Int, operation: (Int, Int) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'a' @ [256:44] ==> value-parameter a: Int defined in test.collections.CollectionTest.foldRightWithNonCommutativeOperation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [256:48] ==> value-parameter b: Int defined in test.collections.CollectionTest.foldRightWithNonCommutativeOperation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [260:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [262:9] ==> public fun <@OnlyInputTypes T> expect(expected: List<String>, block: () -> List<String>): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [262:16] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOf' @ [263:13] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'zip' @ [263:35] ==> public inline fun <T, R, V> Iterable<String>.zip(other: Iterable<String>, transform: (String, String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String
    <V> -> String

'listOf' @ [263:39] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'a' @ [263:72] ==> value-parameter a: String defined in test.collections.CollectionTest.zipTransform.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [263:76] ==> value-parameter b: String defined in test.collections.CollectionTest.zipTransform.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [267:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [269:9] ==> public fun <@OnlyInputTypes T> expect(expected: List<Pair<String, String>>, block: () -> List<Pair<String, String>>): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Pair<String, String>>

'listOf' @ [269:16] ==> public fun <T> listOf(vararg elements: Pair<String, String>): List<Pair<String, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, String>

'to' @ [269:23] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [269:35] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [269:47] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'listOf' @ [270:13] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'zip' @ [270:35] ==> public infix fun <T, R> Iterable<String>.zip(other: Iterable<String>): List<Pair<String, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'listOf' @ [270:39] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [274:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [275:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [276:20] ==> val data: List<String> defined in test.collections.CollectionTest.partition[LocalVariableDescriptor]

'partition' @ [276:25] ==> public inline fun <T> Iterable<String>.partition(predicate: (String) -> Boolean): Pair<List<String>, List<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [276:37] ==> value-parameter it: String defined in test.collections.CollectionTest.partition.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [276:40] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'assertEquals' @ [278:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [278:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'pair' @ [278:51] ==> val pair: Pair<List<String>, List<String>> defined in test.collections.CollectionTest.partition[LocalVariableDescriptor]

'first' @ [278:56] ==> public final val first: List<String> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'assertEquals' @ [279:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [279:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'pair' @ [279:43] ==> val pair: Pair<List<String>, List<String>> defined in test.collections.CollectionTest.partition[LocalVariableDescriptor]

'second' @ [279:48] ==> public final val second: List<String> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'Test' @ [282:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [283:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'listOf' @ [284:24] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'list' @ [285:13] ==> val list: List<String> defined in test.collections.CollectionTest.reduceIndexed.<anonymous>[LocalVariableDescriptor]

'reduceIndexed' @ [285:18] ==> public inline fun <S, T : String> Iterable<String>.reduceIndexed(operation: (index: Int, String, String) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> String
    <T : S> -> String

'if (index == 3) a else a + b' @ [285:49] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [285:53] ==> value-parameter index: Int defined in test.collections.CollectionTest.reduceIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'a' @ [285:65] ==> value-parameter a: String defined in test.collections.CollectionTest.reduceIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'a' @ [285:72] ==> value-parameter a: String defined in test.collections.CollectionTest.reduceIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [285:76] ==> value-parameter b: String defined in test.collections.CollectionTest.reduceIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [288:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'listOf' @ [289:13] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'reduceIndexed' @ [289:26] ==> public inline fun <S, T : Int> Iterable<Int>.reduceIndexed(operation: (index: Int, Int, Int) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> Int
    <T : S> -> Int

'assertEquals' @ [290:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'index' @ [290:33] ==> value-parameter index: Int defined in test.collections.CollectionTest.reduceIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [291:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Number, actual: Number, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Number

'acc' @ [291:33] ==> value-parameter acc: Number defined in test.collections.CollectionTest.reduceIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [292:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'e' @ [292:33] ==> value-parameter e: Int defined in test.collections.CollectionTest.reduceIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'acc' @ [293:17] ==> value-parameter acc: Number defined in test.collections.CollectionTest.reduceIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toInt' @ [293:21] ==> public abstract fun toInt(): Int defined in kotlin.Number[DeserializedSimpleFunctionDescriptor]

'e' @ [293:31] ==> value-parameter e: Int defined in test.collections.CollectionTest.reduceIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertFailsWith' @ [297:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> UnsupportedOperationException

'arrayListOf' @ [298:13] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Int> /* = ArrayList<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'reduceIndexed' @ [298:32] ==> public inline fun <S, T : Int> Iterable<Int>.reduceIndexed(operation: (index: Int, Int, Int) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> Int
    <T : S> -> Int

'index' @ [298:63] ==> value-parameter index: Int defined in test.collections.CollectionTest.reduceIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'a' @ [298:71] ==> value-parameter a: Int defined in test.collections.CollectionTest.reduceIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [298:75] ==> value-parameter b: Int defined in test.collections.CollectionTest.reduceIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [302:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [303:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'listOf' @ [304:24] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'list' @ [305:13] ==> val list: List<String> defined in test.collections.CollectionTest.reduceRightIndexed.<anonymous>[LocalVariableDescriptor]

'reduceRightIndexed' @ [305:18] ==> public inline fun <S, T : String> List<String>.reduceRightIndexed(operation: (index: Int, String, String) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> String
    <T : S> -> String

'if (index == 0) b else a + b' @ [305:54] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [305:58] ==> value-parameter index: Int defined in test.collections.CollectionTest.reduceRightIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [305:70] ==> value-parameter b: String defined in test.collections.CollectionTest.reduceRightIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'a' @ [305:77] ==> value-parameter a: String defined in test.collections.CollectionTest.reduceRightIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [305:81] ==> value-parameter b: String defined in test.collections.CollectionTest.reduceRightIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [308:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'listOf' @ [309:13] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'reduceRightIndexed' @ [309:26] ==> public inline fun <S, T : Int> List<Int>.reduceRightIndexed(operation: (index: Int, Int, Int) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> Int
    <T : S> -> Int

'assertEquals' @ [310:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'index' @ [310:33] ==> value-parameter index: Int defined in test.collections.CollectionTest.reduceRightIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [311:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Number, actual: Number, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Number

'acc' @ [311:33] ==> value-parameter acc: Number defined in test.collections.CollectionTest.reduceRightIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [312:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'e' @ [312:33] ==> value-parameter e: Int defined in test.collections.CollectionTest.reduceRightIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'acc' @ [313:17] ==> value-parameter acc: Number defined in test.collections.CollectionTest.reduceRightIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toInt' @ [313:21] ==> public abstract fun toInt(): Int defined in kotlin.Number[DeserializedSimpleFunctionDescriptor]

'e' @ [313:31] ==> value-parameter e: Int defined in test.collections.CollectionTest.reduceRightIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertFailsWith' @ [317:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> UnsupportedOperationException

'arrayListOf' @ [318:13] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Int> /* = ArrayList<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'reduceRightIndexed' @ [318:32] ==> public inline fun <S, T : Int> List<Int>.reduceRightIndexed(operation: (index: Int, Int, Int) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> Int
    <T : S> -> Int

'index' @ [318:68] ==> value-parameter index: Int defined in test.collections.CollectionTest.reduceRightIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'a' @ [318:76] ==> value-parameter a: Int defined in test.collections.CollectionTest.reduceRightIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [318:80] ==> value-parameter b: Int defined in test.collections.CollectionTest.reduceRightIndexed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [322:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [323:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'listOf' @ [324:24] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'list' @ [325:13] ==> val list: List<String> defined in test.collections.CollectionTest.reduce.<anonymous>[LocalVariableDescriptor]

'reduce' @ [325:18] ==> public inline fun <S, T : String> Iterable<String>.reduce(operation: (String, String) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> String
    <T : S> -> String

'a' @ [325:35] ==> value-parameter a: String defined in test.collections.CollectionTest.reduce.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [325:39] ==> value-parameter b: String defined in test.collections.CollectionTest.reduce.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertFailsWith' @ [328:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> UnsupportedOperationException

'arrayListOf' @ [329:13] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Int> /* = ArrayList<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'reduce' @ [329:32] ==> public inline fun <S, T : Int> Iterable<Int>.reduce(operation: (Int, Int) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> Int
    <T : S> -> Int

'a' @ [329:49] ==> value-parameter a: Int defined in test.collections.CollectionTest.reduce.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [329:53] ==> value-parameter b: Int defined in test.collections.CollectionTest.reduce.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [333:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [334:9] ==> public fun <@OnlyInputTypes T> expect(expected: String, block: () -> String): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'listOf' @ [335:24] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'list' @ [336:13] ==> val list: List<String> defined in test.collections.CollectionTest.reduceRight.<anonymous>[LocalVariableDescriptor]

'reduceRight' @ [336:18] ==> public inline fun <S, T : String> List<String>.reduceRight(operation: (String, String) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> String
    <T : S> -> String

'a' @ [336:40] ==> value-parameter a: String defined in test.collections.CollectionTest.reduceRight.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [336:44] ==> value-parameter b: String defined in test.collections.CollectionTest.reduceRight.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertFailsWith' @ [339:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> UnsupportedOperationException

'arrayListOf' @ [340:13] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Int> /* = ArrayList<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'reduceRight' @ [340:32] ==> public inline fun <S, T : Int> List<Int>.reduceRight(operation: (Int, Int) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> Int
    <T : S> -> Int

'a' @ [340:54] ==> value-parameter a: Int defined in test.collections.CollectionTest.reduceRight.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [340:58] ==> value-parameter b: Int defined in test.collections.CollectionTest.reduceRight.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [344:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [345:21] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'words' @ [346:24] ==> val words: List<String> defined in test.collections.CollectionTest.groupBy[LocalVariableDescriptor]

'groupBy' @ [346:30] ==> public inline fun <T, K> Iterable<String>.groupBy(keySelector: (String) -> Int): Map<Int, List<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Int

'it' @ [346:40] ==> value-parameter it: String defined in test.collections.CollectionTest.groupBy.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [346:43] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'assertEquals' @ [347:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'byLength' @ [347:25] ==> val byLength: Map<Int, List<String>> defined in test.collections.CollectionTest.groupBy[LocalVariableDescriptor]

'size' @ [347:34] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'assertEquals' @ [350:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Pair<Int, List<String>>>, actual: List<Pair<Int, List<String>>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Pair<Int, List<String>>>

'listOf' @ [350:22] ==> public fun <T> listOf(vararg elements: Pair<Int, List<String>>): List<Pair<Int, List<String>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Int, List<String>>

'to' @ [351:17] ==> public infix fun <A, B> Int.to(that: List<String>): Pair<Int, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> List<String>

'listOf' @ [351:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'to' @ [352:17] ==> public infix fun <A, B> Int.to(that: List<String>): Pair<Int, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> List<String>

'listOf' @ [352:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'to' @ [353:17] ==> public infix fun <A, B> Int.to(that: List<String>): Pair<Int, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> List<String>

'listOf' @ [353:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'to' @ [354:17] ==> public infix fun <A, B> Int.to(that: List<String>): Pair<Int, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> List<String>

'listOf' @ [354:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'byLength' @ [355:12] ==> val byLength: Map<Int, List<String>> defined in test.collections.CollectionTest.groupBy[LocalVariableDescriptor]

'toList' @ [355:21] ==> public fun <K, V> Map<out Int, List<String>>.toList(): List<Pair<Int, List<String>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> List<String>

'byLength' @ [357:18] ==> val byLength: Map<Int, List<String>> defined in test.collections.CollectionTest.groupBy[LocalVariableDescriptor]

'orEmpty' @ [357:30] ==> @InlineOnly public inline fun <T> List<String>?.orEmpty(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [358:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [358:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'l3' @ [358:44] ==> val l3: List<String> defined in test.collections.CollectionTest.groupBy[LocalVariableDescriptor]

'Test' @ [361:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [362:26] ==> public fun <T> listOf(vararg elements: Pair<String, String>): List<Pair<String, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, String>

'to' @ [362:33] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [362:57] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [362:75] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'nameToTeam' @ [363:27] ==> val nameToTeam: List<Pair<String, String>> defined in test.collections.CollectionTest.groupByKeysAndValues[LocalVariableDescriptor]

'groupBy' @ [363:38] ==> public inline fun <T, K, V> Iterable<Pair<String, String>>.groupBy(keySelector: (Pair<String, String>) -> String, valueTransform: (Pair<String, String>) -> String): Map<String, List<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, String>
    <K> -> String
    <V> -> String

'it' @ [363:48] ==> value-parameter it: Pair<String, String> defined in test.collections.CollectionTest.groupByKeysAndValues.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [363:51] ==> public final val second: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [363:63] ==> value-parameter it: Pair<String, String> defined in test.collections.CollectionTest.groupByKeysAndValues.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [363:66] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'assertEquals' @ [364:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Pair<String, List<String>>>, actual: List<Pair<String, List<String>>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Pair<String, List<String>>>

'listOf' @ [365:17] ==> public fun <T> listOf(vararg elements: Pair<String, List<String>>): List<Pair<String, List<String>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, List<String>>

'to' @ [366:21] ==> public infix fun <A, B> String.to(that: List<String>): Pair<String, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> List<String>

'listOf' @ [366:36] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'to' @ [367:21] ==> public infix fun <A, B> String.to(that: List<String>): Pair<String, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> List<String>

'listOf' @ [367:32] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'namesByTeam' @ [369:17] ==> val namesByTeam: Map<String, List<String>> defined in test.collections.CollectionTest.groupByKeysAndValues[LocalVariableDescriptor]

'toList' @ [369:29] ==> public fun <K, V> Map<out String, List<String>>.toList(): List<Pair<String, List<String>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<String>

'nameToTeam' @ [372:34] ==> val nameToTeam: List<Pair<String, String>> defined in test.collections.CollectionTest.groupByKeysAndValues[LocalVariableDescriptor]

'groupByTo' @ [372:45] ==> public inline fun <T, K, V, M : MutableMap<in String, MutableList<String>>> Iterable<Pair<String, String>>.groupByTo(destination: HashMap<String, MutableList<String>> /* = HashMap<String, MutableList<String>> */, keySelector: (Pair<String, String>) -> String, valueTransform: (Pair<String, String>) -> String): HashMap<String, MutableList<String>> /* = HashMap<String, MutableList<String>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, String>
    <K> -> String
    <V> -> String
    <M : MutableMap<in K, MutableList<V>>> -> HashMap<String, MutableList<String>>

'HashMap' @ [372:55] ==> public final fun <K, V> <init>(): HashMap<String, MutableList<String>> /* = HashMap<String, MutableList<String>> */ defined in kotlin.collections.HashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> MutableList<String>

'it' @ [372:68] ==> value-parameter it: Pair<String, String> defined in test.collections.CollectionTest.groupByKeysAndValues.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [372:71] ==> public final val second: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [372:83] ==> value-parameter it: Pair<String, String> defined in test.collections.CollectionTest.groupByKeysAndValues.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [372:86] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'assertEquals' @ [373:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, List<String>>, actual: Map<String, List<String>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, List<String>>

'namesByTeam' @ [373:22] ==> val namesByTeam: Map<String, List<String>> defined in test.collections.CollectionTest.groupByKeysAndValues[LocalVariableDescriptor]

'mutableNamesByTeam' @ [373:35] ==> val mutableNamesByTeam: HashMap<String, MutableList<String>> /* = HashMap<String, MutableList<String>> */ defined in test.collections.CollectionTest.groupByKeysAndValues[LocalVariableDescriptor]

'Test' @ [376:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'..' @ [377:22] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'..' @ [378:22] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'range1' @ [379:24] ==> val range1: IntRange defined in test.collections.CollectionTest.plusRanges[LocalVariableDescriptor]

'range2' @ [379:33] ==> val range2: IntRange defined in test.collections.CollectionTest.plusRanges[LocalVariableDescriptor]

'assertEquals' @ [380:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'..' @ [380:23] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toList' @ [380:29] ==> public fun <T> Iterable<Int>.toList(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'combined' @ [380:39] ==> val combined: List<Int> defined in test.collections.CollectionTest.plusRanges[LocalVariableDescriptor]

'Test' @ [383:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'..' @ [384:22] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'map' @ [384:28] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'it' @ [384:34] ==> value-parameter it: Int defined in test.collections.CollectionTest.mapRanges.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [385:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [385:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'range' @ [385:39] ==> val range: List<Int> defined in test.collections.CollectionTest.mapRanges[LocalVariableDescriptor]

'listOf' @ [389:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'invoke' @ [390:35] ==> public abstract operator fun invoke(p1: List<String>): List<String> defined in kotlin.Function1[FunctionInvokeDescriptor]

'list' @ [390:42] ==> val list: List<String> defined in test.collections.CollectionTest.testPlus[LocalVariableDescriptor]

'assertEquals' @ [391:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [391:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'list' @ [391:44] ==> val list: List<String> defined in test.collections.CollectionTest.testPlus[LocalVariableDescriptor]

'assertEquals' @ [392:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [392:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'list2' @ [392:62] ==> val list2: List<String> defined in test.collections.CollectionTest.testPlus[LocalVariableDescriptor]

'Test' @ [395:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlus' @ [395:31] ==> public final fun testPlus(doPlus: (List<String>) -> List<String>): Unit defined in test.collections.CollectionTest[SimpleFunctionDescriptorImpl]

'it' @ [395:42] ==> value-parameter it: List<String> defined in test.collections.CollectionTest.plusElement.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [396:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlus' @ [396:34] ==> public final fun testPlus(doPlus: (List<String>) -> List<String>): Unit defined in test.collections.CollectionTest[SimpleFunctionDescriptorImpl]

'it' @ [396:45] ==> value-parameter it: List<String> defined in test.collections.CollectionTest.plusCollection.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [396:50] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [397:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlus' @ [397:29] ==> public final fun testPlus(doPlus: (List<String>) -> List<String>): Unit defined in test.collections.CollectionTest[SimpleFunctionDescriptorImpl]

'it' @ [397:40] ==> value-parameter it: List<String> defined in test.collections.CollectionTest.plusArray.<anonymous>[ValueParameterDescriptorImpl]

'arrayOf' @ [397:45] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'Test' @ [398:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlus' @ [398:32] ==> public final fun testPlus(doPlus: (List<String>) -> List<String>): Unit defined in test.collections.CollectionTest[SimpleFunctionDescriptorImpl]

'it' @ [398:43] ==> value-parameter it: List<String> defined in test.collections.CollectionTest.plusSequence.<anonymous>[ValueParameterDescriptorImpl]

'sequenceOf' @ [398:48] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [400:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [401:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOf' @ [401:43] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [402:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [402:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'list' @ [402:62] ==> val list: List<String> defined in test.collections.CollectionTest.plusCollectionBug[LocalVariableDescriptor]

'Test' @ [405:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [406:27] ==> public fun <T> listOf(element: List<String>): List<List<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<String>

'listOf' @ [406:34] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOf' @ [407:27] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOfLists' @ [408:42] ==> val listOfLists: List<List<String>> defined in test.collections.CollectionTest.plusCollectionInference[LocalVariableDescriptor]

'plusElement' @ [408:54] ==> @InlineOnly public inline fun <T> Collection<List<String>>.plusElement(element: List<String>): List<List<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<String>

'elementList' @ [408:66] ==> val elementList: List<String> defined in test.collections.CollectionTest.plusCollectionInference[LocalVariableDescriptor]

'assertEquals' @ [409:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<List<String>>, actual: List<List<String>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<List<String>>

'listOf' @ [409:22] ==> public fun <T> listOf(vararg elements: List<String>): List<List<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<String>

'listOf' @ [409:29] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOf' @ [409:42] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'result' @ [409:56] ==> val result: List<List<String>> defined in test.collections.CollectionTest.plusCollectionInference[LocalVariableDescriptor]

'listOf' @ [411:25] ==> public fun <T> listOf(element: Any): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'listOf' @ [411:44] ==> public fun <T> listOf(element: Any): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'assertEquals' @ [412:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Any>, actual: List<Any>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Any>

'listOf' @ [412:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOfAny' @ [412:40] ==> val listOfAny: List<Any> defined in test.collections.CollectionTest.plusCollectionInference[LocalVariableDescriptor]

'listOf' @ [414:32] ==> public fun <T> listOf(element: Any): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'listOf' @ [414:51] ==> public fun <T> listOf(element: Any): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'assertEquals' @ [415:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Any>, actual: List<Any>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Any>

'listOf' @ [415:22] ==> public fun <T> listOf(vararg elements: Any): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'listOf' @ [415:34] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOfAnyAndList' @ [415:48] ==> val listOfAnyAndList: List<Any> defined in test.collections.CollectionTest.plusCollectionInference[LocalVariableDescriptor]

'Test' @ [418:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [420:31] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'l' @ [421:25] ==> var l: List<String> defined in test.collections.CollectionTest.plusAssign[LocalVariableDescriptor]

'l' @ [422:9] ==> var l: List<String> defined in test.collections.CollectionTest.plusAssign[LocalVariableDescriptor]

'l' @ [423:9] ==> var l: List<String> defined in test.collections.CollectionTest.plusAssign[LocalVariableDescriptor]

'listOf' @ [423:14] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'l' @ [424:9] ==> var l: List<String> defined in test.collections.CollectionTest.plusAssign[LocalVariableDescriptor]

'arrayOf' @ [424:14] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'l' @ [425:9] ==> var l: List<String> defined in test.collections.CollectionTest.plusAssign[LocalVariableDescriptor]

'sequenceOf' @ [425:14] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [426:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [426:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'l' @ [426:87] ==> var l: List<String> defined in test.collections.CollectionTest.plusAssign[LocalVariableDescriptor]

'assertTrue' @ [427:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'l' @ [427:20] ==> var l: List<String> defined in test.collections.CollectionTest.plusAssign[LocalVariableDescriptor]

'lOriginal' @ [427:26] ==> val lOriginal: List<String> defined in test.collections.CollectionTest.plusAssign[LocalVariableDescriptor]

'arrayListOf' @ [429:18] ==> public fun <T> arrayListOf(vararg elements: String): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ml' @ [430:9] ==> val ml: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.plusAssign[LocalVariableDescriptor]

'ml' @ [431:9] ==> val ml: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.plusAssign[LocalVariableDescriptor]

'listOf' @ [431:15] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ml' @ [432:9] ==> val ml: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.plusAssign[LocalVariableDescriptor]

'arrayOf' @ [432:15] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'ml' @ [433:9] ==> val ml: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.plusAssign[LocalVariableDescriptor]

'sequenceOf' @ [433:15] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [434:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'l' @ [434:22] ==> var l: List<String> defined in test.collections.CollectionTest.plusAssign[LocalVariableDescriptor]

'ml' @ [434:25] ==> val ml: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.plusAssign[LocalVariableDescriptor]

'listOf' @ [439:17] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'invoke' @ [440:31] ==> public abstract operator fun invoke(p1: List<String>): List<String> defined in kotlin.Function1[FunctionInvokeDescriptor]

'a' @ [440:39] ==> val a: List<String> defined in test.collections.CollectionTest.testMinus[LocalVariableDescriptor]

'expected' @ [441:25] ==> value-parameter expected: List<String>? = ... defined in test.collections.CollectionTest.testMinus[ValueParameterDescriptorImpl]

'listOf' @ [441:37] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [442:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'expected_' @ [442:22] ==> val expected_: List<String> defined in test.collections.CollectionTest.testMinus[LocalVariableDescriptor]

'b' @ [442:33] ==> val b: List<String> defined in test.collections.CollectionTest.testMinus[LocalVariableDescriptor]

'toList' @ [442:35] ==> public fun <T> Iterable<String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [445:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testMinus' @ [445:32] ==> private final fun testMinus(expected: List<String>? = ..., doMinus: (List<String>) -> List<String>): Unit defined in test.collections.CollectionTest[SimpleFunctionDescriptorImpl]

'listOf' @ [445:53] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [445:77] ==> value-parameter it: List<String> defined in test.collections.CollectionTest.minusElement.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [446:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testMinus' @ [446:35] ==> private final fun testMinus(expected: List<String>? = ..., doMinus: (List<String>) -> List<String>): Unit defined in test.collections.CollectionTest[SimpleFunctionDescriptorImpl]

'it' @ [446:47] ==> value-parameter it: List<String> defined in test.collections.CollectionTest.minusCollection.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [446:52] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [447:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testMinus' @ [447:30] ==> private final fun testMinus(expected: List<String>? = ..., doMinus: (List<String>) -> List<String>): Unit defined in test.collections.CollectionTest[SimpleFunctionDescriptorImpl]

'it' @ [447:42] ==> value-parameter it: List<String> defined in test.collections.CollectionTest.minusArray.<anonymous>[ValueParameterDescriptorImpl]

'arrayOf' @ [447:47] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'Test' @ [448:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testMinus' @ [448:33] ==> private final fun testMinus(expected: List<String>? = ..., doMinus: (List<String>) -> List<String>): Unit defined in test.collections.CollectionTest[SimpleFunctionDescriptorImpl]

'it' @ [448:45] ==> value-parameter it: List<String> defined in test.collections.CollectionTest.minusSequence.<anonymous>[ValueParameterDescriptorImpl]

'sequenceOf' @ [448:50] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [450:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [451:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'arrayListOf' @ [452:20] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'source' @ [453:22] ==> val source: List<String> defined in test.collections.CollectionTest.minusIsEager[LocalVariableDescriptor]

'list' @ [453:31] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.minusIsEager[LocalVariableDescriptor]

'list' @ [455:9] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.minusIsEager[LocalVariableDescriptor]

'assertEquals' @ [456:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'source' @ [456:22] ==> val source: List<String> defined in test.collections.CollectionTest.minusIsEager[LocalVariableDescriptor]

'result' @ [456:30] ==> val result: List<String> defined in test.collections.CollectionTest.minusIsEager[LocalVariableDescriptor]

'list' @ [457:9] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.minusIsEager[LocalVariableDescriptor]

'assertEquals' @ [458:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'source' @ [458:22] ==> val source: List<String> defined in test.collections.CollectionTest.minusIsEager[LocalVariableDescriptor]

'result' @ [458:30] ==> val result: List<String> defined in test.collections.CollectionTest.minusIsEager[LocalVariableDescriptor]

'Test' @ [461:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [463:34] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [464:17] ==> val data: List<String> defined in test.collections.CollectionTest.minusAssign[LocalVariableDescriptor]

'l' @ [465:9] ==> var l: List<String> defined in test.collections.CollectionTest.minusAssign[LocalVariableDescriptor]

'assertEquals' @ [466:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [466:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'l' @ [466:63] ==> var l: List<String> defined in test.collections.CollectionTest.minusAssign[LocalVariableDescriptor]

'l' @ [467:9] ==> var l: List<String> defined in test.collections.CollectionTest.minusAssign[LocalVariableDescriptor]

'data' @ [467:13] ==> val data: List<String> defined in test.collections.CollectionTest.minusAssign[LocalVariableDescriptor]

'l' @ [468:9] ==> var l: List<String> defined in test.collections.CollectionTest.minusAssign[LocalVariableDescriptor]

'listOf' @ [468:14] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [469:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [469:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'l' @ [469:45] ==> var l: List<String> defined in test.collections.CollectionTest.minusAssign[LocalVariableDescriptor]

'l' @ [470:9] ==> var l: List<String> defined in test.collections.CollectionTest.minusAssign[LocalVariableDescriptor]

'arrayOf' @ [470:14] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'assertEquals' @ [471:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [471:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'l' @ [471:37] ==> var l: List<String> defined in test.collections.CollectionTest.minusAssign[LocalVariableDescriptor]

'arrayListOf' @ [473:18] ==> public fun <T> arrayListOf(vararg elements: String): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ml' @ [474:9] ==> val ml: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.minusAssign[LocalVariableDescriptor]

'assertEquals' @ [475:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [475:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ml' @ [475:73] ==> val ml: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.minusAssign[LocalVariableDescriptor]

'ml' @ [476:9] ==> val ml: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.minusAssign[LocalVariableDescriptor]

'listOf' @ [476:15] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [477:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [477:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ml' @ [477:45] ==> val ml: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.minusAssign[LocalVariableDescriptor]

'ml' @ [478:9] ==> val ml: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.minusAssign[LocalVariableDescriptor]

'arrayOf' @ [478:15] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'assertEquals' @ [479:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [479:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ml' @ [479:37] ==> val ml: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.minusAssign[LocalVariableDescriptor]

'Test' @ [484:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'arrayListOf' @ [485:20] ==> public fun <T> arrayListOf(vararg elements: String?): ArrayList<String?> /* = ArrayList<String?> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'data' @ [486:23] ==> val data: ArrayList<String?> /* = ArrayList<String?> */ defined in test.collections.CollectionTest.requireNoNulls[LocalVariableDescriptor]

'requireNoNulls' @ [486:28] ==> public fun <T : Any> List<String?>.requireNoNulls(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'assertEquals' @ [487:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [487:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'notNull' @ [487:44] ==> val notNull: List<String> defined in test.collections.CollectionTest.requireNoNulls[LocalVariableDescriptor]

'listOf' @ [489:24] ==> public fun <T> listOf(vararg elements: String?): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'assertFailsWith' @ [491:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalArgumentException

'hasNulls' @ [493:13] ==> val hasNulls: List<String?> defined in test.collections.CollectionTest.requireNoNulls[LocalVariableDescriptor]

'requireNoNulls' @ [493:22] ==> public fun <T : Any> List<String?>.requireNoNulls(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'Test' @ [497:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'arrayListOf' @ [498:20] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [499:9] ==> val data: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.reverseInPlace[LocalVariableDescriptor]

'reverse' @ [499:14] ==> public fun <T> MutableList<String>.reverse(): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertTrue' @ [500:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [500:20] ==> val data: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.reverseInPlace[LocalVariableDescriptor]

'isEmpty' @ [500:25] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'data' @ [502:9] ==> val data: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.reverseInPlace[LocalVariableDescriptor]

'add' @ [502:14] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'data' @ [503:9] ==> val data: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.reverseInPlace[LocalVariableDescriptor]

'reverse' @ [503:14] ==> public fun <T> MutableList<String>.reverse(): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [504:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [504:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [504:37] ==> val data: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.reverseInPlace[LocalVariableDescriptor]

'data' @ [506:9] ==> val data: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.reverseInPlace[LocalVariableDescriptor]

'add' @ [506:14] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'data' @ [507:9] ==> val data: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.reverseInPlace[LocalVariableDescriptor]

'reverse' @ [507:14] ==> public fun <T> MutableList<String>.reverse(): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [508:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [508:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [508:44] ==> val data: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.reverseInPlace[LocalVariableDescriptor]

'data' @ [510:9] ==> val data: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.reverseInPlace[LocalVariableDescriptor]

'add' @ [510:14] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'data' @ [511:9] ==> val data: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.reverseInPlace[LocalVariableDescriptor]

'reverse' @ [511:14] ==> public fun <T> MutableList<String>.reverse(): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [512:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [512:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [512:51] ==> val data: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.reverseInPlace[LocalVariableDescriptor]

'Test' @ [515:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [516:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [517:19] ==> val data: List<String> defined in test.collections.CollectionTest.reversed[LocalVariableDescriptor]

'reversed' @ [517:24] ==> public fun <T> Iterable<String>.reversed(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [518:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [518:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'rev' @ [518:44] ==> val rev: List<String> defined in test.collections.CollectionTest.reversed[LocalVariableDescriptor]

'assertNotEquals' @ [519:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'data' @ [519:25] ==> val data: List<String> defined in test.collections.CollectionTest.reversed[LocalVariableDescriptor]

'rev' @ [519:31] ==> val rev: List<String> defined in test.collections.CollectionTest.reversed[LocalVariableDescriptor]

'Test' @ [523:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [524:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [525:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [525:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [525:44] ==> val coll: List<String> defined in test.collections.CollectionTest.drop[LocalVariableDescriptor]

'drop' @ [525:49] ==> public fun <T> Iterable<String>.drop(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [526:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [526:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [526:37] ==> val coll: List<String> defined in test.collections.CollectionTest.drop[LocalVariableDescriptor]

'drop' @ [526:42] ==> public fun <T> Iterable<String>.drop(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [529:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [530:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [531:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [531:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [531:44] ==> val coll: List<String> defined in test.collections.CollectionTest.dropWhile[LocalVariableDescriptor]

'dropWhile' @ [531:49] ==> public inline fun <T> Iterable<String>.dropWhile(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [531:61] ==> value-parameter it: String defined in test.collections.CollectionTest.dropWhile.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [531:64] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [534:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [535:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [536:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'coll' @ [536:22] ==> val coll: List<String> defined in test.collections.CollectionTest.dropLast[LocalVariableDescriptor]

'coll' @ [536:28] ==> val coll: List<String> defined in test.collections.CollectionTest.dropLast[LocalVariableDescriptor]

'dropLast' @ [536:33] ==> public fun <T> List<String>.dropLast(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [537:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'emptyList' @ [537:22] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [537:43] ==> val coll: List<String> defined in test.collections.CollectionTest.dropLast[LocalVariableDescriptor]

'dropLast' @ [537:48] ==> public fun <T> List<String>.dropLast(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [537:57] ==> val coll: List<String> defined in test.collections.CollectionTest.dropLast[LocalVariableDescriptor]

'size' @ [537:62] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [538:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'emptyList' @ [538:22] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [538:43] ==> val coll: List<String> defined in test.collections.CollectionTest.dropLast[LocalVariableDescriptor]

'dropLast' @ [538:48] ==> public fun <T> List<String>.dropLast(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [538:57] ==> val coll: List<String> defined in test.collections.CollectionTest.dropLast[LocalVariableDescriptor]

'size' @ [538:62] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [539:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [539:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [539:44] ==> val coll: List<String> defined in test.collections.CollectionTest.dropLast[LocalVariableDescriptor]

'dropLast' @ [539:49] ==> public fun <T> List<String>.dropLast(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [540:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [540:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [540:37] ==> val coll: List<String> defined in test.collections.CollectionTest.dropLast[LocalVariableDescriptor]

'dropLast' @ [540:42] ==> public fun <T> List<String>.dropLast(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertFails' @ [542:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'coll' @ [542:23] ==> val coll: List<String> defined in test.collections.CollectionTest.dropLast[LocalVariableDescriptor]

'dropLast' @ [542:28] ==> public fun <T> List<String>.dropLast(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'-' @ [542:37] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Test' @ [545:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [546:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [547:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'coll' @ [547:22] ==> val coll: List<String> defined in test.collections.CollectionTest.dropLastWhile[LocalVariableDescriptor]

'coll' @ [547:28] ==> val coll: List<String> defined in test.collections.CollectionTest.dropLastWhile[LocalVariableDescriptor]

'dropLastWhile' @ [547:33] ==> public inline fun <T> List<String>.dropLastWhile(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [548:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [548:22] ==> @InlineOnly public inline fun <T> listOf(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [548:40] ==> val coll: List<String> defined in test.collections.CollectionTest.dropLastWhile[LocalVariableDescriptor]

'dropLastWhile' @ [548:45] ==> public inline fun <T> List<String>.dropLastWhile(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [549:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [549:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [549:45] ==> val coll: List<String> defined in test.collections.CollectionTest.dropLastWhile[LocalVariableDescriptor]

'dropLastWhile' @ [549:50] ==> public inline fun <T> List<String>.dropLastWhile(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [549:66] ==> value-parameter it: String defined in test.collections.CollectionTest.dropLastWhile.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [549:69] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'assertEquals' @ [550:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [550:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [550:37] ==> val coll: List<String> defined in test.collections.CollectionTest.dropLastWhile[LocalVariableDescriptor]

'dropLastWhile' @ [550:42] ==> public inline fun <T> List<String>.dropLastWhile(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [550:58] ==> value-parameter it: String defined in test.collections.CollectionTest.dropLastWhile.<anonymous>[ValueParameterDescriptorImpl]

'all' @ [550:61] ==> public inline fun CharSequence.all(predicate: (Char) -> Boolean): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [550:67] ==> value-parameter it: Char defined in test.collections.CollectionTest.dropLastWhile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'..' @ [550:73] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'Test' @ [553:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [554:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [555:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'emptyList' @ [555:22] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [555:43] ==> val coll: List<String> defined in test.collections.CollectionTest.take[LocalVariableDescriptor]

'take' @ [555:48] ==> public fun <T> Iterable<String>.take(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [556:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [556:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [556:37] ==> val coll: List<String> defined in test.collections.CollectionTest.take[LocalVariableDescriptor]

'take' @ [556:42] ==> public fun <T> Iterable<String>.take(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [557:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [557:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [557:44] ==> val coll: List<String> defined in test.collections.CollectionTest.take[LocalVariableDescriptor]

'take' @ [557:49] ==> public fun <T> Iterable<String>.take(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [558:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'coll' @ [558:22] ==> val coll: List<String> defined in test.collections.CollectionTest.take[LocalVariableDescriptor]

'coll' @ [558:28] ==> val coll: List<String> defined in test.collections.CollectionTest.take[LocalVariableDescriptor]

'take' @ [558:33] ==> public fun <T> Iterable<String>.take(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [558:38] ==> val coll: List<String> defined in test.collections.CollectionTest.take[LocalVariableDescriptor]

'size' @ [558:43] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [559:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'coll' @ [559:22] ==> val coll: List<String> defined in test.collections.CollectionTest.take[LocalVariableDescriptor]

'coll' @ [559:28] ==> val coll: List<String> defined in test.collections.CollectionTest.take[LocalVariableDescriptor]

'take' @ [559:33] ==> public fun <T> Iterable<String>.take(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [559:38] ==> val coll: List<String> defined in test.collections.CollectionTest.take[LocalVariableDescriptor]

'size' @ [559:43] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertFails' @ [561:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'coll' @ [561:23] ==> val coll: List<String> defined in test.collections.CollectionTest.take[LocalVariableDescriptor]

'take' @ [561:28] ==> public fun <T> Iterable<String>.take(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'-' @ [561:33] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Test' @ [564:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [565:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [566:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'emptyList' @ [566:22] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [566:43] ==> val coll: List<String> defined in test.collections.CollectionTest.takeWhile[LocalVariableDescriptor]

'takeWhile' @ [566:48] ==> public inline fun <T> Iterable<String>.takeWhile(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [567:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'coll' @ [567:22] ==> val coll: List<String> defined in test.collections.CollectionTest.takeWhile[LocalVariableDescriptor]

'coll' @ [567:28] ==> val coll: List<String> defined in test.collections.CollectionTest.takeWhile[LocalVariableDescriptor]

'takeWhile' @ [567:33] ==> public inline fun <T> Iterable<String>.takeWhile(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [568:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [568:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [568:37] ==> val coll: List<String> defined in test.collections.CollectionTest.takeWhile[LocalVariableDescriptor]

'takeWhile' @ [568:42] ==> public inline fun <T> Iterable<String>.takeWhile(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [568:54] ==> value-parameter it: String defined in test.collections.CollectionTest.takeWhile.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [568:57] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [569:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [569:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [569:51] ==> val coll: List<String> defined in test.collections.CollectionTest.takeWhile[LocalVariableDescriptor]

'takeWhile' @ [569:56] ==> public inline fun <T> Iterable<String>.takeWhile(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [569:68] ==> value-parameter it: String defined in test.collections.CollectionTest.takeWhile.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [569:71] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'Test' @ [572:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [573:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [575:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'emptyList' @ [575:22] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [575:43] ==> val coll: List<String> defined in test.collections.CollectionTest.takeLast[LocalVariableDescriptor]

'takeLast' @ [575:48] ==> public fun <T> List<String>.takeLast(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [576:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [576:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [576:37] ==> val coll: List<String> defined in test.collections.CollectionTest.takeLast[LocalVariableDescriptor]

'takeLast' @ [576:42] ==> public fun <T> List<String>.takeLast(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [577:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [577:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [577:44] ==> val coll: List<String> defined in test.collections.CollectionTest.takeLast[LocalVariableDescriptor]

'takeLast' @ [577:49] ==> public fun <T> List<String>.takeLast(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [578:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'coll' @ [578:22] ==> val coll: List<String> defined in test.collections.CollectionTest.takeLast[LocalVariableDescriptor]

'coll' @ [578:28] ==> val coll: List<String> defined in test.collections.CollectionTest.takeLast[LocalVariableDescriptor]

'takeLast' @ [578:33] ==> public fun <T> List<String>.takeLast(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [578:42] ==> val coll: List<String> defined in test.collections.CollectionTest.takeLast[LocalVariableDescriptor]

'size' @ [578:47] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [579:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'coll' @ [579:22] ==> val coll: List<String> defined in test.collections.CollectionTest.takeLast[LocalVariableDescriptor]

'coll' @ [579:28] ==> val coll: List<String> defined in test.collections.CollectionTest.takeLast[LocalVariableDescriptor]

'takeLast' @ [579:33] ==> public fun <T> List<String>.takeLast(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [579:42] ==> val coll: List<String> defined in test.collections.CollectionTest.takeLast[LocalVariableDescriptor]

'size' @ [579:47] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertFails' @ [581:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'coll' @ [581:23] ==> val coll: List<String> defined in test.collections.CollectionTest.takeLast[LocalVariableDescriptor]

'takeLast' @ [581:28] ==> public fun <T> List<String>.takeLast(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'-' @ [581:37] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'coll' @ [583:64] ==> val coll: List<String> defined in test.collections.CollectionTest.takeLast[LocalVariableDescriptor]

'assertEquals' @ [584:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [584:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'collWithoutRandomAccess' @ [584:37] ==> val collWithoutRandomAccess: <no name provided> defined in test.collections.CollectionTest.takeLast[LocalVariableDescriptor]

'takeLast' @ [584:61] ==> public fun <T> List<String>.takeLast(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [585:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [585:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'collWithoutRandomAccess' @ [585:44] ==> val collWithoutRandomAccess: <no name provided> defined in test.collections.CollectionTest.takeLast[LocalVariableDescriptor]

'takeLast' @ [585:68] ==> public fun <T> List<String>.takeLast(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [588:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [589:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [590:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'emptyList' @ [590:22] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [590:43] ==> val coll: List<String> defined in test.collections.CollectionTest.takeLastWhile[LocalVariableDescriptor]

'takeLastWhile' @ [590:48] ==> public inline fun <T> List<String>.takeLastWhile(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [591:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'coll' @ [591:22] ==> val coll: List<String> defined in test.collections.CollectionTest.takeLastWhile[LocalVariableDescriptor]

'coll' @ [591:28] ==> val coll: List<String> defined in test.collections.CollectionTest.takeLastWhile[LocalVariableDescriptor]

'takeLastWhile' @ [591:33] ==> public inline fun <T> List<String>.takeLastWhile(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [592:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [592:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [592:37] ==> val coll: List<String> defined in test.collections.CollectionTest.takeLastWhile[LocalVariableDescriptor]

'takeLastWhile' @ [592:42] ==> public inline fun <T> List<String>.takeLastWhile(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [592:58] ==> value-parameter it: String defined in test.collections.CollectionTest.takeLastWhile.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [592:61] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [593:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [593:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'coll' @ [593:44] ==> val coll: List<String> defined in test.collections.CollectionTest.takeLastWhile[LocalVariableDescriptor]

'takeLastWhile' @ [593:49] ==> public inline fun <T> List<String>.takeLastWhile(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [593:65] ==> value-parameter it: String defined in test.collections.CollectionTest.takeLastWhile.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [596:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [597:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [598:19] ==> val data: List<String> defined in test.collections.CollectionTest.copyToArray[LocalVariableDescriptor]

'toTypedArray' @ [598:24] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'println' @ [599:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'arr' @ [599:30] ==> val arr: Array<String> defined in test.collections.CollectionTest.copyToArray[LocalVariableDescriptor]

'assertEquals' @ [600:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'arr' @ [600:25] ==> val arr: Array<String> defined in test.collections.CollectionTest.copyToArray[LocalVariableDescriptor]

'size' @ [600:29] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'Test' @ [603:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [604:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [605:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'data' @ [605:25] ==> val data: List<String> defined in test.collections.CollectionTest.count[LocalVariableDescriptor]

'count' @ [605:30] ==> @InlineOnly public inline fun <T> Collection<String>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [606:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'hashSetOf' @ [606:25] ==> public fun <T> hashSetOf(vararg elements: Int): HashSet<Int> /* = HashSet<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'count' @ [606:47] ==> @InlineOnly public inline fun <T> Collection<Int>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [607:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'ArrayList' @ [607:25] ==> public final fun <E> <init>(): ArrayList<Double> /* = ArrayList<Double> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> Double

'count' @ [607:45] ==> @InlineOnly public inline fun <T> Collection<Double>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Double

'Test' @ [610:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [611:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [612:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [612:29] ==> val data: List<String> defined in test.collections.CollectionTest.first[LocalVariableDescriptor]

'first' @ [612:34] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [613:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'listOf' @ [613:26] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'first' @ [613:49] ==> public fun <T> List<Int>.first(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [614:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Char, actual: Char, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Char

'listOf' @ [614:27] ==> public fun <T> listOf(element: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'first' @ [614:39] ==> public fun <T> List<Char>.first(): Char defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'assertFails' @ [615:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'arrayListOf' @ [615:23] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Int> /* = ArrayList<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'first' @ [615:42] ==> public fun <T> List<Int>.first(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [618:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [619:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [620:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'data' @ [620:29] ==> val data: List<String> defined in test.collections.CollectionTest.last[LocalVariableDescriptor]

'last' @ [620:34] ==> public fun <T> List<String>.last(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [621:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'listOf' @ [621:26] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'last' @ [621:49] ==> public fun <T> List<Int>.last(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [622:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Char, actual: Char, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Char

'listOf' @ [622:27] ==> public fun <T> listOf(element: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'last' @ [622:39] ==> public fun <T> List<Char>.last(): Char defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'assertFails' @ [623:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'arrayListOf' @ [623:23] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Int> /* = ArrayList<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'last' @ [623:42] ==> public fun <T> List<Int>.last(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [626:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'arrayListOf' @ [627:20] ==> public fun <T> arrayListOf(vararg elements: String): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [628:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'list' @ [628:29] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.subscript[LocalVariableDescriptor]

'assertEquals' @ [629:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'list' @ [629:29] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.subscript[LocalVariableDescriptor]

'assertFails' @ [632:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'Suppress' @ [633:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'list' @ [634:31] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.subscript[LocalVariableDescriptor]

'list' @ [638:9] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.subscript[LocalVariableDescriptor]

'list' @ [639:9] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.subscript[LocalVariableDescriptor]

'assertFails' @ [642:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'list' @ [643:13] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.subscript[LocalVariableDescriptor]

'list' @ [646:9] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.subscript[LocalVariableDescriptor]

'add' @ [646:14] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'assertEquals' @ [647:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [647:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'list' @ [647:55] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.CollectionTest.subscript[LocalVariableDescriptor]

'Test' @ [650:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [651:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [652:23] ==> val data: List<String> defined in test.collections.CollectionTest.indices[LocalVariableDescriptor]

'indices' @ [652:28] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'assertEquals' @ [653:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'indices' @ [653:25] ==> val indices: IntRange defined in test.collections.CollectionTest.indices[LocalVariableDescriptor]

'start' @ [653:33] ==> public open val start: Int defined in kotlin.ranges.IntRange[DeserializedPropertyDescriptor]

'assertEquals' @ [654:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'indices' @ [654:25] ==> val indices: IntRange defined in test.collections.CollectionTest.indices[LocalVariableDescriptor]

'endInclusive' @ [654:33] ==> public open val endInclusive: Int defined in kotlin.ranges.IntRange[DeserializedPropertyDescriptor]

'assertEquals' @ [655:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: IntRange, actual: IntRange, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> IntRange

'..' @ [655:22] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'data' @ [655:25] ==> val data: List<String> defined in test.collections.CollectionTest.indices[LocalVariableDescriptor]

'size' @ [655:30] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'indices' @ [655:40] ==> val indices: IntRange defined in test.collections.CollectionTest.indices[LocalVariableDescriptor]

'Test' @ [658:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertFalse' @ [659:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'hashSetOf' @ [659:21] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<Int> /* = HashSet<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'contains' @ [659:38] ==> public open fun contains(element: Int): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'assertTrue' @ [660:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'listOf' @ [660:20] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'contains' @ [660:39] ==> public abstract fun contains(element: Int): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [662:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'hashSetOf' @ [662:20] ==> public fun <T> hashSetOf(vararg elements: Int): HashSet<Int> /* = HashSet<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'toIterable' @ [662:42] ==> public fun <T> Iterable<Int>.toIterable(): Iterable<Int> defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Int

'contains' @ [662:55] ==> public operator fun <@OnlyInputTypes T> Iterable<Int>.contains(element: Int): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'Test' @ [665:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [666:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [666:24] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'min' @ [666:38] ==> public fun <T : Comparable<Int>> Iterable<Int>.min(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'expect' @ [667:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [667:21] ==> public fun <T> listOf(element: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'min' @ [667:31] ==> public fun <T : Comparable<Int>> Iterable<Int>.min(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'expect' @ [668:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [668:21] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'min' @ [668:34] ==> public fun <T : Comparable<Int>> Iterable<Int>.min(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'expect' @ [669:9] ==> public fun <@OnlyInputTypes T> expect(expected: Long?, block: () -> Long?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Long?

'listOf' @ [669:33] ==> public fun <T> listOf(vararg elements: Long): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'min' @ [669:70] ==> public fun <T : Comparable<Long>> Iterable<Long>.min(): Long? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Long

'expect' @ [670:9] ==> public fun <@OnlyInputTypes T> expect(expected: Char?, block: () -> Char?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Char?

'listOf' @ [670:23] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'min' @ [670:40] ==> public fun <T : Comparable<Char>> Iterable<Char>.min(): Char? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Char

'expect' @ [671:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'listOf' @ [671:23] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'min' @ [671:40] ==> public fun <T : Comparable<String>> Iterable<String>.min(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'expect' @ [672:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [672:24] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'asSequence' @ [672:38] ==> public fun <T> Iterable<Int>.asSequence(): Sequence<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'min' @ [672:51] ==> public fun <T : Comparable<Int>> Sequence<Int>.min(): Int? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'expect' @ [673:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [673:21] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'asSequence' @ [673:34] ==> public fun <T> Iterable<Int>.asSequence(): Sequence<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'min' @ [673:47] ==> public fun <T : Comparable<Int>> Sequence<Int>.min(): Int? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'Test' @ [676:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [677:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [677:24] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'max' @ [677:38] ==> public fun <T : Comparable<Int>> Iterable<Int>.max(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'expect' @ [678:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [678:21] ==> public fun <T> listOf(element: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'max' @ [678:31] ==> public fun <T : Comparable<Int>> Iterable<Int>.max(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'expect' @ [679:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [679:21] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'max' @ [679:34] ==> public fun <T : Comparable<Int>> Iterable<Int>.max(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'expect' @ [680:9] ==> public fun <@OnlyInputTypes T> expect(expected: Long?, block: () -> Long?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Long?

'listOf' @ [680:33] ==> public fun <T> listOf(vararg elements: Long): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'max' @ [680:70] ==> public fun <T : Comparable<Long>> Iterable<Long>.max(): Long? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Long

'expect' @ [681:9] ==> public fun <@OnlyInputTypes T> expect(expected: Char?, block: () -> Char?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Char?

'listOf' @ [681:23] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'max' @ [681:40] ==> public fun <T : Comparable<Char>> Iterable<Char>.max(): Char? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Char

'expect' @ [682:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'listOf' @ [682:23] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'max' @ [682:40] ==> public fun <T : Comparable<String>> Iterable<String>.max(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'expect' @ [683:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [683:24] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'asSequence' @ [683:38] ==> public fun <T> Iterable<Int>.asSequence(): Sequence<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'max' @ [683:51] ==> public fun <T : Comparable<Int>> Sequence<Int>.max(): Int? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'expect' @ [684:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [684:21] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'asSequence' @ [684:34] ==> public fun <T> Iterable<Int>.asSequence(): Sequence<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'max' @ [684:47] ==> public fun <T : Comparable<Int>> Sequence<Int>.max(): Int? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'Test' @ [687:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [688:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [688:24] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'minWith' @ [688:38] ==> public fun <T> Iterable<Int>.minWith(comparator: Comparator<in Int> /* = Comparator<in Int> */): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'naturalOrder' @ [688:46] ==> public fun <T : Comparable<Int>> naturalOrder(): Comparator<Int> /* = Comparator<Int> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'expect' @ [689:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [689:21] ==> public fun <T> listOf(element: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'minWith' @ [689:31] ==> public fun <T> Iterable<Int>.minWith(comparator: Comparator<in Int> /* = Comparator<in Int> */): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'naturalOrder' @ [689:39] ==> public fun <T : Comparable<Int>> naturalOrder(): Comparator<Int> /* = Comparator<Int> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'expect' @ [690:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'listOf' @ [690:23] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'minWith' @ [690:40] ==> public fun <T> Iterable<String>.minWith(comparator: Comparator<in String> /* = Comparator<in String> */): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'STRING_CASE_INSENSITIVE_ORDER' @ [690:48] ==> public val STRING_CASE_INSENSITIVE_ORDER: Comparator<String> /* = Comparator<String> */ defined in test.comparisons in file OrderingTest.kt[PropertyDescriptorImpl]

'expect' @ [691:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'listOf' @ [691:23] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'asSequence' @ [691:40] ==> public fun <T> Iterable<String>.asSequence(): Sequence<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'minWith' @ [691:53] ==> public fun <T> Sequence<String>.minWith(comparator: Comparator<in String> /* = Comparator<in String> */): String? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'STRING_CASE_INSENSITIVE_ORDER' @ [691:61] ==> public val STRING_CASE_INSENSITIVE_ORDER: Comparator<String> /* = Comparator<String> */ defined in test.comparisons in file OrderingTest.kt[PropertyDescriptorImpl]

'Test' @ [694:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [695:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [695:24] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'maxWith' @ [695:38] ==> public fun <T> Iterable<Int>.maxWith(comparator: Comparator<in Int> /* = Comparator<in Int> */): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'naturalOrder' @ [695:46] ==> public fun <T : Comparable<Int>> naturalOrder(): Comparator<Int> /* = Comparator<Int> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'expect' @ [696:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [696:21] ==> public fun <T> listOf(element: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'maxWith' @ [696:31] ==> public fun <T> Iterable<Int>.maxWith(comparator: Comparator<in Int> /* = Comparator<in Int> */): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'naturalOrder' @ [696:39] ==> public fun <T : Comparable<Int>> naturalOrder(): Comparator<Int> /* = Comparator<Int> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'expect' @ [697:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'listOf' @ [697:23] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'maxWith' @ [697:40] ==> public fun <T> Iterable<String>.maxWith(comparator: Comparator<in String> /* = Comparator<in String> */): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'STRING_CASE_INSENSITIVE_ORDER' @ [697:48] ==> public val STRING_CASE_INSENSITIVE_ORDER: Comparator<String> /* = Comparator<String> */ defined in test.comparisons in file OrderingTest.kt[PropertyDescriptorImpl]

'expect' @ [698:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'listOf' @ [698:23] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'asSequence' @ [698:40] ==> public fun <T> Iterable<String>.asSequence(): Sequence<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'maxWith' @ [698:53] ==> public fun <T> Sequence<String>.maxWith(comparator: Comparator<in String> /* = Comparator<in String> */): String? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'STRING_CASE_INSENSITIVE_ORDER' @ [698:61] ==> public val STRING_CASE_INSENSITIVE_ORDER: Comparator<String> /* = Comparator<String> */ defined in test.comparisons in file OrderingTest.kt[PropertyDescriptorImpl]

'Test' @ [701:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [702:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [702:24] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'minBy' @ [702:38] ==> public inline fun <T, R : Comparable<Int>> Iterable<Int>.minBy(selector: (Int) -> Int): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R : Comparable<R>> -> Int

'it' @ [702:46] ==> value-parameter it: Int defined in test.collections.CollectionTest.minBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [703:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [703:21] ==> public fun <T> listOf(element: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'minBy' @ [703:31] ==> public inline fun <T, R : Comparable<Int>> Iterable<Int>.minBy(selector: (Int) -> Int): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R : Comparable<R>> -> Int

'it' @ [703:39] ==> value-parameter it: Int defined in test.collections.CollectionTest.minBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [704:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [704:21] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'minBy' @ [704:34] ==> public inline fun <T, R : Comparable<Int>> Iterable<Int>.minBy(selector: (Int) -> Int): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R : Comparable<R>> -> Int

'-' @ [704:42] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [704:43] ==> value-parameter it: Int defined in test.collections.CollectionTest.minBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [705:9] ==> public fun <@OnlyInputTypes T> expect(expected: Char?, block: () -> Char?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Char?

'listOf' @ [705:23] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'minBy' @ [705:40] ==> public inline fun <T, R : Comparable<String>> Iterable<Char>.minBy(selector: (Char) -> String): Char? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char
    <R : Comparable<R>> -> String

'it' @ [705:51] ==> value-parameter it: Char defined in test.collections.CollectionTest.minBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [706:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'listOf' @ [706:23] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'minBy' @ [706:42] ==> public inline fun <T, R : Comparable<Int>> Iterable<String>.minBy(selector: (String) -> Int): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Comparable<R>> -> Int

'it' @ [706:50] ==> value-parameter it: String defined in test.collections.CollectionTest.minBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [706:53] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'expect' @ [707:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [707:24] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'asSequence' @ [707:38] ==> public fun <T> Iterable<Int>.asSequence(): Sequence<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'minBy' @ [707:51] ==> public inline fun <T, R : Comparable<Int>> Sequence<Int>.minBy(selector: (Int) -> Int): Int? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R : Comparable<R>> -> Int

'it' @ [707:59] ==> value-parameter it: Int defined in test.collections.CollectionTest.minBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [708:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [708:21] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'asSequence' @ [708:34] ==> public fun <T> Iterable<Int>.asSequence(): Sequence<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'minBy' @ [708:47] ==> public inline fun <T, R : Comparable<Int>> Sequence<Int>.minBy(selector: (Int) -> Int): Int? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R : Comparable<R>> -> Int

'-' @ [708:55] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [708:56] ==> value-parameter it: Int defined in test.collections.CollectionTest.minBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [711:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [712:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [712:24] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'maxBy' @ [712:38] ==> public inline fun <T, R : Comparable<Int>> Iterable<Int>.maxBy(selector: (Int) -> Int): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R : Comparable<R>> -> Int

'it' @ [712:46] ==> value-parameter it: Int defined in test.collections.CollectionTest.maxBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [713:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [713:21] ==> public fun <T> listOf(element: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'maxBy' @ [713:31] ==> public inline fun <T, R : Comparable<Int>> Iterable<Int>.maxBy(selector: (Int) -> Int): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R : Comparable<R>> -> Int

'it' @ [713:39] ==> value-parameter it: Int defined in test.collections.CollectionTest.maxBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [714:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [714:21] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'maxBy' @ [714:34] ==> public inline fun <T, R : Comparable<Int>> Iterable<Int>.maxBy(selector: (Int) -> Int): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R : Comparable<R>> -> Int

'-' @ [714:42] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [714:43] ==> value-parameter it: Int defined in test.collections.CollectionTest.maxBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [715:9] ==> public fun <@OnlyInputTypes T> expect(expected: Char?, block: () -> Char?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Char?

'listOf' @ [715:23] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'maxBy' @ [715:40] ==> public inline fun <T, R : Comparable<String>> Iterable<Char>.maxBy(selector: (Char) -> String): Char? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char
    <R : Comparable<R>> -> String

'it' @ [715:51] ==> value-parameter it: Char defined in test.collections.CollectionTest.maxBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [716:9] ==> public fun <@OnlyInputTypes T> expect(expected: String?, block: () -> String?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'listOf' @ [716:25] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'maxBy' @ [716:44] ==> public inline fun <T, R : Comparable<Int>> Iterable<String>.maxBy(selector: (String) -> Int): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Comparable<R>> -> Int

'it' @ [716:52] ==> value-parameter it: String defined in test.collections.CollectionTest.maxBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [716:55] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'expect' @ [717:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [717:24] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'asSequence' @ [717:38] ==> public fun <T> Iterable<Int>.asSequence(): Sequence<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'maxBy' @ [717:51] ==> public inline fun <T, R : Comparable<Int>> Sequence<Int>.maxBy(selector: (Int) -> Int): Int? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R : Comparable<R>> -> Int

'it' @ [717:59] ==> value-parameter it: Int defined in test.collections.CollectionTest.maxBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [718:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [718:21] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'asSequence' @ [718:34] ==> public fun <T> Iterable<Int>.asSequence(): Sequence<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'maxBy' @ [718:47] ==> public inline fun <T, R : Comparable<Int>> Sequence<Int>.maxBy(selector: (Int) -> Int): Int? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R : Comparable<R>> -> Int

'-' @ [718:55] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [718:56] ==> value-parameter it: Int defined in test.collections.CollectionTest.maxBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [721:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [723:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [723:21] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'minBy' @ [723:43] ==> public inline fun <T, R : Comparable<Int>> Iterable<Int>.minBy(selector: (Int) -> Int): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R : Comparable<R>> -> Int

'c' @ [723:51] ==> var c: Int defined in test.collections.CollectionTest.minByEvaluateOnce[LocalVariableDescriptor]

'it' @ [723:56] ==> value-parameter it: Int defined in test.collections.CollectionTest.minByEvaluateOnce.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [723:61] ==> value-parameter it: Int defined in test.collections.CollectionTest.minByEvaluateOnce.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [724:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'c' @ [724:25] ==> var c: Int defined in test.collections.CollectionTest.minByEvaluateOnce[LocalVariableDescriptor]

'c' @ [725:9] ==> var c: Int defined in test.collections.CollectionTest.minByEvaluateOnce[LocalVariableDescriptor]

'expect' @ [726:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [726:21] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'asSequence' @ [726:43] ==> public fun <T> Iterable<Int>.asSequence(): Sequence<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'minBy' @ [726:56] ==> public inline fun <T, R : Comparable<Int>> Sequence<Int>.minBy(selector: (Int) -> Int): Int? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R : Comparable<R>> -> Int

'c' @ [726:64] ==> var c: Int defined in test.collections.CollectionTest.minByEvaluateOnce[LocalVariableDescriptor]

'it' @ [726:69] ==> value-parameter it: Int defined in test.collections.CollectionTest.minByEvaluateOnce.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [726:74] ==> value-parameter it: Int defined in test.collections.CollectionTest.minByEvaluateOnce.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [727:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'c' @ [727:25] ==> var c: Int defined in test.collections.CollectionTest.minByEvaluateOnce[LocalVariableDescriptor]

'Test' @ [730:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [732:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [732:21] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'maxBy' @ [732:43] ==> public inline fun <T, R : Comparable<Int>> Iterable<Int>.maxBy(selector: (Int) -> Int): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R : Comparable<R>> -> Int

'c' @ [732:51] ==> var c: Int defined in test.collections.CollectionTest.maxByEvaluateOnce[LocalVariableDescriptor]

'it' @ [732:56] ==> value-parameter it: Int defined in test.collections.CollectionTest.maxByEvaluateOnce.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [732:61] ==> value-parameter it: Int defined in test.collections.CollectionTest.maxByEvaluateOnce.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [733:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'c' @ [733:25] ==> var c: Int defined in test.collections.CollectionTest.maxByEvaluateOnce[LocalVariableDescriptor]

'c' @ [734:9] ==> var c: Int defined in test.collections.CollectionTest.maxByEvaluateOnce[LocalVariableDescriptor]

'expect' @ [735:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int?, block: () -> Int?): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'listOf' @ [735:21] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'asSequence' @ [735:43] ==> public fun <T> Iterable<Int>.asSequence(): Sequence<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'maxBy' @ [735:56] ==> public inline fun <T, R : Comparable<Int>> Sequence<Int>.maxBy(selector: (Int) -> Int): Int? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R : Comparable<R>> -> Int

'c' @ [735:64] ==> var c: Int defined in test.collections.CollectionTest.maxByEvaluateOnce[LocalVariableDescriptor]

'it' @ [735:69] ==> value-parameter it: Int defined in test.collections.CollectionTest.maxByEvaluateOnce.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [735:74] ==> value-parameter it: Int defined in test.collections.CollectionTest.maxByEvaluateOnce.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [736:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'c' @ [736:25] ==> var c: Int defined in test.collections.CollectionTest.maxByEvaluateOnce[LocalVariableDescriptor]

'Test' @ [739:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [740:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'arrayListOf' @ [740:21] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Int> /* = ArrayList<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'sum' @ [740:40] ==> @JvmName public fun Iterable<Int>.sum(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'expect' @ [741:9] ==> public fun <@OnlyInputTypes T> expect(expected: Int, block: () -> Int): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'listOf' @ [741:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'sum' @ [741:38] ==> @JvmName public fun Iterable<Int>.sum(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'expect' @ [742:9] ==> public fun <@OnlyInputTypes T> expect(expected: Double, block: () -> Double): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Double

'listOf' @ [742:23] ==> public fun <T> listOf(vararg elements: Double): List<Double> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Double

'sum' @ [742:40] ==> @JvmName public fun Iterable<Double>.sum(): Double defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'expect' @ [743:9] ==> public fun <@OnlyInputTypes T> expect(expected: Long, block: () -> Long): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Long

'arrayListOf' @ [743:33] ==> public fun <T> arrayListOf(vararg elements: Long): ArrayList<Long> /* = ArrayList<Long> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'sum' @ [743:81] ==> @JvmName public fun Iterable<Long>.sum(): Long defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'expect' @ [744:9] ==> public fun <@OnlyInputTypes T> expect(expected: Float, block: () -> Float): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Float

'toFloat' @ [744:20] ==> public open fun toFloat(): Float defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'arrayListOf' @ [744:33] ==> public fun <T> arrayListOf(vararg elements: Float): ArrayList<Float> /* = ArrayList<Float> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Float

'toFloat' @ [744:56] ==> public open fun toFloat(): Float defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'toFloat' @ [744:71] ==> public open fun toFloat(): Float defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'sum' @ [744:82] ==> @JvmName public fun Iterable<Float>.sum(): Float defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'expect' @ [745:9] ==> public fun <@OnlyInputTypes T> expect(expected: Float, block: () -> Float): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Float

'toFloat' @ [745:20] ==> public open fun toFloat(): Float defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'sequenceOf' @ [745:33] ==> public fun <T> sequenceOf(vararg elements: Float): Sequence<Float> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Float

'toFloat' @ [745:55] ==> public open fun toFloat(): Float defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'toFloat' @ [745:70] ==> public open fun toFloat(): Float defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'sum' @ [745:81] ==> @JvmName public fun Sequence<Float>.sum(): Float defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]

'Test' @ [748:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertTrue' @ [749:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'arrayListOf' @ [749:22] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Int> /* = ArrayList<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'average' @ [749:41] ==> @JvmName public fun Iterable<Int>.average(): Double defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'isNaN' @ [749:51] ==> @InlineOnly public inline fun Double.isNaN(): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]

'expect' @ [750:9] ==> public fun <@OnlyInputTypes T> expect(expected: Double, block: () -> Double): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Double

'listOf' @ [750:23] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'average' @ [750:45] ==> @JvmName public fun Iterable<Int>.average(): Double defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'expect' @ [751:9] ==> public fun <@OnlyInputTypes T> expect(expected: Double, block: () -> Double): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Double

'sequenceOf' @ [751:23] ==> public fun <T> sequenceOf(vararg elements: Double): Sequence<Double> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Double

'average' @ [751:54] ==> @JvmName public fun Sequence<Double>.average(): Double defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]

'expect' @ [752:9] ==> public fun <@OnlyInputTypes T> expect(expected: Double, block: () -> Double): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Double

'arrayListOf' @ [752:25] ==> public fun <T> arrayListOf(vararg elements: Byte): ArrayList<Byte> /* = ArrayList<Byte> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Byte

'average' @ [752:73] ==> @JvmName public fun Iterable<Byte>.average(): Double defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'..' @ [754:21] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'n' @ [754:24] ==> val n: Int defined in test.collections.CollectionTest.average[LocalVariableDescriptor]

'expect' @ [755:9] ==> public fun <@OnlyInputTypes T> expect(expected: Double, block: () -> Double): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Double

'n' @ [755:16] ==> val n: Int defined in test.collections.CollectionTest.average[LocalVariableDescriptor]

'toDouble' @ [755:18] ==> public open fun toDouble(): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'range' @ [755:34] ==> val range: IntRange defined in test.collections.CollectionTest.average[LocalVariableDescriptor]

'average' @ [755:40] ==> @JvmName public fun Iterable<Int>.average(): Double defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'Test' @ [758:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [759:9] ==> public fun <@OnlyInputTypes T> expect(expected: List<Int>, block: () -> List<Int>): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [759:16] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'..' @ [759:42] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'take' @ [759:49] ==> public fun <T> Iterable<Int>.take(n: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'expect' @ [760:9] ==> public fun <@OnlyInputTypes T> expect(expected: List<Int>, block: () -> List<Int>): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [760:16] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'..' @ [760:42] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toList' @ [760:49] ==> public fun <T> Iterable<Int>.toList(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'take' @ [760:58] ==> public fun <T> Iterable<Int>.take(n: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'expect' @ [761:9] ==> public fun <@OnlyInputTypes T> expect(expected: List<Int>, block: () -> List<Int>): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [761:16] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'..' @ [761:33] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'take' @ [761:40] ==> public fun <T> Iterable<Int>.take(n: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'expect' @ [762:9] ==> public fun <@OnlyInputTypes T> expect(expected: List<Int>, block: () -> List<Int>): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [762:16] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'..' @ [762:33] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toList' @ [762:40] ==> public fun <T> Iterable<Int>.toList(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'take' @ [762:49] ==> public fun <T> Iterable<Int>.take(n: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'expect' @ [763:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'..' @ [763:25] ==> public final operator fun rangeTo(other: Long): LongRange defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'take' @ [763:33] ==> public fun <T> Iterable<Long>.take(n: Int): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'none' @ [763:41] ==> public fun <T> Iterable<Long>.none(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'expect' @ [764:9] ==> public fun <@OnlyInputTypes T> expect(expected: Boolean, block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'listOf' @ [764:24] ==> public fun <T> listOf(element: Long): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'take' @ [764:35] ==> public fun <T> Iterable<Long>.take(n: Int): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'none' @ [764:43] ==> public fun <T> Iterable<Long>.none(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'expect' @ [765:9] ==> public fun <@OnlyInputTypes T> expect(expected: List<Int>, block: () -> List<Int>): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [765:16] ==> public fun <T> listOf(element: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'..' @ [765:30] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'take' @ [765:36] ==> public fun <T> Iterable<Int>.take(n: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'expect' @ [766:9] ==> public fun <@OnlyInputTypes T> expect(expected: List<Int>, block: () -> List<Int>): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [766:16] ==> public fun <T> listOf(element: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'listOf' @ [766:29] ==> public fun <T> listOf(element: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'take' @ [766:39] ==> public fun <T> Iterable<Int>.take(n: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [769:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [770:20] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'data' @ [772:19] ==> val data: List<Int> defined in test.collections.CollectionTest.sortInPlace[LocalVariableDescriptor]

'toMutableList' @ [772:24] ==> public fun <T> Collection<Int>.toMutableList(): MutableList<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'asc' @ [773:9] ==> val asc: MutableList<Int> defined in test.collections.CollectionTest.sortInPlace[LocalVariableDescriptor]

'sort' @ [773:13] ==> public fun <T : Comparable<Int>> MutableList<Int>.sort(): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'assertEquals' @ [774:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [774:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'asc' @ [774:40] ==> val asc: MutableList<Int> defined in test.collections.CollectionTest.sortInPlace[LocalVariableDescriptor]

'data' @ [776:20] ==> val data: List<Int> defined in test.collections.CollectionTest.sortInPlace[LocalVariableDescriptor]

'toMutableList' @ [776:25] ==> public fun <T> Collection<Int>.toMutableList(): MutableList<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'desc' @ [777:9] ==> val desc: MutableList<Int> defined in test.collections.CollectionTest.sortInPlace[LocalVariableDescriptor]

'sortDescending' @ [777:14] ==> public fun <T : Comparable<Int>> MutableList<Int>.sortDescending(): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'assertEquals' @ [778:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [778:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'desc' @ [778:40] ==> val desc: MutableList<Int> defined in test.collections.CollectionTest.sortInPlace[LocalVariableDescriptor]

'Test' @ [781:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [782:20] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [783:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [783:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'data' @ [783:40] ==> val data: List<Int> defined in test.collections.CollectionTest.sorted[LocalVariableDescriptor]

'sorted' @ [783:45] ==> public fun <T : Comparable<Int>> Iterable<Int>.sorted(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'assertEquals' @ [784:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [784:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'data' @ [784:40] ==> val data: List<Int> defined in test.collections.CollectionTest.sorted[LocalVariableDescriptor]

'sortedDescending' @ [784:45] ==> public fun <T : Comparable<Int>> Iterable<Int>.sortedDescending(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'Test' @ [787:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'arrayListOf' @ [788:20] ==> public fun <T> arrayListOf(vararg elements: Pair<String, Int>): ArrayList<Pair<String, Int>> /* = ArrayList<Pair<String, Int>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>

'to' @ [788:32] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [788:44] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [788:55] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'data' @ [789:9] ==> val data: ArrayList<Pair<String, Int>> /* = ArrayList<Pair<String, Int>> */ defined in test.collections.CollectionTest.sortByInPlace[LocalVariableDescriptor]

'sortBy' @ [789:14] ==> public inline fun <T, R : Comparable<Int>> MutableList<Pair<String, Int>>.sortBy(crossinline selector: (Pair<String, Int>) -> Int?): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>
    <R : Comparable<R>> -> Int

'it' @ [789:23] ==> value-parameter it: Pair<String, Int> defined in test.collections.CollectionTest.sortByInPlace.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [789:26] ==> public final val second: Int defined in kotlin.Pair[DeserializedPropertyDescriptor]

'assertEquals' @ [790:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Pair<String, Int>>, actual: List<Pair<String, Int>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Pair<String, Int>>

'listOf' @ [790:22] ==> public fun <T> listOf(vararg elements: Pair<String, Int>): List<Pair<String, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>

'to' @ [790:29] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [790:40] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [790:51] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'data' @ [790:64] ==> val data: ArrayList<Pair<String, Int>> /* = ArrayList<Pair<String, Int>> */ defined in test.collections.CollectionTest.sortByInPlace[LocalVariableDescriptor]

'data' @ [792:9] ==> val data: ArrayList<Pair<String, Int>> /* = ArrayList<Pair<String, Int>> */ defined in test.collections.CollectionTest.sortByInPlace[LocalVariableDescriptor]

'sortBy' @ [792:14] ==> public inline fun <T, R : Comparable<String>> MutableList<Pair<String, Int>>.sortBy(crossinline selector: (Pair<String, Int>) -> String?): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>
    <R : Comparable<R>> -> String

'it' @ [792:23] ==> value-parameter it: Pair<String, Int> defined in test.collections.CollectionTest.sortByInPlace.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [792:26] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'assertEquals' @ [793:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Pair<String, Int>>, actual: List<Pair<String, Int>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Pair<String, Int>>

'listOf' @ [793:22] ==> public fun <T> listOf(vararg elements: Pair<String, Int>): List<Pair<String, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>

'to' @ [793:29] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [793:40] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [793:52] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'data' @ [793:64] ==> val data: ArrayList<Pair<String, Int>> /* = ArrayList<Pair<String, Int>> */ defined in test.collections.CollectionTest.sortByInPlace[LocalVariableDescriptor]

'data' @ [795:9] ==> val data: ArrayList<Pair<String, Int>> /* = ArrayList<Pair<String, Int>> */ defined in test.collections.CollectionTest.sortByInPlace[LocalVariableDescriptor]

'sortByDescending' @ [795:14] ==> public inline fun <T, R : Comparable<Int>> MutableList<Pair<String, Int>>.sortByDescending(crossinline selector: (Pair<String, Int>) -> Int?): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>
    <R : Comparable<R>> -> Int

'it' @ [795:34] ==> value-parameter it: Pair<String, Int> defined in test.collections.CollectionTest.sortByInPlace.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [795:37] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [795:45] ==> value-parameter it: Pair<String, Int> defined in test.collections.CollectionTest.sortByInPlace.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [795:48] ==> public final val second: Int defined in kotlin.Pair[DeserializedPropertyDescriptor]

'length' @ [795:56] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'assertEquals' @ [796:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Pair<String, Int>>, actual: List<Pair<String, Int>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Pair<String, Int>>

'listOf' @ [796:22] ==> public fun <T> listOf(vararg elements: Pair<String, Int>): List<Pair<String, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>

'to' @ [796:29] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [796:41] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [796:52] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'data' @ [796:64] ==> val data: ArrayList<Pair<String, Int>> /* = ArrayList<Pair<String, Int>> */ defined in test.collections.CollectionTest.sortByInPlace[LocalVariableDescriptor]

'Test' @ [799:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [800:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Pair<String, Int>>, actual: List<Pair<String, Int>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Pair<String, Int>>

'listOf' @ [800:22] ==> public fun <T> listOf(vararg elements: Pair<String, Int>): List<Pair<String, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>

'to' @ [800:29] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [800:41] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'listOf' @ [800:57] ==> public fun <T> listOf(vararg elements: Pair<String, Int>): List<Pair<String, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>

'to' @ [800:64] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [800:79] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'sortedBy' @ [800:91] ==> public inline fun <T, R : Comparable<Int>> Iterable<Pair<String, Int>>.sortedBy(crossinline selector: (Pair<String, Int>) -> Int?): List<Pair<String, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>
    <R : Comparable<R>> -> Int

'it' @ [800:102] ==> value-parameter it: Pair<String, Int> defined in test.collections.CollectionTest.sortedBy.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [800:105] ==> public final val second: Int defined in kotlin.Pair[DeserializedPropertyDescriptor]

'assertEquals' @ [801:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Pair<String, Int>>, actual: List<Pair<String, Int>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Pair<String, Int>>

'listOf' @ [801:22] ==> public fun <T> listOf(vararg elements: Pair<String, Int>): List<Pair<String, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>

'to' @ [801:29] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [801:44] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'listOf' @ [801:57] ==> public fun <T> listOf(vararg elements: Pair<String, Int>): List<Pair<String, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>

'to' @ [801:64] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [801:79] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'sortedBy' @ [801:91] ==> public inline fun <T, R : Comparable<String>> Iterable<Pair<String, Int>>.sortedBy(crossinline selector: (Pair<String, Int>) -> String?): List<Pair<String, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>
    <R : Comparable<R>> -> String

'it' @ [801:102] ==> value-parameter it: Pair<String, Int> defined in test.collections.CollectionTest.sortedBy.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [801:105] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'assertEquals' @ [802:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [802:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOf' @ [802:46] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sortedByDescending' @ [802:69] ==> public inline fun <T, R : Comparable<Int>> Iterable<String>.sortedByDescending(crossinline selector: (String) -> Int?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Comparable<R>> -> Int

'it' @ [802:90] ==> value-parameter it: String defined in test.collections.CollectionTest.sortedBy.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [802:93] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'Test' @ [805:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'if (isEmpty()) null else this' @ [806:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'isEmpty' @ [806:40] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'this' @ [806:61] ==> <this> defined in test.collections.CollectionTest.sortedNullableBy.nullIfEmpty[ReceiverParameterDescriptorImpl]

'listOf' @ [807:9] ==> public fun <T> listOf(vararg elements: String?): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'let' @ [807:31] ==> @InlineOnly public inline fun <T, R> List<String?>.let(block: (List<String?>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<String?>
    <R> -> Unit

'expect' @ [808:13] ==> public fun <@OnlyInputTypes T> expect(expected: List<String?>, block: () -> List<String?>): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String?>

'listOf' @ [808:20] ==> public fun <T> listOf(vararg elements: String?): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'it' @ [808:45] ==> value-parameter it: List<String?> defined in test.collections.CollectionTest.sortedNullableBy.<anonymous>[ValueParameterDescriptorImpl]

'sortedWith' @ [808:48] ==> public fun <T> Iterable<String?>.sortedWith(comparator: Comparator<in String?> /* = Comparator<in String?> */): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'nullsFirst' @ [808:59] ==> public fun <T : Any> nullsFirst(comparator: Comparator<in String> /* = Comparator<in String> */): Comparator<String?> /* = Comparator<String?> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'compareBy' @ [808:70] ==> @InlineOnly public inline fun <T> compareBy(crossinline selector: (String) -> Comparable<*>?): Comparator<String> /* = Comparator<String> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [808:82] ==> value-parameter it: String defined in test.collections.CollectionTest.sortedNullableBy.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [809:13] ==> public fun <@OnlyInputTypes T> expect(expected: List<String?>, block: () -> List<String?>): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String?>

'listOf' @ [809:20] ==> public fun <T> listOf(vararg elements: String?): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'it' @ [809:45] ==> value-parameter it: List<String?> defined in test.collections.CollectionTest.sortedNullableBy.<anonymous>[ValueParameterDescriptorImpl]

'sortedWith' @ [809:48] ==> public fun <T> Iterable<String?>.sortedWith(comparator: Comparator<in String?> /* = Comparator<in String?> */): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'nullsLast' @ [809:59] ==> public fun <T : Any> nullsLast(comparator: Comparator<in String> /* = Comparator<in String> */): Comparator<String?> /* = Comparator<String?> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'compareByDescending' @ [809:69] ==> @InlineOnly public inline fun <T> compareByDescending(crossinline selector: (String) -> Comparable<*>?): Comparator<String> /* = Comparator<String> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [809:91] ==> value-parameter it: String defined in test.collections.CollectionTest.sortedNullableBy.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expect' @ [810:13] ==> public fun <@OnlyInputTypes T> expect(expected: List<String?>, block: () -> List<String?>): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String?>

'listOf' @ [810:20] ==> public fun <T> listOf(vararg elements: String?): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'it' @ [810:45] ==> value-parameter it: List<String?> defined in test.collections.CollectionTest.sortedNullableBy.<anonymous>[ValueParameterDescriptorImpl]

'sortedWith' @ [810:48] ==> public fun <T> Iterable<String?>.sortedWith(comparator: Comparator<in String?> /* = Comparator<in String?> */): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'nullsFirst' @ [810:59] ==> public fun <T : Any> nullsFirst(comparator: Comparator<in String> /* = Comparator<in String> */): Comparator<String?> /* = Comparator<String?> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'compareByDescending' @ [810:70] ==> @InlineOnly public inline fun <T> compareByDescending(crossinline selector: (String) -> Comparable<*>?): Comparator<String> /* = Comparator<String> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [810:92] ==> value-parameter it: String defined in test.collections.CollectionTest.sortedNullableBy.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'nullIfEmpty' @ [810:95] ==> local final fun String.nullIfEmpty(): String? defined in test.collections.CollectionTest.sortedNullableBy[SimpleFunctionDescriptorImpl]

'Test' @ [814:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'if (isEmpty()) null else length' @ [815:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int?, elseBranch: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int?

'isEmpty' @ [815:43] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'length' @ [815:64] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'listOf' @ [816:9] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'let' @ [816:35] ==> @InlineOnly public inline fun <T, R> List<String>.let(block: (List<String>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<String>
    <R> -> Unit

'assertEquals' @ [817:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [817:26] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [817:53] ==> value-parameter it: List<String> defined in test.collections.CollectionTest.sortedByNullable.<anonymous>[ValueParameterDescriptorImpl]

'sortedBy' @ [817:56] ==> public inline fun <T, R : Comparable<Int>> Iterable<String>.sortedBy(crossinline selector: (String) -> Int?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Comparable<R>> -> Int

'it' @ [817:67] ==> value-parameter it: String defined in test.collections.CollectionTest.sortedByNullable.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'nonEmptyLength' @ [817:70] ==> local final fun String.nonEmptyLength(): Int? defined in test.collections.CollectionTest.sortedByNullable[SimpleFunctionDescriptorImpl]

'assertEquals' @ [818:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [818:26] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [818:53] ==> value-parameter it: List<String> defined in test.collections.CollectionTest.sortedByNullable.<anonymous>[ValueParameterDescriptorImpl]

'sortedByDescending' @ [818:56] ==> public inline fun <T, R : Comparable<Int>> Iterable<String>.sortedByDescending(crossinline selector: (String) -> Int?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Comparable<R>> -> Int

'it' @ [818:77] ==> value-parameter it: String defined in test.collections.CollectionTest.sortedByNullable.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'nonEmptyLength' @ [818:80] ==> local final fun String.nonEmptyLength(): Int? defined in test.collections.CollectionTest.sortedByNullable[SimpleFunctionDescriptorImpl]

'assertEquals' @ [819:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [819:26] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [819:53] ==> value-parameter it: List<String> defined in test.collections.CollectionTest.sortedByNullable.<anonymous>[ValueParameterDescriptorImpl]

'sortedWith' @ [819:56] ==> public fun <T> Iterable<String>.sortedWith(comparator: Comparator<in String> /* = Comparator<in String> */): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'compareBy' @ [819:67] ==> @InlineOnly public inline fun <T, K> compareBy(comparator: Comparator<in Int?> /* = Comparator<in Int?> */, crossinline selector: (String) -> Int?): Comparator<String> /* = Comparator<String> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Int?

'nullsLast' @ [819:77] ==> @InlineOnly public inline fun <T : Comparable<Int>> nullsLast(): Comparator<Int?> /* = Comparator<Int?> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'it' @ [819:97] ==> value-parameter it: String defined in test.collections.CollectionTest.sortedByNullable.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'nonEmptyLength' @ [819:100] ==> local final fun String.nonEmptyLength(): Int? defined in test.collections.CollectionTest.sortedByNullable[SimpleFunctionDescriptorImpl]

'Test' @ [823:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'compareBy' @ [824:26] ==> @InlineOnly public inline fun <T> compareBy(crossinline selector: (String) -> Comparable<*>?): Comparator<String> /* = Comparator<String> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [824:46] ==> value-parameter it: String defined in test.collections.CollectionTest.sortedWith.<anonymous>[ValueParameterDescriptorImpl]

'toUpperCase' @ [824:49] ==> @InlineOnly public inline fun String.toUpperCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'reversed' @ [824:63] ==> @InlineOnly public inline fun String.reversed(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'listOf' @ [825:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expect' @ [827:9] ==> public fun <@OnlyInputTypes T> expect(expected: List<String>, block: () -> List<String>): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [827:16] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [827:47] ==> val data: List<String> defined in test.collections.CollectionTest.sortedWith[LocalVariableDescriptor]

'sortedWith' @ [827:52] ==> public fun <T> Iterable<String>.sortedWith(comparator: Comparator<in String> /* = Comparator<in String> */): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'comparator' @ [827:63] ==> val comparator: Comparator<String> /* = Comparator<String> */ defined in test.collections.CollectionTest.sortedWith[LocalVariableDescriptor]

'expect' @ [828:9] ==> public fun <@OnlyInputTypes T> expect(expected: List<String>, block: () -> List<String>): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [828:16] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [828:47] ==> val data: List<String> defined in test.collections.CollectionTest.sortedWith[LocalVariableDescriptor]

'sortedWith' @ [828:52] ==> public fun <T> Iterable<String>.sortedWith(comparator: Comparator<in String> /* = Comparator<in String> */): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'comparator' @ [828:63] ==> val comparator: Comparator<String> /* = Comparator<String> */ defined in test.collections.CollectionTest.sortedWith[LocalVariableDescriptor]

'reversed' @ [828:74] ==> public fun <T> Comparator<String> /* = Comparator<String> */.reversed(): Comparator<String> /* = Comparator<String> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expect' @ [829:9] ==> public fun <@OnlyInputTypes T> expect(expected: List<String>, block: () -> List<String>): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [829:16] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [829:47] ==> val data: List<String> defined in test.collections.CollectionTest.sortedWith[LocalVariableDescriptor]

'sortedWith' @ [829:52] ==> public fun <T> Iterable<String>.sortedWith(comparator: Comparator<in String> /* = Comparator<in String> */): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'comparator' @ [829:63] ==> val comparator: Comparator<String> /* = Comparator<String> */ defined in test.collections.CollectionTest.sortedWith[LocalVariableDescriptor]

'reversed' @ [829:74] ==> public fun <T> Comparator<String> /* = Comparator<String> */.reversed(): Comparator<String> /* = Comparator<String> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'reversed' @ [829:85] ==> public fun <T> Comparator<String> /* = Comparator<String> */.reversed(): Comparator<String> /* = Comparator<String> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [832:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'component1' @ [833:14] ==> @InlineOnly public operator inline fun <T> List<Int>.component1(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'listOf' @ [833:23] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [834:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'first' @ [834:22] ==> val first: Int defined in test.collections.CollectionTest.decomposeFirst[LocalVariableDescriptor]

'Test' @ [837:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'component1' @ [838:14] ==> @InlineOnly public operator inline fun <T> List<String>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'component2' @ [838:19] ==> @InlineOnly public operator inline fun <T> List<String>.component2(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'split' @ [838:42] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [838:53] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [838:59] ==> value-parameter it: String defined in test.collections.CollectionTest.decomposeSplit.<anonymous>[ValueParameterDescriptorImpl]

'trim' @ [838:62] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [839:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'key' @ [839:22] ==> val key: String defined in test.collections.CollectionTest.decomposeSplit[LocalVariableDescriptor]

'assertEquals' @ [840:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'value' @ [840:22] ==> val value: String defined in test.collections.CollectionTest.decomposeSplit[LocalVariableDescriptor]

'Test' @ [843:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'component1' @ [844:14] ==> @InlineOnly public operator inline fun <T> List<Int>.component1(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'component2' @ [844:17] ==> @InlineOnly public operator inline fun <T> List<Int>.component2(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'component3' @ [844:20] ==> @InlineOnly public operator inline fun <T> List<Int>.component3(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'component4' @ [844:23] ==> @InlineOnly public operator inline fun <T> List<Int>.component4(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'component5' @ [844:26] ==> @InlineOnly public operator inline fun <T> List<Int>.component5(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'listOf' @ [844:31] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [845:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'a' @ [845:22] ==> val a: Int defined in test.collections.CollectionTest.decomposeList[LocalVariableDescriptor]

'assertEquals' @ [846:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'b' @ [846:22] ==> val b: Int defined in test.collections.CollectionTest.decomposeList[LocalVariableDescriptor]

'assertEquals' @ [847:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'c' @ [847:22] ==> val c: Int defined in test.collections.CollectionTest.decomposeList[LocalVariableDescriptor]

'assertEquals' @ [848:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'd' @ [848:22] ==> val d: Int defined in test.collections.CollectionTest.decomposeList[LocalVariableDescriptor]

'assertEquals' @ [849:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'e' @ [849:22] ==> val e: Int defined in test.collections.CollectionTest.decomposeList[LocalVariableDescriptor]

'Test' @ [852:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'component1' @ [853:14] ==> @InlineOnly public operator inline fun <T> Array<out Int>.component1(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'component2' @ [853:17] ==> @InlineOnly public operator inline fun <T> Array<out Int>.component2(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'component3' @ [853:20] ==> @InlineOnly public operator inline fun <T> Array<out Int>.component3(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'component4' @ [853:23] ==> @InlineOnly public operator inline fun <T> Array<out Int>.component4(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'component5' @ [853:26] ==> @InlineOnly public operator inline fun <T> Array<out Int>.component5(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'arrayOf' @ [853:31] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Int): Array<Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Int

'assertEquals' @ [854:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'a' @ [854:22] ==> val a: Int defined in test.collections.CollectionTest.decomposeArray[LocalVariableDescriptor]

'assertEquals' @ [855:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'b' @ [855:22] ==> val b: Int defined in test.collections.CollectionTest.decomposeArray[LocalVariableDescriptor]

'assertEquals' @ [856:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'c' @ [856:22] ==> val c: Int defined in test.collections.CollectionTest.decomposeArray[LocalVariableDescriptor]

'assertEquals' @ [857:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'd' @ [857:22] ==> val d: Int defined in test.collections.CollectionTest.decomposeArray[LocalVariableDescriptor]

'assertEquals' @ [858:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'e' @ [858:22] ==> val e: Int defined in test.collections.CollectionTest.decomposeArray[LocalVariableDescriptor]

'Test' @ [861:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'component1' @ [862:14] ==> @InlineOnly public operator inline fun IntArray.component1(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'component2' @ [862:17] ==> @InlineOnly public operator inline fun IntArray.component2(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'component3' @ [862:20] ==> @InlineOnly public operator inline fun IntArray.component3(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'component4' @ [862:23] ==> @InlineOnly public operator inline fun IntArray.component4(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'component5' @ [862:26] ==> @InlineOnly public operator inline fun IntArray.component5(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'intArrayOf' @ [862:31] ==> public fun intArrayOf(vararg elements: Int): IntArray defined in kotlin[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [863:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'a' @ [863:22] ==> val a: Int defined in test.collections.CollectionTest.decomposeIntArray[LocalVariableDescriptor]

'assertEquals' @ [864:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'b' @ [864:22] ==> val b: Int defined in test.collections.CollectionTest.decomposeIntArray[LocalVariableDescriptor]

'assertEquals' @ [865:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'c' @ [865:22] ==> val c: Int defined in test.collections.CollectionTest.decomposeIntArray[LocalVariableDescriptor]

'assertEquals' @ [866:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'd' @ [866:22] ==> val d: Int defined in test.collections.CollectionTest.decomposeIntArray[LocalVariableDescriptor]

'assertEquals' @ [867:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'e' @ [867:22] ==> val e: Int defined in test.collections.CollectionTest.decomposeIntArray[LocalVariableDescriptor]

'Test' @ [870:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [871:20] ==> public fun <T> listOf(vararg elements: Pair<Int, Char>): List<Pair<Int, Char>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Int, Char>

'to' @ [871:27] ==> public infix fun <A, B> Int.to(that: Char): Pair<Int, Char> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> Char

'to' @ [871:37] ==> public infix fun <A, B> Int.to(that: Char): Pair<Int, Char> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> Char

'to' @ [871:47] ==> public infix fun <A, B> Int.to(that: Char): Pair<Int, Char> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> Char

'component1' @ [872:14] ==> public final operator fun component1(): List<Int> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [872:20] ==> public final operator fun component2(): List<Char> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'list' @ [872:29] ==> val list: List<Pair<Int, Char>> defined in test.collections.CollectionTest.unzipList[LocalVariableDescriptor]

'unzip' @ [872:34] ==> public fun <T, R> Iterable<Pair<Int, Char>>.unzip(): Pair<List<Int>, List<Char>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Char

'assertEquals' @ [873:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [873:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'ints' @ [873:39] ==> val ints: List<Int> defined in test.collections.CollectionTest.unzipList[LocalVariableDescriptor]

'assertEquals' @ [874:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Char>, actual: List<Char>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Char>

'listOf' @ [874:22] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'chars' @ [874:45] ==> val chars: List<Char> defined in test.collections.CollectionTest.unzipList[LocalVariableDescriptor]

'Test' @ [877:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'arrayOf' @ [878:21] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Pair<Int, Char>): Array<Pair<Int, Char>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Pair<Int, Char>

'to' @ [878:29] ==> public infix fun <A, B> Int.to(that: Char): Pair<Int, Char> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> Char

'to' @ [878:39] ==> public infix fun <A, B> Int.to(that: Char): Pair<Int, Char> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> Char

'to' @ [878:49] ==> public infix fun <A, B> Int.to(that: Char): Pair<Int, Char> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> Char

'component1' @ [879:14] ==> public final operator fun component1(): List<Int> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [879:20] ==> public final operator fun component2(): List<Char> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'array' @ [879:29] ==> val array: Array<Pair<Int, Char>> defined in test.collections.CollectionTest.unzipArray[LocalVariableDescriptor]

'unzip' @ [879:35] ==> public fun <T, R> Array<out Pair<Int, Char>>.unzip(): Pair<List<Int>, List<Char>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Char

'assertEquals' @ [880:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [880:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'ints' @ [880:39] ==> val ints: List<Int> defined in test.collections.CollectionTest.unzipArray[LocalVariableDescriptor]

'assertEquals' @ [881:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Char>, actual: List<Char>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Char>

'listOf' @ [881:22] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'chars' @ [881:45] ==> val chars: List<Char> defined in test.collections.CollectionTest.unzipArray[LocalVariableDescriptor]

'Test' @ [884:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'compare' @ [885:9] ==> public fun <T> compare(expected: List<Int>, actual: List<Int>, block: CompareContext<List<Int>>.() -> Unit): Unit defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<Int>

'arrayListOf' @ [885:17] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Int> /* = ArrayList<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'listOf' @ [885:37] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'listBehavior' @ [885:54] ==> public fun <T> CompareContext<List<Int>>.listBehavior(): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Int

'compare' @ [886:9] ==> public fun <T> compare(expected: List<Double>, actual: List<Double>, block: CompareContext<List<Double>>.() -> Unit): Unit defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<Double>

'arrayListOf' @ [886:17] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Double> /* = ArrayList<Double> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Double

'emptyList' @ [886:40] ==> public fun <T> emptyList(): List<Double> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Double

'listBehavior' @ [886:63] ==> public fun <T> CompareContext<List<Double>>.listBehavior(): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Double

'compare' @ [887:9] ==> public fun <T> compare(expected: List<String>, actual: List<String>, block: CompareContext<List<String>>.() -> Unit): Unit defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<String>

'arrayListOf' @ [887:17] ==> public fun <T> arrayListOf(vararg elements: String): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOf' @ [887:39] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listBehavior' @ [887:58] ==> public fun <T> CompareContext<List<String>>.listBehavior(): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'Test' @ [890:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'compare' @ [891:9] ==> public fun <T> compare(expected: Set<Int>, actual: Set<Int>, block: CompareContext<Set<Int>>.() -> Unit): Unit defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Set<Int>

'linkedSetOf' @ [891:17] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<Int> /* = LinkedHashSet<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'setOf' @ [891:37] ==> @InlineOnly public inline fun <T> setOf(): Set<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'setBehavior' @ [891:53] ==> public fun <T> CompareContext<Set<Int>>.setBehavior(objectName: String = ...): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Int

'compare' @ [892:9] ==> public fun <T> compare(expected: Set<Double>, actual: Set<Double>, block: CompareContext<Set<Double>>.() -> Unit): Unit defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Set<Double>

'hashSetOf' @ [892:17] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<Double> /* = HashSet<Double> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Double

'emptySet' @ [892:38] ==> public fun <T> emptySet(): Set<Double> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Double

'setBehavior' @ [892:60] ==> public fun <T> CompareContext<Set<Double>>.setBehavior(objectName: String = ...): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Double

'compare' @ [893:9] ==> public fun <T> compare(expected: Set<String>, actual: Set<String>, block: CompareContext<Set<String>>.() -> Unit): Unit defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Set<String>

'listOf' @ [893:17] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'toMutableSet' @ [893:33] ==> public fun <T> Iterable<String>.toMutableSet(): MutableSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'setOf' @ [893:49] ==> public fun <T> setOf(element: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'setBehavior' @ [893:67] ==> public fun <T> CompareContext<Set<String>>.setBehavior(objectName: String = ...): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'Test' @ [896:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'compare' @ [897:9] ==> public fun <T> compare(expected: Map<String, Int>, actual: Map<String, Int>, block: CompareContext<Map<String, Int>>.() -> Unit): Unit defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Map<String, Int>

'hashMapOf' @ [897:17] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, Int> /* = HashMap<String, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'mapOf' @ [897:43] ==> @InlineOnly public inline fun <K, V> mapOf(): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'mapBehavior' @ [897:67] ==> public fun <K, V> CompareContext<Map<String, Int>>.mapBehavior(): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> Int

'compare' @ [898:9] ==> public fun <T> compare(expected: Map<Int, String>, actual: Map<Int, String>, block: CompareContext<Map<Int, String>>.() -> Unit): Unit defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Map<Int, String>

'linkedMapOf' @ [898:17] ==> @SinceKotlin @InlineOnly public inline fun <K, V> linkedMapOf(): LinkedHashMap<Int, String> /* = LinkedHashMap<Int, String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> String

'emptyMap' @ [898:45] ==> public fun <K, V> emptyMap(): Map<Int, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> String

'mapBehavior' @ [898:72] ==> public fun <K, V> CompareContext<Map<Int, String>>.mapBehavior(): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> Int
    <V> -> String

'compare' @ [899:9] ==> public fun <T> compare(expected: Map<Int, Int>, actual: Map<Int, Int>, block: CompareContext<Map<Int, Int>>.() -> Unit): Unit defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Map<Int, Int>

'linkedMapOf' @ [899:17] ==> public fun <K, V> linkedMapOf(vararg pairs: Pair<Int, Int>): LinkedHashMap<Int, Int> /* = LinkedHashMap<Int, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> Int

'to' @ [899:29] ==> public infix fun <A, B> Int.to(that: Int): Pair<Int, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> Int

'mapOf' @ [899:38] ==> public fun <K, V> mapOf(pair: Pair<Int, Int>): Map<Int, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> Int

'to' @ [899:44] ==> public infix fun <A, B> Int.to(that: Int): Pair<Int, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> Int

'mapBehavior' @ [899:55] ==> public fun <K, V> CompareContext<Map<Int, Int>>.mapBehavior(): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> Int
    <V> -> Int

'Test' @ [902:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [904:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'Long' @ [904:38] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [904:43] ==> public const final val MAX_VALUE: Long defined in kotlin.Long.Companion[DeserializedPropertyDescriptor]

'toString' @ [904:53] ==> public open fun toString(): String defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'listOf' @ [904:68] ==> public fun <T> listOf(vararg elements: {Comparable<{Long & String}> & java.io.Serializable}?): List<{Comparable<{Long & String}> & java.io.Serializable}?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> {Comparable<{Long & String}> & java.io.Serializable}?

'Long' @ [904:89] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [904:94] ==> public const final val MAX_VALUE: Long defined in kotlin.Long.Companion[DeserializedPropertyDescriptor]

'toString' @ [904:105] ==> public open fun toString(): String defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'Test' @ [907:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertTrue' @ [908:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'arrayListOf' @ [908:20] ==> public fun <T> arrayListOf(vararg elements: Int): ArrayList<Int> /* = ArrayList<Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertTrue' @ [909:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'listOf' @ [909:20] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertTrue' @ [910:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'listOf' @ [910:20] ==> public fun <T> listOf(element: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertTrue' @ [911:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [911:20] ==> public fun <T> emptyList(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [914:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'AbstractCollection<E>' @ [915:64] ==> protected constructor AbstractCollection<out E>() defined in kotlin.collections.AbstractCollection[DeserializedClassConstructorDescriptor]
Inferred types:
    <out E> -> E

'mutableListOf' @ [916:31] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [917:39] ==> public final val data: Collection<E> defined in test.collections.CollectionTest.abstractCollectionToArray.TestCollection[PropertyDescriptorImpl]

'size' @ [917:44] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'data' @ [918:39] ==> public final val data: Collection<E> defined in test.collections.CollectionTest.abstractCollectionToArray.TestCollection[PropertyDescriptorImpl]

'iterator' @ [918:44] ==> public abstract fun iterator(): Iterator<E> defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'invocations' @ [921:17] ==> public final val invocations: MutableList<String> defined in test.collections.CollectionTest.abstractCollectionToArray.TestCollection[PropertyDescriptorImpl]

'data' @ [922:24] ==> public final val data: Collection<E> defined in test.collections.CollectionTest.abstractCollectionToArray.TestCollection[PropertyDescriptorImpl]

'toTypedArray' @ [922:29] ==> public inline fun <reified T> Collection<Any?>.toTypedArray(): Array<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Any?

'invocations' @ [925:17] ==> public final val invocations: MutableList<String> defined in test.collections.CollectionTest.abstractCollectionToArray.TestCollection[PropertyDescriptorImpl]

'super' @ [926:24] ==> <this> defined in test.collections.CollectionTest.abstractCollectionToArray.TestCollection[LazyClassReceiverParameterDescriptor]

'toArray' @ [926:30] ==> protected open fun <T> toArray(array: Array<T>): Array<T> defined in kotlin.collections.AbstractCollection[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'array' @ [926:38] ==> value-parameter array: Array<T> defined in test.collections.CollectionTest.abstractCollectionToArray.TestCollection.toArray[ValueParameterDescriptorImpl]

'listOf' @ [929:20] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'TestCollection' @ [930:20] ==> public constructor TestCollection<out E>(data: Collection<String>) defined in test.collections.CollectionTest.abstractCollectionToArray.TestCollection[ClassConstructorDescriptorImpl]
Inferred types:
    <out E> -> String

'data' @ [930:35] ==> val data: List<String> defined in test.collections.CollectionTest.abstractCollectionToArray[LocalVariableDescriptor]

'coll' @ [932:20] ==> val coll: TestCollection<String> defined in test.collections.CollectionTest.abstractCollectionToArray[LocalVariableDescriptor]

'toTypedArray' @ [932:25] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'assertEquals' @ [933:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'data' @ [933:22] ==> val data: List<String> defined in test.collections.CollectionTest.abstractCollectionToArray[LocalVariableDescriptor]

'arr1' @ [933:28] ==> val arr1: Array<String> defined in test.collections.CollectionTest.abstractCollectionToArray[LocalVariableDescriptor]

'asList' @ [933:33] ==> public fun <T> Array<out String>.asList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertTrue' @ [934:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'in' @ [934:20] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'coll' @ [934:34] ==> val coll: TestCollection<String> defined in test.collections.CollectionTest.abstractCollectionToArray[LocalVariableDescriptor]

'invocations' @ [934:39] ==> public final val invocations: MutableList<String> defined in test.collections.CollectionTest.abstractCollectionToArray.TestCollection[PropertyDescriptorImpl]

'in' @ [934:54] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'coll' @ [934:68] ==> val coll: TestCollection<String> defined in test.collections.CollectionTest.abstractCollectionToArray[LocalVariableDescriptor]

'invocations' @ [934:73] ==> public final val invocations: MutableList<String> defined in test.collections.CollectionTest.abstractCollectionToArray.TestCollection[PropertyDescriptorImpl]

'coll' @ [936:35] ==> val coll: TestCollection<String> defined in test.collections.CollectionTest.abstractCollectionToArray[LocalVariableDescriptor]

'toArray' @ [936:40] ==> public open fun <T> toArray(array: Array<String>): Array<String> defined in test.collections.CollectionTest.abstractCollectionToArray.TestCollection[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'Array' @ [936:48] ==> public constructor Array<T>(size: Int, init: (Int) -> String) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> String

'coll' @ [936:54] ==> val coll: TestCollection<String> defined in test.collections.CollectionTest.abstractCollectionToArray[LocalVariableDescriptor]

'size' @ [936:59] ==> public open val size: Int defined in test.collections.CollectionTest.abstractCollectionToArray.TestCollection[PropertyDescriptorImpl]

'assertEquals' @ [937:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String?>, actual: List<String?>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String?>

'data' @ [937:22] ==> val data: List<String> defined in test.collections.CollectionTest.abstractCollectionToArray[LocalVariableDescriptor]

'listOf' @ [937:29] ==> public fun <T> listOf(element: Nothing?): List<Nothing?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Nothing?

'arr2' @ [937:43] ==> val arr2: Array<String> defined in test.collections.CollectionTest.abstractCollectionToArray[LocalVariableDescriptor]

'asList' @ [937:48] ==> public fun <T> Array<out String>.asList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

