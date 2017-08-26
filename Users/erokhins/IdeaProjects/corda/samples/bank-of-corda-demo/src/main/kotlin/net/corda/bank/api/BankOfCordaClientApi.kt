'HttpApi' @ [25:19] ==> public companion object defined in net.corda.testing.http.HttpApi[FakeCallableDescriptorForObject]

'fromHostAndPort' @ [25:27] ==> public final fun fromHostAndPort(hostAndPort: NetworkHostAndPort, base: String, protocol: String = ..., mapper: ObjectMapper = ...): HttpApi defined in net.corda.testing.http.HttpApi.Companion[DeserializedSimpleFunctionDescriptor]

'hostAndPort' @ [25:43] ==> public final val hostAndPort: NetworkHostAndPort defined in net.corda.bank.api.BankOfCordaClientApi[PropertyDescriptorImpl]

'apiRoot' @ [25:56] ==> private final val apiRoot: String defined in net.corda.bank.api.BankOfCordaClientApi[PropertyDescriptorImpl]

'api' @ [26:16] ==> val api: HttpApi defined in net.corda.bank.api.BankOfCordaClientApi.requestWebIssue[LocalVariableDescriptor]

'postJson' @ [26:20] ==> public final fun postJson(path: String, data: Any = ...): Boolean defined in net.corda.testing.http.HttpApi[DeserializedSimpleFunctionDescriptor]

'params' @ [26:52] ==> value-parameter params: BankOfCordaWebApi.IssueRequestParams defined in net.corda.bank.api.BankOfCordaClientApi.requestWebIssue[ValueParameterDescriptorImpl]

'CordaRPCClient' @ [35:22] ==> public constructor CordaRPCClient(hostAndPort: NetworkHostAndPort, sslConfiguration: SSLConfiguration? = ..., configuration: CordaRPCClientConfiguration = ..., initialiseSerialization: Boolean = ...) defined in net.corda.client.rpc.CordaRPCClient[DeserializedClassConstructorDescriptor]

'hostAndPort' @ [35:37] ==> public final val hostAndPort: NetworkHostAndPort defined in net.corda.bank.api.BankOfCordaClientApi[PropertyDescriptorImpl]

'client' @ [37:9] ==> val client: CordaRPCClient defined in net.corda.bank.api.BankOfCordaClientApi.requestRPCIssue[LocalVariableDescriptor]

'start' @ [37:16] ==> public final fun start(username: String, password: String): CordaRPCConnection defined in net.corda.client.rpc.CordaRPCClient[DeserializedSimpleFunctionDescriptor]

'use' @ [37:42] ==> @InlineOnly public inline fun <T : Closeable?, R> CordaRPCConnection.use(block: (CordaRPCConnection) -> Nothing): Nothing defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> CordaRPCConnection
    <R> -> Nothing

'connection' @ [38:23] ==> value-parameter connection: CordaRPCConnection defined in net.corda.bank.api.BankOfCordaClientApi.requestRPCIssue.<anonymous>[ValueParameterDescriptorImpl]

'proxy' @ [38:34] ==> public open val proxy: CordaRPCOps defined in net.corda.client.rpc.CordaRPCConnection[DeserializedPropertyDescriptor]

'rpc' @ [41:32] ==> val rpc: CordaRPCOps defined in net.corda.bank.api.BankOfCordaClientApi.requestRPCIssue.<anonymous>[LocalVariableDescriptor]

'partyFromX500Name' @ [41:36] ==> public abstract fun partyFromX500Name(x500Name: X500Name): Party? defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'params' @ [41:54] ==> value-parameter params: BankOfCordaWebApi.IssueRequestParams defined in net.corda.bank.api.BankOfCordaClientApi.requestRPCIssue[ValueParameterDescriptorImpl]

'issueToPartyName' @ [41:61] ==> public final val issueToPartyName: X500Name defined in net.corda.bank.api.BankOfCordaWebApi.IssueRequestParams[PropertyDescriptorImpl]

'Exception' @ [42:30] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'params' @ [42:60] ==> value-parameter params: BankOfCordaWebApi.IssueRequestParams defined in net.corda.bank.api.BankOfCordaClientApi.requestRPCIssue[ValueParameterDescriptorImpl]

'issueToPartyName' @ [42:67] ==> public final val issueToPartyName: X500Name defined in net.corda.bank.api.BankOfCordaWebApi.IssueRequestParams[PropertyDescriptorImpl]

'rpc' @ [43:39] ==> val rpc: CordaRPCOps defined in net.corda.bank.api.BankOfCordaClientApi.requestRPCIssue.<anonymous>[LocalVariableDescriptor]

'partyFromX500Name' @ [43:43] ==> public abstract fun partyFromX500Name(x500Name: X500Name): Party? defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'params' @ [43:61] ==> value-parameter params: BankOfCordaWebApi.IssueRequestParams defined in net.corda.bank.api.BankOfCordaClientApi.requestRPCIssue[ValueParameterDescriptorImpl]

'notaryName' @ [43:68] ==> public final val notaryName: X500Name defined in net.corda.bank.api.BankOfCordaWebApi.IssueRequestParams[PropertyDescriptorImpl]

