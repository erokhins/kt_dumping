'getLogger' @ [26:33] ==> public open fun getLogger(p0: (String..String?)): (Logger..Logger?) defined in org.slf4j.LoggerFactory[JavaMethodDescriptor]

'when (request) {
            is IssueAndPaymentRequest -> {
                "ISSUE ${node.info.legalIdentity} -> ${request.recipient} : ${request.amount}"
            }
            is PaymentRequest -> {
                "MOVE ${node.info.legalIdentity} -> ${request.recipient} : ${request.amount}"
            }
            is ExitRequest -> {
                "EXIT ${node.info.legalIdentity} : ${request.amount}"
            }
            else -> throw IllegalArgumentException("Unexpected request type: $request")
        }' @ [39:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'request' @ [39:22] ==> public final val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'node' @ [41:26] ==> public final val node: NodeConnection defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'info' @ [41:31] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'legalIdentity' @ [41:36] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'request' @ [41:56] ==> public final val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'recipient' @ [41:64] ==> public final val recipient: Party defined in net.corda.finance.flows.CashIssueAndPaymentFlow.IssueAndPaymentRequest[DeserializedPropertyDescriptor]

'request' @ [41:79] ==> public final val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'amount' @ [41:87] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.AbstractCashFlow.AbstractRequest[DeserializedPropertyDescriptor]

'node' @ [44:25] ==> public final val node: NodeConnection defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'info' @ [44:30] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'legalIdentity' @ [44:35] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'request' @ [44:55] ==> public final val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'recipient' @ [44:63] ==> public final val recipient: Party defined in net.corda.finance.flows.CashPaymentFlow.PaymentRequest[DeserializedPropertyDescriptor]

'request' @ [44:78] ==> public final val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'amount' @ [44:86] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.AbstractCashFlow.AbstractRequest[DeserializedPropertyDescriptor]

'node' @ [47:25] ==> public final val node: NodeConnection defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'info' @ [47:30] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'legalIdentity' @ [47:35] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'request' @ [47:54] ==> public final val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'amount' @ [47:62] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.AbstractCashFlow.AbstractRequest[DeserializedPropertyDescriptor]

