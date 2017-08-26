'Test' @ [9:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mapOf' @ [10:20] ==> @InlineOnly public inline fun <K, V> mapOf(): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'data' @ [11:17] ==> val data: Map<String, Int> defined in test.collections.MapTest.getOrElse[LocalVariableDescriptor]

'getOrElse' @ [11:22] ==> @InlineOnly public inline fun <K, V> Map<String, Int>.getOrElse(key: String, defaultValue: () -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'assertEquals' @ [12:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'a' @ [12:25] ==> val a: Int defined in test.collections.MapTest.getOrElse[LocalVariableDescriptor]

'data' @ [13:18] ==> val data: Map<String, Int> defined in test.collections.MapTest.getOrElse[LocalVariableDescriptor]

'getOrElse' @ [13:23] ==> @InlineOnly public inline fun <K, V> Map<String, Int?>.getOrElse(key: String, defaultValue: () -> Int?): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int?

'data' @ [13:42] ==> val data: Map<String, Int> defined in test.collections.MapTest.getOrElse[LocalVariableDescriptor]

'get' @ [13:47] ==> public abstract operator fun get(key: String): Int? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [14:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'a1' @ [14:25] ==> val a1: Int defined in test.collections.MapTest.getOrElse[LocalVariableDescriptor]

'data' @ [16:17] ==> val data: Map<String, Int> defined in test.collections.MapTest.getOrElse[LocalVariableDescriptor]

'getOrElse' @ [16:22] ==> @InlineOnly public inline fun <K, V> Map<String, Int>.getOrElse(key: String, defaultValue: () -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'assertEquals' @ [17:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'b' @ [17:25] ==> val b: Int defined in test.collections.MapTest.getOrElse[LocalVariableDescriptor]

'assertEquals' @ [18:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'data' @ [18:25] ==> val data: Map<String, Int> defined in test.collections.MapTest.getOrElse[LocalVariableDescriptor]

'size' @ [18:30] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'mapOf' @ [20:21] ==> @InlineOnly public inline fun <K, V> mapOf(): Map<String, Int?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int?

'empty' @ [21:17] ==> val empty: Map<String, Int?> defined in test.collections.MapTest.getOrElse[LocalVariableDescriptor]

'getOrElse' @ [21:23] ==> @InlineOnly public inline fun <K, V> Map<String, Int?>.getOrElse(key: String, defaultValue: () -> Int?): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int?

'assertEquals' @ [22:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'c' @ [22:28] ==> val c: Int? defined in test.collections.MapTest.getOrElse[LocalVariableDescriptor]

'mapOf' @ [24:24] ==> public fun <K, V> mapOf(pair: Pair<Int, Nothing?>): Map<Int, Nothing?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> Nothing?

'to' @ [24:30] ==> public infix fun <A, B> Int.to(that: Nothing?): Pair<Int, Nothing?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> Nothing?

'nullable' @ [25:17] ==> val nullable: Map<Int, Nothing?> defined in test.collections.MapTest.getOrElse[LocalVariableDescriptor]

'getOrElse' @ [25:26] ==> @InlineOnly public inline fun <K, V> Map<Int, String?>.getOrElse(key: Int, defaultValue: () -> String?): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> String?

'assertEquals' @ [26:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'd' @ [26:27] ==> val d: String? defined in test.collections.MapTest.getOrElse[LocalVariableDescriptor]

'Test' @ [29:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'hashMapOf' @ [30:45] ==> public fun <K, V> hashMapOf(vararg pairs: Pair<String, Int>): HashMap<String, Int> /* = HashMap<String, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [30:55] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'assertFailsWith' @ [31:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): NoSuchElementException /* = NoSuchElementException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> NoSuchElementException

'data' @ [31:51] ==> val data: MutableMap<String, Int> defined in test.collections.MapTest.getValue[LocalVariableDescriptor]

'getValue' @ [31:56] ==> @SinceKotlin public fun <K, V> Map<String, Int>.getValue(key: String): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'let' @ [31:74] ==> @InlineOnly public inline fun <T, R> NoSuchElementException /* = NoSuchElementException */.let(block: (NoSuchElementException /* = NoSuchElementException */) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NoSuchElementException
    <R> -> Unit

'assertTrue' @ [32:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'in' @ [32:24] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'e' @ [32:33] ==> value-parameter e: NoSuchElementException /* = NoSuchElementException */ defined in test.collections.MapTest.getValue.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [32:35] ==> public open val message: String? defined in java.util.NoSuchElementException[DeserializedPropertyDescriptor]

'assertEquals' @ [34:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'data' @ [34:25] ==> val data: MutableMap<String, Int> defined in test.collections.MapTest.getValue[LocalVariableDescriptor]

'getValue' @ [34:30] ==> @SinceKotlin public fun <K, V> Map<String, Int>.getValue(key: String): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'data' @ [36:34] ==> val data: MutableMap<String, Int> defined in test.collections.MapTest.getValue[LocalVariableDescriptor]

'withDefault' @ [36:39] ==> @JvmName public fun <K, V> MutableMap<String, Int>.withDefault(defaultValue: (String) -> Int): MutableMap<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'assertEquals' @ [37:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'mutableWithDefault' @ [37:26] ==> val mutableWithDefault: MutableMap<String, Int> defined in test.collections.MapTest.getValue[LocalVariableDescriptor]

'getValue' @ [37:45] ==> @SinceKotlin public fun <K, V> Map<String, Int>.getValue(key: String): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'mutableWithDefault' @ [40:9] ==> val mutableWithDefault: MutableMap<String, Int> defined in test.collections.MapTest.getValue[LocalVariableDescriptor]

'assertEquals' @ [41:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'data' @ [41:25] ==> val data: MutableMap<String, Int> defined in test.collections.MapTest.getValue[LocalVariableDescriptor]

'data' @ [42:9] ==> val data: MutableMap<String, Int> defined in test.collections.MapTest.getValue[LocalVariableDescriptor]

'assertEquals' @ [43:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'mutableWithDefault' @ [43:25] ==> val mutableWithDefault: MutableMap<String, Int> defined in test.collections.MapTest.getValue[LocalVariableDescriptor]

'data' @ [45:36] ==> val data: MutableMap<String, Int> defined in test.collections.MapTest.getValue[LocalVariableDescriptor]

'withDefault' @ [45:62] ==> public fun <K, V> Map<String, Int>.withDefault(defaultValue: (String) -> Int): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [45:76] ==> value-parameter it: String defined in test.collections.MapTest.getValue.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [45:79] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'assertEquals' @ [46:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'readonlyWithDefault' @ [46:25] ==> val readonlyWithDefault: Map<String, Int> defined in test.collections.MapTest.getValue[LocalVariableDescriptor]

'getValue' @ [46:45] ==> @SinceKotlin public fun <K, V> Map<String, Int>.getValue(key: String): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'readonlyWithDefault' @ [48:35] ==> val readonlyWithDefault: Map<String, Int> defined in test.collections.MapTest.getValue[LocalVariableDescriptor]

'withDefault' @ [48:55] ==> public fun <K, V> Map<String, Int>.withDefault(defaultValue: (String) -> Int): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'assertEquals' @ [49:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'withReplacedDefault' @ [49:26] ==> val withReplacedDefault: Map<String, Int> defined in test.collections.MapTest.getValue[LocalVariableDescriptor]

'getValue' @ [49:46] ==> @SinceKotlin public fun <K, V> Map<String, Int>.getValue(key: String): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'Test' @ [52:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'hashMapOf' @ [53:20] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, Int> /* = HashMap<String, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'data' @ [54:17] ==> val data: HashMap<String, Int> /* = HashMap<String, Int> */ defined in test.collections.MapTest.getOrPut[LocalVariableDescriptor]

'getOrPut' @ [54:22] ==> public inline fun <K, V> MutableMap<String, Int>.getOrPut(key: String, defaultValue: () -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'assertEquals' @ [55:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'a' @ [55:25] ==> val a: Int defined in test.collections.MapTest.getOrPut[LocalVariableDescriptor]

'data' @ [57:17] ==> val data: HashMap<String, Int> /* = HashMap<String, Int> */ defined in test.collections.MapTest.getOrPut[LocalVariableDescriptor]

'getOrPut' @ [57:22] ==> public inline fun <K, V> MutableMap<String, Int>.getOrPut(key: String, defaultValue: () -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'assertEquals' @ [58:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'b' @ [58:25] ==> val b: Int defined in test.collections.MapTest.getOrPut[LocalVariableDescriptor]

'assertEquals' @ [60:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'data' @ [60:25] ==> val data: HashMap<String, Int> /* = HashMap<String, Int> */ defined in test.collections.MapTest.getOrPut[LocalVariableDescriptor]

'size' @ [60:30] ==> public open val size: Int defined in java.util.HashMap[JavaPropertyDescriptor]

'hashMapOf' @ [62:21] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, Int?> /* = HashMap<String, Int?> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int?

'empty' @ [63:17] ==> val empty: HashMap<String, Int?> /* = HashMap<String, Int?> */ defined in test.collections.MapTest.getOrPut[LocalVariableDescriptor]

'getOrPut' @ [63:23] ==> public inline fun <K, V> MutableMap<String, Int?>.getOrPut(key: String, defaultValue: () -> Int?): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int?

'assertEquals' @ [64:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'c' @ [64:28] ==> val c: Int? defined in test.collections.MapTest.getOrPut[LocalVariableDescriptor]

'empty' @ [66:17] ==> val empty: HashMap<String, Int?> /* = HashMap<String, Int?> */ defined in test.collections.MapTest.getOrPut[LocalVariableDescriptor]

'getOrPut' @ [66:23] ==> public inline fun <K, V> MutableMap<String, Int?>.getOrPut(key: String, defaultValue: () -> Int?): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int?

'assertEquals' @ [67:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'd' @ [67:25] ==> val d: Int? defined in test.collections.MapTest.getOrPut[LocalVariableDescriptor]

'Test' @ [70:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'hashMapOf' @ [71:20] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, Int> /* = HashMap<String, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'assertTrue' @ [72:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [72:22] ==> val data: HashMap<String, Int> /* = HashMap<String, Int> */ defined in test.collections.MapTest.sizeAndEmpty[LocalVariableDescriptor]

'none' @ [72:27] ==> public fun <K, V> Map<out String, Int>.none(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'assertEquals' @ [73:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'data' @ [73:22] ==> val data: HashMap<String, Int> /* = HashMap<String, Int> */ defined in test.collections.MapTest.sizeAndEmpty[LocalVariableDescriptor]

'size' @ [73:27] ==> public open val size: Int defined in java.util.HashMap[JavaPropertyDescriptor]

'Test' @ [76:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'hashMapOf' @ [77:19] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, String> /* = HashMap<String, String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'assertTrue' @ [78:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'map' @ [78:22] ==> val map: HashMap<String, String> /* = HashMap<String, String> */ defined in test.collections.MapTest.setViaIndexOperators[LocalVariableDescriptor]

'none' @ [78:26] ==> public fun <K, V> Map<out String, String>.none(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'assertEquals' @ [79:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'map' @ [79:22] ==> val map: HashMap<String, String> /* = HashMap<String, String> */ defined in test.collections.MapTest.setViaIndexOperators[LocalVariableDescriptor]

'size' @ [79:26] ==> public open val size: Int defined in java.util.HashMap[JavaPropertyDescriptor]

'map' @ [81:9] ==> val map: HashMap<String, String> /* = HashMap<String, String> */ defined in test.collections.MapTest.setViaIndexOperators[LocalVariableDescriptor]

'assertTrue' @ [83:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'map' @ [83:22] ==> val map: HashMap<String, String> /* = HashMap<String, String> */ defined in test.collections.MapTest.setViaIndexOperators[LocalVariableDescriptor]

'any' @ [83:26] ==> public fun <K, V> Map<out String, String>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'assertEquals' @ [84:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'map' @ [84:22] ==> val map: HashMap<String, String> /* = HashMap<String, String> */ defined in test.collections.MapTest.setViaIndexOperators[LocalVariableDescriptor]

'size' @ [84:26] ==> public open val size: Int defined in java.util.HashMap[JavaPropertyDescriptor]

'assertEquals' @ [85:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'map' @ [85:31] ==> val map: HashMap<String, String> /* = HashMap<String, String> */ defined in test.collections.MapTest.setViaIndexOperators[LocalVariableDescriptor]

'Test' @ [88:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mapOf' @ [89:19] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [89:25] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [89:47] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [89:70] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'arrayListOf' @ [90:20] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [91:19] ==> val map: Map<String, String> defined in test.collections.MapTest.iterate[LocalVariableDescriptor]

'list' @ [92:13] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.MapTest.iterate[LocalVariableDescriptor]

'add' @ [92:18] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'e' @ [92:22] ==> val e: Map.Entry<String, String> defined in test.collections.MapTest.iterate[LocalVariableDescriptor]

'key' @ [92:24] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'list' @ [93:13] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.MapTest.iterate[LocalVariableDescriptor]

'add' @ [93:18] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'e' @ [93:22] ==> val e: Map.Entry<String, String> defined in test.collections.MapTest.iterate[LocalVariableDescriptor]

'value' @ [93:24] ==> public abstract val value: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'assertEquals' @ [96:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'list' @ [96:25] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.MapTest.iterate[LocalVariableDescriptor]

'size' @ [96:30] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'assertEquals' @ [97:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'list' @ [97:65] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.MapTest.iterate[LocalVariableDescriptor]

'joinToString' @ [97:70] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [100:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mutableMapOf' @ [101:19] ==> public fun <K, V> mutableMapOf(vararg pairs: Pair<String, String>): MutableMap<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [101:32] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [101:54] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [101:77] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'map' @ [102:18] ==> val map: MutableMap<String, String> defined in test.collections.MapTest.iterateAndMutate[LocalVariableDescriptor]

'iterator' @ [102:22] ==> @JvmName @InlineOnly public operator inline fun <K, V> MutableMap<String, String>.iterator(): MutableIterator<MutableMap.MutableEntry<String, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'it' @ [103:19] ==> val it: MutableIterator<MutableMap.MutableEntry<String, String>> defined in test.collections.MapTest.iterateAndMutate[LocalVariableDescriptor]

'when (e.key) {
                "beverage" -> e.setValue("juice")
                "location" -> it.remove()
            }' @ [104:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'e' @ [104:19] ==> val e: MutableMap.MutableEntry<String, String> defined in test.collections.MapTest.iterateAndMutate[LocalVariableDescriptor]

'key' @ [104:21] ==> public abstract val key: String defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'e' @ [105:31] ==> val e: MutableMap.MutableEntry<String, String> defined in test.collections.MapTest.iterateAndMutate[LocalVariableDescriptor]

'setValue' @ [105:33] ==> public abstract fun setValue(newValue: String): String defined in kotlin.collections.MutableMap.MutableEntry[DeserializedSimpleFunctionDescriptor]

'it' @ [106:31] ==> val it: MutableIterator<MutableMap.MutableEntry<String, String>> defined in test.collections.MapTest.iterateAndMutate[LocalVariableDescriptor]

'remove' @ [106:34] ==> public abstract fun remove(): Unit defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [109:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, String>, actual: Map<String, String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, String>

'mapOf' @ [109:22] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [109:28] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [109:51] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'map' @ [109:71] ==> val map: MutableMap<String, String> defined in test.collections.MapTest.iterateAndMutate[LocalVariableDescriptor]

'Test' @ [113:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mutableMapOf' @ [115:19] ==> public fun <K, V> mutableMapOf(vararg pairs: Pair<String, String>): MutableMap<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [115:32] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [115:54] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'StringBuilder' @ [116:22] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'map' @ [117:22] ==> val map: MutableMap<String, String> defined in test.collections.MapTest.onEach[LocalVariableDescriptor]

'onEach' @ [117:26] ==> @SinceKotlin public inline fun <K, V, M : Map<out String, String>> MutableMap<String, String>.onEach(action: (Map.Entry<String, String>) -> Unit): MutableMap<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String
    <M : Map<out K, V>> -> MutableMap<String, String>

'result' @ [117:35] ==> val result: StringBuilder /* = StringBuilder */ defined in test.collections.MapTest.onEach[LocalVariableDescriptor]

'append' @ [117:42] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'it' @ [117:49] ==> value-parameter it: Map.Entry<String, String> defined in test.collections.MapTest.onEach.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [117:52] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'append' @ [117:57] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [117:69] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'it' @ [117:76] ==> value-parameter it: Map.Entry<String, String> defined in test.collections.MapTest.onEach.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [117:79] ==> public abstract val value: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'append' @ [117:86] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'assertEquals' @ [118:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'result' @ [118:55] ==> val result: StringBuilder /* = StringBuilder */ defined in test.collections.MapTest.onEach[LocalVariableDescriptor]

'toString' @ [118:62] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'assertTrue' @ [119:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'map' @ [119:20] ==> val map: MutableMap<String, String> defined in test.collections.MapTest.onEach[LocalVariableDescriptor]

'newMap' @ [119:28] ==> val newMap: MutableMap<String, String> defined in test.collections.MapTest.onEach[LocalVariableDescriptor]

'assertStaticTypeIs' @ [122:9] ==> public fun <T> assertStaticTypeIs(@Suppress value: HashMap<String, String> /* = HashMap<String, String> */): Unit defined in test[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> HashMap<String, String>

'hashMapOf' @ [123:17] ==> public fun <K, V> hashMapOf(vararg pairs: Pair<String, String>): HashMap<String, String> /* = HashMap<String, String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [123:27] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'onEach' @ [123:39] ==> @SinceKotlin public inline fun <K, V, M : Map<out String, String>> HashMap<String, String> /* = HashMap<String, String> */.onEach(action: (Map.Entry<String, String>) -> Unit): HashMap<String, String> /* = HashMap<String, String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String
    <M : Map<out K, V>> -> HashMap<String, String>

'Test' @ [127:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mapOf' @ [128:19] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [128:25] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [128:47] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [128:70] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'map' @ [129:21] ==> val map: Map<String, String> defined in test.collections.MapTest.stream[LocalVariableDescriptor]

'asSequence' @ [129:25] ==> public fun <K, V> Map<out String, String>.asSequence(): Sequence<Map.Entry<String, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'filter' @ [129:38] ==> public fun <T> Sequence<Map.Entry<String, String>>.filter(predicate: (Map.Entry<String, String>) -> Boolean): Sequence<Map.Entry<String, String>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<String, String>

'it' @ [129:47] ==> value-parameter it: Map.Entry<String, String> defined in test.collections.MapTest.stream.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [129:50] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'single' @ [129:66] ==> public fun <T> Sequence<Map.Entry<String, String>>.single(): Map.Entry<String, String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<String, String>

'assertEquals' @ [130:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'named' @ [130:31] ==> val named: Map.Entry<String, String> defined in test.collections.MapTest.stream[LocalVariableDescriptor]

'value' @ [130:37] ==> public abstract val value: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'Test' @ [133:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mapOf' @ [134:19] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [134:25] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [134:47] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [134:70] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'arrayListOf' @ [135:20] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [136:19] ==> val map: Map<String, String> defined in test.collections.MapTest.iterateWithProperties[LocalVariableDescriptor]

'list' @ [137:13] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.MapTest.iterateWithProperties[LocalVariableDescriptor]

'add' @ [137:18] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'e' @ [137:22] ==> val e: Map.Entry<String, String> defined in test.collections.MapTest.iterateWithProperties[LocalVariableDescriptor]

'key' @ [137:24] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'list' @ [138:13] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.MapTest.iterateWithProperties[LocalVariableDescriptor]

'add' @ [138:18] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'e' @ [138:22] ==> val e: Map.Entry<String, String> defined in test.collections.MapTest.iterateWithProperties[LocalVariableDescriptor]

'value' @ [138:24] ==> public abstract val value: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'assertEquals' @ [141:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'list' @ [141:25] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.MapTest.iterateWithProperties[LocalVariableDescriptor]

'size' @ [141:30] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'assertEquals' @ [142:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'list' @ [142:65] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.MapTest.iterateWithProperties[LocalVariableDescriptor]

'joinToString' @ [142:70] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [145:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mapOf' @ [146:19] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [146:25] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [146:47] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [146:70] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'arrayListOf' @ [147:20] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'component1' @ [148:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, String>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'component2' @ [148:20] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, String>.component2(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'map' @ [148:30] ==> val map: Map<String, String> defined in test.collections.MapTest.iterateWithExtraction[LocalVariableDescriptor]

'list' @ [149:13] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.MapTest.iterateWithExtraction[LocalVariableDescriptor]

'add' @ [149:18] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'key' @ [149:22] ==> val key: String defined in test.collections.MapTest.iterateWithExtraction[LocalVariableDescriptor]

'list' @ [150:13] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.MapTest.iterateWithExtraction[LocalVariableDescriptor]

'add' @ [150:18] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'value' @ [150:22] ==> val value: String defined in test.collections.MapTest.iterateWithExtraction[LocalVariableDescriptor]

'assertEquals' @ [153:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'list' @ [153:25] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.MapTest.iterateWithExtraction[LocalVariableDescriptor]

'size' @ [153:30] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'assertEquals' @ [154:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'list' @ [154:65] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.MapTest.iterateWithExtraction[LocalVariableDescriptor]

'joinToString' @ [154:70] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [157:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mapOf' @ [158:19] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [158:25] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [158:35] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'assertTrue' @ [159:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'in' @ [159:20] ==> @InlineOnly public operator inline fun <@OnlyInputTypes K, V> Map<out String, Int>.contains(key: String): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes K> -> String
    <V> -> Int

'map' @ [159:27] ==> val map: Map<String, Int> defined in test.collections.MapTest.contains[LocalVariableDescriptor]

'assertTrue' @ [160:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'!in' @ [160:20] ==> @InlineOnly public operator inline fun <@OnlyInputTypes K, V> Map<out String, Int>.contains(key: String): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes K> -> String
    <V> -> Int

'map' @ [160:28] ==> val map: Map<String, Int> defined in test.collections.MapTest.contains[LocalVariableDescriptor]

'Test' @ [163:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mapOf' @ [164:18] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [164:24] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [164:46] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'm1' @ [165:20] ==> val m1: Map<String, String> defined in test.collections.MapTest.map[LocalVariableDescriptor]

'map' @ [165:23] ==> public inline fun <K, V, R> Map<out String, String>.map(transform: (Map.Entry<String, String>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String
    <R> -> String

'it' @ [165:29] ==> value-parameter it: Map.Entry<String, String> defined in test.collections.MapTest.map.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [165:32] ==> public abstract val value: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'assertEquals' @ [167:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [167:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'list' @ [167:59] ==> val list: List<String> defined in test.collections.MapTest.map[LocalVariableDescriptor]

'Test' @ [171:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mapOf' @ [172:18] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Int?>): Map<String, Int?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int?

'to' @ [172:24] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [172:34] ==> public infix fun <A, B> String.to(that: Nothing?): Pair<String, Nothing?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Nothing?

'm1' @ [173:20] ==> val m1: Map<String, Int?> defined in test.collections.MapTest.mapNotNull[LocalVariableDescriptor]

'mapNotNull' @ [173:23] ==> public inline fun <K, V, R : Any> Map<out String, Int?>.mapNotNull(transform: (Map.Entry<String, Int?>) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int?
    <R : Any> -> String

'it' @ [173:36] ==> value-parameter it: Map.Entry<String, Int?> defined in test.collections.MapTest.mapNotNull.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [173:39] ==> public abstract val value: Int? defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'let' @ [173:46] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> String

'it' @ [173:60] ==> value-parameter it: Map.Entry<String, Int?> defined in test.collections.MapTest.mapNotNull.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [173:63] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'v' @ [173:68] ==> value-parameter v: Int defined in test.collections.MapTest.mapNotNull.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [174:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [174:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'list' @ [174:36] ==> val list: List<String> defined in test.collections.MapTest.mapNotNull[LocalVariableDescriptor]

'Test' @ [177:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mapOf' @ [178:18] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [178:24] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [178:46] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'm1' @ [179:18] ==> val m1: Map<String, String> defined in test.collections.MapTest.mapValues[LocalVariableDescriptor]

'mapValues' @ [179:21] ==> public inline fun <K, V, R> Map<out String, String>.mapValues(transform: (Map.Entry<String, String>) -> String): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String
    <R> -> String

'it' @ [179:33] ==> value-parameter it: Map.Entry<String, String> defined in test.collections.MapTest.mapValues.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [179:36] ==> public abstract val value: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'assertEquals' @ [181:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, String>, actual: Map<String, String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, String>

'mapOf' @ [181:22] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [181:28] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [181:51] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'm2' @ [181:76] ==> val m2: Map<String, String> defined in test.collections.MapTest.mapValues[LocalVariableDescriptor]

'm1' @ [183:44] ==> val m1: Map<String, String> defined in test.collections.MapTest.mapValues[LocalVariableDescriptor]

'm1p' @ [184:18] ==> val m1p: Map<out String, String> defined in test.collections.MapTest.mapValues[LocalVariableDescriptor]

'mapValuesTo' @ [184:22] ==> public inline fun <K, V, R, M : MutableMap<in String, in Int>> Map<out String, String>.mapValuesTo(destination: HashMap<String, Int> /* = HashMap<String, Int> */, transform: (Map.Entry<String, String>) -> Int): HashMap<String, Int> /* = HashMap<String, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String
    <R> -> Int
    <M : MutableMap<in K, in R>> -> HashMap<String, Int>

'hashMapOf' @ [184:34] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, Int> /* = HashMap<String, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [184:49] ==> value-parameter it: Map.Entry<String, String> defined in test.collections.MapTest.mapValues.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [184:52] ==> public abstract val value: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'length' @ [184:58] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'assertStaticTypeIs' @ [185:9] ==> public fun <T> assertStaticTypeIs(@Suppress value: HashMap<String, Int> /* = HashMap<String, Int> */): Unit defined in test[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> HashMap<String, Int>

'm3' @ [185:50] ==> val m3: HashMap<String, Int> /* = HashMap<String, Int> */ defined in test.collections.MapTest.mapValues[LocalVariableDescriptor]

'assertEquals' @ [186:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'mapOf' @ [186:22] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [186:28] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [186:45] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'm3' @ [186:63] ==> val m3: HashMap<String, Int> /* = HashMap<String, Int> */ defined in test.collections.MapTest.mapValues[LocalVariableDescriptor]

'Test' @ [189:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mapOf' @ [190:18] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [190:24] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [190:46] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'm1' @ [191:18] ==> val m1: Map<String, String> defined in test.collections.MapTest.mapKeys[LocalVariableDescriptor]

'mapKeys' @ [191:21] ==> public inline fun <K, V, R> Map<out String, String>.mapKeys(transform: (Map.Entry<String, String>) -> String): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String
    <R> -> String

'it' @ [191:31] ==> value-parameter it: Map.Entry<String, String> defined in test.collections.MapTest.mapKeys.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [191:34] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'assertEquals' @ [193:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, String>, actual: Map<String, String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, String>

'mapOf' @ [193:22] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [193:28] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [193:51] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'm2' @ [193:76] ==> val m2: Map<String, String> defined in test.collections.MapTest.mapKeys[LocalVariableDescriptor]

'm1' @ [195:44] ==> val m1: Map<String, String> defined in test.collections.MapTest.mapKeys[LocalVariableDescriptor]

'm1p' @ [196:18] ==> val m1p: Map<out String, String> defined in test.collections.MapTest.mapKeys[LocalVariableDescriptor]

'mapKeysTo' @ [196:22] ==> public inline fun <K, V, R, M : MutableMap<in Int, in String>> Map<out String, String>.mapKeysTo(destination: MutableMap<Int, String>, transform: (Map.Entry<String, String>) -> Int): MutableMap<Int, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String
    <R> -> Int
    <M : MutableMap<in R, in V>> -> MutableMap<Int, String>

'mutableMapOf' @ [196:32] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<Int, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> String

'it' @ [196:50] ==> value-parameter it: Map.Entry<String, String> defined in test.collections.MapTest.mapKeys.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [196:53] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'length' @ [196:57] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'assertStaticTypeIs' @ [197:9] ==> public fun <T> assertStaticTypeIs(@Suppress value: MutableMap<Int, String>): Unit defined in test[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> MutableMap<Int, String>

'm3' @ [197:53] ==> val m3: MutableMap<Int, String> defined in test.collections.MapTest.mapKeys[LocalVariableDescriptor]

'assertEquals' @ [198:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<Int, String>, actual: Map<Int, String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<Int, String>

'mapOf' @ [198:22] ==> public fun <K, V> mapOf(pair: Pair<Int, String>): Map<Int, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> String

'to' @ [198:28] ==> public infix fun <A, B> Int.to(that: String): Pair<Int, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> String

'm3' @ [198:43] ==> val m3: MutableMap<Int, String> defined in test.collections.MapTest.mapKeys[LocalVariableDescriptor]

'Test' @ [201:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'arrayOf' @ [202:21] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Pair<String, Int>): Array<Pair<String, Int>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Pair<String, Int>

'to' @ [202:29] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [202:39] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'mapOf' @ [203:24] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'pairs' @ [203:31] ==> val pairs: Array<Pair<String, Int>> defined in test.collections.MapTest.createFrom[LocalVariableDescriptor]

'assertEquals' @ [205:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'expected' @ [205:22] ==> val expected: Map<String, Int> defined in test.collections.MapTest.createFrom[LocalVariableDescriptor]

'pairs' @ [205:32] ==> val pairs: Array<Pair<String, Int>> defined in test.collections.MapTest.createFrom[LocalVariableDescriptor]

'toMap' @ [205:38] ==> public fun <K, V> Array<out Pair<String, Int>>.toMap(): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'assertEquals' @ [206:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'expected' @ [206:22] ==> val expected: Map<String, Int> defined in test.collections.MapTest.createFrom[LocalVariableDescriptor]

'pairs' @ [206:32] ==> val pairs: Array<Pair<String, Int>> defined in test.collections.MapTest.createFrom[LocalVariableDescriptor]

'asIterable' @ [206:38] ==> public fun <T> Array<out Pair<String, Int>>.asIterable(): Iterable<Pair<String, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>

'toMap' @ [206:51] ==> public fun <K, V> Iterable<Pair<String, Int>>.toMap(): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'assertEquals' @ [207:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'expected' @ [207:22] ==> val expected: Map<String, Int> defined in test.collections.MapTest.createFrom[LocalVariableDescriptor]

'pairs' @ [207:32] ==> val pairs: Array<Pair<String, Int>> defined in test.collections.MapTest.createFrom[LocalVariableDescriptor]

'asSequence' @ [207:38] ==> public fun <T> Array<out Pair<String, Int>>.asSequence(): Sequence<Pair<String, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>

'toMap' @ [207:51] ==> public fun <K, V> Sequence<Pair<String, Int>>.toMap(): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'assertEquals' @ [208:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'expected' @ [208:22] ==> val expected: Map<String, Int> defined in test.collections.MapTest.createFrom[LocalVariableDescriptor]

'expected' @ [208:32] ==> val expected: Map<String, Int> defined in test.collections.MapTest.createFrom[LocalVariableDescriptor]

'toMap' @ [208:41] ==> @SinceKotlin public fun <K, V> Map<out String, Int>.toMap(): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'assertEquals' @ [209:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'mapOf' @ [209:22] ==> public fun <K, V> mapOf(pair: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [209:28] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'expected' @ [209:39] ==> val expected: Map<String, Int> defined in test.collections.MapTest.createFrom[LocalVariableDescriptor]

'filterKeys' @ [209:48] ==> public inline fun <K, V> Map<out String, Int>.filterKeys(predicate: (String) -> Boolean): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [209:61] ==> value-parameter it: String defined in test.collections.MapTest.createFrom.<anonymous>[ValueParameterDescriptorImpl]

'toMap' @ [209:73] ==> @SinceKotlin public fun <K, V> Map<out String, Int>.toMap(): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'assertEquals' @ [210:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'emptyMap' @ [210:22] ==> public fun <K, V> emptyMap(): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'expected' @ [210:34] ==> val expected: Map<String, Int> defined in test.collections.MapTest.createFrom[LocalVariableDescriptor]

'filter' @ [210:43] ==> public inline fun <K, V> Map<out String, Int>.filter(predicate: (Map.Entry<String, Int>) -> Boolean): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'toMap' @ [210:60] ==> @SinceKotlin public fun <K, V> Map<out String, Int>.toMap(): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'expected' @ [212:26] ==> val expected: Map<String, Int> defined in test.collections.MapTest.createFrom[LocalVariableDescriptor]

'toMutableMap' @ [212:35] ==> @SinceKotlin public fun <K, V> Map<out String, Int>.toMutableMap(): MutableMap<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'assertEquals' @ [213:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'expected' @ [213:22] ==> val expected: Map<String, Int> defined in test.collections.MapTest.createFrom[LocalVariableDescriptor]

'mutableMap' @ [213:32] ==> val mutableMap: MutableMap<String, Int> defined in test.collections.MapTest.createFrom[LocalVariableDescriptor]

'mutableMap' @ [214:9] ==> val mutableMap: MutableMap<String, Int> defined in test.collections.MapTest.createFrom[LocalVariableDescriptor]

'to' @ [214:23] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'assertNotEquals' @ [215:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'expected' @ [215:25] ==> val expected: Map<String, Int> defined in test.collections.MapTest.createFrom[LocalVariableDescriptor]

'mutableMap' @ [215:35] ==> val mutableMap: MutableMap<String, Int> defined in test.collections.MapTest.createFrom[LocalVariableDescriptor]

'Test' @ [218:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'arrayOf' @ [219:21] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Pair<String, Int>): Array<Pair<String, Int>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Pair<String, Int>

'to' @ [219:29] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [219:39] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'mapOf' @ [220:24] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'pairs' @ [220:31] ==> val pairs: Array<Pair<String, Int>> defined in test.collections.MapTest.populateTo[LocalVariableDescriptor]

'pairs' @ [222:53] ==> val pairs: Array<Pair<String, Int>> defined in test.collections.MapTest.populateTo[LocalVariableDescriptor]

'toMap' @ [222:59] ==> public fun <K, V, M : MutableMap<in String, in Int>> Array<out Pair<String, Int>>.toMap(destination: LinkedHashMap<String, Int> /* = LinkedHashMap<String, Int> */): LinkedHashMap<String, Int> /* = LinkedHashMap<String, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int
    <M : MutableMap<in K, in V>> -> LinkedHashMap<String, Int>

'linkedMapOf' @ [222:65] ==> @SinceKotlin @InlineOnly public inline fun <K, V> linkedMapOf(): LinkedHashMap<String, Int> /* = LinkedHashMap<String, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'assertEquals' @ [223:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'expected' @ [223:22] ==> val expected: Map<String, Int> defined in test.collections.MapTest.populateTo[LocalVariableDescriptor]

'linkedMap' @ [223:32] ==> val linkedMap: LinkedHashMap<String, Int> /* = LinkedHashMap<String, Int> */ defined in test.collections.MapTest.populateTo[LocalVariableDescriptor]

'pairs' @ [225:45] ==> val pairs: Array<Pair<String, Int>> defined in test.collections.MapTest.populateTo[LocalVariableDescriptor]

'asIterable' @ [225:51] ==> public fun <T> Array<out Pair<String, Int>>.asIterable(): Iterable<Pair<String, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>

'toMap' @ [225:64] ==> public fun <K, V, M : MutableMap<in String, in Int>> Iterable<Pair<String, Int>>.toMap(destination: HashMap<String, Int> /* = HashMap<String, Int> */): HashMap<String, Int> /* = HashMap<String, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int
    <M : MutableMap<in K, in V>> -> HashMap<String, Int>

'hashMapOf' @ [225:70] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, Int> /* = HashMap<String, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'assertEquals' @ [226:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'expected' @ [226:22] ==> val expected: Map<String, Int> defined in test.collections.MapTest.populateTo[LocalVariableDescriptor]

'hashMap' @ [226:32] ==> val hashMap: HashMap<String, Int> /* = HashMap<String, Int> */ defined in test.collections.MapTest.populateTo[LocalVariableDescriptor]

'pairs' @ [228:51] ==> val pairs: Array<Pair<String, Int>> defined in test.collections.MapTest.populateTo[LocalVariableDescriptor]

'asSequence' @ [228:57] ==> public fun <T> Array<out Pair<String, Int>>.asSequence(): Sequence<Pair<String, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>

'toMap' @ [228:70] ==> public fun <K, V, M : MutableMap<in String, in Int>> Sequence<Pair<String, Int>>.toMap(destination: MutableMap<String, Int>): MutableMap<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int
    <M : MutableMap<in K, in V>> -> MutableMap<String, Int>

'mutableMapOf' @ [228:76] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'assertEquals' @ [229:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'expected' @ [229:22] ==> val expected: Map<String, Int> defined in test.collections.MapTest.populateTo[LocalVariableDescriptor]

'mutableMap' @ [229:32] ==> val mutableMap: MutableMap<String, Int> defined in test.collections.MapTest.populateTo[LocalVariableDescriptor]

'mutableMap' @ [231:27] ==> val mutableMap: MutableMap<String, Int> defined in test.collections.MapTest.populateTo[LocalVariableDescriptor]

'toMap' @ [231:38] ==> @SinceKotlin public fun <K, V, M : MutableMap<in String, in Int>> Map<out String, Int>.toMap(destination: MutableMap<String, Int>): MutableMap<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int
    <M : MutableMap<in K, in V>> -> MutableMap<String, Int>

'mutableMapOf' @ [231:44] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'assertEquals' @ [232:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'expected' @ [232:22] ==> val expected: Map<String, Int> defined in test.collections.MapTest.populateTo[LocalVariableDescriptor]

'mutableMap2' @ [232:32] ==> val mutableMap2: MutableMap<String, Int> defined in test.collections.MapTest.populateTo[LocalVariableDescriptor]

'mutableMap' @ [234:27] ==> val mutableMap: MutableMap<String, Int> defined in test.collections.MapTest.populateTo[LocalVariableDescriptor]

'toMap' @ [234:38] ==> @SinceKotlin public fun <K, V, M : MutableMap<in String, in Int>> Map<out String, Int>.toMap(destination: HashMap<CharSequence, Any> /* = HashMap<CharSequence, Any> */): HashMap<CharSequence, Any> /* = HashMap<CharSequence, Any> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int
    <M : MutableMap<in K, in V>> -> HashMap<CharSequence, Any>

'hashMapOf' @ [234:44] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<CharSequence, Any> /* = HashMap<CharSequence, Any> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> CharSequence
    <V> -> Any

'assertEquals' @ [235:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<*, *>, actual: Map<*, *>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<*, *>

'expected' @ [235:33] ==> val expected: Map<String, Int> defined in test.collections.MapTest.populateTo[LocalVariableDescriptor]

'mutableMap3' @ [235:43] ==> val mutableMap3: HashMap<CharSequence, Any> /* = HashMap<CharSequence, Any> */ defined in test.collections.MapTest.populateTo[LocalVariableDescriptor]

'Test' @ [238:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [239:19] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'associateBy' @ [239:44] ==> public inline fun <T, K> Iterable<String>.associateBy(keySelector: (String) -> Int): Map<Int, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Int

'it' @ [239:58] ==> value-parameter it: String defined in test.collections.MapTest.createWithSelector.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [239:61] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'assertEquals' @ [240:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'map' @ [240:25] ==> val map: Map<Int, String> defined in test.collections.MapTest.createWithSelector[LocalVariableDescriptor]

'size' @ [240:29] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'assertEquals' @ [241:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'map' @ [241:27] ==> val map: Map<Int, String> defined in test.collections.MapTest.createWithSelector[LocalVariableDescriptor]

'get' @ [241:31] ==> public abstract operator fun get(key: Int): String? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [242:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'map' @ [242:28] ==> val map: Map<Int, String> defined in test.collections.MapTest.createWithSelector[LocalVariableDescriptor]

'get' @ [242:32] ==> public abstract operator fun get(key: Int): String? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [243:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'map' @ [243:29] ==> val map: Map<Int, String> defined in test.collections.MapTest.createWithSelector[LocalVariableDescriptor]

'get' @ [243:33] ==> public abstract operator fun get(key: Int): String? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'Test' @ [246:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [247:19] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'associateBy' @ [247:45] ==> public inline fun <T, K> Iterable<String>.associateBy(keySelector: (String) -> Int): Map<Int, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Int

'it' @ [247:59] ==> value-parameter it: String defined in test.collections.MapTest.createWithSelectorAndOverwrite.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [247:62] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'assertEquals' @ [248:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'map' @ [248:25] ==> val map: Map<Int, String> defined in test.collections.MapTest.createWithSelectorAndOverwrite[LocalVariableDescriptor]

'size' @ [248:29] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'assertEquals' @ [249:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'map' @ [249:28] ==> val map: Map<Int, String> defined in test.collections.MapTest.createWithSelectorAndOverwrite[LocalVariableDescriptor]

'get' @ [249:32] ==> public abstract operator fun get(key: Int): String? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [250:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'map' @ [250:29] ==> val map: Map<Int, String> defined in test.collections.MapTest.createWithSelectorAndOverwrite[LocalVariableDescriptor]

'get' @ [250:33] ==> public abstract operator fun get(key: Int): String? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'Test' @ [253:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [254:19] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'associateBy' @ [254:44] ==> public inline fun <T, K, V> Iterable<String>.associateBy(keySelector: (String) -> Int, valueTransform: (String) -> String): Map<Int, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Int
    <V> -> String

'it' @ [254:58] ==> value-parameter it: String defined in test.collections.MapTest.createWithSelectorForKeyAndValue.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [254:61] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'it' @ [254:73] ==> value-parameter it: String defined in test.collections.MapTest.createWithSelectorForKeyAndValue.<anonymous>[ValueParameterDescriptorImpl]

'toUpperCase' @ [254:76] ==> @InlineOnly public inline fun String.toUpperCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [255:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'map' @ [255:25] ==> val map: Map<Int, String> defined in test.collections.MapTest.createWithSelectorForKeyAndValue[LocalVariableDescriptor]

'size' @ [255:29] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'assertEquals' @ [256:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'map' @ [256:27] ==> val map: Map<Int, String> defined in test.collections.MapTest.createWithSelectorForKeyAndValue[LocalVariableDescriptor]

'assertEquals' @ [257:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'map' @ [257:28] ==> val map: Map<Int, String> defined in test.collections.MapTest.createWithSelectorForKeyAndValue[LocalVariableDescriptor]

'assertEquals' @ [258:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'map' @ [258:29] ==> val map: Map<Int, String> defined in test.collections.MapTest.createWithSelectorForKeyAndValue[LocalVariableDescriptor]

'Test' @ [261:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [262:19] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'associate' @ [262:44] ==> public inline fun <T, K, V> Iterable<String>.associate(transform: (String) -> Pair<Int, String>): Map<Int, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Int
    <V> -> String

'it' @ [262:56] ==> value-parameter it: String defined in test.collections.MapTest.createWithPairSelector.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [262:59] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'it' @ [262:69] ==> value-parameter it: String defined in test.collections.MapTest.createWithPairSelector.<anonymous>[ValueParameterDescriptorImpl]

'toUpperCase' @ [262:72] ==> @InlineOnly public inline fun String.toUpperCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [263:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'map' @ [263:25] ==> val map: Map<Int, String> defined in test.collections.MapTest.createWithPairSelector[LocalVariableDescriptor]

'size' @ [263:29] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'assertEquals' @ [264:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'map' @ [264:27] ==> val map: Map<Int, String> defined in test.collections.MapTest.createWithPairSelector[LocalVariableDescriptor]

'assertEquals' @ [265:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'map' @ [265:28] ==> val map: Map<Int, String> defined in test.collections.MapTest.createWithPairSelector[LocalVariableDescriptor]

'assertEquals' @ [266:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'map' @ [266:29] ==> val map: Map<Int, String> defined in test.collections.MapTest.createWithPairSelector[LocalVariableDescriptor]

'Test' @ [269:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mapOf' @ [270:19] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [270:25] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [270:35] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'assertEquals' @ [271:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'map' @ [271:25] ==> val map: Map<String, Int> defined in test.collections.MapTest.createUsingTo[LocalVariableDescriptor]

'size' @ [271:29] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'assertEquals' @ [272:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'map' @ [272:25] ==> val map: Map<String, Int> defined in test.collections.MapTest.createUsingTo[LocalVariableDescriptor]

'assertEquals' @ [273:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'map' @ [273:25] ==> val map: Map<String, Int> defined in test.collections.MapTest.createUsingTo[LocalVariableDescriptor]

'Test' @ [276:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mutableMapOf' @ [277:19] ==> public fun <K, V> mutableMapOf(vararg pairs: Pair<String, Int>): MutableMap<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [277:32] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [277:42] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'map' @ [278:9] ==> val map: MutableMap<String, Int> defined in test.collections.MapTest.createMutableMap[LocalVariableDescriptor]

'put' @ [278:13] ==> public abstract fun put(key: String, value: Int): Int? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [279:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Pair<String, Int>>, actual: List<Pair<String, Int>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Pair<String, Int>>

'listOf' @ [279:22] ==> public fun <T> listOf(vararg elements: Pair<String, Int>): List<Pair<String, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>

'to' @ [279:29] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [279:39] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [279:49] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'map' @ [279:60] ==> val map: MutableMap<String, Int> defined in test.collections.MapTest.createMutableMap[LocalVariableDescriptor]

'toList' @ [279:64] ==> public fun <K, V> Map<out String, Int>.toList(): List<Pair<String, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'Test' @ [282:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'linkedMapOf' @ [283:19] ==> public fun <K, V> linkedMapOf(vararg pairs: Pair<String, Int>): LinkedHashMap<String, Int> /* = LinkedHashMap<String, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'Pair' @ [283:31] ==> public constructor Pair<out A, out B>(first: String, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int

'Pair' @ [283:45] ==> public constructor Pair<out A, out B>(first: String, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int

'Pair' @ [283:59] ==> public constructor Pair<out A, out B>(first: String, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int

'assertEquals' @ [284:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'map' @ [284:25] ==> val map: LinkedHashMap<String, Int> /* = LinkedHashMap<String, Int> */ defined in test.collections.MapTest.createLinkedMap[LocalVariableDescriptor]

'assertEquals' @ [285:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'map' @ [285:25] ==> val map: LinkedHashMap<String, Int> /* = LinkedHashMap<String, Int> */ defined in test.collections.MapTest.createLinkedMap[LocalVariableDescriptor]

'assertEquals' @ [286:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'map' @ [286:25] ==> val map: LinkedHashMap<String, Int> /* = LinkedHashMap<String, Int> */ defined in test.collections.MapTest.createLinkedMap[LocalVariableDescriptor]

'assertEquals' @ [287:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [287:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [287:45] ==> val map: LinkedHashMap<String, Int> /* = LinkedHashMap<String, Int> */ defined in test.collections.MapTest.createLinkedMap[LocalVariableDescriptor]

'keys' @ [287:49] ==> public open val keys: MutableSet<String> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'toList' @ [287:54] ==> public fun <T> Iterable<String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [290:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mapOf' @ [291:19] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'Pair' @ [291:25] ==> public constructor Pair<out A, out B>(first: String, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int

'Pair' @ [291:39] ==> public constructor Pair<out A, out B>(first: String, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int

'Pair' @ [291:53] ==> public constructor Pair<out A, out B>(first: String, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int

'map' @ [292:29] ==> val map: Map<String, Int> defined in test.collections.MapTest.filter[LocalVariableDescriptor]

'filter' @ [292:33] ==> public inline fun <K, V> Map<out String, Int>.filter(predicate: (Map.Entry<String, Int>) -> Boolean): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [292:42] ==> value-parameter it: Map.Entry<String, Int> defined in test.collections.MapTest.filter.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [292:45] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'assertEquals' @ [293:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'mapOf' @ [293:22] ==> public fun <K, V> mapOf(pair: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [293:28] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'filteredByKey' @ [293:39] ==> val filteredByKey: Map<String, Int> defined in test.collections.MapTest.filter[LocalVariableDescriptor]

'map' @ [295:30] ==> val map: Map<String, Int> defined in test.collections.MapTest.filter[LocalVariableDescriptor]

'filterKeys' @ [295:34] ==> public inline fun <K, V> Map<out String, Int>.filterKeys(predicate: (String) -> Boolean): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [295:47] ==> value-parameter it: String defined in test.collections.MapTest.filter.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [296:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'mapOf' @ [296:22] ==> public fun <K, V> mapOf(pair: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [296:28] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'filteredByKey2' @ [296:39] ==> val filteredByKey2: Map<String, Int> defined in test.collections.MapTest.filter[LocalVariableDescriptor]

'map' @ [298:31] ==> val map: Map<String, Int> defined in test.collections.MapTest.filter[LocalVariableDescriptor]

'filter' @ [298:35] ==> public inline fun <K, V> Map<out String, Int>.filter(predicate: (Map.Entry<String, Int>) -> Boolean): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [298:44] ==> value-parameter it: Map.Entry<String, Int> defined in test.collections.MapTest.filter.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [298:47] ==> public abstract val value: Int defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'assertEquals' @ [299:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'mapOf' @ [299:22] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [299:28] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [299:38] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'filteredByValue' @ [299:49] ==> val filteredByValue: Map<String, Int> defined in test.collections.MapTest.filter[LocalVariableDescriptor]

'map' @ [301:32] ==> val map: Map<String, Int> defined in test.collections.MapTest.filter[LocalVariableDescriptor]

'filterValues' @ [301:36] ==> public inline fun <K, V> Map<out String, Int>.filterValues(predicate: (Int) -> Boolean): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [301:51] ==> value-parameter it: Int defined in test.collections.MapTest.filter.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [302:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'mapOf' @ [302:22] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [302:28] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [302:38] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'filteredByValue2' @ [302:49] ==> val filteredByValue2: Map<String, Int> defined in test.collections.MapTest.filter[LocalVariableDescriptor]

'Test' @ [305:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mapOf' @ [306:41] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'Pair' @ [306:47] ==> public constructor Pair<out A, out B>(first: String, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int

'Pair' @ [306:61] ==> public constructor Pair<out A, out B>(first: String, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int

'Pair' @ [306:75] ==> public constructor Pair<out A, out B>(first: String, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int

'map' @ [308:29] ==> val map: Map<out String, Int> defined in test.collections.MapTest.filterOutProjectedTo[LocalVariableDescriptor]

'filterTo' @ [308:33] ==> public inline fun <K, V, M : MutableMap<in String, in Int>> Map<out String, Int>.filterTo(destination: MutableMap<String, Int>, predicate: (Map.Entry<String, Int>) -> Boolean): MutableMap<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int
    <M : MutableMap<in K, in V>> -> MutableMap<String, Int>

'mutableMapOf' @ [308:42] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [308:60] ==> value-parameter it: Map.Entry<String, Int> defined in test.collections.MapTest.filterOutProjectedTo.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [308:63] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'assertStaticTypeIs' @ [309:9] ==> public fun <T> assertStaticTypeIs(@Suppress value: MutableMap<String, Int>): Unit defined in test[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> MutableMap<String, Int>

'filteredByKey' @ [309:53] ==> val filteredByKey: MutableMap<String, Int> defined in test.collections.MapTest.filterOutProjectedTo[LocalVariableDescriptor]

'assertEquals' @ [310:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'mapOf' @ [310:22] ==> public fun <K, V> mapOf(pair: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [310:28] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'filteredByKey' @ [310:39] ==> val filteredByKey: MutableMap<String, Int> defined in test.collections.MapTest.filterOutProjectedTo[LocalVariableDescriptor]

'map' @ [312:30] ==> val map: Map<out String, Int> defined in test.collections.MapTest.filterOutProjectedTo[LocalVariableDescriptor]

'filterKeys' @ [312:34] ==> public inline fun <K, V> Map<out String, Int>.filterKeys(predicate: (String) -> Boolean): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [312:47] ==> value-parameter it: String defined in test.collections.MapTest.filterOutProjectedTo.<anonymous>[ValueParameterDescriptorImpl]

'assertStaticTypeIs' @ [313:9] ==> public fun <T> assertStaticTypeIs(@Suppress value: Map<String, Int>): Unit defined in test[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Map<String, Int>

'filteredByKey2' @ [313:46] ==> val filteredByKey2: Map<String, Int> defined in test.collections.MapTest.filterOutProjectedTo[LocalVariableDescriptor]

'assertEquals' @ [314:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'mapOf' @ [314:22] ==> public fun <K, V> mapOf(pair: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [314:28] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'filteredByKey2' @ [314:39] ==> val filteredByKey2: Map<String, Int> defined in test.collections.MapTest.filterOutProjectedTo[LocalVariableDescriptor]

'map' @ [316:31] ==> val map: Map<out String, Int> defined in test.collections.MapTest.filterOutProjectedTo[LocalVariableDescriptor]

'filterNotTo' @ [316:35] ==> public inline fun <K, V, M : MutableMap<in String, in Int>> Map<out String, Int>.filterNotTo(destination: HashMap<String, Int> /* = HashMap<String, Int> */, predicate: (Map.Entry<String, Int>) -> Boolean): HashMap<String, Int> /* = HashMap<String, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int
    <M : MutableMap<in K, in V>> -> HashMap<String, Int>

'hashMapOf' @ [316:47] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, Int> /* = HashMap<String, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [316:62] ==> value-parameter it: Map.Entry<String, Int> defined in test.collections.MapTest.filterOutProjectedTo.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [316:65] ==> public abstract val value: Int defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'assertStaticTypeIs' @ [317:9] ==> public fun <T> assertStaticTypeIs(@Suppress value: HashMap<String, Int> /* = HashMap<String, Int> */): Unit defined in test[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> HashMap<String, Int>

'filteredByValue' @ [317:50] ==> val filteredByValue: HashMap<String, Int> /* = HashMap<String, Int> */ defined in test.collections.MapTest.filterOutProjectedTo[LocalVariableDescriptor]

'assertEquals' @ [318:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'mapOf' @ [318:22] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [318:28] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [318:38] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'filteredByValue' @ [318:49] ==> val filteredByValue: HashMap<String, Int> /* = HashMap<String, Int> */ defined in test.collections.MapTest.filterOutProjectedTo[LocalVariableDescriptor]

'map' @ [320:32] ==> val map: Map<out String, Int> defined in test.collections.MapTest.filterOutProjectedTo[LocalVariableDescriptor]

'filterValues' @ [320:36] ==> public inline fun <K, V> Map<out String, Int>.filterValues(predicate: (Int) -> Boolean): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [320:51] ==> value-parameter it: Int defined in test.collections.MapTest.filterOutProjectedTo.<anonymous>[ValueParameterDescriptorImpl]

'assertStaticTypeIs' @ [321:9] ==> public fun <T> assertStaticTypeIs(@Suppress value: Map<String, Int>): Unit defined in test[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Map<String, Int>

'filteredByValue2' @ [321:46] ==> val filteredByValue2: Map<String, Int> defined in test.collections.MapTest.filterOutProjectedTo[LocalVariableDescriptor]

'assertEquals' @ [322:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'mapOf' @ [322:22] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [322:28] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [322:38] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'filteredByValue2' @ [322:49] ==> val filteredByValue2: Map<String, Int> defined in test.collections.MapTest.filterOutProjectedTo[LocalVariableDescriptor]

'Test' @ [325:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mapOf' @ [326:19] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'Pair' @ [326:25] ==> public constructor Pair<out A, out B>(first: String, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int

'Pair' @ [326:39] ==> public constructor Pair<out A, out B>(first: String, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int

'Pair' @ [326:53] ==> public constructor Pair<out A, out B>(first: String, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int

'assertTrue' @ [327:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'map' @ [327:20] ==> val map: Map<String, Int> defined in test.collections.MapTest.any[LocalVariableDescriptor]

'any' @ [327:24] ==> public fun <K, V> Map<out String, Int>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'assertFalse' @ [328:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'emptyMap' @ [328:21] ==> public fun <K, V> emptyMap(): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'any' @ [328:45] ==> public fun <K, V> Map<out String, Int>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'assertTrue' @ [330:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'map' @ [330:20] ==> val map: Map<String, Int> defined in test.collections.MapTest.any[LocalVariableDescriptor]

'any' @ [330:24] ==> public inline fun <K, V> Map<out String, Int>.any(predicate: (Map.Entry<String, Int>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [330:30] ==> value-parameter it: Map.Entry<String, Int> defined in test.collections.MapTest.any.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [330:33] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'assertFalse' @ [331:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'emptyMap' @ [331:21] ==> public fun <K, V> emptyMap(): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'any' @ [331:45] ==> public inline fun <K, V> Map<out String, Int>.any(predicate: (Map.Entry<String, Int>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [331:51] ==> value-parameter it: Map.Entry<String, Int> defined in test.collections.MapTest.any.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [331:54] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'assertTrue' @ [333:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'map' @ [333:20] ==> val map: Map<String, Int> defined in test.collections.MapTest.any[LocalVariableDescriptor]

'any' @ [333:24] ==> public inline fun <K, V> Map<out String, Int>.any(predicate: (Map.Entry<String, Int>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [333:30] ==> value-parameter it: Map.Entry<String, Int> defined in test.collections.MapTest.any.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [333:33] ==> public abstract val value: Int defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'assertFalse' @ [334:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'map' @ [334:21] ==> val map: Map<String, Int> defined in test.collections.MapTest.any[LocalVariableDescriptor]

'any' @ [334:25] ==> public inline fun <K, V> Map<out String, Int>.any(predicate: (Map.Entry<String, Int>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [334:31] ==> value-parameter it: Map.Entry<String, Int> defined in test.collections.MapTest.any.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [334:34] ==> public abstract val value: Int defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'Test' @ [337:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mapOf' @ [338:19] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'Pair' @ [338:25] ==> public constructor Pair<out A, out B>(first: String, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int

'Pair' @ [338:39] ==> public constructor Pair<out A, out B>(first: String, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int

'Pair' @ [338:53] ==> public constructor Pair<out A, out B>(first: String, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int

'assertTrue' @ [339:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'map' @ [339:20] ==> val map: Map<String, Int> defined in test.collections.MapTest.all[LocalVariableDescriptor]

'all' @ [339:24] ==> public inline fun <K, V> Map<out String, Int>.all(predicate: (Map.Entry<String, Int>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [339:30] ==> value-parameter it: Map.Entry<String, Int> defined in test.collections.MapTest.all.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [339:33] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'assertTrue' @ [340:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'emptyMap' @ [340:20] ==> public fun <K, V> emptyMap(): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'all' @ [340:44] ==> public inline fun <K, V> Map<out String, Int>.all(predicate: (Map.Entry<String, Int>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [340:50] ==> value-parameter it: Map.Entry<String, Int> defined in test.collections.MapTest.all.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [340:53] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'assertTrue' @ [342:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'map' @ [342:20] ==> val map: Map<String, Int> defined in test.collections.MapTest.all[LocalVariableDescriptor]

'all' @ [342:24] ==> public inline fun <K, V> Map<out String, Int>.all(predicate: (Map.Entry<String, Int>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [342:30] ==> value-parameter it: Map.Entry<String, Int> defined in test.collections.MapTest.all.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [342:33] ==> public abstract val value: Int defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'assertFalse' @ [343:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'map' @ [343:21] ==> val map: Map<String, Int> defined in test.collections.MapTest.all[LocalVariableDescriptor]

'all' @ [343:25] ==> public inline fun <K, V> Map<out String, Int>.all(predicate: (Map.Entry<String, Int>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [343:31] ==> value-parameter it: Map.Entry<String, Int> defined in test.collections.MapTest.all.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [343:34] ==> public abstract val value: Int defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'Test' @ [346:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mapOf' @ [347:19] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'Pair' @ [347:25] ==> public constructor Pair<out A, out B>(first: String, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int

'Pair' @ [347:39] ==> public constructor Pair<out A, out B>(first: String, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int

'Pair' @ [347:53] ==> public constructor Pair<out A, out B>(first: String, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int

'assertEquals' @ [348:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'map' @ [348:25] ==> val map: Map<String, Int> defined in test.collections.MapTest.countBy[LocalVariableDescriptor]

'count' @ [348:29] ==> @InlineOnly public inline fun <K, V> Map<out String, Int>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'map' @ [350:29] ==> val map: Map<String, Int> defined in test.collections.MapTest.countBy[LocalVariableDescriptor]

'count' @ [350:33] ==> public inline fun <K, V> Map<out String, Int>.count(predicate: (Map.Entry<String, Int>) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [350:41] ==> value-parameter it: Map.Entry<String, Int> defined in test.collections.MapTest.countBy.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [350:44] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'assertEquals' @ [351:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'filteredByKey' @ [351:25] ==> val filteredByKey: Int defined in test.collections.MapTest.countBy[LocalVariableDescriptor]

'map' @ [353:31] ==> val map: Map<String, Int> defined in test.collections.MapTest.countBy[LocalVariableDescriptor]

'count' @ [353:35] ==> public inline fun <K, V> Map<out String, Int>.count(predicate: (Map.Entry<String, Int>) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [353:43] ==> value-parameter it: Map.Entry<String, Int> defined in test.collections.MapTest.countBy.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [353:46] ==> public abstract val value: Int defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'assertEquals' @ [354:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'filteredByValue' @ [354:25] ==> val filteredByValue: Int defined in test.collections.MapTest.countBy[LocalVariableDescriptor]

'Test' @ [357:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mapOf' @ [358:19] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'Pair' @ [358:25] ==> public constructor Pair<out A, out B>(first: String, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int

'Pair' @ [358:39] ==> public constructor Pair<out A, out B>(first: String, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int

'Pair' @ [358:53] ==> public constructor Pair<out A, out B>(first: String, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int

'map' @ [359:29] ==> val map: Map<String, Int> defined in test.collections.MapTest.filterNot[LocalVariableDescriptor]

'filterNot' @ [359:33] ==> public inline fun <K, V> Map<out String, Int>.filterNot(predicate: (Map.Entry<String, Int>) -> Boolean): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [359:45] ==> value-parameter it: Map.Entry<String, Int> defined in test.collections.MapTest.filterNot.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [359:48] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'assertEquals' @ [360:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'filteredByKey' @ [360:25] ==> val filteredByKey: Map<String, Int> defined in test.collections.MapTest.filterNot[LocalVariableDescriptor]

'size' @ [360:39] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'assertEquals' @ [361:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'filteredByKey' @ [361:28] ==> val filteredByKey: Map<String, Int> defined in test.collections.MapTest.filterNot[LocalVariableDescriptor]

'assertEquals' @ [362:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'filteredByKey' @ [362:25] ==> val filteredByKey: Map<String, Int> defined in test.collections.MapTest.filterNot[LocalVariableDescriptor]

'assertEquals' @ [363:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'filteredByKey' @ [363:25] ==> val filteredByKey: Map<String, Int> defined in test.collections.MapTest.filterNot[LocalVariableDescriptor]

'map' @ [365:31] ==> val map: Map<String, Int> defined in test.collections.MapTest.filterNot[LocalVariableDescriptor]

'filterNot' @ [365:35] ==> public inline fun <K, V> Map<out String, Int>.filterNot(predicate: (Map.Entry<String, Int>) -> Boolean): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'it' @ [365:47] ==> value-parameter it: Map.Entry<String, Int> defined in test.collections.MapTest.filterNot.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [365:50] ==> public abstract val value: Int defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'assertEquals' @ [366:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'filteredByValue' @ [366:25] ==> val filteredByValue: Map<String, Int> defined in test.collections.MapTest.filterNot[LocalVariableDescriptor]

'size' @ [366:41] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'assertEquals' @ [367:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'filteredByValue' @ [367:25] ==> val filteredByValue: Map<String, Int> defined in test.collections.MapTest.filterNot[LocalVariableDescriptor]

'hashMapOf' @ [371:19] ==> public fun <K, V> hashMapOf(vararg pairs: Pair<String, Int>): HashMap<String, Int> /* = HashMap<String, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [371:29] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [371:39] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'invoke' @ [372:9] ==> public abstract operator fun invoke(p1: MutableMap<String, Int>): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'map' @ [372:22] ==> val map: HashMap<String, Int> /* = HashMap<String, Int> */ defined in test.collections.MapTest.testPlusAssign[LocalVariableDescriptor]

'assertEquals' @ [373:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'map' @ [373:25] ==> val map: HashMap<String, Int> /* = HashMap<String, Int> */ defined in test.collections.MapTest.testPlusAssign[LocalVariableDescriptor]

'size' @ [373:29] ==> public open val size: Int defined in java.util.HashMap[JavaPropertyDescriptor]

'assertEquals' @ [374:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'map' @ [374:25] ==> val map: HashMap<String, Int> /* = HashMap<String, Int> */ defined in test.collections.MapTest.testPlusAssign[LocalVariableDescriptor]

'assertEquals' @ [375:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'map' @ [375:25] ==> val map: HashMap<String, Int> /* = HashMap<String, Int> */ defined in test.collections.MapTest.testPlusAssign[LocalVariableDescriptor]

'assertEquals' @ [376:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'map' @ [376:25] ==> val map: HashMap<String, Int> /* = HashMap<String, Int> */ defined in test.collections.MapTest.testPlusAssign[LocalVariableDescriptor]

'Test' @ [379:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlusAssign' @ [379:30] ==> public final fun testPlusAssign(doPlusAssign: (MutableMap<String, Int>) -> Unit): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [380:9] ==> value-parameter it: MutableMap<String, Int> defined in test.collections.MapTest.plusAssign.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [380:15] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'it' @ [381:9] ==> value-parameter it: MutableMap<String, Int> defined in test.collections.MapTest.plusAssign.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [381:15] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'Test' @ [384:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlusAssign' @ [384:34] ==> public final fun testPlusAssign(doPlusAssign: (MutableMap<String, Int>) -> Unit): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [384:51] ==> value-parameter it: MutableMap<String, Int> defined in test.collections.MapTest.plusAssignList.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [384:57] ==> public fun <T> listOf(vararg elements: Pair<String, Int>): List<Pair<String, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>

'to' @ [384:64] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [384:74] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'Test' @ [386:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlusAssign' @ [386:35] ==> public final fun testPlusAssign(doPlusAssign: (MutableMap<String, Int>) -> Unit): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [386:52] ==> value-parameter it: MutableMap<String, Int> defined in test.collections.MapTest.plusAssignArray.<anonymous>[ValueParameterDescriptorImpl]

'arrayOf' @ [386:58] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Pair<String, Int>): Array<Pair<String, Int>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Pair<String, Int>

'to' @ [386:66] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [386:76] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'Test' @ [388:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlusAssign' @ [388:38] ==> public final fun testPlusAssign(doPlusAssign: (MutableMap<String, Int>) -> Unit): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [388:55] ==> value-parameter it: MutableMap<String, Int> defined in test.collections.MapTest.plusAssignSequence.<anonymous>[ValueParameterDescriptorImpl]

'sequenceOf' @ [388:61] ==> public fun <T> sequenceOf(vararg elements: Pair<String, Int>): Sequence<Pair<String, Int>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>

'to' @ [388:72] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [388:82] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'Test' @ [390:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlusAssign' @ [390:33] ==> public final fun testPlusAssign(doPlusAssign: (MutableMap<String, Int>) -> Unit): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [390:50] ==> value-parameter it: MutableMap<String, Int> defined in test.collections.MapTest.plusAssignMap.<anonymous>[ValueParameterDescriptorImpl]

'mapOf' @ [390:56] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [390:62] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [390:72] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'mapOf' @ [393:24] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [393:30] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [393:40] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'invoke' @ [394:24] ==> public abstract operator fun invoke(p1: Map<String, Int>): Map<String, Int> defined in kotlin.Function1[FunctionInvokeDescriptor]

'original' @ [394:31] ==> val original: Map<String, Int> defined in test.collections.MapTest.testPlus[LocalVariableDescriptor]

'assertEquals' @ [395:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'extended' @ [395:25] ==> val extended: Map<String, Int> defined in test.collections.MapTest.testPlus[LocalVariableDescriptor]

'size' @ [395:34] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'assertEquals' @ [396:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'extended' @ [396:25] ==> val extended: Map<String, Int> defined in test.collections.MapTest.testPlus[LocalVariableDescriptor]

'assertEquals' @ [397:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'extended' @ [397:25] ==> val extended: Map<String, Int> defined in test.collections.MapTest.testPlus[LocalVariableDescriptor]

'assertEquals' @ [398:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int?, actual: Int?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int?

'extended' @ [398:25] ==> val extended: Map<String, Int> defined in test.collections.MapTest.testPlus[LocalVariableDescriptor]

'Test' @ [401:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlus' @ [401:24] ==> public final fun testPlus(doPlus: (Map<String, Int>) -> Map<String, Int>): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [401:35] ==> value-parameter it: Map<String, Int> defined in test.collections.MapTest.plus.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [401:41] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [401:54] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'Test' @ [403:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlus' @ [403:28] ==> public final fun testPlus(doPlus: (Map<String, Int>) -> Map<String, Int>): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [403:39] ==> value-parameter it: Map<String, Int> defined in test.collections.MapTest.plusList.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [403:44] ==> public fun <T> listOf(vararg elements: Pair<String, Int>): List<Pair<String, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>

'to' @ [403:51] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [403:61] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'Test' @ [405:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlus' @ [405:29] ==> public final fun testPlus(doPlus: (Map<String, Int>) -> Map<String, Int>): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [405:40] ==> value-parameter it: Map<String, Int> defined in test.collections.MapTest.plusArray.<anonymous>[ValueParameterDescriptorImpl]

'arrayOf' @ [405:45] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Pair<String, Int>): Array<Pair<String, Int>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Pair<String, Int>

'to' @ [405:53] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [405:63] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'Test' @ [407:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlus' @ [407:32] ==> public final fun testPlus(doPlus: (Map<String, Int>) -> Map<String, Int>): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [407:43] ==> value-parameter it: Map<String, Int> defined in test.collections.MapTest.plusSequence.<anonymous>[ValueParameterDescriptorImpl]

'sequenceOf' @ [407:48] ==> public fun <T> sequenceOf(vararg elements: Pair<String, Int>): Sequence<Pair<String, Int>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>

'to' @ [407:59] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [407:69] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'Test' @ [409:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlus' @ [409:27] ==> public final fun testPlus(doPlus: (Map<String, Int>) -> Map<String, Int>): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [409:38] ==> value-parameter it: Map<String, Int> defined in test.collections.MapTest.plusMap.<anonymous>[ValueParameterDescriptorImpl]

'mapOf' @ [409:43] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [409:49] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [409:59] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'Test' @ [411:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlusAny' @ [412:9] ==> public final fun <K, V> testPlusAny(mapObject: Any, pair: Pair<Int, String>): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> Int
    <V> -> String

'emptyMap' @ [412:21] ==> public fun <K, V> emptyMap(): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [412:49] ==> public infix fun <A, B> Int.to(that: String): Pair<Int, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> String

'testPlusAny' @ [413:9] ==> public final fun <K, V> testPlusAny(mapObject: Any, pair: Pair<CharSequence, Int>): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> CharSequence
    <V> -> Int

'mapOf' @ [413:21] ==> public fun <K, V> mapOf(pair: Pair<String, Nothing?>): Map<String, Nothing?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Nothing?

'to' @ [413:27] ==> public infix fun <A, B> String.to(that: Nothing?): Pair<String, Nothing?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Nothing?

'to' @ [413:41] ==> public infix fun <A, B> CharSequence.to(that: Int): Pair<CharSequence, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> CharSequence
    <B> -> Int

'mapObject' @ [417:19] ==> value-parameter mapObject: Any defined in test.collections.MapTest.testPlusAny[ValueParameterDescriptorImpl]

'assertEquals' @ [418:46] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Any?, actual: Any?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Any?

'pair' @ [418:59] ==> value-parameter pair: Pair<K, V> defined in test.collections.MapTest.testPlusAny[ValueParameterDescriptorImpl]

'second' @ [418:64] ==> public final val second: V defined in kotlin.Pair[DeserializedPropertyDescriptor]

'map' @ [418:72] ==> value-parameter map: Map<*, *> defined in test.collections.MapTest.testPlusAny.assertContains[ValueParameterDescriptorImpl]

'pair' @ [418:76] ==> value-parameter pair: Pair<K, V> defined in test.collections.MapTest.testPlusAny[ValueParameterDescriptorImpl]

'first' @ [418:81] ==> public final val first: K defined in kotlin.Pair[DeserializedPropertyDescriptor]

'assertContains' @ [420:9] ==> local final fun assertContains(map: Map<*, *>): Unit defined in test.collections.MapTest.testPlusAny[SimpleFunctionDescriptorImpl]

'map' @ [420:24] ==> val map: Map<*, *> defined in test.collections.MapTest.testPlusAny[LocalVariableDescriptor]

'pair' @ [420:30] ==> value-parameter pair: Pair<K, V> defined in test.collections.MapTest.testPlusAny[ValueParameterDescriptorImpl]

'assertContains' @ [421:9] ==> local final fun assertContains(map: Map<*, *>): Unit defined in test.collections.MapTest.testPlusAny[SimpleFunctionDescriptorImpl]

'map' @ [421:24] ==> val map: Map<*, *> defined in test.collections.MapTest.testPlusAny[LocalVariableDescriptor]

'listOf' @ [421:30] ==> public fun <T> listOf(element: Pair<K, V>): List<Pair<K, V>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<K, V>

'pair' @ [421:37] ==> value-parameter pair: Pair<K, V> defined in test.collections.MapTest.testPlusAny[ValueParameterDescriptorImpl]

'assertContains' @ [422:9] ==> local final fun assertContains(map: Map<*, *>): Unit defined in test.collections.MapTest.testPlusAny[SimpleFunctionDescriptorImpl]

'map' @ [422:24] ==> val map: Map<*, *> defined in test.collections.MapTest.testPlusAny[LocalVariableDescriptor]

'arrayOf' @ [422:30] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Pair<K, V>): Array<Pair<K, V>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Pair<K, V>

'pair' @ [422:38] ==> value-parameter pair: Pair<K, V> defined in test.collections.MapTest.testPlusAny[ValueParameterDescriptorImpl]

'assertContains' @ [423:9] ==> local final fun assertContains(map: Map<*, *>): Unit defined in test.collections.MapTest.testPlusAny[SimpleFunctionDescriptorImpl]

'map' @ [423:24] ==> val map: Map<*, *> defined in test.collections.MapTest.testPlusAny[LocalVariableDescriptor]

'sequenceOf' @ [423:30] ==> public fun <T> sequenceOf(vararg elements: Pair<K, V>): Sequence<Pair<K, V>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<K, V>

'pair' @ [423:41] ==> value-parameter pair: Pair<K, V> defined in test.collections.MapTest.testPlusAny[ValueParameterDescriptorImpl]

'assertContains' @ [424:9] ==> local final fun assertContains(map: Map<*, *>): Unit defined in test.collections.MapTest.testPlusAny[SimpleFunctionDescriptorImpl]

'map' @ [424:24] ==> val map: Map<*, *> defined in test.collections.MapTest.testPlusAny[LocalVariableDescriptor]

'mapOf' @ [424:30] ==> public fun <K, V> mapOf(pair: Pair<K, V>): Map<K, V> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> K
    <V> -> V

'pair' @ [424:36] ==> value-parameter pair: Pair<K, V> defined in test.collections.MapTest.testPlusAny[ValueParameterDescriptorImpl]

'mapOf' @ [429:24] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [429:30] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [429:40] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'invoke' @ [430:25] ==> public abstract operator fun invoke(p1: Map<String, Int>): Map<String, Int> defined in kotlin.Function1[FunctionInvokeDescriptor]

'original' @ [430:33] ==> val original: Map<String, Int> defined in test.collections.MapTest.testMinus[LocalVariableDescriptor]

'assertEquals' @ [431:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Pair<String, Int>, actual: Pair<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Pair<String, Int>

'to' @ [431:22] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'shortened' @ [431:32] ==> val shortened: Map<String, Int> defined in test.collections.MapTest.testMinus[LocalVariableDescriptor]

'entries' @ [431:42] ==> public abstract val entries: Set<Map.Entry<String, Int>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'single' @ [431:50] ==> public fun <T> Iterable<Map.Entry<String, Int>>.single(): Map.Entry<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<String, Int>

'toPair' @ [431:59] ==> @InlineOnly public inline fun <K, V> Map.Entry<String, Int>.toPair(): Pair<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'Test' @ [434:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testMinus' @ [434:25] ==> public final fun testMinus(doMinus: (Map<String, Int>) -> Map<String, Int>): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [434:37] ==> value-parameter it: Map<String, Int> defined in test.collections.MapTest.minus.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [436:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testMinus' @ [436:29] ==> public final fun testMinus(doMinus: (Map<String, Int>) -> Map<String, Int>): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [436:41] ==> value-parameter it: Map<String, Int> defined in test.collections.MapTest.minusList.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [436:46] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [438:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testMinus' @ [438:30] ==> public final fun testMinus(doMinus: (Map<String, Int>) -> Map<String, Int>): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [438:42] ==> value-parameter it: Map<String, Int> defined in test.collections.MapTest.minusArray.<anonymous>[ValueParameterDescriptorImpl]

'arrayOf' @ [438:47] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'Test' @ [440:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testMinus' @ [440:33] ==> public final fun testMinus(doMinus: (Map<String, Int>) -> Map<String, Int>): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [440:45] ==> value-parameter it: Map<String, Int> defined in test.collections.MapTest.minusSequence.<anonymous>[ValueParameterDescriptorImpl]

'sequenceOf' @ [440:50] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [442:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testMinus' @ [442:28] ==> public final fun testMinus(doMinus: (Map<String, Int>) -> Map<String, Int>): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [442:40] ==> value-parameter it: Map<String, Int> defined in test.collections.MapTest.minusSet.<anonymous>[ValueParameterDescriptorImpl]

'setOf' @ [442:45] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'hashMapOf' @ [447:24] ==> public fun <K, V> hashMapOf(vararg pairs: Pair<String, Int>): HashMap<String, Int> /* = HashMap<String, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [447:34] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [447:44] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'invoke' @ [448:9] ==> public abstract operator fun invoke(p1: MutableMap<String, Int>): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'original' @ [448:23] ==> val original: HashMap<String, Int> /* = HashMap<String, Int> */ defined in test.collections.MapTest.testMinusAssign[LocalVariableDescriptor]

'assertEquals' @ [449:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Pair<String, Int>, actual: Pair<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Pair<String, Int>

'to' @ [449:22] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'original' @ [449:32] ==> val original: HashMap<String, Int> /* = HashMap<String, Int> */ defined in test.collections.MapTest.testMinusAssign[LocalVariableDescriptor]

'entries' @ [449:41] ==> public open val entries: MutableSet<MutableMap.MutableEntry<String, Int>> defined in java.util.HashMap[JavaPropertyDescriptor]

'single' @ [449:49] ==> public fun <T> Iterable<MutableMap.MutableEntry<String, Int>>.single(): MutableMap.MutableEntry<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableEntry<String, Int>

'toPair' @ [449:58] ==> @InlineOnly public inline fun <K, V> Map.Entry<String, Int>.toPair(): Pair<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'Test' @ [452:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testMinusAssign' @ [452:31] ==> public final fun testMinusAssign(doMinusAssign: (MutableMap<String, Int>) -> Unit): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [453:9] ==> value-parameter it: MutableMap<String, Int> defined in test.collections.MapTest.minusAssign.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [454:9] ==> value-parameter it: MutableMap<String, Int> defined in test.collections.MapTest.minusAssign.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [457:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testMinusAssign' @ [457:35] ==> public final fun testMinusAssign(doMinusAssign: (MutableMap<String, Int>) -> Unit): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [457:53] ==> value-parameter it: MutableMap<String, Int> defined in test.collections.MapTest.minusAssignList.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [457:59] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [459:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testMinusAssign' @ [459:36] ==> public final fun testMinusAssign(doMinusAssign: (MutableMap<String, Int>) -> Unit): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [459:54] ==> value-parameter it: MutableMap<String, Int> defined in test.collections.MapTest.minusAssignArray.<anonymous>[ValueParameterDescriptorImpl]

'arrayOf' @ [459:60] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'Test' @ [461:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testMinusAssign' @ [461:39] ==> public final fun testMinusAssign(doMinusAssign: (MutableMap<String, Int>) -> Unit): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [461:57] ==> value-parameter it: MutableMap<String, Int> defined in test.collections.MapTest.minusAssignSequence.<anonymous>[ValueParameterDescriptorImpl]

'sequenceOf' @ [461:63] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'mapOf' @ [465:24] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Int>): Map<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [465:30] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [465:40] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'assertEquals' @ [466:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<String, Int>, actual: Map<String, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<String, Int>

'original' @ [466:22] ==> val original: Map<String, Int> defined in test.collections.MapTest.testIdempotent[LocalVariableDescriptor]

'invoke' @ [466:32] ==> public abstract operator fun invoke(p1: Map<String, Int>): Map<String, Int> defined in kotlin.Function1[FunctionInvokeDescriptor]

'original' @ [466:42] ==> val original: Map<String, Int> defined in test.collections.MapTest.testIdempotent[LocalVariableDescriptor]

'hashMapOf' @ [470:24] ==> public fun <K, V> hashMapOf(vararg pairs: Pair<String, Int>): HashMap<String, Int> /* = HashMap<String, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'to' @ [470:34] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'to' @ [470:44] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'HashMap' @ [471:22] ==> public final fun <K, V> <init>(p0: (MutableMap<out (String..String?), out (Int..Int?)>..Map<out (String..String?), (Int..Int?)>?)): HashMap<String, Int> /* = HashMap<String, Int> */ defined in kotlin.collections.HashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> Int

'original' @ [471:30] ==> val original: HashMap<String, Int> /* = HashMap<String, Int> */ defined in test.collections.MapTest.testIdempotentAssign[LocalVariableDescriptor]

'invoke' @ [472:9] ==> public abstract operator fun invoke(p1: MutableMap<String, Int>): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'result' @ [472:19] ==> val result: HashMap<String, Int> /* = HashMap<String, Int> */ defined in test.collections.MapTest.testIdempotentAssign[LocalVariableDescriptor]

'assertEquals' @ [473:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: HashMap<String, Int> /* = HashMap<String, Int> */, actual: HashMap<String, Int> /* = HashMap<String, Int> */, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> HashMap<String, Int>

'original' @ [473:22] ==> val original: HashMap<String, Int> /* = HashMap<String, Int> */ defined in test.collections.MapTest.testIdempotentAssign[LocalVariableDescriptor]

'result' @ [473:32] ==> val result: HashMap<String, Int> /* = HashMap<String, Int> */ defined in test.collections.MapTest.testIdempotentAssign[LocalVariableDescriptor]

'Test' @ [477:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testIdempotent' @ [477:33] ==> public final fun testIdempotent(operation: (Map<String, Int>) -> Map<String, Int>): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [477:50] ==> value-parameter it: Map<String, Int> defined in test.collections.MapTest.plusEmptyList.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [477:55] ==> @InlineOnly public inline fun <T> listOf(): List<Pair<String, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>

'Test' @ [479:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testIdempotent' @ [479:32] ==> public final fun testIdempotent(operation: (Map<String, Int>) -> Map<String, Int>): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [479:49] ==> value-parameter it: Map<String, Int> defined in test.collections.MapTest.plusEmptySet.<anonymous>[ValueParameterDescriptorImpl]

'setOf' @ [479:54] ==> @InlineOnly public inline fun <T> setOf(): Set<Pair<String, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>

'Test' @ [481:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testIdempotentAssign' @ [481:39] ==> public final fun testIdempotentAssign(operation: (MutableMap<String, Int>) -> Unit): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [481:62] ==> value-parameter it: MutableMap<String, Int> defined in test.collections.MapTest.plusAssignEmptyList.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [481:68] ==> @InlineOnly public inline fun <T> listOf(): List<Pair<String, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>

'Test' @ [483:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testIdempotentAssign' @ [483:38] ==> public final fun testIdempotentAssign(operation: (MutableMap<String, Int>) -> Unit): Unit defined in test.collections.MapTest[SimpleFunctionDescriptorImpl]

'it' @ [483:61] ==> value-parameter it: MutableMap<String, Int> defined in test.collections.MapTest.plusAssignEmptySet.<anonymous>[ValueParameterDescriptorImpl]

'setOf' @ [483:67] ==> @InlineOnly public inline fun <T> setOf(): Set<Pair<String, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Int>

