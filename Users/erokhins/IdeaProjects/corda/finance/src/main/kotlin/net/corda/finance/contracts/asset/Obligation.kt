'Obligation' @ [66:29] ==> public constructor Obligation<P : Any>() defined in net.corda.finance.contracts.asset.Obligation[ClassConstructorDescriptorImpl]
Inferred types:
    <P : Any> -> Currency

'CordaSerializable' @ [82:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'CordaSerializable' @ [104:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'seconds' @ [113:46] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'acceptableIssuedProducts' @ [116:21] ==> public final val acceptableIssuedProducts: NonEmptySet<Issued<P>> defined in net.corda.finance.contracts.asset.Obligation.Terms[PropertyDescriptorImpl]

'map' @ [116:46] ==> public inline fun <T, R> Iterable<Issued<P>>.map(transform: (Issued<P>) -> P): List<P> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Issued<P>
    <R> -> P

'it' @ [116:52] ==> value-parameter it: Issued<P> defined in net.corda.finance.contracts.asset.Obligation.Terms.<get-product>.<anonymous>[ValueParameterDescriptorImpl]

'product' @ [116:55] ==> public final val product: P defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'toSet' @ [116:65] ==> public fun <T> Iterable<P>.toSet(): Set<P> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> P

'single' @ [116:73] ==> public fun <T> Iterable<P>.single(): P defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> P

'NORMAL' @ [127:50] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'Amount' @ [135:57] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Obligation.Terms<P>>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Terms<P>>

'quantity' @ [135:64] ==> public final val quantity: Long defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'Issued' @ [135:74] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Obligation.Terms<P>) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Terms<P>

'obligor' @ [135:81] ==> public final val obligor: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'ref' @ [135:89] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.AbstractParty[DeserializedSimpleFunctionDescriptor]

'template' @ [135:97] ==> public final val template: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'OBLIGATION_PROGRAM_ID' @ [136:33] ==> public val OBLIGATION_PROGRAM_ID: Obligation<Currency> defined in net.corda.finance.contracts.asset in file Obligation.kt[PropertyDescriptorImpl]

'setOf' @ [137:56] ==> public fun <T> setOf(element: PublicKey): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'beneficiary' @ [137:62] ==> public final val beneficiary: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'owningKey' @ [137:74] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'template' @ [138:34] ==> public final val template: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'dueBefore' @ [138:43] ==> public final val dueBefore: Instant defined in net.corda.finance.contracts.asset.Obligation.Terms[PropertyDescriptorImpl]

'listOf' @ [139:58] ==> public fun <T> listOf(vararg elements: AbstractParty): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'obligor' @ [139:65] ==> public final val obligor: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'beneficiary' @ [139:74] ==> public final val beneficiary: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'beneficiary' @ [140:45] ==> public final val beneficiary: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'copy' @ [143:19] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<P> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.State[SimpleFunctionDescriptorImpl]

'newAmount' @ [143:35] ==> value-parameter newAmount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.State.withNewOwnerAndAmount[ValueParameterDescriptorImpl]

'quantity' @ [143:45] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'newOwner' @ [143:69] ==> value-parameter newOwner: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State.withNewOwnerAndAmount[ValueParameterDescriptorImpl]

'when (lifecycle) {
            Lifecycle.NORMAL -> "${Emoji.bagOfCash}Debt($amount due $dueBefore to $beneficiary)"
            Lifecycle.DEFAULTED -> "${Emoji.bagOfCash}Debt($amount unpaid by $dueBefore to $beneficiary)"
        }' @ [145:35] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'lifecycle' @ [145:41] ==> public final var lifecycle: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'NORMAL' @ [146:23] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'Emoji' @ [146:36] ==> public object Emoji defined in net.corda.core.internal[FakeCallableDescriptorForObject]

'bagOfCash' @ [146:42] ==> public final val bagOfCash: String defined in net.corda.core.internal.Emoji[DeserializedPropertyDescriptor]

'amount' @ [146:58] ==> public open val amount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'dueBefore' @ [146:70] ==> public final val dueBefore: Instant defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'beneficiary' @ [146:84] ==> public final val beneficiary: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'DEFAULTED' @ [147:23] ==> enum entry DEFAULTED defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'Emoji' @ [147:39] ==> public object Emoji defined in net.corda.core.internal[FakeCallableDescriptorForObject]

'bagOfCash' @ [147:45] ==> public final val bagOfCash: String defined in net.corda.core.internal.Emoji[DeserializedPropertyDescriptor]

'amount' @ [147:61] ==> public open val amount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'dueBefore' @ [147:79] ==> public final val dueBefore: Instant defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'beneficiary' @ [147:93] ==> public final val beneficiary: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'check' @ [152:17] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'lifecycle' @ [152:23] ==> public final var lifecycle: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'NORMAL' @ [152:46] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'BilateralNetState' @ [153:24] ==> public constructor BilateralNetState<P : Any>(partyKeys: Set<AbstractParty>, template: Obligation.Terms<P>) defined in net.corda.finance.contracts.asset.BilateralNetState[ClassConstructorDescriptorImpl]
Inferred types:
    <P : Any> -> P

'setOf' @ [153:42] ==> public fun <T> setOf(vararg elements: AbstractParty): Set<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'obligor' @ [153:48] ==> public final val obligor: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'beneficiary' @ [153:57] ==> public final val beneficiary: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'template' @ [153:71] ==> public final val template: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'check' @ [157:17] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'lifecycle' @ [157:23] ==> public final var lifecycle: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'NORMAL' @ [157:46] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'MultilateralNetState' @ [158:24] ==> public constructor MultilateralNetState<P : Any>(template: Obligation.Terms<P>) defined in net.corda.finance.contracts.asset.MultilateralNetState[ClassConstructorDescriptorImpl]
Inferred types:
    <P : Any> -> P

'template' @ [158:45] ==> public final val template: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'bilateralNetState' @ [162:24] ==> public open val bilateralNetState: BilateralNetState<P> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'other' @ [163:24] ==> value-parameter other: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.State.net[ValueParameterDescriptorImpl]

'bilateralNetState' @ [163:30] ==> public open val bilateralNetState: BilateralNetState<P> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'require' @ [164:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'netA' @ [164:21] ==> val netA: BilateralNetState<P> defined in net.corda.finance.contracts.asset.Obligation.State.net[LocalVariableDescriptor]

'netB' @ [164:29] ==> val netB: BilateralNetState<P> defined in net.corda.finance.contracts.asset.Obligation.State.net[LocalVariableDescriptor]

'if (obligor.owningKey == other.obligor.owningKey) {
                // Both sides are from the same obligor to beneficiary
                return copy(quantity = quantity + other.quantity)
            } else {
                // Issuer and beneficiary are backwards
                return copy(quantity = quantity - other.quantity)
            }' @ [166:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'obligor' @ [166:17] ==> public final val obligor: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'owningKey' @ [166:25] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'other' @ [166:38] ==> value-parameter other: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.State.net[ValueParameterDescriptorImpl]

'obligor' @ [166:44] ==> public final val obligor: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'owningKey' @ [166:52] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'copy' @ [168:24] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<P> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.State[SimpleFunctionDescriptorImpl]

'quantity' @ [168:40] ==> public final val quantity: Long defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'other' @ [168:51] ==> value-parameter other: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.State.net[ValueParameterDescriptorImpl]

'quantity' @ [168:57] ==> public final val quantity: Long defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'copy' @ [171:24] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<P> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.State[SimpleFunctionDescriptorImpl]

'quantity' @ [171:40] ==> public final val quantity: Long defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'other' @ [171:51] ==> value-parameter other: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.State.net[ValueParameterDescriptorImpl]

'quantity' @ [171:57] ==> public final val quantity: Long defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'CommandAndState' @ [175:62] ==> public constructor CommandAndState(command: CommandData, ownableState: OwnableState) defined in net.corda.core.contracts.CommandAndState[DeserializedClassConstructorDescriptor]

'Move' @ [175:87] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Obligation.Commands.Move[ClassConstructorDescriptorImpl]

'copy' @ [175:95] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<P> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.State[SimpleFunctionDescriptorImpl]

'newOwner' @ [175:114] ==> value-parameter newOwner: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State.withNewOwner[ValueParameterDescriptorImpl]

'CordaSerializable' @ [179:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'TypeOnlyCommandData' @ [199:23] ==> public constructor TypeOnlyCommandData() defined in net.corda.core.contracts.TypeOnlyCommandData[DeserializedClassConstructorDescriptor]

'when (lifecycle) {
                    Lifecycle.NORMAL -> Lifecycle.DEFAULTED
                    Lifecycle.DEFAULTED -> Lifecycle.NORMAL
                }' @ [214:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Obligation.Lifecycle, entry1: Obligation.Lifecycle): Obligation.Lifecycle[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Lifecycle

'lifecycle' @ [214:31] ==> public final val lifecycle: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.Commands.SetLifecycle[PropertyDescriptorImpl]

'NORMAL' @ [215:31] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'DEFAULTED' @ [215:51] ==> enum entry DEFAULTED defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'DEFAULTED' @ [216:31] ==> enum entry DEFAULTED defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'NORMAL' @ [216:54] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'tx' @ [228:26] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Obligation.verify[ValueParameterDescriptorImpl]

'commands' @ [228:29] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'select' @ [228:38] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signer: PublicKey? = ..., party: AbstractParty? = ...): List<AuthenticatedObject<Obligation.Commands.Net>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Net

'firstOrNull' @ [228:61] ==> public fun <T> List<AuthenticatedObject<Obligation.Commands.Net>>.firstOrNull(): AuthenticatedObject<Obligation.Commands.Net>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<Net>

'if (netCommand != null) {
            verifyLifecycleCommand(tx.inputStates, tx.outputStates)
            verifyNetCommand(tx, netCommand)
        } else {
            val groups = tx.groupStates { it: Obligation.State<P> -> it.amount.token }
            for ((inputs, outputs, key) in groups) {
                requireThat {
                    "there are no zero sized outputs" using (outputs.none { it.amount.quantity == 0L })
                }
                val setLifecycleCommand = tx.commands.select<Commands.SetLifecycle>().firstOrNull()
                if (setLifecycleCommand != null) {
                    verifySetLifecycleCommand(inputs, outputs, tx, setLifecycleCommand)
                } else {
                    verifyLifecycleCommand(inputs, outputs)
                    val settleCommand = tx.commands.select<Commands.Settle<P>>().firstOrNull()
                    if (settleCommand != null) {
                        verifySettleCommand(tx, inputs, outputs, settleCommand, key)
                    } else {
                        val issueCommand = tx.commands.select<Commands.Issue>().firstOrNull()
                        if (issueCommand != null) {
                            verifyIssueCommand(tx, inputs, outputs, issueCommand, key)
                        } else {
                            conserveAmount(tx, inputs, outputs, key)
                        }
                    }
                }
            }
        }' @ [229:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'netCommand' @ [229:13] ==> val netCommand: AuthenticatedObject<Obligation.Commands.Net>? defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'verifyLifecycleCommand' @ [230:13] ==> private final fun verifyLifecycleCommand(inputs: List<ContractState>, outputs: List<ContractState>): Unit defined in net.corda.finance.contracts.asset.Obligation[SimpleFunctionDescriptorImpl]

'tx' @ [230:36] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Obligation.verify[ValueParameterDescriptorImpl]

'inputStates' @ [230:39] ==> public final val inputStates: List<ContractState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'tx' @ [230:52] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Obligation.verify[ValueParameterDescriptorImpl]

'outputStates' @ [230:55] ==> public final val outputStates: List<ContractState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'verifyNetCommand' @ [231:13] ==> private final fun verifyNetCommand(tx: LedgerTransaction, command: AuthenticatedObject<NetCommand>): Unit defined in net.corda.finance.contracts.asset.Obligation[SimpleFunctionDescriptorImpl]

'tx' @ [231:30] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Obligation.verify[ValueParameterDescriptorImpl]

'netCommand' @ [231:34] ==> val netCommand: AuthenticatedObject<Obligation.Commands.Net>? defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'tx' @ [233:26] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Obligation.verify[ValueParameterDescriptorImpl]

'groupStates' @ [233:29] ==> public final inline fun <reified T : ContractState, K : Any> groupStates(noinline selector: (Obligation.State<P>) -> Issued<Obligation.Terms<P>>): List<LedgerTransaction.InOutGroup<Obligation.State<P>, Issued<Obligation.Terms<P>>>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State<P>
    <K : Any> -> Issued<Terms<P>>

'it' @ [233:70] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.verify.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [233:73] ==> public open val amount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'token' @ [233:80] ==> public final val token: Issued<Obligation.Terms<P>> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'component1' @ [234:19] ==> public final operator fun component1(): List<Obligation.State<P>> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'component2' @ [234:27] ==> public final operator fun component2(): List<Obligation.State<P>> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'component3' @ [234:36] ==> public final operator fun component3(): Issued<Obligation.Terms<P>> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'groups' @ [234:44] ==> val groups: List<LedgerTransaction.InOutGroup<Obligation.State<P>, Issued<Obligation.Terms<P>>>> defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'requireThat' @ [235:17] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [236:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'outputs' @ [236:62] ==> val outputs: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'none' @ [236:70] ==> public inline fun <T> Iterable<Obligation.State<P>>.none(predicate: (Obligation.State<P>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>

'it' @ [236:77] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.verify.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [236:80] ==> public open val amount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'quantity' @ [236:87] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'tx' @ [238:43] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Obligation.verify[ValueParameterDescriptorImpl]

'commands' @ [238:46] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'select' @ [238:55] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signer: PublicKey? = ..., party: AbstractParty? = ...): List<AuthenticatedObject<Obligation.Commands.SetLifecycle>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> SetLifecycle

'firstOrNull' @ [238:87] ==> public fun <T> List<AuthenticatedObject<Obligation.Commands.SetLifecycle>>.firstOrNull(): AuthenticatedObject<Obligation.Commands.SetLifecycle>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<SetLifecycle>

'if (setLifecycleCommand != null) {
                    verifySetLifecycleCommand(inputs, outputs, tx, setLifecycleCommand)
                } else {
                    verifyLifecycleCommand(inputs, outputs)
                    val settleCommand = tx.commands.select<Commands.Settle<P>>().firstOrNull()
                    if (settleCommand != null) {
                        verifySettleCommand(tx, inputs, outputs, settleCommand, key)
                    } else {
                        val issueCommand = tx.commands.select<Commands.Issue>().firstOrNull()
                        if (issueCommand != null) {
                            verifyIssueCommand(tx, inputs, outputs, issueCommand, key)
                        } else {
                            conserveAmount(tx, inputs, outputs, key)
                        }
                    }
                }' @ [239:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'setLifecycleCommand' @ [239:21] ==> val setLifecycleCommand: AuthenticatedObject<Obligation.Commands.SetLifecycle>? defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'verifySetLifecycleCommand' @ [240:21] ==> @VisibleForTesting private final fun verifySetLifecycleCommand(inputs: List<FungibleAsset<Obligation.Terms<P>>>, outputs: List<FungibleAsset<Obligation.Terms<P>>>, tx: LedgerTransaction, setLifecycleCommand: AuthenticatedObject<Obligation.Commands.SetLifecycle>): Unit defined in net.corda.finance.contracts.asset.Obligation[SimpleFunctionDescriptorImpl]

'inputs' @ [240:47] ==> val inputs: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'outputs' @ [240:55] ==> val outputs: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'tx' @ [240:64] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Obligation.verify[ValueParameterDescriptorImpl]

'setLifecycleCommand' @ [240:68] ==> val setLifecycleCommand: AuthenticatedObject<Obligation.Commands.SetLifecycle>? defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'verifyLifecycleCommand' @ [242:21] ==> private final fun verifyLifecycleCommand(inputs: List<ContractState>, outputs: List<ContractState>): Unit defined in net.corda.finance.contracts.asset.Obligation[SimpleFunctionDescriptorImpl]

'inputs' @ [242:44] ==> val inputs: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'outputs' @ [242:52] ==> val outputs: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'tx' @ [243:41] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Obligation.verify[ValueParameterDescriptorImpl]

'commands' @ [243:44] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'select' @ [243:53] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signer: PublicKey? = ..., party: AbstractParty? = ...): List<AuthenticatedObject<Obligation.Commands.Settle<P>>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Settle<P>

