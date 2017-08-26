'parserTransactionIsolationLevel' @ [28:37] ==> public fun parserTransactionIsolationLevel(property: String?): Int defined in net.corda.node.utilities in file CordaPersistence.kt[SimpleFunctionDescriptorImpl]

'databaseProperties' @ [28:69] ==> value-parameter databaseProperties: Properties defined in net.corda.node.utilities.CordaPersistence.<init>[ValueParameterDescriptorImpl]

'getProperty' @ [28:88] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.util.Properties[JavaMethodDescriptor]

'lazy' @ [30:51] ==> public fun <T> lazy(initializer: () -> HibernateConfiguration): Lazy<HibernateConfiguration> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HibernateConfiguration

'transaction' @ [31:9] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> HibernateConfiguration): HibernateConfiguration defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> HibernateConfiguration

'HibernateConfiguration' @ [32:13] ==> public constructor HibernateConfiguration(createSchemaService: () -> SchemaService, databaseProperties: Properties, createIdentityScervice: () -> IdentityService) defined in net.corda.node.services.database.HibernateConfiguration[ClassConstructorDescriptorImpl]

'createSchemaService' @ [32:36] ==> private final var createSchemaService: () -> SchemaService defined in net.corda.node.utilities.CordaPersistence[PropertyDescriptorImpl]

'databaseProperties' @ [32:57] ==> value-parameter databaseProperties: Properties defined in net.corda.node.utilities.CordaPersistence.<init>[ValueParameterDescriptorImpl]

'createIdentityService' @ [32:77] ==> private final val createIdentityService: () -> IdentityService defined in net.corda.node.utilities.CordaPersistence[PropertyDescriptorImpl]

'lazy' @ [36:49] ==> public fun <T> lazy(initializer: () -> SessionFactory): Lazy<SessionFactory> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SessionFactory

'transaction' @ [37:9] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SessionFactory): SessionFactory defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> SessionFactory

'hibernateConfig' @ [38:13] ==> public final val hibernateConfig: HibernateConfiguration defined in net.corda.node.utilities.CordaPersistence[PropertyDescriptorImpl]

'sessionFactoryForRegisteredSchemas' @ [38:29] ==> public final fun sessionFactoryForRegisteredSchemas(): SessionFactory defined in net.corda.node.services.database.HibernateConfiguration[SimpleFunctionDescriptorImpl]

'CordaPersistence' @ [44:20] ==> public constructor CordaPersistence(dataSource: HikariDataSource, createSchemaService: () -> SchemaService, createIdentityService: () -> IdentityService, databaseProperties: Properties) defined in net.corda.node.utilities.CordaPersistence[ClassConstructorDescriptorImpl]

'dataSource' @ [44:37] ==> value-parameter dataSource: HikariDataSource defined in net.corda.node.utilities.CordaPersistence.Companion.connect[ValueParameterDescriptorImpl]

'createSchemaService' @ [44:49] ==> value-parameter createSchemaService: () -> SchemaService defined in net.corda.node.utilities.CordaPersistence.Companion.connect[ValueParameterDescriptorImpl]

'createIdentityService' @ [44:70] ==> value-parameter createIdentityService: () -> IdentityService defined in net.corda.node.utilities.CordaPersistence.Companion.connect[ValueParameterDescriptorImpl]

'databaseProperties' @ [44:93] ==> value-parameter databaseProperties: Properties defined in net.corda.node.utilities.CordaPersistence.Companion.connect[ValueParameterDescriptorImpl]

'apply' @ [44:113] ==> @InlineOnly public inline fun <T> CordaPersistence.apply(block: CordaPersistence.() -> Unit): CordaPersistence defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaPersistence

'DatabaseTransactionManager' @ [45:17] ==> public constructor DatabaseTransactionManager(initDataSource: CordaPersistence) defined in net.corda.node.utilities.DatabaseTransactionManager[ClassConstructorDescriptorImpl]

'this' @ [45:44] ==> <this> defined in net.corda.node.utilities.CordaPersistence.Companion.connect.<anonymous>[ReceiverParameterDescriptorImpl]

'DatabaseTransactionManager' @ [52:9] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'dataSource' @ [52:36] ==> public final var dataSource: CordaPersistence defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'this' @ [52:49] ==> <this> defined in net.corda.node.utilities.CordaPersistence[LazyClassReceiverParameterDescriptor]

