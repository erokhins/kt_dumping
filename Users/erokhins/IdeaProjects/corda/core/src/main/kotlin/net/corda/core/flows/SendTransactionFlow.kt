'DataVendingFlow' @ [19:76] ==> private constructor DataVendingFlow(otherSide: Party, payload: Any) defined in net.corda.core.flows.DataVendingFlow[ClassConstructorDescriptorImpl]

'otherSide' @ [19:92] ==> value-parameter otherSide: Party defined in net.corda.core.flows.SendTransactionFlow.<init>[ValueParameterDescriptorImpl]

'stx' @ [19:103] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.SendTransactionFlow.<init>[ValueParameterDescriptorImpl]

'DataVendingFlow' @ [30:88] ==> private constructor DataVendingFlow(otherSide: Party, payload: Any) defined in net.corda.core.flows.DataVendingFlow[ClassConstructorDescriptorImpl]

'otherSide' @ [30:104] ==> value-parameter otherSide: Party defined in net.corda.core.flows.SendStateAndRefFlow.<init>[ValueParameterDescriptorImpl]

'stateAndRefs' @ [30:115] ==> value-parameter stateAndRefs: List<StateAndRef<*>> defined in net.corda.core.flows.SendStateAndRefFlow.<init>[ValueParameterDescriptorImpl]

'FlowLogic<Void?>' @ [32:72] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Void?

