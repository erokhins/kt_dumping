'Before' @ [28:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [30:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'MockNetwork' @ [30:19] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'ServiceInfo' @ [31:29] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'ValidatingNotaryService' @ [31:41] ==> public companion object defined in net.corda.node.services.transactions.ValidatingNotaryService[FakeCallableDescriptorForObject]

'type' @ [31:65] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.ValidatingNotaryService.Companion[DeserializedPropertyDescriptor]

'notaryNode' @ [32:9] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'mockNet' @ [32:22] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'createNode' @ [32:30] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'DUMMY_NOTARY' @ [33:29] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [33:42] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'mapOf' @ [34:36] ==> public fun <K, V> mapOf(pair: Pair<ServiceInfo, KeyPair>): Map<ServiceInfo, KeyPair> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ServiceInfo
    <V> -> KeyPair

'notaryService' @ [34:42] ==> val notaryService: ServiceInfo defined in net.corda.docs.CustomVaultQueryTest.setup[LocalVariableDescriptor]

'DUMMY_NOTARY_KEY' @ [34:59] ==> public val DUMMY_NOTARY_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'arrayOf' @ [35:39] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: ServiceInfo): Array<ServiceInfo> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> ServiceInfo

'ServiceInfo' @ [35:47] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'NetworkMapService' @ [35:59] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'type' @ [35:77] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[DeserializedPropertyDescriptor]

'notaryService' @ [35:84] ==> val notaryService: ServiceInfo defined in net.corda.docs.CustomVaultQueryTest.setup[LocalVariableDescriptor]

'nodeA' @ [36:9] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'mockNet' @ [36:17] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'createPartyNode' @ [36:25] ==> public final fun createPartyNode(networkMapAddress: SingleMessageRecipient, legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [36:41] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'network' @ [36:52] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [36:60] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'nodeB' @ [37:9] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'mockNet' @ [37:17] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'createPartyNode' @ [37:25] ==> public final fun createPartyNode(networkMapAddress: SingleMessageRecipient, legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [37:41] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'network' @ [37:52] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [37:60] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'nodeA' @ [39:9] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'registerInitiatedFlow' @ [39:15] ==> public final fun <T : FlowLogic<*>> registerInitiatedFlow(initiatedFlowClass: Class<TopupIssuerFlow.TopupIssuer>): Observable<TopupIssuerFlow.TopupIssuer> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : FlowLogic<*>> -> TopupIssuer

'TopupIssuerFlow' @ [39:37] ==> public object TopupIssuerFlow defined in net.corda.docs[FakeCallableDescriptorForObject]

'TopupIssuer' @ [39:53] ==> public companion object defined in net.corda.docs.TopupIssuerFlow.TopupIssuer[FakeCallableDescriptorForObject]

'java' @ [39:72] ==> public val <T> KClass<TopupIssuerFlow.TopupIssuer>.java: Class<TopupIssuerFlow.TopupIssuer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TopupIssuer

'nodeA' @ [40:9] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'installCordaService' @ [40:15] ==> public final fun <T : SerializeAsToken> installCordaService(serviceClass: Class<CustomVaultQuery.Service>): CustomVaultQuery.Service defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : SerializeAsToken> -> Service

'CustomVaultQuery' @ [40:35] ==> public object CustomVaultQuery defined in net.corda.docs[FakeCallableDescriptorForObject]

'Service' @ [40:52] ==> private companion object defined in net.corda.docs.CustomVaultQuery.Service[FakeCallableDescriptorForObject]

'java' @ [40:67] ==> public val <T> KClass<CustomVaultQuery.Service>.java: Class<CustomVaultQuery.Service> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Service

'After' @ [43:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [45:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'stopNodes' @ [45:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'Test' @ [48:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'issueCashForCurrency' @ [51:9] ==> private final fun issueCashForCurrency(amountToIssue: Amount<Currency>): Unit defined in net.corda.docs.CustomVaultQueryTest[SimpleFunctionDescriptorImpl]

'POUNDS' @ [51:30] ==> public fun POUNDS(amount: Int): Amount<Currency> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'issueCashForCurrency' @ [52:9] ==> private final fun issueCashForCurrency(amountToIssue: Amount<Currency>): Unit defined in net.corda.docs.CustomVaultQueryTest[SimpleFunctionDescriptorImpl]

'DOLLARS' @ [52:30] ==> public fun DOLLARS(amount: Int): Amount<Currency> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'issueCashForCurrency' @ [53:9] ==> private final fun issueCashForCurrency(amountToIssue: Amount<Currency>): Unit defined in net.corda.docs.CustomVaultQueryTest[SimpleFunctionDescriptorImpl]

'SWISS_FRANCS' @ [53:30] ==> public fun SWISS_FRANCS(amount: Int): Amount<Currency> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'component1' @ [54:14] ==> public final operator fun component1(): Map<Currency, Amount<Currency>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [54:36] ==> public final operator fun component2(): Map<Currency, Amount<Currency>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'getBalances' @ [54:41] ==> private final fun getBalances(): Pair<Map<Currency, Amount<Currency>>, Map<Currency, Amount<Currency>>> defined in net.corda.docs.CustomVaultQueryTest[SimpleFunctionDescriptorImpl]

'topUpCurrencies' @ [57:9] ==> private final fun topUpCurrencies(): Unit defined in net.corda.docs.CustomVaultQueryTest[SimpleFunctionDescriptorImpl]

'component1' @ [58:14] ==> public final operator fun component1(): Map<Currency, Amount<Currency>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [58:38] ==> public final operator fun component2(): Map<Currency, Amount<Currency>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'getBalances' @ [58:43] ==> private final fun getBalances(): Pair<Map<Currency, Amount<Currency>>, Map<Currency, Amount<Currency>>> defined in net.corda.docs.CustomVaultQueryTest[SimpleFunctionDescriptorImpl]

'assertEquals' @ [60:16] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'cashBalancesOriginal' @ [60:29] ==> val cashBalancesOriginal: Map<Currency, Amount<Currency>> defined in net.corda.docs.CustomVaultQueryTest.`test custom vault query`[LocalVariableDescriptor]

'GBP' @ [60:50] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'times' @ [60:56] ==> public final operator fun times(other: Int): Amount<Currency> defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'cashBalancesAfterTopup' @ [60:66] ==> val cashBalancesAfterTopup: Map<Currency, Amount<Currency>> defined in net.corda.docs.CustomVaultQueryTest.`test custom vault query`[LocalVariableDescriptor]

'GBP' @ [60:89] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'assertEquals' @ [61:16] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'cashBalancesOriginal' @ [61:29] ==> val cashBalancesOriginal: Map<Currency, Amount<Currency>> defined in net.corda.docs.CustomVaultQueryTest.`test custom vault query`[LocalVariableDescriptor]

'USD' @ [61:50] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'times' @ [61:56] ==> public final operator fun times(other: Int): Amount<Currency> defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'cashBalancesAfterTopup' @ [61:68] ==> val cashBalancesAfterTopup: Map<Currency, Amount<Currency>> defined in net.corda.docs.CustomVaultQueryTest.`test custom vault query`[LocalVariableDescriptor]

'USD' @ [61:91] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'assertEquals' @ [62:16] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'cashBalancesOriginal' @ [62:29] ==> val cashBalancesOriginal: Map<Currency, Amount<Currency>> defined in net.corda.docs.CustomVaultQueryTest.`test custom vault query`[LocalVariableDescriptor]

'CHF' @ [62:50] ==> @field:JvmField public val CHF: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'times' @ [62:56] ==> public final operator fun times(other: Int): Amount<Currency> defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'cashBalancesAfterTopup' @ [62:67] ==> val cashBalancesAfterTopup: Map<Currency, Amount<Currency>> defined in net.corda.docs.CustomVaultQueryTest.`test custom vault query`[LocalVariableDescriptor]

'CHF' @ [62:90] ==> @field:JvmField public val CHF: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'nodeA' @ [67:27] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'services' @ [67:33] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [67:42] ==> public open fun <T> startFlow(logic: FlowLogic<AbstractCashFlow.Result>): FlowStateMachine<AbstractCashFlow.Result> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'CashIssueFlow' @ [67:52] ==> public constructor CashIssueFlow(amount: Amount<Currency>, issuerBankPartyRef: OpaqueBytes, notary: Party) defined in net.corda.finance.flows.CashIssueFlow[DeserializedClassConstructorDescriptor]

'amountToIssue' @ [67:66] ==> value-parameter amountToIssue: Amount<Currency> defined in net.corda.docs.CustomVaultQueryTest.issueCashForCurrency[ValueParameterDescriptorImpl]

'OpaqueBytes' @ [68:17] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [68:29] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [69:17] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'info' @ [69:28] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [69:33] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'flowHandle1' @ [71:9] ==> val flowHandle1: FlowStateMachine<AbstractCashFlow.Result> defined in net.corda.docs.CustomVaultQueryTest.issueCashForCurrency[LocalVariableDescriptor]

'resultFuture' @ [71:21] ==> public abstract val resultFuture: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [71:34] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'nodeA' @ [75:27] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'services' @ [75:33] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [75:42] ==> public open fun <T> startFlow(logic: FlowLogic<List<AbstractCashFlow.Result>>): FlowStateMachine<List<AbstractCashFlow.Result>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Result>

'TopupIssuerFlow' @ [75:52] ==> public object TopupIssuerFlow defined in net.corda.docs[FakeCallableDescriptorForObject]

'TopupIssuanceRequester' @ [75:68] ==> public constructor TopupIssuanceRequester(issueToParty: Party, issueToPartyRef: OpaqueBytes, issuerBankParty: Party, notaryParty: Party) defined in net.corda.docs.TopupIssuerFlow.TopupIssuanceRequester[DeserializedClassConstructorDescriptor]

'nodeA' @ [76:17] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'info' @ [76:23] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [76:28] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'OpaqueBytes' @ [77:17] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [77:29] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'nodeA' @ [78:17] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'info' @ [78:23] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [78:28] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'notaryNode' @ [79:17] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'info' @ [79:28] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [79:33] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'flowHandle1' @ [80:9] ==> val flowHandle1: FlowStateMachine<List<AbstractCashFlow.Result>> defined in net.corda.docs.CustomVaultQueryTest.topUpCurrencies[LocalVariableDescriptor]

'resultFuture' @ [80:21] ==> public abstract val resultFuture: CordaFuture<List<AbstractCashFlow.Result>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [80:34] ==> public fun <V> Future<List<AbstractCashFlow.Result>>.getOrThrow(timeout: Duration? = ...): List<AbstractCashFlow.Result> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<Result>

'nodeA' @ [86:13] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'database' @ [86:19] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [86:28] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Map<Currency, Amount<Currency>>): Map<Currency, Amount<Currency>> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<Currency, Amount<Currency>>

'nodeA' @ [87:17] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'services' @ [87:23] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'getCashBalances' @ [87:32] ==> public fun ServiceHub.getCashBalances(): Map<Currency, Amount<Currency>> defined in net.corda.finance.contracts[DeserializedSimpleFunctionDescriptor]

'println' @ [89:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'+' @ [89:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'balancesNodesA' @ [89:32] ==> val balancesNodesA: Map<Currency, Amount<Currency>> defined in net.corda.docs.CustomVaultQueryTest.getBalances[LocalVariableDescriptor]

'nodeB' @ [92:13] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'database' @ [92:19] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [92:28] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Map<Currency, Amount<Currency>>): Map<Currency, Amount<Currency>> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<Currency, Amount<Currency>>

'nodeB' @ [93:17] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.CustomVaultQueryTest[PropertyDescriptorImpl]

'services' @ [93:23] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'getCashBalances' @ [93:32] ==> public fun ServiceHub.getCashBalances(): Map<Currency, Amount<Currency>> defined in net.corda.finance.contracts[DeserializedSimpleFunctionDescriptor]

'println' @ [95:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'+' @ [95:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'balancesNodesB' @ [95:32] ==> val balancesNodesB: Map<Currency, Amount<Currency>> defined in net.corda.docs.CustomVaultQueryTest.getBalances[LocalVariableDescriptor]

'Pair' @ [97:16] ==> public constructor Pair<out A, out B>(first: Map<Currency, Amount<Currency>>, second: Map<Currency, Amount<Currency>>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Map<Currency, Amount<Currency>>
    <out B> -> Map<Currency, Amount<Currency>>

'balancesNodesA' @ [97:21] ==> val balancesNodesA: Map<Currency, Amount<Currency>> defined in net.corda.docs.CustomVaultQueryTest.getBalances[LocalVariableDescriptor]

'balancesNodesB' @ [97:37] ==> val balancesNodesB: Map<Currency, Amount<Currency>> defined in net.corda.docs.CustomVaultQueryTest.getBalances[LocalVariableDescriptor]

