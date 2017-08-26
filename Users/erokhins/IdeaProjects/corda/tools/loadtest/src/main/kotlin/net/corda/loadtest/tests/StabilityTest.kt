'loggerFor' @ [22:23] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> StabilityTest

'LoadTest' @ [23:43] ==> public constructor LoadTest<T, S>(testName: String, generate: Nodes.(Unit, Int) -> Generator<List<CrossCashCommand>>, interpret: (Unit, CrossCashCommand) -> Unit, execute: Nodes.(CrossCashCommand) -> Unit, gatherRemoteState: Nodes.(Unit?) -> Unit, isConsistent: (Unit) -> Boolean = ...) defined in net.corda.loadtest.LoadTest[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> CrossCashCommand
    <S> -> Unit

'simpleNodes' @ [26:32] ==> public final val simpleNodes: List<NodeConnection> defined in net.corda.loadtest.Nodes[PropertyDescriptorImpl]

'flatMap' @ [26:44] ==> public inline fun <T, R> Iterable<NodeConnection>.flatMap(transform: (NodeConnection) -> Iterable<Pair<NodeConnection, NodeConnection>>): List<Pair<NodeConnection, NodeConnection>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeConnection
    <R> -> Pair<NodeConnection, NodeConnection>

'simpleNodes' @ [26:63] ==> public final val simpleNodes: List<NodeConnection> defined in net.corda.loadtest.Nodes[PropertyDescriptorImpl]

'map' @ [26:75] ==> public inline fun <T, R> Iterable<NodeConnection>.map(transform: (NodeConnection) -> Pair<NodeConnection, NodeConnection>): List<Pair<NodeConnection, NodeConnection>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeConnection
    <R> -> Pair<NodeConnection, NodeConnection>

'payer' @ [26:81] ==> value-parameter payer: NodeConnection defined in net.corda.loadtest.tests.StabilityTest.crossCashTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [26:90] ==> value-parameter it: NodeConnection defined in net.corda.loadtest.tests.StabilityTest.crossCashTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [27:26] ==> public inline fun <T> Iterable<Pair<NodeConnection, NodeConnection>>.filter(predicate: (Pair<NodeConnection, NodeConnection>) -> Boolean): List<Pair<NodeConnection, NodeConnection>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<NodeConnection, NodeConnection>

'it' @ [27:35] ==> value-parameter it: Pair<NodeConnection, NodeConnection> defined in net.corda.loadtest.tests.StabilityTest.crossCashTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [27:38] ==> public final val first: NodeConnection defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [27:47] ==> value-parameter it: Pair<NodeConnection, NodeConnection> defined in net.corda.loadtest.tests.StabilityTest.crossCashTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [27:50] ==> public final val second: NodeConnection defined in kotlin.Pair[DeserializedPropertyDescriptor]

'map' @ [28:26] ==> public inline fun <T, R> Iterable<Pair<NodeConnection, NodeConnection>>.map(transform: (Pair<NodeConnection, NodeConnection>) -> CrossCashCommand): List<CrossCashCommand> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<NodeConnection, NodeConnection>
    <R> -> CrossCashCommand

'component1' @ [28:33] ==> public final operator fun component1(): NodeConnection defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [28:40] ==> public final operator fun component2(): NodeConnection defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'CrossCashCommand' @ [28:50] ==> public constructor CrossCashCommand(request: AbstractCashFlow.AbstractRequest, node: NodeConnection) defined in net.corda.loadtest.tests.CrossCashCommand[ClassConstructorDescriptorImpl]

'PaymentRequest' @ [28:67] ==> public constructor PaymentRequest(amount: Amount<Currency>, recipient: Party, anonymous: Boolean, issuerConstraint: Set<Party> = ...) defined in net.corda.finance.flows.CashPaymentFlow.PaymentRequest[DeserializedClassConstructorDescriptor]

'Amount' @ [28:82] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'USD' @ [28:92] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'payee' @ [28:98] ==> val payee: NodeConnection defined in net.corda.loadtest.tests.StabilityTest.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'info' @ [28:104] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'legalIdentity' @ [28:109] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'payer' @ [28:143] ==> val payer: NodeConnection defined in net.corda.loadtest.tests.StabilityTest.crossCashTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'Generator' @ [29:17] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'pure' @ [29:27] ==> public final fun <A> pure(value: List<CrossCashCommand>): Generator<List<CrossCashCommand>> defined in net.corda.client.mock.Generator.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> List<CrossCashCommand>

'List' @ [29:32] ==> @SinceKotlin @InlineOnly public inline fun <T> List(size: Int, init: (index: Int) -> List<CrossCashCommand>): List<List<CrossCashCommand>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<CrossCashCommand>

'replication' @ [29:37] ==> value-parameter replication: Int defined in net.corda.loadtest.tests.StabilityTest.crossCashTest[ValueParameterDescriptorImpl]

'payments' @ [29:52] ==> val payments: List<CrossCashCommand> defined in net.corda.loadtest.tests.StabilityTest.crossCashTest.<anonymous>[LocalVariableDescriptor]

'flatten' @ [29:63] ==> public fun <T> Iterable<Iterable<CrossCashCommand>>.flatten(): List<CrossCashCommand> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CrossCashCommand

'command' @ [33:31] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.StabilityTest.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'request' @ [33:39] ==> public final val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'when (request) {
                    is IssueAndPaymentRequest -> command.node.proxy.startFlow(::CashIssueAndPaymentFlow, request).returnValue
                    is PaymentRequest -> command.node.proxy.startFlow(::CashPaymentFlow, request).returnValue
                    is ExitRequest -> command.node.proxy.startFlow(::CashExitFlow, request).returnValue
                    else -> throw IllegalArgumentException("Unexpected request type: $request")
                }' @ [34:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CordaFuture<AbstractCashFlow.Result>, entry1: CordaFuture<AbstractCashFlow.Result>, entry2: CordaFuture<AbstractCashFlow.Result>, entry3: CordaFuture<AbstractCashFlow.Result>): CordaFuture<AbstractCashFlow.Result>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CordaFuture<Result>

