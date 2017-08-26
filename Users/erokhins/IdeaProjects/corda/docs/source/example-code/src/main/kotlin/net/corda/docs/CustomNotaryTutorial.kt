'CordaService' @ [17:1] ==> public constructor CordaService() defined in net.corda.core.node.services.CordaService[DeserializedClassConstructorDescriptor]

'TrustedAuthorityNotaryService' @ [18:82] ==> public constructor TrustedAuthorityNotaryService() defined in net.corda.core.node.services.TrustedAuthorityNotaryService[DeserializedClassConstructorDescriptor]

'ValidatingNotaryService' @ [20:20] ==> public companion object defined in net.corda.node.services.transactions.ValidatingNotaryService[FakeCallableDescriptorForObject]

'type' @ [20:44] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.ValidatingNotaryService.Companion[DeserializedPropertyDescriptor]

'getSubType' @ [20:49] ==> public final fun getSubType(subTypeId: String): ServiceType defined in net.corda.core.node.services.ServiceType[DeserializedSimpleFunctionDescriptor]

'TimeWindowChecker' @ [23:38] ==> public constructor TimeWindowChecker(clock: Clock = ...) defined in net.corda.core.node.services.TimeWindowChecker[DeserializedClassConstructorDescriptor]

'services' @ [23:56] ==> public open val services: PluginServiceHub defined in net.corda.docs.MyCustomValidatingNotaryService[PropertyDescriptorImpl]

'clock' @ [23:65] ==> public abstract val clock: Clock defined in net.corda.core.node.PluginServiceHub[DeserializedPropertyDescriptor]

'PersistentUniquenessProvider' @ [24:39] ==> public constructor PersistentUniquenessProvider() defined in net.corda.node.services.transactions.PersistentUniquenessProvider[DeserializedClassConstructorDescriptor]

'MyValidatingNotaryFlow' @ [26:75] ==> public constructor MyValidatingNotaryFlow(otherSide: Party, service: MyCustomValidatingNotaryService) defined in net.corda.docs.MyValidatingNotaryFlow[ClassConstructorDescriptorImpl]

'otherParty' @ [26:98] ==> value-parameter otherParty: Party defined in net.corda.docs.MyCustomValidatingNotaryService.createServiceFlow[ValueParameterDescriptorImpl]

'this' @ [26:110] ==> <this> defined in net.corda.docs.MyCustomValidatingNotaryService[LazyClassReceiverParameterDescriptor]

'NotaryFlow.Service' @ [34:92] ==> public constructor Service(otherSide: Party, service: TrustedAuthorityNotaryService) defined in net.corda.core.flows.NotaryFlow.Service[DeserializedClassConstructorDescriptor]

'otherSide' @ [34:111] ==> value-parameter otherSide: Party defined in net.corda.docs.MyValidatingNotaryFlow.<init>[ValueParameterDescriptorImpl]

'service' @ [34:122] ==> value-parameter service: MyCustomValidatingNotaryService defined in net.corda.docs.MyValidatingNotaryFlow.<init>[ValueParameterDescriptorImpl]

'Suspendable' @ [39:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'subFlow' @ [42:23] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.docs.MyValidatingNotaryFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'ReceiveTransactionFlow' @ [42:31] ==> @JvmOverloads public constructor ReceiveTransactionFlow(otherParty: Party, checkSufficientSignatures: Boolean = ...) defined in net.corda.core.flows.ReceiveTransactionFlow[DeserializedClassConstructorDescriptor]

'otherSide' @ [42:54] ==> public final val otherSide: Party defined in net.corda.docs.MyValidatingNotaryFlow[DeserializedPropertyDescriptor]

'checkSignatures' @ [43:13] ==> private final fun checkSignatures(stx: SignedTransaction): Unit defined in net.corda.docs.MyValidatingNotaryFlow[SimpleFunctionDescriptorImpl]

'stx' @ [43:29] ==> val stx: SignedTransaction defined in net.corda.docs.MyValidatingNotaryFlow.receiveAndVerifyTx[LocalVariableDescriptor]

'stx' @ [44:23] ==> val stx: SignedTransaction defined in net.corda.docs.MyValidatingNotaryFlow.receiveAndVerifyTx[LocalVariableDescriptor]

'tx' @ [44:27] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'TransactionParts' @ [45:20] ==> public constructor TransactionParts(id: SecureHash, inputs: List<StateRef>, timestamp: TimeWindow?) defined in net.corda.core.flows.TransactionParts[DeserializedClassConstructorDescriptor]

'wtx' @ [45:37] ==> val wtx: WireTransaction defined in net.corda.docs.MyValidatingNotaryFlow.receiveAndVerifyTx[LocalVariableDescriptor]

'id' @ [45:41] ==> public open val id: SecureHash defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'wtx' @ [45:45] ==> val wtx: WireTransaction defined in net.corda.docs.MyValidatingNotaryFlow.receiveAndVerifyTx[LocalVariableDescriptor]

'inputs' @ [45:49] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'wtx' @ [45:57] ==> val wtx: WireTransaction defined in net.corda.docs.MyValidatingNotaryFlow.receiveAndVerifyTx[LocalVariableDescriptor]

'timeWindow' @ [45:61] ==> public open val timeWindow: TimeWindow? defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'when (e) {
                is TransactionVerificationException,
                is SignatureException -> NotaryException(NotaryError.TransactionInvalid(e))
                else -> e
            }' @ [47:19] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Throwable, entry1: Throwable): Throwable[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Throwable

'e' @ [47:25] ==> val e: Exception /* = Exception */ defined in net.corda.docs.MyValidatingNotaryFlow.receiveAndVerifyTx[LocalVariableDescriptor]

'NotaryException' @ [49:42] ==> public constructor NotaryException(error: NotaryError) defined in net.corda.core.flows.NotaryException[DeserializedClassConstructorDescriptor]

'TransactionInvalid' @ [49:70] ==> public constructor TransactionInvalid(cause: Throwable) defined in net.corda.core.flows.NotaryError.TransactionInvalid[DeserializedClassConstructorDescriptor]

'e' @ [49:89] ==> val e: Exception /* = Exception */ defined in net.corda.docs.MyValidatingNotaryFlow.receiveAndVerifyTx[LocalVariableDescriptor]

'e' @ [50:25] ==> val e: Exception /* = Exception */ defined in net.corda.docs.MyValidatingNotaryFlow.receiveAndVerifyTx[LocalVariableDescriptor]

'stx' @ [57:13] ==> value-parameter stx: SignedTransaction defined in net.corda.docs.MyValidatingNotaryFlow.checkSignatures[ValueParameterDescriptorImpl]

'verifySignaturesExcept' @ [57:17] ==> public open fun verifySignaturesExcept(vararg allowedToBeMissing: PublicKey): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [57:40] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.MyValidatingNotaryFlow[DeserializedPropertyDescriptor]

'myInfo' @ [57:51] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'notaryIdentity' @ [57:58] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [57:73] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'NotaryException' @ [59:19] ==> public constructor NotaryException(error: NotaryError) defined in net.corda.core.flows.NotaryException[DeserializedClassConstructorDescriptor]

'TransactionInvalid' @ [59:47] ==> public constructor TransactionInvalid(cause: Throwable) defined in net.corda.core.flows.NotaryError.TransactionInvalid[DeserializedClassConstructorDescriptor]

'e' @ [59:66] ==> val e: SignatureException defined in net.corda.docs.MyValidatingNotaryFlow.checkSignatures[LocalVariableDescriptor]

