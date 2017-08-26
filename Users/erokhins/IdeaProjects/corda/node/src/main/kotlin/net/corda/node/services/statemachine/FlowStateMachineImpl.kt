'FlowException' @ [32:50] ==> public constructor FlowException(message: String?) defined in net.corda.core.flows.FlowException[DeserializedClassConstructorDescriptor]

'message' @ [32:64] ==> value-parameter message: String defined in net.corda.node.services.statemachine.FlowPermissionException.<init>[ValueParameterDescriptorImpl]

'Fiber<Unit>' @ [37:76] ==> public constructor Fiber<V : (Any..Any?)>(p0: (String..String?), p1: (FiberScheduler..FiberScheduler?)) defined in co.paralleluniverse.fibers.Fiber[JavaClassConstructorDescriptor]
Inferred types:
    <V : (Any..Any?)> -> Unit

'id' @ [37:88] ==> value-parameter id: StateMachineRunId defined in net.corda.node.services.statemachine.FlowStateMachineImpl.<init>[ValueParameterDescriptorImpl]

'toString' @ [37:91] ==> public open fun toString(): String defined in net.corda.core.flows.StateMachineRunId[DeserializedSimpleFunctionDescriptor]

'scheduler' @ [37:103] ==> value-parameter scheduler: FiberScheduler defined in net.corda.node.services.statemachine.FlowStateMachineImpl.<init>[ValueParameterDescriptorImpl]

'Fiber' @ [40:40] ==> public constructor Fiber<V : (Any..Any?)>() defined in co.paralleluniverse.fibers.Fiber[JavaClassConstructorDescriptor]
Inferred types:
    <V : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@70ada16a

'staticField' @ [40:53] ==> public fun <T> KClass<*>.staticField(name: String): DeclaredField<Any> defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'value' @ [40:92] ==> public final var value: Any defined in net.corda.core.internal.DeclaredField[DeserializedPropertyDescriptor]

'currentStrand' @ [45:70] ==> public open fun currentStrand(): (Strand..Strand?) defined in co.paralleluniverse.strands.Strand[JavaMethodDescriptor]

