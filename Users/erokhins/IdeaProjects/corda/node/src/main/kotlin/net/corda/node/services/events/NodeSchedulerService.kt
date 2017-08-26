'ThreadSafe' @ [41:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'newSingleThreadExecutor' @ [43:85] ==> public open fun newSingleThreadExecutor(): (ExecutorService..ExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'ReusableLatch' @ [44:77] ==> public constructor ReusableLatch() defined in org.apache.activemq.artemis.utils.ReusableLatch[JavaClassConstructorDescriptor]

'SingletonSerializeAsToken' @ [46:25] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'loggerFor' @ [49:27] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> NodeSchedulerService

'PersistentMap' @ [52:20] ==> public constructor PersistentMap<K, V, E, out EK>(toPersistentEntityKey: (StateRef) -> PersistentStateRef, fromPersistentEntity: (NodeSchedulerService.PersistentScheduledState) -> Pair<StateRef, ScheduledStateRef>, toPersistentEntity: (key: StateRef, value: ScheduledStateRef) -> NodeSchedulerService.PersistentScheduledState, persistentEntityClass: Class<NodeSchedulerService.PersistentScheduledState>) defined in net.corda.node.utilities.PersistentMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> StateRef
    <V> -> ScheduledStateRef
    <E> -> PersistentScheduledState
    <out EK> -> PersistentStateRef

'PersistentStateRef' @ [53:47] ==> public constructor PersistentStateRef(txId: String? = ..., index: Int? = ...) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'it' @ [53:66] ==> value-parameter it: StateRef defined in net.corda.node.services.events.NodeSchedulerService.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [53:69] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'toString' @ [53:76] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'it' @ [53:88] ==> value-parameter it: StateRef defined in net.corda.node.services.events.NodeSchedulerService.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [53:91] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'it' @ [56:36] ==> value-parameter it: NodeSchedulerService.PersistentScheduledState defined in net.corda.node.services.events.NodeSchedulerService.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'output' @ [56:39] ==> @EmbeddedId public final var output: PersistentStateRef defined in net.corda.node.services.events.NodeSchedulerService.PersistentScheduledState[PropertyDescriptorImpl]

'txId' @ [56:46] ==> @field:Column public final var txId: String? defined in net.corda.core.schemas.PersistentStateRef[DeserializedPropertyDescriptor]

'IllegalStateException' @ [56:60] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'it' @ [57:37] ==> value-parameter it: NodeSchedulerService.PersistentScheduledState defined in net.corda.node.services.events.NodeSchedulerService.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'output' @ [57:40] ==> @EmbeddedId public final var output: PersistentStateRef defined in net.corda.node.services.events.NodeSchedulerService.PersistentScheduledState[PropertyDescriptorImpl]

'index' @ [57:47] ==> @field:Column public final var index: Int? defined in net.corda.core.schemas.PersistentStateRef[DeserializedPropertyDescriptor]

'IllegalStateException' @ [57:62] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'Pair' @ [58:25] ==> public constructor Pair<out A, out B>(first: StateRef, second: ScheduledStateRef) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> StateRef
    <out B> -> ScheduledStateRef

'StateRef' @ [58:30] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'parse' @ [58:50] ==> @JvmStatic public final fun parse(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'txId' @ [58:56] ==> var txId: String defined in net.corda.node.services.events.NodeSchedulerService.Companion.createMap.<anonymous>[LocalVariableDescriptor]

'index' @ [58:63] ==> var index: Int defined in net.corda.node.services.events.NodeSchedulerService.Companion.createMap.<anonymous>[LocalVariableDescriptor]

'ScheduledStateRef' @ [59:29] ==> public constructor ScheduledStateRef(ref: StateRef, scheduledAt: Instant) defined in net.corda.core.contracts.ScheduledStateRef[DeserializedClassConstructorDescriptor]

'StateRef' @ [59:47] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'parse' @ [59:67] ==> @JvmStatic public final fun parse(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'txId' @ [59:73] ==> var txId: String defined in net.corda.node.services.events.NodeSchedulerService.Companion.createMap.<anonymous>[LocalVariableDescriptor]

'index' @ [59:80] ==> var index: Int defined in net.corda.node.services.events.NodeSchedulerService.Companion.createMap.<anonymous>[LocalVariableDescriptor]

'it' @ [59:88] ==> value-parameter it: NodeSchedulerService.PersistentScheduledState defined in net.corda.node.services.events.NodeSchedulerService.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'scheduledAt' @ [59:91] ==> @Column public final var scheduledAt: Instant defined in net.corda.node.services.events.NodeSchedulerService.PersistentScheduledState[PropertyDescriptorImpl]

'PersistentScheduledState' @ [62:25] ==> public constructor PersistentScheduledState(output: PersistentStateRef = ..., scheduledAt: Instant = ...) defined in net.corda.node.services.events.NodeSchedulerService.PersistentScheduledState[ClassConstructorDescriptorImpl]

'apply' @ [62:52] ==> @InlineOnly public inline fun <T> NodeSchedulerService.PersistentScheduledState.apply(block: NodeSchedulerService.PersistentScheduledState.() -> Unit): NodeSchedulerService.PersistentScheduledState defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PersistentScheduledState

'output' @ [63:29] ==> @EmbeddedId public final var output: PersistentStateRef defined in net.corda.node.services.events.NodeSchedulerService.PersistentScheduledState[PropertyDescriptorImpl]

'PersistentStateRef' @ [63:38] ==> public constructor PersistentStateRef(txId: String? = ..., index: Int? = ...) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'key' @ [63:57] ==> value-parameter key: StateRef defined in net.corda.node.services.events.NodeSchedulerService.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [63:61] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'toString' @ [63:68] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'key' @ [63:80] ==> value-parameter key: StateRef defined in net.corda.node.services.events.NodeSchedulerService.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [63:84] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'scheduledAt' @ [64:29] ==> @Column public final var scheduledAt: Instant defined in net.corda.node.services.events.NodeSchedulerService.PersistentScheduledState[PropertyDescriptorImpl]

'value' @ [64:43] ==> value-parameter value: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'scheduledAt' @ [64:49] ==> public open val scheduledAt: Instant defined in net.corda.core.contracts.ScheduledStateRef[DeserializedPropertyDescriptor]

'PersistentScheduledState' @ [67:45] ==> public constructor PersistentScheduledState(output: PersistentStateRef = ..., scheduledAt: Instant = ...) defined in net.corda.node.services.events.NodeSchedulerService.PersistentScheduledState[ClassConstructorDescriptorImpl]

'java' @ [67:77] ==> public val <T> KClass<NodeSchedulerService.PersistentScheduledState>.java: Class<NodeSchedulerService.PersistentScheduledState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentScheduledState

'Entity' @ [72:5] ==> public constructor Entity(name: String = ...) defined in javax.persistence.Entity[JavaClassConstructorDescriptor]

'javax.persistence.Table' @ [73:5] ==> public constructor Table(name: String = ..., catalog: String = ..., schema: String = ..., uniqueConstraints: Array<UniqueConstraint> = ..., indexes: Array<Index> = ...) defined in javax.persistence.Table[JavaClassConstructorDescriptor]

'NODE_DATABASE_PREFIX' @ [73:40] ==> public const val NODE_DATABASE_PREFIX: String defined in net.corda.node.utilities in file CordaPersistence.kt[PropertyDescriptorImpl]

'EmbeddedId' @ [75:13] ==> public constructor EmbeddedId() defined in javax.persistence.EmbeddedId[JavaClassConstructorDescriptor]

'PersistentStateRef' @ [76:46] ==> public constructor PersistentStateRef(txId: String? = ..., index: Int? = ...) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'Column' @ [78:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'now' @ [79:48] ==> public open fun now(): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'createMap' @ [83:31] ==> public final fun createMap(): PersistentMap<StateRef, ScheduledStateRef, NodeSchedulerService.PersistentScheduledState, PersistentStateRef> defined in net.corda.node.services.events.NodeSchedulerService.Companion[SimpleFunctionDescriptorImpl]

'PriorityQueue' @ [85:70] ==> public constructor PriorityQueue<E : (Any..Any?)>(p0: (((ScheduledStateRef..ScheduledStateRef?), (ScheduledStateRef..ScheduledStateRef?)) -> Int..(((ScheduledStateRef..ScheduledStateRef?), (ScheduledStateRef..ScheduledStateRef?)) -> Int)?)) defined in java.util.PriorityQueue[SamAdapterClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ScheduledStateRef

'a' @ [85:95] ==> value-parameter a: (ScheduledStateRef..ScheduledStateRef?) defined in net.corda.node.services.events.NodeSchedulerService.InnerState.scheduledStatesQueue.<anonymous>[ValueParameterDescriptorImpl]

'scheduledAt' @ [85:97] ==> public open val scheduledAt: Instant defined in net.corda.core.contracts.ScheduledStateRef[DeserializedPropertyDescriptor]

'compareTo' @ [85:109] ==> public open fun compareTo(other: (Instant..Instant?)): Int defined in java.time.Instant[JavaMethodDescriptor]

'b' @ [85:119] ==> value-parameter b: (ScheduledStateRef..ScheduledStateRef?) defined in net.corda.node.services.events.NodeSchedulerService.InnerState.scheduledStatesQueue.<anonymous>[ValueParameterDescriptorImpl]

'scheduledAt' @ [85:121] ==> public open val scheduledAt: Instant defined in net.corda.core.contracts.ScheduledStateRef[DeserializedPropertyDescriptor]

'ThreadBox' @ [90:25] ==> public constructor ThreadBox<out T>(content: NodeSchedulerService.InnerState, lock: ReentrantLock = ...) defined in net.corda.core.internal.ThreadBox[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> InnerState

'InnerState' @ [90:35] ==> public constructor InnerState() defined in net.corda.node.services.events.NodeSchedulerService.InnerState[ClassConstructorDescriptorImpl]

'mutex' @ [94:9] ==> private final val mutex: ThreadBox<NodeSchedulerService.InnerState> defined in net.corda.node.services.events.NodeSchedulerService[PropertyDescriptorImpl]

'locked' @ [94:15] ==> public final inline fun <R> locked(body: NodeSchedulerService.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'scheduledStatesQueue' @ [95:13] ==> public final var scheduledStatesQueue: PriorityQueue<ScheduledStateRef> defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'addAll' @ [95:34] ==> public open fun addAll(elements: Collection<(ScheduledStateRef..ScheduledStateRef?)>): Boolean defined in java.util.PriorityQueue[JavaMethodDescriptor]

'scheduledStates' @ [95:41] ==> public final var scheduledStates: PersistentMap<StateRef, ScheduledStateRef, NodeSchedulerService.PersistentScheduledState, PersistentStateRef> defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'all' @ [95:57] ==> public final fun all(): Sequence<Pair<StateRef, ScheduledStateRef>> defined in net.corda.node.utilities.PersistentMap[SimpleFunctionDescriptorImpl]

'map' @ [95:63] ==> public fun <T, R> Sequence<Pair<StateRef, ScheduledStateRef>>.map(transform: (Pair<StateRef, ScheduledStateRef>) -> ScheduledStateRef): Sequence<ScheduledStateRef> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<StateRef, ScheduledStateRef>
    <R> -> ScheduledStateRef

'it' @ [95:69] ==> value-parameter it: Pair<StateRef, ScheduledStateRef> defined in net.corda.node.services.events.NodeSchedulerService.start.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [95:72] ==> public final val second: ScheduledStateRef defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toMutableList' @ [95:82] ==> public fun <T> Sequence<ScheduledStateRef>.toMutableList(): MutableList<ScheduledStateRef> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScheduledStateRef

'rescheduleWakeUp' @ [96:13] ==> internal final fun rescheduleWakeUp(): Unit defined in net.corda.node.services.events.NodeSchedulerService[SimpleFunctionDescriptorImpl]

'log' @ [101:9] ==> private final val log: Logger defined in net.corda.node.services.events.NodeSchedulerService.Companion[PropertyDescriptorImpl]

'trace' @ [101:13] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'action' @ [101:32] ==> value-parameter action: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.scheduleStateActivity[ValueParameterDescriptorImpl]

'mutex' @ [102:9] ==> private final val mutex: ThreadBox<NodeSchedulerService.InnerState> defined in net.corda.node.services.events.NodeSchedulerService[PropertyDescriptorImpl]

'locked' @ [102:15] ==> public final inline fun <R> locked(body: NodeSchedulerService.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'scheduledStates' @ [103:33] ==> public final var scheduledStates: PersistentMap<StateRef, ScheduledStateRef, NodeSchedulerService.PersistentScheduledState, PersistentStateRef> defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'action' @ [103:49] ==> value-parameter action: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.scheduleStateActivity[ValueParameterDescriptorImpl]

'ref' @ [103:56] ==> public final val ref: StateRef defined in net.corda.core.contracts.ScheduledStateRef[DeserializedPropertyDescriptor]

'scheduledStates' @ [104:13] ==> public final var scheduledStates: PersistentMap<StateRef, ScheduledStateRef, NodeSchedulerService.PersistentScheduledState, PersistentStateRef> defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'action' @ [104:29] ==> value-parameter action: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.scheduleStateActivity[ValueParameterDescriptorImpl]

'ref' @ [104:36] ==> public final val ref: StateRef defined in net.corda.core.contracts.ScheduledStateRef[DeserializedPropertyDescriptor]

'action' @ [104:43] ==> value-parameter action: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.scheduleStateActivity[ValueParameterDescriptorImpl]

'scheduledStatesQueue' @ [105:36] ==> public final var scheduledStatesQueue: PriorityQueue<ScheduledStateRef> defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'peek' @ [105:57] ==> public open fun peek(): (ScheduledStateRef..ScheduledStateRef?) defined in java.util.PriorityQueue[JavaMethodDescriptor]

'scheduledStatesQueue' @ [106:13] ==> public final var scheduledStatesQueue: PriorityQueue<ScheduledStateRef> defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'remove' @ [106:34] ==> public open fun remove(element: (ScheduledStateRef..ScheduledStateRef?)): Boolean defined in java.util.PriorityQueue[JavaMethodDescriptor]

'previousState' @ [106:41] ==> val previousState: ScheduledStateRef? defined in net.corda.node.services.events.NodeSchedulerService.scheduleStateActivity.<anonymous>[LocalVariableDescriptor]

'scheduledStatesQueue' @ [107:13] ==> public final var scheduledStatesQueue: PriorityQueue<ScheduledStateRef> defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'add' @ [107:34] ==> public open fun add(element: (ScheduledStateRef..ScheduledStateRef?)): Boolean defined in java.util.PriorityQueue[JavaMethodDescriptor]

'action' @ [107:38] ==> value-parameter action: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.scheduleStateActivity[ValueParameterDescriptorImpl]

'previousState' @ [108:17] ==> val previousState: ScheduledStateRef? defined in net.corda.node.services.events.NodeSchedulerService.scheduleStateActivity.<anonymous>[LocalVariableDescriptor]

'unfinishedSchedules' @ [109:17] ==> private final val unfinishedSchedules: ReusableLatch defined in net.corda.node.services.events.NodeSchedulerService[PropertyDescriptorImpl]

'countUp' @ [109:37] ==> public open fun countUp(): Unit defined in org.apache.activemq.artemis.utils.ReusableLatch[JavaMethodDescriptor]

'if (action.scheduledAt.isBefore(previousEarliest?.scheduledAt ?: Instant.MAX)) {
                // We are earliest
                rescheduleWakeUp()
            } else if(previousEarliest?.ref == action.ref && previousEarliest.scheduledAt != action.scheduledAt) {
                // We were earliest but might not be any more
                rescheduleWakeUp()
            }' @ [112:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'action' @ [112:17] ==> value-parameter action: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.scheduleStateActivity[ValueParameterDescriptorImpl]

'scheduledAt' @ [112:24] ==> public open val scheduledAt: Instant defined in net.corda.core.contracts.ScheduledStateRef[DeserializedPropertyDescriptor]

'isBefore' @ [112:36] ==> public open fun isBefore(p0: (Instant..Instant?)): Boolean defined in java.time.Instant[JavaMethodDescriptor]

'previousEarliest' @ [112:45] ==> var previousEarliest: (ScheduledStateRef..ScheduledStateRef?) defined in net.corda.node.services.events.NodeSchedulerService.scheduleStateActivity.<anonymous>[LocalVariableDescriptor]

'scheduledAt' @ [112:63] ==> public open val scheduledAt: Instant defined in net.corda.core.contracts.ScheduledStateRef[DeserializedPropertyDescriptor]

'MAX' @ [112:86] ==> public final val MAX: (Instant..Instant?) defined in java.time.Instant[JavaPropertyDescriptor]

'rescheduleWakeUp' @ [114:17] ==> internal final fun rescheduleWakeUp(): Unit defined in net.corda.node.services.events.NodeSchedulerService[SimpleFunctionDescriptorImpl]

'previousEarliest' @ [115:23] ==> var previousEarliest: (ScheduledStateRef..ScheduledStateRef?) defined in net.corda.node.services.events.NodeSchedulerService.scheduleStateActivity.<anonymous>[LocalVariableDescriptor]

'ref' @ [115:41] ==> public final val ref: StateRef defined in net.corda.core.contracts.ScheduledStateRef[DeserializedPropertyDescriptor]

'action' @ [115:48] ==> value-parameter action: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.scheduleStateActivity[ValueParameterDescriptorImpl]

'ref' @ [115:55] ==> public final val ref: StateRef defined in net.corda.core.contracts.ScheduledStateRef[DeserializedPropertyDescriptor]

'previousEarliest' @ [115:62] ==> var previousEarliest: (ScheduledStateRef..ScheduledStateRef?) defined in net.corda.node.services.events.NodeSchedulerService.scheduleStateActivity.<anonymous>[LocalVariableDescriptor]

'scheduledAt' @ [115:79] ==> public open val scheduledAt: Instant defined in net.corda.core.contracts.ScheduledStateRef[DeserializedPropertyDescriptor]

'action' @ [115:94] ==> value-parameter action: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.scheduleStateActivity[ValueParameterDescriptorImpl]

'scheduledAt' @ [115:101] ==> public open val scheduledAt: Instant defined in net.corda.core.contracts.ScheduledStateRef[DeserializedPropertyDescriptor]

'rescheduleWakeUp' @ [117:17] ==> internal final fun rescheduleWakeUp(): Unit defined in net.corda.node.services.events.NodeSchedulerService[SimpleFunctionDescriptorImpl]

'log' @ [123:9] ==> private final val log: Logger defined in net.corda.node.services.events.NodeSchedulerService.Companion[PropertyDescriptorImpl]

'trace' @ [123:13] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'ref' @ [123:34] ==> value-parameter ref: StateRef defined in net.corda.node.services.events.NodeSchedulerService.unscheduleStateActivity[ValueParameterDescriptorImpl]

'mutex' @ [124:9] ==> private final val mutex: ThreadBox<NodeSchedulerService.InnerState> defined in net.corda.node.services.events.NodeSchedulerService[PropertyDescriptorImpl]

'locked' @ [124:15] ==> public final inline fun <R> locked(body: NodeSchedulerService.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'scheduledStates' @ [125:33] ==> public final var scheduledStates: PersistentMap<StateRef, ScheduledStateRef, NodeSchedulerService.PersistentScheduledState, PersistentStateRef> defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'remove' @ [125:49] ==> public open fun remove(key: StateRef): ScheduledStateRef? defined in net.corda.node.utilities.PersistentMap[SimpleFunctionDescriptorImpl]

'ref' @ [125:56] ==> value-parameter ref: StateRef defined in net.corda.node.services.events.NodeSchedulerService.unscheduleStateActivity[ValueParameterDescriptorImpl]

'removedAction' @ [126:17] ==> val removedAction: ScheduledStateRef? defined in net.corda.node.services.events.NodeSchedulerService.unscheduleStateActivity.<anonymous>[LocalVariableDescriptor]

'scheduledStatesQueue' @ [127:17] ==> public final var scheduledStatesQueue: PriorityQueue<ScheduledStateRef> defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'remove' @ [127:38] ==> public open fun remove(element: (ScheduledStateRef..ScheduledStateRef?)): Boolean defined in java.util.PriorityQueue[JavaMethodDescriptor]

'removedAction' @ [127:45] ==> val removedAction: ScheduledStateRef? defined in net.corda.node.services.events.NodeSchedulerService.unscheduleStateActivity.<anonymous>[LocalVariableDescriptor]

'unfinishedSchedules' @ [128:17] ==> private final val unfinishedSchedules: ReusableLatch defined in net.corda.node.services.events.NodeSchedulerService[PropertyDescriptorImpl]

'countDown' @ [128:37] ==> public open fun countDown(): Unit defined in org.apache.activemq.artemis.utils.ReusableLatch[JavaMethodDescriptor]

'removedAction' @ [129:21] ==> val removedAction: ScheduledStateRef? defined in net.corda.node.services.events.NodeSchedulerService.unscheduleStateActivity.<anonymous>[LocalVariableDescriptor]

'scheduledStatesQueue' @ [129:38] ==> public final var scheduledStatesQueue: PriorityQueue<ScheduledStateRef> defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'peek' @ [129:59] ==> public open fun peek(): (ScheduledStateRef..ScheduledStateRef?) defined in java.util.PriorityQueue[JavaMethodDescriptor]

'rescheduleWakeUp' @ [130:21] ==> internal final fun rescheduleWakeUp(): Unit defined in net.corda.node.services.events.NodeSchedulerService[SimpleFunctionDescriptorImpl]

'component1' @ [146:14] ==> public final operator fun component1(): (ScheduledStateRef..ScheduledStateRef?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [146:30] ==> public final operator fun component2(): SettableFuture<Boolean> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'mutex' @ [146:54] ==> private final val mutex: ThreadBox<NodeSchedulerService.InnerState> defined in net.corda.node.services.events.NodeSchedulerService[PropertyDescriptorImpl]

'alreadyLocked' @ [146:60] ==> public final inline fun <R> alreadyLocked(body: NodeSchedulerService.InnerState.() -> Pair<(ScheduledStateRef..ScheduledStateRef?), SettableFuture<Boolean>>): Pair<(ScheduledStateRef..ScheduledStateRef?), SettableFuture<Boolean>> defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Pair<(net.corda.core.contracts.ScheduledStateRef..net.corda.core.contracts.ScheduledStateRef?), SettableFuture<Boolean>>

'rescheduled' @ [147:13] ==> public final var rescheduled: SettableFuture<Boolean>? defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'cancel' @ [147:26] ==> @CanIgnoreReturnValue public final fun cancel(p0: Boolean): Boolean defined in com.google.common.util.concurrent.SettableFuture[JavaMethodDescriptor]

'rescheduled' @ [148:13] ==> public final var rescheduled: SettableFuture<Boolean>? defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'create' @ [148:42] ==> public open fun <V : (Any..Any?)> create(): (SettableFuture<(Boolean..Boolean?)>..SettableFuture<(Boolean..Boolean?)>?) defined in com.google.common.util.concurrent.SettableFuture[JavaMethodDescriptor]
Inferred types:
    <V : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'Pair' @ [149:13] ==> public constructor Pair<out A, out B>(first: (ScheduledStateRef..ScheduledStateRef?), second: SettableFuture<Boolean>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> (net.corda.core.contracts.ScheduledStateRef..net.corda.core.contracts.ScheduledStateRef?)
    <out B> -> SettableFuture<Boolean>

'scheduledStatesQueue' @ [149:18] ==> public final var scheduledStatesQueue: PriorityQueue<ScheduledStateRef> defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'peek' @ [149:39] ==> public open fun peek(): (ScheduledStateRef..ScheduledStateRef?) defined in java.util.PriorityQueue[JavaMethodDescriptor]

'rescheduled' @ [149:47] ==> public final var rescheduled: SettableFuture<Boolean>? defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'scheduledState' @ [151:13] ==> val scheduledState: (ScheduledStateRef..ScheduledStateRef?) defined in net.corda.node.services.events.NodeSchedulerService.rescheduleWakeUp[LocalVariableDescriptor]

'schedulerTimerExecutor' @ [152:13] ==> private final val schedulerTimerExecutor: Executor defined in net.corda.node.services.events.NodeSchedulerService[PropertyDescriptorImpl]

'execute' @ [152:36] ==> public final fun execute(p0: (() -> Unit..(() -> Unit)?)): Unit defined in java.util.concurrent.Executor[MyFunctionDescriptor]

'log' @ [153:17] ==> private final val log: Logger defined in net.corda.node.services.events.NodeSchedulerService.Companion[PropertyDescriptorImpl]

'trace' @ [153:21] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'scheduledState' @ [153:50] ==> val scheduledState: (ScheduledStateRef..ScheduledStateRef?) defined in net.corda.node.services.events.NodeSchedulerService.rescheduleWakeUp[LocalVariableDescriptor]

'if (!services.clock.awaitWithDeadline(scheduledState.scheduledAt, ourRescheduledFuture)) {
                    log.trace { "Invoking as next $scheduledState" }
                    onTimeReached(scheduledState)
                } else {
                    log.trace { "Rescheduled $scheduledState" }
                }' @ [156:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [156:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'services' @ [156:22] ==> private final val services: ServiceHubInternal defined in net.corda.node.services.events.NodeSchedulerService[PropertyDescriptorImpl]

'clock' @ [156:31] ==> public abstract val clock: Clock defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'awaitWithDeadline' @ [156:37] ==> @Suspendable public fun Clock.awaitWithDeadline(deadline: Instant, future: Future<*> = ...): Boolean defined in net.corda.node.utilities in file ClockUtils.kt[SimpleFunctionDescriptorImpl]

'scheduledState' @ [156:55] ==> val scheduledState: (ScheduledStateRef..ScheduledStateRef?) defined in net.corda.node.services.events.NodeSchedulerService.rescheduleWakeUp[LocalVariableDescriptor]

'scheduledAt' @ [156:70] ==> public open val scheduledAt: Instant defined in net.corda.core.contracts.ScheduledStateRef[DeserializedPropertyDescriptor]

'ourRescheduledFuture' @ [156:83] ==> val ourRescheduledFuture: SettableFuture<Boolean> defined in net.corda.node.services.events.NodeSchedulerService.rescheduleWakeUp[LocalVariableDescriptor]

'log' @ [157:21] ==> private final val log: Logger defined in net.corda.node.services.events.NodeSchedulerService.Companion[PropertyDescriptorImpl]

'trace' @ [157:25] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'scheduledState' @ [157:52] ==> val scheduledState: (ScheduledStateRef..ScheduledStateRef?) defined in net.corda.node.services.events.NodeSchedulerService.rescheduleWakeUp[LocalVariableDescriptor]

'onTimeReached' @ [158:21] ==> private final fun onTimeReached(scheduledState: ScheduledStateRef): Unit defined in net.corda.node.services.events.NodeSchedulerService[SimpleFunctionDescriptorImpl]

'scheduledState' @ [158:35] ==> val scheduledState: (ScheduledStateRef..ScheduledStateRef?) defined in net.corda.node.services.events.NodeSchedulerService.rescheduleWakeUp[LocalVariableDescriptor]

'log' @ [160:21] ==> private final val log: Logger defined in net.corda.node.services.events.NodeSchedulerService.Companion[PropertyDescriptorImpl]

'trace' @ [160:25] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'scheduledState' @ [160:47] ==> val scheduledState: (ScheduledStateRef..ScheduledStateRef?) defined in net.corda.node.services.events.NodeSchedulerService.rescheduleWakeUp[LocalVariableDescriptor]

'serverThread' @ [167:9] ==> private final val serverThread: AffinityExecutor defined in net.corda.node.services.events.NodeSchedulerService[PropertyDescriptorImpl]

'execute' @ [167:22] ==> public final fun execute(p0: (() -> Unit..(() -> Unit)?)): Unit defined in net.corda.node.utilities.AffinityExecutor[MyFunctionDescriptor]

'services' @ [168:13] ==> private final val services: ServiceHubInternal defined in net.corda.node.services.events.NodeSchedulerService[PropertyDescriptorImpl]

'database' @ [168:22] ==> public abstract val database: CordaPersistence defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'transaction' @ [168:31] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'getScheduledFlow' @ [169:37] ==> private final fun getScheduledFlow(scheduledState: ScheduledStateRef): FlowLogic<*>? defined in net.corda.node.services.events.NodeSchedulerService[SimpleFunctionDescriptorImpl]

'scheduledState' @ [169:54] ==> value-parameter scheduledState: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.onTimeReached[ValueParameterDescriptorImpl]

'scheduledFlow' @ [170:21] ==> val scheduledFlow: FlowLogic<*>? defined in net.corda.node.services.events.NodeSchedulerService.onTimeReached.<anonymous>.<anonymous>[LocalVariableDescriptor]

'services' @ [171:34] ==> private final val services: ServiceHubInternal defined in net.corda.node.services.events.NodeSchedulerService[PropertyDescriptorImpl]

'startFlow' @ [171:43] ==> public abstract fun <T> startFlow(logic: FlowLogic<Any?>, flowInitiator: FlowInitiator): FlowStateMachineImpl<Any?> defined in net.corda.node.services.api.ServiceHubInternal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any?

'scheduledFlow' @ [171:53] ==> val scheduledFlow: FlowLogic<*>? defined in net.corda.node.services.events.NodeSchedulerService.onTimeReached.<anonymous>.<anonymous>[LocalVariableDescriptor]

'Scheduled' @ [171:82] ==> public constructor Scheduled(scheduledState: ScheduledStateRef) defined in net.corda.core.flows.FlowInitiator.Scheduled[DeserializedClassConstructorDescriptor]

'scheduledState' @ [171:92] ==> value-parameter scheduledState: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.onTimeReached[ValueParameterDescriptorImpl]

'resultFuture' @ [171:109] ==> public open val resultFuture: CordaFuture<Any?> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'future' @ [172:21] ==> val future: CordaFuture<Any?> defined in net.corda.node.services.events.NodeSchedulerService.onTimeReached.<anonymous>.<anonymous>[LocalVariableDescriptor]

'then' @ [172:28] ==> public abstract fun <W> then(callback: (CordaFuture<Any?>) -> Unit): Unit defined in net.corda.core.concurrent.CordaFuture[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <W> -> Unit

'unfinishedSchedules' @ [173:25] ==> private final val unfinishedSchedules: ReusableLatch defined in net.corda.node.services.events.NodeSchedulerService[PropertyDescriptorImpl]

'countDown' @ [173:45] ==> public open fun countDown(): Unit defined in org.apache.activemq.artemis.utils.ReusableLatch[JavaMethodDescriptor]

'getScheduledActivity' @ [181:33] ==> private final fun getScheduledActivity(scheduledState: ScheduledStateRef): ScheduledActivity? defined in net.corda.node.services.events.NodeSchedulerService[SimpleFunctionDescriptorImpl]

'scheduledState' @ [181:54] ==> value-parameter scheduledState: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow[ValueParameterDescriptorImpl]

'mutex' @ [183:9] ==> private final val mutex: ThreadBox<NodeSchedulerService.InnerState> defined in net.corda.node.services.events.NodeSchedulerService[PropertyDescriptorImpl]

'locked' @ [183:15] ==> public final inline fun <R> locked(body: NodeSchedulerService.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'scheduledStates' @ [185:33] ==> public final var scheduledStates: PersistentMap<StateRef, ScheduledStateRef, NodeSchedulerService.PersistentScheduledState, PersistentStateRef> defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'scheduledState' @ [185:49] ==> value-parameter scheduledState: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow[ValueParameterDescriptorImpl]

'ref' @ [185:64] ==> public final val ref: StateRef defined in net.corda.core.contracts.ScheduledStateRef[DeserializedPropertyDescriptor]

'previousState' @ [186:17] ==> val previousState: ScheduledStateRef? defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow.<anonymous>[LocalVariableDescriptor]

'previousState' @ [186:42] ==> val previousState: ScheduledStateRef? defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow.<anonymous>[LocalVariableDescriptor]

'scheduledState' @ [186:60] ==> value-parameter scheduledState: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow[ValueParameterDescriptorImpl]

'if (scheduledActivity == null) {
                    log.info("Scheduled state $scheduledState has rescheduled to never.")
                    unfinishedSchedules.countDown()
                    scheduledStates.remove(scheduledState.ref)
                    scheduledStatesQueue.remove(scheduledState)
                } else if (scheduledActivity.scheduledAt.isAfter(services.clock.instant())) {
                    log.info("Scheduled state $scheduledState has rescheduled to ${scheduledActivity.scheduledAt}.")
                    var newState = ScheduledStateRef(scheduledState.ref, scheduledActivity.scheduledAt)
                    scheduledStates[scheduledState.ref] = newState
                    scheduledStatesQueue.remove(scheduledState)
                    scheduledStatesQueue.add(newState)
                } else {
                    val flowLogic = FlowLogicRefFactoryImpl.toFlowLogic(scheduledActivity.logicRef)
                    log.trace { "Scheduler starting FlowLogic $flowLogic" }
                    scheduledFlow = flowLogic
                    scheduledStates.remove(scheduledState.ref)
                    scheduledStatesQueue.remove(scheduledState)
                }' @ [187:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'scheduledActivity' @ [187:21] ==> val scheduledActivity: ScheduledActivity? defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow[LocalVariableDescriptor]

'log' @ [188:21] ==> private final val log: Logger defined in net.corda.node.services.events.NodeSchedulerService.Companion[PropertyDescriptorImpl]

'info' @ [188:25] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'scheduledState' @ [188:48] ==> value-parameter scheduledState: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow[ValueParameterDescriptorImpl]

'unfinishedSchedules' @ [189:21] ==> private final val unfinishedSchedules: ReusableLatch defined in net.corda.node.services.events.NodeSchedulerService[PropertyDescriptorImpl]

'countDown' @ [189:41] ==> public open fun countDown(): Unit defined in org.apache.activemq.artemis.utils.ReusableLatch[JavaMethodDescriptor]

'scheduledStates' @ [190:21] ==> public final var scheduledStates: PersistentMap<StateRef, ScheduledStateRef, NodeSchedulerService.PersistentScheduledState, PersistentStateRef> defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'remove' @ [190:37] ==> public open fun remove(key: StateRef): ScheduledStateRef? defined in net.corda.node.utilities.PersistentMap[SimpleFunctionDescriptorImpl]

'scheduledState' @ [190:44] ==> value-parameter scheduledState: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow[ValueParameterDescriptorImpl]

'ref' @ [190:59] ==> public final val ref: StateRef defined in net.corda.core.contracts.ScheduledStateRef[DeserializedPropertyDescriptor]

'scheduledStatesQueue' @ [191:21] ==> public final var scheduledStatesQueue: PriorityQueue<ScheduledStateRef> defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'remove' @ [191:42] ==> public open fun remove(element: (ScheduledStateRef..ScheduledStateRef?)): Boolean defined in java.util.PriorityQueue[JavaMethodDescriptor]

'scheduledState' @ [191:49] ==> value-parameter scheduledState: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow[ValueParameterDescriptorImpl]

'if (scheduledActivity.scheduledAt.isAfter(services.clock.instant())) {
                    log.info("Scheduled state $scheduledState has rescheduled to ${scheduledActivity.scheduledAt}.")
                    var newState = ScheduledStateRef(scheduledState.ref, scheduledActivity.scheduledAt)
                    scheduledStates[scheduledState.ref] = newState
                    scheduledStatesQueue.remove(scheduledState)
                    scheduledStatesQueue.add(newState)
                } else {
                    val flowLogic = FlowLogicRefFactoryImpl.toFlowLogic(scheduledActivity.logicRef)
                    log.trace { "Scheduler starting FlowLogic $flowLogic" }
                    scheduledFlow = flowLogic
                    scheduledStates.remove(scheduledState.ref)
                    scheduledStatesQueue.remove(scheduledState)
                }' @ [192:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'scheduledActivity' @ [192:28] ==> val scheduledActivity: ScheduledActivity? defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow[LocalVariableDescriptor]

'scheduledAt' @ [192:46] ==> public open val scheduledAt: Instant defined in net.corda.core.contracts.ScheduledActivity[DeserializedPropertyDescriptor]

'isAfter' @ [192:58] ==> public open fun isAfter(p0: (Instant..Instant?)): Boolean defined in java.time.Instant[JavaMethodDescriptor]

'services' @ [192:66] ==> private final val services: ServiceHubInternal defined in net.corda.node.services.events.NodeSchedulerService[PropertyDescriptorImpl]

'clock' @ [192:75] ==> public abstract val clock: Clock defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'instant' @ [192:81] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'log' @ [193:21] ==> private final val log: Logger defined in net.corda.node.services.events.NodeSchedulerService.Companion[PropertyDescriptorImpl]

'info' @ [193:25] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'scheduledState' @ [193:48] ==> value-parameter scheduledState: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow[ValueParameterDescriptorImpl]

'scheduledActivity' @ [193:84] ==> val scheduledActivity: ScheduledActivity? defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow[LocalVariableDescriptor]

'scheduledAt' @ [193:102] ==> public open val scheduledAt: Instant defined in net.corda.core.contracts.ScheduledActivity[DeserializedPropertyDescriptor]

'ScheduledStateRef' @ [194:36] ==> public constructor ScheduledStateRef(ref: StateRef, scheduledAt: Instant) defined in net.corda.core.contracts.ScheduledStateRef[DeserializedClassConstructorDescriptor]

'scheduledState' @ [194:54] ==> value-parameter scheduledState: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow[ValueParameterDescriptorImpl]

'ref' @ [194:69] ==> public final val ref: StateRef defined in net.corda.core.contracts.ScheduledStateRef[DeserializedPropertyDescriptor]

'scheduledActivity' @ [194:74] ==> val scheduledActivity: ScheduledActivity? defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow[LocalVariableDescriptor]

'scheduledAt' @ [194:92] ==> public open val scheduledAt: Instant defined in net.corda.core.contracts.ScheduledActivity[DeserializedPropertyDescriptor]

'scheduledStates' @ [195:21] ==> public final var scheduledStates: PersistentMap<StateRef, ScheduledStateRef, NodeSchedulerService.PersistentScheduledState, PersistentStateRef> defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'scheduledState' @ [195:37] ==> value-parameter scheduledState: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow[ValueParameterDescriptorImpl]

'ref' @ [195:52] ==> public final val ref: StateRef defined in net.corda.core.contracts.ScheduledStateRef[DeserializedPropertyDescriptor]

'newState' @ [195:59] ==> var newState: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow.<anonymous>[LocalVariableDescriptor]

'scheduledStatesQueue' @ [196:21] ==> public final var scheduledStatesQueue: PriorityQueue<ScheduledStateRef> defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'remove' @ [196:42] ==> public open fun remove(element: (ScheduledStateRef..ScheduledStateRef?)): Boolean defined in java.util.PriorityQueue[JavaMethodDescriptor]

'scheduledState' @ [196:49] ==> value-parameter scheduledState: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow[ValueParameterDescriptorImpl]

'scheduledStatesQueue' @ [197:21] ==> public final var scheduledStatesQueue: PriorityQueue<ScheduledStateRef> defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'add' @ [197:42] ==> public open fun add(element: (ScheduledStateRef..ScheduledStateRef?)): Boolean defined in java.util.PriorityQueue[JavaMethodDescriptor]

'newState' @ [197:46] ==> var newState: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow.<anonymous>[LocalVariableDescriptor]

'FlowLogicRefFactoryImpl' @ [199:37] ==> public object FlowLogicRefFactoryImpl : SingletonSerializeAsToken, FlowLogicRefFactory defined in net.corda.node.services.statemachine in file FlowLogicRefFactoryImpl.kt[FakeCallableDescriptorForObject]

'toFlowLogic' @ [199:61] ==> public final fun toFlowLogic(ref: FlowLogicRef): FlowLogic<*> defined in net.corda.node.services.statemachine.FlowLogicRefFactoryImpl[SimpleFunctionDescriptorImpl]

'scheduledActivity' @ [199:73] ==> val scheduledActivity: ScheduledActivity? defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow[LocalVariableDescriptor]

'logicRef' @ [199:91] ==> public final val logicRef: FlowLogicRef defined in net.corda.core.contracts.ScheduledActivity[DeserializedPropertyDescriptor]

'log' @ [200:21] ==> private final val log: Logger defined in net.corda.node.services.events.NodeSchedulerService.Companion[PropertyDescriptorImpl]

'trace' @ [200:25] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'flowLogic' @ [200:64] ==> val flowLogic: FlowLogic<*> defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow.<anonymous>[LocalVariableDescriptor]

'scheduledFlow' @ [201:21] ==> var scheduledFlow: FlowLogic<*>? defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow[LocalVariableDescriptor]

'flowLogic' @ [201:37] ==> val flowLogic: FlowLogic<*> defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow.<anonymous>[LocalVariableDescriptor]

'scheduledStates' @ [202:21] ==> public final var scheduledStates: PersistentMap<StateRef, ScheduledStateRef, NodeSchedulerService.PersistentScheduledState, PersistentStateRef> defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'remove' @ [202:37] ==> public open fun remove(key: StateRef): ScheduledStateRef? defined in net.corda.node.utilities.PersistentMap[SimpleFunctionDescriptorImpl]

'scheduledState' @ [202:44] ==> value-parameter scheduledState: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow[ValueParameterDescriptorImpl]

'ref' @ [202:59] ==> public final val ref: StateRef defined in net.corda.core.contracts.ScheduledStateRef[DeserializedPropertyDescriptor]

'scheduledStatesQueue' @ [203:21] ==> public final var scheduledStatesQueue: PriorityQueue<ScheduledStateRef> defined in net.corda.node.services.events.NodeSchedulerService.InnerState[PropertyDescriptorImpl]

'remove' @ [203:42] ==> public open fun remove(element: (ScheduledStateRef..ScheduledStateRef?)): Boolean defined in java.util.PriorityQueue[JavaMethodDescriptor]

'scheduledState' @ [203:49] ==> value-parameter scheduledState: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow[ValueParameterDescriptorImpl]

'rescheduleWakeUp' @ [207:13] ==> internal final fun rescheduleWakeUp(): Unit defined in net.corda.node.services.events.NodeSchedulerService[SimpleFunctionDescriptorImpl]

'scheduledFlow' @ [209:16] ==> var scheduledFlow: FlowLogic<*>? defined in net.corda.node.services.events.NodeSchedulerService.getScheduledFlow[LocalVariableDescriptor]

'services' @ [213:23] ==> private final val services: ServiceHubInternal defined in net.corda.node.services.events.NodeSchedulerService[PropertyDescriptorImpl]

'loadState' @ [213:32] ==> public open fun loadState(stateRef: StateRef): TransactionState<*> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'scheduledState' @ [213:42] ==> value-parameter scheduledState: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.getScheduledActivity[ValueParameterDescriptorImpl]

'ref' @ [213:57] ==> public final val ref: StateRef defined in net.corda.core.contracts.ScheduledStateRef[DeserializedPropertyDescriptor]

'txState' @ [214:21] ==> val txState: TransactionState<*> defined in net.corda.node.services.events.NodeSchedulerService.getScheduledActivity[LocalVariableDescriptor]

'data' @ [214:29] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'state' @ [217:13] ==> val state: SchedulableState defined in net.corda.node.services.events.NodeSchedulerService.getScheduledActivity[LocalVariableDescriptor]

'nextScheduledActivity' @ [217:19] ==> public abstract fun nextScheduledActivity(thisStateRef: StateRef, flowLogicRefFactory: FlowLogicRefFactory): ScheduledActivity? defined in net.corda.core.contracts.SchedulableState[DeserializedSimpleFunctionDescriptor]

'scheduledState' @ [217:41] ==> value-parameter scheduledState: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.getScheduledActivity[ValueParameterDescriptorImpl]

'ref' @ [217:56] ==> public final val ref: StateRef defined in net.corda.core.contracts.ScheduledStateRef[DeserializedPropertyDescriptor]

'FlowLogicRefFactoryImpl' @ [217:61] ==> public object FlowLogicRefFactoryImpl : SingletonSerializeAsToken, FlowLogicRefFactory defined in net.corda.node.services.statemachine in file FlowLogicRefFactoryImpl.kt[FakeCallableDescriptorForObject]

'log' @ [219:13] ==> private final val log: Logger defined in net.corda.node.services.events.NodeSchedulerService.Companion[PropertyDescriptorImpl]

'error' @ [219:17] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'scheduledState' @ [219:56] ==> value-parameter scheduledState: ScheduledStateRef defined in net.corda.node.services.events.NodeSchedulerService.getScheduledActivity[ValueParameterDescriptorImpl]

'e' @ [219:92] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.events.NodeSchedulerService.getScheduledActivity[LocalVariableDescriptor]

