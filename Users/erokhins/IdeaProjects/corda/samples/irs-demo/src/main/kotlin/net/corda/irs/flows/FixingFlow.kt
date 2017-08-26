'InitiatedBy' @ [35:5] ==> public constructor InitiatedBy(value: KClass<out FlowLogic<*>>) defined in net.corda.core.flows.InitiatedBy[DeserializedClassConstructorDescriptor]

'FixingRoleDecider' @ [35:18] ==> public companion object defined in net.corda.irs.flows.FixingFlow.FixingRoleDecider[FakeCallableDescriptorForObject]

'TwoPartyDealFlow.Secondary<FixingSession>' @ [36:51] ==> public constructor Secondary<U>(progressTracker: ProgressTracker = ...) defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[DeserializedClassConstructorDescriptor]
Inferred types:
    <U> -> FixingSession

'logger' @ [42:13] ==> public final val logger: Logger defined in net.corda.irs.flows.FixingFlow.Fixer[DeserializedPropertyDescriptor]

'trace' @ [42:20] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'handshake' @ [42:55] ==> value-parameter handshake: TwoPartyDealFlow.Handshake<FixingFlow.FixingSession> defined in net.corda.irs.flows.FixingFlow.Fixer.validateHandshake[ValueParameterDescriptorImpl]

'payload' @ [42:65] ==> public final val payload: FixingFlow.FixingSession defined in net.corda.finance.flows.TwoPartyDealFlow.Handshake[DeserializedPropertyDescriptor]

'txState' @ [44:13] ==> private final lateinit var txState: TransactionState<*> defined in net.corda.irs.flows.FixingFlow.Fixer[PropertyDescriptorImpl]

'serviceHub' @ [44:23] ==> public final val serviceHub: ServiceHub defined in net.corda.irs.flows.FixingFlow.Fixer[DeserializedPropertyDescriptor]

'loadState' @ [44:34] ==> public open fun loadState(stateRef: StateRef): TransactionState<*> defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'handshake' @ [44:44] ==> value-parameter handshake: TwoPartyDealFlow.Handshake<FixingFlow.FixingSession> defined in net.corda.irs.flows.FixingFlow.Fixer.validateHandshake[ValueParameterDescriptorImpl]

'payload' @ [44:54] ==> public final val payload: FixingFlow.FixingSession defined in net.corda.finance.flows.TwoPartyDealFlow.Handshake[DeserializedPropertyDescriptor]

'ref' @ [44:62] ==> public final val ref: StateRef defined in net.corda.irs.flows.FixingFlow.FixingSession[PropertyDescriptorImpl]

'deal' @ [45:13] ==> private final lateinit var deal: FixableDealState defined in net.corda.irs.flows.FixingFlow.Fixer[PropertyDescriptorImpl]

'txState' @ [45:20] ==> private final lateinit var txState: TransactionState<*> defined in net.corda.irs.flows.FixingFlow.Fixer[PropertyDescriptorImpl]

