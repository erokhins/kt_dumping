'mutableListOf' @ [21:23] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Checkpoint> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Checkpoint

'forEach' @ [22:5] ==> public abstract fun forEach(block: (Checkpoint) -> Boolean): Unit defined in net.corda.node.services.api.CheckpointStorage[DeserializedSimpleFunctionDescriptor]

'checkpoints' @ [23:9] ==> val checkpoints: MutableList<Checkpoint> defined in net.corda.node.services.persistence.checkpoints[LocalVariableDescriptor]

'it' @ [23:24] ==> value-parameter it: Checkpoint defined in net.corda.node.services.persistence.checkpoints.<anonymous>[ValueParameterDescriptorImpl]

'checkpoints' @ [26:12] ==> val checkpoints: MutableList<Checkpoint> defined in net.corda.node.services.persistence.checkpoints[LocalVariableDescriptor]

'TestDependencyInjectionBase' @ [29:34] ==> public constructor TestDependencyInjectionBase() defined in net.corda.testing.TestDependencyInjectionBase[DeserializedClassConstructorDescriptor]

'Before' @ [33:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'LogHelper' @ [35:9] ==> public object LogHelper defined in net.corda.testing[FakeCallableDescriptorForObject]

'setLevel' @ [35:19] ==> public final fun setLevel(vararg classes: KClass<*>): Unit defined in net.corda.testing.LogHelper[DeserializedSimpleFunctionDescriptor]

'PersistentUniquenessProvider' @ [35:28] ==> public companion object defined in net.corda.node.services.transactions.PersistentUniquenessProvider[FakeCallableDescriptorForObject]

'database' @ [36:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'configureDatabase' @ [36:20] ==> public fun configureDatabase(dataSourceProperties: Properties, databaseProperties: Properties?, createSchemaService: () -> SchemaService = ..., createIdentityService: () -> IdentityService): CordaPersistence defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'makeTestDataSourceProperties' @ [36:38] ==> public fun makeTestDataSourceProperties(nodeName: String = ...): Properties defined in net.corda.testing.node[DeserializedSimpleFunctionDescriptor]

'makeTestDatabaseProperties' @ [36:70] ==> public fun makeTestDatabaseProperties(key: String? = ..., value: String? = ...): Properties defined in net.corda.testing.node[DeserializedSimpleFunctionDescriptor]

'newCheckpointStorage' @ [37:9] ==> private final fun newCheckpointStorage(): Unit defined in net.corda.node.services.persistence.DBCheckpointStorageTests[SimpleFunctionDescriptorImpl]

'After' @ [40:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'database' @ [42:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'close' @ [42:18] ==> public open fun close(): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]

'LogHelper' @ [43:9] ==> public object LogHelper defined in net.corda.testing[FakeCallableDescriptorForObject]

'reset' @ [43:19] ==> public final fun reset(vararg classes: KClass<*>): Unit defined in net.corda.testing.LogHelper[DeserializedSimpleFunctionDescriptor]

'PersistentUniquenessProvider' @ [43:25] ==> public companion object defined in net.corda.node.services.transactions.PersistentUniquenessProvider[FakeCallableDescriptorForObject]

'Test' @ [46:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'newCheckpoint' @ [48:26] ==> private final fun newCheckpoint(): Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests[SimpleFunctionDescriptorImpl]

'database' @ [49:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'transaction' @ [49:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'checkpointStorage' @ [50:13] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'addCheckpoint' @ [50:31] ==> public open fun addCheckpoint(checkpoint: Checkpoint): Unit defined in net.corda.node.services.persistence.DBCheckpointStorage[DeserializedSimpleFunctionDescriptor]

'checkpoint' @ [50:45] ==> val checkpoint: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests.`add new checkpoint`[LocalVariableDescriptor]

'database' @ [52:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'transaction' @ [52:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>..org.assertj.core.api.ListAssert<(net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>?)

'assertThat' @ [53:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (Checkpoint..Checkpoint?)>..List<(Checkpoint..Checkpoint?)>?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Checkpoint

'checkpointStorage' @ [53:24] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'checkpoints' @ [53:42] ==> internal fun CheckpointStorage.checkpoints(): List<Checkpoint> defined in net.corda.node.services.persistence[SimpleFunctionDescriptorImpl]

'containsExactly' @ [53:57] ==> @SafeVarargs public final fun containsExactly(vararg p0: (Checkpoint..Checkpoint?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'checkpoint' @ [53:73] ==> val checkpoint: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests.`add new checkpoint`[LocalVariableDescriptor]

'newCheckpointStorage' @ [55:9] ==> private final fun newCheckpointStorage(): Unit defined in net.corda.node.services.persistence.DBCheckpointStorageTests[SimpleFunctionDescriptorImpl]

'database' @ [56:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'transaction' @ [56:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>..org.assertj.core.api.ListAssert<(net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>?)

'assertThat' @ [57:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (Checkpoint..Checkpoint?)>..List<(Checkpoint..Checkpoint?)>?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Checkpoint

'checkpointStorage' @ [57:24] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'checkpoints' @ [57:42] ==> internal fun CheckpointStorage.checkpoints(): List<Checkpoint> defined in net.corda.node.services.persistence[SimpleFunctionDescriptorImpl]

'containsExactly' @ [57:57] ==> @SafeVarargs public final fun containsExactly(vararg p0: (Checkpoint..Checkpoint?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'checkpoint' @ [57:73] ==> val checkpoint: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests.`add new checkpoint`[LocalVariableDescriptor]

'Test' @ [61:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'newCheckpoint' @ [63:26] ==> private final fun newCheckpoint(): Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests[SimpleFunctionDescriptorImpl]

'database' @ [64:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'transaction' @ [64:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'checkpointStorage' @ [65:13] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'addCheckpoint' @ [65:31] ==> public open fun addCheckpoint(checkpoint: Checkpoint): Unit defined in net.corda.node.services.persistence.DBCheckpointStorage[DeserializedSimpleFunctionDescriptor]

'checkpoint' @ [65:45] ==> val checkpoint: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests.`remove checkpoint`[LocalVariableDescriptor]

'database' @ [67:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'transaction' @ [67:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'checkpointStorage' @ [68:13] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'removeCheckpoint' @ [68:31] ==> public open fun removeCheckpoint(checkpoint: Checkpoint): Unit defined in net.corda.node.services.persistence.DBCheckpointStorage[DeserializedSimpleFunctionDescriptor]

'checkpoint' @ [68:48] ==> val checkpoint: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests.`remove checkpoint`[LocalVariableDescriptor]

'database' @ [70:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'transaction' @ [70:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertThat' @ [71:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (Checkpoint..Checkpoint?)>..List<(Checkpoint..Checkpoint?)>?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Checkpoint

'checkpointStorage' @ [71:24] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'checkpoints' @ [71:42] ==> internal fun CheckpointStorage.checkpoints(): List<Checkpoint> defined in net.corda.node.services.persistence[SimpleFunctionDescriptorImpl]

'isEmpty' @ [71:57] ==> public open fun isEmpty(): Unit defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'newCheckpointStorage' @ [73:9] ==> private final fun newCheckpointStorage(): Unit defined in net.corda.node.services.persistence.DBCheckpointStorageTests[SimpleFunctionDescriptorImpl]

'database' @ [74:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'transaction' @ [74:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertThat' @ [75:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (Checkpoint..Checkpoint?)>..List<(Checkpoint..Checkpoint?)>?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Checkpoint

'checkpointStorage' @ [75:24] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'checkpoints' @ [75:42] ==> internal fun CheckpointStorage.checkpoints(): List<Checkpoint> defined in net.corda.node.services.persistence[SimpleFunctionDescriptorImpl]

'isEmpty' @ [75:57] ==> public open fun isEmpty(): Unit defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [79:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'newCheckpoint' @ [81:26] ==> private final fun newCheckpoint(): Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests[SimpleFunctionDescriptorImpl]

'newCheckpoint' @ [82:27] ==> private final fun newCheckpoint(): Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests[SimpleFunctionDescriptorImpl]

'database' @ [83:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'transaction' @ [83:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'checkpointStorage' @ [84:13] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'addCheckpoint' @ [84:31] ==> public open fun addCheckpoint(checkpoint: Checkpoint): Unit defined in net.corda.node.services.persistence.DBCheckpointStorage[DeserializedSimpleFunctionDescriptor]

'checkpoint' @ [84:45] ==> val checkpoint: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests.`add and remove checkpoint in single commit operate`[LocalVariableDescriptor]

'checkpointStorage' @ [85:13] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'addCheckpoint' @ [85:31] ==> public open fun addCheckpoint(checkpoint: Checkpoint): Unit defined in net.corda.node.services.persistence.DBCheckpointStorage[DeserializedSimpleFunctionDescriptor]

'checkpoint2' @ [85:45] ==> val checkpoint2: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests.`add and remove checkpoint in single commit operate`[LocalVariableDescriptor]

'checkpointStorage' @ [86:13] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'removeCheckpoint' @ [86:31] ==> public open fun removeCheckpoint(checkpoint: Checkpoint): Unit defined in net.corda.node.services.persistence.DBCheckpointStorage[DeserializedSimpleFunctionDescriptor]

'checkpoint' @ [86:48] ==> val checkpoint: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests.`add and remove checkpoint in single commit operate`[LocalVariableDescriptor]

'database' @ [88:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'transaction' @ [88:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>..org.assertj.core.api.ListAssert<(net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>?)

'assertThat' @ [89:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (Checkpoint..Checkpoint?)>..List<(Checkpoint..Checkpoint?)>?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Checkpoint

'checkpointStorage' @ [89:24] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'checkpoints' @ [89:42] ==> internal fun CheckpointStorage.checkpoints(): List<Checkpoint> defined in net.corda.node.services.persistence[SimpleFunctionDescriptorImpl]

'containsExactly' @ [89:57] ==> @SafeVarargs public final fun containsExactly(vararg p0: (Checkpoint..Checkpoint?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'checkpoint2' @ [89:73] ==> val checkpoint2: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests.`add and remove checkpoint in single commit operate`[LocalVariableDescriptor]

'newCheckpointStorage' @ [91:9] ==> private final fun newCheckpointStorage(): Unit defined in net.corda.node.services.persistence.DBCheckpointStorageTests[SimpleFunctionDescriptorImpl]

'database' @ [92:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'transaction' @ [92:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>..org.assertj.core.api.ListAssert<(net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>?)

'assertThat' @ [93:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (Checkpoint..Checkpoint?)>..List<(Checkpoint..Checkpoint?)>?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Checkpoint

'checkpointStorage' @ [93:24] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'checkpoints' @ [93:42] ==> internal fun CheckpointStorage.checkpoints(): List<Checkpoint> defined in net.corda.node.services.persistence[SimpleFunctionDescriptorImpl]

'containsExactly' @ [93:57] ==> @SafeVarargs public final fun containsExactly(vararg p0: (Checkpoint..Checkpoint?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'checkpoint2' @ [93:73] ==> val checkpoint2: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests.`add and remove checkpoint in single commit operate`[LocalVariableDescriptor]

'Test' @ [97:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'newCheckpoint' @ [99:31] ==> private final fun newCheckpoint(): Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests[SimpleFunctionDescriptorImpl]

'database' @ [100:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'transaction' @ [100:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'checkpointStorage' @ [101:13] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'addCheckpoint' @ [101:31] ==> public open fun addCheckpoint(checkpoint: Checkpoint): Unit defined in net.corda.node.services.persistence.DBCheckpointStorage[DeserializedSimpleFunctionDescriptor]

'firstCheckpoint' @ [101:45] ==> val firstCheckpoint: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests.`add two checkpoints then remove first one`[LocalVariableDescriptor]

'newCheckpoint' @ [103:32] ==> private final fun newCheckpoint(): Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests[SimpleFunctionDescriptorImpl]

'database' @ [104:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'transaction' @ [104:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'checkpointStorage' @ [105:13] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'addCheckpoint' @ [105:31] ==> public open fun addCheckpoint(checkpoint: Checkpoint): Unit defined in net.corda.node.services.persistence.DBCheckpointStorage[DeserializedSimpleFunctionDescriptor]

'secondCheckpoint' @ [105:45] ==> val secondCheckpoint: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests.`add two checkpoints then remove first one`[LocalVariableDescriptor]

'database' @ [107:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'transaction' @ [107:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'checkpointStorage' @ [108:13] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'removeCheckpoint' @ [108:31] ==> public open fun removeCheckpoint(checkpoint: Checkpoint): Unit defined in net.corda.node.services.persistence.DBCheckpointStorage[DeserializedSimpleFunctionDescriptor]

'firstCheckpoint' @ [108:48] ==> val firstCheckpoint: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests.`add two checkpoints then remove first one`[LocalVariableDescriptor]

'database' @ [110:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'transaction' @ [110:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>..org.assertj.core.api.ListAssert<(net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>?)

'assertThat' @ [111:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (Checkpoint..Checkpoint?)>..List<(Checkpoint..Checkpoint?)>?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Checkpoint

'checkpointStorage' @ [111:24] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'checkpoints' @ [111:42] ==> internal fun CheckpointStorage.checkpoints(): List<Checkpoint> defined in net.corda.node.services.persistence[SimpleFunctionDescriptorImpl]

'containsExactly' @ [111:57] ==> @SafeVarargs public final fun containsExactly(vararg p0: (Checkpoint..Checkpoint?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'secondCheckpoint' @ [111:73] ==> val secondCheckpoint: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests.`add two checkpoints then remove first one`[LocalVariableDescriptor]

'newCheckpointStorage' @ [113:9] ==> private final fun newCheckpointStorage(): Unit defined in net.corda.node.services.persistence.DBCheckpointStorageTests[SimpleFunctionDescriptorImpl]

'database' @ [114:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'transaction' @ [114:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.assertj.core.api.ListAssert<(net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>..org.assertj.core.api.ListAssert<(net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>?)

'assertThat' @ [115:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (Checkpoint..Checkpoint?)>..List<(Checkpoint..Checkpoint?)>?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Checkpoint

'checkpointStorage' @ [115:24] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'checkpoints' @ [115:42] ==> internal fun CheckpointStorage.checkpoints(): List<Checkpoint> defined in net.corda.node.services.persistence[SimpleFunctionDescriptorImpl]

'containsExactly' @ [115:57] ==> @SafeVarargs public final fun containsExactly(vararg p0: (Checkpoint..Checkpoint?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'secondCheckpoint' @ [115:73] ==> val secondCheckpoint: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests.`add two checkpoints then remove first one`[LocalVariableDescriptor]

'Test' @ [119:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'newCheckpoint' @ [121:34] ==> private final fun newCheckpoint(): Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests[SimpleFunctionDescriptorImpl]

'database' @ [122:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'transaction' @ [122:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'checkpointStorage' @ [123:13] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'addCheckpoint' @ [123:31] ==> public open fun addCheckpoint(checkpoint: Checkpoint): Unit defined in net.corda.node.services.persistence.DBCheckpointStorage[DeserializedSimpleFunctionDescriptor]

'originalCheckpoint' @ [123:45] ==> val originalCheckpoint: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests.`add checkpoint and then remove after 'restart'`[LocalVariableDescriptor]

'newCheckpointStorage' @ [125:9] ==> private final fun newCheckpointStorage(): Unit defined in net.corda.node.services.persistence.DBCheckpointStorageTests[SimpleFunctionDescriptorImpl]

'database' @ [126:39] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'transaction' @ [126:48] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Checkpoint): Checkpoint defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Checkpoint

'checkpointStorage' @ [127:13] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'checkpoints' @ [127:31] ==> internal fun CheckpointStorage.checkpoints(): List<Checkpoint> defined in net.corda.node.services.persistence[SimpleFunctionDescriptorImpl]

'single' @ [127:45] ==> public fun <T> List<Checkpoint>.single(): Checkpoint defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Checkpoint

'database' @ [129:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'transaction' @ [129:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>): AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>..org.assertj.core.api.AbstractObjectAssert<out (org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractObjectAssert<out kotlin.Any?, out kotlin.Any?>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>?), (net.corda.node.services.api.Checkpoint..net.corda.node.services.api.Checkpoint?)>

'assertThat' @ [130:13] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (Checkpoint..Checkpoint?)): (AbstractObjectAssert<*, (Checkpoint..Checkpoint?)>..AbstractObjectAssert<*, (Checkpoint..Checkpoint?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Checkpoint

'reconstructedCheckpoint' @ [130:24] ==> val reconstructedCheckpoint: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests.`add checkpoint and then remove after 'restart'`[LocalVariableDescriptor]

'isEqualTo' @ [130:49] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'originalCheckpoint' @ [130:59] ==> val originalCheckpoint: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests.`add checkpoint and then remove after 'restart'`[LocalVariableDescriptor]

'isNotSameAs' @ [130:79] ==> public open fun isNotSameAs(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?), (Checkpoint..Checkpoint?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'originalCheckpoint' @ [130:91] ==> val originalCheckpoint: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests.`add checkpoint and then remove after 'restart'`[LocalVariableDescriptor]

'database' @ [132:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'transaction' @ [132:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'checkpointStorage' @ [133:13] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'removeCheckpoint' @ [133:31] ==> public open fun removeCheckpoint(checkpoint: Checkpoint): Unit defined in net.corda.node.services.persistence.DBCheckpointStorage[DeserializedSimpleFunctionDescriptor]

'reconstructedCheckpoint' @ [133:48] ==> val reconstructedCheckpoint: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorageTests.`add checkpoint and then remove after 'restart'`[LocalVariableDescriptor]

'database' @ [135:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'transaction' @ [135:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertThat' @ [136:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (Checkpoint..Checkpoint?)>..List<(Checkpoint..Checkpoint?)>?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Checkpoint

'checkpointStorage' @ [136:24] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'checkpoints' @ [136:42] ==> internal fun CheckpointStorage.checkpoints(): List<Checkpoint> defined in net.corda.node.services.persistence[SimpleFunctionDescriptorImpl]

'isEmpty' @ [136:57] ==> public open fun isEmpty(): Unit defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'database' @ [141:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'transaction' @ [141:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'checkpointStorage' @ [142:13] ==> public final lateinit var checkpointStorage: DBCheckpointStorage defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

'DBCheckpointStorage' @ [142:33] ==> public constructor DBCheckpointStorage() defined in net.corda.node.services.persistence.DBCheckpointStorage[DeserializedClassConstructorDescriptor]

'Checkpoint' @ [147:35] ==> public constructor Checkpoint(serializedFiber: SerializedBytes<FlowStateMachineImpl<*>>) defined in net.corda.node.services.api.Checkpoint[DeserializedClassConstructorDescriptor]

'SerializedBytes' @ [147:46] ==> public constructor SerializedBytes<T : Any>(bytes: ByteArray) defined in net.corda.core.serialization.SerializedBytes[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> FlowStateMachineImpl<*>

'toByteArray' @ [147:67] ==> public open fun toByteArray(p0: Int): (ByteArray..ByteArray?) defined in com.google.common.primitives.Ints[JavaMethodDescriptor]

'checkpointCount' @ [147:79] ==> private final var checkpointCount: Int defined in net.corda.node.services.persistence.DBCheckpointStorageTests[PropertyDescriptorImpl]

