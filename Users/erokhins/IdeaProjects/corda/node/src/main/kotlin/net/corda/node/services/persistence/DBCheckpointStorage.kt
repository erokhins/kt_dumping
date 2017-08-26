'Entity' @ [18:5] ==> public constructor Entity(name: String = ...) defined in javax.persistence.Entity[JavaClassConstructorDescriptor]

'javax.persistence.Table' @ [19:5] ==> public constructor Table(name: String = ..., catalog: String = ..., schema: String = ..., uniqueConstraints: Array<UniqueConstraint> = ..., indexes: Array<Index> = ...) defined in javax.persistence.Table[JavaClassConstructorDescriptor]

'NODE_DATABASE_PREFIX' @ [19:40] ==> public const val NODE_DATABASE_PREFIX: String defined in net.corda.node.utilities in file CordaPersistence.kt[PropertyDescriptorImpl]

'Id' @ [21:13] ==> public constructor Id() defined in javax.persistence.Id[JavaClassConstructorDescriptor]

'Column' @ [22:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'Lob' @ [25:13] ==> public constructor Lob() defined in javax.persistence.Lob[JavaClassConstructorDescriptor]

'Column' @ [26:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'ByteArray' @ [27:41] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'DatabaseTransactionManager' @ [31:23] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [31:50] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [31:60] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'session' @ [32:9] ==> val session: Session defined in net.corda.node.services.persistence.DBCheckpointStorage.addCheckpoint[LocalVariableDescriptor]

'save' @ [32:17] ==> public abstract fun save(p0: (Any..Any?)): (Serializable..Serializable?) defined in org.hibernate.Session[JavaMethodDescriptor]

'DBCheckpoint' @ [32:22] ==> public constructor DBCheckpoint(checkpointId: String = ..., checkpoint: ByteArray = ...) defined in net.corda.node.services.persistence.DBCheckpointStorage.DBCheckpoint[ClassConstructorDescriptorImpl]

'apply' @ [32:37] ==> @InlineOnly public inline fun <T> DBCheckpointStorage.DBCheckpoint.apply(block: DBCheckpointStorage.DBCheckpoint.() -> Unit): DBCheckpointStorage.DBCheckpoint defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DBCheckpoint

'checkpointId' @ [33:13] ==> @Id @Column public final var checkpointId: String defined in net.corda.node.services.persistence.DBCheckpointStorage.DBCheckpoint[PropertyDescriptorImpl]

'checkpoint' @ [33:28] ==> value-parameter checkpoint: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorage.addCheckpoint[ValueParameterDescriptorImpl]

'id' @ [33:39] ==> public final val id: SecureHash defined in net.corda.node.services.api.Checkpoint[PropertyDescriptorImpl]

'toString' @ [33:42] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'this' @ [34:13] ==> <this> defined in net.corda.node.services.persistence.DBCheckpointStorage.addCheckpoint.<anonymous>[ReceiverParameterDescriptorImpl]

'checkpoint' @ [34:18] ==> @Lob @Column public final var checkpoint: ByteArray defined in net.corda.node.services.persistence.DBCheckpointStorage.DBCheckpoint[PropertyDescriptorImpl]

'checkpoint' @ [34:31] ==> value-parameter checkpoint: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorage.addCheckpoint[ValueParameterDescriptorImpl]

'serializedFiber' @ [34:42] ==> public final val serializedFiber: SerializedBytes<FlowStateMachineImpl<*>> defined in net.corda.node.services.api.Checkpoint[PropertyDescriptorImpl]

'bytes' @ [34:58] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'DatabaseTransactionManager' @ [39:23] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [39:50] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [39:60] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'session' @ [40:31] ==> val session: Session defined in net.corda.node.services.persistence.DBCheckpointStorage.removeCheckpoint[LocalVariableDescriptor]

'criteriaBuilder' @ [40:39] ==> public final val Session.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'criteriaBuilder' @ [41:22] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.persistence.DBCheckpointStorage.removeCheckpoint[LocalVariableDescriptor]

'createCriteriaDelete' @ [41:38] ==> public abstract fun <T : (Any..Any?)> createCriteriaDelete(p0: (Class<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..Class<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?)): (CriteriaDelete<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..CriteriaDelete<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DBCheckpoint

'DBCheckpoint' @ [41:59] ==> public constructor DBCheckpoint(checkpointId: String = ..., checkpoint: ByteArray = ...) defined in net.corda.node.services.persistence.DBCheckpointStorage.DBCheckpoint[ClassConstructorDescriptorImpl]

'java' @ [41:79] ==> public val <T> KClass<DBCheckpointStorage.DBCheckpoint>.java: Class<DBCheckpointStorage.DBCheckpoint> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DBCheckpoint

'delete' @ [42:20] ==> val delete: (CriteriaDelete<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..CriteriaDelete<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?) defined in net.corda.node.services.persistence.DBCheckpointStorage.removeCheckpoint[LocalVariableDescriptor]

'from' @ [42:27] ==> public abstract fun from(p0: (Class<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..Class<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?)): (Root<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..Root<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?) defined in javax.persistence.criteria.CriteriaDelete[JavaMethodDescriptor]

'DBCheckpoint' @ [42:32] ==> public constructor DBCheckpoint(checkpointId: String = ..., checkpoint: ByteArray = ...) defined in net.corda.node.services.persistence.DBCheckpointStorage.DBCheckpoint[ClassConstructorDescriptorImpl]

'java' @ [42:52] ==> public val <T> KClass<DBCheckpointStorage.DBCheckpoint>.java: Class<DBCheckpointStorage.DBCheckpoint> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DBCheckpoint

'delete' @ [43:9] ==> val delete: (CriteriaDelete<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..CriteriaDelete<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?) defined in net.corda.node.services.persistence.DBCheckpointStorage.removeCheckpoint[LocalVariableDescriptor]

'where' @ [43:16] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaDelete<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..CriteriaDelete<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?) defined in javax.persistence.criteria.CriteriaDelete[JavaMethodDescriptor]

'criteriaBuilder' @ [43:22] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.persistence.DBCheckpointStorage.removeCheckpoint[LocalVariableDescriptor]

'equal' @ [43:38] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'root' @ [43:44] ==> val root: (Root<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..Root<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?) defined in net.corda.node.services.persistence.DBCheckpointStorage.removeCheckpoint[LocalVariableDescriptor]

'get' @ [43:49] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'DBCheckpoint' @ [43:61] ==> public constructor DBCheckpoint(checkpointId: String = ..., checkpoint: ByteArray = ...) defined in net.corda.node.services.persistence.DBCheckpointStorage.DBCheckpoint[ClassConstructorDescriptorImpl]

'checkpointId' @ [43:75] ==> @Id @Column public final var checkpointId: String defined in net.corda.node.services.persistence.DBCheckpointStorage.DBCheckpoint[PropertyDescriptorImpl]

'name' @ [43:88] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'checkpoint' @ [43:95] ==> value-parameter checkpoint: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorage.removeCheckpoint[ValueParameterDescriptorImpl]

'id' @ [43:106] ==> public final val id: SecureHash defined in net.corda.node.services.api.Checkpoint[PropertyDescriptorImpl]

'toString' @ [43:109] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'session' @ [44:9] ==> val session: Session defined in net.corda.node.services.persistence.DBCheckpointStorage.removeCheckpoint[LocalVariableDescriptor]

'createQuery' @ [44:17] ==> public abstract fun createQuery(p0: raw (CriteriaDelete<(Any..Any?)>..CriteriaDelete<*>?)): raw (Query<(Any..Any?)>..Query<*>?) defined in org.hibernate.Session[JavaMethodDescriptor]

'delete' @ [44:29] ==> val delete: (CriteriaDelete<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..CriteriaDelete<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?) defined in net.corda.node.services.persistence.DBCheckpointStorage.removeCheckpoint[LocalVariableDescriptor]

'executeUpdate' @ [44:37] ==> public abstract fun executeUpdate(): Int defined in org.hibernate.query.Query[JavaMethodDescriptor]

'DatabaseTransactionManager' @ [48:23] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [48:50] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [48:60] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'session' @ [49:29] ==> val session: Session defined in net.corda.node.services.persistence.DBCheckpointStorage.forEach[LocalVariableDescriptor]

'criteriaBuilder' @ [49:37] ==> public final val Session.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'createQuery' @ [49:53] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..Class<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?)): (CriteriaQuery<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..CriteriaQuery<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DBCheckpoint

'DBCheckpoint' @ [49:65] ==> public constructor DBCheckpoint(checkpointId: String = ..., checkpoint: ByteArray = ...) defined in net.corda.node.services.persistence.DBCheckpointStorage.DBCheckpoint[ClassConstructorDescriptorImpl]

'java' @ [49:85] ==> public val <T> KClass<DBCheckpointStorage.DBCheckpoint>.java: Class<DBCheckpointStorage.DBCheckpoint> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DBCheckpoint

'criteriaQuery' @ [50:20] ==> val criteriaQuery: (CriteriaQuery<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..CriteriaQuery<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?) defined in net.corda.node.services.persistence.DBCheckpointStorage.forEach[LocalVariableDescriptor]

'from' @ [50:34] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..Class<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?)): (Root<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..Root<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> DBCheckpoint

'DBCheckpoint' @ [50:39] ==> public constructor DBCheckpoint(checkpointId: String = ..., checkpoint: ByteArray = ...) defined in net.corda.node.services.persistence.DBCheckpointStorage.DBCheckpoint[ClassConstructorDescriptorImpl]

'java' @ [50:59] ==> public val <T> KClass<DBCheckpointStorage.DBCheckpoint>.java: Class<DBCheckpointStorage.DBCheckpoint> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DBCheckpoint

'criteriaQuery' @ [51:9] ==> val criteriaQuery: (CriteriaQuery<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..CriteriaQuery<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?) defined in net.corda.node.services.persistence.DBCheckpointStorage.forEach[LocalVariableDescriptor]

'select' @ [51:23] ==> public abstract fun select(p0: (Selection<out (DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..Selection<out (DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?)): (CriteriaQuery<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..CriteriaQuery<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'root' @ [51:30] ==> val root: (Root<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..Root<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?) defined in net.corda.node.services.persistence.DBCheckpointStorage.forEach[LocalVariableDescriptor]

'session' @ [52:21] ==> val session: Session defined in net.corda.node.services.persistence.DBCheckpointStorage.forEach[LocalVariableDescriptor]

'createQuery' @ [52:29] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..CriteriaQuery<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?)): (Query<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..Query<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DBCheckpoint

'criteriaQuery' @ [52:41] ==> val criteriaQuery: (CriteriaQuery<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..CriteriaQuery<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?) defined in net.corda.node.services.persistence.DBCheckpointStorage.forEach[LocalVariableDescriptor]

'resultList' @ [52:56] ==> public final val <R : (Any..Any?)> Query<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>.resultList: (MutableList<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>..List<(DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?)>?)[MyPropertyDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (net.corda.node.services.persistence.DBCheckpointStorage.DBCheckpoint..net.corda.node.services.persistence.DBCheckpointStorage.DBCheckpoint?)

'Checkpoint' @ [53:30] ==> public constructor Checkpoint(serializedFiber: SerializedBytes<FlowStateMachineImpl<*>>) defined in net.corda.node.services.api.Checkpoint[ClassConstructorDescriptorImpl]

'SerializedBytes' @ [53:41] ==> public constructor SerializedBytes<T : Any>(bytes: ByteArray) defined in net.corda.core.serialization.SerializedBytes[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> FlowStateMachineImpl<*>

'row' @ [53:57] ==> val row: (DBCheckpointStorage.DBCheckpoint..DBCheckpointStorage.DBCheckpoint?) defined in net.corda.node.services.persistence.DBCheckpointStorage.forEach[LocalVariableDescriptor]

'checkpoint' @ [53:61] ==> @Lob @Column public final var checkpoint: ByteArray defined in net.corda.node.services.persistence.DBCheckpointStorage.DBCheckpoint[PropertyDescriptorImpl]

'!' @ [54:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [54:18] ==> public abstract operator fun invoke(p1: Checkpoint): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'checkpoint' @ [54:24] ==> val checkpoint: Checkpoint defined in net.corda.node.services.persistence.DBCheckpointStorage.forEach[LocalVariableDescriptor]

