'OpaqueBytes' @ [32:30] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [32:42] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP' @ [33:33] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [33:43] ==> public open fun ref(bytes: OpaqueBytes): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'defaultRef' @ [33:47] ==> private final val defaultRef: OpaqueBytes defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'`issued by`' @ [34:37] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [34:45] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [34:65] ==> private final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'NonEmptySet' @ [35:39] ==> public companion object defined in net.corda.core.utilities.NonEmptySet[FakeCallableDescriptorForObject]

'of' @ [35:51] ==> @JvmStatic public final fun <T> of(element: SecureHash): NonEmptySet<SecureHash> defined in net.corda.core.utilities.NonEmptySet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'SecureHash' @ [35:54] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'randomSHA256' @ [35:65] ==> @JvmStatic public final fun randomSHA256(): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'NonEmptySet' @ [36:37] ==> public companion object defined in net.corda.core.utilities.NonEmptySet[FakeCallableDescriptorForObject]

'of' @ [36:49] ==> @JvmStatic public final fun <T> of(element: Issued<Currency>): NonEmptySet<Issued<Currency>> defined in net.corda.core.utilities.NonEmptySet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Issued<Currency>

'Issued' @ [36:52] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'defaultIssuer' @ [36:59] ==> private final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'USD' @ [36:74] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'NonEmptySet' @ [37:36] ==> public companion object defined in net.corda.core.utilities.NonEmptySet[FakeCallableDescriptorForObject]

'of' @ [37:48] ==> @JvmStatic public final fun <T> of(element: Issued<Currency>): NonEmptySet<Issued<Currency>> defined in net.corda.core.utilities.NonEmptySet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Issued<Currency>

'Issued' @ [37:51] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'defaultIssuer' @ [37:58] ==> private final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'GBP' @ [37:73] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'TEST_TX_TIME' @ [38:35] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'truncatedTo' @ [38:48] ==> public open fun truncatedTo(p0: (TemporalUnit..TemporalUnit?)): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'DAYS' @ [38:71] ==> enum entry DAYS defined in java.time.temporal.ChronoUnit[FakeCallableDescriptorForObject]