'firstOrNull' @ [243:82] ==> public fun <T> List<AuthenticatedObject<Obligation.Commands.Settle<P>>>.firstOrNull(): AuthenticatedObject<Obligation.Commands.Settle<P>>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<Settle<P>>

'if (settleCommand != null) {
                        verifySettleCommand(tx, inputs, outputs, settleCommand, key)
                    } else {
                        val issueCommand = tx.commands.select<Commands.Issue>().firstOrNull()
                        if (issueCommand != null) {
                            verifyIssueCommand(tx, inputs, outputs, issueCommand, key)
                        } else {
                            conserveAmount(tx, inputs, outputs, key)
                        }
                    }' @ [244:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'settleCommand' @ [244:25] ==> val settleCommand: AuthenticatedObject<Obligation.Commands.Settle<P>>? defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'verifySettleCommand' @ [245:25] ==> private final fun verifySettleCommand(tx: LedgerTransaction, inputs: List<FungibleAsset<Obligation.Terms<P>>>, outputs: List<FungibleAsset<Obligation.Terms<P>>>, command: AuthenticatedObject<Obligation.Commands.Settle<P>>, groupingKey: Issued<Obligation.Terms<P>>): Unit defined in net.corda.finance.contracts.asset.Obligation[SimpleFunctionDescriptorImpl]

'tx' @ [245:45] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Obligation.verify[ValueParameterDescriptorImpl]

'inputs' @ [245:49] ==> val inputs: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'outputs' @ [245:57] ==> val outputs: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'settleCommand' @ [245:66] ==> val settleCommand: AuthenticatedObject<Obligation.Commands.Settle<P>>? defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'key' @ [245:81] ==> val key: Issued<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'tx' @ [247:44] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Obligation.verify[ValueParameterDescriptorImpl]

'commands' @ [247:47] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'select' @ [247:56] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signer: PublicKey? = ..., party: AbstractParty? = ...): List<AuthenticatedObject<Obligation.Commands.Issue>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Issue

'firstOrNull' @ [247:81] ==> public fun <T> List<AuthenticatedObject<Obligation.Commands.Issue>>.firstOrNull(): AuthenticatedObject<Obligation.Commands.Issue>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<Issue>

'if (issueCommand != null) {
                            verifyIssueCommand(tx, inputs, outputs, issueCommand, key)
                        } else {
                            conserveAmount(tx, inputs, outputs, key)
                        }' @ [248:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'issueCommand' @ [248:29] ==> val issueCommand: AuthenticatedObject<Obligation.Commands.Issue>? defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'verifyIssueCommand' @ [249:29] ==> private final fun verifyIssueCommand(tx: LedgerTransaction, inputs: List<FungibleAsset<Obligation.Terms<P>>>, outputs: List<FungibleAsset<Obligation.Terms<P>>>, issueCommand: AuthenticatedObject<Obligation.Commands.Issue>, key: Issued<Obligation.Terms<P>>): Unit defined in net.corda.finance.contracts.asset.Obligation[SimpleFunctionDescriptorImpl]

'tx' @ [249:48] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Obligation.verify[ValueParameterDescriptorImpl]

'inputs' @ [249:52] ==> val inputs: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'outputs' @ [249:60] ==> val outputs: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'issueCommand' @ [249:69] ==> val issueCommand: AuthenticatedObject<Obligation.Commands.Issue>? defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'key' @ [249:83] ==> val key: Issued<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'conserveAmount' @ [251:29] ==> private final fun conserveAmount(tx: LedgerTransaction, inputs: List<FungibleAsset<Obligation.Terms<P>>>, outputs: List<FungibleAsset<Obligation.Terms<P>>>, key: Issued<Obligation.Terms<P>>): Unit defined in net.corda.finance.contracts.asset.Obligation[SimpleFunctionDescriptorImpl]

'tx' @ [251:44] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Obligation.verify[ValueParameterDescriptorImpl]

'inputs' @ [251:48] ==> val inputs: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'outputs' @ [251:56] ==> val outputs: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'key' @ [251:65] ==> val key: Issued<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.verify[LocalVariableDescriptor]

'key' @ [263:22] ==> value-parameter key: Issued<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.conserveAmount[ValueParameterDescriptorImpl]

'issuer' @ [263:26] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'key' @ [264:21] ==> value-parameter key: Issued<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.conserveAmount[ValueParameterDescriptorImpl]

'product' @ [264:25] ==> public final val product: Obligation.Terms<P> defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'inputs' @ [265:27] ==> value-parameter inputs: List<FungibleAsset<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.conserveAmount[ValueParameterDescriptorImpl]

'sumObligationsOrNull' @ [265:34] ==> public fun <P : Any> Iterable<ContractState>.sumObligationsOrNull(): Amount<Issued<Obligation.Terms<P>>>? defined in net.corda.finance.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : Any> -> P

'IllegalArgumentException' @ [265:69] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'outputs' @ [266:28] ==> value-parameter outputs: List<FungibleAsset<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.conserveAmount[ValueParameterDescriptorImpl]

'sumObligationsOrZero' @ [266:36] ==> public fun <P : Any> Iterable<ContractState>.sumObligationsOrZero(issuanceDef: Issued<Obligation.Terms<P>>): Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : Any> -> P

'Issued' @ [266:57] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Obligation.Terms<P>) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Terms<P>

'issuer' @ [266:64] ==> val issuer: PartyAndReference defined in net.corda.finance.contracts.asset.Obligation.conserveAmount[LocalVariableDescriptor]

'terms' @ [266:72] ==> val terms: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation.conserveAmount[LocalVariableDescriptor]

'inputs' @ [270:40] ==> value-parameter inputs: List<FungibleAsset<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.conserveAmount[ValueParameterDescriptorImpl]

'flatMap' @ [270:47] ==> public inline fun <T, R> Iterable<FungibleAsset<Obligation.Terms<P>>>.flatMap(transform: (FungibleAsset<Obligation.Terms<P>>) -> Iterable<PublicKey>): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FungibleAsset<Terms<P>>
    <R> -> PublicKey

'it' @ [270:57] ==> value-parameter it: FungibleAsset<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.conserveAmount.<anonymous>[ValueParameterDescriptorImpl]

'exitKeys' @ [270:60] ==> public abstract val exitKeys: Collection<PublicKey> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'toSet' @ [270:71] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'tx' @ [271:27] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Obligation.conserveAmount[ValueParameterDescriptorImpl]

'commands' @ [271:30] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'select' @ [271:39] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signers: Collection<PublicKey>?, parties: Collection<Party>?): List<AuthenticatedObject<Obligation.Commands.Exit<P>>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Exit<P>

'exitKeys' @ [271:90] ==> val exitKeys: Set<PublicKey> defined in net.corda.finance.contracts.asset.Obligation.conserveAmount[LocalVariableDescriptor]

'filter' @ [271:100] ==> public inline fun <T> Iterable<AuthenticatedObject<Obligation.Commands.Exit<P>>>.filter(predicate: (AuthenticatedObject<Obligation.Commands.Exit<P>>) -> Boolean): List<AuthenticatedObject<Obligation.Commands.Exit<P>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<Exit<P>>

'it' @ [271:109] ==> value-parameter it: AuthenticatedObject<Obligation.Commands.Exit<P>> defined in net.corda.finance.contracts.asset.Obligation.conserveAmount.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [271:112] ==> public final val value: Obligation.Commands.Exit<P> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'amount' @ [271:118] ==> public final val amount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.Commands.Exit[PropertyDescriptorImpl]

'token' @ [271:125] ==> public final val token: Issued<Obligation.Terms<P>> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'key' @ [271:134] ==> value-parameter key: Issued<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.conserveAmount[ValueParameterDescriptorImpl]

'singleOrNull' @ [271:140] ==> public fun <T> List<AuthenticatedObject<Obligation.Commands.Exit<P>>>.singleOrNull(): AuthenticatedObject<Obligation.Commands.Exit<P>>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<Exit<P>>

'exitCommand' @ [272:35] ==> val exitCommand: AuthenticatedObject<Obligation.Commands.Exit<P>>? defined in net.corda.finance.contracts.asset.Obligation.conserveAmount[LocalVariableDescriptor]

'value' @ [272:48] ==> public final val value: Obligation.Commands.Exit<P> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'amount' @ [272:55] ==> public final val amount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.Commands.Exit[PropertyDescriptorImpl]

'Amount' @ [272:65] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Obligation.Terms<P>>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Terms<P>>

'Issued' @ [272:75] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Obligation.Terms<P>) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Terms<P>

'issuer' @ [272:82] ==> val issuer: PartyAndReference defined in net.corda.finance.contracts.asset.Obligation.conserveAmount[LocalVariableDescriptor]

'terms' @ [272:90] ==> val terms: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation.conserveAmount[LocalVariableDescriptor]

