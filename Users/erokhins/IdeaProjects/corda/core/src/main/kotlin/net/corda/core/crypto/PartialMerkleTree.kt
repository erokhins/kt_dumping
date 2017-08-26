'CordaSerializable' @ [7:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'Exception' @ [8:49] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'reason' @ [8:100] ==> value-parameter reason: String defined in net.corda.core.crypto.MerkleTreeException.<init>[ValueParameterDescriptorImpl]

'CordaSerializable' @ [44:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'CordaSerializable' @ [53:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'PartialTree' @ [55:57] ==> private constructor PartialTree() defined in net.corda.core.crypto.PartialMerkleTree.PartialTree[ClassConstructorDescriptorImpl]

'PartialTree' @ [56:49] ==> private constructor PartialTree() defined in net.corda.core.crypto.PartialMerkleTree.PartialTree[ClassConstructorDescriptorImpl]

'PartialTree' @ [57:74] ==> private constructor PartialTree() defined in net.corda.core.crypto.PartialMerkleTree.PartialTree[ClassConstructorDescriptorImpl]

'Throws' @ [66:9] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IllegalArgumentException' @ [66:17] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'MerkleTreeException' @ [66:50] ==> public constructor MerkleTreeException(reason: String) defined in net.corda.core.crypto.MerkleTreeException[ClassConstructorDescriptorImpl]

'ArrayList' @ [68:30] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> SecureHash

'require' @ [69:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'zeroHash' @ [69:21] ==> public final val zeroHash: SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[PropertyImportedFromObject]

'includeHashes' @ [69:34] ==> value-parameter includeHashes: List<SecureHash> defined in net.corda.core.crypto.PartialMerkleTree.Companion.build[ValueParameterDescriptorImpl]

'checkFull' @ [70:13] ==> private final fun checkFull(tree: MerkleTree, level: Int = ...): Int defined in net.corda.core.crypto.PartialMerkleTree.Companion[SimpleFunctionDescriptorImpl]

'merkleRoot' @ [70:23] ==> value-parameter merkleRoot: MerkleTree defined in net.corda.core.crypto.PartialMerkleTree.Companion.build[ValueParameterDescriptorImpl]

'buildPartialTree' @ [71:24] ==> private final fun buildPartialTree(root: MerkleTree, includeHashes: List<SecureHash>, usedHashes: MutableList<SecureHash>): Pair<Boolean, PartialMerkleTree.PartialTree> defined in net.corda.core.crypto.PartialMerkleTree.Companion[SimpleFunctionDescriptorImpl]

'merkleRoot' @ [71:41] ==> value-parameter merkleRoot: MerkleTree defined in net.corda.core.crypto.PartialMerkleTree.Companion.build[ValueParameterDescriptorImpl]

'includeHashes' @ [71:53] ==> value-parameter includeHashes: List<SecureHash> defined in net.corda.core.crypto.PartialMerkleTree.Companion.build[ValueParameterDescriptorImpl]

'usedHashes' @ [71:68] ==> val usedHashes: ArrayList<SecureHash> defined in net.corda.core.crypto.PartialMerkleTree.Companion.build[LocalVariableDescriptor]

'includeHashes' @ [73:17] ==> value-parameter includeHashes: List<SecureHash> defined in net.corda.core.crypto.PartialMerkleTree.Companion.build[ValueParameterDescriptorImpl]

'size' @ [73:31] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'usedHashes' @ [73:39] ==> val usedHashes: ArrayList<SecureHash> defined in net.corda.core.crypto.PartialMerkleTree.Companion.build[LocalVariableDescriptor]

'size' @ [73:50] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'MerkleTreeException' @ [74:23] ==> public constructor MerkleTreeException(reason: String) defined in net.corda.core.crypto.MerkleTreeException[ClassConstructorDescriptorImpl]

'PartialMerkleTree' @ [75:20] ==> public constructor PartialMerkleTree(root: PartialMerkleTree.PartialTree) defined in net.corda.core.crypto.PartialMerkleTree[ClassConstructorDescriptorImpl]

'tree' @ [75:38] ==> val tree: Pair<Boolean, PartialMerkleTree.PartialTree> defined in net.corda.core.crypto.PartialMerkleTree.Companion.build[LocalVariableDescriptor]

'second' @ [75:43] ==> public final val second: PartialMerkleTree.PartialTree defined in kotlin.Pair[DeserializedPropertyDescriptor]

'when (tree) {
                is MerkleTree.Leaf -> level
                is MerkleTree.Node -> {
                    val l1 = checkFull(tree.left, level + 1)
                    val l2 = checkFull(tree.right, level + 1)
                    if (l1 != l2) throw MerkleTreeException("Got not full binary tree.")
                    l1
                }
            }' @ [80:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'tree' @ [80:26] ==> value-parameter tree: MerkleTree defined in net.corda.core.crypto.PartialMerkleTree.Companion.checkFull[ValueParameterDescriptorImpl]

'level' @ [81:39] ==> value-parameter level: Int = ... defined in net.corda.core.crypto.PartialMerkleTree.Companion.checkFull[ValueParameterDescriptorImpl]

'checkFull' @ [83:30] ==> private final fun checkFull(tree: MerkleTree, level: Int = ...): Int defined in net.corda.core.crypto.PartialMerkleTree.Companion[SimpleFunctionDescriptorImpl]

'tree' @ [83:40] ==> value-parameter tree: MerkleTree defined in net.corda.core.crypto.PartialMerkleTree.Companion.checkFull[ValueParameterDescriptorImpl]

'left' @ [83:45] ==> public final val left: MerkleTree defined in net.corda.core.crypto.MerkleTree.Node[PropertyDescriptorImpl]

'level' @ [83:51] ==> value-parameter level: Int = ... defined in net.corda.core.crypto.PartialMerkleTree.Companion.checkFull[ValueParameterDescriptorImpl]

'checkFull' @ [84:30] ==> private final fun checkFull(tree: MerkleTree, level: Int = ...): Int defined in net.corda.core.crypto.PartialMerkleTree.Companion[SimpleFunctionDescriptorImpl]

'tree' @ [84:40] ==> value-parameter tree: MerkleTree defined in net.corda.core.crypto.PartialMerkleTree.Companion.checkFull[ValueParameterDescriptorImpl]

'right' @ [84:45] ==> public final val right: MerkleTree defined in net.corda.core.crypto.MerkleTree.Node[PropertyDescriptorImpl]

'level' @ [84:52] ==> value-parameter level: Int = ... defined in net.corda.core.crypto.PartialMerkleTree.Companion.checkFull[ValueParameterDescriptorImpl]

'l1' @ [85:25] ==> val l1: Int defined in net.corda.core.crypto.PartialMerkleTree.Companion.checkFull[LocalVariableDescriptor]

'l2' @ [85:31] ==> val l2: Int defined in net.corda.core.crypto.PartialMerkleTree.Companion.checkFull[LocalVariableDescriptor]

'MerkleTreeException' @ [85:41] ==> public constructor MerkleTreeException(reason: String) defined in net.corda.core.crypto.MerkleTreeException[ClassConstructorDescriptorImpl]

'l1' @ [86:21] ==> val l1: Int defined in net.corda.core.crypto.PartialMerkleTree.Companion.checkFull[LocalVariableDescriptor]

'when (root) {
                is MerkleTree.Leaf ->
                    if (root.hash in includeHashes) {
                        usedHashes.add(root.hash)
                        Pair(true, PartialTree.IncludedLeaf(root.hash))
                    } else Pair(false, PartialTree.Leaf(root.hash))
                is MerkleTree.Node -> {
                    val leftNode = buildPartialTree(root.left, includeHashes, usedHashes)
                    val rightNode = buildPartialTree(root.right, includeHashes, usedHashes)
                    if (leftNode.first or rightNode.first) {
                        // This node is on a path to some included leaves. Don't store hash.
                        val newTree = PartialTree.Node(leftNode.second, rightNode.second)
                        Pair(true, newTree)
                    } else {
                        // This node has no included leaves below. Cut the tree here and store a hash as a Leaf.
                        val newTree = PartialTree.Leaf(root.hash)
                        Pair(false, newTree)
                    }
                }
            }' @ [103:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Pair<Boolean, PartialMerkleTree.PartialTree>, entry1: Pair<Boolean, PartialMerkleTree.PartialTree>): Pair<Boolean, PartialMerkleTree.PartialTree>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Pair<Boolean, PartialTree>

'root' @ [103:26] ==> value-parameter root: MerkleTree defined in net.corda.core.crypto.PartialMerkleTree.Companion.buildPartialTree[ValueParameterDescriptorImpl]

'if (root.hash in includeHashes) {
                        usedHashes.add(root.hash)
                        Pair(true, PartialTree.IncludedLeaf(root.hash))
                    } else Pair(false, PartialTree.Leaf(root.hash))' @ [105:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<Boolean, PartialMerkleTree.PartialTree>, elseBranch: Pair<Boolean, PartialMerkleTree.PartialTree>): Pair<Boolean, PartialMerkleTree.PartialTree>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<Boolean, PartialTree>

'root' @ [105:25] ==> value-parameter root: MerkleTree defined in net.corda.core.crypto.PartialMerkleTree.Companion.buildPartialTree[ValueParameterDescriptorImpl]

'hash' @ [105:30] ==> public abstract val hash: SecureHash defined in net.corda.core.crypto.MerkleTree[PropertyDescriptorImpl]

'includeHashes' @ [105:38] ==> value-parameter includeHashes: List<SecureHash> defined in net.corda.core.crypto.PartialMerkleTree.Companion.buildPartialTree[ValueParameterDescriptorImpl]

'usedHashes' @ [106:25] ==> value-parameter usedHashes: MutableList<SecureHash> defined in net.corda.core.crypto.PartialMerkleTree.Companion.buildPartialTree[ValueParameterDescriptorImpl]

'add' @ [106:36] ==> public abstract fun add(element: SecureHash): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'root' @ [106:40] ==> value-parameter root: MerkleTree defined in net.corda.core.crypto.PartialMerkleTree.Companion.buildPartialTree[ValueParameterDescriptorImpl]

'hash' @ [106:45] ==> public abstract val hash: SecureHash defined in net.corda.core.crypto.MerkleTree[PropertyDescriptorImpl]

'Pair' @ [107:25] ==> public constructor Pair<out A, out B>(first: Boolean, second: PartialMerkleTree.PartialTree.IncludedLeaf) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Boolean
    <out B> -> IncludedLeaf

'IncludedLeaf' @ [107:48] ==> public constructor IncludedLeaf(hash: SecureHash) defined in net.corda.core.crypto.PartialMerkleTree.PartialTree.IncludedLeaf[ClassConstructorDescriptorImpl]

'root' @ [107:61] ==> value-parameter root: MerkleTree defined in net.corda.core.crypto.PartialMerkleTree.Companion.buildPartialTree[ValueParameterDescriptorImpl]

'hash' @ [107:66] ==> public abstract val hash: SecureHash defined in net.corda.core.crypto.MerkleTree[PropertyDescriptorImpl]

'Pair' @ [108:28] ==> public constructor Pair<out A, out B>(first: Boolean, second: PartialMerkleTree.PartialTree.Leaf) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Boolean
    <out B> -> Leaf

'Leaf' @ [108:52] ==> public constructor Leaf(hash: SecureHash) defined in net.corda.core.crypto.PartialMerkleTree.PartialTree.Leaf[ClassConstructorDescriptorImpl]

'root' @ [108:57] ==> value-parameter root: MerkleTree defined in net.corda.core.crypto.PartialMerkleTree.Companion.buildPartialTree[ValueParameterDescriptorImpl]

'hash' @ [108:62] ==> public abstract val hash: SecureHash defined in net.corda.core.crypto.MerkleTree[PropertyDescriptorImpl]

'buildPartialTree' @ [110:36] ==> private final fun buildPartialTree(root: MerkleTree, includeHashes: List<SecureHash>, usedHashes: MutableList<SecureHash>): Pair<Boolean, PartialMerkleTree.PartialTree> defined in net.corda.core.crypto.PartialMerkleTree.Companion[SimpleFunctionDescriptorImpl]

'root' @ [110:53] ==> value-parameter root: MerkleTree defined in net.corda.core.crypto.PartialMerkleTree.Companion.buildPartialTree[ValueParameterDescriptorImpl]

'left' @ [110:58] ==> public final val left: MerkleTree defined in net.corda.core.crypto.MerkleTree.Node[PropertyDescriptorImpl]

'includeHashes' @ [110:64] ==> value-parameter includeHashes: List<SecureHash> defined in net.corda.core.crypto.PartialMerkleTree.Companion.buildPartialTree[ValueParameterDescriptorImpl]

'usedHashes' @ [110:79] ==> value-parameter usedHashes: MutableList<SecureHash> defined in net.corda.core.crypto.PartialMerkleTree.Companion.buildPartialTree[ValueParameterDescriptorImpl]

'buildPartialTree' @ [111:37] ==> private final fun buildPartialTree(root: MerkleTree, includeHashes: List<SecureHash>, usedHashes: MutableList<SecureHash>): Pair<Boolean, PartialMerkleTree.PartialTree> defined in net.corda.core.crypto.PartialMerkleTree.Companion[SimpleFunctionDescriptorImpl]

'root' @ [111:54] ==> value-parameter root: MerkleTree defined in net.corda.core.crypto.PartialMerkleTree.Companion.buildPartialTree[ValueParameterDescriptorImpl]

'right' @ [111:59] ==> public final val right: MerkleTree defined in net.corda.core.crypto.MerkleTree.Node[PropertyDescriptorImpl]

'includeHashes' @ [111:66] ==> value-parameter includeHashes: List<SecureHash> defined in net.corda.core.crypto.PartialMerkleTree.Companion.buildPartialTree[ValueParameterDescriptorImpl]

'usedHashes' @ [111:81] ==> value-parameter usedHashes: MutableList<SecureHash> defined in net.corda.core.crypto.PartialMerkleTree.Companion.buildPartialTree[ValueParameterDescriptorImpl]

'if (leftNode.first or rightNode.first) {
                        // This node is on a path to some included leaves. Don't store hash.
                        val newTree = PartialTree.Node(leftNode.second, rightNode.second)
                        Pair(true, newTree)
                    } else {
                        // This node has no included leaves below. Cut the tree here and store a hash as a Leaf.
                        val newTree = PartialTree.Leaf(root.hash)
                        Pair(false, newTree)
                    }' @ [112:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<Boolean, PartialMerkleTree.PartialTree>, elseBranch: Pair<Boolean, PartialMerkleTree.PartialTree>): Pair<Boolean, PartialMerkleTree.PartialTree>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<Boolean, PartialTree>

