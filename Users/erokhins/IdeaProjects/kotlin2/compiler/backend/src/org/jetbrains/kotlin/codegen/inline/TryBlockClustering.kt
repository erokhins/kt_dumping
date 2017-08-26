'startLabel' @ [37:30] ==> public abstract val startLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.Interval[PropertyDescriptorImpl]

'endLabel' @ [37:44] ==> public abstract val endLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.Interval[PropertyDescriptorImpl]

'node' @ [54:17] ==> public final val node: TryCatchBlockNode defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[PropertyDescriptorImpl]

'start' @ [54:22] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'node' @ [56:17] ==> public final val node: TryCatchBlockNode defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[PropertyDescriptorImpl]

'end' @ [56:22] ==> public final var end: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'node' @ [58:17] ==> public final val node: TryCatchBlockNode defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[PropertyDescriptorImpl]

'handler' @ [58:22] ==> public final var handler: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'node' @ [60:17] ==> public final val node: TryCatchBlockNode defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[PropertyDescriptorImpl]

'type' @ [60:22] ==> public final var type: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'if (keepStart) {
            val oldEnd = endLabel
            node.end = splitBy.startLabel
            Pair(splitBy.endLabel, oldEnd)
        }
        else {
            val oldStart = startLabel
            node.start = splitBy.endLabel
            Pair(oldStart, splitBy.startLabel)
        }' @ [63:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<LabelNode, LabelNode>, elseBranch: Pair<LabelNode, LabelNode>): Pair<LabelNode, LabelNode>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<LabelNode, LabelNode>

'keepStart' @ [63:35] ==> value-parameter keepStart: Boolean defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo.split[ValueParameterDescriptorImpl]

'endLabel' @ [64:26] ==> public open val endLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[PropertyDescriptorImpl]

'node' @ [65:13] ==> public final val node: TryCatchBlockNode defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[PropertyDescriptorImpl]

'end' @ [65:18] ==> public final var end: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'splitBy' @ [65:24] ==> value-parameter splitBy: Interval defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo.split[ValueParameterDescriptorImpl]

'startLabel' @ [65:32] ==> public abstract val startLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.Interval[PropertyDescriptorImpl]

'Pair' @ [66:13] ==> public constructor Pair<out A, out B>(first: LabelNode, second: LabelNode) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> LabelNode
    <out B> -> LabelNode

'splitBy' @ [66:18] ==> value-parameter splitBy: Interval defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo.split[ValueParameterDescriptorImpl]

'endLabel' @ [66:26] ==> public abstract val endLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.Interval[PropertyDescriptorImpl]

'oldEnd' @ [66:36] ==> val oldEnd: LabelNode defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo.split[LocalVariableDescriptor]

'startLabel' @ [69:28] ==> public open val startLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[PropertyDescriptorImpl]

'node' @ [70:13] ==> public final val node: TryCatchBlockNode defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[PropertyDescriptorImpl]

'start' @ [70:18] ==> public final var start: (LabelNode..LabelNode?) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaPropertyDescriptor]

'splitBy' @ [70:26] ==> value-parameter splitBy: Interval defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo.split[ValueParameterDescriptorImpl]

'endLabel' @ [70:34] ==> public abstract val endLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.Interval[PropertyDescriptorImpl]

'Pair' @ [71:13] ==> public constructor Pair<out A, out B>(first: LabelNode, second: LabelNode) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> LabelNode
    <out B> -> LabelNode

'oldStart' @ [71:18] ==> val oldStart: LabelNode defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo.split[LocalVariableDescriptor]

'splitBy' @ [71:28] ==> value-parameter splitBy: Interval defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo.split[ValueParameterDescriptorImpl]

'startLabel' @ [71:36] ==> public abstract val startLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.Interval[PropertyDescriptorImpl]

