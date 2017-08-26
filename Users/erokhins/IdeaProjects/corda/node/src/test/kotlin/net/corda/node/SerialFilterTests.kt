'Test' @ [11:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'fail' @ [13:44] ==> public fun fail(message: String? = ...): Nothing defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'listOf' @ [14:9] ==> public fun <T> listOf(vararg elements: Class<out Serializable>?): List<Class<out Serializable>?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out java.io.Serializable>?

'Byte' @ [14:22] ==> public companion object defined in kotlin.Byte[FakeCallableDescriptorForObject]

'javaPrimitiveType' @ [14:34] ==> public val <T : Any> KClass<Byte>.javaPrimitiveType: Class<Byte>? defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Byte

'java' @ [14:69] ==> public val <T> KClass<IntArray>.java: Class<IntArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IntArray

'Array' @ [14:75] ==> public constructor Array<T>(size: Int, init: (Int) -> Any?) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> Any?

'java' @ [14:99] ==> public val <T> KClass<Array<CharArray>>.java: Class<Array<CharArray>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Array<CharArray>

'forEach' @ [14:105] ==> @HidesMembers public inline fun <T> Iterable<Class<out Serializable>?>.forEach(action: (Class<out Serializable>?) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out java.io.Serializable>?

'assertTrue' @ [15:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'SerialFilter' @ [15:24] ==> internal object SerialFilter defined in net.corda.node[FakeCallableDescriptorForObject]

'applyPredicate' @ [15:37] ==> internal final fun applyPredicate(acceptClass: (Class<*>) -> Boolean, serialClass: Class<*>?): Boolean defined in net.corda.node.SerialFilter[DeserializedSimpleFunctionDescriptor]

'acceptClass' @ [15:52] ==> val acceptClass: (Class<*>) -> Nothing defined in net.corda.node.SerialFilterTests.`null and primitives are accepted and arrays are unwrapped`[LocalVariableDescriptor]

'it' @ [15:65] ==> value-parameter it: Class<out Serializable>? defined in net.corda.node.SerialFilterTests.`null and primitives are accepted and arrays are unwrapped`.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [19:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mutableListOf' @ [21:23] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Class<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<*>

'classes' @ [23:13] ==> val classes: MutableList<Class<*>> defined in net.corda.node.SerialFilterTests.`the predicate is applied to the componentType`[LocalVariableDescriptor]

'add' @ [23:21] ==> public abstract fun add(element: Class<*>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'clazz' @ [23:25] ==> value-parameter clazz: Class<*> defined in net.corda.node.SerialFilterTests.`the predicate is applied to the componentType`.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [26:9] ==> public fun <T> listOf(vararg elements: Class<out Serializable>): List<Class<out Serializable>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out java.io.Serializable>

'String' @ [26:16] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'java' @ [26:30] ==> public val <T> KClass<String>.java: Class<String> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'Array' @ [26:36] ==> public constructor Array<T>(size: Int, init: (Int) -> Any?) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> Any?

'java' @ [26:55] ==> public val <T> KClass<Array<Unit>>.java: Class<Array<Unit>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Array<Unit>

'Array' @ [26:61] ==> public constructor Array<T>(size: Int, init: (Int) -> Any?) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> Any?

'java' @ [26:94] ==> public val <T> KClass<Array<Array<IOException>>>.java: Class<Array<Array<IOException>>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Array<Array<IOException>>

'forEach' @ [26:100] ==> @HidesMembers public inline fun <T> Iterable<Class<out Serializable>>.forEach(action: (Class<out Serializable>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out java.io.Serializable>

'assertFalse' @ [27:13] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'SerialFilter' @ [27:25] ==> internal object SerialFilter defined in net.corda.node[FakeCallableDescriptorForObject]

'applyPredicate' @ [27:38] ==> internal final fun applyPredicate(acceptClass: (Class<*>) -> Boolean, serialClass: Class<*>?): Boolean defined in net.corda.node.SerialFilter[DeserializedSimpleFunctionDescriptor]

'acceptClass' @ [27:53] ==> val acceptClass: (Class<*>) -> Boolean defined in net.corda.node.SerialFilterTests.`the predicate is applied to the componentType`[LocalVariableDescriptor]

'it' @ [27:66] ==> value-parameter it: Class<out Serializable> defined in net.corda.node.SerialFilterTests.`the predicate is applied to the componentType`.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [29:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Class<*>>, actual: List<Class<*>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Class<*>>

'listOf' @ [29:22] ==> public fun <T> listOf(vararg elements: Class<*>): List<Class<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<*>

'String' @ [29:39] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'java' @ [29:53] ==> public val <T> KClass<String>.java: Class<String> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'Unit' @ [29:59] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'java' @ [29:71] ==> public val <T> KClass<Unit>.java: Class<Unit> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Unit

'IOException' @ [29:77] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'java' @ [29:96] ==> public val <T> KClass<IOException>.java: Class<IOException> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IOException

'classes' @ [29:103] ==> val classes: MutableList<Class<*>> defined in net.corda.node.SerialFilterTests.`the predicate is applied to the componentType`[LocalVariableDescriptor]

