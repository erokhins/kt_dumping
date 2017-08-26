'Path' @ [18:1] ==> public constructor Path(value: String) defined in javax.ws.rs.Path[JavaClassConstructorDescriptor]

'loggerFor' @ [27:22] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> BankOfCordaWebApi

'GET' @ [30:5] ==> public constructor GET() defined in javax.ws.rs.GET[JavaClassConstructorDescriptor]

'Path' @ [31:5] ==> public constructor Path(value: String) defined in javax.ws.rs.Path[JavaClassConstructorDescriptor]

'Produces' @ [32:5] ==> public constructor Produces(vararg value: String = ...) defined in javax.ws.rs.Produces[JavaClassConstructorDescriptor]

'APPLICATION_JSON' @ [32:25] ==> public const final val APPLICATION_JSON: String defined in javax.ws.rs.core.MediaType[JavaPropertyDescriptor]

'mapOf' @ [34:16] ==> public fun <K, V> mapOf(pair: Pair<String, (LocalDate..LocalDate?)>): Map<String, (LocalDate..LocalDate?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> (java.time.LocalDate..java.time.LocalDate?)

'to' @ [34:22] ==> public infix fun <A, B> String.to(that: (LocalDate..LocalDate?)): Pair<String, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'now' @ [34:46] ==> public open fun now(): (LocalDateTime..LocalDateTime?) defined in java.time.LocalDateTime[JavaMethodDescriptor]

'toLocalDate' @ [34:52] ==> public open fun toLocalDate(): (LocalDate..LocalDate?) defined in java.time.LocalDateTime[JavaMethodDescriptor]

'POST' @ [40:5] ==> public constructor POST() defined in javax.ws.rs.POST[JavaClassConstructorDescriptor]

'Path' @ [41:5] ==> public constructor Path(value: String) defined in javax.ws.rs.Path[JavaClassConstructorDescriptor]

'Consumes' @ [42:5] ==> public constructor Consumes(vararg value: String = ...) defined in javax.ws.rs.Consumes[JavaClassConstructorDescriptor]

'APPLICATION_JSON' @ [42:25] ==> public const final val APPLICATION_JSON: String defined in javax.ws.rs.core.MediaType[JavaPropertyDescriptor]

'rpc' @ [45:28] ==> public final val rpc: CordaRPCOps defined in net.corda.bank.api.BankOfCordaWebApi[PropertyDescriptorImpl]

'partyFromX500Name' @ [45:32] ==> public abstract fun partyFromX500Name(x500Name: X500Name): Party? defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'params' @ [45:50] ==> value-parameter params: BankOfCordaWebApi.IssueRequestParams defined in net.corda.bank.api.BankOfCordaWebApi.issueAssetRequest[ValueParameterDescriptorImpl]

'issueToPartyName' @ [45:57] ==> public final val issueToPartyName: X500Name defined in net.corda.bank.api.BankOfCordaWebApi.IssueRequestParams[PropertyDescriptorImpl]

'status' @ [46:36] ==> public open fun status(p0: (Response.Status..Response.Status?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'FORBIDDEN' @ [46:59] ==> enum entry FORBIDDEN defined in javax.ws.rs.core.Response.Status[FakeCallableDescriptorForObject]

'entity' @ [46:70] ==> public abstract fun entity(p0: (Any..Any?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'params' @ [46:97] ==> value-parameter params: BankOfCordaWebApi.IssueRequestParams defined in net.corda.bank.api.BankOfCordaWebApi.issueAssetRequest[ValueParameterDescriptorImpl]

'issueToPartyName' @ [46:104] ==> public final val issueToPartyName: X500Name defined in net.corda.bank.api.BankOfCordaWebApi.IssueRequestParams[PropertyDescriptorImpl]

'build' @ [46:144] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'rpc' @ [47:9] ==> public final val rpc: CordaRPCOps defined in net.corda.bank.api.BankOfCordaWebApi[PropertyDescriptorImpl]

'partyFromX500Name' @ [47:13] ==> public abstract fun partyFromX500Name(x500Name: X500Name): Party? defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'params' @ [47:31] ==> value-parameter params: BankOfCordaWebApi.IssueRequestParams defined in net.corda.bank.api.BankOfCordaWebApi.issueAssetRequest[ValueParameterDescriptorImpl]

'issuerBankName' @ [47:38] ==> public final val issuerBankName: X500Name defined in net.corda.bank.api.BankOfCordaWebApi.IssueRequestParams[PropertyDescriptorImpl]

'status' @ [47:73] ==> public open fun status(p0: (Response.Status..Response.Status?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'FORBIDDEN' @ [47:96] ==> enum entry FORBIDDEN defined in javax.ws.rs.core.Response.Status[FakeCallableDescriptorForObject]

'entity' @ [47:107] ==> public abstract fun entity(p0: (Any..Any?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'params' @ [47:134] ==> value-parameter params: BankOfCordaWebApi.IssueRequestParams defined in net.corda.bank.api.BankOfCordaWebApi.issueAssetRequest[ValueParameterDescriptorImpl]

'issuerBankName' @ [47:141] ==> public final val issuerBankName: X500Name defined in net.corda.bank.api.BankOfCordaWebApi.IssueRequestParams[PropertyDescriptorImpl]

'build' @ [47:179] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'rpc' @ [48:27] ==> public final val rpc: CordaRPCOps defined in net.corda.bank.api.BankOfCordaWebApi[PropertyDescriptorImpl]

'partyFromX500Name' @ [48:31] ==> public abstract fun partyFromX500Name(x500Name: X500Name): Party? defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'params' @ [48:49] ==> value-parameter params: BankOfCordaWebApi.IssueRequestParams defined in net.corda.bank.api.BankOfCordaWebApi.issueAssetRequest[ValueParameterDescriptorImpl]

'notaryName' @ [48:56] ==> public final val notaryName: X500Name defined in net.corda.bank.api.BankOfCordaWebApi.IssueRequestParams[PropertyDescriptorImpl]

'status' @ [49:36] ==> public open fun status(p0: (Response.Status..Response.Status?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'FORBIDDEN' @ [49:59] ==> enum entry FORBIDDEN defined in javax.ws.rs.core.Response.Status[FakeCallableDescriptorForObject]

'entity' @ [49:70] ==> public abstract fun entity(p0: (Any..Any?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'params' @ [49:97] ==> value-parameter params: BankOfCordaWebApi.IssueRequestParams defined in net.corda.bank.api.BankOfCordaWebApi.issueAssetRequest[ValueParameterDescriptorImpl]

'notaryName' @ [49:104] ==> public final val notaryName: X500Name defined in net.corda.bank.api.BankOfCordaWebApi.IssueRequestParams[PropertyDescriptorImpl]

'build' @ [49:138] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'rpc' @ [50:26] ==> public final val rpc: CordaRPCOps defined in net.corda.bank.api.BankOfCordaWebApi[PropertyDescriptorImpl]

'nodeIdentityFromParty' @ [50:30] ==> public abstract fun nodeIdentityFromParty(party: AbstractParty): NodeInfo? defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'notaryParty' @ [50:52] ==> val notaryParty: Party defined in net.corda.bank.api.BankOfCordaWebApi.issueAssetRequest[LocalVariableDescriptor]

'status' @ [51:36] ==> public open fun status(p0: (Response.Status..Response.Status?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'FORBIDDEN' @ [51:59] ==> enum entry FORBIDDEN defined in javax.ws.rs.core.Response.Status[FakeCallableDescriptorForObject]

'entity' @ [51:70] ==> public abstract fun entity(p0: (Any..Any?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'notaryParty' @ [51:96] ==> val notaryParty: Party defined in net.corda.bank.api.BankOfCordaWebApi.issueAssetRequest[LocalVariableDescriptor]

'build' @ [51:133] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'Amount' @ [53:22] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: (Currency..Currency?)) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> (java.util.Currency..java.util.Currency?)

'params' @ [53:29] ==> value-parameter params: BankOfCordaWebApi.IssueRequestParams defined in net.corda.bank.api.BankOfCordaWebApi.issueAssetRequest[ValueParameterDescriptorImpl]

'amount' @ [53:36] ==> public final val amount: Long defined in net.corda.bank.api.BankOfCordaWebApi.IssueRequestParams[PropertyDescriptorImpl]

'getInstance' @ [53:53] ==> public open fun getInstance(p0: (String..String?)): (Currency..Currency?) defined in java.util.Currency[JavaMethodDescriptor]

'params' @ [53:65] ==> value-parameter params: BankOfCordaWebApi.IssueRequestParams defined in net.corda.bank.api.BankOfCordaWebApi.issueAssetRequest[ValueParameterDescriptorImpl]

'currency' @ [53:72] ==> public final val currency: String defined in net.corda.bank.api.BankOfCordaWebApi.IssueRequestParams[PropertyDescriptorImpl]

'OpaqueBytes' @ [54:34] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [54:46] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'params' @ [54:49] ==> value-parameter params: BankOfCordaWebApi.IssueRequestParams defined in net.corda.bank.api.BankOfCordaWebApi.issueAssetRequest[ValueParameterDescriptorImpl]

'issuerBankPartyRef' @ [54:56] ==> public final val issuerBankPartyRef: String defined in net.corda.bank.api.BankOfCordaWebApi.IssueRequestParams[PropertyDescriptorImpl]

'toByte' @ [54:75] ==> @InlineOnly public inline fun String.toByte(): Byte defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'rpc' @ [59:13] ==> public final val rpc: CordaRPCOps defined in net.corda.bank.api.BankOfCordaWebApi[PropertyDescriptorImpl]

'startFlow' @ [59:17] ==> public inline fun <T : Any, A, B, C, D, E, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (Amount<(Currency..Currency?)>, OpaqueBytes, Party, Boolean, Party) -> CashIssueAndPaymentFlow, arg0: Amount<(Currency..Currency?)>, arg1: OpaqueBytes, arg2: Party, arg3: Boolean, arg4: Party): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> Amount<(java.util.Currency..java.util.Currency?)>
    <B> -> OpaqueBytes
    <C> -> Party
    <D> -> Boolean
    <E> -> Party
    <reified R : FlowLogic<T>> -> CashIssueAndPaymentFlow

'amount' @ [59:54] ==> val amount: Amount<(Currency..Currency?)> defined in net.corda.bank.api.BankOfCordaWebApi.issueAssetRequest[LocalVariableDescriptor]

'issuerBankPartyRef' @ [59:62] ==> val issuerBankPartyRef: OpaqueBytes defined in net.corda.bank.api.BankOfCordaWebApi.issueAssetRequest[LocalVariableDescriptor]

'issueToParty' @ [59:82] ==> val issueToParty: Party defined in net.corda.bank.api.BankOfCordaWebApi.issueAssetRequest[LocalVariableDescriptor]

'params' @ [59:96] ==> value-parameter params: BankOfCordaWebApi.IssueRequestParams defined in net.corda.bank.api.BankOfCordaWebApi.issueAssetRequest[ValueParameterDescriptorImpl]

'anonymous' @ [59:103] ==> public final val anonymous: Boolean defined in net.corda.bank.api.BankOfCordaWebApi.IssueRequestParams[PropertyDescriptorImpl]

'notaryNode' @ [59:114] ==> val notaryNode: NodeInfo defined in net.corda.bank.api.BankOfCordaWebApi.issueAssetRequest[LocalVariableDescriptor]

'notaryIdentity' @ [59:125] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'returnValue' @ [59:141] ==> public abstract val returnValue: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'getOrThrow' @ [59:153] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'logger' @ [60:13] ==> public final val logger: Logger defined in net.corda.bank.api.BankOfCordaWebApi.Companion[PropertyDescriptorImpl]

'info' @ [60:20] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'params' @ [60:77] ==> value-parameter params: BankOfCordaWebApi.IssueRequestParams defined in net.corda.bank.api.BankOfCordaWebApi.issueAssetRequest[ValueParameterDescriptorImpl]

'status' @ [61:22] ==> public open fun status(p0: (Response.Status..Response.Status?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'CREATED' @ [61:45] ==> enum entry CREATED defined in javax.ws.rs.core.Response.Status[FakeCallableDescriptorForObject]

'build' @ [61:54] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'logger' @ [63:13] ==> public final val logger: Logger defined in net.corda.bank.api.BankOfCordaWebApi.Companion[PropertyDescriptorImpl]

'error' @ [63:20] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'e' @ [63:62] ==> val e: Exception /* = Exception */ defined in net.corda.bank.api.BankOfCordaWebApi.issueAssetRequest[LocalVariableDescriptor]

'status' @ [64:22] ==> public open fun status(p0: (Response.Status..Response.Status?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'FORBIDDEN' @ [64:45] ==> enum entry FORBIDDEN defined in javax.ws.rs.core.Response.Status[FakeCallableDescriptorForObject]

'build' @ [64:56] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

