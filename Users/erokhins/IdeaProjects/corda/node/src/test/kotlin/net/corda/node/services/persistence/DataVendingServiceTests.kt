'Before' @ [33:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [35:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.persistence.DataVendingServiceTests[PropertyDescriptorImpl]

'MockNetwork' @ [35:19] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'After' @ [38:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [40:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.persistence.DataVendingServiceTests[PropertyDescriptorImpl]

'stopNodes' @ [40:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'Test' @ [43:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mockNet' @ [45:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.persistence.DataVendingServiceTests[PropertyDescriptorImpl]

'createSomeNodes' @ [45:29] ==> @JvmOverloads public final fun createSomeNodes(numPartyNodes: Int = ..., nodeFactory: MockNetwork.Factory<*> = ..., notaryKeyPair: KeyPair? = ...): MockNetwork.BasketOfNodes defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'nodes' @ [46:32] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify of transaction`[LocalVariableDescriptor]

'partyNodes' @ [46:38] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'nodes' @ [47:28] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify of transaction`[LocalVariableDescriptor]

'partyNodes' @ [47:34] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'vaultServiceNode' @ [48:27] ==> val vaultServiceNode: MockNetwork.MockNode defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify of transaction`[LocalVariableDescriptor]

'info' @ [48:44] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [48:49] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'registerNode' @ [49:23] ==> val registerNode: MockNetwork.MockNode defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify of transaction`[LocalVariableDescriptor]

'info' @ [49:36] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [49:41] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'ref' @ [49:55] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'mockNet' @ [50:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.persistence.DataVendingServiceTests[PropertyDescriptorImpl]

'runNetwork' @ [50:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'TransactionBuilder' @ [53:19] ==> public constructor TransactionBuilder(notary: Party? = ..., lockId: UUID = ..., inputs: MutableList<StateRef> = ..., attachments: MutableList<SecureHash> = ..., outputs: MutableList<TransactionState<ContractState>> = ..., commands: MutableList<Command<*>> = ..., window: TimeWindow? = ..., privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'Cash' @ [54:9] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[DeserializedClassConstructorDescriptor]

'generateIssue' @ [54:16] ==> public final fun generateIssue(tx: TransactionBuilder, amount: Amount<Issued<Currency>>, owner: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash[DeserializedSimpleFunctionDescriptor]

'ptx' @ [54:30] ==> val ptx: TransactionBuilder defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify of transaction`[LocalVariableDescriptor]

'Amount' @ [54:35] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'Issued' @ [54:47] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'deposit' @ [54:54] ==> val deposit: PartyAndReference defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify of transaction`[LocalVariableDescriptor]

'USD' @ [54:63] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'beneficiary' @ [54:70] ==> val beneficiary: Party defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify of transaction`[LocalVariableDescriptor]

'DUMMY_NOTARY' @ [54:83] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'registerNode' @ [57:18] ==> val registerNode: MockNetwork.MockNode defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify of transaction`[LocalVariableDescriptor]

'services' @ [57:31] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [57:40] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'ptx' @ [57:63] ==> val ptx: TransactionBuilder defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify of transaction`[LocalVariableDescriptor]

'vaultServiceNode' @ [58:9] ==> val vaultServiceNode: MockNetwork.MockNode defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify of transaction`[LocalVariableDescriptor]

'database' @ [58:26] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [58:35] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertThat' @ [59:13] ==> @CheckReturnValue public open fun assertThat(p0: Boolean): (AbstractBooleanAssert<*>..AbstractBooleanAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'vaultServiceNode' @ [59:24] ==> val vaultServiceNode: MockNetwork.MockNode defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify of transaction`[LocalVariableDescriptor]

'services' @ [59:41] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'vaultQueryService' @ [59:50] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'queryBy' @ [59:68] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [59:90] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'isEmpty' @ [59:97] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'registerNode' @ [61:13] ==> val registerNode: MockNetwork.MockNode defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify of transaction`[LocalVariableDescriptor]

'sendNotifyTx' @ [61:26] ==> private final fun MockNetwork.MockNode.sendNotifyTx(tx: SignedTransaction, walletServiceNode: MockNetwork.MockNode): Unit defined in net.corda.node.services.persistence.DataVendingServiceTests[SimpleFunctionDescriptorImpl]

'tx' @ [61:39] ==> val tx: SignedTransaction defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify of transaction`[LocalVariableDescriptor]

'vaultServiceNode' @ [61:43] ==> val vaultServiceNode: MockNetwork.MockNode defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify of transaction`[LocalVariableDescriptor]

'vaultServiceNode' @ [64:26] ==> val vaultServiceNode: MockNetwork.MockNode defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify of transaction`[LocalVariableDescriptor]

'services' @ [64:43] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'vaultQueryService' @ [64:52] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'queryBy' @ [64:70] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [64:92] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'singleOrNull' @ [64:99] ==> public fun <T> List<StateAndRef<Cash.State>>.singleOrNull(): StateAndRef<Cash.State>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'tx' @ [65:28] ==> val tx: SignedTransaction defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify of transaction`[LocalVariableDescriptor]

'tx' @ [65:31] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [65:34] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<Cash.State> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> State

'assertEquals' @ [66:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateAndRef<Cash.State>?, actual: StateAndRef<Cash.State>?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateAndRef<State>?

'expected' @ [66:26] ==> val expected: StateAndRef<Cash.State> defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify of transaction`.<anonymous>[LocalVariableDescriptor]

'actual' @ [66:36] ==> val actual: StateAndRef<Cash.State>? defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify of transaction`.<anonymous>[LocalVariableDescriptor]

'Test' @ [73:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mockNet' @ [75:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.persistence.DataVendingServiceTests[PropertyDescriptorImpl]

'createSomeNodes' @ [75:29] ==> @JvmOverloads public final fun createSomeNodes(numPartyNodes: Int = ..., nodeFactory: MockNetwork.Factory<*> = ..., notaryKeyPair: KeyPair? = ...): MockNetwork.BasketOfNodes defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'nodes' @ [76:32] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify failure`[LocalVariableDescriptor]

'partyNodes' @ [76:38] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'nodes' @ [77:28] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify failure`[LocalVariableDescriptor]

'partyNodes' @ [77:34] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'vaultServiceNode' @ [78:27] ==> val vaultServiceNode: MockNetwork.MockNode defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify failure`[LocalVariableDescriptor]

'info' @ [78:44] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [78:49] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [79:23] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [79:33] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'mockNet' @ [80:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.persistence.DataVendingServiceTests[PropertyDescriptorImpl]

'runNetwork' @ [80:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'TransactionBuilder' @ [83:19] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [83:38] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [84:9] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[DeserializedClassConstructorDescriptor]

'generateIssue' @ [84:16] ==> public final fun generateIssue(tx: TransactionBuilder, amount: Amount<Issued<Currency>>, owner: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash[DeserializedSimpleFunctionDescriptor]

'ptx' @ [84:30] ==> val ptx: TransactionBuilder defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify failure`[LocalVariableDescriptor]

'Amount' @ [84:35] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'Issued' @ [84:47] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'deposit' @ [84:54] ==> val deposit: PartyAndReference defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify failure`[LocalVariableDescriptor]

'USD' @ [84:63] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'beneficiary' @ [84:70] ==> val beneficiary: Party defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify failure`[LocalVariableDescriptor]

'DUMMY_NOTARY' @ [84:83] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'registerNode' @ [87:18] ==> val registerNode: MockNetwork.MockNode defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify failure`[LocalVariableDescriptor]

'services' @ [87:31] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [87:40] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'ptx' @ [87:63] ==> val ptx: TransactionBuilder defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify failure`[LocalVariableDescriptor]

'vaultServiceNode' @ [88:9] ==> val vaultServiceNode: MockNetwork.MockNode defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify failure`[LocalVariableDescriptor]

'database' @ [88:26] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [88:35] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>?)>?)>): AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>?)>?)> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>..org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>?)>..org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>..org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>?)>?)>..org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>..org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>?)>..org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>..org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>?)>?)>?)>..org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>..org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>?)>..org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>..org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>?)>?)>..org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>..org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>?)>..org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>..org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>?)>?)>?)>?)>..org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>..org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>?)>..org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>..org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>?)>?)>..org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>..org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>?)>..org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>..org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>?)>?)>?)>..org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>..org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>?)>..org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>..org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>?)>?)>..org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>..org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>?)>..org.assertj.core.api.AbstractBooleanAssert<out (org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>..org.assertj.core.api.AbstractBooleanAssert<out kotlin.Any?>?)>?)>?)>?)>?)>

