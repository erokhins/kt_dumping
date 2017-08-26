'Before' @ [26:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [28:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'MockNetwork' @ [28:19] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'ServiceInfo' @ [29:29] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'ValidatingNotaryService' @ [29:41] ==> public companion object defined in net.corda.node.services.transactions.ValidatingNotaryService[FakeCallableDescriptorForObject]

'type' @ [29:65] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.ValidatingNotaryService.Companion[DeserializedPropertyDescriptor]

'notaryNode' @ [30:9] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'mockNet' @ [30:22] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'createNode' @ [30:30] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'DUMMY_NOTARY' @ [31:29] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [31:42] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'mapOf' @ [32:36] ==> public fun <K, V> mapOf(pair: Pair<ServiceInfo, KeyPair>): Map<ServiceInfo, KeyPair> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ServiceInfo
    <V> -> KeyPair

'notaryService' @ [32:42] ==> val notaryService: ServiceInfo defined in net.corda.docs.FxTransactionBuildTutorialTest.setup[LocalVariableDescriptor]

'DUMMY_NOTARY_KEY' @ [32:59] ==> public val DUMMY_NOTARY_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'arrayOf' @ [33:39] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: ServiceInfo): Array<ServiceInfo> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> ServiceInfo

'ServiceInfo' @ [33:47] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'NetworkMapService' @ [33:59] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'type' @ [33:77] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[DeserializedPropertyDescriptor]

'notaryService' @ [33:84] ==> val notaryService: ServiceInfo defined in net.corda.docs.FxTransactionBuildTutorialTest.setup[LocalVariableDescriptor]

'nodeA' @ [34:9] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'mockNet' @ [34:17] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'createPartyNode' @ [34:25] ==> public final fun createPartyNode(networkMapAddress: SingleMessageRecipient, legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [34:41] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'network' @ [34:52] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [34:60] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'nodeB' @ [35:9] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'mockNet' @ [35:17] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'createPartyNode' @ [35:25] ==> public final fun createPartyNode(networkMapAddress: SingleMessageRecipient, legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [35:41] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'network' @ [35:52] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [35:60] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'nodeB' @ [36:9] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'registerInitiatedFlow' @ [36:15] ==> public final fun <T : FlowLogic<*>> registerInitiatedFlow(initiatedFlowClass: Class<ForeignExchangeRemoteFlow>): Observable<ForeignExchangeRemoteFlow> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : FlowLogic<*>> -> ForeignExchangeRemoteFlow

'ForeignExchangeRemoteFlow' @ [36:37] ==> public constructor ForeignExchangeRemoteFlow(source: Party) defined in net.corda.docs.ForeignExchangeRemoteFlow[DeserializedClassConstructorDescriptor]

'java' @ [36:70] ==> public val <T> KClass<ForeignExchangeRemoteFlow>.java: Class<ForeignExchangeRemoteFlow> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ForeignExchangeRemoteFlow

'After' @ [39:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [41:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'stopNodes' @ [41:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'Test' @ [44:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'nodeA' @ [47:27] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'services' @ [47:33] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [47:42] ==> public open fun <T> startFlow(logic: FlowLogic<AbstractCashFlow.Result>): FlowStateMachine<AbstractCashFlow.Result> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'CashIssueFlow' @ [47:52] ==> public constructor CashIssueFlow(amount: Amount<Currency>, issuerBankPartyRef: OpaqueBytes, notary: Party) defined in net.corda.finance.flows.CashIssueFlow[DeserializedClassConstructorDescriptor]

'DOLLARS' @ [47:66] ==> public fun DOLLARS(amount: Int): Amount<Currency> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'OpaqueBytes' @ [48:17] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [48:29] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [49:17] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'info' @ [49:28] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [49:33] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'flowHandle1' @ [51:9] ==> val flowHandle1: FlowStateMachine<AbstractCashFlow.Result> defined in net.corda.docs.FxTransactionBuildTutorialTest.`Run ForeignExchangeFlow to completion`[LocalVariableDescriptor]

'resultFuture' @ [51:21] ==> public abstract val resultFuture: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [51:34] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'printBalances' @ [52:9] ==> private final fun printBalances(): Unit defined in net.corda.docs.FxTransactionBuildTutorialTest[SimpleFunctionDescriptorImpl]

'nodeB' @ [55:27] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'services' @ [55:33] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [55:42] ==> public open fun <T> startFlow(logic: FlowLogic<AbstractCashFlow.Result>): FlowStateMachine<AbstractCashFlow.Result> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'CashIssueFlow' @ [55:52] ==> public constructor CashIssueFlow(amount: Amount<Currency>, issuerBankPartyRef: OpaqueBytes, notary: Party) defined in net.corda.finance.flows.CashIssueFlow[DeserializedClassConstructorDescriptor]

'POUNDS' @ [55:66] ==> public fun POUNDS(amount: Int): Amount<Currency> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'OpaqueBytes' @ [56:17] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [56:29] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [57:17] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'info' @ [57:28] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [57:33] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'flowHandle2' @ [59:9] ==> val flowHandle2: FlowStateMachine<AbstractCashFlow.Result> defined in net.corda.docs.FxTransactionBuildTutorialTest.`Run ForeignExchangeFlow to completion`[LocalVariableDescriptor]

'resultFuture' @ [59:21] ==> public abstract val resultFuture: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [59:34] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'printBalances' @ [60:9] ==> private final fun printBalances(): Unit defined in net.corda.docs.FxTransactionBuildTutorialTest[SimpleFunctionDescriptorImpl]

'nodeA' @ [63:32] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'services' @ [63:38] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'vaultService' @ [63:47] ==> public abstract val vaultService: VaultService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'updates' @ [63:60] ==> public abstract val updates: Observable<Vault.Update<ContractState>> defined in net.corda.core.node.services.VaultService[DeserializedPropertyDescriptor]

'toFuture' @ [63:68] ==> public fun <T> Observable<Vault.Update<ContractState>>.toFuture(): CordaFuture<Vault.Update<ContractState>> defined in net.corda.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Update<ContractState>

'nodeB' @ [64:32] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'services' @ [64:38] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'vaultService' @ [64:47] ==> public abstract val vaultService: VaultService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'updates' @ [64:60] ==> public abstract val updates: Observable<Vault.Update<ContractState>> defined in net.corda.core.node.services.VaultService[DeserializedPropertyDescriptor]

'toFuture' @ [64:68] ==> public fun <T> Observable<Vault.Update<ContractState>>.toFuture(): CordaFuture<Vault.Update<ContractState>> defined in net.corda.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Update<ContractState>

'nodeA' @ [67:20] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'services' @ [67:26] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [67:35] ==> public open fun <T> startFlow(logic: FlowLogic<SecureHash>): FlowStateMachine<SecureHash> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'ForeignExchangeFlow' @ [67:45] ==> public constructor ForeignExchangeFlow(tradeId: String, baseCurrencyAmount: Amount<Issued<Currency>>, quoteCurrencyAmount: Amount<Issued<Currency>>, baseCurrencyBuyer: Party, baseCurrencySeller: Party) defined in net.corda.docs.ForeignExchangeFlow[DeserializedClassConstructorDescriptor]

'POUNDS' @ [68:17] ==> public fun POUNDS(amount: Int): Amount<Currency> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'issuedBy' @ [68:29] ==> public infix fun Amount<Currency>.issuedBy(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'nodeB' @ [68:38] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'info' @ [68:44] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [68:49] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'ref' @ [68:63] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [69:17] ==> public fun DOLLARS(amount: Int): Amount<Currency> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'issuedBy' @ [69:30] ==> public infix fun Amount<Currency>.issuedBy(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'nodeA' @ [69:39] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'info' @ [69:45] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [69:50] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'ref' @ [69:64] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'nodeA' @ [70:17] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'info' @ [70:23] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [70:28] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'nodeB' @ [71:17] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'info' @ [71:23] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [71:28] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'doIt' @ [73:9] ==> val doIt: FlowStateMachine<SecureHash> defined in net.corda.docs.FxTransactionBuildTutorialTest.`Run ForeignExchangeFlow to completion`[LocalVariableDescriptor]

'resultFuture' @ [73:14] ==> public abstract val resultFuture: CordaFuture<SecureHash> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [73:27] ==> public fun <V> Future<SecureHash>.getOrThrow(timeout: Duration? = ...): SecureHash defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> SecureHash

'nodeAVaultUpdate' @ [75:9] ==> val nodeAVaultUpdate: CordaFuture<Vault.Update<ContractState>> defined in net.corda.docs.FxTransactionBuildTutorialTest.`Run ForeignExchangeFlow to completion`[LocalVariableDescriptor]

'get' @ [75:26] ==> public abstract fun get(): (Vault.Update<ContractState>..Vault.Update<ContractState>?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'nodeA' @ [76:25] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'database' @ [76:31] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [76:40] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Map<Currency, Amount<Currency>>): Map<Currency, Amount<Currency>> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<Currency, Amount<Currency>>

'nodeA' @ [77:13] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'services' @ [77:19] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'getCashBalances' @ [77:28] ==> public fun ServiceHub.getCashBalances(): Map<Currency, Amount<Currency>> defined in net.corda.finance.contracts[DeserializedSimpleFunctionDescriptor]

'nodeBVaultUpdate' @ [79:9] ==> val nodeBVaultUpdate: CordaFuture<Vault.Update<ContractState>> defined in net.corda.docs.FxTransactionBuildTutorialTest.`Run ForeignExchangeFlow to completion`[LocalVariableDescriptor]

'get' @ [79:26] ==> public abstract fun get(): (Vault.Update<ContractState>..Vault.Update<ContractState>?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'nodeB' @ [80:25] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'database' @ [80:31] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [80:40] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Map<Currency, Amount<Currency>>): Map<Currency, Amount<Currency>> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<Currency, Amount<Currency>>

'nodeB' @ [81:13] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'services' @ [81:19] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'getCashBalances' @ [81:28] ==> public fun ServiceHub.getCashBalances(): Map<Currency, Amount<Currency>> defined in net.corda.finance.contracts[DeserializedSimpleFunctionDescriptor]

'println' @ [83:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'+' @ [83:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'balancesA' @ [83:32] ==> val balancesA: Map<Currency, Amount<Currency>> defined in net.corda.docs.FxTransactionBuildTutorialTest.`Run ForeignExchangeFlow to completion`[LocalVariableDescriptor]

'println' @ [84:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'+' @ [84:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'balancesB' @ [84:32] ==> val balancesB: Map<Currency, Amount<Currency>> defined in net.corda.docs.FxTransactionBuildTutorialTest.`Run ForeignExchangeFlow to completion`[LocalVariableDescriptor]

'assertEquals' @ [86:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Currency>?, actual: Amount<Currency>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Currency>?

'POUNDS' @ [86:22] ==> public fun POUNDS(amount: Int): Amount<Currency> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'balancesA' @ [86:35] ==> val balancesA: Map<Currency, Amount<Currency>> defined in net.corda.docs.FxTransactionBuildTutorialTest.`Run ForeignExchangeFlow to completion`[LocalVariableDescriptor]

'GBP' @ [86:45] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'assertEquals' @ [87:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Currency>?, actual: Amount<Currency>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Currency>?

'DOLLARS' @ [87:22] ==> public fun DOLLARS(amount: Int): Amount<Currency> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'-' @ [87:30] ==> public final operator fun minus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'balancesA' @ [87:43] ==> val balancesA: Map<Currency, Amount<Currency>> defined in net.corda.docs.FxTransactionBuildTutorialTest.`Run ForeignExchangeFlow to completion`[LocalVariableDescriptor]

'USD' @ [87:53] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'assertEquals' @ [88:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Currency>?, actual: Amount<Currency>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Currency>?

'POUNDS' @ [88:22] ==> public fun POUNDS(amount: Int): Amount<Currency> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'-' @ [88:29] ==> public final operator fun minus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'balancesB' @ [88:42] ==> val balancesB: Map<Currency, Amount<Currency>> defined in net.corda.docs.FxTransactionBuildTutorialTest.`Run ForeignExchangeFlow to completion`[LocalVariableDescriptor]

'GBP' @ [88:52] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'assertEquals' @ [89:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Currency>?, actual: Amount<Currency>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Currency>?

'DOLLARS' @ [89:22] ==> public fun DOLLARS(amount: Int): Amount<Currency> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'balancesB' @ [89:36] ==> val balancesB: Map<Currency, Amount<Currency>> defined in net.corda.docs.FxTransactionBuildTutorialTest.`Run ForeignExchangeFlow to completion`[LocalVariableDescriptor]

'USD' @ [89:46] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'nodeA' @ [94:9] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'database' @ [94:15] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [94:24] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'println' @ [95:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'+' @ [95:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'nodeA' @ [95:36] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'services' @ [95:42] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'getCashBalances' @ [95:51] ==> public fun ServiceHub.getCashBalances(): Map<Currency, Amount<Currency>> defined in net.corda.finance.contracts[DeserializedSimpleFunctionDescriptor]

'nodeB' @ [97:9] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'database' @ [97:15] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [97:24] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'println' @ [98:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'+' @ [98:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'nodeB' @ [98:36] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.FxTransactionBuildTutorialTest[PropertyDescriptorImpl]

'services' @ [98:42] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'getCashBalances' @ [98:51] ==> public fun ServiceHub.getCashBalances(): Map<Currency, Amount<Currency>> defined in net.corda.finance.contracts[DeserializedSimpleFunctionDescriptor]

