'SingletonSerializeAsToken' @ [21:5] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'loggerFor' @ [23:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> OutOfProcessTransactionVerifierService

'ConcurrentHashMap' @ [32:39] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Long
    <V : (Any..Any?)> -> VerificationHandle

'name' @ [35:81] ==> value-parameter name: String defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.metric[ValueParameterDescriptorImpl]

'monitoringService' @ [37:33] ==> public final val monitoringService: MonitoringService defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService[PropertyDescriptorImpl]

'metrics' @ [37:51] ==> public final val metrics: MetricRegistry defined in net.corda.node.services.api.MonitoringService[PropertyDescriptorImpl]

'timer' @ [37:59] ==> public open fun timer(p0: (String..String?)): (Timer..Timer?) defined in com.codahale.metrics.MetricRegistry[JavaMethodDescriptor]

'metric' @ [37:65] ==> private final fun metric(name: String): String defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService[SimpleFunctionDescriptorImpl]

'monitoringService' @ [38:32] ==> public final val monitoringService: MonitoringService defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService[PropertyDescriptorImpl]

'metrics' @ [38:50] ==> public final val metrics: MetricRegistry defined in net.corda.node.services.api.MonitoringService[PropertyDescriptorImpl]

'meter' @ [38:58] ==> public open fun meter(p0: (String..String?)): (Meter..Meter?) defined in com.codahale.metrics.MetricRegistry[JavaMethodDescriptor]

'metric' @ [38:64] ==> private final fun metric(name: String): String defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService[SimpleFunctionDescriptorImpl]

'monitoringService' @ [39:32] ==> public final val monitoringService: MonitoringService defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService[PropertyDescriptorImpl]

'metrics' @ [39:50] ==> public final val metrics: MetricRegistry defined in net.corda.node.services.api.MonitoringService[PropertyDescriptorImpl]

'meter' @ [39:58] ==> public open fun meter(p0: (String..String?)): (Meter..Meter?) defined in com.codahale.metrics.MetricRegistry[JavaMethodDescriptor]

'metric' @ [39:64] ==> private final fun metric(name: String): String defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService[SimpleFunctionDescriptorImpl]

'Exception' @ [42:13] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'nonce' @ [42:83] ==> value-parameter nonce: Long defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.VerificationResultForUnknownTransaction.<init>[ValueParameterDescriptorImpl]

'log' @ [45:9] ==> public final val log: Logger defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.Companion[PropertyDescriptorImpl]

'info' @ [45:13] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'monitoringService' @ [46:9] ==> public final val monitoringService: MonitoringService defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService[PropertyDescriptorImpl]

'metrics' @ [46:27] ==> public final val metrics: MetricRegistry defined in net.corda.node.services.api.MonitoringService[PropertyDescriptorImpl]

'register' @ [46:35] ==> public open fun <T : (Metric..Metric?)> register(p0: (String..String?), p1: (Gauge<(Int..Int?)>..Gauge<(Int..Int?)>?)): (Gauge<(Int..Int?)>..Gauge<(Int..Int?)>?) defined in com.codahale.metrics.MetricRegistry[JavaMethodDescriptor]
Inferred types:
    <T : (Metric..Metric?)> -> (com.codahale.metrics.Gauge<(kotlin.Int..kotlin.Int?)>..com.codahale.metrics.Gauge<(kotlin.Int..kotlin.Int?)>?)

'metric' @ [46:44] ==> private final fun metric(name: String): String defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService[SimpleFunctionDescriptorImpl]

'Gauge' @ [46:77] ==> public fun <T : (Any..Any?)> Gauge(function: () -> (Int..Int?)): Gauge<(Int..Int?)> defined in com.codahale.metrics[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Int..kotlin.Int?)

'verificationHandles' @ [46:85] ==> private final val verificationHandles: ConcurrentHashMap<Long, OutOfProcessTransactionVerifierService.VerificationHandle> defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService[PropertyDescriptorImpl]

'size' @ [46:105] ==> public open val size: Int defined in java.util.concurrent.ConcurrentHashMap[JavaPropertyDescriptor]

'responseConsumer' @ [47:9] ==> value-parameter responseConsumer: ClientConsumer defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.start[ValueParameterDescriptorImpl]

'setMessageHandler' @ [47:26] ==> public final fun setMessageHandler(p0: (((ClientMessage..ClientMessage?)) -> Unit..(((ClientMessage..ClientMessage?)) -> Unit)?)): (ClientConsumer..ClientConsumer?) defined in org.apache.activemq.artemis.api.core.client.ClientConsumer[MyFunctionDescriptor]

'VerifierApi' @ [48:28] ==> public object VerifierApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'fromClientMessage' @ [48:61] ==> public final fun fromClientMessage(message: ClientMessage): VerifierApi.VerificationResponse defined in net.corda.nodeapi.VerifierApi.VerificationResponse.Companion[DeserializedSimpleFunctionDescriptor]

'message' @ [48:79] ==> value-parameter message: (ClientMessage..ClientMessage?) defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.start.<anonymous>[ValueParameterDescriptorImpl]

'verificationHandles' @ [49:26] ==> private final val verificationHandles: ConcurrentHashMap<Long, OutOfProcessTransactionVerifierService.VerificationHandle> defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService[PropertyDescriptorImpl]

'remove' @ [49:46] ==> public open fun remove(key: Long): OutOfProcessTransactionVerifierService.VerificationHandle? defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'response' @ [49:53] ==> val response: VerifierApi.VerificationResponse defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.start.<anonymous>[LocalVariableDescriptor]

'verificationId' @ [49:62] ==> public final val verificationId: Long defined in net.corda.nodeapi.VerifierApi.VerificationResponse[DeserializedPropertyDescriptor]

'VerificationResultForUnknownTransaction' @ [50:27] ==> public constructor VerificationResultForUnknownTransaction(nonce: Long) defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.VerificationResultForUnknownTransaction[ClassConstructorDescriptorImpl]

'response' @ [50:67] ==> val response: VerifierApi.VerificationResponse defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.start.<anonymous>[LocalVariableDescriptor]

'verificationId' @ [50:76] ==> public final val verificationId: Long defined in net.corda.nodeapi.VerifierApi.VerificationResponse[DeserializedPropertyDescriptor]

'handle' @ [51:13] ==> val handle: OutOfProcessTransactionVerifierService.VerificationHandle defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.start.<anonymous>[LocalVariableDescriptor]

'durationTimerContext' @ [51:20] ==> public final val durationTimerContext: Timer.Context defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.VerificationHandle[PropertyDescriptorImpl]

'stop' @ [51:41] ==> public open fun stop(): Long defined in com.codahale.metrics.Timer.Context[JavaMethodDescriptor]

'response' @ [52:29] ==> val response: VerifierApi.VerificationResponse defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.start.<anonymous>[LocalVariableDescriptor]

'exception' @ [52:38] ==> public final val exception: Throwable? defined in net.corda.nodeapi.VerifierApi.VerificationResponse[DeserializedPropertyDescriptor]

'if (exception == null) {
                successMeter.mark()
                handle.resultFuture.set(Unit)
            } else {
                failureMeter.mark()
                handle.resultFuture.setException(exception)
            }' @ [53:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'exception' @ [53:17] ==> val exception: Throwable? defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.start.<anonymous>[LocalVariableDescriptor]

