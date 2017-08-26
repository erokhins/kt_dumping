'UniqueIdentifier' @ [26:69] ==> public constructor UniqueIdentifier(externalId: String? = ..., id: UUID = ...) defined in net.corda.core.contracts.UniqueIdentifier[DeserializedClassConstructorDescriptor]

'CordaSerializable' @ [28:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'_parties' @ [31:60] ==> private final val _parties: Pair<AbstractParty, AbstractParty> defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'toList' @ [31:69] ==> public fun <T> Pair<AbstractParty, AbstractParty>.toList(): List<AbstractParty> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'linearId' @ [32:29] ==> public open val linearId: UniqueIdentifier defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'toString' @ [32:38] ==> public open fun toString(): String defined in net.corda.core.contracts.UniqueIdentifier[DeserializedSimpleFunctionDescriptor]

'participants' @ [33:39] ==> public open val participants: List<AbstractParty> defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'flowLogicRefFactory' @ [36:20] ==> value-parameter flowLogicRefFactory: FlowLogicRefFactory defined in net.corda.vega.contracts.PortfolioState.nextScheduledActivity[ValueParameterDescriptorImpl]

'create' @ [36:40] ==> public abstract fun create(flowClass: Class<out FlowLogic<*>>, vararg args: Any?): FlowLogicRef defined in net.corda.core.flows.FlowLogicRefFactory[DeserializedSimpleFunctionDescriptor]

'SimmRevaluation' @ [36:47] ==> public object SimmRevaluation defined in net.corda.vega.flows in file SimmRevaluation.kt[FakeCallableDescriptorForObject]

'Initiator' @ [36:63] ==> public constructor Initiator(curStateRef: StateRef, valuationDate: LocalDate) defined in net.corda.vega.flows.SimmRevaluation.Initiator[ClassConstructorDescriptorImpl]

'java' @ [36:80] ==> public val <T> KClass<SimmRevaluation.Initiator>.java: Class<SimmRevaluation.Initiator> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Initiator

'thisStateRef' @ [36:86] ==> value-parameter thisStateRef: StateRef defined in net.corda.vega.contracts.PortfolioState.nextScheduledActivity[ValueParameterDescriptorImpl]

'now' @ [36:110] ==> public open fun now(): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'ScheduledActivity' @ [37:16] ==> public constructor ScheduledActivity(logicRef: FlowLogicRef, scheduledAt: Instant) defined in net.corda.core.contracts.ScheduledActivity[DeserializedClassConstructorDescriptor]

'flow' @ [37:34] ==> val flow: FlowLogicRef defined in net.corda.vega.contracts.PortfolioState.nextScheduledActivity[LocalVariableDescriptor]

'now' @ [37:50] ==> public open fun now(): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'plus' @ [37:56] ==> public open fun plus(p0: Long, p1: (TemporalUnit..TemporalUnit?)): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'DAYS' @ [37:75] ==> enum entry DAYS defined in java.time.temporal.ChronoUnit[FakeCallableDescriptorForObject]

'atStartOfDay' @ [37:81] ==> public open fun atStartOfDay(): (LocalDateTime..LocalDateTime?) defined in java.time.LocalDate[JavaMethodDescriptor]

'toInstant' @ [37:96] ==> public open fun toInstant(p0: (ZoneOffset..ZoneOffset?)): (Instant..Instant?) defined in java.time.LocalDateTime[JavaMethodDescriptor]

'UTC' @ [37:117] ==> public final val UTC: (ZoneOffset..ZoneOffset?) defined in java.time.ZoneOffset[JavaPropertyDescriptor]

'participants' @ [41:16] ==> public open val participants: List<AbstractParty> defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'flatMap' @ [41:29] ==> public inline fun <T, R> Iterable<AbstractParty>.flatMap(transform: (AbstractParty) -> Iterable<PublicKey>): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PublicKey

'it' @ [41:39] ==> value-parameter it: AbstractParty defined in net.corda.vega.contracts.PortfolioState.isRelevant.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [41:42] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'keys' @ [41:52] ==> public val PublicKey.keys: Set<PublicKey> defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'intersect' @ [41:59] ==> public infix fun <T> Iterable<PublicKey>.intersect(other: Iterable<PublicKey>): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'ourKeys' @ [41:69] ==> value-parameter ourKeys: Set<PublicKey> defined in net.corda.vega.contracts.PortfolioState.isRelevant[ValueParameterDescriptorImpl]

'isNotEmpty' @ [41:78] ==> @InlineOnly public inline fun <T> Collection<PublicKey>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'TransactionBuilder' @ [45:16] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [45:35] ==> value-parameter notary: Party defined in net.corda.vega.contracts.PortfolioState.generateAgreement[ValueParameterDescriptorImpl]

'withItems' @ [45:43] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'copy' @ [45:53] ==> public final fun copy(portfolio: List<StateRef> = ..., contract: PortfolioSwap = ..., _parties: Pair<AbstractParty, AbstractParty> = ..., valuationDate: LocalDate = ..., valuation: PortfolioValuation? = ..., linearId: UniqueIdentifier = ...): PortfolioState defined in net.corda.vega.contracts.PortfolioState[SimpleFunctionDescriptorImpl]

'Command' @ [45:61] ==> public constructor Command<T : CommandData>(value: PortfolioSwap.Commands.Agree, signers: List<PublicKey>) defined in net.corda.core.contracts.Command[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : CommandData> -> Agree

'Agree' @ [45:92] ==> public constructor Agree() defined in net.corda.vega.contracts.PortfolioSwap.Commands.Agree[ClassConstructorDescriptorImpl]

'participants' @ [45:101] ==> public open val participants: List<AbstractParty> defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'map' @ [45:114] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PublicKey

'it' @ [45:120] ==> value-parameter it: AbstractParty defined in net.corda.vega.contracts.PortfolioState.generateAgreement.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [45:123] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'require' @ [49:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'oldState' @ [49:17] ==> value-parameter oldState: StateAndRef<*> defined in net.corda.vega.contracts.PortfolioState.generateRevision[ValueParameterDescriptorImpl]

'state' @ [49:26] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [49:32] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'this' @ [49:40] ==> <this> defined in net.corda.vega.contracts.PortfolioState[LazyClassReceiverParameterDescriptor]

'updatedValue' @ [50:25] ==> value-parameter updatedValue: PortfolioState.Update defined in net.corda.vega.contracts.PortfolioState.generateRevision[ValueParameterDescriptorImpl]

'portfolio' @ [50:38] ==> public final val portfolio: List<StateRef>? defined in net.corda.vega.contracts.PortfolioState.Update[PropertyDescriptorImpl]

'portfolio' @ [50:51] ==> public final val portfolio: List<StateRef> defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'updatedValue' @ [51:25] ==> value-parameter updatedValue: PortfolioState.Update defined in net.corda.vega.contracts.PortfolioState.generateRevision[ValueParameterDescriptorImpl]

'valuation' @ [51:38] ==> public final val valuation: PortfolioValuation? defined in net.corda.vega.contracts.PortfolioState.Update[PropertyDescriptorImpl]

'valuation' @ [51:51] ==> public final val valuation: PortfolioValuation? defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'TransactionBuilder' @ [53:18] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [53:37] ==> value-parameter notary: Party defined in net.corda.vega.contracts.PortfolioState.generateRevision[ValueParameterDescriptorImpl]

'tx' @ [54:9] ==> val tx: TransactionBuilder defined in net.corda.vega.contracts.PortfolioState.generateRevision[LocalVariableDescriptor]

'addInputState' @ [54:12] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'oldState' @ [54:26] ==> value-parameter oldState: StateAndRef<*> defined in net.corda.vega.contracts.PortfolioState.generateRevision[ValueParameterDescriptorImpl]

'tx' @ [55:9] ==> val tx: TransactionBuilder defined in net.corda.vega.contracts.PortfolioState.generateRevision[LocalVariableDescriptor]

'addOutputState' @ [55:12] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'copy' @ [55:27] ==> public final fun copy(portfolio: List<StateRef> = ..., contract: PortfolioSwap = ..., _parties: Pair<AbstractParty, AbstractParty> = ..., valuationDate: LocalDate = ..., valuation: PortfolioValuation? = ..., linearId: UniqueIdentifier = ...): PortfolioState defined in net.corda.vega.contracts.PortfolioState[SimpleFunctionDescriptorImpl]

'portfolio' @ [55:44] ==> val portfolio: List<StateRef> defined in net.corda.vega.contracts.PortfolioState.generateRevision[LocalVariableDescriptor]

'valuation' @ [55:67] ==> val valuation: PortfolioValuation? defined in net.corda.vega.contracts.PortfolioState.generateRevision[LocalVariableDescriptor]

'tx' @ [56:9] ==> val tx: TransactionBuilder defined in net.corda.vega.contracts.PortfolioState.generateRevision[LocalVariableDescriptor]

'addCommand' @ [56:12] ==> public final fun addCommand(data: CommandData, keys: List<PublicKey>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'Update' @ [56:46] ==> public constructor Update() defined in net.corda.vega.contracts.PortfolioSwap.Commands.Update[ClassConstructorDescriptorImpl]

'participants' @ [56:56] ==> public open val participants: List<AbstractParty> defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'map' @ [56:69] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PublicKey

'it' @ [56:75] ==> value-parameter it: AbstractParty defined in net.corda.vega.contracts.PortfolioState.generateRevision.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [56:78] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'tx' @ [57:16] ==> val tx: TransactionBuilder defined in net.corda.vega.contracts.PortfolioState.generateRevision[LocalVariableDescriptor]

