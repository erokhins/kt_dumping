'CommodityContract' @ [23:28] ==> public constructor CommodityContract() defined in net.corda.finance.contracts.asset.CommodityContract[ClassConstructorDescriptorImpl]

'OnLedgerAsset<Commodity, CommodityContract.Commands, CommodityContract.State>' @ [36:27] ==> public constructor OnLedgerAsset<T : Any, C : CommandData, S : FungibleAsset<Commodity>>() defined in net.corda.finance.contracts.asset.OnLedgerAsset[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> Commodity
    <C : CommandData> -> Commands
    <S : FungibleAsset<T>> -> State

'this' @ [45:19] ==> public constructor State(amount: Amount<Issued<Commodity>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.CommodityContract.State[ClassConstructorDescriptorImpl]

'Amount' @ [45:24] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Commodity>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Commodity>

'amount' @ [45:31] ==> value-parameter amount: Amount<Commodity> defined in net.corda.finance.contracts.asset.CommodityContract.State.<init>[ValueParameterDescriptorImpl]

'quantity' @ [45:38] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'Issued' @ [45:48] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Commodity) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Commodity

'deposit' @ [45:55] ==> value-parameter deposit: PartyAndReference defined in net.corda.finance.contracts.asset.CommodityContract.State.<init>[ValueParameterDescriptorImpl]

'amount' @ [45:64] ==> value-parameter amount: Amount<Commodity> defined in net.corda.finance.contracts.asset.CommodityContract.State.<init>[ValueParameterDescriptorImpl]

'token' @ [45:71] ==> public final val token: Commodity defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'owner' @ [45:80] ==> value-parameter owner: AbstractParty defined in net.corda.finance.contracts.asset.CommodityContract.State.<init>[ValueParameterDescriptorImpl]

'COMMODITY_PROGRAM_ID' @ [47:33] ==> public val COMMODITY_PROGRAM_ID: CommodityContract defined in net.corda.finance.contracts.asset in file CommodityContract.kt[PropertyDescriptorImpl]

'singleton' @ [48:61] ==> public open fun <T : (Any..Any?)> singleton(p0: (PublicKey..PublicKey?)): (MutableSet<(PublicKey..PublicKey?)>..Set<(PublicKey..PublicKey?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PublicKey

'owner' @ [48:71] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.CommodityContract.State[PropertyDescriptorImpl]

'owningKey' @ [48:77] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'listOf' @ [49:37] ==> public fun <T> listOf(element: AbstractParty): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'owner' @ [49:44] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.CommodityContract.State[PropertyDescriptorImpl]

'copy' @ [52:19] ==> public final fun copy(amount: Amount<Issued<Commodity>> = ..., owner: AbstractParty = ...): CommodityContract.State defined in net.corda.finance.contracts.asset.CommodityContract.State[SimpleFunctionDescriptorImpl]

'amount' @ [52:33] ==> public open val amount: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.CommodityContract.State[PropertyDescriptorImpl]

'copy' @ [52:40] ==> public final fun copy(quantity: Long = ..., displayTokenSize: BigDecimal = ..., token: Issued<Commodity> = ...): Amount<Issued<Commodity>> defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'newAmount' @ [52:45] ==> value-parameter newAmount: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.CommodityContract.State.withNewOwnerAndAmount[ValueParameterDescriptorImpl]

'quantity' @ [52:55] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'newOwner' @ [52:74] ==> value-parameter newOwner: AbstractParty defined in net.corda.finance.contracts.asset.CommodityContract.State.withNewOwnerAndAmount[ValueParameterDescriptorImpl]

'amount' @ [54:47] ==> public open val amount: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.CommodityContract.State[PropertyDescriptorImpl]

'amount' @ [54:59] ==> public open val amount: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.CommodityContract.State[PropertyDescriptorImpl]

'token' @ [54:66] ==> public final val token: Issued<Commodity> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [54:72] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'owner' @ [54:90] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.CommodityContract.State[PropertyDescriptorImpl]

'CommandAndState' @ [56:62] ==> public constructor CommandAndState(command: CommandData, ownableState: OwnableState) defined in net.corda.core.contracts.CommandAndState[DeserializedClassConstructorDescriptor]

'Move' @ [56:87] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.CommodityContract.Commands.Move[ClassConstructorDescriptorImpl]

'copy' @ [56:95] ==> public final fun copy(amount: Amount<Issued<Commodity>> = ..., owner: AbstractParty = ...): CommodityContract.State defined in net.corda.finance.contracts.asset.CommodityContract.State[SimpleFunctionDescriptorImpl]

'newOwner' @ [56:108] ==> value-parameter newOwner: AbstractParty defined in net.corda.finance.contracts.asset.CommodityContract.State.withNewOwner[ValueParameterDescriptorImpl]

'CordaSerializable' @ [60:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'TypeOnlyCommandData' @ [74:23] ==> public constructor TypeOnlyCommandData() defined in net.corda.core.contracts.TypeOnlyCommandData[DeserializedClassConstructorDescriptor]

'tx' @ [86:22] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.CommodityContract.verify[ValueParameterDescriptorImpl]

'groupStates' @ [86:25] ==> public final inline fun <reified T : ContractState, K : Any> groupStates(noinline selector: (CommodityContract.State) -> Issued<Commodity>): List<LedgerTransaction.InOutGroup<CommodityContract.State, Issued<Commodity>>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State
    <K : Any> -> Issued<Commodity>

'it' @ [86:70] ==> value-parameter it: CommodityContract.State defined in net.corda.finance.contracts.asset.CommodityContract.verify.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [86:73] ==> public open val amount: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.CommodityContract.State[PropertyDescriptorImpl]

'token' @ [86:80] ==> public final val token: Issued<Commodity> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'component1' @ [88:15] ==> public final operator fun component1(): List<CommodityContract.State> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'component2' @ [88:23] ==> public final operator fun component2(): List<CommodityContract.State> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'component3' @ [88:32] ==> public final operator fun component3(): Issued<Commodity> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'groups' @ [88:40] ==> val groups: List<LedgerTransaction.InOutGroup<CommodityContract.State, Issued<Commodity>>> defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'key' @ [90:26] ==> val key: Issued<Commodity> defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'issuer' @ [90:30] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'key' @ [91:29] ==> val key: Issued<Commodity> defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'product' @ [91:33] ==> public final val product: Commodity defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'issuer' @ [92:25] ==> val issuer: PartyAndReference defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'party' @ [92:32] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'requireThat' @ [94:13] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [95:17] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'outputs' @ [95:59] ==> val outputs: List<CommodityContract.State> defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'none' @ [95:67] ==> public inline fun <T> Iterable<CommodityContract.State>.none(predicate: (CommodityContract.State) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'it' @ [95:74] ==> value-parameter it: CommodityContract.State defined in net.corda.finance.contracts.asset.CommodityContract.verify.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [95:77] ==> public open val amount: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.CommodityContract.State[PropertyDescriptorImpl]

'quantity' @ [95:84] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'tx' @ [98:32] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.CommodityContract.verify[ValueParameterDescriptorImpl]

'commands' @ [98:35] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'select' @ [98:44] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signer: PublicKey? = ..., party: AbstractParty? = ...): List<AuthenticatedObject<CommodityContract.Commands.Issue>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Issue

'firstOrNull' @ [98:69] ==> public fun <T> List<AuthenticatedObject<CommodityContract.Commands.Issue>>.firstOrNull(): AuthenticatedObject<CommodityContract.Commands.Issue>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<Issue>

'if (issueCommand != null) {
                verifyIssueCommand(inputs, outputs, tx, issueCommand, commodity, issuer)
            } else {
                val inputAmount = inputs.sumCommoditiesOrNull() ?: throw IllegalArgumentException("there is at least one commodity input for this group")
                val outputAmount = outputs.sumCommoditiesOrZero(Issued(issuer, commodity))

                // If we want to remove commodity from the ledger, that must be signed for by the issuer.
                // A mis-signed or duplicated exit command will just be ignored here and result in the exit amount being zero.
                val exitCommand = tx.commands.select<Commands.Exit>(party = party).singleOrNull()
                val amountExitingLedger = exitCommand?.value?.amount ?: Amount(0, Issued(issuer, commodity))

                requireThat {
                    "there are no zero sized inputs" using ( inputs.none { it.amount.quantity == 0L } )
                    "for reference ${issuer.reference} at issuer ${party.nameOrNull()} the amounts balance" using
                            (inputAmount == outputAmount + amountExitingLedger)
                }

                verifyMoveCommand<Commands.Move>(inputs, tx.commands)
            }' @ [99:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'issueCommand' @ [99:17] ==> val issueCommand: AuthenticatedObject<CommodityContract.Commands.Issue>? defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'verifyIssueCommand' @ [100:17] ==> private final fun verifyIssueCommand(inputs: List<CommodityContract.State>, outputs: List<CommodityContract.State>, tx: LedgerTransaction, issueCommand: AuthenticatedObject<CommodityContract.Commands.Issue>, commodity: Commodity, issuer: PartyAndReference): Unit defined in net.corda.finance.contracts.asset.CommodityContract[SimpleFunctionDescriptorImpl]

'inputs' @ [100:36] ==> val inputs: List<CommodityContract.State> defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'outputs' @ [100:44] ==> val outputs: List<CommodityContract.State> defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'tx' @ [100:53] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.CommodityContract.verify[ValueParameterDescriptorImpl]

'issueCommand' @ [100:57] ==> val issueCommand: AuthenticatedObject<CommodityContract.Commands.Issue>? defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'commodity' @ [100:71] ==> val commodity: Commodity defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'issuer' @ [100:82] ==> val issuer: PartyAndReference defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'inputs' @ [102:35] ==> val inputs: List<CommodityContract.State> defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'sumCommoditiesOrNull' @ [102:42] ==> @Suppress public fun Iterable<ContractState>.sumCommoditiesOrNull(): Amount<Issued<Commodity>>? defined in net.corda.finance.utils[SimpleFunctionDescriptorImpl]

'IllegalArgumentException' @ [102:74] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'outputs' @ [103:36] ==> val outputs: List<CommodityContract.State> defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'sumCommoditiesOrZero' @ [103:44] ==> public fun Iterable<ContractState>.sumCommoditiesOrZero(currency: Issued<Commodity>): Amount<Issued<Commodity>> defined in net.corda.finance.utils[SimpleFunctionDescriptorImpl]

'Issued' @ [103:65] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Commodity) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Commodity

'issuer' @ [103:72] ==> val issuer: PartyAndReference defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'commodity' @ [103:80] ==> val commodity: Commodity defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'tx' @ [107:35] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.CommodityContract.verify[ValueParameterDescriptorImpl]

'commands' @ [107:38] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'select' @ [107:47] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signer: PublicKey? = ..., party: AbstractParty? = ...): List<AuthenticatedObject<CommodityContract.Commands.Exit>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Exit

'party' @ [107:77] ==> val party: AbstractParty defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'singleOrNull' @ [107:84] ==> public fun <T> List<AuthenticatedObject<CommodityContract.Commands.Exit>>.singleOrNull(): AuthenticatedObject<CommodityContract.Commands.Exit>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<Exit>

'exitCommand' @ [108:43] ==> val exitCommand: AuthenticatedObject<CommodityContract.Commands.Exit>? defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'value' @ [108:56] ==> public final val value: CommodityContract.Commands.Exit defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'amount' @ [108:63] ==> public final val amount: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.CommodityContract.Commands.Exit[PropertyDescriptorImpl]

'Amount' @ [108:73] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Commodity>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Commodity>

'Issued' @ [108:83] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Commodity) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Commodity

