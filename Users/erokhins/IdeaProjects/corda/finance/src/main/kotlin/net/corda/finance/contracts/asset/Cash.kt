'JvmName' @ [1:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'Cash' @ [37:23] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[ClassConstructorDescriptorImpl]

'AtomicReference' @ [47:24] ==> public constructor AtomicReference<V : (Any..Any?)>() defined in java.util.concurrent.atomic.AtomicReference[JavaClassConstructorDescriptor]
Inferred types:
    <V : (Any..Any?)> -> CashSelection

'instance' @ [50:20] ==> public final val instance: AtomicReference<CashSelection> defined in net.corda.finance.contracts.asset.CashSelection.Companion[PropertyDescriptorImpl]

'get' @ [50:29] ==> public final fun get(): (CashSelection..CashSelection?) defined in java.util.concurrent.atomic.AtomicReference[JavaMethodDescriptor]

'invoke' @ [51:33] ==> public abstract operator fun invoke(): DatabaseMetaData defined in kotlin.Function0[FunctionInvokeDescriptor]

'load' @ [52:56] ==> public open fun <S : (Any..Any?)> load(p0: (Class<(CashSelection..CashSelection?)>..Class<(CashSelection..CashSelection?)>?)): (ServiceLoader<(CashSelection..CashSelection?)>..ServiceLoader<(CashSelection..CashSelection?)>?) defined in java.util.ServiceLoader[JavaMethodDescriptor]
Inferred types:
    <S : (Any..Any?)> -> (net.corda.finance.contracts.asset.CashSelection..net.corda.finance.contracts.asset.CashSelection?)

'CashSelection' @ [52:61] ==> public companion object defined in net.corda.finance.contracts.asset.CashSelection[FakeCallableDescriptorForObject]

'java' @ [52:82] ==> public val <T> KClass<CashSelection>.java: Class<CashSelection> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CashSelection

'toList' @ [52:88] ==> public fun <T> Iterable<(CashSelection..CashSelection?)>.toList(): List<(CashSelection..CashSelection?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.finance.contracts.asset.CashSelection..net.corda.finance.contracts.asset.CashSelection?)

'cashSelectionAlgos' @ [53:41] ==> val cashSelectionAlgos: List<(CashSelection..CashSelection?)> defined in net.corda.finance.contracts.asset.CashSelection.Companion.getInstance.<anonymous>[LocalVariableDescriptor]

'firstOrNull' @ [53:60] ==> public inline fun <T> Iterable<(CashSelection..CashSelection?)>.firstOrNull(predicate: ((CashSelection..CashSelection?)) -> Boolean): CashSelection? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.finance.contracts.asset.CashSelection..net.corda.finance.contracts.asset.CashSelection?)

'it' @ [53:74] ==> value-parameter it: (CashSelection..CashSelection?) defined in net.corda.finance.contracts.asset.CashSelection.Companion.getInstance.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isCompatible' @ [53:77] ==> public abstract fun isCompatible(metadata: DatabaseMetaData): Boolean defined in net.corda.finance.contracts.asset.CashSelection[SimpleFunctionDescriptorImpl]

'_metadata' @ [53:90] ==> val _metadata: DatabaseMetaData defined in net.corda.finance.contracts.asset.CashSelection.Companion.getInstance.<anonymous>[LocalVariableDescriptor]

'cashSelectionAlgo' @ [54:17] ==> val cashSelectionAlgo: CashSelection? defined in net.corda.finance.contracts.asset.CashSelection.Companion.getInstance.<anonymous>[LocalVariableDescriptor]

'let' @ [54:36] ==> @InlineOnly public inline fun <T, R> CashSelection.let(block: (CashSelection) -> CashSelection?): CashSelection? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CashSelection
    <R> -> CashSelection?

'instance' @ [55:21] ==> public final val instance: AtomicReference<CashSelection> defined in net.corda.finance.contracts.asset.CashSelection.Companion[PropertyDescriptorImpl]

'set' @ [55:30] ==> public final fun set(p0: (CashSelection..CashSelection?)): Unit defined in java.util.concurrent.atomic.AtomicReference[JavaMethodDescriptor]

'cashSelectionAlgo' @ [55:34] ==> val cashSelectionAlgo: CashSelection? defined in net.corda.finance.contracts.asset.CashSelection.Companion.getInstance.<anonymous>[LocalVariableDescriptor]

'cashSelectionAlgo' @ [56:21] ==> val cashSelectionAlgo: CashSelection? defined in net.corda.finance.contracts.asset.CashSelection.Companion.getInstance.<anonymous>[LocalVariableDescriptor]

'ClassNotFoundException' @ [57:28] ==> public constructor ClassNotFoundException(p0: (String..String?)) defined in java.lang.ClassNotFoundException[JavaClassConstructorDescriptor]

'+' @ [57:51] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'_metadata' @ [57:138] ==> val _metadata: DatabaseMetaData defined in net.corda.finance.contracts.asset.CashSelection.Companion.getInstance.<anonymous>[LocalVariableDescriptor]

'invoke' @ [59:15] ==> public abstract operator fun invoke(): CashSelection defined in kotlin.Function0[FunctionInvokeDescriptor]

