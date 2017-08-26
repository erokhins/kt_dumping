'TestDependencyInjectionBase' @ [36:27] ==> public constructor TestDependencyInjectionBase() defined in net.corda.testing.TestDependencyInjectionBase[DeserializedClassConstructorDescriptor]

'services' @ [39:37] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'vaultService' @ [39:46] ==> public open val vaultService: VaultService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'services' @ [40:47] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'vaultQueryService' @ [40:56] ==> public open val vaultQueryService: VaultQueryService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'MockServices' @ [42:26] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY_KEY' @ [42:39] ==> public val DUMMY_NOTARY_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'Before' @ [44:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'LogHelper' @ [46:9] ==> public object LogHelper defined in net.corda.testing[FakeCallableDescriptorForObject]

'setLevel' @ [46:19] ==> public final fun setLevel(vararg classes: KClass<*>): Unit defined in net.corda.testing.LogHelper[DeserializedSimpleFunctionDescriptor]

'VaultWithCashTest' @ [46:28] ==> public constructor VaultWithCashTest() defined in net.corda.node.services.vault.VaultWithCashTest[ClassConstructorDescriptorImpl]

'makeTestDatabaseAndMockServices' @ [47:35] ==> public fun makeTestDatabaseAndMockServices(customSchemas: Set<MappedSchema> = ..., keys: List<KeyPair> = ..., createIdentityService: () -> IdentityService = ...): Pair<CordaPersistence, MockServices> defined in net.corda.testing.node[DeserializedSimpleFunctionDescriptor]

'listOf' @ [47:74] ==> public fun <T> listOf(vararg elements: KeyPair): List<KeyPair> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KeyPair

