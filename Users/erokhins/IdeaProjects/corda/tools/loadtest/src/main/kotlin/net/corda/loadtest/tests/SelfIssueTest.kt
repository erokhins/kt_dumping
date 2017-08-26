'getLogger' @ [21:33] ==> public open fun getLogger(p0: (String..String?)): (Logger..Logger?) defined in org.slf4j.LoggerFactory[JavaMethodDescriptor]

'HashMap' @ [33:16] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>(p0: (MutableMap<out (AbstractParty..AbstractParty?), out (Long..Long?)>..Map<out (AbstractParty..AbstractParty?), (Long..Long?)>?)) defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> AbstractParty
    <V : (Any..Any?)> -> Long

'vaultsSelfIssued' @ [33:24] ==> public final val vaultsSelfIssued: Map<AbstractParty, Long> defined in net.corda.loadtest.tests.SelfIssueState[PropertyDescriptorImpl]

'LoadTest' @ [37:21] ==> public constructor LoadTest<T, S>(testName: String, generate: Nodes.(SelfIssueState, Int) -> Generator<List<SelfIssueCommand>>, interpret: (SelfIssueState, SelfIssueCommand) -> SelfIssueState, execute: Nodes.(SelfIssueCommand) -> Unit, gatherRemoteState: Nodes.(SelfIssueState?) -> SelfIssueState, isConsistent: (SelfIssueState) -> Boolean = ...) defined in net.corda.loadtest.LoadTest[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> SelfIssueCommand
    <S> -> SelfIssueState

'Generator' @ [42:33] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'pickOne' @ [42:43] ==> public fun <A> Generator.Companion.pickOne(list: List<NodeConnection>): Generator<NodeConnection> defined in net.corda.client.mock[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> NodeConnection

'simpleNodes' @ [42:51] ==> public final val simpleNodes: List<NodeConnection> defined in net.corda.loadtest.Nodes[PropertyDescriptorImpl]

'flatMap' @ [42:64] ==> public final fun <B> flatMap(function: (NodeConnection) -> Generator<SelfIssueCommand>): Generator<SelfIssueCommand> defined in net.corda.client.mock.Generator[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <B> -> SelfIssueCommand

'generateIssue' @ [43:17] ==> public fun generateIssue(max: Long, currency: Currency, notary: Party, possibleRecipients: List<Party>, anonymous: Boolean): Generator<CashIssueAndPaymentFlow.IssueAndPaymentRequest> defined in net.corda.loadtest.tests[SimpleFunctionDescriptorImpl]

'USD' @ [43:37] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'notary' @ [43:42] ==> public final val notary: NodeConnection defined in net.corda.loadtest.Nodes[PropertyDescriptorImpl]

'info' @ [43:49] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'notaryIdentity' @ [43:54] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'listOf' @ [43:70] ==> public fun <T> listOf(element: Party): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'node' @ [43:77] ==> value-parameter node: NodeConnection defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [43:82] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'legalIdentity' @ [43:87] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'map' @ [43:121] ==> public final fun <B> map(function: (CashIssueAndPaymentFlow.IssueAndPaymentRequest) -> SelfIssueCommand): Generator<SelfIssueCommand> defined in net.corda.client.mock.Generator[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <B> -> SelfIssueCommand

'SelfIssueCommand' @ [44:21] ==> public constructor SelfIssueCommand(request: CashIssueAndPaymentFlow.IssueAndPaymentRequest, node: NodeConnection) defined in net.corda.loadtest.tests.SelfIssueCommand[ClassConstructorDescriptorImpl]

'it' @ [44:38] ==> value-parameter it: CashIssueAndPaymentFlow.IssueAndPaymentRequest defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [44:42] ==> value-parameter node: NodeConnection defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Generator' @ [47:13] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'replicatePoisson' @ [47:23] ==> public fun <A> Generator.Companion.replicatePoisson(meanSize: Double, generator: Generator<SelfIssueCommand>, atLeastOne: Boolean = ...): Generator<List<SelfIssueCommand>> defined in net.corda.client.mock[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> SelfIssueCommand

'parallelism' @ [47:40] ==> value-parameter parallelism: Int defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[ValueParameterDescriptorImpl]

'toDouble' @ [47:52] ==> public open fun toDouble(): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'generateIssue' @ [47:64] ==> val generateIssue: Generator<SelfIssueCommand> defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'flatMap' @ [47:79] ==> public final fun <B> flatMap(function: (List<SelfIssueCommand>) -> Generator<List<SelfIssueCommand>>): Generator<List<SelfIssueCommand>> defined in net.corda.client.mock.Generator[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <B> -> List<SelfIssueCommand>

'if (it.isEmpty()) {
                    Generator.sequence(listOf(generateIssue))
                } else {
                    Generator.pure(it)
                }' @ [49:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Generator<List<SelfIssueCommand>>, elseBranch: Generator<List<SelfIssueCommand>>): Generator<List<SelfIssueCommand>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Generator<List<SelfIssueCommand>>

'it' @ [49:21] ==> value-parameter it: List<SelfIssueCommand> defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isEmpty' @ [49:24] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'Generator' @ [50:21] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'sequence' @ [50:31] ==> public final fun <A> sequence(generators: List<Generator<SelfIssueCommand>>): Generator<List<SelfIssueCommand>> defined in net.corda.client.mock.Generator.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> SelfIssueCommand

'listOf' @ [50:40] ==> public fun <T> listOf(element: Generator<SelfIssueCommand>): List<Generator<SelfIssueCommand>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Generator<SelfIssueCommand>

'generateIssue' @ [50:47] ==> val generateIssue: Generator<SelfIssueCommand> defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'Generator' @ [52:21] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'pure' @ [52:31] ==> public final fun <A> pure(value: List<SelfIssueCommand>): Generator<List<SelfIssueCommand>> defined in net.corda.client.mock.Generator.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> List<SelfIssueCommand>

'it' @ [52:36] ==> value-parameter it: List<SelfIssueCommand> defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [57:31] ==> public final operator fun component1(): CashIssueAndPaymentFlow.IssueAndPaymentRequest defined in net.corda.loadtest.tests.SelfIssueCommand[SimpleFunctionDescriptorImpl]

'component2' @ [57:40] ==> public final operator fun component2(): NodeConnection defined in net.corda.loadtest.tests.SelfIssueCommand[SimpleFunctionDescriptorImpl]

'state' @ [58:26] ==> value-parameter state: SelfIssueState defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[ValueParameterDescriptorImpl]

'copyVaults' @ [58:32] ==> public final fun copyVaults(): HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.SelfIssueState[SimpleFunctionDescriptorImpl]

'node' @ [59:26] ==> val node: NodeConnection defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'info' @ [59:31] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'legalIdentity' @ [59:36] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'vaults' @ [60:13] ==> val vaults: HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'put' @ [60:20] ==> public open fun put(key: AbstractParty, value: Long): Long? defined in java.util.HashMap[JavaMethodDescriptor]

'issuer' @ [60:24] ==> val issuer: Party defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'+' @ [60:32] ==> public final operator fun plus(other: Long): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'vaults' @ [60:33] ==> val vaults: HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'issuer' @ [60:40] ==> val issuer: Party defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'request' @ [60:57] ==> val request: CashIssueAndPaymentFlow.IssueAndPaymentRequest defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'amount' @ [60:65] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.CashIssueAndPaymentFlow.IssueAndPaymentRequest[DeserializedPropertyDescriptor]

'quantity' @ [60:72] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'SelfIssueState' @ [61:13] ==> public constructor SelfIssueState(vaultsSelfIssued: Map<AbstractParty, Long>) defined in net.corda.loadtest.tests.SelfIssueState[ClassConstructorDescriptorImpl]

'vaults' @ [61:28] ==> val vaults: HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'component1' @ [64:22] ==> public final operator fun component1(): CashIssueAndPaymentFlow.IssueAndPaymentRequest defined in net.corda.loadtest.tests.SelfIssueCommand[SimpleFunctionDescriptorImpl]

'component2' @ [64:31] ==> public final operator fun component2(): NodeConnection defined in net.corda.loadtest.tests.SelfIssueCommand[SimpleFunctionDescriptorImpl]

'node' @ [66:30] ==> val node: NodeConnection defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'proxy' @ [66:35] ==> public final val proxy: CordaRPCOps defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'startFlow' @ [66:41] ==> public inline fun <T : Any, A, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (CashIssueAndPaymentFlow.IssueAndPaymentRequest) -> CashIssueAndPaymentFlow, arg0: CashIssueAndPaymentFlow.IssueAndPaymentRequest): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> IssueAndPaymentRequest
    <reified R : FlowLogic<T>> -> CashIssueAndPaymentFlow

'request' @ [66:78] ==> val request: CashIssueAndPaymentFlow.IssueAndPaymentRequest defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'returnValue' @ [66:87] ==> public abstract val returnValue: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'getOrThrow' @ [66:99] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'log' @ [67:17] ==> private val log: (Logger..Logger?) defined in net.corda.loadtest.tests in file SelfIssueTest.kt[PropertyDescriptorImpl]

'info' @ [67:21] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'result' @ [67:37] ==> val result: AbstractCashFlow.Result defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'log' @ [69:17] ==> private val log: (Logger..Logger?) defined in net.corda.loadtest.tests in file SelfIssueTest.kt[PropertyDescriptorImpl]

'error' @ [69:21] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'e' @ [69:38] ==> val e: FlowException defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'HashMap' @ [74:35] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> AbstractParty
    <V : (Any..Any?)> -> Long

'simpleNodes' @ [75:13] ==> public final val simpleNodes: List<NodeConnection> defined in net.corda.loadtest.Nodes[PropertyDescriptorImpl]

'forEach' @ [75:25] ==> @HidesMembers public inline fun <T> Iterable<NodeConnection>.forEach(action: (NodeConnection) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeConnection

'connection' @ [76:29] ==> value-parameter connection: NodeConnection defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'proxy' @ [76:40] ==> public final val proxy: CordaRPCOps defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'vaultQueryBy' @ [76:46] ==> public inline fun <reified T : ContractState> CordaRPCOps.vaultQueryBy(criteria: QueryCriteria = ..., paging: PageSpecification = ..., sorting: Sort = ...): Vault.Page<Cash.State> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [76:73] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'vault' @ [77:17] ==> val vault: List<StateAndRef<Cash.State>> defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'forEach' @ [77:23] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<Cash.State>>.forEach(action: (StateAndRef<Cash.State>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'it' @ [78:33] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [78:36] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [78:42] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'state' @ [79:34] ==> val state: Cash.State defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'amount' @ [79:40] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [79:47] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [79:53] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'party' @ [79:60] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'issuer' @ [80:25] ==> val issuer: AbstractParty defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'connection' @ [80:35] ==> value-parameter connection: NodeConnection defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [80:46] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'legalIdentity' @ [80:51] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'selfIssueVaults' @ [81:25] ==> val selfIssueVaults: HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'put' @ [81:41] ==> public open fun put(key: AbstractParty, value: Long): Long? defined in java.util.HashMap[JavaMethodDescriptor]

'issuer' @ [81:45] ==> val issuer: AbstractParty defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'+' @ [81:53] ==> public final operator fun plus(other: Long): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'selfIssueVaults' @ [81:54] ==> val selfIssueVaults: HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'issuer' @ [81:70] ==> val issuer: AbstractParty defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'state' @ [81:87] ==> val state: Cash.State defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'amount' @ [81:93] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'quantity' @ [81:100] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'log' @ [85:13] ==> private val log: (Logger..Logger?) defined in net.corda.loadtest.tests in file SelfIssueTest.kt[PropertyDescriptorImpl]

'info' @ [85:17] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'selfIssueVaults' @ [85:24] ==> val selfIssueVaults: HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'previousState' @ [86:17] ==> value-parameter previousState: SelfIssueState? defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[ValueParameterDescriptorImpl]

'getInstance' @ [87:48] ==> public open fun getInstance(): (ObjectDiffer..ObjectDiffer?) defined in de.danielbechler.diff.ObjectDifferFactory[JavaMethodDescriptor]

'compare' @ [87:62] ==> public open fun <T : (Any..Any?)> compare(p0: (Map<AbstractParty, Long>..Map<AbstractParty, Long>?), p1: (Map<AbstractParty, Long>..Map<AbstractParty, Long>?)): (Node..Node?) defined in de.danielbechler.diff.ObjectDiffer[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Map<AbstractParty, Long>

'previousState' @ [87:70] ==> value-parameter previousState: SelfIssueState? defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[ValueParameterDescriptorImpl]

'vaultsSelfIssued' @ [87:84] ==> public final val vaultsSelfIssued: Map<AbstractParty, Long> defined in net.corda.loadtest.tests.SelfIssueState[PropertyDescriptorImpl]

'selfIssueVaults' @ [87:102] ==> val selfIssueVaults: HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'!' @ [88:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'diff' @ [88:22] ==> val diff: (Node..Node?) defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'isUntouched' @ [88:27] ==> public final val Node.isUntouched: Boolean[MyPropertyDescriptor]

'diff' @ [91:21] ==> val diff: (Node..Node?) defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'visit' @ [91:26] ==> public final fun visit(p0: (((Node..Node?), (Visit..Visit?)) -> Unit..(((Node..Node?), (Visit..Visit?)) -> Unit)?)): Unit defined in de.danielbechler.diff.node.Node[MyFunctionDescriptor]

'node' @ [92:29] ==> value-parameter node: (Node..Node?) defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isChanged' @ [92:34] ==> public final val Node.isChanged: Boolean[MyPropertyDescriptor]

'node' @ [92:47] ==> value-parameter node: (Node..Node?) defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'children' @ [92:52] ==> public final val Node.children: (MutableCollection<(Node..Node?)>..Collection<(Node..Node?)>?)[MyPropertyDescriptor]

'all' @ [92:61] ==> public inline fun <T> Iterable<(Node..Node?)>.all(predicate: ((Node..Node?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (de.danielbechler.diff.node.Node..de.danielbechler.diff.node.Node?)

'!' @ [92:67] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [92:68] ==> value-parameter it: (Node..Node?) defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isChanged' @ [92:71] ==> public final val Node.isChanged: Boolean[MyPropertyDescriptor]

'diffString' @ [93:29] ==> var diffString: String defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'node' @ [93:46] ==> value-parameter node: (Node..Node?) defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'propertyPath' @ [93:51] ==> public final val Node.propertyPath: (PropertyPath..PropertyPath?)[MyPropertyDescriptor]

'node' @ [93:78] ==> value-parameter node: (Node..Node?) defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'canonicalGet' @ [93:83] ==> public abstract fun canonicalGet(p0: (Any..Any?)): (Any..Any?) defined in de.danielbechler.diff.node.Node[JavaMethodDescriptor]

'previousState' @ [93:96] ==> value-parameter previousState: SelfIssueState? defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[ValueParameterDescriptorImpl]

'vaultsSelfIssued' @ [93:110] ==> public final val vaultsSelfIssued: Map<AbstractParty, Long> defined in net.corda.loadtest.tests.SelfIssueState[PropertyDescriptorImpl]

'node' @ [93:140] ==> value-parameter node: (Node..Node?) defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'canonicalGet' @ [93:145] ==> public abstract fun canonicalGet(p0: (Any..Any?)): (Any..Any?) defined in de.danielbechler.diff.node.Node[JavaMethodDescriptor]

'selfIssueVaults' @ [93:158] ==> val selfIssueVaults: HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'Exception' @ [96:27] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'+' @ [97:29] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'previousState' @ [98:60] ==> value-parameter previousState: SelfIssueState? defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[ValueParameterDescriptorImpl]

'vaultsSelfIssued' @ [98:74] ==> public final val vaultsSelfIssued: Map<AbstractParty, Long> defined in net.corda.loadtest.tests.SelfIssueState[PropertyDescriptorImpl]

'selfIssueVaults' @ [99:56] ==> val selfIssueVaults: HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'diffString' @ [100:48] ==> var diffString: String defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'SelfIssueState' @ [104:13] ==> public constructor SelfIssueState(vaultsSelfIssued: Map<AbstractParty, Long>) defined in net.corda.loadtest.tests.SelfIssueState[ClassConstructorDescriptorImpl]

'selfIssueVaults' @ [104:28] ==> val selfIssueVaults: HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.selfIssueTest.<anonymous>[LocalVariableDescriptor]

