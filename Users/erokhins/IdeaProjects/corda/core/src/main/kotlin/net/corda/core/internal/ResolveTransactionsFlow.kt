'FlowLogic<List<SignedTransaction>>' @ [20:63] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> List<SignedTransaction>

'this' @ [27:75] ==> public constructor ResolveTransactionsFlow(txHashes: Set<SecureHash>, otherSide: Party) defined in net.corda.core.internal.ResolveTransactionsFlow[ClassConstructorDescriptorImpl]

'dependencyIDs' @ [27:80] ==> private final fun dependencyIDs(stx: SignedTransaction): Set<SecureHash> defined in net.corda.core.internal.ResolveTransactionsFlow.Companion[SimpleFunctionDescriptorImpl]

'signedTransaction' @ [27:94] ==> value-parameter signedTransaction: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlow.<init>[ValueParameterDescriptorImpl]

'otherSide' @ [27:114] ==> value-parameter otherSide: Party defined in net.corda.core.internal.ResolveTransactionsFlow.<init>[ValueParameterDescriptorImpl]

'this' @ [28:9] ==> <this> defined in net.corda.core.internal.ResolveTransactionsFlow[LazyClassReceiverParameterDescriptor]

'signedTransaction' @ [28:14] ==> private final var signedTransaction: SignedTransaction? defined in net.corda.core.internal.ResolveTransactionsFlow[PropertyDescriptorImpl]

'signedTransaction' @ [28:34] ==> value-parameter signedTransaction: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlow.<init>[ValueParameterDescriptorImpl]

'stx' @ [31:61] ==> value-parameter stx: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.dependencyIDs[ValueParameterDescriptorImpl]

'inputs' @ [31:65] ==> public final val inputs: List<StateRef> defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'map' @ [31:72] ==> public inline fun <T, R> Iterable<StateRef>.map(transform: (StateRef) -> SecureHash): List<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef
    <R> -> SecureHash

