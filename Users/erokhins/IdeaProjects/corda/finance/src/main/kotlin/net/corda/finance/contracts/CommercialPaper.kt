'CommercialPaper' @ [43:21] ==> public constructor CommercialPaper() defined in net.corda.finance.contracts.CommercialPaper[ClassConstructorDescriptorImpl]

'CP_PROGRAM_ID' @ [53:33] ==> public val CP_PROGRAM_ID: CommercialPaper defined in net.corda.finance.contracts in file CommercialPaper.kt[PropertyDescriptorImpl]

'listOf' @ [54:37] ==> public fun <T> listOf(element: AbstractParty): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'owner' @ [54:44] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'CommandAndState' @ [56:62] ==> public constructor CommandAndState(command: CommandData, ownableState: OwnableState) defined in net.corda.core.contracts.CommandAndState[DeserializedClassConstructorDescriptor]

'Move' @ [56:87] ==> public constructor Move() defined in net.corda.finance.contracts.CommercialPaper.Commands.Move[ClassConstructorDescriptorImpl]

'copy' @ [56:95] ==> public final fun copy(issuance: PartyAndReference = ..., owner: AbstractParty = ..., faceValue: Amount<Issued<Currency>> = ..., maturityDate: Instant = ...): CommercialPaper.State defined in net.corda.finance.contracts.CommercialPaper.State[SimpleFunctionDescriptorImpl]

'newOwner' @ [56:108] ==> value-parameter newOwner: AbstractParty defined in net.corda.finance.contracts.CommercialPaper.State.withNewOwner[ValueParameterDescriptorImpl]

'copy' @ [57:30] ==> public final fun copy(issuance: PartyAndReference = ..., owner: AbstractParty = ..., faceValue: Amount<Issued<Currency>> = ..., maturityDate: Instant = ...): CommercialPaper.State defined in net.corda.finance.contracts.CommercialPaper.State[SimpleFunctionDescriptorImpl]

'NULL_PARTY' @ [57:43] ==> public val NULL_PARTY: AnonymousParty defined in net.corda.core.crypto.testing[DeserializedPropertyDescriptor]

'Emoji' @ [58:38] ==> public object Emoji defined in net.corda.core.internal[FakeCallableDescriptorForObject]

'newspaper' @ [58:44] ==> public final val newspaper: String defined in net.corda.core.internal.Emoji[DeserializedPropertyDescriptor]

'faceValue' @ [58:74] ==> public final val faceValue: Amount<Issued<Currency>> defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'maturityDate' @ [58:99] ==> public final val maturityDate: Instant defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'issuance' @ [58:117] ==> public final val issuance: PartyAndReference defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'owner' @ [58:138] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'copy' @ [61:82] ==> public final fun copy(issuance: PartyAndReference = ..., owner: AbstractParty = ..., faceValue: Amount<Issued<Currency>> = ..., maturityDate: Instant = ...): CommercialPaper.State defined in net.corda.finance.contracts.CommercialPaper.State[SimpleFunctionDescriptorImpl]

'newOwner' @ [61:95] ==> value-parameter newOwner: AbstractParty defined in net.corda.finance.contracts.CommercialPaper.State.withOwner[ValueParameterDescriptorImpl]

'copy' @ [63:101] ==> public final fun copy(issuance: PartyAndReference = ..., owner: AbstractParty = ..., faceValue: Amount<Issued<Currency>> = ..., maturityDate: Instant = ...): CommercialPaper.State defined in net.corda.finance.contracts.CommercialPaper.State[SimpleFunctionDescriptorImpl]

'newFaceValue' @ [63:118] ==> value-parameter newFaceValue: Amount<Issued<Currency>> defined in net.corda.finance.contracts.CommercialPaper.State.withFaceValue[ValueParameterDescriptorImpl]

'copy' @ [64:90] ==> public final fun copy(issuance: PartyAndReference = ..., owner: AbstractParty = ..., faceValue: Amount<Issued<Currency>> = ..., maturityDate: Instant = ...): CommercialPaper.State defined in net.corda.finance.contracts.CommercialPaper.State[SimpleFunctionDescriptorImpl]

'newMaturityDate' @ [64:110] ==> value-parameter newMaturityDate: Instant defined in net.corda.finance.contracts.CommercialPaper.State.withMaturityDate[ValueParameterDescriptorImpl]

'listOf' @ [67:67] ==> public fun <T> listOf(element: CommercialPaperSchemaV1): List<CommercialPaperSchemaV1> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CommercialPaperSchemaV1