'Suspendable' @ [85:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'emptySet' @ [88:85] ==> public fun <T> emptySet(): Set<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'emptySet' @ [91:76] ==> public fun <T> emptySet(): Set<OpaqueBytes> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OpaqueBytes

'OnLedgerAsset<Currency, Cash.Commands, Cash.State>' @ [107:14] ==> public constructor OnLedgerAsset<T : Any, C : CommandData, S : FungibleAsset<Currency>>() defined in net.corda.finance.contracts.asset.OnLedgerAsset[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> Currency
    <C : CommandData> -> Commands
    <S : FungibleAsset<T>> -> State

'commands' @ [109:15] ==> value-parameter commands: Collection<AuthenticatedObject<CommandData>> defined in net.corda.finance.contracts.asset.Cash.extractCommands[ValueParameterDescriptorImpl]

'select' @ [109:24] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signer: PublicKey? = ..., party: AbstractParty? = ...): List<AuthenticatedObject<Cash.Commands>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Commands

'this' @ [120:19] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[ClassConstructorDescriptorImpl]

'Amount' @ [120:24] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'amount' @ [120:31] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.contracts.asset.Cash.State.<init>[ValueParameterDescriptorImpl]

'quantity' @ [120:38] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'Issued' @ [120:48] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'deposit' @ [120:55] ==> value-parameter deposit: PartyAndReference defined in net.corda.finance.contracts.asset.Cash.State.<init>[ValueParameterDescriptorImpl]

'amount' @ [120:64] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.contracts.asset.Cash.State.<init>[ValueParameterDescriptorImpl]

'token' @ [120:71] ==> public final val token: Currency defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'owner' @ [120:80] ==> value-parameter owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State.<init>[ValueParameterDescriptorImpl]

'setOf' @ [122:33] ==> public fun <T> setOf(vararg elements: PublicKey): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'owner' @ [122:39] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'owningKey' @ [122:45] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'amount' @ [122:56] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'token' @ [122:63] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [122:69] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'party' @ [122:76] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'owningKey' @ [122:82] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'CASH_PROGRAM_ID' @ [123:33] ==> public val CASH_PROGRAM_ID: Cash defined in net.corda.finance.contracts.asset in file Cash.kt[PropertyDescriptorImpl]

'listOf' @ [124:37] ==> public fun <T> listOf(element: AbstractParty): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'owner' @ [124:44] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'copy' @ [127:19] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[SimpleFunctionDescriptorImpl]

'amount' @ [127:33] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'copy' @ [127:40] ==> public final fun copy(quantity: Long = ..., displayTokenSize: BigDecimal = ..., token: Issued<Currency> = ...): Amount<Issued<Currency>> defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'newAmount' @ [127:45] ==> value-parameter newAmount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State.withNewOwnerAndAmount[ValueParameterDescriptorImpl]

'quantity' @ [127:55] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'newOwner' @ [127:74] ==> value-parameter newOwner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State.withNewOwnerAndAmount[ValueParameterDescriptorImpl]

'Emoji' @ [129:38] ==> public object Emoji defined in net.corda.core.internal[FakeCallableDescriptorForObject]

'bagOfCash' @ [129:44] ==> public final val bagOfCash: String defined in net.corda.core.internal.Emoji[DeserializedPropertyDescriptor]

'amount' @ [129:60] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'amount' @ [129:72] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'token' @ [129:79] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [129:85] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'owner' @ [129:103] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'CommandAndState' @ [131:62] ==> public constructor CommandAndState(command: CommandData, ownableState: OwnableState) defined in net.corda.core.contracts.CommandAndState[DeserializedClassConstructorDescriptor]

'Move' @ [131:87] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[ClassConstructorDescriptorImpl]

'copy' @ [131:95] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[SimpleFunctionDescriptorImpl]

'newOwner' @ [131:108] ==> value-parameter newOwner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State.withNewOwner[ValueParameterDescriptorImpl]

'copy' @ [132:45] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[SimpleFunctionDescriptorImpl]

'owner' @ [132:58] ==> value-parameter owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State.ownedBy[ValueParameterDescriptorImpl]

'copy' @ [133:46] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[SimpleFunctionDescriptorImpl]

'Amount' @ [133:60] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'amount' @ [133:67] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'quantity' @ [133:74] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'amount' @ [133:84] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'token' @ [133:91] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'copy' @ [133:97] ==> public final fun copy(issuer: PartyAndReference = ..., product: Currency = ...): Issued<Currency> defined in net.corda.core.contracts.Issued[DeserializedSimpleFunctionDescriptor]

'amount' @ [133:111] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'token' @ [133:118] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [133:124] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'copy' @ [133:131] ==> public final fun copy(party: AbstractParty = ..., reference: OpaqueBytes = ...): PartyAndReference defined in net.corda.core.contracts.PartyAndReference[DeserializedSimpleFunctionDescriptor]

'party' @ [133:144] ==> value-parameter party: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State.issuedBy[ValueParameterDescriptorImpl]

'copy' @ [134:52] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[SimpleFunctionDescriptorImpl]

'Amount' @ [134:66] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'amount' @ [134:73] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'quantity' @ [134:80] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'amount' @ [134:90] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'token' @ [134:97] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'copy' @ [134:103] ==> public final fun copy(issuer: PartyAndReference = ..., product: Currency = ...): Issued<Currency> defined in net.corda.core.contracts.Issued[DeserializedSimpleFunctionDescriptor]

'deposit' @ [134:117] ==> value-parameter deposit: PartyAndReference defined in net.corda.finance.contracts.asset.Cash.State.issuedBy[ValueParameterDescriptorImpl]

'copy' @ [135:67] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[SimpleFunctionDescriptorImpl]

'amount' @ [135:81] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'copy' @ [135:88] ==> public final fun copy(quantity: Long = ..., displayTokenSize: BigDecimal = ..., token: Issued<Currency> = ...): Amount<Issued<Currency>> defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'amount' @ [135:101] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'token' @ [135:108] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'copy' @ [135:114] ==> public final fun copy(issuer: PartyAndReference = ..., product: Currency = ...): Issued<Currency> defined in net.corda.core.contracts.Issued[DeserializedSimpleFunctionDescriptor]

'deposit' @ [135:128] ==> value-parameter deposit: PartyAndReference defined in net.corda.finance.contracts.asset.Cash.State.withDeposit[ValueParameterDescriptorImpl]

'when (schema) {
                is CashSchemaV1 -> CashSchemaV1.PersistentCashState(
                        owner = this.owner,
                        pennies = this.amount.quantity,
                        currency = this.amount.token.product.currencyCode,
                        issuerParty = this.amount.token.issuer.party.owningKey.toBase58String(),
                        issuerRef = this.amount.token.issuer.reference.bytes
                )
            /** Additional schema mappings would be added here (eg. CashSchemaV2, CashSchemaV3, ...) */
                else -> throw IllegalArgumentException("Unrecognised schema $schema")
            }' @ [139:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PersistentState, entry1: PersistentState): PersistentState[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PersistentState

