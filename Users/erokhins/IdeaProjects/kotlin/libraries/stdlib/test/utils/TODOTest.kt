'TODO' @ [25:41] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'Suppress' @ [26:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'TODO' @ [27:25] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'TODO' @ [28:37] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'if (!switch)
                TODO("what if false")
            else {
                if (value.length < 3)
                    throw TODO("write message")
            }' @ [31:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [31:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'switch' @ [31:18] ==> value-parameter switch: Boolean defined in test.utils.TODOTest.PartiallyImplementedClass.method3[ValueParameterDescriptorImpl]

'TODO' @ [32:17] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'value' @ [34:21] ==> value-parameter value: String defined in test.utils.TODOTest.PartiallyImplementedClass.method3[ValueParameterDescriptorImpl]

'length' @ [34:27] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'TODO' @ [35:27] ==> @InlineOnly public inline fun TODO(reason: String): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'value' @ [38:20] ==> value-parameter value: String defined in test.utils.TODOTest.PartiallyImplementedClass.method3[ValueParameterDescriptorImpl]

'TODO' @ [42:13] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [47:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): NotImplementedError defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> NotImplementedError

'block' @ [47:54] ==> value-parameter block: () -> Unit defined in test.utils.TODOTest.assertNotImplemented[ValueParameterDescriptorImpl]

'assertFailsWith' @ [51:17] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): NotImplementedError defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> NotImplementedError

'block' @ [51:62] ==> value-parameter block: () -> Unit defined in test.utils.TODOTest.assertNotImplementedWithMessage[ValueParameterDescriptorImpl]

'assertTrue' @ [52:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'message' @ [52:20] ==> value-parameter message: String defined in test.utils.TODOTest.assertNotImplementedWithMessage[ValueParameterDescriptorImpl]

'e' @ [52:31] ==> val e: NotImplementedError defined in test.utils.TODOTest.assertNotImplementedWithMessage[LocalVariableDescriptor]

'message' @ [52:33] ==> public open val message: String? defined in kotlin.NotImplementedError[DeserializedPropertyDescriptor]

'Test' @ [56:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'PartiallyImplementedClass' @ [57:20] ==> public constructor PartiallyImplementedClass() defined in test.utils.TODOTest.PartiallyImplementedClass[ClassConstructorDescriptorImpl]

'assertNotImplemented' @ [59:9] ==> private final fun assertNotImplemented(block: () -> Unit): Unit defined in test.utils.TODOTest[SimpleFunctionDescriptorImpl]

'inst' @ [59:32] ==> val inst: TODOTest.PartiallyImplementedClass defined in test.utils.TODOTest.usage[LocalVariableDescriptor]

'prop' @ [59:37] ==> public final val prop: String defined in test.utils.TODOTest.PartiallyImplementedClass[PropertyDescriptorImpl]

'assertNotImplemented' @ [60:9] ==> private final fun assertNotImplemented(block: () -> Unit): Unit defined in test.utils.TODOTest[SimpleFunctionDescriptorImpl]

'inst' @ [60:31] ==> val inst: TODOTest.PartiallyImplementedClass defined in test.utils.TODOTest.usage[LocalVariableDescriptor]

'method1' @ [60:36] ==> @Suppress public final fun method1(): String defined in test.utils.TODOTest.PartiallyImplementedClass[SimpleFunctionDescriptorImpl]

'assertNotImplemented' @ [61:9] ==> private final fun assertNotImplemented(block: () -> Unit): Unit defined in test.utils.TODOTest[SimpleFunctionDescriptorImpl]

'inst' @ [61:32] ==> val inst: TODOTest.PartiallyImplementedClass defined in test.utils.TODOTest.usage[LocalVariableDescriptor]

'method2' @ [61:37] ==> public final fun method2(): Int defined in test.utils.TODOTest.PartiallyImplementedClass[SimpleFunctionDescriptorImpl]

'assertNotImplemented' @ [62:9] ==> private final fun assertNotImplemented(block: () -> Unit): Unit defined in test.utils.TODOTest[SimpleFunctionDescriptorImpl]

'inst' @ [62:32] ==> val inst: TODOTest.PartiallyImplementedClass defined in test.utils.TODOTest.usage[LocalVariableDescriptor]

'method4' @ [62:37] ==> public final fun method4(): Unit defined in test.utils.TODOTest.PartiallyImplementedClass[SimpleFunctionDescriptorImpl]

'assertNotImplementedWithMessage' @ [63:9] ==> private final fun assertNotImplementedWithMessage(message: String, block: () -> Unit): Unit defined in test.utils.TODOTest[SimpleFunctionDescriptorImpl]

'inst' @ [63:60] ==> val inst: TODOTest.PartiallyImplementedClass defined in test.utils.TODOTest.usage[LocalVariableDescriptor]

'method3' @ [63:65] ==> public final fun method3(switch: Boolean, value: String): String defined in test.utils.TODOTest.PartiallyImplementedClass[SimpleFunctionDescriptorImpl]

'assertNotImplementedWithMessage' @ [64:9] ==> private final fun assertNotImplementedWithMessage(message: String, block: () -> Unit): Unit defined in test.utils.TODOTest[SimpleFunctionDescriptorImpl]

'inst' @ [64:60] ==> val inst: TODOTest.PartiallyImplementedClass defined in test.utils.TODOTest.usage[LocalVariableDescriptor]

'method3' @ [64:65] ==> public final fun method3(switch: Boolean, value: String): String defined in test.utils.TODOTest.PartiallyImplementedClass[SimpleFunctionDescriptorImpl]

'assertEquals' @ [65:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'inst' @ [65:30] ==> val inst: TODOTest.PartiallyImplementedClass defined in test.utils.TODOTest.usage[LocalVariableDescriptor]

'method3' @ [65:35] ==> public final fun method3(switch: Boolean, value: String): String defined in test.utils.TODOTest.PartiallyImplementedClass[SimpleFunctionDescriptorImpl]

