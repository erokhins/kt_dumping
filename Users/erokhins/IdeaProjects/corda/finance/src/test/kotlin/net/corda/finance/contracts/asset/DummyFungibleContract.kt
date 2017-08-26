'OnLedgerAsset<Currency, DummyFungibleContract.Commands, DummyFungibleContract.State>' @ [20:31] ==> public constructor OnLedgerAsset<T : Any, C : CommandData, S : FungibleAsset<Currency>>() defined in net.corda.finance.contracts.asset.OnLedgerAsset[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency
    <C : CommandData> -> Commands
    <S : FungibleAsset<T>> -> State

'commands' @ [22:15] ==> value-parameter commands: Collection<AuthenticatedObject<CommandData>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.extractCommands[ValueParameterDescriptorImpl]

'select' @ [22:24] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signer: PublicKey? = ..., party: AbstractParty? = ...): List<AuthenticatedObject<DummyFungibleContract.Commands>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Commands

'this' @ [30:19] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[ClassConstructorDescriptorImpl]

'Amount' @ [30:24] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'amount' @ [30:31] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State.<init>[ValueParameterDescriptorImpl]

'quantity' @ [30:38] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'Issued' @ [30:48] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'deposit' @ [30:55] ==> value-parameter deposit: PartyAndReference defined in net.corda.finance.contracts.asset.DummyFungibleContract.State.<init>[ValueParameterDescriptorImpl]

'amount' @ [30:64] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State.<init>[ValueParameterDescriptorImpl]

'token' @ [30:71] ==> public final val token: Currency defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'owner' @ [30:80] ==> value-parameter owner: AbstractParty defined in net.corda.finance.contracts.asset.DummyFungibleContract.State.<init>[ValueParameterDescriptorImpl]

'setOf' @ [32:33] ==> public fun <T> setOf(vararg elements: PublicKey): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'owner' @ [32:39] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'owningKey' @ [32:45] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'amount' @ [32:56] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'token' @ [32:63] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [32:69] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'party' @ [32:76] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'owningKey' @ [32:82] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'CASH_PROGRAM_ID' @ [33:33] ==> public val CASH_PROGRAM_ID: Cash defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'listOf' @ [34:37] ==> public fun <T> listOf(element: AbstractParty): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'owner' @ [34:44] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'copy' @ [37:19] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): DummyFungibleContract.State defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[SimpleFunctionDescriptorImpl]

'amount' @ [37:33] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'copy' @ [37:40] ==> public final fun copy(quantity: Long = ..., displayTokenSize: BigDecimal = ..., token: Issued<Currency> = ...): Amount<Issued<Currency>> defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'newAmount' @ [37:45] ==> value-parameter newAmount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State.withNewOwnerAndAmount[ValueParameterDescriptorImpl]

'quantity' @ [37:55] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'newOwner' @ [37:74] ==> value-parameter newOwner: AbstractParty defined in net.corda.finance.contracts.asset.DummyFungibleContract.State.withNewOwnerAndAmount[ValueParameterDescriptorImpl]

'Emoji' @ [39:38] ==> public object Emoji defined in net.corda.core.internal[FakeCallableDescriptorForObject]

'bagOfCash' @ [39:44] ==> public final val bagOfCash: String defined in net.corda.core.internal.Emoji[DeserializedPropertyDescriptor]

'amount' @ [39:60] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'amount' @ [39:72] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'token' @ [39:79] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [39:85] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'owner' @ [39:103] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'CommandAndState' @ [41:62] ==> public constructor CommandAndState(command: CommandData, ownableState: OwnableState) defined in net.corda.core.contracts.CommandAndState[DeserializedClassConstructorDescriptor]

'Move' @ [41:87] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.DummyFungibleContract.Commands.Move[ClassConstructorDescriptorImpl]

'copy' @ [41:95] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): DummyFungibleContract.State defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[SimpleFunctionDescriptorImpl]

