'loggerFor' @ [13:23] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ServiceIdentityGenerator

'log' @ [30:9] ==> private final val log: Logger defined in net.corda.node.utilities.ServiceIdentityGenerator[PropertyDescriptorImpl]

'trace' @ [30:13] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'dirs' @ [30:79] ==> value-parameter dirs: List<Path> defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk[ValueParameterDescriptorImpl]

'joinToString' @ [30:84] ==> public fun <T> Iterable<Path>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Path) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Path

'..' @ [31:25] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'dirs' @ [31:28] ==> value-parameter dirs: List<Path> defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk[ValueParameterDescriptorImpl]

'size' @ [31:33] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'map' @ [31:39] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> KeyPair): List<KeyPair> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> KeyPair

'generateKeyPair' @ [31:45] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'CompositeKey' @ [32:25] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [32:38] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [32:48] ==> public final fun addKeys(keys: List<PublicKey>): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'keyPairs' @ [32:56] ==> val keyPairs: List<KeyPair> defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk[LocalVariableDescriptor]

'map' @ [32:65] ==> public inline fun <T, R> Iterable<KeyPair>.map(transform: (KeyPair) -> (PublicKey..PublicKey?)): List<(PublicKey..PublicKey?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KeyPair
    <R> -> (java.security.PublicKey..java.security.PublicKey?)

'it' @ [32:71] ==> value-parameter it: KeyPair defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk.<anonymous>[ValueParameterDescriptorImpl]

'public' @ [32:74] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'build' @ [32:84] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'threshold' @ [32:90] ==> value-parameter threshold: Int = ... defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk[ValueParameterDescriptorImpl]

'serviceId' @ [34:32] ==> value-parameter serviceId: String defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk[ValueParameterDescriptorImpl]

'serviceId' @ [35:31] ==> value-parameter serviceId: String defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk[ValueParameterDescriptorImpl]

'serviceId' @ [36:34] ==> value-parameter serviceId: String defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk[ValueParameterDescriptorImpl]

'keyPairs' @ [37:9] ==> val keyPairs: List<KeyPair> defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk[LocalVariableDescriptor]

'zip' @ [37:18] ==> public inline fun <T, R, V> Iterable<KeyPair>.zip(other: Iterable<Path>, transform: (KeyPair, Path) -> (Path..Path?)): List<(Path..Path?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KeyPair
    <R> -> Path
    <V> -> (java.nio.file.Path..java.nio.file.Path?)

'dirs' @ [37:22] ==> value-parameter dirs: List<Path> defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk[ValueParameterDescriptorImpl]

'createDirectories' @ [38:19] ==> public open fun createDirectories(p0: (Path..Path?), vararg p1: (FileAttribute<*>..FileAttribute<*>?)): (Path..Path?) defined in java.nio.file.Files[JavaMethodDescriptor]

'dir' @ [38:37] ==> value-parameter dir: Path defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk.<anonymous>[ValueParameterDescriptorImpl]

'write' @ [39:19] ==> public open fun write(p0: (Path..Path?), p1: (ByteArray..ByteArray?), vararg p2: (OpenOption..OpenOption?)): (Path..Path?) defined in java.nio.file.Files[JavaMethodDescriptor]

'dir' @ [39:25] ==> value-parameter dir: Path defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk.<anonymous>[ValueParameterDescriptorImpl]

'resolve' @ [39:29] ==> public abstract fun resolve(p0: (String..String?)): (Path..Path?) defined in java.nio.file.Path[JavaMethodDescriptor]

'compositeKeyFile' @ [39:37] ==> val compositeKeyFile: String defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk[LocalVariableDescriptor]

'notaryKey' @ [39:56] ==> val notaryKey: PublicKey defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk[LocalVariableDescriptor]

'encoded' @ [39:66] ==> public final val PublicKey.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'write' @ [40:19] ==> public open fun write(p0: (Path..Path?), p1: (ByteArray..ByteArray?), vararg p2: (OpenOption..OpenOption?)): (Path..Path?) defined in java.nio.file.Files[JavaMethodDescriptor]

'dir' @ [40:25] ==> value-parameter dir: Path defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk.<anonymous>[ValueParameterDescriptorImpl]

'resolve' @ [40:29] ==> public abstract fun resolve(p0: (String..String?)): (Path..Path?) defined in java.nio.file.Path[JavaMethodDescriptor]

'privateKeyFile' @ [40:37] ==> val privateKeyFile: String defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk[LocalVariableDescriptor]

'keyPair' @ [40:54] ==> value-parameter keyPair: KeyPair defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk.<anonymous>[ValueParameterDescriptorImpl]

'private' @ [40:62] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'encoded' @ [40:70] ==> public final val PrivateKey.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'write' @ [41:19] ==> public open fun write(p0: (Path..Path?), p1: (ByteArray..ByteArray?), vararg p2: (OpenOption..OpenOption?)): (Path..Path?) defined in java.nio.file.Files[JavaMethodDescriptor]

'dir' @ [41:25] ==> value-parameter dir: Path defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk.<anonymous>[ValueParameterDescriptorImpl]

'resolve' @ [41:29] ==> public abstract fun resolve(p0: (String..String?)): (Path..Path?) defined in java.nio.file.Path[JavaMethodDescriptor]

'publicKeyFile' @ [41:37] ==> val publicKeyFile: String defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk[LocalVariableDescriptor]

'keyPair' @ [41:53] ==> value-parameter keyPair: KeyPair defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk.<anonymous>[ValueParameterDescriptorImpl]

'public' @ [41:61] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'encoded' @ [41:68] ==> public final val PublicKey.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'Party' @ [43:16] ==> public constructor Party(name: X500Name, owningKey: PublicKey) defined in net.corda.core.identity.Party[DeserializedClassConstructorDescriptor]

'serviceName' @ [43:22] ==> value-parameter serviceName: X500Name defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk[ValueParameterDescriptorImpl]

'notaryKey' @ [43:35] ==> val notaryKey: PublicKey defined in net.corda.node.utilities.ServiceIdentityGenerator.generateToDisk[LocalVariableDescriptor]

