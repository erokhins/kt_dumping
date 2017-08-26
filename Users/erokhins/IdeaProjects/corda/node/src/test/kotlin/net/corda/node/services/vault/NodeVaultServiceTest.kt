'TestDependencyInjectionBase' @ [46:30] ==> public constructor TestDependencyInjectionBase() defined in net.corda.testing.TestDependencyInjectionBase[DeserializedClassConstructorDescriptor]

'services' @ [49:40] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'vaultService' @ [49:49] ==> public open val vaultService: VaultService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'services' @ [50:47] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'vaultQueryService' @ [50:56] ==> public open val vaultQueryService: VaultQueryService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'Before' @ [53:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'LogHelper' @ [55:9] ==> public object LogHelper defined in net.corda.testing[FakeCallableDescriptorForObject]

'setLevel' @ [55:19] ==> public final fun setLevel(vararg classes: KClass<*>): Unit defined in net.corda.testing.LogHelper[DeserializedSimpleFunctionDescriptor]

'NodeVaultService' @ [55:28] ==> private companion object defined in net.corda.node.services.vault.NodeVaultService[FakeCallableDescriptorForObject]

'makeTestDatabaseAndMockServices' @ [56:35] ==> public fun makeTestDatabaseAndMockServices(customSchemas: Set<MappedSchema> = ..., keys: List<KeyPair> = ..., createIdentityService: () -> IdentityService = ...): Pair<CordaPersistence, MockServices> defined in net.corda.testing.node[DeserializedSimpleFunctionDescriptor]

'listOf' @ [56:74] ==> public fun <T> listOf(vararg elements: KeyPair): List<KeyPair> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KeyPair

'BOC_KEY' @ [56:81] ==> public val BOC_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_CASH_ISSUER_KEY' @ [56:90] ==> public val DUMMY_CASH_ISSUER_KEY: KeyPair defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'database' @ [57:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'databaseAndServices' @ [57:20] ==> val databaseAndServices: Pair<CordaPersistence, MockServices> defined in net.corda.node.services.vault.NodeVaultServiceTest.setUp[LocalVariableDescriptor]

'first' @ [57:40] ==> public final val first: CordaPersistence defined in kotlin.Pair[DeserializedPropertyDescriptor]

'services' @ [58:9] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'databaseAndServices' @ [58:20] ==> val databaseAndServices: Pair<CordaPersistence, MockServices> defined in net.corda.node.services.vault.NodeVaultServiceTest.setUp[LocalVariableDescriptor]

'second' @ [58:40] ==> public final val second: MockServices defined in kotlin.Pair[DeserializedPropertyDescriptor]

'issuerServices' @ [59:9] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'MockServices' @ [59:26] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'DUMMY_CASH_ISSUER_KEY' @ [59:39] ==> public val DUMMY_CASH_ISSUER_KEY: KeyPair defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'BOC_KEY' @ [59:62] ==> public val BOC_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'After' @ [62:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'database' @ [64:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'close' @ [64:18] ==> public open fun close(): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]

'LogHelper' @ [65:9] ==> public object LogHelper defined in net.corda.testing[FakeCallableDescriptorForObject]

'reset' @ [65:19] ==> public final fun reset(vararg classes: KClass<*>): Unit defined in net.corda.testing.LogHelper[DeserializedSimpleFunctionDescriptor]

'NodeVaultService' @ [65:25] ==> private companion object defined in net.corda.node.services.vault.NodeVaultService[FakeCallableDescriptorForObject]

'Suspendable' @ [68:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'randomUUID' @ [72:82] ==> public open fun randomUUID(): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'if (notary != null) listOf(notary) else null' @ [75:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<Party>?, elseBranch: List<Party>?): List<Party>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<Party>?

'notary' @ [75:28] ==> value-parameter notary: Party? = ... defined in net.corda.node.services.vault.NodeVaultServiceTest.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'listOf' @ [75:44] ==> public fun <T> listOf(element: Party): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'notary' @ [75:51] ==> value-parameter notary: Party? = ... defined in net.corda.node.services.vault.NodeVaultServiceTest.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'VaultQueryCriteria' @ [76:57] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'notaries' @ [76:85] ==> val notaries: List<Party>? defined in net.corda.node.services.vault.NodeVaultServiceTest.unconsumedCashStatesForSpending[LocalVariableDescriptor]

'onlyFromIssuerParties' @ [77:13] ==> value-parameter onlyFromIssuerParties: Set<AbstractParty>? = ... defined in net.corda.node.services.vault.NodeVaultServiceTest.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'withIssuerRefs' @ [77:46] ==> value-parameter withIssuerRefs: Set<OpaqueBytes>? = ... defined in net.corda.node.services.vault.NodeVaultServiceTest.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'baseCriteria' @ [78:13] ==> var baseCriteria: QueryCriteria defined in net.corda.node.services.vault.NodeVaultServiceTest.unconsumedCashStatesForSpending[LocalVariableDescriptor]

'baseCriteria' @ [78:28] ==> var baseCriteria: QueryCriteria defined in net.corda.node.services.vault.NodeVaultServiceTest.unconsumedCashStatesForSpending[LocalVariableDescriptor]

'and' @ [78:41] ==> public final infix fun and(criteria: QueryCriteria): QueryCriteria defined in net.corda.core.node.services.vault.QueryCriteria[DeserializedSimpleFunctionDescriptor]

'FungibleAssetQueryCriteria' @ [78:59] ==> @JvmOverloads public constructor FungibleAssetQueryCriteria(participants: List<AbstractParty>? = ..., owner: List<AbstractParty>? = ..., quantity: ColumnPredicate<Long>? = ..., issuer: List<AbstractParty>? = ..., issuerRef: List<OpaqueBytes>? = ..., status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.FungibleAssetQueryCriteria[DeserializedClassConstructorDescriptor]

'onlyFromIssuerParties' @ [79:30] ==> value-parameter onlyFromIssuerParties: Set<AbstractParty>? = ... defined in net.corda.node.services.vault.NodeVaultServiceTest.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'toList' @ [79:53] ==> public fun <T> Iterable<AbstractParty>.toList(): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'withIssuerRefs' @ [80:33] ==> value-parameter withIssuerRefs: Set<OpaqueBytes>? = ... defined in net.corda.node.services.vault.NodeVaultServiceTest.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'toList' @ [80:49] ==> public fun <T> Iterable<OpaqueBytes>.toList(): List<OpaqueBytes> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OpaqueBytes

'tryLockFungibleStatesForSpending' @ [83:16] ==> @Suspendable public abstract fun <T : FungibleAsset<Currency>, U : Any> tryLockFungibleStatesForSpending(lockId: UUID, eligibleStatesQuery: QueryCriteria, amount: Amount<Currency>, contractType: Class<out Cash.State>): List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : FungibleAsset<U>> -> State
    <U : Any> -> Currency

'lockId' @ [83:49] ==> value-parameter lockId: UUID = ... defined in net.corda.node.services.vault.NodeVaultServiceTest.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'baseCriteria' @ [83:57] ==> var baseCriteria: QueryCriteria defined in net.corda.node.services.vault.NodeVaultServiceTest.unconsumedCashStatesForSpending[LocalVariableDescriptor]

'amount' @ [83:71] ==> value-parameter amount: Amount<Currency> defined in net.corda.node.services.vault.NodeVaultServiceTest.unconsumedCashStatesForSpending[ValueParameterDescriptorImpl]

'Cash' @ [83:79] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'java' @ [83:97] ==> public val <T> KClass<Cash.State>.java: Class<Cash.State> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> State

'Test' @ [87:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [89:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [89:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<Cash.State>): Vault<Cash.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<State>

'services' @ [90:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [90:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [90:47] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [90:56] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [90:72] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [90:92] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'database' @ [92:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [92:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>..org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>?)

'vaultQuery' @ [93:22] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [93:33] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [93:55] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'assertThat' @ [94:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'w1' @ [94:24] ==> val w1: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states not local to instance`.<anonymous>[LocalVariableDescriptor]

'hasSize' @ [94:28] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'vaultSvc' @ [96:33] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'vaultQuery' @ [97:38] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'MockServices' @ [98:38] ==> public constructor MockServices() defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'originalVault' @ [99:65] ==> val originalVault: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest.`states not local to instance`.<anonymous>[LocalVariableDescriptor]

'txs' @ [101:33] ==> value-parameter txs: Iterable<SignedTransaction> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states not local to instance`.<anonymous>.<no name provided>.recordTransactions[ValueParameterDescriptorImpl]

'validatedTransactions' @ [102:25] ==> public open val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.vault.NodeVaultServiceTest.`states not local to instance`.<anonymous>.<no name provided>[DeserializedPropertyDescriptor]

'addTransaction' @ [102:47] ==> public abstract fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'stx' @ [102:62] ==> val stx: SignedTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.`states not local to instance`.<anonymous>.<no name provided>.recordTransactions[LocalVariableDescriptor]

'vaultService' @ [103:25] ==> public open val vaultService: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest.`states not local to instance`.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'notify' @ [103:38] ==> public open fun notify(tx: CoreTransaction): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'stx' @ [103:45] ==> val stx: SignedTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.`states not local to instance`.<anonymous>.<no name provided>.recordTransactions[LocalVariableDescriptor]

'tx' @ [103:49] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'originalVaultQuery' @ [107:75] ==> val originalVaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest.`states not local to instance`.<anonymous>[LocalVariableDescriptor]

'services2' @ [110:22] ==> val services2: <no name provided> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states not local to instance`.<anonymous>[LocalVariableDescriptor]

'vaultQueryService' @ [110:32] ==> public open val vaultQueryService: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest.`states not local to instance`.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'queryBy' @ [110:50] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [110:72] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'assertThat' @ [111:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'w2' @ [111:24] ==> val w2: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states not local to instance`.<anonymous>[LocalVariableDescriptor]

'hasSize' @ [111:28] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [115:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [117:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [117:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<Cash.State>): Vault<Cash.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<State>

'services' @ [118:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [118:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [118:47] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [118:56] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [118:72] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [118:92] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'database' @ [120:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [120:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>..org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>?)

'vaultQuery' @ [121:22] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [121:33] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [121:55] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'assertThat' @ [122:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'w1' @ [122:24] ==> val w1: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states for refs`.<anonymous>[LocalVariableDescriptor]

'hasSize' @ [122:28] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'vaultQuery' @ [124:26] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [124:37] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'VaultQueryCriteria' @ [124:57] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'listOf' @ [124:88] ==> public fun <T> listOf(vararg elements: StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'w1' @ [124:95] ==> val w1: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states for refs`.<anonymous>[LocalVariableDescriptor]

'ref' @ [124:101] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'w1' @ [124:106] ==> val w1: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states for refs`.<anonymous>[LocalVariableDescriptor]

'ref' @ [124:112] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'states' @ [124:119] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'assertThat' @ [125:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'states' @ [125:24] ==> val states: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states for refs`.<anonymous>[LocalVariableDescriptor]

'hasSize' @ [125:32] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [129:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [131:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [131:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<Cash.State>): Vault<Cash.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<State>

'services' @ [132:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [132:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [132:47] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [132:56] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [132:72] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [132:92] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'database' @ [134:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [134:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>..org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>?)

'vaultQuery' @ [136:36] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [136:47] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [136:69] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'assertThat' @ [137:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'unconsumedStates' @ [137:24] ==> val unconsumedStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking reserve and release`.<anonymous>[LocalVariableDescriptor]

'hasSize' @ [137:42] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'NonEmptySet' @ [139:39] ==> public companion object defined in net.corda.core.utilities.NonEmptySet[FakeCallableDescriptorForObject]

'of' @ [139:51] ==> @JvmStatic public final fun <T> of(first: StateRef, second: StateRef, vararg rest: StateRef): NonEmptySet<StateRef> defined in net.corda.core.utilities.NonEmptySet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'unconsumedStates' @ [139:54] ==> val unconsumedStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking reserve and release`.<anonymous>[LocalVariableDescriptor]

'ref' @ [139:74] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'unconsumedStates' @ [139:79] ==> val unconsumedStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking reserve and release`.<anonymous>[LocalVariableDescriptor]

'ref' @ [139:99] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'randomUUID' @ [142:35] ==> public open fun randomUUID(): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'vaultSvc' @ [143:13] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'softLockReserve' @ [143:22] ==> public abstract fun softLockReserve(lockId: UUID, stateRefs: NonEmptySet<StateRef>): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'softLockId' @ [143:38] ==> val softLockId: (UUID..UUID?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking reserve and release`.<anonymous>[LocalVariableDescriptor]

'stateRefsToSoftLock' @ [143:50] ==> val stateRefsToSoftLock: NonEmptySet<StateRef> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking reserve and release`.<anonymous>[LocalVariableDescriptor]

'VaultQueryCriteria' @ [146:34] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'SoftLockingCondition' @ [146:76] ==> public constructor SoftLockingCondition(type: QueryCriteria.SoftLockingType, lockIds: List<UUID> = ...) defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedClassConstructorDescriptor]

'LOCKED_ONLY' @ [146:113] ==> enum entry LOCKED_ONLY defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'assertThat' @ [147:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'vaultQuery' @ [147:24] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [147:35] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteriaLocked' @ [147:55] ==> val criteriaLocked: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking reserve and release`.<anonymous>[LocalVariableDescriptor]

'states' @ [147:71] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'hasSize' @ [147:79] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'VaultQueryCriteria' @ [149:36] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'SoftLockingCondition' @ [149:78] ==> public constructor SoftLockingCondition(type: QueryCriteria.SoftLockingType, lockIds: List<UUID> = ...) defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedClassConstructorDescriptor]

'SPECIFIED' @ [149:115] ==> enum entry SPECIFIED defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'listOf' @ [149:126] ==> public fun <T> listOf(element: (UUID..UUID?)): List<(UUID..UUID?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.util.UUID..java.util.UUID?)

'softLockId' @ [149:133] ==> val softLockId: (UUID..UUID?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking reserve and release`.<anonymous>[LocalVariableDescriptor]

'assertThat' @ [150:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'vaultQuery' @ [150:24] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [150:35] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteriaByLockId' @ [150:55] ==> val criteriaByLockId: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking reserve and release`.<anonymous>[LocalVariableDescriptor]

'states' @ [150:73] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'hasSize' @ [150:81] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'vaultQuery' @ [153:35] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [153:46] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'VaultQueryCriteria' @ [153:66] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'SoftLockingCondition' @ [153:108] ==> public constructor SoftLockingCondition(type: QueryCriteria.SoftLockingType, lockIds: List<UUID> = ...) defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedClassConstructorDescriptor]

'UNLOCKED_ONLY' @ [153:145] ==> enum entry UNLOCKED_ONLY defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'states' @ [153:162] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'assertThat' @ [154:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'unlockedStates1' @ [154:24] ==> val unlockedStates1: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking reserve and release`.<anonymous>[LocalVariableDescriptor]

'hasSize' @ [154:41] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'vaultSvc' @ [157:13] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'softLockRelease' @ [157:22] ==> public abstract fun softLockRelease(lockId: UUID, stateRefs: NonEmptySet<StateRef>? = ...): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'softLockId' @ [157:38] ==> val softLockId: (UUID..UUID?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking reserve and release`.<anonymous>[LocalVariableDescriptor]

'NonEmptySet' @ [157:50] ==> public companion object defined in net.corda.core.utilities.NonEmptySet[FakeCallableDescriptorForObject]

'of' @ [157:62] ==> @JvmStatic public final fun <T> of(element: StateRef): NonEmptySet<StateRef> defined in net.corda.core.utilities.NonEmptySet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'unconsumedStates' @ [157:65] ==> val unconsumedStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking reserve and release`.<anonymous>[LocalVariableDescriptor]

'ref' @ [157:85] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'vaultQuery' @ [158:35] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [158:46] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'VaultQueryCriteria' @ [158:66] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'SoftLockingCondition' @ [158:108] ==> public constructor SoftLockingCondition(type: QueryCriteria.SoftLockingType, lockIds: List<UUID> = ...) defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedClassConstructorDescriptor]

'UNLOCKED_ONLY' @ [158:145] ==> enum entry UNLOCKED_ONLY defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'states' @ [158:162] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'assertThat' @ [159:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'unlockedStates2' @ [159:24] ==> val unlockedStates2: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking reserve and release`.<anonymous>[LocalVariableDescriptor]

'hasSize' @ [159:41] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'vaultSvc' @ [162:13] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'softLockRelease' @ [162:22] ==> public abstract fun softLockRelease(lockId: UUID, stateRefs: NonEmptySet<StateRef>? = ...): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'softLockId' @ [162:38] ==> val softLockId: (UUID..UUID?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking reserve and release`.<anonymous>[LocalVariableDescriptor]

'vaultQuery' @ [163:34] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [163:45] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'VaultQueryCriteria' @ [163:65] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'SoftLockingCondition' @ [163:107] ==> public constructor SoftLockingCondition(type: QueryCriteria.SoftLockingType, lockIds: List<UUID> = ...) defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedClassConstructorDescriptor]

'UNLOCKED_ONLY' @ [163:144] ==> enum entry UNLOCKED_ONLY defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'states' @ [163:161] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'assertThat' @ [164:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'unlockedStates' @ [164:24] ==> val unlockedStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking reserve and release`.<anonymous>[LocalVariableDescriptor]

'hasSize' @ [164:40] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'assertThat' @ [167:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'unlockedStates' @ [167:24] ==> val unlockedStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking reserve and release`.<anonymous>[LocalVariableDescriptor]

'isEqualTo' @ [167:40] ==> public open fun isEqualTo(p0: (Any..Any?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'unconsumedStates' @ [167:50] ==> val unconsumedStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking reserve and release`.<anonymous>[LocalVariableDescriptor]

'Test' @ [171:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'newFixedThreadPool' @ [173:44] ==> public open fun newFixedThreadPool(p0: Int): (ExecutorService..ExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'CountDownLatch' @ [174:25] ==> public constructor CountDownLatch(p0: Int) defined in java.util.concurrent.CountDownLatch[JavaClassConstructorDescriptor]

'randomUUID' @ [176:32] ==> public open fun randomUUID(): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'randomUUID' @ [177:32] ==> public open fun randomUUID(): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'VaultQueryCriteria' @ [179:33] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'SoftLockingCondition' @ [179:75] ==> public constructor SoftLockingCondition(type: QueryCriteria.SoftLockingType, lockIds: List<UUID> = ...) defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedClassConstructorDescriptor]

'SPECIFIED' @ [179:112] ==> enum entry SPECIFIED defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'listOf' @ [179:123] ==> public fun <T> listOf(element: (UUID..UUID?)): List<(UUID..UUID?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.util.UUID..java.util.UUID?)

'softLockId1' @ [179:130] ==> val softLockId1: (UUID..UUID?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`[LocalVariableDescriptor]

'VaultQueryCriteria' @ [180:33] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'SoftLockingCondition' @ [180:75] ==> public constructor SoftLockingCondition(type: QueryCriteria.SoftLockingType, lockIds: List<UUID> = ...) defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedClassConstructorDescriptor]

'SPECIFIED' @ [180:112] ==> enum entry SPECIFIED defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'listOf' @ [180:123] ==> public fun <T> listOf(element: (UUID..UUID?)): List<(UUID..UUID?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.util.UUID..java.util.UUID?)

'softLockId2' @ [180:130] ==> val softLockId2: (UUID..UUID?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`[LocalVariableDescriptor]

'database' @ [183:17] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [183:26] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<Cash.State>): Vault<Cash.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<State>

'assertEquals' @ [184:21] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Currency>, actual: Amount<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Currency>

'DOLLARS' @ [184:36] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'services' @ [184:45] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'getCashBalance' @ [184:54] ==> public fun ServiceHub.getCashBalance(currency: Currency): Amount<Currency> defined in net.corda.finance.contracts[DeserializedSimpleFunctionDescriptor]

'USD' @ [184:69] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'services' @ [185:21] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [185:30] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [185:55] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [185:64] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [185:80] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [185:100] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'vaultStates' @ [187:36] ==> val vaultStates: Vault<Cash.State> defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`[LocalVariableDescriptor]

'states' @ [187:48] ==> public final val states: Iterable<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault[DeserializedPropertyDescriptor]

'map' @ [187:55] ==> public inline fun <T, R> Iterable<StateAndRef<Cash.State>>.map(transform: (StateAndRef<Cash.State>) -> StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>
    <R> -> StateRef

'it' @ [187:61] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [187:64] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'toNonEmptySet' @ [187:71] ==> public fun <T> Collection<StateRef>.toNonEmptySet(): NonEmptySet<StateRef> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'println' @ [188:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'stateRefsToSoftLock' @ [188:32] ==> val stateRefsToSoftLock: NonEmptySet<StateRef> defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`[LocalVariableDescriptor]

'backgroundExecutor' @ [191:9] ==> val backgroundExecutor: (ExecutorService..ExecutorService?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`[LocalVariableDescriptor]

'submit' @ [191:28] ==> public final fun submit(p0: (() -> Unit..(() -> Unit)?)): (Future<*>..Future<*>?) defined in java.util.concurrent.ExecutorService[MyFunctionDescriptor]

'database' @ [193:17] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [193:26] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>..org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>?)

'vaultSvc' @ [194:21] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'softLockReserve' @ [194:30] ==> public abstract fun softLockReserve(lockId: UUID, stateRefs: NonEmptySet<StateRef>): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'softLockId1' @ [194:46] ==> val softLockId1: (UUID..UUID?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`[LocalVariableDescriptor]

'stateRefsToSoftLock' @ [194:59] ==> val stateRefsToSoftLock: NonEmptySet<StateRef> defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`[LocalVariableDescriptor]

'assertThat' @ [195:21] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'vaultQuery' @ [195:32] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [195:43] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteriaByLockId1' @ [195:63] ==> val criteriaByLockId1: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`[LocalVariableDescriptor]

'states' @ [195:82] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'hasSize' @ [195:90] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'println' @ [197:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'println' @ [199:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'countDown' @ [201:17] ==> val countDown: CountDownLatch defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`[LocalVariableDescriptor]

'countDown' @ [201:27] ==> public open fun countDown(): Unit defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'backgroundExecutor' @ [206:9] ==> val backgroundExecutor: (ExecutorService..ExecutorService?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`[LocalVariableDescriptor]

'submit' @ [206:28] ==> public final fun submit(p0: (() -> Unit..(() -> Unit)?)): (Future<*>..Future<*>?) defined in java.util.concurrent.ExecutorService[MyFunctionDescriptor]

'sleep' @ [208:24] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'database' @ [209:17] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [209:26] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>..org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>?)

'vaultSvc' @ [210:21] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'softLockReserve' @ [210:30] ==> public abstract fun softLockReserve(lockId: UUID, stateRefs: NonEmptySet<StateRef>): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'softLockId2' @ [210:46] ==> val softLockId2: (UUID..UUID?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`[LocalVariableDescriptor]

'stateRefsToSoftLock' @ [210:59] ==> val stateRefsToSoftLock: NonEmptySet<StateRef> defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`[LocalVariableDescriptor]

'assertThat' @ [211:21] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'vaultQuery' @ [211:32] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [211:43] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteriaByLockId2' @ [211:63] ==> val criteriaByLockId2: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`[LocalVariableDescriptor]

'states' @ [211:82] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'hasSize' @ [211:90] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'println' @ [213:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'println' @ [215:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'countDown' @ [217:17] ==> val countDown: CountDownLatch defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`[LocalVariableDescriptor]

'countDown' @ [217:27] ==> public open fun countDown(): Unit defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'countDown' @ [221:9] ==> val countDown: CountDownLatch defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`[LocalVariableDescriptor]

'await' @ [221:19] ==> public open fun await(): Unit defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'database' @ [222:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [222:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>?)>): AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>?)> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>..org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>?)>..org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>..org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>?)>?)>..org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>..org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>?)>..org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>..org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>?)>?)>?)>..org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>..org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>?)>..org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>..org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>?)>?)>..org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>..org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>?)>..org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>..org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>?)>?)>?)>?)>..org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>..org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>?)>..org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>..org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>?)>?)>..org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>..org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>?)>..org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>..org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>?)>?)>?)>..org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>..org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>?)>..org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>..org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>?)>?)>..org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>..org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>?)>..org.assertj.core.api.AbstractIntegerAssert<out (org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>..org.assertj.core.api.AbstractIntegerAssert<out kotlin.Any?>?)>?)>?)>?)>?)>