'newOwner' @ [41:108] ==> value-parameter newOwner: AbstractParty defined in net.corda.finance.contracts.asset.DummyFungibleContract.State.withNewOwner[ValueParameterDescriptorImpl]

'when (schema) {
                is SampleCashSchemaV1 -> SampleCashSchemaV1.PersistentCashState(
                        owner = this.owner.owningKey.toBase58String(),
                        pennies = this.amount.quantity,
                        currency = this.amount.token.product.currencyCode,
                        issuerParty = this.amount.token.issuer.party.owningKey.toBase58String(),
                        issuerRef = this.amount.token.issuer.reference.bytes
                )
                is SampleCashSchemaV2 -> SampleCashSchemaV2.PersistentCashState(
                        _participants = this.participants.toMutableSet(),
                        _owner = this.owner,
                        _quantity = this.amount.quantity,
                        currency = this.amount.token.product.currencyCode,
                        _issuerParty = this.amount.token.issuer.party,
                        _issuerRef = this.amount.token.issuer.reference.bytes
                )
                is SampleCashSchemaV3 -> SampleCashSchemaV3.PersistentCashState(
                        participants = this.participants.toMutableSet(),
                        owner = this.owner,
                        pennies = this.amount.quantity,
                        currency = this.amount.token.product.currencyCode,
                        issuer = this.amount.token.issuer.party,
                        issuerRef = this.amount.token.issuer.reference.bytes
                )
                else -> throw IllegalArgumentException("Unrecognised schema $schema")
            }' @ [45:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PersistentState, entry1: PersistentState, entry2: PersistentState, entry3: PersistentState): PersistentState[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PersistentState

'schema' @ [45:26] ==> value-parameter schema: MappedSchema defined in net.corda.finance.contracts.asset.DummyFungibleContract.State.generateMappedObject[ValueParameterDescriptorImpl]

'SampleCashSchemaV1' @ [46:42] ==> public object SampleCashSchemaV1 : MappedSchema defined in net.corda.finance.schemas in file SampleCashSchemaV1.kt[FakeCallableDescriptorForObject]

'PersistentCashState' @ [46:61] ==> public constructor PersistentCashState(owner: String, pennies: Long, currency: String, issuerParty: String, issuerRef: ByteArray) defined in net.corda.finance.schemas.SampleCashSchemaV1.PersistentCashState[ClassConstructorDescriptorImpl]

'this' @ [47:33] ==> <this> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[LazyClassReceiverParameterDescriptor]

'owner' @ [47:38] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'owningKey' @ [47:44] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toBase58String' @ [47:54] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'this' @ [48:35] ==> <this> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[LazyClassReceiverParameterDescriptor]

'amount' @ [48:40] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'quantity' @ [48:47] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'this' @ [49:36] ==> <this> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[LazyClassReceiverParameterDescriptor]

'amount' @ [49:41] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'token' @ [49:48] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'product' @ [49:54] ==> public final val product: Currency defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'currencyCode' @ [49:62] ==> public final val Currency.currencyCode: (String..String?)[MyPropertyDescriptor]

'this' @ [50:39] ==> <this> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[LazyClassReceiverParameterDescriptor]

'amount' @ [50:44] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'token' @ [50:51] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [50:57] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'party' @ [50:64] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'owningKey' @ [50:70] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toBase58String' @ [50:80] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'this' @ [51:37] ==> <this> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[LazyClassReceiverParameterDescriptor]

'amount' @ [51:42] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'token' @ [51:49] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [51:55] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'reference' @ [51:62] ==> public final val reference: OpaqueBytes defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'bytes' @ [51:72] ==> public open val bytes: ByteArray defined in net.corda.core.utilities.OpaqueBytes[DeserializedPropertyDescriptor]

'SampleCashSchemaV2' @ [53:42] ==> public object SampleCashSchemaV2 : MappedSchema defined in net.corda.finance.schemas in file SampleCashSchemaV2.kt[FakeCallableDescriptorForObject]