'leftNode' @ [112:25] ==> val leftNode: Pair<Boolean, PartialMerkleTree.PartialTree> defined in net.corda.core.crypto.PartialMerkleTree.Companion.buildPartialTree[LocalVariableDescriptor]

'first' @ [112:34] ==> public final val first: Boolean defined in kotlin.Pair[DeserializedPropertyDescriptor]

'rightNode' @ [112:43] ==> val rightNode: Pair<Boolean, PartialMerkleTree.PartialTree> defined in net.corda.core.crypto.PartialMerkleTree.Companion.buildPartialTree[LocalVariableDescriptor]

'first' @ [112:53] ==> public final val first: Boolean defined in kotlin.Pair[DeserializedPropertyDescriptor]

'Node' @ [114:51] ==> public constructor Node(left: PartialMerkleTree.PartialTree, right: PartialMerkleTree.PartialTree) defined in net.corda.core.crypto.PartialMerkleTree.PartialTree.Node[ClassConstructorDescriptorImpl]

'leftNode' @ [114:56] ==> val leftNode: Pair<Boolean, PartialMerkleTree.PartialTree> defined in net.corda.core.crypto.PartialMerkleTree.Companion.buildPartialTree[LocalVariableDescriptor]

'second' @ [114:65] ==> public final val second: PartialMerkleTree.PartialTree defined in kotlin.Pair[DeserializedPropertyDescriptor]