'DatabaseTransactionManager' @ [53:16] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'currentOrNew' @ [53:43] ==> public final fun currentOrNew(isolation: Int = ...): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'transactionIsolationLevel' @ [53:56] ==> public final var transactionIsolationLevel: Int defined in net.corda.node.utilities.CordaPersistence[PropertyDescriptorImpl]

'DatabaseTransactionManager' @ [58:9] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'dataSource' @ [58:36] ==> public final var dataSource: CordaPersistence defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'this' @ [58:49] ==> <this> defined in net.corda.node.utilities.CordaPersistence[LazyClassReceiverParameterDescriptor]

'DatabaseTransactionManager' @ [59:19] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'currentOrNull' @ [59:46] ==> public final fun currentOrNull(): DatabaseTransaction? defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'ctx' @ [60:16] ==> val ctx: DatabaseTransaction? defined in net.corda.node.utilities.CordaPersistence.createSession[LocalVariableDescriptor]

'connection' @ [60:21] ==> public final val connection: Connection defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'IllegalStateException' @ [60:41] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'DatabaseTransactionManager' @ [64:9] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'dataSource' @ [64:36] ==> public final var dataSource: CordaPersistence defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'this' @ [64:49] ==> <this> defined in net.corda.node.utilities.CordaPersistence[LazyClassReceiverParameterDescriptor]

'transaction' @ [65:16] ==> private final fun <T> transaction(transactionIsolation: Int, repetitionAttempts: Int, statement: DatabaseTransaction.() -> T): T defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'transactionIsolationLevel' @ [65:28] ==> public final var transactionIsolationLevel: Int defined in net.corda.node.utilities.CordaPersistence[PropertyDescriptorImpl]

'statement' @ [65:58] ==> value-parameter statement: DatabaseTransaction.() -> T defined in net.corda.node.utilities.CordaPersistence.transaction[ValueParameterDescriptorImpl]

'DatabaseTransactionManager' @ [69:21] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'currentOrNull' @ [69:48] ==> public final fun currentOrNull(): DatabaseTransaction? defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'if (outer != null) {
            outer.statement()
        }
        else {
            inTopLevelTransaction(transactionIsolation, repetitionAttempts, statement)
        }' @ [71:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T, elseBranch: T): T[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T

'outer' @ [71:20] ==> val outer: DatabaseTransaction? defined in net.corda.node.utilities.CordaPersistence.transaction[LocalVariableDescriptor]

'outer' @ [72:13] ==> val outer: DatabaseTransaction? defined in net.corda.node.utilities.CordaPersistence.transaction[LocalVariableDescriptor]

'invoke' @ [72:19] ==> public abstract operator fun DatabaseTransaction.invoke(): T defined in kotlin.Function1[FunctionInvokeDescriptor]

'inTopLevelTransaction' @ [75:13] ==> private final fun <T> inTopLevelTransaction(transactionIsolation: Int, repetitionAttempts: Int, statement: DatabaseTransaction.() -> T): T defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'transactionIsolation' @ [75:35] ==> value-parameter transactionIsolation: Int defined in net.corda.node.utilities.CordaPersistence.transaction[ValueParameterDescriptorImpl]

'repetitionAttempts' @ [75:57] ==> value-parameter repetitionAttempts: Int defined in net.corda.node.utilities.CordaPersistence.transaction[ValueParameterDescriptorImpl]

'statement' @ [75:77] ==> value-parameter statement: DatabaseTransaction.() -> T defined in net.corda.node.utilities.CordaPersistence.transaction[ValueParameterDescriptorImpl]

'DatabaseTransactionManager' @ [82:31] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'currentOrNew' @ [82:58] ==> public final fun currentOrNew(isolation: Int = ...): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'transactionIsolation' @ [82:71] ==> value-parameter transactionIsolation: Int defined in net.corda.node.utilities.CordaPersistence.inTopLevelTransaction[ValueParameterDescriptorImpl]

'transaction' @ [84:30] ==> val transaction: DatabaseTransaction defined in net.corda.node.utilities.CordaPersistence.inTopLevelTransaction[LocalVariableDescriptor]

