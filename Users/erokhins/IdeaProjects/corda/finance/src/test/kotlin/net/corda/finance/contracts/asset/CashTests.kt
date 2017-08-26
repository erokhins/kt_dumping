'TestDependencyInjectionBase' @ [33:19] ==> public constructor TestDependencyInjectionBase() defined in net.corda.testing.TestDependencyInjectionBase[DeserializedClassConstructorDescriptor]

'OpaqueBytes' @ [34:22] ==> public constructor OpaqueBytes(bytes: ByteArray) defined in net.corda.core.utilities.OpaqueBytes[DeserializedClassConstructorDescriptor]

'ByteArray' @ [34:34] ==> public constructor ByteArray(size: Int, init: (Int) -> Byte) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'MEGA_CORP' @ [35:25] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [35:35] ==> public open fun ref(bytes: OpaqueBytes): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'defaultRef' @ [35:39] ==> public final val defaultRef: OpaqueBytes defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'Cash' @ [36:19] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [36:24] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'`issued by`' @ [37:22] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [37:27] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [37:47] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'AnonymousParty' @ [38:21] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'ALICE_PUBKEY' @ [38:36] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'inState' @ [41:25] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [41:33] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'defaultIssuer' @ [41:46] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'party' @ [41:60] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'issuerInState' @ [42:20] ==> public final val issuerInState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [42:34] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [42:47] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'BOB_PUBKEY' @ [42:62] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'copy' @ [44:48] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'Amount' @ [45:22] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'amount' @ [45:29] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'quantity' @ [45:36] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'amount' @ [45:54] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [45:61] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'copy' @ [45:67] ==> public final fun copy(issuer: PartyAndReference = ..., product: Currency = ...): Issued<Currency> defined in net.corda.core.contracts.Issued[DeserializedSimpleFunctionDescriptor]

'amount' @ [45:72] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [45:79] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [45:85] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'copy' @ [45:92] ==> public final fun copy(party: AbstractParty = ..., reference: OpaqueBytes = ...): PartyAndReference defined in net.corda.core.contracts.PartyAndReference[DeserializedSimpleFunctionDescriptor]

'OpaqueBytes' @ [45:109] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [45:121] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'ref' @ [45:124] ==> value-parameter ref: Byte defined in net.corda.finance.contracts.asset.CashTests.editDepositRef[ValueParameterDescriptorImpl]