'vaultQuery' @ [223:33] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [223:44] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteriaByLockId1' @ [223:64] ==> val criteriaByLockId1: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`[LocalVariableDescriptor]

'states' @ [223:83] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'println' @ [224:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'lockStatesId1' @ [224:50] ==> val lockStatesId1: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`.<anonymous>[LocalVariableDescriptor]

'assertThat' @ [225:13] ==> @CheckReturnValue public open fun assertThat(p0: Int): (AbstractIntegerAssert<*>..AbstractIntegerAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'lockStatesId1' @ [225:24] ==> val lockStatesId1: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`.<anonymous>[LocalVariableDescriptor]

'size' @ [225:38] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'isIn' @ [225:44] ==> public open fun isIn(vararg p0: (Any..Any?)): (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractIntegerAssert[JavaMethodDescriptor]

'vaultQuery' @ [226:33] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [226:44] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteriaByLockId2' @ [226:64] ==> val criteriaByLockId2: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`[LocalVariableDescriptor]

'states' @ [226:83] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'println' @ [227:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'lockStatesId2' @ [227:50] ==> val lockStatesId2: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`.<anonymous>[LocalVariableDescriptor]

'assertThat' @ [228:13] ==> @CheckReturnValue public open fun assertThat(p0: Int): (AbstractIntegerAssert<*>..AbstractIntegerAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'lockStatesId2' @ [228:24] ==> val lockStatesId2: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking attempt concurrent reserve`.<anonymous>[LocalVariableDescriptor]

'size' @ [228:38] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'isIn' @ [228:44] ==> public open fun isIn(vararg p0: (Any..Any?)): (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractIntegerAssert[JavaMethodDescriptor]

'Test' @ [232:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'randomUUID' @ [234:32] ==> public open fun randomUUID(): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'randomUUID' @ [235:32] ==> public open fun randomUUID(): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'database' @ [238:17] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [238:26] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<Cash.State>): Vault<Cash.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<State>

'assertEquals' @ [239:21] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Currency>, actual: Amount<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Currency>

'DOLLARS' @ [239:36] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'services' @ [239:45] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'getCashBalance' @ [239:54] ==> public fun ServiceHub.getCashBalance(currency: Currency): Amount<Currency> defined in net.corda.finance.contracts[DeserializedSimpleFunctionDescriptor]

'USD' @ [239:69] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'services' @ [240:21] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [240:30] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [240:55] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [240:64] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [240:80] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [240:100] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'vaultStates' @ [242:35] ==> val vaultStates: Vault<Cash.State> defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking partial reserve states fails`[LocalVariableDescriptor]

'states' @ [242:47] ==> public final val states: Iterable<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault[DeserializedPropertyDescriptor]

'map' @ [242:54] ==> public inline fun <T, R> Iterable<StateAndRef<Cash.State>>.map(transform: (StateAndRef<Cash.State>) -> StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>
    <R> -> StateRef

'it' @ [242:60] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking partial reserve states fails`.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [242:63] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'println' @ [243:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'stateRefsToSoftLock' @ [243:32] ==> val stateRefsToSoftLock: List<StateRef> defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking partial reserve states fails`[LocalVariableDescriptor]

'database' @ [246:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [246:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>..org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>?)

'vaultSvc' @ [247:13] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'softLockReserve' @ [247:22] ==> public abstract fun softLockReserve(lockId: UUID, stateRefs: NonEmptySet<StateRef>): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'softLockId1' @ [247:38] ==> val softLockId1: (UUID..UUID?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking partial reserve states fails`[LocalVariableDescriptor]

'NonEmptySet' @ [247:51] ==> public companion object defined in net.corda.core.utilities.NonEmptySet[FakeCallableDescriptorForObject]

'of' @ [247:63] ==> @JvmStatic public final fun <T> of(element: StateRef): NonEmptySet<StateRef> defined in net.corda.core.utilities.NonEmptySet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'stateRefsToSoftLock' @ [247:66] ==> val stateRefsToSoftLock: List<StateRef> defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking partial reserve states fails`[LocalVariableDescriptor]

'first' @ [247:86] ==> public fun <T> List<StateRef>.first(): StateRef defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'VaultQueryCriteria' @ [248:37] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'SoftLockingCondition' @ [248:79] ==> public constructor SoftLockingCondition(type: QueryCriteria.SoftLockingType, lockIds: List<UUID> = ...) defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedClassConstructorDescriptor]

'SPECIFIED' @ [248:116] ==> enum entry SPECIFIED defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'listOf' @ [248:127] ==> public fun <T> listOf(element: (UUID..UUID?)): List<(UUID..UUID?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.util.UUID..java.util.UUID?)

'softLockId1' @ [248:134] ==> val softLockId1: (UUID..UUID?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking partial reserve states fails`[LocalVariableDescriptor]

'assertThat' @ [249:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'vaultQuery' @ [249:24] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [249:35] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteriaByLockId1' @ [249:55] ==> val criteriaByLockId1: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking partial reserve states fails`.<anonymous>[LocalVariableDescriptor]

'states' @ [249:74] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'hasSize' @ [249:82] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'database' @ [253:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [253:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ThrowableAssertAlternative<(StatesNotAvailableException..StatesNotAvailableException?)>..ThrowableAssertAlternative<(StatesNotAvailableException..StatesNotAvailableException?)>?)): (ThrowableAssertAlternative<(StatesNotAvailableException..StatesNotAvailableException?)>..ThrowableAssertAlternative<(StatesNotAvailableException..StatesNotAvailableException?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ThrowableAssertAlternative<(net.corda.core.node.services.StatesNotAvailableException..net.corda.core.node.services.StatesNotAvailableException?)>..org.assertj.core.api.ThrowableAssertAlternative<(net.corda.core.node.services.StatesNotAvailableException..net.corda.core.node.services.StatesNotAvailableException?)>?)

'assertThatExceptionOfType' @ [254:13] ==> @CheckReturnValue public open fun <T : (Throwable..Throwable?)> assertThatExceptionOfType(p0: (Class<out (StatesNotAvailableException..StatesNotAvailableException?)>..Class<out (StatesNotAvailableException..StatesNotAvailableException?)>?)): (ThrowableTypeAssert<(StatesNotAvailableException..StatesNotAvailableException?)>..ThrowableTypeAssert<(StatesNotAvailableException..StatesNotAvailableException?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Throwable..Throwable?)> -> StatesNotAvailableException

'StatesNotAvailableException' @ [254:39] ==> public constructor StatesNotAvailableException(message: String?, cause: Throwable? = ...) defined in net.corda.core.node.services.StatesNotAvailableException[DeserializedClassConstructorDescriptor]

'java' @ [254:74] ==> public val <T> KClass<StatesNotAvailableException>.java: Class<StatesNotAvailableException> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> StatesNotAvailableException

'isThrownBy' @ [254:80] ==> public final fun isThrownBy(p0: (() -> Unit..(() -> Unit)?)): (ThrowableAssertAlternative<(StatesNotAvailableException..StatesNotAvailableException?)>..ThrowableAssertAlternative<(StatesNotAvailableException..StatesNotAvailableException?)>?) defined in org.assertj.core.api.ThrowableTypeAssert[MyFunctionDescriptor]

'vaultSvc' @ [255:23] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'softLockReserve' @ [255:32] ==> public abstract fun softLockReserve(lockId: UUID, stateRefs: NonEmptySet<StateRef>): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'softLockId2' @ [255:48] ==> val softLockId2: (UUID..UUID?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking partial reserve states fails`[LocalVariableDescriptor]

'stateRefsToSoftLock' @ [255:61] ==> val stateRefsToSoftLock: List<StateRef> defined in net.corda.node.services.vault.NodeVaultServiceTest.`soft locking partial reserve states fails`[LocalVariableDescriptor]

'toNonEmptySet' @ [255:81] ==> public fun <T> Collection<StateRef>.toNonEmptySet(): NonEmptySet<StateRef> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'withMessageContaining' @ [256:15] ==> public open fun withMessageContaining(p0: (String..String?)): (ThrowableAssertAlternative<(StatesNotAvailableException..StatesNotAvailableException?)>..ThrowableAssertAlternative<(StatesNotAvailableException..StatesNotAvailableException?)>?) defined in org.assertj.core.api.ThrowableAssertAlternative[JavaMethodDescriptor]

'withNoCause' @ [256:62] ==> public open fun withNoCause(): (ThrowableAssertAlternative<(StatesNotAvailableException..StatesNotAvailableException?)>..ThrowableAssertAlternative<(StatesNotAvailableException..StatesNotAvailableException?)>?) defined in org.assertj.core.api.ThrowableAssertAlternative[JavaMethodDescriptor]

'Test' @ [260:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'randomUUID' @ [262:32] ==> public open fun randomUUID(): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'VaultQueryCriteria' @ [263:33] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'SoftLockingCondition' @ [263:75] ==> public constructor SoftLockingCondition(type: QueryCriteria.SoftLockingType, lockIds: List<UUID> = ...) defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedClassConstructorDescriptor]

'SPECIFIED' @ [263:112] ==> enum entry SPECIFIED defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'listOf' @ [263:123] ==> public fun <T> listOf(element: (UUID..UUID?)): List<(UUID..UUID?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.util.UUID..java.util.UUID?)

'softLockId1' @ [263:130] ==> val softLockId1: (UUID..UUID?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`attempt to lock states already soft locked by me`[LocalVariableDescriptor]

'database' @ [266:17] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [266:26] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<Cash.State>): Vault<Cash.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<State>

'assertEquals' @ [267:21] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Currency>, actual: Amount<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Currency>

'DOLLARS' @ [267:36] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'services' @ [267:45] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'getCashBalance' @ [267:54] ==> public fun ServiceHub.getCashBalance(currency: Currency): Amount<Currency> defined in net.corda.finance.contracts[DeserializedSimpleFunctionDescriptor]

'USD' @ [267:69] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'services' @ [268:21] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [268:30] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [268:55] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [268:64] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [268:80] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [268:100] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'vaultStates' @ [270:36] ==> val vaultStates: Vault<Cash.State> defined in net.corda.node.services.vault.NodeVaultServiceTest.`attempt to lock states already soft locked by me`[LocalVariableDescriptor]

'states' @ [270:48] ==> public final val states: Iterable<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault[DeserializedPropertyDescriptor]

'map' @ [270:55] ==> public inline fun <T, R> Iterable<StateAndRef<Cash.State>>.map(transform: (StateAndRef<Cash.State>) -> StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>
    <R> -> StateRef

'it' @ [270:61] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.vault.NodeVaultServiceTest.`attempt to lock states already soft locked by me`.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [270:64] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'toNonEmptySet' @ [270:71] ==> public fun <T> Collection<StateRef>.toNonEmptySet(): NonEmptySet<StateRef> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'println' @ [271:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'stateRefsToSoftLock' @ [271:32] ==> val stateRefsToSoftLock: NonEmptySet<StateRef> defined in net.corda.node.services.vault.NodeVaultServiceTest.`attempt to lock states already soft locked by me`[LocalVariableDescriptor]

'database' @ [274:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [274:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>..org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>?)

'vaultSvc' @ [275:13] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'softLockReserve' @ [275:22] ==> public abstract fun softLockReserve(lockId: UUID, stateRefs: NonEmptySet<StateRef>): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'softLockId1' @ [275:38] ==> val softLockId1: (UUID..UUID?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`attempt to lock states already soft locked by me`[LocalVariableDescriptor]

'stateRefsToSoftLock' @ [275:51] ==> val stateRefsToSoftLock: NonEmptySet<StateRef> defined in net.corda.node.services.vault.NodeVaultServiceTest.`attempt to lock states already soft locked by me`[LocalVariableDescriptor]

'assertThat' @ [276:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'vaultQuery' @ [276:24] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [276:35] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteriaByLockId1' @ [276:55] ==> val criteriaByLockId1: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.NodeVaultServiceTest.`attempt to lock states already soft locked by me`[LocalVariableDescriptor]

'states' @ [276:74] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'hasSize' @ [276:82] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'database' @ [280:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [280:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>..org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>?)

'vaultSvc' @ [281:13] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'softLockReserve' @ [281:22] ==> public abstract fun softLockReserve(lockId: UUID, stateRefs: NonEmptySet<StateRef>): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'softLockId1' @ [281:38] ==> val softLockId1: (UUID..UUID?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`attempt to lock states already soft locked by me`[LocalVariableDescriptor]

'stateRefsToSoftLock' @ [281:51] ==> val stateRefsToSoftLock: NonEmptySet<StateRef> defined in net.corda.node.services.vault.NodeVaultServiceTest.`attempt to lock states already soft locked by me`[LocalVariableDescriptor]

'assertThat' @ [282:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'vaultQuery' @ [282:24] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [282:35] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteriaByLockId1' @ [282:55] ==> val criteriaByLockId1: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.NodeVaultServiceTest.`attempt to lock states already soft locked by me`[LocalVariableDescriptor]

'states' @ [282:74] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'hasSize' @ [282:82] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [286:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'randomUUID' @ [289:32] ==> public open fun randomUUID(): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'VaultQueryCriteria' @ [290:33] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'SoftLockingCondition' @ [290:75] ==> public constructor SoftLockingCondition(type: QueryCriteria.SoftLockingType, lockIds: List<UUID> = ...) defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedClassConstructorDescriptor]

'SPECIFIED' @ [290:112] ==> enum entry SPECIFIED defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'listOf' @ [290:123] ==> public fun <T> listOf(element: (UUID..UUID?)): List<(UUID..UUID?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.util.UUID..java.util.UUID?)

'softLockId1' @ [290:130] ==> val softLockId1: (UUID..UUID?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`lock additional states to some already soft locked by me`[LocalVariableDescriptor]

'database' @ [293:17] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [293:26] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<Cash.State>): Vault<Cash.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<State>

'assertEquals' @ [294:21] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Currency>, actual: Amount<Currency>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Currency>

'DOLLARS' @ [294:36] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'services' @ [294:45] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'getCashBalance' @ [294:54] ==> public fun ServiceHub.getCashBalance(currency: Currency): Amount<Currency> defined in net.corda.finance.contracts[DeserializedSimpleFunctionDescriptor]

'USD' @ [294:69] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'services' @ [295:21] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [295:30] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [295:55] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [295:64] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [295:80] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [295:100] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'vaultStates' @ [297:35] ==> val vaultStates: Vault<Cash.State> defined in net.corda.node.services.vault.NodeVaultServiceTest.`lock additional states to some already soft locked by me`[LocalVariableDescriptor]

'states' @ [297:47] ==> public final val states: Iterable<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault[DeserializedPropertyDescriptor]

'map' @ [297:54] ==> public inline fun <T, R> Iterable<StateAndRef<Cash.State>>.map(transform: (StateAndRef<Cash.State>) -> StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>
    <R> -> StateRef

'it' @ [297:60] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.vault.NodeVaultServiceTest.`lock additional states to some already soft locked by me`.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [297:63] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'println' @ [298:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'stateRefsToSoftLock' @ [298:32] ==> val stateRefsToSoftLock: List<StateRef> defined in net.corda.node.services.vault.NodeVaultServiceTest.`lock additional states to some already soft locked by me`[LocalVariableDescriptor]

'database' @ [301:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [301:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>..org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>?)

'vaultSvc' @ [302:13] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'softLockReserve' @ [302:22] ==> public abstract fun softLockReserve(lockId: UUID, stateRefs: NonEmptySet<StateRef>): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'softLockId1' @ [302:38] ==> val softLockId1: (UUID..UUID?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`lock additional states to some already soft locked by me`[LocalVariableDescriptor]

'NonEmptySet' @ [302:51] ==> public companion object defined in net.corda.core.utilities.NonEmptySet[FakeCallableDescriptorForObject]

'of' @ [302:63] ==> @JvmStatic public final fun <T> of(element: StateRef): NonEmptySet<StateRef> defined in net.corda.core.utilities.NonEmptySet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'stateRefsToSoftLock' @ [302:66] ==> val stateRefsToSoftLock: List<StateRef> defined in net.corda.node.services.vault.NodeVaultServiceTest.`lock additional states to some already soft locked by me`[LocalVariableDescriptor]

'first' @ [302:86] ==> public fun <T> List<StateRef>.first(): StateRef defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'assertThat' @ [303:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'vaultQuery' @ [303:24] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [303:35] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteriaByLockId1' @ [303:55] ==> val criteriaByLockId1: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.NodeVaultServiceTest.`lock additional states to some already soft locked by me`[LocalVariableDescriptor]

'states' @ [303:74] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'hasSize' @ [303:82] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'database' @ [307:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [307:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>..org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>?)

'vaultSvc' @ [308:13] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'softLockReserve' @ [308:22] ==> public abstract fun softLockReserve(lockId: UUID, stateRefs: NonEmptySet<StateRef>): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'softLockId1' @ [308:38] ==> val softLockId1: (UUID..UUID?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`lock additional states to some already soft locked by me`[LocalVariableDescriptor]

'stateRefsToSoftLock' @ [308:51] ==> val stateRefsToSoftLock: List<StateRef> defined in net.corda.node.services.vault.NodeVaultServiceTest.`lock additional states to some already soft locked by me`[LocalVariableDescriptor]

'toNonEmptySet' @ [308:71] ==> public fun <T> Collection<StateRef>.toNonEmptySet(): NonEmptySet<StateRef> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'assertThat' @ [309:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'vaultQuery' @ [309:24] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [309:35] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteriaByLockId1' @ [309:55] ==> val criteriaByLockId1: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.NodeVaultServiceTest.`lock additional states to some already soft locked by me`[LocalVariableDescriptor]

'states' @ [309:74] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'hasSize' @ [309:82] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [313:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [315:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [315:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<Cash.State>): Vault<Cash.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<State>

'services' @ [316:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [316:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [316:47] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [316:56] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [316:72] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [316:92] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'database' @ [318:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [318:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>..org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>?)

'vaultQuery' @ [320:36] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [320:47] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [320:69] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'assertThat' @ [321:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'unconsumedStates' @ [321:24] ==> val unconsumedStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending exact amount`.<anonymous>[LocalVariableDescriptor]

'hasSize' @ [321:42] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'vaultSvc' @ [323:38] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'unconsumedCashStatesForSpending' @ [323:47] ==> @Suspendable private final fun VaultService.unconsumedCashStatesForSpending(amount: Amount<Currency>, onlyFromIssuerParties: Set<AbstractParty>? = ..., notary: Party? = ..., lockId: UUID = ..., withIssuerRefs: Set<OpaqueBytes>? = ...): List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest[SimpleFunctionDescriptorImpl]

'DOLLARS' @ [323:83] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'spendableStatesUSD' @ [324:13] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending exact amount`.<anonymous>[LocalVariableDescriptor]

'forEach' @ [324:32] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<Cash.State>>.forEach(action: (StateAndRef<Cash.State>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'assertThat' @ [325:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'spendableStatesUSD' @ [325:24] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending exact amount`.<anonymous>[LocalVariableDescriptor]

'hasSize' @ [325:44] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'assertThat' @ [326:13] ==> @CheckReturnValue public open fun assertThat(p0: Long): (AbstractLongAssert<*>..AbstractLongAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'spendableStatesUSD' @ [326:24] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending exact amount`.<anonymous>[LocalVariableDescriptor]

'state' @ [326:46] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [326:52] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [326:57] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'quantity' @ [326:64] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'isEqualTo' @ [326:74] ==> public open fun isEqualTo(p0: Long): (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractLongAssert[JavaMethodDescriptor]

'*' @ [326:84] ==> public final operator fun times(other: Int): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'VaultQueryCriteria' @ [327:34] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'SoftLockingCondition' @ [327:76] ==> public constructor SoftLockingCondition(type: QueryCriteria.SoftLockingType, lockIds: List<UUID> = ...) defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedClassConstructorDescriptor]

'LOCKED_ONLY' @ [327:113] ==> enum entry LOCKED_ONLY defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'assertThat' @ [328:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'vaultQuery' @ [328:24] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [328:35] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteriaLocked' @ [328:55] ==> val criteriaLocked: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending exact amount`.<anonymous>[LocalVariableDescriptor]

'states' @ [328:71] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'hasSize' @ [328:79] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [332:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [334:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [334:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<Cash.State>): Vault<Cash.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<State>

'services' @ [335:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [335:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [335:47] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [335:56] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [335:72] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [335:92] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'DUMMY_CASH_ISSUER' @ [335:116] ==> public val DUMMY_CASH_ISSUER: PartyAndReference defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'services' @ [336:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [336:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [336:47] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [336:56] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [336:72] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [336:92] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'BOC' @ [336:116] ==> public val BOC: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [336:120] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'database' @ [338:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [338:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>): AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>?), (net.corda.core.contracts.PartyAndReference..net.corda.core.contracts.PartyAndReference?)>

'vaultSvc' @ [339:38] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'unconsumedCashStatesForSpending' @ [339:47] ==> @Suspendable private final fun VaultService.unconsumedCashStatesForSpending(amount: Amount<Currency>, onlyFromIssuerParties: Set<AbstractParty>? = ..., notary: Party? = ..., lockId: UUID = ..., withIssuerRefs: Set<OpaqueBytes>? = ...): List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest[SimpleFunctionDescriptorImpl]

'DOLLARS' @ [339:83] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'setOf' @ [340:45] ==> public fun <T> setOf(vararg elements: AbstractParty): Set<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'DUMMY_CASH_ISSUER' @ [340:51] ==> public val DUMMY_CASH_ISSUER: PartyAndReference defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'party' @ [340:69] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'BOC' @ [340:76] ==> public val BOC: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'spendableStatesUSD' @ [341:13] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending from two issuer parties`.<anonymous>[LocalVariableDescriptor]

'forEach' @ [341:32] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<Cash.State>>.forEach(action: (StateAndRef<Cash.State>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'assertThat' @ [342:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'spendableStatesUSD' @ [342:24] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending from two issuer parties`.<anonymous>[LocalVariableDescriptor]

'hasSize' @ [342:44] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'assertThat' @ [343:13] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (PartyAndReference..PartyAndReference?)): (AbstractObjectAssert<*, (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<*, (PartyAndReference..PartyAndReference?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PartyAndReference

'spendableStatesUSD' @ [343:24] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending from two issuer parties`.<anonymous>[LocalVariableDescriptor]

'state' @ [343:46] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [343:52] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [343:57] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [343:64] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [343:70] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'isIn' @ [343:78] ==> public open fun isIn(vararg p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'DUMMY_CASH_ISSUER' @ [343:83] ==> public val DUMMY_CASH_ISSUER: PartyAndReference defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'BOC' @ [343:102] ==> public val BOC: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [343:106] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [344:13] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (PartyAndReference..PartyAndReference?)): (AbstractObjectAssert<*, (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<*, (PartyAndReference..PartyAndReference?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PartyAndReference

'spendableStatesUSD' @ [344:24] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending from two issuer parties`.<anonymous>[LocalVariableDescriptor]

'state' @ [344:46] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [344:52] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [344:57] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [344:64] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [344:70] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'isIn' @ [344:78] ==> public open fun isIn(vararg p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'DUMMY_CASH_ISSUER' @ [344:83] ==> public val DUMMY_CASH_ISSUER: PartyAndReference defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'BOC' @ [344:102] ==> public val BOC: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [344:106] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [345:13] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (PartyAndReference..PartyAndReference?)): (AbstractObjectAssert<*, (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<*, (PartyAndReference..PartyAndReference?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PartyAndReference

'spendableStatesUSD' @ [345:24] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending from two issuer parties`.<anonymous>[LocalVariableDescriptor]

'state' @ [345:46] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [345:52] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [345:57] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [345:64] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [345:70] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'isNotEqualTo' @ [345:78] ==> public open fun isNotEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?), (PartyAndReference..PartyAndReference?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'spendableStatesUSD' @ [345:91] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending from two issuer parties`.<anonymous>[LocalVariableDescriptor]

'state' @ [345:113] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [345:119] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [345:124] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [345:131] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [345:137] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'Test' @ [349:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [351:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [351:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<Cash.State>): Vault<Cash.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<State>

'services' @ [352:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [352:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [352:47] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [352:56] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [352:72] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [352:92] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'DUMMY_CASH_ISSUER' @ [352:116] ==> public val DUMMY_CASH_ISSUER: PartyAndReference defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'services' @ [353:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [353:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [353:47] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [353:56] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [353:72] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [353:92] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'BOC' @ [353:116] ==> public val BOC: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [353:120] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'OpaqueBytes' @ [353:135] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [353:147] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'services' @ [354:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [354:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [354:47] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [354:56] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [354:72] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [354:92] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'BOC' @ [354:116] ==> public val BOC: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [354:120] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'OpaqueBytes' @ [354:135] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [354:147] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'services' @ [355:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [355:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [355:47] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [355:56] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [355:72] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [355:92] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'BOC' @ [355:116] ==> public val BOC: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [355:120] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'OpaqueBytes' @ [355:135] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [355:147] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'database' @ [357:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [357:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>): AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>..org.assertj.core.api.AbstractComparableAssert<out (org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractComparableAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>?), (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)>

'vaultQuery' @ [358:36] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [358:47] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [358:69] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'assertThat' @ [359:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'unconsumedStates' @ [359:24] ==> val unconsumedStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending from specific issuer party and refs`.<anonymous>[LocalVariableDescriptor]

'hasSize' @ [359:42] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'vaultSvc' @ [361:38] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'unconsumedCashStatesForSpending' @ [361:47] ==> @Suspendable private final fun VaultService.unconsumedCashStatesForSpending(amount: Amount<Currency>, onlyFromIssuerParties: Set<AbstractParty>? = ..., notary: Party? = ..., lockId: UUID = ..., withIssuerRefs: Set<OpaqueBytes>? = ...): List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest[SimpleFunctionDescriptorImpl]

'DOLLARS' @ [361:83] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'setOf' @ [362:45] ==> public fun <T> setOf(element: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'BOC' @ [362:51] ==> public val BOC: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'setOf' @ [362:74] ==> public fun <T> setOf(vararg elements: OpaqueBytes): Set<OpaqueBytes> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OpaqueBytes

'OpaqueBytes' @ [362:80] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [362:92] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'OpaqueBytes' @ [362:99] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [362:111] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [363:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'spendableStatesUSD' @ [363:24] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending from specific issuer party and refs`.<anonymous>[LocalVariableDescriptor]

'hasSize' @ [363:44] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'assertThat' @ [364:13] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (AbstractParty..AbstractParty?)): (AbstractObjectAssert<*, (AbstractParty..AbstractParty?)>..AbstractObjectAssert<*, (AbstractParty..AbstractParty?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AbstractParty

'spendableStatesUSD' @ [364:24] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending from specific issuer party and refs`.<anonymous>[LocalVariableDescriptor]

'state' @ [364:46] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [364:52] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [364:57] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [364:64] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [364:70] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'party' @ [364:77] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'isEqualTo' @ [364:84] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractParty..AbstractParty?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractParty..AbstractParty?)>?), (AbstractParty..AbstractParty?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractParty..AbstractParty?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractParty..AbstractParty?)>?), (AbstractParty..AbstractParty?)>?), (AbstractParty..AbstractParty?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractParty..AbstractParty?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractParty..AbstractParty?)>?), (AbstractParty..AbstractParty?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractParty..AbstractParty?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractParty..AbstractParty?)>?), (AbstractParty..AbstractParty?)>?), (AbstractParty..AbstractParty?)>?), (AbstractParty..AbstractParty?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractParty..AbstractParty?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractParty..AbstractParty?)>?), (AbstractParty..AbstractParty?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractParty..AbstractParty?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractParty..AbstractParty?)>?), (AbstractParty..AbstractParty?)>?), (AbstractParty..AbstractParty?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractParty..AbstractParty?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractParty..AbstractParty?)>?), (AbstractParty..AbstractParty?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractParty..AbstractParty?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractParty..AbstractParty?)>?), (AbstractParty..AbstractParty?)>?), (AbstractParty..AbstractParty?)>?), (AbstractParty..AbstractParty?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'BOC' @ [364:94] ==> public val BOC: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'assertThat' @ [365:13] ==> @CheckReturnValue public open fun <T : (Comparable<(OpaqueBytes..OpaqueBytes?)>..Comparable<(OpaqueBytes..OpaqueBytes?)>?)> assertThat(p0: (OpaqueBytes..OpaqueBytes?)): (AbstractComparableAssert<*, (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<*, (OpaqueBytes..OpaqueBytes?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Comparable<(T..T?)>..Comparable<(T..T?)>?)> -> OpaqueBytes

'spendableStatesUSD' @ [365:24] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending from specific issuer party and refs`.<anonymous>[LocalVariableDescriptor]

'state' @ [365:46] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [365:52] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [365:57] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [365:64] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [365:70] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'reference' @ [365:77] ==> public final val reference: OpaqueBytes defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'isIn' @ [365:88] ==> public open fun isIn(vararg p0: (Any..Any?)): (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?) defined in org.assertj.core.api.AbstractComparableAssert[JavaMethodDescriptor]

'BOC' @ [365:93] ==> public val BOC: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [365:97] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'reference' @ [365:104] ==> public final val reference: OpaqueBytes defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'BOC' @ [365:115] ==> public val BOC: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [365:119] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'reference' @ [365:126] ==> public final val reference: OpaqueBytes defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'assertThat' @ [366:13] ==> @CheckReturnValue public open fun <T : (Comparable<(OpaqueBytes..OpaqueBytes?)>..Comparable<(OpaqueBytes..OpaqueBytes?)>?)> assertThat(p0: (OpaqueBytes..OpaqueBytes?)): (AbstractComparableAssert<*, (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<*, (OpaqueBytes..OpaqueBytes?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Comparable<(T..T?)>..Comparable<(T..T?)>?)> -> OpaqueBytes

'spendableStatesUSD' @ [366:24] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending from specific issuer party and refs`.<anonymous>[LocalVariableDescriptor]

'state' @ [366:46] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [366:52] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [366:57] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [366:64] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [366:70] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'reference' @ [366:77] ==> public final val reference: OpaqueBytes defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'isIn' @ [366:88] ==> public open fun isIn(vararg p0: (Any..Any?)): (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?) defined in org.assertj.core.api.AbstractComparableAssert[JavaMethodDescriptor]

'BOC' @ [366:93] ==> public val BOC: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [366:97] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'reference' @ [366:104] ==> public final val reference: OpaqueBytes defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'BOC' @ [366:115] ==> public val BOC: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [366:119] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'reference' @ [366:126] ==> public final val reference: OpaqueBytes defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'assertThat' @ [367:13] ==> @CheckReturnValue public open fun <T : (Comparable<(OpaqueBytes..OpaqueBytes?)>..Comparable<(OpaqueBytes..OpaqueBytes?)>?)> assertThat(p0: (OpaqueBytes..OpaqueBytes?)): (AbstractComparableAssert<*, (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<*, (OpaqueBytes..OpaqueBytes?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Comparable<(T..T?)>..Comparable<(T..T?)>?)> -> OpaqueBytes

'spendableStatesUSD' @ [367:24] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending from specific issuer party and refs`.<anonymous>[LocalVariableDescriptor]

'state' @ [367:46] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [367:52] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [367:57] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [367:64] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [367:70] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'reference' @ [367:77] ==> public final val reference: OpaqueBytes defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'isNotEqualTo' @ [367:88] ==> public open fun isNotEqualTo(p0: (Any..Any?)): (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?), (OpaqueBytes..OpaqueBytes?)>?) defined in org.assertj.core.api.AbstractComparableAssert[JavaMethodDescriptor]

'spendableStatesUSD' @ [367:101] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending from specific issuer party and refs`.<anonymous>[LocalVariableDescriptor]

'state' @ [367:123] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [367:129] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [367:134] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [367:141] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [367:147] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'reference' @ [367:154] ==> public final val reference: OpaqueBytes defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'Test' @ [371:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [373:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [373:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<Cash.State>): Vault<Cash.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<State>

'services' @ [374:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [374:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [374:47] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [374:56] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [374:72] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [374:92] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'database' @ [376:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [376:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>..org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>?)

'vaultQuery' @ [377:36] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [377:47] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [377:69] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'assertThat' @ [378:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'unconsumedStates' @ [378:24] ==> val unconsumedStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending insufficient amount`.<anonymous>[LocalVariableDescriptor]

'hasSize' @ [378:42] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'vaultSvc' @ [380:38] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'unconsumedCashStatesForSpending' @ [380:47] ==> @Suspendable private final fun VaultService.unconsumedCashStatesForSpending(amount: Amount<Currency>, onlyFromIssuerParties: Set<AbstractParty>? = ..., notary: Party? = ..., lockId: UUID = ..., withIssuerRefs: Set<OpaqueBytes>? = ...): List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest[SimpleFunctionDescriptorImpl]

'DOLLARS' @ [380:83] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'spendableStatesUSD' @ [381:13] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending insufficient amount`.<anonymous>[LocalVariableDescriptor]

'forEach' @ [381:32] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<Cash.State>>.forEach(action: (StateAndRef<Cash.State>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'assertThat' @ [382:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'spendableStatesUSD' @ [382:24] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending insufficient amount`.<anonymous>[LocalVariableDescriptor]

'hasSize' @ [382:44] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'VaultQueryCriteria' @ [383:34] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'SoftLockingCondition' @ [383:76] ==> public constructor SoftLockingCondition(type: QueryCriteria.SoftLockingType, lockIds: List<UUID> = ...) defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedClassConstructorDescriptor]

'LOCKED_ONLY' @ [383:113] ==> enum entry LOCKED_ONLY defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'assertThat' @ [384:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'vaultQuery' @ [384:24] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [384:35] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteriaLocked' @ [384:55] ==> val criteriaLocked: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending insufficient amount`.<anonymous>[LocalVariableDescriptor]

'states' @ [384:71] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'hasSize' @ [384:79] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [388:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [390:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [390:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<Cash.State>): Vault<Cash.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<State>

'services' @ [391:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [391:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [391:47] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [391:56] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [391:72] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [391:92] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'database' @ [393:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [393:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>..org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>?)

'vaultQuery' @ [394:36] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [394:47] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [394:69] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'assertThat' @ [395:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'unconsumedStates' @ [395:24] ==> val unconsumedStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending small amount`.<anonymous>[LocalVariableDescriptor]

'hasSize' @ [395:42] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'vaultSvc' @ [397:38] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'unconsumedCashStatesForSpending' @ [397:47] ==> @Suspendable private final fun VaultService.unconsumedCashStatesForSpending(amount: Amount<Currency>, onlyFromIssuerParties: Set<AbstractParty>? = ..., notary: Party? = ..., lockId: UUID = ..., withIssuerRefs: Set<OpaqueBytes>? = ...): List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest[SimpleFunctionDescriptorImpl]

'DOLLARS' @ [397:81] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'spendableStatesUSD' @ [398:13] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending small amount`.<anonymous>[LocalVariableDescriptor]

'forEach' @ [398:32] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<Cash.State>>.forEach(action: (StateAndRef<Cash.State>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'assertThat' @ [399:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'spendableStatesUSD' @ [399:24] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending small amount`.<anonymous>[LocalVariableDescriptor]

'hasSize' @ [399:44] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'assertThat' @ [400:13] ==> @CheckReturnValue public open fun assertThat(p0: Long): (AbstractLongAssert<*>..AbstractLongAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'spendableStatesUSD' @ [400:24] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending small amount`.<anonymous>[LocalVariableDescriptor]

'state' @ [400:46] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [400:52] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [400:57] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'quantity' @ [400:64] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'isGreaterThanOrEqualTo' @ [400:74] ==> public open fun isGreaterThanOrEqualTo(p0: Long): (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractLongAssert[JavaMethodDescriptor]

'VaultQueryCriteria' @ [401:34] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'SoftLockingCondition' @ [401:76] ==> public constructor SoftLockingCondition(type: QueryCriteria.SoftLockingType, lockIds: List<UUID> = ...) defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedClassConstructorDescriptor]

'LOCKED_ONLY' @ [401:113] ==> enum entry LOCKED_ONLY defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'assertThat' @ [402:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'vaultQuery' @ [402:24] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [402:35] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteriaLocked' @ [402:55] ==> val criteriaLocked: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.NodeVaultServiceTest.`unconsumedStatesForSpending small amount`.<anonymous>[LocalVariableDescriptor]

'states' @ [402:71] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'hasSize' @ [402:79] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [406:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [408:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [408:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<Cash.State>): Vault<Cash.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<State>

'services' @ [409:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [409:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [409:47] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [409:56] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [409:72] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [409:94] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'services' @ [410:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [410:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'POUNDS' @ [410:47] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [410:55] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [410:71] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [410:93] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'services' @ [411:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [411:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'SWISS_FRANCS' @ [411:47] ==> public val Int.SWISS_FRANCS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [411:61] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [411:77] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [411:99] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'database' @ [413:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [413:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>..org.assertj.core.api.ListAssert<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>?)

'vaultQuery' @ [415:29] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [415:40] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [415:62] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'assertThat' @ [416:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'allStates' @ [416:24] ==> val allStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'hasSize' @ [416:35] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'unlockedStates' @ [416:43] ==> var unlockedStates: Int defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'..' @ [419:23] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'randomUUID' @ [420:35] ==> public open fun randomUUID(): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'vaultSvc' @ [421:42] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'unconsumedCashStatesForSpending' @ [421:51] ==> @Suspendable private final fun VaultService.unconsumedCashStatesForSpending(amount: Amount<Currency>, onlyFromIssuerParties: Set<AbstractParty>? = ..., notary: Party? = ..., lockId: UUID = ..., withIssuerRefs: Set<OpaqueBytes>? = ...): List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest[SimpleFunctionDescriptorImpl]

'DOLLARS' @ [421:86] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'lockId' @ [421:104] ==> val lockId: (UUID..UUID?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'spendableStatesUSD' @ [422:17] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'forEach' @ [422:36] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<Cash.State>>.forEach(action: (StateAndRef<Cash.State>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'assertThat' @ [423:17] ==> @CheckReturnValue public open fun assertThat(p0: Boolean): (AbstractBooleanAssert<*>..AbstractBooleanAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'spendableStatesUSD' @ [423:28] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'size' @ [423:47] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'unlockedStates' @ [423:55] ==> var unlockedStates: Int defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'unlockedStates' @ [424:17] ==> var unlockedStates: Int defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'spendableStatesUSD' @ [424:35] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'size' @ [424:54] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'VaultQueryCriteria' @ [425:38] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'SoftLockingCondition' @ [425:80] ==> public constructor SoftLockingCondition(type: QueryCriteria.SoftLockingType, lockIds: List<UUID> = ...) defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedClassConstructorDescriptor]

'SPECIFIED' @ [425:117] ==> enum entry SPECIFIED defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'listOf' @ [425:128] ==> public fun <T> listOf(element: (UUID..UUID?)): List<(UUID..UUID?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.util.UUID..java.util.UUID?)

'lockId' @ [425:135] ==> val lockId: (UUID..UUID?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'vaultQuery' @ [426:36] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [426:47] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteriaLocked' @ [426:67] ==> val criteriaLocked: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'states' @ [426:83] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'spendableStatesUSD' @ [427:21] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [427:40] ==> @InlineOnly public inline fun <T> Collection<StateAndRef<Cash.State>>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'assertEquals' @ [428:21] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'spendableStatesUSD' @ [428:34] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'size' @ [428:53] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'lockedStates' @ [428:59] ==> val lockedStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'size' @ [428:72] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'lockedStates' @ [429:39] ==> val lockedStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'map' @ [429:52] ==> public inline fun <T, R> Iterable<StateAndRef<Cash.State>>.map(transform: (StateAndRef<Cash.State>) -> Cash.State): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>
    <R> -> State

'it' @ [429:58] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [429:61] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [429:67] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'sumCash' @ [429:74] ==> public fun Iterable<ContractState>.sumCash(): Amount<Issued<Currency>> defined in net.corda.finance.utils[DeserializedSimpleFunctionDescriptor]

'spendableStatesUSD' @ [430:39] ==> val spendableStatesUSD: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'map' @ [430:58] ==> public inline fun <T, R> Iterable<StateAndRef<Cash.State>>.map(transform: (StateAndRef<Cash.State>) -> Cash.State): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>
    <R> -> State

'it' @ [430:64] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [430:67] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [430:73] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'sumCash' @ [430:80] ==> public fun Iterable<ContractState>.sumCash(): Amount<Issued<Currency>> defined in net.corda.finance.utils[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [431:21] ==> @CheckReturnValue public open fun assertThat(p0: Boolean): (AbstractBooleanAssert<*>..AbstractBooleanAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'foundAmount' @ [431:32] ==> val foundAmount: Amount<Issued<Currency>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'toDecimal' @ [431:44] ==> public final fun toDecimal(): BigDecimal defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'BigDecimal' @ [431:59] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'assertThat' @ [432:21] ==> @CheckReturnValue public open fun assertThat(p0: Boolean): (AbstractBooleanAssert<*>..AbstractBooleanAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'lockedTotal' @ [432:32] ==> val lockedTotal: Amount<Issued<Currency>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'foundAmount' @ [432:47] ==> val foundAmount: Amount<Issued<Currency>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'lockedCount' @ [433:21] ==> var lockedCount: Int defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'lockedStates' @ [433:36] ==> val lockedStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'size' @ [433:49] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'VaultQueryCriteria' @ [436:34] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'SoftLockingCondition' @ [436:76] ==> public constructor SoftLockingCondition(type: QueryCriteria.SoftLockingType, lockIds: List<UUID> = ...) defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedClassConstructorDescriptor]

'LOCKED_ONLY' @ [436:113] ==> enum entry LOCKED_ONLY defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'assertThat' @ [437:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..List<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?)): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<State>

'vaultQuery' @ [437:24] ==> public final val vaultQuery: VaultQueryService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'queryBy' @ [437:35] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<Cash.State> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteriaLocked' @ [437:55] ==> val criteriaLocked: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'states' @ [437:71] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'hasSize' @ [437:79] ==> public open fun hasSize(p0: Int): (ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ListAssert<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'lockedCount' @ [437:87] ==> var lockedCount: Int defined in net.corda.node.services.vault.NodeVaultServiceTest.`states soft locking query granularity`.<anonymous>[LocalVariableDescriptor]

'Test' @ [441:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'MockServices' @ [443:32] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'MEGA_CORP_KEY' @ [443:45] ==> public val MEGA_CORP_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'database' @ [445:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [445:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'services' @ [446:28] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'legalIdentityKey' @ [446:37] ==> public open val legalIdentityKey: PublicKey defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'TransactionBuilder' @ [449:33] ==> public constructor TransactionBuilder(notary: Party? = ..., lockId: UUID = ..., inputs: MutableList<StateRef> = ..., attachments: MutableList<SecureHash> = ..., outputs: MutableList<TransactionState<ContractState>> = ..., commands: MutableList<Command<*>> = ..., window: TimeWindow? = ..., privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'apply' @ [449:58] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'Cash' @ [450:17] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[DeserializedClassConstructorDescriptor]

'generateIssue' @ [450:24] ==> public final fun generateIssue(tx: TransactionBuilder, amount: Amount<Issued<Currency>>, owner: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash[DeserializedSimpleFunctionDescriptor]

'this' @ [450:38] ==> <this> defined in net.corda.node.services.vault.NodeVaultServiceTest.addNoteToTransaction.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'`issued by`' @ [450:44] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [450:48] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [450:68] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [450:78] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [450:86] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'freshKey' @ [450:101] ==> val freshKey: PublicKey defined in net.corda.node.services.vault.NodeVaultServiceTest.addNoteToTransaction.<anonymous>[LocalVariableDescriptor]

'DUMMY_NOTARY' @ [450:112] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpServices' @ [452:28] ==> val megaCorpServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest.addNoteToTransaction[LocalVariableDescriptor]

'signInitialTransaction' @ [452:45] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'usefulBuilder' @ [452:68] ==> val usefulBuilder: TransactionBuilder defined in net.corda.node.services.vault.NodeVaultServiceTest.addNoteToTransaction.<anonymous>[LocalVariableDescriptor]

'services' @ [454:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'recordTransactions' @ [454:22] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'usefulTX' @ [454:41] ==> val usefulTX: SignedTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.addNoteToTransaction.<anonymous>[LocalVariableDescriptor]

'vaultSvc' @ [456:13] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'addNoteToTransaction' @ [456:22] ==> public abstract fun addNoteToTransaction(txnId: SecureHash, noteText: String): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'usefulTX' @ [456:43] ==> val usefulTX: SignedTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.addNoteToTransaction.<anonymous>[LocalVariableDescriptor]

'id' @ [456:52] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'vaultSvc' @ [457:13] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'addNoteToTransaction' @ [457:22] ==> public abstract fun addNoteToTransaction(txnId: SecureHash, noteText: String): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'usefulTX' @ [457:43] ==> val usefulTX: SignedTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.addNoteToTransaction.<anonymous>[LocalVariableDescriptor]

'id' @ [457:52] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'vaultSvc' @ [458:13] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'addNoteToTransaction' @ [458:22] ==> public abstract fun addNoteToTransaction(txnId: SecureHash, noteText: String): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'usefulTX' @ [458:43] ==> val usefulTX: SignedTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.addNoteToTransaction.<anonymous>[LocalVariableDescriptor]

'id' @ [458:52] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'assertEquals' @ [459:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'vaultSvc' @ [459:29] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'getTransactionNotes' @ [459:38] ==> public abstract fun getTransactionNotes(txnId: SecureHash): Iterable<String> defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'usefulTX' @ [459:58] ==> val usefulTX: SignedTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.addNoteToTransaction.<anonymous>[LocalVariableDescriptor]

'id' @ [459:67] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'count' @ [459:71] ==> public fun <T> Iterable<String>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'TransactionBuilder' @ [462:34] ==> public constructor TransactionBuilder(notary: Party? = ..., lockId: UUID = ..., inputs: MutableList<StateRef> = ..., attachments: MutableList<SecureHash> = ..., outputs: MutableList<TransactionState<ContractState>> = ..., commands: MutableList<Command<*>> = ..., window: TimeWindow? = ..., privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'apply' @ [462:59] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'Cash' @ [463:17] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[DeserializedClassConstructorDescriptor]

'generateIssue' @ [463:24] ==> public final fun generateIssue(tx: TransactionBuilder, amount: Amount<Issued<Currency>>, owner: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash[DeserializedSimpleFunctionDescriptor]

'this' @ [463:38] ==> <this> defined in net.corda.node.services.vault.NodeVaultServiceTest.addNoteToTransaction.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'`issued by`' @ [463:44] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'POUNDS' @ [463:48] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'MEGA_CORP' @ [463:67] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [463:77] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [463:85] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'freshKey' @ [463:100] ==> val freshKey: PublicKey defined in net.corda.node.services.vault.NodeVaultServiceTest.addNoteToTransaction.<anonymous>[LocalVariableDescriptor]

'DUMMY_NOTARY' @ [463:111] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpServices' @ [465:29] ==> val megaCorpServices: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest.addNoteToTransaction[LocalVariableDescriptor]

'signInitialTransaction' @ [465:46] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'anotherBuilder' @ [465:69] ==> val anotherBuilder: TransactionBuilder defined in net.corda.node.services.vault.NodeVaultServiceTest.addNoteToTransaction.<anonymous>[LocalVariableDescriptor]

'services' @ [467:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'recordTransactions' @ [467:22] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'anotherTX' @ [467:41] ==> val anotherTX: SignedTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.addNoteToTransaction.<anonymous>[LocalVariableDescriptor]

'vaultSvc' @ [469:13] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'addNoteToTransaction' @ [469:22] ==> public abstract fun addNoteToTransaction(txnId: SecureHash, noteText: String): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'anotherTX' @ [469:43] ==> val anotherTX: SignedTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.addNoteToTransaction.<anonymous>[LocalVariableDescriptor]

'id' @ [469:53] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'assertEquals' @ [470:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'vaultSvc' @ [470:29] ==> public final val vaultSvc: VaultService defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'getTransactionNotes' @ [470:38] ==> public abstract fun getTransactionNotes(txnId: SecureHash): Iterable<String> defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'anotherTX' @ [470:58] ==> val anotherTX: SignedTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.addNoteToTransaction.<anonymous>[LocalVariableDescriptor]

'id' @ [470:68] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'count' @ [470:72] ==> public fun <T> Iterable<String>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [474:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'services' @ [476:24] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'vaultService' @ [476:33] ==> public open val vaultService: VaultService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'Amount' @ [477:22] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'Issued' @ [477:35] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'BOC' @ [477:42] ==> public val BOC: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [477:46] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'GBP' @ [477:54] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'Cash' @ [478:29] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [478:34] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'amount' @ [478:40] ==> val amount: Amount<Issued<Currency>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`is ownable state relevant`[LocalVariableDescriptor]

'services' @ [478:48] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'myInfo' @ [478:57] ==> public open val myInfo: NodeInfo defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'legalIdentity' @ [478:64] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'assertTrue' @ [479:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'service' @ [479:22] ==> val service: NodeVaultService defined in net.corda.node.services.vault.NodeVaultServiceTest.`is ownable state relevant`[LocalVariableDescriptor]

'isRelevant' @ [479:30] ==> internal final fun isRelevant(state: ContractState, ourKeys: Set<PublicKey>): Boolean defined in net.corda.node.services.vault.NodeVaultService[DeserializedSimpleFunctionDescriptor]

'wellKnownCash' @ [479:41] ==> val wellKnownCash: Cash.State defined in net.corda.node.services.vault.NodeVaultServiceTest.`is ownable state relevant`[LocalVariableDescriptor]

'services' @ [479:56] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'keyManagementService' @ [479:65] ==> public open val keyManagementService: KeyManagementService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'keys' @ [479:86] ==> public abstract val keys: Set<PublicKey> defined in net.corda.core.node.services.KeyManagementService[DeserializedPropertyDescriptor]

'services' @ [481:33] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'keyManagementService' @ [481:42] ==> public open val keyManagementService: KeyManagementService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'freshKeyAndCert' @ [481:63] ==> @Suspendable public abstract fun freshKeyAndCert(identity: PartyAndCertificate, revocationEnabled: Boolean): PartyAndCertificate defined in net.corda.core.node.services.KeyManagementService[DeserializedSimpleFunctionDescriptor]

'services' @ [481:79] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'myInfo' @ [481:88] ==> public open val myInfo: NodeInfo defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [481:95] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'Cash' @ [482:29] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [482:34] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'amount' @ [482:40] ==> val amount: Amount<Issued<Currency>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`is ownable state relevant`[LocalVariableDescriptor]

'anonymousIdentity' @ [482:48] ==> val anonymousIdentity: PartyAndCertificate defined in net.corda.node.services.vault.NodeVaultServiceTest.`is ownable state relevant`[LocalVariableDescriptor]

'party' @ [482:66] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'assertTrue' @ [483:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'service' @ [483:22] ==> val service: NodeVaultService defined in net.corda.node.services.vault.NodeVaultServiceTest.`is ownable state relevant`[LocalVariableDescriptor]

'isRelevant' @ [483:30] ==> internal final fun isRelevant(state: ContractState, ourKeys: Set<PublicKey>): Boolean defined in net.corda.node.services.vault.NodeVaultService[DeserializedSimpleFunctionDescriptor]

'anonymousCash' @ [483:41] ==> val anonymousCash: Cash.State defined in net.corda.node.services.vault.NodeVaultServiceTest.`is ownable state relevant`[LocalVariableDescriptor]

'services' @ [483:56] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'keyManagementService' @ [483:65] ==> public open val keyManagementService: KeyManagementService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'keys' @ [483:86] ==> public abstract val keys: Set<PublicKey> defined in net.corda.core.node.services.KeyManagementService[DeserializedPropertyDescriptor]

'AnonymousParty' @ [485:34] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'generateKeyPair' @ [485:49] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'public' @ [485:67] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'Cash' @ [486:30] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [486:35] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'amount' @ [486:41] ==> val amount: Amount<Issued<Currency>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`is ownable state relevant`[LocalVariableDescriptor]

'thirdPartyIdentity' @ [486:49] ==> val thirdPartyIdentity: AnonymousParty defined in net.corda.node.services.vault.NodeVaultServiceTest.`is ownable state relevant`[LocalVariableDescriptor]

'assertFalse' @ [487:9] ==> public fun assertFalse(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'service' @ [487:23] ==> val service: NodeVaultService defined in net.corda.node.services.vault.NodeVaultServiceTest.`is ownable state relevant`[LocalVariableDescriptor]

'isRelevant' @ [487:31] ==> internal final fun isRelevant(state: ContractState, ourKeys: Set<PublicKey>): Boolean defined in net.corda.node.services.vault.NodeVaultService[DeserializedSimpleFunctionDescriptor]

'thirdPartyCash' @ [487:42] ==> val thirdPartyCash: Cash.State defined in net.corda.node.services.vault.NodeVaultServiceTest.`is ownable state relevant`[LocalVariableDescriptor]

'services' @ [487:58] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'keyManagementService' @ [487:67] ==> public open val keyManagementService: KeyManagementService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'keys' @ [487:88] ==> public abstract val keys: Set<PublicKey> defined in net.corda.core.node.services.KeyManagementService[DeserializedPropertyDescriptor]

'Test' @ [492:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'services' @ [494:24] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'vaultService' @ [494:33] ==> public open val vaultService: VaultService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'TestSubscriber' @ [495:31] ==> public constructor TestSubscriber<T : (Any..Any?)>() defined in rx.observers.TestSubscriber[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Update<*>

'apply' @ [495:65] ==> @InlineOnly public inline fun <T> TestSubscriber<Vault.Update<*>>.apply(block: TestSubscriber<Vault.Update<*>>.() -> Unit): TestSubscriber<Vault.Update<*>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestSubscriber<Update<*>>

'service' @ [496:13] ==> val service: NodeVaultService defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated for general transactions`[LocalVariableDescriptor]

'updates' @ [496:21] ==> public open val updates: Observable<Vault.Update<ContractState>> defined in net.corda.node.services.vault.NodeVaultService[DeserializedPropertyDescriptor]

'subscribe' @ [496:29] ==> public final fun subscribe(p0: (Subscriber<in (Vault.Update<ContractState>..Vault.Update<ContractState>?)>..Subscriber<in (Vault.Update<ContractState>..Vault.Update<ContractState>?)>?)): (Subscription..Subscription?) defined in rx.Observable[JavaMethodDescriptor]

'this' @ [496:39] ==> <this> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated for general transactions`.<anonymous>[ReceiverParameterDescriptorImpl]

'services' @ [499:33] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'keyManagementService' @ [499:42] ==> public open val keyManagementService: KeyManagementService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'freshKeyAndCert' @ [499:63] ==> @Suspendable public abstract fun freshKeyAndCert(identity: PartyAndCertificate, revocationEnabled: Boolean): PartyAndCertificate defined in net.corda.core.node.services.KeyManagementService[DeserializedSimpleFunctionDescriptor]

'services' @ [499:79] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'myInfo' @ [499:88] ==> public open val myInfo: NodeInfo defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [499:95] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'AnonymousParty' @ [500:34] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'generateKeyPair' @ [500:49] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'public' @ [500:67] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'Amount' @ [501:22] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'Issued' @ [501:35] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'BOC' @ [501:42] ==> public val BOC: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [501:46] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'GBP' @ [501:54] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'TransactionBuilder' @ [504:23] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'services' @ [504:42] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'myInfo' @ [504:51] ==> public open val myInfo: NodeInfo defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'legalIdentity' @ [504:58] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'apply' @ [504:73] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'Cash' @ [505:13] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[DeserializedClassConstructorDescriptor]

'generateIssue' @ [505:20] ==> public final fun generateIssue(tx: TransactionBuilder, amount: Amount<Issued<Currency>>, owner: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash[DeserializedSimpleFunctionDescriptor]

'this' @ [505:34] ==> <this> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated for general transactions`.<anonymous>[ReceiverParameterDescriptorImpl]

'amount' @ [506:21] ==> val amount: Amount<Issued<Currency>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated for general transactions`[LocalVariableDescriptor]

'anonymousIdentity' @ [506:29] ==> val anonymousIdentity: PartyAndCertificate defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated for general transactions`[LocalVariableDescriptor]

'party' @ [506:47] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'services' @ [506:54] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'myInfo' @ [506:63] ==> public open val myInfo: NodeInfo defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'legalIdentity' @ [506:70] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'toWireTransaction' @ [507:11] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'StateAndRef' @ [508:25] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<ContractState>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> ContractState

'issueTx' @ [508:37] ==> val issueTx: WireTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated for general transactions`[LocalVariableDescriptor]

'outputs' @ [508:45] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'single' @ [508:53] ==> public fun <T> List<TransactionState<ContractState>>.single(): TransactionState<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>

'StateRef' @ [508:63] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'issueTx' @ [508:72] ==> val issueTx: WireTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated for general transactions`[LocalVariableDescriptor]

'id' @ [508:80] ==> public open val id: SecureHash defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'database' @ [510:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [510:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'service' @ [510:32] ==> val service: NodeVaultService defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated for general transactions`[LocalVariableDescriptor]

'notify' @ [510:40] ==> public open fun notify(tx: CoreTransaction): Unit defined in net.corda.node.services.vault.NodeVaultService[DeserializedSimpleFunctionDescriptor]

'issueTx' @ [510:47] ==> val issueTx: WireTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated for general transactions`[LocalVariableDescriptor]

'Vault' @ [511:35] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'Update' @ [511:41] ==> public constructor Update<U : ContractState>(consumed: Set<StateAndRef<ContractState>>, produced: Set<StateAndRef<ContractState>>, flowId: UUID? = ..., type: Vault.UpdateType = ...) defined in net.corda.core.node.services.Vault.Update[DeserializedClassConstructorDescriptor]
Inferred types:
    <U : ContractState> -> ContractState

'emptySet' @ [511:48] ==> public fun <T> emptySet(): Set<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'setOf' @ [511:60] ==> public fun <T> setOf(element: StateAndRef<ContractState>): Set<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'cashState' @ [511:66] ==> val cashState: StateAndRef<ContractState> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated for general transactions`[LocalVariableDescriptor]

'database' @ [513:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [513:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'TransactionBuilder' @ [514:26] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'services' @ [514:45] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'myInfo' @ [514:54] ==> public open val myInfo: NodeInfo defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'legalIdentity' @ [514:61] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'apply' @ [514:76] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'Cash' @ [515:17] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'generateSpend' @ [515:22] ==> @JvmStatic @Suspendable public final fun generateSpend(services: ServiceHub, tx: TransactionBuilder, amount: Amount<Currency>, to: AbstractParty, onlyFromParties: Set<AbstractParty> = ...): Pair<TransactionBuilder, List<PublicKey>> defined in net.corda.finance.contracts.asset.Cash.Companion[DeserializedSimpleFunctionDescriptor]

'services' @ [515:36] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'this' @ [515:46] ==> <this> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated for general transactions`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'Amount' @ [515:52] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'GBP' @ [515:65] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'thirdPartyIdentity' @ [515:71] ==> val thirdPartyIdentity: AnonymousParty defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated for general transactions`[LocalVariableDescriptor]

'toWireTransaction' @ [516:15] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'service' @ [517:13] ==> val service: NodeVaultService defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated for general transactions`[LocalVariableDescriptor]

'notify' @ [517:21] ==> public open fun notify(tx: CoreTransaction): Unit defined in net.corda.node.services.vault.NodeVaultService[DeserializedSimpleFunctionDescriptor]

'moveTx' @ [517:28] ==> val moveTx: WireTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated for general transactions`.<anonymous>[LocalVariableDescriptor]

'Vault' @ [519:34] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'Update' @ [519:40] ==> public constructor Update<U : ContractState>(consumed: Set<StateAndRef<ContractState>>, produced: Set<StateAndRef<ContractState>>, flowId: UUID? = ..., type: Vault.UpdateType = ...) defined in net.corda.core.node.services.Vault.Update[DeserializedClassConstructorDescriptor]
Inferred types:
    <U : ContractState> -> ContractState

'setOf' @ [519:47] ==> public fun <T> setOf(element: StateAndRef<ContractState>): Set<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'cashState' @ [519:53] ==> val cashState: StateAndRef<ContractState> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated for general transactions`[LocalVariableDescriptor]

'emptySet' @ [519:65] ==> public fun <T> emptySet(): Set<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'vaultSubscriber' @ [521:31] ==> val vaultSubscriber: TestSubscriber<Vault.Update<*>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated for general transactions`[LocalVariableDescriptor]

'onNextEvents' @ [521:47] ==> public final val <T : (Any..Any?)> TestSubscriber<Vault.Update<*>>.onNextEvents: (MutableList<(Vault.Update<*>..Vault.Update<*>?)>..List<(Vault.Update<*>..Vault.Update<*>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Update<*>

'assertEquals' @ [522:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (List<(Vault.Update<*>..Vault.Update<*>?)>..List<(Vault.Update<*>..Vault.Update<*>?)>?), actual: (List<(Vault.Update<*>..Vault.Update<*>?)>..List<(Vault.Update<*>..Vault.Update<*>?)>?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (kotlin.collections.List<(net.corda.core.node.services.Vault.Update<*>..net.corda.core.node.services.Vault.Update<*>?)>..kotlin.collections.List<(net.corda.core.node.services.Vault.Update<*>..net.corda.core.node.services.Vault.Update<*>?)>?)

'observedUpdates' @ [522:22] ==> val observedUpdates: (MutableList<(Vault.Update<*>..Vault.Update<*>?)>..List<(Vault.Update<*>..Vault.Update<*>?)>?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated for general transactions`[LocalVariableDescriptor]

'listOf' @ [522:39] ==> public fun <T> listOf(vararg elements: Vault.Update<ContractState>): List<Vault.Update<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Update<ContractState>

'expectedIssueUpdate' @ [522:46] ==> val expectedIssueUpdate: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated for general transactions`[LocalVariableDescriptor]

'expectedMoveUpdate' @ [522:67] ==> val expectedMoveUpdate: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated for general transactions`[LocalVariableDescriptor]

'Test' @ [525:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'services' @ [527:24] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'vaultService' @ [527:33] ==> public open val vaultService: VaultService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'services' @ [528:22] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'myInfo' @ [528:31] ==> public open val myInfo: NodeInfo defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'legalIdentity' @ [528:38] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'TestSubscriber' @ [530:31] ==> public constructor TestSubscriber<T : (Any..Any?)>() defined in rx.observers.TestSubscriber[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Update<*>

'apply' @ [530:65] ==> @InlineOnly public inline fun <T> TestSubscriber<Vault.Update<*>>.apply(block: TestSubscriber<Vault.Update<*>>.() -> Unit): TestSubscriber<Vault.Update<*>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestSubscriber<Update<*>>

'service' @ [531:13] ==> val service: NodeVaultService defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'updates' @ [531:21] ==> public open val updates: Observable<Vault.Update<ContractState>> defined in net.corda.node.services.vault.NodeVaultService[DeserializedPropertyDescriptor]

'subscribe' @ [531:29] ==> public final fun subscribe(p0: (Subscriber<in (Vault.Update<ContractState>..Vault.Update<ContractState>?)>..Subscriber<in (Vault.Update<ContractState>..Vault.Update<ContractState>?)>?)): (Subscription..Subscription?) defined in rx.Observable[JavaMethodDescriptor]

'this' @ [531:39] ==> <this> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`.<anonymous>[ReceiverParameterDescriptorImpl]

'services' @ [534:33] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'keyManagementService' @ [534:42] ==> public open val keyManagementService: KeyManagementService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'freshKeyAndCert' @ [534:63] ==> @Suspendable public abstract fun freshKeyAndCert(identity: PartyAndCertificate, revocationEnabled: Boolean): PartyAndCertificate defined in net.corda.core.node.services.KeyManagementService[DeserializedSimpleFunctionDescriptor]

'services' @ [534:79] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'myInfo' @ [534:88] ==> public open val myInfo: NodeInfo defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [534:95] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'AnonymousParty' @ [535:34] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'generateKeyPair' @ [535:49] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'public' @ [535:67] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'Amount' @ [536:22] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'Issued' @ [536:35] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'BOC' @ [536:42] ==> public val BOC: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [536:46] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'GBP' @ [536:54] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'TransactionBuilder' @ [539:30] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [539:49] ==> val notary: Party defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'apply' @ [539:57] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'Cash' @ [540:13] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[DeserializedClassConstructorDescriptor]

'generateIssue' @ [540:20] ==> public final fun generateIssue(tx: TransactionBuilder, amount: Amount<Issued<Currency>>, owner: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash[DeserializedSimpleFunctionDescriptor]

'this' @ [540:34] ==> <this> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`.<anonymous>[ReceiverParameterDescriptorImpl]

'amount' @ [540:40] ==> val amount: Amount<Issued<Currency>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'anonymousIdentity' @ [540:48] ==> val anonymousIdentity: PartyAndCertificate defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'party' @ [540:66] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'notary' @ [540:73] ==> val notary: Party defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'services' @ [542:24] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'signInitialTransaction' @ [542:33] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'issueTxBuilder' @ [542:56] ==> val issueTxBuilder: TransactionBuilder defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'services' @ [544:9] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'validatedTransactions' @ [544:18] ==> public open val validatedTransactions: WritableTransactionStorage defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'addTransaction' @ [544:40] ==> public abstract fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'issueStx' @ [544:55] ==> val issueStx: SignedTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'StateAndRef' @ [546:32] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<ContractState>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> ContractState

'issueStx' @ [546:44] ==> val issueStx: SignedTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'tx' @ [546:53] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputs' @ [546:56] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'single' @ [546:64] ==> public fun <T> List<TransactionState<ContractState>>.single(): TransactionState<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>

'StateRef' @ [546:74] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'issueStx' @ [546:83] ==> val issueStx: SignedTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'id' @ [546:92] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [549:25] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'NotaryChangeWireTransaction' @ [550:30] ==> public constructor NotaryChangeWireTransaction(inputs: List<StateRef>, notary: Party, newNotary: Party) defined in net.corda.core.transactions.NotaryChangeWireTransaction[DeserializedClassConstructorDescriptor]

'listOf' @ [550:58] ==> public fun <T> listOf(element: StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'initialCashState' @ [550:65] ==> val initialCashState: StateAndRef<ContractState> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'ref' @ [550:82] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'issueStx' @ [550:88] ==> val issueStx: SignedTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'notary' @ [550:97] ==> public final val notary: Party? defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'newNotary' @ [550:107] ==> val newNotary: Party defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'StateAndRef' @ [551:38] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<ContractState>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> ContractState

'initialCashState' @ [551:50] ==> val initialCashState: StateAndRef<ContractState> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'state' @ [551:67] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'copy' @ [551:73] ==> public final fun copy(data: ContractState = ..., notary: Party = ..., encumbrance: Int? = ...): TransactionState<ContractState> defined in net.corda.core.contracts.TransactionState[DeserializedSimpleFunctionDescriptor]

'newNotary' @ [551:87] ==> val newNotary: Party defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'StateRef' @ [551:99] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'changeNotaryTx' @ [551:108] ==> val changeNotaryTx: NotaryChangeWireTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'id' @ [551:123] ==> public open val id: SecureHash defined in net.corda.core.transactions.NotaryChangeWireTransaction[DeserializedPropertyDescriptor]

'database' @ [553:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [553:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'service' @ [554:13] ==> val service: NodeVaultService defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'notifyAll' @ [554:21] ==> public open fun notifyAll(txns: Iterable<CoreTransaction>): Unit defined in net.corda.node.services.vault.NodeVaultService[DeserializedSimpleFunctionDescriptor]

'listOf' @ [554:31] ==> public fun <T> listOf(vararg elements: CoreTransaction): List<CoreTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoreTransaction

'issueStx' @ [554:38] ==> val issueStx: SignedTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'tx' @ [554:47] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'changeNotaryTx' @ [554:51] ==> val changeNotaryTx: NotaryChangeWireTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'database' @ [558:22] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [558:31] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> WireTransaction): WireTransaction defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'TransactionBuilder' @ [559:13] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'newNotary' @ [559:32] ==> val newNotary: Party defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'apply' @ [559:43] ==> @InlineOnly public inline fun <T> TransactionBuilder.apply(block: TransactionBuilder.() -> Unit): TransactionBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder

'Cash' @ [560:17] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'generateSpend' @ [560:22] ==> @JvmStatic @Suspendable public final fun generateSpend(services: ServiceHub, tx: TransactionBuilder, amount: Amount<Currency>, to: AbstractParty, onlyFromParties: Set<AbstractParty> = ...): Pair<TransactionBuilder, List<PublicKey>> defined in net.corda.finance.contracts.asset.Cash.Companion[DeserializedSimpleFunctionDescriptor]

'services' @ [560:36] ==> public final lateinit var services: MockServices defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'this' @ [560:46] ==> <this> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'Amount' @ [560:52] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'GBP' @ [560:65] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'thirdPartyIdentity' @ [560:71] ==> val thirdPartyIdentity: AnonymousParty defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'toWireTransaction' @ [561:15] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'database' @ [564:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.vault.NodeVaultServiceTest[PropertyDescriptorImpl]

'transaction' @ [564:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'service' @ [565:13] ==> val service: NodeVaultService defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'notify' @ [565:21] ==> public open fun notify(tx: CoreTransaction): Unit defined in net.corda.node.services.vault.NodeVaultService[DeserializedSimpleFunctionDescriptor]

'moveTx' @ [565:28] ==> val moveTx: WireTransaction defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'Vault' @ [568:35] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'Update' @ [568:41] ==> public constructor Update<U : ContractState>(consumed: Set<StateAndRef<ContractState>>, produced: Set<StateAndRef<ContractState>>, flowId: UUID? = ..., type: Vault.UpdateType = ...) defined in net.corda.core.node.services.Vault.Update[DeserializedClassConstructorDescriptor]
Inferred types:
    <U : ContractState> -> ContractState

'emptySet' @ [568:48] ==> public fun <T> emptySet(): Set<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'setOf' @ [568:60] ==> public fun <T> setOf(element: StateAndRef<ContractState>): Set<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'initialCashState' @ [568:66] ==> val initialCashState: StateAndRef<ContractState> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'Vault' @ [569:42] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'Update' @ [569:48] ==> public constructor Update<U : ContractState>(consumed: Set<StateAndRef<ContractState>>, produced: Set<StateAndRef<ContractState>>, flowId: UUID? = ..., type: Vault.UpdateType = ...) defined in net.corda.core.node.services.Vault.Update[DeserializedClassConstructorDescriptor]
Inferred types:
    <U : ContractState> -> ContractState

'setOf' @ [569:55] ==> public fun <T> setOf(element: StateAndRef<ContractState>): Set<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'initialCashState' @ [569:61] ==> val initialCashState: StateAndRef<ContractState> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'setOf' @ [569:80] ==> public fun <T> setOf(element: StateAndRef<ContractState>): Set<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'cashStateWithNewNotary' @ [569:86] ==> val cashStateWithNewNotary: StateAndRef<ContractState> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'Vault' @ [569:117] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'NOTARY_CHANGE' @ [569:134] ==> enum entry NOTARY_CHANGE defined in net.corda.core.node.services.Vault.UpdateType[FakeCallableDescriptorForObject]

'Vault' @ [570:34] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'Update' @ [570:40] ==> public constructor Update<U : ContractState>(consumed: Set<StateAndRef<ContractState>>, produced: Set<StateAndRef<ContractState>>, flowId: UUID? = ..., type: Vault.UpdateType = ...) defined in net.corda.core.node.services.Vault.Update[DeserializedClassConstructorDescriptor]
Inferred types:
    <U : ContractState> -> ContractState

'setOf' @ [570:47] ==> public fun <T> setOf(element: StateAndRef<ContractState>): Set<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'cashStateWithNewNotary' @ [570:53] ==> val cashStateWithNewNotary: StateAndRef<ContractState> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'emptySet' @ [570:78] ==> public fun <T> emptySet(): Set<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'vaultSubscriber' @ [572:31] ==> val vaultSubscriber: TestSubscriber<Vault.Update<*>> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'onNextEvents' @ [572:47] ==> public final val <T : (Any..Any?)> TestSubscriber<Vault.Update<*>>.onNextEvents: (MutableList<(Vault.Update<*>..Vault.Update<*>?)>..List<(Vault.Update<*>..Vault.Update<*>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Update<*>

'assertEquals' @ [573:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (List<(Vault.Update<*>..Vault.Update<*>?)>..List<(Vault.Update<*>..Vault.Update<*>?)>?), actual: (List<(Vault.Update<*>..Vault.Update<*>?)>..List<(Vault.Update<*>..Vault.Update<*>?)>?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (kotlin.collections.List<(net.corda.core.node.services.Vault.Update<*>..net.corda.core.node.services.Vault.Update<*>?)>..kotlin.collections.List<(net.corda.core.node.services.Vault.Update<*>..net.corda.core.node.services.Vault.Update<*>?)>?)

'observedUpdates' @ [573:22] ==> val observedUpdates: (MutableList<(Vault.Update<*>..Vault.Update<*>?)>..List<(Vault.Update<*>..Vault.Update<*>?)>?) defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'listOf' @ [573:39] ==> public fun <T> listOf(vararg elements: Vault.Update<ContractState>): List<Vault.Update<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Update<ContractState>

'expectedIssueUpdate' @ [573:46] ==> val expectedIssueUpdate: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'expectedNotaryChangeUpdate' @ [573:67] ==> val expectedNotaryChangeUpdate: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

'expectedMoveUpdate' @ [573:95] ==> val expectedMoveUpdate: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultServiceTest.`correct updates are generated when changing notaries`[LocalVariableDescriptor]