'schema' @ [139:26] ==> value-parameter schema: MappedSchema defined in net.corda.finance.contracts.asset.Cash.State.generateMappedObject[ValueParameterDescriptorImpl]

'PersistentCashState' @ [140:49] ==> public constructor PersistentCashState(owner: AbstractParty, pennies: Long, currency: String, issuerParty: String, issuerRef: ByteArray) defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[ClassConstructorDescriptorImpl]

'this' @ [141:33] ==> <this> defined in net.corda.finance.contracts.asset.Cash.State[LazyClassReceiverParameterDescriptor]

'owner' @ [141:38] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'this' @ [142:35] ==> <this> defined in net.corda.finance.contracts.asset.Cash.State[LazyClassReceiverParameterDescriptor]

'amount' @ [142:40] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'quantity' @ [142:47] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'this' @ [143:36] ==> <this> defined in net.corda.finance.contracts.asset.Cash.State[LazyClassReceiverParameterDescriptor]

'amount' @ [143:41] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'token' @ [143:48] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'product' @ [143:54] ==> public final val product: Currency defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'currencyCode' @ [143:62] ==> public final val Currency.currencyCode: (String..String?)[MyPropertyDescriptor]

'this' @ [144:39] ==> <this> defined in net.corda.finance.contracts.asset.Cash.State[LazyClassReceiverParameterDescriptor]

'amount' @ [144:44] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'token' @ [144:51] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [144:57] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'party' @ [144:64] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'owningKey' @ [144:70] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toBase58String' @ [144:80] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'this' @ [145:37] ==> <this> defined in net.corda.finance.contracts.asset.Cash.State[LazyClassReceiverParameterDescriptor]

'amount' @ [145:42] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'token' @ [145:49] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [145:55] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'reference' @ [145:62] ==> public final val reference: OpaqueBytes defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'bytes' @ [145:72] ==> public open val bytes: ByteArray defined in net.corda.core.utilities.OpaqueBytes[DeserializedPropertyDescriptor]

'IllegalArgumentException' @ [148:31] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'schema' @ [148:78] ==> value-parameter schema: MappedSchema defined in net.corda.finance.contracts.asset.Cash.State.generateMappedObject[ValueParameterDescriptorImpl]

'listOf' @ [153:67] ==> public fun <T> listOf(element: CashSchemaV1): List<CashSchemaV1> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CashSchemaV1

'CashSchemaV1' @ [153:74] ==> @CordaSerializable public object CashSchemaV1 : MappedSchema defined in net.corda.finance.schemas in file CashSchemaV1.kt[FakeCallableDescriptorForObject]

'TypeOnlyCommandData' @ [172:23] ==> public constructor TypeOnlyCommandData() defined in net.corda.core.contracts.TypeOnlyCommandData[DeserializedClassConstructorDescriptor]