'data' @ [45:28] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'require' @ [50:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'deal' @ [50:21] ==> private final lateinit var deal: FixableDealState defined in net.corda.irs.flows.FixingFlow.Fixer[PropertyDescriptorImpl]

'participants' @ [50:26] ==> public abstract val participants: List<AbstractParty> defined in net.corda.finance.contracts.FixableDealState[DeserializedPropertyDescriptor]

'count' @ [50:39] ==> public inline fun <T> Iterable<AbstractParty>.count(predicate: (AbstractParty) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'it' @ [50:47] ==> value-parameter it: AbstractParty defined in net.corda.irs.flows.FixingFlow.Fixer.validateHandshake.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [50:50] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'serviceHub' @ [50:63] ==> public final val serviceHub: ServiceHub defined in net.corda.irs.flows.FixingFlow.Fixer[DeserializedPropertyDescriptor]

'myInfo' @ [50:74] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [50:81] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [50:95] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'handshake' @ [52:20] ==> value-parameter handshake: TwoPartyDealFlow.Handshake<FixingFlow.FixingSession> defined in net.corda.irs.flows.FixingFlow.Fixer.validateHandshake[ValueParameterDescriptorImpl]

'Suspendable' @ [55:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Suppress' @ [57:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'deal' @ [58:25] ==> private final lateinit var deal: FixableDealState defined in net.corda.irs.flows.FixingFlow.Fixer[PropertyDescriptorImpl]

'nextFixingOf' @ [58:30] ==> public abstract fun nextFixingOf(): FixOf? defined in net.corda.finance.contracts.FixableDealState[DeserializedSimpleFunctionDescriptor]

'deal' @ [61:30] ==> private final lateinit var deal: FixableDealState defined in net.corda.irs.flows.FixingFlow.Fixer[PropertyDescriptorImpl]

'participants' @ [61:35] ==> public abstract val participants: List<AbstractParty> defined in net.corda.finance.contracts.FixableDealState[DeserializedPropertyDescriptor]

'single' @ [61:48] ==> public inline fun <T> Iterable<AbstractParty>.single(predicate: (AbstractParty) -> Boolean): AbstractParty defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'it' @ [61:57] ==> value-parameter it: AbstractParty defined in net.corda.irs.flows.FixingFlow.Fixer.assembleSharedTX.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [61:60] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'serviceHub' @ [61:73] ==> public final val serviceHub: ServiceHub defined in net.corda.irs.flows.FixingFlow.Fixer[DeserializedPropertyDescriptor]

'myInfo' @ [61:84] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [61:91] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [61:105] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'deal' @ [63:27] ==> private final lateinit var deal: FixableDealState defined in net.corda.irs.flows.FixingFlow.Fixer[PropertyDescriptorImpl]

'TransactionBuilder' @ [65:23] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'txState' @ [65:42] ==> private final lateinit var txState: TransactionState<*> defined in net.corda.irs.flows.FixingFlow.Fixer[PropertyDescriptorImpl]

'notary' @ [65:50] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'serviceHub' @ [67:26] ==> public final val serviceHub: ServiceHub defined in net.corda.irs.flows.FixingFlow.Fixer[DeserializedPropertyDescriptor]

'networkMapCache' @ [67:37] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'getNodesWithService' @ [67:53] ==> public open fun getNodesWithService(serviceType: ServiceType): List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedSimpleFunctionDescriptor]

'handshake' @ [67:73] ==> value-parameter handshake: TwoPartyDealFlow.Handshake<FixingFlow.FixingSession> defined in net.corda.irs.flows.FixingFlow.Fixer.assembleSharedTX[ValueParameterDescriptorImpl]

'payload' @ [67:83] ==> public final val payload: FixingFlow.FixingSession defined in net.corda.finance.flows.TwoPartyDealFlow.Handshake[DeserializedPropertyDescriptor]

'oracleType' @ [67:91] ==> public final val oracleType: ServiceType defined in net.corda.irs.flows.FixingFlow.FixingSession[PropertyDescriptorImpl]

'first' @ [67:103] ==> public fun <T> List<NodeInfo>.first(): NodeInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'oracle' @ [68:31] ==> val oracle: NodeInfo defined in net.corda.irs.flows.FixingFlow.Fixer.assembleSharedTX[LocalVariableDescriptor]

'serviceIdentities' @ [68:38] ==> public final fun serviceIdentities(type: ServiceType): List<Party> defined in net.corda.core.node.NodeInfo[DeserializedSimpleFunctionDescriptor]

'handshake' @ [68:56] ==> value-parameter handshake: TwoPartyDealFlow.Handshake<FixingFlow.FixingSession> defined in net.corda.irs.flows.FixingFlow.Fixer.assembleSharedTX[ValueParameterDescriptorImpl]

'payload' @ [68:66] ==> public final val payload: FixingFlow.FixingSession defined in net.corda.finance.flows.TwoPartyDealFlow.Handshake[DeserializedPropertyDescriptor]

'oracleType' @ [68:74] ==> public final val oracleType: ServiceType defined in net.corda.irs.flows.FixingFlow.FixingSession[PropertyDescriptorImpl]

'first' @ [68:86] ==> public fun <T> List<Party>.first(): Party defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'RatesFixFlow' @ [71:38] ==> public constructor RatesFixFlow(tx: TransactionBuilder, oracle: Party, fixOf: FixOf, expectedRate: BigDecimal, rateTolerance: BigDecimal, progressTracker: ProgressTracker = ...) defined in net.corda.irs.flows.RatesFixFlow[ClassConstructorDescriptorImpl]

'ptx' @ [71:51] ==> val ptx: TransactionBuilder defined in net.corda.irs.flows.FixingFlow.Fixer.assembleSharedTX[LocalVariableDescriptor]

'oracleParty' @ [71:56] ==> val oracleParty: Party defined in net.corda.irs.flows.FixingFlow.Fixer.assembleSharedTX[LocalVariableDescriptor]

'fixOf' @ [71:69] ==> val fixOf: FixOf defined in net.corda.irs.flows.FixingFlow.Fixer.assembleSharedTX[LocalVariableDescriptor]

'ZERO' @ [71:87] ==> public final val ZERO: (BigDecimal..BigDecimal?) defined in java.math.BigDecimal[JavaPropertyDescriptor]

'ONE' @ [71:104] ==> public final val ONE: (BigDecimal..BigDecimal?) defined in java.math.BigDecimal[JavaPropertyDescriptor]

'Suspendable' @ [72:17] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'newDeal' @ [74:21] ==> val newDeal: FixableDealState defined in net.corda.irs.flows.FixingFlow.Fixer.assembleSharedTX[LocalVariableDescriptor]

'generateFix' @ [74:29] ==> public abstract fun generateFix(ptx: TransactionBuilder, oldState: StateAndRef<*>, fix: Fix): Unit defined in net.corda.finance.contracts.FixableDealState[DeserializedSimpleFunctionDescriptor]

'ptx' @ [74:41] ==> val ptx: TransactionBuilder defined in net.corda.irs.flows.FixingFlow.Fixer.assembleSharedTX[LocalVariableDescriptor]

'StateAndRef' @ [74:46] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<ContractState>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> ContractState

'txState' @ [74:58] ==> private final lateinit var txState: TransactionState<*> defined in net.corda.irs.flows.FixingFlow.Fixer[PropertyDescriptorImpl]

'handshake' @ [74:67] ==> value-parameter handshake: TwoPartyDealFlow.Handshake<FixingFlow.FixingSession> defined in net.corda.irs.flows.FixingFlow.Fixer.assembleSharedTX[ValueParameterDescriptorImpl]

'payload' @ [74:77] ==> public final val payload: FixingFlow.FixingSession defined in net.corda.finance.flows.TwoPartyDealFlow.Handshake[DeserializedPropertyDescriptor]

'ref' @ [74:85] ==> public final val ref: StateRef defined in net.corda.irs.flows.FixingFlow.FixingSession[PropertyDescriptorImpl]

'fix' @ [74:91] ==> value-parameter fix: Fix defined in net.corda.irs.flows.FixingFlow.Fixer.assembleSharedTX.<no name provided>.beforeSigning[ValueParameterDescriptorImpl]

'ptx' @ [78:21] ==> val ptx: TransactionBuilder defined in net.corda.irs.flows.FixingFlow.Fixer.assembleSharedTX[LocalVariableDescriptor]

'setTimeWindow' @ [78:25] ==> public final fun setTimeWindow(time: Instant, timeTolerance: Duration): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [78:39] ==> public final val serviceHub: ServiceHub defined in net.corda.irs.flows.FixingFlow.Fixer.assembleSharedTX.<no name provided>[DeserializedPropertyDescriptor]

'clock' @ [78:50] ==> public abstract val clock: Clock defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'instant' @ [78:56] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'seconds' @ [78:70] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'Suspendable' @ [81:17] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'when (elem) {
                        is Command<*> -> oracleParty.owningKey in elem.signers && elem.value is Fix
                        else -> false
                    }' @ [83:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'elem' @ [83:34] ==> value-parameter elem: Any defined in net.corda.irs.flows.FixingFlow.Fixer.assembleSharedTX.<no name provided>.filtering[ValueParameterDescriptorImpl]

'oracleParty' @ [84:42] ==> val oracleParty: Party defined in net.corda.irs.flows.FixingFlow.Fixer.assembleSharedTX[LocalVariableDescriptor]

'owningKey' @ [84:54] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'elem' @ [84:67] ==> value-parameter elem: Any defined in net.corda.irs.flows.FixingFlow.Fixer.assembleSharedTX.<no name provided>.filtering[ValueParameterDescriptorImpl]

'signers' @ [84:72] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'elem' @ [84:83] ==> value-parameter elem: Any defined in net.corda.irs.flows.FixingFlow.Fixer.assembleSharedTX.<no name provided>.filtering[ValueParameterDescriptorImpl]

'value' @ [84:88] ==> public final val value: CommandData defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'subFlow' @ [89:23] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<TransactionSignature>): TransactionSignature defined in net.corda.irs.flows.FixingFlow.Fixer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> TransactionSignature

