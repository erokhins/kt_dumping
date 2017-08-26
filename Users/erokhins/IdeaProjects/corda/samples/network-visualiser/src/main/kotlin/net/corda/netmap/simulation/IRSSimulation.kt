'Simulation' @ [36:140] ==> public constructor Simulation(networkSendManuallyPumped: Boolean, runAsync: Boolean, latencyInjector: InMemoryMessagingNetwork.LatencyCalculator?) defined in net.corda.netmap.simulation.Simulation[ClassConstructorDescriptorImpl]

'networkSendManuallyPumped' @ [36:151] ==> value-parameter networkSendManuallyPumped: Boolean defined in net.corda.netmap.simulation.IRSSimulation.<init>[ValueParameterDescriptorImpl]

'runAsync' @ [36:178] ==> value-parameter runAsync: Boolean defined in net.corda.netmap.simulation.IRSSimulation.<init>[ValueParameterDescriptorImpl]

'latencyInjector' @ [36:188] ==> value-parameter latencyInjector: InMemoryMessagingNetwork.LatencyCalculator? defined in net.corda.netmap.simulation.IRSSimulation.<init>[ValueParameterDescriptorImpl]

'currentDateAndTime' @ [40:9] ==> public final var currentDateAndTime: LocalDateTime defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'of' @ [40:40] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'atStartOfDay' @ [40:55] ==> public open fun atStartOfDay(): (LocalDateTime..LocalDateTime?) defined in java.time.LocalDate[JavaMethodDescriptor]

