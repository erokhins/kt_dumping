'TestDependencyInjectionBase' @ [36:35] ==> public constructor TestDependencyInjectionBase() defined in net.corda.testing.TestDependencyInjectionBase[DeserializedClassConstructorDescriptor]

'services' @ [40:37] ==> public final lateinit var services: MockServices defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'vaultService' @ [40:46] ==> public open val vaultService: VaultService defined in net.corda.testing.node.MockServices[DeserializedPropertyDescriptor]

'Before' @ [42:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'LogHelper' @ [44:9] ==> public object LogHelper defined in net.corda.testing[FakeCallableDescriptorForObject]

'setLevel' @ [44:19] ==> public final fun setLevel(vararg classes: KClass<*>): Unit defined in net.corda.testing.LogHelper[DeserializedSimpleFunctionDescriptor]

'PersistentUniquenessProvider' @ [44:28] ==> public companion object defined in net.corda.node.services.transactions.PersistentUniquenessProvider[FakeCallableDescriptorForObject]

'makeTestDataSourceProperties' @ [45:31] ==> public fun makeTestDataSourceProperties(nodeName: String = ...): Properties defined in net.corda.testing.node[DeserializedSimpleFunctionDescriptor]

'MappedSchema' @ [47:33] ==> public constructor MappedSchema(schemaFamily: Class<*>, version: Int, mappedTypes: Iterable<Class<*>>) defined in net.corda.core.schemas.MappedSchema[DeserializedClassConstructorDescriptor]

'javaClass' @ [47:61] ==> public val <T : Any> DBTransactionStorageTests.javaClass: Class<DBTransactionStorageTests> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> DBTransactionStorageTests

'listOf' @ [48:31] ==> public fun <T> listOf(element: Class<DBTransactionStorage.DBTransaction>): List<Class<DBTransactionStorage.DBTransaction>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<DBTransaction>

'DBTransactionStorage' @ [48:38] ==> private companion object defined in net.corda.node.services.persistence.DBTransactionStorage[FakeCallableDescriptorForObject]

'DBTransaction' @ [48:59] ==> public constructor DBTransaction(txId: String = ..., transaction: ByteArray = ...) defined in net.corda.node.services.persistence.DBTransactionStorage.DBTransaction[DeserializedClassConstructorDescriptor]

'java' @ [48:80] ==> public val <T> KClass<DBTransactionStorage.DBTransaction>.java: Class<DBTransactionStorage.DBTransaction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DBTransaction

'NodeSchemaService' @ [50:37] ==> public constructor NodeSchemaService(customSchemas: Set<MappedSchema> = ...) defined in net.corda.node.services.schema.NodeSchemaService[DeserializedClassConstructorDescriptor]

'setOf' @ [50:55] ==> public fun <T> setOf(vararg elements: MappedSchema): Set<MappedSchema> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MappedSchema

'VaultSchemaV1' @ [50:61] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault[FakeCallableDescriptorForObject]

'CashSchemaV1' @ [50:76] ==> @CordaSerializable public object CashSchemaV1 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'SampleCashSchemaV2' @ [50:90] ==> public object SampleCashSchemaV2 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'SampleCashSchemaV3' @ [50:110] ==> public object SampleCashSchemaV3 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'transactionSchema' @ [50:130] ==> val transactionSchema: MappedSchema defined in net.corda.node.services.persistence.DBTransactionStorageTests.setUp[LocalVariableDescriptor]

'database' @ [52:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'configureDatabase' @ [52:20] ==> public fun configureDatabase(dataSourceProperties: Properties, databaseProperties: Properties?, createSchemaService: () -> SchemaService = ..., createIdentityService: () -> IdentityService): CordaPersistence defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'dataSourceProps' @ [52:38] ==> val dataSourceProps: Properties defined in net.corda.node.services.persistence.DBTransactionStorageTests.setUp[LocalVariableDescriptor]

'makeTestDatabaseProperties' @ [52:55] ==> public fun makeTestDatabaseProperties(key: String? = ..., value: String? = ...): Properties defined in net.corda.testing.node[DeserializedSimpleFunctionDescriptor]

'createSchemaService' @ [52:85] ==> val createSchemaService: () -> NodeSchemaService defined in net.corda.node.services.persistence.DBTransactionStorageTests.setUp[LocalVariableDescriptor]

'database' @ [54:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [54:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'services' @ [56:13] ==> public final lateinit var services: MockServices defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'MockServices' @ [56:33] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'BOB_KEY' @ [56:46] ==> public val BOB_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'NodeVaultService' @ [58:40] ==> public constructor NodeVaultService(services: ServiceHub) defined in net.corda.node.services.vault.NodeVaultService[DeserializedClassConstructorDescriptor]

'this' @ [58:57] ==> <this> defined in net.corda.node.services.persistence.DBTransactionStorageTests.setUp.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'hibernatePersister' @ [59:21] ==> public final lateinit var hibernatePersister: HibernateObserver defined in net.corda.node.services.persistence.DBTransactionStorageTests.setUp.<anonymous>.<no name provided>[DeserializedPropertyDescriptor]

'HibernateObserver' @ [59:42] ==> public constructor HibernateObserver(vaultUpdates: Observable<Vault.Update<ContractState>>, config: HibernateConfiguration) defined in net.corda.node.services.schema.HibernateObserver[DeserializedClassConstructorDescriptor]

'vaultService' @ [59:60] ==> val vaultService: NodeVaultService defined in net.corda.node.services.persistence.DBTransactionStorageTests.setUp.<anonymous>.<no name provided>.<get-vaultService>[LocalVariableDescriptor]

'rawUpdates' @ [59:73] ==> public open val rawUpdates: Observable<Vault.Update<ContractState>> defined in net.corda.node.services.vault.NodeVaultService[DeserializedPropertyDescriptor]

'database' @ [59:85] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'hibernateConfig' @ [59:94] ==> public final val hibernateConfig: HibernateConfiguration defined in net.corda.node.utilities.CordaPersistence[DeserializedPropertyDescriptor]

'vaultService' @ [60:28] ==> val vaultService: NodeVaultService defined in net.corda.node.services.persistence.DBTransactionStorageTests.setUp.<anonymous>.<no name provided>.<get-vaultService>[LocalVariableDescriptor]

'txs' @ [64:33] ==> value-parameter txs: Iterable<SignedTransaction> defined in net.corda.node.services.persistence.DBTransactionStorageTests.setUp.<anonymous>.<no name provided>.recordTransactions[ValueParameterDescriptorImpl]

'validatedTransactions' @ [65:25] ==> public open val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests.setUp.<anonymous>.<no name provided>[DeserializedPropertyDescriptor]

'addTransaction' @ [65:47] ==> public abstract fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'stx' @ [65:62] ==> val stx: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.setUp.<anonymous>.<no name provided>.recordTransactions[LocalVariableDescriptor]

'vaultService' @ [68:21] ==> public open val vaultService: VaultService defined in net.corda.node.services.persistence.DBTransactionStorageTests.setUp.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'notifyAll' @ [68:34] ==> public abstract fun notifyAll(txns: Iterable<CoreTransaction>): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'txs' @ [68:44] ==> value-parameter txs: Iterable<SignedTransaction> defined in net.corda.node.services.persistence.DBTransactionStorageTests.setUp.<anonymous>.<no name provided>.recordTransactions[ValueParameterDescriptorImpl]

'map' @ [68:48] ==> public inline fun <T, R> Iterable<SignedTransaction>.map(transform: (SignedTransaction) -> WireTransaction): List<WireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <R> -> WireTransaction

'it' @ [68:54] ==> value-parameter it: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.setUp.<anonymous>.<no name provided>.recordTransactions.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [68:57] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'newTransactionStorage' @ [72:9] ==> private final fun newTransactionStorage(): Unit defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'After' @ [75:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'database' @ [77:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'close' @ [77:18] ==> public open fun close(): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]

'LogHelper' @ [78:9] ==> public object LogHelper defined in net.corda.testing[FakeCallableDescriptorForObject]

'reset' @ [78:19] ==> public final fun reset(vararg classes: KClass<*>): Unit defined in net.corda.testing.LogHelper[DeserializedSimpleFunctionDescriptor]

'PersistentUniquenessProvider' @ [78:25] ==> public companion object defined in net.corda.node.services.transactions.PersistentUniquenessProvider[FakeCallableDescriptorForObject]

'Test' @ [81:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [83:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [83:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertThat' @ [84:13] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (SignedTransaction..SignedTransaction?)): (AbstractObjectAssert<*, (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<*, (SignedTransaction..SignedTransaction?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SignedTransaction

'transactionStorage' @ [84:24] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'getTransaction' @ [84:43] ==> public open fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedSimpleFunctionDescriptor]

'newTransaction' @ [84:58] ==> private final fun newTransaction(): SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'id' @ [84:75] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'isNull' @ [84:80] ==> public open fun isNull(): Unit defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'database' @ [86:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [86:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertThat' @ [87:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableIterable<(SignedTransaction..SignedTransaction?)>..Iterable<(SignedTransaction..SignedTransaction?)>?)): (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> SignedTransaction

'transactionStorage' @ [87:24] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transactions' @ [87:43] ==> public final val transactions: Iterable<SignedTransaction> defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedPropertyDescriptor]

'isEmpty' @ [87:57] ==> public open fun isEmpty(): Unit defined in org.assertj.core.api.IterableAssert[JavaMethodDescriptor]

'newTransactionStorage' @ [89:9] ==> private final fun newTransactionStorage(): Unit defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'database' @ [90:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [90:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertThat' @ [91:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableIterable<(SignedTransaction..SignedTransaction?)>..Iterable<(SignedTransaction..SignedTransaction?)>?)): (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> SignedTransaction

'transactionStorage' @ [91:24] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transactions' @ [91:43] ==> public final val transactions: Iterable<SignedTransaction> defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedPropertyDescriptor]

'isEmpty' @ [91:57] ==> public open fun isEmpty(): Unit defined in org.assertj.core.api.IterableAssert[JavaMethodDescriptor]

'Test' @ [95:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'newTransaction' @ [97:27] ==> private final fun newTransaction(): SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'database' @ [98:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [98:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Boolean): Boolean defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'transactionStorage' @ [99:13] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'addTransaction' @ [99:32] ==> public open fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedSimpleFunctionDescriptor]

'transaction' @ [99:47] ==> val transaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`one transaction`[LocalVariableDescriptor]

'assertTransactionIsRetrievable' @ [101:9] ==> private final fun assertTransactionIsRetrievable(transaction: SignedTransaction): Unit defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'transaction' @ [101:40] ==> val transaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`one transaction`[LocalVariableDescriptor]

'database' @ [102:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [102:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?)): (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.IterableAssert<(net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>..org.assertj.core.api.IterableAssert<(net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>?)

'assertThat' @ [103:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableIterable<(SignedTransaction..SignedTransaction?)>..Iterable<(SignedTransaction..SignedTransaction?)>?)): (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> SignedTransaction

'transactionStorage' @ [103:24] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transactions' @ [103:43] ==> public final val transactions: Iterable<SignedTransaction> defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedPropertyDescriptor]

'containsExactly' @ [103:57] ==> @SafeVarargs public final fun containsExactly(vararg p0: (SignedTransaction..SignedTransaction?)): (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?) defined in org.assertj.core.api.IterableAssert[JavaMethodDescriptor]

'transaction' @ [103:73] ==> val transaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`one transaction`[LocalVariableDescriptor]

'newTransactionStorage' @ [105:9] ==> private final fun newTransactionStorage(): Unit defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'assertTransactionIsRetrievable' @ [106:9] ==> private final fun assertTransactionIsRetrievable(transaction: SignedTransaction): Unit defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'transaction' @ [106:40] ==> val transaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`one transaction`[LocalVariableDescriptor]

'database' @ [107:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [107:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?)): (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.IterableAssert<(net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>..org.assertj.core.api.IterableAssert<(net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>?)

'assertThat' @ [108:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableIterable<(SignedTransaction..SignedTransaction?)>..Iterable<(SignedTransaction..SignedTransaction?)>?)): (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> SignedTransaction

'transactionStorage' @ [108:24] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transactions' @ [108:43] ==> public final val transactions: Iterable<SignedTransaction> defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedPropertyDescriptor]

'containsExactly' @ [108:57] ==> @SafeVarargs public final fun containsExactly(vararg p0: (SignedTransaction..SignedTransaction?)): (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?) defined in org.assertj.core.api.IterableAssert[JavaMethodDescriptor]

'transaction' @ [108:73] ==> val transaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`one transaction`[LocalVariableDescriptor]

'Test' @ [112:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'newTransaction' @ [114:32] ==> private final fun newTransaction(): SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'newTransaction' @ [115:33] ==> private final fun newTransaction(): SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'database' @ [116:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [116:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Boolean): Boolean defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'transactionStorage' @ [117:13] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'addTransaction' @ [117:32] ==> public open fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedSimpleFunctionDescriptor]

'firstTransaction' @ [117:47] ==> val firstTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`two transactions across restart`[LocalVariableDescriptor]

'newTransactionStorage' @ [119:9] ==> private final fun newTransactionStorage(): Unit defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'database' @ [120:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [120:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Boolean): Boolean defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'transactionStorage' @ [121:13] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'addTransaction' @ [121:32] ==> public open fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedSimpleFunctionDescriptor]

'secondTransaction' @ [121:47] ==> val secondTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`two transactions across restart`[LocalVariableDescriptor]

'assertTransactionIsRetrievable' @ [123:9] ==> private final fun assertTransactionIsRetrievable(transaction: SignedTransaction): Unit defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'firstTransaction' @ [123:40] ==> val firstTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`two transactions across restart`[LocalVariableDescriptor]

'assertTransactionIsRetrievable' @ [124:9] ==> private final fun assertTransactionIsRetrievable(transaction: SignedTransaction): Unit defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'secondTransaction' @ [124:40] ==> val secondTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`two transactions across restart`[LocalVariableDescriptor]

'database' @ [125:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [125:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?)): (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.IterableAssert<(net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>..org.assertj.core.api.IterableAssert<(net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>?)

'assertThat' @ [126:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableIterable<(SignedTransaction..SignedTransaction?)>..Iterable<(SignedTransaction..SignedTransaction?)>?)): (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> SignedTransaction

'transactionStorage' @ [126:24] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transactions' @ [126:43] ==> public final val transactions: Iterable<SignedTransaction> defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedPropertyDescriptor]

'containsOnly' @ [126:57] ==> @SafeVarargs public final fun containsOnly(vararg p0: (SignedTransaction..SignedTransaction?)): (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?) defined in org.assertj.core.api.IterableAssert[JavaMethodDescriptor]

'firstTransaction' @ [126:70] ==> val firstTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`two transactions across restart`[LocalVariableDescriptor]

'secondTransaction' @ [126:88] ==> val secondTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`two transactions across restart`[LocalVariableDescriptor]

'Test' @ [130:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'newTransaction' @ [132:32] ==> private final fun newTransaction(): SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'newTransaction' @ [133:33] ==> private final fun newTransaction(): SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'database' @ [134:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [134:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'transactionStorage' @ [135:13] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'addTransaction' @ [135:32] ==> public open fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedSimpleFunctionDescriptor]

'firstTransaction' @ [135:47] ==> val firstTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`two transactions with rollback`[LocalVariableDescriptor]

'transactionStorage' @ [136:13] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'addTransaction' @ [136:32] ==> public open fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedSimpleFunctionDescriptor]

'secondTransaction' @ [136:47] ==> val secondTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`two transactions with rollback`[LocalVariableDescriptor]

'rollback' @ [137:13] ==> public final fun rollback(): Unit defined in net.corda.node.utilities.DatabaseTransaction[DeserializedSimpleFunctionDescriptor]

'database' @ [140:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [140:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertThat' @ [141:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableIterable<(SignedTransaction..SignedTransaction?)>..Iterable<(SignedTransaction..SignedTransaction?)>?)): (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> SignedTransaction

'transactionStorage' @ [141:24] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transactions' @ [141:43] ==> public final val transactions: Iterable<SignedTransaction> defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedPropertyDescriptor]

'isEmpty' @ [141:57] ==> public open fun isEmpty(): Unit defined in org.assertj.core.api.IterableAssert[JavaMethodDescriptor]

'Test' @ [145:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'newTransaction' @ [147:32] ==> private final fun newTransaction(): SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'newTransaction' @ [148:33] ==> private final fun newTransaction(): SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'database' @ [149:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [149:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Boolean): Boolean defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'transactionStorage' @ [150:13] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'addTransaction' @ [150:32] ==> public open fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedSimpleFunctionDescriptor]

'firstTransaction' @ [150:47] ==> val firstTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`two transactions in same DB transaction scope`[LocalVariableDescriptor]

'transactionStorage' @ [151:13] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'addTransaction' @ [151:32] ==> public open fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedSimpleFunctionDescriptor]

'secondTransaction' @ [151:47] ==> val secondTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`two transactions in same DB transaction scope`[LocalVariableDescriptor]

'assertTransactionIsRetrievable' @ [153:9] ==> private final fun assertTransactionIsRetrievable(transaction: SignedTransaction): Unit defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'firstTransaction' @ [153:40] ==> val firstTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`two transactions in same DB transaction scope`[LocalVariableDescriptor]

'assertTransactionIsRetrievable' @ [154:9] ==> private final fun assertTransactionIsRetrievable(transaction: SignedTransaction): Unit defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'secondTransaction' @ [154:40] ==> val secondTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`two transactions in same DB transaction scope`[LocalVariableDescriptor]

'database' @ [155:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [155:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?)): (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.IterableAssert<(net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>..org.assertj.core.api.IterableAssert<(net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>?)

'assertThat' @ [156:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableIterable<(SignedTransaction..SignedTransaction?)>..Iterable<(SignedTransaction..SignedTransaction?)>?)): (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> SignedTransaction

'transactionStorage' @ [156:24] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transactions' @ [156:43] ==> public final val transactions: Iterable<SignedTransaction> defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedPropertyDescriptor]

'containsOnly' @ [156:57] ==> @SafeVarargs public final fun containsOnly(vararg p0: (SignedTransaction..SignedTransaction?)): (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?) defined in org.assertj.core.api.IterableAssert[JavaMethodDescriptor]

'firstTransaction' @ [156:70] ==> val firstTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`two transactions in same DB transaction scope`[LocalVariableDescriptor]

'secondTransaction' @ [156:88] ==> val secondTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`two transactions in same DB transaction scope`[LocalVariableDescriptor]

'Test' @ [160:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'newTransaction' @ [162:32] ==> private final fun newTransaction(): SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'database' @ [163:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [163:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Boolean): Boolean defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'transactionStorage' @ [164:13] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'addTransaction' @ [164:32] ==> public open fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedSimpleFunctionDescriptor]

'firstTransaction' @ [164:47] ==> val firstTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`transaction saved twice in same DB transaction scope`[LocalVariableDescriptor]

'transactionStorage' @ [165:13] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'addTransaction' @ [165:32] ==> public open fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedSimpleFunctionDescriptor]

'firstTransaction' @ [165:47] ==> val firstTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`transaction saved twice in same DB transaction scope`[LocalVariableDescriptor]

'assertTransactionIsRetrievable' @ [167:9] ==> private final fun assertTransactionIsRetrievable(transaction: SignedTransaction): Unit defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'firstTransaction' @ [167:40] ==> val firstTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`transaction saved twice in same DB transaction scope`[LocalVariableDescriptor]

'database' @ [168:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [168:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?)): (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.IterableAssert<(net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>..org.assertj.core.api.IterableAssert<(net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>?)

'assertThat' @ [169:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableIterable<(SignedTransaction..SignedTransaction?)>..Iterable<(SignedTransaction..SignedTransaction?)>?)): (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> SignedTransaction

'transactionStorage' @ [169:24] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transactions' @ [169:43] ==> public final val transactions: Iterable<SignedTransaction> defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedPropertyDescriptor]

'containsOnly' @ [169:57] ==> @SafeVarargs public final fun containsOnly(vararg p0: (SignedTransaction..SignedTransaction?)): (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?) defined in org.assertj.core.api.IterableAssert[JavaMethodDescriptor]

'firstTransaction' @ [169:70] ==> val firstTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`transaction saved twice in same DB transaction scope`[LocalVariableDescriptor]

'Test' @ [173:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'newTransaction' @ [175:32] ==> private final fun newTransaction(): SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'newTransaction' @ [176:33] ==> private final fun newTransaction(): SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'database' @ [177:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [177:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Boolean): Boolean defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'transactionStorage' @ [178:13] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'addTransaction' @ [178:32] ==> public open fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedSimpleFunctionDescriptor]

'firstTransaction' @ [178:47] ==> val firstTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`transaction saved twice in two DB transaction scopes`[LocalVariableDescriptor]

'database' @ [181:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [181:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Boolean): Boolean defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'transactionStorage' @ [182:13] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'addTransaction' @ [182:32] ==> public open fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedSimpleFunctionDescriptor]

'secondTransaction' @ [182:47] ==> val secondTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`transaction saved twice in two DB transaction scopes`[LocalVariableDescriptor]

'transactionStorage' @ [183:13] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'addTransaction' @ [183:32] ==> public open fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedSimpleFunctionDescriptor]

'firstTransaction' @ [183:47] ==> val firstTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`transaction saved twice in two DB transaction scopes`[LocalVariableDescriptor]

'assertTransactionIsRetrievable' @ [185:9] ==> private final fun assertTransactionIsRetrievable(transaction: SignedTransaction): Unit defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'firstTransaction' @ [185:40] ==> val firstTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`transaction saved twice in two DB transaction scopes`[LocalVariableDescriptor]

'database' @ [186:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [186:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?)): (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.IterableAssert<(net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>..org.assertj.core.api.IterableAssert<(net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>?)

'assertThat' @ [187:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableIterable<(SignedTransaction..SignedTransaction?)>..Iterable<(SignedTransaction..SignedTransaction?)>?)): (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> SignedTransaction

'transactionStorage' @ [187:24] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transactions' @ [187:43] ==> public final val transactions: Iterable<SignedTransaction> defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedPropertyDescriptor]

'containsOnly' @ [187:57] ==> @SafeVarargs public final fun containsOnly(vararg p0: (SignedTransaction..SignedTransaction?)): (IterableAssert<(SignedTransaction..SignedTransaction?)>..IterableAssert<(SignedTransaction..SignedTransaction?)>?) defined in org.assertj.core.api.IterableAssert[JavaMethodDescriptor]

'firstTransaction' @ [187:70] ==> val firstTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`transaction saved twice in two DB transaction scopes`[LocalVariableDescriptor]

'secondTransaction' @ [187:88] ==> val secondTransaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`transaction saved twice in two DB transaction scopes`[LocalVariableDescriptor]

'Test' @ [191:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'transactionStorage' @ [193:22] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'updates' @ [193:41] ==> public open val updates: Observable<SignedTransaction> defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedPropertyDescriptor]

'toFuture' @ [193:49] ==> public fun <T> Observable<SignedTransaction>.toFuture(): CordaFuture<SignedTransaction> defined in net.corda.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'newTransaction' @ [194:24] ==> private final fun newTransaction(): SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests[SimpleFunctionDescriptorImpl]

'database' @ [195:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [195:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Boolean): Boolean defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'transactionStorage' @ [196:13] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'addTransaction' @ [196:32] ==> public open fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedSimpleFunctionDescriptor]

'expected' @ [196:47] ==> val expected: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`updates are fired`[LocalVariableDescriptor]

'future' @ [198:22] ==> val future: CordaFuture<SignedTransaction> defined in net.corda.node.services.persistence.DBTransactionStorageTests.`updates are fired`[LocalVariableDescriptor]

'get' @ [198:29] ==> public abstract fun get(p0: Long, p1: (TimeUnit..TimeUnit?)): (SignedTransaction..SignedTransaction?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'SECONDS' @ [198:45] ==> enum entry SECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'assertEquals' @ [199:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (SignedTransaction..SignedTransaction?), actual: (SignedTransaction..SignedTransaction?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)

'expected' @ [199:22] ==> val expected: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.`updates are fired`[LocalVariableDescriptor]

'actual' @ [199:32] ==> val actual: (SignedTransaction..SignedTransaction?) defined in net.corda.node.services.persistence.DBTransactionStorageTests.`updates are fired`[LocalVariableDescriptor]

'database' @ [203:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [203:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'transactionStorage' @ [204:13] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'DBTransactionStorage' @ [204:34] ==> public constructor DBTransactionStorage() defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedClassConstructorDescriptor]

'database' @ [209:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'transaction' @ [209:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>): AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>?), (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)>

'assertThat' @ [210:13] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (SignedTransaction..SignedTransaction?)): (AbstractObjectAssert<*, (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<*, (SignedTransaction..SignedTransaction?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SignedTransaction

'transactionStorage' @ [210:24] ==> public final lateinit var transactionStorage: DBTransactionStorage defined in net.corda.node.services.persistence.DBTransactionStorageTests[PropertyDescriptorImpl]

'getTransaction' @ [210:43] ==> public open fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.node.services.persistence.DBTransactionStorage[DeserializedSimpleFunctionDescriptor]

'transaction' @ [210:58] ==> value-parameter transaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.assertTransactionIsRetrievable[ValueParameterDescriptorImpl]

'id' @ [210:70] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'isEqualTo' @ [210:75] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'transaction' @ [210:85] ==> value-parameter transaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.assertTransactionIsRetrievable[ValueParameterDescriptorImpl]

'WireTransaction' @ [215:19] ==> public constructor WireTransaction(inputs: List<StateRef>, attachments: List<SecureHash>, outputs: List<TransactionState<ContractState>>, commands: List<Command<*>>, notary: Party?, timeWindow: TimeWindow?, privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.WireTransaction[DeserializedClassConstructorDescriptor]

'listOf' @ [216:26] ==> public fun <T> listOf(element: StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'StateRef' @ [216:33] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'SecureHash' @ [216:42] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'randomSHA256' @ [216:53] ==> @JvmStatic public final fun randomSHA256(): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [217:31] ==> public fun <T> emptyList(): List<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'emptyList' @ [218:27] ==> public fun <T> emptyList(): List<TransactionState<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>

'listOf' @ [219:28] ==> public fun <T> listOf(element: Command<TypeOnlyCommandData>): List<Command<TypeOnlyCommandData>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<TypeOnlyCommandData>

'dummyCommand' @ [219:35] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'DUMMY_NOTARY' @ [220:26] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'SignedTransaction' @ [223:16] ==> public constructor SignedTransaction(ctx: CoreTransaction, sigs: List<TransactionSignature>) defined in net.corda.core.transactions.SignedTransaction[DeserializedClassConstructorDescriptor]

'wtx' @ [223:34] ==> val wtx: WireTransaction defined in net.corda.node.services.persistence.DBTransactionStorageTests.newTransaction[LocalVariableDescriptor]

'listOf' @ [223:39] ==> public fun <T> listOf(element: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'TransactionSignature' @ [223:46] ==> public constructor TransactionSignature(bytes: ByteArray, by: PublicKey, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.TransactionSignature[DeserializedClassConstructorDescriptor]

'ByteArray' @ [223:67] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'ALICE_PUBKEY' @ [223:81] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'SignatureMetadata' @ [223:95] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[DeserializedClassConstructorDescriptor]

'Crypto' @ [223:116] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [223:123] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [223:143] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'schemeNumberID' @ [223:157] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