'PersistentCashState' @ [53:61] ==> public constructor PersistentCashState(currency: String, _participants: Set<AbstractParty>, _owner: AbstractParty, _quantity: Long, _issuerParty: AbstractParty, _issuerRef: ByteArray) defined in net.corda.finance.schemas.SampleCashSchemaV2.PersistentCashState[ClassConstructorDescriptorImpl]

'this' @ [54:41] ==> <this> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[LazyClassReceiverParameterDescriptor]

'participants' @ [54:46] ==> public open val participants: List<AbstractParty> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'toMutableSet' @ [54:59] ==> public fun <T> Iterable<AbstractParty>.toMutableSet(): MutableSet<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'this' @ [55:34] ==> <this> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[LazyClassReceiverParameterDescriptor]

'owner' @ [55:39] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'this' @ [56:37] ==> <this> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[LazyClassReceiverParameterDescriptor]

'amount' @ [56:42] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'quantity' @ [56:49] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'this' @ [57:36] ==> <this> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[LazyClassReceiverParameterDescriptor]

'amount' @ [57:41] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'token' @ [57:48] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'product' @ [57:54] ==> public final val product: Currency defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'currencyCode' @ [57:62] ==> public final val Currency.currencyCode: (String..String?)[MyPropertyDescriptor]

'this' @ [58:40] ==> <this> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[LazyClassReceiverParameterDescriptor]

'amount' @ [58:45] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'token' @ [58:52] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [58:58] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'party' @ [58:65] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'this' @ [59:38] ==> <this> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[LazyClassReceiverParameterDescriptor]

'amount' @ [59:43] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'token' @ [59:50] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [59:56] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'reference' @ [59:63] ==> public final val reference: OpaqueBytes defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'bytes' @ [59:73] ==> public open val bytes: ByteArray defined in net.corda.core.utilities.OpaqueBytes[DeserializedPropertyDescriptor]

'SampleCashSchemaV3' @ [61:42] ==> public object SampleCashSchemaV3 : MappedSchema defined in net.corda.finance.schemas in file SampleCashSchemaV3.kt[FakeCallableDescriptorForObject]

'PersistentCashState' @ [61:61] ==> public constructor PersistentCashState(participants: MutableSet<AbstractParty>? = ..., owner: AbstractParty, pennies: Long, currency: String, issuer: AbstractParty, issuerRef: ByteArray) defined in net.corda.finance.schemas.SampleCashSchemaV3.PersistentCashState[ClassConstructorDescriptorImpl]

'this' @ [62:40] ==> <this> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[LazyClassReceiverParameterDescriptor]

'participants' @ [62:45] ==> public open val participants: List<AbstractParty> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'toMutableSet' @ [62:58] ==> public fun <T> Iterable<AbstractParty>.toMutableSet(): MutableSet<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'this' @ [63:33] ==> <this> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[LazyClassReceiverParameterDescriptor]

'owner' @ [63:38] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'this' @ [64:35] ==> <this> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[LazyClassReceiverParameterDescriptor]

'amount' @ [64:40] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'quantity' @ [64:47] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'this' @ [65:36] ==> <this> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[LazyClassReceiverParameterDescriptor]

'amount' @ [65:41] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'token' @ [65:48] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'product' @ [65:54] ==> public final val product: Currency defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'currencyCode' @ [65:62] ==> public final val Currency.currencyCode: (String..String?)[MyPropertyDescriptor]

'this' @ [66:34] ==> <this> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[LazyClassReceiverParameterDescriptor]

'amount' @ [66:39] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'token' @ [66:46] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [66:52] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'party' @ [66:59] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'this' @ [67:37] ==> <this> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[LazyClassReceiverParameterDescriptor]