'SplitPair' @ [73:16] ==> public constructor SplitPair<out T : Interval>(patchedPart: TryCatchBlockNodeInfo, newPart: TryCatchBlockNodeInfo) defined in org.jetbrains.kotlin.codegen.inline.SplitPair[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : Interval> -> TryCatchBlockNodeInfo

'this' @ [74:17] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[LazyClassReceiverParameterDescriptor]

'TryCatchBlockNodeInfo' @ [75:17] ==> public constructor TryCatchBlockNodeInfo(node: TryCatchBlockNode, onlyCopyNotProcess: Boolean) defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[ClassConstructorDescriptorImpl]

'TryCatchBlockNode' @ [75:39] ==> public constructor TryCatchBlockNode(p0: (LabelNode..LabelNode?), p1: (LabelNode..LabelNode?), p2: (LabelNode..LabelNode?), p3: (String..String?)) defined in org.jetbrains.org.objectweb.asm.tree.TryCatchBlockNode[JavaClassConstructorDescriptor]

'newPartInterval' @ [75:57] ==> val newPartInterval: Pair<LabelNode, LabelNode> defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo.split[LocalVariableDescriptor]

'first' @ [75:73] ==> public final val first: LabelNode defined in kotlin.Pair[DeserializedPropertyDescriptor]

'newPartInterval' @ [75:80] ==> val newPartInterval: Pair<LabelNode, LabelNode> defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo.split[LocalVariableDescriptor]

'second' @ [75:96] ==> public final val second: LabelNode defined in kotlin.Pair[DeserializedPropertyDescriptor]

'handler' @ [75:104] ==> public open val handler: LabelNode defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[PropertyDescriptorImpl]

'type' @ [75:113] ==> public open val type: String? defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[PropertyDescriptorImpl]

'onlyCopyNotProcess' @ [75:120] ==> public final val onlyCopyNotProcess: Boolean defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodeInfo[PropertyDescriptorImpl]

'nodeInfo' @ [83:28] ==> value-parameter nodeInfo: TryCatchBlockNodeInfo defined in org.jetbrains.kotlin.codegen.inline.TryCatchBlockNodePosition.<init>[ValueParameterDescriptorImpl]

'blocks' @ [87:17] ==> public final val blocks: MutableList<T> defined in org.jetbrains.kotlin.codegen.inline.TryBlockCluster[PropertyDescriptorImpl]

'firstOrNull' @ [87:24] ==> public inline fun <T> Iterable<T>.firstOrNull(predicate: (T) -> Boolean): T? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'it' @ [87:40] ==> value-parameter it: T defined in org.jetbrains.kotlin.codegen.inline.TryBlockCluster.<get-defaultHandler>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [87:43] ==> public abstract val type: String? defined in org.jetbrains.kotlin.codegen.inline.IntervalWithHandler[PropertyDescriptorImpl]

'linkedMapOf' @ [93:20] ==> @SinceKotlin @InlineOnly public inline fun <K, V> linkedMapOf(): LinkedHashMap<TryBlockInterval<T>, TryBlockCluster<T>> /* = LinkedHashMap<TryBlockInterval<T>, TryBlockCluster<T>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TryBlockInterval<T>
    <V> -> TryBlockCluster<T>

'blocks' @ [94:5] ==> value-parameter blocks: List<T> defined in org.jetbrains.kotlin.codegen.inline.doClustering[ValueParameterDescriptorImpl]

'forEach' @ [94:12] ==> @HidesMembers public inline fun <T> Iterable<T>.forEach(action: (T) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'TryBlockInterval' @ [95:24] ==> public constructor TryBlockInterval(startLabel: LabelNode, endLabel: LabelNode) defined in org.jetbrains.kotlin.codegen.inline.doClustering.TryBlockInterval[ClassConstructorDescriptorImpl]

'firstLabelInChain' @ [95:41] ==> internal fun firstLabelInChain(node: LabelNode): LabelNode defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'block' @ [95:59] ==> value-parameter block: T defined in org.jetbrains.kotlin.codegen.inline.doClustering.<anonymous>[ValueParameterDescriptorImpl]

'startLabel' @ [95:65] ==> public abstract val startLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.IntervalWithHandler[PropertyDescriptorImpl]

'firstLabelInChain' @ [95:78] ==> internal fun firstLabelInChain(node: LabelNode): LabelNode defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'block' @ [95:96] ==> value-parameter block: T defined in org.jetbrains.kotlin.codegen.inline.doClustering.<anonymous>[ValueParameterDescriptorImpl]

'endLabel' @ [95:102] ==> public abstract val endLabel: LabelNode defined in org.jetbrains.kotlin.codegen.inline.IntervalWithHandler[PropertyDescriptorImpl]

'clusters' @ [96:23] ==> val clusters: LinkedHashMap<TryBlockInterval<T>, TryBlockCluster<T>> /* = LinkedHashMap<TryBlockInterval<T>, TryBlockCluster<T>> */ defined in org.jetbrains.kotlin.codegen.inline.doClustering[LocalVariableDescriptor]

'getOrPut' @ [96:32] ==> public inline fun <K, V> MutableMap<TryBlockInterval<T>, TryBlockCluster<T>>.getOrPut(key: TryBlockInterval<T>, defaultValue: () -> TryBlockCluster<T>): TryBlockCluster<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TryBlockInterval<T>
    <V> -> TryBlockCluster<T>

'interval' @ [96:41] ==> val interval: TryBlockInterval<T> defined in org.jetbrains.kotlin.codegen.inline.doClustering.<anonymous>[LocalVariableDescriptor]

'TryBlockCluster' @ [96:53] ==> public constructor TryBlockCluster<T : IntervalWithHandler>(blocks: MutableList<T>) defined in org.jetbrains.kotlin.codegen.inline.TryBlockCluster[ClassConstructorDescriptorImpl]
Inferred types:
    <T : IntervalWithHandler> -> T

'arrayListOf' @ [96:69] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<T> /* = ArrayList<T> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'cluster' @ [97:9] ==> val cluster: TryBlockCluster<T> defined in org.jetbrains.kotlin.codegen.inline.doClustering.<anonymous>[LocalVariableDescriptor]

'blocks' @ [97:17] ==> public final val blocks: MutableList<T> defined in org.jetbrains.kotlin.codegen.inline.TryBlockCluster[PropertyDescriptorImpl]

'add' @ [97:24] ==> public abstract fun add(element: T): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'block' @ [97:28] ==> value-parameter block: T defined in org.jetbrains.kotlin.codegen.inline.doClustering.<anonymous>[ValueParameterDescriptorImpl]

'clusters' @ [100:12] ==> val clusters: LinkedHashMap<TryBlockInterval<T>, TryBlockCluster<T>> /* = LinkedHashMap<TryBlockInterval<T>, TryBlockCluster<T>> */ defined in org.jetbrains.kotlin.codegen.inline.doClustering[LocalVariableDescriptor]

'values' @ [100:21] ==> public open val values: MutableCollection<TryBlockCluster<T>> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'toList' @ [100:28] ==> public fun <T> Iterable<TryBlockCluster<T>>.toList(): List<TryBlockCluster<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TryBlockCluster<T>

