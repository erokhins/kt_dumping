'NotaryFlow.Service' @ [17:88] ==> public constructor Service(otherSide: Party, service: TrustedAuthorityNotaryService) defined in net.corda.core.flows.NotaryFlow.Service[DeserializedClassConstructorDescriptor]

'otherSide' @ [17:107] ==> value-parameter otherSide: Party defined in net.corda.node.services.transactions.ValidatingNotaryFlow.<init>[ValueParameterDescriptorImpl]

'service' @ [17:118] ==> value-parameter service: TrustedAuthorityNotaryService defined in net.corda.node.services.transactions.ValidatingNotaryFlow.<init>[ValueParameterDescriptorImpl]

'Suspendable' @ [23:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'subFlow' @ [26:23] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.node.services.transactions.ValidatingNotaryFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'ReceiveTransactionFlow' @ [26:31] ==> @JvmOverloads public constructor ReceiveTransactionFlow(otherParty: Party, checkSufficientSignatures: Boolean = ...) defined in net.corda.core.flows.ReceiveTransactionFlow[DeserializedClassConstructorDescriptor]

'otherSide' @ [26:54] ==> public final val otherSide: Party defined in net.corda.node.services.transactions.ValidatingNotaryFlow[DeserializedPropertyDescriptor]

'checkSignatures' @ [27:13] ==> private final fun checkSignatures(stx: SignedTransaction): Unit defined in net.corda.node.services.transactions.ValidatingNotaryFlow[SimpleFunctionDescriptorImpl]

'stx' @ [27:29] ==> val stx: SignedTransaction defined in net.corda.node.services.transactions.ValidatingNotaryFlow.receiveAndVerifyTx[LocalVariableDescriptor]

'stx' @ [28:23] ==> val stx: SignedTransaction defined in net.corda.node.services.transactions.ValidatingNotaryFlow.receiveAndVerifyTx[LocalVariableDescriptor]

'tx' @ [28:27] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'TransactionParts' @ [29:20] ==> public constructor TransactionParts(id: SecureHash, inputs: List<StateRef>, timestamp: TimeWindow?) defined in net.corda.core.flows.TransactionParts[DeserializedClassConstructorDescriptor]

'wtx' @ [29:37] ==> val wtx: WireTransaction defined in net.corda.node.services.transactions.ValidatingNotaryFlow.receiveAndVerifyTx[LocalVariableDescriptor]

'id' @ [29:41] ==> public open val id: SecureHash defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'wtx' @ [29:45] ==> val wtx: WireTransaction defined in net.corda.node.services.transactions.ValidatingNotaryFlow.receiveAndVerifyTx[LocalVariableDescriptor]

'inputs' @ [29:49] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'wtx' @ [29:57] ==> val wtx: WireTransaction defined in net.corda.node.services.transactions.ValidatingNotaryFlow.receiveAndVerifyTx[LocalVariableDescriptor]

'timeWindow' @ [29:61] ==> public open val timeWindow: TimeWindow? defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'when (e) {
                is TransactionVerificationException,
                is SignatureException -> NotaryException(NotaryError.TransactionInvalid(e))
                else -> e
            }' @ [31:19] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Throwable, entry1: Throwable): Throwable[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Throwable

'e' @ [31:25] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.transactions.ValidatingNotaryFlow.receiveAndVerifyTx[LocalVariableDescriptor]

'NotaryException' @ [33:42] ==> public constructor NotaryException(error: NotaryError) defined in net.corda.core.flows.NotaryException[DeserializedClassConstructorDescriptor]

'TransactionInvalid' @ [33:70] ==> public constructor TransactionInvalid(cause: Throwable) defined in net.corda.core.flows.NotaryError.TransactionInvalid[DeserializedClassConstructorDescriptor]

'e' @ [33:89] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.transactions.ValidatingNotaryFlow.receiveAndVerifyTx[LocalVariableDescriptor]

'e' @ [34:25] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.transactions.ValidatingNotaryFlow.receiveAndVerifyTx[LocalVariableDescriptor]

'stx' @ [41:13] ==> value-parameter stx: SignedTransaction defined in net.corda.node.services.transactions.ValidatingNotaryFlow.checkSignatures[ValueParameterDescriptorImpl]

'verifySignaturesExcept' @ [41:17] ==> public open fun verifySignaturesExcept(vararg allowedToBeMissing: PublicKey): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [41:40] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.transactions.ValidatingNotaryFlow[DeserializedPropertyDescriptor]

'myInfo' @ [41:51] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'notaryIdentity' @ [41:58] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [41:73] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'NotaryException' @ [43:19] ==> public constructor NotaryException(error: NotaryError) defined in net.corda.core.flows.NotaryException[DeserializedClassConstructorDescriptor]

'TransactionInvalid' @ [43:47] ==> public constructor TransactionInvalid(cause: Throwable) defined in net.corda.core.flows.NotaryError.TransactionInvalid[DeserializedClassConstructorDescriptor]

'e' @ [43:66] ==> val e: SignatureException defined in net.corda.node.services.transactions.ValidatingNotaryFlow.checkSignatures[LocalVariableDescriptor]