'amount' @ [67:42] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'token' @ [67:49] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [67:55] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'reference' @ [67:62] ==> public final val reference: OpaqueBytes defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'bytes' @ [67:72] ==> public open val bytes: ByteArray defined in net.corda.core.utilities.OpaqueBytes[DeserializedPropertyDescriptor]

'IllegalArgumentException' @ [69:31] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'schema' @ [69:78] ==> value-parameter schema: MappedSchema defined in net.corda.finance.contracts.asset.DummyFungibleContract.State.generateMappedObject[ValueParameterDescriptorImpl]

'listOf' @ [74:67] ==> public fun <T> listOf(vararg elements: MappedSchema): List<MappedSchema> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MappedSchema

'SampleCashSchemaV1' @ [74:74] ==> public object SampleCashSchemaV1 : MappedSchema defined in net.corda.finance.schemas in file SampleCashSchemaV1.kt[FakeCallableDescriptorForObject]

'SampleCashSchemaV2' @ [74:94] ==> public object SampleCashSchemaV2 : MappedSchema defined in net.corda.finance.schemas in file SampleCashSchemaV2.kt[FakeCallableDescriptorForObject]

'SampleCashSchemaV3' @ [74:114] ==> public object SampleCashSchemaV3 : MappedSchema defined in net.corda.finance.schemas in file SampleCashSchemaV3.kt[FakeCallableDescriptorForObject]

'TypeOnlyCommandData' @ [81:23] ==> public constructor TypeOnlyCommandData() defined in net.corda.core.contracts.TypeOnlyCommandData[DeserializedClassConstructorDescriptor]

'txState' @ [87:15] ==> value-parameter txState: TransactionState<DummyFungibleContract.State> defined in net.corda.finance.contracts.asset.DummyFungibleContract.deriveState[ValueParameterDescriptorImpl]

'copy' @ [87:23] ==> public final fun copy(data: DummyFungibleContract.State = ..., notary: Party = ..., encumbrance: Int? = ...): TransactionState<DummyFungibleContract.State> defined in net.corda.core.contracts.TransactionState[DeserializedSimpleFunctionDescriptor]

'txState' @ [87:35] ==> value-parameter txState: TransactionState<DummyFungibleContract.State> defined in net.corda.finance.contracts.asset.DummyFungibleContract.deriveState[ValueParameterDescriptorImpl]

'data' @ [87:43] ==> public final val data: DummyFungibleContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'copy' @ [87:48] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): DummyFungibleContract.State defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[SimpleFunctionDescriptorImpl]

'amount' @ [87:62] ==> value-parameter amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.deriveState[ValueParameterDescriptorImpl]

'owner' @ [87:78] ==> value-parameter owner: AbstractParty defined in net.corda.finance.contracts.asset.DummyFungibleContract.deriveState[ValueParameterDescriptorImpl]

'Exit' @ [89:83] ==> public constructor Exit(amount: Amount<Issued<Currency>>) defined in net.corda.finance.contracts.asset.DummyFungibleContract.Commands.Exit[ClassConstructorDescriptorImpl]

'amount' @ [89:88] ==> value-parameter amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.generateExitCommand[ValueParameterDescriptorImpl]

'Move' @ [90:51] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.DummyFungibleContract.Commands.Move[ClassConstructorDescriptorImpl]

'tx' @ [94:22] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[ValueParameterDescriptorImpl]

'groupStates' @ [94:25] ==> public final inline fun <reified T : ContractState, K : Any> groupStates(noinline selector: (DummyFungibleContract.State) -> Issued<Currency>): List<LedgerTransaction.InOutGroup<DummyFungibleContract.State, Issued<Currency>>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State
    <K : Any> -> Issued<Currency>