'request' @ [34:36] ==> val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.StabilityTest.crossCashTest.<anonymous>[LocalVariableDescriptor]

'command' @ [35:50] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.StabilityTest.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [35:58] ==> public final val node: NodeConnection defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'proxy' @ [35:63] ==> public final val proxy: CordaRPCOps defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'startFlow' @ [35:69] ==> public inline fun <T : Any, A, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (CashIssueAndPaymentFlow.IssueAndPaymentRequest) -> CashIssueAndPaymentFlow, arg0: CashIssueAndPaymentFlow.IssueAndPaymentRequest): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> IssueAndPaymentRequest
    <reified R : FlowLogic<T>> -> CashIssueAndPaymentFlow

'CashIssueAndPaymentFlow' @ [35:81] ==> public constructor CashIssueAndPaymentFlow(request: CashIssueAndPaymentFlow.IssueAndPaymentRequest) defined in net.corda.finance.flows.CashIssueAndPaymentFlow[DeserializedClassConstructorDescriptor]

'request' @ [35:106] ==> val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.StabilityTest.crossCashTest.<anonymous>[LocalVariableDescriptor]

'returnValue' @ [35:115] ==> public abstract val returnValue: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'command' @ [36:42] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.StabilityTest.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [36:50] ==> public final val node: NodeConnection defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'proxy' @ [36:55] ==> public final val proxy: CordaRPCOps defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'startFlow' @ [36:61] ==> public inline fun <T : Any, A, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (CashPaymentFlow.PaymentRequest) -> CashPaymentFlow, arg0: CashPaymentFlow.PaymentRequest): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> PaymentRequest
    <reified R : FlowLogic<T>> -> CashPaymentFlow

'CashPaymentFlow' @ [36:73] ==> public constructor CashPaymentFlow(request: CashPaymentFlow.PaymentRequest) defined in net.corda.finance.flows.CashPaymentFlow[DeserializedClassConstructorDescriptor]

'request' @ [36:90] ==> val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.StabilityTest.crossCashTest.<anonymous>[LocalVariableDescriptor]