'rightNode' @ [114:73] ==> val rightNode: Pair<Boolean, PartialMerkleTree.PartialTree> defined in net.corda.core.crypto.PartialMerkleTree.Companion.buildPartialTree[LocalVariableDescriptor]

'second' @ [114:83] ==> public final val second: PartialMerkleTree.PartialTree defined in kotlin.Pair[DeserializedPropertyDescriptor]

'Pair' @ [115:25] ==> public constructor Pair<out A, out B>(first: Boolean, second: PartialMerkleTree.PartialTree.Node) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Boolean
    <out B> -> Node

'newTree' @ [115:36] ==> val newTree: PartialMerkleTree.PartialTree.Node defined in net.corda.core.crypto.PartialMerkleTree.Companion.buildPartialTree[LocalVariableDescriptor]

'Leaf' @ [118:51] ==> public constructor Leaf(hash: SecureHash) defined in net.corda.core.crypto.PartialMerkleTree.PartialTree.Leaf[ClassConstructorDescriptorImpl]

'root' @ [118:56] ==> value-parameter root: MerkleTree defined in net.corda.core.crypto.PartialMerkleTree.Companion.buildPartialTree[ValueParameterDescriptorImpl]

'hash' @ [118:61] ==> public abstract val hash: SecureHash defined in net.corda.core.crypto.MerkleTree[PropertyDescriptorImpl]

