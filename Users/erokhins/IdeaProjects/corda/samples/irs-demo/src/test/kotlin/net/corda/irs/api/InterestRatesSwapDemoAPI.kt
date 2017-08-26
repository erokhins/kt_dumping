'Path' @ [20:1] ==> public constructor Path(value: String) defined in javax.ws.rs.Path[JavaClassConstructorDescriptor]

'loggerFor' @ [23:30] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> InterestRatesSwapDemoAPI

'PUT' @ [26:5] ==> public constructor PUT() defined in javax.ws.rs.PUT[JavaClassConstructorDescriptor]

'Path' @ [27:5] ==> public constructor Path(value: String) defined in javax.ws.rs.Path[JavaClassConstructorDescriptor]

'Consumes' @ [28:5] ==> public constructor Consumes(vararg value: String = ...) defined in javax.ws.rs.Consumes[JavaClassConstructorDescriptor]

'APPLICATION_JSON' @ [28:25] ==> public const final val APPLICATION_JSON: String defined in javax.ws.rs.core.MediaType[JavaPropertyDescriptor]

'fetchDemoDate' @ [30:29] ==> @GET @Path @Produces public final fun fetchDemoDate(): LocalDate defined in net.corda.irs.api.InterestRatesSwapDemoAPI[SimpleFunctionDescriptorImpl]

'newDemoDate' @ [32:13] ==> value-parameter newDemoDate: LocalDate defined in net.corda.irs.api.InterestRatesSwapDemoAPI.storeDemoDate[ValueParameterDescriptorImpl]

'isAfter' @ [32:25] ==> public open fun isAfter(p0: (ChronoLocalDate..ChronoLocalDate?)): Boolean defined in java.time.LocalDate[JavaMethodDescriptor]

'priorDemoDate' @ [32:33] ==> val priorDemoDate: LocalDate defined in net.corda.irs.api.InterestRatesSwapDemoAPI.storeDemoDate[LocalVariableDescriptor]

'rpc' @ [33:13] ==> public final val rpc: CordaRPCOps defined in net.corda.irs.api.InterestRatesSwapDemoAPI[PropertyDescriptorImpl]

'startFlow' @ [33:17] ==> public inline fun <T : Any, A, reified R : FlowLogic<Unit>> CordaRPCOps.startFlow(flowConstructor: (LocalDate) -> UpdateBusinessDayFlow.Broadcast, arg0: LocalDate): FlowHandle<Unit> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Unit
    <A> -> LocalDate
    <reified R : FlowLogic<T>> -> Broadcast

'UpdateBusinessDayFlow' @ [33:27] ==> public object UpdateBusinessDayFlow defined in net.corda.irs.flows in file UpdateBusinessDayFlow.kt[FakeCallableDescriptorForObject]

'newDemoDate' @ [33:61] ==> value-parameter newDemoDate: LocalDate defined in net.corda.irs.api.InterestRatesSwapDemoAPI.storeDemoDate[ValueParameterDescriptorImpl]

'returnValue' @ [33:74] ==> public abstract val returnValue: CordaFuture<Unit> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'getOrThrow' @ [33:86] ==> public fun <V> Future<Unit>.getOrThrow(timeout: Duration? = ...): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'ok' @ [34:29] ==> public open fun ok(): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'build' @ [34:34] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'priorDemoDate' @ [36:41] ==> val priorDemoDate: LocalDate defined in net.corda.irs.api.InterestRatesSwapDemoAPI.storeDemoDate[LocalVariableDescriptor]

'logger' @ [37:9] ==> private final val logger: Logger defined in net.corda.irs.api.InterestRatesSwapDemoAPI.Companion[PropertyDescriptorImpl]

