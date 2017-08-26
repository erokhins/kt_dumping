'JsName' @ [20:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'resultContinuation' @ [28:53] ==> private final val resultContinuation: Continuation<Any?> defined in kotlin.coroutines.experimental.CoroutineImpl[PropertyDescriptorImpl]

'context' @ [28:72] ==> public abstract val context: CoroutineContext defined in kotlin.coroutines.experimental.Continuation[PropertyDescriptorImpl]

'context' @ [30:38] ==> public open val context: CoroutineContext defined in kotlin.coroutines.experimental.CoroutineImpl[PropertyDescriptorImpl]

'ContinuationInterceptor' @ [30:46] ==> public companion object Key : CoroutineContext.Key<ContinuationInterceptor> defined in kotlin.coroutines.experimental.ContinuationInterceptor[FakeCallableDescriptorForObject]

'interceptContinuation' @ [30:72] ==> public abstract fun <T> interceptContinuation(continuation: Continuation<Any?>): Continuation<Any?> defined in kotlin.coroutines.experimental.ContinuationInterceptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any?

'this' @ [30:94] ==> <this> defined in kotlin.coroutines.experimental.CoroutineImpl[LazyClassReceiverParameterDescriptor]

'this' @ [30:103] ==> <this> defined in kotlin.coroutines.experimental.CoroutineImpl[LazyClassReceiverParameterDescriptor]

'result' @ [33:9] ==> protected final var result: Any? defined in kotlin.coroutines.experimental.CoroutineImpl[PropertyDescriptorImpl]

'value' @ [33:18] ==> value-parameter value: Any? defined in kotlin.coroutines.experimental.CoroutineImpl.resume[ValueParameterDescriptorImpl]

'doResumeWrapper' @ [34:9] ==> protected final fun doResumeWrapper(): Unit defined in kotlin.coroutines.experimental.CoroutineImpl[SimpleFunctionDescriptorImpl]

'state' @ [38:9] ==> protected final var state: Int defined in kotlin.coroutines.experimental.CoroutineImpl[PropertyDescriptorImpl]

'exceptionState' @ [38:17] ==> protected final var exceptionState: Int defined in kotlin.coroutines.experimental.CoroutineImpl[PropertyDescriptorImpl]

'this' @ [39:9] ==> <this> defined in kotlin.coroutines.experimental.CoroutineImpl[LazyClassReceiverParameterDescriptor]

'exception' @ [39:14] ==> protected final var exception: Throwable? defined in kotlin.coroutines.experimental.CoroutineImpl[PropertyDescriptorImpl]

'exception' @ [39:26] ==> value-parameter exception: Throwable defined in kotlin.coroutines.experimental.CoroutineImpl.resumeWithException[ValueParameterDescriptorImpl]

'doResumeWrapper' @ [40:9] ==> protected final fun doResumeWrapper(): Unit defined in kotlin.coroutines.experimental.CoroutineImpl[SimpleFunctionDescriptorImpl]

'processBareContinuationResume' @ [44:9] ==> @InlineOnly internal inline fun processBareContinuationResume(completion: Continuation<*>, block: () -> Any?): Unit defined in kotlin.coroutines.experimental in file CoroutinesLibrary.kt[SimpleFunctionDescriptorImpl]

'resultContinuation' @ [44:39] ==> private final val resultContinuation: Continuation<Any?> defined in kotlin.coroutines.experimental.CoroutineImpl[PropertyDescriptorImpl]

'doResume' @ [44:61] ==> protected abstract fun doResume(): Any? defined in kotlin.coroutines.experimental.CoroutineImpl[SimpleFunctionDescriptorImpl]

'Any' @ [50:31] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'Any' @ [51:29] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'PublishedApi' @ [54:1] ==> public constructor PublishedApi() defined in kotlin.PublishedApi[DeserializedClassConstructorDescriptor]

'PublishedApi' @ [61:5] ==> public constructor PublishedApi() defined in kotlin.PublishedApi[DeserializedClassConstructorDescriptor]

'this' @ [62:55] ==> internal constructor SafeContinuation<in T>(delegate: Continuation<T>, initialResult: Any?) defined in kotlin.coroutines.experimental.SafeContinuation[ClassConstructorDescriptorImpl]
Inferred types:
    <in T> -> T

'delegate' @ [62:60] ==> value-parameter delegate: Continuation<T> defined in kotlin.coroutines.experimental.SafeContinuation.<init>[ValueParameterDescriptorImpl]

'UNDECIDED' @ [62:70] ==> private val UNDECIDED: Any? defined in kotlin.coroutines.experimental in file coroutines.kt[PropertyDescriptorImpl]

'delegate' @ [65:17] ==> private final val delegate: Continuation<T> defined in kotlin.coroutines.experimental.SafeContinuation[PropertyDescriptorImpl]

'context' @ [65:26] ==> public abstract val context: CoroutineContext defined in kotlin.coroutines.experimental.Continuation[PropertyDescriptorImpl]

'initialResult' @ [67:32] ==> value-parameter initialResult: Any? defined in kotlin.coroutines.experimental.SafeContinuation.<init>[ValueParameterDescriptorImpl]

'when {
            result === UNDECIDED -> {
                result = value
            }
            result === COROUTINE_SUSPENDED -> {
                result = RESUMED
                delegate.resume(value)
            }
            else -> {
                throw IllegalStateException("Already resumed")
            }
        }' @ [70:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'result' @ [71:13] ==> private final var result: Any? defined in kotlin.coroutines.experimental.SafeContinuation[PropertyDescriptorImpl]

