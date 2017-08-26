'NetworkHostAndPort' @ [20:19] ==> public constructor NetworkHostAndPort(host: String, port: Int) defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedClassConstructorDescriptor]

'println' @ [21:5] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'address' @ [21:49] ==> val address: NetworkHostAndPort defined in net.corda.notarydemo.main[LocalVariableDescriptor]

'CordaRPCClient' @ [22:5] ==> public constructor CordaRPCClient(hostAndPort: NetworkHostAndPort, sslConfiguration: SSLConfiguration? = ..., configuration: CordaRPCClientConfiguration = ..., initialiseSerialization: Boolean = ...) defined in net.corda.client.rpc.CordaRPCClient[DeserializedClassConstructorDescriptor]

'address' @ [22:20] ==> val address: NetworkHostAndPort defined in net.corda.notarydemo.main[LocalVariableDescriptor]

'start' @ [22:29] ==> public final fun start(username: String, password: String): CordaRPCConnection defined in net.corda.client.rpc.CordaRPCClient[DeserializedSimpleFunctionDescriptor]

'notaryDemoUser' @ [22:35] ==> public val notaryDemoUser: User defined in net.corda.notarydemo in file SingleNotaryCordform.kt[PropertyDescriptorImpl]

'username' @ [22:50] ==> @OldConfig public final val username: String defined in net.corda.nodeapi.User[DeserializedPropertyDescriptor]

'notaryDemoUser' @ [22:60] ==> public val notaryDemoUser: User defined in net.corda.notarydemo in file SingleNotaryCordform.kt[PropertyDescriptorImpl]

'password' @ [22:75] ==> public final val password: String defined in net.corda.nodeapi.User[DeserializedPropertyDescriptor]

