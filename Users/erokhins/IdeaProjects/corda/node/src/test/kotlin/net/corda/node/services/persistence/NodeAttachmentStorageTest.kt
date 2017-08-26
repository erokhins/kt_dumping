'Before' @ [38:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'LogHelper' @ [40:9] ==> public object LogHelper defined in net.corda.testing[FakeCallableDescriptorForObject]

'setLevel' @ [40:19] ==> public final fun setLevel(vararg classes: KClass<*>): Unit defined in net.corda.testing.LogHelper[DeserializedSimpleFunctionDescriptor]

'PersistentUniquenessProvider' @ [40:28] ==> public companion object defined in net.corda.node.services.transactions.PersistentUniquenessProvider[FakeCallableDescriptorForObject]

'makeTestDataSourceProperties' @ [42:36] ==> public fun makeTestDataSourceProperties(nodeName: String = ...): Properties defined in net.corda.testing.node[DeserializedSimpleFunctionDescriptor]

'database' @ [43:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.NodeAttachmentStorageTest[PropertyDescriptorImpl]

'configureDatabase' @ [43:20] ==> public fun configureDatabase(dataSourceProperties: Properties, databaseProperties: Properties?, createSchemaService: () -> SchemaService = ..., createIdentityService: () -> IdentityService): CordaPersistence defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'dataSourceProperties' @ [43:38] ==> val dataSourceProperties: Properties defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.setUp[LocalVariableDescriptor]

'makeTestDatabaseProperties' @ [43:60] ==> public fun makeTestDatabaseProperties(key: String? = ..., value: String? = ...): Properties defined in net.corda.testing.node[DeserializedSimpleFunctionDescriptor]

'fs' @ [44:9] ==> public final lateinit var fs: FileSystem defined in net.corda.node.services.persistence.NodeAttachmentStorageTest[PropertyDescriptorImpl]

'newFileSystem' @ [44:20] ==> public open fun newFileSystem(p0: (Configuration..Configuration?)): (FileSystem..FileSystem?) defined in com.google.common.jimfs.Jimfs[JavaMethodDescriptor]

'unix' @ [44:48] ==> public open fun unix(): (Configuration..Configuration?) defined in com.google.common.jimfs.Configuration[JavaMethodDescriptor]

'After' @ [47:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'database' @ [49:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.NodeAttachmentStorageTest[PropertyDescriptorImpl]

'close' @ [49:18] ==> public open fun close(): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]

'Test' @ [52:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeTestJar' @ [54:23] ==> private final fun makeTestJar(): Path defined in net.corda.node.services.persistence.NodeAttachmentStorageTest[SimpleFunctionDescriptorImpl]

'testJar' @ [55:28] ==> val testJar: Path defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`insert and retrieve`[LocalVariableDescriptor]

'readAll' @ [55:36] ==> public fun Path.readAll(): ByteArray defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'sha256' @ [55:46] ==> public fun ByteArray.sha256(): SecureHash.SHA256 defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'database' @ [57:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.NodeAttachmentStorageTest[PropertyDescriptorImpl]

'transaction' @ [57:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> ByteArray): ByteArray defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArray

'NodeAttachmentService' @ [58:27] ==> public constructor NodeAttachmentService(metrics: MetricRegistry) defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedClassConstructorDescriptor]

'MetricRegistry' @ [58:49] ==> public constructor MetricRegistry() defined in com.codahale.metrics.MetricRegistry[JavaClassConstructorDescriptor]

'testJar' @ [59:22] ==> val testJar: Path defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`insert and retrieve`[LocalVariableDescriptor]

'read' @ [59:30] ==> public inline fun <R> Path.read(vararg options: OpenOption, block: (InputStream) -> SecureHash): SecureHash defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SecureHash

'storage' @ [59:37] ==> val storage: NodeAttachmentService defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`insert and retrieve`.<anonymous>[LocalVariableDescriptor]

'importAttachment' @ [59:45] ==> public open fun importAttachment(jar: InputStream): SecureHash defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedSimpleFunctionDescriptor]

'it' @ [59:62] ==> value-parameter it: InputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`insert and retrieve`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [60:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: SecureHash, actual: SecureHash, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> SecureHash

'expectedHash' @ [60:26] ==> val expectedHash: SecureHash.SHA256 defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`insert and retrieve`[LocalVariableDescriptor]

'id' @ [60:40] ==> val id: SecureHash defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`insert and retrieve`.<anonymous>[LocalVariableDescriptor]

'assertNull' @ [62:13] ==> public fun assertNull(actual: Any?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'storage' @ [62:24] ==> val storage: NodeAttachmentService defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`insert and retrieve`.<anonymous>[LocalVariableDescriptor]

'openAttachment' @ [62:32] ==> public open fun openAttachment(id: SecureHash): Attachment? defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedSimpleFunctionDescriptor]

'SecureHash' @ [62:47] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'randomSHA256' @ [62:58] ==> @JvmStatic public final fun randomSHA256(): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'storage' @ [63:26] ==> val storage: NodeAttachmentService defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`insert and retrieve`.<anonymous>[LocalVariableDescriptor]

'openAttachment' @ [63:34] ==> public open fun openAttachment(id: SecureHash): Attachment? defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedSimpleFunctionDescriptor]

'expectedHash' @ [63:49] ==> val expectedHash: SecureHash.SHA256 defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`insert and retrieve`[LocalVariableDescriptor]

'openAsJAR' @ [63:65] ==> public open fun openAsJAR(): JarInputStream defined in net.corda.core.contracts.Attachment[DeserializedSimpleFunctionDescriptor]

'stream' @ [64:22] ==> val stream: JarInputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`insert and retrieve`.<anonymous>[LocalVariableDescriptor]

'nextJarEntry' @ [64:29] ==> public final val JarInputStream.nextJarEntry: (JarEntry..JarEntry?)[MyPropertyDescriptor]

'assertEquals' @ [65:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (String..String?), actual: (String..String?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (kotlin.String..kotlin.String?)

'e1' @ [65:39] ==> val e1: JarEntry defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`insert and retrieve`.<anonymous>[LocalVariableDescriptor]

'name' @ [65:42] ==> public final val JarEntry.name: (String..String?)[MyPropertyDescriptor]

'assertEquals' @ [66:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'stream' @ [66:26] ==> val stream: JarInputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`insert and retrieve`.<anonymous>[LocalVariableDescriptor]

'readBytes' @ [66:33] ==> public fun InputStream.readBytes(estimatedSize: Int = ...): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'toString' @ [66:45] ==> @InlineOnly public inline fun ByteArray.toString(charset: Charset): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'defaultCharset' @ [66:62] ==> public open fun defaultCharset(): (Charset..Charset?) defined in java.nio.charset.Charset[JavaMethodDescriptor]

'stream' @ [67:22] ==> val stream: JarInputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`insert and retrieve`.<anonymous>[LocalVariableDescriptor]

'nextJarEntry' @ [67:29] ==> public final val JarInputStream.nextJarEntry: (JarEntry..JarEntry?)[MyPropertyDescriptor]

'assertEquals' @ [68:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (String..String?), actual: (String..String?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (kotlin.String..kotlin.String?)

'e2' @ [68:39] ==> val e2: JarEntry defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`insert and retrieve`.<anonymous>[LocalVariableDescriptor]

'name' @ [68:42] ==> public final val JarEntry.name: (String..String?)[MyPropertyDescriptor]

'assertEquals' @ [69:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'stream' @ [69:26] ==> val stream: JarInputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`insert and retrieve`.<anonymous>[LocalVariableDescriptor]

'readBytes' @ [69:33] ==> public fun InputStream.readBytes(estimatedSize: Int = ...): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'toString' @ [69:45] ==> @InlineOnly public inline fun ByteArray.toString(charset: Charset): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'defaultCharset' @ [69:62] ==> public open fun defaultCharset(): (Charset..Charset?) defined in java.nio.charset.Charset[JavaMethodDescriptor]

'stream' @ [71:13] ==> val stream: JarInputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`insert and retrieve`.<anonymous>[LocalVariableDescriptor]

'close' @ [71:20] ==> public open fun close(): Unit defined in java.util.jar.JarInputStream[JavaMethodDescriptor]

'storage' @ [73:13] ==> val storage: NodeAttachmentService defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`insert and retrieve`.<anonymous>[LocalVariableDescriptor]

'openAttachment' @ [73:21] ==> public open fun openAttachment(id: SecureHash): Attachment? defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedSimpleFunctionDescriptor]

'id' @ [73:36] ==> val id: SecureHash defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`insert and retrieve`.<anonymous>[LocalVariableDescriptor]

'openAsJAR' @ [73:42] ==> public open fun openAsJAR(): JarInputStream defined in net.corda.core.contracts.Attachment[DeserializedSimpleFunctionDescriptor]

'use' @ [73:54] ==> @InlineOnly public inline fun <T : Closeable?, R> JarInputStream.use(block: (JarInputStream) -> ByteArray): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> JarInputStream
    <R> -> ByteArray

'it' @ [74:17] ==> value-parameter it: JarInputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`insert and retrieve`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'nextJarEntry' @ [74:20] ==> public final val JarInputStream.nextJarEntry: (JarEntry..JarEntry?)[MyPropertyDescriptor]

'it' @ [75:17] ==> value-parameter it: JarInputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`insert and retrieve`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'readBytes' @ [75:20] ==> public fun InputStream.readBytes(estimatedSize: Int = ...): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Test' @ [80:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeTestJar' @ [82:23] ==> private final fun makeTestJar(): Path defined in net.corda.node.services.persistence.NodeAttachmentStorageTest[SimpleFunctionDescriptorImpl]

'database' @ [83:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.NodeAttachmentStorageTest[PropertyDescriptorImpl]

'transaction' @ [83:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> FileAlreadyExistsException): FileAlreadyExistsException defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileAlreadyExistsException

'NodeAttachmentService' @ [84:27] ==> public constructor NodeAttachmentService(metrics: MetricRegistry) defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedClassConstructorDescriptor]

'MetricRegistry' @ [84:49] ==> public constructor MetricRegistry() defined in com.codahale.metrics.MetricRegistry[JavaClassConstructorDescriptor]

'testJar' @ [85:13] ==> val testJar: Path defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`duplicates not allowed`[LocalVariableDescriptor]

'read' @ [85:21] ==> public inline fun <R> Path.read(vararg options: OpenOption, block: (InputStream) -> SecureHash): SecureHash defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SecureHash

'storage' @ [86:17] ==> val storage: NodeAttachmentService defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`duplicates not allowed`.<anonymous>[LocalVariableDescriptor]

'importAttachment' @ [86:25] ==> public open fun importAttachment(jar: InputStream): SecureHash defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedSimpleFunctionDescriptor]

'it' @ [86:42] ==> value-parameter it: InputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`duplicates not allowed`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertFailsWith' @ [88:13] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): FileAlreadyExistsException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> FileAlreadyExistsException

'testJar' @ [89:17] ==> val testJar: Path defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`duplicates not allowed`[LocalVariableDescriptor]

'read' @ [89:25] ==> public inline fun <R> Path.read(vararg options: OpenOption, block: (InputStream) -> SecureHash): SecureHash defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SecureHash

'storage' @ [90:21] ==> val storage: NodeAttachmentService defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`duplicates not allowed`.<anonymous>[LocalVariableDescriptor]

'importAttachment' @ [90:29] ==> public open fun importAttachment(jar: InputStream): SecureHash defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedSimpleFunctionDescriptor]

'it' @ [90:46] ==> value-parameter it: InputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`duplicates not allowed`.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [96:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeTestJar' @ [98:23] ==> private final fun makeTestJar(): Path defined in net.corda.node.services.persistence.NodeAttachmentStorageTest[SimpleFunctionDescriptorImpl]

'database' @ [100:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.NodeAttachmentStorageTest[PropertyDescriptorImpl]

'transaction' @ [100:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SecureHash): SecureHash defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'NodeAttachmentService' @ [101:27] ==> public constructor NodeAttachmentService(metrics: MetricRegistry) defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedClassConstructorDescriptor]

'MetricRegistry' @ [101:49] ==> public constructor MetricRegistry() defined in com.codahale.metrics.MetricRegistry[JavaClassConstructorDescriptor]

'testJar' @ [102:22] ==> val testJar: Path defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`corrupt entry throws exception`[LocalVariableDescriptor]

'read' @ [102:30] ==> public inline fun <R> Path.read(vararg options: OpenOption, block: (InputStream) -> SecureHash): SecureHash defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SecureHash

'storage' @ [102:37] ==> val storage: NodeAttachmentService defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`corrupt entry throws exception`.<anonymous>[LocalVariableDescriptor]

'importAttachment' @ [102:45] ==> public open fun importAttachment(jar: InputStream): SecureHash defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedSimpleFunctionDescriptor]

'it' @ [102:62] ==> value-parameter it: InputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`corrupt entry throws exception`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'testJar' @ [105:25] ==> val testJar: Path defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`corrupt entry throws exception`[LocalVariableDescriptor]

'readAll' @ [105:33] ==> public fun Path.readAll(): ByteArray defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'toByteArray' @ [106:44] ==> @InlineOnly public inline fun String.toByteArray(charset: Charset = ...): ByteArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'arraycopy' @ [107:20] ==> public open fun arraycopy(p0: (Any..Any?), p1: Int, p2: (Any..Any?), p3: Int, p4: Int): Unit defined in java.lang.System[JavaMethodDescriptor]

'corruptBytes' @ [107:30] ==> val corruptBytes: ByteArray defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`corrupt entry throws exception`.<anonymous>[LocalVariableDescriptor]

'bytes' @ [107:47] ==> val bytes: ByteArray defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`corrupt entry throws exception`.<anonymous>[LocalVariableDescriptor]

'corruptBytes' @ [107:57] ==> val corruptBytes: ByteArray defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`corrupt entry throws exception`.<anonymous>[LocalVariableDescriptor]

'size' @ [107:70] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'NodeAttachmentService' @ [108:37] ==> public companion object defined in net.corda.node.services.persistence.NodeAttachmentService[FakeCallableDescriptorForObject]

'DBAttachment' @ [108:59] ==> public constructor DBAttachment(attId: String, content: ByteArray) defined in net.corda.node.services.persistence.NodeAttachmentService.DBAttachment[DeserializedClassConstructorDescriptor]

'id' @ [108:80] ==> val id: SecureHash defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`corrupt entry throws exception`.<anonymous>[LocalVariableDescriptor]

'toString' @ [108:83] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'bytes' @ [108:105] ==> val bytes: ByteArray defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`corrupt entry throws exception`.<anonymous>[LocalVariableDescriptor]

'DatabaseTransactionManager' @ [109:13] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [109:40] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[DeserializedSimpleFunctionDescriptor]

'session' @ [109:50] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[DeserializedPropertyDescriptor]

'merge' @ [109:58] ==> public abstract fun merge(p0: (Any..Any?)): (Any..Any?) defined in org.hibernate.Session[JavaMethodDescriptor]

'corruptAttachment' @ [109:64] ==> val corruptAttachment: NodeAttachmentService.DBAttachment defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`corrupt entry throws exception`.<anonymous>[LocalVariableDescriptor]

'id' @ [110:13] ==> val id: SecureHash defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`corrupt entry throws exception`.<anonymous>[LocalVariableDescriptor]

'database' @ [112:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.NodeAttachmentStorageTest[PropertyDescriptorImpl]

'transaction' @ [112:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> ByteArray): ByteArray defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArray

'NodeAttachmentService' @ [113:27] ==> public constructor NodeAttachmentService(metrics: MetricRegistry) defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedClassConstructorDescriptor]

'MetricRegistry' @ [113:49] ==> public constructor MetricRegistry() defined in com.codahale.metrics.MetricRegistry[JavaClassConstructorDescriptor]

'assertFailsWith' @ [114:21] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): NodeAttachmentService.HashMismatchException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> HashMismatchException

'storage' @ [115:17] ==> val storage: NodeAttachmentService defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`corrupt entry throws exception`.<anonymous>[LocalVariableDescriptor]

'openAttachment' @ [115:25] ==> public open fun openAttachment(id: SecureHash): Attachment? defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedSimpleFunctionDescriptor]

'id' @ [115:40] ==> val id: SecureHash defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`corrupt entry throws exception`[LocalVariableDescriptor]

'open' @ [115:46] ==> public abstract fun open(): InputStream defined in net.corda.core.contracts.Attachment[DeserializedSimpleFunctionDescriptor]

'use' @ [115:53] ==> @InlineOnly public inline fun <T : Closeable?, R> InputStream.use(block: (InputStream) -> ByteArray): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> InputStream
    <R> -> ByteArray

'it' @ [115:59] ==> value-parameter it: InputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`corrupt entry throws exception`.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'readBytes' @ [115:62] ==> public fun InputStream.readBytes(estimatedSize: Int = ...): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [117:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: SecureHash, actual: SecureHash, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> SecureHash

'e' @ [117:26] ==> val e: NodeAttachmentService.HashMismatchException defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`corrupt entry throws exception`.<anonymous>[LocalVariableDescriptor]

'expected' @ [117:28] ==> public final val expected: SecureHash defined in net.corda.node.services.persistence.NodeAttachmentService.HashMismatchException[DeserializedPropertyDescriptor]

'id' @ [117:38] ==> val id: SecureHash defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`corrupt entry throws exception`[LocalVariableDescriptor]

'storage' @ [120:13] ==> val storage: NodeAttachmentService defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`corrupt entry throws exception`.<anonymous>[LocalVariableDescriptor]

'openAttachment' @ [120:21] ==> public open fun openAttachment(id: SecureHash): Attachment? defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedSimpleFunctionDescriptor]

'id' @ [120:36] ==> val id: SecureHash defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`corrupt entry throws exception`[LocalVariableDescriptor]

'openAsJAR' @ [120:42] ==> public open fun openAsJAR(): JarInputStream defined in net.corda.core.contracts.Attachment[DeserializedSimpleFunctionDescriptor]

'use' @ [120:54] ==> @InlineOnly public inline fun <T : Closeable?, R> JarInputStream.use(block: (JarInputStream) -> ByteArray): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> JarInputStream
    <R> -> ByteArray

'it' @ [121:17] ==> value-parameter it: JarInputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`corrupt entry throws exception`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'nextJarEntry' @ [121:20] ==> public final val JarInputStream.nextJarEntry: (JarEntry..JarEntry?)[MyPropertyDescriptor]

'it' @ [122:17] ==> value-parameter it: JarInputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`corrupt entry throws exception`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'readBytes' @ [122:20] ==> public fun InputStream.readBytes(estimatedSize: Int = ...): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Test' @ [127:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'database' @ [129:9] ==> public final lateinit var database: CordaPersistence defined in net.corda.node.services.persistence.NodeAttachmentStorageTest[PropertyDescriptorImpl]

'transaction' @ [129:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> IllegalArgumentException /* = IllegalArgumentException */): IllegalArgumentException /* = IllegalArgumentException */ defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IllegalArgumentException

'NodeAttachmentService' @ [130:27] ==> public constructor NodeAttachmentService(metrics: MetricRegistry) defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedClassConstructorDescriptor]

'MetricRegistry' @ [130:49] ==> public constructor MetricRegistry() defined in com.codahale.metrics.MetricRegistry[JavaClassConstructorDescriptor]

'fs' @ [131:24] ==> public final lateinit var fs: FileSystem defined in net.corda.node.services.persistence.NodeAttachmentStorageTest[PropertyDescriptorImpl]

'getPath' @ [131:27] ==> public abstract fun getPath(p0: (String..String?), vararg p1: (String..String?)): (Path..Path?) defined in java.nio.file.FileSystem[JavaMethodDescriptor]

'path' @ [132:13] ==> val path: (Path..Path?) defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`non jar rejected`.<anonymous>[LocalVariableDescriptor]

'writeLines' @ [132:18] ==> public fun Path.writeLines(lines: Iterable<CharSequence>, charset: Charset = ..., vararg options: OpenOption): Path defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'listOf' @ [132:29] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'path' @ [133:13] ==> val path: (Path..Path?) defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`non jar rejected`.<anonymous>[LocalVariableDescriptor]

'read' @ [133:18] ==> public inline fun <R> Path.read(vararg options: OpenOption, block: (InputStream) -> IllegalArgumentException /* = IllegalArgumentException */): IllegalArgumentException /* = IllegalArgumentException */ defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> IllegalArgumentException

'assertFailsWith' @ [134:17] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalArgumentException

'storage' @ [135:21] ==> val storage: NodeAttachmentService defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`non jar rejected`.<anonymous>[LocalVariableDescriptor]

'importAttachment' @ [135:29] ==> public open fun importAttachment(jar: InputStream): SecureHash defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedSimpleFunctionDescriptor]

'it' @ [135:46] ==> value-parameter it: InputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.`non jar rejected`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'counter' @ [143:9] ==> private final var counter: Int defined in net.corda.node.services.persistence.NodeAttachmentStorageTest[PropertyDescriptorImpl]

'fs' @ [144:20] ==> public final lateinit var fs: FileSystem defined in net.corda.node.services.persistence.NodeAttachmentStorageTest[PropertyDescriptorImpl]

'getPath' @ [144:23] ==> public abstract fun getPath(p0: (String..String?), vararg p1: (String..String?)): (Path..Path?) defined in java.nio.file.FileSystem[JavaMethodDescriptor]

'counter' @ [144:33] ==> private final var counter: Int defined in net.corda.node.services.persistence.NodeAttachmentStorageTest[PropertyDescriptorImpl]

'file' @ [145:9] ==> val file: (Path..Path?) defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.makeTestJar[LocalVariableDescriptor]

'write' @ [145:14] ==> public inline fun Path.write(createDirs: Boolean = ..., vararg options: OpenOption = ..., block: (OutputStream) -> Unit): Unit defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'JarOutputStream' @ [146:23] ==> public constructor JarOutputStream(p0: (OutputStream..OutputStream?)) defined in java.util.jar.JarOutputStream[JavaClassConstructorDescriptor]

'it' @ [146:39] ==> value-parameter it: OutputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.makeTestJar.<anonymous>[ValueParameterDescriptorImpl]

'jar' @ [147:13] ==> val jar: JarOutputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.makeTestJar.<anonymous>[LocalVariableDescriptor]

'putNextEntry' @ [147:17] ==> public open fun putNextEntry(p0: (ZipEntry..ZipEntry?)): Unit defined in java.util.jar.JarOutputStream[JavaMethodDescriptor]

'JarEntry' @ [147:30] ==> public constructor JarEntry(p0: (String..String?)) defined in java.util.jar.JarEntry[JavaClassConstructorDescriptor]

'jar' @ [148:13] ==> val jar: JarOutputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.makeTestJar.<anonymous>[LocalVariableDescriptor]

'write' @ [148:17] ==> public open fun write(p0: (ByteArray..ByteArray?)): Unit defined in java.util.jar.JarOutputStream[JavaMethodDescriptor]

'toByteArray' @ [148:53] ==> @InlineOnly public inline fun String.toByteArray(charset: Charset = ...): ByteArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'jar' @ [149:13] ==> val jar: JarOutputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.makeTestJar.<anonymous>[LocalVariableDescriptor]

'closeEntry' @ [149:17] ==> public open fun closeEntry(): Unit defined in java.util.jar.JarOutputStream[JavaMethodDescriptor]

'jar' @ [150:13] ==> val jar: JarOutputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.makeTestJar.<anonymous>[LocalVariableDescriptor]

'putNextEntry' @ [150:17] ==> public open fun putNextEntry(p0: (ZipEntry..ZipEntry?)): Unit defined in java.util.jar.JarOutputStream[JavaMethodDescriptor]

'JarEntry' @ [150:30] ==> public constructor JarEntry(p0: (String..String?)) defined in java.util.jar.JarEntry[JavaClassConstructorDescriptor]

'jar' @ [151:13] ==> val jar: JarOutputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.makeTestJar.<anonymous>[LocalVariableDescriptor]

'write' @ [151:17] ==> public open fun write(p0: (ByteArray..ByteArray?)): Unit defined in java.util.jar.JarOutputStream[JavaMethodDescriptor]

'toByteArray' @ [151:50] ==> @InlineOnly public inline fun String.toByteArray(charset: Charset = ...): ByteArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'jar' @ [152:13] ==> val jar: JarOutputStream defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.makeTestJar.<anonymous>[LocalVariableDescriptor]

'closeEntry' @ [152:17] ==> public open fun closeEntry(): Unit defined in java.util.jar.JarOutputStream[JavaMethodDescriptor]

'file' @ [154:16] ==> val file: (Path..Path?) defined in net.corda.node.services.persistence.NodeAttachmentStorageTest.makeTestJar[LocalVariableDescriptor]