'UNDECIDED' @ [71:24] ==> private val UNDECIDED: Any? defined in kotlin.coroutines.experimental in file coroutines.kt[PropertyDescriptorImpl]

'result' @ [72:17] ==> private final var result: Any? defined in kotlin.coroutines.experimental.SafeContinuation[PropertyDescriptorImpl]

'value' @ [72:26] ==> value-parameter value: T defined in kotlin.coroutines.experimental.SafeContinuation.resume[ValueParameterDescriptorImpl]

'result' @ [74:13] ==> private final var result: Any? defined in kotlin.coroutines.experimental.SafeContinuation[PropertyDescriptorImpl]

'COROUTINE_SUSPENDED' @ [74:24] ==> @SinceKotlin public val COROUTINE_SUSPENDED: Any defined in kotlin.coroutines.experimental.intrinsics in file Intrinsics.kt[PropertyDescriptorImpl]

'result' @ [75:17] ==> private final var result: Any? defined in kotlin.coroutines.experimental.SafeContinuation[PropertyDescriptorImpl]

'RESUMED' @ [75:26] ==> private val RESUMED: Any? defined in kotlin.coroutines.experimental in file coroutines.kt[PropertyDescriptorImpl]

'delegate' @ [76:17] ==> private final val delegate: Continuation<T> defined in kotlin.coroutines.experimental.SafeContinuation[PropertyDescriptorImpl]

'resume' @ [76:26] ==> public abstract fun resume(value: T): Unit defined in kotlin.coroutines.experimental.Continuation[SimpleFunctionDescriptorImpl]

'value' @ [76:33] ==> value-parameter value: T defined in kotlin.coroutines.experimental.SafeContinuation.resume[ValueParameterDescriptorImpl]

'IllegalStateException' @ [79:23] ==> public constructor IllegalStateException(message: String? = ...) defined in kotlin.IllegalStateException[ClassConstructorDescriptorImpl]

'when {
            result === UNDECIDED -> {
                result = Fail(exception)
            }
            result === COROUTINE_SUSPENDED -> {
                result = RESUMED
                delegate.resumeWithException(exception)
            }
            else -> {
                throw IllegalStateException("Already resumed")
            }
        }' @ [85:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'result' @ [86:13] ==> private final var result: Any? defined in kotlin.coroutines.experimental.SafeContinuation[PropertyDescriptorImpl]

'UNDECIDED' @ [86:24] ==> private val UNDECIDED: Any? defined in kotlin.coroutines.experimental in file coroutines.kt[PropertyDescriptorImpl]

'result' @ [87:17] ==> private final var result: Any? defined in kotlin.coroutines.experimental.SafeContinuation[PropertyDescriptorImpl]

'Fail' @ [87:26] ==> public constructor Fail(exception: Throwable) defined in kotlin.coroutines.experimental.Fail[ClassConstructorDescriptorImpl]