'returnValue' @ [36:99] ==> public abstract val returnValue: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'command' @ [37:39] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.StabilityTest.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [37:47] ==> public final val node: NodeConnection defined in net.corda.loadtest.tests.CrossCashCommand[PropertyDescriptorImpl]

'proxy' @ [37:52] ==> public final val proxy: CordaRPCOps defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'startFlow' @ [37:58] ==> public inline fun <T : Any, A, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (CashExitFlow.ExitRequest) -> CashExitFlow, arg0: CashExitFlow.ExitRequest): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> ExitRequest
    <reified R : FlowLogic<T>> -> CashExitFlow

'CashExitFlow' @ [37:70] ==> public constructor CashExitFlow(request: CashExitFlow.ExitRequest) defined in net.corda.finance.flows.CashExitFlow[DeserializedClassConstructorDescriptor]

'request' @ [37:84] ==> val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.StabilityTest.crossCashTest.<anonymous>[LocalVariableDescriptor]

'returnValue' @ [37:93] ==> public abstract val returnValue: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'IllegalArgumentException' @ [38:35] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'request' @ [38:87] ==> val request: AbstractCashFlow.AbstractRequest defined in net.corda.loadtest.tests.StabilityTest.crossCashTest.<anonymous>[LocalVariableDescriptor]

'result' @ [40:17] ==> val result: CordaFuture<AbstractCashFlow.Result> defined in net.corda.loadtest.tests.StabilityTest.crossCashTest.<anonymous>[LocalVariableDescriptor]

'thenMatch' @ [40:24] ==> public fun <V, W, X> CordaFuture<out AbstractCashFlow.Result>.thenMatch(success: (AbstractCashFlow.Result) -> Unit, failure: (Throwable) -> Unit): Unit defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result
    <W> -> Unit
    <X> -> Unit

'log' @ [41:21] ==> private final val log: Logger defined in net.corda.loadtest.tests.StabilityTest[PropertyDescriptorImpl]

'info' @ [41:25] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'command' @ [41:40] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.StabilityTest.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [41:51] ==> val result: CordaFuture<AbstractCashFlow.Result> defined in net.corda.loadtest.tests.StabilityTest.crossCashTest.<anonymous>[LocalVariableDescriptor]

'log' @ [43:21] ==> private final val log: Logger defined in net.corda.loadtest.tests.StabilityTest[PropertyDescriptorImpl]

