'ThreadSafe' @ [27:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'SingletonSerializeAsToken' @ [28:75] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'Entity' @ [30:5] ==> public constructor Entity(name: String = ...) defined in javax.persistence.Entity[JavaClassConstructorDescriptor]

'Table' @ [31:5] ==> public constructor Table(name: String = ..., catalog: String = ..., schema: String = ..., uniqueConstraints: Array<UniqueConstraint> = ..., indexes: Array<Index> = ...) defined in javax.persistence.Table[JavaClassConstructorDescriptor]

'NODE_DATABASE_PREFIX' @ [31:22] ==> public const val NODE_DATABASE_PREFIX: String defined in net.corda.node.utilities in file CordaPersistence.kt[PropertyDescriptorImpl]

'arrayOf' @ [32:22] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Index): Array<Index> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Index

'Index' @ [32:30] ==> public constructor Index(name: String = ..., columnList: String, unique: Boolean = ...) defined in javax.persistence.Index[JavaClassConstructorDescriptor]

'Id' @ [34:13] ==> public constructor Id() defined in javax.persistence.Id[JavaClassConstructorDescriptor]

'Column' @ [35:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'Column' @ [38:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'Lob' @ [39:13] ==> public constructor Lob() defined in javax.persistence.Lob[JavaClassConstructorDescriptor]

'loggerFor' @ [44:27] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> NodeAttachmentService

'VisibleForTesting' @ [47:5] ==> public constructor VisibleForTesting() defined in net.corda.core.internal.VisibleForTesting[DeserializedClassConstructorDescriptor]

'metrics' @ [50:35] ==> value-parameter metrics: MetricRegistry defined in net.corda.node.services.persistence.NodeAttachmentService.<init>[ValueParameterDescriptorImpl]

'counter' @ [50:43] ==> public open fun counter(p0: (String..String?)): (Counter..Counter?) defined in com.codahale.metrics.MetricRegistry[JavaMethodDescriptor]

'DatabaseTransactionManager' @ [53:23] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [53:50] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [53:60] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'session' @ [54:31] ==> val session: Session defined in net.corda.node.services.persistence.NodeAttachmentService.<init>[LocalVariableDescriptor]

'criteriaBuilder' @ [54:39] ==> public final val Session.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'criteriaBuilder' @ [55:29] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.persistence.NodeAttachmentService.<init>[LocalVariableDescriptor]

'createQuery' @ [55:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(Long..Long?)>..Class<(Long..Long?)>?)): (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Long

'Long' @ [55:57] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'java' @ [55:69] ==> public val <T> KClass<Long>.java: Class<Long> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Long

'criteriaQuery' @ [56:9] ==> val criteriaQuery: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in net.corda.node.services.persistence.NodeAttachmentService.<init>[LocalVariableDescriptor]

'select' @ [56:23] ==> public abstract fun select(p0: (Selection<out (Long..Long?)>..Selection<out (Long..Long?)>?)): (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [56:30] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.persistence.NodeAttachmentService.<init>[LocalVariableDescriptor]

'count' @ [56:46] ==> public abstract fun count(p0: (Expression<*>..Expression<*>?)): (Expression<(Long..Long?)>..Expression<(Long..Long?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'criteriaQuery' @ [56:52] ==> val criteriaQuery: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in net.corda.node.services.persistence.NodeAttachmentService.<init>[LocalVariableDescriptor]

'from' @ [56:66] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?)>..Class<(NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?)>?)): (Root<(NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?)>..Root<(NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> DBAttachment

'NodeAttachmentService' @ [56:71] ==> public companion object defined in net.corda.node.services.persistence.NodeAttachmentService[FakeCallableDescriptorForObject]

'DBAttachment' @ [56:93] ==> public constructor DBAttachment(attId: String, content: ByteArray) defined in net.corda.node.services.persistence.NodeAttachmentService.DBAttachment[ClassConstructorDescriptorImpl]

'java' @ [56:113] ==> public val <T> KClass<NodeAttachmentService.DBAttachment>.java: Class<NodeAttachmentService.DBAttachment> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DBAttachment

'session' @ [57:21] ==> val session: Session defined in net.corda.node.services.persistence.NodeAttachmentService.<init>[LocalVariableDescriptor]

'createQuery' @ [57:29] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?)): (Query<(Long..Long?)>..Query<(Long..Long?)>?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Long

'criteriaQuery' @ [57:41] ==> val criteriaQuery: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in net.corda.node.services.persistence.NodeAttachmentService.<init>[LocalVariableDescriptor]

'singleResult' @ [57:56] ==> public final val <R : (Any..Any?)> Query<(Long..Long?)>.singleResult: (Long..Long?)[MyPropertyDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (kotlin.Long..kotlin.Long?)

'attachmentCount' @ [58:9] ==> private final val attachmentCount: (Counter..Counter?) defined in net.corda.node.services.persistence.NodeAttachmentService[PropertyDescriptorImpl]

'inc' @ [58:25] ==> public open fun inc(p0: Long): Unit defined in com.codahale.metrics.Counter[JavaMethodDescriptor]

'count' @ [58:29] ==> val count: (Long..Long?) defined in net.corda.node.services.persistence.NodeAttachmentService.<init>[LocalVariableDescriptor]

'CordaSerializable' @ [61:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'RuntimeException' @ [62:85] ==> public final fun <init>(p0: (String..String?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'expected' @ [62:109] ==> value-parameter expected: SecureHash defined in net.corda.node.services.persistence.NodeAttachmentService.HashMismatchException.<init>[ValueParameterDescriptorImpl]

'actual' @ [62:129] ==> value-parameter actual: SecureHash defined in net.corda.node.services.persistence.NodeAttachmentService.HashMismatchException.<init>[ValueParameterDescriptorImpl]

'VisibleForTesting' @ [72:5] ==> public constructor VisibleForTesting() defined in net.corda.core.internal.VisibleForTesting[DeserializedClassConstructorDescriptor]

'CordaSerializable' @ [72:24] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'CountingInputStream' @ [76:73] ==> public constructor CountingInputStream(p0: (InputStream..InputStream?)) defined in com.google.common.io.CountingInputStream[JavaClassConstructorDescriptor]

'input' @ [76:93] ==> value-parameter input: InputStream defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream.<init>[ValueParameterDescriptorImpl]

'HashingInputStream' @ [77:71] ==> public constructor HashingInputStream(p0: (HashFunction..HashFunction?), p1: (InputStream..InputStream?)) defined in com.google.common.hash.HashingInputStream[JavaClassConstructorDescriptor]

'sha256' @ [77:98] ==> public open fun sha256(): (HashFunction..HashFunction?) defined in com.google.common.hash.Hashing[JavaMethodDescriptor]

'counter' @ [77:108] ==> value-parameter counter: CountingInputStream = ... defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream.<init>[ValueParameterDescriptorImpl]

'FilterInputStream' @ [77:120] ==> protected/*protected and package*/ constructor FilterInputStream(p0: (InputStream..InputStream?)) defined in java.io.FilterInputStream[JavaClassConstructorDescriptor]

'stream' @ [77:138] ==> value-parameter stream: HashingInputStream = ... defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream.<init>[ValueParameterDescriptorImpl]

'Throws' @ [78:9] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [78:17] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'super' @ [80:13] ==> <this> defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream[LazyClassReceiverParameterDescriptor]

'close' @ [80:19] ==> public open fun close(): Unit defined in java.io.FilterInputStream[JavaMethodDescriptor]

'validate' @ [81:13] ==> private final fun validate(): Unit defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream[SimpleFunctionDescriptorImpl]

'Throws' @ [85:9] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [85:17] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'super' @ [87:20] ==> <this> defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream[LazyClassReceiverParameterDescriptor]

'read' @ [87:26] ==> public open fun read(): Int defined in java.io.FilterInputStream[JavaMethodDescriptor]

'apply' @ [87:33] ==> @InlineOnly public inline fun <T> Int.apply(block: Int.() -> Unit): Int defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'this' @ [88:21] ==> <this> defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream.read.<anonymous>[ReceiverParameterDescriptorImpl]

'-' @ [88:29] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'validate' @ [89:21] ==> private final fun validate(): Unit defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream[SimpleFunctionDescriptorImpl]

'Throws' @ [95:9] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [95:17] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'super' @ [97:20] ==> <this> defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream[LazyClassReceiverParameterDescriptor]

'read' @ [97:26] ==> public open fun read(p0: (ByteArray..ByteArray?), p1: Int, p2: Int): Int defined in java.io.FilterInputStream[JavaMethodDescriptor]

'b' @ [97:31] ==> value-parameter b: ByteArray? defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream.read[ValueParameterDescriptorImpl]

'off' @ [97:34] ==> value-parameter off: Int defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream.read[ValueParameterDescriptorImpl]

'len' @ [97:39] ==> value-parameter len: Int defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream.read[ValueParameterDescriptorImpl]

'apply' @ [97:44] ==> @InlineOnly public inline fun <T> Int.apply(block: Int.() -> Unit): Int defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'this' @ [98:21] ==> <this> defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream.read.<anonymous>[ReceiverParameterDescriptorImpl]

'-' @ [98:29] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'validate' @ [99:21] ==> private final fun validate(): Unit defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream[SimpleFunctionDescriptorImpl]

'counter' @ [105:17] ==> private final val counter: CountingInputStream defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream[PropertyDescriptorImpl]

'count' @ [105:25] ==> public final val CountingInputStream.count: Long[MyPropertyDescriptor]

'expectedSize' @ [105:34] ==> public final val expectedSize: Int defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream[PropertyDescriptorImpl]

'toLong' @ [105:47] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'SecureHash' @ [107:26] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'SHA256' @ [107:37] ==> public constructor SHA256(bytes: ByteArray) defined in net.corda.core.crypto.SecureHash.SHA256[DeserializedClassConstructorDescriptor]

'hash' @ [107:44] ==> private final val hash: HashCode defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream[PropertyDescriptorImpl]

'asBytes' @ [107:49] ==> public abstract fun asBytes(): (ByteArray..ByteArray?) defined in com.google.common.hash.HashCode[JavaMethodDescriptor]

'actual' @ [108:17] ==> val actual: SecureHash.SHA256 defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream.validate[LocalVariableDescriptor]

'expected' @ [108:27] ==> public final val expected: SecureHash.SHA256 defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream[PropertyDescriptorImpl]

'HashMismatchException' @ [109:23] ==> public constructor HashMismatchException(expected: SecureHash, actual: SecureHash) defined in net.corda.node.services.persistence.NodeAttachmentService.HashMismatchException[ClassConstructorDescriptorImpl]

'expected' @ [109:45] ==> public final val expected: SecureHash.SHA256 defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream[PropertyDescriptorImpl]

'actual' @ [109:55] ==> val actual: SecureHash.SHA256 defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream.validate[LocalVariableDescriptor]

'_hash' @ [114:21] ==> private final var _hash: HashCode? defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream[PropertyDescriptorImpl]

'if (h == null) {
                h = stream.hash()
                _hash = h
                h
            } else {
                h
            }' @ [115:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: HashCode, elseBranch: HashCode): HashCode[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> HashCode

'h' @ [115:24] ==> var h: HashCode? defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream.<get-hash>[LocalVariableDescriptor]

'h' @ [116:17] ==> var h: HashCode? defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream.<get-hash>[LocalVariableDescriptor]

'stream' @ [116:21] ==> private final val stream: HashingInputStream defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream[PropertyDescriptorImpl]

'hash' @ [116:28] ==> public open fun hash(): (HashCode..HashCode?) defined in com.google.common.hash.HashingInputStream[JavaMethodDescriptor]

'_hash' @ [117:17] ==> private final var _hash: HashCode? defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream[PropertyDescriptorImpl]

'h' @ [117:25] ==> var h: HashCode? defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream.<get-hash>[LocalVariableDescriptor]

'h' @ [118:17] ==> var h: HashCode? defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream.<get-hash>[LocalVariableDescriptor]

'h' @ [120:17] ==> var h: HashCode? defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream.<get-hash>[LocalVariableDescriptor]

'AbstractAttachment' @ [125:128] ==> public constructor AbstractAttachment(dataLoader: () -> ByteArray) defined in net.corda.core.contracts.AbstractAttachment[DeserializedClassConstructorDescriptor]

'dataLoader' @ [125:147] ==> value-parameter dataLoader: () -> ByteArray defined in net.corda.node.services.persistence.NodeAttachmentService.AttachmentImpl.<init>[ValueParameterDescriptorImpl]

'super' @ [127:26] ==> <this> defined in net.corda.node.services.persistence.NodeAttachmentService.AttachmentImpl[LazyClassReceiverParameterDescriptor]

'open' @ [127:32] ==> public open fun open(): InputStream defined in net.corda.core.contracts.AbstractAttachment[DeserializedSimpleFunctionDescriptor]

'if (checkOnLoad && id is SecureHash.SHA256) HashCheckingStream(id, attachmentData.size, stream) else stream' @ [129:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: InputStream, elseBranch: InputStream): InputStream[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> InputStream

'checkOnLoad' @ [129:24] ==> private final val checkOnLoad: Boolean defined in net.corda.node.services.persistence.NodeAttachmentService.AttachmentImpl[PropertyDescriptorImpl]

'id' @ [129:39] ==> public open val id: SecureHash defined in net.corda.node.services.persistence.NodeAttachmentService.AttachmentImpl[PropertyDescriptorImpl]

'HashCheckingStream' @ [129:64] ==> public constructor HashCheckingStream(expected: SecureHash.SHA256, expectedSize: Int, input: InputStream, counter: CountingInputStream = ..., stream: HashingInputStream = ...) defined in net.corda.node.services.persistence.NodeAttachmentService.HashCheckingStream[ClassConstructorDescriptorImpl]

'id' @ [129:83] ==> public open val id: SecureHash defined in net.corda.node.services.persistence.NodeAttachmentService.AttachmentImpl[PropertyDescriptorImpl]

'attachmentData' @ [129:87] ==> protected final val attachmentData: ByteArray defined in net.corda.node.services.persistence.NodeAttachmentService.AttachmentImpl[DeserializedPropertyDescriptor]

'size' @ [129:102] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'stream' @ [129:108] ==> val stream: InputStream defined in net.corda.node.services.persistence.NodeAttachmentService.AttachmentImpl.open[LocalVariableDescriptor]

'stream' @ [129:121] ==> val stream: InputStream defined in net.corda.node.services.persistence.NodeAttachmentService.AttachmentImpl.open[LocalVariableDescriptor]

'AttachmentImpl' @ [133:72] ==> public constructor AttachmentImpl(id: SecureHash, dataLoader: () -> ByteArray, checkOnLoad: Boolean) defined in net.corda.node.services.persistence.NodeAttachmentService.AttachmentImpl[ClassConstructorDescriptorImpl]

'id' @ [133:87] ==> private final val id: SecureHash defined in net.corda.node.services.persistence.NodeAttachmentService.AttachmentImpl.Token[PropertyDescriptorImpl]

'context' @ [133:91] ==> value-parameter context: SerializeAsTokenContext defined in net.corda.node.services.persistence.NodeAttachmentService.AttachmentImpl.Token.fromToken[ValueParameterDescriptorImpl]

'attachmentDataLoader' @ [133:99] ==> public final fun SerializeAsTokenContext.attachmentDataLoader(id: SecureHash): () -> ByteArray defined in net.corda.core.contracts.AbstractAttachment.Companion[DeserializedSimpleFunctionDescriptor]

'id' @ [133:120] ==> private final val id: SecureHash defined in net.corda.node.services.persistence.NodeAttachmentService.AttachmentImpl.Token[PropertyDescriptorImpl]

'checkOnLoad' @ [133:125] ==> private final val checkOnLoad: Boolean defined in net.corda.node.services.persistence.NodeAttachmentService.AttachmentImpl.Token[PropertyDescriptorImpl]

'Token' @ [136:66] ==> public constructor Token(id: SecureHash, checkOnLoad: Boolean) defined in net.corda.node.services.persistence.NodeAttachmentService.AttachmentImpl.Token[ClassConstructorDescriptorImpl]

'id' @ [136:72] ==> public open val id: SecureHash defined in net.corda.node.services.persistence.NodeAttachmentService.AttachmentImpl[PropertyDescriptorImpl]

'checkOnLoad' @ [136:76] ==> private final val checkOnLoad: Boolean defined in net.corda.node.services.persistence.NodeAttachmentService.AttachmentImpl[PropertyDescriptorImpl]

'DatabaseTransactionManager' @ [141:26] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [141:53] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [141:63] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'get' @ [141:71] ==> public abstract operator fun <T : (Any..Any?)> get(p0: (Class<(NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?)>..Class<(NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?)>?), p1: (Serializable..Serializable?)): (NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DBAttachment

'NodeAttachmentService' @ [141:75] ==> public companion object defined in net.corda.node.services.persistence.NodeAttachmentService[FakeCallableDescriptorForObject]

'DBAttachment' @ [141:97] ==> public constructor DBAttachment(attId: String, content: ByteArray) defined in net.corda.node.services.persistence.NodeAttachmentService.DBAttachment[ClassConstructorDescriptorImpl]

'java' @ [141:117] ==> public val <T> KClass<NodeAttachmentService.DBAttachment>.java: Class<NodeAttachmentService.DBAttachment> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DBAttachment

'id' @ [141:123] ==> value-parameter id: SecureHash defined in net.corda.node.services.persistence.NodeAttachmentService.openAttachment[ValueParameterDescriptorImpl]

'toString' @ [141:126] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'attachment' @ [142:9] ==> val attachment: (NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?) defined in net.corda.node.services.persistence.NodeAttachmentService.openAttachment[LocalVariableDescriptor]

'let' @ [142:21] ==> @InlineOnly public inline fun <T, R> NodeAttachmentService.DBAttachment.let(block: (NodeAttachmentService.DBAttachment) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DBAttachment
    <R> -> Nothing

'AttachmentImpl' @ [143:20] ==> public constructor AttachmentImpl(id: SecureHash, dataLoader: () -> ByteArray, checkOnLoad: Boolean) defined in net.corda.node.services.persistence.NodeAttachmentService.AttachmentImpl[ClassConstructorDescriptorImpl]

'id' @ [143:35] ==> value-parameter id: SecureHash defined in net.corda.node.services.persistence.NodeAttachmentService.openAttachment[ValueParameterDescriptorImpl]

'attachment' @ [143:41] ==> val attachment: (NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?) defined in net.corda.node.services.persistence.NodeAttachmentService.openAttachment[LocalVariableDescriptor]

'content' @ [143:52] ==> @Column @Lob public final var content: ByteArray defined in net.corda.node.services.persistence.NodeAttachmentService.DBAttachment[PropertyDescriptorImpl]

'checkAttachmentsOnLoad' @ [143:63] ==> @VisibleForTesting public final var checkAttachmentsOnLoad: Boolean defined in net.corda.node.services.persistence.NodeAttachmentService[PropertyDescriptorImpl]

'require' @ [150:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'jar' @ [150:17] ==> value-parameter jar: InputStream defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[ValueParameterDescriptorImpl]

'HashingInputStream' @ [157:18] ==> public constructor HashingInputStream(p0: (HashFunction..HashFunction?), p1: (InputStream..InputStream?)) defined in com.google.common.hash.HashingInputStream[JavaClassConstructorDescriptor]

'sha256' @ [157:45] ==> public open fun sha256(): (HashFunction..HashFunction?) defined in com.google.common.hash.Hashing[JavaMethodDescriptor]

'jar' @ [157:55] ==> value-parameter jar: InputStream defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[ValueParameterDescriptorImpl]

'hs' @ [158:21] ==> val hs: HashingInputStream defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'readBytes' @ [158:24] ==> public fun InputStream.readBytes(estimatedSize: Int = ...): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'checkIsAValidJAR' @ [159:9] ==> private final fun checkIsAValidJAR(stream: InputStream): Unit defined in net.corda.node.services.persistence.NodeAttachmentService[SimpleFunctionDescriptorImpl]

'ByteArrayInputStream' @ [159:26] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'bytes' @ [159:47] ==> val bytes: ByteArray defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'SecureHash' @ [160:18] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'SHA256' @ [160:29] ==> public constructor SHA256(bytes: ByteArray) defined in net.corda.core.crypto.SecureHash.SHA256[DeserializedClassConstructorDescriptor]

'hs' @ [160:36] ==> val hs: HashingInputStream defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'hash' @ [160:39] ==> public open fun hash(): (HashCode..HashCode?) defined in com.google.common.hash.HashingInputStream[JavaMethodDescriptor]

'asBytes' @ [160:46] ==> public abstract fun asBytes(): (ByteArray..ByteArray?) defined in com.google.common.hash.HashCode[JavaMethodDescriptor]

'DatabaseTransactionManager' @ [162:23] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [162:50] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [162:60] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'session' @ [163:31] ==> val session: Session defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'criteriaBuilder' @ [163:39] ==> public final val Session.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'criteriaBuilder' @ [164:29] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'createQuery' @ [164:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(Long..Long?)>..Class<(Long..Long?)>?)): (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Long

'Long' @ [164:57] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'java' @ [164:69] ==> public val <T> KClass<Long>.java: Class<Long> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Long

'criteriaQuery' @ [165:27] ==> val criteriaQuery: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'from' @ [165:41] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?)>..Class<(NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?)>?)): (Root<(NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?)>..Root<(NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> DBAttachment

'NodeAttachmentService' @ [165:46] ==> public companion object defined in net.corda.node.services.persistence.NodeAttachmentService[FakeCallableDescriptorForObject]

'DBAttachment' @ [165:68] ==> public constructor DBAttachment(attId: String, content: ByteArray) defined in net.corda.node.services.persistence.NodeAttachmentService.DBAttachment[ClassConstructorDescriptorImpl]

'java' @ [165:88] ==> public val <T> KClass<NodeAttachmentService.DBAttachment>.java: Class<NodeAttachmentService.DBAttachment> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DBAttachment

'criteriaQuery' @ [166:9] ==> val criteriaQuery: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'select' @ [166:23] ==> public abstract fun select(p0: (Selection<out (Long..Long?)>..Selection<out (Long..Long?)>?)): (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [166:30] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'count' @ [166:46] ==> public abstract fun count(p0: (Expression<*>..Expression<*>?)): (Expression<(Long..Long?)>..Expression<(Long..Long?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'criteriaQuery' @ [166:52] ==> val criteriaQuery: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'from' @ [166:66] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?)>..Class<(NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?)>?)): (Root<(NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?)>..Root<(NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> DBAttachment

'NodeAttachmentService' @ [166:71] ==> public companion object defined in net.corda.node.services.persistence.NodeAttachmentService[FakeCallableDescriptorForObject]

'DBAttachment' @ [166:93] ==> public constructor DBAttachment(attId: String, content: ByteArray) defined in net.corda.node.services.persistence.NodeAttachmentService.DBAttachment[ClassConstructorDescriptorImpl]

'java' @ [166:113] ==> public val <T> KClass<NodeAttachmentService.DBAttachment>.java: Class<NodeAttachmentService.DBAttachment> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DBAttachment

'criteriaQuery' @ [167:9] ==> val criteriaQuery: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'where' @ [167:23] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaBuilder' @ [167:29] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'equal' @ [167:45] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'attachments' @ [167:51] ==> val attachments: (Root<(NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?)>..Root<(NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?)>?) defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'get' @ [167:63] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'DBAttachment' @ [167:75] ==> public constructor DBAttachment(attId: String, content: ByteArray) defined in net.corda.node.services.persistence.NodeAttachmentService.DBAttachment[ClassConstructorDescriptorImpl]

'attId' @ [167:89] ==> @Id @Column public final var attId: String defined in net.corda.node.services.persistence.NodeAttachmentService.DBAttachment[PropertyDescriptorImpl]

'name' @ [167:95] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'id' @ [167:102] ==> val id: SecureHash.SHA256 defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'toString' @ [167:105] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash.SHA256[DeserializedSimpleFunctionDescriptor]

'session' @ [168:21] ==> val session: Session defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'createQuery' @ [168:29] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?)): (Query<(Long..Long?)>..Query<(Long..Long?)>?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Long

'criteriaQuery' @ [168:41] ==> val criteriaQuery: (CriteriaQuery<(Long..Long?)>..CriteriaQuery<(Long..Long?)>?) defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'singleResult' @ [168:56] ==> public final val <R : (Any..Any?)> Query<(Long..Long?)>.singleResult: (Long..Long?)[MyPropertyDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (kotlin.Long..kotlin.Long?)

'count' @ [169:13] ==> val count: (Long..Long?) defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'FileAlreadyExistsException' @ [170:19] ==> public constructor FileAlreadyExistsException(p0: (String..String?)) defined in java.nio.file.FileAlreadyExistsException[JavaClassConstructorDescriptor]

'id' @ [170:46] ==> val id: SecureHash.SHA256 defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'toString' @ [170:49] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash.SHA256[DeserializedSimpleFunctionDescriptor]

'NodeAttachmentService' @ [173:26] ==> public companion object defined in net.corda.node.services.persistence.NodeAttachmentService[FakeCallableDescriptorForObject]

'DBAttachment' @ [173:48] ==> public constructor DBAttachment(attId: String, content: ByteArray) defined in net.corda.node.services.persistence.NodeAttachmentService.DBAttachment[ClassConstructorDescriptorImpl]

'id' @ [173:69] ==> val id: SecureHash.SHA256 defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'toString' @ [173:72] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash.SHA256[DeserializedSimpleFunctionDescriptor]

'bytes' @ [173:94] ==> val bytes: ByteArray defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'session' @ [174:9] ==> val session: Session defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'save' @ [174:17] ==> public abstract fun save(p0: (Any..Any?)): (Serializable..Serializable?) defined in org.hibernate.Session[JavaMethodDescriptor]

'attachment' @ [174:22] ==> val attachment: NodeAttachmentService.DBAttachment defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'attachmentCount' @ [176:9] ==> private final val attachmentCount: (Counter..Counter?) defined in net.corda.node.services.persistence.NodeAttachmentService[PropertyDescriptorImpl]

'inc' @ [176:25] ==> public open fun inc(): Unit defined in com.codahale.metrics.Counter[JavaMethodDescriptor]

'log' @ [177:9] ==> private final val log: Logger defined in net.corda.node.services.persistence.NodeAttachmentService.Companion[PropertyDescriptorImpl]

'info' @ [177:13] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'id' @ [177:42] ==> val id: SecureHash.SHA256 defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'id' @ [179:16] ==> val id: SecureHash.SHA256 defined in net.corda.node.services.persistence.NodeAttachmentService.importAttachment[LocalVariableDescriptor]

'JarInputStream' @ [187:19] ==> public constructor JarInputStream(p0: (InputStream..InputStream?), p1: Boolean) defined in java.util.jar.JarInputStream[JavaClassConstructorDescriptor]

'stream' @ [187:34] ==> value-parameter stream: InputStream defined in net.corda.node.services.persistence.NodeAttachmentService.checkIsAValidJAR[ValueParameterDescriptorImpl]

'jar' @ [190:26] ==> val jar: JarInputStream defined in net.corda.node.services.persistence.NodeAttachmentService.checkIsAValidJAR[LocalVariableDescriptor]

'nextJarEntry' @ [190:30] ==> public final val JarInputStream.nextJarEntry: (JarEntry..JarEntry?)[MyPropertyDescriptor]

'get' @ [191:35] ==> public open fun get(p0: (String..String?), vararg p1: (String..String?)): (Path..Path?) defined in java.nio.file.Paths[JavaMethodDescriptor]

'cursor' @ [191:39] ==> val cursor: JarEntry defined in net.corda.node.services.persistence.NodeAttachmentService.checkIsAValidJAR[LocalVariableDescriptor]

'name' @ [191:46] ==> public final val JarEntry.name: (String..String?)[MyPropertyDescriptor]

'require' @ [193:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [193:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'entryPath' @ [193:22] ==> val entryPath: (Path..Path?) defined in net.corda.node.services.persistence.NodeAttachmentService.checkIsAValidJAR[LocalVariableDescriptor]

'isAbsolute' @ [193:32] ==> public final val Path.isAbsolute: Boolean[MyPropertyDescriptor]

'entryPath' @ [193:53] ==> val entryPath: (Path..Path?) defined in net.corda.node.services.persistence.NodeAttachmentService.checkIsAValidJAR[LocalVariableDescriptor]

'require' @ [194:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'entryPath' @ [194:21] ==> val entryPath: (Path..Path?) defined in net.corda.node.services.persistence.NodeAttachmentService.checkIsAValidJAR[LocalVariableDescriptor]

'normalize' @ [194:31] ==> public abstract fun normalize(): (Path..Path?) defined in java.nio.file.Path[JavaMethodDescriptor]

'entryPath' @ [194:46] ==> val entryPath: (Path..Path?) defined in net.corda.node.services.persistence.NodeAttachmentService.checkIsAValidJAR[LocalVariableDescriptor]

'entryPath' @ [194:66] ==> val entryPath: (Path..Path?) defined in net.corda.node.services.persistence.NodeAttachmentService.checkIsAValidJAR[LocalVariableDescriptor]

'require' @ [195:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [195:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'in' @ [195:23] ==> public operator fun CharSequence.contains(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'cursor' @ [195:31] ==> val cursor: JarEntry defined in net.corda.node.services.persistence.NodeAttachmentService.checkIsAValidJAR[LocalVariableDescriptor]

'name' @ [195:38] ==> public final val JarEntry.name: (String..String?)[MyPropertyDescriptor]

'cursor' @ [195:46] ==> val cursor: JarEntry defined in net.corda.node.services.persistence.NodeAttachmentService.checkIsAValidJAR[LocalVariableDescriptor]

'name' @ [195:53] ==> public final val JarEntry.name: (String..String?)[MyPropertyDescriptor]

'cursor' @ [195:68] ==> val cursor: JarEntry defined in net.corda.node.services.persistence.NodeAttachmentService.checkIsAValidJAR[LocalVariableDescriptor]

'name' @ [195:75] ==> public final val JarEntry.name: (String..String?)[MyPropertyDescriptor]

'entryPath' @ [195:111] ==> val entryPath: (Path..Path?) defined in net.corda.node.services.persistence.NodeAttachmentService.checkIsAValidJAR[LocalVariableDescriptor]

'count' @ [196:13] ==> var count: Int defined in net.corda.node.services.persistence.NodeAttachmentService.checkIsAValidJAR[LocalVariableDescriptor]

'require' @ [198:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'count' @ [198:17] ==> var count: Int defined in net.corda.node.services.persistence.NodeAttachmentService.checkIsAValidJAR[LocalVariableDescriptor]