'invoke' @ [84:42] ==> public abstract operator fun DatabaseTransaction.invoke(): T defined in kotlin.Function1[FunctionInvokeDescriptor]

'transaction' @ [85:17] ==> val transaction: DatabaseTransaction defined in net.corda.node.utilities.CordaPersistence.inTopLevelTransaction[LocalVariableDescriptor]

'commit' @ [85:29] ==> public final fun commit(): Unit defined in net.corda.node.utilities.DatabaseTransaction[SimpleFunctionDescriptorImpl]

'answer' @ [86:24] ==> val answer: T defined in net.corda.node.utilities.CordaPersistence.inTopLevelTransaction[LocalVariableDescriptor]

'transaction' @ [89:17] ==> val transaction: DatabaseTransaction defined in net.corda.node.utilities.CordaPersistence.inTopLevelTransaction[LocalVariableDescriptor]

'rollback' @ [89:29] ==> public final fun rollback(): Unit defined in net.corda.node.utilities.DatabaseTransaction[SimpleFunctionDescriptorImpl]

'repetitions' @ [90:17] ==> var repetitions: Int defined in net.corda.node.utilities.CordaPersistence.inTopLevelTransaction[LocalVariableDescriptor]

'repetitions' @ [91:21] ==> var repetitions: Int defined in net.corda.node.utilities.CordaPersistence.inTopLevelTransaction[LocalVariableDescriptor]

'repetitionAttempts' @ [91:36] ==> value-parameter repetitionAttempts: Int defined in net.corda.node.utilities.CordaPersistence.inTopLevelTransaction[ValueParameterDescriptorImpl]

'e' @ [92:27] ==> val e: SQLException defined in net.corda.node.utilities.CordaPersistence.inTopLevelTransaction[LocalVariableDescriptor]

'transaction' @ [96:17] ==> val transaction: DatabaseTransaction defined in net.corda.node.utilities.CordaPersistence.inTopLevelTransaction[LocalVariableDescriptor]

'rollback' @ [96:29] ==> public final fun rollback(): Unit defined in net.corda.node.utilities.DatabaseTransaction[SimpleFunctionDescriptorImpl]

'e' @ [97:23] ==> val e: Throwable defined in net.corda.node.utilities.CordaPersistence.inTopLevelTransaction[LocalVariableDescriptor]

'transaction' @ [100:17] ==> val transaction: DatabaseTransaction defined in net.corda.node.utilities.CordaPersistence.inTopLevelTransaction[LocalVariableDescriptor]

'close' @ [100:29] ==> public final fun close(): Unit defined in net.corda.node.utilities.DatabaseTransaction[SimpleFunctionDescriptorImpl]

'dataSource' @ [106:9] ==> public final var dataSource: HikariDataSource defined in net.corda.node.utilities.CordaPersistence[PropertyDescriptorImpl]

'close' @ [106:20] ==> public open fun close(): Unit defined in com.zaxxer.hikari.HikariDataSource[JavaMethodDescriptor]

'NodeSchemaService' @ [110:135] ==> public constructor NodeSchemaService(customSchemas: Set<MappedSchema> = ...) defined in net.corda.node.services.schema.NodeSchemaService[ClassConstructorDescriptorImpl]

'HikariConfig' @ [111:18] ==> public constructor HikariConfig(p0: (Properties..Properties?)) defined in com.zaxxer.hikari.HikariConfig[JavaClassConstructorDescriptor]

'dataSourceProperties' @ [111:31] ==> value-parameter dataSourceProperties: Properties defined in net.corda.node.utilities.configureDatabase[ValueParameterDescriptorImpl]

'HikariDataSource' @ [112:22] ==> public constructor HikariDataSource(p0: (HikariConfig..HikariConfig?)) defined in com.zaxxer.hikari.HikariDataSource[JavaClassConstructorDescriptor]

'config' @ [112:39] ==> val config: HikariConfig defined in net.corda.node.utilities.configureDatabase[LocalVariableDescriptor]

'CordaPersistence' @ [113:23] ==> public companion object defined in net.corda.node.utilities.CordaPersistence[FakeCallableDescriptorForObject]