'Pair' @ [119:25] ==> public constructor Pair<out A, out B>(first: Boolean, second: PartialMerkleTree.PartialTree.Leaf) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Boolean
    <out B> -> Leaf

'newTree' @ [119:37] ==> val newTree: PartialMerkleTree.PartialTree.Leaf defined in net.corda.core.crypto.PartialMerkleTree.Companion.buildPartialTree[LocalVariableDescriptor]

'ArrayList' @ [131:26] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> SecureHash

'verify' @ [132:26] ==> private final fun verify(node: PartialMerkleTree.PartialTree, usedHashes: MutableList<SecureHash>): SecureHash defined in net.corda.core.crypto.PartialMerkleTree[SimpleFunctionDescriptorImpl]

'root' @ [132:33] ==> public final val root: PartialMerkleTree.PartialTree defined in net.corda.core.crypto.PartialMerkleTree[PropertyDescriptorImpl]

'usedHashes' @ [132:39] ==> val usedHashes: ArrayList<SecureHash> defined in net.corda.core.crypto.PartialMerkleTree.verify[LocalVariableDescriptor]

'hashesToCheck' @ [134:13] ==> value-parameter hashesToCheck: List<SecureHash> defined in net.corda.core.crypto.PartialMerkleTree.verify[ValueParameterDescriptorImpl]

