'InitiatingFlow' @ [26:5] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'StartableByRPC' @ [27:5] ==> public constructor StartableByRPC() defined in net.corda.core.flows.StartableByRPC[DeserializedClassConstructorDescriptor]

'FlowLogic<SignedTransaction>' @ [28:55] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> SignedTransaction

'ProgressTracker.Step' @ [31:31] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker.Step' @ [32:30] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'TwoPartyDealFlow' @ [33:72] ==> public object TwoPartyDealFlow defined in net.corda.finance.flows[FakeCallableDescriptorForObject]

'tracker' @ [33:97] ==> public final fun tracker(): ProgressTracker defined in net.corda.finance.flows.TwoPartyDealFlow.Primary.Companion[DeserializedSimpleFunctionDescriptor]

'ProgressTracker' @ [39:29] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[DeserializedClassConstructorDescriptor]

'RECEIVED' @ [39:45] ==> public object RECEIVED : ProgressTracker.Step defined in net.corda.irs.flows.AutoOfferFlow.Requester.Companion[FakeCallableDescriptorForObject]

'DEALING' @ [39:55] ==> public object DEALING : ProgressTracker.Step defined in net.corda.irs.flows.AutoOfferFlow.Requester.Companion[FakeCallableDescriptorForObject]

'tracker' @ [42:40] ==> public final fun tracker(): ProgressTracker defined in net.corda.irs.flows.AutoOfferFlow.Requester.Companion[SimpleFunctionDescriptorImpl]