'CommercialPaperSchemaV1' @ [67:74] ==> @CordaSerializable public object CommercialPaperSchemaV1 : MappedSchema defined in net.corda.finance.schemas in file CommercialPaperSchemaV1.kt[FakeCallableDescriptorForObject]

'when (schema) {
                is CommercialPaperSchemaV1 -> CommercialPaperSchemaV1.PersistentCommercialPaperState(
                        issuanceParty = this.issuance.party.owningKey.toBase58String(),
                        issuanceRef = this.issuance.reference.bytes,
                        owner = this.owner.owningKey.toBase58String(),
                        maturity = this.maturityDate,
                        faceValue = this.faceValue.quantity,
                        currency = this.faceValue.token.product.currencyCode,
                        faceValueIssuerParty = this.faceValue.token.issuer.party.owningKey.toBase58String(),
                        faceValueIssuerRef = this.faceValue.token.issuer.reference.bytes
                )
            /** Additional schema mappings would be added here (eg. CommercialPaperV2, ...) */
                else -> throw IllegalArgumentException("Unrecognised schema $schema")
            }' @ [72:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PersistentState, entry1: PersistentState): PersistentState[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PersistentState

'schema' @ [72:26] ==> value-parameter schema: MappedSchema defined in net.corda.finance.contracts.CommercialPaper.State.generateMappedObject[ValueParameterDescriptorImpl]

'CommercialPaperSchemaV1' @ [73:47] ==> @CordaSerializable public object CommercialPaperSchemaV1 : MappedSchema defined in net.corda.finance.schemas in file CommercialPaperSchemaV1.kt[FakeCallableDescriptorForObject]

'PersistentCommercialPaperState' @ [73:71] ==> public constructor PersistentCommercialPaperState(issuanceParty: String, issuanceRef: ByteArray, owner: String, maturity: Instant, faceValue: Long, currency: String, faceValueIssuerParty: String, faceValueIssuerRef: ByteArray) defined in net.corda.finance.schemas.CommercialPaperSchemaV1.PersistentCommercialPaperState[ClassConstructorDescriptorImpl]

'this' @ [74:41] ==> <this> defined in net.corda.finance.contracts.CommercialPaper.State[LazyClassReceiverParameterDescriptor]

'issuance' @ [74:46] ==> public final val issuance: PartyAndReference defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'party' @ [74:55] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'owningKey' @ [74:61] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toBase58String' @ [74:71] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'this' @ [75:39] ==> <this> defined in net.corda.finance.contracts.CommercialPaper.State[LazyClassReceiverParameterDescriptor]

'issuance' @ [75:44] ==> public final val issuance: PartyAndReference defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'reference' @ [75:53] ==> public final val reference: OpaqueBytes defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'bytes' @ [75:63] ==> public open val bytes: ByteArray defined in net.corda.core.utilities.OpaqueBytes[DeserializedPropertyDescriptor]

'this' @ [76:33] ==> <this> defined in net.corda.finance.contracts.CommercialPaper.State[LazyClassReceiverParameterDescriptor]

'owner' @ [76:38] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'owningKey' @ [76:44] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toBase58String' @ [76:54] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'this' @ [77:36] ==> <this> defined in net.corda.finance.contracts.CommercialPaper.State[LazyClassReceiverParameterDescriptor]

'maturityDate' @ [77:41] ==> public final val maturityDate: Instant defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'this' @ [78:37] ==> <this> defined in net.corda.finance.contracts.CommercialPaper.State[LazyClassReceiverParameterDescriptor]

'faceValue' @ [78:42] ==> public final val faceValue: Amount<Issued<Currency>> defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'quantity' @ [78:52] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'this' @ [79:36] ==> <this> defined in net.corda.finance.contracts.CommercialPaper.State[LazyClassReceiverParameterDescriptor]

'faceValue' @ [79:41] ==> public final val faceValue: Amount<Issued<Currency>> defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'token' @ [79:51] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'product' @ [79:57] ==> public final val product: Currency defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'currencyCode' @ [79:65] ==> public final val Currency.currencyCode: (String..String?)[MyPropertyDescriptor]

'this' @ [80:48] ==> <this> defined in net.corda.finance.contracts.CommercialPaper.State[LazyClassReceiverParameterDescriptor]