'it' @ [94:52] ==> value-parameter it: DummyFungibleContract.State defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [94:55] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'token' @ [94:62] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'component1' @ [96:15] ==> public final operator fun component1(): List<DummyFungibleContract.State> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'component2' @ [96:23] ==> public final operator fun component2(): List<DummyFungibleContract.State> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'component3' @ [96:32] ==> public final operator fun component3(): Issued<Currency> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'groups' @ [96:40] ==> val groups: List<LedgerTransaction.InOutGroup<DummyFungibleContract.State, Issued<Currency>>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'key' @ [98:26] ==> val key: Issued<Currency> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'issuer' @ [98:30] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'key' @ [99:28] ==> val key: Issued<Currency> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'product' @ [99:32] ==> public final val product: Currency defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'requireThat' @ [101:13] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [102:17] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'outputs' @ [102:58] ==> val outputs: List<DummyFungibleContract.State> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'none' @ [102:66] ==> public inline fun <T> Iterable<DummyFungibleContract.State>.none(predicate: (DummyFungibleContract.State) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'it' @ [102:73] ==> value-parameter it: DummyFungibleContract.State defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [102:76] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'quantity' @ [102:83] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'tx' @ [105:32] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[ValueParameterDescriptorImpl]

'commands' @ [105:35] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'select' @ [105:44] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signer: PublicKey? = ..., party: AbstractParty? = ...): List<AuthenticatedObject<DummyFungibleContract.Commands.Issue>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Issue

'firstOrNull' @ [105:69] ==> public fun <T> List<AuthenticatedObject<DummyFungibleContract.Commands.Issue>>.firstOrNull(): AuthenticatedObject<DummyFungibleContract.Commands.Issue>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<Issue>

'if (issueCommand != null) {
                verifyIssueCommand(inputs, outputs, tx, issueCommand, currency, issuer)
            } else {
                val inputAmount = inputs.sumCashOrNull() ?: throw IllegalArgumentException("there is at least one input for this group")
                val outputAmount = outputs.sumCashOrZero(Issued(issuer, currency))

                val exitKeys: Set<PublicKey> = inputs.flatMap { it.exitKeys }.toSet()
                val exitCommand = tx.commands.select<Commands.Exit>(parties = null, signers = exitKeys).filter { it.value.amount.token == key }.singleOrNull()
                val amountExitingLedger = exitCommand?.value?.amount ?: Amount(0, Issued(issuer, currency))

                requireThat {
                    "there are no zero sized inputs" using inputs.none { it.amount.quantity == 0L }
                    "for reference ${issuer.reference} at issuer ${issuer.party} the amounts balance: ${inputAmount.quantity} - ${amountExitingLedger.quantity} != ${outputAmount.quantity}" using
                            (inputAmount == outputAmount + amountExitingLedger)
                }

                verifyMoveCommand<Commands.Move>(inputs, tx.commands)
            }' @ [106:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'issueCommand' @ [106:17] ==> val issueCommand: AuthenticatedObject<DummyFungibleContract.Commands.Issue>? defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'verifyIssueCommand' @ [107:17] ==> private final fun verifyIssueCommand(inputs: List<DummyFungibleContract.State>, outputs: List<DummyFungibleContract.State>, tx: LedgerTransaction, issueCommand: AuthenticatedObject<DummyFungibleContract.Commands.Issue>, currency: Currency, issuer: PartyAndReference): Unit defined in net.corda.finance.contracts.asset.DummyFungibleContract[SimpleFunctionDescriptorImpl]

'inputs' @ [107:36] ==> val inputs: List<DummyFungibleContract.State> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'outputs' @ [107:44] ==> val outputs: List<DummyFungibleContract.State> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'tx' @ [107:53] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[ValueParameterDescriptorImpl]

'issueCommand' @ [107:57] ==> val issueCommand: AuthenticatedObject<DummyFungibleContract.Commands.Issue>? defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'currency' @ [107:71] ==> val currency: Currency defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'issuer' @ [107:81] ==> val issuer: PartyAndReference defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'inputs' @ [109:35] ==> val inputs: List<DummyFungibleContract.State> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'sumCashOrNull' @ [109:42] ==> public fun Iterable<ContractState>.sumCashOrNull(): Amount<Issued<Currency>>? defined in net.corda.finance.utils[DeserializedSimpleFunctionDescriptor]