'requireThat' @ [274:9] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [275:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'inputs' @ [275:53] ==> value-parameter inputs: List<FungibleAsset<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.conserveAmount[ValueParameterDescriptorImpl]

'none' @ [275:60] ==> public inline fun <T> Iterable<FungibleAsset<Obligation.Terms<P>>>.none(predicate: (FungibleAsset<Obligation.Terms<P>>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FungibleAsset<Terms<P>>

'it' @ [275:67] ==> value-parameter it: FungibleAsset<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.conserveAmount.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [275:70] ==> public abstract val amount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'quantity' @ [275:77] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'using' @ [276:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'issuer' @ [276:30] ==> val issuer: PartyAndReference defined in net.corda.finance.contracts.asset.Obligation.conserveAmount[LocalVariableDescriptor]

'reference' @ [276:37] ==> public final val reference: OpaqueBytes defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'issuer' @ [276:60] ==> val issuer: PartyAndReference defined in net.corda.finance.contracts.asset.Obligation.conserveAmount[LocalVariableDescriptor]

'party' @ [276:67] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'nameOrNull' @ [276:73] ==> public abstract fun nameOrNull(): X500Name? defined in net.corda.core.identity.AbstractParty[DeserializedSimpleFunctionDescriptor]

'inputAmount' @ [277:22] ==> val inputAmount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.conserveAmount[LocalVariableDescriptor]

'outputAmount' @ [277:37] ==> val outputAmount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.conserveAmount[LocalVariableDescriptor]

'amountExitingLedger' @ [277:52] ==> val amountExitingLedger: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.conserveAmount[LocalVariableDescriptor]

'verifyMoveCommand' @ [280:9] ==> public inline fun <reified T : MoveCommand> verifyMoveCommand(inputs: List<OwnableState>, commands: List<AuthenticatedObject<CommandData>>): MoveCommand defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : MoveCommand> -> Move

'inputs' @ [280:42] ==> value-parameter inputs: List<FungibleAsset<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.conserveAmount[ValueParameterDescriptorImpl]

'tx' @ [280:50] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Obligation.conserveAmount[ValueParameterDescriptorImpl]

'commands' @ [280:53] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'key' @ [299:22] ==> value-parameter key: Issued<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.verifyIssueCommand[ValueParameterDescriptorImpl]

'issuer' @ [299:26] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'key' @ [300:21] ==> value-parameter key: Issued<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.verifyIssueCommand[ValueParameterDescriptorImpl]

'product' @ [300:25] ==> public final val product: Obligation.Terms<P> defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'inputs' @ [301:27] ==> value-parameter inputs: List<FungibleAsset<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifyIssueCommand[ValueParameterDescriptorImpl]

'sumObligationsOrZero' @ [301:34] ==> public fun <P : Any> Iterable<ContractState>.sumObligationsOrZero(issuanceDef: Issued<Obligation.Terms<P>>): Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : Any> -> P

'Issued' @ [301:55] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Obligation.Terms<P>) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Terms<P>

'issuer' @ [301:62] ==> val issuer: PartyAndReference defined in net.corda.finance.contracts.asset.Obligation.verifyIssueCommand[LocalVariableDescriptor]

'terms' @ [301:70] ==> val terms: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation.verifyIssueCommand[LocalVariableDescriptor]

'outputs' @ [302:28] ==> value-parameter outputs: List<FungibleAsset<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifyIssueCommand[ValueParameterDescriptorImpl]

'sumObligations' @ [302:36] ==> public fun <P : Any> Iterable<ContractState>.sumObligations(): Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : Any> -> P

'tx' @ [303:29] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Obligation.verifyIssueCommand[ValueParameterDescriptorImpl]

'commands' @ [303:32] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'select' @ [303:41] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signer: PublicKey? = ..., party: AbstractParty? = ...): List<AuthenticatedObject<Obligation.Commands.Issue>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Issue

'requireThat' @ [304:9] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [305:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'issuer' @ [305:67] ==> val issuer: PartyAndReference defined in net.corda.finance.contracts.asset.Obligation.verifyIssueCommand[LocalVariableDescriptor]

'party' @ [305:74] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'issueCommand' @ [305:83] ==> value-parameter issueCommand: AuthenticatedObject<Obligation.Commands.Issue> defined in net.corda.finance.contracts.asset.Obligation.verifyIssueCommand[ValueParameterDescriptorImpl]

'signingParties' @ [305:96] ==> public final val signingParties: List<Party> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'using' @ [306:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'outputAmount' @ [306:64] ==> val outputAmount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifyIssueCommand[LocalVariableDescriptor]

'inputAmount' @ [306:79] ==> val inputAmount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifyIssueCommand[LocalVariableDescriptor]

'using' @ [307:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'issueCommands' @ [307:59] ==> val issueCommands: List<AuthenticatedObject<Obligation.Commands.Issue>> defined in net.corda.finance.contracts.asset.Obligation.verifyIssueCommand[LocalVariableDescriptor]

'count' @ [307:73] ==> @InlineOnly public inline fun <T> Collection<AuthenticatedObject<Obligation.Commands.Issue>>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<Issue>

'groupingKey' @ [316:23] ==> value-parameter groupingKey: Issued<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[ValueParameterDescriptorImpl]

'issuer' @ [316:35] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'party' @ [316:42] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'groupingKey' @ [317:24] ==> value-parameter groupingKey: Issued<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[ValueParameterDescriptorImpl]

'product' @ [317:36] ==> public final val product: Obligation.Terms<P> defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'inputs' @ [318:53] ==> value-parameter inputs: List<FungibleAsset<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[ValueParameterDescriptorImpl]

'sumObligationsOrNull' @ [318:60] ==> public fun <P : Any> Iterable<ContractState>.sumObligationsOrNull(): Amount<Issued<Obligation.Terms<P>>>? defined in net.corda.finance.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : Any> -> P

'IllegalArgumentException' @ [318:95] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'outputs' @ [319:54] ==> value-parameter outputs: List<FungibleAsset<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[ValueParameterDescriptorImpl]

'sumObligationsOrZero' @ [319:62] ==> public fun <P : Any> Iterable<ContractState>.sumObligationsOrZero(issuanceDef: Issued<Obligation.Terms<P>>): Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : Any> -> P

'groupingKey' @ [319:83] ==> value-parameter groupingKey: Issued<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[ValueParameterDescriptorImpl]

'tx' @ [339:27] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[ValueParameterDescriptorImpl]

'outputsOfType' @ [339:30] ==> public final inline fun <reified T : ContractState> outputsOfType(): List<FungibleAsset<*>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> FungibleAsset<*>

'tx' @ [340:34] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[ValueParameterDescriptorImpl]

'attachments' @ [340:37] ==> public final val attachments: List<Attachment> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'any' @ [340:49] ==> public inline fun <T> Iterable<Attachment>.any(predicate: (Attachment) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Attachment

'it' @ [340:55] ==> value-parameter it: Attachment defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [340:58] ==> public abstract val id: SecureHash defined in net.corda.core.contracts.Attachment[DeserializedPropertyDescriptor]

'template' @ [340:64] ==> val template: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'acceptableContracts' @ [340:73] ==> public final val acceptableContracts: NonEmptySet<SecureHash> defined in net.corda.finance.contracts.asset.Obligation.Terms[PropertyDescriptorImpl]

'requireThat' @ [341:9] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [342:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'acceptableContract' @ [342:56] ==> val acceptableContract: Boolean defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'assetStates' @ [344:37] ==> val assetStates: List<FungibleAsset<*>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'filter' @ [344:49] ==> public inline fun <T> Iterable<FungibleAsset<*>>.filter(predicate: (FungibleAsset<*>) -> Boolean): List<FungibleAsset<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FungibleAsset<*>

'it' @ [347:13] ==> value-parameter it: FungibleAsset<*> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [347:16] ==> public abstract val amount: Amount<out Issued<Any>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'token' @ [347:23] ==> public final val token: Issued<Any> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'template' @ [347:32] ==> val template: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'acceptableIssuedProducts' @ [347:41] ==> public final val acceptableIssuedProducts: NonEmptySet<Issued<P>> defined in net.corda.finance.contracts.asset.Obligation.Terms[PropertyDescriptorImpl]

'requireThat' @ [350:9] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [351:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'assetStates' @ [351:61] ==> val assetStates: List<FungibleAsset<*>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'isNotEmpty' @ [351:73] ==> @InlineOnly public inline fun <T> Collection<FungibleAsset<*>>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FungibleAsset<*>

'using' @ [352:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'acceptableAssetStates' @ [352:73] ==> val acceptableAssetStates: List<FungibleAsset<*>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'isNotEmpty' @ [352:95] ==> @InlineOnly public inline fun <T> Collection<FungibleAsset<*>>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FungibleAsset<*>

'acceptableAssetStates' @ [355:37] ==> val acceptableAssetStates: List<FungibleAsset<*>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'groupBy' @ [355:59] ==> public inline fun <T, K> Iterable<FungibleAsset<*>>.groupBy(keySelector: (FungibleAsset<*>) -> AbstractParty): Map<AbstractParty, List<FungibleAsset<*>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FungibleAsset<*>
    <K> -> AbstractParty

'it' @ [355:69] ==> value-parameter it: FungibleAsset<*> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [355:72] ==> public abstract val owner: AbstractParty defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'tx' @ [358:28] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[ValueParameterDescriptorImpl]

'commands' @ [358:31] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'select' @ [358:40] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signer: PublicKey? = ..., party: AbstractParty? = ...): List<AuthenticatedObject<MoveCommand>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> MoveCommand

'inputs' @ [360:31] ==> value-parameter inputs: List<FungibleAsset<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[ValueParameterDescriptorImpl]

'map' @ [360:38] ==> public inline fun <T, R> Iterable<FungibleAsset<Obligation.Terms<P>>>.map(transform: (FungibleAsset<Obligation.Terms<P>>) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FungibleAsset<Terms<P>>
    <R> -> PublicKey

'it' @ [360:44] ==> value-parameter it: FungibleAsset<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [360:47] ==> public abstract val amount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'token' @ [360:54] ==> public final val token: Issued<Obligation.Terms<P>> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [360:60] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'party' @ [360:67] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'owningKey' @ [360:73] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toSet' @ [360:85] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'component1' @ [362:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<AbstractParty, List<FungibleAsset<Obligation.Terms<P>>>>.component1(): AbstractParty defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> List<FungibleAsset<Terms<P>>>

'component2' @ [362:28] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<AbstractParty, List<FungibleAsset<Obligation.Terms<P>>>>.component2(): List<FungibleAsset<Obligation.Terms<P>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> List<FungibleAsset<Terms<P>>>

'inputs' @ [362:44] ==> value-parameter inputs: List<FungibleAsset<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[ValueParameterDescriptorImpl]

'groupBy' @ [362:51] ==> public inline fun <T, K> Iterable<FungibleAsset<Obligation.Terms<P>>>.groupBy(keySelector: (FungibleAsset<Obligation.Terms<P>>) -> AbstractParty): Map<AbstractParty, List<FungibleAsset<Obligation.Terms<P>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FungibleAsset<Terms<P>>
    <K> -> AbstractParty

'it' @ [362:61] ==> value-parameter it: FungibleAsset<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [362:64] ==> public abstract val owner: AbstractParty defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'amountReceivedByOwner' @ [363:27] ==> val amountReceivedByOwner: Map<AbstractParty, List<FungibleAsset<*>>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'beneficiary' @ [363:49] ==> val beneficiary: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'sumFungibleOrNull' @ [363:63] ==> public fun <T : Any> Iterable<ContractState>.sumFungibleOrNull(): Amount<Issued<P>>? defined in net.corda.finance.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> P

'settled' @ [364:17] ==> val settled: Amount<Issued<P>>? defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'obligations' @ [365:28] ==> val obligations: List<FungibleAsset<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'sumObligationsOrZero' @ [365:40] ==> public fun <P : Any> Iterable<ContractState>.sumObligationsOrZero(issuanceDef: Issued<Obligation.Terms<P>>): Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : Any> -> P

'groupingKey' @ [365:61] ==> value-parameter groupingKey: Issued<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[ValueParameterDescriptorImpl]

'require' @ [366:17] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'settled' @ [366:25] ==> val settled: Amount<Issued<P>>? defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'quantity' @ [366:33] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'debt' @ [366:45] ==> val debt: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'quantity' @ [366:50] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'settled' @ [366:75] ==> val settled: Amount<Issued<P>>? defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'debt' @ [366:105] ==> val debt: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'totalPenniesSettled' @ [367:17] ==> var totalPenniesSettled: Long defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'settled' @ [367:40] ==> val settled: Amount<Issued<P>>? defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'quantity' @ [367:48] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'Amount' @ [371:34] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Obligation.Terms<P>>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Terms<P>>

'totalPenniesSettled' @ [371:41] ==> var totalPenniesSettled: Long defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'command' @ [371:62] ==> value-parameter command: AuthenticatedObject<Obligation.Commands.Settle<P>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[ValueParameterDescriptorImpl]

'value' @ [371:70] ==> public final val value: Obligation.Commands.Settle<P> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'amount' @ [371:76] ==> public final val amount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.Commands.Settle[PropertyDescriptorImpl]

'token' @ [371:83] ==> public final val token: Issued<Obligation.Terms<P>> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'requireThat' @ [372:9] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [375:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'moveCommands' @ [375:64] ==> val moveCommands: List<AuthenticatedObject<MoveCommand>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'map' @ [375:77] ==> public inline fun <T, R> Iterable<AuthenticatedObject<MoveCommand>>.map(transform: (AuthenticatedObject<MoveCommand>) -> Class<out Contract>?): List<Class<out Contract>?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<MoveCommand>
    <R> -> Class<out Contract>?

'it' @ [375:83] ==> value-parameter it: AuthenticatedObject<MoveCommand> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [375:86] ==> public final val value: MoveCommand defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'contract' @ [375:92] ==> public abstract val contract: Class<out Contract>? defined in net.corda.core.contracts.MoveCommand[DeserializedPropertyDescriptor]

'all' @ [376:22] ==> public inline fun <T> Iterable<Class<out Contract>?>.all(predicate: (Class<out Contract>?) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out Contract>?

'it' @ [376:28] ==> value-parameter it: Class<out Contract>? defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [376:42] ==> value-parameter it: Class<out Contract>? defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this@Obligation' @ [376:48] ==> <this> defined in net.corda.finance.contracts.asset.Obligation[LazyClassReceiverParameterDescriptor]

'javaClass' @ [376:64] ==> public val <T : Any> Obligation<P>.javaClass: Class<Obligation<P>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Obligation<P>

'using' @ [379:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'inputs' @ [379:66] ==> value-parameter inputs: List<FungibleAsset<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[ValueParameterDescriptorImpl]

'map' @ [379:73] ==> public inline fun <T, R> Iterable<FungibleAsset<Obligation.Terms<P>>>.map(transform: (FungibleAsset<Obligation.Terms<P>>) -> AbstractParty): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FungibleAsset<Terms<P>>
    <R> -> AbstractParty

'it' @ [379:79] ==> value-parameter it: FungibleAsset<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [379:82] ==> public abstract val owner: AbstractParty defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'containsAll' @ [379:90] ==> public abstract fun containsAll(elements: Collection<AbstractParty>): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'amountReceivedByOwner' @ [379:102] ==> val amountReceivedByOwner: Map<AbstractParty, List<FungibleAsset<*>>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'keys' @ [379:124] ==> public abstract val keys: Set<AbstractParty> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'using' @ [380:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'command' @ [380:41] ==> value-parameter command: AuthenticatedObject<Obligation.Commands.Settle<P>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[ValueParameterDescriptorImpl]

'value' @ [380:49] ==> public final val value: Obligation.Commands.Settle<P> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'amount' @ [380:55] ==> public final val amount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.Commands.Settle[PropertyDescriptorImpl]

'totalAmountSettled' @ [380:86] ==> val totalAmountSettled: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'command' @ [380:113] ==> value-parameter command: AuthenticatedObject<Obligation.Commands.Settle<P>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[ValueParameterDescriptorImpl]

'value' @ [380:121] ==> public final val value: Obligation.Commands.Settle<P> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'amount' @ [380:127] ==> public final val amount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.Commands.Settle[PropertyDescriptorImpl]

'totalAmountSettled' @ [380:137] ==> val totalAmountSettled: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'using' @ [381:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'command' @ [381:62] ==> value-parameter command: AuthenticatedObject<Obligation.Commands.Settle<P>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[ValueParameterDescriptorImpl]

'signers' @ [381:70] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'containsAll' @ [381:78] ==> public abstract fun containsAll(elements: Collection<PublicKey>): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'requiredSigners' @ [381:90] ==> val requiredSigners: Set<PublicKey> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'using' @ [382:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'inputs' @ [382:52] ==> value-parameter inputs: List<FungibleAsset<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[ValueParameterDescriptorImpl]

'none' @ [382:59] ==> public inline fun <T> Iterable<FungibleAsset<Obligation.Terms<P>>>.none(predicate: (FungibleAsset<Obligation.Terms<P>>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FungibleAsset<Terms<P>>

'it' @ [382:66] ==> value-parameter it: FungibleAsset<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [382:69] ==> public abstract val amount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'quantity' @ [382:76] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'using' @ [383:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'obligor' @ [383:26] ==> val obligor: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'inputAmount' @ [384:22] ==> val inputAmount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'outputAmount' @ [384:37] ==> val outputAmount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'Amount' @ [384:52] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Obligation.Terms<P>>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Terms<P>>

'totalPenniesSettled' @ [384:59] ==> var totalPenniesSettled: Long defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[LocalVariableDescriptor]

'groupingKey' @ [384:80] ==> value-parameter groupingKey: Issued<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.verifySettleCommand[ValueParameterDescriptorImpl]

'inputs' @ [389:30] ==> value-parameter inputs: List<ContractState> defined in net.corda.finance.contracts.asset.Obligation.verifyLifecycleCommand[ValueParameterDescriptorImpl]

'filterIsInstance' @ [389:37] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<Obligation.State<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> State<P>

'outputs' @ [390:31] ==> value-parameter outputs: List<ContractState> defined in net.corda.finance.contracts.asset.Obligation.verifyLifecycleCommand[ValueParameterDescriptorImpl]

'filterIsInstance' @ [390:39] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<Obligation.State<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> State<P>

'requireThat' @ [391:9] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [392:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'filteredInputs' @ [392:57] ==> val filteredInputs: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.verifyLifecycleCommand[LocalVariableDescriptor]

'all' @ [392:72] ==> public inline fun <T> Iterable<Obligation.State<P>>.all(predicate: (Obligation.State<P>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>

'it' @ [392:78] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.verifyLifecycleCommand.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lifecycle' @ [392:81] ==> public final var lifecycle: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'NORMAL' @ [392:104] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'using' @ [393:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'filteredOutputs' @ [393:58] ==> val filteredOutputs: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.verifyLifecycleCommand[LocalVariableDescriptor]

'all' @ [393:74] ==> public inline fun <T> Iterable<Obligation.State<P>>.all(predicate: (Obligation.State<P>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>

'it' @ [393:80] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.verifyLifecycleCommand.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lifecycle' @ [393:83] ==> public final var lifecycle: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'NORMAL' @ [393:106] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'when (command.value.type) {
            NetType.CLOSE_OUT -> tx.groupStates { it: Obligation.State<P> -> it.bilateralNetState }
            NetType.PAYMENT -> tx.groupStates { it: Obligation.State<P> -> it.multilateralNetState }
        }' @ [398:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<LedgerTransaction.InOutGroup<Obligation.State<P>, NetState<P>>>, entry1: List<LedgerTransaction.InOutGroup<Obligation.State<P>, NetState<P>>>): List<LedgerTransaction.InOutGroup<Obligation.State<P>, NetState<P>>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<InOutGroup<State<P>, NetState<P>>>

'command' @ [398:28] ==> value-parameter command: AuthenticatedObject<NetCommand> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[ValueParameterDescriptorImpl]

'value' @ [398:36] ==> public final val value: NetCommand defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'type' @ [398:42] ==> public abstract val type: NetType defined in net.corda.finance.contracts.NetCommand[PropertyDescriptorImpl]

'CLOSE_OUT' @ [399:21] ==> enum entry CLOSE_OUT defined in net.corda.finance.contracts.NetType[FakeCallableDescriptorForObject]

'tx' @ [399:34] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[ValueParameterDescriptorImpl]

'groupStates' @ [399:37] ==> public final inline fun <reified T : ContractState, K : Any> groupStates(noinline selector: (Obligation.State<P>) -> BilateralNetState<P>): List<LedgerTransaction.InOutGroup<Obligation.State<P>, BilateralNetState<P>>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State<P>
    <K : Any> -> BilateralNetState<P>

'it' @ [399:78] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand.<anonymous>[ValueParameterDescriptorImpl]

'bilateralNetState' @ [399:81] ==> public open val bilateralNetState: BilateralNetState<P> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'PAYMENT' @ [400:21] ==> enum entry PAYMENT defined in net.corda.finance.contracts.NetType[FakeCallableDescriptorForObject]

'tx' @ [400:32] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[ValueParameterDescriptorImpl]

'groupStates' @ [400:35] ==> public final inline fun <reified T : ContractState, K : Any> groupStates(noinline selector: (Obligation.State<P>) -> MultilateralNetState<P>): List<LedgerTransaction.InOutGroup<Obligation.State<P>, MultilateralNetState<P>>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State<P>
    <K : Any> -> MultilateralNetState<P>

'it' @ [400:76] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand.<anonymous>[ValueParameterDescriptorImpl]

'multilateralNetState' @ [400:79] ==> public open val multilateralNetState: MultilateralNetState<P> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'component1' @ [402:15] ==> public final operator fun component1(): List<Obligation.State<P>> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'component2' @ [402:28] ==> public final operator fun component2(): List<Obligation.State<P>> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'component3' @ [402:42] ==> public final operator fun component3(): NetState<P> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'groups' @ [402:50] ==> val groups: List<LedgerTransaction.InOutGroup<Obligation.State<P>, NetState<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[LocalVariableDescriptor]

'key' @ [404:28] ==> val key: NetState<P> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[LocalVariableDescriptor]

'template' @ [404:32] ==> public abstract val template: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.NetState[PropertyDescriptorImpl]

'extractAmountsDue' @ [406:33] ==> public fun <P : Any> extractAmountsDue(product: Obligation.Terms<P>, states: Iterable<Obligation.State<P>>): Map<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : Any> -> P

'template' @ [406:51] ==> val template: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[LocalVariableDescriptor]

'groupInputs' @ [406:61] ==> val groupInputs: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[LocalVariableDescriptor]

'extractAmountsDue' @ [407:34] ==> public fun <P : Any> extractAmountsDue(product: Obligation.Terms<P>, states: Iterable<Obligation.State<P>>): Map<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : Any> -> P

'template' @ [407:52] ==> val template: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[LocalVariableDescriptor]

'groupOutputs' @ [407:62] ==> val groupOutputs: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[LocalVariableDescriptor]

'requireThat' @ [411:13] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [412:17] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'groupInputs' @ [412:65] ==> val groupInputs: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[LocalVariableDescriptor]

'all' @ [412:77] ==> public inline fun <T> Iterable<Obligation.State<P>>.all(predicate: (Obligation.State<P>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>

'it' @ [412:83] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'template' @ [412:86] ==> public final val template: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'template' @ [412:98] ==> val template: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[LocalVariableDescriptor]

'using' @ [413:17] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'groupOutputs' @ [413:66] ==> val groupOutputs: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[LocalVariableDescriptor]

'all' @ [413:79] ==> public inline fun <T> Iterable<Obligation.State<P>>.all(predicate: (Obligation.State<P>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>

'it' @ [413:85] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'template' @ [413:88] ==> public final val template: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'template' @ [413:100] ==> val template: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[LocalVariableDescriptor]

'using' @ [414:17] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'sumAmountsDue' @ [414:70] ==> public fun <P : AbstractParty, T : Any> sumAmountsDue(balances: Map<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<P>>>): Map<AbstractParty, Long> defined in net.corda.finance.contracts.asset[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : AbstractParty> -> AbstractParty
    <T : Any> -> Terms<P>

'inputBalances' @ [414:84] ==> val inputBalances: Map<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[LocalVariableDescriptor]

'sumAmountsDue' @ [414:102] ==> public fun <P : AbstractParty, T : Any> sumAmountsDue(balances: Map<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<P>>>): Map<AbstractParty, Long> defined in net.corda.finance.contracts.asset[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : AbstractParty> -> AbstractParty
    <T : Any> -> Terms<P>

'outputBalances' @ [415:18] ==> val outputBalances: Map<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[LocalVariableDescriptor]

'groupInputs' @ [419:51] ==> val groupInputs: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[LocalVariableDescriptor]

'map' @ [419:63] ==> public inline fun <T, R> Iterable<Obligation.State<P>>.map(transform: (Obligation.State<P>) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>
    <R> -> PublicKey

'it' @ [419:69] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand.<anonymous>[ValueParameterDescriptorImpl]

'beneficiary' @ [419:72] ==> public final val beneficiary: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'owningKey' @ [419:84] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'union' @ [419:96] ==> public infix fun <T> Iterable<PublicKey>.union(other: Iterable<PublicKey>): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'groupInputs' @ [419:102] ==> val groupInputs: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[LocalVariableDescriptor]

'map' @ [419:114] ==> public inline fun <T, R> Iterable<Obligation.State<P>>.map(transform: (Obligation.State<P>) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>
    <R> -> PublicKey

'it' @ [419:120] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand.<anonymous>[ValueParameterDescriptorImpl]

'obligor' @ [419:123] ==> public final val obligor: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'owningKey' @ [419:131] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toSet' @ [419:144] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'when (command.value.type) {
            // For close-out netting, allow any involved party to sign
                NetType.CLOSE_OUT -> require(command.signers.intersect(involvedParties).isNotEmpty()) { "any involved party has signed" }
            // Require signatures from all parties (this constraint can be changed for other contracts, and is used as a
            // placeholder while exact requirements are established), or fail the transaction.
                NetType.PAYMENT -> require(command.signers.containsAll(involvedParties)) { "all involved parties have signed" }
            }' @ [420:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'command' @ [420:19] ==> value-parameter command: AuthenticatedObject<NetCommand> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[ValueParameterDescriptorImpl]

'value' @ [420:27] ==> public final val value: NetCommand defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'type' @ [420:33] ==> public abstract val type: NetType defined in net.corda.finance.contracts.NetCommand[PropertyDescriptorImpl]

'CLOSE_OUT' @ [422:25] ==> enum entry CLOSE_OUT defined in net.corda.finance.contracts.NetType[FakeCallableDescriptorForObject]

'require' @ [422:38] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'command' @ [422:46] ==> value-parameter command: AuthenticatedObject<NetCommand> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[ValueParameterDescriptorImpl]

'signers' @ [422:54] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'intersect' @ [422:62] ==> public infix fun <T> Iterable<PublicKey>.intersect(other: Iterable<PublicKey>): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'involvedParties' @ [422:72] ==> val involvedParties: Set<PublicKey> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[LocalVariableDescriptor]

'isNotEmpty' @ [422:89] ==> @InlineOnly public inline fun <T> Collection<PublicKey>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'PAYMENT' @ [425:25] ==> enum entry PAYMENT defined in net.corda.finance.contracts.NetType[FakeCallableDescriptorForObject]

'require' @ [425:36] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'command' @ [425:44] ==> value-parameter command: AuthenticatedObject<NetCommand> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[ValueParameterDescriptorImpl]

'signers' @ [425:52] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'containsAll' @ [425:60] ==> public abstract fun containsAll(elements: Collection<PublicKey>): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'involvedParties' @ [425:72] ==> val involvedParties: Set<PublicKey> defined in net.corda.finance.contracts.asset.Obligation.verifyNetCommand[LocalVariableDescriptor]

'VisibleForTesting' @ [433:5] ==> public constructor VisibleForTesting() defined in net.corda.core.internal.VisibleForTesting[DeserializedClassConstructorDescriptor]

'require' @ [440:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'inputs' @ [440:17] ==> value-parameter inputs: List<FungibleAsset<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[ValueParameterDescriptorImpl]

'size' @ [440:24] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'outputs' @ [440:32] ==> value-parameter outputs: List<FungibleAsset<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[ValueParameterDescriptorImpl]

'size' @ [440:40] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'setLifecycleCommand' @ [444:38] ==> value-parameter setLifecycleCommand: AuthenticatedObject<Obligation.Commands.SetLifecycle> defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[ValueParameterDescriptorImpl]

'value' @ [444:58] ==> public final val value: Obligation.Commands.SetLifecycle defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'inverse' @ [444:64] ==> public final val inverse: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.Commands.SetLifecycle[PropertyDescriptorImpl]

'setLifecycleCommand' @ [445:39] ==> value-parameter setLifecycleCommand: AuthenticatedObject<Obligation.Commands.SetLifecycle> defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[ValueParameterDescriptorImpl]

'value' @ [445:59] ==> public final val value: Obligation.Commands.SetLifecycle defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'lifecycle' @ [445:65] ==> public final val lifecycle: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.Commands.SetLifecycle[PropertyDescriptorImpl]

'component1' @ [448:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [448:25] ==> public final operator fun component2(): FungibleAsset<Obligation.Terms<P>> defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'inputs' @ [448:35] ==> value-parameter inputs: List<FungibleAsset<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[ValueParameterDescriptorImpl]

'withIndex' @ [448:42] ==> public fun <T> Iterable<FungibleAsset<Obligation.Terms<P>>>.withIndex(): Iterable<IndexedValue<FungibleAsset<Obligation.Terms<P>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FungibleAsset<Terms<P>>

'input' @ [449:17] ==> val input: FungibleAsset<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[LocalVariableDescriptor]

'outputs' @ [450:36] ==> value-parameter outputs: List<FungibleAsset<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[ValueParameterDescriptorImpl]

'stateIdx' @ [450:44] ==> val stateIdx: Int defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[LocalVariableDescriptor]

'input' @ [451:32] ==> val input: FungibleAsset<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[LocalVariableDescriptor]

'dueBefore' @ [451:38] ==> public final val dueBefore: Instant defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'tx' @ [452:34] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[ValueParameterDescriptorImpl]

'timeWindow' @ [452:37] ==> public final val timeWindow: TimeWindow? defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'input' @ [453:38] ==> val input: FungibleAsset<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[LocalVariableDescriptor]

'copy' @ [453:44] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<P> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.State[SimpleFunctionDescriptorImpl]

'expectedOutputLifecycle' @ [453:61] ==> val expectedOutputLifecycle: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[LocalVariableDescriptor]

'requireThat' @ [455:17] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [456:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'timeWindow' @ [456:72] ==> val timeWindow: TimeWindow? defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[LocalVariableDescriptor]

'using' @ [457:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'timeWindow' @ [457:54] ==> val timeWindow: TimeWindow? defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[LocalVariableDescriptor]

'fromTime' @ [457:67] ==> public abstract val fromTime: Instant? defined in net.corda.core.contracts.TimeWindow[DeserializedPropertyDescriptor]

'isAfter' @ [457:77] ==> public open fun isAfter(p0: (Instant..Instant?)): Boolean defined in java.time.Instant[JavaMethodDescriptor]

'deadline' @ [457:85] ==> val deadline: Instant defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[LocalVariableDescriptor]

'using' @ [458:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'input' @ [458:63] ==> val input: FungibleAsset<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[LocalVariableDescriptor]

'lifecycle' @ [458:69] ==> public final var lifecycle: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'expectedInputLifecycle' @ [458:82] ==> val expectedInputLifecycle: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[LocalVariableDescriptor]

'using' @ [459:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'expectedOutput' @ [459:102] ==> val expectedOutput: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[LocalVariableDescriptor]

'actualOutput' @ [459:120] ==> val actualOutput: FungibleAsset<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[LocalVariableDescriptor]

'inputs' @ [463:29] ==> value-parameter inputs: List<FungibleAsset<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[ValueParameterDescriptorImpl]

'filter' @ [463:36] ==> public inline fun <T> Iterable<FungibleAsset<Obligation.Terms<P>>>.filter(predicate: (FungibleAsset<Obligation.Terms<P>>) -> Boolean): List<FungibleAsset<Obligation.Terms<P>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FungibleAsset<Terms<P>>

'it' @ [463:45] ==> value-parameter it: FungibleAsset<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [463:62] ==> public inline fun <T, R> Iterable<FungibleAsset<Obligation.Terms<P>>>.map(transform: (FungibleAsset<Obligation.Terms<P>>) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FungibleAsset<Terms<P>>
    <R> -> PublicKey

'it' @ [463:69] ==> value-parameter it: FungibleAsset<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand.<anonymous>[ValueParameterDescriptorImpl]

'beneficiary' @ [463:85] ==> public final val beneficiary: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'owningKey' @ [463:97] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toSet' @ [463:109] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'setLifecycleCommand' @ [464:30] ==> value-parameter setLifecycleCommand: AuthenticatedObject<Obligation.Commands.SetLifecycle> defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[ValueParameterDescriptorImpl]

'signers' @ [464:50] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'toSet' @ [464:58] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'requireThat' @ [465:9] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [466:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'keysThatSigned' @ [466:70] ==> val keysThatSigned: Set<PublicKey> defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[LocalVariableDescriptor]

'containsAll' @ [466:85] ==> public abstract fun containsAll(elements: Collection<PublicKey>): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'owningPubKeys' @ [466:97] ==> val owningPubKeys: Set<PublicKey> defined in net.corda.finance.contracts.asset.Obligation.verifySetLifecycleCommand[LocalVariableDescriptor]

'inputs' @ [480:22] ==> value-parameter vararg inputs: StateAndRef<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateCloseOutNetting[ValueParameterDescriptorImpl]

'map' @ [480:29] ==> public inline fun <T, R> Array<out StateAndRef<Obligation.State<P>>>.map(transform: (StateAndRef<Obligation.State<P>>) -> Obligation.State<P>): List<Obligation.State<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State<P>>
    <R> -> State<P>

'it' @ [480:35] ==> value-parameter it: StateAndRef<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateCloseOutNetting.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [480:38] ==> public final val state: TransactionState<Obligation.State<P>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [480:44] ==> public final val data: Obligation.State<P> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'states' @ [481:24] ==> val states: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateCloseOutNetting[LocalVariableDescriptor]

'firstOrNull' @ [481:31] ==> public fun <T> List<Obligation.State<P>>.firstOrNull(): Obligation.State<P>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>

'bilateralNetState' @ [481:46] ==> public open val bilateralNetState: BilateralNetState<P> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'requireThat' @ [483:9] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [484:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'states' @ [484:55] ==> val states: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateCloseOutNetting[LocalVariableDescriptor]

'size' @ [484:62] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'using' @ [485:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'states' @ [485:68] ==> val states: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateCloseOutNetting[LocalVariableDescriptor]

'all' @ [485:75] ==> public inline fun <T> Iterable<Obligation.State<P>>.all(predicate: (Obligation.State<P>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>

'it' @ [485:81] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.generateCloseOutNetting.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lifecycle' @ [485:84] ==> public final var lifecycle: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'NORMAL' @ [485:107] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'using' @ [486:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'states' @ [486:60] ==> val states: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateCloseOutNetting[LocalVariableDescriptor]

'all' @ [486:67] ==> public inline fun <T> Iterable<Obligation.State<P>>.all(predicate: (Obligation.State<P>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>

'it' @ [486:73] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.generateCloseOutNetting.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'bilateralNetState' @ [486:76] ==> public open val bilateralNetState: BilateralNetState<P> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'netState' @ [486:97] ==> val netState: BilateralNetState<P>? defined in net.corda.finance.contracts.asset.Obligation.generateCloseOutNetting[LocalVariableDescriptor]

'using' @ [487:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'signer' @ [487:53] ==> value-parameter signer: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.generateCloseOutNetting[ValueParameterDescriptorImpl]

'netState' @ [487:63] ==> val netState: BilateralNetState<P>? defined in net.corda.finance.contracts.asset.Obligation.generateCloseOutNetting[LocalVariableDescriptor]

'partyKeys' @ [487:74] ==> public final val partyKeys: Set<AbstractParty> defined in net.corda.finance.contracts.asset.BilateralNetState[PropertyDescriptorImpl]

'tx' @ [490:9] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Obligation.generateCloseOutNetting[ValueParameterDescriptorImpl]

'withItems' @ [490:12] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'inputs' @ [490:23] ==> value-parameter vararg inputs: StateAndRef<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateCloseOutNetting[ValueParameterDescriptorImpl]

'states' @ [491:19] ==> val states: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateCloseOutNetting[LocalVariableDescriptor]

'reduce' @ [491:26] ==> public inline fun <S, T : Obligation.State<P>> Iterable<Obligation.State<P>>.reduce(operation: (Obligation.State<P>, Obligation.State<P>) -> Obligation.State<P>): Obligation.State<P> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> State<P>
    <T : S> -> State<P>

'State' @ [491:33] ==> private constructor State() defined in kotlin.collections.State[DeserializedClassConstructorDescriptor]

'out' @ [492:13] ==> val out: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.generateCloseOutNetting[LocalVariableDescriptor]

'quantity' @ [492:17] ==> public final val quantity: Long defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'tx' @ [493:13] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Obligation.generateCloseOutNetting[ValueParameterDescriptorImpl]

'addOutputState' @ [493:16] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'out' @ [493:31] ==> val out: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.generateCloseOutNetting[LocalVariableDescriptor]

'tx' @ [494:9] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Obligation.generateCloseOutNetting[ValueParameterDescriptorImpl]

'addCommand' @ [494:12] ==> public final fun addCommand(data: CommandData, vararg keys: PublicKey): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'Net' @ [494:32] ==> public constructor Net(type: NetType) defined in net.corda.finance.contracts.asset.Obligation.Commands.Net[ClassConstructorDescriptorImpl]

'PAYMENT' @ [494:44] ==> enum entry PAYMENT defined in net.corda.finance.contracts.NetType[FakeCallableDescriptorForObject]

'signer' @ [494:54] ==> value-parameter signer: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.generateCloseOutNetting[ValueParameterDescriptorImpl]

'owningKey' @ [494:61] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'Suppress' @ [506:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'OnLedgerAsset' @ [509:15] ==> public companion object defined in net.corda.finance.contracts.asset.OnLedgerAsset[FakeCallableDescriptorForObject]

'generateExit' @ [509:29] ==> @Throws @JvmStatic public final fun <S : FungibleAsset<Obligation.Terms<P>>, T : Any> generateExit(tx: TransactionBuilder, amountIssued: Amount<Issued<Obligation.Terms<P>>>, assetStates: List<StateAndRef<Obligation.State<P>>>, deriveState: (TransactionState<Obligation.State<P>>, Amount<Issued<Obligation.Terms<P>>>, AbstractParty) -> TransactionState<Obligation.State<P>>, generateMoveCommand: () -> CommandData, generateExitCommand: (Amount<Issued<Obligation.Terms<P>>>) -> CommandData): Set<PublicKey> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <S : FungibleAsset<T>> -> State<P>
    <T : Any> -> Terms<P>

'tx' @ [509:42] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Obligation.generateExit[ValueParameterDescriptorImpl]

'amountIssued' @ [509:46] ==> value-parameter amountIssued: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.generateExit[ValueParameterDescriptorImpl]

'assetStates' @ [509:60] ==> value-parameter assetStates: List<StateAndRef<Obligation.State<P>>> defined in net.corda.finance.contracts.asset.Obligation.generateExit[ValueParameterDescriptorImpl]

'state' @ [510:53] ==> value-parameter state: TransactionState<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateExit.<anonymous>[ValueParameterDescriptorImpl]

'copy' @ [510:59] ==> public final fun copy(data: Obligation.State<P> = ..., notary: Party = ..., encumbrance: Int? = ...): TransactionState<Obligation.State<P>> defined in net.corda.core.contracts.TransactionState[DeserializedSimpleFunctionDescriptor]

'state' @ [510:71] ==> value-parameter state: TransactionState<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateExit.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [510:77] ==> public final val data: Obligation.State<P> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'withNewOwnerAndAmount' @ [510:82] ==> public open fun withNewOwnerAndAmount(newAmount: Amount<Issued<Obligation.Terms<P>>>, newOwner: AbstractParty): Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.State[SimpleFunctionDescriptorImpl]

'amount' @ [510:104] ==> value-parameter amount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.generateExit.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [510:112] ==> value-parameter owner: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.generateExit.<anonymous>[ValueParameterDescriptorImpl]

'Move' @ [511:49] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Obligation.Commands.Move[ClassConstructorDescriptorImpl]

'Exit' @ [512:56] ==> public constructor Exit<P : Any>(amount: Amount<Issued<Obligation.Terms<P>>>) defined in net.corda.finance.contracts.asset.Obligation.Commands.Exit[ClassConstructorDescriptorImpl]
Inferred types:
    <P : Any> -> P

'amount' @ [512:61] ==> value-parameter amount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.generateExit.<anonymous>[ValueParameterDescriptorImpl]

'Terms' @ [535:27] ==> public constructor Terms<P : Any>(acceptableContracts: NonEmptySet<SecureHash>, acceptableIssuedProducts: NonEmptySet<Issued<Currency>>, dueBefore: Instant, timeTolerance: Duration = ...) defined in net.corda.finance.contracts.asset.Obligation.Terms[ClassConstructorDescriptorImpl]
Inferred types:
    <P : Any> -> Currency

'NonEmptySet' @ [535:33] ==> public companion object defined in net.corda.core.utilities.NonEmptySet[FakeCallableDescriptorForObject]

'of' @ [535:45] ==> @JvmStatic public final fun <T> of(element: SecureHash): NonEmptySet<SecureHash> defined in net.corda.core.utilities.NonEmptySet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'acceptableContract' @ [535:48] ==> value-parameter acceptableContract: SecureHash defined in net.corda.finance.contracts.asset.Obligation.generateCashIssue[ValueParameterDescriptorImpl]

'NonEmptySet' @ [535:69] ==> public companion object defined in net.corda.core.utilities.NonEmptySet[FakeCallableDescriptorForObject]

'of' @ [535:81] ==> @JvmStatic public final fun <T> of(element: Issued<Currency>): NonEmptySet<Issued<Currency>> defined in net.corda.core.utilities.NonEmptySet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Issued<Currency>

'amount' @ [535:84] ==> value-parameter amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Obligation.generateCashIssue[ValueParameterDescriptorImpl]

'token' @ [535:91] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'dueBefore' @ [535:99] ==> value-parameter dueBefore: Instant defined in net.corda.finance.contracts.asset.Obligation.generateCashIssue[ValueParameterDescriptorImpl]

'OnLedgerAsset' @ [536:9] ==> public companion object defined in net.corda.finance.contracts.asset.OnLedgerAsset[FakeCallableDescriptorForObject]

'generateIssue' @ [536:23] ==> @JvmStatic public final fun <S : FungibleAsset<Obligation.Terms<Currency>>, T : Any> generateIssue(tx: TransactionBuilder, transactionState: TransactionState<Obligation.State<Currency>>, issueCommand: CommandData): Set<PublicKey> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <S : FungibleAsset<T>> -> State<Currency>
    <T : Any> -> Terms<Currency>

'tx' @ [536:37] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Obligation.generateCashIssue[ValueParameterDescriptorImpl]

'TransactionState' @ [536:41] ==> @JvmOverloads public constructor TransactionState<out T : ContractState>(data: Obligation.State<Currency>, notary: Party, encumbrance: Int? = ...) defined in net.corda.core.contracts.TransactionState[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> State<Currency>

'State' @ [536:58] ==> public constructor State<P : Any>(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty, template: Obligation.Terms<Currency>, quantity: Long, beneficiary: AbstractParty) defined in net.corda.finance.contracts.asset.Obligation.State[ClassConstructorDescriptorImpl]
Inferred types:
    <P : Any> -> Currency

'NORMAL' @ [536:74] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'obligor' @ [536:82] ==> value-parameter obligor: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.generateCashIssue[ValueParameterDescriptorImpl]

'issuanceDef' @ [536:91] ==> val issuanceDef: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.Obligation.generateCashIssue[LocalVariableDescriptor]

'amount' @ [536:104] ==> value-parameter amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Obligation.generateCashIssue[ValueParameterDescriptorImpl]

'quantity' @ [536:111] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'beneficiary' @ [536:121] ==> value-parameter beneficiary: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.generateCashIssue[ValueParameterDescriptorImpl]

'notary' @ [536:135] ==> value-parameter notary: Party defined in net.corda.finance.contracts.asset.Obligation.generateCashIssue[ValueParameterDescriptorImpl]

'Issue' @ [536:153] ==> public constructor Issue() defined in net.corda.finance.contracts.asset.Obligation.Commands.Issue[ClassConstructorDescriptorImpl]

'OnLedgerAsset' @ [556:15] ==> public companion object defined in net.corda.finance.contracts.asset.OnLedgerAsset[FakeCallableDescriptorForObject]

'generateIssue' @ [556:29] ==> @JvmStatic public final fun <S : FungibleAsset<Obligation.Terms<P>>, T : Any> generateIssue(tx: TransactionBuilder, transactionState: TransactionState<Obligation.State<P>>, issueCommand: CommandData): Set<PublicKey> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <S : FungibleAsset<T>> -> State<P>
    <T : Any> -> Terms<P>

'tx' @ [556:43] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Obligation.generateIssue[ValueParameterDescriptorImpl]

'TransactionState' @ [556:47] ==> @JvmOverloads public constructor TransactionState<out T : ContractState>(data: Obligation.State<P>, notary: Party, encumbrance: Int? = ...) defined in net.corda.core.contracts.TransactionState[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> State<P>

'State' @ [556:64] ==> public constructor State<P : Any>(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty, template: Obligation.Terms<P>, quantity: Long, beneficiary: AbstractParty) defined in net.corda.finance.contracts.asset.Obligation.State[ClassConstructorDescriptorImpl]
Inferred types:
    <P : Any> -> P

'NORMAL' @ [556:80] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'obligor' @ [556:88] ==> value-parameter obligor: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.generateIssue[ValueParameterDescriptorImpl]

'issuanceDef' @ [556:97] ==> value-parameter issuanceDef: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation.generateIssue[ValueParameterDescriptorImpl]

'pennies' @ [556:110] ==> value-parameter pennies: Long defined in net.corda.finance.contracts.asset.Obligation.generateIssue[ValueParameterDescriptorImpl]

'beneficiary' @ [556:119] ==> value-parameter beneficiary: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.generateIssue[ValueParameterDescriptorImpl]

'notary' @ [556:133] ==> value-parameter notary: Party defined in net.corda.finance.contracts.asset.Obligation.generateIssue[ValueParameterDescriptorImpl]

'Issue' @ [556:151] ==> public constructor Issue() defined in net.corda.finance.contracts.asset.Obligation.Commands.Issue[ClassConstructorDescriptorImpl]

'inputs' @ [562:22] ==> value-parameter vararg inputs: StateAndRef<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting[ValueParameterDescriptorImpl]

'map' @ [562:29] ==> public inline fun <T, R> Array<out StateAndRef<Obligation.State<P>>>.map(transform: (StateAndRef<Obligation.State<P>>) -> Obligation.State<P>): List<Obligation.State<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State<P>>
    <R> -> State<P>

'it' @ [562:35] ==> value-parameter it: StateAndRef<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [562:38] ==> public final val state: TransactionState<Obligation.State<P>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [562:44] ==> public final val data: Obligation.State<P> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'requireThat' @ [563:9] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [564:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'states' @ [564:68] ==> val states: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting[LocalVariableDescriptor]

'all' @ [564:75] ==> public inline fun <T> Iterable<Obligation.State<P>>.all(predicate: (Obligation.State<P>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>

'it' @ [564:81] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lifecycle' @ [564:84] ==> public final var lifecycle: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'NORMAL' @ [564:107] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'tx' @ [567:9] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting[ValueParameterDescriptorImpl]

'withItems' @ [567:12] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'inputs' @ [567:23] ==> value-parameter vararg inputs: StateAndRef<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting[ValueParameterDescriptorImpl]

'states' @ [569:22] ==> val states: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting[LocalVariableDescriptor]

'groupBy' @ [569:29] ==> public inline fun <T, K> Iterable<Obligation.State<P>>.groupBy(keySelector: (Obligation.State<P>) -> MultilateralNetState<P>): Map<MultilateralNetState<P>, List<Obligation.State<P>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>
    <K> -> MultilateralNetState<P>

'it' @ [569:39] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting.<anonymous>[ValueParameterDescriptorImpl]

'multilateralNetState' @ [569:42] ==> public open val multilateralNetState: MultilateralNetState<P> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'HashMap' @ [570:27] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PublicKey
    <V : (Any..Any?)> -> AbstractParty

'states' @ [571:23] ==> val states: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting[LocalVariableDescriptor]

'map' @ [571:30] ==> public inline fun <T, R> Iterable<Obligation.State<P>>.map(transform: (Obligation.State<P>) -> AbstractParty): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>
    <R> -> AbstractParty

'it' @ [571:36] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting.<anonymous>[ValueParameterDescriptorImpl]

'beneficiary' @ [571:39] ==> public final val beneficiary: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'union' @ [571:53] ==> public infix fun <T> Iterable<AbstractParty>.union(other: Iterable<AbstractParty>): Set<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'states' @ [571:59] ==> val states: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting[LocalVariableDescriptor]

'map' @ [571:66] ==> public inline fun <T, R> Iterable<Obligation.State<P>>.map(transform: (Obligation.State<P>) -> AbstractParty): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>
    <R> -> AbstractParty

'it' @ [571:72] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting.<anonymous>[ValueParameterDescriptorImpl]

'obligor' @ [571:75] ==> public final val obligor: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'toSet' @ [571:86] ==> public fun <T> Iterable<AbstractParty>.toSet(): Set<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'states' @ [574:9] ==> val states: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting[LocalVariableDescriptor]

'map' @ [574:16] ==> public inline fun <T, R> Iterable<Obligation.State<P>>.map(transform: (Obligation.State<P>) -> AbstractParty): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>
    <R> -> AbstractParty

'it' @ [574:22] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting.<anonymous>[ValueParameterDescriptorImpl]

'obligor' @ [574:25] ==> public final val obligor: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'forEach' @ [574:35] ==> @HidesMembers public inline fun <T> Iterable<AbstractParty>.forEach(action: (AbstractParty) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'partyLookup' @ [574:45] ==> val partyLookup: HashMap<PublicKey, AbstractParty> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting[LocalVariableDescriptor]

'put' @ [574:57] ==> public open fun put(key: PublicKey, value: AbstractParty): AbstractParty? defined in java.util.HashMap[JavaMethodDescriptor]

'it' @ [574:61] ==> value-parameter it: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [574:64] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'it' @ [574:75] ==> value-parameter it: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting.<anonymous>[ValueParameterDescriptorImpl]

'Suppress' @ [577:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'component1' @ [578:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<MultilateralNetState<P>, List<Obligation.State<P>>>.component1(): MultilateralNetState<P> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> MultilateralNetState<P>
    <V> -> List<State<P>>

'component2' @ [578:25] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<MultilateralNetState<P>, List<Obligation.State<P>>>.component2(): List<Obligation.State<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> MultilateralNetState<P>
    <V> -> List<State<P>>

'groups' @ [578:41] ==> val groups: Map<MultilateralNetState<P>, List<Obligation.State<P>>> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting[LocalVariableDescriptor]

'netAmountsDue' @ [580:31] ==> public fun <P : AbstractParty, T : Any> netAmountsDue(balances: Map<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<P>>>): Map<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : AbstractParty> -> AbstractParty
    <T : Any> -> Terms<P>

'extractAmountsDue' @ [580:45] ==> public fun <P : Any> extractAmountsDue(product: Obligation.Terms<P>, states: Iterable<Obligation.State<P>>): Map<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : Any> -> P

'issued' @ [580:63] ==> value-parameter issued: Issued<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting[ValueParameterDescriptorImpl]

'product' @ [580:70] ==> public final val product: Obligation.Terms<P> defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'states' @ [580:79] ==> val states: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting[LocalVariableDescriptor]

'asIterable' @ [580:86] ==> @InlineOnly public inline fun <T> Iterable<Obligation.State<P>>.asIterable(): Iterable<Obligation.State<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>

'netBalances' @ [582:13] ==> val netBalances: Map<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting[LocalVariableDescriptor]

'map' @ [584:22] ==> public inline fun <K, V, R> Map<out Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<P>>>.map(transform: (Map.Entry<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<P>>>) -> Obligation.State<P>): List<Obligation.State<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<AbstractParty, AbstractParty>
    <V> -> Amount<Terms<P>>
    <R> -> State<P>

'State' @ [585:25] ==> public constructor State<P : Any>(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty, template: Obligation.Terms<P>, quantity: Long, beneficiary: AbstractParty) defined in net.corda.finance.contracts.asset.Obligation.State[ClassConstructorDescriptorImpl]
Inferred types:
    <P : Any> -> P

'NORMAL' @ [585:41] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'entry' @ [585:49] ==> value-parameter entry: Map.Entry<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [585:55] ==> public abstract val key: Pair<AbstractParty, AbstractParty> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'first' @ [585:59] ==> public final val first: AbstractParty defined in kotlin.Pair[DeserializedPropertyDescriptor]

'netState' @ [586:33] ==> val netState: MultilateralNetState<P> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting[LocalVariableDescriptor]

'template' @ [586:42] ==> public open val template: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.MultilateralNetState[PropertyDescriptorImpl]

'entry' @ [586:52] ==> value-parameter entry: Map.Entry<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [586:58] ==> public abstract val value: Amount<Obligation.Terms<P>> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'quantity' @ [586:64] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'entry' @ [586:74] ==> value-parameter entry: Map.Entry<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [586:80] ==> public abstract val key: Pair<AbstractParty, AbstractParty> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'second' @ [586:84] ==> public final val second: AbstractParty defined in kotlin.Pair[DeserializedPropertyDescriptor]

'forEach' @ [589:22] ==> @HidesMembers public inline fun <T> Iterable<Obligation.State<P>>.forEach(action: (Obligation.State<P>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>

'tx' @ [589:32] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting[ValueParameterDescriptorImpl]

'addOutputState' @ [589:35] ==> @JvmOverloads public final fun addOutputState(state: ContractState, notary: Party, encumbrance: Int? = ...): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'it' @ [589:50] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting.<anonymous>[ValueParameterDescriptorImpl]

'notary' @ [589:54] ==> value-parameter notary: Party defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting[ValueParameterDescriptorImpl]

'tx' @ [590:13] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting[ValueParameterDescriptorImpl]

'addCommand' @ [590:16] ==> public final fun addCommand(data: CommandData, keys: List<PublicKey>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'Net' @ [590:36] ==> public constructor Net(type: NetType) defined in net.corda.finance.contracts.asset.Obligation.Commands.Net[ClassConstructorDescriptorImpl]

'PAYMENT' @ [590:48] ==> enum entry PAYMENT defined in net.corda.finance.contracts.NetType[FakeCallableDescriptorForObject]

'signers' @ [590:58] ==> val signers: Set<AbstractParty> defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting[LocalVariableDescriptor]

'map' @ [590:66] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PublicKey

'it' @ [590:72] ==> value-parameter it: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.generatePaymentNetting.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [590:75] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'statesAndRefs' @ [605:22] ==> value-parameter statesAndRefs: List<StateAndRef<Obligation.State<P>>> defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle[ValueParameterDescriptorImpl]

'map' @ [605:36] ==> public inline fun <T, R> Iterable<StateAndRef<Obligation.State<P>>>.map(transform: (StateAndRef<Obligation.State<P>>) -> Obligation.State<P>): List<Obligation.State<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State<P>>
    <R> -> State<P>

'it' @ [605:42] ==> value-parameter it: StateAndRef<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [605:45] ==> public final val state: TransactionState<Obligation.State<P>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [605:51] ==> public final val data: Obligation.State<P> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'getTermsOrThrow' @ [606:27] ==> private final fun getTermsOrThrow(states: Iterable<Obligation.State<P>>): Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation[SimpleFunctionDescriptorImpl]

'states' @ [606:43] ==> val states: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle[LocalVariableDescriptor]

'when (lifecycle) {
            Lifecycle.DEFAULTED -> Lifecycle.NORMAL
            Lifecycle.NORMAL -> Lifecycle.DEFAULTED
        }' @ [607:33] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Obligation.Lifecycle, entry1: Obligation.Lifecycle): Obligation.Lifecycle[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Lifecycle

'lifecycle' @ [607:39] ==> value-parameter lifecycle: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle[ValueParameterDescriptorImpl]

'DEFAULTED' @ [608:23] ==> enum entry DEFAULTED defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'NORMAL' @ [608:46] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'NORMAL' @ [609:23] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'DEFAULTED' @ [609:43] ==> enum entry DEFAULTED defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'require' @ [611:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'states' @ [611:17] ==> val states: List<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle[LocalVariableDescriptor]

'all' @ [611:24] ==> public inline fun <T> Iterable<Obligation.State<P>>.all(predicate: (Obligation.State<P>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>

'it' @ [611:30] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle.<anonymous>[ValueParameterDescriptorImpl]

'lifecycle' @ [611:33] ==> public final var lifecycle: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'existingLifecycle' @ [611:46] ==> val existingLifecycle: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle[LocalVariableDescriptor]

'existingLifecycle' @ [611:97] ==> val existingLifecycle: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle[LocalVariableDescriptor]

'statesAndRefs' @ [614:22] ==> value-parameter statesAndRefs: List<StateAndRef<Obligation.State<P>>> defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle[ValueParameterDescriptorImpl]

'groupBy' @ [614:36] ==> public inline fun <T, K> Iterable<StateAndRef<Obligation.State<P>>>.groupBy(keySelector: (StateAndRef<Obligation.State<P>>) -> Issued<Obligation.Terms<P>>): Map<Issued<Obligation.Terms<P>>, List<StateAndRef<Obligation.State<P>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State<P>>
    <K> -> Issued<Terms<P>>

'it' @ [614:46] ==> value-parameter it: StateAndRef<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [614:49] ==> public final val state: TransactionState<Obligation.State<P>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [614:55] ==> public final val data: Obligation.State<P> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [614:60] ==> public open val amount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'token' @ [614:67] ==> public final val token: Issued<Obligation.Terms<P>> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'component1' @ [615:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Issued<Obligation.Terms<P>>, List<StateAndRef<Obligation.State<P>>>>.component1(): Issued<Obligation.Terms<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Issued<Terms<P>>
    <V> -> List<StateAndRef<State<P>>>

'component2' @ [615:18] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Issued<Obligation.Terms<P>>, List<StateAndRef<Obligation.State<P>>>>.component2(): List<StateAndRef<Obligation.State<P>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Issued<Terms<P>>
    <V> -> List<StateAndRef<State<P>>>

'groups' @ [615:35] ==> val groups: Map<Issued<Obligation.Terms<P>>, List<StateAndRef<Obligation.State<P>>>> defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle[LocalVariableDescriptor]

'ArrayList' @ [616:31] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> AbstractParty

'stateAndRefs' @ [617:13] ==> val stateAndRefs: List<StateAndRef<Obligation.State<P>>> defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle[LocalVariableDescriptor]

'forEach' @ [617:26] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<Obligation.State<P>>>.forEach(action: (StateAndRef<Obligation.State<P>>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State<P>>

'stateAndRef' @ [618:32] ==> value-parameter stateAndRef: StateAndRef<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [618:44] ==> public final val state: TransactionState<Obligation.State<P>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [618:50] ==> public final val data: Obligation.State<P> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'copy' @ [618:55] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<P> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.State[SimpleFunctionDescriptorImpl]

'lifecycle' @ [618:72] ==> value-parameter lifecycle: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle[ValueParameterDescriptorImpl]

'tx' @ [619:17] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle[ValueParameterDescriptorImpl]

'addInputState' @ [619:20] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'stateAndRef' @ [619:34] ==> value-parameter stateAndRef: StateAndRef<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [620:17] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle[ValueParameterDescriptorImpl]

'addOutputState' @ [620:20] ==> @JvmOverloads public final fun addOutputState(state: ContractState, notary: Party, encumbrance: Int? = ...): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'outState' @ [620:35] ==> val outState: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle.<anonymous>[LocalVariableDescriptor]

'notary' @ [620:45] ==> value-parameter notary: Party defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle[ValueParameterDescriptorImpl]

'partiesUsed' @ [621:17] ==> val partiesUsed: ArrayList<AbstractParty> defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle[LocalVariableDescriptor]

'add' @ [621:29] ==> public open fun add(element: AbstractParty): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'stateAndRef' @ [621:33] ==> value-parameter stateAndRef: StateAndRef<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [621:45] ==> public final val state: TransactionState<Obligation.State<P>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [621:51] ==> public final val data: Obligation.State<P> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'beneficiary' @ [621:56] ==> public final val beneficiary: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'tx' @ [623:13] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle[ValueParameterDescriptorImpl]

'addCommand' @ [623:16] ==> public final fun addCommand(data: CommandData, keys: List<PublicKey>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'SetLifecycle' @ [623:36] ==> public constructor SetLifecycle(lifecycle: Obligation.Lifecycle) defined in net.corda.finance.contracts.asset.Obligation.Commands.SetLifecycle[ClassConstructorDescriptorImpl]

'lifecycle' @ [623:49] ==> value-parameter lifecycle: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle[ValueParameterDescriptorImpl]

'partiesUsed' @ [623:61] ==> val partiesUsed: ArrayList<AbstractParty> defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle[LocalVariableDescriptor]

'map' @ [623:73] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PublicKey

'it' @ [623:79] ==> value-parameter it: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [623:82] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'distinct' @ [623:94] ==> public fun <T> Iterable<PublicKey>.distinct(): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'tx' @ [625:9] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle[ValueParameterDescriptorImpl]

'setTimeWindow' @ [625:12] ==> public final fun setTimeWindow(time: Instant, timeTolerance: Duration): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'issuanceDef' @ [625:26] ==> val issuanceDef: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle[LocalVariableDescriptor]

'dueBefore' @ [625:38] ==> public final val dueBefore: Instant defined in net.corda.finance.contracts.asset.Obligation.Terms[PropertyDescriptorImpl]

'issuanceDef' @ [625:49] ==> val issuanceDef: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation.generateSetLifecycle[LocalVariableDescriptor]

'timeTolerance' @ [625:61] ==> public final val timeTolerance: Duration defined in net.corda.finance.contracts.asset.Obligation.Terms[PropertyDescriptorImpl]

'statesAndRefs' @ [641:22] ==> value-parameter statesAndRefs: Iterable<StateAndRef<Obligation.State<P>>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'map' @ [641:36] ==> public inline fun <T, R> Iterable<StateAndRef<Obligation.State<P>>>.map(transform: (StateAndRef<Obligation.State<P>>) -> TransactionState<Obligation.State<P>>): List<TransactionState<Obligation.State<P>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State<P>>
    <R> -> TransactionState<State<P>>

'it' @ [641:42] ==> value-parameter it: StateAndRef<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [641:45] ==> public final val state: TransactionState<Obligation.State<P>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'states' @ [642:32] ==> val states: List<TransactionState<Obligation.State<P>>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'first' @ [642:39] ==> public fun <T> List<TransactionState<Obligation.State<P>>>.first(): TransactionState<Obligation.State<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<State<P>>

'data' @ [642:47] ==> public final val data: Obligation.State<P> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'obligor' @ [642:52] ==> public final val obligor: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'states' @ [643:31] ==> val states: List<TransactionState<Obligation.State<P>>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'first' @ [643:38] ==> public fun <T> List<TransactionState<Obligation.State<P>>>.first(): TransactionState<Obligation.State<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<State<P>>

'data' @ [643:46] ==> public final val data: Obligation.State<P> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'beneficiary' @ [643:51] ==> public final val beneficiary: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'requireThat' @ [645:9] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [646:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'assetStatesAndRefs' @ [646:68] ==> value-parameter assetStatesAndRefs: Iterable<StateAndRef<FungibleAsset<P>>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'all' @ [646:87] ==> public inline fun <T> Iterable<StateAndRef<FungibleAsset<P>>>.all(predicate: (StateAndRef<FungibleAsset<P>>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<FungibleAsset<P>>

'it' @ [646:93] ==> value-parameter it: StateAndRef<FungibleAsset<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [646:96] ==> public final val state: TransactionState<FungibleAsset<P>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'notary' @ [646:102] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'notary' @ [646:112] ==> value-parameter notary: Party defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'using' @ [647:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'statesAndRefs' @ [647:68] ==> value-parameter statesAndRefs: Iterable<StateAndRef<Obligation.State<P>>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'all' @ [647:82] ==> public inline fun <T> Iterable<StateAndRef<Obligation.State<P>>>.all(predicate: (StateAndRef<Obligation.State<P>>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State<P>>

'it' @ [647:88] ==> value-parameter it: StateAndRef<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [647:91] ==> public final val state: TransactionState<Obligation.State<P>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [647:97] ==> public final val data: Obligation.State<P> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'lifecycle' @ [647:102] ==> public final var lifecycle: Obligation.Lifecycle defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'NORMAL' @ [647:125] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'using' @ [648:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'statesAndRefs' @ [648:64] ==> value-parameter statesAndRefs: Iterable<StateAndRef<Obligation.State<P>>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'all' @ [648:78] ==> public inline fun <T> Iterable<StateAndRef<Obligation.State<P>>>.all(predicate: (StateAndRef<Obligation.State<P>>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State<P>>

'it' @ [648:84] ==> value-parameter it: StateAndRef<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [648:87] ==> public final val state: TransactionState<Obligation.State<P>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'notary' @ [648:93] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'notary' @ [648:103] ==> value-parameter notary: Party defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'using' @ [649:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'statesAndRefs' @ [649:66] ==> value-parameter statesAndRefs: Iterable<StateAndRef<Obligation.State<P>>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'all' @ [649:80] ==> public inline fun <T> Iterable<StateAndRef<Obligation.State<P>>>.all(predicate: (StateAndRef<Obligation.State<P>>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State<P>>

'it' @ [649:86] ==> value-parameter it: StateAndRef<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [649:89] ==> public final val state: TransactionState<Obligation.State<P>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [649:95] ==> public final val data: Obligation.State<P> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'obligor' @ [649:100] ==> public final val obligor: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'obligationIssuer' @ [649:111] ==> val obligationIssuer: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'using' @ [650:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'statesAndRefs' @ [650:70] ==> value-parameter statesAndRefs: Iterable<StateAndRef<Obligation.State<P>>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'all' @ [650:84] ==> public inline fun <T> Iterable<StateAndRef<Obligation.State<P>>>.all(predicate: (StateAndRef<Obligation.State<P>>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State<P>>

'it' @ [650:90] ==> value-parameter it: StateAndRef<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [650:93] ==> public final val state: TransactionState<Obligation.State<P>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [650:99] ==> public final val data: Obligation.State<P> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'beneficiary' @ [650:104] ==> public final val beneficiary: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'obligationOwner' @ [650:119] ==> val obligationOwner: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'getIssuanceDefinitionOrThrow' @ [657:27] ==> private final fun getIssuanceDefinitionOrThrow(states: Iterable<Obligation.State<P>>): Issued<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation[SimpleFunctionDescriptorImpl]

'statesAndRefs' @ [657:56] ==> value-parameter statesAndRefs: Iterable<StateAndRef<Obligation.State<P>>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'map' @ [657:70] ==> public inline fun <T, R> Iterable<StateAndRef<Obligation.State<P>>>.map(transform: (StateAndRef<Obligation.State<P>>) -> Obligation.State<P>): List<Obligation.State<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State<P>>
    <R> -> State<P>

'it' @ [657:76] ==> value-parameter it: StateAndRef<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [657:79] ==> public final val state: TransactionState<Obligation.State<P>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [657:85] ==> public final val data: Obligation.State<P> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'issuanceDef' @ [658:34] ==> val issuanceDef: Issued<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'product' @ [658:46] ==> public final val product: Obligation.Terms<P> defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'Amount' @ [659:42] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: P) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> P

'states' @ [659:49] ==> val states: List<TransactionState<Obligation.State<P>>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'map' @ [659:56] ==> public inline fun <T, R> Iterable<TransactionState<Obligation.State<P>>>.map(transform: (TransactionState<Obligation.State<P>>) -> Obligation.State<P>): List<Obligation.State<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<State<P>>
    <R> -> State<P>

'it' @ [659:62] ==> value-parameter it: TransactionState<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [659:65] ==> public final val data: Obligation.State<P> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'sumObligations' @ [659:72] ==> public fun <P : Any> Iterable<ContractState>.sumObligations(): Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : Any> -> P

'quantity' @ [659:92] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'template' @ [659:102] ==> val template: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'product' @ [659:111] ==> public final val product: P defined in net.corda.finance.contracts.asset.Obligation.Terms[PropertyDescriptorImpl]

'obligationTotal' @ [660:46] ==> val obligationTotal: Amount<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'HashSet' @ [661:28] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> AbstractParty

'statesAndRefs' @ [663:9] ==> value-parameter statesAndRefs: Iterable<StateAndRef<Obligation.State<P>>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'forEach' @ [663:23] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<Obligation.State<P>>>.forEach(action: (StateAndRef<Obligation.State<P>>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State<P>>

'tx' @ [663:33] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'addInputState' @ [663:36] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'it' @ [663:50] ==> value-parameter it: StateAndRef<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>[ValueParameterDescriptorImpl]

'assetStatesAndRefs' @ [666:9] ==> value-parameter assetStatesAndRefs: Iterable<StateAndRef<FungibleAsset<P>>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'forEach' @ [666:28] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<FungibleAsset<P>>>.forEach(action: (StateAndRef<FungibleAsset<P>>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<FungibleAsset<P>>

'obligationRemaining' @ [667:17] ==> var obligationRemaining: Amount<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'quantity' @ [667:37] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'tx' @ [668:17] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'addInputState' @ [668:20] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'ref' @ [668:34] ==> value-parameter ref: StateAndRef<FungibleAsset<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [670:34] ==> value-parameter ref: StateAndRef<FungibleAsset<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [670:38] ==> public final val state: TransactionState<FungibleAsset<P>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [670:44] ==> public final val data: FungibleAsset<P> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'Amount' @ [671:30] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: P) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> P

'assetState' @ [671:37] ==> val assetState: FungibleAsset<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>[LocalVariableDescriptor]

'amount' @ [671:48] ==> public abstract val amount: Amount<Issued<P>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'quantity' @ [671:55] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'assetState' @ [671:65] ==> val assetState: FungibleAsset<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>[LocalVariableDescriptor]

'amount' @ [671:76] ==> public abstract val amount: Amount<Issued<P>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'token' @ [671:83] ==> public final val token: Issued<P> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'product' @ [671:89] ==> public final val product: P defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'if (obligationRemaining >= amount) {
                    tx.addOutputState(assetState.withNewOwnerAndAmount(assetState.amount, obligationOwner), notary)
                    obligationRemaining -= amount
                } else {
                    val change = Amount(obligationRemaining.quantity, assetState.amount.token)
                    // Split the state in two, sending the change back to the previous beneficiary
                    tx.addOutputState(assetState.withNewOwnerAndAmount(change, obligationOwner), notary)
                    tx.addOutputState(assetState.withNewOwnerAndAmount(assetState.amount - change, assetState.owner), notary)
                    obligationRemaining -= Amount(0L, obligationRemaining.token)
                }' @ [672:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'obligationRemaining' @ [672:21] ==> var obligationRemaining: Amount<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'amount' @ [672:44] ==> val amount: Amount<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>[LocalVariableDescriptor]

'tx' @ [673:21] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'addOutputState' @ [673:24] ==> @JvmOverloads public final fun addOutputState(state: ContractState, notary: Party, encumbrance: Int? = ...): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'assetState' @ [673:39] ==> val assetState: FungibleAsset<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>[LocalVariableDescriptor]

'withNewOwnerAndAmount' @ [673:50] ==> public abstract fun withNewOwnerAndAmount(newAmount: Amount<Issued<P>>, newOwner: AbstractParty): FungibleAsset<P> defined in net.corda.core.contracts.FungibleAsset[DeserializedSimpleFunctionDescriptor]

'assetState' @ [673:72] ==> val assetState: FungibleAsset<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>[LocalVariableDescriptor]

'amount' @ [673:83] ==> public abstract val amount: Amount<Issued<P>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'obligationOwner' @ [673:91] ==> val obligationOwner: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'notary' @ [673:109] ==> value-parameter notary: Party defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'obligationRemaining' @ [674:21] ==> var obligationRemaining: Amount<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'amount' @ [674:44] ==> val amount: Amount<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>[LocalVariableDescriptor]

'Amount' @ [676:34] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<P>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<P>

'obligationRemaining' @ [676:41] ==> var obligationRemaining: Amount<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'quantity' @ [676:61] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'assetState' @ [676:71] ==> val assetState: FungibleAsset<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>[LocalVariableDescriptor]

'amount' @ [676:82] ==> public abstract val amount: Amount<Issued<P>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'token' @ [676:89] ==> public final val token: Issued<P> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'tx' @ [678:21] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'addOutputState' @ [678:24] ==> @JvmOverloads public final fun addOutputState(state: ContractState, notary: Party, encumbrance: Int? = ...): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'assetState' @ [678:39] ==> val assetState: FungibleAsset<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>[LocalVariableDescriptor]

'withNewOwnerAndAmount' @ [678:50] ==> public abstract fun withNewOwnerAndAmount(newAmount: Amount<Issued<P>>, newOwner: AbstractParty): FungibleAsset<P> defined in net.corda.core.contracts.FungibleAsset[DeserializedSimpleFunctionDescriptor]

'change' @ [678:72] ==> val change: Amount<Issued<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>[LocalVariableDescriptor]

'obligationOwner' @ [678:80] ==> val obligationOwner: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'notary' @ [678:98] ==> value-parameter notary: Party defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'tx' @ [679:21] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'addOutputState' @ [679:24] ==> @JvmOverloads public final fun addOutputState(state: ContractState, notary: Party, encumbrance: Int? = ...): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'assetState' @ [679:39] ==> val assetState: FungibleAsset<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>[LocalVariableDescriptor]

'withNewOwnerAndAmount' @ [679:50] ==> public abstract fun withNewOwnerAndAmount(newAmount: Amount<Issued<P>>, newOwner: AbstractParty): FungibleAsset<P> defined in net.corda.core.contracts.FungibleAsset[DeserializedSimpleFunctionDescriptor]

'assetState' @ [679:72] ==> val assetState: FungibleAsset<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>[LocalVariableDescriptor]

'amount' @ [679:83] ==> public abstract val amount: Amount<Issued<P>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'change' @ [679:92] ==> val change: Amount<Issued<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>[LocalVariableDescriptor]

'assetState' @ [679:100] ==> val assetState: FungibleAsset<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>[LocalVariableDescriptor]

'owner' @ [679:111] ==> public abstract val owner: AbstractParty defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'notary' @ [679:119] ==> value-parameter notary: Party defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'obligationRemaining' @ [680:21] ==> var obligationRemaining: Amount<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'Amount' @ [680:44] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: P) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> P

'obligationRemaining' @ [680:55] ==> var obligationRemaining: Amount<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'token' @ [680:75] ==> public final val token: P defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'assetSigners' @ [682:17] ==> val assetSigners: HashSet<AbstractParty> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'add' @ [682:30] ==> public open fun add(element: AbstractParty): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'assetState' @ [682:34] ==> val assetState: FungibleAsset<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>[LocalVariableDescriptor]

'owner' @ [682:45] ==> public abstract val owner: AbstractParty defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'if (obligationRemaining.quantity > 0L) {
            tx.addOutputState(State(Lifecycle.NORMAL, obligationIssuer, template, obligationRemaining.quantity, obligationOwner), notary)
        } else {
            // Destroy all of the states
        }' @ [687:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'obligationRemaining' @ [687:13] ==> var obligationRemaining: Amount<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'quantity' @ [687:33] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'tx' @ [688:13] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'addOutputState' @ [688:16] ==> @JvmOverloads public final fun addOutputState(state: ContractState, notary: Party, encumbrance: Int? = ...): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'State' @ [688:31] ==> public constructor State<P : Any>(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty, template: Obligation.Terms<P>, quantity: Long, beneficiary: AbstractParty) defined in net.corda.finance.contracts.asset.Obligation.State[ClassConstructorDescriptorImpl]
Inferred types:
    <P : Any> -> P

'NORMAL' @ [688:47] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'obligationIssuer' @ [688:55] ==> val obligationIssuer: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'template' @ [688:73] ==> val template: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'obligationRemaining' @ [688:83] ==> var obligationRemaining: Amount<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'quantity' @ [688:103] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'obligationOwner' @ [688:113] ==> val obligationOwner: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'notary' @ [688:131] ==> value-parameter notary: Party defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'tx' @ [694:9] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'addCommand' @ [694:12] ==> public final fun addCommand(data: CommandData, keys: List<PublicKey>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'moveCommand' @ [694:23] ==> value-parameter moveCommand: MoveCommand defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'assetSigners' @ [694:36] ==> val assetSigners: HashSet<AbstractParty> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'map' @ [694:49] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PublicKey

'it' @ [694:55] ==> value-parameter it: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.generateSettle.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [694:58] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'tx' @ [695:9] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Obligation.generateSettle[ValueParameterDescriptorImpl]

'addCommand' @ [695:12] ==> public final fun addCommand(data: CommandData, vararg keys: PublicKey): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'Settle' @ [695:32] ==> public constructor Settle<P : Any>(amount: Amount<Issued<Obligation.Terms<P>>>) defined in net.corda.finance.contracts.asset.Obligation.Commands.Settle[ClassConstructorDescriptorImpl]
Inferred types:
    <P : Any> -> P

'Amount' @ [695:39] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Obligation.Terms<P>>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Terms<P>>

'obligationTotal' @ [695:47] ==> val obligationTotal: Amount<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'obligationRemaining' @ [695:65] ==> var obligationRemaining: Amount<P> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'quantity' @ [695:86] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuanceDef' @ [695:96] ==> val issuanceDef: Issued<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'obligationIssuer' @ [695:111] ==> val obligationIssuer: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.generateSettle[LocalVariableDescriptor]

'owningKey' @ [695:128] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'states' @ [700:13] ==> value-parameter states: Iterable<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.getIssuanceDefinitionOrThrow[ValueParameterDescriptorImpl]

'map' @ [700:20] ==> public inline fun <T, R> Iterable<Obligation.State<P>>.map(transform: (Obligation.State<P>) -> Issued<Obligation.Terms<P>>): List<Issued<Obligation.Terms<P>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>
    <R> -> Issued<Terms<P>>

'it' @ [700:26] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.getIssuanceDefinitionOrThrow.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [700:29] ==> public open val amount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'token' @ [700:36] ==> public final val token: Issued<Obligation.Terms<P>> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'distinct' @ [700:44] ==> public fun <T> Iterable<Issued<Obligation.Terms<P>>>.distinct(): List<Issued<Obligation.Terms<P>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Issued<Terms<P>>

'single' @ [700:55] ==> public fun <T> List<Issued<Obligation.Terms<P>>>.single(): Issued<Obligation.Terms<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Issued<Terms<P>>

'states' @ [704:13] ==> value-parameter states: Iterable<Obligation.State<P>> defined in net.corda.finance.contracts.asset.Obligation.getTermsOrThrow[ValueParameterDescriptorImpl]

'map' @ [704:20] ==> public inline fun <T, R> Iterable<Obligation.State<P>>.map(transform: (Obligation.State<P>) -> Obligation.Terms<P>): List<Obligation.Terms<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>
    <R> -> Terms<P>

'it' @ [704:26] ==> value-parameter it: Obligation.State<P> defined in net.corda.finance.contracts.asset.Obligation.getTermsOrThrow.<anonymous>[ValueParameterDescriptorImpl]

'template' @ [704:29] ==> public final val template: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'distinct' @ [704:40] ==> public fun <T> Iterable<Obligation.Terms<P>>.distinct(): List<Obligation.Terms<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Terms<P>

'single' @ [704:51] ==> public fun <T> List<Obligation.Terms<P>>.single(): Obligation.Terms<P> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Terms<P>

'HashMap' @ [714:20] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Pair<AbstractParty, AbstractParty>
    <V : (Any..Any?)> -> Amount<Terms<P>>

'states' @ [716:5] ==> value-parameter states: Iterable<Obligation.State<P>> defined in net.corda.finance.contracts.asset.extractAmountsDue[ValueParameterDescriptorImpl]

'forEach' @ [716:12] ==> @HidesMembers public inline fun <T> Iterable<Obligation.State<P>>.forEach(action: (Obligation.State<P>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<P>

'Pair' @ [717:19] ==> public constructor Pair<out A, out B>(first: AbstractParty, second: AbstractParty) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> AbstractParty
    <out B> -> AbstractParty

'state' @ [717:24] ==> value-parameter state: Obligation.State<P> defined in net.corda.finance.contracts.asset.extractAmountsDue.<anonymous>[ValueParameterDescriptorImpl]

'obligor' @ [717:30] ==> public final val obligor: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'state' @ [717:39] ==> value-parameter state: Obligation.State<P> defined in net.corda.finance.contracts.asset.extractAmountsDue.<anonymous>[ValueParameterDescriptorImpl]

'beneficiary' @ [717:45] ==> public final val beneficiary: AbstractParty defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'balances' @ [718:23] ==> val balances: HashMap<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.extractAmountsDue[LocalVariableDescriptor]

'key' @ [718:32] ==> val key: Pair<AbstractParty, AbstractParty> defined in net.corda.finance.contracts.asset.extractAmountsDue.<anonymous>[LocalVariableDescriptor]

'Amount' @ [718:40] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Obligation.Terms<P>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Terms<P>

'product' @ [718:51] ==> value-parameter product: Obligation.Terms<P> defined in net.corda.finance.contracts.asset.extractAmountsDue[ValueParameterDescriptorImpl]

'balances' @ [719:9] ==> val balances: HashMap<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.extractAmountsDue[LocalVariableDescriptor]

'key' @ [719:18] ==> val key: Pair<AbstractParty, AbstractParty> defined in net.corda.finance.contracts.asset.extractAmountsDue.<anonymous>[LocalVariableDescriptor]

'balance' @ [719:25] ==> val balance: Amount<Obligation.Terms<P>> defined in net.corda.finance.contracts.asset.extractAmountsDue.<anonymous>[LocalVariableDescriptor]

'Amount' @ [719:35] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Obligation.Terms<P>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Terms<P>

'state' @ [719:42] ==> value-parameter state: Obligation.State<P> defined in net.corda.finance.contracts.asset.extractAmountsDue.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [719:48] ==> public open val amount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'quantity' @ [719:55] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'state' @ [719:65] ==> value-parameter state: Obligation.State<P> defined in net.corda.finance.contracts.asset.extractAmountsDue.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [719:71] ==> public open val amount: Amount<Issued<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'token' @ [719:78] ==> public final val token: Issued<Obligation.Terms<P>> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'product' @ [719:84] ==> public final val product: Obligation.Terms<P> defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'balances' @ [722:12] ==> val balances: HashMap<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<P>>> defined in net.corda.finance.contracts.asset.extractAmountsDue[LocalVariableDescriptor]

'HashMap' @ [729:26] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Pair<P, P>
    <V : (Any..Any?)> -> Amount<T>

'balances' @ [731:5] ==> value-parameter balances: Map<Pair<P, P>, Amount<T>> defined in net.corda.finance.contracts.asset.netAmountsDue[ValueParameterDescriptorImpl]

'forEach' @ [731:14] ==> @HidesMembers public inline fun <K, V> Map<out Pair<P, P>, Amount<T>>.forEach(action: (Map.Entry<Pair<P, P>, Amount<T>>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<P, P>
    <V> -> Amount<T>

'component1' @ [732:14] ==> public final operator fun component1(): P defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [732:23] ==> public final operator fun component2(): P defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'balance' @ [732:38] ==> value-parameter balance: Map.Entry<Pair<P, P>, Amount<T>> defined in net.corda.finance.contracts.asset.netAmountsDue.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [732:46] ==> public abstract val key: Pair<P, P> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'Pair' @ [733:27] ==> public constructor Pair<out A, out B>(first: P, second: P) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> P
    <out B> -> P

'beneficiary' @ [733:32] ==> val beneficiary: P defined in net.corda.finance.contracts.asset.netAmountsDue.<anonymous>[LocalVariableDescriptor]

'obligor' @ [733:45] ==> val obligor: P defined in net.corda.finance.contracts.asset.netAmountsDue.<anonymous>[LocalVariableDescriptor]

'balances' @ [734:25] ==> value-parameter balances: Map<Pair<P, P>, Amount<T>> defined in net.corda.finance.contracts.asset.netAmountsDue[ValueParameterDescriptorImpl]

'oppositeKey' @ [734:34] ==> val oppositeKey: Pair<P, P> defined in net.corda.finance.contracts.asset.netAmountsDue.<anonymous>[LocalVariableDescriptor]

'Amount' @ [734:50] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: T) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> T

'balance' @ [734:61] ==> value-parameter balance: Map.Entry<Pair<P, P>, Amount<T>> defined in net.corda.finance.contracts.asset.netAmountsDue.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [734:69] ==> public abstract val value: Amount<T> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'token' @ [734:75] ==> public final val token: T defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'if (balance.value > opposite) {
            nettedBalances[balance.key] = (balance.value - opposite)
        } else if (opposite > balance.value) {
            nettedBalances[oppositeKey] = (opposite - balance.value)
        }' @ [736:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'balance' @ [736:13] ==> value-parameter balance: Map.Entry<Pair<P, P>, Amount<T>> defined in net.corda.finance.contracts.asset.netAmountsDue.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [736:21] ==> public abstract val value: Amount<T> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'opposite' @ [736:29] ==> val opposite: Amount<T> defined in net.corda.finance.contracts.asset.netAmountsDue.<anonymous>[LocalVariableDescriptor]

'nettedBalances' @ [737:13] ==> val nettedBalances: HashMap<Pair<P, P>, Amount<T>> defined in net.corda.finance.contracts.asset.netAmountsDue[LocalVariableDescriptor]

'balance' @ [737:28] ==> value-parameter balance: Map.Entry<Pair<P, P>, Amount<T>> defined in net.corda.finance.contracts.asset.netAmountsDue.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [737:36] ==> public abstract val key: Pair<P, P> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'balance' @ [737:44] ==> value-parameter balance: Map.Entry<Pair<P, P>, Amount<T>> defined in net.corda.finance.contracts.asset.netAmountsDue.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [737:52] ==> public abstract val value: Amount<T> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'opposite' @ [737:60] ==> val opposite: Amount<T> defined in net.corda.finance.contracts.asset.netAmountsDue.<anonymous>[LocalVariableDescriptor]

'opposite' @ [738:20] ==> val opposite: Amount<T> defined in net.corda.finance.contracts.asset.netAmountsDue.<anonymous>[LocalVariableDescriptor]

'balance' @ [738:31] ==> value-parameter balance: Map.Entry<Pair<P, P>, Amount<T>> defined in net.corda.finance.contracts.asset.netAmountsDue.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [738:39] ==> public abstract val value: Amount<T> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'nettedBalances' @ [739:13] ==> val nettedBalances: HashMap<Pair<P, P>, Amount<T>> defined in net.corda.finance.contracts.asset.netAmountsDue[LocalVariableDescriptor]

'oppositeKey' @ [739:28] ==> val oppositeKey: Pair<P, P> defined in net.corda.finance.contracts.asset.netAmountsDue.<anonymous>[LocalVariableDescriptor]

'opposite' @ [739:44] ==> val opposite: Amount<T> defined in net.corda.finance.contracts.asset.netAmountsDue.<anonymous>[LocalVariableDescriptor]

'balance' @ [739:55] ==> value-parameter balance: Map.Entry<Pair<P, P>, Amount<T>> defined in net.corda.finance.contracts.asset.netAmountsDue.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [739:63] ==> public abstract val value: Amount<T> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'nettedBalances' @ [743:12] ==> val nettedBalances: HashMap<Pair<P, P>, Amount<T>> defined in net.corda.finance.contracts.asset.netAmountsDue[LocalVariableDescriptor]

'HashMap' @ [756:15] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> P
    <V : (Any..Any?)> -> Long

'balances' @ [759:5] ==> value-parameter balances: Map<Pair<P, P>, Amount<T>> defined in net.corda.finance.contracts.asset.sumAmountsDue[ValueParameterDescriptorImpl]

'keys' @ [759:14] ==> public abstract val keys: Set<Pair<P, P>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'forEach' @ [759:19] ==> @HidesMembers public inline fun <T> Iterable<Pair<P, P>>.forEach(action: (Pair<P, P>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<P, P>

'sum' @ [760:9] ==> val sum: HashMap<P, Long> defined in net.corda.finance.contracts.asset.sumAmountsDue[LocalVariableDescriptor]

'it' @ [760:13] ==> value-parameter it: Pair<P, P> defined in net.corda.finance.contracts.asset.sumAmountsDue.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [760:16] ==> public final val first: P defined in kotlin.Pair[DeserializedPropertyDescriptor]

'sum' @ [761:9] ==> val sum: HashMap<P, Long> defined in net.corda.finance.contracts.asset.sumAmountsDue[LocalVariableDescriptor]

'it' @ [761:13] ==> value-parameter it: Pair<P, P> defined in net.corda.finance.contracts.asset.sumAmountsDue.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [761:16] ==> public final val second: P defined in kotlin.Pair[DeserializedPropertyDescriptor]

'component1' @ [764:11] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Pair<P, P>, Amount<T>>.component1(): Pair<P, P> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<P, P>
    <V> -> Amount<T>

'component2' @ [764:16] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Pair<P, P>, Amount<T>>.component2(): Amount<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<P, P>
    <V> -> Amount<T>

'balances' @ [764:27] ==> value-parameter balances: Map<Pair<P, P>, Amount<T>> defined in net.corda.finance.contracts.asset.sumAmountsDue[ValueParameterDescriptorImpl]

'component1' @ [765:14] ==> public final operator fun component1(): P defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [765:23] ==> public final operator fun component2(): P defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'key' @ [765:38] ==> val key: Pair<P, P> defined in net.corda.finance.contracts.asset.sumAmountsDue[LocalVariableDescriptor]

'sum' @ [767:9] ==> val sum: HashMap<P, Long> defined in net.corda.finance.contracts.asset.sumAmountsDue[LocalVariableDescriptor]

'obligor' @ [767:13] ==> val obligor: P defined in net.corda.finance.contracts.asset.sumAmountsDue[LocalVariableDescriptor]

'sum' @ [767:24] ==> val sum: HashMap<P, Long> defined in net.corda.finance.contracts.asset.sumAmountsDue[LocalVariableDescriptor]

'obligor' @ [767:28] ==> val obligor: P defined in net.corda.finance.contracts.asset.sumAmountsDue[LocalVariableDescriptor]

'amount' @ [767:41] ==> val amount: Amount<T> defined in net.corda.finance.contracts.asset.sumAmountsDue[LocalVariableDescriptor]

'quantity' @ [767:48] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'sum' @ [769:9] ==> val sum: HashMap<P, Long> defined in net.corda.finance.contracts.asset.sumAmountsDue[LocalVariableDescriptor]

'beneficiary' @ [769:13] ==> val beneficiary: P defined in net.corda.finance.contracts.asset.sumAmountsDue[LocalVariableDescriptor]

'sum' @ [769:28] ==> val sum: HashMap<P, Long> defined in net.corda.finance.contracts.asset.sumAmountsDue[LocalVariableDescriptor]

'beneficiary' @ [769:32] ==> val beneficiary: P defined in net.corda.finance.contracts.asset.sumAmountsDue[LocalVariableDescriptor]

'amount' @ [769:49] ==> val amount: Amount<T> defined in net.corda.finance.contracts.asset.sumAmountsDue[LocalVariableDescriptor]

'quantity' @ [769:56] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'sum' @ [773:20] ==> val sum: HashMap<P, Long> defined in net.corda.finance.contracts.asset.sumAmountsDue[LocalVariableDescriptor]

'iterator' @ [773:24] ==> @JvmName @InlineOnly public operator inline fun <K, V> MutableMap<P, Long>.iterator(): MutableIterator<MutableMap.MutableEntry<P, Long>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> P
    <V> -> Long

'iterator' @ [774:12] ==> val iterator: MutableIterator<MutableMap.MutableEntry<P, Long>> defined in net.corda.finance.contracts.asset.sumAmountsDue[LocalVariableDescriptor]

'hasNext' @ [774:21] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'iterator' @ [775:22] ==> val iterator: MutableIterator<MutableMap.MutableEntry<P, Long>> defined in net.corda.finance.contracts.asset.sumAmountsDue[LocalVariableDescriptor]

'next' @ [775:31] ==> public abstract fun next(): MutableMap.MutableEntry<P, Long> defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'value' @ [775:38] ==> public abstract val value: Long defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'amount' @ [776:13] ==> val amount: Long defined in net.corda.finance.contracts.asset.sumAmountsDue[LocalVariableDescriptor]

'iterator' @ [777:13] ==> val iterator: MutableIterator<MutableMap.MutableEntry<P, Long>> defined in net.corda.finance.contracts.asset.sumAmountsDue[LocalVariableDescriptor]

'remove' @ [777:22] ==> public abstract fun remove(): Unit defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'sum' @ [781:12] ==> val sum: HashMap<P, Long> defined in net.corda.finance.contracts.asset.sumAmountsDue[LocalVariableDescriptor]

'copy' @ [784:66] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<T> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<T> defined in net.corda.finance.contracts.asset.Obligation.State[SimpleFunctionDescriptorImpl]

'template' @ [784:82] ==> public final val template: Obligation.Terms<T> defined in net.corda.finance.contracts.asset.Obligation.State[PropertyDescriptorImpl]

'copy' @ [784:91] ==> public final fun copy(acceptableContracts: NonEmptySet<SecureHash> = ..., acceptableIssuedProducts: NonEmptySet<Issued<T>> = ..., dueBefore: Instant = ..., timeTolerance: Duration = ...): Obligation.Terms<T> defined in net.corda.finance.contracts.asset.Obligation.Terms[SimpleFunctionDescriptorImpl]

'dueBefore' @ [784:108] ==> value-parameter dueBefore: Instant defined in net.corda.finance.contracts.asset.at[ValueParameterDescriptorImpl]

'copy' @ [785:96] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<T> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<T> defined in net.corda.finance.contracts.asset.Obligation.State[SimpleFunctionDescriptorImpl]

'parties' @ [785:111] ==> value-parameter parties: Pair<AbstractParty, AbstractParty> defined in net.corda.finance.contracts.asset.between[ValueParameterDescriptorImpl]

'first' @ [785:119] ==> public final val first: AbstractParty defined in kotlin.Pair[DeserializedPropertyDescriptor]

'parties' @ [785:140] ==> value-parameter parties: Pair<AbstractParty, AbstractParty> defined in net.corda.finance.contracts.asset.between[ValueParameterDescriptorImpl]

'second' @ [785:148] ==> public final val second: AbstractParty defined in kotlin.Pair[DeserializedPropertyDescriptor]

'copy' @ [786:76] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<T> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<T> defined in net.corda.finance.contracts.asset.Obligation.State[SimpleFunctionDescriptorImpl]

'owner' @ [786:95] ==> value-parameter owner: AbstractParty defined in net.corda.finance.contracts.asset.`owned by`[ValueParameterDescriptorImpl]

'copy' @ [787:77] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<T> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<T> defined in net.corda.finance.contracts.asset.Obligation.State[SimpleFunctionDescriptorImpl]

'party' @ [787:92] ==> value-parameter party: AbstractParty defined in net.corda.finance.contracts.asset.`issued by`[ValueParameterDescriptorImpl]

'Suppress' @ [789:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'copy' @ [789:87] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<T> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<T> defined in net.corda.finance.contracts.asset.Obligation.State[SimpleFunctionDescriptorImpl]

'owner' @ [789:106] ==> value-parameter owner: AbstractParty defined in net.corda.finance.contracts.asset.ownedBy[ValueParameterDescriptorImpl]

'Suppress' @ [791:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'copy' @ [791:89] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<T> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<T> defined in net.corda.finance.contracts.asset.Obligation.State[SimpleFunctionDescriptorImpl]

'party' @ [791:104] ==> value-parameter party: AnonymousParty defined in net.corda.finance.contracts.asset.issuedBy[ValueParameterDescriptorImpl]

'lazy' @ [794:36] ==> public fun <T> lazy(initializer: () -> KeyPair): Lazy<KeyPair> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KeyPair

'entropyToKeyPair' @ [794:43] ==> public fun entropyToKeyPair(entropy: BigInteger): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'valueOf' @ [794:71] ==> public open fun valueOf(p0: Long): (BigInteger..BigInteger?) defined in java.math.BigInteger[JavaMethodDescriptor]

'lazy' @ [796:32] ==> public fun <T> lazy(initializer: () -> Party): Lazy<Party> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'Party' @ [796:39] ==> public constructor Party(name: X500Name, owningKey: PublicKey) defined in net.corda.core.identity.Party[DeserializedClassConstructorDescriptor]

'X500Name' @ [796:45] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'DUMMY_OBLIGATION_ISSUER_KEY' @ [796:106] ==> public val DUMMY_OBLIGATION_ISSUER_KEY: KeyPair defined in net.corda.finance.contracts.asset in file Obligation.kt[PropertyDescriptorImpl]

'public' @ [796:134] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