'groupBy' @ [134:27] ==> public inline fun <T, K> Iterable<SecureHash>.groupBy(keySelector: (SecureHash) -> SecureHash): Map<SecureHash, List<SecureHash>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash
    <K> -> SecureHash

'it' @ [134:37] ==> value-parameter it: SecureHash defined in net.corda.core.crypto.PartialMerkleTree.verify.<anonymous>[ValueParameterDescriptorImpl]

'usedHashes' @ [134:45] ==> val usedHashes: ArrayList<SecureHash> defined in net.corda.core.crypto.PartialMerkleTree.verify[LocalVariableDescriptor]

'groupBy' @ [134:56] ==> public inline fun <T, K> Iterable<SecureHash>.groupBy(keySelector: (SecureHash) -> SecureHash): Map<SecureHash, List<SecureHash>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash
    <K> -> SecureHash

'it' @ [134:66] ==> value-parameter it: SecureHash defined in net.corda.core.crypto.PartialMerkleTree.verify.<anonymous>[ValueParameterDescriptorImpl]

'verifyRoot' @ [136:17] ==> val verifyRoot: SecureHash defined in net.corda.core.crypto.PartialMerkleTree.verify[LocalVariableDescriptor]

'merkleRootHash' @ [136:31] ==> value-parameter merkleRootHash: SecureHash defined in net.corda.core.crypto.PartialMerkleTree.verify[ValueParameterDescriptorImpl]