'Suppress' @ [51:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suspendable' @ [52:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'if (currentStateMachine() != null) {
                val db = DatabaseTransactionManager.dataSource
                DatabaseTransactionManager.current().commit()
                DatabaseTransactionManager.current().close()
                Strand.sleep(millis)
                DatabaseTransactionManager.dataSource = db
                DatabaseTransactionManager.newTransaction()
            } else Strand.sleep(millis)' @ [54:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'currentStateMachine' @ [54:17] ==> public final fun currentStateMachine(): FlowStateMachineImpl<*>? defined in net.corda.node.services.statemachine.FlowStateMachineImpl.Companion[SimpleFunctionDescriptorImpl]

'DatabaseTransactionManager' @ [55:26] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'dataSource' @ [55:53] ==> public final var dataSource: CordaPersistence defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'DatabaseTransactionManager' @ [56:17] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [56:44] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'commit' @ [56:54] ==> public final fun commit(): Unit defined in net.corda.node.utilities.DatabaseTransaction[SimpleFunctionDescriptorImpl]

'DatabaseTransactionManager' @ [57:17] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [57:44] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'close' @ [57:54] ==> public final fun close(): Unit defined in net.corda.node.utilities.DatabaseTransaction[SimpleFunctionDescriptorImpl]

'sleep' @ [58:24] ==> @Instrumented public open fun sleep(p0: Long): Unit defined in co.paralleluniverse.strands.Strand[JavaMethodDescriptor]

'millis' @ [58:30] ==> value-parameter millis: Long defined in net.corda.node.services.statemachine.FlowStateMachineImpl.Companion.sleep[ValueParameterDescriptorImpl]

'DatabaseTransactionManager' @ [59:17] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'dataSource' @ [59:44] ==> public final var dataSource: CordaPersistence defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'db' @ [59:57] ==> val db: CordaPersistence defined in net.corda.node.services.statemachine.FlowStateMachineImpl.Companion.sleep[LocalVariableDescriptor]

'newTransaction' @ [60:44] ==> public final fun newTransaction(isolation: Int = ...): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'sleep' @ [61:27] ==> @Instrumented public open fun sleep(p0: Long): Unit defined in co.paralleluniverse.strands.Strand[JavaMethodDescriptor]

'millis' @ [61:33] ==> value-parameter millis: Long defined in net.corda.node.services.statemachine.FlowStateMachineImpl.Companion.sleep[ValueParameterDescriptorImpl]

'Transient' @ [66:5] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'Transient' @ [67:5] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'Transient' @ [68:5] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'Transient' @ [69:5] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'Transient' @ [70:5] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'Transient' @ [71:5] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'getLogger' @ [77:49] ==> public open fun getLogger(p0: (String..String?)): (Logger..Logger?) defined in org.slf4j.LoggerFactory[JavaMethodDescriptor]

'id' @ [77:76] ==> public open val id: StateMachineRunId defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'Transient' @ [79:5] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'openFuture' @ [79:60] ==> public fun <V> openFuture(): OpenFuture<R> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> R

'_resultFuture' @ [82:17] ==> @Transient private final var _resultFuture: OpenFuture<R>? defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'openFuture' @ [82:34] ==> public fun <V> openFuture(): OpenFuture<R> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> R

'also' @ [82:50] ==> @InlineOnly @SinceKotlin public inline fun <T> OpenFuture<R>.also(block: (OpenFuture<R>) -> Unit): OpenFuture<R> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OpenFuture<R>

'_resultFuture' @ [82:57] ==> @Transient private final var _resultFuture: OpenFuture<R>? defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'it' @ [82:73] ==> value-parameter it: OpenFuture<R> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.<get-resultFuture>.<anonymous>[ValueParameterDescriptorImpl]

'HashMap' @ [85:33] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Pair<FlowLogic<*>, Party>
    <V : (Any..Any?)> -> FlowSession

'if (value) field = value else throw IllegalArgumentException("Can only set to true")' @ [89:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'value' @ [89:17] ==> value-parameter value: Boolean defined in net.corda.node.services.statemachine.FlowStateMachineImpl.<set-hasSoftLockedStates>[ValueParameterDescriptorImpl]

'field' @ [89:24] ==> var field: Boolean defined in net.corda.node.services.statemachine.FlowStateMachineImpl.<set-hasSoftLockedStates>[SyntheticFieldDescriptor]

'value' @ [89:32] ==> value-parameter value: Boolean defined in net.corda.node.services.statemachine.FlowStateMachineImpl.<set-hasSoftLockedStates>[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [89:49] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'logic' @ [93:9] ==> public final val logic: FlowLogic<R> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'stateMachine' @ [93:15] ==> public final var stateMachine: FlowStateMachine<*> defined in net.corda.core.flows.FlowLogic[DeserializedPropertyDescriptor]

'this' @ [93:30] ==> <this> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[LazyClassReceiverParameterDescriptor]

'Suspendable' @ [96:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'createTransaction' @ [98:9] ==> private final fun createTransaction(): Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'logger' @ [99:9] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'debug' @ [99:16] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'logic' @ [99:40] ==> public final val logic: FlowLogic<R> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'nanoTime' @ [100:32] ==> public open fun nanoTime(): Long defined in java.lang.System[JavaMethodDescriptor]

'logic' @ [102:21] ==> public final val logic: FlowLogic<R> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'call' @ [102:27] ==> @Suspendable public abstract fun call(): R defined in net.corda.core.flows.FlowLogic[DeserializedSimpleFunctionDescriptor]

'openSessions' @ [104:13] ==> internal final val openSessions: HashMap<Pair<FlowLogic<*>, Party>, FlowSession> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'values' @ [104:26] ==> public open val values: MutableCollection<FlowSession> defined in java.util.HashMap[JavaPropertyDescriptor]

'filter' @ [105:22] ==> public inline fun <T> Iterable<FlowSession>.filter(predicate: (FlowSession) -> Boolean): List<FlowSession> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlowSession

'it' @ [105:31] ==> value-parameter it: FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl.run.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [105:34] ==> public final var state: FlowSessionState defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'forEach' @ [106:22] ==> @HidesMembers public inline fun <T> Iterable<FlowSession>.forEach(action: (FlowSession) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlowSession

'it' @ [106:32] ==> value-parameter it: FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl.run.<anonymous>[ValueParameterDescriptorImpl]

'waitForConfirmation' @ [106:35] ==> @Suspendable private final fun FlowSession.waitForConfirmation(): Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'r' @ [107:13] ==> val r: R defined in net.corda.node.services.statemachine.FlowStateMachineImpl.run[LocalVariableDescriptor]

'recordDuration' @ [109:13] ==> private final fun recordDuration(startTime: Long, success: Boolean = ...): Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'startTime' @ [109:28] ==> val startTime: Long defined in net.corda.node.services.statemachine.FlowStateMachineImpl.run[LocalVariableDescriptor]

'e' @ [111:30] ==> val e: FlowException defined in net.corda.node.services.statemachine.FlowStateMachineImpl.run[LocalVariableDescriptor]

'stackTrace' @ [111:32] ==> public final var FlowException.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]

'className' @ [111:46] ==> public final val StackTraceElement.className: (String..String?)[MyPropertyDescriptor]

'javaClass' @ [111:59] ==> public val <T : Any> FlowStateMachineImpl<R>.javaClass: Class<FlowStateMachineImpl<R>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> FlowStateMachineImpl<R>

'name' @ [111:69] ==> public final val <T : (Any..Any?)> Class<FlowStateMachineImpl<R>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FlowStateMachineImpl<R>

'processException' @ [112:13] ==> private final fun processException(exception: Throwable, propagated: Boolean): Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'e' @ [112:30] ==> val e: FlowException defined in net.corda.node.services.statemachine.FlowStateMachineImpl.run[LocalVariableDescriptor]

'propagated' @ [112:33] ==> val propagated: Boolean defined in net.corda.node.services.statemachine.FlowStateMachineImpl.run[LocalVariableDescriptor]

'logger' @ [113:13] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'warn' @ [113:20] ==> public abstract fun warn(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'if (propagated) "Flow ended due to receiving exception" else "Flow finished with exception"' @ [113:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'propagated' @ [113:29] ==> val propagated: Boolean defined in net.corda.node.services.statemachine.FlowStateMachineImpl.run[LocalVariableDescriptor]

'e' @ [113:118] ==> val e: FlowException defined in net.corda.node.services.statemachine.FlowStateMachineImpl.run[LocalVariableDescriptor]

'recordDuration' @ [116:13] ==> private final fun recordDuration(startTime: Long, success: Boolean = ...): Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'startTime' @ [116:28] ==> val startTime: Long defined in net.corda.node.services.statemachine.FlowStateMachineImpl.run[LocalVariableDescriptor]

'logger' @ [117:13] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'warn' @ [117:20] ==> public abstract fun warn(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

't' @ [117:63] ==> val t: Throwable defined in net.corda.node.services.statemachine.FlowStateMachineImpl.run[LocalVariableDescriptor]

'processException' @ [118:13] ==> private final fun processException(exception: Throwable, propagated: Boolean): Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

't' @ [118:30] ==> val t: Throwable defined in net.corda.node.services.statemachine.FlowStateMachineImpl.run[LocalVariableDescriptor]

'recordDuration' @ [122:9] ==> private final fun recordDuration(startTime: Long, success: Boolean = ...): Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'startTime' @ [122:24] ==> val startTime: Long defined in net.corda.node.services.statemachine.FlowStateMachineImpl.run[LocalVariableDescriptor]

'invoke' @ [124:9] ==> public abstract operator fun invoke(p1: Try<R>, p2: Boolean): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'Success' @ [124:25] ==> public constructor Success<out A>(value: R) defined in net.corda.core.utilities.Try.Success[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> R

'result' @ [124:33] ==> val result: R defined in net.corda.node.services.statemachine.FlowStateMachineImpl.run[LocalVariableDescriptor]

'_resultFuture' @ [125:9] ==> @Transient private final var _resultFuture: OpenFuture<R>? defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'set' @ [125:24] ==> public abstract fun set(value: R): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'result' @ [125:28] ==> val result: R defined in net.corda.node.services.statemachine.FlowStateMachineImpl.run[LocalVariableDescriptor]

'logic' @ [126:9] ==> public final val logic: FlowLogic<R> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'progressTracker' @ [126:15] ==> public open val progressTracker: ProgressTracker? defined in net.corda.core.flows.FlowLogic[DeserializedPropertyDescriptor]

'currentStep' @ [126:32] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'DONE' @ [126:62] ==> public object DONE : ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[FakeCallableDescriptorForObject]

'logger' @ [127:9] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'debug' @ [127:16] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'result' @ [127:53] ==> val result: R defined in net.corda.node.services.statemachine.FlowStateMachineImpl.run[LocalVariableDescriptor]

'toString' @ [127:60] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'abbreviate' @ [127:71] ==> public fun String.abbreviate(maxWidth: Int): String defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'database' @ [132:9] ==> @Transient internal final lateinit var database: CordaPersistence defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'createTransaction' @ [132:18] ==> public final fun createTransaction(): DatabaseTransaction defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]

'logger' @ [133:9] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'trace' @ [133:16] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'DatabaseTransactionManager' @ [133:57] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'currentOrNull' @ [133:84] ==> public final fun currentOrNull(): DatabaseTransaction? defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'currentStrand' @ [133:113] ==> public open fun currentStrand(): (Strand..Strand?) defined in co.paralleluniverse.strands.Strand[JavaMethodDescriptor]

'invoke' @ [137:9] ==> public abstract operator fun invoke(p1: Try<R>, p2: Boolean): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'Failure' @ [137:25] ==> public constructor Failure(exception: Throwable) defined in net.corda.core.utilities.Try.Failure[DeserializedClassConstructorDescriptor]

'exception' @ [137:33] ==> value-parameter exception: Throwable defined in net.corda.node.services.statemachine.FlowStateMachineImpl.processException[ValueParameterDescriptorImpl]

'propagated' @ [137:45] ==> value-parameter propagated: Boolean defined in net.corda.node.services.statemachine.FlowStateMachineImpl.processException[ValueParameterDescriptorImpl]

'_resultFuture' @ [138:9] ==> @Transient private final var _resultFuture: OpenFuture<R>? defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'setException' @ [138:24] ==> public abstract fun setException(t: Throwable): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'exception' @ [138:37] ==> value-parameter exception: Throwable defined in net.corda.node.services.statemachine.FlowStateMachineImpl.processException[ValueParameterDescriptorImpl]

'logic' @ [139:9] ==> public final val logic: FlowLogic<R> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'progressTracker' @ [139:15] ==> public open val progressTracker: ProgressTracker? defined in net.corda.core.flows.FlowLogic[DeserializedPropertyDescriptor]

'endWithError' @ [139:32] ==> public final fun endWithError(error: Throwable): Unit defined in net.corda.core.utilities.ProgressTracker[DeserializedSimpleFunctionDescriptor]

'exception' @ [139:45] ==> value-parameter exception: Throwable defined in net.corda.node.services.statemachine.FlowStateMachineImpl.processException[ValueParameterDescriptorImpl]

'DatabaseTransactionManager' @ [143:27] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [143:54] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'logger' @ [145:13] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'trace' @ [145:20] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'transaction' @ [145:62] ==> val transaction: DatabaseTransaction defined in net.corda.node.services.statemachine.FlowStateMachineImpl.commitTransaction[LocalVariableDescriptor]

'currentStrand' @ [145:86] ==> public open fun currentStrand(): (Strand..Strand?) defined in co.paralleluniverse.strands.Strand[JavaMethodDescriptor]

'transaction' @ [146:13] ==> val transaction: DatabaseTransaction defined in net.corda.node.services.statemachine.FlowStateMachineImpl.commitTransaction[LocalVariableDescriptor]

'commit' @ [146:25] ==> public final fun commit(): Unit defined in net.corda.node.utilities.DatabaseTransaction[SimpleFunctionDescriptorImpl]

'logger' @ [149:13] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'error' @ [149:20] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'e' @ [149:56] ==> val e: SQLException defined in net.corda.node.services.statemachine.FlowStateMachineImpl.commitTransaction[LocalVariableDescriptor]

'message' @ [149:58] ==> public open val message: String? defined in java.sql.SQLException[DeserializedPropertyDescriptor]

'e' @ [149:69] ==> val e: SQLException defined in net.corda.node.services.statemachine.FlowStateMachineImpl.commitTransaction[LocalVariableDescriptor]

'exit' @ [150:20] ==> public open fun exit(p0: Int): Unit defined in java.lang.System[JavaMethodDescriptor]

'transaction' @ [152:13] ==> val transaction: DatabaseTransaction defined in net.corda.node.services.statemachine.FlowStateMachineImpl.commitTransaction[LocalVariableDescriptor]

'close' @ [152:25] ==> public final fun close(): Unit defined in net.corda.node.utilities.DatabaseTransaction[SimpleFunctionDescriptorImpl]

'Suspendable' @ [156:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'getConfirmedSession' @ [158:21] ==> @Suspendable private final fun getConfirmedSession(otherParty: Party, sessionFlow: FlowLogic<*>): FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'otherParty' @ [158:41] ==> value-parameter otherParty: Party defined in net.corda.node.services.statemachine.FlowStateMachineImpl.getFlowContext[ValueParameterDescriptorImpl]

'sessionFlow' @ [158:53] ==> value-parameter sessionFlow: FlowLogic<*> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.getFlowContext[ValueParameterDescriptorImpl]

'state' @ [158:66] ==> public final var state: FlowSessionState defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'state' @ [159:16] ==> val state: FlowSessionState.Initiated defined in net.corda.node.services.statemachine.FlowStateMachineImpl.getFlowContext[LocalVariableDescriptor]

'context' @ [159:22] ==> public final val context: FlowContext defined in net.corda.node.services.statemachine.FlowSessionState.Initiated[PropertyDescriptorImpl]

'Suspendable' @ [162:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'logger' @ [168:9] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'debug' @ [168:16] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'receiveType' @ [168:42] ==> value-parameter receiveType: Class<T> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceive[ValueParameterDescriptorImpl]

'name' @ [168:54] ==> public final val <T : (Any..Any?)> Class<T>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'otherParty' @ [168:62] ==> value-parameter otherParty: Party defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceive[ValueParameterDescriptorImpl]

'payload' @ [168:76] ==> value-parameter payload: Any defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceive[ValueParameterDescriptorImpl]

'toString' @ [168:84] ==> public open fun toString(): String defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'abbreviate' @ [168:95] ==> public fun String.abbreviate(maxWidth: Int): String defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'getConfirmedSessionIfPresent' @ [169:23] ==> @Suspendable private final fun getConfirmedSessionIfPresent(otherParty: Party, sessionFlow: FlowLogic<*>): FlowSession? defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'otherParty' @ [169:52] ==> value-parameter otherParty: Party defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceive[ValueParameterDescriptorImpl]

'sessionFlow' @ [169:64] ==> value-parameter sessionFlow: FlowLogic<*> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceive[ValueParameterDescriptorImpl]

'if (session == null) {
            val newSession = startNewSession(otherParty, sessionFlow, payload, waitForConfirmation = true, retryable = retrySend)
            // Only do a receive here as the session init has carried the payload
            receiveInternal<SessionData>(newSession, receiveType)
        } else {
            val sendData = createSessionData(session, payload)
            sendAndReceiveInternal<SessionData>(session, sendData, receiveType)
        }' @ [170:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReceivedSessionMessage<SessionData>, elseBranch: ReceivedSessionMessage<SessionData>): ReceivedSessionMessage<SessionData>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ReceivedSessionMessage<SessionData>

'session' @ [170:31] ==> val session: FlowSession? defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceive[LocalVariableDescriptor]

'startNewSession' @ [171:30] ==> @Suspendable private final fun startNewSession(otherParty: Party, sessionFlow: FlowLogic<*>, firstPayload: Any?, waitForConfirmation: Boolean, retryable: Boolean = ...): FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'otherParty' @ [171:46] ==> value-parameter otherParty: Party defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceive[ValueParameterDescriptorImpl]

'sessionFlow' @ [171:58] ==> value-parameter sessionFlow: FlowLogic<*> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceive[ValueParameterDescriptorImpl]

'payload' @ [171:71] ==> value-parameter payload: Any defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceive[ValueParameterDescriptorImpl]

'retrySend' @ [171:120] ==> value-parameter retrySend: Boolean defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceive[ValueParameterDescriptorImpl]

'receiveInternal' @ [173:13] ==> private final inline fun <reified M : ExistingSessionMessage> receiveInternal(session: FlowSession, userReceiveType: Class<*>?): ReceivedSessionMessage<SessionData> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified M : ExistingSessionMessage> -> SessionData

'newSession' @ [173:42] ==> val newSession: FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceive[LocalVariableDescriptor]

'receiveType' @ [173:54] ==> value-parameter receiveType: Class<T> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceive[ValueParameterDescriptorImpl]

'createSessionData' @ [175:28] ==> private final fun createSessionData(session: FlowSession, payload: Any): SessionData defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'session' @ [175:46] ==> val session: FlowSession? defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceive[LocalVariableDescriptor]

'payload' @ [175:55] ==> value-parameter payload: Any defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceive[ValueParameterDescriptorImpl]

'sendAndReceiveInternal' @ [176:13] ==> private final inline fun <reified M : ExistingSessionMessage> sendAndReceiveInternal(session: FlowSession, message: SessionMessage, userReceiveType: Class<*>?): ReceivedSessionMessage<SessionData> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified M : ExistingSessionMessage> -> SessionData

'session' @ [176:49] ==> val session: FlowSession? defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceive[LocalVariableDescriptor]

'sendData' @ [176:58] ==> val sendData: SessionData defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceive[LocalVariableDescriptor]

'receiveType' @ [176:68] ==> value-parameter receiveType: Class<T> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceive[ValueParameterDescriptorImpl]

'logger' @ [178:9] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'debug' @ [178:16] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'sessionData' @ [178:36] ==> val sessionData: ReceivedSessionMessage<SessionData> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceive[LocalVariableDescriptor]

'message' @ [178:48] ==> public final val message: SessionData defined in net.corda.node.services.statemachine.ReceivedSessionMessage[PropertyDescriptorImpl]

'payload' @ [178:56] ==> public final val payload: Any defined in net.corda.node.services.statemachine.SessionData[PropertyDescriptorImpl]

'toString' @ [178:64] ==> public open fun toString(): String defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'abbreviate' @ [178:75] ==> public fun String.abbreviate(maxWidth: Int): String defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'sessionData' @ [179:16] ==> val sessionData: ReceivedSessionMessage<SessionData> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceive[LocalVariableDescriptor]

'checkPayloadIs' @ [179:28] ==> public fun <T> ReceivedSessionMessage<SessionData>.checkPayloadIs(type: Class<T>): UntrustworthyData<T> defined in net.corda.node.services.statemachine[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'receiveType' @ [179:43] ==> value-parameter receiveType: Class<T> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceive[ValueParameterDescriptorImpl]

'Suspendable' @ [182:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'logger' @ [186:9] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'debug' @ [186:16] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'receiveType' @ [186:35] ==> value-parameter receiveType: Class<T> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.receive[ValueParameterDescriptorImpl]

'name' @ [186:47] ==> public final val <T : (Any..Any?)> Class<T>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'otherParty' @ [186:55] ==> value-parameter otherParty: Party defined in net.corda.node.services.statemachine.FlowStateMachineImpl.receive[ValueParameterDescriptorImpl]

'getConfirmedSession' @ [187:23] ==> @Suspendable private final fun getConfirmedSession(otherParty: Party, sessionFlow: FlowLogic<*>): FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'otherParty' @ [187:43] ==> value-parameter otherParty: Party defined in net.corda.node.services.statemachine.FlowStateMachineImpl.receive[ValueParameterDescriptorImpl]

'sessionFlow' @ [187:55] ==> value-parameter sessionFlow: FlowLogic<*> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.receive[ValueParameterDescriptorImpl]

'receiveInternal' @ [188:27] ==> private final inline fun <reified M : ExistingSessionMessage> receiveInternal(session: FlowSession, userReceiveType: Class<*>?): ReceivedSessionMessage<SessionData> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified M : ExistingSessionMessage> -> SessionData

'session' @ [188:56] ==> val session: FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl.receive[LocalVariableDescriptor]

'receiveType' @ [188:65] ==> value-parameter receiveType: Class<T> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.receive[ValueParameterDescriptorImpl]

'logger' @ [189:9] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'debug' @ [189:16] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'sessionData' @ [189:36] ==> val sessionData: ReceivedSessionMessage<SessionData> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.receive[LocalVariableDescriptor]

'message' @ [189:48] ==> public final val message: SessionData defined in net.corda.node.services.statemachine.ReceivedSessionMessage[PropertyDescriptorImpl]

'payload' @ [189:56] ==> public final val payload: Any defined in net.corda.node.services.statemachine.SessionData[PropertyDescriptorImpl]

'toString' @ [189:64] ==> public open fun toString(): String defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'abbreviate' @ [189:75] ==> public fun String.abbreviate(maxWidth: Int): String defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'sessionData' @ [190:16] ==> val sessionData: ReceivedSessionMessage<SessionData> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.receive[LocalVariableDescriptor]

'checkPayloadIs' @ [190:28] ==> public fun <T> ReceivedSessionMessage<SessionData>.checkPayloadIs(type: Class<T>): UntrustworthyData<T> defined in net.corda.node.services.statemachine[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'receiveType' @ [190:43] ==> value-parameter receiveType: Class<T> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.receive[ValueParameterDescriptorImpl]

'Suspendable' @ [193:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'logger' @ [195:9] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'debug' @ [195:16] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'otherParty' @ [195:31] ==> value-parameter otherParty: Party defined in net.corda.node.services.statemachine.FlowStateMachineImpl.send[ValueParameterDescriptorImpl]

'payload' @ [195:45] ==> value-parameter payload: Any defined in net.corda.node.services.statemachine.FlowStateMachineImpl.send[ValueParameterDescriptorImpl]

'toString' @ [195:53] ==> public open fun toString(): String defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'abbreviate' @ [195:64] ==> public fun String.abbreviate(maxWidth: Int): String defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'getConfirmedSessionIfPresent' @ [196:23] ==> @Suspendable private final fun getConfirmedSessionIfPresent(otherParty: Party, sessionFlow: FlowLogic<*>): FlowSession? defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'otherParty' @ [196:52] ==> value-parameter otherParty: Party defined in net.corda.node.services.statemachine.FlowStateMachineImpl.send[ValueParameterDescriptorImpl]

'sessionFlow' @ [196:64] ==> value-parameter sessionFlow: FlowLogic<*> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.send[ValueParameterDescriptorImpl]

'if (session == null) {
            // Don't send the payload again if it was already piggy-backed on a session init
            startNewSession(otherParty, sessionFlow, payload, waitForConfirmation = false)
        } else {
            sendInternal(session, createSessionData(session, payload))
        }' @ [197:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'session' @ [197:13] ==> val session: FlowSession? defined in net.corda.node.services.statemachine.FlowStateMachineImpl.send[LocalVariableDescriptor]

'startNewSession' @ [199:13] ==> @Suspendable private final fun startNewSession(otherParty: Party, sessionFlow: FlowLogic<*>, firstPayload: Any?, waitForConfirmation: Boolean, retryable: Boolean = ...): FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'otherParty' @ [199:29] ==> value-parameter otherParty: Party defined in net.corda.node.services.statemachine.FlowStateMachineImpl.send[ValueParameterDescriptorImpl]

'sessionFlow' @ [199:41] ==> value-parameter sessionFlow: FlowLogic<*> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.send[ValueParameterDescriptorImpl]

'payload' @ [199:54] ==> value-parameter payload: Any defined in net.corda.node.services.statemachine.FlowStateMachineImpl.send[ValueParameterDescriptorImpl]

'sendInternal' @ [201:13] ==> @Suspendable private final fun sendInternal(session: FlowSession, message: SessionMessage): Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'session' @ [201:26] ==> val session: FlowSession? defined in net.corda.node.services.statemachine.FlowStateMachineImpl.send[LocalVariableDescriptor]

'createSessionData' @ [201:35] ==> private final fun createSessionData(session: FlowSession, payload: Any): SessionData defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'session' @ [201:53] ==> val session: FlowSession? defined in net.corda.node.services.statemachine.FlowStateMachineImpl.send[LocalVariableDescriptor]

'payload' @ [201:62] ==> value-parameter payload: Any defined in net.corda.node.services.statemachine.FlowStateMachineImpl.send[ValueParameterDescriptorImpl]

'Suspendable' @ [205:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'logger' @ [207:9] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'debug' @ [207:16] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'hash' @ [207:46] ==> value-parameter hash: SecureHash defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForLedgerCommit[ValueParameterDescriptorImpl]

'suspend' @ [208:9] ==> @Suspendable private final fun suspend(ioRequest: FlowIORequest): Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'WaitForLedgerCommit' @ [208:17] ==> public constructor WaitForLedgerCommit(hash: SecureHash, fiber: FlowStateMachineImpl<*>) defined in net.corda.node.services.statemachine.WaitForLedgerCommit[ClassConstructorDescriptorImpl]

'hash' @ [208:37] ==> value-parameter hash: SecureHash defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForLedgerCommit[ValueParameterDescriptorImpl]

'sessionFlow' @ [208:43] ==> value-parameter sessionFlow: FlowLogic<*> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForLedgerCommit[ValueParameterDescriptorImpl]

'stateMachine' @ [208:55] ==> public final var stateMachine: FlowStateMachine<*> defined in net.corda.core.flows.FlowLogic[DeserializedPropertyDescriptor]

'serviceHub' @ [209:19] ==> @Transient public open lateinit var serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'validatedTransactions' @ [209:30] ==> public abstract val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'getTransaction' @ [209:52] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'hash' @ [209:67] ==> value-parameter hash: SecureHash defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForLedgerCommit[ValueParameterDescriptorImpl]

'stx' @ [210:13] ==> val stx: SignedTransaction? defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForLedgerCommit[LocalVariableDescriptor]

'logger' @ [211:13] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'debug' @ [211:20] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'hash' @ [211:42] ==> value-parameter hash: SecureHash defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForLedgerCommit[ValueParameterDescriptorImpl]

'stx' @ [212:20] ==> val stx: SignedTransaction? defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForLedgerCommit[LocalVariableDescriptor]

'openSessions' @ [216:25] ==> internal final val openSessions: HashMap<Pair<FlowLogic<*>, Party>, FlowSession> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'values' @ [216:38] ==> public open val values: MutableCollection<FlowSession> defined in java.util.HashMap[JavaPropertyDescriptor]

'session' @ [217:37] ==> val session: FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForLedgerCommit[LocalVariableDescriptor]

'receivedMessages' @ [217:45] ==> public final val receivedMessages: ConcurrentLinkedQueue<ReceivedSessionMessage<*>> defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'receivedMessage' @ [218:21] ==> val receivedMessage: (ReceivedSessionMessage<*>..ReceivedSessionMessage<*>?) defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForLedgerCommit[LocalVariableDescriptor]

'message' @ [218:37] ==> public final val message: ExistingSessionMessage defined in net.corda.node.services.statemachine.ReceivedSessionMessage[PropertyDescriptorImpl]

'session' @ [219:21] ==> val session: FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForLedgerCommit[LocalVariableDescriptor]

'erroredEnd' @ [219:29] ==> private final fun FlowSession.erroredEnd(end: ErrorSessionEnd): Nothing defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'receivedMessage' @ [219:40] ==> val receivedMessage: (ReceivedSessionMessage<*>..ReceivedSessionMessage<*>?) defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForLedgerCommit[LocalVariableDescriptor]

'message' @ [219:56] ==> public final val message: ExistingSessionMessage defined in net.corda.node.services.statemachine.ReceivedSessionMessage[PropertyDescriptorImpl]

'IllegalStateException' @ [223:15] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'hash' @ [223:73] ==> value-parameter hash: SecureHash defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForLedgerCommit[ValueParameterDescriptorImpl]

'FlowPermissionAuditEvent' @ [229:36] ==> public constructor FlowPermissionAuditEvent(timestamp: Instant, principal: Principal, description: String, contextData: Map<String, String>, flowType: Class<out FlowLogic<*>>, flowId: StateMachineRunId, permissionRequested: String, permissionGranted: Boolean) defined in net.corda.node.services.api.FlowPermissionAuditEvent[ClassConstructorDescriptorImpl]

'serviceHub' @ [230:17] ==> @Transient public open lateinit var serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'clock' @ [230:28] ==> public abstract val clock: Clock defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'instant' @ [230:34] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'flowInitiator' @ [231:17] ==> public open val flowInitiator: FlowInitiator defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'permissionName' @ [232:45] ==> value-parameter permissionName: String defined in net.corda.node.services.statemachine.FlowStateMachineImpl.checkFlowPermission[ValueParameterDescriptorImpl]

'extraAuditData' @ [233:17] ==> value-parameter extraAuditData: Map<String, String> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.checkFlowPermission[ValueParameterDescriptorImpl]

'logic' @ [234:17] ==> public final val logic: FlowLogic<R> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'javaClass' @ [234:23] ==> public val <T : Any> FlowLogic<R>.javaClass: Class<FlowLogic<R>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> FlowLogic<R>

'id' @ [235:17] ==> public open val id: StateMachineRunId defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'permissionName' @ [236:17] ==> value-parameter permissionName: String defined in net.corda.node.services.statemachine.FlowStateMachineImpl.checkFlowPermission[ValueParameterDescriptorImpl]

'permissionGranted' @ [237:17] ==> val permissionGranted: Boolean defined in net.corda.node.services.statemachine.FlowStateMachineImpl.checkFlowPermission[LocalVariableDescriptor]

'serviceHub' @ [238:9] ==> @Transient public open lateinit var serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'auditService' @ [238:20] ==> public abstract val auditService: AuditService defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'recordAuditEvent' @ [238:33] ==> public abstract fun recordAuditEvent(event: AuditEvent): Unit defined in net.corda.node.services.api.AuditService[SimpleFunctionDescriptorImpl]

'checkPermissionEvent' @ [238:50] ==> val checkPermissionEvent: FlowPermissionAuditEvent defined in net.corda.node.services.statemachine.FlowStateMachineImpl.checkFlowPermission[LocalVariableDescriptor]

'!' @ [239:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'permissionGranted' @ [239:14] ==> val permissionGranted: Boolean defined in net.corda.node.services.statemachine.FlowStateMachineImpl.checkFlowPermission[LocalVariableDescriptor]

'FlowPermissionException' @ [240:19] ==> public constructor FlowPermissionException(message: String) defined in net.corda.node.services.statemachine.FlowPermissionException[ClassConstructorDescriptorImpl]

'flowInitiator' @ [240:50] ==> public open val flowInitiator: FlowInitiator defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'permissionName' @ [240:86] ==> value-parameter permissionName: String defined in net.corda.node.services.statemachine.FlowStateMachineImpl.checkFlowPermission[ValueParameterDescriptorImpl]

'id' @ [240:110] ==> public open val id: StateMachineRunId defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'FlowAppAuditEvent' @ [246:30] ==> public constructor FlowAppAuditEvent(timestamp: Instant, principal: Principal, description: String, contextData: Map<String, String>, flowType: Class<out FlowLogic<*>>, flowId: StateMachineRunId, auditEventType: String) defined in net.corda.node.services.api.FlowAppAuditEvent[ClassConstructorDescriptorImpl]

'serviceHub' @ [247:17] ==> @Transient public open lateinit var serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'clock' @ [247:28] ==> public abstract val clock: Clock defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'instant' @ [247:34] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'flowInitiator' @ [248:17] ==> public open val flowInitiator: FlowInitiator defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'comment' @ [249:17] ==> value-parameter comment: String defined in net.corda.node.services.statemachine.FlowStateMachineImpl.recordAuditEvent[ValueParameterDescriptorImpl]

'extraAuditData' @ [250:17] ==> value-parameter extraAuditData: Map<String, String> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.recordAuditEvent[ValueParameterDescriptorImpl]

'logic' @ [251:17] ==> public final val logic: FlowLogic<R> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'javaClass' @ [251:23] ==> public val <T : Any> FlowLogic<R>.javaClass: Class<FlowLogic<R>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> FlowLogic<R>

'id' @ [252:17] ==> public open val id: StateMachineRunId defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'eventType' @ [253:17] ==> value-parameter eventType: String defined in net.corda.node.services.statemachine.FlowStateMachineImpl.recordAuditEvent[ValueParameterDescriptorImpl]

'serviceHub' @ [254:9] ==> @Transient public open lateinit var serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'auditService' @ [254:20] ==> public abstract val auditService: AuditService defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'recordAuditEvent' @ [254:33] ==> public abstract fun recordAuditEvent(event: AuditEvent): Unit defined in net.corda.node.services.api.AuditService[SimpleFunctionDescriptorImpl]

'flowAuditEvent' @ [254:50] ==> val flowAuditEvent: FlowAppAuditEvent defined in net.corda.node.services.statemachine.FlowStateMachineImpl.recordAuditEvent[LocalVariableDescriptor]

'Suspendable' @ [257:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'FlowStackSnapshotFactory' @ [259:16] ==> public companion object defined in net.corda.node.services.statemachine.FlowStackSnapshotFactory[FakeCallableDescriptorForObject]

'instance' @ [259:41] ==> public final val instance: FlowStackSnapshotFactory defined in net.corda.node.services.statemachine.FlowStackSnapshotFactory.Companion[PropertyDescriptorImpl]

'getFlowStackSnapshot' @ [259:50] ==> public abstract fun getFlowStackSnapshot(flowClass: Class<out FlowLogic<*>>): FlowStackSnapshot? defined in net.corda.node.services.statemachine.FlowStackSnapshotFactory[SimpleFunctionDescriptorImpl]

'flowClass' @ [259:71] ==> value-parameter flowClass: Class<out FlowLogic<*>> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.flowStackSnapshot[ValueParameterDescriptorImpl]

'FlowStackSnapshotFactory' @ [263:9] ==> public companion object defined in net.corda.node.services.statemachine.FlowStackSnapshotFactory[FakeCallableDescriptorForObject]

'instance' @ [263:34] ==> public final val instance: FlowStackSnapshotFactory defined in net.corda.node.services.statemachine.FlowStackSnapshotFactory.Companion[PropertyDescriptorImpl]

'persistAsJsonFile' @ [263:43] ==> public abstract fun persistAsJsonFile(flowClass: Class<out FlowLogic<*>>, baseDir: Path, flowId: StateMachineRunId): Unit defined in net.corda.node.services.statemachine.FlowStackSnapshotFactory[SimpleFunctionDescriptorImpl]

'flowClass' @ [263:61] ==> value-parameter flowClass: Class<out FlowLogic<*>> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.persistFlowStackSnapshot[ValueParameterDescriptorImpl]

'serviceHub' @ [263:72] ==> @Transient public open lateinit var serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'configuration' @ [263:83] ==> public abstract val configuration: NodeConfiguration defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'baseDirectory' @ [263:97] ==> public abstract val baseDirectory: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'id' @ [263:112] ==> public open val id: StateMachineRunId defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'Suspendable' @ [269:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'component1' @ [271:14] ==> public final operator fun component1(): Party defined in net.corda.node.services.statemachine.ReceivedSessionMessage[SimpleFunctionDescriptorImpl]

'component2' @ [271:25] ==> public final operator fun component2(): SessionInitResponse defined in net.corda.node.services.statemachine.ReceivedSessionMessage[SimpleFunctionDescriptorImpl]

'receiveInternal' @ [271:48] ==> private final inline fun <reified M : ExistingSessionMessage> receiveInternal(session: FlowSession, userReceiveType: Class<*>?): ReceivedSessionMessage<SessionInitResponse> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified M : ExistingSessionMessage> -> SessionInitResponse

'this' @ [271:85] ==> <this> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForConfirmation[ReceiverParameterDescriptorImpl]

'if (sessionInitResponse is SessionConfirm) {
            state = FlowSessionState.Initiated(
                    peerParty,
                    sessionInitResponse.initiatedSessionId,
                    FlowContext(sessionInitResponse.flowVersion, sessionInitResponse.appName))
        } else {
            sessionInitResponse as SessionReject
            throw UnexpectedFlowEndException("Party ${state.sendToParty} rejected session request: ${sessionInitResponse.errorMessage}")
        }' @ [272:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'sessionInitResponse' @ [272:13] ==> val sessionInitResponse: SessionInitResponse defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForConfirmation[LocalVariableDescriptor]

'state' @ [273:13] ==> public final var state: FlowSessionState defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'Initiated' @ [273:38] ==> public constructor Initiated(peerParty: Party, peerSessionId: Long, context: FlowContext) defined in net.corda.node.services.statemachine.FlowSessionState.Initiated[ClassConstructorDescriptorImpl]

'peerParty' @ [274:21] ==> val peerParty: Party defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForConfirmation[LocalVariableDescriptor]

'sessionInitResponse' @ [275:21] ==> val sessionInitResponse: SessionInitResponse defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForConfirmation[LocalVariableDescriptor]

'initiatedSessionId' @ [275:41] ==> public final val initiatedSessionId: Long defined in net.corda.node.services.statemachine.SessionConfirm[PropertyDescriptorImpl]

'FlowContext' @ [276:21] ==> public constructor FlowContext(flowVersion: Int, appName: String) defined in net.corda.core.flows.FlowContext[DeserializedClassConstructorDescriptor]

'sessionInitResponse' @ [276:33] ==> val sessionInitResponse: SessionInitResponse defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForConfirmation[LocalVariableDescriptor]

'flowVersion' @ [276:53] ==> public final val flowVersion: Int defined in net.corda.node.services.statemachine.SessionConfirm[PropertyDescriptorImpl]

'sessionInitResponse' @ [276:66] ==> val sessionInitResponse: SessionInitResponse defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForConfirmation[LocalVariableDescriptor]

'appName' @ [276:86] ==> public final val appName: String defined in net.corda.node.services.statemachine.SessionConfirm[PropertyDescriptorImpl]

'sessionInitResponse' @ [278:13] ==> val sessionInitResponse: SessionInitResponse defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForConfirmation[LocalVariableDescriptor]

'UnexpectedFlowEndException' @ [279:19] ==> public constructor UnexpectedFlowEndException(msg: String) defined in net.corda.core.flows.UnexpectedFlowEndException[DeserializedClassConstructorDescriptor]

'state' @ [279:55] ==> public final var state: FlowSessionState defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'sendToParty' @ [279:61] ==> public abstract val sendToParty: Party defined in net.corda.node.services.statemachine.FlowSessionState[PropertyDescriptorImpl]

'sessionInitResponse' @ [279:102] ==> val sessionInitResponse: SessionInitResponse defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForConfirmation[LocalVariableDescriptor]

'errorMessage' @ [279:122] ==> public final val errorMessage: String defined in net.corda.node.services.statemachine.SessionReject[PropertyDescriptorImpl]

'session' @ [284:28] ==> value-parameter session: FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl.createSessionData[ValueParameterDescriptorImpl]

'state' @ [284:36] ==> public final var state: FlowSessionState defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'when (sessionState) {
            is FlowSessionState.Initiating -> throw IllegalStateException("We've somehow held onto an unconfirmed session: $session")
            is FlowSessionState.Initiated -> sessionState.peerSessionId
        }' @ [285:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Long, entry1: Long): Long[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Long

'sessionState' @ [285:35] ==> val sessionState: FlowSessionState defined in net.corda.node.services.statemachine.FlowStateMachineImpl.createSessionData[LocalVariableDescriptor]

'IllegalStateException' @ [286:53] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'session' @ [286:125] ==> value-parameter session: FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl.createSessionData[ValueParameterDescriptorImpl]

'sessionState' @ [287:46] ==> val sessionState: FlowSessionState defined in net.corda.node.services.statemachine.FlowStateMachineImpl.createSessionData[LocalVariableDescriptor]

'peerSessionId' @ [287:59] ==> public final val peerSessionId: Long defined in net.corda.node.services.statemachine.FlowSessionState.Initiated[PropertyDescriptorImpl]

'SessionData' @ [289:16] ==> public constructor SessionData(recipientSessionId: Long, payload: Any) defined in net.corda.node.services.statemachine.SessionData[ClassConstructorDescriptorImpl]

'peerSessionId' @ [289:28] ==> val peerSessionId: Long defined in net.corda.node.services.statemachine.FlowStateMachineImpl.createSessionData[LocalVariableDescriptor]

'payload' @ [289:43] ==> value-parameter payload: Any defined in net.corda.node.services.statemachine.FlowStateMachineImpl.createSessionData[ValueParameterDescriptorImpl]

'Suspendable' @ [292:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'suspend' @ [293:79] ==> @Suspendable private final fun suspend(ioRequest: FlowIORequest): Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'SendOnly' @ [293:87] ==> public constructor SendOnly(session: FlowSession, message: SessionMessage) defined in net.corda.node.services.statemachine.SendOnly[ClassConstructorDescriptorImpl]

'session' @ [293:96] ==> value-parameter session: FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendInternal[ValueParameterDescriptorImpl]

'message' @ [293:105] ==> value-parameter message: SessionMessage defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendInternal[ValueParameterDescriptorImpl]

'waitForMessage' @ [298:16] ==> @Suspendable private final fun <M : ExistingSessionMessage> waitForMessage(receiveRequest: ReceiveRequest<M>): ReceivedSessionMessage<M> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : ExistingSessionMessage> -> M

'ReceiveOnly' @ [298:31] ==> public constructor ReceiveOnly<T : SessionMessage>(session: FlowSession, receiveType: Class<M>, userReceiveType: Class<*>?) defined in net.corda.node.services.statemachine.ReceiveOnly[ClassConstructorDescriptorImpl]
Inferred types:
    <T : SessionMessage> -> M

'session' @ [298:43] ==> value-parameter session: FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl.receiveInternal[ValueParameterDescriptorImpl]

'java' @ [298:61] ==> public val <T> KClass<M>.java: Class<M> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> M

'userReceiveType' @ [298:67] ==> value-parameter userReceiveType: Class<*>? defined in net.corda.node.services.statemachine.FlowStateMachineImpl.receiveInternal[ValueParameterDescriptorImpl]

'waitForMessage' @ [305:16] ==> @Suspendable private final fun <M : ExistingSessionMessage> waitForMessage(receiveRequest: ReceiveRequest<M>): ReceivedSessionMessage<M> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : ExistingSessionMessage> -> M

'SendAndReceive' @ [305:31] ==> public constructor SendAndReceive<T : SessionMessage>(session: FlowSession, message: SessionMessage, receiveType: Class<M>, userReceiveType: Class<*>?) defined in net.corda.node.services.statemachine.SendAndReceive[ClassConstructorDescriptorImpl]
Inferred types:
    <T : SessionMessage> -> M

'session' @ [305:46] ==> value-parameter session: FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceiveInternal[ValueParameterDescriptorImpl]

'message' @ [305:55] ==> value-parameter message: SessionMessage defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceiveInternal[ValueParameterDescriptorImpl]

'java' @ [305:73] ==> public val <T> KClass<M>.java: Class<M> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> M

'userReceiveType' @ [305:79] ==> value-parameter userReceiveType: Class<*>? defined in net.corda.node.services.statemachine.FlowStateMachineImpl.sendAndReceiveInternal[ValueParameterDescriptorImpl]

'Suspendable' @ [308:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'openSessions' @ [310:16] ==> internal final val openSessions: HashMap<Pair<FlowLogic<*>, Party>, FlowSession> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'Pair' @ [310:29] ==> public constructor Pair<out A, out B>(first: FlowLogic<*>, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> FlowLogic<*>
    <out B> -> Party

'sessionFlow' @ [310:34] ==> value-parameter sessionFlow: FlowLogic<*> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.getConfirmedSessionIfPresent[ValueParameterDescriptorImpl]

'otherParty' @ [310:47] ==> value-parameter otherParty: Party defined in net.corda.node.services.statemachine.FlowStateMachineImpl.getConfirmedSessionIfPresent[ValueParameterDescriptorImpl]

'apply' @ [310:61] ==> @InlineOnly public inline fun <T> FlowSession.apply(block: (FlowSession).() -> Unit): FlowSession defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlowSession

'state' @ [311:17] ==> public final var state: FlowSessionState defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'waitForConfirmation' @ [313:17] ==> @Suspendable private final fun FlowSession.waitForConfirmation(): Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'Suspendable' @ [318:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'getConfirmedSessionIfPresent' @ [320:16] ==> @Suspendable private final fun getConfirmedSessionIfPresent(otherParty: Party, sessionFlow: FlowLogic<*>): FlowSession? defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'otherParty' @ [320:45] ==> value-parameter otherParty: Party defined in net.corda.node.services.statemachine.FlowStateMachineImpl.getConfirmedSession[ValueParameterDescriptorImpl]

'sessionFlow' @ [320:57] ==> value-parameter sessionFlow: FlowLogic<*> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.getConfirmedSession[ValueParameterDescriptorImpl]

'startNewSession' @ [321:17] ==> @Suspendable private final fun startNewSession(otherParty: Party, sessionFlow: FlowLogic<*>, firstPayload: Any?, waitForConfirmation: Boolean, retryable: Boolean = ...): FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'otherParty' @ [321:33] ==> value-parameter otherParty: Party defined in net.corda.node.services.statemachine.FlowStateMachineImpl.getConfirmedSession[ValueParameterDescriptorImpl]

'sessionFlow' @ [321:45] ==> value-parameter sessionFlow: FlowLogic<*> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.getConfirmedSession[ValueParameterDescriptorImpl]

'Suspendable' @ [330:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'logger' @ [336:9] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'trace' @ [336:16] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'otherParty' @ [336:56] ==> value-parameter otherParty: Party defined in net.corda.node.services.statemachine.FlowStateMachineImpl.startNewSession[ValueParameterDescriptorImpl]

'FlowSession' @ [337:23] ==> public constructor FlowSession(flow: FlowLogic<*>, ourSessionId: Long, initiatingParty: Party?, state: FlowSessionState, retryable: Boolean = ...) defined in net.corda.node.services.statemachine.FlowSession[ClassConstructorDescriptorImpl]

'sessionFlow' @ [337:35] ==> value-parameter sessionFlow: FlowLogic<*> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.startNewSession[ValueParameterDescriptorImpl]

'random63BitValue' @ [337:48] ==> public fun random63BitValue(): Long defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'Initiating' @ [337:91] ==> public constructor Initiating(otherParty: Party) defined in net.corda.node.services.statemachine.FlowSessionState.Initiating[ClassConstructorDescriptorImpl]

'otherParty' @ [337:102] ==> value-parameter otherParty: Party defined in net.corda.node.services.statemachine.FlowStateMachineImpl.startNewSession[ValueParameterDescriptorImpl]

'retryable' @ [337:115] ==> value-parameter retryable: Boolean = ... defined in net.corda.node.services.statemachine.FlowStateMachineImpl.startNewSession[ValueParameterDescriptorImpl]

'openSessions' @ [338:9] ==> internal final val openSessions: HashMap<Pair<FlowLogic<*>, Party>, FlowSession> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'Pair' @ [338:22] ==> public constructor Pair<out A, out B>(first: FlowLogic<*>, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> FlowLogic<*>
    <out B> -> Party

'sessionFlow' @ [338:27] ==> value-parameter sessionFlow: FlowLogic<*> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.startNewSession[ValueParameterDescriptorImpl]

'otherParty' @ [338:40] ==> value-parameter otherParty: Party defined in net.corda.node.services.statemachine.FlowStateMachineImpl.startNewSession[ValueParameterDescriptorImpl]

'session' @ [338:55] ==> val session: FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl.startNewSession[LocalVariableDescriptor]

'component1' @ [339:14] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [339:23] ==> public final operator fun component2(): Class<out FlowLogic<*>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'sessionFlow' @ [339:46] ==> value-parameter sessionFlow: FlowLogic<*> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.startNewSession[ValueParameterDescriptorImpl]

'javaClass' @ [339:58] ==> public val <T : Any> FlowLogic<*>.javaClass: Class<FlowLogic<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> FlowLogic<*>

'flowVersionAndInitiatingClass' @ [339:68] ==> @Suppress public val Class<out FlowLogic<*>>.flowVersionAndInitiatingClass: Pair<Int, Class<out FlowLogic<*>>> defined in net.corda.node.services.statemachine in file FlowStateMachineImpl.kt[PropertyDescriptorImpl]

'SessionInit' @ [340:27] ==> public constructor SessionInit(initiatorSessionId: Long, initiatingFlowClass: String, flowVersion: Int, appName: String, firstPayload: Any?) defined in net.corda.node.services.statemachine.SessionInit[ClassConstructorDescriptorImpl]

'session' @ [340:39] ==> val session: FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl.startNewSession[LocalVariableDescriptor]

'ourSessionId' @ [340:47] ==> public final val ourSessionId: Long defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'initiatingFlowClass' @ [340:61] ==> val initiatingFlowClass: Class<out FlowLogic<*>> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.startNewSession[LocalVariableDescriptor]

'name' @ [340:81] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out FlowLogic<*>)

'version' @ [340:87] ==> val version: Int defined in net.corda.node.services.statemachine.FlowStateMachineImpl.startNewSession[LocalVariableDescriptor]

'firstPayload' @ [340:111] ==> value-parameter firstPayload: Any? defined in net.corda.node.services.statemachine.FlowStateMachineImpl.startNewSession[ValueParameterDescriptorImpl]

'sendInternal' @ [341:9] ==> @Suspendable private final fun sendInternal(session: FlowSession, message: SessionMessage): Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'session' @ [341:22] ==> val session: FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl.startNewSession[LocalVariableDescriptor]

'sessionInit' @ [341:31] ==> val sessionInit: SessionInit defined in net.corda.node.services.statemachine.FlowStateMachineImpl.startNewSession[LocalVariableDescriptor]

'waitForConfirmation' @ [342:13] ==> value-parameter waitForConfirmation: Boolean defined in net.corda.node.services.statemachine.FlowStateMachineImpl.startNewSession[ValueParameterDescriptorImpl]

'session' @ [343:13] ==> val session: FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl.startNewSession[LocalVariableDescriptor]

'waitForConfirmation' @ [343:21] ==> @Suspendable private final fun FlowSession.waitForConfirmation(): Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'session' @ [345:16] ==> val session: FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl.startNewSession[LocalVariableDescriptor]

'Suspendable' @ [348:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'receiveRequest' @ [350:16] ==> value-parameter receiveRequest: ReceiveRequest<M> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForMessage[ValueParameterDescriptorImpl]

'suspendAndExpectReceive' @ [350:31] ==> @Suspendable private final fun ReceiveRequest<*>.suspendAndExpectReceive(): ReceivedSessionMessage<*> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'confirmReceiveType' @ [350:57] ==> private final fun <M : ExistingSessionMessage> ReceivedSessionMessage<*>.confirmReceiveType(receiveRequest: ReceiveRequest<M>): ReceivedSessionMessage<M> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : ExistingSessionMessage> -> M

'receiveRequest' @ [350:76] ==> value-parameter receiveRequest: ReceiveRequest<M> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.waitForMessage[ValueParameterDescriptorImpl]

'Suspendable' @ [353:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'session' @ [355:32] ==> public abstract val session: FlowSession defined in net.corda.node.services.statemachine.ReceiveRequest[PropertyDescriptorImpl]

'receivedMessages' @ [355:40] ==> public final val receivedMessages: ConcurrentLinkedQueue<ReceivedSessionMessage<*>> defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'poll' @ [355:57] ==> public open fun poll(): (ReceivedSessionMessage<*>..ReceivedSessionMessage<*>?) defined in java.util.concurrent.ConcurrentLinkedQueue[JavaMethodDescriptor]

'pollForMessage' @ [357:29] ==> local final fun pollForMessage(): (ReceivedSessionMessage<*>..ReceivedSessionMessage<*>?) defined in net.corda.node.services.statemachine.FlowStateMachineImpl.suspendAndExpectReceive[SimpleFunctionDescriptorImpl]

'if (polledMessage != null) {
            if (this is SendAndReceive) {
                // Since we've already received the message, we downgrade to a send only to get the payload out and not
                // inadvertently block
                suspend(SendOnly(session, message))
            }
            polledMessage
        } else {
            // Suspend while we wait for a receive
            suspend(this)
            pollForMessage() ?:
                    throw IllegalStateException("Was expecting a ${receiveType.simpleName} but instead got nothing for $this")
        }' @ [358:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReceivedSessionMessage<*>, elseBranch: ReceivedSessionMessage<*>): ReceivedSessionMessage<*>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ReceivedSessionMessage<*>

'polledMessage' @ [358:20] ==> val polledMessage: (ReceivedSessionMessage<*>..ReceivedSessionMessage<*>?) defined in net.corda.node.services.statemachine.FlowStateMachineImpl.suspendAndExpectReceive[LocalVariableDescriptor]

'this' @ [359:17] ==> <this> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.suspendAndExpectReceive[ReceiverParameterDescriptorImpl]

'suspend' @ [362:17] ==> @Suspendable private final fun suspend(ioRequest: FlowIORequest): Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'SendOnly' @ [362:25] ==> public constructor SendOnly(session: FlowSession, message: SessionMessage) defined in net.corda.node.services.statemachine.SendOnly[ClassConstructorDescriptorImpl]

'session' @ [362:34] ==> public abstract val session: FlowSession defined in net.corda.node.services.statemachine.ReceiveRequest[PropertyDescriptorImpl]

'message' @ [362:43] ==> public open val message: SessionMessage defined in net.corda.node.services.statemachine.SendAndReceive[PropertyDescriptorImpl]

'polledMessage' @ [364:13] ==> val polledMessage: (ReceivedSessionMessage<*>..ReceivedSessionMessage<*>?) defined in net.corda.node.services.statemachine.FlowStateMachineImpl.suspendAndExpectReceive[LocalVariableDescriptor]

'suspend' @ [367:13] ==> @Suspendable private final fun suspend(ioRequest: FlowIORequest): Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'this' @ [367:21] ==> <this> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.suspendAndExpectReceive[ReceiverParameterDescriptorImpl]

'pollForMessage' @ [368:13] ==> local final fun pollForMessage(): (ReceivedSessionMessage<*>..ReceivedSessionMessage<*>?) defined in net.corda.node.services.statemachine.FlowStateMachineImpl.suspendAndExpectReceive[SimpleFunctionDescriptorImpl]

'IllegalStateException' @ [369:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'receiveType' @ [369:68] ==> public abstract val receiveType: Class<out SessionMessage> defined in net.corda.node.services.statemachine.ReceiveRequest[PropertyDescriptorImpl]

'simpleName' @ [369:80] ==> public final val <T : (Any..Any?)> Class<out SessionMessage>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out SessionMessage)

'this' @ [369:121] ==> <this> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.suspendAndExpectReceive[ReceiverParameterDescriptorImpl]

'receiveRequest' @ [375:23] ==> value-parameter receiveRequest: ReceiveRequest<M> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.confirmReceiveType[ValueParameterDescriptorImpl]

'session' @ [375:38] ==> public abstract val session: FlowSession defined in net.corda.node.services.statemachine.ReceiveRequest[PropertyDescriptorImpl]

'receiveRequest' @ [376:27] ==> value-parameter receiveRequest: ReceiveRequest<M> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.confirmReceiveType[ValueParameterDescriptorImpl]

'receiveType' @ [376:42] ==> public abstract val receiveType: Class<M> defined in net.corda.node.services.statemachine.ReceiveRequest[PropertyDescriptorImpl]

'if (receiveType.isInstance(message)) {
            @Suppress("UNCHECKED_CAST")
            return this as ReceivedSessionMessage<M>
        } else if (message is SessionEnd) {
            openSessions.values.remove(session)
            if (message is ErrorSessionEnd) {
                session.erroredEnd(message)
            } else {
                val expectedType = receiveRequest.userReceiveType?.name ?: receiveType.simpleName
                throw UnexpectedFlowEndException("Counterparty flow on ${session.state.sendToParty} has completed without " +
                        "sending a $expectedType")
            }
        } else {
            throw IllegalStateException("Was expecting a ${receiveType.simpleName} but instead got $message for $receiveRequest")
        }' @ [377:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'receiveType' @ [377:13] ==> val receiveType: Class<M> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.confirmReceiveType[LocalVariableDescriptor]

'isInstance' @ [377:25] ==> public open fun isInstance(p0: (Any..Any?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'message' @ [377:36] ==> public final val message: ExistingSessionMessage defined in net.corda.node.services.statemachine.ReceivedSessionMessage[PropertyDescriptorImpl]

'Suppress' @ [378:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'this' @ [379:20] ==> <this> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.confirmReceiveType[ReceiverParameterDescriptorImpl]

'if (message is SessionEnd) {
            openSessions.values.remove(session)
            if (message is ErrorSessionEnd) {
                session.erroredEnd(message)
            } else {
                val expectedType = receiveRequest.userReceiveType?.name ?: receiveType.simpleName
                throw UnexpectedFlowEndException("Counterparty flow on ${session.state.sendToParty} has completed without " +
                        "sending a $expectedType")
            }
        } else {
            throw IllegalStateException("Was expecting a ${receiveType.simpleName} but instead got $message for $receiveRequest")
        }' @ [380:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'message' @ [380:20] ==> public final val message: ExistingSessionMessage defined in net.corda.node.services.statemachine.ReceivedSessionMessage[PropertyDescriptorImpl]

'openSessions' @ [381:13] ==> internal final val openSessions: HashMap<Pair<FlowLogic<*>, Party>, FlowSession> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'values' @ [381:26] ==> public open val values: MutableCollection<FlowSession> defined in java.util.HashMap[JavaPropertyDescriptor]

'remove' @ [381:33] ==> public abstract fun remove(element: FlowSession): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'session' @ [381:40] ==> val session: FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl.confirmReceiveType[LocalVariableDescriptor]

'if (message is ErrorSessionEnd) {
                session.erroredEnd(message)
            } else {
                val expectedType = receiveRequest.userReceiveType?.name ?: receiveType.simpleName
                throw UnexpectedFlowEndException("Counterparty flow on ${session.state.sendToParty} has completed without " +
                        "sending a $expectedType")
            }' @ [382:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'message' @ [382:17] ==> public final val message: ExistingSessionMessage defined in net.corda.node.services.statemachine.ReceivedSessionMessage[PropertyDescriptorImpl]

'session' @ [383:17] ==> val session: FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl.confirmReceiveType[LocalVariableDescriptor]

'erroredEnd' @ [383:25] ==> private final fun FlowSession.erroredEnd(end: ErrorSessionEnd): Nothing defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'message' @ [383:36] ==> public final val message: ExistingSessionMessage defined in net.corda.node.services.statemachine.ReceivedSessionMessage[PropertyDescriptorImpl]

'receiveRequest' @ [385:36] ==> value-parameter receiveRequest: ReceiveRequest<M> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.confirmReceiveType[ValueParameterDescriptorImpl]

'userReceiveType' @ [385:51] ==> public abstract val userReceiveType: Class<*>? defined in net.corda.node.services.statemachine.ReceiveRequest[PropertyDescriptorImpl]

'name' @ [385:68] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'receiveType' @ [385:76] ==> val receiveType: Class<M> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.confirmReceiveType[LocalVariableDescriptor]

'simpleName' @ [385:88] ==> public final val <T : (Any..Any?)> Class<M>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> M

'UnexpectedFlowEndException' @ [386:23] ==> public constructor UnexpectedFlowEndException(msg: String) defined in net.corda.core.flows.UnexpectedFlowEndException[DeserializedClassConstructorDescriptor]

'+' @ [386:50] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'session' @ [386:74] ==> val session: FlowSession defined in net.corda.node.services.statemachine.FlowStateMachineImpl.confirmReceiveType[LocalVariableDescriptor]

'state' @ [386:82] ==> public final var state: FlowSessionState defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'sendToParty' @ [386:88] ==> public abstract val sendToParty: Party defined in net.corda.node.services.statemachine.FlowSessionState[PropertyDescriptorImpl]

'expectedType' @ [387:37] ==> val expectedType: (String..String?) defined in net.corda.node.services.statemachine.FlowStateMachineImpl.confirmReceiveType[LocalVariableDescriptor]

'IllegalStateException' @ [390:19] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'receiveType' @ [390:60] ==> val receiveType: Class<M> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.confirmReceiveType[LocalVariableDescriptor]

'simpleName' @ [390:72] ==> public final val <T : (Any..Any?)> Class<M>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> M

'message' @ [390:101] ==> public final val message: ExistingSessionMessage defined in net.corda.node.services.statemachine.ReceivedSessionMessage[PropertyDescriptorImpl]

'receiveRequest' @ [390:114] ==> value-parameter receiveRequest: ReceiveRequest<M> defined in net.corda.node.services.statemachine.FlowStateMachineImpl.confirmReceiveType[ValueParameterDescriptorImpl]

'if (end.errorResponse != null) {
            @Suppress("PLATFORM_CLASS_MAPPED_TO_KOTLIN")
            (end.errorResponse as java.lang.Throwable).fillInStackTrace()
            throw end.errorResponse
        } else {
            throw UnexpectedFlowEndException("Counterparty flow on ${state.sendToParty} had an internal error and has terminated")
        }' @ [395:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'end' @ [395:13] ==> value-parameter end: ErrorSessionEnd defined in net.corda.node.services.statemachine.FlowStateMachineImpl.erroredEnd[ValueParameterDescriptorImpl]

'errorResponse' @ [395:17] ==> public final val errorResponse: FlowException? defined in net.corda.node.services.statemachine.ErrorSessionEnd[PropertyDescriptorImpl]

'Suppress' @ [396:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'end' @ [397:14] ==> value-parameter end: ErrorSessionEnd defined in net.corda.node.services.statemachine.FlowStateMachineImpl.erroredEnd[ValueParameterDescriptorImpl]

'errorResponse' @ [397:18] ==> public final val errorResponse: FlowException? defined in net.corda.node.services.statemachine.ErrorSessionEnd[PropertyDescriptorImpl]

'fillInStackTrace' @ [397:56] ==> public open fun fillInStackTrace(): (Throwable..Throwable?) defined in java.lang.Throwable[JavaMethodDescriptor]

'end' @ [398:19] ==> value-parameter end: ErrorSessionEnd defined in net.corda.node.services.statemachine.FlowStateMachineImpl.erroredEnd[ValueParameterDescriptorImpl]

'errorResponse' @ [398:23] ==> public final val errorResponse: FlowException? defined in net.corda.node.services.statemachine.ErrorSessionEnd[PropertyDescriptorImpl]

'UnexpectedFlowEndException' @ [400:19] ==> public constructor UnexpectedFlowEndException(msg: String) defined in net.corda.core.flows.UnexpectedFlowEndException[DeserializedClassConstructorDescriptor]

'state' @ [400:70] ==> public final var state: FlowSessionState defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'sendToParty' @ [400:76] ==> public abstract val sendToParty: Party defined in net.corda.node.services.statemachine.FlowSessionState[PropertyDescriptorImpl]

'Suspendable' @ [404:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'txTrampoline' @ [408:9] ==> @Transient private final var txTrampoline: DatabaseTransaction? defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'DatabaseTransactionManager' @ [408:25] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'setThreadLocalTx' @ [408:52] ==> public final fun setThreadLocalTx(tx: DatabaseTransaction?): DatabaseTransaction? defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'ioRequest' @ [409:13] ==> value-parameter ioRequest: FlowIORequest defined in net.corda.node.services.statemachine.FlowStateMachineImpl.suspend[ValueParameterDescriptorImpl]

'waitingForResponse' @ [410:13] ==> internal final var waitingForResponse: WaitingRequest? defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'ioRequest' @ [410:34] ==> value-parameter ioRequest: FlowIORequest defined in net.corda.node.services.statemachine.FlowStateMachineImpl.suspend[ValueParameterDescriptorImpl]

'parkAndSerialize' @ [413:9] ==> public final fun parkAndSerialize(p0: ((raw (Fiber<(Any..Any?)>..Fiber<*>?), (ByteArraySerializer..ByteArraySerializer?)) -> Unit..((raw (Fiber<(Any..Any?)>..Fiber<*>?), (ByteArraySerializer..ByteArraySerializer?)) -> Unit)?)): Unit defined in co.paralleluniverse.fibers.Fiber[SamAdapterFunctionDescriptor]

'logger' @ [414:13] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'trace' @ [414:20] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'ioRequest' @ [414:43] ==> value-parameter ioRequest: FlowIORequest defined in net.corda.node.services.statemachine.FlowStateMachineImpl.suspend[ValueParameterDescriptorImpl]

'DatabaseTransactionManager' @ [417:17] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'setThreadLocalTx' @ [417:44] ==> public final fun setThreadLocalTx(tx: DatabaseTransaction?): DatabaseTransaction? defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'txTrampoline' @ [417:61] ==> @Transient private final var txTrampoline: DatabaseTransaction? defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'txTrampoline' @ [418:17] ==> @Transient private final var txTrampoline: DatabaseTransaction? defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'invoke' @ [419:17] ==> public abstract operator fun invoke(p1: FlowIORequest): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'ioRequest' @ [419:33] ==> value-parameter ioRequest: FlowIORequest defined in net.corda.node.services.statemachine.FlowStateMachineImpl.suspend[ValueParameterDescriptorImpl]

'exceptionDuringSuspend' @ [423:17] ==> var exceptionDuringSuspend: Throwable? defined in net.corda.node.services.statemachine.FlowStateMachineImpl.suspend[LocalVariableDescriptor]

't' @ [423:42] ==> val t: Throwable defined in net.corda.node.services.statemachine.FlowStateMachineImpl.suspend.<anonymous>[LocalVariableDescriptor]

'logger' @ [424:17] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'trace' @ [424:24] ==> public abstract fun trace(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

't' @ [424:117] ==> val t: Throwable defined in net.corda.node.services.statemachine.FlowStateMachineImpl.suspend.<anonymous>[LocalVariableDescriptor]

'resume' @ [425:17] ==> internal final fun resume(scheduler: FiberScheduler): Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'scheduler' @ [425:24] ==> public final val <R> FlowStateMachineImpl<R>.scheduler: (FiberScheduler..FiberScheduler?)[MyPropertyDescriptor]
Inferred types:
    <R> -> R

'createTransaction' @ [429:9] ==> private final fun createTransaction(): Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'exceptionDuringSuspend' @ [432:9] ==> var exceptionDuringSuspend: Throwable? defined in net.corda.node.services.statemachine.FlowStateMachineImpl.suspend[LocalVariableDescriptor]

'let' @ [432:33] ==> @InlineOnly public inline fun <T, R> Throwable.let(block: (Throwable) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Throwable
    <R> -> Nothing

'it' @ [432:45] ==> value-parameter it: Throwable defined in net.corda.node.services.statemachine.FlowStateMachineImpl.suspend.<anonymous>[ValueParameterDescriptorImpl]

'logger' @ [433:9] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'trace' @ [433:16] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'ioRequest' @ [433:39] ==> value-parameter ioRequest: FlowIORequest defined in net.corda.node.services.statemachine.FlowStateMachineImpl.suspend[ValueParameterDescriptorImpl]

'if (fromCheckpoint) {
                logger.info("Resumed from checkpoint")
                fromCheckpoint = false
                Fiber.unparkDeserialized(this, scheduler)
            } else if (state == State.NEW) {
                logger.trace("Started")
                start()
            } else {
                Fiber.unpark(this, QUASAR_UNBLOCKER)
            }' @ [438:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'fromCheckpoint' @ [438:17] ==> @Transient internal final var fromCheckpoint: Boolean defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'logger' @ [439:17] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'info' @ [439:24] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'fromCheckpoint' @ [440:17] ==> @Transient internal final var fromCheckpoint: Boolean defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'unparkDeserialized' @ [441:23] ==> public open fun <V : (Any..Any?)> unparkDeserialized(p0: (Fiber<(Unit..Unit?)>..Fiber<(Unit..Unit?)>?), p1: (FiberScheduler..FiberScheduler?)): (Fiber<(Unit..Unit?)>..Fiber<(Unit..Unit?)>?) defined in co.paralleluniverse.fibers.Fiber[JavaMethodDescriptor]
Inferred types:
    <V : (Any..Any?)> -> (kotlin.Unit..kotlin.Unit?)

'this' @ [441:42] ==> <this> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[LazyClassReceiverParameterDescriptor]

'scheduler' @ [441:48] ==> value-parameter scheduler: FiberScheduler defined in net.corda.node.services.statemachine.FlowStateMachineImpl.resume[ValueParameterDescriptorImpl]

'if (state == State.NEW) {
                logger.trace("Started")
                start()
            } else {
                Fiber.unpark(this, QUASAR_UNBLOCKER)
            }' @ [442:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'state' @ [442:24] ==> public final val <R> FlowStateMachineImpl<R>.state: (Strand.State..Strand.State?)[MyPropertyDescriptor]
Inferred types:
    <R> -> R

'NEW' @ [442:39] ==> enum entry NEW defined in co.paralleluniverse.strands.Strand.State[FakeCallableDescriptorForObject]

'logger' @ [443:17] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'trace' @ [443:24] ==> public abstract fun trace(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'start' @ [444:17] ==> public final fun start(): (Fiber<(Unit..Unit?)>..Fiber<(Unit..Unit?)>?) defined in net.corda.node.services.statemachine.FlowStateMachineImpl[JavaMethodDescriptor]

'unpark' @ [446:23] ==> public open fun unpark(p0: (Strand..Strand?), p1: (Any..Any?)): Unit defined in co.paralleluniverse.fibers.Fiber[JavaMethodDescriptor]

'this' @ [446:30] ==> <this> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[LazyClassReceiverParameterDescriptor]

'QUASAR_UNBLOCKER' @ [446:36] ==> private final val QUASAR_UNBLOCKER: Any defined in net.corda.node.services.statemachine.FlowStateMachineImpl.Companion[PropertyDescriptorImpl]

'logger' @ [449:13] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'error' @ [449:20] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

't' @ [449:49] ==> val t: Throwable defined in net.corda.node.services.statemachine.FlowStateMachineImpl.resume[LocalVariableDescriptor]

'if (success) "Success" else "Failure"' @ [459:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'success' @ [459:45] ==> value-parameter success: Boolean = ... defined in net.corda.node.services.statemachine.FlowStateMachineImpl.recordDuration[ValueParameterDescriptorImpl]

'logic' @ [459:82] ==> public final val logic: FlowLogic<R> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'javaClass' @ [459:88] ==> public val <T : Any> FlowLogic<R>.javaClass: Class<FlowLogic<R>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> FlowLogic<R>

'name' @ [459:98] ==> public final val <T : (Any..Any?)> Class<FlowLogic<R>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FlowLogic<R>

'serviceHub' @ [460:21] ==> @Transient public open lateinit var serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'monitoringService' @ [460:32] ==> public abstract val monitoringService: MonitoringService defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'metrics' @ [460:50] ==> public final val metrics: MetricRegistry defined in net.corda.node.services.api.MonitoringService[PropertyDescriptorImpl]

'timer' @ [460:58] ==> public open fun timer(p0: (String..String?)): (Timer..Timer?) defined in com.codahale.metrics.MetricRegistry[JavaMethodDescriptor]

'timerName' @ [460:64] ==> val timerName: String defined in net.corda.node.services.statemachine.FlowStateMachineImpl.recordDuration[LocalVariableDescriptor]

'-' @ [462:24] ==> public final operator fun minus(other: Long): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'nanoTime' @ [462:31] ==> public open fun nanoTime(): Long defined in java.lang.System[JavaMethodDescriptor]

'startTime' @ [462:44] ==> value-parameter startTime: Long defined in net.corda.node.services.statemachine.FlowStateMachineImpl.recordDuration[ValueParameterDescriptorImpl]

'timer' @ [463:9] ==> val timer: (Timer..Timer?) defined in net.corda.node.services.statemachine.FlowStateMachineImpl.recordDuration[LocalVariableDescriptor]

'update' @ [463:15] ==> public open fun update(p0: Long, p1: (TimeUnit..TimeUnit?)): Unit defined in com.codahale.metrics.Timer[JavaMethodDescriptor]

'duration' @ [463:22] ==> val duration: Long defined in net.corda.node.services.statemachine.FlowStateMachineImpl.recordDuration[LocalVariableDescriptor]

'NANOSECONDS' @ [463:41] ==> enum entry NANOSECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'Suppress' @ [467:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'this' @ [469:29] ==> <this> defined in net.corda.node.services.statemachine.flowVersionAndInitiatingClass[ReceiverParameterDescriptorImpl]

'current' @ [472:26] ==> var current: Class<*> defined in net.corda.node.services.statemachine.<get-flowVersionAndInitiatingClass>[LocalVariableDescriptor]

'getDeclaredAnnotation' @ [472:34] ==> public open fun <A : (Annotation..Annotation?)> getDeclaredAnnotation(p0: (Class<(InitiatingFlow..InitiatingFlow?)>..Class<(InitiatingFlow..InitiatingFlow?)>?)): (InitiatingFlow..InitiatingFlow?) defined in java.lang.Class[JavaMethodDescriptor]
Inferred types:
    <A : (Annotation..Annotation?)> -> (net.corda.core.flows.InitiatingFlow..net.corda.core.flows.InitiatingFlow?)

'InitiatingFlow' @ [472:56] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'java' @ [472:78] ==> public val <T> KClass<InitiatingFlow>.java: Class<InitiatingFlow> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> InitiatingFlow

'annotation' @ [473:13] ==> val annotation: (InitiatingFlow..InitiatingFlow?) defined in net.corda.node.services.statemachine.<get-flowVersionAndInitiatingClass>[LocalVariableDescriptor]

'found' @ [474:17] ==> var found: Pair<Int, Class<out FlowLogic<*>>>? defined in net.corda.node.services.statemachine.<get-flowVersionAndInitiatingClass>[LocalVariableDescriptor]

'IllegalArgumentException' @ [474:38] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'InitiatingFlow' @ [474:66] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'java' @ [474:88] ==> public val <T> KClass<InitiatingFlow>.java: Class<InitiatingFlow> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> InitiatingFlow

'name' @ [474:93] ==> public final val <T : (Any..Any?)> Class<InitiatingFlow>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> InitiatingFlow

'require' @ [475:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'annotation' @ [475:21] ==> val annotation: (InitiatingFlow..InitiatingFlow?) defined in net.corda.node.services.statemachine.<get-flowVersionAndInitiatingClass>[LocalVariableDescriptor]

'version' @ [475:32] ==> public final val version: Int defined in net.corda.core.flows.InitiatingFlow[DeserializedPropertyDescriptor]

'found' @ [476:13] ==> var found: Pair<Int, Class<out FlowLogic<*>>>? defined in net.corda.node.services.statemachine.<get-flowVersionAndInitiatingClass>[LocalVariableDescriptor]

'annotation' @ [476:21] ==> val annotation: (InitiatingFlow..InitiatingFlow?) defined in net.corda.node.services.statemachine.<get-flowVersionAndInitiatingClass>[LocalVariableDescriptor]

'version' @ [476:32] ==> public final val version: Int defined in net.corda.core.flows.InitiatingFlow[DeserializedPropertyDescriptor]

'current' @ [476:44] ==> var current: Class<*> defined in net.corda.node.services.statemachine.<get-flowVersionAndInitiatingClass>[LocalVariableDescriptor]

'current' @ [478:9] ==> var current: Class<*> defined in net.corda.node.services.statemachine.<get-flowVersionAndInitiatingClass>[LocalVariableDescriptor]

'current' @ [478:19] ==> var current: Class<*> defined in net.corda.node.services.statemachine.<get-flowVersionAndInitiatingClass>[LocalVariableDescriptor]

'superclass' @ [478:27] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.superclass: (Class<out Any?>..Class<out Any?>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'found' @ [479:23] ==> var found: Pair<Int, Class<out FlowLogic<*>>>? defined in net.corda.node.services.statemachine.<get-flowVersionAndInitiatingClass>[LocalVariableDescriptor]

'IllegalArgumentException' @ [480:22] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'+' @ [480:47] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'name' @ [480:49] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out FlowLogic<*>)

'InitiatingFlow' @ [481:20] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'java' @ [481:42] ==> public val <T> KClass<InitiatingFlow>.java: Class<InitiatingFlow> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> InitiatingFlow

'name' @ [481:47] ==> public final val <T : (Any..Any?)> Class<InitiatingFlow>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> InitiatingFlow