'generateIssue' @ [185:15] ==> public final fun generateIssue(tx: TransactionBuilder, amount: Amount<Issued<Currency>>, owner: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash[SimpleFunctionDescriptorImpl]

'tx' @ [185:29] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Cash.generateIssue[ValueParameterDescriptorImpl]

'Amount' @ [185:33] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'pennies' @ [185:40] ==> value-parameter pennies: Long defined in net.corda.finance.contracts.asset.Cash.generateIssue[ValueParameterDescriptorImpl]

'tokenDef' @ [185:49] ==> value-parameter tokenDef: Issued<Currency> defined in net.corda.finance.contracts.asset.Cash.generateIssue[ValueParameterDescriptorImpl]

'owner' @ [185:60] ==> value-parameter owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.generateIssue[ValueParameterDescriptorImpl]

'notary' @ [185:67] ==> value-parameter notary: Party defined in net.corda.finance.contracts.asset.Cash.generateIssue[ValueParameterDescriptorImpl]

'generateIssue' @ [191:15] ==> @JvmStatic public final fun <S : FungibleAsset<Currency>, T : Any> generateIssue(tx: TransactionBuilder, transactionState: TransactionState<Cash.State>, issueCommand: CommandData): Set<PublicKey> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <S : FungibleAsset<T>> -> State
    <T : Any> -> Currency

'tx' @ [191:29] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Cash.generateIssue[ValueParameterDescriptorImpl]

'TransactionState' @ [191:33] ==> @JvmOverloads public constructor TransactionState<out T : ContractState>(data: Cash.State, notary: Party, encumbrance: Int? = ...) defined in net.corda.core.contracts.TransactionState[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> State

'State' @ [191:50] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[ClassConstructorDescriptorImpl]

'amount' @ [191:56] ==> value-parameter amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.generateIssue[ValueParameterDescriptorImpl]

'owner' @ [191:64] ==> value-parameter owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.generateIssue[ValueParameterDescriptorImpl]

'notary' @ [191:72] ==> value-parameter notary: Party defined in net.corda.finance.contracts.asset.Cash.generateIssue[ValueParameterDescriptorImpl]

'Issue' @ [191:90] ==> public constructor Issue() defined in net.corda.finance.contracts.asset.Cash.Commands.Issue[ClassConstructorDescriptorImpl]

'txState' @ [194:15] ==> value-parameter txState: TransactionState<Cash.State> defined in net.corda.finance.contracts.asset.Cash.deriveState[ValueParameterDescriptorImpl]

'copy' @ [194:23] ==> public final fun copy(data: Cash.State = ..., notary: Party = ..., encumbrance: Int? = ...): TransactionState<Cash.State> defined in net.corda.core.contracts.TransactionState[DeserializedSimpleFunctionDescriptor]

'txState' @ [194:35] ==> value-parameter txState: TransactionState<Cash.State> defined in net.corda.finance.contracts.asset.Cash.deriveState[ValueParameterDescriptorImpl]

'data' @ [194:43] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'copy' @ [194:48] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[SimpleFunctionDescriptorImpl]

'amount' @ [194:62] ==> value-parameter amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.deriveState[ValueParameterDescriptorImpl]

'owner' @ [194:78] ==> value-parameter owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.deriveState[ValueParameterDescriptorImpl]

'Exit' @ [196:83] ==> public constructor Exit(amount: Amount<Issued<Currency>>) defined in net.corda.finance.contracts.asset.Cash.Commands.Exit[ClassConstructorDescriptorImpl]

'amount' @ [196:88] ==> value-parameter amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.generateExitCommand[ValueParameterDescriptorImpl]

'Move' @ [197:51] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[ClassConstructorDescriptorImpl]

'tx' @ [202:22] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Cash.verify[ValueParameterDescriptorImpl]

'groupStates' @ [202:25] ==> public final inline fun <reified T : ContractState, K : Any> groupStates(noinline selector: (Cash.State) -> Issued<Currency>): List<LedgerTransaction.InOutGroup<Cash.State, Issued<Currency>>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State
    <K : Any> -> Issued<Currency>

'it' @ [202:57] ==> value-parameter it: Cash.State defined in net.corda.finance.contracts.asset.Cash.verify.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [202:60] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'token' @ [202:67] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'component1' @ [204:15] ==> public final operator fun component1(): List<Cash.State> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'component2' @ [204:23] ==> public final operator fun component2(): List<Cash.State> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'component3' @ [204:32] ==> public final operator fun component3(): Issued<Currency> defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[DeserializedSimpleFunctionDescriptor]

'groups' @ [204:40] ==> val groups: List<LedgerTransaction.InOutGroup<Cash.State, Issued<Currency>>> defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'key' @ [206:26] ==> val key: Issued<Currency> defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'issuer' @ [206:30] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'key' @ [207:28] ==> val key: Issued<Currency> defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'product' @ [207:32] ==> public final val product: Currency defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'requireThat' @ [209:13] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [210:17] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'outputs' @ [210:58] ==> val outputs: List<Cash.State> defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'none' @ [210:66] ==> public inline fun <T> Iterable<Cash.State>.none(predicate: (Cash.State) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'it' @ [210:73] ==> value-parameter it: Cash.State defined in net.corda.finance.contracts.asset.Cash.verify.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [210:76] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'quantity' @ [210:83] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'tx' @ [213:32] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Cash.verify[ValueParameterDescriptorImpl]

'commands' @ [213:35] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'select' @ [213:44] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signer: PublicKey? = ..., party: AbstractParty? = ...): List<AuthenticatedObject<Cash.Commands.Issue>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Issue

'firstOrNull' @ [213:69] ==> public fun <T> List<AuthenticatedObject<Cash.Commands.Issue>>.firstOrNull(): AuthenticatedObject<Cash.Commands.Issue>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<Issue>

'if (issueCommand != null) {
                verifyIssueCommand(inputs, outputs, tx, issueCommand, currency, issuer)
            } else {
                val inputAmount = inputs.sumCashOrNull() ?: throw IllegalArgumentException("there is at least one cash input for this group")
                val outputAmount = outputs.sumCashOrZero(Issued(issuer, currency))

                // If we want to remove cash from the ledger, that must be signed for by the issuer.
                // A mis-signed or duplicated exit command will just be ignored here and result in the exit amount being zero.
                val exitKeys: Set<PublicKey> = inputs.flatMap { it.exitKeys }.toSet()
                val exitCommand = tx.commands.select<Commands.Exit>(parties = null, signers = exitKeys).filter { it.value.amount.token == key }.singleOrNull()
                val amountExitingLedger = exitCommand?.value?.amount ?: Amount(0, Issued(issuer, currency))

                requireThat {
                    "there are no zero sized inputs" using inputs.none { it.amount.quantity == 0L }
                    "for reference ${issuer.reference} at issuer ${issuer.party} the amounts balance: ${inputAmount.quantity} - ${amountExitingLedger.quantity} != ${outputAmount.quantity}" using
                            (inputAmount == outputAmount + amountExitingLedger)
                }

                verifyMoveCommand<Commands.Move>(inputs, tx.commands)
            }' @ [214:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'issueCommand' @ [214:17] ==> val issueCommand: AuthenticatedObject<Cash.Commands.Issue>? defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'verifyIssueCommand' @ [215:17] ==> private final fun verifyIssueCommand(inputs: List<Cash.State>, outputs: List<Cash.State>, tx: LedgerTransaction, issueCommand: AuthenticatedObject<Cash.Commands.Issue>, currency: Currency, issuer: PartyAndReference): Unit defined in net.corda.finance.contracts.asset.Cash[SimpleFunctionDescriptorImpl]

'inputs' @ [215:36] ==> val inputs: List<Cash.State> defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'outputs' @ [215:44] ==> val outputs: List<Cash.State> defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'tx' @ [215:53] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Cash.verify[ValueParameterDescriptorImpl]

'issueCommand' @ [215:57] ==> val issueCommand: AuthenticatedObject<Cash.Commands.Issue>? defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'currency' @ [215:71] ==> val currency: Currency defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'issuer' @ [215:81] ==> val issuer: PartyAndReference defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'inputs' @ [217:35] ==> val inputs: List<Cash.State> defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'sumCashOrNull' @ [217:42] ==> public fun Iterable<ContractState>.sumCashOrNull(): Amount<Issued<Currency>>? defined in net.corda.finance.utils in file StateSummingUtilities.kt[SimpleFunctionDescriptorImpl]

'IllegalArgumentException' @ [217:67] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'outputs' @ [218:36] ==> val outputs: List<Cash.State> defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'sumCashOrZero' @ [218:44] ==> public fun Iterable<ContractState>.sumCashOrZero(currency: Issued<Currency>): Amount<Issued<Currency>> defined in net.corda.finance.utils in file StateSummingUtilities.kt[SimpleFunctionDescriptorImpl]

'Issued' @ [218:58] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'issuer' @ [218:65] ==> val issuer: PartyAndReference defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'currency' @ [218:73] ==> val currency: Currency defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'inputs' @ [222:48] ==> val inputs: List<Cash.State> defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'flatMap' @ [222:55] ==> public inline fun <T, R> Iterable<Cash.State>.flatMap(transform: (Cash.State) -> Iterable<PublicKey>): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State
    <R> -> PublicKey

'it' @ [222:65] ==> value-parameter it: Cash.State defined in net.corda.finance.contracts.asset.Cash.verify.<anonymous>[ValueParameterDescriptorImpl]

'exitKeys' @ [222:68] ==> public open val exitKeys: Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'toSet' @ [222:79] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'tx' @ [223:35] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Cash.verify[ValueParameterDescriptorImpl]

'commands' @ [223:38] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'select' @ [223:47] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signers: Collection<PublicKey>?, parties: Collection<Party>?): List<AuthenticatedObject<Cash.Commands.Exit>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Exit