'connect' @ [113:40] ==> public final fun connect(dataSource: HikariDataSource, createSchemaService: () -> SchemaService, createIdentityService: () -> IdentityService, databaseProperties: Properties): CordaPersistence defined in net.corda.node.utilities.CordaPersistence.Companion[SimpleFunctionDescriptorImpl]

'dataSource' @ [113:48] ==> val dataSource: HikariDataSource defined in net.corda.node.utilities.configureDatabase[LocalVariableDescriptor]

'createSchemaService' @ [113:60] ==> value-parameter createSchemaService: () -> SchemaService = ... defined in net.corda.node.utilities.configureDatabase[ValueParameterDescriptorImpl]

'createIdentityService' @ [113:81] ==> value-parameter createIdentityService: () -> IdentityService defined in net.corda.node.utilities.configureDatabase[ValueParameterDescriptorImpl]

'databaseProperties' @ [113:104] ==> value-parameter databaseProperties: Properties? defined in net.corda.node.utilities.configureDatabase[ValueParameterDescriptorImpl]

'Properties' @ [113:126] ==> public constructor Properties() defined in java.util.Properties[JavaClassConstructorDescriptor]

'persistence' @ [116:5] ==> val persistence: CordaPersistence defined in net.corda.node.utilities.configureDatabase[LocalVariableDescriptor]

'transaction' @ [116:17] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'persistence' @ [117:9] ==> val persistence: CordaPersistence defined in net.corda.node.utilities.configureDatabase[LocalVariableDescriptor]

'dataSource' @ [117:21] ==> public final var dataSource: HikariDataSource defined in net.corda.node.utilities.CordaPersistence[PropertyDescriptorImpl]

'connection' @ [117:32] ==> public final val HikariDataSource.connection: (Connection..Connection?)[MyPropertyDescriptor]

