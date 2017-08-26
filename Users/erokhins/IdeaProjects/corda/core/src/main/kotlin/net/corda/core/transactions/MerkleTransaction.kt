'if (privacySalt != null)
        serializedHash(x, computeNonce(privacySalt, index))
    else
        serializedHash(x)' @ [17:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SecureHash, elseBranch: SecureHash): SecureHash[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SecureHash

'privacySalt' @ [17:16] ==> value-parameter privacySalt: PrivacySalt? defined in net.corda.core.transactions.serializedHash[ValueParameterDescriptorImpl]

'serializedHash' @ [18:9] ==> public fun <T : Any> serializedHash(x: T, nonce: SecureHash): SecureHash defined in net.corda.core.transactions[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'x' @ [18:24] ==> value-parameter x: T defined in net.corda.core.transactions.serializedHash[ValueParameterDescriptorImpl]

'computeNonce' @ [18:27] ==> public fun computeNonce(privacySalt: PrivacySalt, index: Int): SecureHash.SHA256 defined in net.corda.core.transactions in file MerkleTransaction.kt[SimpleFunctionDescriptorImpl]

'privacySalt' @ [18:40] ==> value-parameter privacySalt: PrivacySalt? defined in net.corda.core.transactions.serializedHash[ValueParameterDescriptorImpl]

'index' @ [18:53] ==> value-parameter index: Int defined in net.corda.core.transactions.serializedHash[ValueParameterDescriptorImpl]

'serializedHash' @ [20:9] ==> public fun <T : Any> serializedHash(x: T): SecureHash defined in net.corda.core.transactions[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'x' @ [20:24] ==> value-parameter x: T defined in net.corda.core.transactions.serializedHash[ValueParameterDescriptorImpl]

'if (x !is PrivacySalt) // PrivacySalt is not required to have an accompanied nonce.
        (x.serialize(context = P2P_CONTEXT.withoutReferences()).bytes + nonce.bytes).sha256()
    else
        serializedHash(x)' @ [24:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SecureHash, elseBranch: SecureHash): SecureHash[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SecureHash

'x' @ [24:16] ==> value-parameter x: T defined in net.corda.core.transactions.serializedHash[ValueParameterDescriptorImpl]

'x' @ [25:10] ==> value-parameter x: T defined in net.corda.core.transactions.serializedHash[ValueParameterDescriptorImpl]

'serialize' @ [25:12] ==> public fun <T : Any> T.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<T> defined in net.corda.core.serialization[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'P2P_CONTEXT' @ [25:32] ==> public final var P2P_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[PropertyImportedFromObject]

'withoutReferences' @ [25:44] ==> public abstract fun withoutReferences(): SerializationContext defined in net.corda.core.serialization.SerializationContext[SimpleFunctionDescriptorImpl]

'bytes' @ [25:65] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[PropertyDescriptorImpl]

'nonce' @ [25:73] ==> value-parameter nonce: SecureHash defined in net.corda.core.transactions.serializedHash[ValueParameterDescriptorImpl]

'bytes' @ [25:79] ==> public open val bytes: ByteArray defined in net.corda.core.crypto.SecureHash[PropertyDescriptorImpl]

'sha256' @ [25:86] ==> public fun ByteArray.sha256(): SecureHash.SHA256 defined in net.corda.core.crypto in file SecureHash.kt[SimpleFunctionDescriptorImpl]

'serializedHash' @ [27:9] ==> public fun <T : Any> serializedHash(x: Any): SecureHash defined in net.corda.core.transactions[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Any

'x' @ [27:24] ==> value-parameter x: T defined in net.corda.core.transactions.serializedHash[ValueParameterDescriptorImpl]

'x' @ [30:50] ==> value-parameter x: T defined in net.corda.core.transactions.serializedHash[ValueParameterDescriptorImpl]

'serialize' @ [30:52] ==> public fun <T : Any> T.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<T> defined in net.corda.core.serialization[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'P2P_CONTEXT' @ [30:72] ==> public final var P2P_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[PropertyImportedFromObject]

'withoutReferences' @ [30:84] ==> public abstract fun withoutReferences(): SerializationContext defined in net.corda.core.serialization.SerializationContext[SimpleFunctionDescriptorImpl]

'bytes' @ [30:105] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[PropertyDescriptorImpl]

'sha256' @ [30:111] ==> public fun ByteArray.sha256(): SecureHash.SHA256 defined in net.corda.core.crypto in file SecureHash.kt[SimpleFunctionDescriptorImpl]

'privacySalt' @ [33:59] ==> value-parameter privacySalt: PrivacySalt defined in net.corda.core.transactions.computeNonce[ValueParameterDescriptorImpl]

'bytes' @ [33:71] ==> public open val bytes: ByteArray defined in net.corda.core.contracts.PrivacySalt[PropertyDescriptorImpl]

'allocate' @ [33:90] ==> public open fun allocate(p0: Int): (ByteBuffer..ByteBuffer?) defined in java.nio.ByteBuffer[JavaMethodDescriptor]

'putInt' @ [33:102] ==> public abstract fun putInt(p0: Int): (ByteBuffer..ByteBuffer?) defined in java.nio.ByteBuffer[JavaMethodDescriptor]

'index' @ [33:109] ==> value-parameter index: Int defined in net.corda.core.transactions.computeNonce[ValueParameterDescriptorImpl]

'array' @ [33:116] ==> public final fun array(): (ByteArray..ByteArray?) defined in java.nio.ByteBuffer[JavaMethodDescriptor]

'sha256' @ [33:125] ==> public fun ByteArray.sha256(): SecureHash.SHA256 defined in net.corda.core.crypto in file SecureHash.kt[SimpleFunctionDescriptorImpl]

'mutableListOf' @ [81:26] ==> public fun <T> mutableListOf(vararg elements: List<Any>): MutableList<List<Any>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Any>

'inputs' @ [81:40] ==> public abstract val inputs: List<StateRef> defined in net.corda.core.transactions.TraversableTransaction[PropertyDescriptorImpl]

'attachments' @ [81:48] ==> public abstract val attachments: List<SecureHash> defined in net.corda.core.transactions.TraversableTransaction[PropertyDescriptorImpl]

'outputs' @ [81:61] ==> public abstract val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.TraversableTransaction[PropertyDescriptorImpl]

'commands' @ [81:70] ==> public abstract val commands: List<Command<*>> defined in net.corda.core.transactions.TraversableTransaction[PropertyDescriptorImpl]

'flatten' @ [81:80] ==> public fun <T> Iterable<Iterable<Any>>.flatten(): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'toMutableList' @ [81:90] ==> public fun <T> Collection<Any>.toMutableList(): MutableList<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'notary' @ [82:13] ==> public abstract val notary: Party? defined in net.corda.core.transactions.TraversableTransaction[PropertyDescriptorImpl]

'let' @ [82:21] ==> @InlineOnly public inline fun <T, R> Party.let(block: (Party) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party
    <R> -> Unit

'result' @ [82:27] ==> val result: MutableList<Any> defined in net.corda.core.transactions.TraversableTransaction.<get-availableComponents>[LocalVariableDescriptor]

'it' @ [82:37] ==> value-parameter it: Party defined in net.corda.core.transactions.TraversableTransaction.<get-availableComponents>.<anonymous>[ValueParameterDescriptorImpl]

'timeWindow' @ [83:13] ==> public abstract val timeWindow: TimeWindow? defined in net.corda.core.transactions.TraversableTransaction[PropertyDescriptorImpl]

'let' @ [83:25] ==> @InlineOnly public inline fun <T, R> TimeWindow.let(block: (TimeWindow) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TimeWindow
    <R> -> Unit

'result' @ [83:31] ==> val result: MutableList<Any> defined in net.corda.core.transactions.TraversableTransaction.<get-availableComponents>[LocalVariableDescriptor]

'it' @ [83:41] ==> value-parameter it: TimeWindow defined in net.corda.core.transactions.TraversableTransaction.<get-availableComponents>.<anonymous>[ValueParameterDescriptorImpl]

'privacySalt' @ [84:13] ==> public abstract val privacySalt: PrivacySalt? defined in net.corda.core.transactions.TraversableTransaction[PropertyDescriptorImpl]

'let' @ [84:26] ==> @InlineOnly public inline fun <T, R> PrivacySalt.let(block: (PrivacySalt) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PrivacySalt
    <R> -> Unit

'result' @ [84:32] ==> val result: MutableList<Any> defined in net.corda.core.transactions.TraversableTransaction.<get-availableComponents>[LocalVariableDescriptor]

'it' @ [84:42] ==> value-parameter it: PrivacySalt defined in net.corda.core.transactions.TraversableTransaction.<get-availableComponents>.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [85:20] ==> val result: MutableList<Any> defined in net.corda.core.transactions.TraversableTransaction.<get-availableComponents>[LocalVariableDescriptor]

'availableComponents' @ [93:60] ==> public open val availableComponents: List<Any> defined in net.corda.core.transactions.TraversableTransaction[PropertyDescriptorImpl]

'mapIndexed' @ [93:80] ==> public inline fun <T, R> Iterable<Any>.mapIndexed(transform: (index: Int, Any) -> SecureHash): List<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any
    <R> -> SecureHash

'serializedHash' @ [93:106] ==> public fun <T : Any> serializedHash(x: Any, privacySalt: PrivacySalt?, index: Int): SecureHash defined in net.corda.core.transactions[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Any

'it' @ [93:121] ==> value-parameter it: Any defined in net.corda.core.transactions.TraversableTransaction.<get-availableComponentHashes>.<anonymous>[ValueParameterDescriptorImpl]

'privacySalt' @ [93:125] ==> public abstract val privacySalt: PrivacySalt? defined in net.corda.core.transactions.TraversableTransaction[PropertyDescriptorImpl]

'index' @ [93:138] ==> value-parameter index: Int defined in net.corda.core.transactions.TraversableTransaction.<get-availableComponentHashes>.<anonymous>[ValueParameterDescriptorImpl]

'CordaSerializable' @ [101:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'require' @ [120:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'availableComponents' @ [120:17] ==> public open val availableComponents: List<Any> defined in net.corda.core.transactions.FilteredLeaves[PropertyDescriptorImpl]

'size' @ [120:37] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'nonces' @ [120:45] ==> public final val nonces: List<SecureHash> defined in net.corda.core.transactions.FilteredLeaves[PropertyDescriptorImpl]

'size' @ [120:52] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'availableComponents' @ [133:25] ==> public open val availableComponents: List<Any> defined in net.corda.core.transactions.FilteredLeaves[PropertyDescriptorImpl]

'map' @ [133:45] ==> public inline fun <T, R> Iterable<Any>.map(transform: (Any) -> Boolean): List<Boolean> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any
    <R> -> Boolean

'invoke' @ [133:51] ==> public abstract operator fun invoke(p1: Any): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [133:63] ==> value-parameter it: Any defined in net.corda.core.transactions.FilteredLeaves.checkWithFun.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [134:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkList' @ [134:18] ==> val checkList: List<Boolean> defined in net.corda.core.transactions.FilteredLeaves.checkWithFun[LocalVariableDescriptor]

'isEmpty' @ [134:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'checkList' @ [134:42] ==> val checkList: List<Boolean> defined in net.corda.core.transactions.FilteredLeaves.checkWithFun[LocalVariableDescriptor]

'all' @ [134:52] ==> public inline fun <T> Iterable<Boolean>.all(predicate: (Boolean) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'it' @ [134:58] ==> value-parameter it: Boolean defined in net.corda.core.transactions.FilteredLeaves.checkWithFun.<anonymous>[ValueParameterDescriptorImpl]

'availableComponents' @ [137:69] ==> public open val availableComponents: List<Any> defined in net.corda.core.transactions.FilteredLeaves[PropertyDescriptorImpl]

'mapIndexed' @ [137:89] ==> public inline fun <T, R> Iterable<Any>.mapIndexed(transform: (index: Int, Any) -> SecureHash): List<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any
    <R> -> SecureHash

'serializedHash' @ [137:115] ==> public fun <T : Any> serializedHash(x: Any, nonce: SecureHash): SecureHash defined in net.corda.core.transactions[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Any

'it' @ [137:130] ==> value-parameter it: Any defined in net.corda.core.transactions.FilteredLeaves.<get-availableComponentHashes>.<anonymous>[ValueParameterDescriptorImpl]

'nonces' @ [137:134] ==> public final val nonces: List<SecureHash> defined in net.corda.core.transactions.FilteredLeaves[PropertyDescriptorImpl]

'index' @ [137:141] ==> value-parameter index: Int defined in net.corda.core.transactions.FilteredLeaves.<get-availableComponentHashes>.<anonymous>[ValueParameterDescriptorImpl]

'CordaSerializable' @ [146:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'JvmStatic' @ [158:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'wtx' @ [162:34] ==> value-parameter wtx: WireTransaction defined in net.corda.core.transactions.FilteredTransaction.Companion.buildMerkleTransaction[ValueParameterDescriptorImpl]

'filterWithFun' @ [162:38] ==> public final fun filterWithFun(filtering: Predicate<Any>): FilteredLeaves defined in net.corda.core.transactions.WireTransaction[SimpleFunctionDescriptorImpl]

'filtering' @ [162:52] ==> value-parameter filtering: Predicate<Any> defined in net.corda.core.transactions.FilteredTransaction.Companion.buildMerkleTransaction[ValueParameterDescriptorImpl]

'wtx' @ [163:30] ==> value-parameter wtx: WireTransaction defined in net.corda.core.transactions.FilteredTransaction.Companion.buildMerkleTransaction[ValueParameterDescriptorImpl]

'merkleTree' @ [163:34] ==> public final val merkleTree: MerkleTree defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'PartialMerkleTree' @ [164:23] ==> public companion object defined in net.corda.core.crypto.PartialMerkleTree[FakeCallableDescriptorForObject]

'build' @ [164:41] ==> @Throws public final fun build(merkleRoot: MerkleTree, includeHashes: List<SecureHash>): PartialMerkleTree defined in net.corda.core.crypto.PartialMerkleTree.Companion[SimpleFunctionDescriptorImpl]

'merkleTree' @ [164:47] ==> val merkleTree: MerkleTree defined in net.corda.core.transactions.FilteredTransaction.Companion.buildMerkleTransaction[LocalVariableDescriptor]

'filteredLeaves' @ [164:59] ==> val filteredLeaves: FilteredLeaves defined in net.corda.core.transactions.FilteredTransaction.Companion.buildMerkleTransaction[LocalVariableDescriptor]

'availableComponentHashes' @ [164:74] ==> public open val availableComponentHashes: List<SecureHash> defined in net.corda.core.transactions.FilteredLeaves[PropertyDescriptorImpl]

'FilteredTransaction' @ [165:20] ==> private constructor FilteredTransaction(rootHash: SecureHash, filteredLeaves: FilteredLeaves, partialMerkleTree: PartialMerkleTree) defined in net.corda.core.transactions.FilteredTransaction[ClassConstructorDescriptorImpl]

'merkleTree' @ [165:40] ==> val merkleTree: MerkleTree defined in net.corda.core.transactions.FilteredTransaction.Companion.buildMerkleTransaction[LocalVariableDescriptor]

'hash' @ [165:51] ==> public abstract val hash: SecureHash defined in net.corda.core.crypto.MerkleTree[PropertyDescriptorImpl]

'filteredLeaves' @ [165:57] ==> val filteredLeaves: FilteredLeaves defined in net.corda.core.transactions.FilteredTransaction.Companion.buildMerkleTransaction[LocalVariableDescriptor]

'pmt' @ [165:73] ==> val pmt: PartialMerkleTree defined in net.corda.core.transactions.FilteredTransaction.Companion.buildMerkleTransaction[LocalVariableDescriptor]

'Throws' @ [172:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'MerkleTreeException' @ [172:13] ==> public constructor MerkleTreeException(reason: String) defined in net.corda.core.crypto.MerkleTreeException[ClassConstructorDescriptorImpl]

'filteredLeaves' @ [174:40] ==> public final val filteredLeaves: FilteredLeaves defined in net.corda.core.transactions.FilteredTransaction[PropertyDescriptorImpl]

'availableComponentHashes' @ [174:55] ==> public open val availableComponentHashes: List<SecureHash> defined in net.corda.core.transactions.FilteredLeaves[PropertyDescriptorImpl]

'hashes' @ [175:13] ==> val hashes: List<SecureHash> defined in net.corda.core.transactions.FilteredTransaction.verify[LocalVariableDescriptor]

'isEmpty' @ [175:20] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'MerkleTreeException' @ [176:19] ==> public constructor MerkleTreeException(reason: String) defined in net.corda.core.crypto.MerkleTreeException[ClassConstructorDescriptorImpl]

'partialMerkleTree' @ [177:16] ==> public final val partialMerkleTree: PartialMerkleTree defined in net.corda.core.transactions.FilteredTransaction[PropertyDescriptorImpl]

'verify' @ [177:34] ==> public final fun verify(merkleRootHash: SecureHash, hashesToCheck: List<SecureHash>): Boolean defined in net.corda.core.crypto.PartialMerkleTree[SimpleFunctionDescriptorImpl]

'rootHash' @ [177:41] ==> public final val rootHash: SecureHash defined in net.corda.core.transactions.FilteredTransaction[PropertyDescriptorImpl]

'hashes' @ [177:51] ==> val hashes: List<SecureHash> defined in net.corda.core.transactions.FilteredTransaction.verify[LocalVariableDescriptor]

