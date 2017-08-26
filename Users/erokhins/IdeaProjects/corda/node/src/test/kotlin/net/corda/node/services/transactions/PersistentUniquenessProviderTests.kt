'TestDependencyInjectionBase' @ [17:43] ==> public constructor TestDependencyInjectionBase() defined in net.corda.testing.TestDependencyInjectionBase[DeserializedClassConstructorDescriptor]

'MEGA_CORP' @ [18:20] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'SecureHash' @ [19:16] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'randomSHA256' @ [19:27] ==> @JvmStatic public final fun randomSHA256(): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'Before' @ [23:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'LogHelper' @ [25:9] ==> public object LogHelper defined in net.corda.testing[FakeCallableDescriptorForObject]

'setLevel' @ [25:19] ==> public final fun setLevel(vararg classes: KClass<*>): Unit defined in net.corda.testing.LogHelper[DeserializedSimpleFunctionDescriptor]

'PersistentUniquenessProvider' @ [25:28] ==> public companion object defined in net.corda.node.services.transactions.PersistentUniquenessProvider[FakeCallableDescriptorForObject]

'database' @ [26:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests[PropertyDescriptorImpl]

'configureDatabase' @ [26:20] ==> public fun configureDatabase(dataSourceProperties: Properties, databaseProperties: Properties?, createSchemaService: () -> SchemaService = ..., createIdentityService: () -> IdentityService): CordaPersistence defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'makeTestDataSourceProperties' @ [26:38] ==> public fun makeTestDataSourceProperties(nodeName: String = ...): Properties defined in net.corda.testing.node[DeserializedSimpleFunctionDescriptor]

'makeTestDatabaseProperties' @ [26:70] ==> public fun makeTestDatabaseProperties(key: String? = ..., value: String? = ...): Properties defined in net.corda.testing.node[DeserializedSimpleFunctionDescriptor]

'After' @ [29:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'database' @ [31:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests[PropertyDescriptorImpl]

'close' @ [31:18] ==> public open fun close(): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]

'LogHelper' @ [32:9] ==> public object LogHelper defined in net.corda.testing[FakeCallableDescriptorForObject]

'reset' @ [32:19] ==> public final fun reset(vararg classes: KClass<*>): Unit defined in net.corda.testing.LogHelper[DeserializedSimpleFunctionDescriptor]

'PersistentUniquenessProvider' @ [32:25] ==> public companion object defined in net.corda.node.services.transactions.PersistentUniquenessProvider[FakeCallableDescriptorForObject]

'Test' @ [35:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [36:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests[PropertyDescriptorImpl]

'transaction' @ [36:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'PersistentUniquenessProvider' @ [37:28] ==> public constructor PersistentUniquenessProvider() defined in net.corda.node.services.transactions.PersistentUniquenessProvider[DeserializedClassConstructorDescriptor]

'generateStateRef' @ [38:30] ==> public fun generateStateRef(): StateRef defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'provider' @ [40:13] ==> val provider: PersistentUniquenessProvider defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests.`should commit a transaction with unused inputs without exception`.<anonymous>[LocalVariableDescriptor]

'commit' @ [40:22] ==> public open fun commit(states: List<StateRef>, txId: SecureHash, callerIdentity: Party): Unit defined in net.corda.node.services.transactions.PersistentUniquenessProvider[DeserializedSimpleFunctionDescriptor]

'listOf' @ [40:29] ==> public fun <T> listOf(element: StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'inputState' @ [40:36] ==> val inputState: StateRef defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests.`should commit a transaction with unused inputs without exception`.<anonymous>[LocalVariableDescriptor]

'txID' @ [40:49] ==> public final val txID: SecureHash.SHA256 defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests[PropertyDescriptorImpl]

'identity' @ [40:55] ==> public final val identity: Party defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests[PropertyDescriptorImpl]

'Test' @ [44:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [45:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests[PropertyDescriptorImpl]

'transaction' @ [45:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'PersistentUniquenessProvider' @ [46:28] ==> public constructor PersistentUniquenessProvider() defined in net.corda.node.services.transactions.PersistentUniquenessProvider[DeserializedClassConstructorDescriptor]

'generateStateRef' @ [47:30] ==> public fun generateStateRef(): StateRef defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'listOf' @ [49:26] ==> public fun <T> listOf(element: StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'inputState' @ [49:33] ==> val inputState: StateRef defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests.`should report a conflict for a transaction with previously used inputs`.<anonymous>[LocalVariableDescriptor]

'provider' @ [50:13] ==> val provider: PersistentUniquenessProvider defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests.`should report a conflict for a transaction with previously used inputs`.<anonymous>[LocalVariableDescriptor]

'commit' @ [50:22] ==> public open fun commit(states: List<StateRef>, txId: SecureHash, callerIdentity: Party): Unit defined in net.corda.node.services.transactions.PersistentUniquenessProvider[DeserializedSimpleFunctionDescriptor]

'inputs' @ [50:29] ==> val inputs: List<StateRef> defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests.`should report a conflict for a transaction with previously used inputs`.<anonymous>[LocalVariableDescriptor]

'txID' @ [50:37] ==> public final val txID: SecureHash.SHA256 defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests[PropertyDescriptorImpl]

'identity' @ [50:43] ==> public final val identity: Party defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests[PropertyDescriptorImpl]

'assertFailsWith' @ [52:22] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): UniquenessException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> UniquenessException

'provider' @ [52:61] ==> val provider: PersistentUniquenessProvider defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests.`should report a conflict for a transaction with previously used inputs`.<anonymous>[LocalVariableDescriptor]

'commit' @ [52:70] ==> public open fun commit(states: List<StateRef>, txId: SecureHash, callerIdentity: Party): Unit defined in net.corda.node.services.transactions.PersistentUniquenessProvider[DeserializedSimpleFunctionDescriptor]

'inputs' @ [52:77] ==> val inputs: List<StateRef> defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests.`should report a conflict for a transaction with previously used inputs`.<anonymous>[LocalVariableDescriptor]

'txID' @ [52:85] ==> public final val txID: SecureHash.SHA256 defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests[PropertyDescriptorImpl]

'identity' @ [52:91] ==> public final val identity: Party defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests[PropertyDescriptorImpl]

'ex' @ [54:31] ==> val ex: UniquenessException defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests.`should report a conflict for a transaction with previously used inputs`.<anonymous>[LocalVariableDescriptor]

'error' @ [54:34] ==> public final val error: UniquenessProvider.Conflict defined in net.corda.core.node.services.UniquenessException[DeserializedPropertyDescriptor]

'stateHistory' @ [54:40] ==> public final val stateHistory: Map<StateRef, UniquenessProvider.ConsumingTx> defined in net.corda.core.node.services.UniquenessProvider.Conflict[DeserializedPropertyDescriptor]

'inputState' @ [54:53] ==> val inputState: StateRef defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests.`should report a conflict for a transaction with previously used inputs`.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [55:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: SecureHash, actual: SecureHash, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> SecureHash

'consumingTx' @ [55:26] ==> val consumingTx: UniquenessProvider.ConsumingTx defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests.`should report a conflict for a transaction with previously used inputs`.<anonymous>[LocalVariableDescriptor]

'id' @ [55:38] ==> public final val id: SecureHash defined in net.corda.core.node.services.UniquenessProvider.ConsumingTx[DeserializedPropertyDescriptor]

'txID' @ [55:42] ==> public final val txID: SecureHash.SHA256 defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests[PropertyDescriptorImpl]

'assertEquals' @ [56:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'consumingTx' @ [56:26] ==> val consumingTx: UniquenessProvider.ConsumingTx defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests.`should report a conflict for a transaction with previously used inputs`.<anonymous>[LocalVariableDescriptor]

'inputIndex' @ [56:38] ==> public final val inputIndex: Int defined in net.corda.core.node.services.UniquenessProvider.ConsumingTx[DeserializedPropertyDescriptor]

'inputs' @ [56:50] ==> val inputs: List<StateRef> defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests.`should report a conflict for a transaction with previously used inputs`.<anonymous>[LocalVariableDescriptor]

'indexOf' @ [56:57] ==> public abstract fun indexOf(element: StateRef): Int defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'inputState' @ [56:65] ==> val inputState: StateRef defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests.`should report a conflict for a transaction with previously used inputs`.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [57:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Party, actual: Party, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Party

'consumingTx' @ [57:26] ==> val consumingTx: UniquenessProvider.ConsumingTx defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests.`should report a conflict for a transaction with previously used inputs`.<anonymous>[LocalVariableDescriptor]

'requestingParty' @ [57:38] ==> public final val requestingParty: Party defined in net.corda.core.node.services.UniquenessProvider.ConsumingTx[DeserializedPropertyDescriptor]

'identity' @ [57:55] ==> public final val identity: Party defined in net.corda.node.services.transactions.PersistentUniquenessProviderTests[PropertyDescriptorImpl]

