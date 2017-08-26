'SingletonSerializeAsToken' @ [17:32] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[ClassConstructorDescriptorImpl]

'NotaryService' @ [34:48] ==> public constructor NotaryService() defined in net.corda.core.node.services.NotaryService[ClassConstructorDescriptorImpl]

'loggerFor' @ [35:38] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> TrustedAuthorityNotaryService

't' @ [42:13] ==> value-parameter t: TimeWindow? defined in net.corda.core.node.services.TrustedAuthorityNotaryService.validateTimeWindow[ValueParameterDescriptorImpl]

'!' @ [42:26] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'timeWindowChecker' @ [42:27] ==> protected abstract val timeWindowChecker: TimeWindowChecker defined in net.corda.core.node.services.TrustedAuthorityNotaryService[PropertyDescriptorImpl]

'isValid' @ [42:45] ==> public final fun isValid(timeWindow: TimeWindow): Boolean defined in net.corda.core.node.services.TimeWindowChecker[SimpleFunctionDescriptorImpl]

't' @ [42:53] ==> value-parameter t: TimeWindow? defined in net.corda.core.node.services.TrustedAuthorityNotaryService.validateTimeWindow[ValueParameterDescriptorImpl]

'NotaryException' @ [43:19] ==> public constructor NotaryException(error: NotaryError) defined in net.corda.core.flows.NotaryException[ClassConstructorDescriptorImpl]

'TimeWindowInvalid' @ [43:47] ==> public object TimeWindowInvalid : NotaryError defined in net.corda.core.flows.NotaryError[FakeCallableDescriptorForObject]

'uniquenessProvider' @ [52:13] ==> protected abstract val uniquenessProvider: UniquenessProvider defined in net.corda.core.node.services.TrustedAuthorityNotaryService[PropertyDescriptorImpl]

'commit' @ [52:32] ==> public abstract fun commit(states: List<StateRef>, txId: SecureHash, callerIdentity: Party): Unit defined in net.corda.core.node.services.UniquenessProvider[SimpleFunctionDescriptorImpl]

'inputs' @ [52:39] ==> value-parameter inputs: List<StateRef> defined in net.corda.core.node.services.TrustedAuthorityNotaryService.commitInputStates[ValueParameterDescriptorImpl]

'txId' @ [52:47] ==> value-parameter txId: SecureHash defined in net.corda.core.node.services.TrustedAuthorityNotaryService.commitInputStates[ValueParameterDescriptorImpl]

'caller' @ [52:53] ==> value-parameter caller: Party defined in net.corda.core.node.services.TrustedAuthorityNotaryService.commitInputStates[ValueParameterDescriptorImpl]

'inputs' @ [54:29] ==> value-parameter inputs: List<StateRef> defined in net.corda.core.node.services.TrustedAuthorityNotaryService.commitInputStates[ValueParameterDescriptorImpl]

'filterIndexed' @ [54:36] ==> public inline fun <T> Iterable<StateRef>.filterIndexed(predicate: (index: Int, StateRef) -> Boolean): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'e' @ [55:35] ==> val e: UniquenessException defined in net.corda.core.node.services.TrustedAuthorityNotaryService.commitInputStates[LocalVariableDescriptor]

'error' @ [55:37] ==> public final val error: UniquenessProvider.Conflict defined in net.corda.core.node.services.UniquenessException[PropertyDescriptorImpl]

'stateHistory' @ [55:43] ==> public final val stateHistory: Map<StateRef, UniquenessProvider.ConsumingTx> defined in net.corda.core.node.services.UniquenessProvider.Conflict[PropertyDescriptorImpl]

'stateRef' @ [55:56] ==> value-parameter stateRef: StateRef defined in net.corda.core.node.services.TrustedAuthorityNotaryService.commitInputStates.<anonymous>[ValueParameterDescriptorImpl]

'consumingTx' @ [56:17] ==> val consumingTx: UniquenessProvider.ConsumingTx? defined in net.corda.core.node.services.TrustedAuthorityNotaryService.commitInputStates.<anonymous>[LocalVariableDescriptor]

