'Suppress' @ [1:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'InitiatingFlow' @ [39:5] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'StartableByRPC' @ [42:5] ==> public constructor StartableByRPC() defined in net.corda.core.flows.StartableByRPC[DeserializedClassConstructorDescriptor]

'FlowLogic<Unit>' @ [45:86] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Step' @ [54:37] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'Step' @ [55:49] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'Step' @ [56:46] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'Step' @ [57:42] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'Step' @ [58:34] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'Step' @ [59:33] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'Step' @ [60:38] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'Step' @ [61:37] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'CollectSignaturesFlow' @ [64:55] ==> public companion object defined in net.corda.core.flows.CollectSignaturesFlow[FakeCallableDescriptorForObject]

'tracker' @ [64:77] ==> public final fun tracker(): ProgressTracker defined in net.corda.core.flows.CollectSignaturesFlow.Companion[DeserializedSimpleFunctionDescriptor]

'Step' @ [66:37] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'Step' @ [67:35] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'FinalityFlow' @ [68:55] ==> public companion object defined in net.corda.core.flows.FinalityFlow[FakeCallableDescriptorForObject]

'tracker' @ [68:68] ==> public final fun tracker(): ProgressTracker defined in net.corda.core.flows.FinalityFlow.Companion[DeserializedSimpleFunctionDescriptor]

'ProgressTracker' @ [71:29] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[DeserializedClassConstructorDescriptor]

'ID_OTHER_NODES' @ [72:21] ==> public object ID_OTHER_NODES : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion[FakeCallableDescriptorForObject]

'SENDING_AND_RECEIVING_DATA' @ [73:21] ==> public object SENDING_AND_RECEIVING_DATA : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion[FakeCallableDescriptorForObject]

'EXTRACTING_VAULT_STATES' @ [74:21] ==> public object EXTRACTING_VAULT_STATES : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion[FakeCallableDescriptorForObject]

'OTHER_TX_COMPONENTS' @ [75:21] ==> public object OTHER_TX_COMPONENTS : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion[FakeCallableDescriptorForObject]

'TX_BUILDING' @ [76:21] ==> public object TX_BUILDING : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion[FakeCallableDescriptorForObject]

'TX_SIGNING' @ [77:21] ==> public object TX_SIGNING : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion[FakeCallableDescriptorForObject]

'TX_VERIFICATION' @ [78:21] ==> public object TX_VERIFICATION : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion[FakeCallableDescriptorForObject]

'SIGS_GATHERING' @ [79:21] ==> public object SIGS_GATHERING : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion[FakeCallableDescriptorForObject]

'VERIFYING_SIGS' @ [80:21] ==> public object VERIFYING_SIGS : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion[FakeCallableDescriptorForObject]

'FINALISATION' @ [81:21] ==> public object FINALISATION : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion[FakeCallableDescriptorForObject]

'tracker' @ [86:57] ==> public final fun tracker(): ProgressTracker defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion[SimpleFunctionDescriptorImpl]

'Suppress' @ [88:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Suspendable' @ [89:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'ALICE_PUBKEY' @ [94:42] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'progressTracker' @ [100:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.docs.FlowCookbook.InitiatorFlow[PropertyDescriptorImpl]

'currentStep' @ [100:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'ID_OTHER_NODES' @ [100:43] ==> public object ID_OTHER_NODES : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion[FakeCallableDescriptorForObject]

'serviceHub' @ [108:42] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedPropertyDescriptor]

'networkMapCache' @ [108:53] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'getNotary' @ [108:69] ==> public open fun getNotary(principal: X500Name): Party? defined in net.corda.core.node.services.NetworkMapCache[DeserializedSimpleFunctionDescriptor]

'X500Name' @ [108:79] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'serviceHub' @ [109:37] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedPropertyDescriptor]

'networkMapCache' @ [109:48] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'getAnyNotary' @ [109:64] ==> public open fun getAnyNotary(type: ServiceType? = ...): Party? defined in net.corda.core.node.services.NetworkMapCache[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [113:38] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedPropertyDescriptor]

'networkMapCache' @ [113:49] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'notaryNodes' @ [113:65] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedPropertyDescriptor]

'notaryIdentity' @ [113:80] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'serviceHub' @ [119:45] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedPropertyDescriptor]