'when (node) {
            is PartialTree.IncludedLeaf -> {
                usedHashes.add(node.hash)
                node.hash
            }
            is PartialTree.Leaf -> node.hash
            is PartialTree.Node -> {
                val leftHash = verify(node.left, usedHashes)
                val rightHash = verify(node.right, usedHashes)
                return leftHash.hashConcat(rightHash)
            }
        }' @ [144:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SecureHash, entry1: SecureHash, entry2: SecureHash): SecureHash[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SecureHash

'node' @ [144:22] ==> value-parameter node: PartialMerkleTree.PartialTree defined in net.corda.core.crypto.PartialMerkleTree.verify[ValueParameterDescriptorImpl]

'usedHashes' @ [146:17] ==> value-parameter usedHashes: MutableList<SecureHash> defined in net.corda.core.crypto.PartialMerkleTree.verify[ValueParameterDescriptorImpl]

'add' @ [146:28] ==> public abstract fun add(element: SecureHash): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'node' @ [146:32] ==> value-parameter node: PartialMerkleTree.PartialTree defined in net.corda.core.crypto.PartialMerkleTree.verify[ValueParameterDescriptorImpl]

'hash' @ [146:37] ==> public final val hash: SecureHash defined in net.corda.core.crypto.PartialMerkleTree.PartialTree.IncludedLeaf[PropertyDescriptorImpl]

'node' @ [147:17] ==> value-parameter node: PartialMerkleTree.PartialTree defined in net.corda.core.crypto.PartialMerkleTree.verify[ValueParameterDescriptorImpl]

'hash' @ [147:22] ==> public final val hash: SecureHash defined in net.corda.core.crypto.PartialMerkleTree.PartialTree.IncludedLeaf[PropertyDescriptorImpl]

'node' @ [149:36] ==> value-parameter node: PartialMerkleTree.PartialTree defined in net.corda.core.crypto.PartialMerkleTree.verify[ValueParameterDescriptorImpl]

'hash' @ [149:41] ==> public final val hash: SecureHash defined in net.corda.core.crypto.PartialMerkleTree.PartialTree.Leaf[PropertyDescriptorImpl]

'verify' @ [151:32] ==> private final fun verify(node: PartialMerkleTree.PartialTree, usedHashes: MutableList<SecureHash>): SecureHash defined in net.corda.core.crypto.PartialMerkleTree[SimpleFunctionDescriptorImpl]

'node' @ [151:39] ==> value-parameter node: PartialMerkleTree.PartialTree defined in net.corda.core.crypto.PartialMerkleTree.verify[ValueParameterDescriptorImpl]

'left' @ [151:44] ==> public final val left: PartialMerkleTree.PartialTree defined in net.corda.core.crypto.PartialMerkleTree.PartialTree.Node[PropertyDescriptorImpl]

'usedHashes' @ [151:50] ==> value-parameter usedHashes: MutableList<SecureHash> defined in net.corda.core.crypto.PartialMerkleTree.verify[ValueParameterDescriptorImpl]

'verify' @ [152:33] ==> private final fun verify(node: PartialMerkleTree.PartialTree, usedHashes: MutableList<SecureHash>): SecureHash defined in net.corda.core.crypto.PartialMerkleTree[SimpleFunctionDescriptorImpl]

'node' @ [152:40] ==> value-parameter node: PartialMerkleTree.PartialTree defined in net.corda.core.crypto.PartialMerkleTree.verify[ValueParameterDescriptorImpl]

'right' @ [152:45] ==> public final val right: PartialMerkleTree.PartialTree defined in net.corda.core.crypto.PartialMerkleTree.PartialTree.Node[PropertyDescriptorImpl]

'usedHashes' @ [152:52] ==> value-parameter usedHashes: MutableList<SecureHash> defined in net.corda.core.crypto.PartialMerkleTree.verify[ValueParameterDescriptorImpl]

'leftHash' @ [153:24] ==> val leftHash: SecureHash defined in net.corda.core.crypto.PartialMerkleTree.verify[LocalVariableDescriptor]

'hashConcat' @ [153:33] ==> public final fun hashConcat(other: SecureHash): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash[SimpleFunctionDescriptorImpl]

'rightHash' @ [153:44] ==> val rightHash: SecureHash defined in net.corda.core.crypto.PartialMerkleTree.verify[LocalVariableDescriptor]