'Suspendable' @ [33:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'sendAndReceive' @ [34:91] ==> public final inline fun <reified R : Any> sendAndReceive(otherParty: Party, payload: Any): UntrustworthyData<FetchDataFlow.Request> defined in net.corda.core.flows.DataVendingFlow[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified R : Any> -> Request

'otherSide' @ [34:129] ==> value-parameter otherSide: Party defined in net.corda.core.flows.DataVendingFlow.sendPayloadAndReceiveDataRequest[ValueParameterDescriptorImpl]

'payload' @ [34:140] ==> value-parameter payload: Any defined in net.corda.core.flows.DataVendingFlow.sendPayloadAndReceiveDataRequest[ValueParameterDescriptorImpl]

'Suspendable' @ [36:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Suspendable' @ [41:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'payload' @ [44:23] ==> public final val payload: Any defined in net.corda.core.flows.DataVendingFlow[PropertyDescriptorImpl]

'sendPayloadAndReceiveDataRequest' @ [49:31] ==> @Suspendable protected open fun sendPayloadAndReceiveDataRequest(otherSide: Party, payload: Any): UntrustworthyData<FetchDataFlow.Request> defined in net.corda.core.flows.DataVendingFlow[SimpleFunctionDescriptorImpl]

'otherSide' @ [49:64] ==> public final val otherSide: Party defined in net.corda.core.flows.DataVendingFlow[PropertyDescriptorImpl]

'payload' @ [49:75] ==> var payload: Any defined in net.corda.core.flows.DataVendingFlow.call[LocalVariableDescriptor]

'unwrap' @ [49:84] ==> @Suppress public inline fun <T, R> UntrustworthyData<FetchDataFlow.Request>.unwrap(validator: (FetchDataFlow.Request) -> FetchDataFlow.Request.Data): FetchDataFlow.Request.Data defined in net.corda.core.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Request
    <R> -> Data

'when (request) {
                    is FetchDataFlow.Request.Data -> {
                        // Security TODO: Check for abnormally large or malformed data requests
                        verifyDataRequest(request)
                        request
                    }
                    FetchDataFlow.Request.End -> return null
                }' @ [50:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FetchDataFlow.Request.Data, entry1: FetchDataFlow.Request.Data): FetchDataFlow.Request.Data[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Data

'request' @ [50:23] ==> value-parameter request: FetchDataFlow.Request defined in net.corda.core.flows.DataVendingFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'verifyDataRequest' @ [53:25] ==> @Suspendable protected open fun verifyDataRequest(dataRequest: FetchDataFlow.Request.Data): Unit defined in net.corda.core.flows.DataVendingFlow[SimpleFunctionDescriptorImpl]

'request' @ [53:43] ==> value-parameter request: FetchDataFlow.Request defined in net.corda.core.flows.DataVendingFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'request' @ [54:25] ==> value-parameter request: FetchDataFlow.Request defined in net.corda.core.flows.DataVendingFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'End' @ [56:43] ==> public object End : FetchDataFlow.Request defined in net.corda.core.internal.FetchDataFlow.Request[FakeCallableDescriptorForObject]

'payload' @ [59:13] ==> var payload: Any defined in net.corda.core.flows.DataVendingFlow.call[LocalVariableDescriptor]

'when (dataRequest.dataType) {
                FetchDataFlow.DataType.TRANSACTION -> dataRequest.hashes.map {
                    serviceHub.validatedTransactions.getTransaction(it) ?: throw FetchDataFlow.HashNotFound(it)
                }
                FetchDataFlow.DataType.ATTACHMENT -> dataRequest.hashes.map {
                    serviceHub.attachments.openAttachment(it)?.open()?.readBytes() ?: throw FetchDataFlow.HashNotFound(it)
                }
            }' @ [59:23] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<Any>, entry1: List<Any>): List<Any>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<Any>

'dataRequest' @ [59:29] ==> val dataRequest: FetchDataFlow.Request.Data defined in net.corda.core.flows.DataVendingFlow.call[LocalVariableDescriptor]

'dataType' @ [59:41] ==> public final val dataType: FetchDataFlow.DataType defined in net.corda.core.internal.FetchDataFlow.Request.Data[PropertyDescriptorImpl]

'TRANSACTION' @ [60:40] ==> enum entry TRANSACTION defined in net.corda.core.internal.FetchDataFlow.DataType[FakeCallableDescriptorForObject]

'dataRequest' @ [60:55] ==> val dataRequest: FetchDataFlow.Request.Data defined in net.corda.core.flows.DataVendingFlow.call[LocalVariableDescriptor]

'hashes' @ [60:67] ==> public final val hashes: NonEmptySet<SecureHash> defined in net.corda.core.internal.FetchDataFlow.Request.Data[PropertyDescriptorImpl]

'map' @ [60:74] ==> public inline fun <T, R> Iterable<SecureHash>.map(transform: (SecureHash) -> SignedTransaction): List<SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash
    <R> -> SignedTransaction

'serviceHub' @ [61:21] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.DataVendingFlow[PropertyDescriptorImpl]

'validatedTransactions' @ [61:32] ==> public abstract val validatedTransactions: TransactionStorage defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'getTransaction' @ [61:54] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.core.node.services.TransactionStorage[SimpleFunctionDescriptorImpl]

'it' @ [61:69] ==> value-parameter it: SecureHash defined in net.corda.core.flows.DataVendingFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'HashNotFound' @ [61:96] ==> public constructor HashNotFound(requested: SecureHash) defined in net.corda.core.internal.FetchDataFlow.HashNotFound[ClassConstructorDescriptorImpl]

'it' @ [61:109] ==> value-parameter it: SecureHash defined in net.corda.core.flows.DataVendingFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'ATTACHMENT' @ [63:40] ==> enum entry ATTACHMENT defined in net.corda.core.internal.FetchDataFlow.DataType[FakeCallableDescriptorForObject]

'dataRequest' @ [63:54] ==> val dataRequest: FetchDataFlow.Request.Data defined in net.corda.core.flows.DataVendingFlow.call[LocalVariableDescriptor]

'hashes' @ [63:66] ==> public final val hashes: NonEmptySet<SecureHash> defined in net.corda.core.internal.FetchDataFlow.Request.Data[PropertyDescriptorImpl]

'map' @ [63:73] ==> public inline fun <T, R> Iterable<SecureHash>.map(transform: (SecureHash) -> ByteArray): List<ByteArray> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash
    <R> -> ByteArray

'serviceHub' @ [64:21] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.DataVendingFlow[PropertyDescriptorImpl]

'attachments' @ [64:32] ==> public abstract val attachments: AttachmentStorage defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'openAttachment' @ [64:44] ==> public abstract fun openAttachment(id: SecureHash): Attachment? defined in net.corda.core.node.services.AttachmentStorage[SimpleFunctionDescriptorImpl]

'it' @ [64:59] ==> value-parameter it: SecureHash defined in net.corda.core.flows.DataVendingFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'open' @ [64:64] ==> public abstract fun open(): InputStream defined in net.corda.core.contracts.Attachment[SimpleFunctionDescriptorImpl]

'readBytes' @ [64:72] ==> public fun InputStream.readBytes(estimatedSize: Int = ...): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'HashNotFound' @ [64:107] ==> public constructor HashNotFound(requested: SecureHash) defined in net.corda.core.internal.FetchDataFlow.HashNotFound[ClassConstructorDescriptorImpl]

'it' @ [64:120] ==> value-parameter it: SecureHash defined in net.corda.core.flows.DataVendingFlow.call.<anonymous>[ValueParameterDescriptorImpl]