'IllegalArgumentException' @ [109:67] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'outputs' @ [110:36] ==> val outputs: List<DummyFungibleContract.State> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'sumCashOrZero' @ [110:44] ==> public fun Iterable<ContractState>.sumCashOrZero(currency: Issued<Currency>): Amount<Issued<Currency>> defined in net.corda.finance.utils[DeserializedSimpleFunctionDescriptor]

'Issued' @ [110:58] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'issuer' @ [110:65] ==> val issuer: PartyAndReference defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'currency' @ [110:73] ==> val currency: Currency defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'inputs' @ [112:48] ==> val inputs: List<DummyFungibleContract.State> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'flatMap' @ [112:55] ==> public inline fun <T, R> Iterable<DummyFungibleContract.State>.flatMap(transform: (DummyFungibleContract.State) -> Iterable<PublicKey>): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State
    <R> -> PublicKey

'it' @ [112:65] ==> value-parameter it: DummyFungibleContract.State defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify.<anonymous>[ValueParameterDescriptorImpl]

'exitKeys' @ [112:68] ==> public open val exitKeys: Set<PublicKey> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'toSet' @ [112:79] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'tx' @ [113:35] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[ValueParameterDescriptorImpl]

'commands' @ [113:38] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'select' @ [113:47] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signers: Collection<PublicKey>?, parties: Collection<Party>?): List<AuthenticatedObject<DummyFungibleContract.Commands.Exit>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Exit

'exitKeys' @ [113:95] ==> val exitKeys: Set<PublicKey> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'filter' @ [113:105] ==> public inline fun <T> Iterable<AuthenticatedObject<DummyFungibleContract.Commands.Exit>>.filter(predicate: (AuthenticatedObject<DummyFungibleContract.Commands.Exit>) -> Boolean): List<AuthenticatedObject<DummyFungibleContract.Commands.Exit>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<Exit>

'it' @ [113:114] ==> value-parameter it: AuthenticatedObject<DummyFungibleContract.Commands.Exit> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [113:117] ==> public final val value: DummyFungibleContract.Commands.Exit defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'amount' @ [113:123] ==> public final val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.Commands.Exit[PropertyDescriptorImpl]

'token' @ [113:130] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'key' @ [113:139] ==> val key: Issued<Currency> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'singleOrNull' @ [113:145] ==> public fun <T> List<AuthenticatedObject<DummyFungibleContract.Commands.Exit>>.singleOrNull(): AuthenticatedObject<DummyFungibleContract.Commands.Exit>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<Exit>

'exitCommand' @ [114:43] ==> val exitCommand: AuthenticatedObject<DummyFungibleContract.Commands.Exit>? defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'value' @ [114:56] ==> public final val value: DummyFungibleContract.Commands.Exit defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'amount' @ [114:63] ==> public final val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.Commands.Exit[PropertyDescriptorImpl]

