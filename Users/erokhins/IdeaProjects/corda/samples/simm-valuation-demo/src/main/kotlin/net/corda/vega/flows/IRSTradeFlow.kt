'CordaSerializable' @ [18:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'InitiatingFlow' @ [21:5] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'StartableByRPC' @ [22:5] ==> public constructor StartableByRPC() defined in net.corda.core.flows.StartableByRPC[DeserializedClassConstructorDescriptor]

'FlowLogic<SignedTransaction>' @ [23:66] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> SignedTransaction

'Suspendable' @ [24:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'require' @ [26:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [26:21] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.IRSTradeFlow.Requester[DeserializedPropertyDescriptor]

'networkMapCache' @ [26:32] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'notaryNodes' @ [26:48] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedPropertyDescriptor]

'isNotEmpty' @ [26:60] ==> @InlineOnly public inline fun <T> Collection<NodeInfo>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'serviceHub' @ [27:26] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.IRSTradeFlow.Requester[DeserializedPropertyDescriptor]

'networkMapCache' @ [27:37] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'notaryNodes' @ [27:53] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedPropertyDescriptor]

'first' @ [27:65] ==> public fun <T> List<NodeInfo>.first(): NodeInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'notaryIdentity' @ [27:73] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'serviceHub' @ [28:30] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.IRSTradeFlow.Requester[DeserializedPropertyDescriptor]

'myInfo' @ [28:41] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [28:48] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'component1' @ [29:18] ==> public final operator fun component1(): Party defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [29:25] ==> public final operator fun component2(): Party defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'if (swap.buyer.second == myIdentity.owningKey) {
                        Pair(myIdentity, otherParty)
                    } else {
                        Pair(otherParty, myIdentity)
                    }' @ [30:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<Party, Party>, elseBranch: Pair<Party, Party>): Pair<Party, Party>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<Party, Party>

'swap' @ [30:25] ==> public final val swap: SwapData defined in net.corda.vega.flows.IRSTradeFlow.Requester[PropertyDescriptorImpl]

'buyer' @ [30:30] ==> public final val buyer: Pair<String, PublicKey> defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'second' @ [30:36] ==> public final val second: PublicKey defined in kotlin.Pair[DeserializedPropertyDescriptor]

'myIdentity' @ [30:46] ==> val myIdentity: Party defined in net.corda.vega.flows.IRSTradeFlow.Requester.call[LocalVariableDescriptor]

'owningKey' @ [30:57] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Pair' @ [31:25] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'myIdentity' @ [31:30] ==> val myIdentity: Party defined in net.corda.vega.flows.IRSTradeFlow.Requester.call[LocalVariableDescriptor]

'otherParty' @ [31:42] ==> public final val otherParty: Party defined in net.corda.vega.flows.IRSTradeFlow.Requester[PropertyDescriptorImpl]

'Pair' @ [33:25] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'otherParty' @ [33:30] ==> public final val otherParty: Party defined in net.corda.vega.flows.IRSTradeFlow.Requester[PropertyDescriptorImpl]

'myIdentity' @ [33:42] ==> val myIdentity: Party defined in net.corda.vega.flows.IRSTradeFlow.Requester.call[LocalVariableDescriptor]

'IRSState' @ [35:25] ==> public constructor IRSState(swap: SwapData, buyer: AbstractParty, seller: AbstractParty, contract: OGTrade, linearId: UniqueIdentifier = ...) defined in net.corda.vega.contracts.IRSState[ClassConstructorDescriptorImpl]

'swap' @ [35:34] ==> public final val swap: SwapData defined in net.corda.vega.flows.IRSTradeFlow.Requester[PropertyDescriptorImpl]

'buyer' @ [35:40] ==> val buyer: Party defined in net.corda.vega.flows.IRSTradeFlow.Requester.call[LocalVariableDescriptor]

'seller' @ [35:47] ==> val seller: Party defined in net.corda.vega.flows.IRSTradeFlow.Requester.call[LocalVariableDescriptor]

'OGTrade' @ [35:55] ==> public constructor OGTrade() defined in net.corda.vega.contracts.OGTrade[ClassConstructorDescriptorImpl]

'logger' @ [37:13] ==> public final val logger: Logger defined in net.corda.vega.flows.IRSTradeFlow.Requester[DeserializedPropertyDescriptor]

