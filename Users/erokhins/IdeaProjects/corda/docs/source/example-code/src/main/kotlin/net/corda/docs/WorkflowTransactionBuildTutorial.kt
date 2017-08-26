'CordaSerializable' @ [24:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'TypeOnlyCommandData' @ [38:23] ==> public constructor TypeOnlyCommandData() defined in net.corda.core.contracts.TypeOnlyCommandData[DeserializedClassConstructorDescriptor]

'TypeOnlyCommandData' @ [39:27] ==> public constructor TypeOnlyCommandData() defined in net.corda.core.contracts.TypeOnlyCommandData[DeserializedClassConstructorDescriptor]

'NEW' @ [48:63] ==> enum entry NEW defined in net.corda.docs.WorkflowState[FakeCallableDescriptorForObject]

'UniqueIdentifier' @ [49:64] ==> public constructor UniqueIdentifier(externalId: String? = ..., id: UUID = ...) defined in net.corda.core.contracts.UniqueIdentifier[DeserializedClassConstructorDescriptor]

'tradeId' @ [49:81] ==> value-parameter tradeId: String defined in net.corda.docs.TradeApprovalContract.State.<init>[ValueParameterDescriptorImpl]

'TradeApprovalContract' @ [50:69] ==> public constructor TradeApprovalContract(blank: Void? = ...) defined in net.corda.docs.TradeApprovalContract[ClassConstructorDescriptorImpl]

'listOf' @ [52:42] ==> public fun <T> listOf(vararg elements: Party): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'source' @ [52:49] ==> public final val source: Party defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'counterparty' @ [52:57] ==> public final val counterparty: Party defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'parties' @ [53:64] ==> public final val parties: List<Party> defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'participants' @ [56:20] ==> public open val participants: List<AbstractParty> defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'any' @ [56:33] ==> public inline fun <T> Iterable<AbstractParty>.any(predicate: (AbstractParty) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'it' @ [56:39] ==> value-parameter it: AbstractParty defined in net.corda.docs.TradeApprovalContract.State.isRelevant.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [56:42] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'containsAny' @ [56:52] ==> public fun PublicKey.containsAny(otherKeys: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'ourKeys' @ [56:64] ==> value-parameter ourKeys: Set<PublicKey> defined in net.corda.docs.TradeApprovalContract.State.isRelevant[ValueParameterDescriptorImpl]

'tx' @ [65:23] ==> value-parameter tx: LedgerTransaction defined in net.corda.docs.TradeApprovalContract.verify[ValueParameterDescriptorImpl]

'commands' @ [65:26] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'requireSingleCommand' @ [65:35] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.requireSingleCommand(): AuthenticatedObject<TradeApprovalContract.Commands> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Commands

'requireNotNull' @ [66:9] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: TimeWindow?, lazyMessage: () -> Any): TimeWindow defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TimeWindow

'tx' @ [66:24] ==> value-parameter tx: LedgerTransaction defined in net.corda.docs.TradeApprovalContract.verify[ValueParameterDescriptorImpl]

'timeWindow' @ [66:27] ==> public final val timeWindow: TimeWindow? defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'when (command.value) {
            is Commands.Issue -> {
                requireThat {
                    "Issue of new WorkflowContract must not include any inputs" using (tx.inputs.isEmpty())
                    "Issue of new WorkflowContract must be in a unique transaction" using (tx.outputs.size == 1)
                }
                val issued = tx.outputsOfType<TradeApprovalContract.State>().single()
                requireThat {
                    "Issue requires the source Party as signer" using (command.signers.contains(issued.source.owningKey))
                    "Initial Issue state must be NEW" using (issued.state == WorkflowState.NEW)
                }
            }
            is Commands.Completed -> {
                val stateGroups = tx.groupStates(TradeApprovalContract.State::class.java) { it.linearId }
                require(stateGroups.size == 1) { "Must be only a single proposal in transaction" }
                for ((inputs, outputs) in stateGroups) {
                    val before = inputs.single()
                    val after = outputs.single()
                    requireThat {
                        "Only a non-final trade can be modified" using (before.state == WorkflowState.NEW)
                        "Output must be a final state" using (after.state in setOf(WorkflowState.APPROVED, WorkflowState.REJECTED))
                        "Completed command can only change state" using (before == after.copy(state = before.state))
                        "Completed command requires the source Party as signer" using (command.signers.contains(before.source.owningKey))
                        "Completed command requires the counterparty as signer" using (command.signers.contains(before.counterparty.owningKey))
                    }
                }
            }
            else -> throw IllegalArgumentException("Unrecognised Command $command")
        }' @ [67:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'command' @ [67:15] ==> val command: AuthenticatedObject<TradeApprovalContract.Commands> defined in net.corda.docs.TradeApprovalContract.verify[LocalVariableDescriptor]

'value' @ [67:23] ==> public final val value: TradeApprovalContract.Commands defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'requireThat' @ [69:17] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [70:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'tx' @ [70:88] ==> value-parameter tx: LedgerTransaction defined in net.corda.docs.TradeApprovalContract.verify[ValueParameterDescriptorImpl]

'inputs' @ [70:91] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'isEmpty' @ [70:98] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'using' @ [71:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'tx' @ [71:92] ==> value-parameter tx: LedgerTransaction defined in net.corda.docs.TradeApprovalContract.verify[ValueParameterDescriptorImpl]

'outputs' @ [71:95] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'size' @ [71:103] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'tx' @ [73:30] ==> value-parameter tx: LedgerTransaction defined in net.corda.docs.TradeApprovalContract.verify[ValueParameterDescriptorImpl]

'outputsOfType' @ [73:33] ==> public final inline fun <reified T : ContractState> outputsOfType(): List<TradeApprovalContract.State> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'single' @ [73:78] ==> public fun <T> List<TradeApprovalContract.State>.single(): TradeApprovalContract.State defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'requireThat' @ [74:17] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [75:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'command' @ [75:72] ==> val command: AuthenticatedObject<TradeApprovalContract.Commands> defined in net.corda.docs.TradeApprovalContract.verify[LocalVariableDescriptor]

'signers' @ [75:80] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'contains' @ [75:88] ==> public abstract fun contains(element: PublicKey): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'issued' @ [75:97] ==> val issued: TradeApprovalContract.State defined in net.corda.docs.TradeApprovalContract.verify[LocalVariableDescriptor]

'source' @ [75:104] ==> public final val source: Party defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'owningKey' @ [75:111] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'using' @ [76:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'issued' @ [76:62] ==> val issued: TradeApprovalContract.State defined in net.corda.docs.TradeApprovalContract.verify[LocalVariableDescriptor]

'state' @ [76:69] ==> public final val state: WorkflowState defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'NEW' @ [76:92] ==> enum entry NEW defined in net.corda.docs.WorkflowState[FakeCallableDescriptorForObject]

'tx' @ [80:35] ==> value-parameter tx: LedgerTransaction defined in net.corda.docs.TradeApprovalContract.verify[ValueParameterDescriptorImpl]

'groupStates' @ [80:38] ==> public final fun <T : ContractState, K : Any> groupStates(ofType: Class<TradeApprovalContract.State>, selector: (TradeApprovalContract.State) -> UniqueIdentifier): List<LedgerTransaction.InOutGroup<TradeApprovalContract.State, UniqueIdentifier>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> State
    <K : Any> -> UniqueIdentifier

'State' @ [80:72] ==> public constructor State(tradeId: String, source: Party, counterparty: Party, state: WorkflowState = ..., linearId: UniqueIdentifier = ..., contract: TradeApprovalContract = ...) defined in net.corda.docs.TradeApprovalContract.State[ClassConstructorDescriptorImpl]

'java' @ [80:85] ==> public val <T> KClass<TradeApprovalContract.State>.java: Class<TradeApprovalContract.State> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> State

'it' @ [80:93] ==> value-parameter it: TradeApprovalContract.State defined in net.corda.docs.TradeApprovalContract.verify.<anonymous>[ValueParameterDescriptorImpl]

'linearId' @ [80:96] ==> public open val linearId: UniqueIdentifier defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'require' @ [81:17] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'stateGroups' @ [81:25] ==> val stateGroups: List<LedgerTransaction.InOutGroup<TradeApprovalContract.State, UniqueIdentifier>> defined in net.corda.docs.TradeApprovalContract.verify[LocalVariableDescriptor]

'size' @ [81:37] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'component1' @ [82:23] ==> public final operator fun component1(): List<TradeApprovalContract.State> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'component2' @ [82:31] ==> public final operator fun component2(): List<TradeApprovalContract.State> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'stateGroups' @ [82:43] ==> val stateGroups: List<LedgerTransaction.InOutGroup<TradeApprovalContract.State, UniqueIdentifier>> defined in net.corda.docs.TradeApprovalContract.verify[LocalVariableDescriptor]

'inputs' @ [83:34] ==> val inputs: List<TradeApprovalContract.State> defined in net.corda.docs.TradeApprovalContract.verify[LocalVariableDescriptor]

'single' @ [83:41] ==> public fun <T> List<TradeApprovalContract.State>.single(): TradeApprovalContract.State defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'outputs' @ [84:33] ==> val outputs: List<TradeApprovalContract.State> defined in net.corda.docs.TradeApprovalContract.verify[LocalVariableDescriptor]

'single' @ [84:41] ==> public fun <T> List<TradeApprovalContract.State>.single(): TradeApprovalContract.State defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'requireThat' @ [85:21] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [86:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'before' @ [86:73] ==> val before: TradeApprovalContract.State defined in net.corda.docs.TradeApprovalContract.verify[LocalVariableDescriptor]

'state' @ [86:80] ==> public final val state: WorkflowState defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'NEW' @ [86:103] ==> enum entry NEW defined in net.corda.docs.WorkflowState[FakeCallableDescriptorForObject]

'using' @ [87:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'after' @ [87:63] ==> val after: TradeApprovalContract.State defined in net.corda.docs.TradeApprovalContract.verify[LocalVariableDescriptor]

'state' @ [87:69] ==> public final val state: WorkflowState defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'setOf' @ [87:78] ==> public fun <T> setOf(vararg elements: WorkflowState): Set<WorkflowState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WorkflowState

'APPROVED' @ [87:98] ==> enum entry APPROVED defined in net.corda.docs.WorkflowState[FakeCallableDescriptorForObject]

'REJECTED' @ [87:122] ==> enum entry REJECTED defined in net.corda.docs.WorkflowState[FakeCallableDescriptorForObject]

'using' @ [88:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'before' @ [88:74] ==> val before: TradeApprovalContract.State defined in net.corda.docs.TradeApprovalContract.verify[LocalVariableDescriptor]

'after' @ [88:84] ==> val after: TradeApprovalContract.State defined in net.corda.docs.TradeApprovalContract.verify[LocalVariableDescriptor]

'copy' @ [88:90] ==> public final fun copy(tradeId: String = ..., source: Party = ..., counterparty: Party = ..., state: WorkflowState = ..., linearId: UniqueIdentifier = ..., contract: TradeApprovalContract = ...): TradeApprovalContract.State defined in net.corda.docs.TradeApprovalContract.State[SimpleFunctionDescriptorImpl]

'before' @ [88:103] ==> val before: TradeApprovalContract.State defined in net.corda.docs.TradeApprovalContract.verify[LocalVariableDescriptor]

'state' @ [88:110] ==> public final val state: WorkflowState defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'using' @ [89:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'command' @ [89:88] ==> val command: AuthenticatedObject<TradeApprovalContract.Commands> defined in net.corda.docs.TradeApprovalContract.verify[LocalVariableDescriptor]

'signers' @ [89:96] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'contains' @ [89:104] ==> public abstract fun contains(element: PublicKey): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'before' @ [89:113] ==> val before: TradeApprovalContract.State defined in net.corda.docs.TradeApprovalContract.verify[LocalVariableDescriptor]

'source' @ [89:120] ==> public final val source: Party defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'owningKey' @ [89:127] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'using' @ [90:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'command' @ [90:88] ==> val command: AuthenticatedObject<TradeApprovalContract.Commands> defined in net.corda.docs.TradeApprovalContract.verify[LocalVariableDescriptor]

'signers' @ [90:96] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'contains' @ [90:104] ==> public abstract fun contains(element: PublicKey): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'before' @ [90:113] ==> val before: TradeApprovalContract.State defined in net.corda.docs.TradeApprovalContract.verify[LocalVariableDescriptor]

'counterparty' @ [90:120] ==> public final val counterparty: Party defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'owningKey' @ [90:133] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'IllegalArgumentException' @ [94:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'command' @ [94:75] ==> val command: AuthenticatedObject<TradeApprovalContract.Commands> defined in net.corda.docs.TradeApprovalContract.verify[LocalVariableDescriptor]

'FlowLogic<StateAndRef<TradeApprovalContract.State>>' @ [105:58] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> StateAndRef<State>

'Suspendable' @ [106:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'State' @ [109:51] ==> public constructor State(tradeId: String, source: Party, counterparty: Party, state: WorkflowState = ..., linearId: UniqueIdentifier = ..., contract: TradeApprovalContract = ...) defined in net.corda.docs.TradeApprovalContract.State[ClassConstructorDescriptorImpl]

'tradeId' @ [110:17] ==> public final val tradeId: String defined in net.corda.docs.SubmitTradeApprovalFlow[PropertyDescriptorImpl]

'serviceHub' @ [111:17] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.SubmitTradeApprovalFlow[DeserializedPropertyDescriptor]

'myInfo' @ [111:28] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [111:35] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'counterparty' @ [112:17] ==> public final val counterparty: Party defined in net.corda.docs.SubmitTradeApprovalFlow[PropertyDescriptorImpl]

'serviceHub' @ [114:22] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.SubmitTradeApprovalFlow[DeserializedPropertyDescriptor]

'networkMapCache' @ [114:33] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'getAnyNotary' @ [114:49] ==> public open fun getAnyNotary(type: ServiceType? = ...): Party? defined in net.corda.core.node.services.NetworkMapCache[DeserializedSimpleFunctionDescriptor]

'TransactionBuilder' @ [116:18] ==> public constructor TransactionBuilder(notary: Party? = ..., lockId: UUID = ..., inputs: MutableList<StateRef> = ..., attachments: MutableList<SecureHash> = ..., outputs: MutableList<TransactionState<ContractState>> = ..., commands: MutableList<Command<*>> = ..., window: TimeWindow? = ..., privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [116:37] ==> val notary: Party? defined in net.corda.docs.SubmitTradeApprovalFlow.call[LocalVariableDescriptor]

'withItems' @ [117:18] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'tradeProposal' @ [117:28] ==> val tradeProposal: TradeApprovalContract.State defined in net.corda.docs.SubmitTradeApprovalFlow.call[LocalVariableDescriptor]

'Command' @ [117:43] ==> public constructor Command<T : CommandData>(value: TradeApprovalContract.Commands.Issue, signers: List<PublicKey>) defined in net.corda.core.contracts.Command[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : CommandData> -> Issue

'Issue' @ [117:82] ==> public constructor Issue() defined in net.corda.docs.TradeApprovalContract.Commands.Issue[ClassConstructorDescriptorImpl]

'listOf' @ [117:91] ==> public fun <T> listOf(element: PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'tradeProposal' @ [117:98] ==> val tradeProposal: TradeApprovalContract.State defined in net.corda.docs.SubmitTradeApprovalFlow.call[LocalVariableDescriptor]

'source' @ [117:112] ==> public final val source: Party defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'owningKey' @ [117:119] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'tx' @ [118:9] ==> val tx: TransactionBuilder defined in net.corda.docs.SubmitTradeApprovalFlow.call[LocalVariableDescriptor]

'setTimeWindow' @ [118:12] ==> public final fun setTimeWindow(time: Instant, timeTolerance: Duration): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [118:26] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.SubmitTradeApprovalFlow[DeserializedPropertyDescriptor]

'clock' @ [118:37] ==> public abstract val clock: Clock defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'instant' @ [118:43] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'seconds' @ [118:57] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'serviceHub' @ [120:24] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.SubmitTradeApprovalFlow[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [120:35] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'tx' @ [120:58] ==> val tx: TransactionBuilder defined in net.corda.docs.SubmitTradeApprovalFlow.call[LocalVariableDescriptor]

'subFlow' @ [122:9] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<List<SignedTransaction>>): List<SignedTransaction> defined in net.corda.docs.SubmitTradeApprovalFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<SignedTransaction>

'FinalityFlow' @ [122:17] ==> public constructor FinalityFlow(transaction: SignedTransaction, extraParticipants: Set<Party>) defined in net.corda.core.flows.FinalityFlow[DeserializedClassConstructorDescriptor]

'signedTx' @ [122:30] ==> val signedTx: SignedTransaction defined in net.corda.docs.SubmitTradeApprovalFlow.call[LocalVariableDescriptor]

'setOf' @ [122:40] ==> public fun <T> setOf(vararg elements: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'serviceHub' @ [122:46] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.SubmitTradeApprovalFlow[DeserializedPropertyDescriptor]

'myInfo' @ [122:57] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [122:64] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'counterparty' @ [122:79] ==> public final val counterparty: Party defined in net.corda.docs.SubmitTradeApprovalFlow[PropertyDescriptorImpl]

'signedTx' @ [124:16] ==> val signedTx: SignedTransaction defined in net.corda.docs.SubmitTradeApprovalFlow.call[LocalVariableDescriptor]

'tx' @ [124:25] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [124:28] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<TradeApprovalContract.State> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> State

'InitiatingFlow' @ [133:1] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'FlowLogic<StateAndRef<TradeApprovalContract.State>>' @ [134:77] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> StateAndRef<State>

'require' @ [136:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'verdict' @ [136:17] ==> public final val verdict: WorkflowState defined in net.corda.docs.SubmitCompletionFlow[PropertyDescriptorImpl]

'setOf' @ [136:28] ==> public fun <T> setOf(vararg elements: WorkflowState): Set<WorkflowState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WorkflowState

'APPROVED' @ [136:48] ==> enum entry APPROVED defined in net.corda.docs.WorkflowState[FakeCallableDescriptorForObject]

'REJECTED' @ [136:72] ==> enum entry REJECTED defined in net.corda.docs.WorkflowState[FakeCallableDescriptorForObject]

'Suspendable' @ [141:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'VaultQueryCriteria' @ [144:24] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'listOf' @ [144:55] ==> public fun <T> listOf(element: StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'ref' @ [144:62] ==> public final val ref: StateRef defined in net.corda.docs.SubmitCompletionFlow[PropertyDescriptorImpl]

'serviceHub' @ [145:28] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.SubmitCompletionFlow[DeserializedPropertyDescriptor]

'vaultQueryService' @ [145:39] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'queryBy' @ [145:57] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<TradeApprovalContract.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteria' @ [145:94] ==> val criteria: QueryCriteria.VaultQueryCriteria defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'states' @ [145:104] ==> public final val states: List<StateAndRef<TradeApprovalContract.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'single' @ [145:111] ==> public fun <T> List<StateAndRef<TradeApprovalContract.State>>.single(): StateAndRef<TradeApprovalContract.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'require' @ [149:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'latestRecord' @ [149:17] ==> val latestRecord: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'ref' @ [149:30] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'ref' @ [149:37] ==> public final val ref: StateRef defined in net.corda.docs.SubmitCompletionFlow[PropertyDescriptorImpl]

'ref' @ [150:27] ==> public final val ref: StateRef defined in net.corda.docs.SubmitCompletionFlow[PropertyDescriptorImpl]

'latestRecord' @ [150:54] ==> val latestRecord: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'require' @ [153:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'latestRecord' @ [153:17] ==> val latestRecord: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'state' @ [153:30] ==> public final val state: TransactionState<TradeApprovalContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [153:36] ==> public final val data: TradeApprovalContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'state' @ [153:41] ==> public final val state: WorkflowState defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'NEW' @ [153:64] ==> enum entry NEW defined in net.corda.docs.WorkflowState[FakeCallableDescriptorForObject]

'latestRecord' @ [154:43] ==> val latestRecord: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'state' @ [154:56] ==> public final val state: TransactionState<TradeApprovalContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [154:62] ==> public final val data: TradeApprovalContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'state' @ [154:67] ==> public final val state: WorkflowState defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'require' @ [157:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'latestRecord' @ [157:17] ==> val latestRecord: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'state' @ [157:30] ==> public final val state: TransactionState<TradeApprovalContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [157:36] ==> public final val data: TradeApprovalContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'counterparty' @ [157:41] ==> public final val counterparty: Party defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'serviceHub' @ [157:57] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.SubmitCompletionFlow[DeserializedPropertyDescriptor]

'myInfo' @ [157:68] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [157:75] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'latestRecord' @ [165:24] ==> val latestRecord: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'state' @ [165:37] ==> public final val state: TransactionState<TradeApprovalContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [165:43] ==> public final val data: TradeApprovalContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'copy' @ [165:48] ==> public final fun copy(tradeId: String = ..., source: Party = ..., counterparty: Party = ..., state: WorkflowState = ..., linearId: UniqueIdentifier = ..., contract: TradeApprovalContract = ...): TradeApprovalContract.State defined in net.corda.docs.TradeApprovalContract.State[SimpleFunctionDescriptorImpl]

'verdict' @ [165:61] ==> public final val verdict: WorkflowState defined in net.corda.docs.SubmitCompletionFlow[PropertyDescriptorImpl]

'latestRecord' @ [168:22] ==> val latestRecord: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'state' @ [168:35] ==> public final val state: TransactionState<TradeApprovalContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'notary' @ [168:41] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'TransactionBuilder' @ [174:18] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [174:37] ==> val notary: Party defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'withItems' @ [175:17] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'latestRecord' @ [176:25] ==> val latestRecord: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'newState' @ [177:25] ==> val newState: TradeApprovalContract.State defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'Command' @ [178:25] ==> public constructor Command<T : CommandData>(value: TradeApprovalContract.Commands.Completed, signers: List<PublicKey>) defined in net.corda.core.contracts.Command[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : CommandData> -> Completed

'Completed' @ [178:64] ==> public constructor Completed() defined in net.corda.docs.TradeApprovalContract.Commands.Completed[ClassConstructorDescriptorImpl]

'listOf' @ [179:33] ==> public fun <T> listOf(vararg elements: PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'serviceHub' @ [179:40] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.SubmitCompletionFlow[DeserializedPropertyDescriptor]

'myInfo' @ [179:51] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [179:58] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [179:72] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'latestRecord' @ [179:83] ==> val latestRecord: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'state' @ [179:96] ==> public final val state: TransactionState<TradeApprovalContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [179:102] ==> public final val data: TradeApprovalContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'source' @ [179:107] ==> public final val source: Party defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'owningKey' @ [179:114] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'tx' @ [180:9] ==> val tx: TransactionBuilder defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'setTimeWindow' @ [180:12] ==> public final fun setTimeWindow(time: Instant, timeTolerance: Duration): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [180:26] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.SubmitCompletionFlow[DeserializedPropertyDescriptor]

'clock' @ [180:37] ==> public abstract val clock: Clock defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'instant' @ [180:43] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'seconds' @ [180:57] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'serviceHub' @ [185:28] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.SubmitCompletionFlow[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [185:39] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'tx' @ [185:62] ==> val tx: TransactionBuilder defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'sendAndReceive' @ [188:32] ==> public final inline fun <reified R : Any> sendAndReceive(otherParty: Party, payload: Any): UntrustworthyData<TransactionSignature> defined in net.corda.docs.SubmitCompletionFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> TransactionSignature

'newState' @ [188:69] ==> val newState: TradeApprovalContract.State defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'source' @ [188:78] ==> public final val source: Party defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'selfSignedTx' @ [188:86] ==> val selfSignedTx: SignedTransaction defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'unwrap' @ [188:100] ==> public inline fun <T, R> UntrustworthyData<TransactionSignature>.unwrap(validator: (TransactionSignature) -> SignedTransaction): SignedTransaction defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature
    <R> -> SignedTransaction

'selfSignedTx' @ [190:28] ==> val selfSignedTx: SignedTransaction defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'it' @ [190:43] ==> value-parameter it: TransactionSignature defined in net.corda.docs.SubmitCompletionFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'agreedTx' @ [193:13] ==> val agreedTx: SignedTransaction defined in net.corda.docs.SubmitCompletionFlow.call.<anonymous>[LocalVariableDescriptor]

'verifySignaturesExcept' @ [193:22] ==> public open fun verifySignaturesExcept(vararg allowedToBeMissing: PublicKey): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'notary' @ [193:45] ==> val notary: Party defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'owningKey' @ [193:52] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'agreedTx' @ [196:13] ==> val agreedTx: SignedTransaction defined in net.corda.docs.SubmitCompletionFlow.call.<anonymous>[LocalVariableDescriptor]

'tx' @ [196:22] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'toLedgerTransaction' @ [196:25] ==> public final fun toLedgerTransaction(services: ServicesForResolution): LedgerTransaction defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [196:45] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.SubmitCompletionFlow[DeserializedPropertyDescriptor]

'verify' @ [196:57] ==> public final fun verify(): Unit defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'agreedTx' @ [198:13] ==> val agreedTx: SignedTransaction defined in net.corda.docs.SubmitCompletionFlow.call.<anonymous>[LocalVariableDescriptor]

'subFlow' @ [202:9] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<List<SignedTransaction>>): List<SignedTransaction> defined in net.corda.docs.SubmitCompletionFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<SignedTransaction>

'FinalityFlow' @ [202:17] ==> public constructor FinalityFlow(transaction: SignedTransaction, extraParticipants: Set<Party>) defined in net.corda.core.flows.FinalityFlow[DeserializedClassConstructorDescriptor]

'allPartySignedTx' @ [202:30] ==> val allPartySignedTx: SignedTransaction defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'setOf' @ [202:48] ==> public fun <T> setOf(vararg elements: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'latestRecord' @ [202:54] ==> val latestRecord: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'state' @ [202:67] ==> public final val state: TransactionState<TradeApprovalContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [202:73] ==> public final val data: TradeApprovalContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'source' @ [202:78] ==> public final val source: Party defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'latestRecord' @ [202:86] ==> val latestRecord: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'state' @ [202:99] ==> public final val state: TransactionState<TradeApprovalContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [202:105] ==> public final val data: TradeApprovalContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'counterparty' @ [202:110] ==> public final val counterparty: Party defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'allPartySignedTx' @ [205:16] ==> val allPartySignedTx: SignedTransaction defined in net.corda.docs.SubmitCompletionFlow.call[LocalVariableDescriptor]

'tx' @ [205:33] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [205:36] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<TradeApprovalContract.State> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> State

'InitiatedBy' @ [214:1] ==> public constructor InitiatedBy(value: KClass<out FlowLogic<*>>) defined in net.corda.core.flows.InitiatedBy[DeserializedClassConstructorDescriptor]

'SubmitCompletionFlow' @ [214:14] ==> public constructor SubmitCompletionFlow(ref: StateRef, verdict: WorkflowState) defined in net.corda.docs.SubmitCompletionFlow[ClassConstructorDescriptorImpl]

'FlowLogic<Unit>' @ [215:49] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Suspendable' @ [216:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'receive' @ [220:26] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<SignedTransaction> defined in net.corda.docs.RecordCompletionFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> SignedTransaction

'source' @ [220:53] ==> public final val source: Party defined in net.corda.docs.RecordCompletionFlow[PropertyDescriptorImpl]

'unwrap' @ [220:61] ==> public inline fun <T, R> UntrustworthyData<SignedTransaction>.unwrap(validator: (SignedTransaction) -> SignedTransaction): SignedTransaction defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <R> -> SignedTransaction

'it' @ [222:13] ==> value-parameter it: SignedTransaction defined in net.corda.docs.RecordCompletionFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'verifySignaturesExcept' @ [222:16] ==> public open fun verifySignaturesExcept(vararg allowedToBeMissing: PublicKey): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [222:39] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.RecordCompletionFlow[DeserializedPropertyDescriptor]

'myInfo' @ [222:50] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [222:57] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [222:71] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'it' @ [222:82] ==> value-parameter it: SignedTransaction defined in net.corda.docs.RecordCompletionFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [222:85] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'notary' @ [222:88] ==> public open val notary: Party? defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'owningKey' @ [222:97] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'it' @ [224:23] ==> value-parameter it: SignedTransaction defined in net.corda.docs.RecordCompletionFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'toLedgerTransaction' @ [224:26] ==> @JvmOverloads public final fun toLedgerTransaction(services: ServiceHub, checkSufficientSignatures: Boolean = ...): LedgerTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [224:46] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.RecordCompletionFlow[DeserializedPropertyDescriptor]

'ltx' @ [225:13] ==> val ltx: LedgerTransaction defined in net.corda.docs.RecordCompletionFlow.call.<anonymous>[LocalVariableDescriptor]

'verify' @ [225:17] ==> public final fun verify(): Unit defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'require' @ [227:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'ltx' @ [227:21] ==> val ltx: LedgerTransaction defined in net.corda.docs.RecordCompletionFlow.call.<anonymous>[LocalVariableDescriptor]

'commands' @ [227:25] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'single' @ [227:34] ==> public fun <T> List<AuthenticatedObject<CommandData>>.single(): AuthenticatedObject<CommandData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<CommandData>

'value' @ [227:43] ==> public final val value: CommandData defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'ltx' @ [232:25] ==> val ltx: LedgerTransaction defined in net.corda.docs.RecordCompletionFlow.call.<anonymous>[LocalVariableDescriptor]

'outRef' @ [232:29] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<TradeApprovalContract.State> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> State

'require' @ [233:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'state' @ [233:21] ==> val state: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.RecordCompletionFlow.call.<anonymous>[LocalVariableDescriptor]

'state' @ [233:27] ==> public final val state: TransactionState<TradeApprovalContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [233:33] ==> public final val data: TradeApprovalContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'source' @ [233:38] ==> public final val source: Party defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'serviceHub' @ [233:48] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.RecordCompletionFlow[DeserializedPropertyDescriptor]

'myInfo' @ [233:59] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [233:66] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'require' @ [236:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'state' @ [236:21] ==> val state: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.RecordCompletionFlow.call.<anonymous>[LocalVariableDescriptor]

'state' @ [236:27] ==> public final val state: TransactionState<TradeApprovalContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [236:33] ==> public final val data: TradeApprovalContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'counterparty' @ [236:38] ==> public final val counterparty: Party defined in net.corda.docs.TradeApprovalContract.State[PropertyDescriptorImpl]

'source' @ [236:54] ==> public final val source: Party defined in net.corda.docs.RecordCompletionFlow[PropertyDescriptorImpl]

'it' @ [239:13] ==> value-parameter it: SignedTransaction defined in net.corda.docs.RecordCompletionFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'serviceHub' @ [243:28] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.RecordCompletionFlow[DeserializedPropertyDescriptor]

'createSignature' @ [243:39] ==> public open fun createSignature(signedTransaction: SignedTransaction): TransactionSignature defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'completeTx' @ [243:55] ==> val completeTx: SignedTransaction defined in net.corda.docs.RecordCompletionFlow.call[LocalVariableDescriptor]

'send' @ [245:9] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.docs.RecordCompletionFlow[DeserializedSimpleFunctionDescriptor]

'source' @ [245:14] ==> public final val source: Party defined in net.corda.docs.RecordCompletionFlow[PropertyDescriptorImpl]

'ourSignature' @ [245:22] ==> val ourSignature: TransactionSignature defined in net.corda.docs.RecordCompletionFlow.call[LocalVariableDescriptor]

