'CordaSerializable' @ [33:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'Primary' @ [39:76] ==> public companion object defined in net.corda.finance.flows.TwoPartyDealFlow.Primary[FakeCallableDescriptorForObject]

'tracker' @ [39:84] ==> public final fun tracker(): ProgressTracker defined in net.corda.finance.flows.TwoPartyDealFlow.Primary.Companion[SimpleFunctionDescriptorImpl]

'FlowLogic<SignedTransaction>' @ [39:97] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> SignedTransaction

'ProgressTracker.Step' @ [42:39] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker' @ [43:29] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[DeserializedClassConstructorDescriptor]

'SENDING_PROPOSAL' @ [43:45] ==> public object SENDING_PROPOSAL : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyDealFlow.Primary.Companion[FakeCallableDescriptorForObject]

'Suspendable' @ [51:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'progressTracker' @ [52:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.TwoPartyDealFlow.Primary[PropertyDescriptorImpl]

'currentStep' @ [52:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'SENDING_PROPOSAL' @ [52:43] ==> public object SENDING_PROPOSAL : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyDealFlow.Primary.Companion[FakeCallableDescriptorForObject]

'Handshake' @ [54:25] ==> public constructor Handshake<out T>(payload: Any, publicKey: PublicKey) defined in net.corda.finance.flows.TwoPartyDealFlow.Handshake[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Any

'payload' @ [54:35] ==> public abstract val payload: Any defined in net.corda.finance.flows.TwoPartyDealFlow.Primary[PropertyDescriptorImpl]

'serviceHub' @ [54:44] ==> public final val serviceHub: ServiceHub defined in net.corda.finance.flows.TwoPartyDealFlow.Primary[DeserializedPropertyDescriptor]

'myInfo' @ [54:55] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [54:62] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [54:76] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'send' @ [56:13] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.finance.flows.TwoPartyDealFlow.Primary[DeserializedSimpleFunctionDescriptor]

'otherParty' @ [56:18] ==> public abstract val otherParty: Party defined in net.corda.finance.flows.TwoPartyDealFlow.Primary[PropertyDescriptorImpl]

'hello' @ [56:30] ==> val hello: TwoPartyDealFlow.Handshake<Any> defined in net.corda.finance.flows.TwoPartyDealFlow.Primary.call[LocalVariableDescriptor]

'SignTransactionFlow' @ [58:48] ==> public constructor SignTransactionFlow(otherParty: Party, progressTracker: ProgressTracker = ...) defined in net.corda.core.flows.SignTransactionFlow[DeserializedClassConstructorDescriptor]

'otherParty' @ [58:68] ==> public abstract val otherParty: Party defined in net.corda.finance.flows.TwoPartyDealFlow.Primary[PropertyDescriptorImpl]

'checkProposal' @ [59:73] ==> @Suspendable public abstract fun checkProposal(stx: SignedTransaction): Unit defined in net.corda.finance.flows.TwoPartyDealFlow.Primary[SimpleFunctionDescriptorImpl]

'stx' @ [59:87] ==> value-parameter stx: SignedTransaction defined in net.corda.finance.flows.TwoPartyDealFlow.Primary.call.<no name provided>.checkTransaction[ValueParameterDescriptorImpl]

'subFlow' @ [62:13] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.finance.flows.TwoPartyDealFlow.Primary[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'signTransactionFlow' @ [62:21] ==> val signTransactionFlow: <no name provided> defined in net.corda.finance.flows.TwoPartyDealFlow.Primary.call[LocalVariableDescriptor]

'receive' @ [64:26] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<SecureHash> defined in net.corda.finance.flows.TwoPartyDealFlow.Primary[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> SecureHash

'otherParty' @ [64:46] ==> public abstract val otherParty: Party defined in net.corda.finance.flows.TwoPartyDealFlow.Primary[PropertyDescriptorImpl]

'unwrap' @ [64:58] ==> public inline fun <T, R> UntrustworthyData<SecureHash>.unwrap(validator: (SecureHash) -> SecureHash): SecureHash defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash
    <R> -> SecureHash

'it' @ [64:67] ==> value-parameter it: SecureHash defined in net.corda.finance.flows.TwoPartyDealFlow.Primary.call.<anonymous>[ValueParameterDescriptorImpl]

'waitForLedgerCommit' @ [66:20] ==> @Suspendable public final fun waitForLedgerCommit(hash: SecureHash): SignedTransaction defined in net.corda.finance.flows.TwoPartyDealFlow.Primary[DeserializedSimpleFunctionDescriptor]

'txHash' @ [66:40] ==> val txHash: SecureHash defined in net.corda.finance.flows.TwoPartyDealFlow.Primary.call[LocalVariableDescriptor]

'Suspendable' @ [69:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Secondary' @ [75:81] ==> public companion object defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[FakeCallableDescriptorForObject]

'tracker' @ [75:91] ==> public final fun tracker(): ProgressTracker defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.Companion[SimpleFunctionDescriptorImpl]

'FlowLogic<SignedTransaction>' @ [75:104] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> SignedTransaction

'ProgressTracker.Step' @ [78:32] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker.Step' @ [79:32] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker.Step' @ [80:30] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker.Step' @ [81:44] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker.Step' @ [82:32] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker.Step' @ [83:43] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker.Step' @ [84:46] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker' @ [86:29] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[DeserializedClassConstructorDescriptor]

'RECEIVING' @ [86:45] ==> public object RECEIVING : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.Companion[FakeCallableDescriptorForObject]

'VERIFYING' @ [86:56] ==> public object VERIFYING : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.Companion[FakeCallableDescriptorForObject]

'SIGNING' @ [86:67] ==> public object SIGNING : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.Companion[FakeCallableDescriptorForObject]

'COLLECTING_SIGNATURES' @ [86:76] ==> public object COLLECTING_SIGNATURES : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.Companion[FakeCallableDescriptorForObject]

'RECORDING' @ [86:99] ==> public object RECORDING : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.Companion[FakeCallableDescriptorForObject]

'COPYING_TO_REGULATOR' @ [86:110] ==> public object COPYING_TO_REGULATOR : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.Companion[FakeCallableDescriptorForObject]

'COPYING_TO_COUNTERPARTY' @ [86:132] ==> public object COPYING_TO_COUNTERPARTY : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.Companion[FakeCallableDescriptorForObject]

'Suspendable' @ [91:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'receiveAndValidateHandshake' @ [93:29] ==> @Suspendable private final fun receiveAndValidateHandshake(): TwoPartyDealFlow.Handshake<U> defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[SimpleFunctionDescriptorImpl]

'progressTracker' @ [95:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[PropertyDescriptorImpl]

'currentStep' @ [95:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'SIGNING' @ [95:43] ==> public object SIGNING : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.Companion[FakeCallableDescriptorForObject]

'component1' @ [96:18] ==> public final operator fun component1(): TransactionBuilder defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'component2' @ [96:23] ==> public final operator fun component2(): List<PublicKey> defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'component3' @ [96:49] ==> public final operator fun component3(): List<TransactionSignature> defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'assembleSharedTX' @ [96:73] ==> @Suspendable protected abstract fun assembleSharedTX(handshake: TwoPartyDealFlow.Handshake<U>): Triple<TransactionBuilder, List<PublicKey>, List<TransactionSignature>> defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[SimpleFunctionDescriptorImpl]

'handshake' @ [96:90] ==> val handshake: TwoPartyDealFlow.Handshake<U> defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.call[LocalVariableDescriptor]

'if (additionalSignatures.any()) {
                serviceHub.signInitialTransaction(utx, additionalSigningPubKeys).withAdditionalSignatures(additionalSignatures)
            } else {
                serviceHub.signInitialTransaction(utx, additionalSigningPubKeys)
            }' @ [97:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SignedTransaction, elseBranch: SignedTransaction): SignedTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SignedTransaction

'additionalSignatures' @ [97:27] ==> val additionalSignatures: List<TransactionSignature> defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.call[LocalVariableDescriptor]

'any' @ [97:48] ==> public fun <T> Iterable<TransactionSignature>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'serviceHub' @ [98:17] ==> public final val serviceHub: ServiceHub defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [98:28] ==> public open fun signInitialTransaction(builder: TransactionBuilder, signingPubKeys: Iterable<PublicKey>): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'utx' @ [98:51] ==> val utx: TransactionBuilder defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.call[LocalVariableDescriptor]

'additionalSigningPubKeys' @ [98:56] ==> val additionalSigningPubKeys: List<PublicKey> defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.call[LocalVariableDescriptor]

'withAdditionalSignatures' @ [98:82] ==> public final fun withAdditionalSignatures(sigList: Iterable<TransactionSignature>): SignedTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'additionalSignatures' @ [98:107] ==> val additionalSignatures: List<TransactionSignature> defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.call[LocalVariableDescriptor]

'serviceHub' @ [100:17] ==> public final val serviceHub: ServiceHub defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [100:28] ==> public open fun signInitialTransaction(builder: TransactionBuilder, signingPubKeys: Iterable<PublicKey>): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'utx' @ [100:51] ==> val utx: TransactionBuilder defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.call[LocalVariableDescriptor]

'additionalSigningPubKeys' @ [100:56] ==> val additionalSigningPubKeys: List<PublicKey> defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.call[LocalVariableDescriptor]

'logger' @ [103:13] ==> public final val logger: Logger defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[DeserializedPropertyDescriptor]

'trace' @ [103:20] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'progressTracker' @ [105:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[PropertyDescriptorImpl]

'currentStep' @ [105:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'COLLECTING_SIGNATURES' @ [105:43] ==> public object COLLECTING_SIGNATURES : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.Companion[FakeCallableDescriptorForObject]

'subFlow' @ [108:23] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'CollectSignaturesFlow' @ [108:31] ==> @JvmOverloads public constructor CollectSignaturesFlow(partiallySignedTx: SignedTransaction, progressTracker: ProgressTracker = ...) defined in net.corda.core.flows.CollectSignaturesFlow[DeserializedClassConstructorDescriptor]

'ptx' @ [108:53] ==> val ptx: SignedTransaction defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.call[LocalVariableDescriptor]

'logger' @ [111:13] ==> public final val logger: Logger defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[DeserializedPropertyDescriptor]

'trace' @ [111:20] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'progressTracker' @ [113:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[PropertyDescriptorImpl]

'currentStep' @ [113:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'RECORDING' @ [113:43] ==> public object RECORDING : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.Companion[FakeCallableDescriptorForObject]

'subFlow' @ [114:23] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<List<SignedTransaction>>): List<SignedTransaction> defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<SignedTransaction>

'FinalityFlow' @ [114:31] ==> public constructor FinalityFlow(transaction: SignedTransaction, extraParticipants: Set<Party>) defined in net.corda.core.flows.FinalityFlow[DeserializedClassConstructorDescriptor]

'stx' @ [114:44] ==> val stx: SignedTransaction defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.call[LocalVariableDescriptor]

'setOf' @ [114:49] ==> public fun <T> setOf(vararg elements: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'otherParty' @ [114:55] ==> public abstract val otherParty: Party defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[PropertyDescriptorImpl]

'serviceHub' @ [114:67] ==> public final val serviceHub: ServiceHub defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[DeserializedPropertyDescriptor]

'myInfo' @ [114:78] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [114:85] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'single' @ [114:102] ==> public fun <T> List<SignedTransaction>.single(): SignedTransaction defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'logger' @ [116:13] ==> public final val logger: Logger defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[DeserializedPropertyDescriptor]

'trace' @ [116:20] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'progressTracker' @ [118:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[PropertyDescriptorImpl]

'currentStep' @ [118:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'COPYING_TO_REGULATOR' @ [118:43] ==> public object COPYING_TO_REGULATOR : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.Companion[FakeCallableDescriptorForObject]

'serviceHub' @ [119:30] ==> public final val serviceHub: ServiceHub defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[DeserializedPropertyDescriptor]

'networkMapCache' @ [119:41] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'regulatorNodes' @ [119:57] ==> public open val regulatorNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedPropertyDescriptor]

'regulators' @ [120:17] ==> val regulators: List<NodeInfo> defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.call[LocalVariableDescriptor]

'isNotEmpty' @ [120:28] ==> @InlineOnly public inline fun <T> Collection<NodeInfo>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'regulators' @ [123:17] ==> val regulators: List<NodeInfo> defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.call[LocalVariableDescriptor]

'forEach' @ [123:28] ==> @HidesMembers public inline fun <T> Iterable<NodeInfo>.forEach(action: (NodeInfo) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'send' @ [123:38] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[DeserializedSimpleFunctionDescriptor]

'it' @ [123:43] ==> value-parameter it: NodeInfo defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.call.<anonymous>[ValueParameterDescriptorImpl]

'serviceIdentities' @ [123:46] ==> public final fun serviceIdentities(type: ServiceType): List<Party> defined in net.corda.core.node.NodeInfo[DeserializedSimpleFunctionDescriptor]

'regulator' @ [123:76] ==> public final val regulator: ServiceType defined in net.corda.core.node.services.ServiceType.Companion[DeserializedPropertyDescriptor]

'first' @ [123:87] ==> public fun <T> List<Party>.first(): Party defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'ftx' @ [123:96] ==> val ftx: SignedTransaction defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.call[LocalVariableDescriptor]

'progressTracker' @ [126:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[PropertyDescriptorImpl]

'currentStep' @ [126:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'COPYING_TO_COUNTERPARTY' @ [126:43] ==> public object COPYING_TO_COUNTERPARTY : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.Companion[FakeCallableDescriptorForObject]

'send' @ [129:13] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[DeserializedSimpleFunctionDescriptor]

'otherParty' @ [129:18] ==> public abstract val otherParty: Party defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[PropertyDescriptorImpl]

'ftx' @ [129:30] ==> val ftx: SignedTransaction defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.call[LocalVariableDescriptor]

'id' @ [129:34] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'ftx' @ [131:20] ==> val ftx: SignedTransaction defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.call[LocalVariableDescriptor]

'Suspendable' @ [134:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'progressTracker' @ [136:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[PropertyDescriptorImpl]

'currentStep' @ [136:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'RECEIVING' @ [136:43] ==> public object RECEIVING : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.Companion[FakeCallableDescriptorForObject]

'receive' @ [138:29] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<TwoPartyDealFlow.Handshake<U>> defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> Handshake<U>

'otherParty' @ [138:51] ==> public abstract val otherParty: Party defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[PropertyDescriptorImpl]

'progressTracker' @ [140:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[PropertyDescriptorImpl]

'currentStep' @ [140:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'VERIFYING' @ [140:43] ==> public object VERIFYING : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.Companion[FakeCallableDescriptorForObject]

'handshake' @ [141:20] ==> val handshake: UntrustworthyData<TwoPartyDealFlow.Handshake<U>> defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.receiveAndValidateHandshake[LocalVariableDescriptor]

'unwrap' @ [141:30] ==> public inline fun <T, R> UntrustworthyData<TwoPartyDealFlow.Handshake<U>>.unwrap(validator: (TwoPartyDealFlow.Handshake<U>) -> TwoPartyDealFlow.Handshake<U>): TwoPartyDealFlow.Handshake<U> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Handshake<U>
    <R> -> Handshake<U>

'validateHandshake' @ [141:39] ==> @Suspendable protected abstract fun validateHandshake(handshake: TwoPartyDealFlow.Handshake<U>): TwoPartyDealFlow.Handshake<U> defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[SimpleFunctionDescriptorImpl]

'it' @ [141:57] ==> value-parameter it: TwoPartyDealFlow.Handshake<U> defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.receiveAndValidateHandshake.<anonymous>[ValueParameterDescriptorImpl]

'Suspendable' @ [144:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Suspendable' @ [145:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'CordaSerializable' @ [148:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'Primary' @ [157:75] ==> public companion object defined in net.corda.finance.flows.TwoPartyDealFlow.Primary[FakeCallableDescriptorForObject]

'tracker' @ [157:83] ==> public final fun tracker(): ProgressTracker defined in net.corda.finance.flows.TwoPartyDealFlow.Primary.Companion[SimpleFunctionDescriptorImpl]

'Primary' @ [157:96] ==> public constructor Primary(progressTracker: ProgressTracker = ...) defined in net.corda.finance.flows.TwoPartyDealFlow.Primary[ClassConstructorDescriptorImpl]

'serviceHub' @ [160:9] ==> public final val serviceHub: ServiceHub defined in net.corda.finance.flows.TwoPartyDealFlow.Instigator[DeserializedPropertyDescriptor]

'networkMapCache' @ [160:20] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'notaryNodes' @ [160:36] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedPropertyDescriptor]

'filter' @ [160:48] ==> public inline fun <T> Iterable<NodeInfo>.filter(predicate: (NodeInfo) -> Boolean): List<NodeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'it' @ [160:57] ==> value-parameter it: NodeInfo defined in net.corda.finance.flows.TwoPartyDealFlow.Instigator.<get-notaryNode>.<anonymous>[ValueParameterDescriptorImpl]

'notaryIdentity' @ [160:60] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'payload' @ [160:78] ==> public open val payload: TwoPartyDealFlow.AutoOffer defined in net.corda.finance.flows.TwoPartyDealFlow.Instigator[PropertyDescriptorImpl]

'notary' @ [160:86] ==> public final val notary: Party defined in net.corda.finance.flows.TwoPartyDealFlow.AutoOffer[PropertyDescriptorImpl]

'single' @ [160:95] ==> public fun <T> List<NodeInfo>.single(): NodeInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'Suspendable' @ [162:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'requireThat' @ [162:75] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'Secondary' @ [171:73] ==> public companion object defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[FakeCallableDescriptorForObject]

'tracker' @ [171:83] ==> public final fun tracker(): ProgressTracker defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary.Companion[SimpleFunctionDescriptorImpl]

'Secondary<AutoOffer>' @ [171:96] ==> public constructor Secondary<U>(progressTracker: ProgressTracker = ...) defined in net.corda.finance.flows.TwoPartyDealFlow.Secondary[ClassConstructorDescriptorImpl]
Inferred types:
    <U> -> AutoOffer

'handshake' @ [175:29] ==> value-parameter handshake: TwoPartyDealFlow.Handshake<TwoPartyDealFlow.AutoOffer> defined in net.corda.finance.flows.TwoPartyDealFlow.Acceptor.validateHandshake[ValueParameterDescriptorImpl]

'payload' @ [175:39] ==> public final val payload: TwoPartyDealFlow.AutoOffer defined in net.corda.finance.flows.TwoPartyDealFlow.Handshake[PropertyDescriptorImpl]

'autoOffer' @ [176:24] ==> val autoOffer: TwoPartyDealFlow.AutoOffer defined in net.corda.finance.flows.TwoPartyDealFlow.Acceptor.validateHandshake[LocalVariableDescriptor]

'dealBeingOffered' @ [176:34] ==> public final val dealBeingOffered: DealState defined in net.corda.finance.flows.TwoPartyDealFlow.AutoOffer[PropertyDescriptorImpl]

'logger' @ [177:13] ==> public final val logger: Logger defined in net.corda.finance.flows.TwoPartyDealFlow.Acceptor[DeserializedPropertyDescriptor]

'trace' @ [177:20] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'deal' @ [177:53] ==> val deal: DealState defined in net.corda.finance.flows.TwoPartyDealFlow.Acceptor.validateHandshake[LocalVariableDescriptor]

'linearId' @ [177:58] ==> public abstract val linearId: UniqueIdentifier defined in net.corda.finance.contracts.DealState[DeserializedPropertyDescriptor]

'externalId' @ [177:67] ==> public final val externalId: String? defined in net.corda.core.contracts.UniqueIdentifier[DeserializedPropertyDescriptor]

'handshake' @ [178:20] ==> value-parameter handshake: TwoPartyDealFlow.Handshake<TwoPartyDealFlow.AutoOffer> defined in net.corda.finance.flows.TwoPartyDealFlow.Acceptor.validateHandshake[ValueParameterDescriptorImpl]

'copy' @ [178:30] ==> public final fun copy(payload: TwoPartyDealFlow.AutoOffer = ..., publicKey: PublicKey = ...): TwoPartyDealFlow.Handshake<TwoPartyDealFlow.AutoOffer> defined in net.corda.finance.flows.TwoPartyDealFlow.Handshake[SimpleFunctionDescriptorImpl]

'autoOffer' @ [178:45] ==> val autoOffer: TwoPartyDealFlow.AutoOffer defined in net.corda.finance.flows.TwoPartyDealFlow.Acceptor.validateHandshake[LocalVariableDescriptor]

'copy' @ [178:55] ==> public final fun copy(notary: Party = ..., dealBeingOffered: DealState = ...): TwoPartyDealFlow.AutoOffer defined in net.corda.finance.flows.TwoPartyDealFlow.AutoOffer[SimpleFunctionDescriptorImpl]

'deal' @ [178:79] ==> val deal: DealState defined in net.corda.finance.flows.TwoPartyDealFlow.Acceptor.validateHandshake[LocalVariableDescriptor]

'handshake' @ [182:24] ==> value-parameter handshake: TwoPartyDealFlow.Handshake<TwoPartyDealFlow.AutoOffer> defined in net.corda.finance.flows.TwoPartyDealFlow.Acceptor.assembleSharedTX[ValueParameterDescriptorImpl]

'payload' @ [182:34] ==> public final val payload: TwoPartyDealFlow.AutoOffer defined in net.corda.finance.flows.TwoPartyDealFlow.Handshake[PropertyDescriptorImpl]

'dealBeingOffered' @ [182:42] ==> public final val dealBeingOffered: DealState defined in net.corda.finance.flows.TwoPartyDealFlow.AutoOffer[PropertyDescriptorImpl]

'deal' @ [183:23] ==> val deal: DealState defined in net.corda.finance.flows.TwoPartyDealFlow.Acceptor.assembleSharedTX[LocalVariableDescriptor]

'generateAgreement' @ [183:28] ==> public abstract fun generateAgreement(notary: Party): TransactionBuilder defined in net.corda.finance.contracts.DealState[SimpleFunctionDescriptorImpl]

'handshake' @ [183:46] ==> value-parameter handshake: TwoPartyDealFlow.Handshake<TwoPartyDealFlow.AutoOffer> defined in net.corda.finance.flows.TwoPartyDealFlow.Acceptor.assembleSharedTX[ValueParameterDescriptorImpl]

'payload' @ [183:56] ==> public final val payload: TwoPartyDealFlow.AutoOffer defined in net.corda.finance.flows.TwoPartyDealFlow.Handshake[PropertyDescriptorImpl]

'notary' @ [183:64] ==> public final val notary: Party defined in net.corda.finance.flows.TwoPartyDealFlow.AutoOffer[PropertyDescriptorImpl]

'ptx' @ [187:13] ==> val ptx: TransactionBuilder defined in net.corda.finance.flows.TwoPartyDealFlow.Acceptor.assembleSharedTX[LocalVariableDescriptor]

'setTimeWindow' @ [187:17] ==> public final fun setTimeWindow(time: Instant, timeTolerance: Duration): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [187:31] ==> public final val serviceHub: ServiceHub defined in net.corda.finance.flows.TwoPartyDealFlow.Acceptor[DeserializedPropertyDescriptor]

'clock' @ [187:42] ==> public abstract val clock: Clock defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'instant' @ [187:48] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'seconds' @ [187:62] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'Triple' @ [188:20] ==> public constructor Triple<out A, out B, out C>(first: TransactionBuilder, second: ArrayList<PublicKey> /* = ArrayList<PublicKey> */, third: List<TransactionSignature>) defined in kotlin.Triple[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> TransactionBuilder
    <out B> -> ArrayList<PublicKey>
    <out C> -> List<TransactionSignature>

'ptx' @ [188:27] ==> val ptx: TransactionBuilder defined in net.corda.finance.flows.TwoPartyDealFlow.Acceptor.assembleSharedTX[LocalVariableDescriptor]

'arrayListOf' @ [188:32] ==> public fun <T> arrayListOf(vararg elements: PublicKey): ArrayList<PublicKey> /* = ArrayList<PublicKey> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'deal' @ [188:44] ==> val deal: DealState defined in net.corda.finance.flows.TwoPartyDealFlow.Acceptor.assembleSharedTX[LocalVariableDescriptor]

'participants' @ [188:49] ==> public abstract val participants: List<AbstractParty> defined in net.corda.finance.contracts.DealState[DeserializedPropertyDescriptor]

'single' @ [188:62] ==> public inline fun <T> Iterable<AbstractParty>.single(predicate: (AbstractParty) -> Boolean): AbstractParty defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'it' @ [188:71] ==> value-parameter it: AbstractParty defined in net.corda.finance.flows.TwoPartyDealFlow.Acceptor.assembleSharedTX.<anonymous>[ValueParameterDescriptorImpl]

'serviceHub' @ [188:77] ==> public final val serviceHub: ServiceHub defined in net.corda.finance.flows.TwoPartyDealFlow.Acceptor[DeserializedPropertyDescriptor]

'myInfo' @ [188:88] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [188:95] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [188:128] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'emptyList' @ [188:140] ==> public fun <T> emptyList(): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