'assertThat' @ [89:13] ==> @CheckReturnValue public open fun assertThat(p0: Boolean): (AbstractBooleanAssert<*>..AbstractBooleanAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'vaultServiceNode' @ [89:24] ==> val vaultServiceNode: MockNetwork.MockNode defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify failure`[LocalVariableDescriptor]

'services' @ [89:41] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'vaultQueryService' @ [89:50] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'queryBy' @ [89:68] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [89:90] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'isEmpty' @ [89:97] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'registerNode' @ [91:13] ==> val registerNode: MockNetwork.MockNode defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify failure`[LocalVariableDescriptor]

'sendNotifyTx' @ [91:26] ==> private final fun MockNetwork.MockNode.sendNotifyTx(tx: SignedTransaction, walletServiceNode: MockNetwork.MockNode): Unit defined in net.corda.node.services.persistence.DataVendingServiceTests[SimpleFunctionDescriptorImpl]

'tx' @ [91:39] ==> val tx: SignedTransaction defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify failure`[LocalVariableDescriptor]

'vaultServiceNode' @ [91:43] ==> val vaultServiceNode: MockNetwork.MockNode defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify failure`[LocalVariableDescriptor]

'assertThat' @ [94:13] ==> @CheckReturnValue public open fun assertThat(p0: Boolean): (AbstractBooleanAssert<*>..AbstractBooleanAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'vaultServiceNode' @ [94:24] ==> val vaultServiceNode: MockNetwork.MockNode defined in net.corda.node.services.persistence.DataVendingServiceTests.`notify failure`[LocalVariableDescriptor]

'services' @ [94:41] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'vaultQueryService' @ [94:50] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'queryBy' @ [94:68] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [94:90] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'isEmpty' @ [94:97] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'walletServiceNode' @ [99:9] ==> value-parameter walletServiceNode: MockNetwork.MockNode defined in net.corda.node.services.persistence.DataVendingServiceTests.sendNotifyTx[ValueParameterDescriptorImpl]

'registerInitiatedFlow' @ [99:27] ==> public final fun <T : FlowLogic<*>> registerInitiatedFlow(initiatedFlowClass: Class<DataVendingServiceTests.InitiateNotifyTxFlow>): Observable<DataVendingServiceTests.InitiateNotifyTxFlow> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : FlowLogic<*>> -> InitiateNotifyTxFlow

'InitiateNotifyTxFlow' @ [99:49] ==> public constructor InitiateNotifyTxFlow(otherParty: Party) defined in net.corda.node.services.persistence.DataVendingServiceTests.InitiateNotifyTxFlow[ClassConstructorDescriptorImpl]

'java' @ [99:77] ==> public val <T> KClass<DataVendingServiceTests.InitiateNotifyTxFlow>.java: Class<DataVendingServiceTests.InitiateNotifyTxFlow> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> InitiateNotifyTxFlow

'services' @ [100:9] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [100:18] ==> public open fun <T> startFlow(logic: FlowLogic<Void?>): FlowStateMachine<Void?> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Void?

'NotifyTxFlow' @ [100:28] ==> public constructor NotifyTxFlow(otherParty: Party, stx: SignedTransaction) defined in net.corda.node.services.persistence.DataVendingServiceTests.NotifyTxFlow[ClassConstructorDescriptorImpl]

'walletServiceNode' @ [100:41] ==> value-parameter walletServiceNode: MockNetwork.MockNode defined in net.corda.node.services.persistence.DataVendingServiceTests.sendNotifyTx[ValueParameterDescriptorImpl]

'info' @ [100:59] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [100:64] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'tx' @ [100:79] ==> value-parameter tx: SignedTransaction defined in net.corda.node.services.persistence.DataVendingServiceTests.sendNotifyTx[ValueParameterDescriptorImpl]

'mockNet' @ [101:9] ==> public final val mockNet: MockNetwork defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'runNetwork' @ [101:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'InitiatingFlow' @ [104:5] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'FlowLogic<Void?>' @ [105:85] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Void?

'Suspendable' @ [106:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'subFlow' @ [107:31] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<Void?>): Void? defined in net.corda.node.services.persistence.DataVendingServiceTests.NotifyTxFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Void?

'SendTransactionFlow' @ [107:39] ==> public constructor SendTransactionFlow(otherSide: Party, stx: SignedTransaction) defined in net.corda.core.flows.SendTransactionFlow[DeserializedClassConstructorDescriptor]

'otherParty' @ [107:59] ==> public final val otherParty: Party defined in net.corda.node.services.persistence.DataVendingServiceTests.NotifyTxFlow[PropertyDescriptorImpl]

'stx' @ [107:71] ==> public final val stx: SignedTransaction defined in net.corda.node.services.persistence.DataVendingServiceTests.NotifyTxFlow[PropertyDescriptorImpl]

'InitiatedBy' @ [110:5] ==> public constructor InitiatedBy(value: KClass<out FlowLogic<*>>) defined in net.corda.core.flows.InitiatedBy[DeserializedClassConstructorDescriptor]

'NotifyTxFlow' @ [110:18] ==> public constructor NotifyTxFlow(otherParty: Party, stx: SignedTransaction) defined in net.corda.node.services.persistence.DataVendingServiceTests.NotifyTxFlow[ClassConstructorDescriptorImpl]

'FlowLogic<Unit>' @ [111:65] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Suspendable' @ [112:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'subFlow' @ [113:31] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<Unit>): Unit defined in net.corda.node.services.persistence.DataVendingServiceTests.InitiateNotifyTxFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'NotifyTransactionHandler' @ [113:39] ==> public constructor NotifyTransactionHandler(otherParty: Party) defined in net.corda.node.services.NotifyTransactionHandler[DeserializedClassConstructorDescriptor]

'otherParty' @ [113:64] ==> public final val otherParty: Party defined in net.corda.node.services.persistence.DataVendingServiceTests.InitiateNotifyTxFlow[PropertyDescriptorImpl]

