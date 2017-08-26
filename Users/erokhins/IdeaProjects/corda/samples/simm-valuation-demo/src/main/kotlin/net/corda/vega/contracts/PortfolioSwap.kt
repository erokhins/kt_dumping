'requireNotNull' @ [13:9] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: TimeWindow?, lazyMessage: () -> Any): TimeWindow defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TimeWindow

'tx' @ [13:24] ==> value-parameter tx: LedgerTransaction defined in net.corda.vega.contracts.PortfolioSwap.verify[ValueParameterDescriptorImpl]

'timeWindow' @ [13:27] ==> public final val timeWindow: TimeWindow? defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'tx' @ [14:92] ==> value-parameter tx: LedgerTransaction defined in net.corda.vega.contracts.PortfolioSwap.verify[ValueParameterDescriptorImpl]

'groupStates' @ [14:95] ==> public final inline fun <reified T : ContractState, K : Any> groupStates(noinline selector: (PortfolioState) -> UniqueIdentifier): List<LedgerTransaction.InOutGroup<PortfolioState, UniqueIdentifier>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> PortfolioState
    <K : Any> -> UniqueIdentifier

'state' @ [14:118] ==> value-parameter state: PortfolioState defined in net.corda.vega.contracts.PortfolioSwap.verify.<anonymous>[ValueParameterDescriptorImpl]

'linearId' @ [14:124] ==> public open val linearId: UniqueIdentifier defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'component1' @ [15:15] ==> public final operator fun component1(): List<PortfolioState> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'component2' @ [15:23] ==> public final operator fun component2(): List<PortfolioState> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'component3' @ [15:32] ==> public final operator fun component3(): UniqueIdentifier defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'groups' @ [15:38] ==> val groups: List<LedgerTransaction.InOutGroup<PortfolioState, UniqueIdentifier>> defined in net.corda.vega.contracts.PortfolioSwap.verify[LocalVariableDescriptor]

'tx' @ [16:32] ==> value-parameter tx: LedgerTransaction defined in net.corda.vega.contracts.PortfolioSwap.verify[ValueParameterDescriptorImpl]

'commands' @ [16:35] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'select' @ [16:44] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signer: PublicKey? = ..., party: AbstractParty? = ...): List<AuthenticatedObject<PortfolioSwap.Commands.Agree>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Agree

'firstOrNull' @ [16:69] ==> public fun <T> List<AuthenticatedObject<PortfolioSwap.Commands.Agree>>.firstOrNull(): AuthenticatedObject<PortfolioSwap.Commands.Agree>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<Agree>

'if (agreeCommand != null) {
                requireThat {
                    "there are no inputs" using (inputs.isEmpty())
                    "there is one output" using (outputs.size == 1)
                    "valuer must be a party" using (outputs[0].participants.contains(outputs[0].valuer))
                }
            } else {
                val updateCommand = tx.commands.select<Commands.Update>().firstOrNull()
                if (updateCommand != null) {
                    requireThat {
                        "there is only one input" using (inputs.size == 1)
                        "there is only one output" using (outputs.size == 1)
                        "the valuer hasn't changed" using (inputs[0].valuer == outputs[0].valuer)
                        "the linear id hasn't changed" using (inputs[0].linearId == outputs[0].linearId)
                    }

                }
            }' @ [17:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'agreeCommand' @ [17:17] ==> val agreeCommand: AuthenticatedObject<PortfolioSwap.Commands.Agree>? defined in net.corda.vega.contracts.PortfolioSwap.verify[LocalVariableDescriptor]

'requireThat' @ [18:17] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [19:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'inputs' @ [19:50] ==> val inputs: List<PortfolioState> defined in net.corda.vega.contracts.PortfolioSwap.verify[LocalVariableDescriptor]

'isEmpty' @ [19:57] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'using' @ [20:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'outputs' @ [20:50] ==> val outputs: List<PortfolioState> defined in net.corda.vega.contracts.PortfolioSwap.verify[LocalVariableDescriptor]

'size' @ [20:58] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'using' @ [21:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'outputs' @ [21:53] ==> val outputs: List<PortfolioState> defined in net.corda.vega.contracts.PortfolioSwap.verify[LocalVariableDescriptor]

'participants' @ [21:64] ==> public open val participants: List<AbstractParty> defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'contains' @ [21:77] ==> public abstract fun contains(element: AbstractParty): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'outputs' @ [21:86] ==> val outputs: List<PortfolioState> defined in net.corda.vega.contracts.PortfolioSwap.verify[LocalVariableDescriptor]

'valuer' @ [21:97] ==> public final val valuer: AbstractParty defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'tx' @ [24:37] ==> value-parameter tx: LedgerTransaction defined in net.corda.vega.contracts.PortfolioSwap.verify[ValueParameterDescriptorImpl]

'commands' @ [24:40] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'select' @ [24:49] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signer: PublicKey? = ..., party: AbstractParty? = ...): List<AuthenticatedObject<PortfolioSwap.Commands.Update>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Update

'firstOrNull' @ [24:75] ==> public fun <T> List<AuthenticatedObject<PortfolioSwap.Commands.Update>>.firstOrNull(): AuthenticatedObject<PortfolioSwap.Commands.Update>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<Update>

'updateCommand' @ [25:21] ==> val updateCommand: AuthenticatedObject<PortfolioSwap.Commands.Update>? defined in net.corda.vega.contracts.PortfolioSwap.verify[LocalVariableDescriptor]

'requireThat' @ [26:21] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [27:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'inputs' @ [27:58] ==> val inputs: List<PortfolioState> defined in net.corda.vega.contracts.PortfolioSwap.verify[LocalVariableDescriptor]

'size' @ [27:65] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'using' @ [28:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'outputs' @ [28:59] ==> val outputs: List<PortfolioState> defined in net.corda.vega.contracts.PortfolioSwap.verify[LocalVariableDescriptor]

'size' @ [28:67] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'using' @ [29:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'inputs' @ [29:60] ==> val inputs: List<PortfolioState> defined in net.corda.vega.contracts.PortfolioSwap.verify[LocalVariableDescriptor]

'valuer' @ [29:70] ==> public final val valuer: AbstractParty defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'outputs' @ [29:80] ==> val outputs: List<PortfolioState> defined in net.corda.vega.contracts.PortfolioSwap.verify[LocalVariableDescriptor]

'valuer' @ [29:91] ==> public final val valuer: AbstractParty defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'using' @ [30:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'inputs' @ [30:63] ==> val inputs: List<PortfolioState> defined in net.corda.vega.contracts.PortfolioSwap.verify[LocalVariableDescriptor]

'linearId' @ [30:73] ==> public open val linearId: UniqueIdentifier defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'outputs' @ [30:85] ==> val outputs: List<PortfolioState> defined in net.corda.vega.contracts.PortfolioSwap.verify[LocalVariableDescriptor]

'linearId' @ [30:96] ==> public open val linearId: UniqueIdentifier defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'TypeOnlyCommandData' @ [39:23] ==> public constructor TypeOnlyCommandData() defined in net.corda.core.contracts.TypeOnlyCommandData[DeserializedClassConstructorDescriptor]

'TypeOnlyCommandData' @ [40:24] ==> public constructor TypeOnlyCommandData() defined in net.corda.core.contracts.TypeOnlyCommandData[DeserializedClassConstructorDescriptor]

