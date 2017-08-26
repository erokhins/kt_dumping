'kotlin.jvm.JvmVersion' @ [1:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[DeserializedClassConstructorDescriptor]

'Test' @ [9:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'buildString' @ [10:17] ==> @SinceKotlin @InlineOnly public inline fun buildString(capacity: Int, builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [11:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'capacity' @ [11:31] ==> public open fun capacity(): Int defined in java.lang.StringBuilder[JavaMethodDescriptor]

'assertEquals' @ [13:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [13:26] ==> val s: String defined in test.text.StringBuilderJVMTest.stringBuildWithInitialCapacity[LocalVariableDescriptor]

'Test' @ [16:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'StringBuilder' @ [17:18] ==> public final fun <init>(p0: (String..String?)): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'sb' @ [18:9] ==> val sb: StringBuilder /* = StringBuilder */ defined in test.text.StringBuilderJVMTest.getAndSetChar[LocalVariableDescriptor]

'assertEquals' @ [20:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'sb' @ [20:29] ==> val sb: StringBuilder /* = StringBuilder */ defined in test.text.StringBuilderJVMTest.getAndSetChar[LocalVariableDescriptor]

'toString' @ [20:32] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'assertEquals' @ [21:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Char, actual: Char, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Char

'sb' @ [21:27] ==> val sb: StringBuilder /* = StringBuilder */ defined in test.text.StringBuilderJVMTest.getAndSetChar[LocalVariableDescriptor]