'error' @ [43:25] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'command' @ [43:41] ==> value-parameter command: CrossCashCommand defined in net.corda.loadtest.tests.StabilityTest.crossCashTest.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [43:52] ==> value-parameter it: Throwable defined in net.corda.loadtest.tests.StabilityTest.crossCashTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'LoadTest' @ [49:43] ==> public constructor LoadTest<T, S>(testName: String, generate: Nodes.(Unit, Int) -> Generator<List<SelfIssueCommand>>, interpret: (Unit, SelfIssueCommand) -> Unit, execute: Nodes.(SelfIssueCommand) -> Unit, gatherRemoteState: Nodes.(Unit?) -> Unit, isConsistent: (Unit) -> Boolean = ...) defined in net.corda.loadtest.LoadTest[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> SelfIssueCommand
    <S> -> Unit

'simpleNodes' @ [54:25] ==> public final val simpleNodes: List<NodeConnection> defined in net.corda.loadtest.Nodes[PropertyDescriptorImpl]

'map' @ [54:37] ==> public inline fun <T, R> Iterable<NodeConnection>.map(transform: (NodeConnection) -> SelfIssueCommand): List<SelfIssueCommand> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeConnection
    <R> -> SelfIssueCommand

'SelfIssueCommand' @ [55:29] ==> public constructor SelfIssueCommand(request: CashIssueAndPaymentFlow.IssueAndPaymentRequest, node: NodeConnection) defined in net.corda.loadtest.tests.SelfIssueCommand[ClassConstructorDescriptorImpl]

'IssueAndPaymentRequest' @ [55:46] ==> public constructor IssueAndPaymentRequest(amount: Amount<Currency>, issueRef: OpaqueBytes, recipient: Party, notary: Party, anonymous: Boolean) defined in net.corda.finance.flows.CashIssueAndPaymentFlow.IssueAndPaymentRequest[DeserializedClassConstructorDescriptor]

'Amount' @ [55:69] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'USD' @ [55:84] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'of' @ [55:102] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'issuer' @ [55:109] ==> value-parameter issuer: NodeConnection defined in net.corda.loadtest.tests.StabilityTest.selfIssueTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [55:116] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'legalIdentity' @ [55:121] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'notary' @ [55:136] ==> public final val notary: NodeConnection defined in net.corda.loadtest.Nodes[PropertyDescriptorImpl]

'info' @ [55:143] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'notaryIdentity' @ [55:148] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'issuer' @ [55:183] ==> value-parameter issuer: NodeConnection defined in net.corda.loadtest.tests.StabilityTest.selfIssueTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Generator' @ [57:17] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'pure' @ [57:27] ==> public final fun <A> pure(value: List<SelfIssueCommand>): Generator<List<SelfIssueCommand>> defined in net.corda.client.mock.Generator.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> List<SelfIssueCommand>

'List' @ [57:32] ==> @SinceKotlin @InlineOnly public inline fun <T> List(size: Int, init: (index: Int) -> List<SelfIssueCommand>): List<List<SelfIssueCommand>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<SelfIssueCommand>

'replication' @ [57:37] ==> value-parameter replication: Int defined in net.corda.loadtest.tests.StabilityTest.selfIssueTest[ValueParameterDescriptorImpl]

'generateIssue' @ [57:52] ==> val generateIssue: List<SelfIssueCommand> defined in net.corda.loadtest.tests.StabilityTest.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'flatten' @ [57:68] ==> public fun <T> Iterable<Iterable<SelfIssueCommand>>.flatten(): List<SelfIssueCommand> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SelfIssueCommand

'component1' @ [60:26] ==> public final operator fun component1(): CashIssueAndPaymentFlow.IssueAndPaymentRequest defined in net.corda.loadtest.tests.SelfIssueCommand[SimpleFunctionDescriptorImpl]

'component2' @ [60:35] ==> public final operator fun component2(): NodeConnection defined in net.corda.loadtest.tests.SelfIssueCommand[SimpleFunctionDescriptorImpl]

'node' @ [62:34] ==> val node: NodeConnection defined in net.corda.loadtest.tests.StabilityTest.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'proxy' @ [62:39] ==> public final val proxy: CordaRPCOps defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'startFlow' @ [62:45] ==> public inline fun <T : Any, A, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (CashIssueAndPaymentFlow.IssueAndPaymentRequest) -> CashIssueAndPaymentFlow, arg0: CashIssueAndPaymentFlow.IssueAndPaymentRequest): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> IssueAndPaymentRequest
    <reified R : FlowLogic<T>> -> CashIssueAndPaymentFlow

'CashIssueAndPaymentFlow' @ [62:57] ==> public constructor CashIssueAndPaymentFlow(request: CashIssueAndPaymentFlow.IssueAndPaymentRequest) defined in net.corda.finance.flows.CashIssueAndPaymentFlow[DeserializedClassConstructorDescriptor]

'request' @ [62:82] ==> val request: CashIssueAndPaymentFlow.IssueAndPaymentRequest defined in net.corda.loadtest.tests.StabilityTest.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'returnValue' @ [62:91] ==> public abstract val returnValue: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'getOrThrow' @ [62:103] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'log' @ [63:21] ==> private final val log: Logger defined in net.corda.loadtest.tests.StabilityTest[PropertyDescriptorImpl]

'info' @ [63:25] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'result' @ [63:41] ==> val result: AbstractCashFlow.Result defined in net.corda.loadtest.tests.StabilityTest.selfIssueTest.<anonymous>[LocalVariableDescriptor]

'log' @ [65:21] ==> private final val log: Logger defined in net.corda.loadtest.tests.StabilityTest[PropertyDescriptorImpl]

'error' @ [65:25] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'e' @ [65:42] ==> val e: FlowException defined in net.corda.loadtest.tests.StabilityTest.selfIssueTest.<anonymous>[LocalVariableDescriptor]

