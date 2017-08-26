'getOrThrow' @ [14:9] ==> public fun <V> Future<V>.getOrThrow(timeout: Duration? = ...): V defined in net.corda.core.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <V> -> V

'invoke' @ [16:16] ==> public abstract operator fun invoke(p1: Throwable): W defined in kotlin.Function1[FunctionInvokeDescriptor]

't' @ [16:24] ==> val t: Throwable defined in net.corda.core.concurrent.match[LocalVariableDescriptor]

'invoke' @ [18:12] ==> public abstract operator fun invoke(p1: V): W defined in kotlin.Function1[FunctionInvokeDescriptor]

'value' @ [18:20] ==> val value: V defined in net.corda.core.concurrent.match[LocalVariableDescriptor]

'firstOf' @ [26:94] ==> internal fun <V, W> firstOf(futures: Array<out CordaFuture<out V>>, log: Logger, handler: (CordaFuture<out V>) -> W): CordaFuture<W> defined in net.corda.core.concurrent[SimpleFunctionDescriptorImpl]
Inferred types:
    <V> -> V
    <W> -> W

'futures' @ [26:108] ==> value-parameter vararg futures: CordaFuture<out V> defined in net.corda.core.concurrent.firstOf[ValueParameterDescriptorImpl]

'defaultLog' @ [26:117] ==> private val defaultLog: (Logger..Logger?) defined in net.corda.core.concurrent in file ConcurrencyUtils.kt[PropertyDescriptorImpl]

'invoke' @ [26:131] ==> public abstract operator fun invoke(p1: CordaFuture<out V>): W defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [26:139] ==> value-parameter it: CordaFuture<out V> defined in net.corda.core.concurrent.firstOf.<anonymous>[ValueParameterDescriptorImpl]

'getLogger' @ [28:40] ==> public open fun getLogger(p0: (String..String?)): (Logger..Logger?) defined in org.slf4j.LoggerFactory[JavaMethodDescriptor]

'VisibleForTesting' @ [29:1] ==> public constructor VisibleForTesting() defined in net.corda.core.internal.VisibleForTesting[ClassConstructorDescriptorImpl]

'openFuture' @ [33:24] ==> public fun <V> openFuture(): OpenFuture<W> defined in net.corda.core.internal.concurrent[SimpleFunctionDescriptorImpl]
Inferred types:
    <V> -> W

'AtomicBoolean' @ [34:24] ==> public constructor AtomicBoolean() defined in java.util.concurrent.atomic.AtomicBoolean[JavaClassConstructorDescriptor]

'futures' @ [35:5] ==> value-parameter futures: Array<out CordaFuture<out V>> defined in net.corda.core.concurrent.firstOf[ValueParameterDescriptorImpl]

'forEach' @ [35:13] ==> public inline fun <T> Array<out CordaFuture<out V>>.forEach(action: (CordaFuture<out V>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaFuture<out V>

'it' @ [36:9] ==> value-parameter it: CordaFuture<out V> defined in net.corda.core.concurrent.firstOf.<anonymous>[ValueParameterDescriptorImpl]

'then' @ [36:12] ==> public abstract fun <W> then(callback: (Nothing) -> Any): Unit defined in net.corda.core.concurrent.CordaFuture[SimpleFunctionDescriptorImpl]
Inferred types:
    <W> -> Any

'if (winnerChosen.compareAndSet(false, true)) {
                resultFuture.capture { handler(it) }
            } else if (it.isCancelled) {
                // Do nothing.
            } else {
                it.match({}, { log.error(shortCircuitedTaskFailedMessage, it) })
            }' @ [37:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'winnerChosen' @ [37:17] ==> val winnerChosen: AtomicBoolean defined in net.corda.core.concurrent.firstOf[LocalVariableDescriptor]

'compareAndSet' @ [37:30] ==> public final fun compareAndSet(p0: Boolean, p1: Boolean): Boolean defined in java.util.concurrent.atomic.AtomicBoolean[JavaMethodDescriptor]

'resultFuture' @ [38:17] ==> val resultFuture: OpenFuture<W> defined in net.corda.core.concurrent.firstOf[LocalVariableDescriptor]

'capture' @ [38:30] ==> public open fun capture(block: () -> W): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[SimpleFunctionDescriptorImpl]

'invoke' @ [38:40] ==> public abstract operator fun invoke(p1: CordaFuture<out V>): W defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [38:48] ==> value-parameter it: CordaFuture<out V> defined in net.corda.core.concurrent.firstOf.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (it.isCancelled) {
                // Do nothing.
            } else {
                it.match({}, { log.error(shortCircuitedTaskFailedMessage, it) })
            }' @ [39:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'it' @ [39:24] ==> value-parameter it: CordaFuture<out V> defined in net.corda.core.concurrent.firstOf.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isCancelled' @ [39:27] ==> public final val <V> CordaFuture<out V>.isCancelled: Boolean[MyPropertyDescriptor]
Inferred types:
    <V> -> V

'it' @ [42:17] ==> value-parameter it: CordaFuture<out V> defined in net.corda.core.concurrent.firstOf.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'match' @ [42:20] ==> public fun <V, W> Future<out V>.match(success: (Nothing) -> Unit, failure: (Throwable) -> Unit): Unit defined in net.corda.core.concurrent[SimpleFunctionDescriptorImpl]
Inferred types:
    <V> -> V
    <W> -> Unit

'log' @ [42:32] ==> value-parameter log: Logger defined in net.corda.core.concurrent.firstOf[ValueParameterDescriptorImpl]

'error' @ [42:36] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'shortCircuitedTaskFailedMessage' @ [42:42] ==> @VisibleForTesting internal val shortCircuitedTaskFailedMessage: String defined in net.corda.core.concurrent in file ConcurrencyUtils.kt[PropertyDescriptorImpl]

'it' @ [42:75] ==> value-parameter it: Throwable defined in net.corda.core.concurrent.firstOf.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resultFuture' @ [46:12] ==> val resultFuture: OpenFuture<W> defined in net.corda.core.concurrent.firstOf[LocalVariableDescriptor]