'miniCorpServices' @ [50:37] ==> public final lateinit var miniCorpServices: MockServices defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'vaultService' @ [50:54] ==> public open val vaultService: VaultService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'Before' @ [54:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'LogHelper' @ [56:9] ==> public object LogHelper defined in net.corda.testing[FakeCallableDescriptorForObject]

'setLevel' @ [56:19] ==> public final fun setLevel(vararg classes: KClass<*>): Unit defined in net.corda.testing.LogHelper[DeserializedSimpleFunctionDescriptor]

'NodeVaultService' @ [56:28] ==> private companion object defined in net.corda.node.services.vault.NodeVaultService[FakeCallableDescriptorForObject]

'megaCorpServices' @ [57:9] ==> public final lateinit var megaCorpServices: MockServices defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'MockServices' @ [57:28] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'MEGA_CORP_KEY' @ [57:41] ==> public val MEGA_CORP_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'makeTestDatabaseAndMockServices' @ [58:35] ==> public fun makeTestDatabaseAndMockServices(customSchemas: Set<MappedSchema> = ..., keys: List<KeyPair> = ..., createIdentityService: () -> IdentityService = ...): Pair<CordaPersistence, MockServices> defined in net.corda.testing.node[DeserializedSimpleFunctionDescriptor]

'listOf' @ [58:74] ==> public fun <T> listOf(vararg elements: KeyPair): List<KeyPair> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KeyPair

'MINI_CORP_KEY' @ [58:81] ==> public val MINI_CORP_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'MEGA_CORP_KEY' @ [58:96] ==> public val MEGA_CORP_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'OUR_KEY' @ [58:111] ==> public final val OUR_KEY: KeyPair defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'database' @ [59:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'databaseAndServices' @ [59:20] ==> val databaseAndServices: Pair<CordaPersistence, MockServices> defined in net.corda.finance.contracts.asset.CashTests.setUp[LocalVariableDescriptor]

'first' @ [59:40] ==> public final val first: CordaPersistence defined in kotlin.Pair[DeserializedPropertyDescriptor]

'miniCorpServices' @ [60:9] ==> public final lateinit var miniCorpServices: MockServices defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'databaseAndServices' @ [60:28] ==> val databaseAndServices: Pair<CordaPersistence, MockServices> defined in net.corda.finance.contracts.asset.CashTests.setUp[LocalVariableDescriptor]

'second' @ [60:48] ==> public final val second: MockServices defined in kotlin.Pair[DeserializedPropertyDescriptor]

'database' @ [62:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'transaction' @ [62:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<Cash.State>): Vault<Cash.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<State>

'miniCorpServices' @ [63:13] ==> public final lateinit var miniCorpServices: MockServices defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [63:30] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [63:65] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'OUR_IDENTITY_1' @ [64:31] ==> public final val OUR_IDENTITY_1: AbstractParty defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'MEGA_CORP' @ [64:58] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [64:68] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'megaCorpServices' @ [64:93] ==> public final lateinit var megaCorpServices: MockServices defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'miniCorpServices' @ [65:13] ==> public final lateinit var miniCorpServices: MockServices defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [65:30] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [65:65] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'OUR_IDENTITY_1' @ [66:31] ==> public final val OUR_IDENTITY_1: AbstractParty defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'MEGA_CORP' @ [66:58] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [66:68] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'megaCorpServices' @ [66:93] ==> public final lateinit var megaCorpServices: MockServices defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'miniCorpServices' @ [67:13] ==> public final lateinit var miniCorpServices: MockServices defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [67:30] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [67:64] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'OUR_IDENTITY_1' @ [68:31] ==> public final val OUR_IDENTITY_1: AbstractParty defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'MINI_CORP' @ [68:58] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [68:68] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'miniCorpServices' @ [68:93] ==> public final lateinit var miniCorpServices: MockServices defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'miniCorpServices' @ [69:13] ==> public final lateinit var miniCorpServices: MockServices defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [69:30] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'SWISS_FRANCS' @ [69:64] ==> public val Int.SWISS_FRANCS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'OUR_IDENTITY_1' @ [70:31] ==> public final val OUR_IDENTITY_1: AbstractParty defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'MINI_CORP' @ [70:58] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [70:68] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'miniCorpServices' @ [70:93] ==> public final lateinit var miniCorpServices: MockServices defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'database' @ [72:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'transaction' @ [72:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'vaultStatesUnconsumed' @ [73:13] ==> public final lateinit var vaultStatesUnconsumed: List<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'miniCorpServices' @ [73:37] ==> public final lateinit var miniCorpServices: MockServices defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'vaultQueryService' @ [73:54] ==> public open val vaultQueryService: VaultQueryService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'queryBy' @ [73:72] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [73:94] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'resetTestSerialization' @ [75:9] ==> public fun resetTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'After' @ [78:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'database' @ [80:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'close' @ [80:18] ==> public open fun close(): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]

'Test' @ [83:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transaction' @ [85:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [86:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [86:21] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'this' @ [87:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.trivial.<anonymous>[ReceiverParameterDescriptorImpl]

'tweak' @ [89:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [90:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [90:26] ==> public final val outState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [90:35] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'`issued by`' @ [90:49] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [90:54] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [90:74] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'this' @ [91:17] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.trivial.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'tweak' @ [93:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [94:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [94:26] ==> public final val outState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'this' @ [96:17] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.trivial.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'tweak' @ [98:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [99:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [99:26] ==> public final val outState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'command' @ [100:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'BOB_PUBKEY' @ [100:25] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [100:39] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [100:53] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [101:17] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.trivial.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'tweak' @ [103:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [104:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [104:26] ==> public final val outState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'output' @ [105:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [105:26] ==> public final val outState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'MINI_CORP' @ [105:47] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'command' @ [106:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [106:25] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [106:41] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [106:55] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [107:17] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.trivial.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'tweak' @ [110:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [111:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [111:26] ==> public final val outState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'command' @ [112:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [112:25] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [112:41] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [112:55] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [113:17] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.trivial.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [113:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'Test' @ [118:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transaction' @ [121:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [122:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'DummyState' @ [122:21] ==> public constructor DummyState(magicNumber: Int = ...) defined in net.corda.testing.contracts.DummyState[DeserializedClassConstructorDescriptor]

'output' @ [123:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [123:22] ==> public final val outState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'command' @ [124:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MINI_CORP_PUBKEY' @ [124:21] ==> public val MINI_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [124:41] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [124:55] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [126:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.`issue by move`.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [130:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transaction' @ [134:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'output' @ [135:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [135:22] ==> public final val outState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'command' @ [136:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [136:21] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [136:37] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Issue' @ [136:51] ==> public constructor Issue() defined in net.corda.finance.contracts.asset.Cash.Commands.Issue[DeserializedClassConstructorDescriptor]

'this' @ [137:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.issue.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [139:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'output' @ [140:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'Cash' @ [141:17] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [141:22] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'`issued by`' @ [142:34] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [142:39] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MINI_CORP' @ [142:59] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [142:69] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [143:33] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'ALICE_PUBKEY' @ [143:48] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'command' @ [146:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MINI_CORP_PUBKEY' @ [146:21] ==> public val MINI_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [146:41] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Issue' @ [146:55] ==> public constructor Issue() defined in net.corda.finance.contracts.asset.Cash.Commands.Issue[DeserializedClassConstructorDescriptor]

'this' @ [147:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.issue.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [147:18] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'Test' @ [151:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [153:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'TransactionBuilder' @ [155:35] ==> public constructor TransactionBuilder(notary: Party? = ..., lockId: UUID = ..., inputs: MutableList<StateRef> = ..., attachments: MutableList<SecureHash> = ..., outputs: MutableList<TransactionState<ContractState>> = ..., commands: MutableList<Command<*>> = ..., window: TimeWindow? = ..., privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'apply' @ [155:69] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'Cash' @ [156:13] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[DeserializedClassConstructorDescriptor]

'generateIssue' @ [156:20] ==> public final fun generateIssue(tx: TransactionBuilder, amount: Amount<Issued<Currency>>, owner: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash[DeserializedSimpleFunctionDescriptor]

'this' @ [156:34] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.generateIssueRaw.<anonymous>[ReceiverParameterDescriptorImpl]

'`issued by`' @ [156:40] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [156:44] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MINI_CORP' @ [156:64] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [156:74] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [156:95] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'ALICE_PUBKEY' @ [156:110] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [156:134] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'toWireTransaction' @ [157:11] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [158:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'tx' @ [158:20] ==> val tx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateIssueRaw[LocalVariableDescriptor]

'inputs' @ [158:23] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'isEmpty' @ [158:30] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'tx' @ [159:17] ==> val tx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateIssueRaw[LocalVariableDescriptor]

'outputsOfType' @ [159:20] ==> public final inline fun <reified T : ContractState> outputsOfType(): List<Cash.State> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'single' @ [159:48] ==> public fun <T> List<Cash.State>.single(): Cash.State defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'assertEquals' @ [160:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Issued<Currency>>, actual: Amount<Issued<Currency>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Issued<Currency>>

'`issued by`' @ [160:22] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [160:26] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MINI_CORP' @ [160:46] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [160:56] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

's' @ [160:69] ==> val s: Cash.State defined in net.corda.finance.contracts.asset.CashTests.generateIssueRaw[LocalVariableDescriptor]

'amount' @ [160:71] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'assertEquals' @ [161:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: AbstractParty, actual: AbstractParty, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> AbstractParty

'MINI_CORP' @ [161:22] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

's' @ [161:50] ==> val s: Cash.State defined in net.corda.finance.contracts.asset.CashTests.generateIssueRaw[LocalVariableDescriptor]

'amount' @ [161:52] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [161:59] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [161:65] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'party' @ [161:72] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'assertEquals' @ [162:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: AbstractParty, actual: AbstractParty, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> AbstractParty

'AnonymousParty' @ [162:22] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'ALICE_PUBKEY' @ [162:37] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

's' @ [162:52] ==> val s: Cash.State defined in net.corda.finance.contracts.asset.CashTests.generateIssueRaw[LocalVariableDescriptor]

'owner' @ [162:54] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'assertTrue' @ [163:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'tx' @ [163:20] ==> val tx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateIssueRaw[LocalVariableDescriptor]

'commands' @ [163:23] ==> public open val commands: List<Command<*>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'value' @ [163:35] ==> public final val value: CommandData defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'assertEquals' @ [164:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: PublicKey, actual: PublicKey, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PublicKey

'MINI_CORP_PUBKEY' @ [164:22] ==> public val MINI_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'tx' @ [164:40] ==> val tx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateIssueRaw[LocalVariableDescriptor]

'commands' @ [164:43] ==> public open val commands: List<Command<*>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'signers' @ [164:55] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'Test' @ [167:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [169:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'`issued by`' @ [171:22] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [171:26] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MINI_CORP' @ [171:46] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [171:56] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'TransactionBuilder' @ [172:35] ==> public constructor TransactionBuilder(notary: Party? = ..., lockId: UUID = ..., inputs: MutableList<StateRef> = ..., attachments: MutableList<SecureHash> = ..., outputs: MutableList<TransactionState<ContractState>> = ..., commands: MutableList<Command<*>> = ..., window: TimeWindow? = ..., privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'apply' @ [172:69] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'Cash' @ [173:13] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[DeserializedClassConstructorDescriptor]

'generateIssue' @ [173:20] ==> public final fun generateIssue(tx: TransactionBuilder, amount: Amount<Issued<Currency>>, owner: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash[DeserializedSimpleFunctionDescriptor]

'this' @ [173:34] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.generateIssueFromAmount.<anonymous>[ReceiverParameterDescriptorImpl]

'amount' @ [173:40] ==> val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.CashTests.generateIssueFromAmount[LocalVariableDescriptor]

'AnonymousParty' @ [173:56] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'ALICE_PUBKEY' @ [173:71] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [173:95] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'toWireTransaction' @ [174:11] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [175:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'tx' @ [175:20] ==> val tx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateIssueFromAmount[LocalVariableDescriptor]

'inputs' @ [175:23] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'isEmpty' @ [175:30] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [176:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: TransactionState<ContractState>, actual: TransactionState<ContractState>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> TransactionState<ContractState>

'tx' @ [176:22] ==> val tx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateIssueFromAmount[LocalVariableDescriptor]

'outputs' @ [176:25] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'tx' @ [176:37] ==> val tx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateIssueFromAmount[LocalVariableDescriptor]

'outputs' @ [176:40] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'Test' @ [179:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transaction' @ [182:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [183:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'issuerInState' @ [183:21] ==> public final val issuerInState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'output' @ [184:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [184:22] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [184:30] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'inState' @ [184:44] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'amount' @ [184:52] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'tweak' @ [187:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'command' @ [188:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [188:25] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [188:41] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [188:55] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [189:17] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.`extended issue examples`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'tweak' @ [193:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'command' @ [194:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [194:25] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [194:45] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Issue' @ [194:59] ==> public constructor Issue() defined in net.corda.finance.contracts.asset.Cash.Commands.Issue[DeserializedClassConstructorDescriptor]

'this' @ [195:17] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.`extended issue examples`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [195:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'transaction' @ [200:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [201:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [201:21] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'output' @ [202:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [202:22] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [202:30] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'inState' @ [202:44] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'amount' @ [202:52] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'splitEvenly' @ [202:59] ==> public final fun splitEvenly(partitions: Int): List<Amount<Issued<Currency>>> defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'first' @ [202:74] ==> public fun <T> List<Amount<Issued<Currency>>>.first(): Amount<Issued<Currency>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Amount<Issued<Currency>>

'command' @ [203:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [203:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [203:41] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Issue' @ [203:55] ==> public constructor Issue() defined in net.corda.finance.contracts.asset.Cash.Commands.Issue[DeserializedClassConstructorDescriptor]

'this' @ [204:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.`extended issue examples`.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [208:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [209:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [209:21] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'output' @ [210:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [210:22] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'command' @ [211:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [211:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [211:41] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Issue' @ [211:55] ==> public constructor Issue() defined in net.corda.finance.contracts.asset.Cash.Commands.Issue[DeserializedClassConstructorDescriptor]

'this' @ [212:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.`extended issue examples`.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [216:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [217:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [217:21] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'output' @ [218:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [218:22] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [218:30] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'inState' @ [218:44] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'amount' @ [218:52] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'command' @ [219:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [219:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [219:41] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Issue' @ [219:55] ==> public constructor Issue() defined in net.corda.finance.contracts.asset.Cash.Commands.Issue[DeserializedClassConstructorDescriptor]

'tweak' @ [220:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'command' @ [221:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [221:25] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [221:45] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Issue' @ [221:59] ==> public constructor Issue() defined in net.corda.finance.contracts.asset.Cash.Commands.Issue[DeserializedClassConstructorDescriptor]

'this' @ [222:17] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.`extended issue examples`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'this' @ [224:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.`extended issue examples`.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [224:18] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'Test' @ [232:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'IllegalStateException' @ [232:22] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'initialiseTestSerialization' @ [234:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'TransactionBuilder' @ [236:19] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [236:38] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [238:9] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[DeserializedClassConstructorDescriptor]

'generateIssue' @ [238:16] ==> public final fun generateIssue(tx: TransactionBuilder, amount: Amount<Issued<Currency>>, owner: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash[DeserializedSimpleFunctionDescriptor]

'ptx' @ [238:30] ==> var ptx: TransactionBuilder defined in net.corda.finance.contracts.asset.CashTests.`reject issuance with inputs`[LocalVariableDescriptor]

'`issued by`' @ [238:35] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [238:39] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MINI_CORP' @ [238:59] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [238:69] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'MINI_CORP' @ [238:90] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [238:110] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'miniCorpServices' @ [239:18] ==> public final lateinit var miniCorpServices: MockServices defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'signInitialTransaction' @ [239:35] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'ptx' @ [239:58] ==> var ptx: TransactionBuilder defined in net.corda.finance.contracts.asset.CashTests.`reject issuance with inputs`[LocalVariableDescriptor]

'ptx' @ [242:9] ==> var ptx: TransactionBuilder defined in net.corda.finance.contracts.asset.CashTests.`reject issuance with inputs`[LocalVariableDescriptor]

'TransactionBuilder' @ [242:15] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [242:34] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ptx' @ [243:9] ==> var ptx: TransactionBuilder defined in net.corda.finance.contracts.asset.CashTests.`reject issuance with inputs`[LocalVariableDescriptor]

'addInputState' @ [243:13] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'tx' @ [243:27] ==> val tx: SignedTransaction defined in net.corda.finance.contracts.asset.CashTests.`reject issuance with inputs`[LocalVariableDescriptor]

'tx' @ [243:30] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [243:33] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<Cash.State> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> State

'Cash' @ [244:9] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[DeserializedClassConstructorDescriptor]

'generateIssue' @ [244:16] ==> public final fun generateIssue(tx: TransactionBuilder, amount: Amount<Issued<Currency>>, owner: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash[DeserializedSimpleFunctionDescriptor]

'ptx' @ [244:30] ==> var ptx: TransactionBuilder defined in net.corda.finance.contracts.asset.CashTests.`reject issuance with inputs`[LocalVariableDescriptor]

'`issued by`' @ [244:35] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [244:39] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MINI_CORP' @ [244:59] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [244:69] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'MINI_CORP' @ [244:90] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [244:110] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Test' @ [247:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transaction' @ [250:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'command' @ [251:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [251:21] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [251:37] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [251:51] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'tweak' @ [252:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [253:17] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [253:25] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'inState' @ [254:31] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'amount' @ [254:39] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'splitEvenly' @ [254:46] ==> public final fun splitEvenly(partitions: Int): List<Amount<Issued<Currency>>> defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'..' @ [255:27] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'output' @ [255:33] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [255:42] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [255:50] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'splits4' @ [255:64] ==> val splits4: List<Amount<Issued<Currency>>> defined in net.corda.finance.contracts.asset.CashTests.testMergeSplit.<anonymous>.<anonymous>[LocalVariableDescriptor]

'i' @ [255:72] ==> val i: Int defined in net.corda.finance.contracts.asset.CashTests.testMergeSplit.<anonymous>.<anonymous>[LocalVariableDescriptor]

'this' @ [256:17] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.testMergeSplit.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [256:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'tweak' @ [259:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [260:31] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'amount' @ [260:39] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'splitEvenly' @ [260:46] ==> public final fun splitEvenly(partitions: Int): List<Amount<Issued<Currency>>> defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'inState' @ [261:31] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'amount' @ [261:39] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'splitEvenly' @ [261:46] ==> public final fun splitEvenly(partitions: Int): List<Amount<Issued<Currency>>> defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'..' @ [262:27] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'input' @ [262:33] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [262:41] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [262:49] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'splits4' @ [262:63] ==> val splits4: List<Amount<Issued<Currency>>> defined in net.corda.finance.contracts.asset.CashTests.testMergeSplit.<anonymous>.<anonymous>[LocalVariableDescriptor]

'i' @ [262:71] ==> val i: Int defined in net.corda.finance.contracts.asset.CashTests.testMergeSplit.<anonymous>.<anonymous>[LocalVariableDescriptor]

'..' @ [263:27] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'output' @ [263:33] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [263:42] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [263:50] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'splits2' @ [263:64] ==> val splits2: List<Amount<Issued<Currency>>> defined in net.corda.finance.contracts.asset.CashTests.testMergeSplit.<anonymous>.<anonymous>[LocalVariableDescriptor]

'i' @ [263:72] ==> val i: Int defined in net.corda.finance.contracts.asset.CashTests.testMergeSplit.<anonymous>.<anonymous>[LocalVariableDescriptor]

'this' @ [264:17] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.testMergeSplit.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [264:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'tweak' @ [267:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [268:31] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'amount' @ [268:39] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'splitEvenly' @ [268:46] ==> public final fun splitEvenly(partitions: Int): List<Amount<Issued<Currency>>> defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'..' @ [269:27] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'input' @ [269:33] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [269:41] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [269:49] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'splits2' @ [269:63] ==> val splits2: List<Amount<Issued<Currency>>> defined in net.corda.finance.contracts.asset.CashTests.testMergeSplit.<anonymous>.<anonymous>[LocalVariableDescriptor]

'i' @ [269:71] ==> val i: Int defined in net.corda.finance.contracts.asset.CashTests.testMergeSplit.<anonymous>.<anonymous>[LocalVariableDescriptor]

'output' @ [270:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [270:26] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'this' @ [271:17] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.testMergeSplit.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [271:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'Test' @ [276:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transaction' @ [278:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [279:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [279:21] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'input' @ [280:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [280:21] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [280:29] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'`issued by`' @ [280:43] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [280:45] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [280:65] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'this' @ [281:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.zeroSizedValues.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [283:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [284:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [284:21] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'output' @ [285:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [285:22] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'output' @ [286:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [286:22] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [286:30] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'`issued by`' @ [286:44] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [286:46] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [286:66] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'this' @ [287:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.zeroSizedValues.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [291:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transaction' @ [294:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [295:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [295:21] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'output' @ [296:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [296:22] ==> public final val outState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'MINI_CORP' @ [296:43] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [297:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.trivialMismatches.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [300:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'inState' @ [301:27] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'amount' @ [301:35] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'splitEvenly' @ [301:42] ==> public final fun splitEvenly(partitions: Int): List<Amount<Issued<Currency>>> defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'input' @ [302:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [302:21] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'..' @ [303:23] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'output' @ [303:29] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [303:38] ==> public final val outState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [303:47] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'splits2' @ [303:61] ==> val splits2: List<Amount<Issued<Currency>>> defined in net.corda.finance.contracts.asset.CashTests.trivialMismatches.<anonymous>[LocalVariableDescriptor]

'i' @ [303:69] ==> val i: Int defined in net.corda.finance.contracts.asset.CashTests.trivialMismatches.<anonymous>[LocalVariableDescriptor]

'editDepositRef' @ [303:73] ==> public final fun Cash.State.editDepositRef(ref: Byte): Cash.State defined in net.corda.finance.contracts.asset.CashTests[SimpleFunctionDescriptorImpl]

'i' @ [303:88] ==> val i: Int defined in net.corda.finance.contracts.asset.CashTests.trivialMismatches.<anonymous>[LocalVariableDescriptor]

'toByte' @ [303:90] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'this' @ [304:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.trivialMismatches.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [307:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [308:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [308:21] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'output' @ [309:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [309:22] ==> public final val outState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [309:31] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'`issued by`' @ [309:45] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [309:49] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [309:69] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'output' @ [310:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [310:22] ==> public final val outState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [310:31] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'`issued by`' @ [310:45] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'POUNDS' @ [310:49] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [310:68] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'this' @ [311:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.trivialMismatches.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [313:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [314:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [314:21] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'input' @ [315:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [316:17] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [316:25] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'`issued by`' @ [317:34] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'POUNDS' @ [317:38] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [317:57] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'AnonymousParty' @ [318:33] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'BOB_PUBKEY' @ [318:48] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'output' @ [321:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [321:22] ==> public final val outState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [321:31] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'`issued by`' @ [321:45] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [321:50] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [321:70] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'this' @ [322:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.trivialMismatches.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [325:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [326:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [326:21] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'input' @ [327:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [327:21] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'MINI_CORP' @ [327:41] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'output' @ [328:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [328:22] ==> public final val outState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'command' @ [329:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [329:21] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [329:37] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [329:51] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [330:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.trivialMismatches.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [333:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [334:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [334:21] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'input' @ [335:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [335:21] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'editDepositRef' @ [335:29] ==> public final fun Cash.State.editDepositRef(ref: Byte): Cash.State defined in net.corda.finance.contracts.asset.CashTests[SimpleFunctionDescriptorImpl]

'output' @ [336:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [336:22] ==> public final val outState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [336:31] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'inState' @ [336:45] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'amount' @ [336:53] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'editDepositRef' @ [336:65] ==> public final fun Cash.State.editDepositRef(ref: Byte): Cash.State defined in net.corda.finance.contracts.asset.CashTests[SimpleFunctionDescriptorImpl]

'this' @ [337:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.trivialMismatches.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [341:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transaction' @ [344:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [345:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'issuerInState' @ [345:21] ==> public final val issuerInState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'output' @ [346:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'issuerInState' @ [346:22] ==> public final val issuerInState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [346:36] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'issuerInState' @ [346:50] ==> public final val issuerInState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'amount' @ [346:64] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'`issued by`' @ [346:74] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [346:78] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [346:98] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'tweak' @ [348:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'command' @ [349:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [349:25] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [349:45] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Exit' @ [349:59] ==> public constructor Exit(amount: Amount<Issued<Currency>>) defined in net.corda.finance.contracts.asset.Cash.Commands.Exit[DeserializedClassConstructorDescriptor]

'`issued by`' @ [349:64] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [349:68] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [349:88] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'command' @ [350:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [350:25] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [350:45] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [350:59] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [351:17] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.exitLedger.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'tweak' @ [354:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'command' @ [355:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [355:25] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [355:45] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Exit' @ [355:59] ==> public constructor Exit(amount: Amount<Issued<Currency>>) defined in net.corda.finance.contracts.asset.Cash.Commands.Exit[DeserializedClassConstructorDescriptor]

'`issued by`' @ [355:64] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [355:68] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [355:88] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'this' @ [356:17] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.exitLedger.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'tweak' @ [358:17] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'command' @ [359:21] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [359:29] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [359:49] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [359:63] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [360:21] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.exitLedger.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [360:26] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'Test' @ [366:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transaction' @ [369:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [370:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'issuerInState' @ [370:21] ==> public final val issuerInState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'input' @ [371:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'issuerInState' @ [371:21] ==> public final val issuerInState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [371:35] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'MINI_CORP' @ [371:48] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'MINI_CORP' @ [371:71] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'output' @ [373:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'issuerInState' @ [373:22] ==> public final val issuerInState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [373:36] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'issuerInState' @ [373:50] ==> public final val issuerInState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'amount' @ [373:64] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'`issued by`' @ [373:74] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [373:78] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [373:98] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'MINI_CORP' @ [373:126] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'output' @ [374:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'issuerInState' @ [374:22] ==> public final val issuerInState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [374:36] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'MINI_CORP' @ [374:49] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'issuerInState' @ [374:69] ==> public final val issuerInState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'amount' @ [374:83] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'`issued by`' @ [374:93] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [374:97] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [374:117] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'command' @ [376:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [376:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'MINI_CORP_PUBKEY' @ [376:39] ==> public val MINI_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [376:59] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [376:73] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [378:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.`exit ledger with multiple issuers`.<anonymous>[ReceiverParameterDescriptorImpl]

'command' @ [380:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [380:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [380:41] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Exit' @ [380:55] ==> public constructor Exit(amount: Amount<Issued<Currency>>) defined in net.corda.finance.contracts.asset.Cash.Commands.Exit[DeserializedClassConstructorDescriptor]

'`issued by`' @ [380:60] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [380:64] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [380:84] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'this' @ [381:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.`exit ledger with multiple issuers`.<anonymous>[ReceiverParameterDescriptorImpl]

'command' @ [383:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MINI_CORP_PUBKEY' @ [383:21] ==> public val MINI_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [383:41] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Exit' @ [383:55] ==> public constructor Exit(amount: Amount<Issued<Currency>>) defined in net.corda.finance.contracts.asset.Cash.Commands.Exit[DeserializedClassConstructorDescriptor]

'`issued by`' @ [383:60] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [383:64] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MINI_CORP' @ [383:84] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [383:94] ==> public open fun ref(bytes: OpaqueBytes): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'defaultRef' @ [383:98] ==> public final val defaultRef: OpaqueBytes defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'this' @ [384:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.`exit ledger with multiple issuers`.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [384:18] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'Test' @ [388:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transaction' @ [391:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [392:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [392:21] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'output' @ [393:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'outState' @ [393:22] ==> public final val outState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [393:31] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'inState' @ [393:45] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'amount' @ [393:53] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'`issued by`' @ [393:63] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [393:67] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [393:87] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'command' @ [394:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [394:21] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [394:41] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Exit' @ [394:55] ==> public constructor Exit(amount: Amount<Issued<Currency>>) defined in net.corda.finance.contracts.asset.Cash.Commands.Exit[DeserializedClassConstructorDescriptor]

'`issued by`' @ [394:60] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [394:64] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [394:84] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'command' @ [395:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [395:21] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [395:37] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [395:51] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [396:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.`exit cash not held by its issuer`.<anonymous>[ReceiverParameterDescriptorImpl]

'Test' @ [400:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transaction' @ [402:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'input' @ [404:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [404:21] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'input' @ [405:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [405:21] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'MINI_CORP' @ [405:41] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'tweak' @ [408:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [409:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [409:26] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [409:34] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [409:47] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'BOB_PUBKEY' @ [409:62] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'`issued by`' @ [409:84] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [409:89] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [409:109] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'this' @ [410:17] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.multiIssuer.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'tweak' @ [413:13] ==> public open fun tweak(dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [414:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [414:26] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [414:34] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [414:47] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'BOB_PUBKEY' @ [414:62] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'output' @ [415:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [415:26] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [415:34] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [415:47] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'BOB_PUBKEY' @ [415:62] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'this' @ [416:17] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.multiIssuer.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'output' @ [420:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [420:22] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [420:30] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [420:43] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'BOB_PUBKEY' @ [420:58] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'output' @ [421:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [421:22] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'copy' @ [421:30] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [421:43] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'BOB_PUBKEY' @ [421:58] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'MINI_CORP' @ [421:83] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'command' @ [422:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [422:21] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [422:37] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [422:51] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [423:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.multiIssuer.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [423:18] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'Test' @ [427:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transaction' @ [430:9] ==> @JvmOverloads public fun transaction(transactionLabel: String? = ..., transactionBuilder: TransactionBuilder = ..., initialiseSerialization: Boolean = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'Cash' @ [431:26] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [431:31] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'`issued by`' @ [431:37] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'POUNDS' @ [431:41] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MINI_CORP' @ [431:60] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [431:70] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [431:84] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'BOB_PUBKEY' @ [431:99] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'input' @ [432:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [432:21] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'AnonymousParty' @ [432:40] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'ALICE_PUBKEY' @ [432:55] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'input' @ [433:13] ==> public final fun input(stateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'pounds' @ [433:21] ==> val pounds: Cash.State defined in net.corda.finance.contracts.asset.CashTests.multiCurrency.<anonymous>[LocalVariableDescriptor]

'output' @ [434:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'inState' @ [434:22] ==> public final val inState: Cash.State defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'AnonymousParty' @ [434:41] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'BOB_PUBKEY' @ [434:56] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'output' @ [435:13] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'pounds' @ [435:22] ==> val pounds: Cash.State defined in net.corda.finance.contracts.asset.CashTests.multiCurrency.<anonymous>[LocalVariableDescriptor]

'AnonymousParty' @ [435:40] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'ALICE_PUBKEY' @ [435:55] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'command' @ [436:13] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [436:21] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB_PUBKEY' @ [436:35] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [436:49] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [436:63] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [438:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.multiCurrency.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [438:18] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'lazy' @ [446:29] ==> public fun <T> lazy(initializer: () -> KeyPair): Lazy<KeyPair> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KeyPair

'generateKeyPair' @ [446:36] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [447:47] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'OUR_KEY' @ [447:62] ==> public final val OUR_KEY: KeyPair defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'public' @ [447:70] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'AnonymousParty' @ [449:28] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'MINI_CORP_PUBKEY' @ [449:43] ==> public val MINI_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'StateAndRef' @ [452:13] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<Cash.State>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> State

'Cash' @ [453:21] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [453:26] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'amount' @ [453:32] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.contracts.asset.CashTests.makeCash[ValueParameterDescriptorImpl]

'corp' @ [453:51] ==> value-parameter corp: Party defined in net.corda.finance.contracts.asset.CashTests.makeCash[ValueParameterDescriptorImpl]

'ref' @ [453:56] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'depositRef' @ [453:60] ==> value-parameter depositRef: Byte = ... defined in net.corda.finance.contracts.asset.CashTests.makeCash[ValueParameterDescriptorImpl]

'OUR_IDENTITY_1' @ [453:73] ==> public final val OUR_IDENTITY_1: AbstractParty defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [453:103] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'StateRef' @ [454:21] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'SecureHash' @ [454:30] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'randomSHA256' @ [454:41] ==> @JvmStatic public final fun randomSHA256(): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'Random' @ [454:57] ==> public constructor Random() defined in java.util.Random[JavaClassConstructorDescriptor]

'nextInt' @ [454:66] ==> public open fun nextInt(p0: Int): Int defined in java.util.Random[JavaMethodDescriptor]

'listOf' @ [457:18] ==> public fun <T> listOf(vararg elements: StateAndRef<Cash.State>): List<StateAndRef<Cash.State>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'makeCash' @ [458:13] ==> public final fun makeCash(amount: Amount<Currency>, corp: Party, depositRef: Byte = ...): StateAndRef<Cash.State> defined in net.corda.finance.contracts.asset.CashTests[SimpleFunctionDescriptorImpl]

'DOLLARS' @ [458:26] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [458:35] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'makeCash' @ [459:13] ==> public final fun makeCash(amount: Amount<Currency>, corp: Party, depositRef: Byte = ...): StateAndRef<Cash.State> defined in net.corda.finance.contracts.asset.CashTests[SimpleFunctionDescriptorImpl]

'DOLLARS' @ [459:26] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [459:35] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'makeCash' @ [460:13] ==> public final fun makeCash(amount: Amount<Currency>, corp: Party, depositRef: Byte = ...): StateAndRef<Cash.State> defined in net.corda.finance.contracts.asset.CashTests[SimpleFunctionDescriptorImpl]

'DOLLARS' @ [460:25] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MINI_CORP' @ [460:34] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'makeCash' @ [461:13] ==> public final fun makeCash(amount: Amount<Currency>, corp: Party, depositRef: Byte = ...): StateAndRef<Cash.State> defined in net.corda.finance.contracts.asset.CashTests[SimpleFunctionDescriptorImpl]

'SWISS_FRANCS' @ [461:25] ==> public val Int.SWISS_FRANCS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MINI_CORP' @ [461:39] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'TransactionBuilder' @ [468:18] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [468:37] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [469:9] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[DeserializedClassConstructorDescriptor]

'generateExit' @ [469:16] ==> public final fun generateExit(tx: TransactionBuilder, amountIssued: Amount<Issued<Currency>>, assetStates: List<StateAndRef<Cash.State>>): Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash[DeserializedSimpleFunctionDescriptor]

'tx' @ [469:29] ==> val tx: TransactionBuilder defined in net.corda.finance.contracts.asset.CashTests.makeExit[LocalVariableDescriptor]

'Amount' @ [469:33] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'amount' @ [469:40] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.contracts.asset.CashTests.makeExit[ValueParameterDescriptorImpl]

'quantity' @ [469:47] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'Issued' @ [469:57] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'corp' @ [469:64] ==> value-parameter corp: Party defined in net.corda.finance.contracts.asset.CashTests.makeExit[ValueParameterDescriptorImpl]

'ref' @ [469:69] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'depositRef' @ [469:73] ==> value-parameter depositRef: Byte = ... defined in net.corda.finance.contracts.asset.CashTests.makeExit[ValueParameterDescriptorImpl]

'amount' @ [469:86] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.contracts.asset.CashTests.makeExit[ValueParameterDescriptorImpl]

'token' @ [469:93] ==> public final val token: Currency defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'WALLET' @ [469:102] ==> public final val WALLET: List<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'tx' @ [470:16] ==> val tx: TransactionBuilder defined in net.corda.finance.contracts.asset.CashTests.makeExit[LocalVariableDescriptor]

'toWireTransaction' @ [470:19] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'TransactionBuilder' @ [474:18] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [474:37] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'database' @ [475:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'transaction' @ [475:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Pair<TransactionBuilder, List<PublicKey>>): Pair<TransactionBuilder, List<PublicKey>> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<TransactionBuilder, List<PublicKey>>

'Cash' @ [476:13] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'generateSpend' @ [476:18] ==> @JvmStatic @Suspendable public final fun generateSpend(services: ServiceHub, tx: TransactionBuilder, amount: Amount<Currency>, to: AbstractParty, onlyFromParties: Set<AbstractParty> = ...): Pair<TransactionBuilder, List<PublicKey>> defined in net.corda.finance.contracts.asset.Cash.Companion[DeserializedSimpleFunctionDescriptor]

'miniCorpServices' @ [476:32] ==> public final lateinit var miniCorpServices: MockServices defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'tx' @ [476:50] ==> val tx: TransactionBuilder defined in net.corda.finance.contracts.asset.CashTests.makeSpend[LocalVariableDescriptor]

'amount' @ [476:54] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.contracts.asset.CashTests.makeSpend[ValueParameterDescriptorImpl]

'dest' @ [476:62] ==> value-parameter dest: AbstractParty defined in net.corda.finance.contracts.asset.CashTests.makeSpend[ValueParameterDescriptorImpl]

'tx' @ [478:16] ==> val tx: TransactionBuilder defined in net.corda.finance.contracts.asset.CashTests.makeSpend[LocalVariableDescriptor]

'toWireTransaction' @ [478:19] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'Test' @ [484:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [486:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'makeExit' @ [487:19] ==> public final fun makeExit(amount: Amount<Currency>, corp: Party, depositRef: Byte = ...): WireTransaction defined in net.corda.finance.contracts.asset.CashTests[SimpleFunctionDescriptorImpl]

'DOLLARS' @ [487:32] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [487:41] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'assertEquals' @ [488:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateRef, actual: StateRef, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateRef

'WALLET' @ [488:22] ==> public final val WALLET: List<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'ref' @ [488:32] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'wtx' @ [488:37] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSimpleExit[LocalVariableDescriptor]

'inputs' @ [488:41] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'assertEquals' @ [489:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'wtx' @ [489:25] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSimpleExit[LocalVariableDescriptor]

'outputs' @ [489:29] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'size' @ [489:37] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'Cash' @ [491:28] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [491:42] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'Cash' @ [492:28] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Exit' @ [492:42] ==> public constructor Exit(amount: Amount<Issued<Currency>>) defined in net.corda.finance.contracts.asset.Cash.Commands.Exit[DeserializedClassConstructorDescriptor]

'Amount' @ [492:47] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'Issued' @ [492:61] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'MEGA_CORP' @ [492:68] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [492:78] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'USD' @ [492:86] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'assertEquals' @ [494:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<CommandData>, actual: List<CommandData>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<CommandData>

'listOf' @ [494:22] ==> public fun <T> listOf(vararg elements: CommandData): List<CommandData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CommandData

'expectedMove' @ [494:29] ==> val expectedMove: Cash.Commands.Move defined in net.corda.finance.contracts.asset.CashTests.generateSimpleExit[LocalVariableDescriptor]

'expectedExit' @ [494:43] ==> val expectedExit: Cash.Commands.Exit defined in net.corda.finance.contracts.asset.CashTests.generateSimpleExit[LocalVariableDescriptor]

'wtx' @ [494:58] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSimpleExit[LocalVariableDescriptor]

'commands' @ [494:62] ==> public open val commands: List<Command<*>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'map' @ [494:71] ==> public inline fun <T, R> Iterable<Command<*>>.map(transform: (Command<*>) -> CommandData): List<CommandData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<*>
    <R> -> CommandData

'it' @ [494:77] ==> value-parameter it: Command<*> defined in net.corda.finance.contracts.asset.CashTests.generateSimpleExit.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [494:80] ==> public final val value: CommandData defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'Test' @ [500:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [502:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'makeExit' @ [503:19] ==> public final fun makeExit(amount: Amount<Currency>, corp: Party, depositRef: Byte = ...): WireTransaction defined in net.corda.finance.contracts.asset.CashTests[SimpleFunctionDescriptorImpl]

'DOLLARS' @ [503:31] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [503:40] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'assertEquals' @ [504:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateRef, actual: StateRef, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateRef

'WALLET' @ [504:22] ==> public final val WALLET: List<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'ref' @ [504:32] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'wtx' @ [504:37] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generatePartialExit[LocalVariableDescriptor]

'inputs' @ [504:41] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'assertEquals' @ [505:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'wtx' @ [505:25] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generatePartialExit[LocalVariableDescriptor]

'outputs' @ [505:29] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'size' @ [505:37] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [506:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ContractState, actual: ContractState, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ContractState

'WALLET' @ [506:22] ==> public final val WALLET: List<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'state' @ [506:32] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [506:38] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'copy' @ [506:43] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'WALLET' @ [506:57] ==> public final val WALLET: List<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'state' @ [506:67] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [506:73] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [506:78] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'splitEvenly' @ [506:85] ==> public final fun splitEvenly(partitions: Int): List<Amount<Issued<Currency>>> defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'first' @ [506:100] ==> public fun <T> List<Amount<Issued<Currency>>>.first(): Amount<Issued<Currency>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Amount<Issued<Currency>>

'wtx' @ [506:110] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generatePartialExit[LocalVariableDescriptor]

'getOutput' @ [506:114] ==> public final fun getOutput(index: Int): ContractState defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'Test' @ [512:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [514:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [515:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): InsufficientBalanceException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> InsufficientBalanceException

'makeExit' @ [515:57] ==> public final fun makeExit(amount: Amount<Currency>, corp: Party, depositRef: Byte = ...): WireTransaction defined in net.corda.finance.contracts.asset.CashTests[SimpleFunctionDescriptorImpl]

'POUNDS' @ [515:70] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [515:78] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Test' @ [521:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [523:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [524:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): InsufficientBalanceException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> InsufficientBalanceException

'makeExit' @ [524:57] ==> public final fun makeExit(amount: Amount<Currency>, corp: Party, depositRef: Byte = ...): WireTransaction defined in net.corda.finance.contracts.asset.CashTests[SimpleFunctionDescriptorImpl]

'POUNDS' @ [524:70] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [524:78] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Test' @ [530:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [532:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [533:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): InsufficientBalanceException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> InsufficientBalanceException

'makeExit' @ [533:57] ==> public final fun makeExit(amount: Amount<Currency>, corp: Party, depositRef: Byte = ...): WireTransaction defined in net.corda.finance.contracts.asset.CashTests[SimpleFunctionDescriptorImpl]

'DOLLARS' @ [533:71] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [533:80] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Test' @ [539:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [541:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [542:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): InsufficientBalanceException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> InsufficientBalanceException

'makeExit' @ [542:57] ==> public final fun makeExit(amount: Amount<Currency>, corp: Party, depositRef: Byte = ...): WireTransaction defined in net.corda.finance.contracts.asset.CashTests[SimpleFunctionDescriptorImpl]

'POUNDS' @ [542:70] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'CHARLIE' @ [542:78] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Test' @ [548:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [550:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [551:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): InsufficientBalanceException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> InsufficientBalanceException

'TransactionBuilder' @ [552:22] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [552:41] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [553:13] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[DeserializedClassConstructorDescriptor]

'generateExit' @ [553:20] ==> public final fun generateExit(tx: TransactionBuilder, amountIssued: Amount<Issued<Currency>>, assetStates: List<StateAndRef<Cash.State>>): Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash[DeserializedSimpleFunctionDescriptor]

'tx' @ [553:33] ==> val tx: TransactionBuilder defined in net.corda.finance.contracts.asset.CashTests.generateExitWithEmptyVault.<anonymous>[LocalVariableDescriptor]

'Amount' @ [553:37] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'Issued' @ [553:49] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'CHARLIE' @ [553:56] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [553:64] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'GBP' @ [553:72] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'emptyList' @ [553:79] ==> public fun <T> emptyList(): List<StateAndRef<Cash.State>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'Test' @ [557:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [559:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'database' @ [561:12] ==> public final lateinit var database: CordaPersistence defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'transaction' @ [561:21] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> WireTransaction): WireTransaction defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'makeSpend' @ [562:17] ==> public final fun makeSpend(amount: Amount<Currency>, dest: AbstractParty): WireTransaction defined in net.corda.finance.contracts.asset.CashTests[SimpleFunctionDescriptorImpl]

'DOLLARS' @ [562:31] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'THEIR_IDENTITY_1' @ [562:40] ==> public final val THEIR_IDENTITY_1: AnonymousParty defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'database' @ [564:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'transaction' @ [564:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'Suppress' @ [565:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'vaultStatesUnconsumed' @ [566:30] ==> public final lateinit var vaultStatesUnconsumed: List<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'elementAt' @ [566:52] ==> @InlineOnly public inline fun <T> List<StateAndRef<Cash.State>>.elementAt(index: Int): StateAndRef<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'assertEquals' @ [567:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateRef, actual: StateRef, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateRef

'vaultState' @ [567:26] ==> val vaultState: StateAndRef<Cash.State> defined in net.corda.finance.contracts.asset.CashTests.generateSimpleDirectSpend.<anonymous>[LocalVariableDescriptor]

'ref' @ [567:37] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'wtx' @ [567:42] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSimpleDirectSpend[LocalVariableDescriptor]

'inputs' @ [567:46] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'assertEquals' @ [568:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ContractState, actual: ContractState, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ContractState

'vaultState' @ [568:26] ==> val vaultState: StateAndRef<Cash.State> defined in net.corda.finance.contracts.asset.CashTests.generateSimpleDirectSpend.<anonymous>[LocalVariableDescriptor]

'state' @ [568:37] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [568:43] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'copy' @ [568:48] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'THEIR_IDENTITY_1' @ [568:61] ==> public final val THEIR_IDENTITY_1: AnonymousParty defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'wtx' @ [568:80] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSimpleDirectSpend[LocalVariableDescriptor]

'getOutput' @ [568:84] ==> public final fun getOutput(index: Int): ContractState defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [569:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: PublicKey, actual: PublicKey, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PublicKey

'OUR_IDENTITY_1' @ [569:26] ==> public final val OUR_IDENTITY_1: AbstractParty defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'owningKey' @ [569:41] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'wtx' @ [569:52] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSimpleDirectSpend[LocalVariableDescriptor]

'commands' @ [569:56] ==> public open val commands: List<Command<*>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'single' @ [569:65] ==> public inline fun <T> Iterable<Command<*>>.single(predicate: (Command<*>) -> Boolean): Command<*> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<*>

'it' @ [569:74] ==> value-parameter it: Command<*> defined in net.corda.finance.contracts.asset.CashTests.generateSimpleDirectSpend.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [569:77] ==> public final val value: CommandData defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'signers' @ [569:107] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'Test' @ [573:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [575:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'database' @ [576:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'transaction' @ [576:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'TransactionBuilder' @ [578:22] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [578:41] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [579:13] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'generateSpend' @ [579:18] ==> @JvmStatic @Suspendable public final fun generateSpend(services: ServiceHub, tx: TransactionBuilder, amount: Amount<Currency>, to: AbstractParty, onlyFromParties: Set<AbstractParty> = ...): Pair<TransactionBuilder, List<PublicKey>> defined in net.corda.finance.contracts.asset.Cash.Companion[DeserializedSimpleFunctionDescriptor]

'miniCorpServices' @ [579:32] ==> public final lateinit var miniCorpServices: MockServices defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'tx' @ [579:50] ==> val tx: TransactionBuilder defined in net.corda.finance.contracts.asset.CashTests.generateSimpleSpendWithParties.<anonymous>[LocalVariableDescriptor]

'DOLLARS' @ [579:57] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'ALICE' @ [579:66] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'setOf' @ [579:73] ==> public fun <T> setOf(element: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'MINI_CORP' @ [579:79] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'assertEquals' @ [581:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateRef, actual: StateRef, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateRef

'vaultStatesUnconsumed' @ [581:26] ==> public final lateinit var vaultStatesUnconsumed: List<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'elementAt' @ [581:48] ==> @InlineOnly public inline fun <T> List<StateAndRef<Cash.State>>.elementAt(index: Int): StateAndRef<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'ref' @ [581:61] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'tx' @ [581:66] ==> val tx: TransactionBuilder defined in net.corda.finance.contracts.asset.CashTests.generateSimpleSpendWithParties.<anonymous>[LocalVariableDescriptor]

'inputStates' @ [581:69] ==> public final fun inputStates(): List<StateRef> defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'Test' @ [585:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [587:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'database' @ [589:13] ==> public final lateinit var database: CordaPersistence defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'transaction' @ [589:22] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> WireTransaction): WireTransaction defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'makeSpend' @ [590:17] ==> public final fun makeSpend(amount: Amount<Currency>, dest: AbstractParty): WireTransaction defined in net.corda.finance.contracts.asset.CashTests[SimpleFunctionDescriptorImpl]

'DOLLARS' @ [590:30] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'THEIR_IDENTITY_1' @ [590:39] ==> public final val THEIR_IDENTITY_1: AnonymousParty defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'database' @ [592:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'transaction' @ [592:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'Suppress' @ [593:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'vaultStatesUnconsumed' @ [594:30] ==> public final lateinit var vaultStatesUnconsumed: List<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'elementAt' @ [594:52] ==> @InlineOnly public inline fun <T> List<StateAndRef<Cash.State>>.elementAt(index: Int): StateAndRef<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'assertEquals' @ [595:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateRef, actual: StateRef, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateRef

'vaultState' @ [595:26] ==> val vaultState: StateAndRef<Cash.State> defined in net.corda.finance.contracts.asset.CashTests.generateSimpleSpendWithChange.<anonymous>[LocalVariableDescriptor]

'ref' @ [595:37] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'wtx' @ [595:42] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSimpleSpendWithChange[LocalVariableDescriptor]

'inputs' @ [595:46] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'assertEquals' @ [596:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ContractState, actual: ContractState, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ContractState

'vaultState' @ [596:26] ==> val vaultState: StateAndRef<Cash.State> defined in net.corda.finance.contracts.asset.CashTests.generateSimpleSpendWithChange.<anonymous>[LocalVariableDescriptor]

'state' @ [596:37] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [596:43] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'copy' @ [596:48] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'THEIR_IDENTITY_1' @ [596:61] ==> public final val THEIR_IDENTITY_1: AnonymousParty defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'`issued by`' @ [596:88] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [596:91] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [596:111] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'wtx' @ [596:127] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSimpleSpendWithChange[LocalVariableDescriptor]

'outputs' @ [596:131] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'data' @ [596:142] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'assertEquals' @ [597:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ContractState, actual: ContractState, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ContractState

'vaultState' @ [597:26] ==> val vaultState: StateAndRef<Cash.State> defined in net.corda.finance.contracts.asset.CashTests.generateSimpleSpendWithChange.<anonymous>[LocalVariableDescriptor]

'state' @ [597:37] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [597:43] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'copy' @ [597:48] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'`issued by`' @ [597:62] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [597:65] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [597:85] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'wtx' @ [597:101] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSimpleSpendWithChange[LocalVariableDescriptor]

'outputs' @ [597:105] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'data' @ [597:116] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'assertEquals' @ [598:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: PublicKey, actual: PublicKey, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PublicKey

'OUR_IDENTITY_1' @ [598:26] ==> public final val OUR_IDENTITY_1: AbstractParty defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'owningKey' @ [598:41] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'wtx' @ [598:52] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSimpleSpendWithChange[LocalVariableDescriptor]

'commands' @ [598:56] ==> public open val commands: List<Command<*>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'single' @ [598:65] ==> public inline fun <T> Iterable<Command<*>>.single(predicate: (Command<*>) -> Boolean): Command<*> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<*>

'it' @ [598:74] ==> value-parameter it: Command<*> defined in net.corda.finance.contracts.asset.CashTests.generateSimpleSpendWithChange.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [598:77] ==> public final val value: CommandData defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'signers' @ [598:107] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'Test' @ [602:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [604:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'database' @ [606:13] ==> public final lateinit var database: CordaPersistence defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'transaction' @ [606:22] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> WireTransaction): WireTransaction defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'makeSpend' @ [607:17] ==> public final fun makeSpend(amount: Amount<Currency>, dest: AbstractParty): WireTransaction defined in net.corda.finance.contracts.asset.CashTests[SimpleFunctionDescriptorImpl]

'DOLLARS' @ [607:31] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'THEIR_IDENTITY_1' @ [607:40] ==> public final val THEIR_IDENTITY_1: AnonymousParty defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'database' @ [609:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'transaction' @ [609:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'Suppress' @ [610:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'vaultStatesUnconsumed' @ [611:31] ==> public final lateinit var vaultStatesUnconsumed: List<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'elementAt' @ [611:53] ==> @InlineOnly public inline fun <T> List<StateAndRef<Cash.State>>.elementAt(index: Int): StateAndRef<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'vaultStatesUnconsumed' @ [612:31] ==> public final lateinit var vaultStatesUnconsumed: List<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'elementAt' @ [612:53] ==> @InlineOnly public inline fun <T> List<StateAndRef<Cash.State>>.elementAt(index: Int): StateAndRef<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'assertEquals' @ [613:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateRef, actual: StateRef, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateRef

'vaultState0' @ [613:26] ==> val vaultState0: StateAndRef<Cash.State> defined in net.corda.finance.contracts.asset.CashTests.generateSpendWithTwoInputs.<anonymous>[LocalVariableDescriptor]

'ref' @ [613:38] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'wtx' @ [613:43] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSpendWithTwoInputs[LocalVariableDescriptor]

'inputs' @ [613:47] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'assertEquals' @ [614:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateRef, actual: StateRef, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateRef

'vaultState1' @ [614:26] ==> val vaultState1: StateAndRef<Cash.State> defined in net.corda.finance.contracts.asset.CashTests.generateSpendWithTwoInputs.<anonymous>[LocalVariableDescriptor]

'ref' @ [614:38] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'wtx' @ [614:43] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSpendWithTwoInputs[LocalVariableDescriptor]

'inputs' @ [614:47] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'assertEquals' @ [615:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ContractState, actual: ContractState, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ContractState

'vaultState0' @ [615:26] ==> val vaultState0: StateAndRef<Cash.State> defined in net.corda.finance.contracts.asset.CashTests.generateSpendWithTwoInputs.<anonymous>[LocalVariableDescriptor]

'state' @ [615:38] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [615:44] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'copy' @ [615:49] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'THEIR_IDENTITY_1' @ [615:62] ==> public final val THEIR_IDENTITY_1: AnonymousParty defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'`issued by`' @ [615:89] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [615:93] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [615:113] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'wtx' @ [615:129] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSpendWithTwoInputs[LocalVariableDescriptor]

'getOutput' @ [615:133] ==> public final fun getOutput(index: Int): ContractState defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [616:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: PublicKey, actual: PublicKey, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PublicKey

'OUR_IDENTITY_1' @ [616:26] ==> public final val OUR_IDENTITY_1: AbstractParty defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'owningKey' @ [616:41] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'wtx' @ [616:52] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSpendWithTwoInputs[LocalVariableDescriptor]

'commands' @ [616:56] ==> public open val commands: List<Command<*>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'single' @ [616:65] ==> public inline fun <T> Iterable<Command<*>>.single(predicate: (Command<*>) -> Boolean): Command<*> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<*>

'it' @ [616:74] ==> value-parameter it: Command<*> defined in net.corda.finance.contracts.asset.CashTests.generateSpendWithTwoInputs.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [616:77] ==> public final val value: CommandData defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'signers' @ [616:107] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'Test' @ [620:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [622:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'database' @ [624:13] ==> public final lateinit var database: CordaPersistence defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'transaction' @ [624:22] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> WireTransaction): WireTransaction defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'makeSpend' @ [625:27] ==> public final fun makeSpend(amount: Amount<Currency>, dest: AbstractParty): WireTransaction defined in net.corda.finance.contracts.asset.CashTests[SimpleFunctionDescriptorImpl]

'DOLLARS' @ [625:41] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'THEIR_IDENTITY_1' @ [625:50] ==> public final val THEIR_IDENTITY_1: AnonymousParty defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'assertEquals' @ [626:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'wtx' @ [626:33] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSpendMixedDeposits.<anonymous>[LocalVariableDescriptor]

'inputs' @ [626:37] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'size' @ [626:44] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'wtx' @ [627:17] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSpendMixedDeposits.<anonymous>[LocalVariableDescriptor]

'database' @ [629:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'transaction' @ [629:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'Suppress' @ [630:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'vaultStatesUnconsumed' @ [631:31] ==> public final lateinit var vaultStatesUnconsumed: List<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'elementAt' @ [631:53] ==> @InlineOnly public inline fun <T> List<StateAndRef<Cash.State>>.elementAt(index: Int): StateAndRef<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'vaultStatesUnconsumed' @ [632:31] ==> public final lateinit var vaultStatesUnconsumed: List<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'elementAt' @ [632:53] ==> @InlineOnly public inline fun <T> List<StateAndRef<Cash.State>>.elementAt(index: Int): StateAndRef<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'Suppress' @ [633:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'vaultStatesUnconsumed' @ [634:31] ==> public final lateinit var vaultStatesUnconsumed: List<StateAndRef<Cash.State>> defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'elementAt' @ [634:53] ==> @InlineOnly public inline fun <T> List<StateAndRef<Cash.State>>.elementAt(index: Int): StateAndRef<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'assertEquals' @ [635:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateRef, actual: StateRef, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateRef

'vaultState0' @ [635:26] ==> val vaultState0: StateAndRef<Cash.State> defined in net.corda.finance.contracts.asset.CashTests.generateSpendMixedDeposits.<anonymous>[LocalVariableDescriptor]

'ref' @ [635:38] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'wtx' @ [635:43] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSpendMixedDeposits[LocalVariableDescriptor]

'inputs' @ [635:47] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'assertEquals' @ [636:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateRef, actual: StateRef, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateRef

'vaultState1' @ [636:26] ==> val vaultState1: StateAndRef<Cash.State> defined in net.corda.finance.contracts.asset.CashTests.generateSpendMixedDeposits.<anonymous>[LocalVariableDescriptor]

'ref' @ [636:38] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'wtx' @ [636:43] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSpendMixedDeposits[LocalVariableDescriptor]

'inputs' @ [636:47] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'assertEquals' @ [637:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateRef, actual: StateRef, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateRef

'vaultState2' @ [637:26] ==> val vaultState2: StateAndRef<Cash.State> defined in net.corda.finance.contracts.asset.CashTests.generateSpendMixedDeposits.<anonymous>[LocalVariableDescriptor]

'ref' @ [637:38] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'wtx' @ [637:43] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSpendMixedDeposits[LocalVariableDescriptor]

'inputs' @ [637:47] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'assertEquals' @ [638:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ContractState, actual: ContractState, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ContractState

'vaultState0' @ [638:26] ==> val vaultState0: StateAndRef<Cash.State> defined in net.corda.finance.contracts.asset.CashTests.generateSpendMixedDeposits.<anonymous>[LocalVariableDescriptor]

'state' @ [638:38] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [638:44] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'copy' @ [638:49] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'THEIR_IDENTITY_1' @ [638:62] ==> public final val THEIR_IDENTITY_1: AnonymousParty defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'`issued by`' @ [638:89] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [638:93] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [638:113] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'wtx' @ [638:129] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSpendMixedDeposits[LocalVariableDescriptor]

'outputs' @ [638:133] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'data' @ [638:144] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'assertEquals' @ [639:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ContractState, actual: ContractState, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ContractState

'vaultState2' @ [639:26] ==> val vaultState2: StateAndRef<Cash.State> defined in net.corda.finance.contracts.asset.CashTests.generateSpendMixedDeposits.<anonymous>[LocalVariableDescriptor]

'state' @ [639:38] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [639:44] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'copy' @ [639:49] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'THEIR_IDENTITY_1' @ [639:62] ==> public final val THEIR_IDENTITY_1: AnonymousParty defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'wtx' @ [639:81] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSpendMixedDeposits[LocalVariableDescriptor]

'getOutput' @ [639:85] ==> public final fun getOutput(index: Int): ContractState defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [640:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: PublicKey, actual: PublicKey, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PublicKey

'OUR_IDENTITY_1' @ [640:26] ==> public final val OUR_IDENTITY_1: AbstractParty defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'owningKey' @ [640:41] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'wtx' @ [640:52] ==> val wtx: WireTransaction defined in net.corda.finance.contracts.asset.CashTests.generateSpendMixedDeposits[LocalVariableDescriptor]

'commands' @ [640:56] ==> public open val commands: List<Command<*>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'single' @ [640:65] ==> public inline fun <T> Iterable<Command<*>>.single(predicate: (Command<*>) -> Boolean): Command<*> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<*>

'it' @ [640:74] ==> value-parameter it: Command<*> defined in net.corda.finance.contracts.asset.CashTests.generateSpendMixedDeposits.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [640:77] ==> public final val value: CommandData defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'signers' @ [640:107] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'Test' @ [644:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'initialiseTestSerialization' @ [646:9] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'database' @ [647:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'transaction' @ [647:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> InsufficientBalanceException): InsufficientBalanceException defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InsufficientBalanceException

'assertFailsWith' @ [649:51] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): InsufficientBalanceException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> InsufficientBalanceException

'makeSpend' @ [650:17] ==> public final fun makeSpend(amount: Amount<Currency>, dest: AbstractParty): WireTransaction defined in net.corda.finance.contracts.asset.CashTests[SimpleFunctionDescriptorImpl]

'DOLLARS' @ [650:32] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'THEIR_IDENTITY_1' @ [650:41] ==> public final val THEIR_IDENTITY_1: AnonymousParty defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'assertEquals' @ [652:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<out Any>, actual: Amount<out Any>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<out Any>

'-' @ [652:27] ==> public final operator fun minus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [652:39] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'e' @ [652:48] ==> val e: InsufficientBalanceException defined in net.corda.finance.contracts.asset.CashTests.generateSpendInsufficientBalance.<anonymous>[LocalVariableDescriptor]

'amountMissing' @ [652:50] ==> public final val amountMissing: Amount<*> defined in net.corda.core.contracts.InsufficientBalanceException[DeserializedPropertyDescriptor]

'assertFailsWith' @ [654:13] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<InsufficientBalanceException>, block: () -> Unit): InsufficientBalanceException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> InsufficientBalanceException

'InsufficientBalanceException' @ [654:29] ==> public constructor InsufficientBalanceException(amountMissing: Amount<*>) defined in net.corda.core.contracts.InsufficientBalanceException[DeserializedClassConstructorDescriptor]

'makeSpend' @ [655:17] ==> public final fun makeSpend(amount: Amount<Currency>, dest: AbstractParty): WireTransaction defined in net.corda.finance.contracts.asset.CashTests[SimpleFunctionDescriptorImpl]

'SWISS_FRANCS' @ [655:30] ==> public val Int.SWISS_FRANCS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'THEIR_IDENTITY_1' @ [655:44] ==> public final val THEIR_IDENTITY_1: AnonymousParty defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'Test' @ [663:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'Cash' @ [665:43] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [665:48] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'`issued by`' @ [665:54] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [665:59] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [665:79] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [665:89] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP' @ [665:97] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [666:42] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [666:47] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'`issued by`' @ [666:53] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [666:58] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [666:78] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [666:88] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'MINI_CORP' @ [666:96] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [667:42] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [667:47] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'`issued by`' @ [667:53] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [667:58] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MINI_CORP' @ [667:78] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [667:88] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP' @ [667:96] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'assertEquals' @ [670:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Issued<Currency>, actual: Issued<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Issued<Currency>

'fiveThousandDollarsFromMega' @ [670:22] ==> val fiveThousandDollarsFromMega: Cash.State defined in net.corda.finance.contracts.asset.CashTests.aggregation[LocalVariableDescriptor]

'amount' @ [670:50] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [670:57] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'fiveThousandDollarsFromMega' @ [670:64] ==> val fiveThousandDollarsFromMega: Cash.State defined in net.corda.finance.contracts.asset.CashTests.aggregation[LocalVariableDescriptor]

'amount' @ [670:92] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [670:99] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'assertEquals' @ [673:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Issued<Currency>, actual: Issued<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Issued<Currency>

'fiveThousandDollarsFromMega' @ [673:22] ==> val fiveThousandDollarsFromMega: Cash.State defined in net.corda.finance.contracts.asset.CashTests.aggregation[LocalVariableDescriptor]

'amount' @ [673:50] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [673:57] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'twoThousandDollarsFromMega' @ [673:64] ==> val twoThousandDollarsFromMega: Cash.State defined in net.corda.finance.contracts.asset.CashTests.aggregation[LocalVariableDescriptor]

'amount' @ [673:91] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [673:98] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'assertNotEquals' @ [676:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: Issued<Currency>, actual: Issued<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Issued<Currency>

'fiveThousandDollarsFromMega' @ [676:25] ==> val fiveThousandDollarsFromMega: Cash.State defined in net.corda.finance.contracts.asset.CashTests.aggregation[LocalVariableDescriptor]

'amount' @ [676:53] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [676:60] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'oneThousandDollarsFromMini' @ [676:67] ==> val oneThousandDollarsFromMini: Cash.State defined in net.corda.finance.contracts.asset.CashTests.aggregation[LocalVariableDescriptor]

'amount' @ [676:94] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [676:101] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'assertNotEquals' @ [677:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: Issued<Currency>, actual: Issued<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Issued<Currency>

'twoThousandDollarsFromMega' @ [677:25] ==> val twoThousandDollarsFromMega: Cash.State defined in net.corda.finance.contracts.asset.CashTests.aggregation[LocalVariableDescriptor]

'amount' @ [677:52] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [677:59] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'oneThousandDollarsFromMini' @ [677:66] ==> val oneThousandDollarsFromMini: Cash.State defined in net.corda.finance.contracts.asset.CashTests.aggregation[LocalVariableDescriptor]

'amount' @ [677:93] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [677:100] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'assertNotEquals' @ [680:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: Issued<Currency>, actual: Issued<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Issued<Currency>

'oneThousandDollarsFromMini' @ [680:25] ==> val oneThousandDollarsFromMini: Cash.State defined in net.corda.finance.contracts.asset.CashTests.aggregation[LocalVariableDescriptor]

'amount' @ [680:52] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [680:59] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'Cash' @ [681:17] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [681:22] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'`issued by`' @ [681:28] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'POUNDS' @ [681:33] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MINI_CORP' @ [681:52] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [681:62] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP' @ [681:70] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'amount' @ [681:81] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [681:88] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'assertNotEquals' @ [684:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: Issued<Currency>, actual: Issued<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Issued<Currency>

'fiveThousandDollarsFromMega' @ [684:25] ==> val fiveThousandDollarsFromMega: Cash.State defined in net.corda.finance.contracts.asset.CashTests.aggregation[LocalVariableDescriptor]

'amount' @ [684:53] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [684:60] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'fiveThousandDollarsFromMega' @ [684:68] ==> val fiveThousandDollarsFromMega: Cash.State defined in net.corda.finance.contracts.asset.CashTests.aggregation[LocalVariableDescriptor]

'defaultIssuer' @ [684:111] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'amount' @ [684:126] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [684:133] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'assertNotEquals' @ [685:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: Issued<Currency>, actual: Issued<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Issued<Currency>

'fiveThousandDollarsFromMega' @ [685:26] ==> val fiveThousandDollarsFromMega: Cash.State defined in net.corda.finance.contracts.asset.CashTests.aggregation[LocalVariableDescriptor]

'defaultIssuer' @ [685:69] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'amount' @ [685:84] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [685:91] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'fiveThousandDollarsFromMega' @ [685:98] ==> val fiveThousandDollarsFromMega: Cash.State defined in net.corda.finance.contracts.asset.CashTests.aggregation[LocalVariableDescriptor]

'amount' @ [685:126] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [685:133] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'Test' @ [688:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [690:22] ==> public fun <T> listOf(vararg elements: Cash.State): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'Cash' @ [691:17] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [691:22] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'`issued by`' @ [691:28] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [691:33] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [691:53] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'MINI_CORP' @ [691:68] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [692:17] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [692:22] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'`issued by`' @ [692:28] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [692:33] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [692:53] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'MEGA_CORP' @ [692:68] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [693:17] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [693:22] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'`issued by`' @ [693:28] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [693:33] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [693:53] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'MEGA_CORP' @ [693:68] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'assertEquals' @ [695:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Issued<Currency>>, actual: Amount<Issued<Currency>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Issued<Currency>>

'`issued by`' @ [695:22] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [695:27] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [695:47] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'states' @ [695:62] ==> val states: List<Cash.State> defined in net.corda.finance.contracts.asset.CashTests.`summing by owner`[LocalVariableDescriptor]

'sumCashBy' @ [695:69] ==> public fun Iterable<ContractState>.sumCashBy(owner: AbstractParty): Amount<Issued<Currency>> defined in net.corda.finance.utils[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP' @ [695:79] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Test' @ [698:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'UnsupportedOperationException' @ [698:22] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'listOf' @ [700:22] ==> public fun <T> listOf(vararg elements: Cash.State): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'Cash' @ [701:17] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [701:22] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'`issued by`' @ [701:28] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [701:33] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [701:53] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'MEGA_CORP' @ [701:68] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [702:17] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [702:22] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'`issued by`' @ [702:28] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [702:33] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [702:53] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'MEGA_CORP' @ [702:68] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'states' @ [704:9] ==> val states: List<Cash.State> defined in net.corda.finance.contracts.asset.CashTests.`summing by owner throws`[LocalVariableDescriptor]

'sumCashBy' @ [704:16] ==> public fun Iterable<ContractState>.sumCashBy(owner: AbstractParty): Amount<Issued<Currency>> defined in net.corda.finance.utils[DeserializedSimpleFunctionDescriptor]

'MINI_CORP' @ [704:26] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Test' @ [707:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'emptyList' @ [709:22] ==> public fun <T> emptyList(): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'assertEquals' @ [710:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Issued<Currency>>, actual: Amount<Issued<Currency>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Issued<Currency>>

'`issued by`' @ [710:22] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'POUNDS' @ [710:24] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [710:43] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'states' @ [710:58] ==> val states: List<Cash.State> defined in net.corda.finance.contracts.asset.CashTests.`summing no currencies`[LocalVariableDescriptor]

'sumCashOrZero' @ [710:65] ==> public fun Iterable<ContractState>.sumCashOrZero(currency: Issued<Currency>): Amount<Issued<Currency>> defined in net.corda.finance.utils[DeserializedSimpleFunctionDescriptor]

'GBP' @ [710:79] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [710:95] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'assertNull' @ [711:9] ==> public fun assertNull(actual: Any?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'states' @ [711:20] ==> val states: List<Cash.State> defined in net.corda.finance.contracts.asset.CashTests.`summing no currencies`[LocalVariableDescriptor]

'sumCashOrNull' @ [711:27] ==> public fun Iterable<ContractState>.sumCashOrNull(): Amount<Issued<Currency>>? defined in net.corda.finance.utils[DeserializedSimpleFunctionDescriptor]

'Test' @ [714:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'UnsupportedOperationException' @ [714:22] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'emptyList' @ [716:22] ==> public fun <T> emptyList(): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'states' @ [717:9] ==> val states: List<Cash.State> defined in net.corda.finance.contracts.asset.CashTests.`summing no currencies throws`[LocalVariableDescriptor]

'sumCash' @ [717:16] ==> public fun Iterable<ContractState>.sumCash(): Amount<Issued<Currency>> defined in net.corda.finance.utils[DeserializedSimpleFunctionDescriptor]

'Test' @ [720:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [722:22] ==> public fun <T> listOf(vararg elements: Cash.State): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'Cash' @ [723:17] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [723:22] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'`issued by`' @ [723:28] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [723:33] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [723:53] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'MEGA_CORP' @ [723:68] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [724:17] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [724:22] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'`issued by`' @ [724:28] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [724:33] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [724:53] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'MEGA_CORP' @ [724:68] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [725:17] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [725:22] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'`issued by`' @ [725:28] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [725:33] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [725:53] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'MEGA_CORP' @ [725:68] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'`issued by`' @ [728:24] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [728:29] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [728:49] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'states' @ [729:22] ==> val states: List<Cash.State> defined in net.corda.finance.contracts.asset.CashTests.`summing a single currency`[LocalVariableDescriptor]

'sumCash' @ [729:29] ==> public fun Iterable<ContractState>.sumCash(): Amount<Issued<Currency>> defined in net.corda.finance.utils[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [730:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Issued<Currency>>, actual: Amount<Issued<Currency>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Issued<Currency>>

'expected' @ [730:22] ==> val expected: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.CashTests.`summing a single currency`[LocalVariableDescriptor]

'actual' @ [730:32] ==> val actual: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.CashTests.`summing a single currency`[LocalVariableDescriptor]

'Test' @ [733:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'IllegalArgumentException' @ [733:22] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'listOf' @ [735:22] ==> public fun <T> listOf(vararg elements: Cash.State): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'Cash' @ [736:17] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [736:22] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'`issued by`' @ [736:28] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [736:33] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [736:53] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'MEGA_CORP' @ [736:68] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [737:17] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [737:22] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'`issued by`' @ [737:28] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'POUNDS' @ [737:33] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'defaultIssuer' @ [737:52] ==> public final val defaultIssuer: PartyAndReference defined in net.corda.finance.contracts.asset.CashTests[PropertyDescriptorImpl]

'MEGA_CORP' @ [737:67] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'states' @ [740:9] ==> val states: List<Cash.State> defined in net.corda.finance.contracts.asset.CashTests.`summing multiple currencies`[LocalVariableDescriptor]

'sumCash' @ [740:16] ==> public fun Iterable<ContractState>.sumCash(): Amount<Issued<Currency>> defined in net.corda.finance.utils[DeserializedSimpleFunctionDescriptor]

'Test' @ [744:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'ledger' @ [746:9] ==> @JvmOverloads public fun ledger(services: ServiceHub = ..., initialiseSerialization: Boolean = ..., dsl: LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter>.() -> Unit): LedgerDSL<TestTransactionDSLInterpreter, TestLedgerDSLInterpreter> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'unverifiedTransaction' @ [747:13] ==> @JvmOverloads public final fun unverifiedTransaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> Unit): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [748:17] ==> @JvmOverloads public final fun output(label: String? = ..., notary: Party = ..., encumbrance: Int? = ..., contractStateClosure: () -> ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'Cash' @ [749:21] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [749:26] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'`issued by`' @ [750:38] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [750:43] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [750:63] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [750:73] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP' @ [751:37] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'transaction' @ [756:13] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [757:17] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [758:17] ==> public final fun output(contractState: ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [758:42] ==> public final inline fun <reified S : ContractState> String.output(): ContractState defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified S : ContractState> -> ContractState

'copy' @ [758:78] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [758:91] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'ALICE_PUBKEY' @ [758:106] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'command' @ [759:17] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [759:25] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [759:45] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [759:59] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [760:17] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.chainCashDoubleSpendFailsWith.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [760:22] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'tweak' @ [763:13] ==> public open fun tweak(dsl: LedgerDSL<TransactionDSLInterpreter, LedgerDSLInterpreter<TransactionDSLInterpreter>>.() -> Unit): Unit defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'transaction' @ [764:17] ==> @JvmOverloads public final fun transaction(label: String? = ..., transactionBuilder: TransactionBuilder = ..., dsl: TransactionDSL<TransactionDSLInterpreter>.() -> EnforceVerifyOrFail): WireTransaction defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'input' @ [765:21] ==> public final fun input(stateLabel: String): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [767:21] ==> public final fun output(contractState: ContractState): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'output' @ [767:46] ==> public final inline fun <reified S : ContractState> String.output(): ContractState defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified S : ContractState> -> ContractState

'copy' @ [767:82] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owner: AbstractParty = ...): Cash.State defined in net.corda.finance.contracts.asset.Cash.State[DeserializedSimpleFunctionDescriptor]

'ALICE' @ [767:95] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'command' @ [768:21] ==> public final fun command(vararg signers: PublicKey, commandDataClosure: () -> CommandData): Unit defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP_PUBKEY' @ [768:29] ==> public val MEGA_CORP_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [768:49] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [768:63] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'this' @ [769:21] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.chainCashDoubleSpendFailsWith.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [769:26] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.TransactionDSL[DeserializedSimpleFunctionDescriptor]

'this' @ [771:17] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.chainCashDoubleSpendFailsWith.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'fails' @ [771:22] ==> public open fun fails(): EnforceVerifyOrFail defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

'this' @ [774:13] ==> <this> defined in net.corda.finance.contracts.asset.CashTests.chainCashDoubleSpendFailsWith.<anonymous>[ReceiverParameterDescriptorImpl]

'verifies' @ [774:18] ==> public open fun verifies(): EnforceVerifyOrFail defined in net.corda.testing.LedgerDSL[DeserializedSimpleFunctionDescriptor]

