'Test' @ [8:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'NotNullVarTestGeneric' @ [9:9] ==> public constructor NotNullVarTestGeneric<T : Any>(a1: String, b1: String) defined in test.properties.delegation.NotNullVarTestGeneric[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> String

'doTest' @ [9:41] ==> public final fun doTest(): Unit defined in test.properties.delegation.NotNullVarTestGeneric[SimpleFunctionDescriptorImpl]

'Delegates' @ [14:22] ==> public object Delegates defined in kotlin.properties[FakeCallableDescriptorForObject]

'notNull' @ [14:32] ==> public final fun <T : Any> notNull(): ReadWriteProperty<Any?, String> defined in kotlin.properties.Delegates[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'Delegates' @ [15:14] ==> public object Delegates defined in kotlin.properties[FakeCallableDescriptorForObject]

'notNull' @ [15:24] ==> public final fun <T : Any> notNull(): ReadWriteProperty<Any?, T> defined in kotlin.properties.Delegates[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> T

'a' @ [18:9] ==> public final var a: String defined in test.properties.delegation.NotNullVarTestGeneric[PropertyDescriptorImpl]

'a1' @ [18:13] ==> public final val a1: String defined in test.properties.delegation.NotNullVarTestGeneric[PropertyDescriptorImpl]

'b' @ [19:9] ==> public final var b: T defined in test.properties.delegation.NotNullVarTestGeneric[PropertyDescriptorImpl]

'b1' @ [19:13] ==> public final val b1: T defined in test.properties.delegation.NotNullVarTestGeneric[PropertyDescriptorImpl]

'assertTrue' @ [20:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'a' @ [20:20] ==> public final var a: String defined in test.properties.delegation.NotNullVarTestGeneric[PropertyDescriptorImpl]

'a' @ [20:61] ==> public final var a: String defined in test.properties.delegation.NotNullVarTestGeneric[PropertyDescriptorImpl]

'assertTrue' @ [21:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'b' @ [21:20] ==> public final var b: T defined in test.properties.delegation.NotNullVarTestGeneric[PropertyDescriptorImpl]

'b' @ [21:61] ==> public final var b: T defined in test.properties.delegation.NotNullVarTestGeneric[PropertyDescriptorImpl]

'Delegates' @ [28:19] ==> public object Delegates defined in kotlin.properties[FakeCallableDescriptorForObject]

'observable' @ [28:29] ==> public final inline fun <T> observable(initialValue: Int, crossinline onChange: (property: KProperty<*>, Int, Int) -> Unit): ReadWriteProperty<Any?, Int> defined in kotlin.properties.Delegates[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [29:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'property' @ [29:27] ==> value-parameter property: KProperty<*> defined in test.properties.delegation.ObservablePropertyTest.b.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [29:36] ==> public abstract val name: String defined in kotlin.reflect.KProperty[DeserializedPropertyDescriptor]

'!' @ [30:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'result' @ [30:14] ==> public final var result: Boolean defined in test.properties.delegation.ObservablePropertyTest[PropertyDescriptorImpl]

'assertEquals' @ [30:22] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'old' @ [30:38] ==> value-parameter old: Int defined in test.properties.delegation.ObservablePropertyTest.b.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [31:9] ==> public final var result: Boolean defined in test.properties.delegation.ObservablePropertyTest[PropertyDescriptorImpl]

'assertEquals' @ [32:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'new' @ [32:22] ==> value-parameter new: Int defined in test.properties.delegation.ObservablePropertyTest.b.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [32:27] ==> public final var b: Int defined in test.properties.delegation.ObservablePropertyTest[PropertyDescriptorImpl]

'Test' @ [35:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'b' @ [36:9] ==> public final var b: Int defined in test.properties.delegation.ObservablePropertyTest[PropertyDescriptorImpl]

'assertTrue' @ [37:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'b' @ [37:20] ==> public final var b: Int defined in test.properties.delegation.ObservablePropertyTest[PropertyDescriptorImpl]

'assertTrue' @ [38:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'result' @ [38:20] ==> public final var result: Boolean defined in test.properties.delegation.ObservablePropertyTest[PropertyDescriptorImpl]

'Delegates' @ [46:17] ==> public object Delegates defined in kotlin.properties[FakeCallableDescriptorForObject]

'vetoable' @ [46:27] ==> public final inline fun <T> vetoable(initialValue: A, crossinline onChange: (property: KProperty<*>, A, A) -> Boolean): ReadWriteProperty<Any?, A> defined in kotlin.properties.Delegates[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> A

'A' @ [46:36] ==> public constructor A(p: Boolean) defined in test.properties.delegation.A[ClassConstructorDescriptorImpl]

'assertEquals' @ [47:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'property' @ [47:27] ==> value-parameter property: KProperty<*> defined in test.properties.delegation.VetoablePropertyTest.b.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [47:36] ==> public abstract val name: String defined in kotlin.reflect.KProperty[DeserializedPropertyDescriptor]

'assertEquals' @ [48:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: A, actual: A, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> A

'old' @ [48:22] ==> value-parameter old: A defined in test.properties.delegation.VetoablePropertyTest.b.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [48:27] ==> public final var b: A defined in test.properties.delegation.VetoablePropertyTest[PropertyDescriptorImpl]

'result' @ [49:9] ==> public final var result: Boolean defined in test.properties.delegation.VetoablePropertyTest[PropertyDescriptorImpl]

'new' @ [49:18] ==> value-parameter new: A defined in test.properties.delegation.VetoablePropertyTest.b.<anonymous>[ValueParameterDescriptorImpl]

'p' @ [49:22] ==> public final val p: Boolean defined in test.properties.delegation.A[PropertyDescriptorImpl]

'result' @ [50:9] ==> public final var result: Boolean defined in test.properties.delegation.VetoablePropertyTest[PropertyDescriptorImpl]

'Test' @ [53:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'A' @ [54:26] ==> public constructor A(p: Boolean) defined in test.properties.delegation.A[ClassConstructorDescriptorImpl]

'b' @ [55:9] ==> public final var b: A defined in test.properties.delegation.VetoablePropertyTest[PropertyDescriptorImpl]

'firstValue' @ [55:13] ==> val firstValue: A defined in test.properties.delegation.VetoablePropertyTest.doTest[LocalVariableDescriptor]

'assertTrue' @ [56:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'b' @ [56:20] ==> public final var b: A defined in test.properties.delegation.VetoablePropertyTest[PropertyDescriptorImpl]

'firstValue' @ [56:25] ==> val firstValue: A defined in test.properties.delegation.VetoablePropertyTest.doTest[LocalVariableDescriptor]

'assertTrue' @ [57:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'result' @ [57:20] ==> public final var result: Boolean defined in test.properties.delegation.VetoablePropertyTest[PropertyDescriptorImpl]

'b' @ [58:9] ==> public final var b: A defined in test.properties.delegation.VetoablePropertyTest[PropertyDescriptorImpl]

'A' @ [58:13] ==> public constructor A(p: Boolean) defined in test.properties.delegation.A[ClassConstructorDescriptorImpl]

'assertTrue' @ [59:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'b' @ [59:20] ==> public final var b: A defined in test.properties.delegation.VetoablePropertyTest[PropertyDescriptorImpl]

'firstValue' @ [59:25] ==> val firstValue: A defined in test.properties.delegation.VetoablePropertyTest.doTest[LocalVariableDescriptor]

'assertFalse' @ [60:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'result' @ [60:21] ==> public final var result: Boolean defined in test.properties.delegation.VetoablePropertyTest[PropertyDescriptorImpl]