'Amount' @ [114:73] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'Issued' @ [114:83] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'issuer' @ [114:90] ==> val issuer: PartyAndReference defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'currency' @ [114:98] ==> val currency: Currency defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'requireThat' @ [116:17] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [117:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'inputs' @ [117:60] ==> val inputs: List<DummyFungibleContract.State> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'none' @ [117:67] ==> public inline fun <T> Iterable<DummyFungibleContract.State>.none(predicate: (DummyFungibleContract.State) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'it' @ [117:74] ==> value-parameter it: DummyFungibleContract.State defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [117:77] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[PropertyDescriptorImpl]

'quantity' @ [117:84] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'using' @ [118:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'issuer' @ [118:38] ==> val issuer: PartyAndReference defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'reference' @ [118:45] ==> public final val reference: OpaqueBytes defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'issuer' @ [118:68] ==> val issuer: PartyAndReference defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'party' @ [118:75] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'inputAmount' @ [118:105] ==> val inputAmount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'quantity' @ [118:117] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'amountExitingLedger' @ [118:131] ==> val amountExitingLedger: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'quantity' @ [118:151] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'outputAmount' @ [118:166] ==> val outputAmount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'quantity' @ [118:179] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'inputAmount' @ [119:30] ==> val inputAmount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'outputAmount' @ [119:45] ==> val outputAmount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'amountExitingLedger' @ [119:60] ==> val amountExitingLedger: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'verifyMoveCommand' @ [122:17] ==> public inline fun <reified T : MoveCommand> verifyMoveCommand(inputs: List<OwnableState>, commands: List<AuthenticatedObject<CommandData>>): MoveCommand defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : MoveCommand> -> Move

'inputs' @ [122:50] ==> val inputs: List<DummyFungibleContract.State> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[LocalVariableDescriptor]

'tx' @ [122:58] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.DummyFungibleContract.verify[ValueParameterDescriptorImpl]

'commands' @ [122:61] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'inputs' @ [144:27] ==> value-parameter inputs: List<DummyFungibleContract.State> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verifyIssueCommand[ValueParameterDescriptorImpl]

'sumCashOrZero' @ [144:34] ==> public fun Iterable<ContractState>.sumCashOrZero(currency: Issued<Currency>): Amount<Issued<Currency>> defined in net.corda.finance.utils[DeserializedSimpleFunctionDescriptor]

'Issued' @ [144:48] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'issuer' @ [144:55] ==> value-parameter issuer: PartyAndReference defined in net.corda.finance.contracts.asset.DummyFungibleContract.verifyIssueCommand[ValueParameterDescriptorImpl]

'currency' @ [144:63] ==> value-parameter currency: Currency defined in net.corda.finance.contracts.asset.DummyFungibleContract.verifyIssueCommand[ValueParameterDescriptorImpl]

'outputs' @ [145:28] ==> value-parameter outputs: List<DummyFungibleContract.State> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verifyIssueCommand[ValueParameterDescriptorImpl]

'sumCash' @ [145:36] ==> public fun Iterable<ContractState>.sumCash(): Amount<Issued<Currency>> defined in net.corda.finance.utils[DeserializedSimpleFunctionDescriptor]

'tx' @ [146:28] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.DummyFungibleContract.verifyIssueCommand[ValueParameterDescriptorImpl]

'commands' @ [146:31] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'select' @ [146:40] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signer: PublicKey? = ..., party: AbstractParty? = ...): List<AuthenticatedObject<DummyFungibleContract.Commands.Issue>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Issue

'requireThat' @ [147:9] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [150:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'issuer' @ [150:67] ==> value-parameter issuer: PartyAndReference defined in net.corda.finance.contracts.asset.DummyFungibleContract.verifyIssueCommand[ValueParameterDescriptorImpl]

'party' @ [150:74] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'owningKey' @ [150:80] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'issueCommand' @ [150:93] ==> value-parameter issueCommand: AuthenticatedObject<DummyFungibleContract.Commands.Issue> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verifyIssueCommand[ValueParameterDescriptorImpl]

'signers' @ [150:106] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'using' @ [151:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'outputAmount' @ [151:64] ==> val outputAmount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verifyIssueCommand[LocalVariableDescriptor]

'inputAmount' @ [151:79] ==> val inputAmount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verifyIssueCommand[LocalVariableDescriptor]

'using' @ [152:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'cashCommands' @ [152:59] ==> val cashCommands: List<AuthenticatedObject<DummyFungibleContract.Commands.Issue>> defined in net.corda.finance.contracts.asset.DummyFungibleContract.verifyIssueCommand[LocalVariableDescriptor]

'count' @ [152:72] ==> @InlineOnly public inline fun <T> Collection<AuthenticatedObject<DummyFungibleContract.Commands.Issue>>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<Issue>

