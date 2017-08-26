'randomUUID' @ [16:25] ==> public open fun randomUUID(): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'getValue' @ [18:35] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'NONE' @ [18:61] ==> enum entry NONE defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'cordaPersistence' @ [19:9] ==> public final val cordaPersistence: CordaPersistence defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'dataSource' @ [19:26] ==> public final var dataSource: HikariDataSource defined in net.corda.node.utilities.CordaPersistence[PropertyDescriptorImpl]

'connection' @ [19:37] ==> public final val HikariDataSource.connection: (Connection..Connection?)[MyPropertyDescriptor]

'apply' @ [20:18] ==> @InlineOnly public inline fun <T> (Connection..Connection?).apply(block: (Connection..Connection?).() -> Unit): (Connection..Connection?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.sql.Connection..java.sql.Connection?)

'autoCommit' @ [21:21] ==> public final var Connection.autoCommit: Boolean[MyPropertyDescriptor]

'transactionIsolation' @ [22:21] ==> public final var Connection.transactionIsolation: Int[MyPropertyDescriptor]

'isolation' @ [22:44] ==> value-parameter isolation: Int defined in net.corda.node.utilities.DatabaseTransaction.<init>[ValueParameterDescriptorImpl]

'lazy' @ [26:35] ==> public fun <T> lazy(initializer: () -> (Session..Session?)): Lazy<(Session..Session?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.hibernate.Session..org.hibernate.Session?)

'cordaPersistence' @ [27:23] ==> public final val cordaPersistence: CordaPersistence defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'entityManagerFactory' @ [27:40] ==> public final val entityManagerFactory: SessionFactory defined in net.corda.node.utilities.CordaPersistence[PropertyDescriptorImpl]

'withOptions' @ [27:61] ==> public abstract fun withOptions(): raw (SessionBuilder<(SessionBuilder<*>..SessionBuilder<*>?)>..SessionBuilder<out (SessionBuilder<*>..SessionBuilder<*>?)>?) defined in org.hibernate.SessionFactory[JavaMethodDescriptor]

'connection' @ [27:75] ==> public abstract fun connection(p0: (Connection..Connection?)): raw (SessionBuilder<(SessionBuilder<*>..SessionBuilder<*>?)>..SessionBuilder<out (SessionBuilder<*>..SessionBuilder<*>?)>?) defined in org.hibernate.SessionBuilder[JavaMethodDescriptor]

'connection' @ [27:86] ==> public final val connection: Connection defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'openSession' @ [27:98] ==> public abstract fun openSession(): (Session..Session?) defined in org.hibernate.SessionBuilder[JavaMethodDescriptor]

'hibernateTransaction' @ [28:9] ==> private final lateinit var hibernateTransaction: Transaction defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'session' @ [28:32] ==> val session: (Session..Session?) defined in net.corda.node.utilities.DatabaseTransaction.sessionDelegate.<anonymous>[LocalVariableDescriptor]

'beginTransaction' @ [28:40] ==> public abstract fun beginTransaction(): (Transaction..Transaction?) defined in org.hibernate.Session[JavaMethodDescriptor]

'session' @ [29:9] ==> val session: (Session..Session?) defined in net.corda.node.utilities.DatabaseTransaction.sessionDelegate.<anonymous>[LocalVariableDescriptor]

'sessionDelegate' @ [32:29] ==> private final val sessionDelegate: Lazy<(Session..Session?)> defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'threadLocal' @ [35:58] ==> public final val threadLocal: ThreadLocal<DatabaseTransaction> defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'get' @ [35:70] ==> public open fun get(): (DatabaseTransaction..DatabaseTransaction?) defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'sessionDelegate' @ [38:13] ==> private final val sessionDelegate: Lazy<(Session..Session?)> defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'isInitialized' @ [38:29] ==> public abstract fun isInitialized(): Boolean defined in kotlin.Lazy[DeserializedSimpleFunctionDescriptor]

'hibernateTransaction' @ [39:13] ==> private final lateinit var hibernateTransaction: Transaction defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'commit' @ [39:34] ==> public abstract fun commit(): Unit defined in org.hibernate.Transaction[JavaMethodDescriptor]

'connection' @ [41:9] ==> public final val connection: Connection defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'commit' @ [41:20] ==> public abstract fun commit(): Unit defined in java.sql.Connection[JavaMethodDescriptor]

