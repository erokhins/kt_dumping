'JvmName' @ [1:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'CordaSerializable' @ [38:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'CordaSerializable' @ [99:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'JvmOverloads' @ [100:52] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'withNotary' @ [126:67] ==> public infix fun <T : ContractState> T.withNotary(newNotary: Party): TransactionState<T> defined in net.corda.core.contracts[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'newNotary' @ [126:78] ==> value-parameter newNotary: Party defined in net.corda.core.contracts.`with notary`[ValueParameterDescriptorImpl]

'TransactionState' @ [128:64] ==> @JvmOverloads public constructor TransactionState<out T : ContractState>(data: T, notary: Party, encumbrance: Int? = ...) defined in net.corda.core.contracts.TransactionState[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : ContractState> -> T

'this' @ [128:81] ==> <this> defined in net.corda.core.contracts.withNotary[ReceiverParameterDescriptorImpl]

'newNotary' @ [128:87] ==> value-parameter newNotary: Party defined in net.corda.core.contracts.withNotary[ValueParameterDescriptorImpl]

'CordaSerializable' @ [150:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'product' @ [152:33] ==> public final val product: P defined in net.corda.core.contracts.Issued[PropertyDescriptorImpl]

'issuer' @ [152:52] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[PropertyDescriptorImpl]

'Amount' @ [160:62] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: T) defined in net.corda.core.contracts.Amount[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> T

'quantity' @ [160:69] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[PropertyDescriptorImpl]

'token' @ [160:79] ==> public final val token: Issued<T> defined in net.corda.core.contracts.Amount[PropertyDescriptorImpl]

'product' @ [160:85] ==> public final val product: T defined in net.corda.core.contracts.Issued[PropertyDescriptorImpl]

'SecureHash' @ [244:40] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'sha256' @ [244:51] ==> @JvmStatic public final fun sha256(bytes: ByteArray): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[SimpleFunctionDescriptorImpl]

'serialize' @ [244:58] ==> public fun <T : Any> ContractState.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<ContractState> defined in net.corda.core.serialization[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> ContractState

'bytes' @ [244:70] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[PropertyDescriptorImpl]

'CordaSerializable' @ [250:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'txhash' @ [253:33] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'index' @ [253:41] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'CordaSerializable' @ [258:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'mapNotNull' @ [265:12] ==> public inline fun <T, R : Any> Iterable<StateAndRef<ContractState>>.mapNotNull(transform: (StateAndRef<ContractState>) -> StateAndRef<T>?): List<StateAndRef<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <R : Any> -> StateAndRef<T>

'if (it.state.data is T) StateAndRef(TransactionState(it.state.data, it.state.notary), it.ref) else null' @ [265:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: StateAndRef<T>?, elseBranch: StateAndRef<T>?): StateAndRef<T>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> StateAndRef<T>?

'it' @ [265:29] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.core.contracts.filterStatesOfType.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [265:32] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [265:38] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'StateAndRef' @ [265:49] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<T>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : ContractState> -> T

'TransactionState' @ [265:61] ==> @JvmOverloads public constructor TransactionState<out T : ContractState>(data: T, notary: Party, encumbrance: Int? = ...) defined in net.corda.core.contracts.TransactionState[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : ContractState> -> T

'it' @ [265:78] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.core.contracts.filterStatesOfType.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [265:81] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [265:87] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'it' @ [265:93] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.core.contracts.filterStatesOfType.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [265:96] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'notary' @ [265:102] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'it' @ [265:111] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.core.contracts.filterStatesOfType.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [265:114] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'CordaSerializable' @ [272:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'party' @ [274:33] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[PropertyDescriptorImpl]

'reference' @ [274:39] ==> public final val reference: OpaqueBytes defined in net.corda.core.contracts.PartyAndReference[PropertyDescriptorImpl]

'CordaSerializable' @ [278:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'other' @ [283:40] ==> value-parameter other: Any? defined in net.corda.core.contracts.TypeOnlyCommandData.equals[ValueParameterDescriptorImpl]

'javaClass' @ [283:47] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'javaClass' @ [283:60] ==> public val <T : Any> TypeOnlyCommandData.javaClass: Class<TypeOnlyCommandData> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> TypeOnlyCommandData

'javaClass' @ [284:31] ==> public val <T : Any> TypeOnlyCommandData.javaClass: Class<TypeOnlyCommandData> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> TypeOnlyCommandData

'name' @ [284:41] ==> public final val <T : (Any..Any?)> Class<TypeOnlyCommandData>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TypeOnlyCommandData

'hashCode' @ [284:46] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'CordaSerializable' @ [288:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'require' @ [292:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'signers' @ [292:17] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.Command[PropertyDescriptorImpl]

'isNotEmpty' @ [292:25] ==> @InlineOnly public inline fun <T> Collection<PublicKey>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'this' @ [295:44] ==> public constructor Command<T : CommandData>(value: T, signers: List<PublicKey>) defined in net.corda.core.contracts.Command[ClassConstructorDescriptorImpl]
Inferred types:
    <T : CommandData> -> T

'data' @ [295:49] ==> value-parameter data: T defined in net.corda.core.contracts.Command.<init>[ValueParameterDescriptorImpl]

'listOf' @ [295:55] ==> public fun <T> listOf(element: PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'key' @ [295:62] ==> value-parameter key: PublicKey defined in net.corda.core.contracts.Command.<init>[ValueParameterDescriptorImpl]

'value' @ [297:41] ==> public final val value: T defined in net.corda.core.contracts.Command[PropertyDescriptorImpl]

'toString' @ [297:47] ==> public open fun toString(): String defined in net.corda.core.contracts.CommandData[DeserializedSimpleFunctionDescriptor]

'let' @ [297:58] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'if (it.contains("@")) it.replace('$', '.').split("@")[0] else it' @ [297:64] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'it' @ [297:68] ==> value-parameter it: String defined in net.corda.core.contracts.Command.commandDataToString.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [297:71] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [297:86] ==> value-parameter it: String defined in net.corda.core.contracts.Command.commandDataToString.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [297:89] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'split' @ [297:107] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [297:126] ==> value-parameter it: String defined in net.corda.core.contracts.Command.commandDataToString.<anonymous>[ValueParameterDescriptorImpl]

'commandDataToString' @ [298:34] ==> private final fun commandDataToString(): String defined in net.corda.core.contracts.Command[SimpleFunctionDescriptorImpl]

'signers' @ [298:72] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.Command[PropertyDescriptorImpl]

'joinToString' @ [298:80] ==> public fun <T> Iterable<PublicKey>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((PublicKey) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'CordaSerializable' @ [316:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'CordaSerializable' @ [334:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'Throws' @ [342:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IllegalArgumentException' @ [342:13] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'Target' @ [348:1] ==> public constructor Target(vararg allowedTargets: AnnotationTarget) defined in kotlin.annotation.Target[DeserializedClassConstructorDescriptor]

'CLASS' @ [348:26] ==> enum entry CLASS defined in kotlin.annotation.AnnotationTarget[FakeCallableDescriptorForObject]

'MustBeDocumented' @ [349:1] ==> public constructor MustBeDocumented() defined in kotlin.annotation.MustBeDocumented[DeserializedClassConstructorDescriptor]

'open' @ [386:22] ==> public abstract fun open(): InputStream defined in net.corda.core.contracts.Attachment[SimpleFunctionDescriptorImpl]

'JarInputStream' @ [388:20] ==> public constructor JarInputStream(p0: (InputStream..InputStream?)) defined in java.util.jar.JarInputStream[JavaClassConstructorDescriptor]

'stream' @ [388:35] ==> val stream: InputStream defined in net.corda.core.contracts.Attachment.openAsJAR[LocalVariableDescriptor]

'stream' @ [390:13] ==> val stream: InputStream defined in net.corda.core.contracts.Attachment.openAsJAR[LocalVariableDescriptor]

'use' @ [390:20] ==> @InlineOnly public inline fun <T : Closeable?, R> InputStream.use(block: (InputStream) -> Nothing): Nothing defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> InputStream
    <R> -> Nothing

't' @ [390:32] ==> val t: Throwable defined in net.corda.core.contracts.Attachment.openAsJAR[LocalVariableDescriptor]

'openAsJAR' @ [399:61] ==> public open fun openAsJAR(): JarInputStream defined in net.corda.core.contracts.Attachment[SimpleFunctionDescriptorImpl]

'use' @ [399:73] ==> @InlineOnly public inline fun <T : Closeable?, R> JarInputStream.use(block: (JarInputStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> JarInputStream
    <R> -> Unit

'it' @ [399:79] ==> value-parameter it: JarInputStream defined in net.corda.core.contracts.Attachment.extractFile.<anonymous>[ValueParameterDescriptorImpl]

'extractFile' @ [399:82] ==> @Throws public fun JarInputStream.extractFile(path: String, outputTo: OutputStream): Unit defined in net.corda.core.contracts in file Structures.kt[SimpleFunctionDescriptorImpl]

'path' @ [399:94] ==> value-parameter path: String defined in net.corda.core.contracts.Attachment.extractFile[ValueParameterDescriptorImpl]

'outputTo' @ [399:100] ==> value-parameter outputTo: OutputStream defined in net.corda.core.contracts.Attachment.extractFile[ValueParameterDescriptorImpl]

'serviceHub' @ [406:25] ==> public abstract val serviceHub: ServiceHub defined in net.corda.core.serialization.SerializeAsTokenContext[PropertyDescriptorImpl]

'attachments' @ [406:36] ==> public abstract val attachments: AttachmentStorage defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'openAttachment' @ [406:48] ==> public abstract fun openAttachment(id: SecureHash): Attachment? defined in net.corda.core.node.services.AttachmentStorage[SimpleFunctionDescriptorImpl]

'id' @ [406:63] ==> value-parameter id: SecureHash defined in net.corda.core.contracts.AbstractAttachment.Companion.attachmentDataLoader[ValueParameterDescriptorImpl]

'MissingAttachmentsException' @ [406:76] ==> public constructor MissingAttachmentsException(ids: List<SecureHash>) defined in net.corda.core.serialization.MissingAttachmentsException[ClassConstructorDescriptorImpl]

'listOf' @ [406:104] ==> public fun <T> listOf(element: SecureHash): List<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'id' @ [406:111] ==> value-parameter id: SecureHash defined in net.corda.core.contracts.AbstractAttachment.Companion.attachmentDataLoader[ValueParameterDescriptorImpl]

'?:' @ [407:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ByteArray?, right: ByteArray): ByteArray[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ByteArray

'a' @ [407:18] ==> val a: Attachment defined in net.corda.core.contracts.AbstractAttachment.Companion.attachmentDataLoader.<anonymous>[LocalVariableDescriptor]

'attachmentData' @ [407:45] ==> protected final val attachmentData: ByteArray defined in net.corda.core.contracts.AbstractAttachment[PropertyDescriptorImpl]

'a' @ [407:63] ==> val a: Attachment defined in net.corda.core.contracts.AbstractAttachment.Companion.attachmentDataLoader.<anonymous>[LocalVariableDescriptor]

'open' @ [407:65] ==> public abstract fun open(): InputStream defined in net.corda.core.contracts.Attachment[SimpleFunctionDescriptorImpl]

'use' @ [407:72] ==> @InlineOnly public inline fun <T : Closeable?, R> InputStream.use(block: (InputStream) -> ByteArray): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> InputStream
    <R> -> ByteArray

'it' @ [407:78] ==> value-parameter it: InputStream defined in net.corda.core.contracts.AbstractAttachment.Companion.attachmentDataLoader.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'readBytes' @ [407:81] ==> public fun InputStream.readBytes(estimatedSize: Int = ...): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'lazy' @ [412:48] ==> public fun <T> lazy(initializer: () -> ByteArray): Lazy<ByteArray> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArray

'dataLoader' @ [412:53] ==> value-parameter dataLoader: () -> ByteArray defined in net.corda.core.contracts.AbstractAttachment.<init>[ValueParameterDescriptorImpl]

'attachmentData' @ [413:40] ==> protected final val attachmentData: ByteArray defined in net.corda.core.contracts.AbstractAttachment[PropertyDescriptorImpl]

'inputStream' @ [413:55] ==> @InlineOnly public inline fun ByteArray.inputStream(): ByteArrayInputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'other' @ [414:40] ==> value-parameter other: Any? defined in net.corda.core.contracts.AbstractAttachment.equals[ValueParameterDescriptorImpl]

'this' @ [414:50] ==> <this> defined in net.corda.core.contracts.AbstractAttachment[LazyClassReceiverParameterDescriptor]

'other' @ [414:58] ==> value-parameter other: Any? defined in net.corda.core.contracts.AbstractAttachment.equals[ValueParameterDescriptorImpl]

'other' @ [414:81] ==> value-parameter other: Any? defined in net.corda.core.contracts.AbstractAttachment.equals[ValueParameterDescriptorImpl]

'id' @ [414:87] ==> public abstract val id: SecureHash defined in net.corda.core.contracts.Attachment[PropertyDescriptorImpl]

'this' @ [414:93] ==> <this> defined in net.corda.core.contracts.AbstractAttachment[LazyClassReceiverParameterDescriptor]

'id' @ [414:98] ==> public abstract val id: SecureHash defined in net.corda.core.contracts.AbstractAttachment[PropertyDescriptorImpl]

'id' @ [415:31] ==> public abstract val id: SecureHash defined in net.corda.core.contracts.AbstractAttachment[PropertyDescriptorImpl]

'hashCode' @ [415:34] ==> public open fun hashCode(): Int defined in net.corda.core.crypto.SecureHash[SimpleFunctionDescriptorImpl]

'javaClass' @ [416:34] ==> public val <T : Any> AbstractAttachment.javaClass: Class<AbstractAttachment> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> AbstractAttachment

'simpleName' @ [416:44] ==> public final val <T : (Any..Any?)> Class<AbstractAttachment>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AbstractAttachment

'id' @ [416:60] ==> public abstract val id: SecureHash defined in net.corda.core.contracts.AbstractAttachment[PropertyDescriptorImpl]

'Throws' @ [419:1] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [419:9] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'path' @ [421:13] ==> value-parameter path: String defined in net.corda.core.contracts.extractFile[ValueParameterDescriptorImpl]

'toLowerCase' @ [421:18] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'split' @ [421:32] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'nextJarEntry' @ [423:17] ==> public final val JarInputStream.nextJarEntry: (JarEntry..JarEntry?)[MyPropertyDescriptor]

'!' @ [424:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'e' @ [424:14] ==> val e: JarEntry defined in net.corda.core.contracts.extractFile[LocalVariableDescriptor]

'isDirectory' @ [424:16] ==> public final val JarEntry.isDirectory: Boolean[MyPropertyDescriptor]

'e' @ [424:31] ==> val e: JarEntry defined in net.corda.core.contracts.extractFile[LocalVariableDescriptor]

'name' @ [424:33] ==> public final val JarEntry.name: (String..String?)[MyPropertyDescriptor]

'toLowerCase' @ [424:38] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'split' @ [424:52] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'p' @ [424:72] ==> val p: List<String> defined in net.corda.core.contracts.extractFile[LocalVariableDescriptor]

'copyTo' @ [425:13] ==> public fun InputStream.copyTo(out: OutputStream, bufferSize: Int = ...): Long defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'outputTo' @ [425:20] ==> value-parameter outputTo: OutputStream defined in net.corda.core.contracts.extractFile[ValueParameterDescriptorImpl]

'closeEntry' @ [428:9] ==> public open fun closeEntry(): Unit defined in java.util.jar.JarInputStream[JavaMethodDescriptor]

'FileNotFoundException' @ [430:11] ==> public constructor FileNotFoundException(p0: (String..String?)) defined in java.io.FileNotFoundException[JavaClassConstructorDescriptor]

'path' @ [430:33] ==> value-parameter path: String defined in net.corda.core.contracts.extractFile[ValueParameterDescriptorImpl]

'CordaSerializable' @ [442:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'OpaqueBytes' @ [443:39] ==> public constructor OpaqueBytes(bytes: ByteArray) defined in net.corda.core.utilities.OpaqueBytes[ClassConstructorDescriptorImpl]

'bytes' @ [443:51] ==> value-parameter bytes: ByteArray defined in net.corda.core.contracts.PrivacySalt.<init>[ValueParameterDescriptorImpl]

'this' @ [445:21] ==> public constructor PrivacySalt(bytes: ByteArray) defined in net.corda.core.contracts.PrivacySalt[ClassConstructorDescriptorImpl]

'secureRandomBytes' @ [445:26] ==> @Throws public fun secureRandomBytes(numOfBytes: Int): ByteArray defined in net.corda.core.crypto in file CryptoUtils.kt[SimpleFunctionDescriptorImpl]

'require' @ [448:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bytes' @ [448:17] ==> value-parameter bytes: ByteArray defined in net.corda.core.contracts.PrivacySalt.<init>[ValueParameterDescriptorImpl]

'size' @ [448:23] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'require' @ [449:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [449:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'bytes' @ [449:18] ==> value-parameter bytes: ByteArray defined in net.corda.core.contracts.PrivacySalt.<init>[ValueParameterDescriptorImpl]

'all' @ [449:24] ==> public inline fun ByteArray.all(predicate: (Byte) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'it' @ [449:30] ==> value-parameter it: Byte defined in net.corda.core.contracts.PrivacySalt.<init>.<anonymous>[ValueParameterDescriptorImpl]

'toByte' @ [449:38] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

