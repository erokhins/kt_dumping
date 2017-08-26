'kotlin.jvm.JvmName' @ [17:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'SinceKotlin' @ [42:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'kotlin.internal.InlineOnly' @ [43:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'Suppress' @ [44:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'NotImplementedError' @ [46:15] ==> public constructor NotImplementedError(message: String = ...) defined in kotlin.NotImplementedError[ClassConstructorDescriptorImpl]

'SinceKotlin' @ [52:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'Any' @ [53:39] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'SinceKotlin' @ [67:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'kotlin.jvm.JvmVersion' @ [68:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[ClassConstructorDescriptorImpl]

'if (this !is kotlin.coroutines.experimental.jvm.internal.CoroutineImpl)
            buildContinuationByInvokeCall(completion) {
                @Suppress("UNCHECKED_CAST")
                (this as Function1<Continuation<T>, Any?>).invoke(completion)
            }
        else
            (this.create(completion) as kotlin.coroutines.experimental.jvm.internal.CoroutineImpl).facade' @ [72:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Continuation<Unit>, elseBranch: Continuation<Unit>): Continuation<Unit>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Continuation<Unit>

'this' @ [72:13] ==> <this> defined in kotlin.coroutines.experimental.intrinsics.createCoroutineUnchecked[ReceiverParameterDescriptorImpl]

'buildContinuationByInvokeCall' @ [73:13] ==> @JvmVersion private inline fun <T> buildContinuationByInvokeCall(completion: Continuation<T>, crossinline block: () -> Any?): Continuation<Unit> defined in kotlin.coroutines.experimental.intrinsics[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'completion' @ [73:43] ==> value-parameter completion: Continuation<T> defined in kotlin.coroutines.experimental.intrinsics.createCoroutineUnchecked[ValueParameterDescriptorImpl]

'Suppress' @ [74:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'this' @ [75:18] ==> <this> defined in kotlin.coroutines.experimental.intrinsics.createCoroutineUnchecked[ReceiverParameterDescriptorImpl]

'invoke' @ [75:60] ==> public abstract operator fun invoke(p1: Continuation<T>): Any? defined in kotlin.Function1[FunctionInvokeDescriptor]

'completion' @ [75:67] ==> value-parameter completion: Continuation<T> defined in kotlin.coroutines.experimental.intrinsics.createCoroutineUnchecked[ValueParameterDescriptorImpl]

'this' @ [78:14] ==> <this> defined in kotlin.coroutines.experimental.intrinsics.createCoroutineUnchecked[ReceiverParameterDescriptorImpl]

'create' @ [78:19] ==> public open fun create(completion: Continuation<*>): Continuation<Unit> defined in kotlin.coroutines.experimental.jvm.internal.CoroutineImpl[SimpleFunctionDescriptorImpl]

'completion' @ [78:26] ==> value-parameter completion: Continuation<T> defined in kotlin.coroutines.experimental.intrinsics.createCoroutineUnchecked[ValueParameterDescriptorImpl]

'facade' @ [78:100] ==> public final val facade: Continuation<Any?> defined in kotlin.coroutines.experimental.jvm.internal.CoroutineImpl[PropertyDescriptorImpl]

'SinceKotlin' @ [90:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'kotlin.jvm.JvmVersion' @ [91:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[ClassConstructorDescriptorImpl]

'if (this !is kotlin.coroutines.experimental.jvm.internal.CoroutineImpl)
            buildContinuationByInvokeCall(completion) {
                @Suppress("UNCHECKED_CAST")
                (this as Function2<R, Continuation<T>, Any?>).invoke(receiver, completion)
            }
        else
            (this.create(receiver, completion) as kotlin.coroutines.experimental.jvm.internal.CoroutineImpl).facade' @ [96:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Continuation<Unit>, elseBranch: Continuation<Unit>): Continuation<Unit>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Continuation<Unit>

'this' @ [96:13] ==> <this> defined in kotlin.coroutines.experimental.intrinsics.createCoroutineUnchecked[ReceiverParameterDescriptorImpl]

'buildContinuationByInvokeCall' @ [97:13] ==> @JvmVersion private inline fun <T> buildContinuationByInvokeCall(completion: Continuation<T>, crossinline block: () -> Any?): Continuation<Unit> defined in kotlin.coroutines.experimental.intrinsics[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'completion' @ [97:43] ==> value-parameter completion: Continuation<T> defined in kotlin.coroutines.experimental.intrinsics.createCoroutineUnchecked[ValueParameterDescriptorImpl]

'Suppress' @ [98:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'this' @ [99:18] ==> <this> defined in kotlin.coroutines.experimental.intrinsics.createCoroutineUnchecked[ReceiverParameterDescriptorImpl]

'invoke' @ [99:63] ==> public abstract operator fun invoke(p1: R, p2: Continuation<T>): Any? defined in kotlin.Function2[FunctionInvokeDescriptor]

'receiver' @ [99:70] ==> value-parameter receiver: R defined in kotlin.coroutines.experimental.intrinsics.createCoroutineUnchecked[ValueParameterDescriptorImpl]

'completion' @ [99:80] ==> value-parameter completion: Continuation<T> defined in kotlin.coroutines.experimental.intrinsics.createCoroutineUnchecked[ValueParameterDescriptorImpl]

'this' @ [102:14] ==> <this> defined in kotlin.coroutines.experimental.intrinsics.createCoroutineUnchecked[ReceiverParameterDescriptorImpl]

'create' @ [102:19] ==> public open fun create(value: Any?, completion: Continuation<*>): Continuation<Unit> defined in kotlin.coroutines.experimental.jvm.internal.CoroutineImpl[SimpleFunctionDescriptorImpl]

'receiver' @ [102:26] ==> value-parameter receiver: R defined in kotlin.coroutines.experimental.intrinsics.createCoroutineUnchecked[ValueParameterDescriptorImpl]

'completion' @ [102:36] ==> value-parameter completion: Continuation<T> defined in kotlin.coroutines.experimental.intrinsics.createCoroutineUnchecked[ValueParameterDescriptorImpl]

'facade' @ [102:110] ==> public final val facade: Continuation<Any?> defined in kotlin.coroutines.experimental.jvm.internal.CoroutineImpl[PropertyDescriptorImpl]

'kotlin.jvm.JvmVersion' @ [106:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[ClassConstructorDescriptorImpl]

'completion' @ [114:29] ==> value-parameter completion: Continuation<T> defined in kotlin.coroutines.experimental.intrinsics.buildContinuationByInvokeCall[ValueParameterDescriptorImpl]

'context' @ [114:40] ==> public abstract val context: CoroutineContext defined in kotlin.coroutines.experimental.Continuation[PropertyDescriptorImpl]

'processBareContinuationResume' @ [117:21] ==> @InlineOnly internal inline fun processBareContinuationResume(completion: Continuation<*>, block: () -> Any?): Unit defined in kotlin.coroutines.experimental in file CoroutinesLibrary.kt[SimpleFunctionDescriptorImpl]

'completion' @ [117:51] ==> value-parameter completion: Continuation<T> defined in kotlin.coroutines.experimental.intrinsics.buildContinuationByInvokeCall[ValueParameterDescriptorImpl]

'block' @ [117:63] ==> value-parameter crossinline block: () -> Any? defined in kotlin.coroutines.experimental.intrinsics.buildContinuationByInvokeCall[ValueParameterDescriptorImpl]

'completion' @ [121:21] ==> value-parameter completion: Continuation<T> defined in kotlin.coroutines.experimental.intrinsics.buildContinuationByInvokeCall[ValueParameterDescriptorImpl]

'resumeWithException' @ [121:32] ==> public abstract fun resumeWithException(exception: Throwable): Unit defined in kotlin.coroutines.experimental.Continuation[SimpleFunctionDescriptorImpl]

'exception' @ [121:52] ==> value-parameter exception: Throwable defined in kotlin.coroutines.experimental.intrinsics.buildContinuationByInvokeCall.<no name provided>.resumeWithException[ValueParameterDescriptorImpl]

'interceptContinuationIfNeeded' @ [125:56] ==> internal fun <T> interceptContinuationIfNeeded(context: CoroutineContext, continuation: Continuation<Unit>): Continuation<Unit> defined in kotlin.coroutines.experimental.jvm.internal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'completion' @ [125:86] ==> value-parameter completion: Continuation<T> defined in kotlin.coroutines.experimental.intrinsics.buildContinuationByInvokeCall[ValueParameterDescriptorImpl]

'context' @ [125:97] ==> public abstract val context: CoroutineContext defined in kotlin.coroutines.experimental.Continuation[PropertyDescriptorImpl]

'continuation' @ [125:106] ==> val continuation: <no name provided><T> defined in kotlin.coroutines.experimental.intrinsics.buildContinuationByInvokeCall[LocalVariableDescriptor]

