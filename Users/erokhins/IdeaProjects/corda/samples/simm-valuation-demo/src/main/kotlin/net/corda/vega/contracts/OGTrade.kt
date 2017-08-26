'requireNotNull' @ [12:9] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: TimeWindow?, lazyMessage: () -> Any): TimeWindow defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TimeWindow

'tx' @ [12:24] ==> value-parameter tx: LedgerTransaction defined in net.corda.vega.contracts.OGTrade.verify[ValueParameterDescriptorImpl]

'timeWindow' @ [12:27] ==> public final val timeWindow: TimeWindow? defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'tx' @ [13:86] ==> value-parameter tx: LedgerTransaction defined in net.corda.vega.contracts.OGTrade.verify[ValueParameterDescriptorImpl]

'groupStates' @ [13:89] ==> public final inline fun <reified T : ContractState, K : Any> groupStates(noinline selector: (IRSState) -> UniqueIdentifier): List<LedgerTransaction.InOutGroup<IRSState, UniqueIdentifier>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> IRSState
    <K : Any> -> UniqueIdentifier

'state' @ [13:112] ==> value-parameter state: IRSState defined in net.corda.vega.contracts.OGTrade.verify.<anonymous>[ValueParameterDescriptorImpl]

'linearId' @ [13:118] ==> public open val linearId: UniqueIdentifier defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'component1' @ [15:15] ==> public final operator fun component1(): List<IRSState> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'component2' @ [15:23] ==> public final operator fun component2(): List<IRSState> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'component3' @ [15:32] ==> public final operator fun component3(): UniqueIdentifier defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'groups' @ [15:38] ==> val groups: List<LedgerTransaction.InOutGroup<IRSState, UniqueIdentifier>> defined in net.corda.vega.contracts.OGTrade.verify[LocalVariableDescriptor]

'tx' @ [16:27] ==> value-parameter tx: LedgerTransaction defined in net.corda.vega.contracts.OGTrade.verify[ValueParameterDescriptorImpl]

'commands' @ [16:30] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'select' @ [16:39] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signer: PublicKey? = ..., party: AbstractParty? = ...): List<AuthenticatedObject<OGTrade.Commands.Agree>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Agree

'firstOrNull' @ [16:64] ==> public fun <T> List<AuthenticatedObject<OGTrade.Commands.Agree>>.firstOrNull(): AuthenticatedObject<OGTrade.Commands.Agree>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<Agree>

'command' @ [17:17] ==> val command: AuthenticatedObject<OGTrade.Commands.Agree>? defined in net.corda.vega.contracts.OGTrade.verify[LocalVariableDescriptor]

'require' @ [18:17] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'inputs' @ [18:25] ==> val inputs: List<IRSState> defined in net.corda.vega.contracts.OGTrade.verify[LocalVariableDescriptor]

'isEmpty' @ [18:32] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'require' @ [19:17] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'outputs' @ [19:25] ==> val outputs: List<IRSState> defined in net.corda.vega.contracts.OGTrade.verify[LocalVariableDescriptor]

'size' @ [19:33] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'require' @ [20:17] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'outputs' @ [20:25] ==> val outputs: List<IRSState> defined in net.corda.vega.contracts.OGTrade.verify[LocalVariableDescriptor]

'buyer' @ [20:36] ==> public final val buyer: AbstractParty defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'outputs' @ [20:45] ==> val outputs: List<IRSState> defined in net.corda.vega.contracts.OGTrade.verify[LocalVariableDescriptor]

'seller' @ [20:56] ==> public final val seller: AbstractParty defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'require' @ [21:17] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'outputs' @ [21:25] ==> val outputs: List<IRSState> defined in net.corda.vega.contracts.OGTrade.verify[LocalVariableDescriptor]

'participants' @ [21:36] ==> public open val participants: List<AbstractParty> defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'containsAll' @ [21:49] ==> public abstract fun containsAll(elements: Collection<AbstractParty>): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'outputs' @ [21:61] ==> val outputs: List<IRSState> defined in net.corda.vega.contracts.OGTrade.verify[LocalVariableDescriptor]