'info' @ [37:20] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'sendAndReceive' @ [38:39] ==> public final inline fun <reified R : Any> sendAndReceive(otherParty: Party, payload: Any): UntrustworthyData<Boolean> defined in net.corda.vega.flows.IRSTradeFlow.Requester[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> Boolean

'otherParty' @ [38:63] ==> public final val otherParty: Party defined in net.corda.vega.flows.IRSTradeFlow.Requester[PropertyDescriptorImpl]

'OfferMessage' @ [38:75] ==> public constructor OfferMessage(notary: Party, dealBeingOffered: IRSState) defined in net.corda.vega.flows.IRSTradeFlow.OfferMessage[ClassConstructorDescriptorImpl]

'notary' @ [38:88] ==> val notary: Party defined in net.corda.vega.flows.IRSTradeFlow.Requester.call[LocalVariableDescriptor]

'offer' @ [38:96] ==> val offer: IRSState defined in net.corda.vega.flows.IRSTradeFlow.Requester.call[LocalVariableDescriptor]

'unwrap' @ [38:104] ==> public inline fun <T, R> UntrustworthyData<Boolean>.unwrap(validator: (Boolean) -> Boolean): Boolean defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean
    <R> -> Boolean

'it' @ [38:113] ==> value-parameter it: Boolean defined in net.corda.vega.flows.IRSTradeFlow.Requester.call.<anonymous>[ValueParameterDescriptorImpl]

'require' @ [39:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'otherPartyAgreeFlag' @ [39:21] ==> val otherPartyAgreeFlag: Boolean defined in net.corda.vega.flows.IRSTradeFlow.Requester.call[LocalVariableDescriptor]

'subFlow' @ [41:20] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.vega.flows.IRSTradeFlow.Requester[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'Instigator' @ [41:45] ==> public constructor Instigator(otherParty: Party, payload: TwoPartyDealFlow.AutoOffer, myKey: PublicKey, progressTracker: ProgressTracker = ...) defined in net.corda.finance.flows.TwoPartyDealFlow.Instigator[DeserializedClassConstructorDescriptor]

'otherParty' @ [42:21] ==> public final val otherParty: Party defined in net.corda.vega.flows.IRSTradeFlow.Requester[PropertyDescriptorImpl]

'AutoOffer' @ [43:38] ==> public constructor AutoOffer(notary: Party, dealBeingOffered: DealState) defined in net.corda.finance.flows.TwoPartyDealFlow.AutoOffer[DeserializedClassConstructorDescriptor]

'notary' @ [43:48] ==> val notary: Party defined in net.corda.vega.flows.IRSTradeFlow.Requester.call[LocalVariableDescriptor]

'offer' @ [43:56] ==> val offer: IRSState defined in net.corda.vega.flows.IRSTradeFlow.Requester.call[LocalVariableDescriptor]

'serviceHub' @ [44:21] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.IRSTradeFlow.Requester[DeserializedPropertyDescriptor]

'legalIdentityKey' @ [44:32] ==> public open val legalIdentityKey: PublicKey defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'InitiatedBy' @ [49:5] ==> public constructor InitiatedBy(value: KClass<out FlowLogic<*>>) defined in net.corda.core.flows.InitiatedBy[DeserializedClassConstructorDescriptor]

'Requester' @ [49:18] ==> public constructor Requester(swap: SwapData, otherParty: Party) defined in net.corda.vega.flows.IRSTradeFlow.Requester[ClassConstructorDescriptorImpl]

'FlowLogic<Unit>' @ [50:55] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Suspendable' @ [51:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'logger' @ [53:13] ==> public final val logger: Logger defined in net.corda.vega.flows.IRSTradeFlow.Receiver[DeserializedPropertyDescriptor]

'info' @ [53:20] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'logger' @ [54:13] ==> public final val logger: Logger defined in net.corda.vega.flows.IRSTradeFlow.Receiver[DeserializedPropertyDescriptor]

'info' @ [54:20] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'receive' @ [56:25] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<IRSTradeFlow.OfferMessage> defined in net.corda.vega.flows.IRSTradeFlow.Receiver[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> OfferMessage

'replyToParty' @ [56:47] ==> private final val replyToParty: Party defined in net.corda.vega.flows.IRSTradeFlow.Receiver[PropertyDescriptorImpl]

'unwrap' @ [56:61] ==> public inline fun <T, R> UntrustworthyData<IRSTradeFlow.OfferMessage>.unwrap(validator: (IRSTradeFlow.OfferMessage) -> IRSTradeFlow.OfferMessage): IRSTradeFlow.OfferMessage defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OfferMessage
    <R> -> OfferMessage

'it' @ [56:70] ==> value-parameter it: IRSTradeFlow.OfferMessage defined in net.corda.vega.flows.IRSTradeFlow.Receiver.call.<anonymous>[ValueParameterDescriptorImpl]

'require' @ [58:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [58:21] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.IRSTradeFlow.Receiver[DeserializedPropertyDescriptor]

'networkMapCache' @ [58:32] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'notaryNodes' @ [58:48] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedPropertyDescriptor]

'map' @ [58:60] ==> public inline fun <T, R> Iterable<NodeInfo>.map(transform: (NodeInfo) -> Party): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo
    <R> -> Party

'it' @ [58:66] ==> value-parameter it: NodeInfo defined in net.corda.vega.flows.IRSTradeFlow.Receiver.call.<anonymous>[ValueParameterDescriptorImpl]

'notaryIdentity' @ [58:69] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'contains' @ [58:86] ==> public abstract fun contains(element: Party): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'offer' @ [58:95] ==> val offer: IRSTradeFlow.OfferMessage defined in net.corda.vega.flows.IRSTradeFlow.Receiver.call[LocalVariableDescriptor]

'notary' @ [58:101] ==> public final val notary: Party defined in net.corda.vega.flows.IRSTradeFlow.OfferMessage[PropertyDescriptorImpl]

'send' @ [59:13] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.vega.flows.IRSTradeFlow.Receiver[DeserializedSimpleFunctionDescriptor]

'replyToParty' @ [59:18] ==> private final val replyToParty: Party defined in net.corda.vega.flows.IRSTradeFlow.Receiver[PropertyDescriptorImpl]

'subFlow' @ [60:13] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.vega.flows.IRSTradeFlow.Receiver[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'Acceptor' @ [60:38] ==> public constructor Acceptor(otherParty: Party, progressTracker: ProgressTracker = ...) defined in net.corda.finance.flows.TwoPartyDealFlow.Acceptor[DeserializedClassConstructorDescriptor]

'replyToParty' @ [60:47] ==> private final val replyToParty: Party defined in net.corda.vega.flows.IRSTradeFlow.Receiver[PropertyDescriptorImpl]