'faceValue' @ [80:53] ==> public final val faceValue: Amount<Issued<Currency>> defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'token' @ [80:63] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [80:69] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'party' @ [80:76] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'owningKey' @ [80:82] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toBase58String' @ [80:92] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'this' @ [81:46] ==> <this> defined in net.corda.finance.contracts.CommercialPaper.State[LazyClassReceiverParameterDescriptor]

'faceValue' @ [81:51] ==> public final val faceValue: Amount<Issued<Currency>> defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'token' @ [81:61] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [81:67] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'reference' @ [81:74] ==> public final val reference: OpaqueBytes defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'bytes' @ [81:84] ==> public open val bytes: ByteArray defined in net.corda.core.utilities.OpaqueBytes[DeserializedPropertyDescriptor]

'IllegalArgumentException' @ [84:31] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'schema' @ [84:78] ==> value-parameter schema: MappedSchema defined in net.corda.finance.contracts.CommercialPaper.State.generateMappedObject[ValueParameterDescriptorImpl]

'copy' @ [88:71] ==> public final fun copy(issuance: PartyAndReference = ..., owner: AbstractParty = ..., faceValue: Amount<Issued<Currency>> = ..., maturityDate: Instant = ...): CommercialPaper.State defined in net.corda.finance.contracts.CommercialPaper.State[SimpleFunctionDescriptorImpl]

'owner' @ [88:84] ==> value-parameter owner: AbstractParty defined in net.corda.finance.contracts.CommercialPaper.State.`owned by`[ValueParameterDescriptorImpl]