'exitKeys' @ [223:95] ==> val exitKeys: Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'filter' @ [223:105] ==> public inline fun <T> Iterable<AuthenticatedObject<Cash.Commands.Exit>>.filter(predicate: (AuthenticatedObject<Cash.Commands.Exit>) -> Boolean): List<AuthenticatedObject<Cash.Commands.Exit>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<Exit>

'it' @ [223:114] ==> value-parameter it: AuthenticatedObject<Cash.Commands.Exit> defined in net.corda.finance.contracts.asset.Cash.verify.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [223:117] ==> public final val value: Cash.Commands.Exit defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'amount' @ [223:123] ==> public final val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.Commands.Exit[PropertyDescriptorImpl]

'token' @ [223:130] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'key' @ [223:139] ==> val key: Issued<Currency> defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'singleOrNull' @ [223:145] ==> public fun <T> List<AuthenticatedObject<Cash.Commands.Exit>>.singleOrNull(): AuthenticatedObject<Cash.Commands.Exit>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<Exit>

'exitCommand' @ [224:43] ==> val exitCommand: AuthenticatedObject<Cash.Commands.Exit>? defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'value' @ [224:56] ==> public final val value: Cash.Commands.Exit defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'amount' @ [224:63] ==> public final val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.Commands.Exit[PropertyDescriptorImpl]