'error' @ [37:16] ==> public abstract fun error(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'newDemoDate' @ [37:51] ==> value-parameter newDemoDate: LocalDate defined in net.corda.irs.api.InterestRatesSwapDemoAPI.storeDemoDate[ValueParameterDescriptorImpl]

'msg' @ [37:68] ==> val msg: String defined in net.corda.irs.api.InterestRatesSwapDemoAPI.storeDemoDate[LocalVariableDescriptor]

'status' @ [38:25] ==> public open fun status(p0: (Response.Status..Response.Status?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'CONFLICT' @ [38:48] ==> enum entry CONFLICT defined in javax.ws.rs.core.Response.Status[FakeCallableDescriptorForObject]

'entity' @ [38:58] ==> public abstract fun entity(p0: (Any..Any?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'msg' @ [38:65] ==> val msg: String defined in net.corda.irs.api.InterestRatesSwapDemoAPI.storeDemoDate[LocalVariableDescriptor]

'build' @ [38:70] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'GET' @ [41:5] ==> public constructor GET() defined in javax.ws.rs.GET[JavaClassConstructorDescriptor]

'Path' @ [42:5] ==> public constructor Path(value: String) defined in javax.ws.rs.Path[JavaClassConstructorDescriptor]

'Produces' @ [43:5] ==> public constructor Produces(vararg value: String = ...) defined in javax.ws.rs.Produces[JavaClassConstructorDescriptor]

'APPLICATION_JSON' @ [43:25] ==> public const final val APPLICATION_JSON: String defined in javax.ws.rs.core.MediaType[JavaPropertyDescriptor]

'ofInstant' @ [45:30] ==> public open fun ofInstant(p0: (Instant..Instant?), p1: (ZoneId..ZoneId?)): (LocalDateTime..LocalDateTime?) defined in java.time.LocalDateTime[JavaMethodDescriptor]

'rpc' @ [45:40] ==> public final val rpc: CordaRPCOps defined in net.corda.irs.api.InterestRatesSwapDemoAPI[PropertyDescriptorImpl]

'currentNodeTime' @ [45:44] ==> public abstract fun currentNodeTime(): Instant defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'systemDefault' @ [45:70] ==> public open fun systemDefault(): (ZoneId..ZoneId?) defined in java.time.ZoneId[JavaMethodDescriptor]

'toLocalDate' @ [45:87] ==> public open fun toLocalDate(): (LocalDate..LocalDate?) defined in java.time.LocalDateTime[JavaMethodDescriptor]

'POST' @ [48:5] ==> public constructor POST() defined in javax.ws.rs.POST[JavaClassConstructorDescriptor]

'Path' @ [49:5] ==> public constructor Path(value: String) defined in javax.ws.rs.Path[JavaClassConstructorDescriptor]

'Consumes' @ [50:5] ==> public constructor Consumes(vararg value: String = ...) defined in javax.ws.rs.Consumes[JavaClassConstructorDescriptor]

'TEXT_PLAIN' @ [50:25] ==> public const final val TEXT_PLAIN: String defined in javax.ws.rs.core.MediaType[JavaPropertyDescriptor]

'rpc' @ [52:9] ==> public final val rpc: CordaRPCOps defined in net.corda.irs.api.InterestRatesSwapDemoAPI[PropertyDescriptorImpl]

'startFlow' @ [52:13] ==> public inline fun <T : Any, A, reified R : FlowLogic<Unit>> CordaRPCOps.startFlow(flowConstructor: (String) -> NodeInterestRates.UploadFixesFlow, arg0: String): FlowHandle<Unit> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Unit
    <A> -> String
    <reified R : FlowLogic<T>> -> UploadFixesFlow

'NodeInterestRates' @ [52:23] ==> public object NodeInterestRates defined in net.corda.irs.api[FakeCallableDescriptorForObject]

'file' @ [52:59] ==> value-parameter file: String defined in net.corda.irs.api.InterestRatesSwapDemoAPI.storeFixes[ValueParameterDescriptorImpl]

'returnValue' @ [52:65] ==> public abstract val returnValue: CordaFuture<Unit> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'getOrThrow' @ [52:77] ==> public fun <V> Future<Unit>.getOrThrow(timeout: Duration? = ...): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'ok' @ [53:25] ==> public open fun ok(): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'build' @ [53:30] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

