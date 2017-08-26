'MerkleTree' @ [17:54] ==> private constructor MerkleTree() defined in net.corda.core.crypto.MerkleTree[ClassConstructorDescriptorImpl]

'MerkleTree' @ [18:99] ==> private constructor MerkleTree() defined in net.corda.core.crypto.MerkleTree[ClassConstructorDescriptorImpl]

'num' @ [21:49] ==> value-parameter num: Int defined in net.corda.core.crypto.MerkleTree.Companion.isPow2[ValueParameterDescriptorImpl]

'num' @ [21:58] ==> value-parameter num: Int defined in net.corda.core.crypto.MerkleTree.Companion.isPow2[ValueParameterDescriptorImpl]

'Throws' @ [26:9] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'MerkleTreeException' @ [26:17] ==> public constructor MerkleTreeException(reason: String) defined in net.corda.core.crypto.MerkleTreeException[ClassConstructorDescriptorImpl]

'allLeavesHashes' @ [28:17] ==> value-parameter allLeavesHashes: List<SecureHash> defined in net.corda.core.crypto.MerkleTree.Companion.getMerkleTree[ValueParameterDescriptorImpl]

'isEmpty' @ [28:33] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'MerkleTreeException' @ [29:23] ==> public constructor MerkleTreeException(reason: String) defined in net.corda.core.crypto.MerkleTreeException[ClassConstructorDescriptorImpl]

'padWithZeros' @ [30:26] ==> private final fun padWithZeros(allLeavesHashes: List<SecureHash>): List<SecureHash> defined in net.corda.core.crypto.MerkleTree.Companion[SimpleFunctionDescriptorImpl]

'allLeavesHashes' @ [30:39] ==> value-parameter allLeavesHashes: List<SecureHash> defined in net.corda.core.crypto.MerkleTree.Companion.getMerkleTree[ValueParameterDescriptorImpl]

'map' @ [30:56] ==> public inline fun <T, R> Iterable<SecureHash>.map(transform: (SecureHash) -> MerkleTree.Leaf): List<MerkleTree.Leaf> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash
    <R> -> Leaf

'Leaf' @ [30:62] ==> public constructor Leaf(hash: SecureHash) defined in net.corda.core.crypto.MerkleTree.Leaf[ClassConstructorDescriptorImpl]

'it' @ [30:67] ==> value-parameter it: SecureHash defined in net.corda.core.crypto.MerkleTree.Companion.getMerkleTree.<anonymous>[ValueParameterDescriptorImpl]

'buildMerkleTree' @ [31:20] ==> private final tailrec fun buildMerkleTree(lastNodesList: List<MerkleTree>): MerkleTree defined in net.corda.core.crypto.MerkleTree.Companion[SimpleFunctionDescriptorImpl]

'leaves' @ [31:36] ==> val leaves: List<MerkleTree.Leaf> defined in net.corda.core.crypto.MerkleTree.Companion.getMerkleTree[LocalVariableDescriptor]

'allLeavesHashes' @ [36:21] ==> value-parameter allLeavesHashes: List<SecureHash> defined in net.corda.core.crypto.MerkleTree.Companion.padWithZeros[ValueParameterDescriptorImpl]

'size' @ [36:37] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'isPow2' @ [37:17] ==> private final fun isPow2(num: Int): Boolean defined in net.corda.core.crypto.MerkleTree.Companion[SimpleFunctionDescriptorImpl]

'n' @ [37:24] ==> var n: Int defined in net.corda.core.crypto.MerkleTree.Companion.padWithZeros[LocalVariableDescriptor]

'allLeavesHashes' @ [37:35] ==> value-parameter allLeavesHashes: List<SecureHash> defined in net.corda.core.crypto.MerkleTree.Companion.padWithZeros[ValueParameterDescriptorImpl]