'consumingTx' @ [56:40] ==> val consumingTx: UniquenessProvider.ConsumingTx? defined in net.corda.core.node.services.TrustedAuthorityNotaryService.commitInputStates.<anonymous>[LocalVariableDescriptor]

'ConsumingTx' @ [56:74] ==> public constructor ConsumingTx(id: SecureHash, inputIndex: Int, requestingParty: Party) defined in net.corda.core.node.services.UniquenessProvider.ConsumingTx[ClassConstructorDescriptorImpl]

'txId' @ [56:86] ==> value-parameter txId: SecureHash defined in net.corda.core.node.services.TrustedAuthorityNotaryService.commitInputStates[ValueParameterDescriptorImpl]

'i' @ [56:92] ==> value-parameter i: Int defined in net.corda.core.node.services.TrustedAuthorityNotaryService.commitInputStates.<anonymous>[ValueParameterDescriptorImpl]

'caller' @ [56:95] ==> value-parameter caller: Party defined in net.corda.core.node.services.TrustedAuthorityNotaryService.commitInputStates[ValueParameterDescriptorImpl]

'conflicts' @ [58:17] ==> val conflicts: List<StateRef> defined in net.corda.core.node.services.TrustedAuthorityNotaryService.commitInputStates[LocalVariableDescriptor]

'isNotEmpty' @ [58:27] ==> @InlineOnly public inline fun <T> Collection<StateRef>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'log' @ [60:17] ==> protected open val log: Logger defined in net.corda.core.node.services.TrustedAuthorityNotaryService[PropertyDescriptorImpl]

'warn' @ [60:21] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'txId' @ [60:49] ==> value-parameter txId: SecureHash defined in net.corda.core.node.services.TrustedAuthorityNotaryService.commitInputStates[ValueParameterDescriptorImpl]

'conflicts' @ [60:56] ==> val conflicts: List<StateRef> defined in net.corda.core.node.services.TrustedAuthorityNotaryService.commitInputStates[LocalVariableDescriptor]

'notaryException' @ [61:23] ==> private final fun notaryException(txId: SecureHash, e: UniquenessException): NotaryException defined in net.corda.core.node.services.TrustedAuthorityNotaryService[SimpleFunctionDescriptorImpl]

'txId' @ [61:39] ==> value-parameter txId: SecureHash defined in net.corda.core.node.services.TrustedAuthorityNotaryService.commitInputStates[ValueParameterDescriptorImpl]

'e' @ [61:45] ==> val e: UniquenessException defined in net.corda.core.node.services.TrustedAuthorityNotaryService.commitInputStates[LocalVariableDescriptor]

'e' @ [67:28] ==> value-parameter e: UniquenessException defined in net.corda.core.node.services.TrustedAuthorityNotaryService.notaryException[ValueParameterDescriptorImpl]

'error' @ [67:30] ==> public final val error: UniquenessProvider.Conflict defined in net.corda.core.node.services.UniquenessException[PropertyDescriptorImpl]