'use' @ [22:85] ==> @InlineOnly public inline fun <T : Closeable?, R> CordaRPCConnection.use(block: (CordaRPCConnection) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> CordaRPCConnection
    <R> -> Unit

'NotaryDemoClientApi' @ [23:9] ==> public constructor NotaryDemoClientApi(rpc: CordaRPCOps) defined in net.corda.notarydemo.NotaryDemoClientApi[ClassConstructorDescriptorImpl]

'it' @ [23:29] ==> value-parameter it: CordaRPCConnection defined in net.corda.notarydemo.main.<anonymous>[ValueParameterDescriptorImpl]

'proxy' @ [23:32] ==> public open val proxy: CordaRPCOps defined in net.corda.client.rpc.CordaRPCConnection[DeserializedPropertyDescriptor]

'notarise' @ [23:39] ==> public final fun notarise(count: Int): Unit defined in net.corda.notarydemo.NotaryDemoClientApi[SimpleFunctionDescriptorImpl]

'getValue' @ [29:27] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'rpc' @ [30:23] ==> public final val rpc: CordaRPCOps defined in net.corda.notarydemo.NotaryDemoClientApi[PropertyDescriptorImpl]

'networkMapSnapshot' @ [30:27] ==> public abstract fun networkMapSnapshot(): List<NodeInfo> defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'parties' @ [31:18] ==> val parties: List<NodeInfo> defined in net.corda.notarydemo.NotaryDemoClientApi.notary.<anonymous>[LocalVariableDescriptor]

'stream' @ [31:26] ==> public open fun stream(): Stream<NodeInfo> defined in kotlin.collections.List[JavaMethodDescriptor]

'filter' @ [31:35] ==> public final fun filter(p0: (((NodeInfo..NodeInfo?)) -> Boolean..(((NodeInfo..NodeInfo?)) -> Boolean)?)): (Stream<(NodeInfo..NodeInfo?)>..Stream<(NodeInfo..NodeInfo?)>?) defined in java.util.stream.Stream[MyFunctionDescriptor]

'it' @ [31:44] ==> value-parameter it: (NodeInfo..NodeInfo?) defined in net.corda.notarydemo.NotaryDemoClientApi.notary.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'advertisedServices' @ [31:47] ==> public final val advertisedServices: List<ServiceEntry> defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'any' @ [31:66] ==> public inline fun <T> Iterable<ServiceEntry>.any(predicate: (ServiceEntry) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry

'it' @ [31:72] ==> value-parameter it: ServiceEntry defined in net.corda.notarydemo.NotaryDemoClientApi.notary.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [31:75] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[DeserializedPropertyDescriptor]

'type' @ [31:80] ==> public final val type: ServiceType defined in net.corda.core.node.services.ServiceInfo[DeserializedPropertyDescriptor]

'isNotary' @ [31:85] ==> public final fun isNotary(): Boolean defined in net.corda.core.node.services.ServiceType[DeserializedSimpleFunctionDescriptor]

'map' @ [31:100] ==> public final fun <R : (Any..Any?)> map(p0: (((NodeInfo..NodeInfo?)) -> (Party..Party?)..(((NodeInfo..NodeInfo?)) -> (Party..Party?))?)): (Stream<(Party..Party?)>..Stream<(Party..Party?)>?) defined in java.util.stream.Stream[MyFunctionDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (net.corda.core.identity.Party..net.corda.core.identity.Party?)

'it' @ [31:106] ==> value-parameter it: (NodeInfo..NodeInfo?) defined in net.corda.notarydemo.NotaryDemoClientApi.notary.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'notaryIdentity' @ [31:109] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'distinct' @ [31:126] ==> public abstract fun distinct(): (Stream<(Party..Party?)>..Stream<(Party..Party?)>?) defined in java.util.stream.Stream[JavaMethodDescriptor]

'asSequence' @ [31:137] ==> @SinceKotlin public fun <T> Stream<(Party..Party?)>.asSequence(): Sequence<(Party..Party?)> defined in kotlin.streams[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.core.identity.Party..net.corda.core.identity.Party?)

'singleOrNull' @ [31:150] ==> public fun <T> Sequence<(Party..Party?)>.singleOrNull(): Party? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.core.identity.Party..net.corda.core.identity.Party?)

'checkNotNull' @ [32:9] ==> @InlineOnly public inline fun <T : Any> checkNotNull(value: Party?, lazyMessage: () -> Any): Party defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Party

'id' @ [32:22] ==> val id: Party? defined in net.corda.notarydemo.NotaryDemoClientApi.notary.<anonymous>[LocalVariableDescriptor]

'getValue' @ [35:37] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'rpc' @ [36:23] ==> public final val rpc: CordaRPCOps defined in net.corda.notarydemo.NotaryDemoClientApi[PropertyDescriptorImpl]

'networkMapSnapshot' @ [36:27] ==> public abstract fun networkMapSnapshot(): List<NodeInfo> defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'parties' @ [37:9] ==> val parties: List<NodeInfo> defined in net.corda.notarydemo.NotaryDemoClientApi.counterpartyNode.<anonymous>[LocalVariableDescriptor]

'single' @ [37:17] ==> public inline fun <T> Iterable<NodeInfo>.single(predicate: (NodeInfo) -> Boolean): NodeInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'it' @ [37:26] ==> value-parameter it: NodeInfo defined in net.corda.notarydemo.NotaryDemoClientApi.counterpartyNode.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'legalIdentity' @ [37:29] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'name' @ [37:43] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'BOB' @ [37:51] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [37:55] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'println' @ [42:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'notary' @ [42:30] ==> private final val notary: Party defined in net.corda.notarydemo.NotaryDemoClientApi[PropertyDescriptorImpl]

'name' @ [42:37] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'notary' @ [42:68] ==> private final val notary: Party defined in net.corda.notarydemo.NotaryDemoClientApi[PropertyDescriptorImpl]

'owningKey' @ [42:75] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'toStringShort' @ [42:85] ==> public fun PublicKey.toStringShort(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'buildTransactions' @ [43:28] ==> private final fun buildTransactions(count: Int): List<SignedTransaction> defined in net.corda.notarydemo.NotaryDemoClientApi[SimpleFunctionDescriptorImpl]

'count' @ [43:46] ==> value-parameter count: Int defined in net.corda.notarydemo.NotaryDemoClientApi.notarise[ValueParameterDescriptorImpl]

'println' @ [44:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'transactions' @ [44:30] ==> val transactions: List<SignedTransaction> defined in net.corda.notarydemo.NotaryDemoClientApi.notarise[LocalVariableDescriptor]

'size' @ [44:43] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'transactions' @ [45:9] ==> val transactions: List<SignedTransaction> defined in net.corda.notarydemo.NotaryDemoClientApi.notarise[LocalVariableDescriptor]

'zip' @ [45:22] ==> public infix fun <T, R> Iterable<SignedTransaction>.zip(other: Iterable<CordaFuture<List<String>>>): List<Pair<SignedTransaction, CordaFuture<List<String>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <R> -> CordaFuture<List<String>>

'notariseTransactions' @ [45:26] ==> private final fun notariseTransactions(transactions: List<SignedTransaction>): List<CordaFuture<List<String>>> defined in net.corda.notarydemo.NotaryDemoClientApi[SimpleFunctionDescriptorImpl]

'transactions' @ [45:47] ==> val transactions: List<SignedTransaction> defined in net.corda.notarydemo.NotaryDemoClientApi.notarise[LocalVariableDescriptor]

'forEach' @ [45:62] ==> @HidesMembers public inline fun <T> Iterable<Pair<SignedTransaction, CordaFuture<List<String>>>>.forEach(action: (Pair<SignedTransaction, CordaFuture<List<String>>>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<SignedTransaction, CordaFuture<List<String>>>

'component1' @ [45:73] ==> public final operator fun component1(): SignedTransaction defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [45:77] ==> public final operator fun component2(): CordaFuture<List<String>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'println' @ [46:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'tx' @ [46:28] ==> val tx: SignedTransaction defined in net.corda.notarydemo.NotaryDemoClientApi.notarise.<anonymous>[LocalVariableDescriptor]

'tx' @ [46:31] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'id' @ [46:34] ==> public open val id: SecureHash defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'prefixChars' @ [46:37] ==> public final fun prefixChars(prefixLen: Int = ...): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'signersFuture' @ [46:67] ==> val signersFuture: CordaFuture<List<String>> defined in net.corda.notarydemo.NotaryDemoClientApi.notarise.<anonymous>[LocalVariableDescriptor]

'getOrThrow' @ [46:81] ==> public fun <V> Future<List<String>>.getOrThrow(timeout: Duration? = ...): List<String> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<String>

'joinToString' @ [46:94] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'..' @ [56:17] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'count' @ [56:20] ==> value-parameter count: Int defined in net.corda.notarydemo.NotaryDemoClientApi.buildTransactions[ValueParameterDescriptorImpl]

'map' @ [56:27] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> CordaFuture<SignedTransaction>): List<CordaFuture<SignedTransaction>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> CordaFuture<SignedTransaction>

'rpc' @ [57:13] ==> public final val rpc: CordaRPCOps defined in net.corda.notarydemo.NotaryDemoClientApi[PropertyDescriptorImpl]

'startFlow' @ [57:17] ==> public inline fun <T : Any, A, B, C, reified R : FlowLogic<SignedTransaction>> CordaRPCOps.startFlow(flowConstructor: (Party, Party, Int) -> DummyIssueAndMove, arg0: Party, arg1: Party, arg2: Int): FlowHandle<SignedTransaction> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SignedTransaction
    <A> -> Party
    <B> -> Party
    <C> -> Int
    <reified R : FlowLogic<T>> -> DummyIssueAndMove

'DummyIssueAndMove' @ [57:29] ==> public constructor DummyIssueAndMove(notary: Party, counterpartyNode: Party, discriminator: Int) defined in net.corda.notarydemo.flows.DummyIssueAndMove[ClassConstructorDescriptorImpl]

'notary' @ [57:48] ==> private final val notary: Party defined in net.corda.notarydemo.NotaryDemoClientApi[PropertyDescriptorImpl]

'counterpartyNode' @ [57:56] ==> private final val counterpartyNode: NodeInfo defined in net.corda.notarydemo.NotaryDemoClientApi[PropertyDescriptorImpl]

'legalIdentity' @ [57:73] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'it' @ [57:88] ==> value-parameter it: Int defined in net.corda.notarydemo.NotaryDemoClientApi.buildTransactions.<anonymous>[ValueParameterDescriptorImpl]

'returnValue' @ [57:92] ==> public abstract val returnValue: CordaFuture<SignedTransaction> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'transpose' @ [58:11] ==> public fun <V> Collection<CordaFuture<out SignedTransaction>>.transpose(): CordaFuture<List<SignedTransaction>> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> SignedTransaction

'getOrThrow' @ [58:23] ==> public fun <V> Future<List<SignedTransaction>>.getOrThrow(timeout: Duration? = ...): List<SignedTransaction> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<SignedTransaction>

'transactions' @ [68:16] ==> value-parameter transactions: List<SignedTransaction> defined in net.corda.notarydemo.NotaryDemoClientApi.notariseTransactions[ValueParameterDescriptorImpl]

'map' @ [68:29] ==> public inline fun <T, R> Iterable<SignedTransaction>.map(transform: (SignedTransaction) -> CordaFuture<List<String>>): List<CordaFuture<List<String>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <R> -> CordaFuture<List<String>>

'rpc' @ [69:13] ==> public final val rpc: CordaRPCOps defined in net.corda.notarydemo.NotaryDemoClientApi[PropertyDescriptorImpl]

'startFlow' @ [69:17] ==> public inline fun <T : Any, A, reified R : FlowLogic<List<TransactionSignature>>> CordaRPCOps.startFlow(flowConstructor: (SignedTransaction) -> RPCStartableNotaryFlowClient, arg0: SignedTransaction): FlowHandle<List<TransactionSignature>> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> List<TransactionSignature>
    <A> -> SignedTransaction
    <reified R : FlowLogic<T>> -> RPCStartableNotaryFlowClient

'RPCStartableNotaryFlowClient' @ [69:29] ==> public constructor RPCStartableNotaryFlowClient(stx: SignedTransaction) defined in net.corda.notarydemo.flows.RPCStartableNotaryFlowClient[ClassConstructorDescriptorImpl]

'it' @ [69:59] ==> value-parameter it: SignedTransaction defined in net.corda.notarydemo.NotaryDemoClientApi.notariseTransactions.<anonymous>[ValueParameterDescriptorImpl]

'returnValue' @ [69:63] ==> public abstract val returnValue: CordaFuture<List<TransactionSignature>> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'map' @ [69:75] ==> public fun <V, W> CordaFuture<out List<TransactionSignature>>.map(transform: (List<TransactionSignature>) -> List<String>): CordaFuture<List<String>> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<TransactionSignature>
    <W> -> List<String>

'it' @ [69:81] ==> value-parameter it: List<TransactionSignature> defined in net.corda.notarydemo.NotaryDemoClientApi.notariseTransactions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [69:84] ==> public inline fun <T, R> Iterable<TransactionSignature>.map(transform: (TransactionSignature) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature
    <R> -> String

'it' @ [69:90] ==> value-parameter it: TransactionSignature defined in net.corda.notarydemo.NotaryDemoClientApi.notariseTransactions.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'by' @ [69:93] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[DeserializedPropertyDescriptor]

'toStringShort' @ [69:96] ==> public fun PublicKey.toStringShort(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