'Amount' @ [224:73] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'Issued' @ [224:83] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'issuer' @ [224:90] ==> val issuer: PartyAndReference defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'currency' @ [224:98] ==> val currency: Currency defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'requireThat' @ [226:17] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [227:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'inputs' @ [227:60] ==> val inputs: List<Cash.State> defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'none' @ [227:67] ==> public inline fun <T> Iterable<Cash.State>.none(predicate: (Cash.State) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'it' @ [227:74] ==> value-parameter it: Cash.State defined in net.corda.finance.contracts.asset.Cash.verify.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [227:77] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[PropertyDescriptorImpl]

'quantity' @ [227:84] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'using' @ [228:21] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'issuer' @ [228:38] ==> val issuer: PartyAndReference defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'reference' @ [228:45] ==> public final val reference: OpaqueBytes defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'issuer' @ [228:68] ==> val issuer: PartyAndReference defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'party' @ [228:75] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'inputAmount' @ [228:105] ==> val inputAmount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'quantity' @ [228:117] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'amountExitingLedger' @ [228:131] ==> val amountExitingLedger: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'quantity' @ [228:151] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'outputAmount' @ [228:166] ==> val outputAmount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'quantity' @ [228:179] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'inputAmount' @ [229:30] ==> val inputAmount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'outputAmount' @ [229:45] ==> val outputAmount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'amountExitingLedger' @ [229:60] ==> val amountExitingLedger: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'verifyMoveCommand' @ [232:17] ==> public inline fun <reified T : MoveCommand> verifyMoveCommand(inputs: List<OwnableState>, commands: List<AuthenticatedObject<CommandData>>): MoveCommand defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : MoveCommand> -> Move

'inputs' @ [232:50] ==> val inputs: List<Cash.State> defined in net.corda.finance.contracts.asset.Cash.verify[LocalVariableDescriptor]

'tx' @ [232:58] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Cash.verify[ValueParameterDescriptorImpl]

'commands' @ [232:61] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'inputs' @ [254:27] ==> value-parameter inputs: List<Cash.State> defined in net.corda.finance.contracts.asset.Cash.verifyIssueCommand[ValueParameterDescriptorImpl]

'sumCashOrZero' @ [254:34] ==> public fun Iterable<ContractState>.sumCashOrZero(currency: Issued<Currency>): Amount<Issued<Currency>> defined in net.corda.finance.utils in file StateSummingUtilities.kt[SimpleFunctionDescriptorImpl]

'Issued' @ [254:48] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'issuer' @ [254:55] ==> value-parameter issuer: PartyAndReference defined in net.corda.finance.contracts.asset.Cash.verifyIssueCommand[ValueParameterDescriptorImpl]

'currency' @ [254:63] ==> value-parameter currency: Currency defined in net.corda.finance.contracts.asset.Cash.verifyIssueCommand[ValueParameterDescriptorImpl]

'outputs' @ [255:28] ==> value-parameter outputs: List<Cash.State> defined in net.corda.finance.contracts.asset.Cash.verifyIssueCommand[ValueParameterDescriptorImpl]

'sumCash' @ [255:36] ==> public fun Iterable<ContractState>.sumCash(): Amount<Issued<Currency>> defined in net.corda.finance.utils in file StateSummingUtilities.kt[SimpleFunctionDescriptorImpl]

'tx' @ [256:28] ==> value-parameter tx: LedgerTransaction defined in net.corda.finance.contracts.asset.Cash.verifyIssueCommand[ValueParameterDescriptorImpl]

'commands' @ [256:31] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedPropertyDescriptor]

'select' @ [256:40] ==> public inline fun <reified T : CommandData> Collection<AuthenticatedObject<CommandData>>.select(signer: PublicKey? = ..., party: AbstractParty? = ...): List<AuthenticatedObject<Cash.Commands.Issue>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> Issue

'requireThat' @ [257:9] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [260:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'issuer' @ [260:67] ==> value-parameter issuer: PartyAndReference defined in net.corda.finance.contracts.asset.Cash.verifyIssueCommand[ValueParameterDescriptorImpl]

'party' @ [260:74] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'owningKey' @ [260:80] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'issueCommand' @ [260:93] ==> value-parameter issueCommand: AuthenticatedObject<Cash.Commands.Issue> defined in net.corda.finance.contracts.asset.Cash.verifyIssueCommand[ValueParameterDescriptorImpl]

'signers' @ [260:106] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[DeserializedPropertyDescriptor]

'using' @ [261:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'outputAmount' @ [261:64] ==> val outputAmount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.verifyIssueCommand[LocalVariableDescriptor]

'inputAmount' @ [261:79] ==> val inputAmount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.verifyIssueCommand[LocalVariableDescriptor]

'using' @ [262:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'cashCommands' @ [262:59] ==> val cashCommands: List<AuthenticatedObject<Cash.Commands.Issue>> defined in net.corda.finance.contracts.asset.Cash.verifyIssueCommand[LocalVariableDescriptor]

'count' @ [262:72] ==> @InlineOnly public inline fun <T> Collection<AuthenticatedObject<Cash.Commands.Issue>>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<Issue>

'JvmStatic' @ [285:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'Throws' @ [286:9] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'InsufficientBalanceException' @ [286:17] ==> public constructor InsufficientBalanceException(amountMissing: Amount<*>) defined in net.corda.core.contracts.InsufficientBalanceException[DeserializedClassConstructorDescriptor]

'Suspendable' @ [287:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'emptySet' @ [292:65] ==> public fun <T> emptySet(): Set<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'txState' @ [295:23] ==> value-parameter txState: TransactionState<Cash.State> defined in net.corda.finance.contracts.asset.Cash.Companion.generateSpend.deriveState[ValueParameterDescriptorImpl]

'copy' @ [295:31] ==> public final fun copy(data: Cash.State = ..., notary: Party = ..., encumbrance: Int? = ...): TransactionState<Cash.State> defined in net.corda.core.contracts.TransactionState[DeserializedSimpleFunctionDescriptor]

'txState' @ [295:43] ==> value-parameter txState: TransactionState<Cash.State> defined in net.corda.finance.contracts.asset.Cash.Companion.generateSpend.deriveState[ValueParameterDescriptorImpl]

'data' @ [295:51] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'copy' @ [295:56] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[SimpleFunctionDescriptorImpl]

'amt' @ [295:70] ==> value-parameter amt: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.Companion.generateSpend.deriveState[ValueParameterDescriptorImpl]

'owner' @ [295:83] ==> value-parameter owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.Companion.generateSpend.deriveState[ValueParameterDescriptorImpl]

'CashSelection' @ [298:35] ==> public companion object defined in net.corda.finance.contracts.asset.CashSelection[FakeCallableDescriptorForObject]

'getInstance' @ [298:49] ==> public final fun getInstance(metadata: () -> DatabaseMetaData): CashSelection defined in net.corda.finance.contracts.asset.CashSelection.Companion[SimpleFunctionDescriptorImpl]

'services' @ [298:62] ==> value-parameter services: ServiceHub defined in net.corda.finance.contracts.asset.Cash.Companion.generateSpend[ValueParameterDescriptorImpl]

'jdbcSession' @ [298:71] ==> public abstract fun jdbcSession(): Connection defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'metaData' @ [298:85] ==> public final val Connection.metaData: (DatabaseMetaData..DatabaseMetaData?)[MyPropertyDescriptor]

'unconsumedCashStatesForSpending' @ [298:96] ==> @Suspendable public abstract fun unconsumedCashStatesForSpending(services: ServiceHub, amount: Amount<Currency>, onlyFromIssuerParties: Set<AbstractParty> = ..., notary: Party? = ..., lockId: UUID, withIssuerRefs: Set<OpaqueBytes> = ...): List<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.CashSelection[SimpleFunctionDescriptorImpl]

'services' @ [298:128] ==> value-parameter services: ServiceHub defined in net.corda.finance.contracts.asset.Cash.Companion.generateSpend[ValueParameterDescriptorImpl]

'amount' @ [298:138] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.contracts.asset.Cash.Companion.generateSpend[ValueParameterDescriptorImpl]

'onlyFromParties' @ [298:146] ==> value-parameter onlyFromParties: Set<AbstractParty> = ... defined in net.corda.finance.contracts.asset.Cash.Companion.generateSpend[ValueParameterDescriptorImpl]

'tx' @ [298:163] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Cash.Companion.generateSpend[ValueParameterDescriptorImpl]

'notary' @ [298:166] ==> public final var notary: Party? defined in net.corda.core.transactions.TransactionBuilder[DeserializedPropertyDescriptor]

'tx' @ [298:174] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Cash.Companion.generateSpend[ValueParameterDescriptorImpl]

'lockId' @ [298:177] ==> public final var lockId: UUID defined in net.corda.core.transactions.TransactionBuilder[DeserializedPropertyDescriptor]

'OnLedgerAsset' @ [299:20] ==> public companion object defined in net.corda.finance.contracts.asset.OnLedgerAsset[FakeCallableDescriptorForObject]

'generateSpend' @ [299:34] ==> @Throws @JvmStatic public final fun <S : FungibleAsset<Currency>, T : Any> generateSpend(tx: TransactionBuilder, amount: Amount<Currency>, to: AbstractParty, acceptableStates: List<StateAndRef<Cash.State>>, deriveState: (TransactionState<Cash.State>, Amount<Issued<Currency>>, AbstractParty) -> TransactionState<Cash.State>, generateMoveCommand: () -> CommandData): Pair<TransactionBuilder, List<PublicKey>> defined in net.corda.finance.contracts.asset.OnLedgerAsset.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <S : FungibleAsset<T>> -> State
    <T : Any> -> Currency

'tx' @ [299:48] ==> value-parameter tx: TransactionBuilder defined in net.corda.finance.contracts.asset.Cash.Companion.generateSpend[ValueParameterDescriptorImpl]

'amount' @ [299:52] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.contracts.asset.Cash.Companion.generateSpend[ValueParameterDescriptorImpl]

'to' @ [299:60] ==> value-parameter to: AbstractParty defined in net.corda.finance.contracts.asset.Cash.Companion.generateSpend[ValueParameterDescriptorImpl]

'acceptableCoins' @ [299:64] ==> val acceptableCoins: List<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.Cash.Companion.generateSpend[LocalVariableDescriptor]

'deriveState' @ [300:49] ==> local final fun deriveState(txState: TransactionState<Cash.State>, amt: Amount<Issued<Currency>>, owner: AbstractParty): TransactionState<Cash.State> defined in net.corda.finance.contracts.asset.Cash.Companion.generateSpend[SimpleFunctionDescriptorImpl]

'state' @ [300:61] ==> value-parameter state: TransactionState<Cash.State> defined in net.corda.finance.contracts.asset.Cash.Companion.generateSpend.<anonymous>[ValueParameterDescriptorImpl]

'quantity' @ [300:68] ==> value-parameter quantity: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.Companion.generateSpend.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [300:78] ==> value-parameter owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.Companion.generateSpend.<anonymous>[ValueParameterDescriptorImpl]

'Cash' @ [301:23] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[ClassConstructorDescriptorImpl]

'generateMoveCommand' @ [301:30] ==> public open fun generateMoveCommand(): Cash.Commands.Move defined in net.corda.finance.contracts.asset.Cash[SimpleFunctionDescriptorImpl]

'ownedBy' @ [308:74] ==> public final fun ownedBy(owner: AbstractParty): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[SimpleFunctionDescriptorImpl]

'owner' @ [308:82] ==> value-parameter owner: AbstractParty defined in net.corda.finance.contracts.asset.`owned by`[ValueParameterDescriptorImpl]

'issuedBy' @ [309:75] ==> public final fun issuedBy(party: AbstractParty): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[SimpleFunctionDescriptorImpl]

'party' @ [309:84] ==> value-parameter party: AbstractParty defined in net.corda.finance.contracts.asset.`issued by`[ValueParameterDescriptorImpl]

'issuedBy' @ [310:81] ==> public final fun issuedBy(deposit: PartyAndReference): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[SimpleFunctionDescriptorImpl]

'deposit' @ [310:90] ==> value-parameter deposit: PartyAndReference defined in net.corda.finance.contracts.asset.`issued by`[ValueParameterDescriptorImpl]

'withDeposit' @ [311:96] ==> public final fun withDeposit(deposit: PartyAndReference): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[SimpleFunctionDescriptorImpl]

'deposit' @ [311:108] ==> value-parameter deposit: PartyAndReference defined in net.corda.finance.contracts.asset.`with deposit`[ValueParameterDescriptorImpl]

'getValue' @ [316:30] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'entropyToKeyPair' @ [316:37] ==> public fun entropyToKeyPair(entropy: BigInteger): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'valueOf' @ [316:65] ==> public open fun valueOf(p0: Long): (BigInteger..BigInteger?) defined in java.math.BigInteger[JavaMethodDescriptor]

'getValue' @ [318:26] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'Party' @ [318:33] ==> public constructor Party(name: X500Name, owningKey: PublicKey) defined in net.corda.core.identity.Party[DeserializedClassConstructorDescriptor]

'X500Name' @ [318:39] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'DUMMY_CASH_ISSUER_KEY' @ [318:100] ==> public val DUMMY_CASH_ISSUER_KEY: KeyPair defined in net.corda.finance.contracts.asset in file Cash.kt[PropertyDescriptorImpl]

'public' @ [318:122] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'ref' @ [318:130] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'Cash' @ [320:47] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [320:52] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[ClassConstructorDescriptorImpl]

'Amount' @ [320:58] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'quantity' @ [320:65] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'Issued' @ [320:75] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'DUMMY_CASH_ISSUER' @ [320:82] ==> public val DUMMY_CASH_ISSUER: PartyAndReference defined in net.corda.finance.contracts.asset in file Cash.kt[PropertyDescriptorImpl]

'token' @ [320:101] ==> public final val token: Currency defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'NULL_PARTY' @ [320:110] ==> public val NULL_PARTY: AnonymousParty defined in net.corda.core.crypto.testing[DeserializedPropertyDescriptor]

'Cash' @ [322:56] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [322:61] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[ClassConstructorDescriptorImpl]

'this' @ [322:67] ==> <this> defined in net.corda.finance.contracts.asset.STATE[ReceiverParameterDescriptorImpl]

'NULL_PARTY' @ [322:73] ==> public val NULL_PARTY: AnonymousParty defined in net.corda.core.crypto.testing[DeserializedPropertyDescriptor]