'ArrayList' @ [38:32] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (SecureHash..SecureHash?)>..Collection<(SecureHash..SecureHash?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> SecureHash

'allLeavesHashes' @ [38:54] ==> value-parameter allLeavesHashes: List<SecureHash> defined in net.corda.core.crypto.MerkleTree.Companion.padWithZeros[ValueParameterDescriptorImpl]

'!' @ [39:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isPow2' @ [39:21] ==> private final fun isPow2(num: Int): Boolean defined in net.corda.core.crypto.MerkleTree.Companion[SimpleFunctionDescriptorImpl]

'n' @ [39:28] ==> var n: Int defined in net.corda.core.crypto.MerkleTree.Companion.padWithZeros[LocalVariableDescriptor]

'paddedHashes' @ [40:17] ==> val paddedHashes: ArrayList<SecureHash> defined in net.corda.core.crypto.MerkleTree.Companion.padWithZeros[LocalVariableDescriptor]

'add' @ [40:30] ==> public open fun add(element: SecureHash): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'SecureHash' @ [40:34] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'zeroHash' @ [40:45] ==> public final val zeroHash: SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[PropertyDescriptorImpl]

'paddedHashes' @ [42:20] ==> val paddedHashes: ArrayList<SecureHash> defined in net.corda.core.crypto.MerkleTree.Companion.padWithZeros[LocalVariableDescriptor]

'if (lastNodesList.size == 1) {
                return lastNodesList[0] //Root reached.
            } else {
                val newLevelHashes: MutableList<MerkleTree> = ArrayList()
                val n = lastNodesList.size
                require((n and 1) == 0) { "Sanity check: number of nodes should be even." }
                for (i in 0..n - 2 step 2) {
                    val left = lastNodesList[i]
                    val right = lastNodesList[i + 1]
                    val newHash = left.hash.hashConcat(right.hash)
                    val combined = Node(newHash, left, right)
                    newLevelHashes.add(combined)
                }
                return buildMerkleTree(newLevelHashes)
            }' @ [51:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'lastNodesList' @ [51:17] ==> value-parameter lastNodesList: List<MerkleTree> defined in net.corda.core.crypto.MerkleTree.Companion.buildMerkleTree[ValueParameterDescriptorImpl]

'size' @ [51:31] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'lastNodesList' @ [52:24] ==> value-parameter lastNodesList: List<MerkleTree> defined in net.corda.core.crypto.MerkleTree.Companion.buildMerkleTree[ValueParameterDescriptorImpl]

'ArrayList' @ [54:63] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> MerkleTree

'lastNodesList' @ [55:25] ==> value-parameter lastNodesList: List<MerkleTree> defined in net.corda.core.crypto.MerkleTree.Companion.buildMerkleTree[ValueParameterDescriptorImpl]

'size' @ [55:39] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'require' @ [56:17] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'==' @ [56:25] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'n' @ [56:26] ==> val n: Int defined in net.corda.core.crypto.MerkleTree.Companion.buildMerkleTree[LocalVariableDescriptor]

'..' @ [57:27] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'n' @ [57:30] ==> val n: Int defined in net.corda.core.crypto.MerkleTree.Companion.buildMerkleTree[LocalVariableDescriptor]

'lastNodesList' @ [58:32] ==> value-parameter lastNodesList: List<MerkleTree> defined in net.corda.core.crypto.MerkleTree.Companion.buildMerkleTree[ValueParameterDescriptorImpl]

'i' @ [58:46] ==> val i: Int defined in net.corda.core.crypto.MerkleTree.Companion.buildMerkleTree[LocalVariableDescriptor]

'lastNodesList' @ [59:33] ==> value-parameter lastNodesList: List<MerkleTree> defined in net.corda.core.crypto.MerkleTree.Companion.buildMerkleTree[ValueParameterDescriptorImpl]

'i' @ [59:47] ==> val i: Int defined in net.corda.core.crypto.MerkleTree.Companion.buildMerkleTree[LocalVariableDescriptor]

'left' @ [60:35] ==> val left: MerkleTree defined in net.corda.core.crypto.MerkleTree.Companion.buildMerkleTree[LocalVariableDescriptor]

'hash' @ [60:40] ==> public abstract val hash: SecureHash defined in net.corda.core.crypto.MerkleTree[PropertyDescriptorImpl]

'hashConcat' @ [60:45] ==> public final fun hashConcat(other: SecureHash): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash[SimpleFunctionDescriptorImpl]

'right' @ [60:56] ==> val right: MerkleTree defined in net.corda.core.crypto.MerkleTree.Companion.buildMerkleTree[LocalVariableDescriptor]

'hash' @ [60:62] ==> public abstract val hash: SecureHash defined in net.corda.core.crypto.MerkleTree[PropertyDescriptorImpl]

'Node' @ [61:36] ==> public constructor Node(hash: SecureHash, left: MerkleTree, right: MerkleTree) defined in net.corda.core.crypto.MerkleTree.Node[ClassConstructorDescriptorImpl]

'newHash' @ [61:41] ==> val newHash: SecureHash.SHA256 defined in net.corda.core.crypto.MerkleTree.Companion.buildMerkleTree[LocalVariableDescriptor]

'left' @ [61:50] ==> val left: MerkleTree defined in net.corda.core.crypto.MerkleTree.Companion.buildMerkleTree[LocalVariableDescriptor]

'right' @ [61:56] ==> val right: MerkleTree defined in net.corda.core.crypto.MerkleTree.Companion.buildMerkleTree[LocalVariableDescriptor]

'newLevelHashes' @ [62:21] ==> val newLevelHashes: MutableList<MerkleTree> defined in net.corda.core.crypto.MerkleTree.Companion.buildMerkleTree[LocalVariableDescriptor]

'add' @ [62:36] ==> public abstract fun add(element: MerkleTree): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'combined' @ [62:40] ==> val combined: MerkleTree.Node defined in net.corda.core.crypto.MerkleTree.Companion.buildMerkleTree[LocalVariableDescriptor]

'buildMerkleTree' @ [64:24] ==> private final tailrec fun buildMerkleTree(lastNodesList: List<MerkleTree>): MerkleTree defined in net.corda.core.crypto.MerkleTree.Companion[SimpleFunctionDescriptorImpl]

'newLevelHashes' @ [64:40] ==> val newLevelHashes: MutableList<MerkleTree> defined in net.corda.core.crypto.MerkleTree.Companion.buildMerkleTree[LocalVariableDescriptor]

