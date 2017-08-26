'builder' @ [32:21] ==> public inline fun <A> builder(block: Builder.() -> CriteriaExpression.AggregateFunctionExpression<VaultSchemaV1.VaultStates, Instant>): CriteriaExpression.AggregateFunctionExpression<VaultSchemaV1.VaultStates, Instant> defined in net.corda.core.node.services.vault[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> AggregateFunctionExpression<VaultStates, Instant>

'VaultSchemaV1' @ [32:31] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [32:45] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'recordedTime' @ [32:58] ==> @field:Column public final var recordedTime: Instant defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'count' @ [32:71] ==> public final fun <O, R> KProperty1<VaultSchemaV1.VaultStates, Instant?>.count(): CriteriaExpression.AggregateFunctionExpression<VaultSchemaV1.VaultStates, Instant> defined in net.corda.core.node.services.vault.Builder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> VaultStates
    <R> -> Instant

'VaultCustomQueryCriteria' @ [33:43] ==> @JvmOverloads public constructor VaultCustomQueryCriteria<L : PersistentState>(expression: CriteriaExpression<VaultSchemaV1.VaultStates, Boolean>, status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultCustomQueryCriteria[DeserializedClassConstructorDescriptor]
Inferred types:
    <L : PersistentState> -> VaultStates

'count' @ [33:68] ==> val count: CriteriaExpression.AggregateFunctionExpression<VaultSchemaV1.VaultStates, Instant> defined in net.corda.traderdemo.TraderDemoClientApi.<get-cashCount>[LocalVariableDescriptor]

'rpc' @ [34:16] ==> public final val rpc: CordaRPCOps defined in net.corda.traderdemo.TraderDemoClientApi[PropertyDescriptorImpl]

'vaultQueryBy' @ [34:20] ==> public inline fun <reified T : ContractState> CordaRPCOps.vaultQueryBy(criteria: QueryCriteria = ..., paging: PageSpecification = ..., sorting: Sort = ...): Vault.Page<Cash.State> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'countCriteria' @ [34:45] ==> val countCriteria: QueryCriteria.VaultCustomQueryCriteria<VaultSchemaV1.VaultStates> defined in net.corda.traderdemo.TraderDemoClientApi.<get-cashCount>[LocalVariableDescriptor]

'otherResults' @ [34:60] ==> public final val otherResults: List<Any> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'single' @ [34:73] ==> public fun <T> List<Any>.single(): Any defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'rpc' @ [37:53] ==> public final val rpc: CordaRPCOps defined in net.corda.traderdemo.TraderDemoClientApi[PropertyDescriptorImpl]

'getCashBalance' @ [37:57] ==> public fun CordaRPCOps.getCashBalance(currency: Currency): Amount<Currency> defined in net.corda.finance.contracts[DeserializedSimpleFunctionDescriptor]

'USD' @ [37:72] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'builder' @ [40:21] ==> public inline fun <A> builder(block: Builder.() -> CriteriaExpression.AggregateFunctionExpression<VaultSchemaV1.VaultStates, Instant>): CriteriaExpression.AggregateFunctionExpression<VaultSchemaV1.VaultStates, Instant> defined in net.corda.core.node.services.vault[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> AggregateFunctionExpression<VaultStates, Instant>

'VaultSchemaV1' @ [40:31] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [40:45] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'recordedTime' @ [40:58] ==> @field:Column public final var recordedTime: Instant defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'count' @ [40:71] ==> public final fun <O, R> KProperty1<VaultSchemaV1.VaultStates, Instant?>.count(): CriteriaExpression.AggregateFunctionExpression<VaultSchemaV1.VaultStates, Instant> defined in net.corda.core.node.services.vault.Builder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> VaultStates
    <R> -> Instant

'VaultCustomQueryCriteria' @ [41:43] ==> @JvmOverloads public constructor VaultCustomQueryCriteria<L : PersistentState>(expression: CriteriaExpression<VaultSchemaV1.VaultStates, Boolean>, status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultCustomQueryCriteria[DeserializedClassConstructorDescriptor]
Inferred types:
    <L : PersistentState> -> VaultStates

'count' @ [41:68] ==> val count: CriteriaExpression.AggregateFunctionExpression<VaultSchemaV1.VaultStates, Instant> defined in net.corda.traderdemo.TraderDemoClientApi.<get-commercialPaperCount>[LocalVariableDescriptor]

'rpc' @ [42:16] ==> public final val rpc: CordaRPCOps defined in net.corda.traderdemo.TraderDemoClientApi[PropertyDescriptorImpl]

'vaultQueryBy' @ [42:20] ==> public inline fun <reified T : ContractState> CordaRPCOps.vaultQueryBy(criteria: QueryCriteria = ..., paging: PageSpecification = ..., sorting: Sort = ...): Vault.Page<CommercialPaper.State> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'countCriteria' @ [42:56] ==> val countCriteria: QueryCriteria.VaultCustomQueryCriteria<VaultSchemaV1.VaultStates> defined in net.corda.traderdemo.TraderDemoClientApi.<get-commercialPaperCount>[LocalVariableDescriptor]

'otherResults' @ [42:71] ==> public final val otherResults: List<Any> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'single' @ [42:84] ==> public fun <T> List<Any>.single(): Any defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'OpaqueBytes' @ [46:19] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [46:31] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'rpc' @ [47:21] ==> public final val rpc: CordaRPCOps defined in net.corda.traderdemo.TraderDemoClientApi[PropertyDescriptorImpl]

'partyFromX500Name' @ [47:25] ==> public abstract fun partyFromX500Name(x500Name: X500Name): Party? defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'buyerName' @ [47:43] ==> value-parameter buyerName: X500Name defined in net.corda.traderdemo.TraderDemoClientApi.runIssuer[ValueParameterDescriptorImpl]

'IllegalStateException' @ [47:63] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'buyerName' @ [47:98] ==> value-parameter buyerName: X500Name defined in net.corda.traderdemo.TraderDemoClientApi.runIssuer[ValueParameterDescriptorImpl]

'rpc' @ [48:22] ==> public final val rpc: CordaRPCOps defined in net.corda.traderdemo.TraderDemoClientApi[PropertyDescriptorImpl]

'partyFromX500Name' @ [48:26] ==> public abstract fun partyFromX500Name(x500Name: X500Name): Party? defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'sellerName' @ [48:44] ==> value-parameter sellerName: X500Name defined in net.corda.traderdemo.TraderDemoClientApi.runIssuer[ValueParameterDescriptorImpl]

'IllegalStateException' @ [48:65] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'sellerName' @ [48:100] ==> value-parameter sellerName: X500Name defined in net.corda.traderdemo.TraderDemoClientApi.runIssuer[ValueParameterDescriptorImpl]

'rpc' @ [49:35] ==> public final val rpc: CordaRPCOps defined in net.corda.traderdemo.TraderDemoClientApi[PropertyDescriptorImpl]

'partyFromX500Name' @ [49:39] ==> public abstract fun partyFromX500Name(x500Name: X500Name): Party? defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'DUMMY_NOTARY' @ [49:57] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [49:70] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'IllegalStateException' @ [50:26] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'DUMMY_NOTARY' @ [50:68] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [50:81] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'rpc' @ [51:26] ==> public final val rpc: CordaRPCOps defined in net.corda.traderdemo.TraderDemoClientApi[PropertyDescriptorImpl]

'nodeIdentityFromParty' @ [51:30] ==> public abstract fun nodeIdentityFromParty(party: AbstractParty): NodeInfo? defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'notaryLegalIdentity' @ [51:52] ==> val notaryLegalIdentity: Party defined in net.corda.traderdemo.TraderDemoClientApi.runIssuer[LocalVariableDescriptor]

'IllegalStateException' @ [52:26] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'calculateRandomlySizedAmounts' @ [53:23] ==> public fun calculateRandomlySizedAmounts(howMuch: Amount<Currency>, min: Int, max: Int, rng: Random): LongArray defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'amount' @ [53:53] ==> value-parameter amount: Amount<Currency> defined in net.corda.traderdemo.TraderDemoClientApi.runIssuer[ValueParameterDescriptorImpl]

'Random' @ [53:68] ==> public constructor Random() defined in java.util.Random[JavaClassConstructorDescriptor]

'rpc' @ [55:9] ==> public final val rpc: CordaRPCOps defined in net.corda.traderdemo.TraderDemoClientApi[PropertyDescriptorImpl]

'startFlow' @ [55:13] ==> public inline fun <T : Any, A, B, C, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (Amount<Currency>, OpaqueBytes, Party) -> CashIssueFlow, arg0: Amount<Currency>, arg1: OpaqueBytes, arg2: Party): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> Amount<Currency>
    <B> -> OpaqueBytes
    <C> -> Party
    <reified R : FlowLogic<T>> -> CashIssueFlow

'CashIssueFlow' @ [55:25] ==> public constructor CashIssueFlow(amount: Amount<Currency>, issuerBankPartyRef: OpaqueBytes, notary: Party) defined in net.corda.finance.flows.CashIssueFlow[DeserializedClassConstructorDescriptor]

'amount' @ [55:40] ==> value-parameter amount: Amount<Currency> defined in net.corda.traderdemo.TraderDemoClientApi.runIssuer[ValueParameterDescriptorImpl]

'of' @ [55:60] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [55:67] ==> val notaryNode: NodeInfo defined in net.corda.traderdemo.TraderDemoClientApi.runIssuer[LocalVariableDescriptor]

'notaryIdentity' @ [55:78] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'returnValue' @ [55:94] ==> public abstract val returnValue: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'getOrThrow' @ [55:106] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'amounts' @ [57:9] ==> val amounts: LongArray defined in net.corda.traderdemo.TraderDemoClientApi.runIssuer[LocalVariableDescriptor]

'forEach' @ [57:17] ==> public inline fun LongArray.forEach(action: (Long) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'rpc' @ [59:13] ==> public final val rpc: CordaRPCOps defined in net.corda.traderdemo.TraderDemoClientApi[PropertyDescriptorImpl]

'startFlow' @ [59:17] ==> public inline fun <T : Any, A, B, C, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (Amount<Currency>, Party, Boolean) -> CashPaymentFlow, arg0: Amount<Currency>, arg1: Party, arg2: Boolean): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> Amount<Currency>
    <B> -> Party
    <C> -> Boolean
    <reified R : FlowLogic<T>> -> CashPaymentFlow

'CashPaymentFlow' @ [59:29] ==> public constructor CashPaymentFlow(amount: Amount<Currency>, recipient: Party, anonymous: Boolean) defined in net.corda.finance.flows.CashPaymentFlow[DeserializedClassConstructorDescriptor]

'amount' @ [59:46] ==> value-parameter amount: Amount<Currency> defined in net.corda.traderdemo.TraderDemoClientApi.runIssuer[ValueParameterDescriptorImpl]

'copy' @ [59:53] ==> public final fun copy(quantity: Long = ..., displayTokenSize: BigDecimal = ..., token: Currency = ...): Amount<Currency> defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'pennies' @ [59:69] ==> value-parameter pennies: Long defined in net.corda.traderdemo.TraderDemoClientApi.runIssuer.<anonymous>[ValueParameterDescriptorImpl]

'buyer' @ [59:79] ==> val buyer: Party defined in net.corda.traderdemo.TraderDemoClientApi.runIssuer[LocalVariableDescriptor]

'anonymous' @ [59:86] ==> val anonymous: Boolean defined in net.corda.traderdemo.TraderDemoClientApi.runIssuer[LocalVariableDescriptor]

'returnValue' @ [59:97] ==> public abstract val returnValue: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'getOrThrow' @ [59:109] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'println' @ [61:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'!' @ [67:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'rpc' @ [67:14] ==> public final val rpc: CordaRPCOps defined in net.corda.traderdemo.TraderDemoClientApi[PropertyDescriptorImpl]

'attachmentExists' @ [67:18] ==> public abstract fun attachmentExists(id: SecureHash): Boolean defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'PROSPECTUS_HASH' @ [67:46] ==> public final val PROSPECTUS_HASH: SecureHash.SHA256 defined in net.corda.traderdemo.flow.SellerFlow.Companion[PropertyDescriptorImpl]

'javaClass' @ [68:13] ==> public val <T : Any> TraderDemoClientApi.javaClass: Class<TraderDemoClientApi> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> TraderDemoClientApi

'classLoader' @ [68:23] ==> public final val <T : (Any..Any?)> Class<TraderDemoClientApi>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TraderDemoClientApi

'getResourceAsStream' @ [68:35] ==> public open fun getResourceAsStream(p0: (String..String?)): (InputStream..InputStream?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'use' @ [68:80] ==> @InlineOnly public inline fun <T : Closeable?, R> (InputStream..InputStream?).use(block: ((InputStream..InputStream?)) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> (java.io.InputStream..java.io.InputStream?)
    <R> -> Unit

'rpc' @ [69:26] ==> public final val rpc: CordaRPCOps defined in net.corda.traderdemo.TraderDemoClientApi[PropertyDescriptorImpl]

'uploadAttachment' @ [69:30] ==> public abstract fun uploadAttachment(jar: InputStream): SecureHash defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'it' @ [69:47] ==> value-parameter it: (InputStream..InputStream?) defined in net.corda.traderdemo.TraderDemoClientApi.runIssuer.<anonymous>[ValueParameterDescriptorImpl]

'check' @ [70:17] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'SellerFlow' @ [70:23] ==> public companion object defined in net.corda.traderdemo.flow.SellerFlow[FakeCallableDescriptorForObject]

'PROSPECTUS_HASH' @ [70:34] ==> public final val PROSPECTUS_HASH: SecureHash.SHA256 defined in net.corda.traderdemo.flow.SellerFlow.Companion[PropertyDescriptorImpl]

'id' @ [70:53] ==> val id: SecureHash defined in net.corda.traderdemo.TraderDemoClientApi.runIssuer.<anonymous>[LocalVariableDescriptor]

'rpc' @ [75:9] ==> public final val rpc: CordaRPCOps defined in net.corda.traderdemo.TraderDemoClientApi[PropertyDescriptorImpl]

'startFlow' @ [75:13] ==> public inline fun <T : Any, A, B, C, D, reified R : FlowLogic<SignedTransaction>> CordaRPCOps.startFlow(flowConstructor: (Amount<Currency>, OpaqueBytes, Party, Party) -> CommercialPaperIssueFlow, arg0: Amount<Currency>, arg1: OpaqueBytes, arg2: Party, arg3: Party): FlowHandle<SignedTransaction> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SignedTransaction
    <A> -> Amount<Currency>
    <B> -> OpaqueBytes
    <C> -> Party
    <D> -> Party
    <reified R : FlowLogic<T>> -> CommercialPaperIssueFlow

'CommercialPaperIssueFlow' @ [75:25] ==> public constructor CommercialPaperIssueFlow(amount: Amount<Currency>, issueRef: OpaqueBytes, recipient: Party, notary: Party) defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow[ClassConstructorDescriptorImpl]

'amount' @ [75:51] ==> value-parameter amount: Amount<Currency> defined in net.corda.traderdemo.TraderDemoClientApi.runIssuer[ValueParameterDescriptorImpl]

'ref' @ [75:59] ==> val ref: OpaqueBytes defined in net.corda.traderdemo.TraderDemoClientApi.runIssuer[LocalVariableDescriptor]

'seller' @ [75:64] ==> val seller: Party defined in net.corda.traderdemo.TraderDemoClientApi.runIssuer[LocalVariableDescriptor]

'notaryNode' @ [75:72] ==> val notaryNode: NodeInfo defined in net.corda.traderdemo.TraderDemoClientApi.runIssuer[LocalVariableDescriptor]

'notaryIdentity' @ [75:83] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'returnValue' @ [75:99] ==> public abstract val returnValue: CordaFuture<SignedTransaction> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'getOrThrow' @ [75:111] ==> public fun <V> Future<SignedTransaction>.getOrThrow(timeout: Duration? = ...): SignedTransaction defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> SignedTransaction

'println' @ [76:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [79:53] ==> public val Double.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'rpc' @ [80:26] ==> public final val rpc: CordaRPCOps defined in net.corda.traderdemo.TraderDemoClientApi[PropertyDescriptorImpl]

'partyFromX500Name' @ [80:30] ==> public abstract fun partyFromX500Name(x500Name: X500Name): Party? defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'buyerName' @ [80:48] ==> value-parameter buyerName: X500Name defined in net.corda.traderdemo.TraderDemoClientApi.runSeller[ValueParameterDescriptorImpl]

'IllegalStateException' @ [80:68] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'buyerName' @ [80:103] ==> value-parameter buyerName: X500Name defined in net.corda.traderdemo.TraderDemoClientApi.runSeller[ValueParameterDescriptorImpl]

'!' @ [87:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'rpc' @ [87:14] ==> public final val rpc: CordaRPCOps defined in net.corda.traderdemo.TraderDemoClientApi[PropertyDescriptorImpl]

'attachmentExists' @ [87:18] ==> public abstract fun attachmentExists(id: SecureHash): Boolean defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'PROSPECTUS_HASH' @ [87:46] ==> public final val PROSPECTUS_HASH: SecureHash.SHA256 defined in net.corda.traderdemo.flow.SellerFlow.Companion[PropertyDescriptorImpl]

'javaClass' @ [88:13] ==> public val <T : Any> TraderDemoClientApi.javaClass: Class<TraderDemoClientApi> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> TraderDemoClientApi

'classLoader' @ [88:23] ==> public final val <T : (Any..Any?)> Class<TraderDemoClientApi>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TraderDemoClientApi

'getResourceAsStream' @ [88:35] ==> public open fun getResourceAsStream(p0: (String..String?)): (InputStream..InputStream?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'use' @ [88:80] ==> @InlineOnly public inline fun <T : Closeable?, R> (InputStream..InputStream?).use(block: ((InputStream..InputStream?)) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> (java.io.InputStream..java.io.InputStream?)
    <R> -> Unit

'rpc' @ [89:26] ==> public final val rpc: CordaRPCOps defined in net.corda.traderdemo.TraderDemoClientApi[PropertyDescriptorImpl]

'uploadAttachment' @ [89:30] ==> public abstract fun uploadAttachment(jar: InputStream): SecureHash defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'it' @ [89:47] ==> value-parameter it: (InputStream..InputStream?) defined in net.corda.traderdemo.TraderDemoClientApi.runSeller.<anonymous>[ValueParameterDescriptorImpl]

'check' @ [90:17] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'SellerFlow' @ [90:23] ==> public companion object defined in net.corda.traderdemo.flow.SellerFlow[FakeCallableDescriptorForObject]

'PROSPECTUS_HASH' @ [90:34] ==> public final val PROSPECTUS_HASH: SecureHash.SHA256 defined in net.corda.traderdemo.flow.SellerFlow.Companion[PropertyDescriptorImpl]

'id' @ [90:53] ==> val id: SecureHash defined in net.corda.traderdemo.TraderDemoClientApi.runSeller.<anonymous>[LocalVariableDescriptor]

'rpc' @ [95:19] ==> public final val rpc: CordaRPCOps defined in net.corda.traderdemo.TraderDemoClientApi[PropertyDescriptorImpl]

'startFlow' @ [95:23] ==> public inline fun <T : Any, A, B, reified R : FlowLogic<SignedTransaction>> CordaRPCOps.startFlow(flowConstructor: (Party, Amount<Currency>) -> SellerFlow, arg0: Party, arg1: Amount<Currency>): FlowHandle<SignedTransaction> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SignedTransaction
    <A> -> Party
    <B> -> Amount<Currency>
    <reified R : FlowLogic<T>> -> SellerFlow

'SellerFlow' @ [95:35] ==> public constructor SellerFlow(otherParty: Party, amount: Amount<Currency>) defined in net.corda.traderdemo.flow.SellerFlow[ClassConstructorDescriptorImpl]

'otherParty' @ [95:47] ==> val otherParty: Party defined in net.corda.traderdemo.TraderDemoClientApi.runSeller[LocalVariableDescriptor]

'amount' @ [95:59] ==> value-parameter amount: Amount<Currency> = ... defined in net.corda.traderdemo.TraderDemoClientApi.runSeller[ValueParameterDescriptorImpl]

'returnValue' @ [95:67] ==> public abstract val returnValue: CordaFuture<SignedTransaction> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'getOrThrow' @ [95:79] ==> public fun <V> Future<SignedTransaction>.getOrThrow(timeout: Duration? = ...): SignedTransaction defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> SignedTransaction

'println' @ [96:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Emoji' @ [96:91] ==> public object Emoji defined in net.corda.core.internal[FakeCallableDescriptorForObject]

'renderIfSupported' @ [96:97] ==> public final fun renderIfSupported(obj: Any): String defined in net.corda.core.internal.Emoji[DeserializedSimpleFunctionDescriptor]

'stx' @ [96:115] ==> val stx: SignedTransaction defined in net.corda.traderdemo.TraderDemoClientApi.runSeller[LocalVariableDescriptor]

'tx' @ [96:119] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