'exception' @ [87:31] ==> value-parameter exception: Throwable defined in kotlin.coroutines.experimental.SafeContinuation.resumeWithException[ValueParameterDescriptorImpl]

'result' @ [89:13] ==> private final var result: Any? defined in kotlin.coroutines.experimental.SafeContinuation[PropertyDescriptorImpl]

'COROUTINE_SUSPENDED' @ [89:24] ==> @SinceKotlin public val COROUTINE_SUSPENDED: Any defined in kotlin.coroutines.experimental.intrinsics in file Intrinsics.kt[PropertyDescriptorImpl]

'result' @ [90:17] ==> private final var result: Any? defined in kotlin.coroutines.experimental.SafeContinuation[PropertyDescriptorImpl]

'RESUMED' @ [90:26] ==> private val RESUMED: Any? defined in kotlin.coroutines.experimental in file coroutines.kt[PropertyDescriptorImpl]

'delegate' @ [91:17] ==> private final val delegate: Continuation<T> defined in kotlin.coroutines.experimental.SafeContinuation[PropertyDescriptorImpl]

'resumeWithException' @ [91:26] ==> public abstract fun resumeWithException(exception: Throwable): Unit defined in kotlin.coroutines.experimental.Continuation[SimpleFunctionDescriptorImpl]

'exception' @ [91:46] ==> value-parameter exception: Throwable defined in kotlin.coroutines.experimental.SafeContinuation.resumeWithException[ValueParameterDescriptorImpl]

'IllegalStateException' @ [94:23] ==> public constructor IllegalStateException(message: String? = ...) defined in kotlin.IllegalStateException[ClassConstructorDescriptorImpl]

'PublishedApi' @ [99:5] ==> public constructor PublishedApi() defined in kotlin.PublishedApi[DeserializedClassConstructorDescriptor]

'result' @ [101:13] ==> private final var result: Any? defined in kotlin.coroutines.experimental.SafeContinuation[PropertyDescriptorImpl]

'UNDECIDED' @ [101:24] ==> private val UNDECIDED: Any? defined in kotlin.coroutines.experimental in file coroutines.kt[PropertyDescriptorImpl]

'result' @ [102:13] ==> private final var result: Any? defined in kotlin.coroutines.experimental.SafeContinuation[PropertyDescriptorImpl]

'COROUTINE_SUSPENDED' @ [102:22] ==> @SinceKotlin public val COROUTINE_SUSPENDED: Any defined in kotlin.coroutines.experimental.intrinsics in file Intrinsics.kt[PropertyDescriptorImpl]

'this' @ [104:22] ==> <this> defined in kotlin.coroutines.experimental.SafeContinuation[LazyClassReceiverParameterDescriptor]

'result' @ [104:27] ==> private final var result: Any? defined in kotlin.coroutines.experimental.SafeContinuation[PropertyDescriptorImpl]

'when {
            result === RESUMED -> {
                COROUTINE_SUSPENDED // already called continuation, indicate SUSPENDED upstream
            }
            result is Fail -> {
                throw result.exception
            }
            else -> {
                result // either SUSPENDED or data
            }
        }' @ [105:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?, entry2: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'result' @ [106:13] ==> val result: Any? defined in kotlin.coroutines.experimental.SafeContinuation.getResult[LocalVariableDescriptor]

'RESUMED' @ [106:24] ==> private val RESUMED: Any? defined in kotlin.coroutines.experimental in file coroutines.kt[PropertyDescriptorImpl]

'COROUTINE_SUSPENDED' @ [107:17] ==> @SinceKotlin public val COROUTINE_SUSPENDED: Any defined in kotlin.coroutines.experimental.intrinsics in file Intrinsics.kt[PropertyDescriptorImpl]

'result' @ [109:13] ==> val result: Any? defined in kotlin.coroutines.experimental.SafeContinuation.getResult[LocalVariableDescriptor]

'result' @ [110:23] ==> val result: Any? defined in kotlin.coroutines.experimental.SafeContinuation.getResult[LocalVariableDescriptor]

'exception' @ [110:30] ==> public final val exception: Throwable defined in kotlin.coroutines.experimental.Fail[PropertyDescriptorImpl]

'result' @ [113:17] ==> val result: Any? defined in kotlin.coroutines.experimental.SafeContinuation.getResult[LocalVariableDescriptor]