'hours' @ [38:82] ==> public val Int.hours: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'fivePm' @ [39:34] ==> private final val fivePm: Instant defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'hours' @ [39:45] ==> public val Int.hours: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'Terms' @ [40:55] ==> public constructor Terms<P : Any>(acceptableContracts: NonEmptySet<SecureHash>, acceptableIssuedProducts: NonEmptySet<Issued<Currency>>, dueBefore: Instant, timeTolerance: Duration = ...) defined in net.corda.finance.contracts.asset.Obligation.Terms[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'trustedCashContract' @ [40:61] ==> private final val trustedCashContract: NonEmptySet<SecureHash> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'megaIssuedDollars' @ [40:82] ==> private final val megaIssuedDollars: NonEmptySet<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'fivePm' @ [40:101] ==> private final val fivePm: Instant defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'megaCorpDollarSettlement' @ [41:43] ==> private final val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [41:68] ==> public final fun copy(acceptableContracts: NonEmptySet<SecureHash> = ..., acceptableIssuedProducts: NonEmptySet<Issued<Currency>> = ..., dueBefore: Instant = ..., timeTolerance: Duration = ...): Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.Obligation.Terms[DeserializedSimpleFunctionDescriptor]

'megaIssuedPounds' @ [41:100] ==> private final val megaIssuedPounds: NonEmptySet<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'State' @ [42:38] ==> public constructor State<P : Any>(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty, template: Obligation.Terms<Currency>, quantity: Long, beneficiary: AbstractParty) defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'NORMAL' @ [43:35] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'MEGA_CORP' @ [44:23] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpDollarSettlement' @ [45:24] ==> private final val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'DOLLARS' @ [46:29] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [46:37] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'CHARLIE' @ [47:27] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'inState' @ [49:28] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [49:36] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [49:55] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'BOB_PUBKEY' @ [49:70] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'MockServices' @ [50:36] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'MINI_CORP_KEY' @ [50:49] ==> public val MINI_CORP_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'MockServices' @ [51:34] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY_KEY' @ [51:47] ==> public val DUMMY_NOTARY_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'group' @ [55:9] ==> value-parameter group: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.finance.contracts.asset.ObligationTests.cashObligationTestRoots[ValueParameterDescriptorImpl]

'apply' @ [55:15] ==> @InlineOnly public inline fun <T> LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.apply(block: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>

'unverifiedTransaction' @ [56:9] ==> @JvmOverloads public final fun unverifiedTransaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> Unit): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [57:13] ==> public final fun output(label: String, contractState: ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'oneMillionDollars' @ [57:60] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [57:78] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [57:97] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'ALICE' @ [57:102] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [57:109] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'output' @ [58:13] ==> public final fun output(label: String, contractState: ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'oneMillionDollars' @ [58:60] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [58:78] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [58:97] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'BOB' @ [58:102] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ALICE' @ [58:107] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'output' @ [59:13] ==> public final fun output(label: String, contractState: ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'oneMillionDollars' @ [59:63] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [59:81] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [59:100] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'MEGA_CORP' @ [59:105] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [59:116] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'output' @ [60:13] ==> public final fun output(label: String, contractState: ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'`issued by`' @ [60:42] ==> public infix fun Cash.State.`issued by`(deposit: PartyAndReference): Cash.State defined in net.corda.finance.contracts.asset[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [60:50] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'CASH' @ [60:58] ==> public val Amount<Currency>.CASH: Cash.State defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'defaultIssuer' @ [60:75] ==> private final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'ALICE' @ [60:100] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'After' @ [64:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'resetTestSerialization' @ [66:9] ==> public fun resetTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'Test' @ [69:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transaction' @ [71:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [72:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [72:21] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'tweak' @ [74:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [75:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [75:26] ==> private final val outState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [75:35] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [75:56] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [75:64] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'command' @ [76:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'CHARLIE' @ [76:25] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [76:33] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Move' @ [76:66] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Obligation.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [77:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.trivial.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'tweak' @ [79:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [80:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [80:26] ==> private final val outState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'command' @ [81:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'CHARLIE' @ [81:25] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [81:33] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'DummyCommandData' @ [81:46] ==> public object DummyCommandData : TypeOnlyCommandData defined in net.corda.testing[FakeCallableDescriptorForObject]

'this' @ [83:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.trivial.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'tweak' @ [85:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [86:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [86:26] ==> private final val outState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'command' @ [87:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'BOB_PUBKEY' @ [87:25] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Move' @ [87:59] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Obligation.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [88:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.trivial.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'tweak' @ [90:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [91:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [91:26] ==> private final val outState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'output' @ [92:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [92:26] ==> private final val outState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'MINI_CORP' @ [92:47] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'command' @ [93:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'CHARLIE' @ [93:25] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [93:33] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Move' @ [93:66] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Obligation.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [94:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.trivial.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'tweak' @ [97:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [98:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [98:26] ==> private final val outState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'command' @ [99:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'CHARLIE' @ [99:25] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [99:33] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Move' @ [99:66] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Obligation.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [100:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.trivial.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [100:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'Test' @ [105:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transaction' @ [108:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [109:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'DummyState' @ [109:21] ==> public constructor DummyState(magicNumber: Int = ...) defined in net.corda.testing.contracts.DummyState[DeserializedClassConstructorDescriptor]

'output' @ [110:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [110:22] ==> private final val outState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'command' @ [111:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MINI_CORP_PUBKEY' @ [111:21] ==> public val MINI_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Move' @ [111:61] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Obligation.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [113:13] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`issue debt`.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [118:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'output' @ [119:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [119:22] ==> private final val outState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'command' @ [120:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'CHARLIE' @ [120:21] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [120:29] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Issue' @ [120:62] ==> public constructor Issue() defined in net.corda.finance.contracts.asset.Obligation.Commands.Issue[DeserializedClassConstructorDescriptor]

'this' @ [121:13] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`issue debt`.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [123:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'output' @ [124:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'State' @ [125:28] ==> public constructor State<P : Any>(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty, template: Obligation.Terms<Currency>, quantity: Long, beneficiary: AbstractParty) defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'MINI_CORP' @ [126:35] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DOLLARS' @ [127:41] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [127:49] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'CHARLIE' @ [128:39] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpDollarSettlement' @ [129:36] ==> private final val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'command' @ [132:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MINI_CORP_PUBKEY' @ [132:21] ==> public val MINI_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Issue' @ [132:61] ==> public constructor Issue() defined in net.corda.finance.contracts.asset.Obligation.Commands.Issue[DeserializedClassConstructorDescriptor]

'this' @ [133:13] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`issue debt`.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [133:18] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'initialiseTestSerialization' @ [136:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'TransactionBuilder' @ [138:18] ==> public constructor TransactionBuilder(notary: Party? = ..., lockId: UUID = ..., inputs: MutableList<StateRef> = ..., attachments: MutableList<SecureHash> = ..., outputs: MutableList<TransactionState<ContractState>> = ..., commands: MutableList<Command<*>> = ..., window: TimeWindow? = ..., privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'apply' @ [138:52] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'Obligation' @ [139:13] ==> public constructor Obligation<P : Any>() defined in net.corda.finance.contracts.asset.Obligation[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'generateIssue' @ [139:36] ==> public final fun generateIssue(tx: TransactionBuilder, obligor: AbstractParty, issuanceDef: Obligation.Terms<Currency>, pennies: Long, beneficiary: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Obligation[DeserializedSimpleFunctionDescriptor]

'this' @ [139:50] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`issue debt`.<anonymous>[ReceiverParameterDescriptorImpl]

'MINI_CORP' @ [139:56] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpDollarSettlement' @ [139:67] ==> private final val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'DOLLARS' @ [139:97] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [139:105] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'CHARLIE' @ [140:35] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [140:53] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'toWireTransaction' @ [141:11] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [142:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'tx' @ [142:20] ==> val tx: WireTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`issue debt`[LocalVariableDescriptor]

'inputs' @ [142:23] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'isEmpty' @ [142:30] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'State' @ [143:35] ==> public constructor State<P : Any>(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty, template: Obligation.Terms<Currency>, quantity: Long, beneficiary: AbstractParty) defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'MINI_CORP' @ [144:27] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DOLLARS' @ [145:32] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [145:40] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'CHARLIE' @ [146:31] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpDollarSettlement' @ [147:28] ==> private final val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'assertEquals' @ [149:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ContractState, actual: ContractState, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ContractState

'tx' @ [149:22] ==> val tx: WireTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`issue debt`[LocalVariableDescriptor]

'getOutput' @ [149:25] ==> public final fun getOutput(index: Int): ContractState defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'expected' @ [149:39] ==> val expected: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`issue debt`[LocalVariableDescriptor]

'assertTrue' @ [150:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'tx' @ [150:20] ==> val tx: WireTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`issue debt`[LocalVariableDescriptor]

'commands' @ [150:23] ==> public open val commands: List<Command<*>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'value' @ [150:35] ==> public final val value: CommandData defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'assertEquals' @ [151:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: PublicKey, actual: PublicKey, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PublicKey

'MINI_CORP_PUBKEY' @ [151:22] ==> public val MINI_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'tx' @ [151:40] ==> val tx: WireTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`issue debt`[LocalVariableDescriptor]

'commands' @ [151:43] ==> public open val commands: List<Command<*>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'signers' @ [151:55] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'resetTestSerialization' @ [152:9] ==> public fun resetTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'transaction' @ [155:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [156:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [156:21] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'output' @ [157:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [157:22] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [157:30] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'inState' @ [157:46] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'amount' @ [157:54] ==> public open val amount: Amount<Issued<Obligation.Terms<Currency>>> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'quantity' @ [157:61] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'tweak' @ [160:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'command' @ [161:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'CHARLIE' @ [161:25] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [161:33] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Move' @ [161:66] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Obligation.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [162:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`issue debt`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'tweak' @ [166:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'command' @ [167:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [167:25] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Issue' @ [167:65] ==> public constructor Issue() defined in net.corda.finance.contracts.asset.Obligation.Commands.Issue[DeserializedClassConstructorDescriptor]

'this' @ [168:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`issue debt`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [168:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'transaction' @ [173:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [174:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [174:21] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'output' @ [175:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [175:22] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [175:30] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'inState' @ [175:46] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'amount' @ [175:54] ==> public open val amount: Amount<Issued<Obligation.Terms<Currency>>> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'quantity' @ [175:61] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'command' @ [176:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [176:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Issue' @ [176:61] ==> public constructor Issue() defined in net.corda.finance.contracts.asset.Obligation.Commands.Issue[DeserializedClassConstructorDescriptor]

'this' @ [177:13] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`issue debt`.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [181:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [182:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [182:21] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'output' @ [183:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [183:22] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'command' @ [184:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [184:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Issue' @ [184:61] ==> public constructor Issue() defined in net.corda.finance.contracts.asset.Obligation.Commands.Issue[DeserializedClassConstructorDescriptor]

'this' @ [185:13] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`issue debt`.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [189:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [190:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [190:21] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'output' @ [191:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [191:22] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [191:30] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'inState' @ [191:46] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'amount' @ [191:54] ==> public open val amount: Amount<Issued<Obligation.Terms<Currency>>> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'quantity' @ [191:61] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'command' @ [192:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [192:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Issue' @ [192:61] ==> public constructor Issue() defined in net.corda.finance.contracts.asset.Obligation.Commands.Issue[DeserializedClassConstructorDescriptor]

'tweak' @ [193:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'command' @ [194:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [194:25] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Issue' @ [194:65] ==> public constructor Issue() defined in net.corda.finance.contracts.asset.Obligation.Commands.Issue[DeserializedClassConstructorDescriptor]

'this' @ [195:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`issue debt`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'this' @ [197:13] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`issue debt`.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [197:18] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'Test' @ [205:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'IllegalStateException' @ [205:22] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'initialiseTestSerialization' @ [207:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'TransactionBuilder' @ [209:18] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [209:37] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'apply' @ [209:51] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'Obligation' @ [210:13] ==> public constructor Obligation<P : Any>() defined in net.corda.finance.contracts.asset.Obligation[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'generateIssue' @ [210:36] ==> public final fun generateIssue(tx: TransactionBuilder, obligor: AbstractParty, issuanceDef: Obligation.Terms<Currency>, pennies: Long, beneficiary: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Obligation[DeserializedSimpleFunctionDescriptor]

'this' @ [210:50] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`reject issuance with inputs`.<anonymous>[ReceiverParameterDescriptorImpl]

'MINI_CORP' @ [210:56] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpDollarSettlement' @ [210:67] ==> private final val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'DOLLARS' @ [210:97] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [210:105] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'MINI_CORP' @ [211:35] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [211:55] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'toWireTransaction' @ [212:11] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'TransactionBuilder' @ [216:19] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [216:38] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ptx' @ [217:9] ==> val ptx: TransactionBuilder defined in net.corda.finance.contracts.asset.ObligationTests.`reject issuance with inputs`[LocalVariableDescriptor]

'addInputState' @ [217:13] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'tx' @ [217:27] ==> val tx: WireTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`reject issuance with inputs`[LocalVariableDescriptor]

'outRef' @ [217:30] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<Obligation.State<Currency>> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> State<Currency>

'Obligation' @ [218:9] ==> public constructor Obligation<P : Any>() defined in net.corda.finance.contracts.asset.Obligation[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'generateIssue' @ [218:32] ==> public final fun generateIssue(tx: TransactionBuilder, obligor: AbstractParty, issuanceDef: Obligation.Terms<Currency>, pennies: Long, beneficiary: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Obligation[DeserializedSimpleFunctionDescriptor]

'ptx' @ [218:46] ==> val ptx: TransactionBuilder defined in net.corda.finance.contracts.asset.ObligationTests.`reject issuance with inputs`[LocalVariableDescriptor]

'MINI_CORP' @ [218:51] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpDollarSettlement' @ [218:62] ==> private final val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'DOLLARS' @ [218:92] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [218:100] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'MINI_CORP' @ [219:31] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [219:51] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Test' @ [223:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [225:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'getStateAndRef' @ [226:36] ==> private final inline fun <reified T : ContractState> getStateAndRef(state: Obligation.State<Currency>): StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : ContractState> -> State<Currency>

'oneMillionDollars' @ [226:51] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [226:69] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [226:88] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'ALICE' @ [226:93] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [226:100] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'getStateAndRef' @ [227:36] ==> private final inline fun <reified T : ContractState> getStateAndRef(state: Obligation.State<Currency>): StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : ContractState> -> State<Currency>

'oneMillionDollars' @ [227:51] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [227:69] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [227:88] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'BOB' @ [227:93] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ALICE' @ [227:98] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'TransactionBuilder' @ [228:18] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [228:37] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'apply' @ [228:51] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'Obligation' @ [229:13] ==> public constructor Obligation<P : Any>() defined in net.corda.finance.contracts.asset.Obligation[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'generateCloseOutNetting' @ [229:36] ==> public final fun generateCloseOutNetting(tx: TransactionBuilder, signer: AbstractParty, vararg inputs: StateAndRef<Obligation.State<Currency>>): Unit defined in net.corda.finance.contracts.asset.Obligation[DeserializedSimpleFunctionDescriptor]

'this' @ [229:60] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`generate close-out net transaction`.<anonymous>[ReceiverParameterDescriptorImpl]

'ALICE' @ [229:66] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'obligationAliceToBob' @ [229:73] ==> val obligationAliceToBob: StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`generate close-out net transaction`[LocalVariableDescriptor]

'obligationBobToAlice' @ [229:95] ==> val obligationBobToAlice: StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`generate close-out net transaction`[LocalVariableDescriptor]

'toWireTransaction' @ [230:11] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [231:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'tx' @ [231:25] ==> val tx: WireTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate close-out net transaction`[LocalVariableDescriptor]

'outputs' @ [231:28] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'size' @ [231:36] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'Test' @ [235:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [237:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'getStateAndRef' @ [238:36] ==> private final inline fun <reified T : ContractState> getStateAndRef(state: Obligation.State<Currency>): StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : ContractState> -> State<Currency>

'between' @ [238:51] ==> public infix fun <T : Any> Obligation.State<Currency>.between(parties: Pair<AbstractParty, AbstractParty>): Obligation.State<Currency> defined in net.corda.finance.contracts.asset[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency

'`issued by`' @ [238:52] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [238:60] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [238:80] ==> private final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [238:95] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [238:114] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'ALICE' @ [238:119] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [238:126] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'getStateAndRef' @ [239:36] ==> private final inline fun <reified T : ContractState> getStateAndRef(state: Obligation.State<Currency>): StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : ContractState> -> State<Currency>

'oneMillionDollars' @ [239:51] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [239:69] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [239:88] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'BOB' @ [239:93] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ALICE' @ [239:98] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'TransactionBuilder' @ [240:18] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [240:37] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'apply' @ [240:51] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'Obligation' @ [241:13] ==> public constructor Obligation<P : Any>() defined in net.corda.finance.contracts.asset.Obligation[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'generateCloseOutNetting' @ [241:36] ==> public final fun generateCloseOutNetting(tx: TransactionBuilder, signer: AbstractParty, vararg inputs: StateAndRef<Obligation.State<Currency>>): Unit defined in net.corda.finance.contracts.asset.Obligation[DeserializedSimpleFunctionDescriptor]

'this' @ [241:60] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`generate close-out net transaction with remainder`.<anonymous>[ReceiverParameterDescriptorImpl]

'ALICE' @ [241:66] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'obligationAliceToBob' @ [241:73] ==> val obligationAliceToBob: StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`generate close-out net transaction with remainder`[LocalVariableDescriptor]

'obligationBobToAlice' @ [241:95] ==> val obligationBobToAlice: StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`generate close-out net transaction with remainder`[LocalVariableDescriptor]

'toWireTransaction' @ [242:11] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [243:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'tx' @ [243:25] ==> val tx: WireTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate close-out net transaction with remainder`[LocalVariableDescriptor]

'outputs' @ [243:28] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'size' @ [243:36] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'tx' @ [245:22] ==> val tx: WireTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate close-out net transaction with remainder`[LocalVariableDescriptor]

'getOutput' @ [245:25] ==> public final fun getOutput(index: Int): ContractState defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [246:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ContractState, actual: ContractState, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ContractState

'between' @ [246:22] ==> public infix fun <T : Any> Obligation.State<Currency>.between(parties: Pair<AbstractParty, AbstractParty>): Obligation.State<Currency> defined in net.corda.finance.contracts.asset[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency

'`issued by`' @ [246:23] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [246:31] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [246:51] ==> private final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [246:66] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [246:85] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'ALICE' @ [246:90] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [246:97] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'actual' @ [246:103] ==> val actual: ContractState defined in net.corda.finance.contracts.asset.ObligationTests.`generate close-out net transaction with remainder`[LocalVariableDescriptor]

'Test' @ [250:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [252:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'getStateAndRef' @ [253:36] ==> private final inline fun <reified T : ContractState> getStateAndRef(state: Obligation.State<Currency>): StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : ContractState> -> State<Currency>

'oneMillionDollars' @ [253:51] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [253:69] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [253:88] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'ALICE' @ [253:93] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [253:100] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'getStateAndRef' @ [254:36] ==> private final inline fun <reified T : ContractState> getStateAndRef(state: Obligation.State<Currency>): StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : ContractState> -> State<Currency>

'oneMillionDollars' @ [254:51] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [254:69] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [254:88] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'BOB' @ [254:93] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ALICE' @ [254:98] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'TransactionBuilder' @ [255:18] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [255:37] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'apply' @ [255:51] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'Obligation' @ [256:13] ==> public constructor Obligation<P : Any>() defined in net.corda.finance.contracts.asset.Obligation[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'generatePaymentNetting' @ [256:36] ==> public final fun generatePaymentNetting(tx: TransactionBuilder, issued: Issued<Obligation.Terms<Currency>>, notary: Party, vararg inputs: StateAndRef<Obligation.State<Currency>>): Unit defined in net.corda.finance.contracts.asset.Obligation[DeserializedSimpleFunctionDescriptor]

'this' @ [256:59] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`generate payment net transaction`.<anonymous>[ReceiverParameterDescriptorImpl]

'obligationAliceToBob' @ [256:65] ==> val obligationAliceToBob: StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`generate payment net transaction`[LocalVariableDescriptor]

'state' @ [256:86] ==> public final val state: TransactionState<Obligation.State<Currency>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [256:92] ==> public final val data: Obligation.State<Currency> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [256:97] ==> public open val amount: Amount<Issued<Obligation.Terms<Currency>>> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'token' @ [256:104] ==> public final val token: Issued<Obligation.Terms<Currency>> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [256:111] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'obligationAliceToBob' @ [256:125] ==> val obligationAliceToBob: StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`generate payment net transaction`[LocalVariableDescriptor]

'obligationBobToAlice' @ [256:147] ==> val obligationBobToAlice: StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`generate payment net transaction`[LocalVariableDescriptor]

'toWireTransaction' @ [257:11] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [258:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'tx' @ [258:25] ==> val tx: WireTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate payment net transaction`[LocalVariableDescriptor]

'outputs' @ [258:28] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'size' @ [258:36] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'Test' @ [262:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [264:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'getStateAndRef' @ [265:36] ==> private final inline fun <reified T : ContractState> getStateAndRef(state: Obligation.State<Currency>): StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : ContractState> -> State<Currency>

'oneMillionDollars' @ [265:51] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [265:69] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [265:88] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'ALICE' @ [265:93] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [265:100] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'obligationAliceToBob' @ [266:41] ==> val obligationAliceToBob: StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`generate payment net transaction with remainder`[LocalVariableDescriptor]

'state' @ [266:62] ==> public final val state: TransactionState<Obligation.State<Currency>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [266:68] ==> public final val data: Obligation.State<Currency> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'getStateAndRef' @ [267:36] ==> private final inline fun <reified T : ContractState> getStateAndRef(state: Obligation.State<Currency>): StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : ContractState> -> State<Currency>

'between' @ [267:51] ==> public infix fun <T : Any> Obligation.State<Currency>.between(parties: Pair<AbstractParty, AbstractParty>): Obligation.State<Currency> defined in net.corda.finance.contracts.asset[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency

'`issued by`' @ [267:52] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [267:60] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [267:80] ==> private final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [267:95] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [267:114] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'BOB' @ [267:119] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ALICE' @ [267:124] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'obligationBobToAlice' @ [268:41] ==> val obligationBobToAlice: StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`generate payment net transaction with remainder`[LocalVariableDescriptor]

'state' @ [268:62] ==> public final val state: TransactionState<Obligation.State<Currency>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [268:68] ==> public final val data: Obligation.State<Currency> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'TransactionBuilder' @ [269:18] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [269:37] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'apply' @ [269:51] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'Obligation' @ [270:13] ==> public constructor Obligation<P : Any>() defined in net.corda.finance.contracts.asset.Obligation[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'generatePaymentNetting' @ [270:36] ==> public final fun generatePaymentNetting(tx: TransactionBuilder, issued: Issued<Obligation.Terms<Currency>>, notary: Party, vararg inputs: StateAndRef<Obligation.State<Currency>>): Unit defined in net.corda.finance.contracts.asset.Obligation[DeserializedSimpleFunctionDescriptor]

'this' @ [270:59] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`generate payment net transaction with remainder`.<anonymous>[ReceiverParameterDescriptorImpl]

'obligationAliceToBobState' @ [270:65] ==> val obligationAliceToBobState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`generate payment net transaction with remainder`[LocalVariableDescriptor]

'amount' @ [270:91] ==> public open val amount: Amount<Issued<Obligation.Terms<Currency>>> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'token' @ [270:98] ==> public final val token: Issued<Obligation.Terms<Currency>> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [270:105] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'obligationAliceToBob' @ [270:119] ==> val obligationAliceToBob: StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`generate payment net transaction with remainder`[LocalVariableDescriptor]

'obligationBobToAlice' @ [270:141] ==> val obligationBobToAlice: StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`generate payment net transaction with remainder`[LocalVariableDescriptor]

'toWireTransaction' @ [271:11] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [272:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'tx' @ [272:25] ==> val tx: WireTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate payment net transaction with remainder`[LocalVariableDescriptor]

'outputs' @ [272:28] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'size' @ [272:36] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'obligationBobToAliceState' @ [273:24] ==> val obligationBobToAliceState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`generate payment net transaction with remainder`[LocalVariableDescriptor]

'copy' @ [273:50] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'obligationBobToAliceState' @ [273:66] ==> val obligationBobToAliceState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`generate payment net transaction with remainder`[LocalVariableDescriptor]

'quantity' @ [273:92] ==> public final val quantity: Long defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'obligationAliceToBobState' @ [273:103] ==> val obligationAliceToBobState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`generate payment net transaction with remainder`[LocalVariableDescriptor]

'quantity' @ [273:129] ==> public final val quantity: Long defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'tx' @ [274:22] ==> val tx: WireTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate payment net transaction with remainder`[LocalVariableDescriptor]

'getOutput' @ [274:25] ==> public final fun getOutput(index: Int): ContractState defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [275:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ContractState, actual: ContractState, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ContractState

'expected' @ [275:22] ==> val expected: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`generate payment net transaction with remainder`[LocalVariableDescriptor]

'actual' @ [275:32] ==> val actual: ContractState defined in net.corda.finance.contracts.asset.ObligationTests.`generate payment net transaction with remainder`[LocalVariableDescriptor]

'TransactionState' @ [279:23] ==> @JvmOverloads public constructor TransactionState<out T : ContractState>(data: T, notary: Party, encumbrance: Int? = ...) defined in net.corda.core.contracts.TransactionState[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> T

'state' @ [279:40] ==> value-parameter state: T defined in net.corda.finance.contracts.asset.ObligationTests.getStateAndRef[ValueParameterDescriptorImpl]

'DUMMY_NOTARY' @ [279:47] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'StateAndRef' @ [280:16] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<T>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> T

'txState' @ [280:28] ==> val txState: TransactionState<T> defined in net.corda.finance.contracts.asset.ObligationTests.getStateAndRef[LocalVariableDescriptor]

'StateRef' @ [280:37] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'SecureHash' @ [280:46] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'randomSHA256' @ [280:57] ==> @JvmStatic public final fun randomSHA256(): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'Test' @ [285:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [287:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [289:25] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'days' @ [289:42] ==> public val Int.days: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'TransactionBuilder' @ [292:18] ==> public constructor TransactionBuilder(notary: Party? = ..., lockId: UUID = ..., inputs: MutableList<StateRef> = ..., attachments: MutableList<SecureHash> = ..., outputs: MutableList<TransactionState<ContractState>> = ..., commands: MutableList<Command<*>> = ..., window: TimeWindow? = ..., privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'apply' @ [292:43] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'Amount' @ [293:26] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'Issued' @ [293:38] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'defaultIssuer' @ [293:45] ==> private final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'USD' @ [293:60] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'Obligation' @ [294:13] ==> public constructor Obligation<P : Any>() defined in net.corda.finance.contracts.asset.Obligation[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'generateCashIssue' @ [294:36] ==> public final fun generateCashIssue(tx: TransactionBuilder, obligor: AbstractParty, acceptableContract: SecureHash, amount: Amount<Issued<Currency>>, dueBefore: Instant, beneficiary: AbstractParty, notary: Party): Unit defined in net.corda.finance.contracts.asset.Obligation[DeserializedSimpleFunctionDescriptor]

'this' @ [294:54] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`.<anonymous>[ReceiverParameterDescriptorImpl]

'ALICE' @ [294:60] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'cashContractBytes' @ [294:67] ==> private final val cashContractBytes: ByteArray defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'sha256' @ [294:85] ==> public fun ByteArray.sha256(): SecureHash.SHA256 defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'amount' @ [294:95] ==> val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`.<anonymous>[LocalVariableDescriptor]

'dueBefore' @ [294:103] ==> val dueBefore: (Instant..Instant?) defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'MINI_CORP' @ [295:35] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [295:55] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'miniCorpServices' @ [297:19] ==> private final val miniCorpServices: MockServices defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'signInitialTransaction' @ [297:36] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'tx' @ [297:59] ==> var tx: TransactionBuilder defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'stx' @ [298:27] ==> var stx: SignedTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'tx' @ [298:31] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [298:34] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<Obligation.State<Currency>> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> State<Currency>

'tx' @ [301:9] ==> var tx: TransactionBuilder defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'TransactionBuilder' @ [301:14] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [301:33] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'apply' @ [301:47] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'Obligation' @ [302:13] ==> public constructor Obligation<P : Any>() defined in net.corda.finance.contracts.asset.Obligation[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'generateSetLifecycle' @ [302:36] ==> public final fun generateSetLifecycle(tx: TransactionBuilder, statesAndRefs: List<StateAndRef<Obligation.State<Currency>>>, lifecycle: Obligation.Lifecycle, notary: Party): Unit defined in net.corda.finance.contracts.asset.Obligation[DeserializedSimpleFunctionDescriptor]

'this' @ [302:57] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`.<anonymous>[ReceiverParameterDescriptorImpl]

'listOf' @ [302:63] ==> public fun <T> listOf(element: StateAndRef<Obligation.State<Currency>>): List<StateAndRef<Obligation.State<Currency>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State<Currency>>

'stateAndRef' @ [302:70] ==> var stateAndRef: StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'DEFAULTED' @ [302:94] ==> enum entry DEFAULTED defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'DUMMY_NOTARY' @ [302:105] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'miniCorpServices' @ [304:19] ==> private final val miniCorpServices: MockServices defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'signInitialTransaction' @ [304:36] ==> public open fun signInitialTransaction(builder: TransactionBuilder, publicKey: PublicKey): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'tx' @ [304:59] ==> var tx: TransactionBuilder defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'MINI_CORP_PUBKEY' @ [304:63] ==> public val MINI_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'stx' @ [305:9] ==> var stx: SignedTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'notaryServices' @ [305:15] ==> private final val notaryServices: MockServices defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'addSignature' @ [305:30] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'ptx' @ [305:43] ==> var ptx: SignedTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'assertEquals' @ [307:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'stx' @ [307:25] ==> var stx: SignedTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'tx' @ [307:29] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputs' @ [307:32] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'size' @ [307:40] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [308:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ContractState, actual: ContractState, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ContractState

'stateAndRef' @ [308:22] ==> var stateAndRef: StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'state' @ [308:34] ==> public final val state: TransactionState<Obligation.State<Currency>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [308:40] ==> public final val data: Obligation.State<Currency> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'copy' @ [308:45] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'DEFAULTED' @ [308:72] ==> enum entry DEFAULTED defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'stx' @ [308:84] ==> var stx: SignedTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'tx' @ [308:88] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'getOutput' @ [308:91] ==> public final fun getOutput(index: Int): ContractState defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'stx' @ [309:9] ==> var stx: SignedTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'verifyRequiredSignatures' @ [309:13] ==> public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'stateAndRef' @ [312:9] ==> var stateAndRef: StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'stx' @ [312:23] ==> var stx: SignedTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'tx' @ [312:27] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [312:30] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<Obligation.State<Currency>> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> State<Currency>

'tx' @ [313:9] ==> var tx: TransactionBuilder defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'TransactionBuilder' @ [313:14] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [313:33] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'apply' @ [313:47] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'Obligation' @ [314:13] ==> public constructor Obligation<P : Any>() defined in net.corda.finance.contracts.asset.Obligation[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'generateSetLifecycle' @ [314:36] ==> public final fun generateSetLifecycle(tx: TransactionBuilder, statesAndRefs: List<StateAndRef<Obligation.State<Currency>>>, lifecycle: Obligation.Lifecycle, notary: Party): Unit defined in net.corda.finance.contracts.asset.Obligation[DeserializedSimpleFunctionDescriptor]

'this' @ [314:57] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`.<anonymous>[ReceiverParameterDescriptorImpl]

'listOf' @ [314:63] ==> public fun <T> listOf(element: StateAndRef<Obligation.State<Currency>>): List<StateAndRef<Obligation.State<Currency>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State<Currency>>

'stateAndRef' @ [314:70] ==> var stateAndRef: StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'NORMAL' @ [314:94] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'DUMMY_NOTARY' @ [314:102] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ptx' @ [316:9] ==> var ptx: SignedTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'miniCorpServices' @ [316:15] ==> private final val miniCorpServices: MockServices defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'signInitialTransaction' @ [316:32] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'tx' @ [316:55] ==> var tx: TransactionBuilder defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'stx' @ [317:9] ==> var stx: SignedTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'notaryServices' @ [317:15] ==> private final val notaryServices: MockServices defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'addSignature' @ [317:30] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'ptx' @ [317:43] ==> var ptx: SignedTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'assertEquals' @ [318:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'stx' @ [318:25] ==> var stx: SignedTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'tx' @ [318:29] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputs' @ [318:32] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'size' @ [318:40] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [319:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ContractState, actual: ContractState, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ContractState

'stateAndRef' @ [319:22] ==> var stateAndRef: StateAndRef<Obligation.State<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'state' @ [319:34] ==> public final val state: TransactionState<Obligation.State<Currency>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [319:40] ==> public final val data: Obligation.State<Currency> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'copy' @ [319:45] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'NORMAL' @ [319:72] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'stx' @ [319:81] ==> var stx: SignedTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'tx' @ [319:85] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'getOutput' @ [319:88] ==> public final fun getOutput(index: Int): ContractState defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'stx' @ [320:9] ==> var stx: SignedTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate set lifecycle`[LocalVariableDescriptor]

'verifyRequiredSignatures' @ [320:13] ==> public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'Test' @ [324:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [326:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'TransactionBuilder' @ [327:22] ==> public constructor TransactionBuilder(notary: Party? = ..., lockId: UUID = ..., inputs: MutableList<StateRef> = ..., attachments: MutableList<SecureHash> = ..., outputs: MutableList<TransactionState<ContractState>> = ..., commands: MutableList<Command<*>> = ..., window: TimeWindow? = ..., privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'apply' @ [327:47] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'Cash' @ [328:13] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[DeserializedClassConstructorDescriptor]

'generateIssue' @ [328:20] ==> public final fun generateIssue(tx: TransactionBuilder, amount: Amount<Issued<Currency>>, owner: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash[DeserializedSimpleFunctionDescriptor]

'this' @ [328:34] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`generate settlement transaction`.<anonymous>[ReceiverParameterDescriptorImpl]

'`issued by`' @ [328:40] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [328:44] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [328:64] ==> private final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'MINI_CORP' @ [328:79] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [328:90] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'toWireTransaction' @ [329:11] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'TransactionBuilder' @ [332:28] ==> public constructor TransactionBuilder(notary: Party? = ..., lockId: UUID = ..., inputs: MutableList<StateRef> = ..., attachments: MutableList<SecureHash> = ..., outputs: MutableList<TransactionState<ContractState>> = ..., commands: MutableList<Command<*>> = ..., window: TimeWindow? = ..., privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'apply' @ [332:53] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'Obligation' @ [333:13] ==> public constructor Obligation<P : Any>() defined in net.corda.finance.contracts.asset.Obligation[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'generateIssue' @ [333:36] ==> public final fun generateIssue(tx: TransactionBuilder, obligor: AbstractParty, issuanceDef: Obligation.Terms<Currency>, pennies: Long, beneficiary: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Obligation[DeserializedSimpleFunctionDescriptor]

'this' @ [333:50] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`generate settlement transaction`.<anonymous>[ReceiverParameterDescriptorImpl]

'MINI_CORP' @ [333:56] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpDollarSettlement' @ [333:67] ==> private final val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'DOLLARS' @ [333:97] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [333:105] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'MINI_CORP' @ [334:35] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [334:55] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'toWireTransaction' @ [335:11] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'TransactionBuilder' @ [338:24] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [338:43] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'apply' @ [338:57] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'Obligation' @ [339:13] ==> public constructor Obligation<P : Any>() defined in net.corda.finance.contracts.asset.Obligation[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'generateSettle' @ [339:36] ==> public final fun generateSettle(tx: TransactionBuilder, statesAndRefs: Iterable<StateAndRef<Obligation.State<Currency>>>, assetStatesAndRefs: Iterable<StateAndRef<FungibleAsset<Currency>>>, moveCommand: MoveCommand, notary: Party): Unit defined in net.corda.finance.contracts.asset.Obligation[DeserializedSimpleFunctionDescriptor]

'this' @ [339:51] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`generate settlement transaction`.<anonymous>[ReceiverParameterDescriptorImpl]

'listOf' @ [339:57] ==> public fun <T> listOf(element: StateAndRef<Obligation.State<Currency>>): List<StateAndRef<Obligation.State<Currency>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State<Currency>>

'obligationTx' @ [339:64] ==> val obligationTx: WireTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate settlement transaction`[LocalVariableDescriptor]

'outRef' @ [339:77] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<Obligation.State<Currency>> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> State<Currency>

'listOf' @ [339:89] ==> public fun <T> listOf(element: StateAndRef<FungibleAsset<Currency>>): List<StateAndRef<FungibleAsset<Currency>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<FungibleAsset<Currency>>

'cashTx' @ [339:96] ==> val cashTx: WireTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate settlement transaction`[LocalVariableDescriptor]

'outRef' @ [339:103] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<FungibleAsset<Currency>> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> FungibleAsset<Currency>

'Cash' @ [339:115] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [339:129] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [339:137] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'toWireTransaction' @ [340:11] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [341:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'settleTx' @ [341:25] ==> val settleTx: WireTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate settlement transaction`[LocalVariableDescriptor]

'inputs' @ [341:34] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'size' @ [341:41] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [342:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'settleTx' @ [342:25] ==> val settleTx: WireTransaction defined in net.corda.finance.contracts.asset.ObligationTests.`generate settlement transaction`[LocalVariableDescriptor]

'outputs' @ [342:34] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'size' @ [342:42] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'Test' @ [345:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'ledger' @ [348:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'cashObligationTestRoots' @ [349:13] ==> private final fun cashObligationTestRoots(group: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.finance.contracts.asset.ObligationTests[SimpleFunctionDescriptorImpl]

'this' @ [349:37] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`close-out netting`.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [350:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [351:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [352:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'command' @ [354:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [354:25] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Net' @ [354:61] ==> public constructor Net(type: NetType) defined in net.corda.finance.contracts.asset.Obligation.Commands.Net[DeserializedClassConstructorDescriptor]

'CLOSE_OUT' @ [354:73] ==> enum entry CLOSE_OUT defined in net.corda.finance.contracts.NetType[FakeCallableDescriptorForObject]

'timeWindow' @ [355:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [355:28] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [356:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`close-out netting`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [356:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'this' @ [358:13] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`close-out netting`.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [358:18] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'ledger' @ [363:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'cashObligationTestRoots' @ [364:13] ==> private final fun cashObligationTestRoots(group: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.finance.contracts.asset.ObligationTests[SimpleFunctionDescriptorImpl]

'this' @ [364:37] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`close-out netting`.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [365:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [366:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [367:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [368:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [369:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'oneMillionDollars' @ [369:36] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [369:54] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [369:73] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'MEGA_CORP' @ [369:78] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [369:89] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'command' @ [370:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'BOB_PUBKEY' @ [370:25] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'MEGA_CORP_PUBKEY' @ [370:37] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Net' @ [370:77] ==> public constructor Net(type: NetType) defined in net.corda.finance.contracts.asset.Obligation.Commands.Net[DeserializedClassConstructorDescriptor]

'CLOSE_OUT' @ [370:89] ==> enum entry CLOSE_OUT defined in net.corda.finance.contracts.NetType[FakeCallableDescriptorForObject]

'timeWindow' @ [371:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [371:28] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [372:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`close-out netting`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [372:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'this' @ [374:13] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`close-out netting`.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [374:18] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'ledger' @ [378:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'cashObligationTestRoots' @ [379:13] ==> private final fun cashObligationTestRoots(group: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.finance.contracts.asset.ObligationTests[SimpleFunctionDescriptorImpl]

'this' @ [379:37] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`close-out netting`.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [380:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [381:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [382:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [383:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'between' @ [383:36] ==> public infix fun <T : Any> Obligation.State<Currency>.between(parties: Pair<AbstractParty, AbstractParty>): Obligation.State<Currency> defined in net.corda.finance.contracts.asset[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency

'oneMillionDollars' @ [383:37] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'splitEvenly' @ [383:55] ==> public final fun splitEvenly(partitions: Int): List<Amount<Issued<Currency>>> defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'first' @ [383:70] ==> public fun <T> List<Amount<Issued<Currency>>>.first(): Amount<Issued<Currency>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Amount<Issued<Currency>>

'OBLIGATION' @ [383:79] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [383:98] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'ALICE' @ [383:103] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [383:110] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'command' @ [384:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'BOB_PUBKEY' @ [384:25] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Net' @ [384:59] ==> public constructor Net(type: NetType) defined in net.corda.finance.contracts.asset.Obligation.Commands.Net[DeserializedClassConstructorDescriptor]

'CLOSE_OUT' @ [384:71] ==> enum entry CLOSE_OUT defined in net.corda.finance.contracts.NetType[FakeCallableDescriptorForObject]

'timeWindow' @ [385:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [385:28] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [386:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`close-out netting`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'ledger' @ [391:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'cashObligationTestRoots' @ [392:13] ==> private final fun cashObligationTestRoots(group: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.finance.contracts.asset.ObligationTests[SimpleFunctionDescriptorImpl]

'this' @ [392:37] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`close-out netting`.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [393:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [394:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [395:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'command' @ [396:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [396:25] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Net' @ [396:65] ==> public constructor Net(type: NetType) defined in net.corda.finance.contracts.asset.Obligation.Commands.Net[DeserializedClassConstructorDescriptor]

'CLOSE_OUT' @ [396:77] ==> enum entry CLOSE_OUT defined in net.corda.finance.contracts.NetType[FakeCallableDescriptorForObject]

'timeWindow' @ [397:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [397:28] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [398:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`close-out netting`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [403:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'ledger' @ [406:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'cashObligationTestRoots' @ [407:13] ==> private final fun cashObligationTestRoots(group: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.finance.contracts.asset.ObligationTests[SimpleFunctionDescriptorImpl]

'this' @ [407:37] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`payment netting`.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [408:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [409:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [410:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'command' @ [411:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [411:25] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB_PUBKEY' @ [411:39] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Net' @ [411:73] ==> public constructor Net(type: NetType) defined in net.corda.finance.contracts.asset.Obligation.Commands.Net[DeserializedClassConstructorDescriptor]

'PAYMENT' @ [411:85] ==> enum entry PAYMENT defined in net.corda.finance.contracts.NetType[FakeCallableDescriptorForObject]

'timeWindow' @ [412:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [412:28] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [413:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`payment netting`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [413:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'this' @ [415:13] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`payment netting`.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [415:18] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'ledger' @ [420:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'cashObligationTestRoots' @ [421:13] ==> private final fun cashObligationTestRoots(group: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.finance.contracts.asset.ObligationTests[SimpleFunctionDescriptorImpl]

'this' @ [421:37] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`payment netting`.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [422:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [423:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [424:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'command' @ [425:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'BOB_PUBKEY' @ [425:25] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Net' @ [425:59] ==> public constructor Net(type: NetType) defined in net.corda.finance.contracts.asset.Obligation.Commands.Net[DeserializedClassConstructorDescriptor]

'PAYMENT' @ [425:71] ==> enum entry PAYMENT defined in net.corda.finance.contracts.NetType[FakeCallableDescriptorForObject]

'timeWindow' @ [426:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [426:28] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [427:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`payment netting`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'ledger' @ [432:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'cashObligationTestRoots' @ [433:13] ==> private final fun cashObligationTestRoots(group: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.finance.contracts.asset.ObligationTests[SimpleFunctionDescriptorImpl]

'this' @ [433:37] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`payment netting`.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [434:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [435:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [436:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [437:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'oneMillionDollars' @ [437:71] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [437:89] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [437:108] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'MEGA_CORP' @ [437:113] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ALICE' @ [437:124] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'command' @ [438:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [438:25] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB_PUBKEY' @ [438:39] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'MEGA_CORP_PUBKEY' @ [438:51] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Net' @ [438:91] ==> public constructor Net(type: NetType) defined in net.corda.finance.contracts.asset.Obligation.Commands.Net[DeserializedClassConstructorDescriptor]

'PAYMENT' @ [438:103] ==> enum entry PAYMENT defined in net.corda.finance.contracts.NetType[FakeCallableDescriptorForObject]

'timeWindow' @ [439:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [439:28] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [440:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`payment netting`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [440:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'this' @ [442:13] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`payment netting`.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [442:18] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'ledger' @ [446:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'cashObligationTestRoots' @ [447:13] ==> private final fun cashObligationTestRoots(group: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.finance.contracts.asset.ObligationTests[SimpleFunctionDescriptorImpl]

'this' @ [447:37] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`payment netting`.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [448:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [449:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [450:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [451:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'oneMillionDollars' @ [451:71] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [451:89] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [451:108] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'MEGA_CORP' @ [451:113] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ALICE' @ [451:124] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'command' @ [452:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [452:25] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB_PUBKEY' @ [452:39] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Net' @ [452:73] ==> public constructor Net(type: NetType) defined in net.corda.finance.contracts.asset.Obligation.Commands.Net[DeserializedClassConstructorDescriptor]

'PAYMENT' @ [452:85] ==> enum entry PAYMENT defined in net.corda.finance.contracts.NetType[FakeCallableDescriptorForObject]

'timeWindow' @ [453:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [453:28] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [454:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`payment netting`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [459:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'ledger' @ [462:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'cashObligationTestRoots' @ [463:13] ==> private final fun cashObligationTestRoots(group: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.finance.contracts.asset.ObligationTests[SimpleFunctionDescriptorImpl]

'this' @ [463:37] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`cash settlement`.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [464:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [465:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [466:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [467:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'`issued by`' @ [467:46] ==> public infix fun Cash.State.`issued by`(deposit: PartyAndReference): Cash.State defined in net.corda.finance.contracts.asset[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [467:54] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'CASH' @ [467:62] ==> public val Amount<Currency>.CASH: Cash.State defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'defaultIssuer' @ [467:79] ==> private final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'BOB' @ [467:104] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'command' @ [468:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [468:25] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Settle' @ [468:61] ==> public constructor Settle<P : Any>(amount: Amount<Issued<Obligation.Terms<Currency>>>) defined in net.corda.finance.contracts.asset.Obligation.Commands.Settle[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'Amount' @ [468:68] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Obligation.Terms<Currency>>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Terms<Currency>>

'oneMillionDollars' @ [468:75] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'quantity' @ [468:93] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'inState' @ [468:103] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'amount' @ [468:111] ==> public open val amount: Amount<Issued<Obligation.Terms<Currency>>> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'token' @ [468:118] ==> public final val token: Issued<Obligation.Terms<Currency>> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'command' @ [469:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [469:25] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [469:41] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [469:55] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'Obligation' @ [469:60] ==> public constructor Obligation<P : Any>() defined in net.corda.finance.contracts.asset.Obligation[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Any

'java' @ [469:78] ==> public val <T> KClass<Obligation<*>>.java: Class<Obligation<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Obligation<*>

'attachment' @ [470:17] ==> public open fun attachment(attachmentId: SecureHash): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'attachment' @ [470:28] ==> public open fun attachment(attachment: InputStream): SecureHash defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'cashContractBytes' @ [470:39] ==> private final val cashContractBytes: ByteArray defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'inputStream' @ [470:57] ==> @InlineOnly public inline fun ByteArray.inputStream(): ByteArrayInputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'this' @ [471:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`cash settlement`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [471:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'`issued by`' @ [476:35] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [476:42] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [476:62] ==> private final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'ledger' @ [477:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'transaction' @ [478:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [479:17] ==> public final fun input(state: ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'oneMillionDollars' @ [479:23] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [479:41] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [479:60] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'ALICE' @ [479:65] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [479:72] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'input' @ [480:17] ==> public final fun input(state: ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'`issued by`' @ [480:23] ==> public infix fun Cash.State.`issued by`(deposit: PartyAndReference): Cash.State defined in net.corda.finance.contracts.asset[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [480:30] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'CASH' @ [480:38] ==> public val Amount<Currency>.CASH: Cash.State defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'defaultIssuer' @ [480:55] ==> private final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'ALICE' @ [480:80] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'output' @ [481:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'halfAMillionDollars' @ [481:64] ==> val halfAMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`cash settlement`[LocalVariableDescriptor]

'OBLIGATION' @ [481:84] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [481:103] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'ALICE' @ [481:108] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [481:115] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'output' @ [482:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'`issued by`' @ [482:44] ==> public infix fun Cash.State.`issued by`(deposit: PartyAndReference): Cash.State defined in net.corda.finance.contracts.asset[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [482:51] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'CASH' @ [482:59] ==> public val Amount<Currency>.CASH: Cash.State defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'defaultIssuer' @ [482:76] ==> private final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'BOB' @ [482:101] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'command' @ [483:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [483:25] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Settle' @ [483:61] ==> public constructor Settle<P : Any>(amount: Amount<Issued<Obligation.Terms<Currency>>>) defined in net.corda.finance.contracts.asset.Obligation.Commands.Settle[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'Amount' @ [483:68] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Obligation.Terms<Currency>>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Terms<Currency>>

'oneMillionDollars' @ [483:75] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'quantity' @ [483:93] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'inState' @ [483:107] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'amount' @ [483:115] ==> public open val amount: Amount<Issued<Obligation.Terms<Currency>>> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'token' @ [483:122] ==> public final val token: Issued<Obligation.Terms<Currency>> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'command' @ [484:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [484:25] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [484:41] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [484:55] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'Obligation' @ [484:60] ==> public constructor Obligation<P : Any>() defined in net.corda.finance.contracts.asset.Obligation[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Any

'java' @ [484:78] ==> public val <T> KClass<Obligation<*>>.java: Class<Obligation<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Obligation<*>

'attachment' @ [485:17] ==> public open fun attachment(attachmentId: SecureHash): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'attachment' @ [485:28] ==> public open fun attachment(attachment: InputStream): SecureHash defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'cashContractBytes' @ [485:39] ==> private final val cashContractBytes: ByteArray defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'inputStream' @ [485:57] ==> @InlineOnly public inline fun ByteArray.inputStream(): ByteArrayInputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'this' @ [486:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`cash settlement`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [486:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'oneMillionDollars' @ [491:64] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [491:82] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [491:101] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'ALICE' @ [491:106] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [491:113] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'copy' @ [491:119] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'DEFAULTED' @ [491:146] ==> enum entry DEFAULTED defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'ledger' @ [492:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'transaction' @ [493:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [494:17] ==> public final fun input(state: ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'defaultedObligation' @ [494:23] ==> val defaultedObligation: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`cash settlement`[LocalVariableDescriptor]

'input' @ [495:17] ==> public final fun input(state: ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'`issued by`' @ [495:23] ==> public infix fun Cash.State.`issued by`(deposit: PartyAndReference): Cash.State defined in net.corda.finance.contracts.asset[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [495:31] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'CASH' @ [495:39] ==> public val Amount<Currency>.CASH: Cash.State defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'defaultIssuer' @ [495:56] ==> private final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'ALICE' @ [495:81] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'output' @ [496:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'`issued by`' @ [496:46] ==> public infix fun Cash.State.`issued by`(deposit: PartyAndReference): Cash.State defined in net.corda.finance.contracts.asset[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [496:54] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'CASH' @ [496:62] ==> public val Amount<Currency>.CASH: Cash.State defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'defaultIssuer' @ [496:79] ==> private final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'BOB' @ [496:104] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'command' @ [497:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [497:25] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Settle' @ [497:61] ==> public constructor Settle<P : Any>(amount: Amount<Issued<Obligation.Terms<Currency>>>) defined in net.corda.finance.contracts.asset.Obligation.Commands.Settle[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'Amount' @ [497:68] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Obligation.Terms<Currency>>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Terms<Currency>>

'oneMillionDollars' @ [497:75] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'quantity' @ [497:93] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'inState' @ [497:103] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'amount' @ [497:111] ==> public open val amount: Amount<Issued<Obligation.Terms<Currency>>> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'token' @ [497:118] ==> public final val token: Issued<Obligation.Terms<Currency>> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'command' @ [498:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [498:25] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [498:41] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [498:55] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'Obligation' @ [498:60] ==> public constructor Obligation<P : Any>() defined in net.corda.finance.contracts.asset.Obligation[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Any

'java' @ [498:78] ==> public val <T> KClass<Obligation<*>>.java: Class<Obligation<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Obligation<*>

'this' @ [499:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`cash settlement`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'ledger' @ [504:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'cashObligationTestRoots' @ [505:13] ==> private final fun cashObligationTestRoots(group: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.finance.contracts.asset.ObligationTests[SimpleFunctionDescriptorImpl]

'this' @ [505:37] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`cash settlement`.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [506:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [507:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [508:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [509:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'`issued by`' @ [509:46] ==> public infix fun Cash.State.`issued by`(deposit: PartyAndReference): Cash.State defined in net.corda.finance.contracts.asset[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [509:54] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'CASH' @ [509:62] ==> public val Amount<Currency>.CASH: Cash.State defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'defaultIssuer' @ [509:79] ==> private final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'BOB' @ [509:104] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'command' @ [510:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [510:25] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Settle' @ [510:61] ==> public constructor Settle<P : Any>(amount: Amount<Issued<Obligation.Terms<Currency>>>) defined in net.corda.finance.contracts.asset.Obligation.Commands.Settle[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'Amount' @ [510:68] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Obligation.Terms<Currency>>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Terms<Currency>>

'oneMillionDollars' @ [510:75] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'quantity' @ [510:93] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'inState' @ [510:107] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'amount' @ [510:115] ==> public open val amount: Amount<Issued<Obligation.Terms<Currency>>> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'token' @ [510:122] ==> public final val token: Issued<Obligation.Terms<Currency>> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'command' @ [511:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [511:25] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [511:41] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [511:55] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'Obligation' @ [511:60] ==> public constructor Obligation<P : Any>() defined in net.corda.finance.contracts.asset.Obligation[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Any

'java' @ [511:78] ==> public val <T> KClass<Obligation<*>>.java: Class<Obligation<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Obligation<*>

'attachment' @ [512:17] ==> public open fun attachment(attachmentId: SecureHash): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'attachment' @ [512:28] ==> public open fun attachment(attachment: InputStream): SecureHash defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'cashContractBytes' @ [512:39] ==> private final val cashContractBytes: ByteArray defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'inputStream' @ [512:57] ==> @InlineOnly public inline fun ByteArray.inputStream(): ByteArrayInputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'this' @ [513:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`cash settlement`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [518:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'toByteArray' @ [520:102] ==> @InlineOnly public inline fun String.toByteArray(charset: Charset = ...): ByteArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Issued' @ [521:27] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Commodity) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Commodity

'defaultIssuer' @ [521:34] ==> private final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Commodity' @ [521:49] ==> public companion object defined in net.corda.finance.contracts.Commodity[FakeCallableDescriptorForObject]

'getInstance' @ [521:59] ==> public final fun getInstance(commodityCode: String): Commodity? defined in net.corda.finance.contracts.Commodity.Companion[DeserializedSimpleFunctionDescriptor]

'Amount' @ [522:27] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Commodity>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Commodity>

'defaultFcoj' @ [522:37] ==> val defaultFcoj: Issued<Commodity> defined in net.corda.finance.contracts.asset.ObligationTests.`commodity settlement`[LocalVariableDescriptor]

'Terms' @ [523:40] ==> public constructor Terms<P : Any>(acceptableContracts: NonEmptySet<SecureHash>, acceptableIssuedProducts: NonEmptySet<Issued<Commodity>>, dueBefore: Instant, timeTolerance: Duration = ...) defined in net.corda.finance.contracts.asset.Obligation.Terms[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Commodity

'NonEmptySet' @ [523:46] ==> public companion object defined in net.corda.core.utilities.NonEmptySet[FakeCallableDescriptorForObject]

'of' @ [523:58] ==> @JvmStatic public final fun <T> of(element: SecureHash): NonEmptySet<SecureHash> defined in net.corda.core.utilities.NonEmptySet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'commodityContractBytes' @ [523:61] ==> val commodityContractBytes: ByteArray defined in net.corda.finance.contracts.asset.ObligationTests.`commodity settlement`[LocalVariableDescriptor]

'sha256' @ [523:84] ==> public fun ByteArray.sha256(): SecureHash.SHA256 defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'NonEmptySet' @ [523:109] ==> public companion object defined in net.corda.core.utilities.NonEmptySet[FakeCallableDescriptorForObject]

'of' @ [523:121] ==> @JvmStatic public final fun <T> of(element: Issued<Commodity>): NonEmptySet<Issued<Commodity>> defined in net.corda.core.utilities.NonEmptySet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Issued<Commodity>

'defaultFcoj' @ [523:124] ==> val defaultFcoj: Issued<Commodity> defined in net.corda.finance.contracts.asset.ObligationTests.`commodity settlement`[LocalVariableDescriptor]

'TEST_TX_TIME' @ [523:138] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'State' @ [524:48] ==> public constructor State<P : Any>(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty, template: Obligation.Terms<Commodity>, quantity: Long, beneficiary: AbstractParty) defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Commodity

'NORMAL' @ [524:75] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'ALICE' @ [524:83] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'obligationDef' @ [525:17] ==> val obligationDef: Obligation.Terms<Commodity> defined in net.corda.finance.contracts.asset.ObligationTests.`commodity settlement`[LocalVariableDescriptor]

'oneUnitFcoj' @ [525:32] ==> val oneUnitFcoj: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.ObligationTests.`commodity settlement`[LocalVariableDescriptor]

'quantity' @ [525:44] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'NULL_PARTY' @ [525:54] ==> public val NULL_PARTY: AnonymousParty defined in net.corda.core.crypto.testing[DeserializedPropertyDescriptor]

'ledger' @ [527:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'unverifiedTransaction' @ [528:13] ==> @JvmOverloads public final fun unverifiedTransaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> Unit): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [529:17] ==> public final fun output(label: String, contractState: ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'oneUnitFcojObligation' @ [529:60] ==> val oneUnitFcojObligation: Obligation.State<Commodity> defined in net.corda.finance.contracts.asset.ObligationTests.`commodity settlement`[LocalVariableDescriptor]

'Pair' @ [529:90] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'ALICE' @ [529:95] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [529:102] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'output' @ [530:17] ==> public final fun output(label: String, contractState: ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'State' @ [530:60] ==> public constructor State(amount: Amount<Issued<Commodity>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.CommodityContract.State[DeserializedClassConstructorDescriptor]

'oneUnitFcoj' @ [530:66] ==> val oneUnitFcoj: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.ObligationTests.`commodity settlement`[LocalVariableDescriptor]

'ALICE' @ [530:79] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'transaction' @ [532:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [533:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [534:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [535:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'State' @ [535:60] ==> public constructor State(amount: Amount<Issued<Commodity>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.CommodityContract.State[DeserializedClassConstructorDescriptor]

'oneUnitFcoj' @ [535:66] ==> val oneUnitFcoj: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.ObligationTests.`commodity settlement`[LocalVariableDescriptor]

'BOB' @ [535:79] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'command' @ [536:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [536:25] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Settle' @ [536:61] ==> public constructor Settle<P : Any>(amount: Amount<Issued<Obligation.Terms<Commodity>>>) defined in net.corda.finance.contracts.asset.Obligation.Commands.Settle[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Commodity

'Amount' @ [536:68] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Obligation.Terms<Commodity>>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Terms<Commodity>>

'oneUnitFcoj' @ [536:75] ==> val oneUnitFcoj: Amount<Issued<Commodity>> defined in net.corda.finance.contracts.asset.ObligationTests.`commodity settlement`[LocalVariableDescriptor]

'quantity' @ [536:87] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'oneUnitFcojObligation' @ [536:97] ==> val oneUnitFcojObligation: Obligation.State<Commodity> defined in net.corda.finance.contracts.asset.ObligationTests.`commodity settlement`[LocalVariableDescriptor]

'amount' @ [536:119] ==> public open val amount: Amount<Issued<Obligation.Terms<Commodity>>> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'token' @ [536:126] ==> public final val token: Issued<Obligation.Terms<Commodity>> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'command' @ [537:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [537:25] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Move' @ [537:68] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.CommodityContract.Commands.Move[DeserializedClassConstructorDescriptor]

'Obligation' @ [537:73] ==> public constructor Obligation<P : Any>() defined in net.corda.finance.contracts.asset.Obligation[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Any

'java' @ [537:91] ==> public val <T> KClass<Obligation<*>>.java: Class<Obligation<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Obligation<*>

'attachment' @ [538:17] ==> public open fun attachment(attachmentId: SecureHash): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'attachment' @ [538:28] ==> public open fun attachment(attachment: InputStream): SecureHash defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'commodityContractBytes' @ [538:39] ==> val commodityContractBytes: ByteArray defined in net.corda.finance.contracts.asset.ObligationTests.`commodity settlement`[LocalVariableDescriptor]

'inputStream' @ [538:62] ==> @InlineOnly public inline fun ByteArray.inputStream(): ByteArrayInputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'verifies' @ [539:17] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'Test' @ [544:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'ledger' @ [547:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'cashObligationTestRoots' @ [548:13] ==> private final fun cashObligationTestRoots(group: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.finance.contracts.asset.ObligationTests[SimpleFunctionDescriptorImpl]

'this' @ [548:37] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`payment default`.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [549:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [550:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [551:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'oneMillionDollars' @ [551:77] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [551:95] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [551:114] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'ALICE' @ [551:119] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [551:126] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'copy' @ [551:132] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'DEFAULTED' @ [551:159] ==> enum entry DEFAULTED defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'command' @ [552:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'BOB_PUBKEY' @ [552:25] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'SetLifecycle' @ [552:59] ==> public constructor SetLifecycle(lifecycle: Obligation.Lifecycle) defined in net.corda.finance.contracts.asset.Obligation.Commands.SetLifecycle[DeserializedClassConstructorDescriptor]

'DEFAULTED' @ [552:82] ==> enum entry DEFAULTED defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'this' @ [553:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`payment default`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'TEST_TX_TIME' @ [558:28] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'days' @ [558:45] ==> public val Int.days: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'TEST_TX_TIME' @ [559:30] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'days' @ [559:47] ==> public val Int.days: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'transaction' @ [560:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [561:13] ==> public final fun input(state: ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'oneMillionDollars' @ [561:19] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [561:37] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [561:56] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'ALICE' @ [561:61] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [561:68] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'futureTestTime' @ [561:78] ==> val futureTestTime: (Instant..Instant?) defined in net.corda.finance.contracts.asset.ObligationTests.`payment default`[LocalVariableDescriptor]

'output' @ [562:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'oneMillionDollars' @ [562:73] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [562:91] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [562:110] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'ALICE' @ [562:115] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [562:122] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'futureTestTime' @ [562:132] ==> val futureTestTime: (Instant..Instant?) defined in net.corda.finance.contracts.asset.ObligationTests.`payment default`[LocalVariableDescriptor]

'copy' @ [562:148] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'DEFAULTED' @ [562:175] ==> enum entry DEFAULTED defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'command' @ [563:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'BOB_PUBKEY' @ [563:21] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'SetLifecycle' @ [563:55] ==> public constructor SetLifecycle(lifecycle: Obligation.Lifecycle) defined in net.corda.finance.contracts.asset.Obligation.Commands.SetLifecycle[DeserializedClassConstructorDescriptor]

'DEFAULTED' @ [563:78] ==> enum entry DEFAULTED defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'timeWindow' @ [564:13] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [564:24] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [565:13] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`payment default`.<anonymous>[ReceiverParameterDescriptorImpl]

'ledger' @ [569:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'transaction' @ [570:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [571:17] ==> public final fun input(state: ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'oneMillionDollars' @ [571:23] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [571:41] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [571:60] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'ALICE' @ [571:65] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [571:72] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'pastTestTime' @ [571:82] ==> val pastTestTime: (Instant..Instant?) defined in net.corda.finance.contracts.asset.ObligationTests.`payment default`[LocalVariableDescriptor]

'output' @ [572:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'oneMillionDollars' @ [572:77] ==> private final val oneMillionDollars: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'OBLIGATION' @ [572:95] ==> private final val Amount<Issued<Currency>>.OBLIGATION: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Pair' @ [572:114] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'ALICE' @ [572:119] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [572:126] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'pastTestTime' @ [572:136] ==> val pastTestTime: (Instant..Instant?) defined in net.corda.finance.contracts.asset.ObligationTests.`payment default`[LocalVariableDescriptor]

'copy' @ [572:150] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'DEFAULTED' @ [572:177] ==> enum entry DEFAULTED defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'command' @ [573:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'BOB_PUBKEY' @ [573:25] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'SetLifecycle' @ [573:59] ==> public constructor SetLifecycle(lifecycle: Obligation.Lifecycle) defined in net.corda.finance.contracts.asset.Obligation.Commands.SetLifecycle[DeserializedClassConstructorDescriptor]

'DEFAULTED' @ [573:82] ==> enum entry DEFAULTED defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'timeWindow' @ [574:17] ==> @JvmOverloads public final fun timeWindow(time: Instant, tolerance: Duration = ...): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'TEST_TX_TIME' @ [574:28] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [575:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`payment default`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [575:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'this' @ [577:13] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`payment default`.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [577:18] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'Test' @ [581:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transaction' @ [584:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'command' @ [585:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'CHARLIE' @ [585:21] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [585:29] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Move' @ [585:62] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Obligation.Commands.Move[DeserializedClassConstructorDescriptor]

'tweak' @ [586:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [587:17] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [587:25] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'repeat' @ [588:17] ==> @InlineOnly public inline fun repeat(times: Int, action: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'output' @ [588:29] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [588:38] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [588:46] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'inState' @ [588:62] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'quantity' @ [588:70] ==> public final val quantity: Long defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'this' @ [589:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.testMergeSplit.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [589:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'tweak' @ [592:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'repeat' @ [593:17] ==> @InlineOnly public inline fun repeat(times: Int, action: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'input' @ [593:29] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [593:37] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [593:45] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'inState' @ [593:61] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'quantity' @ [593:69] ==> public final val quantity: Long defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'output' @ [594:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [594:26] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [594:34] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'inState' @ [594:50] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'quantity' @ [594:58] ==> public final val quantity: Long defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'output' @ [595:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [595:26] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [595:34] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'inState' @ [595:50] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'quantity' @ [595:58] ==> public final val quantity: Long defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'this' @ [596:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.testMergeSplit.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [596:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'tweak' @ [599:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [600:17] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [600:25] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [600:33] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'inState' @ [600:49] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'quantity' @ [600:57] ==> public final val quantity: Long defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'input' @ [601:17] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [601:25] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [601:33] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'inState' @ [601:49] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'quantity' @ [601:57] ==> public final val quantity: Long defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'output' @ [602:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [602:26] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'this' @ [603:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.testMergeSplit.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [603:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'Test' @ [608:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transaction' @ [610:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'command' @ [611:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'CHARLIE' @ [611:21] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [611:29] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Move' @ [611:62] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Obligation.Commands.Move[DeserializedClassConstructorDescriptor]

'tweak' @ [612:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [613:17] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [613:25] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'input' @ [614:17] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [614:25] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [614:33] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'this' @ [616:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.zeroSizedValues.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'tweak' @ [618:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [619:17] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [619:25] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'output' @ [620:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [620:26] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'output' @ [621:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [621:26] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [621:34] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'this' @ [623:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.zeroSizedValues.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [628:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transaction' @ [631:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [632:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [632:21] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'output' @ [633:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [633:22] ==> private final val outState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'MINI_CORP' @ [633:43] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'command' @ [634:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MINI_CORP_PUBKEY' @ [634:21] ==> public val MINI_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Move' @ [634:61] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Obligation.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [635:13] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.trivialMismatches.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [638:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [639:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [639:21] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'output' @ [640:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [640:22] ==> private final val outState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [640:31] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'megaCorpDollarSettlement' @ [640:65] ==> private final val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'output' @ [641:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [641:22] ==> private final val outState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [641:31] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'megaCorpPoundSettlement' @ [641:65] ==> private final val megaCorpPoundSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'command' @ [642:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MINI_CORP_PUBKEY' @ [642:21] ==> public val MINI_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Move' @ [642:61] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Obligation.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [643:13] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.trivialMismatches.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [645:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [646:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [646:21] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'input' @ [647:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [648:17] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [648:25] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'megaCorpPoundSettlement' @ [650:36] ==> private final val megaCorpPoundSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'AnonymousParty' @ [651:39] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'BOB_PUBKEY' @ [651:54] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'output' @ [654:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [654:22] ==> private final val outState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [654:31] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'command' @ [655:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MINI_CORP_PUBKEY' @ [655:21] ==> public val MINI_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Move' @ [655:61] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Obligation.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [656:13] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.trivialMismatches.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [659:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [660:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [660:21] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'input' @ [661:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [661:21] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'MINI_CORP' @ [661:41] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'output' @ [662:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [662:22] ==> private final val outState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'command' @ [663:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'CHARLIE' @ [663:21] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [663:29] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Move' @ [663:62] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Obligation.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [664:13] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.trivialMismatches.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [668:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transaction' @ [671:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [672:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [672:21] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'output' @ [673:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [673:22] ==> private final val outState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [673:31] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'inState' @ [673:47] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'quantity' @ [673:55] ==> public final val quantity: Long defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'DOLLARS' @ [673:70] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [673:78] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'tweak' @ [675:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'command' @ [676:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'CHARLIE' @ [676:25] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [676:33] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Exit' @ [676:66] ==> public constructor Exit<P : Any>(amount: Amount<Issued<Obligation.Terms<Currency>>>) defined in net.corda.finance.contracts.asset.Obligation.Commands.Exit[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'Amount' @ [676:71] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Obligation.Terms<Currency>>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Terms<Currency>>

'DOLLARS' @ [676:82] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [676:90] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'inState' @ [676:100] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'amount' @ [676:108] ==> public open val amount: Amount<Issued<Obligation.Terms<Currency>>> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'token' @ [676:115] ==> public final val token: Issued<Obligation.Terms<Currency>> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'command' @ [677:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'CHARLIE' @ [677:25] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [677:33] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Move' @ [677:66] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Obligation.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [678:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`exit single product obligation`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'tweak' @ [681:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'command' @ [682:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'CHARLIE' @ [682:25] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [682:33] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Exit' @ [682:66] ==> public constructor Exit<P : Any>(amount: Amount<Issued<Obligation.Terms<Currency>>>) defined in net.corda.finance.contracts.asset.Obligation.Commands.Exit[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'Amount' @ [682:71] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Obligation.Terms<Currency>>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Terms<Currency>>

'DOLLARS' @ [682:82] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [682:90] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'inState' @ [682:100] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'amount' @ [682:108] ==> public open val amount: Amount<Issued<Obligation.Terms<Currency>>> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'token' @ [682:115] ==> public final val token: Issued<Obligation.Terms<Currency>> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'this' @ [683:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`exit single product obligation`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'tweak' @ [685:17] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'command' @ [686:21] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'CHARLIE' @ [686:29] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [686:37] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Move' @ [686:70] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Obligation.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [687:21] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`exit single product obligation`.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [687:26] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'Test' @ [694:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transaction' @ [697:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [698:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [698:21] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [698:29] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'inState' @ [698:45] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'template' @ [698:53] ==> public final val template: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'copy' @ [698:62] ==> public final fun copy(acceptableContracts: NonEmptySet<SecureHash> = ..., acceptableIssuedProducts: NonEmptySet<Issued<Currency>> = ..., dueBefore: Instant = ..., timeTolerance: Duration = ...): Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.Obligation.Terms[DeserializedSimpleFunctionDescriptor]

'megaIssuedPounds' @ [698:94] ==> private final val megaIssuedPounds: NonEmptySet<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'input' @ [699:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [699:21] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [699:29] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'inState' @ [699:45] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'template' @ [699:53] ==> public final val template: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'copy' @ [699:62] ==> public final fun copy(acceptableContracts: NonEmptySet<SecureHash> = ..., acceptableIssuedProducts: NonEmptySet<Issued<Currency>> = ..., dueBefore: Instant = ..., timeTolerance: Duration = ...): Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.Obligation.Terms[DeserializedSimpleFunctionDescriptor]

'megaIssuedDollars' @ [699:94] ==> private final val megaIssuedDollars: NonEmptySet<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'output' @ [701:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [701:22] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [701:30] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'inState' @ [701:46] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'template' @ [701:54] ==> public final val template: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'copy' @ [701:63] ==> public final fun copy(acceptableContracts: NonEmptySet<SecureHash> = ..., acceptableIssuedProducts: NonEmptySet<Issued<Currency>> = ..., dueBefore: Instant = ..., timeTolerance: Duration = ...): Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.Obligation.Terms[DeserializedSimpleFunctionDescriptor]

'megaIssuedPounds' @ [701:95] ==> private final val megaIssuedPounds: NonEmptySet<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'inState' @ [701:125] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'quantity' @ [701:133] ==> public final val quantity: Long defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'POUNDS' @ [701:148] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [701:155] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'output' @ [702:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [702:22] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [702:30] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'inState' @ [702:46] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'template' @ [702:54] ==> public final val template: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'copy' @ [702:63] ==> public final fun copy(acceptableContracts: NonEmptySet<SecureHash> = ..., acceptableIssuedProducts: NonEmptySet<Issued<Currency>> = ..., dueBefore: Instant = ..., timeTolerance: Duration = ...): Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.Obligation.Terms[DeserializedSimpleFunctionDescriptor]

'megaIssuedDollars' @ [702:95] ==> private final val megaIssuedDollars: NonEmptySet<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'inState' @ [702:126] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'quantity' @ [702:134] ==> public final val quantity: Long defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'DOLLARS' @ [702:149] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [702:157] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'command' @ [704:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'CHARLIE' @ [704:21] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [704:29] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Move' @ [704:62] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Obligation.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [706:13] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`exit multiple product obligations`.<anonymous>[ReceiverParameterDescriptorImpl]

'command' @ [708:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'CHARLIE' @ [708:21] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [708:29] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Exit' @ [708:62] ==> public constructor Exit<P : Any>(amount: Amount<Issued<Obligation.Terms<Currency>>>) defined in net.corda.finance.contracts.asset.Obligation.Commands.Exit[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'Amount' @ [708:67] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Obligation.Terms<Currency>>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Terms<Currency>>

'DOLLARS' @ [708:78] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [708:86] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'inState' @ [708:96] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'amount' @ [708:104] ==> public open val amount: Amount<Issued<Obligation.Terms<Currency>>> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'token' @ [708:111] ==> public final val token: Issued<Obligation.Terms<Currency>> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'copy' @ [708:117] ==> public final fun copy(issuer: PartyAndReference = ..., product: Obligation.Terms<Currency> = ...): Issued<Obligation.Terms<Currency>> defined in net.corda.core.contracts.Issued[DeserializedSimpleFunctionDescriptor]

'megaCorpDollarSettlement' @ [708:132] ==> private final val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'this' @ [709:13] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`exit multiple product obligations`.<anonymous>[ReceiverParameterDescriptorImpl]

'command' @ [711:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'CHARLIE' @ [711:21] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [711:29] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Exit' @ [711:62] ==> public constructor Exit<P : Any>(amount: Amount<Issued<Obligation.Terms<Currency>>>) defined in net.corda.finance.contracts.asset.Obligation.Commands.Exit[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'Amount' @ [711:67] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Obligation.Terms<Currency>>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Terms<Currency>>

'POUNDS' @ [711:78] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [711:85] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'inState' @ [711:95] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'amount' @ [711:103] ==> public open val amount: Amount<Issued<Obligation.Terms<Currency>>> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'token' @ [711:110] ==> public final val token: Issued<Obligation.Terms<Currency>> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'copy' @ [711:116] ==> public final fun copy(issuer: PartyAndReference = ..., product: Obligation.Terms<Currency> = ...): Issued<Obligation.Terms<Currency>> defined in net.corda.core.contracts.Issued[DeserializedSimpleFunctionDescriptor]

'megaCorpPoundSettlement' @ [711:131] ==> private final val megaCorpPoundSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'this' @ [712:13] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.`exit multiple product obligations`.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [712:18] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'Test' @ [716:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transaction' @ [718:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [720:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [720:21] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'input' @ [721:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [721:21] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'MINI_CORP' @ [721:41] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'tweak' @ [724:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [725:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [725:26] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [725:34] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [725:53] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'BOB_PUBKEY' @ [725:68] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'command' @ [726:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'CHARLIE' @ [726:25] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [726:33] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Move' @ [726:66] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Obligation.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [727:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.multiIssuer.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'tweak' @ [730:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [731:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [731:26] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [731:34] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [731:53] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'BOB_PUBKEY' @ [731:68] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'output' @ [732:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [732:26] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [732:34] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [732:53] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'BOB_PUBKEY' @ [732:68] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'command' @ [733:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'CHARLIE' @ [733:25] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [733:33] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Move' @ [733:66] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Obligation.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [734:17] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.multiIssuer.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'output' @ [738:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [738:22] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [738:30] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [738:49] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'BOB_PUBKEY' @ [738:64] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'output' @ [739:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [739:22] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [739:30] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [739:49] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'BOB_PUBKEY' @ [739:64] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'MINI_CORP' @ [739:89] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'command' @ [740:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'CHARLIE' @ [740:21] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [740:29] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Move' @ [740:62] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Obligation.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [741:13] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.multiIssuer.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [741:18] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'Test' @ [745:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transaction' @ [748:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'State' @ [749:37] ==> public constructor State<P : Any>(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty, template: Obligation.Terms<Currency>, quantity: Long, beneficiary: AbstractParty) defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'NORMAL' @ [749:53] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'MINI_CORP' @ [749:61] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpPoundSettlement' @ [749:72] ==> private final val megaCorpPoundSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'POUNDS' @ [749:101] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [749:108] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'AnonymousParty' @ [749:118] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'BOB_PUBKEY' @ [749:133] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'input' @ [750:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [750:21] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'CHARLIE' @ [750:40] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'input' @ [751:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'pounds' @ [751:21] ==> val pounds: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.multiCurrency.<anonymous>[LocalVariableDescriptor]

'output' @ [752:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [752:22] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'AnonymousParty' @ [752:41] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'BOB_PUBKEY' @ [752:56] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'output' @ [753:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'pounds' @ [753:22] ==> val pounds: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.multiCurrency.<anonymous>[LocalVariableDescriptor]

'CHARLIE' @ [753:40] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'command' @ [754:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'CHARLIE' @ [754:21] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'owningKey' @ [754:29] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'BOB_PUBKEY' @ [754:40] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Move' @ [754:74] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Obligation.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [756:13] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.multiCurrency.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [756:18] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'Test' @ [760:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'State' @ [762:53] ==> public constructor State<P : Any>(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty, template: Obligation.Terms<Currency>, quantity: Long, beneficiary: AbstractParty) defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'NORMAL' @ [762:69] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'MEGA_CORP' @ [762:77] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpDollarSettlement' @ [762:88] ==> private final val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'DOLLARS' @ [763:22] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [763:30] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [763:40] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'State' @ [764:52] ==> public constructor State<P : Any>(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty, template: Obligation.Terms<Currency>, quantity: Long, beneficiary: AbstractParty) defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'NORMAL' @ [764:68] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'MEGA_CORP' @ [764:76] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpDollarSettlement' @ [764:87] ==> private final val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'DOLLARS' @ [765:22] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [765:30] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'MINI_CORP' @ [765:40] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'State' @ [766:52] ==> public constructor State<P : Any>(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty, template: Obligation.Terms<Currency>, quantity: Long, beneficiary: AbstractParty) defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'NORMAL' @ [766:68] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'MINI_CORP' @ [766:76] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpDollarSettlement' @ [766:87] ==> private final val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'DOLLARS' @ [767:22] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [767:30] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [767:40] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'assertEquals' @ [770:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BilateralNetState<Currency>, actual: BilateralNetState<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BilateralNetState<Currency>

'fiveKDollarsFromMegaToMega' @ [770:22] ==> val fiveKDollarsFromMegaToMega: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`nettability of settlement contracts`[LocalVariableDescriptor]

'bilateralNetState' @ [770:49] ==> public open val bilateralNetState: BilateralNetState<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'fiveKDollarsFromMegaToMega' @ [770:68] ==> val fiveKDollarsFromMegaToMega: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`nettability of settlement contracts`[LocalVariableDescriptor]

'bilateralNetState' @ [770:95] ==> public open val bilateralNetState: BilateralNetState<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'assertEquals' @ [771:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BilateralNetState<Currency>, actual: BilateralNetState<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BilateralNetState<Currency>

'oneKDollarsFromMiniToMega' @ [771:22] ==> val oneKDollarsFromMiniToMega: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`nettability of settlement contracts`[LocalVariableDescriptor]

'bilateralNetState' @ [771:48] ==> public open val bilateralNetState: BilateralNetState<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'oneKDollarsFromMiniToMega' @ [771:67] ==> val oneKDollarsFromMiniToMega: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`nettability of settlement contracts`[LocalVariableDescriptor]

'bilateralNetState' @ [771:93] ==> public open val bilateralNetState: BilateralNetState<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'assertEquals' @ [774:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: BilateralNetState<Currency>, actual: BilateralNetState<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BilateralNetState<Currency>

'twoKDollarsFromMegaToMini' @ [774:22] ==> val twoKDollarsFromMegaToMini: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`nettability of settlement contracts`[LocalVariableDescriptor]

'bilateralNetState' @ [774:48] ==> public open val bilateralNetState: BilateralNetState<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'oneKDollarsFromMiniToMega' @ [774:67] ==> val oneKDollarsFromMiniToMega: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`nettability of settlement contracts`[LocalVariableDescriptor]

'bilateralNetState' @ [774:93] ==> public open val bilateralNetState: BilateralNetState<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'assertNotEquals' @ [777:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: BilateralNetState<Currency>, actual: BilateralNetState<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BilateralNetState<Currency>

'fiveKDollarsFromMegaToMega' @ [777:25] ==> val fiveKDollarsFromMegaToMega: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`nettability of settlement contracts`[LocalVariableDescriptor]

'bilateralNetState' @ [777:52] ==> public open val bilateralNetState: BilateralNetState<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'twoKDollarsFromMegaToMini' @ [777:71] ==> val twoKDollarsFromMegaToMini: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`nettability of settlement contracts`[LocalVariableDescriptor]

'bilateralNetState' @ [777:97] ==> public open val bilateralNetState: BilateralNetState<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'assertNotEquals' @ [778:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: BilateralNetState<Currency>, actual: BilateralNetState<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BilateralNetState<Currency>

'fiveKDollarsFromMegaToMega' @ [778:25] ==> val fiveKDollarsFromMegaToMega: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`nettability of settlement contracts`[LocalVariableDescriptor]

'bilateralNetState' @ [778:52] ==> public open val bilateralNetState: BilateralNetState<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'oneKDollarsFromMiniToMega' @ [778:71] ==> val oneKDollarsFromMiniToMega: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`nettability of settlement contracts`[LocalVariableDescriptor]

'bilateralNetState' @ [778:97] ==> public open val bilateralNetState: BilateralNetState<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'assertNotEquals' @ [781:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: BilateralNetState<Currency>, actual: BilateralNetState<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BilateralNetState<Currency>

'oneKDollarsFromMiniToMega' @ [781:25] ==> val oneKDollarsFromMiniToMega: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`nettability of settlement contracts`[LocalVariableDescriptor]

'bilateralNetState' @ [781:51] ==> public open val bilateralNetState: BilateralNetState<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'oneKDollarsFromMiniToMega' @ [781:70] ==> val oneKDollarsFromMiniToMega: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`nettability of settlement contracts`[LocalVariableDescriptor]

'copy' @ [781:96] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'megaCorpPoundSettlement' @ [781:112] ==> private final val megaCorpPoundSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'bilateralNetState' @ [781:137] ==> public open val bilateralNetState: BilateralNetState<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'assertNotEquals' @ [784:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: BilateralNetState<Currency>, actual: BilateralNetState<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BilateralNetState<Currency>

'fiveKDollarsFromMegaToMega' @ [784:25] ==> val fiveKDollarsFromMegaToMega: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`nettability of settlement contracts`[LocalVariableDescriptor]

'bilateralNetState' @ [784:52] ==> public open val bilateralNetState: BilateralNetState<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'fiveKDollarsFromMegaToMega' @ [785:17] ==> val fiveKDollarsFromMegaToMega: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`nettability of settlement contracts`[LocalVariableDescriptor]

'copy' @ [785:44] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'megaCorpDollarSettlement' @ [785:60] ==> private final val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [785:85] ==> public final fun copy(acceptableContracts: NonEmptySet<SecureHash> = ..., acceptableIssuedProducts: NonEmptySet<Issued<Currency>> = ..., dueBefore: Instant = ..., timeTolerance: Duration = ...): Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.Obligation.Terms[DeserializedSimpleFunctionDescriptor]

'sixPm' @ [785:102] ==> private final val sixPm: Instant defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'bilateralNetState' @ [785:110] ==> public open val bilateralNetState: BilateralNetState<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'assertNotEquals' @ [788:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: BilateralNetState<Currency>, actual: BilateralNetState<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BilateralNetState<Currency>

'fiveKDollarsFromMegaToMega' @ [788:25] ==> val fiveKDollarsFromMegaToMega: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`nettability of settlement contracts`[LocalVariableDescriptor]

'bilateralNetState' @ [788:52] ==> public open val bilateralNetState: BilateralNetState<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'fiveKDollarsFromMegaToMega' @ [789:17] ==> val fiveKDollarsFromMegaToMega: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`nettability of settlement contracts`[LocalVariableDescriptor]

'copy' @ [789:44] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'megaCorpDollarSettlement' @ [789:60] ==> private final val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [789:85] ==> public final fun copy(acceptableContracts: NonEmptySet<SecureHash> = ..., acceptableIssuedProducts: NonEmptySet<Issued<Currency>> = ..., dueBefore: Instant = ..., timeTolerance: Duration = ...): Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.Obligation.Terms[DeserializedSimpleFunctionDescriptor]

'NonEmptySet' @ [789:112] ==> public companion object defined in net.corda.core.utilities.NonEmptySet[FakeCallableDescriptorForObject]

'of' @ [789:124] ==> @JvmStatic public final fun <T> of(element: SecureHash): NonEmptySet<SecureHash> defined in net.corda.core.utilities.NonEmptySet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'SecureHash' @ [789:127] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'randomSHA256' @ [789:138] ==> @JvmStatic public final fun randomSHA256(): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'bilateralNetState' @ [789:156] ==> public open val bilateralNetState: BilateralNetState<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'NonEmptySet' @ [792:30] ==> public companion object defined in net.corda.core.utilities.NonEmptySet[FakeCallableDescriptorForObject]

'of' @ [792:42] ==> @JvmStatic public final fun <T> of(element: Issued<Currency>): NonEmptySet<Issued<Currency>> defined in net.corda.core.utilities.NonEmptySet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Issued<Currency>

'Issued' @ [792:45] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'MINI_CORP' @ [792:52] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [792:62] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'USD' @ [792:70] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'assertNotEquals' @ [793:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: BilateralNetState<Currency>, actual: BilateralNetState<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> BilateralNetState<Currency>

'fiveKDollarsFromMegaToMega' @ [793:25] ==> val fiveKDollarsFromMegaToMega: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`nettability of settlement contracts`[LocalVariableDescriptor]

'bilateralNetState' @ [793:52] ==> public open val bilateralNetState: BilateralNetState<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'fiveKDollarsFromMegaToMega' @ [794:17] ==> val fiveKDollarsFromMegaToMega: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`nettability of settlement contracts`[LocalVariableDescriptor]

'copy' @ [794:44] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'megaCorpDollarSettlement' @ [794:60] ==> private final val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [794:85] ==> public final fun copy(acceptableContracts: NonEmptySet<SecureHash> = ..., acceptableIssuedProducts: NonEmptySet<Issued<Currency>> = ..., dueBefore: Instant = ..., timeTolerance: Duration = ...): Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.Obligation.Terms[DeserializedSimpleFunctionDescriptor]

'miniCorpIssuer' @ [794:117] ==> val miniCorpIssuer: NonEmptySet<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`nettability of settlement contracts`[LocalVariableDescriptor]

'bilateralNetState' @ [794:134] ==> public open val bilateralNetState: BilateralNetState<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'Test' @ [797:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'IllegalStateException' @ [797:22] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'inState' @ [799:9] ==> private final val inState: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'copy' @ [799:17] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'DEFAULTED' @ [799:44] ==> enum entry DEFAULTED defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'bilateralNetState' @ [799:55] ==> public open val bilateralNetState: BilateralNetState<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'Test' @ [805:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'State' @ [807:53] ==> public constructor State<P : Any>(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty, template: Obligation.Terms<Currency>, quantity: Long, beneficiary: AbstractParty) defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'NORMAL' @ [807:69] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'MEGA_CORP' @ [807:77] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpDollarSettlement' @ [807:88] ==> private final val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'DOLLARS' @ [808:22] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [808:30] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [808:40] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'State' @ [809:52] ==> public constructor State<P : Any>(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty, template: Obligation.Terms<Currency>, quantity: Long, beneficiary: AbstractParty) defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'NORMAL' @ [809:68] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'MINI_CORP' @ [809:76] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpDollarSettlement' @ [809:87] ==> private final val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'DOLLARS' @ [810:22] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [810:30] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [810:40] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'assertEquals' @ [813:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Obligation.Terms<Currency>, actual: Obligation.Terms<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Terms<Currency>

'fiveKDollarsFromMegaToMega' @ [813:22] ==> val fiveKDollarsFromMegaToMega: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`extraction of issuance defintion`[LocalVariableDescriptor]

'template' @ [813:49] ==> public final val template: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'megaCorpDollarSettlement' @ [813:59] ==> private final val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'assertEquals' @ [814:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Obligation.Terms<Currency>, actual: Obligation.Terms<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Terms<Currency>

'oneKDollarsFromMiniToMega' @ [814:22] ==> val oneKDollarsFromMiniToMega: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`extraction of issuance defintion`[LocalVariableDescriptor]

'template' @ [814:48] ==> public final val template: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'megaCorpDollarSettlement' @ [814:58] ==> private final val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'Test' @ [817:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'Terms' @ [819:51] ==> public constructor Terms<P : Any>(acceptableContracts: NonEmptySet<SecureHash>, acceptableIssuedProducts: NonEmptySet<Issued<Currency>>, dueBefore: Instant, timeTolerance: Duration = ...) defined in net.corda.finance.contracts.asset.Obligation.Terms[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'trustedCashContract' @ [819:57] ==> private final val trustedCashContract: NonEmptySet<SecureHash> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'megaIssuedDollars' @ [819:78] ==> private final val megaIssuedDollars: NonEmptySet<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'fivePm' @ [819:97] ==> private final val fivePm: Instant defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'State' @ [820:53] ==> public constructor State<P : Any>(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty, template: Obligation.Terms<Currency>, quantity: Long, beneficiary: AbstractParty) defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'NORMAL' @ [820:69] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'MEGA_CORP' @ [820:77] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpDollarSettlement' @ [820:88] ==> val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`adding two settlement contracts nets them`[LocalVariableDescriptor]

'DOLLARS' @ [821:22] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [821:30] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'MINI_CORP' @ [821:40] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'State' @ [822:52] ==> public constructor State<P : Any>(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty, template: Obligation.Terms<Currency>, quantity: Long, beneficiary: AbstractParty) defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'NORMAL' @ [822:68] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'MINI_CORP' @ [822:76] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpDollarSettlement' @ [822:87] ==> val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`adding two settlement contracts nets them`[LocalVariableDescriptor]

'DOLLARS' @ [823:22] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [823:30] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [823:40] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'fiveKDollarsFromMegaToMini' @ [825:22] ==> val fiveKDollarsFromMegaToMini: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`adding two settlement contracts nets them`[LocalVariableDescriptor]

'net' @ [825:49] ==> public open fun net(other: Obligation.State<Currency>): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'fiveKDollarsFromMegaToMini' @ [825:53] ==> val fiveKDollarsFromMegaToMini: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`adding two settlement contracts nets them`[LocalVariableDescriptor]

'copy' @ [825:80] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [825:101] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [825:109] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'State' @ [827:35] ==> public constructor State<P : Any>(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty, template: Obligation.Terms<Currency>, quantity: Long, beneficiary: AbstractParty) defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'NORMAL' @ [827:51] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'MEGA_CORP' @ [827:59] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpDollarSettlement' @ [827:70] ==> val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`adding two settlement contracts nets them`[LocalVariableDescriptor]

'DOLLARS' @ [827:101] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [827:109] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'MINI_CORP' @ [828:17] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'assertEquals' @ [829:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Obligation.State<Currency>, actual: Obligation.State<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> State<Currency>

'expected' @ [829:22] ==> var expected: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`adding two settlement contracts nets them`[LocalVariableDescriptor]

'actual' @ [829:32] ==> var actual: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`adding two settlement contracts nets them`[LocalVariableDescriptor]

'actual' @ [832:9] ==> var actual: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`adding two settlement contracts nets them`[LocalVariableDescriptor]

'fiveKDollarsFromMegaToMini' @ [832:18] ==> val fiveKDollarsFromMegaToMini: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`adding two settlement contracts nets them`[LocalVariableDescriptor]

'net' @ [832:45] ==> public open fun net(other: Obligation.State<Currency>): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'oneKDollarsFromMiniToMega' @ [832:49] ==> val oneKDollarsFromMiniToMega: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`adding two settlement contracts nets them`[LocalVariableDescriptor]

'expected' @ [833:9] ==> var expected: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`adding two settlement contracts nets them`[LocalVariableDescriptor]

'fiveKDollarsFromMegaToMini' @ [833:20] ==> val fiveKDollarsFromMegaToMini: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`adding two settlement contracts nets them`[LocalVariableDescriptor]

'copy' @ [833:47] ==> public final fun copy(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty = ..., template: Obligation.Terms<Currency> = ..., quantity: Long = ..., beneficiary: AbstractParty = ...): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [833:68] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [833:76] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'assertEquals' @ [834:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Obligation.State<Currency>, actual: Obligation.State<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> State<Currency>

'expected' @ [834:22] ==> var expected: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`adding two settlement contracts nets them`[LocalVariableDescriptor]

'actual' @ [834:32] ==> var actual: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`adding two settlement contracts nets them`[LocalVariableDescriptor]

'assertFailsWith' @ [837:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<IllegalArgumentException /* = IllegalArgumentException */>, block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> IllegalArgumentException

'IllegalArgumentException' @ [837:25] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'fiveKDollarsFromMegaToMini' @ [838:13] ==> val fiveKDollarsFromMegaToMini: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`adding two settlement contracts nets them`[LocalVariableDescriptor]

'net' @ [838:40] ==> public open fun net(other: Obligation.State<Currency>): Obligation.State<Currency> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedSimpleFunctionDescriptor]

'State' @ [838:55] ==> public constructor State<P : Any>(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty, template: Obligation.Terms<Currency>, quantity: Long, beneficiary: AbstractParty) defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'NORMAL' @ [838:71] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'MINI_CORP' @ [838:79] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpDollarSettlement' @ [838:90] ==> val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`adding two settlement contracts nets them`[LocalVariableDescriptor]

'DOLLARS' @ [838:121] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [838:129] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'MINI_CORP' @ [839:21] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Test' @ [843:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'Terms' @ [845:51] ==> public constructor Terms<P : Any>(acceptableContracts: NonEmptySet<SecureHash>, acceptableIssuedProducts: NonEmptySet<Issued<Currency>>, dueBefore: Instant, timeTolerance: Duration = ...) defined in net.corda.finance.contracts.asset.Obligation.Terms[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'trustedCashContract' @ [845:57] ==> private final val trustedCashContract: NonEmptySet<SecureHash> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'megaIssuedDollars' @ [845:78] ==> private final val megaIssuedDollars: NonEmptySet<Issued<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'fivePm' @ [845:97] ==> private final val fivePm: Instant defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'State' @ [846:53] ==> public constructor State<P : Any>(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty, template: Obligation.Terms<Currency>, quantity: Long, beneficiary: AbstractParty) defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'NORMAL' @ [846:69] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'MEGA_CORP' @ [846:77] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpDollarSettlement' @ [846:88] ==> val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`extracting amounts due between parties from a list of states`[LocalVariableDescriptor]

'DOLLARS' @ [847:22] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'quantity' @ [847:30] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'MINI_CORP' @ [847:40] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'fiveKDollarsFromMegaToMini' @ [848:22] ==> val fiveKDollarsFromMegaToMini: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`extracting amounts due between parties from a list of states`[LocalVariableDescriptor]

'amount' @ [848:49] ==> public open val amount: Amount<Issued<Obligation.Terms<Currency>>> defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedPropertyDescriptor]

'mapOf' @ [849:101] ==> public fun <K, V> mapOf(pair: Pair<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<Currency>>>): Map<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<Currency>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<AbstractParty, AbstractParty>
    <V> -> Amount<Terms<Currency>>

'Pair' @ [849:107] ==> public constructor Pair<out A, out B>(first: Pair<Party, Party>, second: Amount<Obligation.Terms<Currency>>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Pair<Party, Party>
    <out B> -> Amount<Terms<Currency>>

'Pair' @ [849:112] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'MEGA_CORP' @ [849:117] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'MINI_CORP' @ [849:128] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Amount' @ [849:140] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Obligation.Terms<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Terms<Currency>

'amount' @ [849:147] ==> val amount: Amount<Issued<Obligation.Terms<Currency>>> defined in net.corda.finance.contracts.asset.ObligationTests.`extracting amounts due between parties from a list of states`[LocalVariableDescriptor]

'quantity' @ [849:154] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'amount' @ [849:164] ==> val amount: Amount<Issued<Obligation.Terms<Currency>>> defined in net.corda.finance.contracts.asset.ObligationTests.`extracting amounts due between parties from a list of states`[LocalVariableDescriptor]

'token' @ [849:171] ==> public final val token: Issued<Obligation.Terms<Currency>> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'product' @ [849:177] ==> public final val product: Obligation.Terms<Currency> defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'extractAmountsDue' @ [850:22] ==> public fun <P : Any> extractAmountsDue(product: Obligation.Terms<Currency>, states: Iterable<Obligation.State<Currency>>): Map<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<Currency>>> defined in net.corda.finance.contracts.asset[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <P : Any> -> Currency

'megaCorpDollarSettlement' @ [850:40] ==> val megaCorpDollarSettlement: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`extracting amounts due between parties from a list of states`[LocalVariableDescriptor]

'listOf' @ [850:66] ==> public fun <T> listOf(element: Obligation.State<Currency>): List<Obligation.State<Currency>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State<Currency>

'fiveKDollarsFromMegaToMini' @ [850:73] ==> val fiveKDollarsFromMegaToMini: Obligation.State<Currency> defined in net.corda.finance.contracts.asset.ObligationTests.`extracting amounts due between parties from a list of states`[LocalVariableDescriptor]

'assertEquals' @ [851:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<Currency>>>, actual: Map<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<Currency>>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<Pair<AbstractParty, AbstractParty>, Amount<Terms<Currency>>>

'expected' @ [851:22] ==> val expected: Map<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<Currency>>> defined in net.corda.finance.contracts.asset.ObligationTests.`extracting amounts due between parties from a list of states`[LocalVariableDescriptor]

'actual' @ [851:32] ==> val actual: Map<Pair<AbstractParty, AbstractParty>, Amount<Obligation.Terms<Currency>>> defined in net.corda.finance.contracts.asset.ObligationTests.`extracting amounts due between parties from a list of states`[LocalVariableDescriptor]

'Test' @ [854:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mapOf' @ [857:83] ==> public fun <K, V> mapOf(vararg pairs: Pair<Pair<AbstractParty, AbstractParty>, Amount<Currency>>): Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<AbstractParty, AbstractParty>
    <V> -> Amount<Currency>

'Pair' @ [858:17] ==> public constructor Pair<out A, out B>(first: Pair<Party, Party>, second: Amount<Currency>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Pair<Party, Party>
    <out B> -> Amount<Currency>

'Pair' @ [858:22] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'ALICE' @ [858:27] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [858:34] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Amount' @ [858:40] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'GBP' @ [858:58] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'Pair' @ [859:17] ==> public constructor Pair<out A, out B>(first: Pair<Party, Party>, second: Amount<Currency>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Pair<Party, Party>
    <out B> -> Amount<Currency>

'Pair' @ [859:22] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'BOB' @ [859:27] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ALICE' @ [859:32] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Amount' @ [859:40] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'GBP' @ [859:58] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'emptyMap' @ [861:83] ==> public fun <K, V> emptyMap(): Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<AbstractParty, AbstractParty>
    <V> -> Amount<Currency>

'netAmountsDue' @ [862:81] ==> public fun <P : AbstractParty, T : Any> netAmountsDue(balances: Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>>): Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>> defined in net.corda.finance.contracts.asset[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <P : AbstractParty> -> AbstractParty
    <T : Any> -> Currency

'balanced' @ [862:95] ==> val balanced: Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`netting equal balances due between parties`[LocalVariableDescriptor]

'assertEquals' @ [863:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>>, actual: Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>>

'expected' @ [863:22] ==> val expected: Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`netting equal balances due between parties`[LocalVariableDescriptor]

'actual' @ [863:32] ==> val actual: Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`netting equal balances due between parties`[LocalVariableDescriptor]

'Test' @ [866:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mapOf' @ [869:83] ==> public fun <K, V> mapOf(vararg pairs: Pair<Pair<AbstractParty, AbstractParty>, Amount<Currency>>): Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<AbstractParty, AbstractParty>
    <V> -> Amount<Currency>

'Pair' @ [870:17] ==> public constructor Pair<out A, out B>(first: Pair<Party, Party>, second: Amount<Currency>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Pair<Party, Party>
    <out B> -> Amount<Currency>

'Pair' @ [870:22] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'ALICE' @ [870:27] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [870:34] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Amount' @ [870:40] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'GBP' @ [870:58] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'Pair' @ [871:17] ==> public constructor Pair<out A, out B>(first: Pair<Party, Party>, second: Amount<Currency>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Pair<Party, Party>
    <out B> -> Amount<Currency>

'Pair' @ [871:22] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'BOB' @ [871:27] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ALICE' @ [871:32] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Amount' @ [871:40] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'GBP' @ [871:58] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'mapOf' @ [873:83] ==> public fun <K, V> mapOf(pair: Pair<Pair<AbstractParty, AbstractParty>, Amount<Currency>>): Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<AbstractParty, AbstractParty>
    <V> -> Amount<Currency>

'Pair' @ [874:17] ==> public constructor Pair<out A, out B>(first: Pair<Party, Party>, second: Amount<Currency>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Pair<Party, Party>
    <out B> -> Amount<Currency>

'Pair' @ [874:22] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'BOB' @ [874:27] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ALICE' @ [874:32] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Amount' @ [874:40] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'GBP' @ [874:58] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'netAmountsDue' @ [876:22] ==> public fun <P : AbstractParty, T : Any> netAmountsDue(balances: Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>>): Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>> defined in net.corda.finance.contracts.asset[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <P : AbstractParty> -> AbstractParty
    <T : Any> -> Currency

'balanced' @ [876:36] ==> val balanced: Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`netting difference balances due between parties`[LocalVariableDescriptor]

'assertEquals' @ [877:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>>, actual: Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>>

'expected' @ [877:22] ==> val expected: Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`netting difference balances due between parties`[LocalVariableDescriptor]

'actual' @ [877:32] ==> val actual: Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`netting difference balances due between parties`[LocalVariableDescriptor]

'Test' @ [880:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'emptyMap' @ [882:21] ==> public fun <K, V> emptyMap(): Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<AbstractParty, AbstractParty>
    <V> -> Amount<Currency>

'emptyMap' @ [883:24] ==> public fun <K, V> emptyMap(): Map<AbstractParty, Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Long

'sumAmountsDue' @ [884:22] ==> public fun <P : AbstractParty, T : Any> sumAmountsDue(balances: Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>>): Map<AbstractParty, Long> defined in net.corda.finance.contracts.asset[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <P : AbstractParty> -> AbstractParty
    <T : Any> -> Currency

'empty' @ [884:36] ==> val empty: Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`summing empty balances due between parties`[LocalVariableDescriptor]

'assertEquals' @ [885:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<AbstractParty, Long>, actual: Map<AbstractParty, Long>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<AbstractParty, Long>

'expected' @ [885:22] ==> val expected: Map<AbstractParty, Long> defined in net.corda.finance.contracts.asset.ObligationTests.`summing empty balances due between parties`[LocalVariableDescriptor]

'actual' @ [885:32] ==> val actual: Map<AbstractParty, Long> defined in net.corda.finance.contracts.asset.ObligationTests.`summing empty balances due between parties`[LocalVariableDescriptor]

'Test' @ [888:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [890:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'mapOf' @ [891:81] ==> public fun <K, V> mapOf(pair: Pair<Pair<AbstractParty, AbstractParty>, Amount<Currency>>): Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<AbstractParty, AbstractParty>
    <V> -> Amount<Currency>

'Pair' @ [891:87] ==> public constructor Pair<out A, out B>(first: Pair<Party, Party>, second: Amount<Currency>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Pair<Party, Party>
    <out B> -> Amount<Currency>

'Pair' @ [891:92] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'ALICE' @ [891:97] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [891:104] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Amount' @ [891:110] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'GBP' @ [891:128] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'mapOf' @ [892:50] ==> public fun <K, V> mapOf(vararg pairs: Pair<AbstractParty, Long>): Map<AbstractParty, Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Long

'Pair' @ [892:56] ==> public constructor Pair<out A, out B>(first: Party, second: Long) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Long

'ALICE' @ [892:61] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'-' @ [892:68] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'Pair' @ [892:82] ==> public constructor Pair<out A, out B>(first: Party, second: Long) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Long

'BOB' @ [892:87] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'sumAmountsDue' @ [893:22] ==> public fun <P : AbstractParty, T : Any> sumAmountsDue(balances: Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>>): Map<AbstractParty, Long> defined in net.corda.finance.contracts.asset[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <P : AbstractParty> -> AbstractParty
    <T : Any> -> Currency

'simple' @ [893:36] ==> val simple: Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`summing balances due between parties`[LocalVariableDescriptor]

'assertEquals' @ [894:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<AbstractParty, Long>, actual: Map<AbstractParty, Long>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<AbstractParty, Long>

'expected' @ [894:22] ==> val expected: Map<AbstractParty, Long> defined in net.corda.finance.contracts.asset.ObligationTests.`summing balances due between parties`[LocalVariableDescriptor]

'actual' @ [894:32] ==> val actual: Map<AbstractParty, Long> defined in net.corda.finance.contracts.asset.ObligationTests.`summing balances due between parties`[LocalVariableDescriptor]

'Test' @ [897:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mapOf' @ [900:83] ==> public fun <K, V> mapOf(vararg pairs: Pair<Pair<AbstractParty, AbstractParty>, Amount<Currency>>): Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<AbstractParty, AbstractParty>
    <V> -> Amount<Currency>

'Pair' @ [901:17] ==> public constructor Pair<out A, out B>(first: Pair<Party, Party>, second: Amount<Currency>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Pair<Party, Party>
    <out B> -> Amount<Currency>

'Pair' @ [901:22] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'ALICE' @ [901:27] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [901:34] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Amount' @ [901:40] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'GBP' @ [901:58] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'Pair' @ [902:17] ==> public constructor Pair<out A, out B>(first: Pair<Party, Party>, second: Amount<Currency>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Pair<Party, Party>
    <out B> -> Amount<Currency>

'Pair' @ [902:22] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'BOB' @ [902:27] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ALICE' @ [902:32] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Amount' @ [902:40] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'GBP' @ [902:58] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'emptyMap' @ [904:50] ==> public fun <K, V> emptyMap(): Map<AbstractParty, Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> Long

'sumAmountsDue' @ [905:22] ==> public fun <P : AbstractParty, T : Any> sumAmountsDue(balances: Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>>): Map<AbstractParty, Long> defined in net.corda.finance.contracts.asset[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <P : AbstractParty> -> AbstractParty
    <T : Any> -> Currency

'balanced' @ [905:36] ==> val balanced: Map<Pair<AbstractParty, AbstractParty>, Amount<Currency>> defined in net.corda.finance.contracts.asset.ObligationTests.`summing balances due between parties which net to zero`[LocalVariableDescriptor]

'assertEquals' @ [906:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<AbstractParty, Long>, actual: Map<AbstractParty, Long>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<AbstractParty, Long>

'expected' @ [906:22] ==> val expected: Map<AbstractParty, Long> defined in net.corda.finance.contracts.asset.ObligationTests.`summing balances due between parties which net to zero`[LocalVariableDescriptor]

'actual' @ [906:32] ==> val actual: Map<AbstractParty, Long> defined in net.corda.finance.contracts.asset.ObligationTests.`summing balances due between parties which net to zero`[LocalVariableDescriptor]

'toByteArray' @ [909:96] ==> @InlineOnly public inline fun String.toByteArray(charset: Charset = ...): ByteArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Terms' @ [911:28] ==> public constructor Terms<P : Any>(acceptableContracts: NonEmptySet<SecureHash>, acceptableIssuedProducts: NonEmptySet<Issued<Currency>>, dueBefore: Instant, timeTolerance: Duration = ...) defined in net.corda.finance.contracts.asset.Obligation.Terms[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'NonEmptySet' @ [911:34] ==> public companion object defined in net.corda.core.utilities.NonEmptySet[FakeCallableDescriptorForObject]

'of' @ [911:46] ==> @JvmStatic public final fun <T> of(element: SecureHash): NonEmptySet<SecureHash> defined in net.corda.core.utilities.NonEmptySet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'cashContractBytes' @ [911:49] ==> private final val cashContractBytes: ByteArray defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'sha256' @ [911:67] ==> public fun ByteArray.sha256(): SecureHash.SHA256 defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'NonEmptySet' @ [911:92] ==> public companion object defined in net.corda.core.utilities.NonEmptySet[FakeCallableDescriptorForObject]

'of' @ [911:104] ==> @JvmStatic public final fun <T> of(element: Issued<Currency>): NonEmptySet<Issued<Currency>> defined in net.corda.core.utilities.NonEmptySet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Issued<Currency>

'this' @ [911:107] ==> <this> defined in net.corda.finance.contracts.asset.ObligationTests.OBLIGATION_DEF[ReceiverParameterDescriptorImpl]

'TEST_TX_TIME' @ [911:114] ==> public val TEST_TX_TIME: Instant defined in net.corda.testing[DeserializedPropertyDescriptor]

'State' @ [913:28] ==> public constructor State<P : Any>(lifecycle: Obligation.Lifecycle = ..., obligor: AbstractParty, template: Obligation.Terms<Currency>, quantity: Long, beneficiary: AbstractParty) defined in net.corda.finance.contracts.asset.Obligation.State[DeserializedClassConstructorDescriptor]
Inferred types:
    <P : Any> -> Currency

'NORMAL' @ [913:55] ==> enum entry NORMAL defined in net.corda.finance.contracts.asset.Obligation.Lifecycle[FakeCallableDescriptorForObject]

'DUMMY_OBLIGATION_ISSUER' @ [913:63] ==> public val DUMMY_OBLIGATION_ISSUER: Party defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'token' @ [913:88] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'OBLIGATION_DEF' @ [913:94] ==> private final val Issued<Currency>.OBLIGATION_DEF: Obligation.Terms<Currency> defined in net.corda.finance.contracts.asset.ObligationTests[PropertyDescriptorImpl]

'quantity' @ [913:110] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'NULL_PARTY' @ [913:120] ==> public val NULL_PARTY: AnonymousParty defined in net.corda.core.crypto.testing[DeserializedPropertyDescriptor]