'networkMapCache' @ [119:56] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'getNodeByLegalName' @ [119:72] ==> public open fun getNodeByLegalName(principal: X500Name): NodeInfo? defined in net.corda.core.node.services.NetworkMapCache[DeserializedSimpleFunctionDescriptor]

'X500Name' @ [119:91] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'legalIdentity' @ [119:136] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'serviceHub' @ [120:45] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedPropertyDescriptor]

'networkMapCache' @ [120:56] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'getNodeByLegalIdentityKey' @ [120:72] ==> public abstract fun getNodeByLegalIdentityKey(identityKey: PublicKey): NodeInfo? defined in net.corda.core.node.services.NetworkMapCache[DeserializedSimpleFunctionDescriptor]

'dummyPubKey' @ [120:98] ==> val dummyPubKey: PublicKey defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'legalIdentity' @ [120:112] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'serviceHub' @ [121:44] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedPropertyDescriptor]

'networkMapCache' @ [121:55] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'partyNodes' @ [121:71] ==> public abstract val partyNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedPropertyDescriptor]

'legalIdentity' @ [121:85] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'serviceHub' @ [127:36] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedPropertyDescriptor]

'networkMapCache' @ [127:47] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'getNodesWithService' @ [127:63] ==> public open fun getNodesWithService(serviceType: ServiceType): List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedSimpleFunctionDescriptor]

'regulator' @ [127:95] ==> public final val regulator: ServiceType defined in net.corda.core.node.services.ServiceType.Companion[DeserializedPropertyDescriptor]

'legalIdentity' @ [127:109] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'progressTracker' @ [133:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.docs.FlowCookbook.InitiatorFlow[PropertyDescriptorImpl]

'currentStep' @ [133:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'SENDING_AND_RECEIVING_DATA' @ [133:43] ==> public object SENDING_AND_RECEIVING_DATA : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion[FakeCallableDescriptorForObject]

'send' @ [146:13] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedSimpleFunctionDescriptor]

'counterparty' @ [146:18] ==> public final val counterparty: Party defined in net.corda.docs.FlowCookbook.InitiatorFlow[PropertyDescriptorImpl]

'Any' @ [146:32] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'receive' @ [169:51] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<Int> defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> Int

'counterparty' @ [169:64] ==> public final val counterparty: Party defined in net.corda.docs.FlowCookbook.InitiatorFlow[PropertyDescriptorImpl]

'packet1' @ [170:28] ==> val packet1: UntrustworthyData<Int> defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'unwrap' @ [170:36] ==> public inline fun <T, R> UntrustworthyData<Int>.unwrap(validator: (Int) -> Int): Int defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'data' @ [174:17] ==> value-parameter data: Int defined in net.corda.docs.FlowCookbook.InitiatorFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'sendAndReceive' @ [183:55] ==> public final inline fun <reified R : Any> sendAndReceive(otherParty: Party, payload: Any): UntrustworthyData<Boolean> defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> Boolean

'counterparty' @ [183:79] ==> public final val counterparty: Party defined in net.corda.docs.FlowCookbook.InitiatorFlow[PropertyDescriptorImpl]

'packet2' @ [184:36] ==> val packet2: UntrustworthyData<Boolean> defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'unwrap' @ [184:44] ==> public inline fun <T, R> UntrustworthyData<Boolean>.unwrap(validator: (Boolean) -> Boolean): Boolean defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean
    <R> -> Boolean

'data' @ [188:17] ==> value-parameter data: Boolean defined in net.corda.docs.FlowCookbook.InitiatorFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'send' @ [196:13] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedSimpleFunctionDescriptor]

'regulator' @ [196:18] ==> val regulator: Party defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'Any' @ [196:29] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'receive' @ [197:51] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<Any> defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> Any