'IllegalStateException' @ [44:30] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'params' @ [44:72] ==> value-parameter params: BankOfCordaWebApi.IssueRequestParams defined in net.corda.bank.api.BankOfCordaClientApi.requestRPCIssue[ValueParameterDescriptorImpl]

'notaryName' @ [44:79] ==> public final val notaryName: X500Name defined in net.corda.bank.api.BankOfCordaWebApi.IssueRequestParams[PropertyDescriptorImpl]

'rpc' @ [45:30] ==> val rpc: CordaRPCOps defined in net.corda.bank.api.BankOfCordaClientApi.requestRPCIssue.<anonymous>[LocalVariableDescriptor]

'nodeIdentityFromParty' @ [45:34] ==> public abstract fun nodeIdentityFromParty(party: AbstractParty): NodeInfo? defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'notaryLegalIdentity' @ [45:56] ==> val notaryLegalIdentity: Party defined in net.corda.bank.api.BankOfCordaClientApi.requestRPCIssue.<anonymous>[LocalVariableDescriptor]

'IllegalStateException' @ [46:30] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'Amount' @ [48:26] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: (Currency..Currency?)) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> (java.util.Currency..java.util.Currency?)

'params' @ [48:33] ==> value-parameter params: BankOfCordaWebApi.IssueRequestParams defined in net.corda.bank.api.BankOfCordaClientApi.requestRPCIssue[ValueParameterDescriptorImpl]

'amount' @ [48:40] ==> public final val amount: Long defined in net.corda.bank.api.BankOfCordaWebApi.IssueRequestParams[PropertyDescriptorImpl]

'getInstance' @ [48:57] ==> public open fun getInstance(p0: (String..String?)): (Currency..Currency?) defined in java.util.Currency[JavaMethodDescriptor]

'params' @ [48:69] ==> value-parameter params: BankOfCordaWebApi.IssueRequestParams defined in net.corda.bank.api.BankOfCordaClientApi.requestRPCIssue[ValueParameterDescriptorImpl]

'currency' @ [48:76] ==> public final val currency: String defined in net.corda.bank.api.BankOfCordaWebApi.IssueRequestParams[PropertyDescriptorImpl]

'OpaqueBytes' @ [49:38] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [49:50] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'params' @ [49:53] ==> value-parameter params: BankOfCordaWebApi.IssueRequestParams defined in net.corda.bank.api.BankOfCordaClientApi.requestRPCIssue[ValueParameterDescriptorImpl]

'issuerBankPartyRef' @ [49:60] ==> public final val issuerBankPartyRef: String defined in net.corda.bank.api.BankOfCordaWebApi.IssueRequestParams[PropertyDescriptorImpl]

'toByte' @ [49:79] ==> @InlineOnly public inline fun String.toByte(): Byte defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'rpc' @ [51:20] ==> val rpc: CordaRPCOps defined in net.corda.bank.api.BankOfCordaClientApi.requestRPCIssue.<anonymous>[LocalVariableDescriptor]

'startFlow' @ [51:24] ==> public inline fun <T : Any, A, B, C, D, E, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (Amount<(Currency..Currency?)>, OpaqueBytes, Party, Boolean, Party) -> CashIssueAndPaymentFlow, arg0: Amount<(Currency..Currency?)>, arg1: OpaqueBytes, arg2: Party, arg3: Boolean, arg4: Party): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> Amount<(java.util.Currency..java.util.Currency?)>
    <B> -> OpaqueBytes
    <C> -> Party
    <D> -> Boolean
    <E> -> Party
    <reified R : FlowLogic<T>> -> CashIssueAndPaymentFlow

'amount' @ [51:61] ==> val amount: Amount<(Currency..Currency?)> defined in net.corda.bank.api.BankOfCordaClientApi.requestRPCIssue.<anonymous>[LocalVariableDescriptor]

'issuerBankPartyRef' @ [51:69] ==> val issuerBankPartyRef: OpaqueBytes defined in net.corda.bank.api.BankOfCordaClientApi.requestRPCIssue.<anonymous>[LocalVariableDescriptor]

'issueToParty' @ [51:89] ==> val issueToParty: Party defined in net.corda.bank.api.BankOfCordaClientApi.requestRPCIssue.<anonymous>[LocalVariableDescriptor]

'params' @ [51:103] ==> value-parameter params: BankOfCordaWebApi.IssueRequestParams defined in net.corda.bank.api.BankOfCordaClientApi.requestRPCIssue[ValueParameterDescriptorImpl]

'anonymous' @ [51:110] ==> public final val anonymous: Boolean defined in net.corda.bank.api.BankOfCordaWebApi.IssueRequestParams[PropertyDescriptorImpl]

'notaryNode' @ [51:121] ==> val notaryNode: NodeInfo defined in net.corda.bank.api.BankOfCordaClientApi.requestRPCIssue.<anonymous>[LocalVariableDescriptor]

'notaryIdentity' @ [51:132] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'returnValue' @ [52:22] ==> public abstract val returnValue: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'getOrThrow' @ [52:34] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'stx' @ [52:47] ==> public final val stx: SignedTransaction defined in net.corda.finance.flows.AbstractCashFlow.Result[DeserializedPropertyDescriptor]