'participants' @ [21:72] ==> public open val participants: List<AbstractParty> defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'require' @ [22:17] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'outputs' @ [22:25] ==> val outputs: List<IRSState> defined in net.corda.vega.contracts.OGTrade.verify[LocalVariableDescriptor]

'participants' @ [22:36] ==> public open val participants: List<AbstractParty> defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'containsAll' @ [22:49] ==> public abstract fun containsAll(elements: Collection<AbstractParty>): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'listOf' @ [22:61] ==> public fun <T> listOf(vararg elements: AbstractParty): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'outputs' @ [22:68] ==> val outputs: List<IRSState> defined in net.corda.vega.contracts.OGTrade.verify[LocalVariableDescriptor]

'buyer' @ [22:79] ==> public final val buyer: AbstractParty defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'outputs' @ [22:86] ==> val outputs: List<IRSState> defined in net.corda.vega.contracts.OGTrade.verify[LocalVariableDescriptor]

'seller' @ [22:97] ==> public final val seller: AbstractParty defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'require' @ [23:17] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'outputs' @ [23:25] ==> val outputs: List<IRSState> defined in net.corda.vega.contracts.OGTrade.verify[LocalVariableDescriptor]

'swap' @ [23:36] ==> public final val swap: SwapData defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'startDate' @ [23:41] ==> public final val startDate: LocalDate defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'isBefore' @ [23:51] ==> public open fun isBefore(p0: (ChronoLocalDate..ChronoLocalDate?)): Boolean defined in java.time.LocalDate[JavaMethodDescriptor]

'outputs' @ [23:60] ==> val outputs: List<IRSState> defined in net.corda.vega.contracts.OGTrade.verify[LocalVariableDescriptor]

'swap' @ [23:71] ==> public final val swap: SwapData defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'endDate' @ [23:76] ==> public final val endDate: LocalDate defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'require' @ [24:17] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'outputs' @ [24:25] ==> val outputs: List<IRSState> defined in net.corda.vega.contracts.OGTrade.verify[LocalVariableDescriptor]

'swap' @ [24:36] ==> public final val swap: SwapData defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'notional' @ [24:41] ==> public final val notional: BigDecimal defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'BigDecimal' @ [24:52] ==> public constructor BigDecimal(p0: Int) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'require' @ [25:17] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'outputs' @ [25:25] ==> val outputs: List<IRSState> defined in net.corda.vega.contracts.OGTrade.verify[LocalVariableDescriptor]

'swap' @ [25:36] ==> public final val swap: SwapData defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'tradeDate' @ [25:41] ==> public final val tradeDate: LocalDate defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'isBefore' @ [25:51] ==> public open fun isBefore(p0: (ChronoLocalDate..ChronoLocalDate?)): Boolean defined in java.time.LocalDate[JavaMethodDescriptor]

'outputs' @ [25:60] ==> val outputs: List<IRSState> defined in net.corda.vega.contracts.OGTrade.verify[LocalVariableDescriptor]

'swap' @ [25:71] ==> public final val swap: SwapData defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'endDate' @ [25:76] ==> public final val endDate: LocalDate defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'atLeastOneCommandProcessed' @ [26:17] ==> var atLeastOneCommandProcessed: Boolean defined in net.corda.vega.contracts.OGTrade.verify[LocalVariableDescriptor]

'require' @ [29:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'atLeastOneCommandProcessed' @ [29:17] ==> var atLeastOneCommandProcessed: Boolean defined in net.corda.vega.contracts.OGTrade.verify[LocalVariableDescriptor]

'TypeOnlyCommandData' @ [33:23] ==> public constructor TypeOnlyCommandData() defined in net.corda.core.contracts.TypeOnlyCommandData[DeserializedClassConstructorDescriptor]