'successMeter' @ [54:17] ==> private final val successMeter: (Meter..Meter?) defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService[PropertyDescriptorImpl]

'mark' @ [54:30] ==> public open fun mark(): Unit defined in com.codahale.metrics.Meter[JavaMethodDescriptor]

'handle' @ [55:17] ==> val handle: OutOfProcessTransactionVerifierService.VerificationHandle defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.start.<anonymous>[LocalVariableDescriptor]

'resultFuture' @ [55:24] ==> public final val resultFuture: OpenFuture<Unit> defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.VerificationHandle[PropertyDescriptorImpl]

'set' @ [55:37] ==> public abstract fun set(value: Unit): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'Unit' @ [55:41] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'failureMeter' @ [57:17] ==> private final val failureMeter: (Meter..Meter?) defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService[PropertyDescriptorImpl]

'mark' @ [57:30] ==> public open fun mark(): Unit defined in com.codahale.metrics.Meter[JavaMethodDescriptor]

'handle' @ [58:17] ==> val handle: OutOfProcessTransactionVerifierService.VerificationHandle defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.start.<anonymous>[LocalVariableDescriptor]

'resultFuture' @ [58:24] ==> public final val resultFuture: OpenFuture<Unit> defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.VerificationHandle[PropertyDescriptorImpl]

'setException' @ [58:37] ==> public abstract fun setException(t: Throwable): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'exception' @ [58:50] ==> val exception: Throwable? defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.start.<anonymous>[LocalVariableDescriptor]

'log' @ [66:9] ==> public final val log: Logger defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.Companion[PropertyDescriptorImpl]

'info' @ [66:13] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'transaction' @ [66:31] ==> value-parameter transaction: LedgerTransaction defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.verify[ValueParameterDescriptorImpl]

'id' @ [66:43] ==> public open val id: SecureHash defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'openFuture' @ [67:22] ==> public fun <V> openFuture(): OpenFuture<Unit> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'random63BitValue' @ [68:21] ==> public fun random63BitValue(): Long defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'verificationHandles' @ [69:9] ==> private final val verificationHandles: ConcurrentHashMap<Long, OutOfProcessTransactionVerifierService.VerificationHandle> defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService[PropertyDescriptorImpl]

'nonce' @ [69:29] ==> val nonce: Long defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.verify[LocalVariableDescriptor]

'VerificationHandle' @ [69:38] ==> public constructor VerificationHandle(transactionId: SecureHash, resultFuture: OpenFuture<Unit>, durationTimerContext: Timer.Context) defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.VerificationHandle[ClassConstructorDescriptorImpl]

'transaction' @ [69:57] ==> value-parameter transaction: LedgerTransaction defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.verify[ValueParameterDescriptorImpl]

'id' @ [69:69] ==> public open val id: SecureHash defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'future' @ [69:73] ==> val future: OpenFuture<Unit> defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.verify[LocalVariableDescriptor]

'durationTimer' @ [69:81] ==> private final val durationTimer: (Timer..Timer?) defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService[PropertyDescriptorImpl]

'time' @ [69:95] ==> public open fun time(): (Timer.Context..Timer.Context?) defined in com.codahale.metrics.Timer[JavaMethodDescriptor]

'sendRequest' @ [70:9] ==> public abstract fun sendRequest(nonce: Long, transaction: LedgerTransaction): Unit defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService[SimpleFunctionDescriptorImpl]

'nonce' @ [70:21] ==> val nonce: Long defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.verify[LocalVariableDescriptor]

'transaction' @ [70:28] ==> value-parameter transaction: LedgerTransaction defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.verify[ValueParameterDescriptorImpl]

'future' @ [71:16] ==> val future: OpenFuture<Unit> defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService.verify[LocalVariableDescriptor]