'issuer' @ [108:90] ==> val issuer: PartyAndReference defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'commodity' @ [108:98] ==> val commodity: Commodity defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'requireThat' @ [110:17] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [111:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'inputs' @ [111:62] ==> val inputs: List<CommodityContract.State> defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'none' @ [111:69] ==> public inline fun <T> Iterable<CommodityContract.State>.none(predicate: (CommodityContract.State) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'it' @ [111:76] ==> value-parameter it: CommodityContract.State defined in net.corda.finance.contracts.asset.CommodityContract.verify.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [111:79] ==> public open val amount: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.CommodityContract.State[PropertyDescriptorImpl]

'quantity' @ [111:86] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'using' @ [112:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'issuer' @ [112:38] ==> val issuer: PartyAndReference defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'reference' @ [112:45] ==> public final val reference: OpaqueBytes defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'party' @ [112:68] ==> val party: AbstractParty defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'nameOrNull' @ [112:74] ==> public abstract fun nameOrNull(): X500Name? defined in net.corda.core.identity.AbstractParty[DeserializedSimpleFunctionDescriptor]

'inputAmount' @ [113:30] ==> val inputAmount: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'outputAmount' @ [113:45] ==> val outputAmount: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'amountExitingLedger' @ [113:60] ==> val amountExitingLedger: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'verifyMoveCommand' @ [116:17] ==> public inline fun <reified T : MoveCommand> verifyMoveCommand(inputs: List<OwnableState>, commands: List<AuthenticatedObject<CommandData>>): MoveCommand defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : MoveCommand> -> Move

'inputs' @ [116:50] ==> val inputs: List<CommodityContract.State> defined in net.corda.finance.contracts.asset.CommodityContract.verify[LocalVariableDescriptor]

'tx' @ [116:58] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.CommodityContract.verify[ValueParameterDescriptorImpl]

'commands' @ [116:61] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'inputs' @ [138:27] ==> value-parameter inputs: List<CommodityContract.State> defined in net.corda.finance.contracts.asset.CommodityContract.verifyIssueCommand[ValueParameterDescriptorImpl]

'sumCommoditiesOrZero' @ [138:34] ==> public fun Iterable<ContractState>.sumCommoditiesOrZero(currency: Issued<Commodity>): Amount<Issued<Commodity>> defined in net.corda.finance.utils[SimpleFunctionDescriptorImpl]

'Issued' @ [138:55] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Commodity) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Commodity

'issuer' @ [138:62] ==> value-parameter issuer: PartyAndReference defined in net.corda.finance.contracts.asset.CommodityContract.verifyIssueCommand[ValueParameterDescriptorImpl]

'commodity' @ [138:70] ==> value-parameter commodity: Commodity defined in net.corda.finance.contracts.asset.CommodityContract.verifyIssueCommand[ValueParameterDescriptorImpl]

'outputs' @ [139:28] ==> value-parameter outputs: List<CommodityContract.State> defined in net.corda.finance.contracts.asset.CommodityContract.verifyIssueCommand[ValueParameterDescriptorImpl]

'sumCommodities' @ [139:36] ==> public fun Iterable<ContractState>.sumCommodities(): Amount<Issued<Commodity>> defined in net.corda.finance.utils[SimpleFunctionDescriptorImpl]

'tx' @ [140:33] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.CommodityContract.verifyIssueCommand[ValueParameterDescriptorImpl]

'commands' @ [140:36] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'select' @ [140:45] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signer: PublicKey? = ..., party: AbstractParty? = ...): List<AuthenticatedObject<CommodityContract.Commands>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Commands

'requireThat' @ [141:9] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [142:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'issuer' @ [142:68] ==> value-parameter issuer: PartyAndReference defined in net.corda.finance.contracts.asset.CommodityContract.verifyIssueCommand[ValueParameterDescriptorImpl]

'party' @ [142:75] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'issueCommand' @ [142:84] ==> value-parameter issueCommand: AuthenticatedObject<CommodityContract.Commands.Issue> defined in net.corda.finance.contracts.asset.CommodityContract.verifyIssueCommand[ValueParameterDescriptorImpl]

'signingParties' @ [142:97] ==> public final val signingParties: List<Party> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'using' @ [143:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'outputAmount' @ [143:64] ==> val outputAmount: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.CommodityContract.verifyIssueCommand[LocalVariableDescriptor]

'inputAmount' @ [143:79] ==> val inputAmount: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.CommodityContract.verifyIssueCommand[LocalVariableDescriptor]

'using' @ [144:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'commodityCommands' @ [144:59] ==> val commodityCommands: List<AuthenticatedObject<CommodityContract.Commands>> defined in net.corda.finance.contracts.asset.CommodityContract.verifyIssueCommand[LocalVariableDescriptor]

'count' @ [144:77] ==> @InlineOnly public inline fun <T> Collection<AuthenticatedObject<CommodityContract.Commands>>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<Commands>

'commands' @ [149:15] ==> value-parameter commands: Collection<AuthenticatedObject<CommandData>> defined in net.corda.finance.contracts.asset.CommodityContract.extractCommands[ValueParameterDescriptorImpl]

'select' @ [149:24] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signer: PublicKey? = ..., party: AbstractParty? = ...): List<AuthenticatedObject<CommodityContract.Commands>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Commands

'generateIssue' @ [155:15] ==> public final fun generateIssue(tx: TransactionBuilder, amount: Amount<Issued<Commodity>>, owner: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.CommodityContract[SimpleFunctionDescriptorImpl]

'tx' @ [155:29] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.CommodityContract.generateIssue[ValueParameterDescriptorImpl]

'Amount' @ [155:33] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Commodity>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Commodity>

'pennies' @ [155:40] ==> value-parameter pennies: Long defined in net.corda.finance.contracts.asset.CommodityContract.generateIssue[ValueParameterDescriptorImpl]

'tokenDef' @ [155:49] ==> value-parameter tokenDef: Issued<Commodity> defined in net.corda.finance.contracts.asset.CommodityContract.generateIssue[ValueParameterDescriptorImpl]

'owner' @ [155:60] ==> value-parameter owner: AbstractParty defined in net.corda.finance.contracts.asset.CommodityContract.generateIssue[ValueParameterDescriptorImpl]

'notary' @ [155:67] ==> value-parameter notary: Party defined in net.corda.finance.contracts.asset.CommodityContract.generateIssue[ValueParameterDescriptorImpl]

'generateIssue' @ [161:15] ==> @JvmStatic public final fun <S : FungibleAsset<Commodity>, T : Any> generateIssue(tx: TransactionBuilder, transactionState: TransactionState<CommodityContract.State>, issueCommand: CommandData): Set<PublicKey> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <S : FungibleAsset<T>> -> State
    <T : Any> -> Commodity

'tx' @ [161:29] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.CommodityContract.generateIssue[ValueParameterDescriptorImpl]

'TransactionState' @ [161:33] ==> @JvmOverloads public constructor TransactionState<out T : ContractState>(data: CommodityContract.State, notary: Party, encumbrance: Int? = ...) defined in net.corda.core.contracts.TransactionState[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> State

'State' @ [161:50] ==> public constructor State(amount: Amount<Issued<Commodity>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.CommodityContract.State[ClassConstructorDescriptorImpl]

'amount' @ [161:56] ==> value-parameter amount: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.CommodityContract.generateIssue[ValueParameterDescriptorImpl]

'owner' @ [161:64] ==> value-parameter owner: AbstractParty defined in net.corda.finance.contracts.asset.CommodityContract.generateIssue[ValueParameterDescriptorImpl]

'notary' @ [161:72] ==> value-parameter notary: Party defined in net.corda.finance.contracts.asset.CommodityContract.generateIssue[ValueParameterDescriptorImpl]

'Issue' @ [161:90] ==> public constructor Issue() defined in net.corda.finance.contracts.asset.CommodityContract.Commands.Issue[ClassConstructorDescriptorImpl]

'txState' @ [165:15] ==> value-parameter txState: TransactionState<CommodityContract.State> defined in net.corda.finance.contracts.asset.CommodityContract.deriveState[ValueParameterDescriptorImpl]

'copy' @ [165:23] ==> public final fun copy(data: CommodityContract.State = ..., notary: Party = ..., encumbrance: Int? = ...): TransactionState<CommodityContract.State> defined in net.corda.core.contracts.TransactionState[DeserializedSimpleFunctionDescriptor]

'txState' @ [165:35] ==> value-parameter txState: TransactionState<CommodityContract.State> defined in net.corda.finance.contracts.asset.CommodityContract.deriveState[ValueParameterDescriptorImpl]

'data' @ [165:43] ==> public final val data: CommodityContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'copy' @ [165:48] ==> public final fun copy(amount: Amount<Issued<Commodity>> = ..., owner: AbstractParty = ...): CommodityContract.State defined in net.corda.finance.contracts.asset.CommodityContract.State[SimpleFunctionDescriptorImpl]

'amount' @ [165:62] ==> value-parameter amount: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.CommodityContract.deriveState[ValueParameterDescriptorImpl]

'owner' @ [165:78] ==> value-parameter owner: AbstractParty defined in net.corda.finance.contracts.asset.CommodityContract.deriveState[ValueParameterDescriptorImpl]

'Exit' @ [167:84] ==> public constructor Exit(amount: Amount<Issued<Commodity>>) defined in net.corda.finance.contracts.asset.CommodityContract.Commands.Exit[ClassConstructorDescriptorImpl]

'amount' @ [167:89] ==> value-parameter amount: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.CommodityContract.generateExitCommand[ValueParameterDescriptorImpl]

'Move' @ [168:51] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.CommodityContract.Commands.Move[ClassConstructorDescriptorImpl]