'TransactionState' @ [89:67] ==> @JvmOverloads public constructor TransactionState<out T : ContractState>(data: CommercialPaper.State, notary: Party, encumbrance: Int? = ...) defined in net.corda.core.contracts.TransactionState[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> State

'this' @ [89:84] ==> <this> defined in net.corda.finance.contracts.CommercialPaper.State[LazyClassReceiverParameterDescriptor]

'notary' @ [89:90] ==> value-parameter notary: Party defined in net.corda.finance.contracts.CommercialPaper.State.`with notary`[ValueParameterDescriptorImpl]

'TypeOnlyCommandData' @ [93:22] ==> public constructor TypeOnlyCommandData() defined in net.corda.core.contracts.TypeOnlyCommandData[DeserializedClassConstructorDescriptor]

'TypeOnlyCommandData' @ [95:24] ==> public constructor TypeOnlyCommandData() defined in net.corda.core.contracts.TypeOnlyCommandData[DeserializedClassConstructorDescriptor]

'TypeOnlyCommandData' @ [98:23] ==> public constructor TypeOnlyCommandData() defined in net.corda.core.contracts.TypeOnlyCommandData[DeserializedClassConstructorDescriptor]

'tx' @ [103:22] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.CommercialPaper.verify[ValueParameterDescriptorImpl]

'groupStates' @ [103:25] ==> public final inline fun <reified T : ContractState, K : Any> groupStates(noinline selector: (CommercialPaper.State) -> CommercialPaper.State): List<LedgerTransaction.InOutGroup<CommercialPaper.State, CommercialPaper.State>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State
    <K : Any> -> State

'State' @ [103:37] ==> private constructor State() defined in kotlin.collections.State[DeserializedClassConstructorDescriptor]

'tx' @ [107:23] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.CommercialPaper.verify[ValueParameterDescriptorImpl]

'commands' @ [107:26] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'requireSingleCommand' @ [107:35] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.requireSingleCommand(): AuthenticatedObject<CommercialPaper.Commands> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Commands

'tx' @ [108:39] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.CommercialPaper.verify[ValueParameterDescriptorImpl]

'timeWindow' @ [108:42] ==> public final val timeWindow: TimeWindow? defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'Suppress' @ [111:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'component1' @ [112:15] ==> public final operator fun component1(): List<CommercialPaper.State> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'component2' @ [112:23] ==> public final operator fun component2(): List<CommercialPaper.State> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'component3' @ [112:32] ==> public final operator fun component3(): CommercialPaper.State defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'groups' @ [112:40] ==> val groups: List<LedgerTransaction.InOutGroup<CommercialPaper.State, CommercialPaper.State>> defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'when (command.value) {
                is Commands.Move -> {
                    val input = inputs.single()
                    requireThat {
                        "the transaction is signed by the owner of the CP" using (input.owner.owningKey in command.signers)
                        "the state is propagated" using (outputs.size == 1)
                        // Don't need to check anything else, as if outputs.size == 1 then the output is equal to
                        // the input ignoring the owner field due to the grouping.
                    }
                }

                is Commands.Redeem -> {
                    // Redemption of the paper requires movement of on-ledger cash.
                    val input = inputs.single()
                    val received = tx.outputStates.sumCashBy(input.owner)
                    val time = timeWindow?.fromTime ?: throw IllegalArgumentException("Redemptions must have a time-window")
                    requireThat {
                        "the paper must have matured" using (time >= input.maturityDate)
                        "the received amount equals the face value" using (received == input.faceValue)
                        "the paper must be destroyed" using outputs.isEmpty()
                        "the transaction is signed by the owner of the CP" using (input.owner.owningKey in command.signers)
                    }
                }

                is Commands.Issue -> {
                    val output = outputs.single()
                    val time = timeWindow?.untilTime ?: throw IllegalArgumentException("Issuances have a time-window")
                    requireThat {
                        // Don't allow people to issue commercial paper under other entities identities.
                        "output states are issued by a command signer" using
                                (output.issuance.party.owningKey in command.signers)
                        "output values sum to more than the inputs" using (output.faceValue.quantity > 0)
                        "the maturity date is not in the past" using (time < output.maturityDate)
                        // Don't allow an existing CP state to be replaced by this issuance.
                        // TODO: Consider how to handle the case of mistaken issuances, or other need to patch.
                        "output values sum to more than the inputs" using inputs.isEmpty()
                    }
                }

            // TODO: Think about how to evolve contracts over time with new commands.
                else -> throw IllegalArgumentException("Unrecognised command")
            }' @ [113:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'command' @ [113:19] ==> val command: AuthenticatedObject<CommercialPaper.Commands> defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'value' @ [113:27] ==> public final val value: CommercialPaper.Commands defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'inputs' @ [115:33] ==> val inputs: List<CommercialPaper.State> defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'single' @ [115:40] ==> public fun <T> List<CommercialPaper.State>.single(): CommercialPaper.State defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'requireThat' @ [116:21] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [117:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'input' @ [117:83] ==> val input: CommercialPaper.State defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'owner' @ [117:89] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'owningKey' @ [117:95] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'command' @ [117:108] ==> val command: AuthenticatedObject<CommercialPaper.Commands> defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'signers' @ [117:116] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'using' @ [118:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'outputs' @ [118:58] ==> val outputs: List<CommercialPaper.State> defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'size' @ [118:66] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'inputs' @ [126:33] ==> val inputs: List<CommercialPaper.State> defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'single' @ [126:40] ==> public fun <T> List<CommercialPaper.State>.single(): CommercialPaper.State defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'tx' @ [127:36] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.CommercialPaper.verify[ValueParameterDescriptorImpl]

'outputStates' @ [127:39] ==> public final val outputStates: List<ContractState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'sumCashBy' @ [127:52] ==> public fun Iterable<ContractState>.sumCashBy(owner: AbstractParty): Amount<Issued<Currency>> defined in net.corda.finance.utils[SimpleFunctionDescriptorImpl]

'input' @ [127:62] ==> val input: CommercialPaper.State defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'owner' @ [127:68] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'timeWindow' @ [128:32] ==> val timeWindow: TimeWindow? defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'fromTime' @ [128:44] ==> public abstract val fromTime: Instant? defined in net.corda.core.contracts.TimeWindow[DeserializedPropertyDescriptor]

'IllegalArgumentException' @ [128:62] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'requireThat' @ [129:21] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [130:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'time' @ [130:62] ==> val time: Instant defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'input' @ [130:70] ==> val input: CommercialPaper.State defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'maturityDate' @ [130:76] ==> public final val maturityDate: Instant defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'using' @ [131:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'received' @ [131:76] ==> val received: Amount<Issued<Currency>> defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'input' @ [131:88] ==> val input: CommercialPaper.State defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'faceValue' @ [131:94] ==> public final val faceValue: Amount<Issued<Currency>> defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'using' @ [132:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'outputs' @ [132:61] ==> val outputs: List<CommercialPaper.State> defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'isEmpty' @ [132:69] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'using' @ [133:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'input' @ [133:83] ==> val input: CommercialPaper.State defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'owner' @ [133:89] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'owningKey' @ [133:95] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'command' @ [133:108] ==> val command: AuthenticatedObject<CommercialPaper.Commands> defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'signers' @ [133:116] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'outputs' @ [138:34] ==> val outputs: List<CommercialPaper.State> defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'single' @ [138:42] ==> public fun <T> List<CommercialPaper.State>.single(): CommercialPaper.State defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'timeWindow' @ [139:32] ==> val timeWindow: TimeWindow? defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'untilTime' @ [139:44] ==> public abstract val untilTime: Instant? defined in net.corda.core.contracts.TimeWindow[DeserializedPropertyDescriptor]

'IllegalArgumentException' @ [139:63] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'requireThat' @ [140:21] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [142:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'output' @ [143:34] ==> val output: CommercialPaper.State defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'issuance' @ [143:41] ==> public final val issuance: PartyAndReference defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'party' @ [143:50] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'owningKey' @ [143:56] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'command' @ [143:69] ==> val command: AuthenticatedObject<CommercialPaper.Commands> defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'signers' @ [143:77] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'using' @ [144:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'output' @ [144:76] ==> val output: CommercialPaper.State defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'faceValue' @ [144:83] ==> public final val faceValue: Amount<Issued<Currency>> defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'quantity' @ [144:93] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'using' @ [145:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'time' @ [145:71] ==> val time: Instant defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'output' @ [145:78] ==> val output: CommercialPaper.State defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'maturityDate' @ [145:85] ==> public final val maturityDate: Instant defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'using' @ [148:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'inputs' @ [148:75] ==> val inputs: List<CommercialPaper.State> defined in net.corda.finance.contracts.CommercialPaper.verify[LocalVariableDescriptor]

'isEmpty' @ [148:82] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'IllegalArgumentException' @ [153:31] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'State' @ [165:21] ==> public constructor State(issuance: PartyAndReference, owner: AbstractParty, faceValue: Amount<Issued<Currency>>, maturityDate: Instant) defined in net.corda.finance.contracts.CommercialPaper.State[ClassConstructorDescriptorImpl]

'issuance' @ [165:27] ==> value-parameter issuance: PartyAndReference defined in net.corda.finance.contracts.CommercialPaper.generateIssue[ValueParameterDescriptorImpl]

'issuance' @ [165:37] ==> value-parameter issuance: PartyAndReference defined in net.corda.finance.contracts.CommercialPaper.generateIssue[ValueParameterDescriptorImpl]

'party' @ [165:46] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'faceValue' @ [165:53] ==> value-parameter faceValue: Amount<Issued<Currency>> defined in net.corda.finance.contracts.CommercialPaper.generateIssue[ValueParameterDescriptorImpl]

'maturityDate' @ [165:64] ==> value-parameter maturityDate: Instant defined in net.corda.finance.contracts.CommercialPaper.generateIssue[ValueParameterDescriptorImpl]

'TransactionBuilder' @ [166:16] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [166:44] ==> value-parameter notary: Party defined in net.corda.finance.contracts.CommercialPaper.generateIssue[ValueParameterDescriptorImpl]

'withItems' @ [166:52] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'state' @ [166:62] ==> val state: CommercialPaper.State defined in net.corda.finance.contracts.CommercialPaper.generateIssue[LocalVariableDescriptor]

'Command' @ [166:69] ==> public constructor Command<T : CommandData>(data: CommercialPaper.Commands.Issue, key: PublicKey) defined in net.corda.core.contracts.Command[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : CommandData> -> Issue

'Issue' @ [166:86] ==> public constructor Issue() defined in net.corda.finance.contracts.CommercialPaper.Commands.Issue[ClassConstructorDescriptorImpl]

'issuance' @ [166:95] ==> value-parameter issuance: PartyAndReference defined in net.corda.finance.contracts.CommercialPaper.generateIssue[ValueParameterDescriptorImpl]

'party' @ [166:104] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'owningKey' @ [166:110] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'tx' @ [173:9] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.CommercialPaper.generateMove[ValueParameterDescriptorImpl]

'addInputState' @ [173:12] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'paper' @ [173:26] ==> value-parameter paper: StateAndRef<CommercialPaper.State> defined in net.corda.finance.contracts.CommercialPaper.generateMove[ValueParameterDescriptorImpl]

'tx' @ [174:9] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.CommercialPaper.generateMove[ValueParameterDescriptorImpl]

'addOutputState' @ [174:12] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'paper' @ [174:27] ==> value-parameter paper: StateAndRef<CommercialPaper.State> defined in net.corda.finance.contracts.CommercialPaper.generateMove[ValueParameterDescriptorImpl]

'state' @ [174:33] ==> public final val state: TransactionState<CommercialPaper.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [174:39] ==> public final val data: CommercialPaper.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'withOwner' @ [174:44] ==> public open fun withOwner(newOwner: AbstractParty): ICommercialPaperState defined in net.corda.finance.contracts.CommercialPaper.State[SimpleFunctionDescriptorImpl]

'newOwner' @ [174:54] ==> value-parameter newOwner: AbstractParty defined in net.corda.finance.contracts.CommercialPaper.generateMove[ValueParameterDescriptorImpl]

'tx' @ [175:9] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.CommercialPaper.generateMove[ValueParameterDescriptorImpl]

'addCommand' @ [175:12] ==> public final fun addCommand(data: CommandData, vararg keys: PublicKey): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'Move' @ [175:32] ==> public constructor Move() defined in net.corda.finance.contracts.CommercialPaper.Commands.Move[ClassConstructorDescriptorImpl]

'paper' @ [175:40] ==> value-parameter paper: StateAndRef<CommercialPaper.State> defined in net.corda.finance.contracts.CommercialPaper.generateMove[ValueParameterDescriptorImpl]

'state' @ [175:46] ==> public final val state: TransactionState<CommercialPaper.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [175:52] ==> public final val data: CommercialPaper.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'owner' @ [175:57] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'owningKey' @ [175:63] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'Throws' @ [185:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'InsufficientBalanceException' @ [185:13] ==> public constructor InsufficientBalanceException(amountMissing: Amount<*>) defined in net.corda.core.contracts.InsufficientBalanceException[DeserializedClassConstructorDescriptor]

'Suspendable' @ [186:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Cash' @ [189:9] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'generateSpend' @ [189:14] ==> @JvmStatic @Throws @Suspendable public final fun generateSpend(services: ServiceHub, tx: TransactionBuilder, amount: Amount<Currency>, to: AbstractParty, onlyFromParties: Set<AbstractParty> = ...): Pair<TransactionBuilder, List<PublicKey>> defined in net.corda.finance.contracts.asset.Cash.Companion[SimpleFunctionDescriptorImpl]

'services' @ [189:28] ==> value-parameter services: ServiceHub defined in net.corda.finance.contracts.CommercialPaper.generateRedeem[ValueParameterDescriptorImpl]

'tx' @ [189:38] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.CommercialPaper.generateRedeem[ValueParameterDescriptorImpl]

'paper' @ [189:42] ==> value-parameter paper: StateAndRef<CommercialPaper.State> defined in net.corda.finance.contracts.CommercialPaper.generateRedeem[ValueParameterDescriptorImpl]

'state' @ [189:48] ==> public final val state: TransactionState<CommercialPaper.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [189:54] ==> public final val data: CommercialPaper.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'faceValue' @ [189:59] ==> public final val faceValue: Amount<Issued<Currency>> defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'withoutIssuer' @ [189:69] ==> public fun <T : Any> Amount<Issued<Currency>>.withoutIssuer(): Amount<Currency> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency

'paper' @ [189:86] ==> value-parameter paper: StateAndRef<CommercialPaper.State> defined in net.corda.finance.contracts.CommercialPaper.generateRedeem[ValueParameterDescriptorImpl]

'state' @ [189:92] ==> public final val state: TransactionState<CommercialPaper.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [189:98] ==> public final val data: CommercialPaper.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'owner' @ [189:103] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'tx' @ [190:9] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.CommercialPaper.generateRedeem[ValueParameterDescriptorImpl]

'addInputState' @ [190:12] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'paper' @ [190:26] ==> value-parameter paper: StateAndRef<CommercialPaper.State> defined in net.corda.finance.contracts.CommercialPaper.generateRedeem[ValueParameterDescriptorImpl]

'tx' @ [191:9] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.CommercialPaper.generateRedeem[ValueParameterDescriptorImpl]

'addCommand' @ [191:12] ==> public final fun addCommand(data: CommandData, vararg keys: PublicKey): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'Redeem' @ [191:32] ==> public constructor Redeem() defined in net.corda.finance.contracts.CommercialPaper.Commands.Redeem[ClassConstructorDescriptorImpl]

'paper' @ [191:42] ==> value-parameter paper: StateAndRef<CommercialPaper.State> defined in net.corda.finance.contracts.CommercialPaper.generateRedeem[ValueParameterDescriptorImpl]

'state' @ [191:48] ==> public final val state: TransactionState<CommercialPaper.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [191:54] ==> public final val data: CommercialPaper.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'owner' @ [191:59] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.CommercialPaper.State[PropertyDescriptorImpl]

'owningKey' @ [191:65] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