'regulator' @ [197:64] ==> val regulator: Party defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'progressTracker' @ [203:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.docs.FlowCookbook.InitiatorFlow[PropertyDescriptorImpl]

'currentStep' @ [203:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'EXTRACTING_VAULT_STATES' @ [203:43] ==> public object EXTRACTING_VAULT_STATES : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion[FakeCallableDescriptorForObject]

'VaultQueryCriteria' @ [212:48] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'serviceHub' @ [213:45] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedPropertyDescriptor]

'vaultQueryService' @ [213:56] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'queryBy' @ [213:74] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<DummyState> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> DummyState

'criteria' @ [213:94] ==> val criteria: QueryCriteria.VaultQueryCriteria defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'results' @ [214:62] ==> val results: Vault.Page<DummyState> defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'states' @ [214:70] ==> public final val states: List<StateAndRef<DummyState>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'StateRef' @ [226:41] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'sha256' @ [226:61] ==> @JvmStatic public final fun sha256(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [230:59] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedPropertyDescriptor]

'toStateAndRef' @ [230:70] ==> public open fun <T : ContractState> toStateAndRef(stateRef: StateRef): StateAndRef<DummyState> defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> DummyState

'ourStateRef' @ [230:96] ==> val ourStateRef: StateRef defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'progressTracker' @ [236:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.docs.FlowCookbook.InitiatorFlow[PropertyDescriptorImpl]

'currentStep' @ [236:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'OTHER_TX_COMPONENTS' @ [236:43] ==> public object OTHER_TX_COMPONENTS : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion[FakeCallableDescriptorForObject]

'DummyState' @ [240:41] ==> public constructor DummyState(magicNumber: Int = ...) defined in net.corda.testing.contracts.DummyState[DeserializedClassConstructorDescriptor]

'ourOutput' @ [244:46] ==> val ourOutput: DummyState defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'copy' @ [244:56] ==> public final fun copy(magicNumber: Int = ...): DummyState defined in net.corda.testing.contracts.DummyState[DeserializedSimpleFunctionDescriptor]

'DummyContract' @ [251:62] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'Create' @ [251:85] ==> public constructor Create() defined in net.corda.testing.contracts.DummyContract.Commands.Create[DeserializedClassConstructorDescriptor]

'serviceHub' @ [252:40] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedPropertyDescriptor]

'legalIdentityKey' @ [252:51] ==> public open val legalIdentityKey: PublicKey defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'counterparty' @ [253:49] ==> public final val counterparty: Party defined in net.corda.docs.FlowCookbook.InitiatorFlow[PropertyDescriptorImpl]

'owningKey' @ [253:62] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'listOf' @ [254:52] ==> public fun <T> listOf(vararg elements: PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'ourPubKey' @ [254:59] ==> val ourPubKey: PublicKey defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'counterpartyPubKey' @ [254:70] ==> val counterpartyPubKey: PublicKey defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'Command' @ [255:70] ==> public constructor Command<T : CommandData>(value: DummyContract.Commands.Create, signers: List<PublicKey>) defined in net.corda.core.contracts.Command[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : CommandData> -> Create

'commandData' @ [255:78] ==> val commandData: DummyContract.Commands.Create defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'requiredSigners' @ [255:91] ==> val requiredSigners: List<PublicKey> defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'DummyContract' @ [262:60] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'Create' @ [262:83] ==> public constructor Create() defined in net.corda.testing.contracts.DummyContract.Commands.Create[DeserializedClassConstructorDescriptor]

'Cash' @ [265:52] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Issue' @ [265:66] ==> public constructor Issue() defined in net.corda.finance.contracts.asset.Cash.Commands.Issue[DeserializedClassConstructorDescriptor]

'SecureHash' @ [271:45] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'sha256' @ [271:56] ==> @JvmStatic public final fun sha256(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'TimeWindow' @ [276:45] ==> public companion object defined in net.corda.core.contracts.TimeWindow[FakeCallableDescriptorForObject]

'between' @ [276:56] ==> @JvmStatic public final fun between(fromTime: Instant, untilTime: Instant): TimeWindow defined in net.corda.core.contracts.TimeWindow.Companion[DeserializedSimpleFunctionDescriptor]

'MIN' @ [276:72] ==> public final val MIN: (Instant..Instant?) defined in java.time.Instant[JavaPropertyDescriptor]

'MAX' @ [276:85] ==> public final val MAX: (Instant..Instant?) defined in java.time.Instant[JavaPropertyDescriptor]

'TimeWindow' @ [277:40] ==> public companion object defined in net.corda.core.contracts.TimeWindow[FakeCallableDescriptorForObject]

'fromOnly' @ [277:51] ==> @JvmStatic public final fun fromOnly(fromTime: Instant): TimeWindow defined in net.corda.core.contracts.TimeWindow.Companion[DeserializedSimpleFunctionDescriptor]

'MIN' @ [277:68] ==> public final val MIN: (Instant..Instant?) defined in java.time.Instant[JavaPropertyDescriptor]

'TimeWindow' @ [278:41] ==> public companion object defined in net.corda.core.contracts.TimeWindow[FakeCallableDescriptorForObject]

'untilOnly' @ [278:52] ==> @JvmStatic public final fun untilOnly(untilTime: Instant): TimeWindow defined in net.corda.core.contracts.TimeWindow.Companion[DeserializedSimpleFunctionDescriptor]

'MAX' @ [278:70] ==> public final val MAX: (Instant..Instant?) defined in java.time.Instant[JavaPropertyDescriptor]

'TimeWindow' @ [284:46] ==> public companion object defined in net.corda.core.contracts.TimeWindow[FakeCallableDescriptorForObject]

'withTolerance' @ [284:57] ==> @JvmStatic public final fun withTolerance(instant: Instant, tolerance: Duration): TimeWindow defined in net.corda.core.contracts.TimeWindow.Companion[DeserializedSimpleFunctionDescriptor]

'now' @ [284:79] ==> public open fun now(): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'seconds' @ [284:89] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'TimeWindow' @ [288:46] ==> public companion object defined in net.corda.core.contracts.TimeWindow[FakeCallableDescriptorForObject]

'fromStartAndDuration' @ [288:57] ==> @JvmStatic public final fun fromStartAndDuration(fromTime: Instant, duration: Duration): TimeWindow defined in net.corda.core.contracts.TimeWindow.Companion[DeserializedSimpleFunctionDescriptor]

'now' @ [288:86] ==> public open fun now(): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'seconds' @ [288:96] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'progressTracker' @ [294:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.docs.FlowCookbook.InitiatorFlow[PropertyDescriptorImpl]

'currentStep' @ [294:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'TX_BUILDING' @ [294:43] ==> public object TX_BUILDING : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion[FakeCallableDescriptorForObject]

'TransactionBuilder' @ [297:49] ==> public constructor TransactionBuilder(notary: Party? = ..., lockId: UUID = ..., inputs: MutableList<StateRef> = ..., attachments: MutableList<SecureHash> = ..., outputs: MutableList<TransactionState<ContractState>> = ..., commands: MutableList<Command<*>> = ..., window: TimeWindow? = ..., privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'specificNotary' @ [297:68] ==> val specificNotary: Party? defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'txBuilder' @ [302:13] ==> val txBuilder: TransactionBuilder defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'withItems' @ [302:23] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'ourStateAndRef' @ [304:21] ==> val ourStateAndRef: StateAndRef<DummyState> defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'ourOutput' @ [306:21] ==> val ourOutput: DummyState defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'ourCommand' @ [308:21] ==> val ourCommand: Command<DummyContract.Commands.Create> defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'txBuilder' @ [314:13] ==> val txBuilder: TransactionBuilder defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'addInputState' @ [314:23] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'ourStateAndRef' @ [314:37] ==> val ourStateAndRef: StateAndRef<DummyState> defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'txBuilder' @ [315:13] ==> val txBuilder: TransactionBuilder defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'addOutputState' @ [315:23] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'ourOutput' @ [315:38] ==> val ourOutput: DummyState defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'txBuilder' @ [316:13] ==> val txBuilder: TransactionBuilder defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'addCommand' @ [316:23] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'ourCommand' @ [316:34] ==> val ourCommand: Command<DummyContract.Commands.Create> defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'txBuilder' @ [317:13] ==> val txBuilder: TransactionBuilder defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'addAttachment' @ [317:23] ==> public final fun addAttachment(attachmentId: SecureHash): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'ourAttachment' @ [317:37] ==> val ourAttachment: SecureHash defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'txBuilder' @ [323:13] ==> val txBuilder: TransactionBuilder defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'setTimeWindow' @ [323:23] ==> public final fun setTimeWindow(timeWindow: TimeWindow): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'ourTimeWindow' @ [323:37] ==> val ourTimeWindow: TimeWindow defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'txBuilder' @ [327:13] ==> val txBuilder: TransactionBuilder defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'setTimeWindow' @ [327:23] ==> public final fun setTimeWindow(time: Instant, timeTolerance: Duration): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [327:37] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedPropertyDescriptor]

'clock' @ [327:48] ==> public abstract val clock: Clock defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'instant' @ [327:54] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'seconds' @ [327:68] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'progressTracker' @ [333:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.docs.FlowCookbook.InitiatorFlow[PropertyDescriptorImpl]

'currentStep' @ [333:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'TX_SIGNING' @ [333:43] ==> public object TX_SIGNING : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion[FakeCallableDescriptorForObject]

'serviceHub' @ [338:51] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [338:62] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'txBuilder' @ [338:85] ==> val txBuilder: TransactionBuilder defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'serviceHub' @ [342:39] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedPropertyDescriptor]

'keyManagementService' @ [342:50] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'freshKey' @ [342:71] ==> @Suspendable public abstract fun freshKey(): PublicKey defined in net.corda.core.node.services.KeyManagementService[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [343:52] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [343:63] ==> public open fun signInitialTransaction(builder: TransactionBuilder, publicKey: PublicKey): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'txBuilder' @ [343:86] ==> val txBuilder: TransactionBuilder defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'otherKey' @ [343:97] ==> val otherKey: PublicKey defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'serviceHub' @ [350:52] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedPropertyDescriptor]

'addSignature' @ [350:63] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'onceSignedTx' @ [350:76] ==> val onceSignedTx: SignedTransaction defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'serviceHub' @ [353:40] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedPropertyDescriptor]

'keyManagementService' @ [353:51] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'freshKey' @ [353:72] ==> @Suspendable public abstract fun freshKey(): PublicKey defined in net.corda.core.node.services.KeyManagementService[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [355:53] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedPropertyDescriptor]

'addSignature' @ [355:64] ==> public open fun addSignature(signedTransaction: SignedTransaction, publicKey: PublicKey): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'onceSignedTx' @ [355:77] ==> val onceSignedTx: SignedTransaction defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'otherKey2' @ [355:91] ==> val otherKey2: PublicKey defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'serviceHub' @ [365:45] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedPropertyDescriptor]

'createSignature' @ [365:56] ==> public open fun createSignature(signedTransaction: SignedTransaction): TransactionSignature defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'onceSignedTx' @ [365:72] ==> val onceSignedTx: SignedTransaction defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'serviceHub' @ [369:46] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedPropertyDescriptor]

'createSignature' @ [369:57] ==> public open fun createSignature(signedTransaction: SignedTransaction, publicKey: PublicKey): TransactionSignature defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'onceSignedTx' @ [369:73] ==> val onceSignedTx: SignedTransaction defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'otherKey2' @ [369:87] ==> val otherKey2: PublicKey defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'progressTracker' @ [379:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.docs.FlowCookbook.InitiatorFlow[PropertyDescriptorImpl]

'currentStep' @ [379:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'TX_VERIFICATION' @ [379:43] ==> public object TX_VERIFICATION : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion[FakeCallableDescriptorForObject]

'subFlow' @ [389:13] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<Void?>): Void? defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Void?

'SendTransactionFlow' @ [389:21] ==> public constructor SendTransactionFlow(otherSide: Party, stx: SignedTransaction) defined in net.corda.core.flows.SendTransactionFlow[DeserializedClassConstructorDescriptor]

'counterparty' @ [389:41] ==> public final val counterparty: Party defined in net.corda.docs.FlowCookbook.InitiatorFlow[PropertyDescriptorImpl]

'twiceSignedTx' @ [389:55] ==> val twiceSignedTx: SignedTransaction defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'subFlow' @ [392:13] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<Void?>): Void? defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Void?

'SendTransactionFlow' @ [392:29] ==> public constructor SendTransactionFlow(otherSide: Party, stx: SignedTransaction) defined in net.corda.core.flows.SendTransactionFlow[DeserializedClassConstructorDescriptor]

'counterparty' @ [392:49] ==> public final val counterparty: Party defined in net.corda.docs.FlowCookbook.InitiatorFlow[PropertyDescriptorImpl]

'twiceSignedTx' @ [392:63] ==> val twiceSignedTx: SignedTransaction defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'subFlow' @ [403:39] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'ReceiveTransactionFlow' @ [403:47] ==> @JvmOverloads public constructor ReceiveTransactionFlow(otherParty: Party, checkSufficientSignatures: Boolean = ...) defined in net.corda.core.flows.ReceiveTransactionFlow[DeserializedClassConstructorDescriptor]

'counterparty' @ [403:70] ==> public final val counterparty: Party defined in net.corda.docs.FlowCookbook.InitiatorFlow[PropertyDescriptorImpl]

'subFlow' @ [409:13] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<Void?>): Void? defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Void?

'SendStateAndRefFlow' @ [409:21] ==> public constructor SendStateAndRefFlow(otherSide: Party, stateAndRefs: List<StateAndRef<*>>) defined in net.corda.core.flows.SendStateAndRefFlow[DeserializedClassConstructorDescriptor]

'counterparty' @ [409:41] ==> public final val counterparty: Party defined in net.corda.docs.FlowCookbook.InitiatorFlow[PropertyDescriptorImpl]

'dummyStates' @ [409:55] ==> val dummyStates: List<StateAndRef<DummyState>> defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'subFlow' @ [412:39] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<@JvmSuppressWildcards List<StateAndRef<DummyState>>>): @JvmSuppressWildcards List<StateAndRef<DummyState>> defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> [@kotlin.jvm.JvmSuppressWildcards] List<StateAndRef<DummyState>>

'ReceiveStateAndRefFlow' @ [412:47] ==> public constructor ReceiveStateAndRefFlow<out T : ContractState>(otherParty: Party) defined in net.corda.core.flows.ReceiveStateAndRefFlow[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> DummyState

'counterparty' @ [412:82] ==> public final val counterparty: Party defined in net.corda.docs.FlowCookbook.InitiatorFlow[PropertyDescriptorImpl]

'twiceSignedTx' @ [418:13] ==> val twiceSignedTx: SignedTransaction defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'verify' @ [418:27] ==> @JvmOverloads public final fun verify(services: ServiceHub, checkSufficientSignatures: Boolean = ...): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [418:34] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedPropertyDescriptor]

'twiceSignedTx' @ [432:47] ==> val twiceSignedTx: SignedTransaction defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'toLedgerTransaction' @ [432:61] ==> @JvmOverloads public final fun toLedgerTransaction(services: ServiceHub, checkSufficientSignatures: Boolean = ...): LedgerTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [432:81] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedPropertyDescriptor]

'ledgerTx' @ [437:43] ==> val ledgerTx: LedgerTransaction defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'outputsOfType' @ [437:52] ==> public final inline fun <reified T : ContractState> outputsOfType(): List<DummyState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> DummyState

'single' @ [437:80] ==> public fun <T> List<DummyState>.single(): DummyState defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DummyState

'outputState' @ [438:17] ==> val outputState: DummyState defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'magicNumber' @ [438:29] ==> public final val magicNumber: Int defined in net.corda.testing.contracts.DummyState[DeserializedPropertyDescriptor]

'FlowException' @ [443:23] ==> public constructor FlowException(message: String?) defined in net.corda.core.flows.FlowException[DeserializedClassConstructorDescriptor]

'progressTracker' @ [455:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.docs.FlowCookbook.InitiatorFlow[PropertyDescriptorImpl]

'currentStep' @ [455:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'SIGS_GATHERING' @ [455:43] ==> public object SIGS_GATHERING : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion[FakeCallableDescriptorForObject]

'subFlow' @ [463:52] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'CollectSignaturesFlow' @ [463:60] ==> @JvmOverloads public constructor CollectSignaturesFlow(partiallySignedTx: SignedTransaction, progressTracker: ProgressTracker = ...) defined in net.corda.core.flows.CollectSignaturesFlow[DeserializedClassConstructorDescriptor]

'twiceSignedTx' @ [463:82] ==> val twiceSignedTx: SignedTransaction defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'childProgressTracker' @ [463:112] ==> public open fun childProgressTracker(): ProgressTracker defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion.SIGS_GATHERING[SimpleFunctionDescriptorImpl]

'progressTracker' @ [469:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.docs.FlowCookbook.InitiatorFlow[PropertyDescriptorImpl]

'currentStep' @ [469:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'VERIFYING_SIGS' @ [469:43] ==> public object VERIFYING_SIGS : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion[FakeCallableDescriptorForObject]

'fullySignedTx' @ [474:13] ==> val fullySignedTx: SignedTransaction defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'verifyRequiredSignatures' @ [474:27] ==> public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'onceSignedTx' @ [481:13] ==> val onceSignedTx: SignedTransaction defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'verifySignaturesExcept' @ [481:26] ==> public open fun verifySignaturesExcept(vararg allowedToBeMissing: PublicKey): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'counterpartyPubKey' @ [481:49] ==> val counterpartyPubKey: PublicKey defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'twiceSignedTx' @ [488:13] ==> val twiceSignedTx: SignedTransaction defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'checkSignaturesAreValid' @ [488:27] ==> public open fun checkSignaturesAreValid(): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'progressTracker' @ [494:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.docs.FlowCookbook.InitiatorFlow[PropertyDescriptorImpl]

'currentStep' @ [494:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'FINALISATION' @ [494:43] ==> public object FINALISATION : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion[FakeCallableDescriptorForObject]

'subFlow' @ [499:51] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<List<SignedTransaction>>): List<SignedTransaction> defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<SignedTransaction>

'FinalityFlow' @ [499:59] ==> public constructor FinalityFlow(transaction: SignedTransaction, progressTracker: ProgressTracker) defined in net.corda.core.flows.FinalityFlow[DeserializedClassConstructorDescriptor]

'fullySignedTx' @ [499:72] ==> val fullySignedTx: SignedTransaction defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'childProgressTracker' @ [499:100] ==> public open fun childProgressTracker(): ProgressTracker defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion.FINALISATION[SimpleFunctionDescriptorImpl]

'single' @ [499:125] ==> public fun <T> List<SignedTransaction>.single(): SignedTransaction defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'setOf' @ [504:49] ==> public fun <T> setOf(element: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'regulator' @ [504:55] ==> val regulator: Party defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'subFlow' @ [505:51] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<List<SignedTransaction>>): List<SignedTransaction> defined in net.corda.docs.FlowCookbook.InitiatorFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<SignedTransaction>

'FinalityFlow' @ [505:59] ==> public constructor FinalityFlow(transactions: Iterable<SignedTransaction>, extraRecipients: Set<Party>, progressTracker: ProgressTracker) defined in net.corda.core.flows.FinalityFlow[DeserializedClassConstructorDescriptor]

'listOf' @ [505:72] ==> public fun <T> listOf(element: SignedTransaction): List<SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'fullySignedTx' @ [505:79] ==> val fullySignedTx: SignedTransaction defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'additionalParties' @ [505:95] ==> val additionalParties: Set<Party> defined in net.corda.docs.FlowCookbook.InitiatorFlow.call[LocalVariableDescriptor]

'childProgressTracker' @ [505:127] ==> public open fun childProgressTracker(): ProgressTracker defined in net.corda.docs.FlowCookbook.InitiatorFlow.Companion.FINALISATION[SimpleFunctionDescriptorImpl]

'single' @ [505:152] ==> public fun <T> List<SignedTransaction>.single(): SignedTransaction defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'InitiatedBy' @ [517:5] ==> public constructor InitiatedBy(value: KClass<out FlowLogic<*>>) defined in net.corda.core.flows.InitiatedBy[DeserializedClassConstructorDescriptor]

'InitiatorFlow' @ [517:18] ==> public companion object defined in net.corda.docs.FlowCookbook.InitiatorFlow[FakeCallableDescriptorForObject]

'FlowLogic<Unit>' @ [518:52] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Step' @ [521:49] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'Step' @ [522:30] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'Step' @ [523:35] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker' @ [525:29] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[DeserializedClassConstructorDescriptor]

'RECEIVING_AND_SENDING_DATA' @ [526:21] ==> public object RECEIVING_AND_SENDING_DATA : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.ResponderFlow.Companion[FakeCallableDescriptorForObject]

'SIGNING' @ [527:21] ==> public object SIGNING : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.ResponderFlow.Companion[FakeCallableDescriptorForObject]

'FINALISATION' @ [528:21] ==> public object FINALISATION : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.ResponderFlow.Companion[FakeCallableDescriptorForObject]

'tracker' @ [532:57] ==> public final fun tracker(): ProgressTracker defined in net.corda.docs.FlowCookbook.ResponderFlow.Companion[SimpleFunctionDescriptorImpl]

'Suspendable' @ [534:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'progressTracker' @ [543:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.docs.FlowCookbook.ResponderFlow[PropertyDescriptorImpl]

'currentStep' @ [543:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'RECEIVING_AND_SENDING_DATA' @ [543:43] ==> public object RECEIVING_AND_SENDING_DATA : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.ResponderFlow.Companion[FakeCallableDescriptorForObject]

'receive' @ [552:28] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<Any> defined in net.corda.docs.FlowCookbook.ResponderFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> Any

'counterparty' @ [552:41] ==> public final val counterparty: Party defined in net.corda.docs.FlowCookbook.ResponderFlow[PropertyDescriptorImpl]

'unwrap' @ [552:55] ==> public inline fun <T, R> UntrustworthyData<Any>.unwrap(validator: (Any) -> Any): Any defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any
    <R> -> Any

'data' @ [552:72] ==> value-parameter data: Any defined in net.corda.docs.FlowCookbook.ResponderFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'sendAndReceive' @ [553:34] ==> public final inline fun <reified R : Any> sendAndReceive(otherParty: Party, payload: Any): UntrustworthyData<String> defined in net.corda.docs.FlowCookbook.ResponderFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> String

'counterparty' @ [553:57] ==> public final val counterparty: Party defined in net.corda.docs.FlowCookbook.ResponderFlow[PropertyDescriptorImpl]

'unwrap' @ [553:75] ==> public inline fun <T, R> UntrustworthyData<String>.unwrap(validator: (String) -> String): String defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'data' @ [553:92] ==> value-parameter data: String defined in net.corda.docs.FlowCookbook.ResponderFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'send' @ [554:13] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.docs.FlowCookbook.ResponderFlow[DeserializedSimpleFunctionDescriptor]

'counterparty' @ [554:18] ==> public final val counterparty: Party defined in net.corda.docs.FlowCookbook.ResponderFlow[PropertyDescriptorImpl]

'progressTracker' @ [560:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.docs.FlowCookbook.ResponderFlow[PropertyDescriptorImpl]

'currentStep' @ [560:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'SIGNING' @ [560:43] ==> public object SIGNING : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.ResponderFlow.Companion[FakeCallableDescriptorForObject]

'SignTransactionFlow' @ [566:69] ==> public constructor SignTransactionFlow(otherParty: Party, progressTracker: ProgressTracker = ...) defined in net.corda.core.flows.SignTransactionFlow[DeserializedClassConstructorDescriptor]

'counterparty' @ [566:89] ==> public final val counterparty: Party defined in net.corda.docs.FlowCookbook.ResponderFlow[PropertyDescriptorImpl]

'requireThat' @ [567:73] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'stx' @ [569:39] ==> value-parameter stx: SignedTransaction defined in net.corda.docs.FlowCookbook.ResponderFlow.call.<no name provided>.checkTransaction[ValueParameterDescriptorImpl]

'tx' @ [569:43] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputsOfType' @ [569:46] ==> public final inline fun <reified T : ContractState> outputsOfType(): List<DummyState> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> DummyState

'single' @ [569:74] ==> public fun <T> List<DummyState>.single(): DummyState defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DummyState

'assert' @ [570:21] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'outputState' @ [570:28] ==> val outputState: DummyState defined in net.corda.docs.FlowCookbook.ResponderFlow.call.<no name provided>.checkTransaction.<anonymous>[LocalVariableDescriptor]

'magicNumber' @ [570:40] ==> public final val magicNumber: Int defined in net.corda.testing.contracts.DummyState[DeserializedPropertyDescriptor]

'subFlow' @ [574:13] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.docs.FlowCookbook.ResponderFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'signTransactionFlow' @ [574:21] ==> val signTransactionFlow: SignTransactionFlow defined in net.corda.docs.FlowCookbook.ResponderFlow.call[LocalVariableDescriptor]

'progressTracker' @ [580:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.docs.FlowCookbook.ResponderFlow[PropertyDescriptorImpl]

'currentStep' @ [580:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'FINALISATION' @ [580:43] ==> public object FINALISATION : ProgressTracker.Step defined in net.corda.docs.FlowCookbook.ResponderFlow.Companion[FakeCallableDescriptorForObject]