'synchronizedList' @ [43:54] ==> public open fun <T : (Any..Any?)> synchronizedList(p0: (MutableList<(() -> Unit..(() -> Unit)?)>..List<(() -> Unit..(() -> Unit)?)>?)): (MutableList<(() -> Unit..(() -> Unit)?)>..List<(() -> Unit..(() -> Unit)?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (() -> kotlin.Unit..(() -> kotlin.Unit)?)

'LinkedList' @ [43:71] ==> public constructor LinkedList<E : (Any..Any?)>() defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Function0<Unit>

'mockNet' @ [47:9] ==> public final val mockNet: MockNetwork defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'nodes' @ [47:17] ==> public final val nodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork[DeserializedPropertyDescriptor]

'map' @ [47:23] ==> public inline fun <T, R> Iterable<MockNetwork.MockNode>.map(transform: (MockNetwork.MockNode) -> IdentityService): List<IdentityService> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode
    <R> -> IdentityService

'it' @ [47:29] ==> value-parameter it: MockNetwork.MockNode defined in net.corda.netmap.simulation.IRSSimulation.startMainSimulation.<anonymous>[ValueParameterDescriptorImpl]

'services' @ [47:32] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'identityService' @ [47:41] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'forEach' @ [47:59] ==> @HidesMembers public inline fun <T> Iterable<IdentityService>.forEach(action: (IdentityService) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IdentityService

'mockNet' @ [48:13] ==> public final val mockNet: MockNetwork defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'nodes' @ [48:21] ==> public final val nodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork[DeserializedPropertyDescriptor]

'forEach' @ [48:27] ==> @HidesMembers public inline fun <T> Iterable<MockNetwork.MockNode>.forEach(action: (MockNetwork.MockNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode

'service' @ [48:45] ==> value-parameter service: IdentityService defined in net.corda.netmap.simulation.IRSSimulation.startMainSimulation.<anonymous>[ValueParameterDescriptorImpl]

'registerIdentity' @ [48:53] ==> @Deprecated public abstract fun registerIdentity(party: PartyAndCertificate): Unit defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'node' @ [48:70] ==> value-parameter node: MockNetwork.MockNode defined in net.corda.netmap.simulation.IRSSimulation.startMainSimulation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [48:75] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [48:80] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'openFuture' @ [51:22] ==> public fun <V> openFuture(): OpenFuture<Unit> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'om' @ [52:9] ==> public final lateinit var om: ObjectMapper defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'JacksonSupport' @ [52:14] ==> public object JacksonSupport defined in net.corda.jackson[FakeCallableDescriptorForObject]

'createInMemoryMapper' @ [52:29] ==> @JvmStatic @JvmOverloads public final fun createInMemoryMapper(identityService: IdentityService, factory: JsonFactory = ..., fuzzyIdentityMatch: Boolean = ...): ObjectMapper defined in net.corda.jackson.JacksonSupport[DeserializedSimpleFunctionDescriptor]

'InMemoryIdentityService' @ [52:50] ==> public constructor InMemoryIdentityService(wellKnownIdentities: Iterable<PartyAndCertificate> = ..., confidentialIdentities: Iterable<PartyAndCertificate> = ..., trustRoot: X509CertificateHolder) defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedClassConstructorDescriptor]

'banks' @ [52:75] ==> public final val banks: List<Simulation.SimulatedNode> defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'regulators' @ [52:83] ==> public final val regulators: List<Simulation.SimulatedNode> defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'networkMap' @ [52:96] ==> public final val networkMap: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'map' @ [52:108] ==> public inline fun <T, R> Iterable<Simulation.SimulatedNode>.map(transform: (Simulation.SimulatedNode) -> PartyAndCertificate): List<PartyAndCertificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimulatedNode
    <R> -> PartyAndCertificate

'it' @ [52:114] ==> value-parameter it: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.startMainSimulation.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [52:117] ==> public final lateinit var info: NodeInfo defined in net.corda.netmap.simulation.Simulation.SimulatedNode[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [52:122] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'DUMMY_CA' @ [52:158] ==> public val DUMMY_CA: CertificateAndKeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'certificate' @ [52:167] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'registerFinanceJSONMappers' @ [53:9] ==> public fun registerFinanceJSONMappers(objectMapper: ObjectMapper): Unit defined in net.corda.finance.plugin[DeserializedSimpleFunctionDescriptor]

'om' @ [53:36] ==> public final lateinit var om: ObjectMapper defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'startIRSDealBetween' @ [55:9] ==> private final fun startIRSDealBetween(i: Int, j: Int): CordaFuture<SignedTransaction> defined in net.corda.netmap.simulation.IRSSimulation[SimpleFunctionDescriptorImpl]

'thenMatch' @ [55:35] ==> public fun <V, W, X> CordaFuture<out SignedTransaction>.thenMatch(success: (SignedTransaction) -> Boolean, failure: (Throwable) -> Unit): Unit defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> SignedTransaction
    <W> -> Boolean
    <X> -> Unit

'executeOnNextIteration' @ [57:13] ==> private final val executeOnNextIteration: (MutableList<(() -> Unit..(() -> Unit)?)>..List<(() -> Unit..(() -> Unit)?)>?) defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'add' @ [57:36] ==> public abstract fun add(element: (() -> Unit..(() -> Unit)?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'executeOnNextIteration' @ [58:13] ==> private final val executeOnNextIteration: (MutableList<(() -> Unit..(() -> Unit)?)>..List<(() -> Unit..(() -> Unit)?)>?) defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'add' @ [58:36] ==> public abstract fun add(element: (() -> Unit..(() -> Unit)?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'doNextFixing' @ [60:40] ==> private final fun doNextFixing(i: Int, j: Int): CordaFuture<Unit>? defined in net.corda.netmap.simulation.IRSSimulation[SimpleFunctionDescriptorImpl]

'future' @ [62:21] ==> val future: OpenFuture<Unit> defined in net.corda.netmap.simulation.IRSSimulation.startMainSimulation[LocalVariableDescriptor]

'setException' @ [62:28] ==> public abstract fun setException(t: Throwable): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

't' @ [62:41] ==> value-parameter t: Throwable defined in net.corda.netmap.simulation.IRSSimulation.startMainSimulation.<anonymous>.<anonymous>.onFailure[ValueParameterDescriptorImpl]

'executeOnNextIteration' @ [67:21] ==> private final val executeOnNextIteration: (MutableList<(() -> Unit..(() -> Unit)?)>..List<(() -> Unit..(() -> Unit)?)>?) defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'add' @ [67:44] ==> public abstract fun add(element: (() -> Unit..(() -> Unit)?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'executeOnNextIteration' @ [68:21] ==> private final val executeOnNextIteration: (MutableList<(() -> Unit..(() -> Unit)?)>..List<(() -> Unit..(() -> Unit)?)>?) defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'add' @ [68:44] ==> public abstract fun add(element: (() -> Unit..(() -> Unit)?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'doNextFixing' @ [69:33] ==> private final fun doNextFixing(i: Int, j: Int): CordaFuture<Unit>? defined in net.corda.netmap.simulation.IRSSimulation[SimpleFunctionDescriptorImpl]

'if (f != null) {
                            f.thenMatch(::onSuccess, ::onFailure)
                        } else {
                            // All done!
                            future.set(Unit)
                        }' @ [70:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'f' @ [70:29] ==> val f: CordaFuture<Unit>? defined in net.corda.netmap.simulation.IRSSimulation.startMainSimulation.<anonymous>.<anonymous>.onSuccess.<anonymous>[LocalVariableDescriptor]

'f' @ [71:29] ==> val f: CordaFuture<Unit>? defined in net.corda.netmap.simulation.IRSSimulation.startMainSimulation.<anonymous>.<anonymous>.onSuccess.<anonymous>[LocalVariableDescriptor]

'thenMatch' @ [71:31] ==> public fun <V, W, X> CordaFuture<out Unit>.thenMatch(success: (Unit) -> Unit, failure: (Throwable) -> Unit): Unit defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit
    <W> -> Unit
    <X> -> Unit

'onSuccess' @ [71:43] ==> local final fun onSuccess(result: Unit?): Unit defined in net.corda.netmap.simulation.IRSSimulation.startMainSimulation.<anonymous>.<anonymous>[SimpleFunctionDescriptorImpl]

'onFailure' @ [71:56] ==> local final fun onFailure(t: Throwable): Unit defined in net.corda.netmap.simulation.IRSSimulation.startMainSimulation.<anonymous>.<anonymous>[SimpleFunctionDescriptorImpl]

'future' @ [74:29] ==> val future: OpenFuture<Unit> defined in net.corda.netmap.simulation.IRSSimulation.startMainSimulation[LocalVariableDescriptor]

'set' @ [74:36] ==> public abstract fun set(value: Unit): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'Unit' @ [74:40] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'initialFixFuture' @ [78:17] ==> val initialFixFuture: CordaFuture<Unit>? defined in net.corda.netmap.simulation.IRSSimulation.startMainSimulation.<anonymous>.<anonymous>[LocalVariableDescriptor]

'thenMatch' @ [78:36] ==> public fun <V, W, X> CordaFuture<out Unit>.thenMatch(success: (Unit) -> Unit, failure: (Throwable) -> Unit): Unit defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit
    <W> -> Unit
    <X> -> Unit

'onSuccess' @ [78:48] ==> local final fun onSuccess(result: Unit?): Unit defined in net.corda.netmap.simulation.IRSSimulation.startMainSimulation.<anonymous>.<anonymous>[SimpleFunctionDescriptorImpl]

'onFailure' @ [78:61] ==> local final fun onFailure(t: Throwable): Unit defined in net.corda.netmap.simulation.IRSSimulation.startMainSimulation.<anonymous>.<anonymous>[SimpleFunctionDescriptorImpl]

'future' @ [81:16] ==> val future: OpenFuture<Unit> defined in net.corda.netmap.simulation.IRSSimulation.startMainSimulation[LocalVariableDescriptor]

'println' @ [85:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'i' @ [85:42] ==> value-parameter i: Int defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[ValueParameterDescriptorImpl]

'j' @ [85:49] ==> value-parameter j: Int defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[ValueParameterDescriptorImpl]

'banks' @ [86:36] ==> public final val banks: List<Simulation.SimulatedNode> defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'i' @ [86:42] ==> value-parameter i: Int defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[ValueParameterDescriptorImpl]

'banks' @ [87:36] ==> public final val banks: List<Simulation.SimulatedNode> defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'j' @ [87:42] ==> value-parameter j: Int defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[ValueParameterDescriptorImpl]

'node1' @ [90:17] ==> val node1: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[LocalVariableDescriptor]

'database' @ [90:23] ==> public final lateinit var database: CordaPersistence defined in net.corda.netmap.simulation.Simulation.SimulatedNode[DeserializedPropertyDescriptor]

'transaction' @ [90:32] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> List<StateAndRef<InterestRateSwap.State>>): List<StateAndRef<InterestRateSwap.State>> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<StateAndRef<State>>

'node1' @ [91:21] ==> val node1: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[LocalVariableDescriptor]

'services' @ [91:27] ==> public final val services: ServiceHubInternal defined in net.corda.netmap.simulation.Simulation.SimulatedNode[DeserializedPropertyDescriptor]

'vaultQueryService' @ [91:36] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'queryBy' @ [91:54] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<InterestRateSwap.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [91:88] ==> public final val states: List<StateAndRef<InterestRateSwap.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'swaps' @ [93:63] ==> val swaps: List<StateAndRef<InterestRateSwap.State>> defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[LocalVariableDescriptor]

'single' @ [93:69] ==> public fun <T> List<StateAndRef<InterestRateSwap.State>>.single(): StateAndRef<InterestRateSwap.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'theDealRef' @ [96:30] ==> val theDealRef: StateAndRef<InterestRateSwap.State> defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[LocalVariableDescriptor]

'state' @ [96:41] ==> public final val state: TransactionState<InterestRateSwap.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [96:47] ==> public final val data: InterestRateSwap.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'calculation' @ [96:52] ==> public final val calculation: InterestRateSwap.Calculation defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'nextFixingDate' @ [96:64] ==> public final fun nextFixingDate(): LocalDate? defined in net.corda.irs.contract.InterestRateSwap.Calculation[DeserializedSimpleFunctionDescriptor]

'extraNodeLabels' @ [97:9] ==> public final val extraNodeLabels: MutableMap<Simulation.SimulatedNode, String> defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'node1' @ [97:25] ==> val node1: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[LocalVariableDescriptor]

'nextFixingDate' @ [97:52] ==> val nextFixingDate: LocalDate defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[LocalVariableDescriptor]

'extraNodeLabels' @ [98:9] ==> public final val extraNodeLabels: MutableMap<Simulation.SimulatedNode, String> defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'node2' @ [98:25] ==> val node2: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[LocalVariableDescriptor]

'nextFixingDate' @ [98:52] ==> val nextFixingDate: LocalDate defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[LocalVariableDescriptor]

'node1' @ [101:20] ==> val node1: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[LocalVariableDescriptor]

'services' @ [101:26] ==> public final val services: ServiceHubInternal defined in net.corda.netmap.simulation.Simulation.SimulatedNode[DeserializedPropertyDescriptor]

'vaultService' @ [101:35] ==> public abstract val vaultService: VaultService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'whenConsumed' @ [101:48] ==> public open fun whenConsumed(ref: StateRef): CordaFuture<Vault.Update<ContractState>> defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'theDealRef' @ [101:61] ==> val theDealRef: StateAndRef<InterestRateSwap.State> defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[LocalVariableDescriptor]

'ref' @ [101:72] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'node2' @ [102:20] ==> val node2: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[LocalVariableDescriptor]

'services' @ [102:26] ==> public final val services: ServiceHubInternal defined in net.corda.netmap.simulation.Simulation.SimulatedNode[DeserializedPropertyDescriptor]

'vaultService' @ [102:35] ==> public abstract val vaultService: VaultService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'whenConsumed' @ [102:48] ==> public open fun whenConsumed(ref: StateRef): CordaFuture<Vault.Update<ContractState>> defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'theDealRef' @ [102:61] ==> val theDealRef: StateAndRef<InterestRateSwap.State> defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[LocalVariableDescriptor]

'ref' @ [102:72] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'showConsensusFor' @ [104:9] ==> protected final fun showConsensusFor(nodes: List<Simulation.SimulatedNode>): Unit defined in net.corda.netmap.simulation.IRSSimulation[SimpleFunctionDescriptorImpl]

'listOf' @ [104:26] ==> public fun <T> listOf(vararg elements: Simulation.SimulatedNode): List<Simulation.SimulatedNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimulatedNode

'node1' @ [104:33] ==> val node1: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[LocalVariableDescriptor]

'node2' @ [104:40] ==> val node2: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[LocalVariableDescriptor]

'regulators' @ [104:47] ==> public final val regulators: List<Simulation.SimulatedNode> defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'nextFixingDate' @ [107:13] ==> val nextFixingDate: LocalDate defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[LocalVariableDescriptor]

'currentDateAndTime' @ [107:30] ==> public final var currentDateAndTime: LocalDateTime defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'toLocalDate' @ [107:49] ==> public open fun toLocalDate(): (LocalDate..LocalDate?) defined in java.time.LocalDateTime[JavaMethodDescriptor]

'currentDateAndTime' @ [108:13] ==> public final var currentDateAndTime: LocalDateTime defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'nextFixingDate' @ [108:34] ==> val nextFixingDate: LocalDate defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[LocalVariableDescriptor]

'atTime' @ [108:49] ==> public open fun atTime(p0: Int, p1: Int): (LocalDateTime..LocalDateTime?) defined in java.time.LocalDate[JavaMethodDescriptor]

'listOf' @ [110:16] ==> public fun <T> listOf(vararg elements: CordaFuture<Vault.Update<ContractState>>): List<CordaFuture<Vault.Update<ContractState>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaFuture<Update<ContractState>>

'futA' @ [110:23] ==> val futA: CordaFuture<Vault.Update<ContractState>> defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[LocalVariableDescriptor]

'futB' @ [110:29] ==> val futB: CordaFuture<Vault.Update<ContractState>> defined in net.corda.netmap.simulation.IRSSimulation.doNextFixing[LocalVariableDescriptor]

'transpose' @ [110:35] ==> public fun <V> Collection<CordaFuture<out Vault.Update<ContractState>>>.transpose(): CordaFuture<List<Vault.Update<ContractState>>> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Update<ContractState>

'map' @ [110:47] ==> public fun <V, W> CordaFuture<out List<Vault.Update<ContractState>>>.map(transform: (List<Vault.Update<ContractState>>) -> Unit): CordaFuture<Unit> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<Update<ContractState>>
    <W> -> Unit

'Unit' @ [110:53] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'banks' @ [114:36] ==> public final val banks: List<Simulation.SimulatedNode> defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'i' @ [114:42] ==> value-parameter i: Int defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[ValueParameterDescriptorImpl]

'banks' @ [115:36] ==> public final val banks: List<Simulation.SimulatedNode> defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'j' @ [115:42] ==> value-parameter j: Int defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[ValueParameterDescriptorImpl]

'extraNodeLabels' @ [117:9] ==> public final val extraNodeLabels: MutableMap<Simulation.SimulatedNode, String> defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'node1' @ [117:25] ==> val node1: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'extraNodeLabels' @ [118:9] ==> public final val extraNodeLabels: MutableMap<Simulation.SimulatedNode, String> defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'node2' @ [118:25] ==> val node2: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'om' @ [123:19] ==> public final lateinit var om: ObjectMapper defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'readValue' @ [123:22] ==> public inline fun <reified T : Any> ObjectMapper.readValue(src: URL): InterestRateSwap.State defined in com.fasterxml.jackson.module.kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> State

'javaClass' @ [123:56] ==> public val <T : Any> IRSSimulation.javaClass: Class<IRSSimulation> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> IRSSimulation

'classLoader' @ [123:66] ==> public final val <T : (Any..Any?)> Class<IRSSimulation>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> IRSSimulation

'getResource' @ [123:78] ==> public open fun getResource(p0: (String..String?)): (URL..URL?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'irs' @ [124:9] ==> val irs: InterestRateSwap.State defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'fixedLeg' @ [124:13] ==> public final val fixedLeg: InterestRateSwap.FixedLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'fixedRatePayer' @ [124:22] ==> public final var fixedRatePayer: AbstractParty defined in net.corda.irs.contract.InterestRateSwap.FixedLeg[DeserializedPropertyDescriptor]

'node1' @ [124:39] ==> val node1: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'info' @ [124:45] ==> public final lateinit var info: NodeInfo defined in net.corda.netmap.simulation.Simulation.SimulatedNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [124:50] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'irs' @ [125:9] ==> val irs: InterestRateSwap.State defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'floatingLeg' @ [125:13] ==> public final val floatingLeg: InterestRateSwap.FloatingLeg defined in net.corda.irs.contract.InterestRateSwap.State[DeserializedPropertyDescriptor]

'floatingRatePayer' @ [125:25] ==> public final var floatingRatePayer: AbstractParty defined in net.corda.irs.contract.InterestRateSwap.FloatingLeg[DeserializedPropertyDescriptor]

'node2' @ [125:45] ==> val node2: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'info' @ [125:51] ==> public final lateinit var info: NodeInfo defined in net.corda.netmap.simulation.Simulation.SimulatedNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [125:56] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'node1' @ [127:9] ==> val node1: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'registerInitiatedFlow' @ [127:15] ==> public final fun <T : FlowLogic<*>> registerInitiatedFlow(initiatedFlowClass: Class<FixingFlow.Fixer>): Observable<FixingFlow.Fixer> defined in net.corda.netmap.simulation.Simulation.SimulatedNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : FlowLogic<*>> -> Fixer

'FixingFlow' @ [127:37] ==> public object FixingFlow defined in net.corda.irs.flows[FakeCallableDescriptorForObject]

'Fixer' @ [127:48] ==> public constructor Fixer(otherParty: Party) defined in net.corda.irs.flows.FixingFlow.Fixer[DeserializedClassConstructorDescriptor]

'java' @ [127:61] ==> public val <T> KClass<FixingFlow.Fixer>.java: Class<FixingFlow.Fixer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Fixer

'node2' @ [128:9] ==> val node2: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'registerInitiatedFlow' @ [128:15] ==> public final fun <T : FlowLogic<*>> registerInitiatedFlow(initiatedFlowClass: Class<FixingFlow.Fixer>): Observable<FixingFlow.Fixer> defined in net.corda.netmap.simulation.Simulation.SimulatedNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : FlowLogic<*>> -> Fixer

'FixingFlow' @ [128:37] ==> public object FixingFlow defined in net.corda.irs.flows[FakeCallableDescriptorForObject]

'Fixer' @ [128:48] ==> public constructor Fixer(otherParty: Party) defined in net.corda.irs.flows.FixingFlow.Fixer[DeserializedClassConstructorDescriptor]

'java' @ [128:61] ==> public val <T> KClass<FixingFlow.Fixer>.java: Class<FixingFlow.Fixer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Fixer

'InitiatingFlow' @ [130:9] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'FlowLogic<SignedTransaction>' @ [133:53] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> SignedTransaction

'Suspendable' @ [134:13] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'subFlow' @ [135:54] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween.StartDealFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'Instigator' @ [135:62] ==> public constructor Instigator(otherParty: Party, payload: TwoPartyDealFlow.AutoOffer, myKey: PublicKey, progressTracker: ProgressTracker = ...) defined in net.corda.finance.flows.TwoPartyDealFlow.Instigator[DeserializedClassConstructorDescriptor]

'otherParty' @ [135:73] ==> public final val otherParty: Party defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween.StartDealFlow[PropertyDescriptorImpl]

'payload' @ [135:85] ==> public final val payload: TwoPartyDealFlow.AutoOffer defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween.StartDealFlow[PropertyDescriptorImpl]

'myKey' @ [135:94] ==> public final val myKey: PublicKey defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween.StartDealFlow[PropertyDescriptorImpl]

'InitiatedBy' @ [138:9] ==> public constructor InitiatedBy(value: KClass<out FlowLogic<*>>) defined in net.corda.core.flows.InitiatedBy[DeserializedClassConstructorDescriptor]

'StartDealFlow' @ [138:22] ==> public constructor StartDealFlow(otherParty: Party, payload: TwoPartyDealFlow.AutoOffer, myKey: PublicKey) defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween.StartDealFlow[ClassConstructorDescriptorImpl]

'Acceptor' @ [139:51] ==> public constructor Acceptor(otherParty: Party, progressTracker: ProgressTracker = ...) defined in net.corda.finance.flows.TwoPartyDealFlow.Acceptor[DeserializedClassConstructorDescriptor]

'otherParty' @ [139:60] ==> value-parameter otherParty: Party defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween.AcceptDealFlow.<init>[ValueParameterDescriptorImpl]

'node2' @ [141:59] ==> val node2: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'registerInitiatedFlow' @ [141:65] ==> public final fun <T : FlowLogic<*>> registerInitiatedFlow(initiatedFlowClass: Class<AcceptDealFlow>): Observable<AcceptDealFlow> defined in net.corda.netmap.simulation.Simulation.SimulatedNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : FlowLogic<*>> -> AcceptDealFlow

'AcceptDealFlow' @ [141:87] ==> public constructor AcceptDealFlow(otherParty: Party) defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween.AcceptDealFlow[ClassConstructorDescriptorImpl]

'java' @ [141:109] ==> public val <T> KClass<AcceptDealFlow>.java: Class<AcceptDealFlow> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AcceptDealFlow

'Suppress' @ [143:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'acceptDealFlows' @ [144:31] ==> val acceptDealFlows: Observable<AcceptDealFlow> defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'toFuture' @ [144:47] ==> public fun <T> Observable<AcceptDealFlow>.toFuture(): CordaFuture<AcceptDealFlow> defined in net.corda.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AcceptDealFlow

'flatMap' @ [144:58] ==> public fun <V, W> CordaFuture<out AcceptDealFlow>.flatMap(transform: (AcceptDealFlow) -> CordaFuture<out SignedTransaction>): CordaFuture<SignedTransaction> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> AcceptDealFlow
    <W> -> SignedTransaction

'it' @ [145:14] ==> value-parameter it: AcceptDealFlow defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween.<anonymous>[ValueParameterDescriptorImpl]

'stateMachine' @ [145:17] ==> public final var stateMachine: FlowStateMachine<*> defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween.AcceptDealFlow[DeserializedPropertyDescriptor]

'resultFuture' @ [145:70] ==> public abstract val resultFuture: CordaFuture<SignedTransaction> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'showProgressFor' @ [148:9] ==> protected final fun showProgressFor(nodes: List<Simulation.SimulatedNode>): Unit defined in net.corda.netmap.simulation.IRSSimulation[SimpleFunctionDescriptorImpl]

'listOf' @ [148:25] ==> public fun <T> listOf(vararg elements: Simulation.SimulatedNode): List<Simulation.SimulatedNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimulatedNode

'node1' @ [148:32] ==> val node1: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'node2' @ [148:39] ==> val node2: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'showConsensusFor' @ [149:9] ==> protected final fun showConsensusFor(nodes: List<Simulation.SimulatedNode>): Unit defined in net.corda.netmap.simulation.IRSSimulation[SimpleFunctionDescriptorImpl]

'listOf' @ [149:26] ==> public fun <T> listOf(vararg elements: Simulation.SimulatedNode): List<Simulation.SimulatedNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimulatedNode

'node1' @ [149:33] ==> val node1: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'node2' @ [149:40] ==> val node2: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'regulators' @ [149:47] ==> public final val regulators: List<Simulation.SimulatedNode> defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'StartDealFlow' @ [151:26] ==> public constructor StartDealFlow(otherParty: Party, payload: TwoPartyDealFlow.AutoOffer, myKey: PublicKey) defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween.StartDealFlow[ClassConstructorDescriptorImpl]

'node2' @ [152:17] ==> val node2: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'info' @ [152:23] ==> public final lateinit var info: NodeInfo defined in net.corda.netmap.simulation.Simulation.SimulatedNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [152:28] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'AutoOffer' @ [153:17] ==> public constructor AutoOffer(notary: Party, dealBeingOffered: DealState) defined in net.corda.finance.flows.TwoPartyDealFlow.AutoOffer[DeserializedClassConstructorDescriptor]

'notary' @ [153:27] ==> public final val notary: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'info' @ [153:34] ==> public final lateinit var info: NodeInfo defined in net.corda.netmap.simulation.Simulation.SimulatedNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [153:39] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'irs' @ [153:55] ==> val irs: InterestRateSwap.State defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'node1' @ [154:17] ==> val node1: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'services' @ [154:23] ==> public final val services: ServiceHubInternal defined in net.corda.netmap.simulation.Simulation.SimulatedNode[DeserializedPropertyDescriptor]

'legalIdentityKey' @ [154:32] ==> public open val legalIdentityKey: PublicKey defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'node1' @ [155:34] ==> val node1: Simulation.SimulatedNode defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'services' @ [155:40] ==> public final val services: ServiceHubInternal defined in net.corda.netmap.simulation.Simulation.SimulatedNode[DeserializedPropertyDescriptor]

'startFlow' @ [155:49] ==> public open fun <T> startFlow(logic: FlowLogic<SignedTransaction>): FlowStateMachine<SignedTransaction> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'instigator' @ [155:59] ==> val instigator: StartDealFlow defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'resultFuture' @ [155:71] ==> public abstract val resultFuture: CordaFuture<SignedTransaction> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'listOf' @ [157:16] ==> public fun <T> listOf(vararg elements: CordaFuture<SignedTransaction>): List<CordaFuture<SignedTransaction>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaFuture<SignedTransaction>

'instigatorTxFuture' @ [157:23] ==> val instigatorTxFuture: CordaFuture<SignedTransaction> defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'acceptorTxFuture' @ [157:43] ==> val acceptorTxFuture: CordaFuture<SignedTransaction> defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'transpose' @ [157:61] ==> public fun <V> Collection<CordaFuture<out SignedTransaction>>.transpose(): CordaFuture<List<SignedTransaction>> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> SignedTransaction

'flatMap' @ [157:73] ==> public fun <V, W> CordaFuture<out List<SignedTransaction>>.flatMap(transform: (List<SignedTransaction>) -> CordaFuture<out SignedTransaction>): CordaFuture<SignedTransaction> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<SignedTransaction>
    <W> -> SignedTransaction

'instigatorTxFuture' @ [157:83] ==> val instigatorTxFuture: CordaFuture<SignedTransaction> defined in net.corda.netmap.simulation.IRSSimulation.startIRSDealBetween[LocalVariableDescriptor]

'executeOnNextIteration' @ [161:13] ==> private final val executeOnNextIteration: (MutableList<(() -> Unit..(() -> Unit)?)>..List<(() -> Unit..(() -> Unit)?)>?) defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'isNotEmpty' @ [161:36] ==> @InlineOnly public inline fun <T> Collection<(() -> Unit..(() -> Unit)?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (() -> kotlin.Unit..(() -> kotlin.Unit)?)

'executeOnNextIteration' @ [162:13] ==> private final val executeOnNextIteration: (MutableList<(() -> Unit..(() -> Unit)?)>..List<(() -> Unit..(() -> Unit)?)>?) defined in net.corda.netmap.simulation.IRSSimulation[PropertyDescriptorImpl]

'removeAt' @ [162:36] ==> public abstract fun removeAt(index: Int): (() -> Unit..(() -> Unit)?) defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'super' @ [163:16] ==> <this> defined in net.corda.netmap.simulation.IRSSimulation[LazyClassReceiverParameterDescriptor]

'iterate' @ [163:22] ==> public open fun iterate(): InMemoryMessagingNetwork.MessageTransfer? defined in net.corda.netmap.simulation.Simulation[SimpleFunctionDescriptorImpl]