'it' @ [31:78] ==> value-parameter it: StateRef defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.dependencyIDs.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [31:81] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'toSet' @ [31:90] ==> public fun <T> Iterable<SecureHash>.toSet(): Set<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'JvmStatic' @ [35:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'HashMap' @ [38:32] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> SecureHash
    <V : (Any..Any?)> -> HashSet<SignedTransaction>

'transactions' @ [39:13] ==> value-parameter transactions: Collection<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.topologicalSort[ValueParameterDescriptorImpl]

'forEach' @ [39:26] ==> @HidesMembers public inline fun <T> Iterable<SignedTransaction>.forEach(action: (SignedTransaction) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'stx' @ [40:17] ==> value-parameter stx: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.topologicalSort.<anonymous>[ValueParameterDescriptorImpl]

'inputs' @ [40:21] ==> public final val inputs: List<StateRef> defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'forEach' @ [40:28] ==> @HidesMembers public inline fun <T> Iterable<StateRef>.forEach(action: (StateRef) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'component1' @ [40:39] ==> public final operator fun component1(): SecureHash defined in net.corda.core.contracts.StateRef[SimpleFunctionDescriptorImpl]

'forwardGraph' @ [42:21] ==> val forwardGraph: HashMap<SecureHash, HashSet<SignedTransaction>> defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.topologicalSort[LocalVariableDescriptor]

'getOrPut' @ [42:34] ==> public inline fun <K, V> MutableMap<SecureHash, HashSet<SignedTransaction>>.getOrPut(key: SecureHash, defaultValue: () -> HashSet<SignedTransaction>): HashSet<SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> SecureHash
    <V> -> HashSet<SignedTransaction>

'txhash' @ [42:43] ==> val txhash: SecureHash defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.topologicalSort.<anonymous>.<anonymous>[LocalVariableDescriptor]

'LinkedHashSet' @ [42:53] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> SignedTransaction

'add' @ [42:71] ==> public open fun add(element: SignedTransaction): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'stx' @ [42:75] ==> value-parameter stx: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.topologicalSort.<anonymous>[ValueParameterDescriptorImpl]

'HashSet' @ [46:27] ==> public constructor HashSet<E : (Any..Any?)>(p0: Int) defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> SecureHash

'transactions' @ [46:47] ==> value-parameter transactions: Collection<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.topologicalSort[ValueParameterDescriptorImpl]

'size' @ [46:60] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'ArrayList' @ [47:26] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> SignedTransaction

'transactions' @ [47:55] ==> value-parameter transactions: Collection<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.topologicalSort[ValueParameterDescriptorImpl]

'size' @ [47:68] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'transaction' @ [50:21] ==> value-parameter transaction: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.topologicalSort.visit[ValueParameterDescriptorImpl]

'id' @ [50:33] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'visited' @ [50:40] ==> val visited: HashSet<SecureHash> defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.topologicalSort[LocalVariableDescriptor]

'visited' @ [51:21] ==> val visited: HashSet<SecureHash> defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.topologicalSort[LocalVariableDescriptor]

'add' @ [51:29] ==> public open fun add(element: SecureHash): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'transaction' @ [51:33] ==> value-parameter transaction: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.topologicalSort.visit[ValueParameterDescriptorImpl]

'id' @ [51:45] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'forwardGraph' @ [52:21] ==> val forwardGraph: HashMap<SecureHash, HashSet<SignedTransaction>> defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.topologicalSort[LocalVariableDescriptor]

'transaction' @ [52:34] ==> value-parameter transaction: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.topologicalSort.visit[ValueParameterDescriptorImpl]

'id' @ [52:46] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'forEach' @ [52:51] ==> @HidesMembers public inline fun <T> Iterable<SignedTransaction>.forEach(action: (SignedTransaction) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'result' @ [53:21] ==> val result: ArrayList<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.topologicalSort[LocalVariableDescriptor]

'add' @ [53:28] ==> public open fun add(element: SignedTransaction): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'transaction' @ [53:32] ==> value-parameter transaction: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.topologicalSort.visit[ValueParameterDescriptorImpl]

'transactions' @ [57:13] ==> value-parameter transactions: Collection<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.topologicalSort[ValueParameterDescriptorImpl]

'forEach' @ [57:26] ==> @HidesMembers public inline fun <T> Iterable<SignedTransaction>.forEach(action: (SignedTransaction) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'result' @ [59:13] ==> val result: ArrayList<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.topologicalSort[LocalVariableDescriptor]

'reverse' @ [59:20] ==> public fun <T> MutableList<SignedTransaction>.reverse(): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'require' @ [60:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'result' @ [60:21] ==> val result: ArrayList<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.topologicalSort[LocalVariableDescriptor]

'size' @ [60:28] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'transactions' @ [60:36] ==> value-parameter transactions: Collection<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.topologicalSort[ValueParameterDescriptorImpl]

'size' @ [60:49] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'result' @ [61:20] ==> val result: ArrayList<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.Companion.topologicalSort[LocalVariableDescriptor]

'CordaSerializable' @ [65:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'Exception' @ [66:46] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'require' @ [75:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'value' @ [75:21] ==> value-parameter value: Int defined in net.corda.core.internal.ResolveTransactionsFlow.<set-transactionCountLimit>[ValueParameterDescriptorImpl]

'value' @ [75:36] ==> value-parameter value: Int defined in net.corda.core.internal.ResolveTransactionsFlow.<set-transactionCountLimit>[ValueParameterDescriptorImpl]

'field' @ [76:13] ==> var field: Int defined in net.corda.core.internal.ResolveTransactionsFlow.<set-transactionCountLimit>[SyntheticFieldDescriptor]

'value' @ [76:21] ==> value-parameter value: Int defined in net.corda.core.internal.ResolveTransactionsFlow.<set-transactionCountLimit>[ValueParameterDescriptorImpl]

'Suspendable' @ [79:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Throws' @ [80:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'HashNotFound' @ [80:27] ==> public constructor HashNotFound(requested: SecureHash) defined in net.corda.core.internal.FetchDataFlow.HashNotFound[ClassConstructorDescriptorImpl]

'downloadDependencies' @ [83:23] ==> @Suspendable private final fun downloadDependencies(depsToCheck: Set<SecureHash>): List<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow[SimpleFunctionDescriptorImpl]

'txHashes' @ [83:44] ==> private final val txHashes: Set<SecureHash> defined in net.corda.core.internal.ResolveTransactionsFlow[PropertyDescriptorImpl]

'fetchMissingAttachments' @ [84:9] ==> @Suspendable private final fun fetchMissingAttachments(downloads: List<SignedTransaction>): Unit defined in net.corda.core.internal.ResolveTransactionsFlow[SimpleFunctionDescriptorImpl]

'signedTransaction' @ [84:33] ==> private final var signedTransaction: SignedTransaction? defined in net.corda.core.internal.ResolveTransactionsFlow[PropertyDescriptorImpl]

'let' @ [84:52] ==> @InlineOnly public inline fun <T, R> SignedTransaction.let(block: (SignedTransaction) -> List<SignedTransaction>): List<SignedTransaction> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <R> -> List<SignedTransaction>

'newTxns' @ [84:58] ==> val newTxns: List<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.call[LocalVariableDescriptor]

'it' @ [84:68] ==> value-parameter it: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'newTxns' @ [84:76] ==> val newTxns: List<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.call[LocalVariableDescriptor]

'send' @ [85:9] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.core.internal.ResolveTransactionsFlow[SimpleFunctionDescriptorImpl]

'otherSide' @ [85:14] ==> private final val otherSide: Party defined in net.corda.core.internal.ResolveTransactionsFlow[PropertyDescriptorImpl]

'End' @ [85:47] ==> public object End : FetchDataFlow.Request defined in net.corda.core.internal.FetchDataFlow.Request[FakeCallableDescriptorForObject]

'topologicalSort' @ [88:22] ==> @JvmStatic public final fun topologicalSort(transactions: Collection<SignedTransaction>): List<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.Companion[SimpleFunctionDescriptorImpl]

'newTxns' @ [88:38] ==> val newTxns: List<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.call[LocalVariableDescriptor]

'result' @ [89:9] ==> val result: List<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.call[LocalVariableDescriptor]

'forEach' @ [89:16] ==> @HidesMembers public inline fun <T> Iterable<SignedTransaction>.forEach(action: (SignedTransaction) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'it' @ [94:13] ==> value-parameter it: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'verify' @ [94:16] ==> @JvmOverloads @Throws public final fun verify(services: ServiceHub, checkSufficientSignatures: Boolean = ...): Unit defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'serviceHub' @ [94:23] ==> public final val serviceHub: ServiceHub defined in net.corda.core.internal.ResolveTransactionsFlow[PropertyDescriptorImpl]

'serviceHub' @ [95:13] ==> public final val serviceHub: ServiceHub defined in net.corda.core.internal.ResolveTransactionsFlow[PropertyDescriptorImpl]

'recordTransactions' @ [95:24] ==> public open fun recordTransactions(notifyVault: Boolean, first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'it' @ [95:50] ==> value-parameter it: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'signedTransaction' @ [98:16] ==> private final var signedTransaction: SignedTransaction? defined in net.corda.core.internal.ResolveTransactionsFlow[PropertyDescriptorImpl]

'let' @ [98:35] ==> @InlineOnly public inline fun <T, R> SignedTransaction.let(block: (SignedTransaction) -> List<SignedTransaction>): List<SignedTransaction> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <R> -> List<SignedTransaction>

'result' @ [99:13] ==> val result: List<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.call[LocalVariableDescriptor]

'it' @ [99:22] ==> value-parameter it: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [100:14] ==> val result: List<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.call[LocalVariableDescriptor]

'Suspendable' @ [103:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'LinkedHashSet' @ [121:28] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> SecureHash

'nextRequests' @ [122:9] ==> val nextRequests: LinkedHashSet<SecureHash> defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies[LocalVariableDescriptor]

'addAll' @ [122:22] ==> public open fun addAll(elements: Collection<SecureHash>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'depsToCheck' @ [122:29] ==> value-parameter depsToCheck: Set<SecureHash> defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies[ValueParameterDescriptorImpl]

'LinkedHashMap' @ [123:23] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> SecureHash
    <V : (Any..Any?)> -> SignedTransaction

'transactionCountLimit' @ [125:21] ==> public final var transactionCountLimit: Int defined in net.corda.core.internal.ResolveTransactionsFlow[PropertyDescriptorImpl]

'nextRequests' @ [127:16] ==> val nextRequests: LinkedHashSet<SecureHash> defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies[LocalVariableDescriptor]

'isNotEmpty' @ [127:29] ==> @InlineOnly public inline fun <T> Collection<SecureHash>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'nextRequests' @ [130:37] ==> val nextRequests: LinkedHashSet<SecureHash> defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies[LocalVariableDescriptor]

'filterNot' @ [130:50] ==> public inline fun <T> Iterable<SecureHash>.filterNot(predicate: (SecureHash) -> Boolean): List<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'it' @ [130:62] ==> value-parameter it: SecureHash defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies.<anonymous>[ValueParameterDescriptorImpl]

'resultQ' @ [130:68] ==> val resultQ: LinkedHashMap<SecureHash, SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies[LocalVariableDescriptor]

'toSet' @ [130:78] ==> public fun <T> Iterable<SecureHash>.toSet(): Set<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'nextRequests' @ [131:13] ==> val nextRequests: LinkedHashSet<SecureHash> defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies[LocalVariableDescriptor]

'clear' @ [131:26] ==> public open fun clear(): Unit defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'notAlreadyFetched' @ [133:17] ==> val notAlreadyFetched: Set<SecureHash> defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies[LocalVariableDescriptor]

'isEmpty' @ [133:35] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'subFlow' @ [137:54] ==> @Suspendable @Throws public open fun <R> subFlow(subLogic: FlowLogic<FetchDataFlow.Result<SignedTransaction>>): FetchDataFlow.Result<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Result<SignedTransaction>

'FetchTransactionsFlow' @ [137:62] ==> public constructor FetchTransactionsFlow(requests: Set<SecureHash>, otherSide: Party) defined in net.corda.core.internal.FetchTransactionsFlow[ClassConstructorDescriptorImpl]

'notAlreadyFetched' @ [137:84] ==> val notAlreadyFetched: Set<SecureHash> defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies[LocalVariableDescriptor]

'otherSide' @ [137:103] ==> private final val otherSide: Party defined in net.corda.core.internal.ResolveTransactionsFlow[PropertyDescriptorImpl]

'downloaded' @ [137:115] ==> public final val downloaded: List<SignedTransaction> defined in net.corda.core.internal.FetchDataFlow.Result[PropertyDescriptorImpl]

'downloads' @ [139:25] ==> val downloads: List<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies[LocalVariableDescriptor]

'check' @ [140:17] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'resultQ' @ [140:23] ==> val resultQ: LinkedHashMap<SecureHash, SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies[LocalVariableDescriptor]

'putIfAbsent' @ [140:31] ==> public open fun putIfAbsent(p0: SecureHash, p1: SignedTransaction): SignedTransaction? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'stx' @ [140:43] ==> val stx: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies[LocalVariableDescriptor]

'id' @ [140:47] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'stx' @ [140:51] ==> val stx: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies[LocalVariableDescriptor]

'downloads' @ [143:31] ==> val downloads: List<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies[LocalVariableDescriptor]

'flatMap' @ [143:41] ==> public inline fun <T, R> Iterable<SignedTransaction>.flatMap(transform: (SignedTransaction) -> Iterable<StateRef>): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <R> -> StateRef

'it' @ [143:51] ==> value-parameter it: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies.<anonymous>[ValueParameterDescriptorImpl]

'inputs' @ [143:54] ==> public final val inputs: List<StateRef> defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'map' @ [143:63] ==> public inline fun <T, R> Iterable<StateRef>.map(transform: (StateRef) -> SecureHash): List<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef
    <R> -> SecureHash

'it' @ [143:69] ==> value-parameter it: StateRef defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [143:72] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'nextRequests' @ [144:13] ==> val nextRequests: LinkedHashSet<SecureHash> defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies[LocalVariableDescriptor]

'addAll' @ [144:26] ==> public open fun addAll(elements: Collection<SecureHash>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'inputHashes' @ [144:33] ==> val inputHashes: List<SecureHash> defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies[LocalVariableDescriptor]

'limitCounter' @ [146:13] ==> var limitCounter: Int defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies[LocalVariableDescriptor]

'limitCounter' @ [146:28] ==> var limitCounter: Int defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies[LocalVariableDescriptor]

'nextRequests' @ [146:50] ==> val nextRequests: LinkedHashSet<SecureHash> defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies[LocalVariableDescriptor]

'size' @ [146:63] ==> public open val size: Int defined in java.util.LinkedHashSet[JavaPropertyDescriptor]

'limitCounter' @ [147:17] ==> var limitCounter: Int defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies[LocalVariableDescriptor]

'limit' @ [147:32] ==> val limit: Int defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies[LocalVariableDescriptor]

'ExcessivelyLargeTransactionGraph' @ [148:23] ==> public constructor ExcessivelyLargeTransactionGraph() defined in net.corda.core.internal.ResolveTransactionsFlow.ExcessivelyLargeTransactionGraph[ClassConstructorDescriptorImpl]

'resultQ' @ [150:16] ==> val resultQ: LinkedHashMap<SecureHash, SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.downloadDependencies[LocalVariableDescriptor]

'values' @ [150:24] ==> public open val values: MutableCollection<SignedTransaction> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'toList' @ [150:31] ==> public fun <T> Iterable<SignedTransaction>.toList(): List<SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'Suspendable' @ [157:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'downloads' @ [160:32] ==> value-parameter downloads: List<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.fetchMissingAttachments[ValueParameterDescriptorImpl]

'filterNot' @ [160:42] ==> public inline fun <T> Iterable<SignedTransaction>.filterNot(predicate: (SignedTransaction) -> Boolean): List<SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'it' @ [160:54] ==> value-parameter it: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlow.fetchMissingAttachments.<anonymous>[ValueParameterDescriptorImpl]

'isNotaryChangeTransaction' @ [160:57] ==> public final fun isNotaryChangeTransaction(): Boolean defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'map' @ [160:87] ==> public inline fun <T, R> Iterable<SignedTransaction>.map(transform: (SignedTransaction) -> WireTransaction): List<WireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <R> -> WireTransaction

'it' @ [160:93] ==> value-parameter it: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlow.fetchMissingAttachments.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [160:96] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'wireTransactions' @ [161:34] ==> val wireTransactions: List<WireTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.fetchMissingAttachments[LocalVariableDescriptor]

'flatMap' @ [161:51] ==> public inline fun <T, R> Iterable<WireTransaction>.flatMap(transform: (WireTransaction) -> Iterable<SecureHash>): List<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction
    <R> -> SecureHash

'wtx' @ [162:13] ==> value-parameter wtx: WireTransaction defined in net.corda.core.internal.ResolveTransactionsFlow.fetchMissingAttachments.<anonymous>[ValueParameterDescriptorImpl]

'attachments' @ [162:17] ==> public open val attachments: List<SecureHash> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'filter' @ [162:29] ==> public inline fun <T> Iterable<SecureHash>.filter(predicate: (SecureHash) -> Boolean): List<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'serviceHub' @ [162:38] ==> public final val serviceHub: ServiceHub defined in net.corda.core.internal.ResolveTransactionsFlow[PropertyDescriptorImpl]

'attachments' @ [162:49] ==> public abstract val attachments: AttachmentStorage defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'openAttachment' @ [162:61] ==> public abstract fun openAttachment(id: SecureHash): Attachment? defined in net.corda.core.node.services.AttachmentStorage[SimpleFunctionDescriptorImpl]

'it' @ [162:76] ==> value-parameter it: SecureHash defined in net.corda.core.internal.ResolveTransactionsFlow.fetchMissingAttachments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'missingAttachments' @ [164:13] ==> val missingAttachments: List<SecureHash> defined in net.corda.core.internal.ResolveTransactionsFlow.fetchMissingAttachments[LocalVariableDescriptor]

'isNotEmpty' @ [164:32] ==> @InlineOnly public inline fun <T> Collection<SecureHash>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'subFlow' @ [165:13] ==> @Suspendable @Throws public open fun <R> subFlow(subLogic: FlowLogic<FetchDataFlow.Result<Attachment>>): FetchDataFlow.Result<Attachment> defined in net.corda.core.internal.ResolveTransactionsFlow[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Result<Attachment>

'FetchAttachmentsFlow' @ [165:21] ==> public constructor FetchAttachmentsFlow(requests: Set<SecureHash>, otherSide: Party) defined in net.corda.core.internal.FetchAttachmentsFlow[ClassConstructorDescriptorImpl]

'missingAttachments' @ [165:42] ==> val missingAttachments: List<SecureHash> defined in net.corda.core.internal.ResolveTransactionsFlow.fetchMissingAttachments[LocalVariableDescriptor]

'toSet' @ [165:61] ==> public fun <T> Iterable<SecureHash>.toSet(): Set<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'otherSide' @ [165:70] ==> private final val otherSide: Party defined in net.corda.core.internal.ResolveTransactionsFlow[PropertyDescriptorImpl]

