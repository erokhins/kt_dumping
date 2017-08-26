'InitiatingFlow' @ [18:1] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'StartableByRPC' @ [19:1] ==> public constructor StartableByRPC() defined in net.corda.core.flows.StartableByRPC[DeserializedClassConstructorDescriptor]

'FlowLogic<SignedTransaction>' @ [22:67] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> SignedTransaction

'this' @ [23:64] ==> public constructor SellerFlow(otherParty: Party, amount: Amount<Currency>, progressTracker: ProgressTracker) defined in net.corda.traderdemo.flow.SellerFlow[ClassConstructorDescriptorImpl]

'otherParty' @ [23:69] ==> value-parameter otherParty: Party defined in net.corda.traderdemo.flow.SellerFlow.<init>[ValueParameterDescriptorImpl]

'amount' @ [23:81] ==> value-parameter amount: Amount<Currency> defined in net.corda.traderdemo.flow.SellerFlow.<init>[ValueParameterDescriptorImpl]

'tracker' @ [23:89] ==> public final fun tracker(): ProgressTracker defined in net.corda.traderdemo.flow.SellerFlow.Companion[SimpleFunctionDescriptorImpl]

'SecureHash' @ [26:31] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'parse' @ [26:42] ==> @JvmStatic public final fun parse(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'ProgressTracker.Step' @ [28:31] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker.Step' @ [30:26] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'TwoPartyTradeFlow' @ [31:68] ==> public object TwoPartyTradeFlow defined in net.corda.finance.flows[FakeCallableDescriptorForObject]

'tracker' @ [31:93] ==> public final fun tracker(): ProgressTracker defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller.Companion[DeserializedSimpleFunctionDescriptor]

'ProgressTracker' @ [37:25] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[DeserializedClassConstructorDescriptor]

'SELF_ISSUING' @ [37:41] ==> public object SELF_ISSUING : ProgressTracker.Step defined in net.corda.traderdemo.flow.SellerFlow.Companion[FakeCallableDescriptorForObject]

'TRADING' @ [37:55] ==> public object TRADING : ProgressTracker.Step defined in net.corda.traderdemo.flow.SellerFlow.Companion[FakeCallableDescriptorForObject]

'Suspendable' @ [40:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'progressTracker' @ [42:9] ==> public open val progressTracker: ProgressTracker defined in net.corda.traderdemo.flow.SellerFlow[PropertyDescriptorImpl]

'currentStep' @ [42:25] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'SELF_ISSUING' @ [42:39] ==> public object SELF_ISSUING : ProgressTracker.Step defined in net.corda.traderdemo.flow.SellerFlow.Companion[FakeCallableDescriptorForObject]

'serviceHub' @ [44:32] ==> public final val serviceHub: ServiceHub defined in net.corda.traderdemo.flow.SellerFlow[DeserializedPropertyDescriptor]

'networkMapCache' @ [44:43] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'notaryNodes' @ [44:59] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedPropertyDescriptor]

'serviceHub' @ [45:26] ==> public final val serviceHub: ServiceHub defined in net.corda.traderdemo.flow.SellerFlow[DeserializedPropertyDescriptor]

'keyManagementService' @ [45:37] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'freshKey' @ [45:58] ==> @Suspendable public abstract fun freshKey(): PublicKey defined in net.corda.core.node.services.KeyManagementService[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [46:31] ==> public final val serviceHub: ServiceHub defined in net.corda.traderdemo.flow.SellerFlow[DeserializedPropertyDescriptor]

'vaultQueryService' @ [46:42] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'queryBy' @ [46:60] ==> public open fun <T : ContractState> queryBy(contractType: Class<out CommercialPaper.State>): Vault.Page<CommercialPaper.State> defined in net.corda.core.node.services.VaultQueryService[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> State

'State' @ [46:84] ==> public constructor State(issuance: PartyAndReference, owner: AbstractParty, faceValue: Amount<Issued<Currency>>, maturityDate: Instant) defined in net.corda.finance.contracts.CommercialPaper.State[DeserializedClassConstructorDescriptor]

'java' @ [46:97] ==> public val <T> KClass<CommercialPaper.State>.java: Class<CommercialPaper.State> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> State

'states' @ [46:103] ==> public final val states: List<StateAndRef<CommercialPaper.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'first' @ [46:110] ==> public fun <T> List<StateAndRef<CommercialPaper.State>>.first(): StateAndRef<CommercialPaper.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'progressTracker' @ [49:9] ==> public open val progressTracker: ProgressTracker defined in net.corda.traderdemo.flow.SellerFlow[PropertyDescriptorImpl]

'currentStep' @ [49:25] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'TRADING' @ [49:39] ==> public object TRADING : ProgressTracker.Step defined in net.corda.traderdemo.flow.SellerFlow.Companion[FakeCallableDescriptorForObject]

'send' @ [52:9] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.traderdemo.flow.SellerFlow[DeserializedSimpleFunctionDescriptor]

'otherParty' @ [52:14] ==> public final val otherParty: Party defined in net.corda.traderdemo.flow.SellerFlow[PropertyDescriptorImpl]

'amount' @ [52:26] ==> public final val amount: Amount<Currency> defined in net.corda.traderdemo.flow.SellerFlow[PropertyDescriptorImpl]

'TwoPartyTradeFlow' @ [53:22] ==> public object TwoPartyTradeFlow defined in net.corda.finance.flows[FakeCallableDescriptorForObject]

'Seller' @ [53:40] ==> public constructor Seller(otherParty: Party, notaryNode: NodeInfo, assetToSell: StateAndRef<OwnableState>, price: Amount<Currency>, me: AbstractParty, progressTracker: ProgressTracker = ...) defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller[DeserializedClassConstructorDescriptor]

'otherParty' @ [54:17] ==> public final val otherParty: Party defined in net.corda.traderdemo.flow.SellerFlow[PropertyDescriptorImpl]

'notary' @ [55:17] ==> val notary: NodeInfo defined in net.corda.traderdemo.flow.SellerFlow.call[LocalVariableDescriptor]

'commercialPaper' @ [56:17] ==> val commercialPaper: StateAndRef<CommercialPaper.State> defined in net.corda.traderdemo.flow.SellerFlow.call[LocalVariableDescriptor]

'amount' @ [57:17] ==> public final val amount: Amount<Currency> defined in net.corda.traderdemo.flow.SellerFlow[PropertyDescriptorImpl]

'AnonymousParty' @ [58:17] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'cpOwnerKey' @ [58:32] ==> val cpOwnerKey: PublicKey defined in net.corda.traderdemo.flow.SellerFlow.call[LocalVariableDescriptor]

'progressTracker' @ [59:17] ==> public open val progressTracker: ProgressTracker defined in net.corda.traderdemo.flow.SellerFlow[PropertyDescriptorImpl]

'getChildProgressTracker' @ [59:33] ==> public final fun getChildProgressTracker(step: ProgressTracker.Step): ProgressTracker? defined in net.corda.core.utilities.ProgressTracker[DeserializedSimpleFunctionDescriptor]

'TRADING' @ [59:57] ==> public object TRADING : ProgressTracker.Step defined in net.corda.traderdemo.flow.SellerFlow.Companion[FakeCallableDescriptorForObject]

'subFlow' @ [60:16] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.traderdemo.flow.SellerFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'seller' @ [60:24] ==> val seller: TwoPartyTradeFlow.Seller defined in net.corda.traderdemo.flow.SellerFlow.call[LocalVariableDescriptor]

