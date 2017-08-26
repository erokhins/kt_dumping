'kotlin.jvm.JvmName' @ [17:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[ClassConstructorDescriptorImpl]

'SinceKotlin' @ [29:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'Suppress' @ [30:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'createCoroutineUnchecked' @ [35:5] ==> @SinceKotlin public fun <R, T> (suspend R.() -> T).createCoroutineUnchecked(receiver: R, completion: Continuation<T>): Continuation<Unit> defined in kotlin.coroutines.experimental.intrinsics[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> R
    <T> -> T

'receiver' @ [35:30] ==> value-parameter receiver: R defined in kotlin.coroutines.experimental.startCoroutine[ValueParameterDescriptorImpl]

'completion' @ [35:40] ==> value-parameter completion: Continuation<T> defined in kotlin.coroutines.experimental.startCoroutine[ValueParameterDescriptorImpl]

'resume' @ [35:52] ==> public abstract fun resume(value: Unit): Unit defined in kotlin.coroutines.experimental.Continuation[SimpleFunctionDescriptorImpl]

'Unit' @ [35:59] ==> public object Unit defined in kotlin in file Unit.kt[FakeCallableDescriptorForObject]

'SinceKotlin' @ [43:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'Suppress' @ [44:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'createCoroutineUnchecked' @ [48:5] ==> @SinceKotlin public fun <T> (suspend () -> T).createCoroutineUnchecked(completion: Continuation<T>): Continuation<Unit> defined in kotlin.coroutines.experimental.intrinsics[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'completion' @ [48:30] ==> value-parameter completion: Continuation<T> defined in kotlin.coroutines.experimental.startCoroutine[ValueParameterDescriptorImpl]

'resume' @ [48:42] ==> public abstract fun resume(value: Unit): Unit defined in kotlin.coroutines.experimental.Continuation[SimpleFunctionDescriptorImpl]

'Unit' @ [48:49] ==> public object Unit defined in kotlin in file Unit.kt[FakeCallableDescriptorForObject]

'SinceKotlin' @ [59:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'Suppress' @ [60:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'SafeContinuation' @ [64:25] ==> internal constructor SafeContinuation<in T>(delegate: Continuation<Unit>, initialResult: Any?) defined in kotlin.coroutines.experimental.SafeContinuation[ClassConstructorDescriptorImpl]
Inferred types:
    <in T> -> Unit

'createCoroutineUnchecked' @ [64:42] ==> @SinceKotlin public fun <R, T> (suspend R.() -> T).createCoroutineUnchecked(receiver: R, completion: Continuation<T>): Continuation<Unit> defined in kotlin.coroutines.experimental.intrinsics[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> R
    <T> -> T

'receiver' @ [64:67] ==> value-parameter receiver: R defined in kotlin.coroutines.experimental.createCoroutine[ValueParameterDescriptorImpl]

'completion' @ [64:77] ==> value-parameter completion: Continuation<T> defined in kotlin.coroutines.experimental.createCoroutine[ValueParameterDescriptorImpl]

'COROUTINE_SUSPENDED' @ [64:90] ==> @SinceKotlin public val COROUTINE_SUSPENDED: Any defined in kotlin.coroutines.experimental.intrinsics in file Intrinsics.kt[PropertyDescriptorImpl]

'SinceKotlin' @ [74:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'Suppress' @ [75:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'SafeContinuation' @ [78:25] ==> internal constructor SafeContinuation<in T>(delegate: Continuation<Unit>, initialResult: Any?) defined in kotlin.coroutines.experimental.SafeContinuation[ClassConstructorDescriptorImpl]
Inferred types:
    <in T> -> Unit

'createCoroutineUnchecked' @ [78:42] ==> @SinceKotlin public fun <T> (suspend () -> T).createCoroutineUnchecked(completion: Continuation<T>): Continuation<Unit> defined in kotlin.coroutines.experimental.intrinsics[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'completion' @ [78:67] ==> value-parameter completion: Continuation<T> defined in kotlin.coroutines.experimental.createCoroutine[ValueParameterDescriptorImpl]

'COROUTINE_SUSPENDED' @ [78:80] ==> @SinceKotlin public val COROUTINE_SUSPENDED: Any defined in kotlin.coroutines.experimental.intrinsics in file Intrinsics.kt[PropertyDescriptorImpl]

'SinceKotlin' @ [88:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'suspendCoroutineOrReturn' @ [90:9] ==> @SinceKotlin @InlineOnly @Suppress public inline suspend fun <T> suspendCoroutineOrReturn(crossinline block: (Continuation<T>) -> Any?): T defined in kotlin.coroutines.experimental.intrinsics[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'SafeContinuation' @ [91:24] ==> @PublishedApi internal constructor SafeContinuation<in T>(delegate: Continuation<T>) defined in kotlin.coroutines.experimental.SafeContinuation[ClassConstructorDescriptorImpl]
Inferred types:
    <in T> -> T

'c' @ [91:41] ==> value-parameter c: Continuation<T> defined in kotlin.coroutines.experimental.suspendCoroutine.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [92:13] ==> public abstract operator fun invoke(p1: Continuation<T>): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'safe' @ [92:19] ==> val safe: SafeContinuation<T> defined in kotlin.coroutines.experimental.suspendCoroutine.<anonymous>[LocalVariableDescriptor]

'safe' @ [93:13] ==> val safe: SafeContinuation<T> defined in kotlin.coroutines.experimental.suspendCoroutine.<anonymous>[LocalVariableDescriptor]

'getResult' @ [93:18] ==> @PublishedApi internal final fun getResult(): Any? defined in kotlin.coroutines.experimental.SafeContinuation[SimpleFunctionDescriptorImpl]

'kotlin.internal.InlineOnly' @ [98:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'invoke' @ [101:22] ==> public abstract operator fun invoke(): Any? defined in kotlin.Function0[FunctionInvokeDescriptor]

'result' @ [102:13] ==> val result: Any? defined in kotlin.coroutines.experimental.processBareContinuationResume[LocalVariableDescriptor]

'COROUTINE_SUSPENDED' @ [102:24] ==> @SinceKotlin public val COROUTINE_SUSPENDED: Any defined in kotlin.coroutines.experimental.intrinsics in file Intrinsics.kt[PropertyDescriptorImpl]

'Suppress' @ [103:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'completion' @ [104:14] ==> value-parameter completion: Continuation<*> defined in kotlin.coroutines.experimental.processBareContinuationResume[ValueParameterDescriptorImpl]

'resume' @ [104:48] ==> public abstract fun resume(value: Any?): Unit defined in kotlin.coroutines.experimental.Continuation[SimpleFunctionDescriptorImpl]

'result' @ [104:55] ==> val result: Any? defined in kotlin.coroutines.experimental.processBareContinuationResume[LocalVariableDescriptor]

'completion' @ [107:9] ==> value-parameter completion: Continuation<*> defined in kotlin.coroutines.experimental.processBareContinuationResume[ValueParameterDescriptorImpl]

'resumeWithException' @ [107:20] ==> public abstract fun resumeWithException(exception: Throwable): Unit defined in kotlin.coroutines.experimental.Continuation[SimpleFunctionDescriptorImpl]

't' @ [107:40] ==> val t: Throwable defined in kotlin.coroutines.experimental.processBareContinuationResume[LocalVariableDescriptor]