'DUMMY_CASH_ISSUER_KEY' @ [47:81] ==> public val DUMMY_CASH_ISSUER_KEY: KeyPair defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'DUMMY_NOTARY_KEY' @ [47:104] ==> public val DUMMY_NOTARY_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'database' @ [48:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'databaseAndServices' @ [48:20] ==> val databaseAndServices: Pair<CordaPersistence, MockServices> defined in net.corda.node.services.vault.VaultWithCashTest.setUp[LocalVariableDescriptor]

'first' @ [48:40] ==> public final val first: CordaPersistence defined in kotlin.Pair[DeserializedPropertyDescriptor]

'services' @ [49:9] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'databaseAndServices' @ [49:20] ==> val databaseAndServices: Pair<CordaPersistence, MockServices> defined in net.corda.node.services.vault.VaultWithCashTest.setUp[LocalVariableDescriptor]

'second' @ [49:40] ==> public final val second: MockServices defined in kotlin.Pair[DeserializedPropertyDescriptor]

'issuerServices' @ [50:9] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'MockServices' @ [50:26] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'DUMMY_CASH_ISSUER_KEY' @ [50:39] ==> public val DUMMY_CASH_ISSUER_KEY: KeyPair defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'MEGA_CORP_KEY' @ [50:62] ==> public val MEGA_CORP_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'After' @ [53:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'LogHelper' @ [55:9] ==> public object LogHelper defined in net.corda.testing[FakeCallableDescriptorForObject]

'reset' @ [55:19] ==> public final fun reset(vararg classes: KClass<*>): Unit defined in net.corda.testing.LogHelper[DeserializedSimpleFunctionDescriptor]

'VaultWithCashTest' @ [55:25] ==> public constructor VaultWithCashTest() defined in net.corda.node.services.vault.VaultWithCashTest[ClassConstructorDescriptorImpl]

'database' @ [56:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'close' @ [56:18] ==> public open fun close(): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]

'Test' @ [59:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [61:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [61:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<Cash.State>): Vault<Cash.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<State>

'services' @ [63:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [63:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [63:47] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [63:56] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [63:72] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [63:92] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'DUMMY_CASH_ISSUER' @ [63:115] ==> public val DUMMY_CASH_ISSUER: PartyAndReference defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'database' @ [65:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [65:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'vaultQuery' @ [66:21] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [66:32] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [66:54] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'assertEquals' @ [67:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'w' @ [67:29] ==> val w: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.VaultWithCashTest.splits.<anonymous>[LocalVariableDescriptor]

'size' @ [67:31] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'w' @ [69:25] ==> val w: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.VaultWithCashTest.splits.<anonymous>[LocalVariableDescriptor]

'state' @ [69:30] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [69:36] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'assertEquals' @ [70:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Issued<Currency>>, actual: Amount<Issued<Currency>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Issued<Currency>>

'`issued by`' @ [70:26] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [70:32] ==> public val Double.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'DUMMY_CASH_ISSUER' @ [70:52] ==> public val DUMMY_CASH_ISSUER: PartyAndReference defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'state' @ [70:71] ==> val state: Cash.State defined in net.corda.node.services.vault.VaultWithCashTest.splits.<anonymous>[LocalVariableDescriptor]

'amount' @ [70:77] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'assertEquals' @ [71:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (PublicKey..PublicKey?), actual: (PublicKey..PublicKey?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (java.security.PublicKey..java.security.PublicKey?)

'services' @ [71:26] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'key' @ [71:35] ==> public final val key: KeyPair defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'public' @ [71:39] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'state' @ [71:47] ==> val state: Cash.State defined in net.corda.node.services.vault.VaultWithCashTest.splits.<anonymous>[LocalVariableDescriptor]

'owner' @ [71:53] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'owningKey' @ [71:59] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'assertEquals' @ [73:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Issued<Currency>>, actual: Amount<Issued<Currency>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Issued<Currency>>

'`issued by`' @ [73:26] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [73:32] ==> public val Double.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'DUMMY_CASH_ISSUER' @ [73:52] ==> public val DUMMY_CASH_ISSUER: PartyAndReference defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'w' @ [73:72] ==> val w: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.VaultWithCashTest.splits.<anonymous>[LocalVariableDescriptor]

'state' @ [73:77] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [73:83] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [73:89] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'assertEquals' @ [74:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Issued<Currency>>, actual: Amount<Issued<Currency>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Issued<Currency>>

'`issued by`' @ [74:26] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [74:32] ==> public val Double.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'DUMMY_CASH_ISSUER' @ [74:52] ==> public val DUMMY_CASH_ISSUER: PartyAndReference defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'w' @ [74:72] ==> val w: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.VaultWithCashTest.splits.<anonymous>[LocalVariableDescriptor]

'state' @ [74:77] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [74:83] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [74:89] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'Test' @ [78:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'MockServices' @ [80:32] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'MEGA_CORP_KEY' @ [80:45] ==> public val MEGA_CORP_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'services' @ [81:24] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'keyManagementService' @ [81:33] ==> public open val keyManagementService: KeyManagementService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'freshKey' @ [81:54] ==> @Suspendable public abstract fun freshKey(): PublicKey defined in net.corda.core.node.services.KeyManagementService[DeserializedSimpleFunctionDescriptor]

'database' @ [84:13] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [84:22] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SignedTransaction): SignedTransaction defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'TransactionBuilder' @ [86:37] ==> public constructor TransactionBuilder(notary: Party? = ..., lockId: UUID = ..., inputs: MutableList<StateRef> = ..., attachments: MutableList<SecureHash> = ..., outputs: MutableList<TransactionState<ContractState>> = ..., commands: MutableList<Command<*>> = ..., window: TimeWindow? = ..., privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'Cash' @ [87:17] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[DeserializedClassConstructorDescriptor]

'generateIssue' @ [87:24] ==> public final fun generateIssue(tx: TransactionBuilder, amount: Amount<Issued<Currency>>, owner: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash[DeserializedSimpleFunctionDescriptor]

'usefulBuilder' @ [87:38] ==> val usefulBuilder: TransactionBuilder defined in net.corda.node.services.vault.VaultWithCashTest.`issue and spend total correctly and irrelevant ignored`.<anonymous>[LocalVariableDescriptor]

'`issued by`' @ [87:53] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [87:57] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [87:77] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [87:87] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [87:95] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'freshKey' @ [87:110] ==> val freshKey: PublicKey defined in net.corda.node.services.vault.VaultWithCashTest.`issue and spend total correctly and irrelevant ignored`[LocalVariableDescriptor]

'DUMMY_NOTARY' @ [87:121] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpServices' @ [88:17] ==> val megaCorpServices: MockServices defined in net.corda.node.services.vault.VaultWithCashTest.`issue and spend total correctly and irrelevant ignored`[LocalVariableDescriptor]

'signInitialTransaction' @ [88:34] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'usefulBuilder' @ [88:57] ==> val usefulBuilder: TransactionBuilder defined in net.corda.node.services.vault.VaultWithCashTest.`issue and spend total correctly and irrelevant ignored`.<anonymous>[LocalVariableDescriptor]

'database' @ [90:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [90:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertEquals' @ [91:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Currency>, actual: Amount<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Currency>

'DOLLARS' @ [91:28] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'services' @ [91:37] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'getCashBalance' @ [91:46] ==> public fun ServiceHub.getCashBalance(currency: Currency): Amount<Currency> defined in net.corda.finance.contracts[DeserializedSimpleFunctionDescriptor]

'USD' @ [91:61] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'services' @ [92:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'recordTransactions' @ [92:22] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'usefulTX' @ [92:41] ==> val usefulTX: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`issue and spend total correctly and irrelevant ignored`[LocalVariableDescriptor]

'database' @ [95:13] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [95:22] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SignedTransaction): SignedTransaction defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'TransactionBuilder' @ [97:38] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [97:57] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [98:17] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'generateSpend' @ [98:22] ==> @JvmStatic @Suspendable public final fun generateSpend(services: ServiceHub, tx: TransactionBuilder, amount: Amount<Currency>, to: AbstractParty, onlyFromParties: Set<AbstractParty> = ...): Pair<TransactionBuilder, List<PublicKey>> defined in net.corda.finance.contracts.asset.Cash.Companion[DeserializedSimpleFunctionDescriptor]

'services' @ [98:36] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'spendTXBuilder' @ [98:46] ==> val spendTXBuilder: TransactionBuilder defined in net.corda.node.services.vault.VaultWithCashTest.`issue and spend total correctly and irrelevant ignored`.<anonymous>[LocalVariableDescriptor]

'DOLLARS' @ [98:65] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'BOB' @ [98:74] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'services' @ [99:32] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'signInitialTransaction' @ [99:41] ==> public open fun signInitialTransaction(builder: TransactionBuilder, publicKey: PublicKey): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'spendTXBuilder' @ [99:64] ==> val spendTXBuilder: TransactionBuilder defined in net.corda.node.services.vault.VaultWithCashTest.`issue and spend total correctly and irrelevant ignored`.<anonymous>[LocalVariableDescriptor]

'freshKey' @ [99:80] ==> val freshKey: PublicKey defined in net.corda.node.services.vault.VaultWithCashTest.`issue and spend total correctly and irrelevant ignored`[LocalVariableDescriptor]

'notaryServices' @ [100:17] ==> public final val notaryServices: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'addSignature' @ [100:32] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'spendPTX' @ [100:45] ==> val spendPTX: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`issue and spend total correctly and irrelevant ignored`.<anonymous>[LocalVariableDescriptor]

'database' @ [102:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [102:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertEquals' @ [103:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Currency>, actual: Amount<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Currency>

'DOLLARS' @ [103:30] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'services' @ [103:39] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'getCashBalance' @ [103:48] ==> public fun ServiceHub.getCashBalance(currency: Currency): Amount<Currency> defined in net.corda.finance.contracts[DeserializedSimpleFunctionDescriptor]

'USD' @ [103:63] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'database' @ [105:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [105:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'TransactionBuilder' @ [107:37] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [107:56] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [108:13] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[DeserializedClassConstructorDescriptor]

'generateIssue' @ [108:20] ==> public final fun generateIssue(tx: TransactionBuilder, amount: Amount<Issued<Currency>>, owner: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash[DeserializedSimpleFunctionDescriptor]

'irrelevantBuilder' @ [108:34] ==> val irrelevantBuilder: TransactionBuilder defined in net.corda.node.services.vault.VaultWithCashTest.`issue and spend total correctly and irrelevant ignored`.<anonymous>[LocalVariableDescriptor]

'`issued by`' @ [108:53] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [108:57] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [108:77] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [108:87] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'BOB' @ [108:95] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [108:100] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpServices' @ [110:33] ==> val megaCorpServices: MockServices defined in net.corda.node.services.vault.VaultWithCashTest.`issue and spend total correctly and irrelevant ignored`[LocalVariableDescriptor]

'signInitialTransaction' @ [110:50] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'irrelevantBuilder' @ [110:73] ==> val irrelevantBuilder: TransactionBuilder defined in net.corda.node.services.vault.VaultWithCashTest.`issue and spend total correctly and irrelevant ignored`.<anonymous>[LocalVariableDescriptor]

'notaryServices' @ [111:32] ==> public final val notaryServices: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'addSignature' @ [111:47] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'irrelevantPTX' @ [111:60] ==> val irrelevantPTX: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`issue and spend total correctly and irrelevant ignored`.<anonymous>[LocalVariableDescriptor]

'services' @ [113:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'recordTransactions' @ [113:22] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'irrelevantTX' @ [113:41] ==> val irrelevantTX: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`issue and spend total correctly and irrelevant ignored`.<anonymous>[LocalVariableDescriptor]

'database' @ [115:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [115:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertEquals' @ [116:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Currency>, actual: Amount<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Currency>

'DOLLARS' @ [116:30] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'services' @ [116:39] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'getCashBalance' @ [116:48] ==> public fun ServiceHub.getCashBalance(currency: Currency): Amount<Currency> defined in net.corda.finance.contracts[DeserializedSimpleFunctionDescriptor]

'USD' @ [116:63] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'database' @ [118:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [118:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'services' @ [119:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'recordTransactions' @ [119:22] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'spendTX' @ [119:41] ==> val spendTX: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`issue and spend total correctly and irrelevant ignored`[LocalVariableDescriptor]

'database' @ [121:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [121:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertEquals' @ [122:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Currency>, actual: Amount<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Currency>

'DOLLARS' @ [122:29] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'services' @ [122:38] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'getCashBalance' @ [122:47] ==> public fun ServiceHub.getCashBalance(currency: Currency): Amount<Currency> defined in net.corda.finance.contracts[DeserializedSimpleFunctionDescriptor]

'USD' @ [122:62] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'Test' @ [126:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'services' @ [128:24] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'keyManagementService' @ [128:33] ==> public open val keyManagementService: KeyManagementService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'freshKey' @ [128:54] ==> @Suspendable public abstract fun freshKey(): PublicKey defined in net.corda.core.node.services.KeyManagementService[DeserializedSimpleFunctionDescriptor]

'VaultQueryCriteria' @ [129:30] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'SoftLockingCondition' @ [129:86] ==> public constructor SoftLockingCondition(type: QueryCriteria.SoftLockingType, lockIds: List<UUID> = ...) defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedClassConstructorDescriptor]

'LOCKED_ONLY' @ [129:137] ==> enum entry LOCKED_ONLY defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'database' @ [131:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [131:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'services' @ [133:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [133:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [133:47] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [133:56] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [133:72] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [133:94] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'AnonymousParty' @ [133:116] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'freshKey' @ [133:131] ==> val freshKey: PublicKey defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`[LocalVariableDescriptor]

'MEGA_CORP' @ [134:32] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [134:42] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'println' @ [135:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'services' @ [135:38] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'getCashBalance' @ [135:47] ==> public fun ServiceHub.getCashBalance(currency: Currency): Amount<Currency> defined in net.corda.finance.contracts[DeserializedSimpleFunctionDescriptor]

'USD' @ [135:62] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'database' @ [137:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [137:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>..org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>?)

'assertThat' @ [138:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'vaultQuery' @ [138:24] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [138:35] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [138:57] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'hasSize' @ [138:65] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'assertThat' @ [139:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'vaultQuery' @ [139:24] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [139:35] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteriaLocked' @ [139:55] ==> val criteriaLocked: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`[LocalVariableDescriptor]

'states' @ [139:71] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'hasSize' @ [139:79] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'newFixedThreadPool' @ [142:44] ==> public open fun newFixedThreadPool(p0: Int): (ExecutorService..ExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'CountDownLatch' @ [143:25] ==> public constructor CountDownLatch(p0: Int) defined in java.util.concurrent.CountDownLatch[JavaClassConstructorDescriptor]

'backgroundExecutor' @ [146:9] ==> val backgroundExecutor: (ExecutorService..ExecutorService?) defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`[LocalVariableDescriptor]

'submit' @ [146:28] ==> public final fun submit(p0: (() -> Unit..(() -> Unit)?)): (Future<*>..Future<*>?) defined in java.util.concurrent.ExecutorService[MyFunctionDescriptor]

'database' @ [147:13] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [147:22] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Any): Any defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'TransactionBuilder' @ [149:39] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [149:58] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [150:21] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'generateSpend' @ [150:26] ==> @JvmStatic @Suspendable public final fun generateSpend(services: ServiceHub, tx: TransactionBuilder, amount: Amount<Currency>, to: AbstractParty, onlyFromParties: Set<AbstractParty> = ...): Pair<TransactionBuilder, List<PublicKey>> defined in net.corda.finance.contracts.asset.Cash.Companion[DeserializedSimpleFunctionDescriptor]

'services' @ [150:40] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'txn1Builder' @ [150:50] ==> val txn1Builder: TransactionBuilder defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'DOLLARS' @ [150:66] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'BOB' @ [150:75] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'notaryServices' @ [151:33] ==> public final val notaryServices: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'signInitialTransaction' @ [151:48] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'txn1Builder' @ [151:71] ==> val txn1Builder: TransactionBuilder defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'services' @ [152:32] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'addSignature' @ [152:41] ==> public open fun addSignature(signedTransaction: SignedTransaction, publicKey: PublicKey): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'ptxn1' @ [152:54] ==> val ptxn1: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'freshKey' @ [152:61] ==> val freshKey: PublicKey defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`[LocalVariableDescriptor]

'println' @ [153:21] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'txn1' @ [153:38] ==> val txn1: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'id' @ [153:43] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'txn1' @ [153:57] ==> val txn1: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'tx' @ [153:62] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputs' @ [153:65] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'data' @ [153:76] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [153:97] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'vaultQuery' @ [154:45] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [154:56] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'vaultQuery' @ [155:43] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [155:54] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'VaultQueryCriteria' @ [155:74] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'Vault' @ [155:102] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'CONSUMED' @ [155:120] ==> enum entry CONSUMED defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'vaultQuery' @ [156:41] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [156:52] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteriaLocked' @ [156:72] ==> val criteriaLocked: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`[LocalVariableDescriptor]

'states' @ [156:88] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'println' @ [157:21] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'unconsumedStates1' @ [158:47] ==> val unconsumedStates1: Vault.Page<Cash.State> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'totalStatesAvailable' @ [158:65] ==> public final val totalStatesAvailable: Long defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'unconsumedStates1' @ [158:90] ==> val unconsumedStates1: Vault.Page<Cash.State> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'consumedStates1' @ [159:45] ==> val consumedStates1: Vault.Page<Cash.State> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'totalStatesAvailable' @ [159:61] ==> public final val totalStatesAvailable: Long defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'consumedStates1' @ [159:86] ==> val consumedStates1: Vault.Page<Cash.State> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'lockedStates1' @ [160:43] ==> val lockedStates1: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'count' @ [160:57] ==> @InlineOnly public inline fun <T> Collection<StateAndRef<Cash.State>>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'lockedStates1' @ [160:69] ==> val lockedStates1: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'services' @ [162:21] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'recordTransactions' @ [162:30] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'txn1' @ [162:49] ==> val txn1: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'println' @ [163:21] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'services' @ [163:52] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'getCashBalance' @ [163:61] ==> public fun ServiceHub.getCashBalance(currency: Currency): Amount<Currency> defined in net.corda.finance.contracts[DeserializedSimpleFunctionDescriptor]

'USD' @ [163:76] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'vaultQuery' @ [164:45] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [164:56] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'vaultQuery' @ [165:43] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [165:54] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'VaultQueryCriteria' @ [165:74] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'Vault' @ [165:102] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'CONSUMED' @ [165:120] ==> enum entry CONSUMED defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'vaultQuery' @ [166:41] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [166:52] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteriaLocked' @ [166:72] ==> val criteriaLocked: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`[LocalVariableDescriptor]

'states' @ [166:88] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'println' @ [167:21] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'unconsumedStates2' @ [168:47] ==> val unconsumedStates2: Vault.Page<Cash.State> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'totalStatesAvailable' @ [168:65] ==> public final val totalStatesAvailable: Long defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'unconsumedStates2' @ [168:90] ==> val unconsumedStates2: Vault.Page<Cash.State> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'consumedStates2' @ [169:45] ==> val consumedStates2: Vault.Page<Cash.State> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'totalStatesAvailable' @ [169:61] ==> public final val totalStatesAvailable: Long defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'consumedStates2' @ [169:86] ==> val consumedStates2: Vault.Page<Cash.State> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'lockedStates2' @ [170:43] ==> val lockedStates2: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'count' @ [170:57] ==> @InlineOnly public inline fun <T> Collection<StateAndRef<Cash.State>>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'lockedStates2' @ [170:69] ==> val lockedStates2: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'txn1' @ [172:21] ==> val txn1: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'println' @ [174:21] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'e' @ [174:29] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'println' @ [177:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'countDown' @ [178:13] ==> val countDown: CountDownLatch defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`[LocalVariableDescriptor]

'countDown' @ [178:23] ==> public open fun countDown(): Unit defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'backgroundExecutor' @ [182:9] ==> val backgroundExecutor: (ExecutorService..ExecutorService?) defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`[LocalVariableDescriptor]

'submit' @ [182:28] ==> public final fun submit(p0: (() -> Unit..(() -> Unit)?)): (Future<*>..Future<*>?) defined in java.util.concurrent.ExecutorService[MyFunctionDescriptor]

'database' @ [183:13] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [183:22] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Any): Any defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'TransactionBuilder' @ [185:39] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [185:58] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [186:21] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'generateSpend' @ [186:26] ==> @JvmStatic @Suspendable public final fun generateSpend(services: ServiceHub, tx: TransactionBuilder, amount: Amount<Currency>, to: AbstractParty, onlyFromParties: Set<AbstractParty> = ...): Pair<TransactionBuilder, List<PublicKey>> defined in net.corda.finance.contracts.asset.Cash.Companion[DeserializedSimpleFunctionDescriptor]

'services' @ [186:40] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'txn2Builder' @ [186:50] ==> val txn2Builder: TransactionBuilder defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'DOLLARS' @ [186:66] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'BOB' @ [186:75] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'notaryServices' @ [187:33] ==> public final val notaryServices: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'signInitialTransaction' @ [187:48] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'txn2Builder' @ [187:71] ==> val txn2Builder: TransactionBuilder defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'services' @ [188:32] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'addSignature' @ [188:41] ==> public open fun addSignature(signedTransaction: SignedTransaction, publicKey: PublicKey): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'ptxn2' @ [188:54] ==> val ptxn2: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'freshKey' @ [188:61] ==> val freshKey: PublicKey defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`[LocalVariableDescriptor]

'println' @ [189:21] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'txn2' @ [189:38] ==> val txn2: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'id' @ [189:43] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'txn2' @ [189:57] ==> val txn2: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'tx' @ [189:62] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputs' @ [189:65] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'data' @ [189:76] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [189:97] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'vaultQuery' @ [190:45] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [190:56] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'vaultQuery' @ [191:43] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [191:54] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'VaultQueryCriteria' @ [191:74] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'Vault' @ [191:102] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'CONSUMED' @ [191:120] ==> enum entry CONSUMED defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'vaultQuery' @ [192:41] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [192:52] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteriaLocked' @ [192:72] ==> val criteriaLocked: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`[LocalVariableDescriptor]

'states' @ [192:88] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'println' @ [193:21] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'unconsumedStates1' @ [194:47] ==> val unconsumedStates1: Vault.Page<Cash.State> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'totalStatesAvailable' @ [194:65] ==> public final val totalStatesAvailable: Long defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'unconsumedStates1' @ [194:90] ==> val unconsumedStates1: Vault.Page<Cash.State> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'consumedStates1' @ [195:45] ==> val consumedStates1: Vault.Page<Cash.State> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'totalStatesAvailable' @ [195:61] ==> public final val totalStatesAvailable: Long defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'consumedStates1' @ [195:86] ==> val consumedStates1: Vault.Page<Cash.State> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'lockedStates1' @ [196:43] ==> val lockedStates1: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'count' @ [196:57] ==> @InlineOnly public inline fun <T> Collection<StateAndRef<Cash.State>>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'lockedStates1' @ [196:69] ==> val lockedStates1: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'services' @ [198:21] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'recordTransactions' @ [198:30] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'txn2' @ [198:49] ==> val txn2: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'println' @ [199:21] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'services' @ [199:52] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'getCashBalance' @ [199:61] ==> public fun ServiceHub.getCashBalance(currency: Currency): Amount<Currency> defined in net.corda.finance.contracts[DeserializedSimpleFunctionDescriptor]

'USD' @ [199:76] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'vaultQuery' @ [200:45] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [200:56] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'vaultQuery' @ [201:43] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [201:54] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'vaultQuery' @ [202:41] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [202:52] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteriaLocked' @ [202:72] ==> val criteriaLocked: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`[LocalVariableDescriptor]

'states' @ [202:88] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'println' @ [203:21] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'unconsumedStates2' @ [204:47] ==> val unconsumedStates2: Vault.Page<Cash.State> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'totalStatesAvailable' @ [204:65] ==> public final val totalStatesAvailable: Long defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'unconsumedStates2' @ [204:90] ==> val unconsumedStates2: Vault.Page<Cash.State> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'consumedStates2' @ [205:45] ==> val consumedStates2: Vault.Page<Cash.State> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'totalStatesAvailable' @ [205:61] ==> public final val totalStatesAvailable: Long defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'consumedStates2' @ [205:86] ==> val consumedStates2: Vault.Page<Cash.State> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'lockedStates2' @ [206:43] ==> val lockedStates2: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'count' @ [206:57] ==> @InlineOnly public inline fun <T> Collection<StateAndRef<Cash.State>>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'lockedStates2' @ [206:69] ==> val lockedStates2: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'txn2' @ [208:21] ==> val txn2: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'println' @ [210:21] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'e' @ [210:29] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'println' @ [213:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'countDown' @ [215:13] ==> val countDown: CountDownLatch defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`[LocalVariableDescriptor]

'countDown' @ [215:23] ==> public open fun countDown(): Unit defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'countDown' @ [218:9] ==> val countDown: CountDownLatch defined in net.corda.node.services.vault.VaultWithCashTest.`issue and attempt double spend`[LocalVariableDescriptor]

'await' @ [218:19] ==> public open fun await(): Unit defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'database' @ [219:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [219:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>): AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), out (net.corda.core.contracts.Amount<out kotlin.Any?>..net.corda.core.contracts.Amount<out kotlin.Any?>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>?), (net.corda.core.contracts.Amount<java.util.Currency>..net.corda.core.contracts.Amount<java.util.Currency>?)>

'println' @ [220:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'services' @ [220:38] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'getCashBalance' @ [220:47] ==> public fun ServiceHub.getCashBalance(currency: Currency): Amount<Currency> defined in net.corda.finance.contracts[DeserializedSimpleFunctionDescriptor]

'USD' @ [220:62] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'assertThat' @ [221:13] ==> @CheckReturnValue public open fun <T : (Comparable<(Amount<Currency>..Amount<Currency>?)>..Comparable<(Amount<Currency>..Amount<Currency>?)>?)> assertThat(p0: (Amount<Currency>..Amount<Currency>?)): (AbstractComparableAssert<*, (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<*, (Amount<Currency>..Amount<Currency>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Comparable<(T..T?)>..Comparable<(T..T?)>?)> -> Amount<Currency>

'services' @ [221:24] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'getCashBalance' @ [221:33] ==> public fun ServiceHub.getCashBalance(currency: Currency): Amount<Currency> defined in net.corda.finance.contracts[DeserializedSimpleFunctionDescriptor]

'USD' @ [221:48] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'isIn' @ [221:54] ==> public open fun isIn(vararg p0: (Any..Any?)): (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), out (Amount<out Any?>..Amount<out Any?>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?)>?) defined in org.assertj.core.api.AbstractComparableAssert[JavaMethodDescriptor]

'DOLLARS' @ [221:59] ==> public fun DOLLARS(amount: Int): Amount<Currency> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [221:72] ==> public fun DOLLARS(amount: Int): Amount<Currency> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'Test' @ [225:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [227:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [227:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>): AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>

'services' @ [228:28] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'keyManagementService' @ [228:37] ==> public open val keyManagementService: KeyManagementService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'freshKey' @ [228:58] ==> @Suspendable public abstract fun freshKey(): PublicKey defined in net.corda.core.node.services.KeyManagementService[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [229:33] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'freshKey' @ [229:48] ==> val freshKey: PublicKey defined in net.corda.node.services.vault.VaultWithCashTest.`branching LinearStates fails to verify`.<anonymous>[LocalVariableDescriptor]

'UniqueIdentifier' @ [230:28] ==> public constructor UniqueIdentifier(externalId: String? = ..., id: UUID = ...) defined in net.corda.core.contracts.UniqueIdentifier[DeserializedClassConstructorDescriptor]

'TransactionBuilder' @ [233:37] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [233:65] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'apply' @ [233:79] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'addOutputState' @ [234:17] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'State' @ [234:52] ==> public constructor State(linearId: UniqueIdentifier = ..., contract: Contract = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearTimestamp: Instant = ..., linearBoolean: Boolean = ..., nonce: SecureHash = ...) defined in net.corda.testing.contracts.DummyLinearContract.State[DeserializedClassConstructorDescriptor]

'linearId' @ [234:69] ==> val linearId: UniqueIdentifier defined in net.corda.node.services.vault.VaultWithCashTest.`branching LinearStates fails to verify`.<anonymous>[LocalVariableDescriptor]

'listOf' @ [234:94] ==> public fun <T> listOf(element: AnonymousParty): List<AnonymousParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnonymousParty

'freshIdentity' @ [234:101] ==> val freshIdentity: AnonymousParty defined in net.corda.node.services.vault.VaultWithCashTest.`branching LinearStates fails to verify`.<anonymous>[LocalVariableDescriptor]

'addOutputState' @ [235:17] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'State' @ [235:52] ==> public constructor State(linearId: UniqueIdentifier = ..., contract: Contract = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearTimestamp: Instant = ..., linearBoolean: Boolean = ..., nonce: SecureHash = ...) defined in net.corda.testing.contracts.DummyLinearContract.State[DeserializedClassConstructorDescriptor]

'linearId' @ [235:69] ==> val linearId: UniqueIdentifier defined in net.corda.node.services.vault.VaultWithCashTest.`branching LinearStates fails to verify`.<anonymous>[LocalVariableDescriptor]

'listOf' @ [235:94] ==> public fun <T> listOf(element: AnonymousParty): List<AnonymousParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnonymousParty

'freshIdentity' @ [235:101] ==> val freshIdentity: AnonymousParty defined in net.corda.node.services.vault.VaultWithCashTest.`branching LinearStates fails to verify`.<anonymous>[LocalVariableDescriptor]

'addCommand' @ [236:17] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [236:28] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'notaryServices' @ [236:41] ==> public final val notaryServices: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'legalIdentityKey' @ [236:56] ==> public open val legalIdentityKey: PublicKey defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'notaryServices' @ [238:30] ==> public final val notaryServices: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'signInitialTransaction' @ [238:45] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'dummyIssueBuilder' @ [238:68] ==> val dummyIssueBuilder: TransactionBuilder defined in net.corda.node.services.vault.VaultWithCashTest.`branching LinearStates fails to verify`.<anonymous>[LocalVariableDescriptor]

'assertThatThrownBy' @ [240:13] ==> @CheckReturnValue public final fun assertThatThrownBy(p0: (() -> Unit..(() -> Unit)?)): (AbstractThrowableAssert<*, out (Throwable..Throwable?)>..AbstractThrowableAssert<*, out (Throwable..Throwable?)>?) defined in org.assertj.core.api.Assertions[SamAdapterFunctionDescriptor]

'dummyIssue' @ [241:17] ==> val dummyIssue: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`branching LinearStates fails to verify`.<anonymous>[LocalVariableDescriptor]

'toLedgerTransaction' @ [241:28] ==> @JvmOverloads public final fun toLedgerTransaction(services: ServiceHub, checkSufficientSignatures: Boolean = ...): LedgerTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'services' @ [241:48] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'verify' @ [241:58] ==> public final fun verify(): Unit defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'Test' @ [246:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'services' @ [248:24] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'keyManagementService' @ [248:33] ==> public open val keyManagementService: KeyManagementService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'freshKey' @ [248:54] ==> @Suspendable public abstract fun freshKey(): PublicKey defined in net.corda.core.node.services.KeyManagementService[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [249:29] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'freshKey' @ [249:44] ==> val freshKey: PublicKey defined in net.corda.node.services.vault.VaultWithCashTest.`sequencing LinearStates works`[LocalVariableDescriptor]

'UniqueIdentifier' @ [250:24] ==> public constructor UniqueIdentifier(externalId: String? = ..., id: UUID = ...) defined in net.corda.core.contracts.UniqueIdentifier[DeserializedClassConstructorDescriptor]

'database' @ [253:13] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [253:22] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SignedTransaction): SignedTransaction defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'TransactionBuilder' @ [254:37] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [254:65] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'addOutputState' @ [255:14] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'State' @ [255:49] ==> public constructor State(linearId: UniqueIdentifier = ..., contract: Contract = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearTimestamp: Instant = ..., linearBoolean: Boolean = ..., nonce: SecureHash = ...) defined in net.corda.testing.contracts.DummyLinearContract.State[DeserializedClassConstructorDescriptor]

'linearId' @ [255:66] ==> val linearId: UniqueIdentifier defined in net.corda.node.services.vault.VaultWithCashTest.`sequencing LinearStates works`[LocalVariableDescriptor]

'listOf' @ [255:91] ==> public fun <T> listOf(element: AnonymousParty): List<AnonymousParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnonymousParty

'freshIdentity' @ [255:98] ==> val freshIdentity: AnonymousParty defined in net.corda.node.services.vault.VaultWithCashTest.`sequencing LinearStates works`[LocalVariableDescriptor]

'addCommand' @ [255:115] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [255:126] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'notaryServices' @ [255:139] ==> public final val notaryServices: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'legalIdentityKey' @ [255:154] ==> public open val legalIdentityKey: PublicKey defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'notaryServices' @ [256:33] ==> public final val notaryServices: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'signInitialTransaction' @ [256:48] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'dummyIssueBuilder' @ [256:71] ==> val dummyIssueBuilder: TransactionBuilder defined in net.corda.node.services.vault.VaultWithCashTest.`sequencing LinearStates works`.<anonymous>[LocalVariableDescriptor]

'services' @ [257:30] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'addSignature' @ [257:39] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'dummyIssuePtx' @ [257:52] ==> val dummyIssuePtx: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`sequencing LinearStates works`.<anonymous>[LocalVariableDescriptor]

'dummyIssue' @ [259:17] ==> val dummyIssue: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`sequencing LinearStates works`.<anonymous>[LocalVariableDescriptor]

'toLedgerTransaction' @ [259:28] ==> @JvmOverloads public final fun toLedgerTransaction(services: ServiceHub, checkSufficientSignatures: Boolean = ...): LedgerTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'services' @ [259:48] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'verify' @ [259:58] ==> public final fun verify(): Unit defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'services' @ [261:17] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'recordTransactions' @ [261:26] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'dummyIssue' @ [261:45] ==> val dummyIssue: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`sequencing LinearStates works`.<anonymous>[LocalVariableDescriptor]

'dummyIssue' @ [262:17] ==> val dummyIssue: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`sequencing LinearStates works`.<anonymous>[LocalVariableDescriptor]

'database' @ [264:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [264:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertThat' @ [265:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<DummyLinearContract.State>..StateAndRef<DummyLinearContract.State>?)>..List<(StateAndRef<DummyLinearContract.State>..StateAndRef<DummyLinearContract.State>?)>?)): (ListAssert<(StateAndRef<DummyLinearContract.State>..StateAndRef<DummyLinearContract.State>?)>..ListAssert<(StateAndRef<DummyLinearContract.State>..StateAndRef<DummyLinearContract.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'vaultQuery' @ [265:24] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [265:35] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<DummyLinearContract.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [265:72] ==> public final val states: List<StateAndRef<DummyLinearContract.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'hasSize' @ [265:80] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<DummyLinearContract.State>..StateAndRef<DummyLinearContract.State>?)>..ListAssert<(StateAndRef<DummyLinearContract.State>..StateAndRef<DummyLinearContract.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'TransactionBuilder' @ [268:36] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [268:64] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'addOutputState' @ [269:22] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'State' @ [269:57] ==> public constructor State(linearId: UniqueIdentifier = ..., contract: Contract = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearTimestamp: Instant = ..., linearBoolean: Boolean = ..., nonce: SecureHash = ...) defined in net.corda.testing.contracts.DummyLinearContract.State[DeserializedClassConstructorDescriptor]

'linearId' @ [269:74] ==> val linearId: UniqueIdentifier defined in net.corda.node.services.vault.VaultWithCashTest.`sequencing LinearStates works`[LocalVariableDescriptor]

'listOf' @ [269:99] ==> public fun <T> listOf(element: AnonymousParty): List<AnonymousParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnonymousParty

'freshIdentity' @ [269:106] ==> val freshIdentity: AnonymousParty defined in net.corda.node.services.vault.VaultWithCashTest.`sequencing LinearStates works`[LocalVariableDescriptor]

'addInputState' @ [270:22] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyIssue' @ [270:36] ==> val dummyIssue: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`sequencing LinearStates works`[LocalVariableDescriptor]

'tx' @ [270:47] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [270:50] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<LinearState> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> LinearState

'addCommand' @ [271:22] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [271:33] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'notaryServices' @ [271:46] ==> public final val notaryServices: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'legalIdentityKey' @ [271:61] ==> public open val legalIdentityKey: PublicKey defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'notaryServices' @ [273:29] ==> public final val notaryServices: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'signInitialTransaction' @ [273:44] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'dummyMoveBuilder' @ [273:67] ==> val dummyMoveBuilder: TransactionBuilder defined in net.corda.node.services.vault.VaultWithCashTest.`sequencing LinearStates works`.<anonymous>[LocalVariableDescriptor]

'dummyIssue' @ [275:13] ==> val dummyIssue: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`sequencing LinearStates works`[LocalVariableDescriptor]

'toLedgerTransaction' @ [275:24] ==> @JvmOverloads public final fun toLedgerTransaction(services: ServiceHub, checkSufficientSignatures: Boolean = ...): LedgerTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'services' @ [275:44] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'verify' @ [275:54] ==> public final fun verify(): Unit defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'services' @ [277:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'recordTransactions' @ [277:22] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'dummyMove' @ [277:41] ==> val dummyMove: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`sequencing LinearStates works`.<anonymous>[LocalVariableDescriptor]

'database' @ [279:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [279:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(StateAndRef<DummyLinearContract.State>..StateAndRef<DummyLinearContract.State>?)>..ListAssert<(StateAndRef<DummyLinearContract.State>..StateAndRef<DummyLinearContract.State>?)>?)): (ListAssert<(StateAndRef<DummyLinearContract.State>..StateAndRef<DummyLinearContract.State>?)>..ListAssert<(StateAndRef<DummyLinearContract.State>..StateAndRef<DummyLinearContract.State>?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.testing.contracts.DummyLinearContract.State>..net.corda.core.contracts.StateAndRef<net.corda.testing.contracts.DummyLinearContract.State>?)>..org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.testing.contracts.DummyLinearContract.State>..net.corda.core.contracts.StateAndRef<net.corda.testing.contracts.DummyLinearContract.State>?)>?)

'assertThat' @ [280:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<DummyLinearContract.State>..StateAndRef<DummyLinearContract.State>?)>..List<(StateAndRef<DummyLinearContract.State>..StateAndRef<DummyLinearContract.State>?)>?)): (ListAssert<(StateAndRef<DummyLinearContract.State>..StateAndRef<DummyLinearContract.State>?)>..ListAssert<(StateAndRef<DummyLinearContract.State>..StateAndRef<DummyLinearContract.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'vaultQuery' @ [280:24] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [280:35] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<DummyLinearContract.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [280:72] ==> public final val states: List<StateAndRef<DummyLinearContract.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'hasSize' @ [280:80] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<DummyLinearContract.State>..StateAndRef<DummyLinearContract.State>?)>..ListAssert<(StateAndRef<DummyLinearContract.State>..StateAndRef<DummyLinearContract.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [284:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'services' @ [287:24] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'keyManagementService' @ [287:33] ==> public open val keyManagementService: KeyManagementService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'freshKey' @ [287:54] ==> @Suspendable public abstract fun freshKey(): PublicKey defined in net.corda.core.node.services.KeyManagementService[DeserializedSimpleFunctionDescriptor]

'database' @ [288:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [288:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<Cash.State>): Vault<Cash.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<State>

'services' @ [289:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [289:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [289:47] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [289:56] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [289:72] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [289:92] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'AnonymousParty' @ [289:114] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'freshKey' @ [289:129] ==> val freshKey: PublicKey defined in net.corda.node.services.vault.VaultWithCashTest.`spending cash in vault of mixed state types works`[LocalVariableDescriptor]

'services' @ [290:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [290:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'SWISS_FRANCS' @ [290:47] ==> public val Int.SWISS_FRANCS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [290:61] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [290:77] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [290:97] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'services' @ [291:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [291:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'POUNDS' @ [291:47] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [291:55] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [291:71] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [291:91] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'database' @ [293:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [293:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'vaultQuery' @ [294:24] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [294:35] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [294:57] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'cash' @ [295:13] ==> val cash: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.VaultWithCashTest.`spending cash in vault of mixed state types works`.<anonymous>[LocalVariableDescriptor]

'forEach' @ [295:18] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<Cash.State>>.forEach(action: (StateAndRef<Cash.State>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'println' @ [295:28] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [295:36] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.vault.VaultWithCashTest.`spending cash in vault of mixed state types works`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [295:39] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [295:45] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [295:50] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'database' @ [297:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [297:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<DealState>): Vault<DealState> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<DealState>

'services' @ [298:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'fillWithSomeTestDeals' @ [298:22] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestDeals(dealIds: List<String>, participants: List<AbstractParty> = ..., notary: Party = ...): Vault<DealState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'listOf' @ [298:44] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'database' @ [300:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [300:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'vaultQuery' @ [301:25] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [301:36] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<DummyDealContract.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [301:71] ==> public final val states: List<StateAndRef<DummyDealContract.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'deals' @ [302:13] ==> val deals: List<StateAndRef<DummyDealContract.State>> defined in net.corda.node.services.vault.VaultWithCashTest.`spending cash in vault of mixed state types works`.<anonymous>[LocalVariableDescriptor]

'forEach' @ [302:19] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<DummyDealContract.State>>.forEach(action: (StateAndRef<DummyDealContract.State>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'println' @ [302:29] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [302:37] ==> value-parameter it: StateAndRef<DummyDealContract.State> defined in net.corda.node.services.vault.VaultWithCashTest.`spending cash in vault of mixed state types works`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [302:40] ==> public final val state: TransactionState<DummyDealContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [302:46] ==> public final val data: DummyDealContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'linearId' @ [302:51] ==> public open val linearId: UniqueIdentifier defined in net.corda.testing.contracts.DummyDealContract.State[DeserializedPropertyDescriptor]

'externalId' @ [302:60] ==> public final val externalId: String? defined in net.corda.core.contracts.UniqueIdentifier[DeserializedPropertyDescriptor]

'database' @ [305:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [305:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'TransactionBuilder' @ [307:34] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [307:53] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Cash' @ [308:13] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'generateSpend' @ [308:18] ==> @JvmStatic @Suspendable public final fun generateSpend(services: ServiceHub, tx: TransactionBuilder, amount: Amount<Currency>, to: AbstractParty, onlyFromParties: Set<AbstractParty> = ...): Pair<TransactionBuilder, List<PublicKey>> defined in net.corda.finance.contracts.asset.Cash.Companion[DeserializedSimpleFunctionDescriptor]

'services' @ [308:32] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'spendTXBuilder' @ [308:42] ==> val spendTXBuilder: TransactionBuilder defined in net.corda.node.services.vault.VaultWithCashTest.`spending cash in vault of mixed state types works`.<anonymous>[LocalVariableDescriptor]

'DOLLARS' @ [308:61] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'BOB' @ [308:70] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'notaryServices' @ [309:28] ==> public final val notaryServices: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'signInitialTransaction' @ [309:43] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'spendTXBuilder' @ [309:66] ==> val spendTXBuilder: TransactionBuilder defined in net.corda.node.services.vault.VaultWithCashTest.`spending cash in vault of mixed state types works`.<anonymous>[LocalVariableDescriptor]

'services' @ [310:27] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'addSignature' @ [310:36] ==> public open fun addSignature(signedTransaction: SignedTransaction, publicKey: PublicKey): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'spendPTX' @ [310:49] ==> val spendPTX: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`spending cash in vault of mixed state types works`.<anonymous>[LocalVariableDescriptor]

'freshKey' @ [310:59] ==> val freshKey: PublicKey defined in net.corda.node.services.vault.VaultWithCashTest.`spending cash in vault of mixed state types works`[LocalVariableDescriptor]

'services' @ [311:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'recordTransactions' @ [311:22] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'spendTX' @ [311:41] ==> val spendTX: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`spending cash in vault of mixed state types works`.<anonymous>[LocalVariableDescriptor]

'database' @ [313:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [313:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'vaultQuery' @ [314:34] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [314:45] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<ContractState> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> ContractState

'VaultQueryCriteria' @ [314:68] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'Vault' @ [314:96] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'CONSUMED' @ [314:114] ==> enum entry CONSUMED defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'states' @ [314:125] ==> public final val states: List<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'assertEquals' @ [315:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'consumedStates' @ [315:29] ==> val consumedStates: List<StateAndRef<ContractState>> defined in net.corda.node.services.vault.VaultWithCashTest.`spending cash in vault of mixed state types works`.<anonymous>[LocalVariableDescriptor]

'count' @ [315:44] ==> @InlineOnly public inline fun <T> Collection<StateAndRef<ContractState>>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'vaultQuery' @ [317:36] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [317:47] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<ContractState> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> ContractState

'states' @ [317:72] ==> public final val states: List<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'assertEquals' @ [318:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'unconsumedStates' @ [318:29] ==> val unconsumedStates: List<StateAndRef<ContractState>> defined in net.corda.node.services.vault.VaultWithCashTest.`spending cash in vault of mixed state types works`.<anonymous>[LocalVariableDescriptor]

'count' @ [318:46] ==> @InlineOnly public inline fun <T> Collection<StateAndRef<ContractState>>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'Test' @ [322:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'services' @ [325:24] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'keyManagementService' @ [325:33] ==> public open val keyManagementService: KeyManagementService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'freshKey' @ [325:54] ==> @Suspendable public abstract fun freshKey(): PublicKey defined in net.corda.core.node.services.KeyManagementService[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [326:29] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'freshKey' @ [326:44] ==> val freshKey: PublicKey defined in net.corda.node.services.vault.VaultWithCashTest.`consuming multiple contract state types`[LocalVariableDescriptor]

'database' @ [327:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [327:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<DealState>): Vault<DealState> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<DealState>

'services' @ [328:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'fillWithSomeTestDeals' @ [328:22] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestDeals(dealIds: List<String>, participants: List<AbstractParty> = ..., notary: Party = ...): Vault<DealState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'listOf' @ [328:44] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'database' @ [331:13] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [331:22] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> List<StateAndRef<DummyDealContract.State>>): List<StateAndRef<DummyDealContract.State>> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<StateAndRef<State>>

'vaultQuery' @ [332:17] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [332:28] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<DummyDealContract.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [332:63] ==> public final val states: List<StateAndRef<DummyDealContract.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'database' @ [334:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [334:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<LinearState>): Vault<LinearState> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<LinearState>

'services' @ [335:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'fillWithSomeTestLinearStates' @ [335:22] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestLinearStates(numberToCreate: Int, externalId: String? = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearBoolean: Boolean = ..., linearTimestamp: Instant = ...): Vault<LinearState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'database' @ [337:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [337:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'vaultQuery' @ [338:32] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [338:43] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<DummyLinearContract.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [338:80] ==> public final val states: List<StateAndRef<DummyLinearContract.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'linearStates' @ [339:13] ==> val linearStates: List<StateAndRef<DummyLinearContract.State>> defined in net.corda.node.services.vault.VaultWithCashTest.`consuming multiple contract state types`.<anonymous>[LocalVariableDescriptor]

'forEach' @ [339:26] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<DummyLinearContract.State>>.forEach(action: (StateAndRef<DummyLinearContract.State>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'println' @ [339:36] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [339:44] ==> value-parameter it: StateAndRef<DummyLinearContract.State> defined in net.corda.node.services.vault.VaultWithCashTest.`consuming multiple contract state types`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [339:47] ==> public final val state: TransactionState<DummyLinearContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [339:53] ==> public final val data: DummyLinearContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'linearId' @ [339:58] ==> public open val linearId: UniqueIdentifier defined in net.corda.testing.contracts.DummyLinearContract.State[DeserializedPropertyDescriptor]

'TransactionBuilder' @ [342:36] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY' @ [342:64] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'apply' @ [342:78] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'addOutputState' @ [343:17] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'State' @ [343:52] ==> public constructor State(linearId: UniqueIdentifier = ..., contract: Contract = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearTimestamp: Instant = ..., linearBoolean: Boolean = ..., nonce: SecureHash = ...) defined in net.corda.testing.contracts.DummyLinearContract.State[DeserializedClassConstructorDescriptor]

'listOf' @ [343:73] ==> public fun <T> listOf(element: AnonymousParty): List<AnonymousParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnonymousParty

'freshIdentity' @ [343:80] ==> val freshIdentity: AnonymousParty defined in net.corda.node.services.vault.VaultWithCashTest.`consuming multiple contract state types`[LocalVariableDescriptor]

'addOutputState' @ [344:17] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'State' @ [344:50] ==> public constructor State(contract: Contract = ..., participants: List<AbstractParty> = ..., ref: String) defined in net.corda.testing.contracts.DummyDealContract.State[DeserializedClassConstructorDescriptor]

'listOf' @ [344:84] ==> public fun <T> listOf(element: AnonymousParty): List<AnonymousParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnonymousParty

'freshIdentity' @ [344:91] ==> val freshIdentity: AnonymousParty defined in net.corda.node.services.vault.VaultWithCashTest.`consuming multiple contract state types`[LocalVariableDescriptor]

'addInputState' @ [345:17] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'linearStates' @ [345:31] ==> val linearStates: List<StateAndRef<DummyLinearContract.State>> defined in net.corda.node.services.vault.VaultWithCashTest.`consuming multiple contract state types`.<anonymous>[LocalVariableDescriptor]

'first' @ [345:44] ==> public fun <T> List<StateAndRef<DummyLinearContract.State>>.first(): StateAndRef<DummyLinearContract.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'addInputState' @ [346:17] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'deals' @ [346:31] ==> val deals: List<StateAndRef<DummyDealContract.State>> defined in net.corda.node.services.vault.VaultWithCashTest.`consuming multiple contract state types`[LocalVariableDescriptor]

'first' @ [346:37] ==> public fun <T> List<StateAndRef<DummyDealContract.State>>.first(): StateAndRef<DummyDealContract.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'addCommand' @ [347:17] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [347:28] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'notaryServices' @ [347:41] ==> public final val notaryServices: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'legalIdentityKey' @ [347:56] ==> public open val legalIdentityKey: PublicKey defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'notaryServices' @ [350:29] ==> public final val notaryServices: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'signInitialTransaction' @ [350:44] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'dummyMoveBuilder' @ [350:67] ==> val dummyMoveBuilder: TransactionBuilder defined in net.corda.node.services.vault.VaultWithCashTest.`consuming multiple contract state types`.<anonymous>[LocalVariableDescriptor]

'dummyMove' @ [351:13] ==> val dummyMove: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`consuming multiple contract state types`.<anonymous>[LocalVariableDescriptor]

'toLedgerTransaction' @ [351:23] ==> @JvmOverloads public final fun toLedgerTransaction(services: ServiceHub, checkSufficientSignatures: Boolean = ...): LedgerTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'services' @ [351:43] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'verify' @ [351:53] ==> public final fun verify(): Unit defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'services' @ [352:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'recordTransactions' @ [352:22] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'dummyMove' @ [352:41] ==> val dummyMove: SignedTransaction defined in net.corda.node.services.vault.VaultWithCashTest.`consuming multiple contract state types`.<anonymous>[LocalVariableDescriptor]

'database' @ [354:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'transaction' @ [354:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'vaultQuery' @ [355:34] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [355:45] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<ContractState> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> ContractState

'VaultQueryCriteria' @ [355:68] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'Vault' @ [355:96] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'CONSUMED' @ [355:114] ==> enum entry CONSUMED defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'states' @ [355:125] ==> public final val states: List<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'assertEquals' @ [356:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'consumedStates' @ [356:29] ==> val consumedStates: List<StateAndRef<ContractState>> defined in net.corda.node.services.vault.VaultWithCashTest.`consuming multiple contract state types`.<anonymous>[LocalVariableDescriptor]

'count' @ [356:44] ==> @InlineOnly public inline fun <T> Collection<StateAndRef<ContractState>>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'vaultQuery' @ [358:36] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.VaultWithCashTest[PropertyDescriptorImpl]

'queryBy' @ [358:47] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<ContractState> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> ContractState

'states' @ [358:72] ==> public final val states: List<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'assertEquals' @ [359:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'unconsumedStates' @ [359:29] ==> val unconsumedStates: List<StateAndRef<ContractState>> defined in net.corda.node.services.vault.VaultWithCashTest.`consuming multiple contract state types`.<anonymous>[LocalVariableDescriptor]

'count' @ [359:46] ==> @InlineOnly public inline fun <T> Collection<StateAndRef<ContractState>>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

