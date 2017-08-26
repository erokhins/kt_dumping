'error' @ [28:53] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'error' @ [29:40] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'error' @ [30:43] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'suspendCoroutine' @ [36:53] ==> @SinceKotlin public inline suspend fun <T> suspendCoroutine(crossinline block: (Continuation<CoroutinesReferenceValuesTest.BadClass>) -> Unit): CoroutinesReferenceValuesTest.BadClass defined in kotlin.coroutines.experimental[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BadClass

'counter' @ [37:9] ==> public final var counter: Int defined in test.coroutines.CoroutinesReferenceValuesTest[PropertyDescriptorImpl]

'cont' @ [38:9] ==> value-parameter cont: Continuation<CoroutinesReferenceValuesTest.BadClass> defined in test.coroutines.CoroutinesReferenceValuesTest.getBadClassViaSuspend.<anonymous>[ValueParameterDescriptorImpl]

'resume' @ [38:14] ==> public abstract fun resume(value: CoroutinesReferenceValuesTest.BadClass): Unit defined in kotlin.coroutines.experimental.Continuation[DeserializedSimpleFunctionDescriptor]

'BadClass' @ [38:21] ==> public constructor BadClass() defined in test.coroutines.CoroutinesReferenceValuesTest.BadClass[ClassConstructorDescriptorImpl]

'assertTrue' @ [43:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'getBadClassViaSuspend' @ [43:20] ==> public final suspend fun getBadClassViaSuspend(): CoroutinesReferenceValuesTest.BadClass defined in test.coroutines.CoroutinesReferenceValuesTest[SimpleFunctionDescriptorImpl]

'assertTrue' @ [44:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'getBadClassViaSuspend' @ [44:20] ==> public final suspend fun getBadClassViaSuspend(): CoroutinesReferenceValuesTest.BadClass defined in test.coroutines.CoroutinesReferenceValuesTest[SimpleFunctionDescriptorImpl]

'block' @ [47:47] ==> value-parameter block: suspend () -> T defined in test.coroutines.CoroutinesReferenceValuesTest.suspend[ValueParameterDescriptorImpl]

'Test' @ [49:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'suspend' @ [51:19] ==> public final fun <T> suspend(block: suspend () -> CoroutinesReferenceValuesTest.BadClass): suspend () -> CoroutinesReferenceValuesTest.BadClass defined in test.coroutines.CoroutinesReferenceValuesTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> BadClass

'checkBadClassTwice' @ [52:13] ==> public final suspend fun checkBadClassTwice(): Unit defined in test.coroutines.CoroutinesReferenceValuesTest[SimpleFunctionDescriptorImpl]

'getBadClassViaSuspend' @ [53:13] ==> public final suspend fun getBadClassViaSuspend(): CoroutinesReferenceValuesTest.BadClass defined in test.coroutines.CoroutinesReferenceValuesTest[SimpleFunctionDescriptorImpl]

'bad' @ [56:9] ==> val bad: suspend () -> CoroutinesReferenceValuesTest.BadClass defined in test.coroutines.CoroutinesReferenceValuesTest.testBadClass[LocalVariableDescriptor]

'startCoroutine' @ [56:13] ==> @SinceKotlin public fun <T> (suspend () -> CoroutinesReferenceValuesTest.BadClass).startCoroutine(completion: Continuation<CoroutinesReferenceValuesTest.BadClass>): Unit defined in kotlin.coroutines.experimental[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BadClass

'EmptyCoroutineContext' @ [57:54] ==> @SinceKotlin public object EmptyCoroutineContext : CoroutineContext defined in kotlin.coroutines.experimental[FakeCallableDescriptorForObject]

'assertTrue' @ [60:17] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'result' @ [60:28] ==> var result: CoroutinesReferenceValuesTest.BadClass? defined in test.coroutines.CoroutinesReferenceValuesTest.testBadClass[LocalVariableDescriptor]

'result' @ [61:17] ==> var result: CoroutinesReferenceValuesTest.BadClass? defined in test.coroutines.CoroutinesReferenceValuesTest.testBadClass[LocalVariableDescriptor]

'value' @ [61:26] ==> value-parameter value: CoroutinesReferenceValuesTest.BadClass defined in test.coroutines.CoroutinesReferenceValuesTest.testBadClass.<no name provided>.resume[ValueParameterDescriptorImpl]

'exception' @ [65:23] ==> value-parameter exception: Throwable defined in test.coroutines.CoroutinesReferenceValuesTest.testBadClass.<no name provided>.resumeWithException[ValueParameterDescriptorImpl]

'assertTrue' @ [68:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'result' @ [68:20] ==> var result: CoroutinesReferenceValuesTest.BadClass? defined in test.coroutines.CoroutinesReferenceValuesTest.testBadClass[LocalVariableDescriptor]

'assertEquals' @ [69:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'counter' @ [69:25] ==> public final var counter: Int defined in test.coroutines.CoroutinesReferenceValuesTest[PropertyDescriptorImpl]

