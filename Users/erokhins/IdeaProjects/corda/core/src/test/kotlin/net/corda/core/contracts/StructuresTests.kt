'Test' @ [19:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'spy' @ [22:27] ==> public fun <T> spy(value: ByteArrayInputStream): ByteArrayInputStream defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArrayInputStream

'ByteArrayOutputStream' @ [22:31] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'apply' @ [22:55] ==> @InlineOnly public inline fun <T> ByteArrayOutputStream.apply(block: ByteArrayOutputStream.() -> Unit): ByteArrayOutputStream defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArrayOutputStream

'ZipOutputStream' @ [23:13] ==> public constructor ZipOutputStream(p0: (OutputStream..OutputStream?)) defined in java.util.zip.ZipOutputStream[JavaClassConstructorDescriptor]

'this' @ [23:29] ==> <this> defined in net.corda.core.contracts.AttachmentTest.`openAsJAR does not leak file handle if attachment has corrupted manifest`.<anonymous>[ReceiverParameterDescriptorImpl]

'use' @ [23:35] ==> @InlineOnly public inline fun <T : Closeable?, R> ZipOutputStream.use(block: (ZipOutputStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> ZipOutputStream
    <R> -> Unit

'with' @ [24:17] ==> @InlineOnly public inline fun <T, R> with(receiver: ZipOutputStream, block: ZipOutputStream.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ZipOutputStream
    <R> -> Unit

'it' @ [24:22] ==> value-parameter it: ZipOutputStream defined in net.corda.core.contracts.AttachmentTest.`openAsJAR does not leak file handle if attachment has corrupted manifest`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'putNextEntry' @ [25:21] ==> public open fun putNextEntry(p0: (ZipEntry..ZipEntry?)): Unit defined in java.util.zip.ZipOutputStream[JavaMethodDescriptor]

'ZipEntry' @ [25:34] ==> public constructor ZipEntry(p0: (String..String?)) defined in java.util.zip.ZipEntry[JavaClassConstructorDescriptor]

'MANIFEST_NAME' @ [25:43] ==> public const final val MANIFEST_NAME: String defined in java.util.jar.JarFile[JavaPropertyDescriptor]

'write' @ [26:21] ==> public open fun write(p0: (ByteArray..ByteArray?)): Unit defined in java.util.zip.ZipOutputStream[JavaMethodDescriptor]

'ByteArray' @ [26:27] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'toByteArray' @ [29:11] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'inputStream' @ [29:25] ==> @InlineOnly public inline fun ByteArray.inputStream(): ByteArrayInputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'apply' @ [29:40] ==> @InlineOnly public inline fun <T> ByteArrayInputStream.apply(block: ByteArrayInputStream.() -> Unit): ByteArrayInputStream defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArrayInputStream

'doAnswer' @ [29:48] ==> public fun <T> doAnswer(answer: (InvocationOnMock) -> Unit?): Stubber defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'closeCalls' @ [29:59] ==> var closeCalls: Int defined in net.corda.core.contracts.AttachmentTest.`openAsJAR does not leak file handle if attachment has corrupted manifest`[LocalVariableDescriptor]

'whenever' @ [29:77] ==> public fun <T> Stubber.whenever(mock: ByteArrayInputStream): (ByteArrayInputStream..ByteArrayInputStream?) defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArrayInputStream

'this' @ [29:86] ==> <this> defined in net.corda.core.contracts.AttachmentTest.`openAsJAR does not leak file handle if attachment has corrupted manifest`.<anonymous>[ReceiverParameterDescriptorImpl]

'close' @ [29:92] ==> public open fun close(): Unit defined in java.io.ByteArrayInputStream[JavaMethodDescriptor]

'UnsupportedOperationException' @ [31:43] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'inputStream' @ [32:35] ==> val inputStream: ByteArrayInputStream defined in net.corda.core.contracts.AttachmentTest.`openAsJAR does not leak file handle if attachment has corrupted manifest`[LocalVariableDescriptor]

'attachment' @ [35:13] ==> val attachment: <no name provided> defined in net.corda.core.contracts.AttachmentTest.`openAsJAR does not leak file handle if attachment has corrupted manifest`[LocalVariableDescriptor]

'openAsJAR' @ [35:24] ==> public open fun openAsJAR(): JarInputStream defined in net.corda.core.contracts.AttachmentTest.`openAsJAR does not leak file handle if attachment has corrupted manifest`.<no name provided>[DeserializedSimpleFunctionDescriptor]

'fail' @ [36:13] ==> public fun fail(message: String? = ...): Nothing defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [38:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'e' @ [38:43] ==> val e: IOException defined in net.corda.core.contracts.AttachmentTest.`openAsJAR does not leak file handle if attachment has corrupted manifest`[LocalVariableDescriptor]

'message' @ [38:45] ==> public open val message: String? defined in java.io.IOException[DeserializedPropertyDescriptor]

'assertEquals' @ [40:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'closeCalls' @ [40:25] ==> var closeCalls: Int defined in net.corda.core.contracts.AttachmentTest.`openAsJAR does not leak file handle if attachment has corrupted manifest`[LocalVariableDescriptor]

'Test' @ [47:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [49:19] ==> public fun <T> listOf(vararg elements: UniqueIdentifier): List<UniqueIdentifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UniqueIdentifier

'UniqueIdentifier' @ [49:26] ==> public companion object defined in net.corda.core.contracts.UniqueIdentifier[FakeCallableDescriptorForObject]

'fromString' @ [49:43] ==> public final fun fromString(name: String): UniqueIdentifier defined in net.corda.core.contracts.UniqueIdentifier.Companion[DeserializedSimpleFunctionDescriptor]

'UniqueIdentifier' @ [50:17] ==> public companion object defined in net.corda.core.contracts.UniqueIdentifier[FakeCallableDescriptorForObject]

'fromString' @ [50:34] ==> public final fun fromString(name: String): UniqueIdentifier defined in net.corda.core.contracts.UniqueIdentifier.Companion[DeserializedSimpleFunctionDescriptor]

'UniqueIdentifier' @ [51:17] ==> public constructor UniqueIdentifier(externalId: String? = ..., id: UUID = ...) defined in net.corda.core.contracts.UniqueIdentifier[DeserializedClassConstructorDescriptor]

'fromString' @ [51:47] ==> public open fun fromString(p0: (String..String?)): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'assertEquals' @ [53:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'-' @ [53:22] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ids' @ [53:26] ==> val ids: List<UniqueIdentifier> defined in net.corda.core.contracts.UniqueIdentifierTests.`unique identifier comparison`[LocalVariableDescriptor]

'compareTo' @ [53:33] ==> public open fun compareTo(other: UniqueIdentifier): Int defined in net.corda.core.contracts.UniqueIdentifier[DeserializedSimpleFunctionDescriptor]

'ids' @ [53:43] ==> val ids: List<UniqueIdentifier> defined in net.corda.core.contracts.UniqueIdentifierTests.`unique identifier comparison`[LocalVariableDescriptor]

'assertEquals' @ [54:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'ids' @ [54:25] ==> val ids: List<UniqueIdentifier> defined in net.corda.core.contracts.UniqueIdentifierTests.`unique identifier comparison`[LocalVariableDescriptor]

'compareTo' @ [54:32] ==> public open fun compareTo(other: UniqueIdentifier): Int defined in net.corda.core.contracts.UniqueIdentifier[DeserializedSimpleFunctionDescriptor]

'ids' @ [54:42] ==> val ids: List<UniqueIdentifier> defined in net.corda.core.contracts.UniqueIdentifierTests.`unique identifier comparison`[LocalVariableDescriptor]

'assertEquals' @ [55:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'ids' @ [55:25] ==> val ids: List<UniqueIdentifier> defined in net.corda.core.contracts.UniqueIdentifierTests.`unique identifier comparison`[LocalVariableDescriptor]

'compareTo' @ [55:32] ==> public open fun compareTo(other: UniqueIdentifier): Int defined in net.corda.core.contracts.UniqueIdentifier[DeserializedSimpleFunctionDescriptor]

'ids' @ [55:42] ==> val ids: List<UniqueIdentifier> defined in net.corda.core.contracts.UniqueIdentifierTests.`unique identifier comparison`[LocalVariableDescriptor]

'assertEquals' @ [57:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'ids' @ [57:25] ==> val ids: List<UniqueIdentifier> defined in net.corda.core.contracts.UniqueIdentifierTests.`unique identifier comparison`[LocalVariableDescriptor]

'compareTo' @ [57:32] ==> public open fun compareTo(other: UniqueIdentifier): Int defined in net.corda.core.contracts.UniqueIdentifier[DeserializedSimpleFunctionDescriptor]

'ids' @ [57:42] ==> val ids: List<UniqueIdentifier> defined in net.corda.core.contracts.UniqueIdentifierTests.`unique identifier comparison`[LocalVariableDescriptor]

'Test' @ [60:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [62:19] ==> public fun <T> listOf(vararg elements: UniqueIdentifier): List<UniqueIdentifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UniqueIdentifier

'UniqueIdentifier' @ [62:26] ==> public companion object defined in net.corda.core.contracts.UniqueIdentifier[FakeCallableDescriptorForObject]

'fromString' @ [62:43] ==> public final fun fromString(name: String): UniqueIdentifier defined in net.corda.core.contracts.UniqueIdentifier.Companion[DeserializedSimpleFunctionDescriptor]

'UniqueIdentifier' @ [63:17] ==> public companion object defined in net.corda.core.contracts.UniqueIdentifier[FakeCallableDescriptorForObject]

'fromString' @ [63:34] ==> public final fun fromString(name: String): UniqueIdentifier defined in net.corda.core.contracts.UniqueIdentifier.Companion[DeserializedSimpleFunctionDescriptor]

'UniqueIdentifier' @ [64:17] ==> public constructor UniqueIdentifier(externalId: String? = ..., id: UUID = ...) defined in net.corda.core.contracts.UniqueIdentifier[DeserializedClassConstructorDescriptor]

'fromString' @ [64:47] ==> public open fun fromString(p0: (String..String?)): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'assertEquals' @ [66:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: UniqueIdentifier, actual: UniqueIdentifier, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> UniqueIdentifier

'ids' @ [66:22] ==> val ids: List<UniqueIdentifier> defined in net.corda.core.contracts.UniqueIdentifierTests.`unique identifier equality`[LocalVariableDescriptor]

'ids' @ [66:30] ==> val ids: List<UniqueIdentifier> defined in net.corda.core.contracts.UniqueIdentifierTests.`unique identifier equality`[LocalVariableDescriptor]

'assertNotEquals' @ [67:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: UniqueIdentifier, actual: UniqueIdentifier, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> UniqueIdentifier

'ids' @ [67:25] ==> val ids: List<UniqueIdentifier> defined in net.corda.core.contracts.UniqueIdentifierTests.`unique identifier equality`[LocalVariableDescriptor]

'ids' @ [67:33] ==> val ids: List<UniqueIdentifier> defined in net.corda.core.contracts.UniqueIdentifierTests.`unique identifier equality`[LocalVariableDescriptor]

'assertEquals' @ [68:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'ids' @ [68:22] ==> val ids: List<UniqueIdentifier> defined in net.corda.core.contracts.UniqueIdentifierTests.`unique identifier equality`[LocalVariableDescriptor]

'hashCode' @ [68:29] ==> public open fun hashCode(): Int defined in net.corda.core.contracts.UniqueIdentifier[DeserializedSimpleFunctionDescriptor]

'ids' @ [68:41] ==> val ids: List<UniqueIdentifier> defined in net.corda.core.contracts.UniqueIdentifierTests.`unique identifier equality`[LocalVariableDescriptor]

'hashCode' @ [68:48] ==> public open fun hashCode(): Int defined in net.corda.core.contracts.UniqueIdentifier[DeserializedSimpleFunctionDescriptor]

'assertNotEquals' @ [69:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'ids' @ [69:25] ==> val ids: List<UniqueIdentifier> defined in net.corda.core.contracts.UniqueIdentifierTests.`unique identifier equality`[LocalVariableDescriptor]

'hashCode' @ [69:32] ==> public open fun hashCode(): Int defined in net.corda.core.contracts.UniqueIdentifier[DeserializedSimpleFunctionDescriptor]

'ids' @ [69:44] ==> val ids: List<UniqueIdentifier> defined in net.corda.core.contracts.UniqueIdentifierTests.`unique identifier equality`[LocalVariableDescriptor]

'hashCode' @ [69:51] ==> public open fun hashCode(): Int defined in net.corda.core.contracts.UniqueIdentifier[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [71:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: UniqueIdentifier, actual: UniqueIdentifier, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> UniqueIdentifier

'ids' @ [71:22] ==> val ids: List<UniqueIdentifier> defined in net.corda.core.contracts.UniqueIdentifierTests.`unique identifier equality`[LocalVariableDescriptor]

'ids' @ [71:30] ==> val ids: List<UniqueIdentifier> defined in net.corda.core.contracts.UniqueIdentifierTests.`unique identifier equality`[LocalVariableDescriptor]

'assertEquals' @ [72:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'ids' @ [72:22] ==> val ids: List<UniqueIdentifier> defined in net.corda.core.contracts.UniqueIdentifierTests.`unique identifier equality`[LocalVariableDescriptor]

'hashCode' @ [72:29] ==> public open fun hashCode(): Int defined in net.corda.core.contracts.UniqueIdentifier[DeserializedSimpleFunctionDescriptor]

'ids' @ [72:41] ==> val ids: List<UniqueIdentifier> defined in net.corda.core.contracts.UniqueIdentifierTests.`unique identifier equality`[LocalVariableDescriptor]

'hashCode' @ [72:48] ==> public open fun hashCode(): Int defined in net.corda.core.contracts.UniqueIdentifier[DeserializedSimpleFunctionDescriptor]