'use' @ [117:43] ==> @SinceKotlin @InlineOnly public inline fun <T : AutoCloseable?, R> (Connection..Connection?).use(block: ((Connection..Connection?)) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : AutoCloseable?> -> (java.sql.Connection..java.sql.Connection?)
    <R> -> Unit

'check' @ [118:13] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [118:19] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [118:20] ==> value-parameter it: (Connection..Connection?) defined in net.corda.node.utilities.configureDatabase.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'metaData' @ [118:23] ==> public final val Connection.metaData: (DatabaseMetaData..DatabaseMetaData?)[MyPropertyDescriptor]

'isReadOnly' @ [118:32] ==> public final val DatabaseMetaData.isReadOnly: Boolean[MyPropertyDescriptor]

'persistence' @ [121:12] ==> val persistence: CordaPersistence defined in net.corda.node.utilities.configureDatabase[LocalVariableDescriptor]

'DatabaseTransactionManager' @ [134:23] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'transactionId' @ [134:50] ==> public final val transactionId: UUID defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'DatabaseTransactionManager' @ [135:79] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'transactionBoundaries' @ [135:106] ==> public final val transactionBoundaries: Subject<DatabaseTransactionManager.Boundary, DatabaseTransactionManager.Boundary> defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'filter' @ [135:128] ==> public final fun filter(p0: (((DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?)) -> (Boolean..Boolean?)..(((DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?)) -> (Boolean..Boolean?))?)): (Observable<(DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?)>..Observable<(DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?)>?) defined in rx.subjects.Subject[MyFunctionDescriptor]

'it' @ [135:137] ==> value-parameter it: (DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?) defined in net.corda.node.utilities.bufferUntilDatabaseCommit.<anonymous>[ValueParameterDescriptorImpl]

'txId' @ [135:140] ==> public final val txId: UUID defined in net.corda.node.utilities.DatabaseTransactionManager.Boundary[PropertyDescriptorImpl]

'currentTxId' @ [135:148] ==> val currentTxId: UUID defined in net.corda.node.utilities.bufferUntilDatabaseCommit[LocalVariableDescriptor]

'first' @ [135:162] ==> public final fun first(): (Observable<(DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?)>..Observable<(DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?)>?) defined in rx.Observable[JavaMethodDescriptor]

'create' @ [136:34] ==> public open fun <T : (Any..Any?)> create(): (UnicastSubject<(T..T?)>..UnicastSubject<(T..T?)>?) defined in rx.subjects.UnicastSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'subject' @ [137:5] ==> val subject: (UnicastSubject<(T..T?)>..UnicastSubject<(T..T?)>?) defined in net.corda.node.utilities.bufferUntilDatabaseCommit[LocalVariableDescriptor]

'delaySubscription' @ [137:13] ==> @Beta public final fun <U : (Any..Any?)> delaySubscription(p0: (Observable<(DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?)>..Observable<(DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?)>?)): (Observable<(T..T?)>..Observable<(T..T?)>?) defined in rx.subjects.UnicastSubject[JavaMethodDescriptor]
Inferred types:
    <U : (Any..Any?)> -> Boundary

'databaseTxBoundary' @ [137:31] ==> val databaseTxBoundary: Observable<DatabaseTransactionManager.Boundary> defined in net.corda.node.utilities.bufferUntilDatabaseCommit[LocalVariableDescriptor]

'subscribe' @ [137:51] ==> public final fun subscribe(p0: (Observer<in (T..T?)>..Observer<in (T..T?)>?)): (Subscription..Subscription?) defined in rx.Observable[JavaMethodDescriptor]

'this' @ [137:61] ==> <this> defined in net.corda.node.utilities.bufferUntilDatabaseCommit[ReceiverParameterDescriptorImpl]

'databaseTxBoundary' @ [138:5] ==> val databaseTxBoundary: Observable<DatabaseTransactionManager.Boundary> defined in net.corda.node.utilities.bufferUntilDatabaseCommit[LocalVariableDescriptor]

'doOnCompleted' @ [138:24] ==> public final fun doOnCompleted(p0: (() -> Unit..(() -> Unit)?)): (Observable<(DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?)>..Observable<(DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?)>?) defined in rx.Observable[MyFunctionDescriptor]

'subject' @ [138:40] ==> val subject: (UnicastSubject<(T..T?)>..UnicastSubject<(T..T?)>?) defined in net.corda.node.utilities.bufferUntilDatabaseCommit[LocalVariableDescriptor]

'onCompleted' @ [138:48] ==> public open fun onCompleted(): Unit defined in rx.subjects.UnicastSubject[JavaMethodDescriptor]

'subject' @ [139:12] ==> val subject: (UnicastSubject<(T..T?)>..UnicastSubject<(T..T?)>?) defined in net.corda.node.utilities.bufferUntilDatabaseCommit[LocalVariableDescriptor]

'Subscriber<U>' @ [143:85] ==> protected/*protected and package*/ constructor Subscriber<T : (Any..Any?)>() defined in rx.Subscriber[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> U

'CopyOnWriteArrayList' @ [145:21] ==> public constructor CopyOnWriteArrayList<E : (Any..Any?)>() defined in java.util.concurrent.CopyOnWriteArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Subscriber<in U>

'db' @ [148:10] ==> public final val db: CordaPersistence? defined in net.corda.node.utilities.DatabaseTransactionWrappingSubscriber[PropertyDescriptorImpl]

'DatabaseTransactionManager' @ [148:16] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'dataSource' @ [148:43] ==> public final var dataSource: CordaPersistence defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'transaction' @ [148:55] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'delegates' @ [149:13] ==> public final val delegates: CopyOnWriteArrayList<Subscriber<in U>> defined in net.corda.node.utilities.DatabaseTransactionWrappingSubscriber[PropertyDescriptorImpl]

'filter' @ [149:23] ==> public inline fun <T> Iterable<(Subscriber<in U>..Subscriber<in U>?)>.filter(predicate: ((Subscriber<in U>..Subscriber<in U>?)) -> Boolean): List<(Subscriber<in U>..Subscriber<in U>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (rx.Subscriber<in U>..rx.Subscriber<in U>?)

'!' @ [149:32] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [149:33] ==> value-parameter it: (Subscriber<in U>..Subscriber<in U>?) defined in net.corda.node.utilities.DatabaseTransactionWrappingSubscriber.forEachSubscriberWithDbTx.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isUnsubscribed' @ [149:36] ==> public final val <T : (Any..Any?)> Subscriber<in U>.isUnsubscribed: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'forEach' @ [149:53] ==> @HidesMembers public inline fun <T> Iterable<(Subscriber<in U>..Subscriber<in U>?)>.forEach(action: ((Subscriber<in U>..Subscriber<in U>?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (rx.Subscriber<in U>..rx.Subscriber<in U>?)

'it' @ [150:17] ==> value-parameter it: (Subscriber<in U>..Subscriber<in U>?) defined in net.corda.node.utilities.DatabaseTransactionWrappingSubscriber.forEachSubscriberWithDbTx.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [150:20] ==> public abstract operator fun Subscriber<in U>.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'forEachSubscriberWithDbTx' @ [155:34] ==> public final fun forEachSubscriberWithDbTx(block: Subscriber<in U>.() -> Unit): Unit defined in net.corda.node.utilities.DatabaseTransactionWrappingSubscriber[SimpleFunctionDescriptorImpl]

'onCompleted' @ [155:62] ==> public abstract fun onCompleted(): Unit defined in rx.Subscriber[JavaMethodDescriptor]

'forEachSubscriberWithDbTx' @ [157:43] ==> public final fun forEachSubscriberWithDbTx(block: Subscriber<in U>.() -> Unit): Unit defined in net.corda.node.utilities.DatabaseTransactionWrappingSubscriber[SimpleFunctionDescriptorImpl]

'onError' @ [157:71] ==> public abstract fun onError(p0: (Throwable..Throwable?)): Unit defined in rx.Subscriber[JavaMethodDescriptor]

'e' @ [157:79] ==> value-parameter e: Throwable? defined in net.corda.node.utilities.DatabaseTransactionWrappingSubscriber.onError[ValueParameterDescriptorImpl]

'forEachSubscriberWithDbTx' @ [159:33] ==> public final fun forEachSubscriberWithDbTx(block: Subscriber<in U>.() -> Unit): Unit defined in net.corda.node.utilities.DatabaseTransactionWrappingSubscriber[SimpleFunctionDescriptorImpl]

'onNext' @ [159:61] ==> public abstract fun onNext(p0: (U..U?)): Unit defined in rx.Subscriber[JavaMethodDescriptor]

's' @ [159:68] ==> value-parameter s: U defined in net.corda.node.utilities.DatabaseTransactionWrappingSubscriber.onNext[ValueParameterDescriptorImpl]

'forEachSubscriberWithDbTx' @ [161:30] ==> public final fun forEachSubscriberWithDbTx(block: Subscriber<in U>.() -> Unit): Unit defined in net.corda.node.utilities.DatabaseTransactionWrappingSubscriber[SimpleFunctionDescriptorImpl]

'onStart' @ [161:58] ==> public open fun onStart(): Unit defined in rx.Subscriber[JavaMethodDescriptor]

'delegates' @ [164:13] ==> public final val delegates: CopyOnWriteArrayList<Subscriber<in U>> defined in net.corda.node.utilities.DatabaseTransactionWrappingSubscriber[PropertyDescriptorImpl]

'removeIf' @ [164:23] ==> public final fun removeIf(p0: ((Subscriber<in U>..Subscriber<in U>?)) -> Boolean): Boolean defined in java.util.concurrent.CopyOnWriteArrayList[MyFunctionDescriptor]

'it' @ [164:34] ==> value-parameter it: (Subscriber<in U>..Subscriber<in U>?) defined in net.corda.node.utilities.DatabaseTransactionWrappingSubscriber.cleanUp.<anonymous>[ValueParameterDescriptorImpl]

'isUnsubscribed' @ [164:37] ==> public final val <T : (Any..Any?)> Subscriber<in U>.isUnsubscribed: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'delegates' @ [165:17] ==> public final val delegates: CopyOnWriteArrayList<Subscriber<in U>> defined in net.corda.node.utilities.DatabaseTransactionWrappingSubscriber[PropertyDescriptorImpl]

'isEmpty' @ [165:27] ==> public open fun isEmpty(): Boolean defined in java.util.concurrent.CopyOnWriteArrayList[JavaMethodDescriptor]

'unsubscribe' @ [166:17] ==> public final fun unsubscribe(): Unit defined in net.corda.node.utilities.DatabaseTransactionWrappingSubscriber[JavaMethodDescriptor]

'Subscriber<U>' @ [173:55] ==> protected/*protected and package*/ constructor Subscriber<T : (Any..Any?)>(p0: (Subscriber<*>..Subscriber<*>?)) defined in rx.Subscriber[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> U

't' @ [173:69] ==> value-parameter t: Subscriber<in U> defined in net.corda.node.utilities.NoOpSubscriber.<init>[ValueParameterDescriptorImpl]

'DatabaseTransactionWrappingSubscriber' @ [190:30] ==> public constructor DatabaseTransactionWrappingSubscriber<U>(db: CordaPersistence?) defined in net.corda.node.utilities.DatabaseTransactionWrappingSubscriber[ClassConstructorDescriptorImpl]
Inferred types:
    <U> -> T

'db' @ [190:71] ==> value-parameter db: CordaPersistence? = ... defined in net.corda.node.utilities.wrapWithDatabaseTransaction[ValueParameterDescriptorImpl]

'this' @ [193:12] ==> <this> defined in net.corda.node.utilities.wrapWithDatabaseTransaction[ReceiverParameterDescriptorImpl]

'lift' @ [193:17] ==> public final fun <R : (Any..Any?)> lift(p0: (((Subscriber<in (T..T?)>..Subscriber<in (T..T?)>?)) -> (Subscriber<in (T..T?)>..Subscriber<in (T..T?)>?)..(((Subscriber<in (T..T?)>..Subscriber<in (T..T?)>?)) -> (Subscriber<in (T..T?)>..Subscriber<in (T..T?)>?))?)): (Observable<(T..T?)>..Observable<(T..T?)>?) defined in rx.Observable[MyFunctionDescriptor]
Inferred types:
    <R : (Any..Any?)> -> T

'wrappingSubscriber' @ [195:9] ==> var wrappingSubscriber: DatabaseTransactionWrappingSubscriber<T> defined in net.corda.node.utilities.wrapWithDatabaseTransaction[LocalVariableDescriptor]

'delegates' @ [195:28] ==> public final val delegates: CopyOnWriteArrayList<Subscriber<in T>> defined in net.corda.node.utilities.DatabaseTransactionWrappingSubscriber[PropertyDescriptorImpl]

'add' @ [195:38] ==> public open fun add(element: (Subscriber<in T>..Subscriber<in T>?)): Boolean defined in java.util.concurrent.CopyOnWriteArrayList[JavaMethodDescriptor]

'toBeWrappedInDbTx' @ [195:42] ==> value-parameter toBeWrappedInDbTx: Subscriber<in T> defined in net.corda.node.utilities.wrapWithDatabaseTransaction.<anonymous>[ValueParameterDescriptorImpl]

'if (wrappingSubscriber.delegates.size == 1) wrappingSubscriber else NoOpSubscriber(toBeWrappedInDbTx)' @ [197:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Subscriber<in (T..T?)>..Subscriber<in (T..T?)>?), elseBranch: (Subscriber<in (T..T?)>..Subscriber<in (T..T?)>?)): (Subscriber<in (T..T?)>..Subscriber<in (T..T?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (rx.Subscriber<in (T..T?)>..rx.Subscriber<in (T..T?)>?)

'wrappingSubscriber' @ [197:13] ==> var wrappingSubscriber: DatabaseTransactionWrappingSubscriber<T> defined in net.corda.node.utilities.wrapWithDatabaseTransaction[LocalVariableDescriptor]

'delegates' @ [197:32] ==> public final val delegates: CopyOnWriteArrayList<Subscriber<in T>> defined in net.corda.node.utilities.DatabaseTransactionWrappingSubscriber[PropertyDescriptorImpl]

'size' @ [197:42] ==> public open val size: Int defined in java.util.concurrent.CopyOnWriteArrayList[JavaPropertyDescriptor]

'wrappingSubscriber' @ [197:53] ==> var wrappingSubscriber: DatabaseTransactionWrappingSubscriber<T> defined in net.corda.node.utilities.wrapWithDatabaseTransaction[LocalVariableDescriptor]

'NoOpSubscriber' @ [197:77] ==> public constructor NoOpSubscriber<U>(t: Subscriber<in (T..T?)>) defined in net.corda.node.utilities.NoOpSubscriber[ClassConstructorDescriptorImpl]
Inferred types:
    <U> -> (T..T?)

'toBeWrappedInDbTx' @ [197:92] ==> value-parameter toBeWrappedInDbTx: Subscriber<in T> defined in net.corda.node.utilities.wrapWithDatabaseTransaction.<anonymous>[ValueParameterDescriptorImpl]

'doOnUnsubscribe' @ [199:7] ==> public final fun doOnUnsubscribe(p0: (() -> Unit..(() -> Unit)?)): (Observable<(T..T?)>..Observable<(T..T?)>?) defined in rx.Observable[MyFunctionDescriptor]

'wrappingSubscriber' @ [200:9] ==> var wrappingSubscriber: DatabaseTransactionWrappingSubscriber<T> defined in net.corda.node.utilities.wrapWithDatabaseTransaction[LocalVariableDescriptor]

'cleanUp' @ [200:28] ==> public final fun cleanUp(): Unit defined in net.corda.node.utilities.DatabaseTransactionWrappingSubscriber[SimpleFunctionDescriptorImpl]

'wrappingSubscriber' @ [202:13] ==> var wrappingSubscriber: DatabaseTransactionWrappingSubscriber<T> defined in net.corda.node.utilities.wrapWithDatabaseTransaction[LocalVariableDescriptor]

'delegates' @ [202:32] ==> public final val delegates: CopyOnWriteArrayList<Subscriber<in T>> defined in net.corda.node.utilities.DatabaseTransactionWrappingSubscriber[PropertyDescriptorImpl]

'isEmpty' @ [202:42] ==> public open fun isEmpty(): Boolean defined in java.util.concurrent.CopyOnWriteArrayList[JavaMethodDescriptor]

'wrappingSubscriber' @ [203:13] ==> var wrappingSubscriber: DatabaseTransactionWrappingSubscriber<T> defined in net.corda.node.utilities.wrapWithDatabaseTransaction[LocalVariableDescriptor]

'DatabaseTransactionWrappingSubscriber' @ [203:34] ==> public constructor DatabaseTransactionWrappingSubscriber<U>(db: CordaPersistence?) defined in net.corda.node.utilities.DatabaseTransactionWrappingSubscriber[ClassConstructorDescriptorImpl]
Inferred types:
    <U> -> T

'db' @ [203:72] ==> value-parameter db: CordaPersistence? = ... defined in net.corda.node.utilities.wrapWithDatabaseTransaction[ValueParameterDescriptorImpl]

'when (property) {
            "none" -> Connection.TRANSACTION_NONE
            "readUncommitted" -> Connection.TRANSACTION_READ_UNCOMMITTED
            "readCommitted" -> Connection.TRANSACTION_READ_COMMITTED
            "repeatableRead" -> Connection.TRANSACTION_REPEATABLE_READ
            "serializable" -> Connection.TRANSACTION_SERIALIZABLE
            else -> {
                Connection.TRANSACTION_REPEATABLE_READ
            }
        }' @ [209:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int, entry3: Int, entry4: Int, entry5: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'property' @ [209:15] ==> value-parameter property: String? defined in net.corda.node.utilities.parserTransactionIsolationLevel[ValueParameterDescriptorImpl]

'TRANSACTION_NONE' @ [210:34] ==> public const final val TRANSACTION_NONE: Int defined in java.sql.Connection[JavaPropertyDescriptor]

'TRANSACTION_READ_UNCOMMITTED' @ [211:45] ==> public const final val TRANSACTION_READ_UNCOMMITTED: Int defined in java.sql.Connection[JavaPropertyDescriptor]

'TRANSACTION_READ_COMMITTED' @ [212:43] ==> public const final val TRANSACTION_READ_COMMITTED: Int defined in java.sql.Connection[JavaPropertyDescriptor]

'TRANSACTION_REPEATABLE_READ' @ [213:44] ==> public const final val TRANSACTION_REPEATABLE_READ: Int defined in java.sql.Connection[JavaPropertyDescriptor]

'TRANSACTION_SERIALIZABLE' @ [214:42] ==> public const final val TRANSACTION_SERIALIZABLE: Int defined in java.sql.Connection[JavaPropertyDescriptor]

'TRANSACTION_REPEATABLE_READ' @ [216:28] ==> public const final val TRANSACTION_REPEATABLE_READ: Int defined in java.sql.Connection[JavaPropertyDescriptor]

