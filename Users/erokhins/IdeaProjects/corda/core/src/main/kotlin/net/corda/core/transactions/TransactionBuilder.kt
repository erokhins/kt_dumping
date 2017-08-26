'?:' @ [30:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: UUID?, right: UUID): UUID[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> UUID

'currentStrand' @ [30:36] ==> public open fun currentStrand(): (Strand..Strand?) defined in co.paralleluniverse.strands.Strand[JavaMethodDescriptor]

'id' @ [30:78] ==> public abstract val id: StateMachineRunId defined in net.corda.core.internal.FlowStateMachine[PropertyDescriptorImpl]

'uuid' @ [30:82] ==> public final val uuid: UUID defined in net.corda.core.flows.StateMachineRunId[PropertyDescriptorImpl]

'randomUUID' @ [30:95] ==> public open fun randomUUID(): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'arrayListOf' @ [31:55] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<StateRef> /* = ArrayList<StateRef> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'arrayListOf' @ [32:62] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<SecureHash> /* = ArrayList<SecureHash> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'arrayListOf' @ [33:79] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<TransactionState<ContractState>> /* = ArrayList<TransactionState<ContractState>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>

'arrayListOf' @ [34:59] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Command<*>> /* = ArrayList<Command<*>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<*>

'PrivacySalt' @ [36:50] ==> public constructor PrivacySalt() defined in net.corda.core.contracts.PrivacySalt[ClassConstructorDescriptorImpl]

'this' @ [38:34] ==> public constructor TransactionBuilder(notary: Party? = ..., lockId: UUID = ..., inputs: MutableList<StateRef> = ..., attachments: MutableList<SecureHash> = ..., outputs: MutableList<TransactionState<ContractState>> = ..., commands: MutableList<Command<*>> = ..., window: TimeWindow? = ..., privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.TransactionBuilder[ClassConstructorDescriptorImpl]

'notary' @ [38:40] ==> value-parameter notary: Party defined in net.corda.core.transactions.TransactionBuilder.<init>[ValueParameterDescriptorImpl]

'?:' @ [38:48] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: UUID?, right: UUID): UUID[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> UUID

'currentStrand' @ [38:56] ==> public open fun currentStrand(): (Strand..Strand?) defined in co.paralleluniverse.strands.Strand[JavaMethodDescriptor]

'id' @ [38:98] ==> public abstract val id: StateMachineRunId defined in net.corda.core.internal.FlowStateMachine[PropertyDescriptorImpl]

'uuid' @ [38:102] ==> public final val uuid: UUID defined in net.corda.core.flows.StateMachineRunId[PropertyDescriptorImpl]

'randomUUID' @ [38:115] ==> public open fun randomUUID(): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'TransactionBuilder' @ [43:18] ==> public constructor TransactionBuilder(notary: Party? = ..., lockId: UUID = ..., inputs: MutableList<StateRef> = ..., attachments: MutableList<SecureHash> = ..., outputs: MutableList<TransactionState<ContractState>> = ..., commands: MutableList<Command<*>> = ..., window: TimeWindow? = ..., privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.TransactionBuilder[ClassConstructorDescriptorImpl]

'notary' @ [44:22] ==> public final var notary: Party? defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'ArrayList' @ [45:22] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (StateRef..StateRef?)>..Collection<(StateRef..StateRef?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> StateRef

'inputs' @ [45:32] ==> protected final val inputs: MutableList<StateRef> defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'ArrayList' @ [46:27] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (SecureHash..SecureHash?)>..Collection<(SecureHash..SecureHash?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> SecureHash

'attachments' @ [46:37] ==> protected final val attachments: MutableList<SecureHash> defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'ArrayList' @ [47:23] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (TransactionState<ContractState>..TransactionState<ContractState>?)>..Collection<(TransactionState<ContractState>..TransactionState<ContractState>?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TransactionState<ContractState>

'outputs' @ [47:33] ==> protected final val outputs: MutableList<TransactionState<ContractState>> defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'ArrayList' @ [48:24] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (Command<*>..Command<*>?)>..Collection<(Command<*>..Command<*>?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Command<*>

'commands' @ [48:34] ==> protected final val commands: MutableList<Command<*>> defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'window' @ [49:22] ==> protected final var window: TimeWindow? defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'privacySalt' @ [50:27] ==> protected final var privacySalt: PrivacySalt defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'items' @ [56:19] ==> value-parameter vararg items: Any defined in net.corda.core.transactions.TransactionBuilder.withItems[ValueParameterDescriptorImpl]

'when (t) {
                is StateAndRef<*> -> addInputState(t)
                is SecureHash -> addAttachment(t)
                is TransactionState<*> -> addOutputState(t)
                is ContractState -> addOutputState(t)
                is Command<*> -> addCommand(t)
                is CommandData -> throw IllegalArgumentException("You passed an instance of CommandData, but that lacks the pubkey. You need to wrap it in a Command object first.")
                is TimeWindow -> setTimeWindow(t)
                is PrivacySalt -> setPrivacySalt(t)
                else -> throw IllegalArgumentException("Wrong argument type: ${t.javaClass}")
            }' @ [57:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TransactionBuilder, entry1: TransactionBuilder, entry2: TransactionBuilder, entry3: TransactionBuilder, entry4: TransactionBuilder, entry5: TransactionBuilder, entry6: TransactionBuilder, entry7: TransactionBuilder, entry8: TransactionBuilder): TransactionBuilder[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TransactionBuilder

't' @ [57:19] ==> val t: Any defined in net.corda.core.transactions.TransactionBuilder.withItems[LocalVariableDescriptor]

'addInputState' @ [58:38] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[SimpleFunctionDescriptorImpl]

't' @ [58:52] ==> val t: Any defined in net.corda.core.transactions.TransactionBuilder.withItems[LocalVariableDescriptor]

'addAttachment' @ [59:34] ==> public final fun addAttachment(attachmentId: SecureHash): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[SimpleFunctionDescriptorImpl]

't' @ [59:48] ==> val t: Any defined in net.corda.core.transactions.TransactionBuilder.withItems[LocalVariableDescriptor]

'addOutputState' @ [60:43] ==> public final fun addOutputState(state: TransactionState<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[SimpleFunctionDescriptorImpl]

't' @ [60:58] ==> val t: Any defined in net.corda.core.transactions.TransactionBuilder.withItems[LocalVariableDescriptor]

'addOutputState' @ [61:37] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[SimpleFunctionDescriptorImpl]

't' @ [61:52] ==> val t: Any defined in net.corda.core.transactions.TransactionBuilder.withItems[LocalVariableDescriptor]

'addCommand' @ [62:34] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[SimpleFunctionDescriptorImpl]

't' @ [62:45] ==> val t: Any defined in net.corda.core.transactions.TransactionBuilder.withItems[LocalVariableDescriptor]

'IllegalArgumentException' @ [63:41] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'setTimeWindow' @ [64:34] ==> public final fun setTimeWindow(timeWindow: TimeWindow): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[SimpleFunctionDescriptorImpl]

't' @ [64:48] ==> val t: Any defined in net.corda.core.transactions.TransactionBuilder.withItems[LocalVariableDescriptor]

'setPrivacySalt' @ [65:35] ==> public final fun setPrivacySalt(privacySalt: PrivacySalt): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[SimpleFunctionDescriptorImpl]

't' @ [65:50] ==> val t: Any defined in net.corda.core.transactions.TransactionBuilder.withItems[LocalVariableDescriptor]

'IllegalArgumentException' @ [66:31] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

't' @ [66:80] ==> val t: Any defined in net.corda.core.transactions.TransactionBuilder.withItems[LocalVariableDescriptor]

'javaClass' @ [66:82] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'this' @ [69:16] ==> <this> defined in net.corda.core.transactions.TransactionBuilder[LazyClassReceiverParameterDescriptor]

'WireTransaction' @ [73:31] ==> public constructor WireTransaction(inputs: List<StateRef>, attachments: List<SecureHash>, outputs: List<TransactionState<ContractState>>, commands: List<Command<*>>, notary: Party?, timeWindow: TimeWindow?, privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.WireTransaction[ClassConstructorDescriptorImpl]

'ArrayList' @ [73:47] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (StateRef..StateRef?)>..Collection<(StateRef..StateRef?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (net.corda.core.contracts.StateRef..net.corda.core.contracts.StateRef?)

'inputs' @ [73:57] ==> protected final val inputs: MutableList<StateRef> defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'ArrayList' @ [73:66] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (SecureHash..SecureHash?)>..Collection<(SecureHash..SecureHash?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (net.corda.core.crypto.SecureHash..net.corda.core.crypto.SecureHash?)

'attachments' @ [73:76] ==> protected final val attachments: MutableList<SecureHash> defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'ArrayList' @ [74:13] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (TransactionState<ContractState>..TransactionState<ContractState>?)>..Collection<(TransactionState<ContractState>..TransactionState<ContractState>?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (net.corda.core.contracts.TransactionState<net.corda.core.contracts.ContractState>..net.corda.core.contracts.TransactionState<net.corda.core.contracts.ContractState>?)

'outputs' @ [74:23] ==> protected final val outputs: MutableList<TransactionState<ContractState>> defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'ArrayList' @ [74:33] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (Command<*>..Command<*>?)>..Collection<(Command<*>..Command<*>?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (net.corda.core.contracts.Command<*>..net.corda.core.contracts.Command<*>?)

'commands' @ [74:43] ==> protected final val commands: MutableList<Command<*>> defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'notary' @ [74:54] ==> public final var notary: Party? defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'window' @ [74:62] ==> protected final var window: TimeWindow? defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'privacySalt' @ [74:70] ==> protected final var privacySalt: PrivacySalt defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'Throws' @ [76:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'AttachmentResolutionException' @ [76:13] ==> public constructor AttachmentResolutionException(hash: SecureHash) defined in net.corda.core.contracts.AttachmentResolutionException[ClassConstructorDescriptorImpl]

'TransactionResolutionException' @ [76:51] ==> public constructor TransactionResolutionException(hash: SecureHash) defined in net.corda.core.contracts.TransactionResolutionException[ClassConstructorDescriptorImpl]

'toWireTransaction' @ [77:53] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[SimpleFunctionDescriptorImpl]

'toLedgerTransaction' @ [77:73] ==> @Throws public final fun toLedgerTransaction(services: ServicesForResolution): LedgerTransaction defined in net.corda.core.transactions.WireTransaction[SimpleFunctionDescriptorImpl]

'services' @ [77:93] ==> value-parameter services: ServiceHub defined in net.corda.core.transactions.TransactionBuilder.toLedgerTransaction[ValueParameterDescriptorImpl]

'Throws' @ [79:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'AttachmentResolutionException' @ [79:13] ==> public constructor AttachmentResolutionException(hash: SecureHash) defined in net.corda.core.contracts.AttachmentResolutionException[ClassConstructorDescriptorImpl]

'TransactionResolutionException' @ [79:51] ==> public constructor TransactionResolutionException(hash: SecureHash) defined in net.corda.core.contracts.TransactionResolutionException[ClassConstructorDescriptorImpl]

'TransactionVerificationException' @ [79:90] ==> private constructor TransactionVerificationException(txId: SecureHash, message: String, cause: Throwable?) defined in net.corda.core.contracts.TransactionVerificationException[ClassConstructorDescriptorImpl]

'toLedgerTransaction' @ [81:9] ==> @Throws public final fun toLedgerTransaction(services: ServiceHub): LedgerTransaction defined in net.corda.core.transactions.TransactionBuilder[SimpleFunctionDescriptorImpl]

'services' @ [81:29] ==> value-parameter services: ServiceHub defined in net.corda.core.transactions.TransactionBuilder.verify[ValueParameterDescriptorImpl]

'verify' @ [81:39] ==> @Throws public final fun verify(): Unit defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]

'stateAndRef' @ [85:22] ==> value-parameter stateAndRef: StateAndRef<*> defined in net.corda.core.transactions.TransactionBuilder.addInputState[ValueParameterDescriptorImpl]

'state' @ [85:34] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'notary' @ [85:40] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'require' @ [86:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'notary' @ [86:17] ==> val notary: Party defined in net.corda.core.transactions.TransactionBuilder.addInputState[LocalVariableDescriptor]

'this' @ [86:27] ==> <this> defined in net.corda.core.transactions.TransactionBuilder[LazyClassReceiverParameterDescriptor]

'notary' @ [86:32] ==> public final var notary: Party? defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'notary' @ [86:74] ==> val notary: Party defined in net.corda.core.transactions.TransactionBuilder.addInputState[LocalVariableDescriptor]

'this' @ [86:131] ==> <this> defined in net.corda.core.transactions.TransactionBuilder[LazyClassReceiverParameterDescriptor]

'notary' @ [86:136] ==> public final var notary: Party? defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'inputs' @ [87:9] ==> protected final val inputs: MutableList<StateRef> defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'add' @ [87:16] ==> public abstract fun add(element: StateRef): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'stateAndRef' @ [87:20] ==> value-parameter stateAndRef: StateAndRef<*> defined in net.corda.core.transactions.TransactionBuilder.addInputState[ValueParameterDescriptorImpl]

'ref' @ [87:32] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'this' @ [88:16] ==> <this> defined in net.corda.core.transactions.TransactionBuilder[LazyClassReceiverParameterDescriptor]

'attachments' @ [92:9] ==> protected final val attachments: MutableList<SecureHash> defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'add' @ [92:21] ==> public abstract fun add(element: SecureHash): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'attachmentId' @ [92:25] ==> value-parameter attachmentId: SecureHash defined in net.corda.core.transactions.TransactionBuilder.addAttachment[ValueParameterDescriptorImpl]

'this' @ [93:16] ==> <this> defined in net.corda.core.transactions.TransactionBuilder[LazyClassReceiverParameterDescriptor]

'outputs' @ [97:9] ==> protected final val outputs: MutableList<TransactionState<ContractState>> defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'add' @ [97:17] ==> public abstract fun add(element: TransactionState<ContractState>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'state' @ [97:21] ==> value-parameter state: TransactionState<*> defined in net.corda.core.transactions.TransactionBuilder.addOutputState[ValueParameterDescriptorImpl]

'this' @ [98:16] ==> <this> defined in net.corda.core.transactions.TransactionBuilder[LazyClassReceiverParameterDescriptor]

'JvmOverloads' @ [101:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'addOutputState' @ [103:16] ==> public final fun addOutputState(state: TransactionState<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[SimpleFunctionDescriptorImpl]

'TransactionState' @ [103:31] ==> @JvmOverloads public constructor TransactionState<out T : ContractState>(data: ContractState, notary: Party, encumbrance: Int? = ...) defined in net.corda.core.contracts.TransactionState[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : ContractState> -> ContractState

'state' @ [103:48] ==> value-parameter state: ContractState defined in net.corda.core.transactions.TransactionBuilder.addOutputState[ValueParameterDescriptorImpl]

'notary' @ [103:55] ==> value-parameter notary: Party defined in net.corda.core.transactions.TransactionBuilder.addOutputState[ValueParameterDescriptorImpl]

'encumbrance' @ [103:63] ==> value-parameter encumbrance: Int? = ... defined in net.corda.core.transactions.TransactionBuilder.addOutputState[ValueParameterDescriptorImpl]

'checkNotNull' @ [108:9] ==> @InlineOnly public inline fun <T : Any> checkNotNull(value: Party?, lazyMessage: () -> Any): Party defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Party

'notary' @ [108:22] ==> public final var notary: Party? defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'addOutputState' @ [109:9] ==> @JvmOverloads public final fun addOutputState(state: ContractState, notary: Party, encumbrance: Int? = ...): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[SimpleFunctionDescriptorImpl]

'state' @ [109:24] ==> value-parameter state: ContractState defined in net.corda.core.transactions.TransactionBuilder.addOutputState[ValueParameterDescriptorImpl]

'notary' @ [109:31] ==> public final var notary: Party? defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'this' @ [110:16] ==> <this> defined in net.corda.core.transactions.TransactionBuilder[LazyClassReceiverParameterDescriptor]

'commands' @ [114:9] ==> protected final val commands: MutableList<Command<*>> defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'add' @ [114:18] ==> public abstract fun add(element: Command<*>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'arg' @ [114:22] ==> value-parameter arg: Command<*> defined in net.corda.core.transactions.TransactionBuilder.addCommand[ValueParameterDescriptorImpl]

'this' @ [115:16] ==> <this> defined in net.corda.core.transactions.TransactionBuilder[LazyClassReceiverParameterDescriptor]

'addCommand' @ [118:65] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[SimpleFunctionDescriptorImpl]

'Command' @ [118:76] ==> public constructor Command<T : CommandData>(value: CommandData, signers: List<PublicKey>) defined in net.corda.core.contracts.Command[ClassConstructorDescriptorImpl]
Inferred types:
    <T : CommandData> -> CommandData

'data' @ [118:84] ==> value-parameter data: CommandData defined in net.corda.core.transactions.TransactionBuilder.addCommand[ValueParameterDescriptorImpl]

'listOf' @ [118:90] ==> public fun <T> listOf(vararg elements: PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'keys' @ [118:98] ==> value-parameter vararg keys: PublicKey defined in net.corda.core.transactions.TransactionBuilder.addCommand[ValueParameterDescriptorImpl]

'addCommand' @ [119:64] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[SimpleFunctionDescriptorImpl]

'Command' @ [119:75] ==> public constructor Command<T : CommandData>(value: CommandData, signers: List<PublicKey>) defined in net.corda.core.contracts.Command[ClassConstructorDescriptorImpl]
Inferred types:
    <T : CommandData> -> CommandData

'data' @ [119:83] ==> value-parameter data: CommandData defined in net.corda.core.transactions.TransactionBuilder.addCommand[ValueParameterDescriptorImpl]

'keys' @ [119:89] ==> value-parameter keys: List<PublicKey> defined in net.corda.core.transactions.TransactionBuilder.addCommand[ValueParameterDescriptorImpl]

'check' @ [127:9] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'notary' @ [127:15] ==> public final var notary: Party? defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'window' @ [128:9] ==> protected final var window: TimeWindow? defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'timeWindow' @ [128:18] ==> value-parameter timeWindow: TimeWindow defined in net.corda.core.transactions.TransactionBuilder.setTimeWindow[ValueParameterDescriptorImpl]

'this' @ [129:16] ==> <this> defined in net.corda.core.transactions.TransactionBuilder[LazyClassReceiverParameterDescriptor]

'setTimeWindow' @ [139:65] ==> public final fun setTimeWindow(timeWindow: TimeWindow): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[SimpleFunctionDescriptorImpl]

'withTolerance' @ [139:90] ==> @JvmStatic public final fun withTolerance(instant: Instant, tolerance: Duration): TimeWindow defined in net.corda.core.contracts.TimeWindow.Companion[SimpleFunctionDescriptorImpl]

'time' @ [139:104] ==> value-parameter time: Instant defined in net.corda.core.transactions.TransactionBuilder.setTimeWindow[ValueParameterDescriptorImpl]

'timeTolerance' @ [139:110] ==> value-parameter timeTolerance: Duration defined in net.corda.core.transactions.TransactionBuilder.setTimeWindow[ValueParameterDescriptorImpl]

'this' @ [142:9] ==> <this> defined in net.corda.core.transactions.TransactionBuilder[LazyClassReceiverParameterDescriptor]

'privacySalt' @ [142:14] ==> protected final var privacySalt: PrivacySalt defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'privacySalt' @ [142:28] ==> value-parameter privacySalt: PrivacySalt defined in net.corda.core.transactions.TransactionBuilder.setPrivacySalt[ValueParameterDescriptorImpl]

'this' @ [143:16] ==> <this> defined in net.corda.core.transactions.TransactionBuilder[LazyClassReceiverParameterDescriptor]

'ArrayList' @ [147:41] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (StateRef..StateRef?)>..Collection<(StateRef..StateRef?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (net.corda.core.contracts.StateRef..net.corda.core.contracts.StateRef?)

'inputs' @ [147:51] ==> protected final val inputs: MutableList<StateRef> defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'ArrayList' @ [148:43] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (SecureHash..SecureHash?)>..Collection<(SecureHash..SecureHash?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (net.corda.core.crypto.SecureHash..net.corda.core.crypto.SecureHash?)

'attachments' @ [148:53] ==> protected final val attachments: MutableList<SecureHash> defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'ArrayList' @ [149:53] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (TransactionState<ContractState>..TransactionState<ContractState>?)>..Collection<(TransactionState<ContractState>..TransactionState<ContractState>?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (net.corda.core.contracts.TransactionState<net.corda.core.contracts.ContractState>..net.corda.core.contracts.TransactionState<net.corda.core.contracts.ContractState>?)

'outputs' @ [149:63] ==> protected final val outputs: MutableList<TransactionState<ContractState>> defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'ArrayList' @ [150:40] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (Command<*>..Command<*>?)>..Collection<(Command<*>..Command<*>?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (net.corda.core.contracts.Command<*>..net.corda.core.contracts.Command<*>?)

'commands' @ [150:50] ==> protected final val commands: MutableList<Command<*>> defined in net.corda.core.transactions.TransactionBuilder[PropertyDescriptorImpl]

'toWireTransaction' @ [157:19] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[SimpleFunctionDescriptorImpl]

'SignableData' @ [158:28] ==> public constructor SignableData(txId: SecureHash, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.SignableData[ClassConstructorDescriptorImpl]

'wtx' @ [158:41] ==> val wtx: WireTransaction defined in net.corda.core.transactions.TransactionBuilder.toSignedTransaction[LocalVariableDescriptor]

'id' @ [158:45] ==> public open val id: SecureHash defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'signatureMetadata' @ [158:49] ==> value-parameter signatureMetadata: SignatureMetadata defined in net.corda.core.transactions.TransactionBuilder.toSignedTransaction[ValueParameterDescriptorImpl]

'keyManagementService' @ [159:19] ==> value-parameter keyManagementService: KeyManagementService defined in net.corda.core.transactions.TransactionBuilder.toSignedTransaction[ValueParameterDescriptorImpl]

'sign' @ [159:40] ==> @Suspendable public abstract fun sign(signableData: SignableData, publicKey: PublicKey): TransactionSignature defined in net.corda.core.node.services.KeyManagementService[SimpleFunctionDescriptorImpl]

'signableData' @ [159:45] ==> val signableData: SignableData defined in net.corda.core.transactions.TransactionBuilder.toSignedTransaction[LocalVariableDescriptor]

'publicKey' @ [159:59] ==> value-parameter publicKey: PublicKey defined in net.corda.core.transactions.TransactionBuilder.toSignedTransaction[ValueParameterDescriptorImpl]

'SignedTransaction' @ [160:16] ==> public constructor SignedTransaction(ctx: CoreTransaction, sigs: List<TransactionSignature>) defined in net.corda.core.transactions.SignedTransaction[ClassConstructorDescriptorImpl]

'wtx' @ [160:34] ==> val wtx: WireTransaction defined in net.corda.core.transactions.TransactionBuilder.toSignedTransaction[LocalVariableDescriptor]

'listOf' @ [160:39] ==> public fun <T> listOf(element: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'sig' @ [160:46] ==> val sig: TransactionSignature defined in net.corda.core.transactions.TransactionBuilder.toSignedTransaction[LocalVariableDescriptor]