'addFixing' @ [89:31] ==> val addFixing: <no name provided> defined in net.corda.irs.flows.FixingFlow.Fixer.assembleSharedTX[LocalVariableDescriptor]

'Triple' @ [91:20] ==> public constructor Triple<out A, out B, out C>(first: TransactionBuilder, second: ArrayList<PublicKey> /* = ArrayList<PublicKey> */, third: List<TransactionSignature>) defined in kotlin.Triple[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> TransactionBuilder
    <out B> -> ArrayList<PublicKey>
    <out C> -> List<TransactionSignature>

'ptx' @ [91:27] ==> val ptx: TransactionBuilder defined in net.corda.irs.flows.FixingFlow.Fixer.assembleSharedTX[LocalVariableDescriptor]

'arrayListOf' @ [91:32] ==> public fun <T> arrayListOf(vararg elements: PublicKey): ArrayList<PublicKey> /* = ArrayList<PublicKey> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'myOldParty' @ [91:44] ==> val myOldParty: AbstractParty defined in net.corda.irs.flows.FixingFlow.Fixer.assembleSharedTX[LocalVariableDescriptor]

'owningKey' @ [91:55] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'listOf' @ [91:67] ==> public fun <T> listOf(element: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'sig' @ [91:74] ==> val sig: TransactionSignature defined in net.corda.irs.flows.FixingFlow.Fixer.assembleSharedTX[LocalVariableDescriptor]

'TwoPartyDealFlow' @ [104:67] ==> public object TwoPartyDealFlow defined in net.corda.finance.flows[FakeCallableDescriptorForObject]

'tracker' @ [104:92] ==> public final fun tracker(): ProgressTracker defined in net.corda.finance.flows.TwoPartyDealFlow.Primary.Companion[DeserializedSimpleFunctionDescriptor]

'TwoPartyDealFlow.Primary' @ [104:105] ==> public constructor Primary(progressTracker: ProgressTracker = ...) defined in net.corda.finance.flows.TwoPartyDealFlow.Primary[DeserializedClassConstructorDescriptor]

'Suppress' @ [106:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'getValue' @ [107:66] ==> public final operator fun getValue(thisRef: Any?, property: KProperty<*>): T defined in net.corda.core.utilities.TransientProperty[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [108:25] ==> public final val serviceHub: ServiceHub defined in net.corda.irs.flows.FixingFlow.Floater[DeserializedPropertyDescriptor]

'loadState' @ [108:36] ==> public open fun loadState(stateRef: StateRef): TransactionState<*> defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'payload' @ [108:46] ==> public open val payload: FixingFlow.FixingSession defined in net.corda.irs.flows.FixingFlow.Floater[PropertyDescriptorImpl]

'ref' @ [108:54] ==> public final val ref: StateRef defined in net.corda.irs.flows.FixingFlow.FixingSession[PropertyDescriptorImpl]

'StateAndRef' @ [109:13] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<FixableDealState>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> FixableDealState

'state' @ [109:25] ==> val state: TransactionState<FixableDealState> defined in net.corda.irs.flows.FixingFlow.Floater.dealToFix.<anonymous>[LocalVariableDescriptor]

'payload' @ [109:32] ==> public open val payload: FixingFlow.FixingSession defined in net.corda.irs.flows.FixingFlow.Floater[PropertyDescriptorImpl]

'ref' @ [109:40] ==> public final val ref: StateRef defined in net.corda.irs.flows.FixingFlow.FixingSession[PropertyDescriptorImpl]

'dealToFix' @ [113:13] ==> @Suppress internal final val dealToFix: StateAndRef<FixableDealState> defined in net.corda.irs.flows.FixingFlow.Floater[PropertyDescriptorImpl]

'state' @ [113:23] ==> public final val state: TransactionState<FixableDealState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [113:29] ==> public final val data: FixableDealState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'participants' @ [113:34] ==> public abstract val participants: List<AbstractParty> defined in net.corda.finance.contracts.FixableDealState[DeserializedPropertyDescriptor]

'single' @ [113:47] ==> public inline fun <T> Iterable<AbstractParty>.single(predicate: (AbstractParty) -> Boolean): AbstractParty defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'it' @ [113:56] ==> value-parameter it: AbstractParty defined in net.corda.irs.flows.FixingFlow.Floater.<get-myKey>.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [113:59] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'serviceHub' @ [113:72] ==> public final val serviceHub: ServiceHub defined in net.corda.irs.flows.FixingFlow.Floater[DeserializedPropertyDescriptor]

'myInfo' @ [113:83] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [113:90] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [113:104] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'serviceHub' @ [114:20] ==> public final val serviceHub: ServiceHub defined in net.corda.irs.flows.FixingFlow.Floater[DeserializedPropertyDescriptor]

'legalIdentityKey' @ [114:31] ==> public open val legalIdentityKey: PublicKey defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'serviceHub' @ [118:20] ==> public final val serviceHub: ServiceHub defined in net.corda.irs.flows.FixingFlow.Floater[DeserializedPropertyDescriptor]

'networkMapCache' @ [118:31] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'notaryNodes' @ [118:47] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedPropertyDescriptor]

'single' @ [118:59] ==> public inline fun <T> Iterable<NodeInfo>.single(predicate: (NodeInfo) -> Boolean): NodeInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'it' @ [118:68] ==> value-parameter it: NodeInfo defined in net.corda.irs.flows.FixingFlow.Floater.<get-notaryNode>.<anonymous>[ValueParameterDescriptorImpl]

'notaryIdentity' @ [118:71] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'dealToFix' @ [118:89] ==> @Suppress internal final val dealToFix: StateAndRef<FixableDealState> defined in net.corda.irs.flows.FixingFlow.Floater[PropertyDescriptorImpl]

'state' @ [118:99] ==> public final val state: TransactionState<FixableDealState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'notary' @ [118:105] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'Suspendable' @ [121:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'requireThat' @ [121:75] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'CordaSerializable' @ [128:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'InitiatingFlow' @ [137:5] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'SchedulableFlow' @ [138:5] ==> public constructor SchedulableFlow() defined in net.corda.core.flows.SchedulableFlow[DeserializedClassConstructorDescriptor]

'FlowLogic<Unit>' @ [139:97] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Suppress' @ [140:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'this' @ [141:38] ==> public constructor FixingRoleDecider(ref: StateRef, progressTracker: ProgressTracker) defined in net.corda.irs.flows.FixingFlow.FixingRoleDecider[ClassConstructorDescriptorImpl]

'ref' @ [141:43] ==> value-parameter ref: StateRef defined in net.corda.irs.flows.FixingFlow.FixingRoleDecider.<init>[ValueParameterDescriptorImpl]

'tracker' @ [141:48] ==> public final fun tracker(): ProgressTracker defined in net.corda.irs.flows.FixingFlow.FixingRoleDecider.Companion[SimpleFunctionDescriptorImpl]

'ProgressTracker.Step' @ [144:29] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker' @ [146:29] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[DeserializedClassConstructorDescriptor]

'LOADING' @ [146:45] ==> public constructor LOADING() defined in net.corda.irs.flows.FixingFlow.FixingRoleDecider.Companion.LOADING[ClassConstructorDescriptorImpl]

'Suspendable' @ [149:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'progressTracker' @ [151:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.irs.flows.FixingFlow.FixingRoleDecider[PropertyDescriptorImpl]

'nextStep' @ [151:29] ==> public final fun nextStep(): ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [152:29] ==> public final val serviceHub: ServiceHub defined in net.corda.irs.flows.FixingFlow.FixingRoleDecider[DeserializedPropertyDescriptor]

'loadState' @ [152:40] ==> public open fun loadState(stateRef: StateRef): TransactionState<*> defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'ref' @ [152:50] ==> public final val ref: StateRef defined in net.corda.irs.flows.FixingFlow.FixingRoleDecider[PropertyDescriptorImpl]

'dealToFix' @ [153:32] ==> val dealToFix: TransactionState<*> defined in net.corda.irs.flows.FixingFlow.FixingRoleDecider.call[LocalVariableDescriptor]

'data' @ [153:42] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'fixableDeal' @ [154:27] ==> val fixableDeal: FixableDealState defined in net.corda.irs.flows.FixingFlow.FixingRoleDecider.call[LocalVariableDescriptor]

'participants' @ [154:39] ==> public abstract val participants: List<AbstractParty> defined in net.corda.finance.contracts.FixableDealState[DeserializedPropertyDescriptor]

'sortedBy' @ [154:52] ==> public inline fun <T, R : Comparable<String>> Iterable<AbstractParty>.sortedBy(crossinline selector: (AbstractParty) -> String?): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R : Comparable<R>> -> String

'it' @ [154:63] ==> value-parameter it: AbstractParty defined in net.corda.irs.flows.FixingFlow.FixingRoleDecider.call.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [154:66] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toBase58String' @ [154:76] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [155:25] ==> public final val serviceHub: ServiceHub defined in net.corda.irs.flows.FixingFlow.FixingRoleDecider[DeserializedPropertyDescriptor]

'myInfo' @ [155:36] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [155:43] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [155:57] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'parties' @ [156:17] ==> val parties: List<AbstractParty> defined in net.corda.irs.flows.FixingFlow.FixingRoleDecider.call[LocalVariableDescriptor]

'owningKey' @ [156:28] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'myKey' @ [156:41] ==> val myKey: PublicKey defined in net.corda.irs.flows.FixingFlow.FixingRoleDecider.call[LocalVariableDescriptor]

'FixingSession' @ [157:30] ==> public constructor FixingSession(ref: StateRef, oracleType: ServiceType) defined in net.corda.irs.flows.FixingFlow.FixingSession[ClassConstructorDescriptorImpl]

'ref' @ [157:44] ==> public final val ref: StateRef defined in net.corda.irs.flows.FixingFlow.FixingRoleDecider[PropertyDescriptorImpl]

'fixableDeal' @ [157:49] ==> val fixableDeal: FixableDealState defined in net.corda.irs.flows.FixingFlow.FixingRoleDecider.call[LocalVariableDescriptor]

'oracleType' @ [157:61] ==> public abstract val oracleType: ServiceType defined in net.corda.finance.contracts.FixableDealState[DeserializedPropertyDescriptor]

'serviceHub' @ [158:36] ==> public final val serviceHub: ServiceHub defined in net.corda.irs.flows.FixingFlow.FixingRoleDecider[DeserializedPropertyDescriptor]

'identityService' @ [158:47] ==> public abstract val identityService: IdentityService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'partyFromAnonymous' @ [158:63] ==> public abstract fun partyFromAnonymous(party: AbstractParty): Party? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'parties' @ [158:82] ==> val parties: List<AbstractParty> defined in net.corda.irs.flows.FixingFlow.FixingRoleDecider.call[LocalVariableDescriptor]

'IllegalStateException' @ [158:103] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'subFlow' @ [160:17] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.irs.flows.FixingFlow.FixingRoleDecider[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'Floater' @ [160:25] ==> public constructor Floater(otherParty: Party, payload: FixingFlow.FixingSession, progressTracker: ProgressTracker = ...) defined in net.corda.irs.flows.FixingFlow.Floater[ClassConstructorDescriptorImpl]

'counterparty' @ [160:33] ==> val counterparty: Party defined in net.corda.irs.flows.FixingFlow.FixingRoleDecider.call[LocalVariableDescriptor]

'fixing' @ [160:47] ==> val fixing: FixingFlow.FixingSession defined in net.corda.irs.flows.FixingFlow.FixingRoleDecider.call[LocalVariableDescriptor]