'progressTracker' @ [45:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.irs.flows.AutoOfferFlow.Requester[PropertyDescriptorImpl]

'currentStep' @ [45:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'RECEIVED' @ [45:43] ==> public object RECEIVED : ProgressTracker.Step defined in net.corda.irs.flows.AutoOfferFlow.Requester.Companion[FakeCallableDescriptorForObject]

'Suspendable' @ [48:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'require' @ [50:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [50:21] ==> public final val serviceHub: ServiceHub defined in net.corda.irs.flows.AutoOfferFlow.Requester[DeserializedPropertyDescriptor]

'networkMapCache' @ [50:32] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'notaryNodes' @ [50:48] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedPropertyDescriptor]

'isNotEmpty' @ [50:60] ==> @InlineOnly public inline fun <T> Collection<NodeInfo>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'serviceHub' @ [51:26] ==> public final val serviceHub: ServiceHub defined in net.corda.irs.flows.AutoOfferFlow.Requester[DeserializedPropertyDescriptor]

'networkMapCache' @ [51:37] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'notaryNodes' @ [51:53] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedPropertyDescriptor]

'first' @ [51:65] ==> public fun <T> List<NodeInfo>.first(): NodeInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'notaryIdentity' @ [51:73] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'notUs' @ [53:30] ==> private final fun <T : AbstractParty> notUs(parties: List<AbstractParty>): List<AbstractParty> defined in net.corda.irs.flows.AutoOfferFlow.Requester[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : AbstractParty> -> AbstractParty

'dealToBeOffered' @ [53:36] ==> public final val dealToBeOffered: DealState defined in net.corda.irs.flows.AutoOfferFlow.Requester[PropertyDescriptorImpl]

'participants' @ [53:52] ==> public abstract val participants: List<AbstractParty> defined in net.corda.finance.contracts.DealState[DeserializedPropertyDescriptor]

'map' @ [53:66] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> Party?): List<Party?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> Party?

'serviceHub' @ [53:72] ==> public final val serviceHub: ServiceHub defined in net.corda.irs.flows.AutoOfferFlow.Requester[DeserializedPropertyDescriptor]

'identityService' @ [53:83] ==> public abstract val identityService: IdentityService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'partyFromAnonymous' @ [53:99] ==> public abstract fun partyFromAnonymous(party: AbstractParty): Party? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'it' @ [53:118] ==> value-parameter it: AbstractParty defined in net.corda.irs.flows.AutoOfferFlow.Requester.call.<anonymous>[ValueParameterDescriptorImpl]

'requireNoNulls' @ [53:124] ==> public fun <T : Any> List<Party?>.requireNoNulls(): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Party

'single' @ [53:141] ==> public fun <T> List<Party>.single(): Party defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'progressTracker' @ [54:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.irs.flows.AutoOfferFlow.Requester[PropertyDescriptorImpl]

'currentStep' @ [54:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'DEALING' @ [54:43] ==> public object DEALING : ProgressTracker.Step defined in net.corda.irs.flows.AutoOfferFlow.Requester.Companion[FakeCallableDescriptorForObject]

'serviceHub' @ [55:25] ==> public final val serviceHub: ServiceHub defined in net.corda.irs.flows.AutoOfferFlow.Requester[DeserializedPropertyDescriptor]

'legalIdentityKey' @ [55:36] ==> public open val legalIdentityKey: PublicKey defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'Instigator' @ [56:30] ==> public constructor Instigator(otherParty: Party, payload: TwoPartyDealFlow.AutoOffer, myKey: PublicKey, progressTracker: ProgressTracker = ...) defined in net.corda.finance.flows.TwoPartyDealFlow.Instigator[DeserializedClassConstructorDescriptor]

'otherParty' @ [57:21] ==> val otherParty: Party defined in net.corda.irs.flows.AutoOfferFlow.Requester.call[LocalVariableDescriptor]

'AutoOffer' @ [58:21] ==> public constructor AutoOffer(notary: Party, dealBeingOffered: DealState) defined in net.corda.finance.flows.TwoPartyDealFlow.AutoOffer[DeserializedClassConstructorDescriptor]

'notary' @ [58:31] ==> val notary: Party defined in net.corda.irs.flows.AutoOfferFlow.Requester.call[LocalVariableDescriptor]

'dealToBeOffered' @ [58:39] ==> public final val dealToBeOffered: DealState defined in net.corda.irs.flows.AutoOfferFlow.Requester[PropertyDescriptorImpl]

'myKey' @ [59:21] ==> val myKey: PublicKey defined in net.corda.irs.flows.AutoOfferFlow.Requester.call[LocalVariableDescriptor]

'progressTracker' @ [60:21] ==> public open val progressTracker: ProgressTracker defined in net.corda.irs.flows.AutoOfferFlow.Requester[PropertyDescriptorImpl]

'getChildProgressTracker' @ [60:37] ==> public final fun getChildProgressTracker(step: ProgressTracker.Step): ProgressTracker? defined in net.corda.core.utilities.ProgressTracker[DeserializedSimpleFunctionDescriptor]

'DEALING' @ [60:61] ==> public object DEALING : ProgressTracker.Step defined in net.corda.irs.flows.AutoOfferFlow.Requester.Companion[FakeCallableDescriptorForObject]

'subFlow' @ [62:23] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.irs.flows.AutoOfferFlow.Requester[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'instigator' @ [62:31] ==> val instigator: TwoPartyDealFlow.Instigator defined in net.corda.irs.flows.AutoOfferFlow.Requester.call[LocalVariableDescriptor]

'stx' @ [63:20] ==> val stx: SignedTransaction defined in net.corda.irs.flows.AutoOfferFlow.Requester.call[LocalVariableDescriptor]

'parties' @ [67:20] ==> value-parameter parties: List<T> defined in net.corda.irs.flows.AutoOfferFlow.Requester.notUs[ValueParameterDescriptorImpl]

'filter' @ [67:28] ==> public inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'serviceHub' @ [67:37] ==> public final val serviceHub: ServiceHub defined in net.corda.irs.flows.AutoOfferFlow.Requester[DeserializedPropertyDescriptor]

'myInfo' @ [67:48] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [67:55] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'it' @ [67:72] ==> value-parameter it: T defined in net.corda.irs.flows.AutoOfferFlow.Requester.notUs.<anonymous>[ValueParameterDescriptorImpl]

'InitiatedBy' @ [71:5] ==> public constructor InitiatedBy(value: KClass<out FlowLogic<*>>) defined in net.corda.core.flows.InitiatedBy[DeserializedClassConstructorDescriptor]

'Requester' @ [71:18] ==> public companion object defined in net.corda.irs.flows.AutoOfferFlow.Requester[FakeCallableDescriptorForObject]

'Acceptor' @ [72:50] ==> public constructor Acceptor(otherParty: Party, progressTracker: ProgressTracker = ...) defined in net.corda.finance.flows.TwoPartyDealFlow.Acceptor[DeserializedClassConstructorDescriptor]

'otherParty' @ [72:59] ==> value-parameter otherParty: Party defined in net.corda.irs.flows.AutoOfferFlow.AutoOfferAcceptor.<init>[ValueParameterDescriptorImpl]

