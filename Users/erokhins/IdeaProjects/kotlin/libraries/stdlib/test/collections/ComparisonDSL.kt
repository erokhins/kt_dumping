'CompareContext' @ [7:5] ==> public constructor CompareContext<out T>(expected: T, actual: T) defined in test.collections.CompareContext[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'expected' @ [7:20] ==> value-parameter expected: T defined in test.collections.compare[ValueParameterDescriptorImpl]

'actual' @ [7:30] ==> value-parameter actual: T defined in test.collections.compare[ValueParameterDescriptorImpl]

'invoke' @ [7:38] ==> public abstract operator fun CompareContext<T>.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'assertEquals' @ [13:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: T, actual: T, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> T

'expected' @ [13:22] ==> public final val expected: T defined in test.collections.CompareContext[PropertyDescriptorImpl]

'actual' @ [13:32] ==> public final val actual: T defined in test.collections.CompareContext[PropertyDescriptorImpl]

'message' @ [13:40] ==> value-parameter message: String = ... defined in test.collections.CompareContext.equals[ValueParameterDescriptorImpl]

'assertEquals' @ [16:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: P, actual: P, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> P

'expected' @ [16:22] ==> public final val expected: T defined in test.collections.CompareContext[PropertyDescriptorImpl]

'invoke' @ [16:31] ==> public abstract operator fun T.invoke(): P defined in kotlin.Function1[FunctionInvokeDescriptor]

'actual' @ [16:41] ==> public final val actual: T defined in test.collections.CompareContext[PropertyDescriptorImpl]

'invoke' @ [16:48] ==> public abstract operator fun T.invoke(): P defined in kotlin.Function1[FunctionInvokeDescriptor]

'message' @ [16:58] ==> value-parameter message: String = ... defined in test.collections.CompareContext.propertyEquals[ValueParameterDescriptorImpl]

'assertFailEquals' @ [18:54] ==> private final fun assertFailEquals(expected: () -> Unit, actual: () -> Unit): Unit defined in test.collections.CompareContext[SimpleFunctionDescriptorImpl]

'expected' @ [18:72] ==> public final val expected: T defined in test.collections.CompareContext[PropertyDescriptorImpl]

'invoke' @ [18:81] ==> public abstract operator fun T.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'actual' @ [18:93] ==> public final val actual: T defined in test.collections.CompareContext[PropertyDescriptorImpl]

'invoke' @ [18:100] ==> public abstract operator fun T.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'compare' @ [20:9] ==> public fun <T> compare(expected: P, actual: P, block: CompareContext<P>.() -> Unit): Unit defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> P

'expected' @ [20:17] ==> public final val expected: T defined in test.collections.CompareContext[PropertyDescriptorImpl]

'invoke' @ [20:26] ==> public abstract operator fun T.invoke(): P defined in kotlin.Function1[FunctionInvokeDescriptor]

'actual' @ [20:36] ==> public final val actual: T defined in test.collections.CompareContext[PropertyDescriptorImpl]

'invoke' @ [20:43] ==> public abstract operator fun T.invoke(): P defined in kotlin.Function1[FunctionInvokeDescriptor]

'block' @ [20:53] ==> value-parameter block: CompareContext<P>.() -> Unit defined in test.collections.CompareContext.compareProperty[ValueParameterDescriptorImpl]

'assertFails' @ [24:28] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'expected' @ [24:40] ==> value-parameter expected: () -> Unit defined in test.collections.CompareContext.assertFailEquals[ValueParameterDescriptorImpl]

'assertFails' @ [25:26] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'actual' @ [25:38] ==> value-parameter actual: () -> Unit defined in test.collections.CompareContext.assertFailEquals[ValueParameterDescriptorImpl]

'assertTypeEquals' @ [27:9] ==> @JvmVersion public fun assertTypeEquals(expected: Any?, actual: Any?): Unit defined in test in file testUtilsJVM.kt[SimpleFunctionDescriptorImpl]

'expectedFail' @ [27:26] ==> val expectedFail: Throwable defined in test.collections.CompareContext.assertFailEquals[LocalVariableDescriptor]

'actualFail' @ [27:40] ==> val actualFail: Throwable defined in test.collections.CompareContext.assertFailEquals[LocalVariableDescriptor]