'sessionDelegate' @ [45:13] ==> private final val sessionDelegate: Lazy<(Session..Session?)> defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'isInitialized' @ [45:29] ==> public abstract fun isInitialized(): Boolean defined in kotlin.Lazy[DeserializedSimpleFunctionDescriptor]

'session' @ [45:48] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'isOpen' @ [45:56] ==> public final val Session.isOpen: Boolean[MyPropertyDescriptor]

'session' @ [46:13] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'clear' @ [46:21] ==> public abstract fun clear(): Unit defined in org.hibernate.Session[JavaMethodDescriptor]

'!' @ [48:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'connection' @ [48:14] ==> public final val connection: Connection defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'isClosed' @ [48:25] ==> public final val Connection.isClosed: Boolean[MyPropertyDescriptor]

'connection' @ [49:13] ==> public final val connection: Connection defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'rollback' @ [49:24] ==> public abstract fun rollback(): Unit defined in java.sql.Connection[JavaMethodDescriptor]

'sessionDelegate' @ [54:13] ==> private final val sessionDelegate: Lazy<(Session..Session?)> defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'isInitialized' @ [54:29] ==> public abstract fun isInitialized(): Boolean defined in kotlin.Lazy[DeserializedSimpleFunctionDescriptor]

'session' @ [54:48] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'isOpen' @ [54:56] ==> public final val Session.isOpen: Boolean[MyPropertyDescriptor]

'session' @ [55:13] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'close' @ [55:21] ==> public abstract fun close(): Unit defined in org.hibernate.Session[JavaMethodDescriptor]

'connection' @ [57:9] ==> public final val connection: Connection defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'close' @ [57:20] ==> public abstract fun close(): Unit defined in java.sql.Connection[JavaMethodDescriptor]

'threadLocal' @ [58:9] ==> public final val threadLocal: ThreadLocal<DatabaseTransaction> defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'set' @ [58:21] ==> public open fun set(p0: (DatabaseTransaction..DatabaseTransaction?)): Unit defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'outerTransaction' @ [58:25] ==> private final val outerTransaction: DatabaseTransaction? defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'outerTransaction' @ [59:13] ==> private final val outerTransaction: DatabaseTransaction? defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'transactionBoundaries' @ [60:13] ==> public final val transactionBoundaries: Subject<DatabaseTransactionManager.Boundary, DatabaseTransactionManager.Boundary> defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'onNext' @ [60:35] ==> public abstract fun onNext(p0: (DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?)): Unit defined in rx.subjects.Subject[JavaMethodDescriptor]

'Boundary' @ [60:69] ==> public constructor Boundary(txId: UUID) defined in net.corda.node.utilities.DatabaseTransactionManager.Boundary[ClassConstructorDescriptorImpl]

'id' @ [60:78] ==> public final val id: UUID defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'ThreadLocal' @ [67:37] ==> public constructor ThreadLocal<T : (Any..Any?)>() defined in java.lang.ThreadLocal[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CordaPersistence

'ThreadLocal' @ [68:37] ==> public constructor ThreadLocal<T : (Any..Any?)>() defined in java.lang.ThreadLocal[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DatabaseTransaction

'ConcurrentHashMap' @ [69:42] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> CordaPersistence
    <V : (Any..Any?)> -> DatabaseTransactionManager

'threadLocalTx' @ [72:25] ==> private final val threadLocalTx: ThreadLocal<DatabaseTransaction> defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'get' @ [72:39] ==> public open fun get(): (DatabaseTransaction..DatabaseTransaction?) defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'threadLocalTx' @ [73:13] ==> private final val threadLocalTx: ThreadLocal<DatabaseTransaction> defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'set' @ [73:27] ==> public open fun set(p0: (DatabaseTransaction..DatabaseTransaction?)): Unit defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'tx' @ [73:31] ==> value-parameter tx: DatabaseTransaction? defined in net.corda.node.utilities.DatabaseTransactionManager.Companion.setThreadLocalTx[ValueParameterDescriptorImpl]

'oldTx' @ [74:20] ==> val oldTx: (DatabaseTransaction..DatabaseTransaction?) defined in net.corda.node.utilities.DatabaseTransactionManager.Companion.setThreadLocalTx[LocalVariableDescriptor]

'context' @ [78:17] ==> value-parameter context: DatabaseTransaction? defined in net.corda.node.utilities.DatabaseTransactionManager.Companion.restoreThreadLocalTx[ValueParameterDescriptorImpl]

'threadLocalDb' @ [79:17] ==> private final val threadLocalDb: ThreadLocal<CordaPersistence> defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'set' @ [79:31] ==> public open fun set(p0: (CordaPersistence..CordaPersistence?)): Unit defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'context' @ [79:35] ==> value-parameter context: DatabaseTransaction? defined in net.corda.node.utilities.DatabaseTransactionManager.Companion.restoreThreadLocalTx[ValueParameterDescriptorImpl]

'cordaPersistence' @ [79:43] ==> public final val cordaPersistence: CordaPersistence defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'threadLocalTx' @ [81:13] ==> private final val threadLocalTx: ThreadLocal<DatabaseTransaction> defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'set' @ [81:27] ==> public open fun set(p0: (DatabaseTransaction..DatabaseTransaction?)): Unit defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'context' @ [81:31] ==> value-parameter context: DatabaseTransaction? defined in net.corda.node.utilities.DatabaseTransactionManager.Companion.restoreThreadLocalTx[ValueParameterDescriptorImpl]

'threadLocalDb' @ [85:21] ==> private final val threadLocalDb: ThreadLocal<CordaPersistence> defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'get' @ [85:35] ==> public open fun get(): (CordaPersistence..CordaPersistence?) defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'IllegalStateException' @ [85:50] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'currentStrand' @ [85:144] ==> public open fun currentStrand(): (Strand..Strand?) defined in co.paralleluniverse.strands.Strand[JavaMethodDescriptor]

'threadLocalDb' @ [86:26] ==> private final val threadLocalDb: ThreadLocal<CordaPersistence> defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'set' @ [86:40] ==> public open fun set(p0: (CordaPersistence..CordaPersistence?)): Unit defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'value' @ [86:44] ==> value-parameter value: CordaPersistence defined in net.corda.node.utilities.DatabaseTransactionManager.Companion.<set-dataSource>[ValueParameterDescriptorImpl]

'threadLocalTx' @ [89:21] ==> private final val threadLocalTx: ThreadLocal<DatabaseTransaction> defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'get' @ [89:35] ==> public open fun get(): (DatabaseTransaction..DatabaseTransaction?) defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'id' @ [89:42] ==> public final val id: UUID defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'IllegalStateException' @ [89:54] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'currentStrand' @ [89:143] ==> public open fun currentStrand(): (Strand..Strand?) defined in co.paralleluniverse.strands.Strand[JavaMethodDescriptor]

'databaseToInstance' @ [91:57] ==> private final val databaseToInstance: ConcurrentHashMap<CordaPersistence, DatabaseTransactionManager> defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'dataSource' @ [91:76] ==> public final var dataSource: CordaPersistence defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'manager' @ [93:72] ==> public final val manager: DatabaseTransactionManager defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'_transactionBoundaries' @ [93:80] ==> private final val _transactionBoundaries: (SerializedSubject<(DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?), (DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?)>..SerializedSubject<(DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?), (DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?)>?) defined in net.corda.node.utilities.DatabaseTransactionManager[PropertyDescriptorImpl]

'manager' @ [95:53] ==> public final val manager: DatabaseTransactionManager defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'currentOrNull' @ [95:61] ==> private final fun currentOrNull(): DatabaseTransaction? defined in net.corda.node.utilities.DatabaseTransactionManager[SimpleFunctionDescriptorImpl]

'dataSource' @ [97:43] ==> public final var dataSource: CordaPersistence defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'transactionIsolationLevel' @ [97:54] ==> public final var transactionIsolationLevel: Int defined in net.corda.node.utilities.CordaPersistence[PropertyDescriptorImpl]

'currentOrNull' @ [97:83] ==> public final fun currentOrNull(): DatabaseTransaction? defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'manager' @ [97:102] ==> public final val manager: DatabaseTransactionManager defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'newTransaction' @ [97:110] ==> private final fun newTransaction(isolation: Int): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager[SimpleFunctionDescriptorImpl]

'isolation' @ [97:125] ==> value-parameter isolation: Int = ... defined in net.corda.node.utilities.DatabaseTransactionManager.Companion.currentOrNew[ValueParameterDescriptorImpl]

'currentOrNull' @ [99:46] ==> public final fun currentOrNull(): DatabaseTransaction? defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'error' @ [99:65] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'dataSource' @ [101:45] ==> public final var dataSource: CordaPersistence defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'transactionIsolationLevel' @ [101:56] ==> public final var transactionIsolationLevel: Int defined in net.corda.node.utilities.CordaPersistence[PropertyDescriptorImpl]

'manager' @ [101:85] ==> public final val manager: DatabaseTransactionManager defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'newTransaction' @ [101:93] ==> private final fun newTransaction(isolation: Int): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager[SimpleFunctionDescriptorImpl]

'isolation' @ [101:108] ==> value-parameter isolation: Int = ... defined in net.corda.node.utilities.DatabaseTransactionManager.Companion.newTransaction[ValueParameterDescriptorImpl]

'create' @ [106:57] ==> public open fun <T : (Any..Any?)> create(): (PublishSubject<(DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?)>..PublishSubject<(DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boundary

'toSerialized' @ [106:76] ==> public final fun toSerialized(): (SerializedSubject<(DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?), (DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?)>..SerializedSubject<(DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?), (DatabaseTransactionManager.Boundary..DatabaseTransactionManager.Boundary?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]

'threadLocalTx' @ [113:13] ==> private final val threadLocalTx: ThreadLocal<DatabaseTransaction> defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'get' @ [113:27] ==> public open fun get(): (DatabaseTransaction..DatabaseTransaction?) defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'IllegalStateException' @ [114:19] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'currentStrand' @ [114:148] ==> public open fun currentStrand(): (Strand..Strand?) defined in co.paralleluniverse.strands.Strand[JavaMethodDescriptor]

'threadLocalTx' @ [114:168] ==> private final val threadLocalTx: ThreadLocal<DatabaseTransaction> defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'get' @ [114:182] ==> public open fun get(): (DatabaseTransaction..DatabaseTransaction?) defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'dataSource' @ [116:9] ==> public final var dataSource: CordaPersistence defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'initDataSource' @ [116:22] ==> value-parameter initDataSource: CordaPersistence defined in net.corda.node.utilities.DatabaseTransactionManager.<init>[ValueParameterDescriptorImpl]

'databaseToInstance' @ [117:9] ==> private final val databaseToInstance: ConcurrentHashMap<CordaPersistence, DatabaseTransactionManager> defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'dataSource' @ [117:28] ==> public final var dataSource: CordaPersistence defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'this' @ [117:42] ==> <this> defined in net.corda.node.utilities.DatabaseTransactionManager[LazyClassReceiverParameterDescriptor]

'DatabaseTransaction' @ [121:13] ==> public constructor DatabaseTransaction(isolation: Int, threadLocal: ThreadLocal<DatabaseTransaction>, transactionBoundaries: Subject<DatabaseTransactionManager.Boundary, DatabaseTransactionManager.Boundary>, cordaPersistence: CordaPersistence) defined in net.corda.node.utilities.DatabaseTransaction[ClassConstructorDescriptorImpl]

'isolation' @ [121:33] ==> value-parameter isolation: Int defined in net.corda.node.utilities.DatabaseTransactionManager.newTransaction[ValueParameterDescriptorImpl]

'threadLocalTx' @ [121:44] ==> private final val threadLocalTx: ThreadLocal<DatabaseTransaction> defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'transactionBoundaries' @ [121:59] ==> public final val transactionBoundaries: Subject<DatabaseTransactionManager.Boundary, DatabaseTransactionManager.Boundary> defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'dataSource' @ [121:82] ==> public final var dataSource: CordaPersistence defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'apply' @ [121:94] ==> @InlineOnly public inline fun <T> DatabaseTransaction.apply(block: DatabaseTransaction.() -> Unit): DatabaseTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DatabaseTransaction

'threadLocalTx' @ [122:17] ==> private final val threadLocalTx: ThreadLocal<DatabaseTransaction> defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'set' @ [122:31] ==> public open fun set(p0: (DatabaseTransaction..DatabaseTransaction?)): Unit defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'this' @ [122:35] ==> <this> defined in net.corda.node.utilities.DatabaseTransactionManager.newTransaction.<anonymous>[ReceiverParameterDescriptorImpl]

'threadLocalTx' @ [125:57] ==> private final val threadLocalTx: ThreadLocal<DatabaseTransaction> defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[PropertyDescriptorImpl]

'get' @ [125:71] ==> public open fun get(): (DatabaseTransaction..DatabaseTransaction?) defined in java.lang.ThreadLocal[JavaMethodDescriptor]

