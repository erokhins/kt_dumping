'toNanos' @ [28:64] ==> public open fun toNanos(p0: Long): Long defined in java.util.concurrent.TimeUnit[JavaMethodDescriptor]

'DummyProfiler' @ [30:114] ==> public constructor DummyProfiler() defined in org.jetbrains.kotlin.daemon.common.DummyProfiler[DeserializedClassConstructorDescriptor]

'lazy' @ [32:24] ==> public fun <T> lazy(initializer: () -> (Logger..Logger?)): Lazy<(Logger..Logger?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.util.logging.Logger..java.util.logging.Logger?)

'getLogger' @ [32:38] ==> @CallerSensitive public open fun getLogger(p0: (String..String?)): (Logger..Logger?) defined in java.util.logging.Logger[JavaMethodDescriptor]

'Volatile' @ [34:5] ==> public constructor Volatile() defined in kotlin.jvm.Volatile[DeserializedClassConstructorDescriptor]

'nanoTime' @ [34:46] ==> public open fun nanoTime(): Long defined in java.lang.System[JavaMethodDescriptor]

'log' @ [39:13] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.RemoteCompilationCanceledStatusClient[PropertyDescriptorImpl]

'warning' @ [39:17] ==> public open fun warning(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'e' @ [39:90] ==> value-parameter e: Exception /* = Exception */ defined in org.jetbrains.kotlin.daemon.RemoteCompilationCanceledStatusClient.checkCanceled.cancelOnError[ValueParameterDescriptorImpl]

'message' @ [39:92] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'CompilationCanceledException' @ [40:19] ==> public constructor CompilationCanceledException() defined in org.jetbrains.kotlin.progress.CompilationCanceledException[DeserializedClassConstructorDescriptor]

'nanoTime' @ [43:31] ==> public open fun nanoTime(): Long defined in java.lang.System[JavaMethodDescriptor]

'curNanos' @ [44:13] ==> val curNanos: Long defined in org.jetbrains.kotlin.daemon.RemoteCompilationCanceledStatusClient.checkCanceled[LocalVariableDescriptor]

'lastChecked' @ [44:24] ==> @Volatile public final var lastChecked: Long defined in org.jetbrains.kotlin.daemon.RemoteCompilationCanceledStatusClient[PropertyDescriptorImpl]

'CANCELED_STATUS_CHECK_THRESHOLD_NS' @ [44:38] ==> public val CANCELED_STATUS_CHECK_THRESHOLD_NS: Long defined in org.jetbrains.kotlin.daemon in file RemoteCompilationCanceledStatusClient.kt[PropertyDescriptorImpl]

'profiler' @ [45:13] ==> public final val profiler: Profiler defined in org.jetbrains.kotlin.daemon.RemoteCompilationCanceledStatusClient[PropertyDescriptorImpl]

'withMeasure' @ [45:22] ==> public abstract fun <R> withMeasure(obj: Any?, body: () -> Any?): Any? defined in org.jetbrains.kotlin.daemon.common.Profiler[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Any?

'this' @ [45:34] ==> <this> defined in org.jetbrains.kotlin.daemon.RemoteCompilationCanceledStatusClient[LazyClassReceiverParameterDescriptor]

'facade' @ [47:21] ==> public final val facade: CompilerCallbackServicesFacade defined in org.jetbrains.kotlin.daemon.RemoteCompilationCanceledStatusClient[PropertyDescriptorImpl]

'compilationCanceledStatus_checkCanceled' @ [47:28] ==> public abstract fun compilationCanceledStatus_checkCanceled(): Void? defined in org.jetbrains.kotlin.daemon.common.CompilerCallbackServicesFacade[DeserializedSimpleFunctionDescriptor]

'CompilationCanceledException' @ [50:27] ==> public constructor CompilationCanceledException() defined in org.jetbrains.kotlin.progress.CompilationCanceledException[DeserializedClassConstructorDescriptor]

'cancelOnError' @ [53:21] ==> local final fun cancelOnError(e: Exception /* = Exception */): Unit defined in org.jetbrains.kotlin.daemon.RemoteCompilationCanceledStatusClient.checkCanceled[SimpleFunctionDescriptorImpl]

'e' @ [53:35] ==> val e: ConnectIOException defined in org.jetbrains.kotlin.daemon.RemoteCompilationCanceledStatusClient.checkCanceled.<anonymous>[LocalVariableDescriptor]

'cancelOnError' @ [56:21] ==> local final fun cancelOnError(e: Exception /* = Exception */): Unit defined in org.jetbrains.kotlin.daemon.RemoteCompilationCanceledStatusClient.checkCanceled[SimpleFunctionDescriptorImpl]

'e' @ [56:35] ==> val e: ConnectException defined in org.jetbrains.kotlin.daemon.RemoteCompilationCanceledStatusClient.checkCanceled.<anonymous>[LocalVariableDescriptor]

'cancelOnError' @ [60:21] ==> local final fun cancelOnError(e: Exception /* = Exception */): Unit defined in org.jetbrains.kotlin.daemon.RemoteCompilationCanceledStatusClient.checkCanceled[SimpleFunctionDescriptorImpl]

'e' @ [60:35] ==> val e: NoSuchObjectException defined in org.jetbrains.kotlin.daemon.RemoteCompilationCanceledStatusClient.checkCanceled.<anonymous>[LocalVariableDescriptor]

'cancelOnError' @ [63:21] ==> local final fun cancelOnError(e: Exception /* = Exception */): Unit defined in org.jetbrains.kotlin.daemon.RemoteCompilationCanceledStatusClient.checkCanceled[SimpleFunctionDescriptorImpl]

'e' @ [63:35] ==> val e: UnmarshalException defined in org.jetbrains.kotlin.daemon.RemoteCompilationCanceledStatusClient.checkCanceled.<anonymous>[LocalVariableDescriptor]

'lastChecked' @ [66:13] ==> @Volatile public final var lastChecked: Long defined in org.jetbrains.kotlin.daemon.RemoteCompilationCanceledStatusClient[PropertyDescriptorImpl]

'curNanos' @ [66:27] ==> val curNanos: Long defined in org.jetbrains.kotlin.daemon.RemoteCompilationCanceledStatusClient.checkCanceled[LocalVariableDescriptor]