'serialize' @ [67:36] ==> public fun <T : Any> UniquenessProvider.Conflict.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<UniquenessProvider.Conflict> defined in net.corda.core.serialization[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Conflict

'SignedData' @ [68:30] ==> public constructor SignedData<T : Any>(raw: SerializedBytes<UniquenessProvider.Conflict>, sig: DigitalSignature.WithKey) defined in net.corda.core.crypto.SignedData[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> Conflict

'conflictData' @ [68:41] ==> val conflictData: SerializedBytes<UniquenessProvider.Conflict> defined in net.corda.core.node.services.TrustedAuthorityNotaryService.notaryException[LocalVariableDescriptor]

'sign' @ [68:55] ==> public final fun sign(bits: ByteArray): DigitalSignature.WithKey defined in net.corda.core.node.services.TrustedAuthorityNotaryService[SimpleFunctionDescriptorImpl]

'conflictData' @ [68:60] ==> val conflictData: SerializedBytes<UniquenessProvider.Conflict> defined in net.corda.core.node.services.TrustedAuthorityNotaryService.notaryException[LocalVariableDescriptor]

'bytes' @ [68:73] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[PropertyDescriptorImpl]

'NotaryException' @ [69:16] ==> public constructor NotaryException(error: NotaryError) defined in net.corda.core.flows.NotaryException[ClassConstructorDescriptorImpl]

'Conflict' @ [69:44] ==> public constructor Conflict(txId: SecureHash, conflict: SignedData<UniquenessProvider.Conflict>) defined in net.corda.core.flows.NotaryError.Conflict[ClassConstructorDescriptorImpl]

'txId' @ [69:53] ==> value-parameter txId: SecureHash defined in net.corda.core.node.services.TrustedAuthorityNotaryService.notaryException[ValueParameterDescriptorImpl]

'signedConflict' @ [69:59] ==> val signedConflict: SignedData<UniquenessProvider.Conflict> defined in net.corda.core.node.services.TrustedAuthorityNotaryService.notaryException[LocalVariableDescriptor]

'services' @ [73:16] ==> public abstract val services: ServiceHub defined in net.corda.core.node.services.TrustedAuthorityNotaryService[PropertyDescriptorImpl]

'keyManagementService' @ [73:25] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'sign' @ [73:46] ==> @Suspendable public abstract fun sign(bytes: ByteArray, publicKey: PublicKey): DigitalSignature.WithKey defined in net.corda.core.node.services.KeyManagementService[SimpleFunctionDescriptorImpl]

'bits' @ [73:51] ==> value-parameter bits: ByteArray defined in net.corda.core.node.services.TrustedAuthorityNotaryService.sign[ValueParameterDescriptorImpl]

'services' @ [73:57] ==> public abstract val services: ServiceHub defined in net.corda.core.node.services.TrustedAuthorityNotaryService[PropertyDescriptorImpl]

'notaryIdentityKey' @ [73:66] ==> public open val notaryIdentityKey: PublicKey defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'SignableData' @ [77:28] ==> public constructor SignableData(txId: SecureHash, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.SignableData[ClassConstructorDescriptorImpl]

'txId' @ [77:41] ==> value-parameter txId: SecureHash defined in net.corda.core.node.services.TrustedAuthorityNotaryService.sign[ValueParameterDescriptorImpl]

'SignatureMetadata' @ [77:47] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[ClassConstructorDescriptorImpl]

'services' @ [77:65] ==> public abstract val services: ServiceHub defined in net.corda.core.node.services.TrustedAuthorityNotaryService[PropertyDescriptorImpl]

'myInfo' @ [77:74] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'platformVersion' @ [77:81] ==> public final val platformVersion: Int defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'Crypto' @ [77:98] ==> public object Crypto defined in net.corda.core.crypto in file Crypto.kt[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [77:105] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[SimpleFunctionDescriptorImpl]

'services' @ [77:125] ==> public abstract val services: ServiceHub defined in net.corda.core.node.services.TrustedAuthorityNotaryService[PropertyDescriptorImpl]

'notaryIdentityKey' @ [77:134] ==> public open val notaryIdentityKey: PublicKey defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'schemeNumberID' @ [77:153] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[PropertyDescriptorImpl]

'services' @ [78:16] ==> public abstract val services: ServiceHub defined in net.corda.core.node.services.TrustedAuthorityNotaryService[PropertyDescriptorImpl]

'keyManagementService' @ [78:25] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'sign' @ [78:46] ==> @Suspendable public abstract fun sign(signableData: SignableData, publicKey: PublicKey): TransactionSignature defined in net.corda.core.node.services.KeyManagementService[SimpleFunctionDescriptorImpl]

'signableData' @ [78:51] ==> val signableData: SignableData defined in net.corda.core.node.services.TrustedAuthorityNotaryService.sign[LocalVariableDescriptor]

'services' @ [78:65] ==> public abstract val services: ServiceHub defined in net.corda.core.node.services.TrustedAuthorityNotaryService[PropertyDescriptorImpl]

'notaryIdentityKey' @ [78:74] ==> public open val notaryIdentityKey: PublicKey defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

