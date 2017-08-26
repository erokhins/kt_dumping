'Test' @ [8:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'require' @ [9:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'require' @ [12:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'called' @ [12:25] ==> var called: Boolean defined in test.utils.PreconditionsTest.passingRequire[LocalVariableDescriptor]

'assertFalse' @ [13:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'called' @ [13:21] ==> var called: Boolean defined in test.utils.PreconditionsTest.passingRequire[LocalVariableDescriptor]

'Test' @ [16:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertFailsWith' @ [17:21] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalArgumentException

'require' @ [18:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'assertNotNull' @ [20:9] ==> public fun <T : Any> assertNotNull(actual: String?, message: String? = ...): String defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'error' @ [20:23] ==> val error: IllegalArgumentException /* = IllegalArgumentException */ defined in test.utils.PreconditionsTest.failingRequire[LocalVariableDescriptor]

'message' @ [20:29] ==> public open val message: String? defined in java.lang.IllegalArgumentException[DeserializedPropertyDescriptor]

'Test' @ [23:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertFailsWith' @ [24:21] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalArgumentException

'require' @ [25:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [27:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'error' @ [27:31] ==> val error: IllegalArgumentException /* = IllegalArgumentException */ defined in test.utils.PreconditionsTest.failingRequireWithLazyMessage[LocalVariableDescriptor]

'message' @ [27:37] ==> public open val message: String? defined in java.lang.IllegalArgumentException[DeserializedPropertyDescriptor]

'Test' @ [30:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'check' @ [31:9] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'check' @ [34:9] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'called' @ [34:23] ==> var called: Boolean defined in test.utils.PreconditionsTest.passingCheck[LocalVariableDescriptor]

'assertFalse' @ [35:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'called' @ [35:21] ==> var called: Boolean defined in test.utils.PreconditionsTest.passingCheck[LocalVariableDescriptor]

'Test' @ [38:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertFailsWith' @ [39:21] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalStateException /* = IllegalStateException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalStateException

'check' @ [40:13] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'assertNotNull' @ [42:9] ==> public fun <T : Any> assertNotNull(actual: String?, message: String? = ...): String defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'error' @ [42:23] ==> val error: IllegalStateException /* = IllegalStateException */ defined in test.utils.PreconditionsTest.failingCheck[LocalVariableDescriptor]

'message' @ [42:29] ==> public open val message: String? defined in java.lang.IllegalStateException[DeserializedPropertyDescriptor]

'Test' @ [45:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertFailsWith' @ [46:21] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalStateException /* = IllegalStateException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalStateException

'check' @ [47:13] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [49:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'error' @ [49:31] ==> val error: IllegalStateException /* = IllegalStateException */ defined in test.utils.PreconditionsTest.failingCheckWithLazyMessage[LocalVariableDescriptor]

'message' @ [49:37] ==> public open val message: String? defined in java.lang.IllegalStateException[DeserializedPropertyDescriptor]

'Test' @ [52:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'requireNotNull' @ [54:26] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: String?): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

's1' @ [54:41] ==> val s1: String? defined in test.utils.PreconditionsTest.requireNotNull[LocalVariableDescriptor]

'assertEquals' @ [55:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'r1' @ [55:28] ==> val r1: String defined in test.utils.PreconditionsTest.requireNotNull[LocalVariableDescriptor]

'Test' @ [58:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertFailsWith' @ [59:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalArgumentException

'requireNotNull' @ [61:13] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: String?): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

's2' @ [61:28] ==> val s2: String? defined in test.utils.PreconditionsTest.requireNotNullFails.<anonymous>[LocalVariableDescriptor]

'Test' @ [65:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertFailsWith' @ [66:21] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalArgumentException

'requireNotNull' @ [68:13] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: Any?, lazyMessage: () -> Any): Any defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Any

'obj' @ [68:28] ==> val obj: Any? defined in test.utils.PreconditionsTest.requireNotNullWithLazyMessage.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [70:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'error' @ [70:33] ==> val error: IllegalArgumentException /* = IllegalArgumentException */ defined in test.utils.PreconditionsTest.requireNotNullWithLazyMessage[LocalVariableDescriptor]

'message' @ [70:39] ==> public open val message: String? defined in java.lang.IllegalArgumentException[DeserializedPropertyDescriptor]

'requireNotNull' @ [73:9] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: String?, lazyMessage: () -> Any): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'lazyCalled' @ [74:13] ==> var lazyCalled: Boolean defined in test.utils.PreconditionsTest.requireNotNullWithLazyMessage[LocalVariableDescriptor]

'assertFalse' @ [77:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'lazyCalled' @ [77:21] ==> var lazyCalled: Boolean defined in test.utils.PreconditionsTest.requireNotNullWithLazyMessage[LocalVariableDescriptor]

'Test' @ [80:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'checkNotNull' @ [82:26] ==> @InlineOnly public inline fun <T : Any> checkNotNull(value: String?): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

's1' @ [82:39] ==> val s1: String? defined in test.utils.PreconditionsTest.checkNotNull[LocalVariableDescriptor]

'assertEquals' @ [83:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'r1' @ [83:28] ==> val r1: String defined in test.utils.PreconditionsTest.checkNotNull[LocalVariableDescriptor]

'Test' @ [86:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertFailsWith' @ [87:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalStateException /* = IllegalStateException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalStateException

'checkNotNull' @ [89:13] ==> @InlineOnly public inline fun <T : Any> checkNotNull(value: String?): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

's2' @ [89:26] ==> val s2: String? defined in test.utils.PreconditionsTest.checkNotNullFails.<anonymous>[LocalVariableDescriptor]

'kotlin.jvm.JvmVersion' @ [93:5] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[DeserializedClassConstructorDescriptor]

'Test' @ [94:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assert' @ [95:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'assert' @ [97:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'called' @ [97:24] ==> var called: Boolean defined in test.utils.PreconditionsTest.passingAssert[LocalVariableDescriptor]

'assertFalse' @ [99:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'called' @ [99:21] ==> var called: Boolean defined in test.utils.PreconditionsTest.passingAssert[LocalVariableDescriptor]

'kotlin.jvm.JvmVersion' @ [103:5] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[DeserializedClassConstructorDescriptor]

'Test' @ [104:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertFailsWith' @ [105:21] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): AssertionError /* = AssertionError */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> AssertionError

'assert' @ [106:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [108:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'error' @ [108:42] ==> val error: AssertionError /* = AssertionError */ defined in test.utils.PreconditionsTest.failingAssert[LocalVariableDescriptor]

'message' @ [108:48] ==> public open val message: String? defined in java.lang.AssertionError[DeserializedPropertyDescriptor]

'kotlin.jvm.JvmVersion' @ [112:5] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[DeserializedClassConstructorDescriptor]

'Test' @ [113:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertFailsWith' @ [114:21] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): AssertionError /* = AssertionError */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> AssertionError

'assert' @ [115:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [117:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'error' @ [117:31] ==> val error: AssertionError /* = AssertionError */ defined in test.utils.PreconditionsTest.failingAssertWithMessage[LocalVariableDescriptor]

'message' @ [117:37] ==> public open val message: String? defined in java.lang.AssertionError[DeserializedPropertyDescriptor]

'Test' @ [120:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertFailsWith' @ [121:21] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalStateException /* = IllegalStateException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalStateException

'error' @ [122:13] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [124:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'error' @ [124:45] ==> val error: IllegalStateException /* = IllegalStateException */ defined in test.utils.PreconditionsTest.error[LocalVariableDescriptor]

'message' @ [124:51] ==> public open val message: String? defined in java.lang.IllegalStateException[DeserializedPropertyDescriptor]