'IllegalArgumentException' @ [49:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'request' @ [49:79] ==> public final val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'HashMap' @ [79:29] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> AbstractParty
    <V : (Any..Any?)> -> HashMap<AbstractParty, Long>

'component1' @ [80:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<AbstractParty, Map<AbstractParty, Long>>.component1(): AbstractParty defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Map<AbstractParty, Long>

'component2' @ [80:20] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<AbstractParty, Map<AbstractParty, Long>>.component2(): Map<AbstractParty, Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Map<AbstractParty, Long>

'nodeVaults' @ [80:30] ==> public final val nodeVaults: Map<AbstractParty, Map<AbstractParty, Long>> defined in net.corda.loadtest.tests.CrossCashState[PropertyDescriptorImpl]

'newNodeVaults' @ [81:13] ==> val newNodeVaults: HashMap<AbstractParty, HashMap<AbstractParty, Long>> defined in net.corda.loadtest.tests.CrossCashState.copyVaults[LocalVariableDescriptor]

'key' @ [81:27] ==> val key: AbstractParty defined in net.corda.loadtest.tests.CrossCashState.copyVaults[LocalVariableDescriptor]

'HashMap' @ [81:34] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>(p0: (MutableMap<out (AbstractParty..AbstractParty?), out (Long..Long?)>..Map<out (AbstractParty..AbstractParty?), (Long..Long?)>?)) defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> AbstractParty
    <V : (Any..Any?)> -> Long

'value' @ [81:42] ==> val value: Map<AbstractParty, Long> defined in net.corda.loadtest.tests.CrossCashState.copyVaults[LocalVariableDescriptor]

'newNodeVaults' @ [83:16] ==> val newNodeVaults: HashMap<AbstractParty, HashMap<AbstractParty, Long>> defined in net.corda.loadtest.tests.CrossCashState.copyVaults[LocalVariableDescriptor]

'HashMap' @ [87:29] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> AbstractParty
    <V : (Any..Any?)> -> HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>

'component1' @ [88:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>>.component1(): AbstractParty defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Map<AbstractParty, List<Pair<AbstractParty, Long>>>

'component2' @ [88:21] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>>.component2(): Map<AbstractParty, List<Pair<AbstractParty, Long>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Map<AbstractParty, List<Pair<AbstractParty, Long>>>

'diffQueues' @ [88:32] ==> public final val diffQueues: Map<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>> defined in net.corda.loadtest.tests.CrossCashState[PropertyDescriptorImpl]

'HashMap' @ [89:29] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> AbstractParty
    <V : (Any..Any?)> -> ArrayList<Pair<AbstractParty, Long>>

'component1' @ [90:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<AbstractParty, List<Pair<AbstractParty, Long>>>.component1(): AbstractParty defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> List<Pair<AbstractParty, Long>>

'component2' @ [90:27] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<AbstractParty, List<Pair<AbstractParty, Long>>>.component2(): List<Pair<AbstractParty, Long>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> List<Pair<AbstractParty, Long>>

'queues' @ [90:37] ==> val queues: Map<AbstractParty, List<Pair<AbstractParty, Long>>> defined in net.corda.loadtest.tests.CrossCashState.copyQueues[LocalVariableDescriptor]

'newQueues' @ [91:17] ==> val newQueues: HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>> defined in net.corda.loadtest.tests.CrossCashState.copyQueues[LocalVariableDescriptor]

'sender' @ [91:27] ==> val sender: AbstractParty defined in net.corda.loadtest.tests.CrossCashState.copyQueues[LocalVariableDescriptor]

'ArrayList' @ [91:37] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (Pair<AbstractParty, Long>..Pair<AbstractParty, Long>?)>..Collection<(Pair<AbstractParty, Long>..Pair<AbstractParty, Long>?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Pair<AbstractParty, Long>

'value' @ [91:47] ==> val value: List<Pair<AbstractParty, Long>> defined in net.corda.loadtest.tests.CrossCashState.copyQueues[LocalVariableDescriptor]

'newDiffQueues' @ [93:13] ==> val newDiffQueues: HashMap<AbstractParty, HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>> defined in net.corda.loadtest.tests.CrossCashState.copyQueues[LocalVariableDescriptor]

'node' @ [93:27] ==> val node: AbstractParty defined in net.corda.loadtest.tests.CrossCashState.copyQueues[LocalVariableDescriptor]

'newQueues' @ [93:35] ==> val newQueues: HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>> defined in net.corda.loadtest.tests.CrossCashState.copyQueues[LocalVariableDescriptor]

'newDiffQueues' @ [95:16] ==> val newDiffQueues: HashMap<AbstractParty, HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>> defined in net.corda.loadtest.tests.CrossCashState.copyQueues[LocalVariableDescriptor]

'+' @ [99:16] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'nodeVaults' @ [100:17] ==> public final val nodeVaults: Map<AbstractParty, Map<AbstractParty, Long>> defined in net.corda.loadtest.tests.CrossCashState[PropertyDescriptorImpl]

'map' @ [100:28] ==> public inline fun <K, V, R> Map<out AbstractParty, Map<AbstractParty, Long>>.map(transform: (Map.Entry<AbstractParty, Map<AbstractParty, Long>>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Map<AbstractParty, Long>
    <R> -> String

'it' @ [101:32] ==> value-parameter it: Map.Entry<AbstractParty, Map<AbstractParty, Long>> defined in net.corda.loadtest.tests.CrossCashState.toString.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [101:35] ==> public abstract val key: AbstractParty defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'+' @ [102:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'node' @ [102:27] ==> val node: AbstractParty defined in net.corda.loadtest.tests.CrossCashState.toString.<anonymous>[LocalVariableDescriptor]

'it' @ [103:29] ==> value-parameter it: Map.Entry<AbstractParty, Map<AbstractParty, Long>> defined in net.corda.loadtest.tests.CrossCashState.toString.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [103:32] ==> public abstract val value: Map<AbstractParty, Long> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'map' @ [103:38] ==> public inline fun <K, V, R> Map<out AbstractParty, Long>.map(transform: (Map.Entry<AbstractParty, Long>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Long
    <R> -> String

'it' @ [104:46] ==> value-parameter it: Map.Entry<AbstractParty, Long> defined in net.corda.loadtest.tests.CrossCashState.toString.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [104:49] ==> public abstract val key: AbstractParty defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'issuer' @ [105:43] ==> val issuer: AbstractParty defined in net.corda.loadtest.tests.CrossCashState.toString.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [105:53] ==> value-parameter it: Map.Entry<AbstractParty, Long> defined in net.corda.loadtest.tests.CrossCashState.toString.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [105:56] ==> public abstract val value: Long defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'joinToString' @ [106:31] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'joinToString' @ [107:19] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'diffQueues' @ [109:17] ==> public final val diffQueues: Map<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>> defined in net.corda.loadtest.tests.CrossCashState[PropertyDescriptorImpl]

'map' @ [109:28] ==> public inline fun <K, V, R> Map<out AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>>.map(transform: (Map.Entry<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Map<AbstractParty, List<Pair<AbstractParty, Long>>>
    <R> -> String

'it' @ [110:32] ==> value-parameter it: Map.Entry<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>> defined in net.corda.loadtest.tests.CrossCashState.toString.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [110:35] ==> public abstract val key: AbstractParty defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'+' @ [111:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'node' @ [111:27] ==> val node: AbstractParty defined in net.corda.loadtest.tests.CrossCashState.toString.<anonymous>[LocalVariableDescriptor]

'it' @ [112:29] ==> value-parameter it: Map.Entry<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>> defined in net.corda.loadtest.tests.CrossCashState.toString.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [112:32] ==> public abstract val value: Map<AbstractParty, List<Pair<AbstractParty, Long>>> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'map' @ [112:38] ==> public inline fun <K, V, R> Map<out AbstractParty, List<Pair<AbstractParty, Long>>>.map(transform: (Map.Entry<AbstractParty, List<Pair<AbstractParty, Long>>>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> List<Pair<AbstractParty, Long>>
    <R> -> String

'it' @ [113:48] ==> value-parameter it: Map.Entry<AbstractParty, List<Pair<AbstractParty, Long>>> defined in net.corda.loadtest.tests.CrossCashState.toString.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [113:51] ==> public abstract val key: AbstractParty defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'+' @ [114:33] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'notifier' @ [114:43] ==> val notifier: AbstractParty defined in net.corda.loadtest.tests.CrossCashState.toString.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [114:58] ==> value-parameter it: Map.Entry<AbstractParty, List<Pair<AbstractParty, Long>>> defined in net.corda.loadtest.tests.CrossCashState.toString.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [114:61] ==> public abstract val value: List<Pair<AbstractParty, Long>> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'map' @ [114:67] ==> public inline fun <T, R> Iterable<Pair<AbstractParty, Long>>.map(transform: (Pair<AbstractParty, Long>) -> Issued<Long>): List<Issued<Long>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<AbstractParty, Long>
    <R> -> Issued<Long>

'Issued' @ [115:37] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Long) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Long

'PartyAndReference' @ [115:44] ==> public constructor PartyAndReference(party: AbstractParty, reference: OpaqueBytes) defined in net.corda.core.contracts.PartyAndReference[DeserializedClassConstructorDescriptor]

'it' @ [115:62] ==> value-parameter it: Pair<AbstractParty, Long> defined in net.corda.loadtest.tests.CrossCashState.toString.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [115:65] ==> public final val first: AbstractParty defined in kotlin.Pair[DeserializedPropertyDescriptor]

'of' @ [115:84] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [115:92] ==> value-parameter it: Pair<AbstractParty, Long> defined in net.corda.loadtest.tests.CrossCashState.toString.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [115:95] ==> public final val second: Long defined in kotlin.Pair[DeserializedPropertyDescriptor]

'joinToString' @ [116:35] ==> public fun <T> Iterable<Issued<Long>>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Issued<Long>) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Issued<Long>

'joinToString' @ [117:31] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'joinToString' @ [118:19] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'LoadTest' @ [122:21] ==> public constructor LoadTest<T, S>(testName: String, generate: Nodes.(CrossCashState, Int) -> Generator<List<CrossCashCommand>>, interpret: (CrossCashState, CrossCashCommand) -> CrossCashState, execute: Nodes.(CrossCashCommand) -> Unit, gatherRemoteState: Nodes.(CrossCashState?) -> CrossCashState, isConsistent: (CrossCashState) -> Boolean = ...) defined in net.corda.loadtest.LoadTest[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> CrossCashCommand
    <S> -> CrossCashState

'component1' @ [125:23] ==> public final operator fun component1(): Map<AbstractParty, Map<AbstractParty, Long>> defined in net.corda.loadtest.tests.CrossCashState[SimpleFunctionDescriptorImpl]

'simpleNodes' @ [126:27] ==> public final val simpleNodes: List<NodeConnection> defined in net.corda.loadtest.Nodes[PropertyDescriptorImpl]

'associateBy' @ [126:39] ==> public inline fun <T, K> Iterable<NodeConnection>.associateBy(keySelector: (NodeConnection) -> Party): Map<Party, NodeConnection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeConnection
    <K> -> Party

'it' @ [126:53] ==> value-parameter it: NodeConnection defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [126:56] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'legalIdentity' @ [126:61] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'Generator' @ [128:13] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'pickN' @ [128:23] ==> public fun <A> Generator.Companion.pickN(number: Int, list: List<NodeConnection>): Generator<List<NodeConnection>> defined in net.corda.client.mock[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> NodeConnection

'parallelism' @ [128:29] ==> value-parameter parallelism: Int defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'simpleNodes' @ [128:42] ==> public final val simpleNodes: List<NodeConnection> defined in net.corda.loadtest.Nodes[PropertyDescriptorImpl]

'flatMap' @ [128:55] ==> public final fun <B> flatMap(function: (List<NodeConnection>) -> Generator<List<CrossCashCommand>>): Generator<List<CrossCashCommand>> defined in net.corda.client.mock.Generator[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <B> -> List<CrossCashCommand>

'Generator' @ [129:17] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'sequence' @ [129:27] ==> public final fun <A> sequence(generators: List<Generator<CrossCashCommand>>): Generator<List<CrossCashCommand>> defined in net.corda.client.mock.Generator.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> CrossCashCommand

'nodes' @ [130:25] ==> value-parameter nodes: List<NodeConnection> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [130:31] ==> public inline fun <T, R> Iterable<NodeConnection>.map(transform: (NodeConnection) -> Generator<CrossCashCommand>): List<Generator<CrossCashCommand>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeConnection
    <R> -> Generator<CrossCashCommand>

'nodeVaults' @ [131:46] ==> val nodeVaults: Map<AbstractParty, Map<AbstractParty, Long>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'node' @ [131:57] ==> value-parameter node: NodeConnection defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [131:62] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'legalIdentity' @ [131:67] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mapOf' @ [131:85] ==> @InlineOnly public inline fun <K, V> mapOf(): Map<AbstractParty, Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Long

'nodeMap' @ [132:54] ==> val nodeMap: Map<Party, NodeConnection> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'keys' @ [132:62] ==> public abstract val keys: Set<Party> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'toList' @ [132:67] ==> public fun <T> Iterable<Party>.toList(): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'quantities' @ [133:41] ==> val quantities: Map<AbstractParty, Long> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'map' @ [133:52] ==> public inline fun <K, V, R> Map<out AbstractParty, Long>.map(transform: (Map.Entry<AbstractParty, Long>) -> Pair<Double, Generator<CashPaymentFlow.PaymentRequest>>): List<Pair<Double, Generator<CashPaymentFlow.PaymentRequest>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Long
    <R> -> Pair<Double, Generator<PaymentRequest>>

'it' @ [134:33] ==> value-parameter it: Map.Entry<AbstractParty, Long> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [134:36] ==> public abstract val value: Long defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'toDouble' @ [134:42] ==> public open fun toDouble(): Double defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'generateMove' @ [134:63] ==> public fun generateMove(max: Long, currency: Currency, issuer: Party, possibleRecipients: List<Party>, anonymous: Boolean): Generator<CashPaymentFlow.PaymentRequest> defined in net.corda.loadtest.tests in file GenerateHelpers.kt[SimpleFunctionDescriptorImpl]

'it' @ [134:76] ==> value-parameter it: Map.Entry<AbstractParty, Long> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [134:79] ==> public abstract val value: Long defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'USD' @ [134:86] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'node' @ [134:91] ==> value-parameter node: NodeConnection defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [134:96] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'legalIdentity' @ [134:101] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'possibleRecipients' @ [134:116] ==> val possibleRecipients: List<Party> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'anonymous' @ [134:136] ==> val anonymous: Boolean defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'quantities' @ [136:41] ==> val quantities: Map<AbstractParty, Long> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'mapNotNull' @ [136:52] ==> public inline fun <K, V, R : Any> Map<out AbstractParty, Long>.mapNotNull(transform: (Map.Entry<AbstractParty, Long>) -> Pair<Double, Generator<CashExitFlow.ExitRequest>>?): List<Pair<Double, Generator<CashExitFlow.ExitRequest>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Long
    <R : Any> -> Pair<Double, Generator<ExitRequest>>

'if (it.key == node.info.legalIdentity) {
                                    it.value.toDouble() / 3000 to generateExit(it.value, USD)
                                } else {
                                    null
                                }' @ [137:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<Double, Generator<CashExitFlow.ExitRequest>>?, elseBranch: Pair<Double, Generator<CashExitFlow.ExitRequest>>?): Pair<Double, Generator<CashExitFlow.ExitRequest>>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<Double, Generator<ExitRequest>>?

'it' @ [137:37] ==> value-parameter it: Map.Entry<AbstractParty, Long> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [137:40] ==> public abstract val key: AbstractParty defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'node' @ [137:47] ==> value-parameter node: NodeConnection defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [137:52] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'legalIdentity' @ [137:57] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'it' @ [138:37] ==> value-parameter it: Map.Entry<AbstractParty, Long> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [138:40] ==> public abstract val value: Long defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'toDouble' @ [138:46] ==> public open fun toDouble(): Double defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'generateExit' @ [138:67] ==> public fun generateExit(max: Long, currency: Currency): Generator<CashExitFlow.ExitRequest> defined in net.corda.loadtest.tests in file GenerateHelpers.kt[SimpleFunctionDescriptorImpl]

'it' @ [138:80] ==> value-parameter it: Map.Entry<AbstractParty, Long> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [138:83] ==> public abstract val value: Long defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'USD' @ [138:90] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'Generator' @ [143:43] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'frequency' @ [143:53] ==> public final fun <A> frequency(generators: List<Pair<Double, Generator<AbstractCashFlow.AbstractRequest>>>): Generator<AbstractCashFlow.AbstractRequest> defined in net.corda.client.mock.Generator.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> AbstractRequest

'listOf' @ [144:37] ==> public fun <T> listOf(element: Pair<Double, Generator<CashIssueAndPaymentFlow.IssueAndPaymentRequest>>): List<Pair<Double, Generator<CashIssueAndPaymentFlow.IssueAndPaymentRequest>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Double, Generator<IssueAndPaymentRequest>>

'to' @ [144:44] ==> public infix fun <A, B> Double.to(that: Generator<CashIssueAndPaymentFlow.IssueAndPaymentRequest>): Pair<Double, Generator<CashIssueAndPaymentFlow.IssueAndPaymentRequest>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Double
    <B> -> Generator<IssueAndPaymentRequest>

'generateIssue' @ [144:51] ==> public fun generateIssue(max: Long, currency: Currency, notary: Party, possibleRecipients: List<Party>, anonymous: Boolean): Generator<CashIssueAndPaymentFlow.IssueAndPaymentRequest> defined in net.corda.loadtest.tests in file GenerateHelpers.kt[SimpleFunctionDescriptorImpl]

'USD' @ [144:72] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'notary' @ [144:77] ==> public final val notary: NodeConnection defined in net.corda.loadtest.Nodes[PropertyDescriptorImpl]

'info' @ [144:84] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'notaryIdentity' @ [144:89] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'possibleRecipients' @ [144:105] ==> val possibleRecipients: List<Party> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'anonymous' @ [144:125] ==> val anonymous: Boolean defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'moves' @ [144:139] ==> val moves: List<Pair<Double, Generator<CashPaymentFlow.PaymentRequest>>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'exits' @ [144:147] ==> val exits: List<Pair<Double, Generator<CashExitFlow.ExitRequest>>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'command' @ [146:29] ==> val command: Generator<AbstractCashFlow.AbstractRequest> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'map' @ [146:37] ==> public final fun <B> map(function: (AbstractCashFlow.AbstractRequest) -> CrossCashCommand): Generator<CrossCashCommand> defined in net.corda.client.mock.Generator[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <B> -> CrossCashCommand

'CrossCashCommand' @ [146:43] ==> public constructor CrossCashCommand(request: AbstractCashFlow.AbstractRequest, node: NodeConnection) defined in net.corda.loadtest.tests.CrossCashCommand[ClassConstructorDescriptorImpl]

'it' @ [146:60] ==> value-parameter it: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'nodeMap' @ [146:64] ==> val nodeMap: Map<Party, NodeConnection> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'node' @ [146:72] ==> value-parameter node: NodeConnection defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [146:77] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'legalIdentity' @ [146:82] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'when (command.request) {
                is IssueAndPaymentRequest -> {
                    val newDiffQueues = state.copyQueues()
                    val originators = newDiffQueues.getOrPut(command.request.recipient, { HashMap() })
                    val issuer = command.node.info.legalIdentity
                    val quantity = command.request.amount.quantity
                    val queue = originators.getOrPut(issuer, { ArrayList() })
                    queue.add(Pair(issuer, quantity))
                    CrossCashState(state.nodeVaults, newDiffQueues)
                }
                is PaymentRequest -> {
                    val newNodeVaults = state.copyVaults()
                    val newDiffQueues = state.copyQueues()
                    val recipientOriginators = newDiffQueues.getOrPut(command.request.recipient, { HashMap() })
                    val senderQuantities = newNodeVaults[command.node.info.legalIdentity]!!
                    val amount = command.request.amount
                    val issuer = command.request.issuerConstraint.single()
                    val originator = command.node.info.legalIdentity
                    val senderQuantity = senderQuantities[issuer] ?: throw Exception(
                            "Generated payment of ${command.request.amount} from ${command.node.info.legalIdentity}, " +
                                    "however there is no cash from $issuer!"
                    )
                    if (senderQuantity < amount.quantity) {
                        throw Exception(
                                "Generated payment of ${command.request.amount} from ${command.node.info.legalIdentity}, " +
                                        "however they only have $senderQuantity!"
                        )
                    }
                    if (senderQuantity == amount.quantity) {
                        senderQuantities.remove(issuer)
                    } else {
                        senderQuantities.put(issuer, senderQuantity - amount.quantity)
                    }
                    val recipientQueue = recipientOriginators.getOrPut(originator, { ArrayList() })
                    recipientQueue.add(Pair(issuer, amount.quantity))
                    CrossCashState(newNodeVaults, newDiffQueues)
                }
                is ExitRequest -> {
                    val newNodeVaults = state.copyVaults()
                    val issuer = command.node.info.legalIdentity
                    val quantity = command.request.amount.quantity
                    val issuerQuantities = newNodeVaults[issuer]!!
                    val issuerQuantity = issuerQuantities[issuer] ?: throw Exception(
                            "Generated exit of ${command.request.amount} from $issuer, however there is no cash to exit!"
                    )
                    if (issuerQuantity < quantity) {
                        throw Exception(
                                "Generated payment of ${command.request.amount} from $issuer, " +
                                        "however they only have $issuerQuantity!"
                        )
                    }
                    if (issuerQuantity == quantity) {
                        issuerQuantities.remove(issuer)
                    } else {
                        issuerQuantities.put(issuer, issuerQuantity - quantity)
                    }
                    CrossCashState(newNodeVaults, state.diffQueues)
                }
                else -> throw IllegalArgumentException("Unexpected request type: ${command.request}")
            }' @ [153:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CrossCashState, entry1: CrossCashState, entry2: CrossCashState, entry3: CrossCashState): CrossCashState[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CrossCashState

'command' @ [153:19] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'request' @ [153:27] ==> public final val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'state' @ [155:41] ==> value-parameter state: CrossCashState defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'copyQueues' @ [155:47] ==> public final fun copyQueues(): HashMap<AbstractParty, HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>> defined in net.corda.loadtest.tests.CrossCashState[SimpleFunctionDescriptorImpl]

'newDiffQueues' @ [156:39] ==> val newDiffQueues: HashMap<AbstractParty, HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'getOrPut' @ [156:53] ==> public inline fun <K, V> MutableMap<AbstractParty, HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>>.getOrPut(key: AbstractParty, defaultValue: () -> HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>): HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>

'command' @ [156:62] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'request' @ [156:70] ==> public final val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'recipient' @ [156:78] ==> public final val recipient: Party defined in net.corda.finance.flows.CashIssueAndPaymentFlow.IssueAndPaymentRequest[DeserializedPropertyDescriptor]

'HashMap' @ [156:91] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> AbstractParty
    <V : (Any..Any?)> -> ArrayList<Pair<AbstractParty, Long>>

'command' @ [157:34] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [157:42] ==> public final val node: NodeConnection defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'info' @ [157:47] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'legalIdentity' @ [157:52] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'command' @ [158:36] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'request' @ [158:44] ==> public final val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'amount' @ [158:52] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.AbstractCashFlow.AbstractRequest[DeserializedPropertyDescriptor]

'quantity' @ [158:59] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'originators' @ [159:33] ==> val originators: HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'getOrPut' @ [159:45] ==> public inline fun <K, V> MutableMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>.getOrPut(key: AbstractParty, defaultValue: () -> ArrayList<Pair<AbstractParty, Long>>): ArrayList<Pair<AbstractParty, Long>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> ArrayList<Pair<AbstractParty, Long>>

'issuer' @ [159:54] ==> val issuer: Party defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'ArrayList' @ [159:64] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Pair<AbstractParty, Long>

'queue' @ [160:21] ==> val queue: ArrayList<Pair<AbstractParty, Long>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'add' @ [160:27] ==> public open fun add(element: Pair<AbstractParty, Long>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Pair' @ [160:31] ==> public constructor Pair<out A, out B>(first: Party, second: Long) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Long

'issuer' @ [160:36] ==> val issuer: Party defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'quantity' @ [160:44] ==> val quantity: Long defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'CrossCashState' @ [161:21] ==> public constructor CrossCashState(nodeVaults: Map<AbstractParty, Map<AbstractParty, Long>>, diffQueues: Map<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>>) defined in net.corda.loadtest.tests.CrossCashState[ClassConstructorDescriptorImpl]

'state' @ [161:36] ==> value-parameter state: CrossCashState defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'nodeVaults' @ [161:42] ==> public final val nodeVaults: Map<AbstractParty, Map<AbstractParty, Long>> defined in net.corda.loadtest.tests.CrossCashState[PropertyDescriptorImpl]

'newDiffQueues' @ [161:54] ==> val newDiffQueues: HashMap<AbstractParty, HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'state' @ [164:41] ==> value-parameter state: CrossCashState defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'copyVaults' @ [164:47] ==> public final fun copyVaults(): HashMap<AbstractParty, HashMap<AbstractParty, Long>> defined in net.corda.loadtest.tests.CrossCashState[SimpleFunctionDescriptorImpl]

'state' @ [165:41] ==> value-parameter state: CrossCashState defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'copyQueues' @ [165:47] ==> public final fun copyQueues(): HashMap<AbstractParty, HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>> defined in net.corda.loadtest.tests.CrossCashState[SimpleFunctionDescriptorImpl]

'newDiffQueues' @ [166:48] ==> val newDiffQueues: HashMap<AbstractParty, HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'getOrPut' @ [166:62] ==> public inline fun <K, V> MutableMap<AbstractParty, HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>>.getOrPut(key: AbstractParty, defaultValue: () -> HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>): HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>

'command' @ [166:71] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'request' @ [166:79] ==> public final val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'recipient' @ [166:87] ==> public final val recipient: Party defined in net.corda.finance.flows.CashPaymentFlow.PaymentRequest[DeserializedPropertyDescriptor]

'HashMap' @ [166:100] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> AbstractParty
    <V : (Any..Any?)> -> ArrayList<Pair<AbstractParty, Long>>

'newNodeVaults' @ [167:44] ==> val newNodeVaults: HashMap<AbstractParty, HashMap<AbstractParty, Long>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'command' @ [167:58] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [167:66] ==> public final val node: NodeConnection defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'info' @ [167:71] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'legalIdentity' @ [167:76] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'command' @ [168:34] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'request' @ [168:42] ==> public final val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'amount' @ [168:50] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.AbstractCashFlow.AbstractRequest[DeserializedPropertyDescriptor]

'command' @ [169:34] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'request' @ [169:42] ==> public final val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'issuerConstraint' @ [169:50] ==> public final val issuerConstraint: Set<Party> defined in net.corda.finance.flows.CashPaymentFlow.PaymentRequest[DeserializedPropertyDescriptor]

'single' @ [169:67] ==> public fun <T> Iterable<Party>.single(): Party defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'command' @ [170:38] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [170:46] ==> public final val node: NodeConnection defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'info' @ [170:51] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'legalIdentity' @ [170:56] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'senderQuantities' @ [171:42] ==> val senderQuantities: HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'issuer' @ [171:59] ==> val issuer: Party defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'Exception' @ [171:76] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'+' @ [172:29] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'command' @ [172:53] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'request' @ [172:61] ==> public final val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'amount' @ [172:69] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.AbstractCashFlow.AbstractRequest[DeserializedPropertyDescriptor]

'command' @ [172:84] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [172:92] ==> public final val node: NodeConnection defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'info' @ [172:97] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'legalIdentity' @ [172:102] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'issuer' @ [173:69] ==> val issuer: Party defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'senderQuantity' @ [175:25] ==> val senderQuantity: Long defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'amount' @ [175:42] ==> val amount: Amount<Currency> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'quantity' @ [175:49] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'Exception' @ [176:31] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'+' @ [177:33] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'command' @ [177:57] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'request' @ [177:65] ==> public final val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'amount' @ [177:73] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.AbstractCashFlow.AbstractRequest[DeserializedPropertyDescriptor]

'command' @ [177:88] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [177:96] ==> public final val node: NodeConnection defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'info' @ [177:101] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'legalIdentity' @ [177:106] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'senderQuantity' @ [178:66] ==> val senderQuantity: Long defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'if (senderQuantity == amount.quantity) {
                        senderQuantities.remove(issuer)
                    } else {
                        senderQuantities.put(issuer, senderQuantity - amount.quantity)
                    }' @ [181:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Long?, elseBranch: Long?): Long?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Long?

'senderQuantity' @ [181:25] ==> val senderQuantity: Long defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'amount' @ [181:43] ==> val amount: Amount<Currency> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'quantity' @ [181:50] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'senderQuantities' @ [182:25] ==> val senderQuantities: HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'remove' @ [182:42] ==> public open fun remove(key: AbstractParty): Long? defined in java.util.HashMap[JavaMethodDescriptor]

'issuer' @ [182:49] ==> val issuer: Party defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'senderQuantities' @ [184:25] ==> val senderQuantities: HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'put' @ [184:42] ==> public open fun put(key: AbstractParty, value: Long): Long? defined in java.util.HashMap[JavaMethodDescriptor]

'issuer' @ [184:46] ==> val issuer: Party defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'senderQuantity' @ [184:54] ==> val senderQuantity: Long defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'amount' @ [184:71] ==> val amount: Amount<Currency> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'quantity' @ [184:78] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'recipientOriginators' @ [186:42] ==> val recipientOriginators: HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'getOrPut' @ [186:63] ==> public inline fun <K, V> MutableMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>.getOrPut(key: AbstractParty, defaultValue: () -> ArrayList<Pair<AbstractParty, Long>>): ArrayList<Pair<AbstractParty, Long>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> ArrayList<Pair<AbstractParty, Long>>

'originator' @ [186:72] ==> val originator: Party defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'ArrayList' @ [186:86] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Pair<AbstractParty, Long>

'recipientQueue' @ [187:21] ==> val recipientQueue: ArrayList<Pair<AbstractParty, Long>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'add' @ [187:36] ==> public open fun add(element: Pair<AbstractParty, Long>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Pair' @ [187:40] ==> public constructor Pair<out A, out B>(first: Party, second: Long) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Long

'issuer' @ [187:45] ==> val issuer: Party defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'amount' @ [187:53] ==> val amount: Amount<Currency> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'quantity' @ [187:60] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'CrossCashState' @ [188:21] ==> public constructor CrossCashState(nodeVaults: Map<AbstractParty, Map<AbstractParty, Long>>, diffQueues: Map<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>>) defined in net.corda.loadtest.tests.CrossCashState[ClassConstructorDescriptorImpl]

'newNodeVaults' @ [188:36] ==> val newNodeVaults: HashMap<AbstractParty, HashMap<AbstractParty, Long>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'newDiffQueues' @ [188:51] ==> val newDiffQueues: HashMap<AbstractParty, HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'state' @ [191:41] ==> value-parameter state: CrossCashState defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'copyVaults' @ [191:47] ==> public final fun copyVaults(): HashMap<AbstractParty, HashMap<AbstractParty, Long>> defined in net.corda.loadtest.tests.CrossCashState[SimpleFunctionDescriptorImpl]

'command' @ [192:34] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [192:42] ==> public final val node: NodeConnection defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'info' @ [192:47] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'legalIdentity' @ [192:52] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'command' @ [193:36] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'request' @ [193:44] ==> public final val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'amount' @ [193:52] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.AbstractCashFlow.AbstractRequest[DeserializedPropertyDescriptor]

'quantity' @ [193:59] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'newNodeVaults' @ [194:44] ==> val newNodeVaults: HashMap<AbstractParty, HashMap<AbstractParty, Long>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'issuer' @ [194:58] ==> val issuer: Party defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'issuerQuantities' @ [195:42] ==> val issuerQuantities: HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'issuer' @ [195:59] ==> val issuer: Party defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'Exception' @ [195:76] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'command' @ [196:50] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'request' @ [196:58] ==> public final val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'amount' @ [196:66] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.AbstractCashFlow.AbstractRequest[DeserializedPropertyDescriptor]

'issuer' @ [196:80] ==> val issuer: Party defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'issuerQuantity' @ [198:25] ==> val issuerQuantity: Long defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'quantity' @ [198:42] ==> val quantity: Long defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'Exception' @ [199:31] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'+' @ [200:33] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'command' @ [200:57] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'request' @ [200:65] ==> public final val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'amount' @ [200:73] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.AbstractCashFlow.AbstractRequest[DeserializedPropertyDescriptor]

'issuer' @ [200:87] ==> val issuer: Party defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'issuerQuantity' @ [201:66] ==> val issuerQuantity: Long defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'if (issuerQuantity == quantity) {
                        issuerQuantities.remove(issuer)
                    } else {
                        issuerQuantities.put(issuer, issuerQuantity - quantity)
                    }' @ [204:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Long?, elseBranch: Long?): Long?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Long?

'issuerQuantity' @ [204:25] ==> val issuerQuantity: Long defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'quantity' @ [204:43] ==> val quantity: Long defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'issuerQuantities' @ [205:25] ==> val issuerQuantities: HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'remove' @ [205:42] ==> public open fun remove(key: AbstractParty): Long? defined in java.util.HashMap[JavaMethodDescriptor]

'issuer' @ [205:49] ==> val issuer: Party defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'issuerQuantities' @ [207:25] ==> val issuerQuantities: HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'put' @ [207:42] ==> public open fun put(key: AbstractParty, value: Long): Long? defined in java.util.HashMap[JavaMethodDescriptor]

'issuer' @ [207:46] ==> val issuer: Party defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'issuerQuantity' @ [207:54] ==> val issuerQuantity: Long defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'quantity' @ [207:71] ==> val quantity: Long defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'CrossCashState' @ [209:21] ==> public constructor CrossCashState(nodeVaults: Map<AbstractParty, Map<AbstractParty, Long>>, diffQueues: Map<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>>) defined in net.corda.loadtest.tests.CrossCashState[ClassConstructorDescriptorImpl]

'newNodeVaults' @ [209:36] ==> val newNodeVaults: HashMap<AbstractParty, HashMap<AbstractParty, Long>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'state' @ [209:51] ==> value-parameter state: CrossCashState defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'diffQueues' @ [209:57] ==> public final val diffQueues: Map<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>> defined in net.corda.loadtest.tests.CrossCashState[PropertyDescriptorImpl]

'IllegalArgumentException' @ [211:31] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'command' @ [211:84] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'request' @ [211:92] ==> public final val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'command' @ [216:27] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'request' @ [216:35] ==> public final val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'when (request) {
                is IssueAndPaymentRequest -> command.node.proxy.startFlow(::CashIssueAndPaymentFlow, request).returnValue
                is PaymentRequest -> command.node.proxy.startFlow(::CashPaymentFlow, request).returnValue
                is ExitRequest -> command.node.proxy.startFlow(::CashExitFlow, request).returnValue
                else -> throw IllegalArgumentException("Unexpected request type: $request")
            }' @ [217:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CordaFuture<AbstractCashFlow.Result>, entry1: CordaFuture<AbstractCashFlow.Result>, entry2: CordaFuture<AbstractCashFlow.Result>, entry3: CordaFuture<AbstractCashFlow.Result>): CordaFuture<AbstractCashFlow.Result>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CordaFuture<Result>

'request' @ [217:32] ==> val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'command' @ [218:46] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [218:54] ==> public final val node: NodeConnection defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'proxy' @ [218:59] ==> public final val proxy: CordaRPCOps defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'startFlow' @ [218:65] ==> public inline fun <T : Any, A, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (CashIssueAndPaymentFlow.IssueAndPaymentRequest) -> CashIssueAndPaymentFlow, arg0: CashIssueAndPaymentFlow.IssueAndPaymentRequest): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> IssueAndPaymentRequest
    <reified R : FlowLogic<T>> -> CashIssueAndPaymentFlow

'CashIssueAndPaymentFlow' @ [218:77] ==> public constructor CashIssueAndPaymentFlow(request: CashIssueAndPaymentFlow.IssueAndPaymentRequest) defined in net.corda.finance.flows.CashIssueAndPaymentFlow[DeserializedClassConstructorDescriptor]

'request' @ [218:102] ==> val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'returnValue' @ [218:111] ==> public abstract val returnValue: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'command' @ [219:38] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [219:46] ==> public final val node: NodeConnection defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'proxy' @ [219:51] ==> public final val proxy: CordaRPCOps defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'startFlow' @ [219:57] ==> public inline fun <T : Any, A, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (CashPaymentFlow.PaymentRequest) -> CashPaymentFlow, arg0: CashPaymentFlow.PaymentRequest): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> PaymentRequest
    <reified R : FlowLogic<T>> -> CashPaymentFlow

'CashPaymentFlow' @ [219:69] ==> public constructor CashPaymentFlow(request: CashPaymentFlow.PaymentRequest) defined in net.corda.finance.flows.CashPaymentFlow[DeserializedClassConstructorDescriptor]

'request' @ [219:86] ==> val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'returnValue' @ [219:95] ==> public abstract val returnValue: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'command' @ [220:35] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [220:43] ==> public final val node: NodeConnection defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'proxy' @ [220:48] ==> public final val proxy: CordaRPCOps defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'startFlow' @ [220:54] ==> public inline fun <T : Any, A, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (CashExitFlow.ExitRequest) -> CashExitFlow, arg0: CashExitFlow.ExitRequest): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> ExitRequest
    <reified R : FlowLogic<T>> -> CashExitFlow

'CashExitFlow' @ [220:66] ==> public constructor CashExitFlow(request: CashExitFlow.ExitRequest) defined in net.corda.finance.flows.CashExitFlow[DeserializedClassConstructorDescriptor]

'request' @ [220:80] ==> val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'returnValue' @ [220:89] ==> public abstract val returnValue: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'IllegalArgumentException' @ [221:31] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'request' @ [221:83] ==> val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'result' @ [223:13] ==> val result: CordaFuture<AbstractCashFlow.Result> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'thenMatch' @ [223:20] ==> public fun <V, W, X> CordaFuture<out AbstractCashFlow.Result>.thenMatch(success: (AbstractCashFlow.Result) -> Unit, failure: (Throwable) -> Unit): Unit defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result
    <W> -> Unit
    <X> -> Unit

'log' @ [224:17] ==> private val log: (Logger..Logger?) defined in net.corda.loadtest.tests in file CrossCashTest.kt[PropertyDescriptorImpl]

'info' @ [224:21] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'command' @ [224:36] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [224:47] ==> val result: CordaFuture<AbstractCashFlow.Result> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'log' @ [226:17] ==> private val log: (Logger..Logger?) defined in net.corda.loadtest.tests in file CrossCashTest.kt[PropertyDescriptorImpl]

'error' @ [226:21] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'command' @ [226:37] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [226:48] ==> value-parameter it: Throwable defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'log' @ [231:13] ==> private val log: (Logger..Logger?) defined in net.corda.loadtest.tests in file CrossCashTest.kt[PropertyDescriptorImpl]

'info' @ [231:17] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'HashMap' @ [232:37] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> AbstractParty
    <V : (Any..Any?)> -> HashMap<AbstractParty, Long>

'simpleNodes' @ [233:13] ==> public final val simpleNodes: List<NodeConnection> defined in net.corda.loadtest.Nodes[PropertyDescriptorImpl]

'forEach' @ [233:25] ==> @HidesMembers public inline fun <T> Iterable<NodeConnection>.forEach(action: (NodeConnection) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeConnection

'HashMap' @ [234:34] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> AbstractParty
    <V : (Any..Any?)> -> Long

'it' @ [235:29] ==> value-parameter it: NodeConnection defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'proxy' @ [235:32] ==> public final val proxy: CordaRPCOps defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'vaultQueryBy' @ [235:38] ==> public inline fun <reified T : ContractState> CordaRPCOps.vaultQueryBy(criteria: QueryCriteria = ..., paging: PageSpecification = ..., sorting: Sort = ...): Vault.Page<Cash.State> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [235:65] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'vault' @ [236:17] ==> val vault: List<StateAndRef<Cash.State>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'forEach' @ [236:23] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<Cash.State>>.forEach(action: (StateAndRef<Cash.State>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'it' @ [237:33] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [237:36] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [237:42] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'state' @ [238:34] ==> val state: Cash.State defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'amount' @ [238:40] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [238:47] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [238:53] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'party' @ [238:60] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'quantities' @ [239:21] ==> val quantities: HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'put' @ [239:32] ==> public open fun put(key: AbstractParty, value: Long): Long? defined in java.util.HashMap[JavaMethodDescriptor]

'issuer' @ [239:36] ==> val issuer: AbstractParty defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'+' @ [239:44] ==> public final operator fun plus(other: Long): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'quantities' @ [239:45] ==> val quantities: HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'issuer' @ [239:56] ==> val issuer: AbstractParty defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'state' @ [239:73] ==> val state: Cash.State defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'amount' @ [239:79] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'quantity' @ [239:86] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'currentNodeVaults' @ [241:17] ==> val currentNodeVaults: HashMap<AbstractParty, HashMap<AbstractParty, Long>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'put' @ [241:35] ==> public open fun put(key: AbstractParty, value: HashMap<AbstractParty, Long>): HashMap<AbstractParty, Long>? defined in java.util.HashMap[JavaMethodDescriptor]

'it' @ [241:39] ==> value-parameter it: NodeConnection defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [241:42] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'legalIdentity' @ [241:47] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'quantities' @ [241:62] ==> val quantities: HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'component1' @ [243:18] ==> public final operator fun component1(): HashMap<AbstractParty, HashMap<AbstractParty, Long>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [243:36] ==> public final operator fun component2(): Map<(AbstractParty..AbstractParty?), (Map<AbstractParty, (List<Pair<AbstractParty, Long>>..List<Pair<AbstractParty, Long>>?)>..Map<AbstractParty, (List<Pair<AbstractParty, Long>>..List<Pair<AbstractParty, Long>>?)>?)> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'if (previousState == null) {
                Pair(currentNodeVaults, mapOf<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>>())
            } else {
                log.info("${previousState.diffQueues.values.sumBy { it.values.sumBy { it.size } }} txs in limbo")
                val newDiffQueues = previousState.copyQueues()
                val newConsistentVault = previousState.copyVaults()
                previousState.diffQueues.forEach { entry ->
                    val (node, queues) = entry
                    val searchedState = currentNodeVaults[node]
                    val baseState = previousState.nodeVaults[node]
                    if (searchedState != null) {
                        val matches = searchForState(searchedState, baseState ?: mapOf(), queues)
                        if (matches.isEmpty()) {
                            log.warn(
                                    "Divergence detected, the remote state doesn't match any of our possible predictions." +
                                            "\nPredicted state/queues:\n$previousState" +
                                            "\nActual gathered state:\n${CrossCashState(currentNodeVaults, mapOf())}"
                            )
                            // TODO We should terminate here with an exception, we cannot carry on as we have an inconsistent model. We carry on currently because we always diverge due to notarisation failures
                            return@LoadTest CrossCashState(currentNodeVaults, mapOf<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>>())
                        }
                        if (matches.size > 1) {
                            log.warn("Multiple predicted states match the remote state")
                        }
                        val minimumMatches = matches.fold<Map<AbstractParty, Int>, HashMap<AbstractParty, Int>?>(null) { minimum, next ->
                            if (minimum == null) {
                                HashMap(next)
                            } else {
                                next.forEach { minimum.merge(it.key, it.value, Math::min) }
                                minimum
                            }
                        }!!
                        // Now compute the new consistent state
                        val newNodeDiffQueues = newDiffQueues[node]
                        val newNodeVault = newConsistentVault.getOrPut(node) { HashMap() }
                        minimumMatches.forEach { originator, consumedTxs ->
                            if (consumedTxs > 0) {
                                newNodeDiffQueues!!
                                for (i in 0..consumedTxs - 1) {
                                    val (issuer, quantity) = newNodeDiffQueues[originator]!!.removeAt(0)
                                    newNodeVault.put(issuer, (newNodeVault[issuer] ?: 0L) + quantity)
                                }
                            }
                        }
                    } else {
                        require(baseState == null)
                    }
                }
                Pair(newConsistentVault, newDiffQueues)
            }' @ [243:50] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<HashMap<AbstractParty, HashMap<AbstractParty, Long>>, Map<(AbstractParty..AbstractParty?), (Map<AbstractParty, (List<Pair<AbstractParty, Long>>..List<Pair<AbstractParty, Long>>?)>..Map<AbstractParty, (List<Pair<AbstractParty, Long>>..List<Pair<AbstractParty, Long>>?)>?)>>, elseBranch: Pair<HashMap<AbstractParty, HashMap<AbstractParty, Long>>, Map<(AbstractParty..AbstractParty?), (Map<AbstractParty, (List<Pair<AbstractParty, Long>>..List<Pair<AbstractParty, Long>>?)>..Map<AbstractParty, (List<Pair<AbstractParty, Long>>..List<Pair<AbstractParty, Long>>?)>?)>>): Pair<HashMap<AbstractParty, HashMap<AbstractParty, Long>>, Map<(AbstractParty..AbstractParty?), (Map<AbstractParty, (List<Pair<AbstractParty, Long>>..List<Pair<AbstractParty, Long>>?)>..Map<AbstractParty, (List<Pair<AbstractParty, Long>>..List<Pair<AbstractParty, Long>>?)>?)>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<HashMap<AbstractParty, HashMap<AbstractParty, Long>>, Map<(net.corda.core.identity.AbstractParty..net.corda.core.identity.AbstractParty?), (kotlin.collections.Map<net.corda.core.identity.AbstractParty, (kotlin.collections.List<kotlin.Pair<net.corda.core.identity.AbstractParty, kotlin.Long>>..kotlin.collections.List<kotlin.Pair<net.corda.core.identity.AbstractParty, kotlin.Long>>?)>..kotlin.collections.Map<net.corda.core.identity.AbstractParty, (kotlin.collections.List<kotlin.Pair<net.corda.core.identity.AbstractParty, kotlin.Long>>..kotlin.collections.List<kotlin.Pair<net.corda.core.identity.AbstractParty, kotlin.Long>>?)>?)>>

'previousState' @ [243:54] ==> value-parameter previousState: CrossCashState? defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'Pair' @ [244:17] ==> public constructor Pair<out A, out B>(first: HashMap<AbstractParty, HashMap<AbstractParty, Long>>, second: Map<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> HashMap<AbstractParty, HashMap<AbstractParty, Long>>
    <out B> -> Map<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>>

'currentNodeVaults' @ [244:22] ==> val currentNodeVaults: HashMap<AbstractParty, HashMap<AbstractParty, Long>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'mapOf' @ [244:41] ==> @InlineOnly public inline fun <K, V> mapOf(): Map<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Map<AbstractParty, List<Pair<AbstractParty, Long>>>

'log' @ [246:17] ==> private val log: (Logger..Logger?) defined in net.corda.loadtest.tests in file CrossCashTest.kt[PropertyDescriptorImpl]

'info' @ [246:21] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'previousState' @ [246:29] ==> value-parameter previousState: CrossCashState? defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'diffQueues' @ [246:43] ==> public final val diffQueues: Map<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>> defined in net.corda.loadtest.tests.CrossCashState[PropertyDescriptorImpl]

'values' @ [246:54] ==> public abstract val values: Collection<Map<AbstractParty, List<Pair<AbstractParty, Long>>>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'sumBy' @ [246:61] ==> public inline fun <T> Iterable<Map<AbstractParty, List<Pair<AbstractParty, Long>>>>.sumBy(selector: (Map<AbstractParty, List<Pair<AbstractParty, Long>>>) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<AbstractParty, List<Pair<AbstractParty, Long>>>

'it' @ [246:69] ==> value-parameter it: Map<AbstractParty, List<Pair<AbstractParty, Long>>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'values' @ [246:72] ==> public abstract val values: Collection<List<Pair<AbstractParty, Long>>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'sumBy' @ [246:79] ==> public inline fun <T> Iterable<List<Pair<AbstractParty, Long>>>.sumBy(selector: (List<Pair<AbstractParty, Long>>) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Pair<AbstractParty, Long>>

'it' @ [246:87] ==> value-parameter it: List<Pair<AbstractParty, Long>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [246:90] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'previousState' @ [247:37] ==> value-parameter previousState: CrossCashState? defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'copyQueues' @ [247:51] ==> public final fun copyQueues(): HashMap<AbstractParty, HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>> defined in net.corda.loadtest.tests.CrossCashState[SimpleFunctionDescriptorImpl]

'previousState' @ [248:42] ==> value-parameter previousState: CrossCashState? defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'copyVaults' @ [248:56] ==> public final fun copyVaults(): HashMap<AbstractParty, HashMap<AbstractParty, Long>> defined in net.corda.loadtest.tests.CrossCashState[SimpleFunctionDescriptorImpl]

'previousState' @ [249:17] ==> value-parameter previousState: CrossCashState? defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'diffQueues' @ [249:31] ==> public final val diffQueues: Map<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>> defined in net.corda.loadtest.tests.CrossCashState[PropertyDescriptorImpl]

'forEach' @ [249:42] ==> @HidesMembers public inline fun <K, V> Map<out AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>>.forEach(action: (Map.Entry<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Map<AbstractParty, List<Pair<AbstractParty, Long>>>

'component1' @ [250:26] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>>.component1(): AbstractParty defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Map<AbstractParty, List<Pair<AbstractParty, Long>>>

'component2' @ [250:32] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>>.component2(): Map<AbstractParty, List<Pair<AbstractParty, Long>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Map<AbstractParty, List<Pair<AbstractParty, Long>>>

'entry' @ [250:42] ==> value-parameter entry: Map.Entry<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'currentNodeVaults' @ [251:41] ==> val currentNodeVaults: HashMap<AbstractParty, HashMap<AbstractParty, Long>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'node' @ [251:59] ==> val node: AbstractParty defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'previousState' @ [252:37] ==> value-parameter previousState: CrossCashState? defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'nodeVaults' @ [252:51] ==> public final val nodeVaults: Map<AbstractParty, Map<AbstractParty, Long>> defined in net.corda.loadtest.tests.CrossCashState[PropertyDescriptorImpl]

'node' @ [252:62] ==> val node: AbstractParty defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'if (searchedState != null) {
                        val matches = searchForState(searchedState, baseState ?: mapOf(), queues)
                        if (matches.isEmpty()) {
                            log.warn(
                                    "Divergence detected, the remote state doesn't match any of our possible predictions." +
                                            "\nPredicted state/queues:\n$previousState" +
                                            "\nActual gathered state:\n${CrossCashState(currentNodeVaults, mapOf())}"
                            )
                            // TODO We should terminate here with an exception, we cannot carry on as we have an inconsistent model. We carry on currently because we always diverge due to notarisation failures
                            return@LoadTest CrossCashState(currentNodeVaults, mapOf<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>>())
                        }
                        if (matches.size > 1) {
                            log.warn("Multiple predicted states match the remote state")
                        }
                        val minimumMatches = matches.fold<Map<AbstractParty, Int>, HashMap<AbstractParty, Int>?>(null) { minimum, next ->
                            if (minimum == null) {
                                HashMap(next)
                            } else {
                                next.forEach { minimum.merge(it.key, it.value, Math::min) }
                                minimum
                            }
                        }!!
                        // Now compute the new consistent state
                        val newNodeDiffQueues = newDiffQueues[node]
                        val newNodeVault = newConsistentVault.getOrPut(node) { HashMap() }
                        minimumMatches.forEach { originator, consumedTxs ->
                            if (consumedTxs > 0) {
                                newNodeDiffQueues!!
                                for (i in 0..consumedTxs - 1) {
                                    val (issuer, quantity) = newNodeDiffQueues[originator]!!.removeAt(0)
                                    newNodeVault.put(issuer, (newNodeVault[issuer] ?: 0L) + quantity)
                                }
                            }
                        }
                    } else {
                        require(baseState == null)
                    }' @ [253:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'searchedState' @ [253:25] ==> val searchedState: HashMap<AbstractParty, Long>? defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'searchForState' @ [254:39] ==> private fun <A> searchForState(searchedState: Map<AbstractParty, Long>, baseState: Map<AbstractParty, Long>, diffQueues: Map<AbstractParty, List<Pair<AbstractParty, Long>>>): List<Map<AbstractParty, Int>> defined in net.corda.loadtest.tests[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> AbstractParty

'searchedState' @ [254:54] ==> val searchedState: HashMap<AbstractParty, Long>? defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'baseState' @ [254:69] ==> val baseState: Map<AbstractParty, Long>? defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'mapOf' @ [254:82] ==> @InlineOnly public inline fun <K, V> mapOf(): Map<AbstractParty, Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Long

'queues' @ [254:91] ==> val queues: Map<AbstractParty, List<Pair<AbstractParty, Long>>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'matches' @ [255:29] ==> val matches: List<Map<AbstractParty, Int>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [255:37] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'log' @ [256:29] ==> private val log: (Logger..Logger?) defined in net.corda.loadtest.tests in file CrossCashTest.kt[PropertyDescriptorImpl]

'warn' @ [256:33] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'+' @ [257:37] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'previousState' @ [258:74] ==> value-parameter previousState: CrossCashState? defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'CrossCashState' @ [259:74] ==> public constructor CrossCashState(nodeVaults: Map<AbstractParty, Map<AbstractParty, Long>>, diffQueues: Map<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>>) defined in net.corda.loadtest.tests.CrossCashState[ClassConstructorDescriptorImpl]

'currentNodeVaults' @ [259:89] ==> val currentNodeVaults: HashMap<AbstractParty, HashMap<AbstractParty, Long>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'mapOf' @ [259:108] ==> @InlineOnly public inline fun <K, V> mapOf(): Map<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Map<AbstractParty, List<Pair<AbstractParty, Long>>>

'CrossCashState' @ [262:45] ==> public constructor CrossCashState(nodeVaults: Map<AbstractParty, Map<AbstractParty, Long>>, diffQueues: Map<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>>) defined in net.corda.loadtest.tests.CrossCashState[ClassConstructorDescriptorImpl]

'currentNodeVaults' @ [262:60] ==> val currentNodeVaults: HashMap<AbstractParty, HashMap<AbstractParty, Long>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'mapOf' @ [262:79] ==> @InlineOnly public inline fun <K, V> mapOf(): Map<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Map<AbstractParty, List<Pair<AbstractParty, Long>>>

'matches' @ [264:29] ==> val matches: List<Map<AbstractParty, Int>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'size' @ [264:37] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'log' @ [265:29] ==> private val log: (Logger..Logger?) defined in net.corda.loadtest.tests in file CrossCashTest.kt[PropertyDescriptorImpl]

'warn' @ [265:33] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'matches' @ [267:46] ==> val matches: List<Map<AbstractParty, Int>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'fold' @ [267:54] ==> public inline fun <T, R> Iterable<Map<AbstractParty, Int>>.fold(initial: HashMap<AbstractParty, Int>?, operation: (acc: HashMap<AbstractParty, Int>?, Map<AbstractParty, Int>) -> HashMap<AbstractParty, Int>?): HashMap<AbstractParty, Int>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<AbstractParty, Int>
    <R> -> HashMap<AbstractParty, Int>?

'if (minimum == null) {
                                HashMap(next)
                            } else {
                                next.forEach { minimum.merge(it.key, it.value, Math::min) }
                                minimum
                            }' @ [268:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: HashMap<AbstractParty, Int>?, elseBranch: HashMap<AbstractParty, Int>?): HashMap<AbstractParty, Int>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> HashMap<AbstractParty, Int>?

'minimum' @ [268:33] ==> value-parameter minimum: HashMap<AbstractParty, Int>? defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'HashMap' @ [269:33] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>(p0: (MutableMap<out (AbstractParty..AbstractParty?), out (Int..Int?)>..Map<out (AbstractParty..AbstractParty?), (Int..Int?)>?)) defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> AbstractParty
    <V : (Any..Any?)> -> Int

'next' @ [269:41] ==> value-parameter next: Map<AbstractParty, Int> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'next' @ [271:33] ==> value-parameter next: Map<AbstractParty, Int> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [271:38] ==> @HidesMembers public inline fun <K, V> Map<out AbstractParty, Int>.forEach(action: (Map.Entry<AbstractParty, Int>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Int

'minimum' @ [271:48] ==> value-parameter minimum: HashMap<AbstractParty, Int>? defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'merge' @ [271:56] ==> public final fun merge(p0: AbstractParty, p1: Int, p2: (Int, Int) -> Int?): Int? defined in java.util.HashMap[MyFunctionDescriptor]

'it' @ [271:62] ==> value-parameter it: Map.Entry<AbstractParty, Int> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [271:65] ==> public abstract val key: AbstractParty defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [271:70] ==> value-parameter it: Map.Entry<AbstractParty, Int> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [271:73] ==> public abstract val value: Int defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'Math' @ [271:80] ==> private constructor Math() defined in java.lang.Math[JavaClassConstructorDescriptor]

'min' @ [271:86] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'minimum' @ [272:33] ==> value-parameter minimum: HashMap<AbstractParty, Int>? defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'newDiffQueues' @ [276:49] ==> val newDiffQueues: HashMap<AbstractParty, HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'node' @ [276:63] ==> val node: AbstractParty defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'newConsistentVault' @ [277:44] ==> val newConsistentVault: HashMap<AbstractParty, HashMap<AbstractParty, Long>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'getOrPut' @ [277:63] ==> public inline fun <K, V> MutableMap<AbstractParty, HashMap<AbstractParty, Long>>.getOrPut(key: AbstractParty, defaultValue: () -> HashMap<AbstractParty, Long>): HashMap<AbstractParty, Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> HashMap<AbstractParty, Long>

'node' @ [277:72] ==> val node: AbstractParty defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'HashMap' @ [277:80] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> AbstractParty
    <V : (Any..Any?)> -> Long

'minimumMatches' @ [278:25] ==> val minimumMatches: HashMap<AbstractParty, Int> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'forEach' @ [278:40] ==> public final fun forEach(p0: (AbstractParty, Int) -> Unit): Unit defined in java.util.HashMap[MyFunctionDescriptor]

'consumedTxs' @ [279:33] ==> value-parameter consumedTxs: Int defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'newNodeDiffQueues' @ [280:33] ==> val newNodeDiffQueues: HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>? defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'..' @ [281:43] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'consumedTxs' @ [281:46] ==> value-parameter consumedTxs: Int defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [282:42] ==> public final operator fun component1(): AbstractParty defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [282:50] ==> public final operator fun component2(): Long defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'newNodeDiffQueues' @ [282:62] ==> val newNodeDiffQueues: HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>? defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'originator' @ [282:80] ==> value-parameter originator: AbstractParty defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'removeAt' @ [282:94] ==> public open fun removeAt(p0: Int): Pair<AbstractParty, Long> defined in java.util.ArrayList[JavaMethodDescriptor]

'newNodeVault' @ [283:37] ==> val newNodeVault: HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'put' @ [283:50] ==> public open fun put(key: AbstractParty, value: Long): Long? defined in java.util.HashMap[JavaMethodDescriptor]

'issuer' @ [283:54] ==> val issuer: AbstractParty defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'+' @ [283:62] ==> public final operator fun plus(other: Long): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'newNodeVault' @ [283:63] ==> val newNodeVault: HashMap<AbstractParty, Long> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'issuer' @ [283:76] ==> val issuer: AbstractParty defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'quantity' @ [283:93] ==> val quantity: Long defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'require' @ [288:25] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'baseState' @ [288:33] ==> val baseState: Map<AbstractParty, Long>? defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'Pair' @ [291:17] ==> public constructor Pair<out A, out B>(first: HashMap<AbstractParty, HashMap<AbstractParty, Long>>, second: HashMap<AbstractParty, HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> HashMap<AbstractParty, HashMap<AbstractParty, Long>>
    <out B> -> HashMap<AbstractParty, HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>>

'newConsistentVault' @ [291:22] ==> val newConsistentVault: HashMap<AbstractParty, HashMap<AbstractParty, Long>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'newDiffQueues' @ [291:42] ==> val newDiffQueues: HashMap<AbstractParty, HashMap<AbstractParty, ArrayList<Pair<AbstractParty, Long>>>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'CrossCashState' @ [293:13] ==> public constructor CrossCashState(nodeVaults: Map<AbstractParty, Map<AbstractParty, Long>>, diffQueues: Map<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>>) defined in net.corda.loadtest.tests.CrossCashState[ClassConstructorDescriptorImpl]

'consistentVaults' @ [293:28] ==> val consistentVaults: HashMap<AbstractParty, HashMap<AbstractParty, Long>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'diffQueues' @ [293:46] ==> val diffQueues: Map<(AbstractParty..AbstractParty?), (Map<AbstractParty, (List<Pair<AbstractParty, Long>>..List<Pair<AbstractParty, Long>>?)>..Map<AbstractParty, (List<Pair<AbstractParty, Long>>..List<Pair<AbstractParty, Long>>?)>?)> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[LocalVariableDescriptor]

'state' @ [297:13] ==> value-parameter state: CrossCashState defined in net.corda.loadtest.tests.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'diffQueues' @ [297:19] ==> public final val diffQueues: Map<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>> defined in net.corda.loadtest.tests.CrossCashState[PropertyDescriptorImpl]

'all' @ [297:30] ==> public inline fun <K, V> Map<out AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>>.all(predicate: (Map.Entry<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Map<AbstractParty, List<Pair<AbstractParty, Long>>>

'it' @ [297:36] ==> value-parameter it: Map.Entry<AbstractParty, Map<AbstractParty, List<Pair<AbstractParty, Long>>>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [297:39] ==> public abstract val value: Map<AbstractParty, List<Pair<AbstractParty, Long>>> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'all' @ [297:45] ==> public inline fun <K, V> Map<out AbstractParty, List<Pair<AbstractParty, Long>>>.all(predicate: (Map.Entry<AbstractParty, List<Pair<AbstractParty, Long>>>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> List<Pair<AbstractParty, Long>>

'it' @ [297:51] ==> value-parameter it: Map.Entry<AbstractParty, List<Pair<AbstractParty, Long>>> defined in net.corda.loadtest.tests.crossCashTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [297:54] ==> public abstract val value: List<Pair<AbstractParty, Long>> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'isEmpty' @ [297:60] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'diffQueues' @ [313:26] ==> value-parameter diffQueues: Map<A, List<Pair<A, Long>>> defined in net.corda.loadtest.tests.searchForState[ValueParameterDescriptorImpl]

'toList' @ [313:37] ==> public fun <K, V> Map<out A, List<Pair<A, Long>>>.toList(): List<Pair<A, List<Pair<A, Long>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> A
    <V> -> List<Pair<A, Long>>

'if (diffIx >= diffQueuesList.size) {
            if (state == searchedState) {
                matched.add(HashMap(consumedTxs))
            }
        } else {
            val (originator, queue) = diffQueuesList[diffIx]
            consumedTxs[originator] = 0
            searchForStateHelper(state, diffIx + 1, consumedTxs, matched)
            var currentState = state
            queue.forEachIndexed { index, (issuer, quantity) ->
                consumedTxs[originator] = index + 1
                // Prune search if we exceeded the searched quantity anyway
                currentState = applyDiff(issuer, quantity, currentState, searchedState) ?: return
                searchForStateHelper(currentState, diffIx + 1, consumedTxs, matched)
            }
        }' @ [315:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'diffIx' @ [315:13] ==> value-parameter diffIx: Int defined in net.corda.loadtest.tests.searchForState.searchForStateHelper[ValueParameterDescriptorImpl]

'diffQueuesList' @ [315:23] ==> val diffQueuesList: List<Pair<A, List<Pair<A, Long>>>> defined in net.corda.loadtest.tests.searchForState[LocalVariableDescriptor]

'size' @ [315:38] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'state' @ [316:17] ==> value-parameter state: Map<A, Long> defined in net.corda.loadtest.tests.searchForState.searchForStateHelper[ValueParameterDescriptorImpl]

'searchedState' @ [316:26] ==> value-parameter searchedState: Map<A, Long> defined in net.corda.loadtest.tests.searchForState[ValueParameterDescriptorImpl]

'matched' @ [317:17] ==> value-parameter matched: ArrayList<Map<A, Int>> defined in net.corda.loadtest.tests.searchForState.searchForStateHelper[ValueParameterDescriptorImpl]

'add' @ [317:25] ==> public open fun add(element: Map<A, Int>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'HashMap' @ [317:29] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>(p0: (MutableMap<out (A..A?), out (Int..Int?)>..Map<out (A..A?), (Int..Int?)>?)) defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> A
    <V : (Any..Any?)> -> (kotlin.Int..kotlin.Int?)

'consumedTxs' @ [317:37] ==> value-parameter consumedTxs: HashMap<A, Int> defined in net.corda.loadtest.tests.searchForState.searchForStateHelper[ValueParameterDescriptorImpl]

'component1' @ [320:18] ==> public final operator fun component1(): A defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [320:30] ==> public final operator fun component2(): List<Pair<A, Long>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'diffQueuesList' @ [320:39] ==> val diffQueuesList: List<Pair<A, List<Pair<A, Long>>>> defined in net.corda.loadtest.tests.searchForState[LocalVariableDescriptor]

'diffIx' @ [320:54] ==> value-parameter diffIx: Int defined in net.corda.loadtest.tests.searchForState.searchForStateHelper[ValueParameterDescriptorImpl]

'consumedTxs' @ [321:13] ==> value-parameter consumedTxs: HashMap<A, Int> defined in net.corda.loadtest.tests.searchForState.searchForStateHelper[ValueParameterDescriptorImpl]

'originator' @ [321:25] ==> val originator: A defined in net.corda.loadtest.tests.searchForState.searchForStateHelper[LocalVariableDescriptor]

'searchForStateHelper' @ [322:13] ==> local final fun searchForStateHelper(state: Map<A, Long>, diffIx: Int, consumedTxs: HashMap<A, Int>, matched: ArrayList<Map<A, Int>>): Unit defined in net.corda.loadtest.tests.searchForState[SimpleFunctionDescriptorImpl]

'state' @ [322:34] ==> value-parameter state: Map<A, Long> defined in net.corda.loadtest.tests.searchForState.searchForStateHelper[ValueParameterDescriptorImpl]

'diffIx' @ [322:41] ==> value-parameter diffIx: Int defined in net.corda.loadtest.tests.searchForState.searchForStateHelper[ValueParameterDescriptorImpl]

'consumedTxs' @ [322:53] ==> value-parameter consumedTxs: HashMap<A, Int> defined in net.corda.loadtest.tests.searchForState.searchForStateHelper[ValueParameterDescriptorImpl]

'matched' @ [322:66] ==> value-parameter matched: ArrayList<Map<A, Int>> defined in net.corda.loadtest.tests.searchForState.searchForStateHelper[ValueParameterDescriptorImpl]

'state' @ [323:32] ==> value-parameter state: Map<A, Long> defined in net.corda.loadtest.tests.searchForState.searchForStateHelper[ValueParameterDescriptorImpl]

'queue' @ [324:13] ==> val queue: List<Pair<A, Long>> defined in net.corda.loadtest.tests.searchForState.searchForStateHelper[LocalVariableDescriptor]

'forEachIndexed' @ [324:19] ==> public inline fun <T> Iterable<Pair<A, Long>>.forEachIndexed(action: (index: Int, Pair<A, Long>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<A, Long>

'component1' @ [324:44] ==> public final operator fun component1(): A defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [324:52] ==> public final operator fun component2(): Long defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'consumedTxs' @ [325:17] ==> value-parameter consumedTxs: HashMap<A, Int> defined in net.corda.loadtest.tests.searchForState.searchForStateHelper[ValueParameterDescriptorImpl]

'originator' @ [325:29] ==> val originator: A defined in net.corda.loadtest.tests.searchForState.searchForStateHelper[LocalVariableDescriptor]

'index' @ [325:43] ==> value-parameter index: Int defined in net.corda.loadtest.tests.searchForState.searchForStateHelper.<anonymous>[ValueParameterDescriptorImpl]

'currentState' @ [327:17] ==> var currentState: Map<A, Long> defined in net.corda.loadtest.tests.searchForState.searchForStateHelper[LocalVariableDescriptor]

'applyDiff' @ [327:32] ==> private fun <A> applyDiff(issuer: A, quantity: Long, state: Map<A, Long>, searchedState: Map<A, Long>): Map<A, Long>? defined in net.corda.loadtest.tests[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> A

'issuer' @ [327:42] ==> val issuer: A defined in net.corda.loadtest.tests.searchForState.searchForStateHelper.<anonymous>[LocalVariableDescriptor]

'quantity' @ [327:50] ==> val quantity: Long defined in net.corda.loadtest.tests.searchForState.searchForStateHelper.<anonymous>[LocalVariableDescriptor]

'currentState' @ [327:60] ==> var currentState: Map<A, Long> defined in net.corda.loadtest.tests.searchForState.searchForStateHelper[LocalVariableDescriptor]

'searchedState' @ [327:74] ==> value-parameter searchedState: Map<A, Long> defined in net.corda.loadtest.tests.searchForState[ValueParameterDescriptorImpl]

'searchForStateHelper' @ [328:17] ==> local final fun searchForStateHelper(state: Map<A, Long>, diffIx: Int, consumedTxs: HashMap<A, Int>, matched: ArrayList<Map<A, Int>>): Unit defined in net.corda.loadtest.tests.searchForState[SimpleFunctionDescriptorImpl]

'currentState' @ [328:38] ==> var currentState: Map<A, Long> defined in net.corda.loadtest.tests.searchForState.searchForStateHelper[LocalVariableDescriptor]

'diffIx' @ [328:52] ==> value-parameter diffIx: Int defined in net.corda.loadtest.tests.searchForState.searchForStateHelper[ValueParameterDescriptorImpl]

'consumedTxs' @ [328:64] ==> value-parameter consumedTxs: HashMap<A, Int> defined in net.corda.loadtest.tests.searchForState.searchForStateHelper[ValueParameterDescriptorImpl]

'matched' @ [328:77] ==> value-parameter matched: ArrayList<Map<A, Int>> defined in net.corda.loadtest.tests.searchForState.searchForStateHelper[ValueParameterDescriptorImpl]

'ArrayList' @ [333:19] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Map<A, Int>

'searchForStateHelper' @ [334:5] ==> local final fun searchForStateHelper(state: Map<A, Long>, diffIx: Int, consumedTxs: HashMap<A, Int>, matched: ArrayList<Map<A, Int>>): Unit defined in net.corda.loadtest.tests.searchForState[SimpleFunctionDescriptorImpl]

'baseState' @ [334:26] ==> value-parameter baseState: Map<A, Long> defined in net.corda.loadtest.tests.searchForState[ValueParameterDescriptorImpl]

'HashMap' @ [334:40] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> A
    <V : (Any..Any?)> -> Int

'matched' @ [334:51] ==> val matched: ArrayList<Map<A, Int>> defined in net.corda.loadtest.tests.searchForState[LocalVariableDescriptor]

'matched' @ [335:12] ==> val matched: ArrayList<Map<A, Int>> defined in net.corda.loadtest.tests.searchForState[LocalVariableDescriptor]

'HashMap' @ [345:20] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>(p0: (MutableMap<out (A..A?), out (Long..Long?)>..Map<out (A..A?), (Long..Long?)>?)) defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (A..A?)
    <V : (Any..Any?)> -> (kotlin.Long..kotlin.Long?)

'state' @ [345:28] ==> value-parameter state: Map<A, Long> defined in net.corda.loadtest.tests.applyDiff[ValueParameterDescriptorImpl]

'+' @ [346:23] ==> public final operator fun plus(other: Long): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'newState' @ [346:24] ==> val newState: HashMap<(A..A?), (Long..Long?)> defined in net.corda.loadtest.tests.applyDiff[LocalVariableDescriptor]

'issuer' @ [346:33] ==> value-parameter issuer: A defined in net.corda.loadtest.tests.applyDiff[ValueParameterDescriptorImpl]

'quantity' @ [346:50] ==> value-parameter quantity: Long defined in net.corda.loadtest.tests.applyDiff[ValueParameterDescriptorImpl]

'searchedState' @ [347:28] ==> value-parameter searchedState: Map<A, Long> defined in net.corda.loadtest.tests.applyDiff[ValueParameterDescriptorImpl]

'issuer' @ [347:42] ==> value-parameter issuer: A defined in net.corda.loadtest.tests.applyDiff[ValueParameterDescriptorImpl]

'searchedQuantity' @ [348:9] ==> val searchedQuantity: Long? defined in net.corda.loadtest.tests.applyDiff[LocalVariableDescriptor]

'newQuantity' @ [348:37] ==> val newQuantity: Long defined in net.corda.loadtest.tests.applyDiff[LocalVariableDescriptor]

'searchedQuantity' @ [348:51] ==> val searchedQuantity: Long? defined in net.corda.loadtest.tests.applyDiff[LocalVariableDescriptor]

'newState' @ [351:5] ==> val newState: HashMap<(A..A?), (Long..Long?)> defined in net.corda.loadtest.tests.applyDiff[LocalVariableDescriptor]

'put' @ [351:14] ==> public open fun put(key: (A..A?), value: (Long..Long?)): Long? defined in java.util.HashMap[JavaMethodDescriptor]

'issuer' @ [351:18] ==> value-parameter issuer: A defined in net.corda.loadtest.tests.applyDiff[ValueParameterDescriptorImpl]

'newQuantity' @ [351:26] ==> val newQuantity: Long defined in net.corda.loadtest.tests.applyDiff[LocalVariableDescriptor]

'newState' @ [352:12] ==> val newState: HashMap<(A..A?), (Long..Long?)> defined in net.corda.loadtest.tests.applyDiff[LocalVariableDescriptor]

