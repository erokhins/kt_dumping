'TestDependencyInjectionBase' @ [56:36] ==> public constructor TestDependencyInjectionBase() defined in net.corda.testing.TestDependencyInjectionBase[DeserializedClassConstructorDescriptor]

'services' @ [61:37] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'vaultService' @ [61:46] ==> public open val vaultService: VaultService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'Before' @ [73:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'issuerServices' @ [75:9] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'MockServices' @ [75:26] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'DUMMY_CASH_ISSUER_KEY' @ [75:39] ==> public val DUMMY_CASH_ISSUER_KEY: KeyPair defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'BOB_KEY' @ [75:62] ==> public val BOB_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOC_KEY' @ [75:71] ==> public val BOC_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'makeTestDataSourceProperties' @ [76:31] ==> public fun makeTestDataSourceProperties(nodeName: String = ...): Properties defined in net.corda.testing.node[DeserializedSimpleFunctionDescriptor]

'makeTestDatabaseProperties' @ [77:41] ==> public fun makeTestDatabaseProperties(key: String? = ..., value: String? = ...): Properties defined in net.corda.testing.node[DeserializedSimpleFunctionDescriptor]

'setOf' @ [78:29] ==> public fun <T> setOf(vararg elements: MappedSchema): Set<MappedSchema> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MappedSchema

'VaultSchemaV1' @ [78:35] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'CashSchemaV1' @ [78:50] ==> @CordaSerializable public object CashSchemaV1 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'SampleCashSchemaV2' @ [78:64] ==> public object SampleCashSchemaV2 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'SampleCashSchemaV3' @ [78:84] ==> public object SampleCashSchemaV3 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'NodeSchemaService' @ [79:37] ==> public constructor NodeSchemaService(customSchemas: Set<MappedSchema> = ...) defined in net.corda.node.services.schema.NodeSchemaService[DeserializedClassConstructorDescriptor]

'customSchemas' @ [79:55] ==> val customSchemas: Set<MappedSchema> defined in net.corda.node.services.database.HibernateConfigurationTest.setUp[LocalVariableDescriptor]

'database' @ [80:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'configureDatabase' @ [80:20] ==> public fun configureDatabase(dataSourceProperties: Properties, databaseProperties: Properties?, createSchemaService: () -> SchemaService = ..., createIdentityService: () -> IdentityService): CordaPersistence defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'dataSourceProps' @ [80:38] ==> val dataSourceProps: Properties defined in net.corda.node.services.database.HibernateConfigurationTest.setUp[LocalVariableDescriptor]

'defaultDatabaseProperties' @ [80:55] ==> val defaultDatabaseProperties: Properties defined in net.corda.node.services.database.HibernateConfigurationTest.setUp[LocalVariableDescriptor]

'createSchemaService' @ [80:82] ==> val createSchemaService: () -> NodeSchemaService defined in net.corda.node.services.database.HibernateConfigurationTest.setUp[LocalVariableDescriptor]

'database' @ [81:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [81:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'hibernateConfig' @ [82:13] ==> public final lateinit var hibernateConfig: HibernateConfiguration defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'database' @ [82:31] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'hibernateConfig' @ [82:40] ==> public final val hibernateConfig: HibernateConfiguration defined in net.corda.node.utilities.CordaPersistence[DeserializedPropertyDescriptor]

'services' @ [83:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'MockServices' @ [83:33] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'BOB_KEY' @ [83:46] ==> public val BOB_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOC_KEY' @ [83:55] ==> public val BOC_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'DUMMY_NOTARY_KEY' @ [83:64] ==> public val DUMMY_NOTARY_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'makeVaultService' @ [84:59] ==> public final fun makeVaultService(hibernateConfig: HibernateConfiguration): VaultService defined in net.corda.node.services.database.HibernateConfigurationTest.setUp.<anonymous>.<no name provided>[DeserializedSimpleFunctionDescriptor]

'database' @ [84:76] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'hibernateConfig' @ [84:85] ==> public final val hibernateConfig: HibernateConfiguration defined in net.corda.node.utilities.CordaPersistence[DeserializedPropertyDescriptor]

'txs' @ [87:33] ==> value-parameter txs: Iterable<SignedTransaction> defined in net.corda.node.services.database.HibernateConfigurationTest.setUp.<anonymous>.<no name provided>.recordTransactions[ValueParameterDescriptorImpl]

'validatedTransactions' @ [88:25] ==> public open val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.database.HibernateConfigurationTest.setUp.<anonymous>.<no name provided>[DeserializedPropertyDescriptor]

'addTransaction' @ [88:47] ==> public abstract fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'stx' @ [88:62] ==> val stx: SignedTransaction defined in net.corda.node.services.database.HibernateConfigurationTest.setUp.<anonymous>.<no name provided>.recordTransactions[LocalVariableDescriptor]

'vaultService' @ [91:21] ==> public open val vaultService: VaultService defined in net.corda.node.services.database.HibernateConfigurationTest.setUp.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'notifyAll' @ [91:34] ==> public abstract fun notifyAll(txns: Iterable<CoreTransaction>): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'txs' @ [91:44] ==> value-parameter txs: Iterable<SignedTransaction> defined in net.corda.node.services.database.HibernateConfigurationTest.setUp.<anonymous>.<no name provided>.recordTransactions[ValueParameterDescriptorImpl]

'map' @ [91:48] ==> public inline fun <T, R> Iterable<SignedTransaction>.map(transform: (SignedTransaction) -> WireTransaction): List<WireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <R> -> WireTransaction

'it' @ [91:54] ==> value-parameter it: SignedTransaction defined in net.corda.node.services.database.HibernateConfigurationTest.setUp.<anonymous>.<no name provided>.recordTransactions.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [91:57] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'database' @ [93:46] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createSession' @ [93:55] ==> public final fun createSession(): Connection defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]

'hibernatePersister' @ [95:13] ==> public final lateinit var hibernatePersister: HibernateObserver defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'services' @ [95:34] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'hibernatePersister' @ [95:43] ==> public final lateinit var hibernatePersister: HibernateObserver defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'setUpDb' @ [97:9] ==> private final fun setUpDb(): Unit defined in net.corda.node.services.database.HibernateConfigurationTest[SimpleFunctionDescriptorImpl]

'sessionFactory' @ [99:9] ==> public final lateinit var sessionFactory: SessionFactory defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'hibernateConfig' @ [99:26] ==> public final lateinit var hibernateConfig: HibernateConfiguration defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'sessionFactoryForSchemas' @ [99:42] ==> public final fun sessionFactoryForSchemas(vararg schemas: MappedSchema): SessionFactory defined in net.corda.node.services.database.HibernateConfiguration[DeserializedSimpleFunctionDescriptor]

'customSchemas' @ [99:68] ==> val customSchemas: Set<MappedSchema> defined in net.corda.node.services.database.HibernateConfigurationTest.setUp[LocalVariableDescriptor]

'toTypedArray' @ [99:82] ==> public inline fun <reified T> Collection<MappedSchema>.toTypedArray(): Array<MappedSchema> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> MappedSchema

'entityManager' @ [100:9] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'sessionFactory' @ [100:25] ==> public final lateinit var sessionFactory: SessionFactory defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createEntityManager' @ [100:40] ==> public abstract fun createEntityManager(): (EntityManager..EntityManager?) defined in org.hibernate.SessionFactory[JavaMethodDescriptor]

'criteriaBuilder' @ [101:9] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'sessionFactory' @ [101:27] ==> public final lateinit var sessionFactory: SessionFactory defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'criteriaBuilder' @ [101:42] ==> public final val SessionFactory.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'After' @ [104:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'database' @ [106:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'close' @ [106:18] ==> public open fun close(): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]

'database' @ [110:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [110:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'cashStates' @ [111:13] ==> public final lateinit var cashStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'services' @ [111:26] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [111:35] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [111:60] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [111:69] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [111:85] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [111:107] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'states' @ [111:119] ==> public final val states: Iterable<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault[DeserializedPropertyDescriptor]

'toList' @ [111:126] ==> public fun <T> Iterable<StateAndRef<Cash.State>>.toList(): List<StateAndRef<Cash.State>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'Test' @ [115:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'criteriaBuilder' @ [118:26] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [118:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(Long..Long?)>..Class<(Long..Long?)>?)): (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Long

'Long' @ [118:54] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'java' @ [118:66] ==> public val <T> KClass<Long>.java: Class<Long> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Long

'countQuery' @ [119:9] ==> val countQuery: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`count rows`[LocalVariableDescriptor]

'select' @ [119:20] ==> public abstract fun select(p0: (Selection<out (Long..Long?)>..Selection<out (Long..Long?)>?)): (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [119:27] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'count' @ [119:43] ==> public abstract fun count(p0: (Expression<*>..Expression<*>?)): (Expression<(Long..Long?)>..Expression<(Long..Long?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'countQuery' @ [119:49] ==> val countQuery: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`count rows`[LocalVariableDescriptor]

'from' @ [119:60] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [119:65] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [119:79] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [119:98] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'entityManager' @ [122:27] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [122:41] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?)): (TypedQuery<(Long..Long?)>..TypedQuery<(Long..Long?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Long

'countQuery' @ [122:53] ==> val countQuery: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`count rows`[LocalVariableDescriptor]

'singleResult' @ [122:65] ==> public final val <X : (Any..Any?)> TypedQuery<(Long..Long?)>.singleResult: (Long..Long?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (kotlin.Long..kotlin.Long?)

'assertThat' @ [124:9] ==> @CheckReturnValue public open fun assertThat(p0: Long): (AbstractLongAssert<*>..AbstractLongAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'countResult' @ [124:20] ==> val countResult: (Long..Long?) defined in net.corda.node.services.database.HibernateConfigurationTest.`count rows`[LocalVariableDescriptor]

'isEqualTo' @ [124:33] ==> public open fun isEqualTo(p0: Long): (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractLongAssert[JavaMethodDescriptor]

'Test' @ [127:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [129:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [129:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault.Update<ContractState>): Vault.Update<ContractState> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Update<ContractState>

'services' @ [130:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'consumeCash' @ [130:22] ==> @JvmOverloads public fun ServiceHub.consumeCash(amount: Amount<Currency>, to: Party = ..., notary: Party): Vault.Update<ContractState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [130:37] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [130:55] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'criteriaBuilder' @ [134:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [134:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [134:57] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [134:71] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [134:90] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [135:27] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`consumed states`[LocalVariableDescriptor]

'from' @ [135:41] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [135:46] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [135:60] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [135:79] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [136:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`consumed states`[LocalVariableDescriptor]

'where' @ [136:23] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [136:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'equal' @ [136:45] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [137:17] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`consumed states`[LocalVariableDescriptor]

'get' @ [137:29] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'Vault' @ [137:68] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'CONSUMED' @ [137:86] ==> enum entry CONSUMED defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'entityManager' @ [140:28] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [140:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'criteriaQuery' @ [140:54] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`consumed states`[LocalVariableDescriptor]

'resultList' @ [140:69] ==> public final val <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.resultList: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'queryResults' @ [141:21] ==> val queryResults: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`consumed states`[LocalVariableDescriptor]

'map' @ [141:34] ==> public inline fun <T, R> Iterable<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.map(transform: ((VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)) -> Cash.State): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)
    <R> -> State

'it' @ [141:40] ==> value-parameter it: (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in net.corda.node.services.database.HibernateConfigurationTest.`consumed states`.<anonymous>[ValueParameterDescriptorImpl]

'contractState' @ [141:43] ==> @field:Column public final var contractState: ByteArray defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'deserialize' @ [141:57] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): TransactionState<Cash.State> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TransactionState<State>

'data' @ [141:101] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'sumCash' @ [141:108] ==> public fun Iterable<ContractState>.sumCash(): Amount<Issued<Currency>> defined in net.corda.finance.utils[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [142:9] ==> @CheckReturnValue public open fun assertThat(p0: Boolean): (AbstractBooleanAssert<*>..AbstractBooleanAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'coins' @ [142:20] ==> val coins: Amount<Issued<Currency>> defined in net.corda.node.services.database.HibernateConfigurationTest.`consumed states`[LocalVariableDescriptor]

'toDecimal' @ [142:26] ==> public final fun toDecimal(): BigDecimal defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'BigDecimal' @ [142:41] ==> public constructor BigDecimal(p0: (String..String?)) defined in java.math.BigDecimal[JavaClassConstructorDescriptor]

'Test' @ [145:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [148:13] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [148:22] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<LinearState>): Vault<LinearState> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<LinearState>

'services' @ [149:17] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestLinearStates' @ [149:26] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestLinearStates(numberToCreate: Int, externalId: String? = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearBoolean: Boolean = ..., linearTimestamp: Instant = ...): Vault<LinearState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'services' @ [150:17] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestLinearStates' @ [150:26] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestLinearStates(numberToCreate: Int, externalId: String? = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearBoolean: Boolean = ..., linearTimestamp: Instant = ...): Vault<LinearState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'issuedStates' @ [152:35] ==> val issuedStates: Vault<LinearState> defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key`[LocalVariableDescriptor]

'states' @ [152:48] ==> public final val states: Iterable<StateAndRef<LinearState>> defined in net.corda.core.node.services.Vault[DeserializedPropertyDescriptor]

'map' @ [152:55] ==> public inline fun <T, R> Iterable<StateAndRef<LinearState>>.map(transform: (StateAndRef<LinearState>) -> PersistentStateRef): List<PersistentStateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<LinearState>
    <R> -> PersistentStateRef

'PersistentStateRef' @ [152:61] ==> public constructor PersistentStateRef(stateRef: StateRef) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'it' @ [152:80] ==> value-parameter it: StateAndRef<LinearState> defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key`.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [152:83] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'toList' @ [152:90] ==> public fun <T> Iterable<PersistentStateRef>.toList(): List<PersistentStateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PersistentStateRef

'criteriaBuilder' @ [155:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [155:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [155:57] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [155:71] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [155:90] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [156:27] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key`[LocalVariableDescriptor]

'from' @ [156:41] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [156:46] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [156:60] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [156:79] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'vaultStates' @ [157:28] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key`[LocalVariableDescriptor]

'get' @ [157:40] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaQuery' @ [158:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key`[LocalVariableDescriptor]

'where' @ [158:23] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [158:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'and' @ [158:45] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'compositeKey' @ [158:49] ==> val compositeKey: (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key`[LocalVariableDescriptor]

'`in`' @ [158:62] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'persistentStateRefs' @ [158:67] ==> val persistentStateRefs: List<PersistentStateRef> defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key`[LocalVariableDescriptor]

'entityManager' @ [161:28] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [161:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'criteriaQuery' @ [161:54] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key`[LocalVariableDescriptor]

'resultList' @ [161:69] ==> public final val <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.resultList: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'assertThat' @ [163:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> VaultStates

'queryResults' @ [163:20] ==> val queryResults: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key`[LocalVariableDescriptor]

'hasSize' @ [163:34] ==> public open fun hasSize(p0: Int): (ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'assertThat' @ [164:9] ==> @CheckReturnValue public open fun assertThat(p0: (String..String?)): (AbstractCharSequenceAssert<*, (String..String?)>..AbstractCharSequenceAssert<*, (String..String?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'queryResults' @ [164:20] ==> val queryResults: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key`[LocalVariableDescriptor]

'first' @ [164:33] ==> public fun <T> List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.first(): (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'stateRef' @ [164:41] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'txId' @ [164:51] ==> @field:Column public final var txId: String? defined in net.corda.core.schemas.PersistentStateRef[DeserializedPropertyDescriptor]

'isEqualTo' @ [164:57] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>?) defined in org.assertj.core.api.AbstractCharSequenceAssert[JavaMethodDescriptor]

'issuedStates' @ [164:67] ==> val issuedStates: Vault<LinearState> defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key`[LocalVariableDescriptor]

'states' @ [164:80] ==> public final val states: Iterable<StateAndRef<LinearState>> defined in net.corda.core.node.services.Vault[DeserializedPropertyDescriptor]

'first' @ [164:87] ==> public fun <T> Iterable<StateAndRef<LinearState>>.first(): StateAndRef<LinearState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<LinearState>

'ref' @ [164:95] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'txhash' @ [164:99] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'toString' @ [164:106] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [165:9] ==> @CheckReturnValue public open fun assertThat(p0: (Int..Int?)): (AbstractIntegerAssert<*>..AbstractIntegerAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'queryResults' @ [165:20] ==> val queryResults: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key`[LocalVariableDescriptor]

'first' @ [165:33] ==> public fun <T> List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.first(): (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'stateRef' @ [165:41] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'index' @ [165:51] ==> @field:Column public final var index: Int? defined in net.corda.core.schemas.PersistentStateRef[DeserializedPropertyDescriptor]

'isEqualTo' @ [165:58] ==> public open fun isEqualTo(p0: Int): (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractIntegerAssert[JavaMethodDescriptor]

'issuedStates' @ [165:68] ==> val issuedStates: Vault<LinearState> defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key`[LocalVariableDescriptor]

'states' @ [165:81] ==> public final val states: Iterable<StateAndRef<LinearState>> defined in net.corda.core.node.services.Vault[DeserializedPropertyDescriptor]

'first' @ [165:88] ==> public fun <T> Iterable<StateAndRef<LinearState>>.first(): StateAndRef<LinearState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<LinearState>

'ref' @ [165:96] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'index' @ [165:100] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'assertThat' @ [166:9] ==> @CheckReturnValue public open fun assertThat(p0: (String..String?)): (AbstractCharSequenceAssert<*, (String..String?)>..AbstractCharSequenceAssert<*, (String..String?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'queryResults' @ [166:20] ==> val queryResults: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key`[LocalVariableDescriptor]

'last' @ [166:33] ==> public fun <T> List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.last(): (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'stateRef' @ [166:40] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'txId' @ [166:50] ==> @field:Column public final var txId: String? defined in net.corda.core.schemas.PersistentStateRef[DeserializedPropertyDescriptor]

'isEqualTo' @ [166:56] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>?) defined in org.assertj.core.api.AbstractCharSequenceAssert[JavaMethodDescriptor]

'issuedStates' @ [166:66] ==> val issuedStates: Vault<LinearState> defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key`[LocalVariableDescriptor]

'states' @ [166:79] ==> public final val states: Iterable<StateAndRef<LinearState>> defined in net.corda.core.node.services.Vault[DeserializedPropertyDescriptor]

'last' @ [166:86] ==> public fun <T> Iterable<StateAndRef<LinearState>>.last(): StateAndRef<LinearState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<LinearState>

'ref' @ [166:93] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'txhash' @ [166:97] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'toString' @ [166:104] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [167:9] ==> @CheckReturnValue public open fun assertThat(p0: (Int..Int?)): (AbstractIntegerAssert<*>..AbstractIntegerAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'queryResults' @ [167:20] ==> val queryResults: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key`[LocalVariableDescriptor]

'last' @ [167:33] ==> public fun <T> List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.last(): (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'stateRef' @ [167:40] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'index' @ [167:50] ==> @field:Column public final var index: Int? defined in net.corda.core.schemas.PersistentStateRef[DeserializedPropertyDescriptor]

'isEqualTo' @ [167:57] ==> public open fun isEqualTo(p0: Int): (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractIntegerAssert[JavaMethodDescriptor]

'issuedStates' @ [167:67] ==> val issuedStates: Vault<LinearState> defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key`[LocalVariableDescriptor]

'states' @ [167:80] ==> public final val states: Iterable<StateAndRef<LinearState>> defined in net.corda.core.node.services.Vault[DeserializedPropertyDescriptor]

'last' @ [167:87] ==> public fun <T> Iterable<StateAndRef<LinearState>>.last(): StateAndRef<LinearState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<LinearState>

'ref' @ [167:94] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'index' @ [167:98] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'Test' @ [170:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [172:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [172:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<DealState>): Vault<DealState> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<DealState>

'services' @ [174:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestLinearStates' @ [174:22] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestLinearStates(numberToCreate: Int, externalId: String? = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearBoolean: Boolean = ..., linearTimestamp: Instant = ...): Vault<LinearState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'services' @ [175:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestDeals' @ [175:22] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestDeals(dealIds: List<String>, participants: List<AbstractParty> = ..., notary: Party = ...): Vault<DealState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'listOf' @ [175:44] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'criteriaBuilder' @ [179:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [179:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(String..String?)>..Class<(String..String?)>?)): (CriteriaQuery<(String..String?)>..CriteriaQuery<(String..String?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'String' @ [179:57] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'java' @ [179:71] ==> public val <T> KClass<String>.java: Class<String> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'criteriaQuery' @ [180:27] ==> val criteriaQuery: (CriteriaQuery<(String..String?)>..CriteriaQuery<(String..String?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`distinct contract types`[LocalVariableDescriptor]

'from' @ [180:41] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [180:46] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [180:60] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [180:79] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [181:9] ==> val criteriaQuery: (CriteriaQuery<(String..String?)>..CriteriaQuery<(String..String?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`distinct contract types`[LocalVariableDescriptor]

'select' @ [181:23] ==> public abstract fun select(p0: (Selection<out (String..String?)>..Selection<out (String..String?)>?)): (CriteriaQuery<(String..String?)>..CriteriaQuery<(String..String?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'vaultStates' @ [181:30] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`distinct contract types`[LocalVariableDescriptor]

'get' @ [181:42] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'distinct' @ [181:73] ==> public abstract fun distinct(p0: Boolean): (CriteriaQuery<(String..String?)>..CriteriaQuery<(String..String?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'entityManager' @ [184:28] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [184:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(String..String?)>..CriteriaQuery<(String..String?)>?)): (TypedQuery<(String..String?)>..TypedQuery<(String..String?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'criteriaQuery' @ [184:54] ==> val criteriaQuery: (CriteriaQuery<(String..String?)>..CriteriaQuery<(String..String?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`distinct contract types`[LocalVariableDescriptor]

'resultList' @ [184:69] ==> public final val <X : (Any..Any?)> TypedQuery<(String..String?)>.resultList: (MutableList<(String..String?)>..List<(String..String?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'assertThat' @ [185:20] ==> @CheckReturnValue public open fun assertThat(p0: Int): (AbstractIntegerAssert<*>..AbstractIntegerAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'queryResults' @ [185:31] ==> val queryResults: (MutableList<(String..String?)>..List<(String..String?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`distinct contract types`[LocalVariableDescriptor]

'size' @ [185:44] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'isEqualTo' @ [185:50] ==> public open fun isEqualTo(p0: Int): (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractIntegerAssert[JavaMethodDescriptor]

'Test' @ [188:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'criteriaBuilder' @ [191:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [191:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [191:57] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [191:71] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [191:90] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [192:27] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting`[LocalVariableDescriptor]

'from' @ [192:41] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [192:46] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [192:60] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [192:79] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [195:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting`[LocalVariableDescriptor]

'orderBy' @ [195:23] ==> public abstract fun orderBy(vararg p0: (Order..Order?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [195:31] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'desc' @ [195:47] ==> public abstract fun desc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [195:52] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting`[LocalVariableDescriptor]

'get' @ [195:64] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'entityManager' @ [196:28] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [196:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'criteriaQuery' @ [196:54] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting`[LocalVariableDescriptor]

'resultList' @ [196:69] ==> public final val <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.resultList: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'queryResults' @ [197:9] ==> val queryResults: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting`[LocalVariableDescriptor]

'map' @ [197:22] ==> public inline fun <T, R> Iterable<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.map(transform: ((VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)) -> Unit): List<Unit> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)
    <R> -> Unit

'println' @ [197:28] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [197:36] ==> value-parameter it: (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting`.<anonymous>[ValueParameterDescriptorImpl]

'recordedTime' @ [197:39] ==> @field:Column public final var recordedTime: Instant defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'criteriaQuery' @ [200:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting`[LocalVariableDescriptor]

'orderBy' @ [200:23] ==> public abstract fun orderBy(vararg p0: (Order..Order?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [200:31] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'asc' @ [200:47] ==> public abstract fun asc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [200:51] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting`[LocalVariableDescriptor]

'get' @ [200:63] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'entityManager' @ [201:31] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [201:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'criteriaQuery' @ [201:57] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting`[LocalVariableDescriptor]

'resultList' @ [201:72] ==> public final val <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.resultList: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'queryResultsAsc' @ [202:9] ==> val queryResultsAsc: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting`[LocalVariableDescriptor]

'map' @ [202:25] ==> public inline fun <T, R> Iterable<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.map(transform: ((VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)) -> Unit): List<Unit> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)
    <R> -> Unit

'println' @ [202:31] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [202:39] ==> value-parameter it: (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting`.<anonymous>[ValueParameterDescriptorImpl]

'recordedTime' @ [202:42] ==> @field:Column public final var recordedTime: Instant defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'Test' @ [205:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [208:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [208:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault.Update<ContractState>): Vault.Update<ContractState> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Update<ContractState>

'services' @ [209:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'consumeCash' @ [209:22] ==> @JvmOverloads public fun ServiceHub.consumeCash(amount: Amount<Currency>, to: Party = ..., notary: Party): Vault.Update<ContractState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [209:36] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [209:54] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'services' @ [210:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'consumeCash' @ [210:22] ==> @JvmOverloads public fun ServiceHub.consumeCash(amount: Amount<Currency>, to: Party = ..., notary: Party): Vault.Update<ContractState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [210:36] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [210:54] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'services' @ [211:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'consumeCash' @ [211:22] ==> @JvmOverloads public fun ServiceHub.consumeCash(amount: Amount<Currency>, to: Party = ..., notary: Party): Vault.Update<ContractState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [211:36] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [211:54] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'services' @ [212:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'consumeCash' @ [212:22] ==> @JvmOverloads public fun ServiceHub.consumeCash(amount: Amount<Currency>, to: Party = ..., notary: Party): Vault.Update<ContractState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [212:36] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [212:54] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'services' @ [213:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'consumeCash' @ [213:22] ==> @JvmOverloads public fun ServiceHub.consumeCash(amount: Amount<Currency>, to: Party = ..., notary: Party): Vault.Update<ContractState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [213:36] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [213:54] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'criteriaBuilder' @ [217:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [217:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [217:57] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [217:71] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [217:90] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [218:27] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref desc and asc`[LocalVariableDescriptor]

'from' @ [218:41] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [218:46] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [218:60] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [218:79] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'vaultStates' @ [220:30] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref desc and asc`[LocalVariableDescriptor]

'get' @ [220:42] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaQuery' @ [223:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref desc and asc`[LocalVariableDescriptor]

'orderBy' @ [223:23] ==> public abstract fun orderBy(vararg p0: (Order..Order?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [223:31] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'desc' @ [223:47] ==> public abstract fun desc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'sortByStateRef' @ [223:52] ==> val sortByStateRef: (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref desc and asc`[LocalVariableDescriptor]

'entityManager' @ [224:28] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [224:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'criteriaQuery' @ [224:54] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref desc and asc`[LocalVariableDescriptor]

'resultList' @ [224:69] ==> public final val <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.resultList: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'println' @ [225:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'queryResults' @ [226:9] ==> val queryResults: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref desc and asc`[LocalVariableDescriptor]

'map' @ [226:22] ==> public inline fun <T, R> Iterable<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.map(transform: ((VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)) -> Unit): List<Unit> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)
    <R> -> Unit

'println' @ [226:28] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [226:36] ==> value-parameter it: (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref desc and asc`.<anonymous>[ValueParameterDescriptorImpl]

'stateRef' @ [226:39] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'criteriaQuery' @ [229:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref desc and asc`[LocalVariableDescriptor]

'orderBy' @ [229:23] ==> public abstract fun orderBy(vararg p0: (Order..Order?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [229:31] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'asc' @ [229:47] ==> public abstract fun asc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'sortByStateRef' @ [229:51] ==> val sortByStateRef: (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref desc and asc`[LocalVariableDescriptor]

'entityManager' @ [230:31] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [230:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'criteriaQuery' @ [230:57] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref desc and asc`[LocalVariableDescriptor]

'resultList' @ [230:72] ==> public final val <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.resultList: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'println' @ [231:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'queryResultsAsc' @ [232:9] ==> val queryResultsAsc: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref desc and asc`[LocalVariableDescriptor]

'map' @ [232:25] ==> public inline fun <T, R> Iterable<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.map(transform: ((VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)) -> Unit): List<Unit> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)
    <R> -> Unit

'println' @ [232:31] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [232:39] ==> value-parameter it: (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref desc and asc`.<anonymous>[ValueParameterDescriptorImpl]

'stateRef' @ [232:42] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'Test' @ [235:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [238:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [238:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault.Update<ContractState>): Vault.Update<ContractState> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Update<ContractState>

'services' @ [239:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'consumeCash' @ [239:22] ==> @JvmOverloads public fun ServiceHub.consumeCash(amount: Amount<Currency>, to: Party = ..., notary: Party): Vault.Update<ContractState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [239:36] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [239:54] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'services' @ [240:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'consumeCash' @ [240:22] ==> @JvmOverloads public fun ServiceHub.consumeCash(amount: Amount<Currency>, to: Party = ..., notary: Party): Vault.Update<ContractState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [240:36] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [240:54] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'services' @ [241:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'consumeCash' @ [241:22] ==> @JvmOverloads public fun ServiceHub.consumeCash(amount: Amount<Currency>, to: Party = ..., notary: Party): Vault.Update<ContractState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [241:36] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [241:54] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'services' @ [242:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'consumeCash' @ [242:22] ==> @JvmOverloads public fun ServiceHub.consumeCash(amount: Amount<Currency>, to: Party = ..., notary: Party): Vault.Update<ContractState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [242:36] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [242:54] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'services' @ [243:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'consumeCash' @ [243:22] ==> @JvmOverloads public fun ServiceHub.consumeCash(amount: Amount<Currency>, to: Party = ..., notary: Party): Vault.Update<ContractState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [243:36] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'DUMMY_NOTARY' @ [243:54] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'criteriaBuilder' @ [247:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [247:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [247:57] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [247:71] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [247:90] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [248:27] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref index and txId desc and asc`[LocalVariableDescriptor]

'from' @ [248:41] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [248:46] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [248:60] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [248:79] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'vaultStates' @ [250:27] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref index and txId desc and asc`[LocalVariableDescriptor]

'get' @ [250:39] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'get' @ [250:75] ==> public abstract operator fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'vaultStates' @ [251:26] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref index and txId desc and asc`[LocalVariableDescriptor]

'get' @ [251:38] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'get' @ [251:74] ==> public abstract operator fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaQuery' @ [254:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref index and txId desc and asc`[LocalVariableDescriptor]

'orderBy' @ [254:23] ==> public abstract fun orderBy(vararg p0: (Order..Order?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [254:31] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'desc' @ [254:47] ==> public abstract fun desc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'sortByIndex' @ [254:52] ==> val sortByIndex: (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref index and txId desc and asc`[LocalVariableDescriptor]

'criteriaBuilder' @ [254:66] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'desc' @ [254:82] ==> public abstract fun desc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'sortByTxId' @ [254:87] ==> val sortByTxId: (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref index and txId desc and asc`[LocalVariableDescriptor]

'entityManager' @ [255:28] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [255:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'criteriaQuery' @ [255:54] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref index and txId desc and asc`[LocalVariableDescriptor]

'resultList' @ [255:69] ==> public final val <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.resultList: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'println' @ [256:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'queryResults' @ [257:9] ==> val queryResults: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref index and txId desc and asc`[LocalVariableDescriptor]

'map' @ [257:22] ==> public inline fun <T, R> Iterable<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.map(transform: ((VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)) -> Unit): List<Unit> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)
    <R> -> Unit

'println' @ [257:28] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [257:36] ==> value-parameter it: (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref index and txId desc and asc`.<anonymous>[ValueParameterDescriptorImpl]

'stateRef' @ [257:39] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'criteriaQuery' @ [260:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref index and txId desc and asc`[LocalVariableDescriptor]

'orderBy' @ [260:23] ==> public abstract fun orderBy(vararg p0: (Order..Order?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [260:31] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'asc' @ [260:47] ==> public abstract fun asc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'sortByIndex' @ [260:51] ==> val sortByIndex: (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref index and txId desc and asc`[LocalVariableDescriptor]

'criteriaBuilder' @ [260:65] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'asc' @ [260:81] ==> public abstract fun asc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'sortByTxId' @ [260:85] ==> val sortByTxId: (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref index and txId desc and asc`[LocalVariableDescriptor]

'entityManager' @ [261:31] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [261:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'criteriaQuery' @ [261:57] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref index and txId desc and asc`[LocalVariableDescriptor]

'resultList' @ [261:72] ==> public final val <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.resultList: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'println' @ [262:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'queryResultsAsc' @ [263:9] ==> val queryResultsAsc: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref index and txId desc and asc`[LocalVariableDescriptor]

'map' @ [263:25] ==> public inline fun <T, R> Iterable<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.map(transform: ((VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)) -> Unit): List<Unit> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)
    <R> -> Unit

'println' @ [263:31] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [263:39] ==> value-parameter it: (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting by state ref index and txId desc and asc`.<anonymous>[ValueParameterDescriptorImpl]

'stateRef' @ [263:42] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'Test' @ [266:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [269:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [269:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<Cash.State>): Vault<Cash.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<State>

'services' @ [270:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [270:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'POUNDS' @ [270:48] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [270:56] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [270:72] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [270:96] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'DUMMY_CASH_ISSUER' @ [270:119] ==> public val DUMMY_CASH_ISSUER: PartyAndReference defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'criteriaBuilder' @ [274:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [274:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [274:57] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [274:71] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [274:90] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [275:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with pagination`[LocalVariableDescriptor]

'from' @ [275:23] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [275:28] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [275:42] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [275:61] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'entityManager' @ [278:21] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [278:35] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'criteriaQuery' @ [278:47] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with pagination`[LocalVariableDescriptor]

'query' @ [279:9] ==> val query: (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with pagination`[LocalVariableDescriptor]

'firstResult' @ [279:15] ==> public final var <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.firstResult: Int[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'query' @ [280:9] ==> val query: (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with pagination`[LocalVariableDescriptor]

'maxResults' @ [280:15] ==> public final var <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.maxResults: Int[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'query' @ [283:28] ==> val query: (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with pagination`[LocalVariableDescriptor]

'resultList' @ [283:34] ==> public final val <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.resultList: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'assertThat' @ [284:20] ==> @CheckReturnValue public open fun assertThat(p0: Int): (AbstractIntegerAssert<*>..AbstractIntegerAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'queryResults' @ [284:31] ==> val queryResults: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with pagination`[LocalVariableDescriptor]

'size' @ [284:44] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'isEqualTo' @ [284:50] ==> public open fun isEqualTo(p0: Int): (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractIntegerAssert[JavaMethodDescriptor]

'query' @ [287:9] ==> val query: (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with pagination`[LocalVariableDescriptor]

'firstResult' @ [287:15] ==> public final var <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.firstResult: Int[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'query' @ [288:9] ==> val query: (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with pagination`[LocalVariableDescriptor]

'maxResults' @ [288:15] ==> public final var <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.maxResults: Int[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'query' @ [290:32] ==> val query: (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with pagination`[LocalVariableDescriptor]

'resultList' @ [290:38] ==> public final val <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.resultList: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'assertThat' @ [292:20] ==> @CheckReturnValue public open fun assertThat(p0: Int): (AbstractIntegerAssert<*>..AbstractIntegerAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'lastQueryResults' @ [292:31] ==> val lastQueryResults: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with pagination`[LocalVariableDescriptor]

'size' @ [292:48] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'isEqualTo' @ [292:54] ==> public open fun isEqualTo(p0: Int): (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractIntegerAssert[JavaMethodDescriptor]

'Test' @ [298:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [300:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [300:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<LinearState>): Vault<LinearState> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<LinearState>

'services' @ [301:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestLinearStates' @ [301:22] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestLinearStates(numberToCreate: Int, externalId: String? = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearBoolean: Boolean = ..., linearTimestamp: Instant = ...): Vault<LinearState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'criteriaBuilder' @ [305:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [305:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [305:57] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [305:71] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [305:90] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [307:27] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on LinearStates`[LocalVariableDescriptor]

'from' @ [307:41] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [307:46] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [307:60] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [307:79] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [308:33] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on LinearStates`[LocalVariableDescriptor]

'from' @ [308:47] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Class<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?)): (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultLinearStates

'VaultSchemaV1' @ [308:52] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultLinearStates' @ [308:66] ==> public constructor VaultLinearStates(uid: UniqueIdentifier, _participants: List<AbstractParty>) defined in net.corda.node.services.vault.VaultSchemaV1.VaultLinearStates[DeserializedClassConstructorDescriptor]

'java' @ [308:91] ==> public val <T> KClass<VaultSchemaV1.VaultLinearStates>.java: Class<VaultSchemaV1.VaultLinearStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultLinearStates

'criteriaQuery' @ [310:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on LinearStates`[LocalVariableDescriptor]

'select' @ [310:23] ==> public abstract fun select(p0: (Selection<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Selection<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'vaultStates' @ [310:30] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on LinearStates`[LocalVariableDescriptor]

'criteriaQuery' @ [311:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on LinearStates`[LocalVariableDescriptor]

'where' @ [311:23] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [311:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'equal' @ [311:45] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Expression<*>..Expression<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [311:51] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on LinearStates`[LocalVariableDescriptor]

'get' @ [311:63] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'vaultLinearStates' @ [311:100] ==> val vaultLinearStates: (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on LinearStates`[LocalVariableDescriptor]

'get' @ [311:118] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'entityManager' @ [314:28] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [314:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'criteriaQuery' @ [314:54] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on LinearStates`[LocalVariableDescriptor]

'resultList' @ [314:69] ==> public final val <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.resultList: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'assertThat' @ [315:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> VaultStates

'queryResults' @ [315:20] ==> val queryResults: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on LinearStates`[LocalVariableDescriptor]

'hasSize' @ [315:34] ==> public open fun hasSize(p0: Int): (ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [325:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'criteriaBuilder' @ [328:26] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [328:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(Long..Long?)>..Class<(Long..Long?)>?)): (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Long

'Long' @ [328:54] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'java' @ [328:66] ==> public val <T> KClass<Long>.java: Class<Long> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Long

'countQuery' @ [329:9] ==> val countQuery: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`count CashStates`[LocalVariableDescriptor]

'select' @ [329:20] ==> public abstract fun select(p0: (Selection<out (Long..Long?)>..Selection<out (Long..Long?)>?)): (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [329:27] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'count' @ [329:43] ==> public abstract fun count(p0: (Expression<*>..Expression<*>?)): (Expression<(Long..Long?)>..Expression<(Long..Long?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'countQuery' @ [329:49] ==> val countQuery: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`count CashStates`[LocalVariableDescriptor]

'from' @ [329:60] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Class<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?)): (Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> PersistentCashState

'CashSchemaV1' @ [329:65] ==> @CordaSerializable public object CashSchemaV1 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'PersistentCashState' @ [329:78] ==> public constructor PersistentCashState(owner: AbstractParty, pennies: Long, currency: String, issuerParty: String, issuerRef: ByteArray) defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[DeserializedClassConstructorDescriptor]

'java' @ [329:105] ==> public val <T> KClass<CashSchemaV1.PersistentCashState>.java: Class<CashSchemaV1.PersistentCashState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentCashState

'entityManager' @ [332:27] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [332:41] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?)): (TypedQuery<(Long..Long?)>..TypedQuery<(Long..Long?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Long

'countQuery' @ [332:53] ==> val countQuery: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`count CashStates`[LocalVariableDescriptor]

'singleResult' @ [332:65] ==> public final val <X : (Any..Any?)> TypedQuery<(Long..Long?)>.singleResult: (Long..Long?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (kotlin.Long..kotlin.Long?)

'assertThat' @ [334:9] ==> @CheckReturnValue public open fun assertThat(p0: Long): (AbstractLongAssert<*>..AbstractLongAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'countResult' @ [334:20] ==> val countResult: (Long..Long?) defined in net.corda.node.services.database.HibernateConfigurationTest.`count CashStates`[LocalVariableDescriptor]

'isEqualTo' @ [334:33] ==> public open fun isEqualTo(p0: Long): (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractLongAssert[JavaMethodDescriptor]

'Test' @ [337:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'criteriaBuilder' @ [340:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [340:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [340:57] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [340:71] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [340:90] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [341:27] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on CashStates`[LocalVariableDescriptor]

'from' @ [341:41] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [341:46] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [341:60] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [341:79] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'vaultStates' @ [342:9] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on CashStates`[LocalVariableDescriptor]

'join' @ [342:21] ==> public abstract fun <X : (Any..Any?), Y : (Any..Any?)> join(p0: (String..String?)): (Join<(Any..Any?), (Any..Any?)>..Join<(Any..Any?), (Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'entityManager' @ [345:28] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [345:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'criteriaQuery' @ [345:54] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on CashStates`[LocalVariableDescriptor]

'resultList' @ [345:69] ==> public final val <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.resultList: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'assertThat' @ [346:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> VaultStates

'queryResults' @ [346:20] ==> val queryResults: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on CashStates`[LocalVariableDescriptor]

'hasSize' @ [346:34] ==> public open fun hasSize(p0: Int): (ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [349:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [351:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [351:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)>..org.assertj.core.api.ListAssert<(net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)>?)

'services' @ [352:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestLinearStates' @ [352:22] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestLinearStates(numberToCreate: Int, externalId: String? = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearBoolean: Boolean = ..., linearTimestamp: Instant = ...): Vault<LinearState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'criteriaBuilder' @ [355:33] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [355:49] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [355:61] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [355:75] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [355:94] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [356:31] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select and join by composite primary key on CashStates`.<anonymous>[LocalVariableDescriptor]

'from' @ [356:45] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [356:50] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [356:64] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [356:83] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [357:35] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select and join by composite primary key on CashStates`.<anonymous>[LocalVariableDescriptor]

'from' @ [357:49] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Class<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?)): (Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> PersistentCashState

'CashSchemaV1' @ [357:54] ==> @CordaSerializable public object CashSchemaV1 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'PersistentCashState' @ [357:67] ==> public constructor PersistentCashState(owner: AbstractParty, pennies: Long, currency: String, issuerParty: String, issuerRef: ByteArray) defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[DeserializedClassConstructorDescriptor]

'java' @ [357:94] ==> public val <T> KClass<CashSchemaV1.PersistentCashState>.java: Class<CashSchemaV1.PersistentCashState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentCashState

'criteriaQuery' @ [359:13] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select and join by composite primary key on CashStates`.<anonymous>[LocalVariableDescriptor]

'select' @ [359:27] ==> public abstract fun select(p0: (Selection<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Selection<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'vaultStates' @ [359:34] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select and join by composite primary key on CashStates`.<anonymous>[LocalVariableDescriptor]

'criteriaQuery' @ [360:13] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select and join by composite primary key on CashStates`.<anonymous>[LocalVariableDescriptor]

'where' @ [360:27] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [360:33] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'equal' @ [360:49] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Expression<*>..Expression<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [360:55] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select and join by composite primary key on CashStates`.<anonymous>[LocalVariableDescriptor]

'get' @ [360:67] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'vaultCashStates' @ [360:104] ==> val vaultCashStates: (Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select and join by composite primary key on CashStates`.<anonymous>[LocalVariableDescriptor]

'get' @ [360:120] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'entityManager' @ [363:32] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [363:46] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'criteriaQuery' @ [363:58] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select and join by composite primary key on CashStates`.<anonymous>[LocalVariableDescriptor]

'resultList' @ [363:73] ==> public final val <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.resultList: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'assertThat' @ [364:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> VaultStates

'queryResults' @ [364:24] ==> val queryResults: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select and join by composite primary key on CashStates`.<anonymous>[LocalVariableDescriptor]

'hasSize' @ [364:38] ==> public open fun hasSize(p0: Int): (ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [368:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [370:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [370:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<Cash.State>): Vault<Cash.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<State>

'services' @ [372:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [372:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [372:47] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [372:56] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [372:72] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [372:94] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'services' @ [373:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [373:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'POUNDS' @ [373:46] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [373:54] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [373:70] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [373:90] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'services' @ [374:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [374:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'POUNDS' @ [374:46] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [374:54] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [374:70] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [374:90] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'services' @ [375:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [375:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'SWISS_FRANCS' @ [375:47] ==> public val Int.SWISS_FRANCS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [375:61] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [375:77] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [375:99] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'services' @ [376:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [376:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'SWISS_FRANCS' @ [376:47] ==> public val Int.SWISS_FRANCS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [376:61] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [376:77] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [376:97] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'criteriaBuilder' @ [380:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [380:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(Tuple..Tuple?)>..Class<(Tuple..Tuple?)>?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Tuple

'java' @ [380:70] ==> public val <T> KClass<Tuple>.java: Class<Tuple> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Tuple

'criteriaQuery' @ [381:26] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balances`[LocalVariableDescriptor]

'from' @ [381:40] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Class<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?)): (Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> PersistentCashState

'CashSchemaV1' @ [381:45] ==> @CordaSerializable public object CashSchemaV1 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'PersistentCashState' @ [381:58] ==> public constructor PersistentCashState(owner: AbstractParty, pennies: Long, currency: String, issuerParty: String, issuerRef: ByteArray) defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[DeserializedClassConstructorDescriptor]

'java' @ [381:85] ==> public val <T> KClass<CashSchemaV1.PersistentCashState>.java: Class<CashSchemaV1.PersistentCashState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentCashState

'criteriaQuery' @ [384:9] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balances`[LocalVariableDescriptor]

'multiselect' @ [384:23] ==> public abstract fun multiselect(vararg p0: (Selection<*>..Selection<*>?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'cashStates' @ [384:35] ==> val cashStates: (Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balances`[LocalVariableDescriptor]

'get' @ [384:46] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaBuilder' @ [385:35] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'sum' @ [385:51] ==> public abstract fun <N : (Number..Number?)> sum(p0: (Expression<(Number..Number?)>..Expression<(Number..Number?)>?)): (Expression<(Number..Number?)>..Expression<(Number..Number?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <N : (Number..Number?)> -> (kotlin.Number..kotlin.Number?)

'cashStates' @ [385:55] ==> val cashStates: (Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balances`[LocalVariableDescriptor]

'get' @ [385:66] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Number..Number?)>..Path<(Number..Number?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> Number

'criteriaQuery' @ [387:9] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balances`[LocalVariableDescriptor]

'groupBy' @ [387:23] ==> public abstract fun groupBy(vararg p0: (Expression<*>..Expression<*>?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'cashStates' @ [387:31] ==> val cashStates: (Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balances`[LocalVariableDescriptor]

'get' @ [387:42] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'entityManager' @ [390:28] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [390:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?)): (TypedQuery<(Tuple..Tuple?)>..TypedQuery<(Tuple..Tuple?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Tuple

'criteriaQuery' @ [390:54] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balances`[LocalVariableDescriptor]

'resultList' @ [390:69] ==> public final val <X : (Any..Any?)> TypedQuery<(Tuple..Tuple?)>.resultList: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (javax.persistence.Tuple..javax.persistence.Tuple?)

'queryResults' @ [392:9] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balances`[LocalVariableDescriptor]

'forEach' @ [392:22] ==> @HidesMembers public inline fun <T> Iterable<(Tuple..Tuple?)>.forEach(action: ((Tuple..Tuple?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.persistence.Tuple..javax.persistence.Tuple?)

'println' @ [392:41] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'tuple' @ [392:52] ==> value-parameter tuple: (Tuple..Tuple?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balances`.<anonymous>[ValueParameterDescriptorImpl]

'get' @ [392:58] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'tuple' @ [392:70] ==> value-parameter tuple: (Tuple..Tuple?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balances`.<anonymous>[ValueParameterDescriptorImpl]

'get' @ [392:76] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'assertThat' @ [394:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (Any..Any?)): (AbstractObjectAssert<*, (Any..Any?)>..AbstractObjectAssert<*, (Any..Any?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'queryResults' @ [394:20] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balances`[LocalVariableDescriptor]

'get' @ [394:36] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'isEqualTo' @ [394:44] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'assertThat' @ [395:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (Any..Any?)): (AbstractObjectAssert<*, (Any..Any?)>..AbstractObjectAssert<*, (Any..Any?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'queryResults' @ [395:20] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balances`[LocalVariableDescriptor]

'get' @ [395:36] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'isEqualTo' @ [395:44] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'assertThat' @ [396:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (Any..Any?)): (AbstractObjectAssert<*, (Any..Any?)>..AbstractObjectAssert<*, (Any..Any?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'queryResults' @ [396:20] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balances`[LocalVariableDescriptor]

'get' @ [396:36] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'isEqualTo' @ [396:44] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'assertThat' @ [397:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (Any..Any?)): (AbstractObjectAssert<*, (Any..Any?)>..AbstractObjectAssert<*, (Any..Any?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'queryResults' @ [397:20] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balances`[LocalVariableDescriptor]

'get' @ [397:36] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'isEqualTo' @ [397:44] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'assertThat' @ [398:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (Any..Any?)): (AbstractObjectAssert<*, (Any..Any?)>..AbstractObjectAssert<*, (Any..Any?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'queryResults' @ [398:20] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balances`[LocalVariableDescriptor]

'get' @ [398:36] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'isEqualTo' @ [398:44] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'assertThat' @ [399:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (Any..Any?)): (AbstractObjectAssert<*, (Any..Any?)>..AbstractObjectAssert<*, (Any..Any?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'queryResults' @ [399:20] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balances`[LocalVariableDescriptor]

'get' @ [399:36] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'isEqualTo' @ [399:44] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'Test' @ [402:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [404:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [404:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<Cash.State>): Vault<Cash.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<State>

'services' @ [405:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [405:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'POUNDS' @ [405:46] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [405:54] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [405:70] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [405:90] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'services' @ [406:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [406:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'POUNDS' @ [406:46] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [406:54] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [406:70] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [406:90] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'criteriaBuilder' @ [410:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [410:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(Tuple..Tuple?)>..Class<(Tuple..Tuple?)>?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Tuple

'java' @ [410:70] ==> public val <T> KClass<Tuple>.java: Class<Tuple> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Tuple

'criteriaQuery' @ [411:26] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balance for single currency`[LocalVariableDescriptor]

'from' @ [411:40] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Class<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?)): (Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> PersistentCashState

'CashSchemaV1' @ [411:45] ==> @CordaSerializable public object CashSchemaV1 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'PersistentCashState' @ [411:58] ==> public constructor PersistentCashState(owner: AbstractParty, pennies: Long, currency: String, issuerParty: String, issuerRef: ByteArray) defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[DeserializedClassConstructorDescriptor]

'java' @ [411:85] ==> public val <T> KClass<CashSchemaV1.PersistentCashState>.java: Class<CashSchemaV1.PersistentCashState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentCashState

'criteriaQuery' @ [414:9] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balance for single currency`[LocalVariableDescriptor]

'multiselect' @ [414:23] ==> public abstract fun multiselect(vararg p0: (Selection<*>..Selection<*>?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'cashStates' @ [414:35] ==> val cashStates: (Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balance for single currency`[LocalVariableDescriptor]

'get' @ [414:46] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaBuilder' @ [415:17] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'sum' @ [415:33] ==> public abstract fun <N : (Number..Number?)> sum(p0: (Expression<(Number..Number?)>..Expression<(Number..Number?)>?)): (Expression<(Number..Number?)>..Expression<(Number..Number?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <N : (Number..Number?)> -> (kotlin.Number..kotlin.Number?)

'cashStates' @ [415:37] ==> val cashStates: (Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balance for single currency`[LocalVariableDescriptor]

'get' @ [415:48] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Number..Number?)>..Path<(Number..Number?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> Number

'criteriaQuery' @ [418:9] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balance for single currency`[LocalVariableDescriptor]

'where' @ [418:23] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [418:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'equal' @ [418:45] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'cashStates' @ [418:51] ==> val cashStates: (Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balance for single currency`[LocalVariableDescriptor]

'get' @ [418:62] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaQuery' @ [421:9] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balance for single currency`[LocalVariableDescriptor]

'groupBy' @ [421:23] ==> public abstract fun groupBy(vararg p0: (Expression<*>..Expression<*>?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'cashStates' @ [421:31] ==> val cashStates: (Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balance for single currency`[LocalVariableDescriptor]

'get' @ [421:42] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'entityManager' @ [424:28] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [424:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?)): (TypedQuery<(Tuple..Tuple?)>..TypedQuery<(Tuple..Tuple?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Tuple

'criteriaQuery' @ [424:54] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balance for single currency`[LocalVariableDescriptor]

'resultList' @ [424:69] ==> public final val <X : (Any..Any?)> TypedQuery<(Tuple..Tuple?)>.resultList: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (javax.persistence.Tuple..javax.persistence.Tuple?)

'queryResults' @ [426:9] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balance for single currency`[LocalVariableDescriptor]

'forEach' @ [426:22] ==> @HidesMembers public inline fun <T> Iterable<(Tuple..Tuple?)>.forEach(action: ((Tuple..Tuple?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.persistence.Tuple..javax.persistence.Tuple?)

'println' @ [426:41] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'tuple' @ [426:52] ==> value-parameter tuple: (Tuple..Tuple?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balance for single currency`.<anonymous>[ValueParameterDescriptorImpl]

'get' @ [426:58] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'tuple' @ [426:70] ==> value-parameter tuple: (Tuple..Tuple?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balance for single currency`.<anonymous>[ValueParameterDescriptorImpl]

'get' @ [426:76] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'assertThat' @ [428:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (Any..Any?)): (AbstractObjectAssert<*, (Any..Any?)>..AbstractObjectAssert<*, (Any..Any?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'queryResults' @ [428:20] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balance for single currency`[LocalVariableDescriptor]

'get' @ [428:36] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'isEqualTo' @ [428:44] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'assertThat' @ [429:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (Any..Any?)): (AbstractObjectAssert<*, (Any..Any?)>..AbstractObjectAssert<*, (Any..Any?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'queryResults' @ [429:20] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate cash balance for single currency`[LocalVariableDescriptor]

'get' @ [429:36] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'isEqualTo' @ [429:44] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'Test' @ [432:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [434:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [434:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<Cash.State>): Vault<Cash.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<State>

'services' @ [436:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [436:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [436:47] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [436:56] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [436:72] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [436:92] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'BOC' @ [436:115] ==> public val BOC: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [436:119] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'services' @ [437:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [437:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'POUNDS' @ [437:47] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [437:55] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [437:71] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [437:91] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'DUMMY_CASH_ISSUER' @ [437:114] ==> public val DUMMY_CASH_ISSUER: PartyAndReference defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'services' @ [438:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [438:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'POUNDS' @ [438:47] ==> public val Int.POUNDS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [438:55] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [438:71] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [438:91] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'BOC' @ [438:114] ==> public val BOC: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [438:118] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'criteriaBuilder' @ [442:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [442:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(Tuple..Tuple?)>..Class<(Tuple..Tuple?)>?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Tuple

'java' @ [442:70] ==> public val <T> KClass<Tuple>.java: Class<Tuple> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Tuple

'criteriaQuery' @ [443:26] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`[LocalVariableDescriptor]

'from' @ [443:40] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Class<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?)): (Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> PersistentCashState

'CashSchemaV1' @ [443:45] ==> @CordaSerializable public object CashSchemaV1 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'PersistentCashState' @ [443:58] ==> public constructor PersistentCashState(owner: AbstractParty, pennies: Long, currency: String, issuerParty: String, issuerRef: ByteArray) defined in net.corda.finance.schemas.CashSchemaV1.PersistentCashState[DeserializedClassConstructorDescriptor]

'java' @ [443:85] ==> public val <T> KClass<CashSchemaV1.PersistentCashState>.java: Class<CashSchemaV1.PersistentCashState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentCashState

'criteriaQuery' @ [446:9] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`[LocalVariableDescriptor]

'multiselect' @ [446:23] ==> public abstract fun multiselect(vararg p0: (Selection<*>..Selection<*>?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'cashStates' @ [446:35] ==> val cashStates: (Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`[LocalVariableDescriptor]

'get' @ [446:46] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaBuilder' @ [447:17] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'sum' @ [447:33] ==> public abstract fun <N : (Number..Number?)> sum(p0: (Expression<(Number..Number?)>..Expression<(Number..Number?)>?)): (Expression<(Number..Number?)>..Expression<(Number..Number?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <N : (Number..Number?)> -> (kotlin.Number..kotlin.Number?)

'cashStates' @ [447:37] ==> val cashStates: (Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`[LocalVariableDescriptor]

'get' @ [447:48] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Number..Number?)>..Path<(Number..Number?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> Number

'criteriaQuery' @ [450:9] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`[LocalVariableDescriptor]

'groupBy' @ [450:23] ==> public abstract fun groupBy(vararg p0: (Expression<*>..Expression<*>?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'cashStates' @ [450:31] ==> val cashStates: (Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`[LocalVariableDescriptor]

'get' @ [450:42] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'cashStates' @ [450:70] ==> val cashStates: (Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`[LocalVariableDescriptor]

'get' @ [450:81] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaQuery' @ [453:9] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`[LocalVariableDescriptor]

'orderBy' @ [453:23] ==> public abstract fun orderBy(vararg p0: (Order..Order?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [453:31] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'desc' @ [453:47] ==> public abstract fun desc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'criteriaBuilder' @ [453:52] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'sum' @ [453:68] ==> public abstract fun <N : (Number..Number?)> sum(p0: (Expression<(Number..Number?)>..Expression<(Number..Number?)>?)): (Expression<(Number..Number?)>..Expression<(Number..Number?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <N : (Number..Number?)> -> (kotlin.Number..kotlin.Number?)

'cashStates' @ [453:72] ==> val cashStates: (Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>..Root<(CashSchemaV1.PersistentCashState..CashSchemaV1.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`[LocalVariableDescriptor]

'get' @ [453:83] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Number..Number?)>..Path<(Number..Number?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> Number

'entityManager' @ [456:28] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [456:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?)): (TypedQuery<(Tuple..Tuple?)>..TypedQuery<(Tuple..Tuple?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Tuple

'criteriaQuery' @ [456:54] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`[LocalVariableDescriptor]

'resultList' @ [456:69] ==> public final val <X : (Any..Any?)> TypedQuery<(Tuple..Tuple?)>.resultList: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (javax.persistence.Tuple..javax.persistence.Tuple?)

'queryResults' @ [458:9] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`[LocalVariableDescriptor]

'forEach' @ [458:22] ==> @HidesMembers public inline fun <T> Iterable<(Tuple..Tuple?)>.forEach(action: ((Tuple..Tuple?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.persistence.Tuple..javax.persistence.Tuple?)

'println' @ [458:41] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'tuple' @ [458:52] ==> value-parameter tuple: (Tuple..Tuple?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`.<anonymous>[ValueParameterDescriptorImpl]

'get' @ [458:58] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'tuple' @ [458:70] ==> value-parameter tuple: (Tuple..Tuple?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`.<anonymous>[ValueParameterDescriptorImpl]

'get' @ [458:76] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'assertThat' @ [460:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (Tuple..Tuple?)>..List<(Tuple..Tuple?)>?)): (ListAssert<(Tuple..Tuple?)>..ListAssert<(Tuple..Tuple?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Tuple

'queryResults' @ [460:20] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`[LocalVariableDescriptor]

'hasSize' @ [460:34] ==> public open fun hasSize(p0: Int): (ListAssert<(Tuple..Tuple?)>..ListAssert<(Tuple..Tuple?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'assertThat' @ [461:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (Any..Any?)): (AbstractObjectAssert<*, (Any..Any?)>..AbstractObjectAssert<*, (Any..Any?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'queryResults' @ [461:20] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`[LocalVariableDescriptor]

'get' @ [461:36] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'isEqualTo' @ [461:44] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'assertThat' @ [462:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (Any..Any?)): (AbstractObjectAssert<*, (Any..Any?)>..AbstractObjectAssert<*, (Any..Any?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'queryResults' @ [462:20] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`[LocalVariableDescriptor]

'get' @ [462:36] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'isEqualTo' @ [462:44] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'assertThat' @ [463:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (Any..Any?)): (AbstractObjectAssert<*, (Any..Any?)>..AbstractObjectAssert<*, (Any..Any?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'queryResults' @ [463:20] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`[LocalVariableDescriptor]

'get' @ [463:36] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'isEqualTo' @ [463:44] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'assertThat' @ [464:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (Any..Any?)): (AbstractObjectAssert<*, (Any..Any?)>..AbstractObjectAssert<*, (Any..Any?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'queryResults' @ [464:20] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`[LocalVariableDescriptor]

'get' @ [464:36] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'isEqualTo' @ [464:44] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'assertThat' @ [465:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (Any..Any?)): (AbstractObjectAssert<*, (Any..Any?)>..AbstractObjectAssert<*, (Any..Any?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'queryResults' @ [465:20] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`[LocalVariableDescriptor]

'get' @ [465:36] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'isEqualTo' @ [465:44] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'assertThat' @ [466:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (Any..Any?)): (AbstractObjectAssert<*, (Any..Any?)>..AbstractObjectAssert<*, (Any..Any?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'queryResults' @ [466:20] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`[LocalVariableDescriptor]

'get' @ [466:36] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'isEqualTo' @ [466:44] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'assertThat' @ [467:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (Any..Any?)): (AbstractObjectAssert<*, (Any..Any?)>..AbstractObjectAssert<*, (Any..Any?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'queryResults' @ [467:20] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`[LocalVariableDescriptor]

'get' @ [467:36] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'isEqualTo' @ [467:44] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'assertThat' @ [468:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (Any..Any?)): (AbstractObjectAssert<*, (Any..Any?)>..AbstractObjectAssert<*, (Any..Any?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'queryResults' @ [468:20] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`calculate and order by cash balance for owner and currency`[LocalVariableDescriptor]

'get' @ [468:36] ==> public abstract operator fun get(p0: Int): (Any..Any?) defined in javax.persistence.Tuple[JavaMethodDescriptor]

'isEqualTo' @ [468:44] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'Test' @ [474:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [476:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [476:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'cashStates' @ [478:13] ==> public final lateinit var cashStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'forEach' @ [478:24] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<Cash.State>>.forEach(action: (StateAndRef<Cash.State>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'it' @ [479:33] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.database.HibernateConfigurationTest.`count CashStates in V2`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [479:36] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [479:42] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'State' @ [480:64] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[DeserializedClassConstructorDescriptor]

'cashState' @ [480:70] ==> val cashState: Cash.State defined in net.corda.node.services.database.HibernateConfigurationTest.`count CashStates in V2`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'amount' @ [480:80] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'cashState' @ [480:88] ==> val cashState: Cash.State defined in net.corda.node.services.database.HibernateConfigurationTest.`count CashStates in V2`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'owner' @ [480:98] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'hibernatePersister' @ [481:17] ==> public final lateinit var hibernatePersister: HibernateObserver defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'persistStateWithSchema' @ [481:36] ==> public final fun persistStateWithSchema(state: ContractState, stateRef: StateRef, schema: MappedSchema): Unit defined in net.corda.node.services.schema.HibernateObserver[DeserializedSimpleFunctionDescriptor]

'dummyFungibleState' @ [481:59] ==> val dummyFungibleState: DummyFungibleContract.State defined in net.corda.node.services.database.HibernateConfigurationTest.`count CashStates in V2`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [481:79] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.database.HibernateConfigurationTest.`count CashStates in V2`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [481:82] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'SampleCashSchemaV2' @ [481:87] ==> public object SampleCashSchemaV2 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [486:26] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [486:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(Long..Long?)>..Class<(Long..Long?)>?)): (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Long

'Long' @ [486:54] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'java' @ [486:66] ==> public val <T> KClass<Long>.java: Class<Long> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Long

'countQuery' @ [487:9] ==> val countQuery: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`count CashStates in V2`[LocalVariableDescriptor]

'select' @ [487:20] ==> public abstract fun select(p0: (Selection<out (Long..Long?)>..Selection<out (Long..Long?)>?)): (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [487:27] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'count' @ [487:43] ==> public abstract fun count(p0: (Expression<*>..Expression<*>?)): (Expression<(Long..Long?)>..Expression<(Long..Long?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'countQuery' @ [487:49] ==> val countQuery: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`count CashStates in V2`[LocalVariableDescriptor]

'from' @ [487:60] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(SampleCashSchemaV2.PersistentCashState..SampleCashSchemaV2.PersistentCashState?)>..Class<(SampleCashSchemaV2.PersistentCashState..SampleCashSchemaV2.PersistentCashState?)>?)): (Root<(SampleCashSchemaV2.PersistentCashState..SampleCashSchemaV2.PersistentCashState?)>..Root<(SampleCashSchemaV2.PersistentCashState..SampleCashSchemaV2.PersistentCashState?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> PersistentCashState

'SampleCashSchemaV2' @ [487:65] ==> public object SampleCashSchemaV2 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'PersistentCashState' @ [487:84] ==> public constructor PersistentCashState(currency: String, _participants: Set<AbstractParty>, _owner: AbstractParty, _quantity: Long, _issuerParty: AbstractParty, _issuerRef: ByteArray) defined in net.corda.finance.schemas.SampleCashSchemaV2.PersistentCashState[DeserializedClassConstructorDescriptor]

'java' @ [487:111] ==> public val <T> KClass<SampleCashSchemaV2.PersistentCashState>.java: Class<SampleCashSchemaV2.PersistentCashState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentCashState

'entityManager' @ [490:27] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [490:41] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?)): (TypedQuery<(Long..Long?)>..TypedQuery<(Long..Long?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Long

'countQuery' @ [490:53] ==> val countQuery: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`count CashStates in V2`[LocalVariableDescriptor]

'singleResult' @ [490:65] ==> public final val <X : (Any..Any?)> TypedQuery<(Long..Long?)>.singleResult: (Long..Long?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (kotlin.Long..kotlin.Long?)

'assertThat' @ [492:9] ==> @CheckReturnValue public open fun assertThat(p0: Long): (AbstractLongAssert<*>..AbstractLongAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'countResult' @ [492:20] ==> val countResult: (Long..Long?) defined in net.corda.node.services.database.HibernateConfigurationTest.`count CashStates in V2`[LocalVariableDescriptor]

'isEqualTo' @ [492:33] ==> public open fun isEqualTo(p0: Long): (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractLongAssert[JavaMethodDescriptor]

'Test' @ [495:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [497:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [497:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'services' @ [498:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestLinearStates' @ [498:22] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestLinearStates(numberToCreate: Int, externalId: String? = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearBoolean: Boolean = ..., linearTimestamp: Instant = ...): Vault<LinearState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'cashStates' @ [501:13] ==> public final lateinit var cashStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'forEach' @ [501:24] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<Cash.State>>.forEach(action: (StateAndRef<Cash.State>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'it' @ [502:33] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on CashStates in V2`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [502:36] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [502:42] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'State' @ [503:64] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[DeserializedClassConstructorDescriptor]

'cashState' @ [503:70] ==> val cashState: Cash.State defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on CashStates in V2`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'amount' @ [503:80] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'cashState' @ [503:88] ==> val cashState: Cash.State defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on CashStates in V2`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'owner' @ [503:98] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'hibernatePersister' @ [504:17] ==> public final lateinit var hibernatePersister: HibernateObserver defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'persistStateWithSchema' @ [504:36] ==> public final fun persistStateWithSchema(state: ContractState, stateRef: StateRef, schema: MappedSchema): Unit defined in net.corda.node.services.schema.HibernateObserver[DeserializedSimpleFunctionDescriptor]

'dummyFungibleState' @ [504:59] ==> val dummyFungibleState: DummyFungibleContract.State defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on CashStates in V2`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [504:79] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on CashStates in V2`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [504:82] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'SampleCashSchemaV2' @ [504:87] ==> public object SampleCashSchemaV2 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [509:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [509:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [509:57] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [509:71] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [509:90] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [510:27] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on CashStates in V2`[LocalVariableDescriptor]

'from' @ [510:41] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [510:46] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [510:60] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [510:79] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [511:31] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on CashStates in V2`[LocalVariableDescriptor]

'from' @ [511:45] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(SampleCashSchemaV2.PersistentCashState..SampleCashSchemaV2.PersistentCashState?)>..Class<(SampleCashSchemaV2.PersistentCashState..SampleCashSchemaV2.PersistentCashState?)>?)): (Root<(SampleCashSchemaV2.PersistentCashState..SampleCashSchemaV2.PersistentCashState?)>..Root<(SampleCashSchemaV2.PersistentCashState..SampleCashSchemaV2.PersistentCashState?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> PersistentCashState

'SampleCashSchemaV2' @ [511:50] ==> public object SampleCashSchemaV2 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'PersistentCashState' @ [511:69] ==> public constructor PersistentCashState(currency: String, _participants: Set<AbstractParty>, _owner: AbstractParty, _quantity: Long, _issuerParty: AbstractParty, _issuerRef: ByteArray) defined in net.corda.finance.schemas.SampleCashSchemaV2.PersistentCashState[DeserializedClassConstructorDescriptor]

'java' @ [511:96] ==> public val <T> KClass<SampleCashSchemaV2.PersistentCashState>.java: Class<SampleCashSchemaV2.PersistentCashState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentCashState

'criteriaQuery' @ [513:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on CashStates in V2`[LocalVariableDescriptor]

'select' @ [513:23] ==> public abstract fun select(p0: (Selection<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Selection<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'vaultStates' @ [513:30] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on CashStates in V2`[LocalVariableDescriptor]

'criteriaQuery' @ [514:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on CashStates in V2`[LocalVariableDescriptor]

'where' @ [514:23] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [514:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'equal' @ [514:45] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Expression<*>..Expression<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [514:51] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on CashStates in V2`[LocalVariableDescriptor]

'get' @ [514:63] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'vaultCashStates' @ [514:100] ==> val vaultCashStates: (Root<(SampleCashSchemaV2.PersistentCashState..SampleCashSchemaV2.PersistentCashState?)>..Root<(SampleCashSchemaV2.PersistentCashState..SampleCashSchemaV2.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on CashStates in V2`[LocalVariableDescriptor]

'get' @ [514:116] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'entityManager' @ [517:28] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [517:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'criteriaQuery' @ [517:54] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on CashStates in V2`[LocalVariableDescriptor]

'resultList' @ [517:69] ==> public final val <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.resultList: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'assertThat' @ [518:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> VaultStates

'queryResults' @ [518:20] ==> val queryResults: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary key on CashStates in V2`[LocalVariableDescriptor]

'hasSize' @ [518:34] ==> public open fun hasSize(p0: Int): (ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [531:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [533:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [533:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<LinearState>): Vault<LinearState> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<LinearState>

'services' @ [534:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestLinearStates' @ [534:22] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestLinearStates(numberToCreate: Int, externalId: String? = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearBoolean: Boolean = ..., linearTimestamp: Instant = ...): Vault<LinearState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'services' @ [535:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestDeals' @ [535:22] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestDeals(dealIds: List<String>, participants: List<AbstractParty> = ..., notary: Party = ...): Vault<DealState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'listOf' @ [535:44] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'services' @ [536:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestLinearStates' @ [536:22] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestLinearStates(numberToCreate: Int, externalId: String? = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearBoolean: Boolean = ..., linearTimestamp: Instant = ...): Vault<LinearState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'hibernateConfig' @ [539:30] ==> public final lateinit var hibernateConfig: HibernateConfiguration defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'sessionFactoryForSchemas' @ [539:46] ==> public final fun sessionFactoryForSchemas(vararg schemas: MappedSchema): SessionFactory defined in net.corda.node.services.database.HibernateConfiguration[DeserializedSimpleFunctionDescriptor]

'VaultSchemaV1' @ [539:71] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'DummyLinearStateSchemaV1' @ [539:86] ==> public object DummyLinearStateSchemaV1 : MappedSchema defined in net.corda.testing.schemas[FakeCallableDescriptorForObject]

'sessionFactory' @ [540:31] ==> val sessionFactory: SessionFactory defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'criteriaBuilder' @ [540:46] ==> public final val SessionFactory.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'sessionFactory' @ [541:29] ==> val sessionFactory: SessionFactory defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'createEntityManager' @ [541:44] ==> public abstract fun createEntityManager(): (EntityManager..EntityManager?) defined in org.hibernate.SessionFactory[JavaMethodDescriptor]

'criteriaBuilder' @ [544:29] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'createQuery' @ [544:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [544:57] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [544:71] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [544:90] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [545:27] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'from' @ [545:41] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [545:46] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [545:60] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [545:79] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [546:33] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'from' @ [546:47] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Class<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?)): (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultLinearStates

'VaultSchemaV1' @ [546:52] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultLinearStates' @ [546:66] ==> public constructor VaultLinearStates(uid: UniqueIdentifier, _participants: List<AbstractParty>) defined in net.corda.node.services.vault.VaultSchemaV1.VaultLinearStates[DeserializedClassConstructorDescriptor]

'java' @ [546:91] ==> public val <T> KClass<VaultSchemaV1.VaultLinearStates>.java: Class<VaultSchemaV1.VaultLinearStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultLinearStates

'criteriaQuery' @ [547:33] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'from' @ [547:47] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>..Class<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>?)): (Root<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>..Root<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> PersistentDummyLinearState

'DummyLinearStateSchemaV1' @ [547:52] ==> public object DummyLinearStateSchemaV1 : MappedSchema defined in net.corda.testing.schemas[FakeCallableDescriptorForObject]

'PersistentDummyLinearState' @ [547:77] ==> public constructor PersistentDummyLinearState(participants: MutableSet<AbstractParty>, externalId: String?, uuid: UUID, linearString: String, linearNumber: Long, linearTimestamp: Instant, linearBoolean: Boolean) defined in net.corda.testing.schemas.DummyLinearStateSchemaV1.PersistentDummyLinearState[DeserializedClassConstructorDescriptor]

'java' @ [547:111] ==> public val <T> KClass<DummyLinearStateSchemaV1.PersistentDummyLinearState>.java: Class<DummyLinearStateSchemaV1.PersistentDummyLinearState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentDummyLinearState

'criteriaQuery' @ [549:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'select' @ [549:23] ==> public abstract fun select(p0: (Selection<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Selection<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'vaultStates' @ [549:30] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'criteriaBuilder' @ [550:30] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'equal' @ [550:46] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Expression<*>..Expression<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [550:52] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'get' @ [550:64] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'vaultLinearStates' @ [550:101] ==> val vaultLinearStates: (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'get' @ [550:119] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaBuilder' @ [551:30] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'and' @ [551:46] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'criteriaBuilder' @ [551:50] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'equal' @ [551:66] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Expression<*>..Expression<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [551:72] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'get' @ [551:84] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'dummyLinearStates' @ [551:121] ==> val dummyLinearStates: (Root<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>..Root<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'get' @ [551:139] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaQuery' @ [552:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'where' @ [552:23] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'joinPredicate1' @ [552:29] ==> val joinPredicate1: (Predicate..Predicate?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'joinPredicate2' @ [552:45] ==> val joinPredicate2: (Predicate..Predicate?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'entityManager' @ [555:28] ==> val entityManager: (EntityManager..EntityManager?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'createQuery' @ [555:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'criteriaQuery' @ [555:54] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'resultList' @ [555:69] ==> public final val <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.resultList: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'assertThat' @ [556:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> VaultStates

'queryResults' @ [556:20] ==> val queryResults: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'hasSize' @ [556:34] ==> public open fun hasSize(p0: Int): (ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [563:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [565:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [565:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<LinearState>): Vault<LinearState> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<LinearState>

'services' @ [566:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestLinearStates' @ [566:22] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestLinearStates(numberToCreate: Int, externalId: String? = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearBoolean: Boolean = ..., linearTimestamp: Instant = ...): Vault<LinearState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'services' @ [567:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestDeals' @ [567:22] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestDeals(dealIds: List<String>, participants: List<AbstractParty> = ..., notary: Party = ...): Vault<DealState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'listOf' @ [567:44] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'services' @ [568:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestLinearStates' @ [568:22] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestLinearStates(numberToCreate: Int, externalId: String? = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearBoolean: Boolean = ..., linearTimestamp: Instant = ...): Vault<LinearState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'hibernateConfig' @ [571:30] ==> public final lateinit var hibernateConfig: HibernateConfiguration defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'sessionFactoryForSchemas' @ [571:46] ==> public final fun sessionFactoryForSchemas(vararg schemas: MappedSchema): SessionFactory defined in net.corda.node.services.database.HibernateConfiguration[DeserializedSimpleFunctionDescriptor]

'VaultSchemaV1' @ [571:71] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'DummyLinearStateSchemaV2' @ [571:86] ==> public object DummyLinearStateSchemaV2 : MappedSchema defined in net.corda.testing.schemas[FakeCallableDescriptorForObject]

'sessionFactory' @ [572:31] ==> val sessionFactory: SessionFactory defined in net.corda.node.services.database.HibernateConfigurationTest.`three way join by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'criteriaBuilder' @ [572:46] ==> public final val SessionFactory.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'sessionFactory' @ [573:29] ==> val sessionFactory: SessionFactory defined in net.corda.node.services.database.HibernateConfigurationTest.`three way join by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'createEntityManager' @ [573:44] ==> public abstract fun createEntityManager(): (EntityManager..EntityManager?) defined in org.hibernate.SessionFactory[JavaMethodDescriptor]

'criteriaBuilder' @ [576:29] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`three way join by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'createQuery' @ [576:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [576:57] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [576:71] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [576:90] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [577:27] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`three way join by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'from' @ [577:41] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [577:46] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [577:60] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [577:79] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [578:33] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`three way join by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'from' @ [578:47] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Class<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?)): (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultLinearStates

'VaultSchemaV1' @ [578:52] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultLinearStates' @ [578:66] ==> public constructor VaultLinearStates(uid: UniqueIdentifier, _participants: List<AbstractParty>) defined in net.corda.node.services.vault.VaultSchemaV1.VaultLinearStates[DeserializedClassConstructorDescriptor]

'java' @ [578:91] ==> public val <T> KClass<VaultSchemaV1.VaultLinearStates>.java: Class<VaultSchemaV1.VaultLinearStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultLinearStates

'criteriaQuery' @ [579:33] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`three way join by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'from' @ [579:47] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(DummyLinearStateSchemaV2.PersistentDummyLinearState..DummyLinearStateSchemaV2.PersistentDummyLinearState?)>..Class<(DummyLinearStateSchemaV2.PersistentDummyLinearState..DummyLinearStateSchemaV2.PersistentDummyLinearState?)>?)): (Root<(DummyLinearStateSchemaV2.PersistentDummyLinearState..DummyLinearStateSchemaV2.PersistentDummyLinearState?)>..Root<(DummyLinearStateSchemaV2.PersistentDummyLinearState..DummyLinearStateSchemaV2.PersistentDummyLinearState?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> PersistentDummyLinearState

'DummyLinearStateSchemaV2' @ [579:52] ==> public object DummyLinearStateSchemaV2 : MappedSchema defined in net.corda.testing.schemas[FakeCallableDescriptorForObject]

'PersistentDummyLinearState' @ [579:77] ==> public constructor PersistentDummyLinearState(linearString: String, linearNumber: Long, linearTimestamp: Instant, linearBoolean: Boolean, _participants: Set<AbstractParty>, uid: UniqueIdentifier) defined in net.corda.testing.schemas.DummyLinearStateSchemaV2.PersistentDummyLinearState[DeserializedClassConstructorDescriptor]

'java' @ [579:111] ==> public val <T> KClass<DummyLinearStateSchemaV2.PersistentDummyLinearState>.java: Class<DummyLinearStateSchemaV2.PersistentDummyLinearState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentDummyLinearState

'criteriaQuery' @ [581:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`three way join by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'select' @ [581:23] ==> public abstract fun select(p0: (Selection<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Selection<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'vaultStates' @ [581:30] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`three way join by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'criteriaBuilder' @ [582:30] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`three way join by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'equal' @ [582:46] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Expression<*>..Expression<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [582:52] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`three way join by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'get' @ [582:64] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'vaultLinearStates' @ [582:101] ==> val vaultLinearStates: (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`three way join by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'get' @ [582:119] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaBuilder' @ [583:30] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`three way join by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'and' @ [583:46] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'criteriaBuilder' @ [583:50] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`three way join by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'equal' @ [583:66] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Expression<*>..Expression<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [583:72] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`three way join by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'get' @ [583:84] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'dummyLinearStates' @ [583:121] ==> val dummyLinearStates: (Root<(DummyLinearStateSchemaV2.PersistentDummyLinearState..DummyLinearStateSchemaV2.PersistentDummyLinearState?)>..Root<(DummyLinearStateSchemaV2.PersistentDummyLinearState..DummyLinearStateSchemaV2.PersistentDummyLinearState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`three way join by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'get' @ [583:139] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaQuery' @ [584:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`three way join by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'where' @ [584:23] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'joinPredicate1' @ [584:29] ==> val joinPredicate1: (Predicate..Predicate?) defined in net.corda.node.services.database.HibernateConfigurationTest.`three way join by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'joinPredicate2' @ [584:45] ==> val joinPredicate2: (Predicate..Predicate?) defined in net.corda.node.services.database.HibernateConfigurationTest.`three way join by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'entityManager' @ [587:28] ==> val entityManager: (EntityManager..EntityManager?) defined in net.corda.node.services.database.HibernateConfigurationTest.`three way join by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'createQuery' @ [587:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'criteriaQuery' @ [587:54] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`three way join by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'resultList' @ [587:69] ==> public final val <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.resultList: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'assertThat' @ [588:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> VaultStates

'queryResults' @ [588:20] ==> val queryResults: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`three way join by composite primary between VaultStates, VaultLinearStates and DummyLinearStates`[LocalVariableDescriptor]

'hasSize' @ [588:34] ==> public open fun hasSize(p0: Int): (ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [594:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [596:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [596:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'cashStates' @ [598:13] ==> public final lateinit var cashStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'forEach' @ [598:24] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<Cash.State>>.forEach(action: (StateAndRef<Cash.State>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'it' @ [599:33] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.database.HibernateConfigurationTest.`select fungible states by owner party`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [599:36] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [599:42] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'State' @ [600:64] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[DeserializedClassConstructorDescriptor]

'cashState' @ [600:70] ==> val cashState: Cash.State defined in net.corda.node.services.database.HibernateConfigurationTest.`select fungible states by owner party`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'amount' @ [600:80] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'cashState' @ [600:88] ==> val cashState: Cash.State defined in net.corda.node.services.database.HibernateConfigurationTest.`select fungible states by owner party`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'owner' @ [600:98] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'hibernatePersister' @ [601:17] ==> public final lateinit var hibernatePersister: HibernateObserver defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'persistStateWithSchema' @ [601:36] ==> public final fun persistStateWithSchema(state: ContractState, stateRef: StateRef, schema: MappedSchema): Unit defined in net.corda.node.services.schema.HibernateObserver[DeserializedSimpleFunctionDescriptor]

'dummyFungibleState' @ [601:59] ==> val dummyFungibleState: DummyFungibleContract.State defined in net.corda.node.services.database.HibernateConfigurationTest.`select fungible states by owner party`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [601:79] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.database.HibernateConfigurationTest.`select fungible states by owner party`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [601:82] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'SampleCashSchemaV3' @ [601:87] ==> public object SampleCashSchemaV3 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [606:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [606:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..Class<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?)): (CriteriaQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..CriteriaQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PersistentCashState

'SampleCashSchemaV3' @ [606:57] ==> public object SampleCashSchemaV3 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'PersistentCashState' @ [606:76] ==> public constructor PersistentCashState(participants: MutableSet<AbstractParty>? = ..., owner: AbstractParty, pennies: Long, currency: String, issuer: AbstractParty, issuerRef: ByteArray) defined in net.corda.finance.schemas.SampleCashSchemaV3.PersistentCashState[DeserializedClassConstructorDescriptor]

'java' @ [606:103] ==> public val <T> KClass<SampleCashSchemaV3.PersistentCashState>.java: Class<SampleCashSchemaV3.PersistentCashState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentCashState

'criteriaQuery' @ [607:9] ==> val criteriaQuery: (CriteriaQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..CriteriaQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select fungible states by owner party`[LocalVariableDescriptor]

'from' @ [607:23] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..Class<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?)): (Root<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..Root<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> PersistentCashState

'SampleCashSchemaV3' @ [607:28] ==> public object SampleCashSchemaV3 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'PersistentCashState' @ [607:47] ==> public constructor PersistentCashState(participants: MutableSet<AbstractParty>? = ..., owner: AbstractParty, pennies: Long, currency: String, issuer: AbstractParty, issuerRef: ByteArray) defined in net.corda.finance.schemas.SampleCashSchemaV3.PersistentCashState[DeserializedClassConstructorDescriptor]

'java' @ [607:74] ==> public val <T> KClass<SampleCashSchemaV3.PersistentCashState>.java: Class<SampleCashSchemaV3.PersistentCashState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentCashState

'entityManager' @ [610:28] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [610:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..CriteriaQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?)): (TypedQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..TypedQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PersistentCashState

'criteriaQuery' @ [610:54] ==> val criteriaQuery: (CriteriaQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..CriteriaQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select fungible states by owner party`[LocalVariableDescriptor]

'resultList' @ [610:69] ==> public final val <X : (Any..Any?)> TypedQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>.resultList: (MutableList<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..List<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.finance.schemas.SampleCashSchemaV3.PersistentCashState..net.corda.finance.schemas.SampleCashSchemaV3.PersistentCashState?)

'assertThat' @ [611:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..List<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?)): (ListAssert<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..ListAssert<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> PersistentCashState

'queryResults' @ [611:20] ==> val queryResults: (MutableList<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..List<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select fungible states by owner party`[LocalVariableDescriptor]

'hasSize' @ [611:34] ==> public open fun hasSize(p0: Int): (ListAssert<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..ListAssert<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [617:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [619:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [619:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'cashStates' @ [621:13] ==> public final lateinit var cashStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'forEach' @ [621:24] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<Cash.State>>.forEach(action: (StateAndRef<Cash.State>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'it' @ [622:33] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [622:36] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [622:42] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'State' @ [623:64] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[DeserializedClassConstructorDescriptor]

'cashState' @ [623:70] ==> val cashState: Cash.State defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'amount' @ [623:80] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'cashState' @ [623:88] ==> val cashState: Cash.State defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'owner' @ [623:98] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'hibernatePersister' @ [624:17] ==> public final lateinit var hibernatePersister: HibernateObserver defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'persistStateWithSchema' @ [624:36] ==> public final fun persistStateWithSchema(state: ContractState, stateRef: StateRef, schema: MappedSchema): Unit defined in net.corda.node.services.schema.HibernateObserver[DeserializedSimpleFunctionDescriptor]

'dummyFungibleState' @ [624:59] ==> val dummyFungibleState: DummyFungibleContract.State defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [624:79] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [624:82] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'SampleCashSchemaV3' @ [624:87] ==> public object SampleCashSchemaV3 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'services' @ [627:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [627:22] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [627:47] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [627:56] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [627:72] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [627:92] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'ALICE' @ [627:114] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'services' @ [628:30] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [628:39] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [628:64] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [628:73] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [628:89] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [628:109] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'BOB' @ [629:56] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [629:60] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'BOB' @ [629:79] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'states' @ [629:85] ==> public final val states: Iterable<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault[DeserializedPropertyDescriptor]

'cashStates' @ [631:13] ==> val cashStates: Iterable<StateAndRef<Cash.State>> defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`.<anonymous>[LocalVariableDescriptor]

'forEach' @ [631:24] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<Cash.State>>.forEach(action: (StateAndRef<Cash.State>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'it' @ [632:33] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [632:36] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [632:42] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'State' @ [633:64] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[DeserializedClassConstructorDescriptor]

'cashState' @ [633:70] ==> val cashState: Cash.State defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'amount' @ [633:80] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'cashState' @ [633:88] ==> val cashState: Cash.State defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'owner' @ [633:98] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'hibernatePersister' @ [634:17] ==> public final lateinit var hibernatePersister: HibernateObserver defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'persistStateWithSchema' @ [634:36] ==> public final fun persistStateWithSchema(state: ContractState, stateRef: StateRef, schema: MappedSchema): Unit defined in net.corda.node.services.schema.HibernateObserver[DeserializedSimpleFunctionDescriptor]

'dummyFungibleState' @ [634:59] ==> val dummyFungibleState: DummyFungibleContract.State defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [634:79] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [634:82] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'SampleCashSchemaV3' @ [634:87] ==> public object SampleCashSchemaV3 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'hibernateConfig' @ [638:30] ==> public final lateinit var hibernateConfig: HibernateConfiguration defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'sessionFactoryForSchemas' @ [638:46] ==> public final fun sessionFactoryForSchemas(vararg schemas: MappedSchema): SessionFactory defined in net.corda.node.services.database.HibernateConfiguration[DeserializedSimpleFunctionDescriptor]

'VaultSchemaV1' @ [638:71] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'CommonSchemaV1' @ [638:86] ==> public object CommonSchemaV1 : MappedSchema defined in net.corda.core.schemas[FakeCallableDescriptorForObject]

'SampleCashSchemaV3' @ [638:102] ==> public object SampleCashSchemaV3 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'sessionFactory' @ [639:31] ==> val sessionFactory: SessionFactory defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`[LocalVariableDescriptor]

'criteriaBuilder' @ [639:46] ==> public final val SessionFactory.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'sessionFactory' @ [640:29] ==> val sessionFactory: SessionFactory defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`[LocalVariableDescriptor]

'createEntityManager' @ [640:44] ==> public abstract fun createEntityManager(): (EntityManager..EntityManager?) defined in org.hibernate.SessionFactory[JavaMethodDescriptor]

'criteriaBuilder' @ [643:29] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`[LocalVariableDescriptor]

'createQuery' @ [643:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [643:57] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [643:71] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [643:90] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [646:27] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`[LocalVariableDescriptor]

'from' @ [646:41] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [646:46] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [646:60] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [646:79] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [647:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`[LocalVariableDescriptor]

'select' @ [647:23] ==> public abstract fun select(p0: (Selection<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Selection<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'vaultStates' @ [647:30] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`[LocalVariableDescriptor]

'criteriaQuery' @ [650:32] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`[LocalVariableDescriptor]

'from' @ [650:46] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..Class<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?)): (Root<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..Root<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> PersistentCashState

'SampleCashSchemaV3' @ [650:51] ==> public object SampleCashSchemaV3 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'PersistentCashState' @ [650:70] ==> public constructor PersistentCashState(participants: MutableSet<AbstractParty>? = ..., owner: AbstractParty, pennies: Long, currency: String, issuer: AbstractParty, issuerRef: ByteArray) defined in net.corda.finance.schemas.SampleCashSchemaV3.PersistentCashState[DeserializedClassConstructorDescriptor]

'java' @ [650:97] ==> public val <T> KClass<SampleCashSchemaV3.PersistentCashState>.java: Class<SampleCashSchemaV3.PersistentCashState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentCashState

'BOB' @ [652:26] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [652:30] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'toString' @ [652:35] ==> public open fun toString(): String defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'criteriaQuery' @ [653:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`[LocalVariableDescriptor]

'where' @ [653:23] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [653:29] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`[LocalVariableDescriptor]

'equal' @ [653:45] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'cashStatesSchema' @ [653:51] ==> val cashStatesSchema: (Root<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..Root<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`[LocalVariableDescriptor]

'get' @ [653:68] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'queryOwner' @ [653:90] ==> val queryOwner: String defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`[LocalVariableDescriptor]

'criteriaBuilder' @ [655:37] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`[LocalVariableDescriptor]

'equal' @ [655:53] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Expression<*>..Expression<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [655:59] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`[LocalVariableDescriptor]

'get' @ [655:71] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'cashStatesSchema' @ [655:108] ==> val cashStatesSchema: (Root<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..Root<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`[LocalVariableDescriptor]

'get' @ [655:125] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaQuery' @ [656:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`[LocalVariableDescriptor]

'where' @ [656:23] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'joinVaultStatesToCash' @ [656:29] ==> val joinVaultStatesToCash: (Predicate..Predicate?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`[LocalVariableDescriptor]

'entityManager' @ [659:28] ==> val entityManager: (EntityManager..EntityManager?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`[LocalVariableDescriptor]

'createQuery' @ [659:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'criteriaQuery' @ [659:54] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`[LocalVariableDescriptor]

'resultList' @ [659:69] ==> public final val <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.resultList: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'queryResults' @ [661:9] ==> val queryResults: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`[LocalVariableDescriptor]

'forEach' @ [661:22] ==> @HidesMembers public inline fun <T> Iterable<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.forEach(action: ((VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'it' @ [662:33] ==> value-parameter it: (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`.<anonymous>[ValueParameterDescriptorImpl]

'contractState' @ [662:36] ==> @field:Column public final var contractState: ByteArray defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'deserialize' @ [662:50] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): TransactionState<ContractState> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TransactionState<ContractState>

'contractState' @ [663:29] ==> val contractState: TransactionState<ContractState> defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`.<anonymous>[LocalVariableDescriptor]

'data' @ [663:43] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'println' @ [664:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [664:24] ==> value-parameter it: (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`.<anonymous>[ValueParameterDescriptorImpl]

'stateRef' @ [664:27] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'cashState' @ [664:51] ==> val cashState: Cash.State defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`.<anonymous>[LocalVariableDescriptor]

'owner' @ [664:61] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'owningKey' @ [664:67] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toBase58String' @ [664:77] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [666:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> VaultStates

'queryResults' @ [666:20] ==> val queryResults: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by owner party`[LocalVariableDescriptor]

'hasSize' @ [666:34] ==> public open fun hasSize(p0: Int): (ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [672:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [674:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [674:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'cashStates' @ [676:13] ==> public final lateinit var cashStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'forEach' @ [676:24] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<Cash.State>>.forEach(action: (StateAndRef<Cash.State>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'it' @ [677:33] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.database.HibernateConfigurationTest.`select fungible states by participants`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [677:36] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [677:42] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'State' @ [678:64] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[DeserializedClassConstructorDescriptor]

'cashState' @ [678:70] ==> val cashState: Cash.State defined in net.corda.node.services.database.HibernateConfigurationTest.`select fungible states by participants`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'amount' @ [678:80] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'cashState' @ [678:88] ==> val cashState: Cash.State defined in net.corda.node.services.database.HibernateConfigurationTest.`select fungible states by participants`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'owner' @ [678:98] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'hibernatePersister' @ [679:17] ==> public final lateinit var hibernatePersister: HibernateObserver defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'persistStateWithSchema' @ [679:36] ==> public final fun persistStateWithSchema(state: ContractState, stateRef: StateRef, schema: MappedSchema): Unit defined in net.corda.node.services.schema.HibernateObserver[DeserializedSimpleFunctionDescriptor]

'dummyFungibleState' @ [679:59] ==> val dummyFungibleState: DummyFungibleContract.State defined in net.corda.node.services.database.HibernateConfigurationTest.`select fungible states by participants`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [679:79] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.database.HibernateConfigurationTest.`select fungible states by participants`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [679:82] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'SampleCashSchemaV3' @ [679:87] ==> public object SampleCashSchemaV3 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [684:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [684:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..Class<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?)): (CriteriaQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..CriteriaQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PersistentCashState

'SampleCashSchemaV3' @ [684:57] ==> public object SampleCashSchemaV3 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'PersistentCashState' @ [684:76] ==> public constructor PersistentCashState(participants: MutableSet<AbstractParty>? = ..., owner: AbstractParty, pennies: Long, currency: String, issuer: AbstractParty, issuerRef: ByteArray) defined in net.corda.finance.schemas.SampleCashSchemaV3.PersistentCashState[DeserializedClassConstructorDescriptor]

'java' @ [684:103] ==> public val <T> KClass<SampleCashSchemaV3.PersistentCashState>.java: Class<SampleCashSchemaV3.PersistentCashState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentCashState

'criteriaQuery' @ [685:9] ==> val criteriaQuery: (CriteriaQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..CriteriaQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select fungible states by participants`[LocalVariableDescriptor]

'from' @ [685:23] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..Class<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?)): (Root<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..Root<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> PersistentCashState

'SampleCashSchemaV3' @ [685:28] ==> public object SampleCashSchemaV3 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'PersistentCashState' @ [685:47] ==> public constructor PersistentCashState(participants: MutableSet<AbstractParty>? = ..., owner: AbstractParty, pennies: Long, currency: String, issuer: AbstractParty, issuerRef: ByteArray) defined in net.corda.finance.schemas.SampleCashSchemaV3.PersistentCashState[DeserializedClassConstructorDescriptor]

'java' @ [685:74] ==> public val <T> KClass<SampleCashSchemaV3.PersistentCashState>.java: Class<SampleCashSchemaV3.PersistentCashState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentCashState

'entityManager' @ [688:28] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [688:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..CriteriaQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?)): (TypedQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..TypedQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PersistentCashState

'criteriaQuery' @ [688:54] ==> val criteriaQuery: (CriteriaQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..CriteriaQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select fungible states by participants`[LocalVariableDescriptor]

'resultList' @ [688:69] ==> public final val <X : (Any..Any?)> TypedQuery<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>.resultList: (MutableList<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..List<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.finance.schemas.SampleCashSchemaV3.PersistentCashState..net.corda.finance.schemas.SampleCashSchemaV3.PersistentCashState?)

'assertThat' @ [690:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..List<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?)): (ListAssert<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..ListAssert<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> PersistentCashState

'queryResults' @ [690:20] ==> val queryResults: (MutableList<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..List<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`select fungible states by participants`[LocalVariableDescriptor]

'hasSize' @ [690:34] ==> public open fun hasSize(p0: Int): (ListAssert<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..ListAssert<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [696:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [699:13] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [699:22] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> StateAndRef<Cash.State>): StateAndRef<Cash.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'cashStates' @ [701:17] ==> public final lateinit var cashStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'forEach' @ [701:28] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<Cash.State>>.forEach(action: (StateAndRef<Cash.State>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'it' @ [702:37] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [702:40] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [702:46] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'State' @ [703:68] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[DeserializedClassConstructorDescriptor]

'cashState' @ [703:74] ==> val cashState: Cash.State defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'amount' @ [703:84] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'cashState' @ [703:92] ==> val cashState: Cash.State defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'owner' @ [703:102] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'hibernatePersister' @ [704:21] ==> public final lateinit var hibernatePersister: HibernateObserver defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'persistStateWithSchema' @ [704:40] ==> public final fun persistStateWithSchema(state: ContractState, stateRef: StateRef, schema: MappedSchema): Unit defined in net.corda.node.services.schema.HibernateObserver[DeserializedSimpleFunctionDescriptor]

'dummyFungibleState' @ [704:63] ==> val dummyFungibleState: DummyFungibleContract.State defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [704:83] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [704:86] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'SampleCashSchemaV3' @ [704:91] ==> public object SampleCashSchemaV3 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'services' @ [707:32] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [707:41] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [707:66] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [707:75] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [707:91] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [707:111] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'BOB' @ [708:36] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [708:40] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'BOB' @ [708:58] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'states' @ [708:63] ==> public final val states: Iterable<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault[DeserializedPropertyDescriptor]

'moreCash' @ [710:17] ==> val moreCash: Iterable<StateAndRef<Cash.State>> defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>[LocalVariableDescriptor]

'forEach' @ [710:26] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<Cash.State>>.forEach(action: (StateAndRef<Cash.State>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'it' @ [711:37] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [711:40] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [711:46] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'State' @ [712:68] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[DeserializedClassConstructorDescriptor]

'cashState' @ [712:74] ==> val cashState: Cash.State defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'amount' @ [712:84] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'cashState' @ [712:92] ==> val cashState: Cash.State defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'owner' @ [712:102] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'hibernatePersister' @ [713:21] ==> public final lateinit var hibernatePersister: HibernateObserver defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'persistStateWithSchema' @ [713:40] ==> public final fun persistStateWithSchema(state: ContractState, stateRef: StateRef, schema: MappedSchema): Unit defined in net.corda.node.services.schema.HibernateObserver[DeserializedSimpleFunctionDescriptor]

'dummyFungibleState' @ [713:63] ==> val dummyFungibleState: DummyFungibleContract.State defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [713:83] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [713:86] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'SampleCashSchemaV3' @ [713:91] ==> public object SampleCashSchemaV3 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'services' @ [716:34] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestCash' @ [716:43] ==> public fun ServiceHub.fillWithSomeTestCash(howMuch: Amount<Currency>, issuerServices: ServiceHub = ..., outputNotary: Party = ..., atLeastThisManyStates: Int = ..., atMostThisManyStates: Int = ..., rng: Random = ..., ref: OpaqueBytes = ..., ownedBy: AbstractParty? = ..., issuedBy: PartyAndReference = ...): Vault<Cash.State> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'DOLLARS' @ [716:68] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerServices' @ [716:77] ==> public final lateinit var issuerServices: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'DUMMY_NOTARY' @ [716:93] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'Random' @ [716:113] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'ALICE' @ [716:136] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'states' @ [716:144] ==> public final val states: Iterable<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault[DeserializedPropertyDescriptor]

'cashStates' @ [718:17] ==> val cashStates: Iterable<StateAndRef<Cash.State>> defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>[LocalVariableDescriptor]

'forEach' @ [718:28] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<Cash.State>>.forEach(action: (StateAndRef<Cash.State>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'it' @ [719:37] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [719:40] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [719:46] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'State' @ [720:68] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.DummyFungibleContract.State[DeserializedClassConstructorDescriptor]

'cashState' @ [720:74] ==> val cashState: Cash.State defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'amount' @ [720:84] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'cashState' @ [720:92] ==> val cashState: Cash.State defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'owner' @ [720:102] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'hibernatePersister' @ [721:21] ==> public final lateinit var hibernatePersister: HibernateObserver defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'persistStateWithSchema' @ [721:40] ==> public final fun persistStateWithSchema(state: ContractState, stateRef: StateRef, schema: MappedSchema): Unit defined in net.corda.node.services.schema.HibernateObserver[DeserializedSimpleFunctionDescriptor]

'dummyFungibleState' @ [721:63] ==> val dummyFungibleState: DummyFungibleContract.State defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [721:83] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [721:86] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'SampleCashSchemaV3' @ [721:91] ==> public object SampleCashSchemaV3 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'cashStates' @ [723:17] ==> val cashStates: Iterable<StateAndRef<Cash.State>> defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>[LocalVariableDescriptor]

'first' @ [723:28] ==> public fun <T> Iterable<StateAndRef<Cash.State>>.first(): StateAndRef<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'criteriaBuilder' @ [727:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [727:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [727:57] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [727:71] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [727:90] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [730:27] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`[LocalVariableDescriptor]

'from' @ [730:41] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [730:46] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [730:60] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [730:79] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [731:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`[LocalVariableDescriptor]

'select' @ [731:23] ==> public abstract fun select(p0: (Selection<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Selection<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'vaultStates' @ [731:30] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`[LocalVariableDescriptor]

'criteriaQuery' @ [734:32] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`[LocalVariableDescriptor]

'from' @ [734:46] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..Class<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?)): (Root<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..Root<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> PersistentCashState

'SampleCashSchemaV3' @ [734:51] ==> public object SampleCashSchemaV3 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'PersistentCashState' @ [734:70] ==> public constructor PersistentCashState(participants: MutableSet<AbstractParty>? = ..., owner: AbstractParty, pennies: Long, currency: String, issuer: AbstractParty, issuerRef: ByteArray) defined in net.corda.finance.schemas.SampleCashSchemaV3.PersistentCashState[DeserializedClassConstructorDescriptor]

'java' @ [734:97] ==> public val <T> KClass<SampleCashSchemaV3.PersistentCashState>.java: Class<SampleCashSchemaV3.PersistentCashState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentCashState

'firstCashState' @ [736:33] ==> val firstCashState: StateAndRef<Cash.State> defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`[LocalVariableDescriptor]

'state' @ [736:48] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [736:54] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'participants' @ [736:59] ==> public open val participants: List<AbstractParty> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'map' @ [736:72] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> String

'it' @ [736:78] ==> value-parameter it: AbstractParty defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>[ValueParameterDescriptorImpl]

'nameOrNull' @ [736:81] ==> public abstract fun nameOrNull(): X500Name? defined in net.corda.core.identity.AbstractParty[DeserializedSimpleFunctionDescriptor]

'toString' @ [736:94] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'cashStatesSchema' @ [737:36] ==> val cashStatesSchema: (Root<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..Root<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`[LocalVariableDescriptor]

'joinSet' @ [737:53] ==> public abstract fun <X : (Any..Any?), Y : (Any..Any?)> joinSet(p0: (String..String?)): (SetJoin<(Any..Any?), (Any..Any?)>..SetJoin<(Any..Any?), (Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaQuery' @ [738:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`[LocalVariableDescriptor]

'where' @ [738:23] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [738:29] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'and' @ [738:45] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'joinCashStateToParty' @ [738:49] ==> val joinCashStateToParty: (SetJoin<(Any..Any?), (Any..Any?)>..SetJoin<(Any..Any?), (Any..Any?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`[LocalVariableDescriptor]

'`in`' @ [738:70] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.SetJoin[JavaMethodDescriptor]

'queryParticipants' @ [738:75] ==> val queryParticipants: List<String> defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`[LocalVariableDescriptor]

'criteriaBuilder' @ [740:37] ==> public final lateinit var criteriaBuilder: CriteriaBuilder defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'equal' @ [740:53] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Expression<*>..Expression<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [740:59] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`[LocalVariableDescriptor]

'get' @ [740:71] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'cashStatesSchema' @ [740:108] ==> val cashStatesSchema: (Root<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>..Root<(SampleCashSchemaV3.PersistentCashState..SampleCashSchemaV3.PersistentCashState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`[LocalVariableDescriptor]

'get' @ [740:125] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaQuery' @ [741:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`[LocalVariableDescriptor]

'where' @ [741:23] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'joinVaultStatesToCash' @ [741:29] ==> val joinVaultStatesToCash: (Predicate..Predicate?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`[LocalVariableDescriptor]

'entityManager' @ [744:28] ==> public final lateinit var entityManager: EntityManager defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createQuery' @ [744:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'criteriaQuery' @ [744:54] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`[LocalVariableDescriptor]

'resultList' @ [744:69] ==> public final val <X : (Any..Any?)> TypedQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.resultList: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'queryResults' @ [745:9] ==> val queryResults: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`[LocalVariableDescriptor]

'forEach' @ [745:22] ==> @HidesMembers public inline fun <T> Iterable<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.forEach(action: ((VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'it' @ [746:33] ==> value-parameter it: (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>[ValueParameterDescriptorImpl]

'contractState' @ [746:36] ==> @field:Column public final var contractState: ByteArray defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'deserialize' @ [746:50] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): TransactionState<ContractState> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TransactionState<ContractState>

'contractState' @ [747:29] ==> val contractState: TransactionState<ContractState> defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>[LocalVariableDescriptor]

'data' @ [747:43] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'println' @ [748:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [748:24] ==> value-parameter it: (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>[ValueParameterDescriptorImpl]

'stateRef' @ [748:27] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'cashState' @ [748:50] ==> val cashState: Cash.State defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>[LocalVariableDescriptor]

'owner' @ [748:60] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'owningKey' @ [748:66] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toBase58String' @ [748:76] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'cashState' @ [748:113] ==> val cashState: Cash.State defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>[LocalVariableDescriptor]

'participants' @ [748:123] ==> public open val participants: List<AbstractParty> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'map' @ [748:136] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> String

'it' @ [748:142] ==> value-parameter it: AbstractParty defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [748:145] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toBase58String' @ [748:155] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [751:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> VaultStates

'queryResults' @ [751:20] ==> val queryResults: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`query fungible states by participants`[LocalVariableDescriptor]

'hasSize' @ [751:34] ==> public open fun hasSize(p0: Int): (ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..ListAssert<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [757:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [760:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [760:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<LinearState>): Vault<LinearState> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<LinearState>

'services' @ [761:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestLinearStates' @ [761:22] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestLinearStates(numberToCreate: Int, externalId: String? = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearBoolean: Boolean = ..., linearTimestamp: Instant = ...): Vault<LinearState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'services' @ [762:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestLinearStates' @ [762:22] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestLinearStates(numberToCreate: Int, externalId: String? = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearBoolean: Boolean = ..., linearTimestamp: Instant = ...): Vault<LinearState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'services' @ [763:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestLinearStates' @ [763:22] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestLinearStates(numberToCreate: Int, externalId: String? = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearBoolean: Boolean = ..., linearTimestamp: Instant = ...): Vault<LinearState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'hibernateConfig' @ [766:30] ==> public final lateinit var hibernateConfig: HibernateConfiguration defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'sessionFactoryForSchemas' @ [766:46] ==> public final fun sessionFactoryForSchemas(vararg schemas: MappedSchema): SessionFactory defined in net.corda.node.services.database.HibernateConfiguration[DeserializedSimpleFunctionDescriptor]

'VaultSchemaV1' @ [766:71] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'DummyLinearStateSchemaV2' @ [766:86] ==> public object DummyLinearStateSchemaV2 : MappedSchema defined in net.corda.testing.schemas[FakeCallableDescriptorForObject]

'sessionFactory' @ [767:31] ==> val sessionFactory: SessionFactory defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'criteriaBuilder' @ [767:46] ==> public final val SessionFactory.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'sessionFactory' @ [768:29] ==> val sessionFactory: SessionFactory defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'createEntityManager' @ [768:44] ==> public abstract fun createEntityManager(): (EntityManager..EntityManager?) defined in org.hibernate.SessionFactory[JavaMethodDescriptor]

'criteriaBuilder' @ [771:29] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'createQuery' @ [771:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(Tuple..Tuple?)>..Class<(Tuple..Tuple?)>?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Tuple

'java' @ [771:70] ==> public val <T> KClass<Tuple>.java: Class<Tuple> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Tuple

'criteriaQuery' @ [772:27] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'from' @ [772:41] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [772:46] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [772:60] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [772:79] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [773:33] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'from' @ [773:47] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Class<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?)): (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultLinearStates

'VaultSchemaV1' @ [773:52] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultLinearStates' @ [773:66] ==> public constructor VaultLinearStates(uid: UniqueIdentifier, _participants: List<AbstractParty>) defined in net.corda.node.services.vault.VaultSchemaV1.VaultLinearStates[DeserializedClassConstructorDescriptor]

'java' @ [773:91] ==> public val <T> KClass<VaultSchemaV1.VaultLinearStates>.java: Class<VaultSchemaV1.VaultLinearStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultLinearStates

'criteriaQuery' @ [776:9] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'multiselect' @ [776:23] ==> public abstract fun multiselect(vararg p0: (Selection<*>..Selection<*>?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'vaultStates' @ [776:35] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'vaultLinearStates' @ [776:48] ==> val vaultLinearStates: (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'criteriaBuilder' @ [777:29] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'equal' @ [777:45] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Expression<*>..Expression<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [777:51] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'get' @ [777:63] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'vaultLinearStates' @ [777:100] ==> val vaultLinearStates: (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'get' @ [777:118] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaQuery' @ [778:9] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'where' @ [778:23] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'joinPredicate' @ [778:29] ==> val joinPredicate: (Predicate..Predicate?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'criteriaQuery' @ [781:9] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'orderBy' @ [781:23] ==> public abstract fun orderBy(vararg p0: (Order..Order?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [781:31] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'desc' @ [781:47] ==> public abstract fun desc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultLinearStates' @ [781:52] ==> val vaultLinearStates: (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'get' @ [781:70] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaQuery' @ [782:9] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'orderBy' @ [782:23] ==> public abstract fun orderBy(vararg p0: (Order..Order?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [782:31] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'desc' @ [782:47] ==> public abstract fun desc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultLinearStates' @ [782:52] ==> val vaultLinearStates: (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'get' @ [782:70] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'entityManager' @ [785:28] ==> val entityManager: (EntityManager..EntityManager?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'createQuery' @ [785:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?)): (TypedQuery<(Tuple..Tuple?)>..TypedQuery<(Tuple..Tuple?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Tuple

'criteriaQuery' @ [785:54] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'resultList' @ [785:69] ==> public final val <X : (Any..Any?)> TypedQuery<(Tuple..Tuple?)>.resultList: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (javax.persistence.Tuple..javax.persistence.Tuple?)

'queryResults' @ [786:9] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'map' @ [786:22] ==> public inline fun <T, R> Iterable<(Tuple..Tuple?)>.map(transform: ((Tuple..Tuple?)) -> Unit): List<Unit> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.persistence.Tuple..javax.persistence.Tuple?)
    <R> -> Unit

'it' @ [787:30] ==> value-parameter it: (Tuple..Tuple?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [788:36] ==> value-parameter it: (Tuple..Tuple?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`.<anonymous>[ValueParameterDescriptorImpl]

'println' @ [789:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'vaultState' @ [789:24] ==> val vaultState: VaultSchemaV1.VaultStates defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`.<anonymous>[LocalVariableDescriptor]

'stateRef' @ [789:35] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'vaultLinearState' @ [789:49] ==> val vaultLinearState: VaultSchemaV1.VaultLinearStates defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`.<anonymous>[LocalVariableDescriptor]

'externalId' @ [789:66] ==> @field:Column public final var externalId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultLinearStates[DeserializedPropertyDescriptor]

'vaultLinearState' @ [789:80] ==> val vaultLinearState: VaultSchemaV1.VaultLinearStates defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`.<anonymous>[LocalVariableDescriptor]

'uuid' @ [789:97] ==> @field:Column public final var uuid: UUID defined in net.corda.node.services.vault.VaultSchemaV1.VaultLinearStates[DeserializedPropertyDescriptor]

'criteriaQuery' @ [793:9] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'orderBy' @ [793:23] ==> public abstract fun orderBy(vararg p0: (Order..Order?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [793:31] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'asc' @ [793:47] ==> public abstract fun asc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultLinearStates' @ [793:51] ==> val vaultLinearStates: (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'get' @ [793:69] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaQuery' @ [794:9] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'orderBy' @ [794:23] ==> public abstract fun orderBy(vararg p0: (Order..Order?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [794:31] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'asc' @ [794:47] ==> public abstract fun asc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultLinearStates' @ [794:51] ==> val vaultLinearStates: (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'get' @ [794:69] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'entityManager' @ [797:31] ==> val entityManager: (EntityManager..EntityManager?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'createQuery' @ [797:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?)): (TypedQuery<(Tuple..Tuple?)>..TypedQuery<(Tuple..Tuple?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Tuple

'criteriaQuery' @ [797:57] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'resultList' @ [797:72] ==> public final val <X : (Any..Any?)> TypedQuery<(Tuple..Tuple?)>.resultList: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (javax.persistence.Tuple..javax.persistence.Tuple?)

'queryResultsAsc' @ [798:9] ==> val queryResultsAsc: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'map' @ [798:25] ==> public inline fun <T, R> Iterable<(Tuple..Tuple?)>.map(transform: ((Tuple..Tuple?)) -> Unit): List<Unit> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.persistence.Tuple..javax.persistence.Tuple?)
    <R> -> Unit

'it' @ [799:30] ==> value-parameter it: (Tuple..Tuple?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [800:36] ==> value-parameter it: (Tuple..Tuple?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`.<anonymous>[ValueParameterDescriptorImpl]

'println' @ [801:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'vaultState' @ [801:24] ==> val vaultState: VaultSchemaV1.VaultStates defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`.<anonymous>[LocalVariableDescriptor]

'stateRef' @ [801:35] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'vaultLinearState' @ [801:49] ==> val vaultLinearState: VaultSchemaV1.VaultLinearStates defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`.<anonymous>[LocalVariableDescriptor]

'externalId' @ [801:66] ==> @field:Column public final var externalId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultLinearStates[DeserializedPropertyDescriptor]

'vaultLinearState' @ [801:80] ==> val vaultLinearState: VaultSchemaV1.VaultLinearStates defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`.<anonymous>[LocalVariableDescriptor]

'uuid' @ [801:97] ==> @field:Column public final var uuid: UUID defined in net.corda.node.services.vault.VaultSchemaV1.VaultLinearStates[DeserializedPropertyDescriptor]

'assertThat' @ [804:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (Tuple..Tuple?)>..List<(Tuple..Tuple?)>?)): (ListAssert<(Tuple..Tuple?)>..ListAssert<(Tuple..Tuple?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Tuple

'queryResults' @ [804:20] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from common table`[LocalVariableDescriptor]

'hasSize' @ [804:34] ==> public open fun hasSize(p0: Int): (ListAssert<(Tuple..Tuple?)>..ListAssert<(Tuple..Tuple?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [810:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [813:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [813:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault<LinearState>): Vault<LinearState> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Vault<LinearState>

'services' @ [814:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestLinearStates' @ [814:22] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestLinearStates(numberToCreate: Int, externalId: String? = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearBoolean: Boolean = ..., linearTimestamp: Instant = ...): Vault<LinearState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'services' @ [815:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestLinearStates' @ [815:22] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestLinearStates(numberToCreate: Int, externalId: String? = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearBoolean: Boolean = ..., linearTimestamp: Instant = ...): Vault<LinearState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'services' @ [816:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'fillWithSomeTestLinearStates' @ [816:22] ==> @JvmOverloads public fun ServiceHub.fillWithSomeTestLinearStates(numberToCreate: Int, externalId: String? = ..., participants: List<AbstractParty> = ..., linearString: String = ..., linearNumber: Long = ..., linearBoolean: Boolean = ..., linearTimestamp: Instant = ...): Vault<LinearState> defined in net.corda.testing.contracts[DeserializedSimpleFunctionDescriptor]

'hibernateConfig' @ [819:30] ==> public final lateinit var hibernateConfig: HibernateConfiguration defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'sessionFactoryForSchemas' @ [819:46] ==> public final fun sessionFactoryForSchemas(vararg schemas: MappedSchema): SessionFactory defined in net.corda.node.services.database.HibernateConfiguration[DeserializedSimpleFunctionDescriptor]

'VaultSchemaV1' @ [819:71] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'DummyLinearStateSchemaV1' @ [819:86] ==> public object DummyLinearStateSchemaV1 : MappedSchema defined in net.corda.testing.schemas[FakeCallableDescriptorForObject]

'sessionFactory' @ [820:31] ==> val sessionFactory: SessionFactory defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'criteriaBuilder' @ [820:46] ==> public final val SessionFactory.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'sessionFactory' @ [821:29] ==> val sessionFactory: SessionFactory defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'createEntityManager' @ [821:44] ==> public abstract fun createEntityManager(): (EntityManager..EntityManager?) defined in org.hibernate.SessionFactory[JavaMethodDescriptor]

'criteriaBuilder' @ [824:29] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'createQuery' @ [824:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(Tuple..Tuple?)>..Class<(Tuple..Tuple?)>?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Tuple

'java' @ [824:70] ==> public val <T> KClass<Tuple>.java: Class<Tuple> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Tuple

'criteriaQuery' @ [825:27] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'from' @ [825:41] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [825:46] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultStates' @ [825:60] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedClassConstructorDescriptor]

'java' @ [825:79] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [826:33] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'from' @ [826:47] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Class<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?)): (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultLinearStates

'VaultSchemaV1' @ [826:52] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'VaultLinearStates' @ [826:66] ==> public constructor VaultLinearStates(uid: UniqueIdentifier, _participants: List<AbstractParty>) defined in net.corda.node.services.vault.VaultSchemaV1.VaultLinearStates[DeserializedClassConstructorDescriptor]

'java' @ [826:91] ==> public val <T> KClass<VaultSchemaV1.VaultLinearStates>.java: Class<VaultSchemaV1.VaultLinearStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultLinearStates

'criteriaQuery' @ [827:33] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'from' @ [827:47] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>..Class<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>?)): (Root<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>..Root<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> PersistentDummyLinearState

'DummyLinearStateSchemaV1' @ [827:52] ==> public object DummyLinearStateSchemaV1 : MappedSchema defined in net.corda.testing.schemas[FakeCallableDescriptorForObject]

'PersistentDummyLinearState' @ [827:77] ==> public constructor PersistentDummyLinearState(participants: MutableSet<AbstractParty>, externalId: String?, uuid: UUID, linearString: String, linearNumber: Long, linearTimestamp: Instant, linearBoolean: Boolean) defined in net.corda.testing.schemas.DummyLinearStateSchemaV1.PersistentDummyLinearState[DeserializedClassConstructorDescriptor]

'java' @ [827:111] ==> public val <T> KClass<DummyLinearStateSchemaV1.PersistentDummyLinearState>.java: Class<DummyLinearStateSchemaV1.PersistentDummyLinearState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentDummyLinearState

'criteriaQuery' @ [830:9] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'multiselect' @ [830:23] ==> public abstract fun multiselect(vararg p0: (Selection<*>..Selection<*>?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'vaultStates' @ [830:35] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'vaultLinearStates' @ [830:48] ==> val vaultLinearStates: (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'dummyLinearStates' @ [830:67] ==> val dummyLinearStates: (Root<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>..Root<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'criteriaBuilder' @ [831:30] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'equal' @ [831:46] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Expression<*>..Expression<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [831:52] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'get' @ [831:64] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'vaultLinearStates' @ [831:101] ==> val vaultLinearStates: (Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>..Root<(VaultSchemaV1.VaultLinearStates..VaultSchemaV1.VaultLinearStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'get' @ [831:119] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaBuilder' @ [832:30] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'and' @ [832:46] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'criteriaBuilder' @ [832:50] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'equal' @ [832:66] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Expression<*>..Expression<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [832:72] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'get' @ [832:84] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'dummyLinearStates' @ [832:121] ==> val dummyLinearStates: (Root<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>..Root<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'get' @ [832:139] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaQuery' @ [833:9] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'where' @ [833:23] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'joinPredicate1' @ [833:29] ==> val joinPredicate1: (Predicate..Predicate?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'joinPredicate2' @ [833:45] ==> val joinPredicate2: (Predicate..Predicate?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'criteriaQuery' @ [836:9] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'orderBy' @ [836:23] ==> public abstract fun orderBy(vararg p0: (Order..Order?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [836:31] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'desc' @ [836:47] ==> public abstract fun desc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'dummyLinearStates' @ [836:52] ==> val dummyLinearStates: (Root<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>..Root<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'get' @ [836:70] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaQuery' @ [837:9] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'orderBy' @ [837:23] ==> public abstract fun orderBy(vararg p0: (Order..Order?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [837:31] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'desc' @ [837:47] ==> public abstract fun desc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'dummyLinearStates' @ [837:52] ==> val dummyLinearStates: (Root<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>..Root<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'get' @ [837:70] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'entityManager' @ [840:28] ==> val entityManager: (EntityManager..EntityManager?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'createQuery' @ [840:42] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?)): (TypedQuery<(Tuple..Tuple?)>..TypedQuery<(Tuple..Tuple?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Tuple

'criteriaQuery' @ [840:54] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'resultList' @ [840:69] ==> public final val <X : (Any..Any?)> TypedQuery<(Tuple..Tuple?)>.resultList: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (javax.persistence.Tuple..javax.persistence.Tuple?)

'queryResults' @ [841:9] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'map' @ [841:22] ==> public inline fun <T, R> Iterable<(Tuple..Tuple?)>.map(transform: ((Tuple..Tuple?)) -> Unit): List<Unit> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.persistence.Tuple..javax.persistence.Tuple?)
    <R> -> Unit

'it' @ [842:30] ==> value-parameter it: (Tuple..Tuple?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [843:38] ==> value-parameter it: (Tuple..Tuple?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [844:38] ==> value-parameter it: (Tuple..Tuple?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`.<anonymous>[ValueParameterDescriptorImpl]

'println' @ [845:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'vaultState' @ [845:24] ==> val vaultState: VaultSchemaV1.VaultStates defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`.<anonymous>[LocalVariableDescriptor]

'stateRef' @ [845:35] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'_dummyLinearStates' @ [845:50] ==> val _dummyLinearStates: DummyLinearStateSchemaV1.PersistentDummyLinearState defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`.<anonymous>[LocalVariableDescriptor]

'externalId' @ [845:69] ==> @field:Column public final var externalId: String? defined in net.corda.testing.schemas.DummyLinearStateSchemaV1.PersistentDummyLinearState[DeserializedPropertyDescriptor]

'_dummyLinearStates' @ [845:83] ==> val _dummyLinearStates: DummyLinearStateSchemaV1.PersistentDummyLinearState defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`.<anonymous>[LocalVariableDescriptor]

'uuid' @ [845:102] ==> @field:Column public final var uuid: UUID defined in net.corda.testing.schemas.DummyLinearStateSchemaV1.PersistentDummyLinearState[DeserializedPropertyDescriptor]

'_vaultLinearStates' @ [845:114] ==> val _vaultLinearStates: VaultSchemaV1.VaultLinearStates defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`.<anonymous>[LocalVariableDescriptor]

'externalId' @ [845:133] ==> @field:Column public final var externalId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultLinearStates[DeserializedPropertyDescriptor]

'_vaultLinearStates' @ [845:147] ==> val _vaultLinearStates: VaultSchemaV1.VaultLinearStates defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`.<anonymous>[LocalVariableDescriptor]

'uuid' @ [845:166] ==> @field:Column public final var uuid: UUID defined in net.corda.node.services.vault.VaultSchemaV1.VaultLinearStates[DeserializedPropertyDescriptor]

'criteriaQuery' @ [849:9] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'orderBy' @ [849:23] ==> public abstract fun orderBy(vararg p0: (Order..Order?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [849:31] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'asc' @ [849:47] ==> public abstract fun asc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'dummyLinearStates' @ [849:51] ==> val dummyLinearStates: (Root<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>..Root<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'get' @ [849:69] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaQuery' @ [850:9] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'orderBy' @ [850:23] ==> public abstract fun orderBy(vararg p0: (Order..Order?)): (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [850:31] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'asc' @ [850:47] ==> public abstract fun asc(p0: (Expression<*>..Expression<*>?)): (Order..Order?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'dummyLinearStates' @ [850:51] ==> val dummyLinearStates: (Root<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>..Root<(DummyLinearStateSchemaV1.PersistentDummyLinearState..DummyLinearStateSchemaV1.PersistentDummyLinearState?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'get' @ [850:69] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'entityManager' @ [853:31] ==> val entityManager: (EntityManager..EntityManager?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'createQuery' @ [853:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?)): (TypedQuery<(Tuple..Tuple?)>..TypedQuery<(Tuple..Tuple?)>?) defined in javax.persistence.EntityManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Tuple

'criteriaQuery' @ [853:57] ==> val criteriaQuery: (CriteriaQuery<(Tuple..Tuple?)>..CriteriaQuery<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'resultList' @ [853:72] ==> public final val <X : (Any..Any?)> TypedQuery<(Tuple..Tuple?)>.resultList: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (javax.persistence.Tuple..javax.persistence.Tuple?)

'queryResultsAsc' @ [854:9] ==> val queryResultsAsc: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'map' @ [854:25] ==> public inline fun <T, R> Iterable<(Tuple..Tuple?)>.map(transform: ((Tuple..Tuple?)) -> Unit): List<Unit> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.persistence.Tuple..javax.persistence.Tuple?)
    <R> -> Unit

'it' @ [855:30] ==> value-parameter it: (Tuple..Tuple?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [856:38] ==> value-parameter it: (Tuple..Tuple?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [857:38] ==> value-parameter it: (Tuple..Tuple?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`.<anonymous>[ValueParameterDescriptorImpl]

'println' @ [858:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'vaultState' @ [858:24] ==> val vaultState: VaultSchemaV1.VaultStates defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`.<anonymous>[LocalVariableDescriptor]

'stateRef' @ [858:35] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'_dummyLinearStates' @ [858:50] ==> val _dummyLinearStates: DummyLinearStateSchemaV1.PersistentDummyLinearState defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`.<anonymous>[LocalVariableDescriptor]

'externalId' @ [858:69] ==> @field:Column public final var externalId: String? defined in net.corda.testing.schemas.DummyLinearStateSchemaV1.PersistentDummyLinearState[DeserializedPropertyDescriptor]

'_dummyLinearStates' @ [858:83] ==> val _dummyLinearStates: DummyLinearStateSchemaV1.PersistentDummyLinearState defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`.<anonymous>[LocalVariableDescriptor]

'uuid' @ [858:102] ==> @field:Column public final var uuid: UUID defined in net.corda.testing.schemas.DummyLinearStateSchemaV1.PersistentDummyLinearState[DeserializedPropertyDescriptor]

'_vaultLinearStates' @ [858:114] ==> val _vaultLinearStates: VaultSchemaV1.VaultLinearStates defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`.<anonymous>[LocalVariableDescriptor]

'externalId' @ [858:133] ==> @field:Column public final var externalId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultLinearStates[DeserializedPropertyDescriptor]

'_vaultLinearStates' @ [858:147] ==> val _vaultLinearStates: VaultSchemaV1.VaultLinearStates defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`.<anonymous>[LocalVariableDescriptor]

'uuid' @ [858:166] ==> @field:Column public final var uuid: UUID defined in net.corda.node.services.vault.VaultSchemaV1.VaultLinearStates[DeserializedPropertyDescriptor]

'assertThat' @ [861:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (Tuple..Tuple?)>..List<(Tuple..Tuple?)>?)): (ListAssert<(Tuple..Tuple?)>..ListAssert<(Tuple..Tuple?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Tuple

'queryResults' @ [861:20] ==> val queryResults: (MutableList<(Tuple..Tuple?)>..List<(Tuple..Tuple?)>?) defined in net.corda.node.services.database.HibernateConfigurationTest.`with sorting on attribute from custom table`[LocalVariableDescriptor]

'hasSize' @ [861:34] ==> public open fun hasSize(p0: Int): (ListAssert<(Tuple..Tuple?)>..ListAssert<(Tuple..Tuple?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [867:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [872:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'transaction' @ [872:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'database' @ [873:31] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'createSession' @ [873:40] ==> public final fun createSession(): Connection defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]

'jdbcSession' @ [874:33] ==> val jdbcSession: Connection defined in net.corda.node.services.database.HibernateConfigurationTest.`test calling an arbitrary JDBC native query`.<anonymous>[LocalVariableDescriptor]

'prepareStatement' @ [874:45] ==> public abstract fun prepareStatement(p0: (String..String?)): (PreparedStatement..PreparedStatement?) defined in java.sql.Connection[JavaMethodDescriptor]

'nativeQuery' @ [874:62] ==> val nativeQuery: String defined in net.corda.node.services.database.HibernateConfigurationTest.`test calling an arbitrary JDBC native query`[LocalVariableDescriptor]

'prepStatement' @ [875:22] ==> val prepStatement: (PreparedStatement..PreparedStatement?) defined in net.corda.node.services.database.HibernateConfigurationTest.`test calling an arbitrary JDBC native query`.<anonymous>[LocalVariableDescriptor]

'executeQuery' @ [875:36] ==> public abstract fun executeQuery(): (ResultSet..ResultSet?) defined in java.sql.PreparedStatement[JavaMethodDescriptor]

'rs' @ [878:20] ==> val rs: (ResultSet..ResultSet?) defined in net.corda.node.services.database.HibernateConfigurationTest.`test calling an arbitrary JDBC native query`.<anonymous>[LocalVariableDescriptor]

'next' @ [878:23] ==> public abstract operator fun next(): Boolean defined in java.sql.ResultSet[JavaMethodDescriptor]

'StateRef' @ [879:32] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'SecureHash' @ [879:41] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'parse' @ [879:52] ==> @JvmStatic public final fun parse(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'rs' @ [879:58] ==> val rs: (ResultSet..ResultSet?) defined in net.corda.node.services.database.HibernateConfigurationTest.`test calling an arbitrary JDBC native query`.<anonymous>[LocalVariableDescriptor]

'getString' @ [879:61] ==> public abstract fun getString(p0: Int): (String..String?) defined in java.sql.ResultSet[JavaMethodDescriptor]

'rs' @ [879:76] ==> val rs: (ResultSet..ResultSet?) defined in net.corda.node.services.database.HibernateConfigurationTest.`test calling an arbitrary JDBC native query`.<anonymous>[LocalVariableDescriptor]

'getInt' @ [879:79] ==> public abstract fun getInt(p0: Int): Int defined in java.sql.ResultSet[JavaMethodDescriptor]

'assertTrue' @ [880:24] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'cashStates' @ [880:35] ==> public final lateinit var cashStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'map' @ [880:46] ==> public inline fun <T, R> Iterable<StateAndRef<Cash.State>>.map(transform: (StateAndRef<Cash.State>) -> StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>
    <R> -> StateRef

'it' @ [880:52] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.node.services.database.HibernateConfigurationTest.`test calling an arbitrary JDBC native query`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [880:55] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'contains' @ [880:61] ==> public abstract fun contains(element: StateRef): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'stateRef' @ [880:70] ==> val stateRef: StateRef defined in net.corda.node.services.database.HibernateConfigurationTest.`test calling an arbitrary JDBC native query`.<anonymous>[LocalVariableDescriptor]

'count' @ [881:17] ==> var count: Int defined in net.corda.node.services.database.HibernateConfigurationTest.`test calling an arbitrary JDBC native query`.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [883:20] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'cashStates' @ [883:33] ==> public final lateinit var cashStates: List<StateAndRef<Cash.State>> defined in net.corda.node.services.database.HibernateConfigurationTest[PropertyDescriptorImpl]

'count' @ [883:44] ==> @InlineOnly public inline fun <T> Collection<StateAndRef<Cash.State>>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'count' @ [883:53] ==> var count: Int defined in net.corda.node.services.database.HibernateConfigurationTest.`test calling an arbitrary JDBC native query`.<anonymous>[LocalVariableDescriptor]

