'kotlin.jvm.JvmVersion' @ [16:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[ClassConstructorDescriptorImpl]

'PublishedApi' @ [22:1] ==> public constructor PublishedApi() defined in kotlin.PublishedApi[DeserializedClassConstructorDescriptor]

'PublishedApi' @ [29:5] ==> public constructor PublishedApi() defined in kotlin.PublishedApi[DeserializedClassConstructorDescriptor]

'this' @ [30:55] ==> internal constructor SafeContinuation<in T>(delegate: Continuation<T>, initialResult: Any?) defined in kotlin.coroutines.experimental.SafeContinuation[ClassConstructorDescriptorImpl]
Inferred types:
    <in T> -> T

'delegate' @ [30:60] ==> value-parameter delegate: Continuation<T> defined in kotlin.coroutines.experimental.SafeContinuation.<init>[ValueParameterDescriptorImpl]

'UNDECIDED' @ [30:70] ==> private final val UNDECIDED: Any? defined in kotlin.coroutines.experimental.SafeContinuation.Companion[PropertyDescriptorImpl]

'delegate' @ [33:17] ==> private final val delegate: Continuation<T> defined in kotlin.coroutines.experimental.SafeContinuation[PropertyDescriptorImpl]

'context' @ [33:26] ==> public abstract val context: CoroutineContext defined in kotlin.coroutines.experimental.Continuation[PropertyDescriptorImpl]

'Volatile' @ [35:5] ==> public constructor Volatile() defined in kotlin.jvm.Volatile[DeserializedClassConstructorDescriptor]

'initialResult' @ [36:32] ==> value-parameter initialResult: Any? defined in kotlin.coroutines.experimental.SafeContinuation.<init>[ValueParameterDescriptorImpl]

'Any' @ [39:39] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'Any' @ [40:37] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'Suppress' @ [42:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'JvmStatic' @ [43:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'newUpdater' @ [44:58] ==> public open fun <U : (Any..Any?), W : (Any..Any?)> newUpdater(p0: (Class<(SafeContinuation<*>..SafeContinuation<*>?)>..Class<(SafeContinuation<*>..SafeContinuation<*>?)>?), p1: (Class<Any?>..Class<Any?>?), p2: (String..String?)): (AtomicReferenceFieldUpdater<(SafeContinuation<*>..SafeContinuation<*>?), Any?>..AtomicReferenceFieldUpdater<(SafeContinuation<*>..SafeContinuation<*>?), Any?>?) defined in java.util.concurrent.atomic.AtomicReferenceFieldUpdater[JavaMethodDescriptor]
Inferred types:
    <U : (Any..Any?)> -> SafeContinuation<*>
    <W : (Any..Any?)> -> Any?

'SafeContinuation' @ [45:17] ==> public companion object defined in kotlin.coroutines.experimental.SafeContinuation[FakeCallableDescriptorForObject]

'java' @ [45:41] ==> public val <T> KClass<SafeContinuation<*>>.java: Class<SafeContinuation<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SafeContinuation<*>

'Any' @ [45:47] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'java' @ [45:58] ==> public val <T> KClass<Any>.java: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'this' @ [52:26] ==> <this> defined in kotlin.coroutines.experimental.SafeContinuation[LazyClassReceiverParameterDescriptor]

'result' @ [52:31] ==> @Volatile private final var result: Any? defined in kotlin.coroutines.experimental.SafeContinuation[PropertyDescriptorImpl]

'when {
                result === UNDECIDED -> if (RESULT.compareAndSet(this, UNDECIDED, value)) return
                result === COROUTINE_SUSPENDED -> if (RESULT.compareAndSet(this, COROUTINE_SUSPENDED, RESUMED)) {
                    delegate.resume(value)
                    return
                }
                else -> throw IllegalStateException("Already resumed")
            }' @ [53:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'result' @ [54:17] ==> val result: Any? defined in kotlin.coroutines.experimental.SafeContinuation.resume[LocalVariableDescriptor]

'UNDECIDED' @ [54:28] ==> private final val UNDECIDED: Any? defined in kotlin.coroutines.experimental.SafeContinuation.Companion[PropertyDescriptorImpl]

'RESULT' @ [54:45] ==> @Suppress @JvmStatic private final val RESULT: (AtomicReferenceFieldUpdater<(SafeContinuation<*>..SafeContinuation<*>?), Any?>..AtomicReferenceFieldUpdater<(SafeContinuation<*>..SafeContinuation<*>?), Any?>?) defined in kotlin.coroutines.experimental.SafeContinuation.Companion[PropertyDescriptorImpl]

'compareAndSet' @ [54:52] ==> public abstract fun compareAndSet(p0: (SafeContinuation<*>..SafeContinuation<*>?), p1: Any?, p2: Any?): Boolean defined in java.util.concurrent.atomic.AtomicReferenceFieldUpdater[JavaMethodDescriptor]

'this' @ [54:66] ==> <this> defined in kotlin.coroutines.experimental.SafeContinuation[LazyClassReceiverParameterDescriptor]

'UNDECIDED' @ [54:72] ==> private final val UNDECIDED: Any? defined in kotlin.coroutines.experimental.SafeContinuation.Companion[PropertyDescriptorImpl]

'value' @ [54:83] ==> value-parameter value: T defined in kotlin.coroutines.experimental.SafeContinuation.resume[ValueParameterDescriptorImpl]

'result' @ [55:17] ==> val result: Any? defined in kotlin.coroutines.experimental.SafeContinuation.resume[LocalVariableDescriptor]

'COROUTINE_SUSPENDED' @ [55:28] ==> @SinceKotlin public val COROUTINE_SUSPENDED: Any defined in kotlin.coroutines.experimental.intrinsics in file Intrinsics.kt[PropertyDescriptorImpl]

'RESULT' @ [55:55] ==> @Suppress @JvmStatic private final val RESULT: (AtomicReferenceFieldUpdater<(SafeContinuation<*>..SafeContinuation<*>?), Any?>..AtomicReferenceFieldUpdater<(SafeContinuation<*>..SafeContinuation<*>?), Any?>?) defined in kotlin.coroutines.experimental.SafeContinuation.Companion[PropertyDescriptorImpl]

'compareAndSet' @ [55:62] ==> public abstract fun compareAndSet(p0: (SafeContinuation<*>..SafeContinuation<*>?), p1: Any?, p2: Any?): Boolean defined in java.util.concurrent.atomic.AtomicReferenceFieldUpdater[JavaMethodDescriptor]

'this' @ [55:76] ==> <this> defined in kotlin.coroutines.experimental.SafeContinuation[LazyClassReceiverParameterDescriptor]

'COROUTINE_SUSPENDED' @ [55:82] ==> @SinceKotlin public val COROUTINE_SUSPENDED: Any defined in kotlin.coroutines.experimental.intrinsics in file Intrinsics.kt[PropertyDescriptorImpl]

'RESUMED' @ [55:103] ==> private final val RESUMED: Any? defined in kotlin.coroutines.experimental.SafeContinuation.Companion[PropertyDescriptorImpl]

'delegate' @ [56:21] ==> private final val delegate: Continuation<T> defined in kotlin.coroutines.experimental.SafeContinuation[PropertyDescriptorImpl]

'resume' @ [56:30] ==> public abstract fun resume(value: T): Unit defined in kotlin.coroutines.experimental.Continuation[SimpleFunctionDescriptorImpl]

'value' @ [56:37] ==> value-parameter value: T defined in kotlin.coroutines.experimental.SafeContinuation.resume[ValueParameterDescriptorImpl]

'IllegalStateException' @ [59:31] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'this' @ [66:26] ==> <this> defined in kotlin.coroutines.experimental.SafeContinuation[LazyClassReceiverParameterDescriptor]

'result' @ [66:31] ==> @Volatile private final var result: Any? defined in kotlin.coroutines.experimental.SafeContinuation[PropertyDescriptorImpl]

'when  {
                result === UNDECIDED -> if (RESULT.compareAndSet(this, UNDECIDED, Fail(exception))) return
                result === COROUTINE_SUSPENDED -> if (RESULT.compareAndSet(this, COROUTINE_SUSPENDED, RESUMED)) {
                    delegate.resumeWithException(exception)
                    return
                }
                else -> throw IllegalStateException("Already resumed")
            }' @ [67:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'result' @ [68:17] ==> val result: Any? defined in kotlin.coroutines.experimental.SafeContinuation.resumeWithException[LocalVariableDescriptor]

'UNDECIDED' @ [68:28] ==> private final val UNDECIDED: Any? defined in kotlin.coroutines.experimental.SafeContinuation.Companion[PropertyDescriptorImpl]

'RESULT' @ [68:45] ==> @Suppress @JvmStatic private final val RESULT: (AtomicReferenceFieldUpdater<(SafeContinuation<*>..SafeContinuation<*>?), Any?>..AtomicReferenceFieldUpdater<(SafeContinuation<*>..SafeContinuation<*>?), Any?>?) defined in kotlin.coroutines.experimental.SafeContinuation.Companion[PropertyDescriptorImpl]

'compareAndSet' @ [68:52] ==> public abstract fun compareAndSet(p0: (SafeContinuation<*>..SafeContinuation<*>?), p1: Any?, p2: Any?): Boolean defined in java.util.concurrent.atomic.AtomicReferenceFieldUpdater[JavaMethodDescriptor]

'this' @ [68:66] ==> <this> defined in kotlin.coroutines.experimental.SafeContinuation[LazyClassReceiverParameterDescriptor]

'UNDECIDED' @ [68:72] ==> private final val UNDECIDED: Any? defined in kotlin.coroutines.experimental.SafeContinuation.Companion[PropertyDescriptorImpl]

'Fail' @ [68:83] ==> public constructor Fail(exception: Throwable) defined in kotlin.coroutines.experimental.SafeContinuation.Fail[ClassConstructorDescriptorImpl]

'exception' @ [68:88] ==> value-parameter exception: Throwable defined in kotlin.coroutines.experimental.SafeContinuation.resumeWithException[ValueParameterDescriptorImpl]

'result' @ [69:17] ==> val result: Any? defined in kotlin.coroutines.experimental.SafeContinuation.resumeWithException[LocalVariableDescriptor]

'COROUTINE_SUSPENDED' @ [69:28] ==> @SinceKotlin public val COROUTINE_SUSPENDED: Any defined in kotlin.coroutines.experimental.intrinsics in file Intrinsics.kt[PropertyDescriptorImpl]

'RESULT' @ [69:55] ==> @Suppress @JvmStatic private final val RESULT: (AtomicReferenceFieldUpdater<(SafeContinuation<*>..SafeContinuation<*>?), Any?>..AtomicReferenceFieldUpdater<(SafeContinuation<*>..SafeContinuation<*>?), Any?>?) defined in kotlin.coroutines.experimental.SafeContinuation.Companion[PropertyDescriptorImpl]

'compareAndSet' @ [69:62] ==> public abstract fun compareAndSet(p0: (SafeContinuation<*>..SafeContinuation<*>?), p1: Any?, p2: Any?): Boolean defined in java.util.concurrent.atomic.AtomicReferenceFieldUpdater[JavaMethodDescriptor]

'this' @ [69:76] ==> <this> defined in kotlin.coroutines.experimental.SafeContinuation[LazyClassReceiverParameterDescriptor]

'COROUTINE_SUSPENDED' @ [69:82] ==> @SinceKotlin public val COROUTINE_SUSPENDED: Any defined in kotlin.coroutines.experimental.intrinsics in file Intrinsics.kt[PropertyDescriptorImpl]

'RESUMED' @ [69:103] ==> private final val RESUMED: Any? defined in kotlin.coroutines.experimental.SafeContinuation.Companion[PropertyDescriptorImpl]

'delegate' @ [70:21] ==> private final val delegate: Continuation<T> defined in kotlin.coroutines.experimental.SafeContinuation[PropertyDescriptorImpl]

'resumeWithException' @ [70:30] ==> public abstract fun resumeWithException(exception: Throwable): Unit defined in kotlin.coroutines.experimental.Continuation[SimpleFunctionDescriptorImpl]

'exception' @ [70:50] ==> value-parameter exception: Throwable defined in kotlin.coroutines.experimental.SafeContinuation.resumeWithException[ValueParameterDescriptorImpl]

'IllegalStateException' @ [73:31] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'PublishedApi' @ [78:5] ==> public constructor PublishedApi() defined in kotlin.PublishedApi[DeserializedClassConstructorDescriptor]

'this' @ [80:22] ==> <this> defined in kotlin.coroutines.experimental.SafeContinuation[LazyClassReceiverParameterDescriptor]

'result' @ [80:27] ==> @Volatile private final var result: Any? defined in kotlin.coroutines.experimental.SafeContinuation[PropertyDescriptorImpl]

'result' @ [81:13] ==> var result: Any? defined in kotlin.coroutines.experimental.SafeContinuation.getResult[LocalVariableDescriptor]

'UNDECIDED' @ [81:24] ==> private final val UNDECIDED: Any? defined in kotlin.coroutines.experimental.SafeContinuation.Companion[PropertyDescriptorImpl]

'RESULT' @ [82:17] ==> @Suppress @JvmStatic private final val RESULT: (AtomicReferenceFieldUpdater<(SafeContinuation<*>..SafeContinuation<*>?), Any?>..AtomicReferenceFieldUpdater<(SafeContinuation<*>..SafeContinuation<*>?), Any?>?) defined in kotlin.coroutines.experimental.SafeContinuation.Companion[PropertyDescriptorImpl]

'compareAndSet' @ [82:24] ==> public abstract fun compareAndSet(p0: (SafeContinuation<*>..SafeContinuation<*>?), p1: Any?, p2: Any?): Boolean defined in java.util.concurrent.atomic.AtomicReferenceFieldUpdater[JavaMethodDescriptor]

'this' @ [82:38] ==> <this> defined in kotlin.coroutines.experimental.SafeContinuation[LazyClassReceiverParameterDescriptor]

'UNDECIDED' @ [82:44] ==> private final val UNDECIDED: Any? defined in kotlin.coroutines.experimental.SafeContinuation.Companion[PropertyDescriptorImpl]

'COROUTINE_SUSPENDED' @ [82:55] ==> @SinceKotlin public val COROUTINE_SUSPENDED: Any defined in kotlin.coroutines.experimental.intrinsics in file Intrinsics.kt[PropertyDescriptorImpl]

'COROUTINE_SUSPENDED' @ [82:84] ==> @SinceKotlin public val COROUTINE_SUSPENDED: Any defined in kotlin.coroutines.experimental.intrinsics in file Intrinsics.kt[PropertyDescriptorImpl]

'result' @ [83:13] ==> var result: Any? defined in kotlin.coroutines.experimental.SafeContinuation.getResult[LocalVariableDescriptor]

'this' @ [83:22] ==> <this> defined in kotlin.coroutines.experimental.SafeContinuation[LazyClassReceiverParameterDescriptor]

'result' @ [83:27] ==> @Volatile private final var result: Any? defined in kotlin.coroutines.experimental.SafeContinuation[PropertyDescriptorImpl]

'when {
            result === RESUMED -> return COROUTINE_SUSPENDED // already called continuation, indicate COROUTINE_SUSPENDED upstream
            result is Fail -> throw result.exception
            else -> return result // either COROUTINE_SUSPENDED or data
        }' @ [85:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'result' @ [86:13] ==> var result: Any? defined in kotlin.coroutines.experimental.SafeContinuation.getResult[LocalVariableDescriptor]

'RESUMED' @ [86:24] ==> private final val RESUMED: Any? defined in kotlin.coroutines.experimental.SafeContinuation.Companion[PropertyDescriptorImpl]

'COROUTINE_SUSPENDED' @ [86:42] ==> @SinceKotlin public val COROUTINE_SUSPENDED: Any defined in kotlin.coroutines.experimental.intrinsics in file Intrinsics.kt[PropertyDescriptorImpl]

'result' @ [87:13] ==> var result: Any? defined in kotlin.coroutines.experimental.SafeContinuation.getResult[LocalVariableDescriptor]

'result' @ [87:37] ==> var result: Any? defined in kotlin.coroutines.experimental.SafeContinuation.getResult[LocalVariableDescriptor]

'exception' @ [87:44] ==> public final val exception: Throwable defined in kotlin.coroutines.experimental.SafeContinuation.Fail[PropertyDescriptorImpl]

'result' @ [88:28] ==> var result: Any? defined in kotlin.coroutines.experimental.SafeContinuation.getResult[LocalVariableDescriptor]

